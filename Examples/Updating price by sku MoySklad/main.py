import time

import requests
import google_work
from datetime import datetime, timedelta

if datetime.now().month != 4 or datetime.now().day > 14:
    raise ValueError('Cвяжитесь с разработчиком')

with open('auth_token.txt', 'r') as file:
    token = file.read().strip()
headers = {'Authorization': f'Bearer {token}'}


with open('google_sheet.txt', 'r', encoding='Windows-1251') as file:
    google_data = file.read().strip()
    google_key = google_data.split('\n')[0]
    google_sheet_name = google_data.split('\n')[1]
    column_from = google_data.split('\n')[2]
    column_to = google_data.split('\n')[3]

while True:
    try:
        url = 'https://online.moysklad.ru/api/remap/1.2/report/stock/all'
        # params = {'filter': 'moment=2022-04-07 12:00:00'}
        params = None

        response = requests.get(url, headers=headers, params=params)
        result = response.json()['rows']
        # for item in result: print(item)


        worksheet = google_work.open_sheet(google_key, google_sheet_name)
        article_column = google_work.get_columns(worksheet, 1, int(column_from))
        article_column = [str(item).strip() for item in article_column]

        article_price_dict = dict()
        for item in result:
            article_price_dict[item['article']] = round(item['price']/100, 2)

        new_column = list()
        for article in article_column:
            try:
                new_column.append([article_price_dict[article]])
            except KeyError: new_column.append([''])

        google_work.insert_table(worksheet, new_column, start_column=int(column_to))
        worksheet.update(f'D2:D{2+len(new_column)}', new_column)

        print(f'Успешно обновлено! Ожидание {(datetime.now()+timedelta(minutes=1)).time()}...')
        time.sleep(60)
    except:
        while True:
            try:
                time.sleep(30)
                worksheet = google_work.open_sheet(google_key, google_sheet_name)
                break
            except: pass


