FROM python:3.9
WORKDIR /code 
COPY ./requirements.txt /code/requirements.txt
COPY ./app /code/app
RUN pip install --no-cache-dir --upgrade -r /code/requirements.txt && \
	apt-get update && \
    apt-get install -yq tzdata && \
    ln -fs /usr/share/zoneinfo/America/New_York /etc/localtime && \
    dpkg-reconfigure -f noninteractive tzdata

ENV TZ="Europe/Moscow"

CMD ["python", "app/main.py"]