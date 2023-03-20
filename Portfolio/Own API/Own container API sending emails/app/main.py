from fastapi import FastAPI
import uvicorn

from json import load as json_load

import smtplib
from email.message import Message

from app.models import Mail

app = FastAPI()


def smtp_server(email) -> smtplib.SMTP:
    host = email.split('@')[1]
    with open("app/smtp.json", "r") as json_file:
        try:
            smtp = json_load(json_file)
            smtp_host = smtp[host]['host']
            if smtp[host]['ssl']: server = smtplib.SMTP_SSL(smtp_host)
            else:
                server = smtplib.SMTP(smtp_host)
                server.starttls()
            return server
        except KeyError: raise ValueError("Unknown SMTP server.")


def send(mail: Mail):
    server = smtp_server(mail.auth.email)
    server.login(mail.auth.email, mail.auth.password)

    message = Message()
    message['From'] = mail.message.user
    message['To'] = mail.message.to
    message['Subject'] = mail.message.subject
    message.set_payload(mail.message.text)

    response = server.sendmail(message['From'], message['To'], message.as_string())
    if len(response) == 0:
        result = {'success': True, 'error': 0}
    else:
        result = dict()
        to, error = result.popitem()
        result['success'] = False
        result['error'] = error[0]
        result['code'] = error[1]
    return result


@app.post("/send_message")
def send_message(mail: Mail):
    return send(mail)

# google test
# email: roman.for.python.test@google.com
# password: romanforpythontest

# yandex test
# email: roman.for.python.test@yandex.ru
# password: romanforpythontest

# mail test
# email: roman.for.python.test@mail.ru
# password: Vq1HPf6nEsUznMETLvgW


if __name__ == '__main__':
    uvicorn.run('app.main:app', host='0.0.0.0', port=80)
