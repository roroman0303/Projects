import requests
from datetime import datetime
print(datetime(2021, 4, 20, 0, 0, 0).timestamp())
print(datetime.now().timestamp())
print(datetime.fromtimestamp(1637730000))
parameters = {'pair': "XRPUSD", "interval": 60, "since": 1637730000}
resp = requests.get('https://api.kraken.com/0/public/OHLC', params=parameters)

print(resp.json())
for item in resp.json()['result']['XXRPZEUR']:
    print(datetime.fromtimestamp(item[0]))