import requests
import google_work
from datetime import datetime

if datetime.now().month != 4 or datetime.now().day > 12: raise ValueError

url = 'https://online.moysklad.ru/api/remap/1.2/report/stock/all'
headers = {'Authorization': 'Bearer 6b8fd8875cb8e47ab3517b7ccaa2ec072d47bb5a'}
# params = {'filter': 'moment=2022-04-07 12:00:00'}
params=None
response = requests.get(url, headers=headers, params=params)
result = response.json()['rows']
# for item in result: print(item)

worksheet = google_work.open_sheet('1BPruTzpbxj9JMq28genwgiJSiQPIepuSQp7sDTBQGL8', 'Лист1')
article_column = google_work.get_columns(worksheet, 1, 3)
article_column = [str(item).strip() for item in article_column]

article_price_dict = dict()
for item in result:
    article_price_dict[item['article']] = round(item['price']/100, 2)

new_column = list()
for article in article_column:
    try:
        new_column.append([article_price_dict[article]])
    except KeyError: new_column.append([''])

worksheet.update(f'D2:D{2+len(new_column)}', new_column)


