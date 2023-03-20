import gspread.exceptions
import requests
import files
import websocket_messaging
import json
import google_work
from datetime import datetime, timedelta

conf_path = 'app/conf.json'
urls_path = 'app/urls.json'
google_work.credentials_path = 'app/credentials.json'

values = list()
base_value = ''
base_value_count = 0
commission = 0
max_chain_length = 0
interval = 0


def config_init():
    global values, base_value, base_value_count, commission, max_chain_length, interval
    config = files.open_json(conf_path)
    values = config['values']
    commission = config['commission']
    base_value = config['base_value']
    base_value_count = config['base_value_count']
    max_chain_length = config['max_chain_length']
    interval = config['interval']


tickers_url = ''
websocket_tickers_url = ''
google_sheets_url = ''
google_sheet_name = 'Chains'


def urls_init():
    global tickers_url, websocket_tickers_url, google_sheets_url
    urls = files.open_json(urls_path)
    tickers_url = urls['binance']['tickers']
    websocket_tickers_url = urls['binance']['websocket_tickers']
    google_sheets_url = urls['google_sheets']['chains']


all_symbols = list()
symbols_dict = dict()


def values_init():
    global symbols_dict, all_symbols
    all_symbols = set([item['symbol'] for item in requests.get(url=tickers_url).json()])
    for first_value in values:
        for second_value in values:
            temp_symbol = first_value + second_value
            if temp_symbol in all_symbols:
                symbols_dict[(first_value, second_value)] = temp_symbol
                symbols_dict[(second_value, first_value)] = temp_symbol


def get_price_dict(message):
    all_tickers = json.loads(message)

    ticker_price_dict = dict()
    for ticker in all_tickers:
        if ticker['s'] in all_symbols:
            ticker_price_dict[ticker['s']] = float(ticker['c'])

    price_dict = dict()
    for values_pair, symbol in symbols_dict.items():
        try:
            if symbol.startswith(values_pair[0]): price_dict[values_pair] = ticker_price_dict[symbol]
            else: price_dict[values_pair] = 1/ticker_price_dict[symbol]
        except KeyError: pass
    return price_dict


def add_values_to_chains(price_dict, chain_dict, values_to_add):
    new_chain_dict = dict()
    for chain, result in chain_dict.items():
        first_value = chain[-1]
        for second_value in values_to_add:
            if first_value == second_value: pass
            else:
                try:
                    new_chain = tuple(list(chain) + [second_value])
                    new_count = result['count'] * price_dict[(first_value, second_value)] / (1 + commission/100)
                    new_rates = result['rates'] + [str(price_dict[(first_value, second_value)])]
                    new_chain_dict[new_chain] = {'count': new_count, 'rates': new_rates}
                except KeyError: pass
    return new_chain_dict


def create_chains(price_dict, chain_length):
    chain_dict = {(base_value, ): {'count': base_value_count, 'rates': list()}}
    for _ in range(chain_length):
        chain_dict = add_values_to_chains(price_dict, chain_dict, values)
    final_chain_dict = add_values_to_chains(price_dict, chain_dict, values_to_add=[base_value])
    return final_chain_dict


def create_top_chains_table(chain_dict):
    table = [[str(datetime.now().strftime("%H:%M:%S")),
              ' -> '.join(chain),
              ' -> '.join(result['rates']),
              (result['count']/base_value_count)-1]
             for chain, result in chain_dict.items()]
    table.sort(key=lambda item: item[3], reverse=True)
    header = ['Время', 'Стратегия', 'Курсы конвертации', 'Маржинальность']
    table.insert(0, header)
    return table


chain_collector_counter = 0
chain_dict = dict()
def marginality(message):
    global chain_collector_counter, chain_dict
    price_dict = get_price_dict(message)
    # print(f"{len(price_dict)}\t{price_dict}")
    for chain_length in range(2, max_chain_length + 1):
        chain_dict.update(create_chains(price_dict, chain_length))
    chain_collector_counter += 1
    # print(f"{len(chain_dict)}\t{chain_dict}")
    if chain_collector_counter == interval:
        chain_table = create_top_chains_table(chain_dict)
        # print(f"{round(chain_table[1][3] * 100, 2)} {chain_table[1]}")
        try:
            worksheet = google_work.open_sheet(google_sheets_url, google_sheet_name)
            google_work.insert_table(worksheet, chain_table)
        except gspread.exceptions.APIError: pass
        chain_collector_counter = 0


def start_messaging():
    websocket_messaging.start_consumption(url=websocket_tickers_url, handler_function=marginality,
                                          multithreading=True, log=False)


if __name__ == '__main__':
    config_init()
    urls_init()
    values_init()
    start_messaging()
