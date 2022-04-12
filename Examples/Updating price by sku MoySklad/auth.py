import json
from http.client import HTTPSConnection
from base64 import b64encode

with open('login.txt') as file:
    login_text = file.read().strip()
    login = login_text.split('\n')[0]
    password = login_text.split('\n')[1]
print(f'Пользователь {login} {password}')

basic = bytes(f"{login}:{password}", 'utf-8')
#This sets up the https connection
c = HTTPSConnection("online.moysklad.ru")
#we need to base 64 encode it
#and then decode it to acsii as python 3 stores it as a byte string
userAndPass = b64encode(basic).decode("ascii")
headers = { 'Authorization' : 'Basic %s' %  userAndPass }
#then connect
c.request('POST', '/api/remap/1.2/security/token', headers=headers)
#get the response back
res = c.getresponse()
# at this point you could check the status etc
# this gets the page text
data = res.read()
result = json.loads(data)['access_token']
print(result)
with open('auth_token.txt', 'w') as file:
    file.write(result)

print('Новый токен сгенерирован!')
print('Можете закрыть это окно и выполнить программу main.exe', end='')
input()