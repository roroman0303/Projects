from flask import Flask, request
from flask_restplus import Api, Resource, fields
from flask_sqlalchemy import SQLAlchemy
import sqlite3
import sqlalchemy
from datetime import datetime
import requests

# =======================================
flask_app = Flask(__name__)  # определяем, что будет использоваться фреймворк Flask
app = Api(app=flask_app)  # определяем, что нужно будет запускать проект в API из flask_restplus (т.е. как Swagger UI)
name_space = app.namespace('rates',  # пространство имён main с описанием
                           version="0.1",
                           title="Kraken Rates",
                           description="Use GET request to get exchange rates")

# =======================================
flask_app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///eco.kraken.rates'  # настройка API и создание адреса
db = SQLAlchemy(flask_app)  # подключение к БД


# =======================================
class BTC_USD(db.Model):
    date = db.Column(db.Integer, primary_key=True)
    open = db.Column(db.Float(precision=2))
    close = db.Column(db.Float(precision=2))
    high = db.Column(db.Float(precision=2))
    low = db.Column(db.Float(precision=2))
    volume = db.Column(db.Float(precision=2))

    def __repr__(self):
        return '<Rates for {}>'.format(datetime.fromtimestamp(self.date).strftime('%d.%m.%Y %H:%M'))

# =======================================
class ETH_USD(db.Model):
    date = db.Column(db.Integer, primary_key=True)
    open = db.Column(db.Float(precision=2))
    close = db.Column(db.Float(precision=2))
    high = db.Column(db.Float(precision=2))
    low = db.Column(db.Float(precision=2))
    volume = db.Column(db.Float(precision=2))

    def __repr__(self):
        return '<Rates for {}>'.format(datetime.fromtimestamp(self.date).strftime('%d.%m.%Y %H:%M'))

# =======================================
class XRP_EUR(db.Model):
    date = db.Column(db.Integer, primary_key=True)
    open = db.Column(db.Float(precision=2))
    close = db.Column(db.Float(precision=2))
    high = db.Column(db.Float(precision=2))
    low = db.Column(db.Float(precision=2))
    volume = db.Column(db.Float(precision=2))

    def __repr__(self):
        return '<Rates for {}>'.format(datetime.fromtimestamp(self.date).strftime('%d.%m.%Y %H:%M'))

# =======================================
class XRP_USD(db.Model):
    date = db.Column(db.Integer, primary_key=True)
    open = db.Column(db.Float(precision=2))
    close = db.Column(db.Float(precision=2))
    high = db.Column(db.Float(precision=2))
    low = db.Column(db.Float(precision=2))
    volume = db.Column(db.Float(precision=2))

    def __repr__(self):
        return '<Rates for {}>'.format(datetime.fromtimestamp(self.date).strftime('%d.%m.%Y %H:%M'))

# =======================================
try:
    first_rate = BTC_USD.query.order_by(sqlalchemy.desc(BTC_USD.date)).first()
except (sqlite3.OperationalError, sqlalchemy.exc.OperationalError):
    db.create_all()
    first_rate = None

# =======================================
def update(since_date):
    parameters = {'pair': "XBTUSD", "interval": 60, "since": since_date}
    BTC_USD_response = requests.get('https://api.kraken.com/0/public/OHLC', params=parameters)
    for item in BTC_USD_response.json()['result']['XXBTZUSD']:
        item = BTC_USD(date=item[0],
                       open=float(item[1]),
                       high=float(item[2]),
                       low=float(item[3]),
                       close=float(item[4]),
                       volume=float(item[6]))
        try:
            db.session.add(item)
        except:
            print("При добавлении строки произошла ошибка")
    db.session.commit()

    parameters = {'pair': "ETHUSD", "interval": 60, "since": since_date}
    ETH_USD_response = requests.get('https://api.kraken.com/0/public/OHLC', params=parameters)
    for item in ETH_USD_response.json()['result']['XETHZUSD']:
        item = ETH_USD(date=item[0],
                       open=float(item[1]),
                       high=float(item[2]),
                       low=float(item[3]),
                       close=float(item[4]),
                       volume=float(item[6]))
        try:
            db.session.add(item)
        except:
            print("При добавлении строки произошла ошибка")
    db.session.commit()

    parameters = {'pair': "XRPEUR", "interval": 60, "since": since_date}
    XRP_EUR_response = requests.get('https://api.kraken.com/0/public/OHLC', params=parameters)
    for item in XRP_EUR_response.json()['result']['XXRPZEUR']:
        item = XRP_EUR(date=item[0],
                       open=float(item[1]),
                       high=float(item[2]),
                       low=float(item[3]),
                       close=float(item[4]),
                       volume=float(item[6]))
        try:
            db.session.add(item)
        except:
            print("При добавлении строки произошла ошибка")
    db.session.commit()

    parameters = {'pair': "XRPUSD", "interval": 60, "since": since_date}
    XRP_USD_response = requests.get('https://api.kraken.com/0/public/OHLC', params=parameters)
    for item in XRP_USD_response.json()['result']['XXRPZUSD']:
        item = XRP_USD(date=item[0],
                       open=float(item[1]),
                       high=float(item[2]),
                       low=float(item[3]),
                       close=float(item[4]),
                       volume=float(item[6]))
        try:
            db.session.add(item)
        except:
            print("При добавлении строки произошла ошибка")
    db.session.commit()
    print("База данных была успешно обновлена")


# =======================================
if first_rate is None:
    update(1618866000)
elif first_rate.date + 3600 < round(datetime.now().timestamp()):
    update(first_rate.date)

# =======================================
@name_space.route("/update")
class MainClass(Resource):
    def get(self):
        first = BTC_USD.query.order_by(sqlalchemy.desc(BTC_USD.date)).first()
        if first.date + 3600 < round(datetime.now().timestamp()): update(first.date)
        return {"status": "Database was succesfully updated"}

# =======================================
@name_space.route("/btc_usd")
class MainClass(Resource):
    @app.doc(responses={200: 'Success', 400: 'Invalid Argument', 500: 'Mapping Key Error'})
    def get(self):
        try:
            rates = BTC_USD.query.order_by(sqlalchemy.desc(BTC_USD.date)).all()
            rates_dict = {}
            for i in range(len(rates)):
                temp_day = datetime.fromtimestamp(rates[i].date - rates[i].date % 86400).strftime('%d.%m.%Y')
                temp_values = {"min":{"close": rates[i].close,
                                      "open": rates[i].open,
                                      "high": rates[i].high,
                                      "low": rates[i].low,
                                      "volume": rates[i].volume},
                             'max': {"close": rates[i].close,
                                      "open": rates[i].open,
                                      "high": rates[i].high,
                                      "low": rates[i].low,
                                      "volume": rates[i].volume}}
                if rates_dict.get(temp_day) is not None:
                    if temp_values["min"]["low"] < rates_dict[temp_day]["min"]["low"]:
                        rates_dict[temp_day]["min"] = temp_values["min"]
                    if temp_values["max"]["high"] > rates_dict[temp_day]["max"]["high"]:
                        rates_dict[temp_day]["max"] = temp_values["max"]
                else: rates_dict[temp_day] = temp_values
            return rates_dict
        except KeyError as e:
            name_space.abort(500, e.__doc__, status="Could not retrieve information", statusCode="500")
        except Exception as e:
            name_space.abort(400, e.__doc__, status="Could not retrieve information", statusCode="400")

# =======================================
@name_space.route("/eth_usd")
class MainClass(Resource):
    @app.doc(responses={200: 'Success', 400: 'Invalid Argument', 500: 'Mapping Key Error'})
    def get(self):
        try:
            rates = ETH_USD.query.order_by(sqlalchemy.desc(ETH_USD.date)).all()
            rates_dict = {}
            for i in range(len(rates)):
                temp_day = datetime.fromtimestamp(rates[i].date - rates[i].date % 86400).strftime('%d.%m.%Y')
                temp_values = {"min":{"close": rates[i].close,
                                      "open": rates[i].open,
                                      "high": rates[i].high,
                                      "low": rates[i].low,
                                      "volume": rates[i].volume},
                             'max': {"close": rates[i].close,
                                      "open": rates[i].open,
                                      "high": rates[i].high,
                                      "low": rates[i].low,
                                      "volume": rates[i].volume}}
                if rates_dict.get(temp_day) is not None:
                    if temp_values["min"]["low"] < rates_dict[temp_day]["min"]["low"]:
                        rates_dict[temp_day]["min"] = temp_values["min"]
                    if temp_values["max"]["high"] > rates_dict[temp_day]["max"]["high"]:
                        rates_dict[temp_day]["max"] = temp_values["max"]
                else: rates_dict[temp_day] = temp_values
            return rates_dict
        except KeyError as e:
            name_space.abort(500, e.__doc__, status="Could not retrieve information", statusCode="500")
        except Exception as e:
            name_space.abort(400, e.__doc__, status="Could not retrieve information", statusCode="400")

# =======================================
@name_space.route("/xrp_eur")
class MainClass(Resource):
    @app.doc(responses={200: 'Success', 400: 'Invalid Argument', 500: 'Mapping Key Error'})
    def get(self):
        try:
            rates = XRP_EUR.query.order_by(sqlalchemy.desc(XRP_EUR.date)).all()
            rates_dict = {}
            for i in range(len(rates)):
                temp_day = datetime.fromtimestamp(rates[i].date - rates[i].date % 86400).strftime('%d.%m.%Y')
                temp_values = {"min":{"close": rates[i].close,
                                      "open": rates[i].open,
                                      "high": rates[i].high,
                                      "low": rates[i].low,
                                      "volume": rates[i].volume},
                             'max': {"close": rates[i].close,
                                      "open": rates[i].open,
                                      "high": rates[i].high,
                                      "low": rates[i].low,
                                      "volume": rates[i].volume}}
                if rates_dict.get(temp_day) is not None:
                    if temp_values["min"]["low"] < rates_dict[temp_day]["min"]["low"]:
                        rates_dict[temp_day]["min"] = temp_values["min"]
                    if temp_values["max"]["high"] > rates_dict[temp_day]["max"]["high"]:
                        rates_dict[temp_day]["max"] = temp_values["max"]
                else: rates_dict[temp_day] = temp_values
            return rates_dict
        except KeyError as e:
            name_space.abort(500, e.__doc__, status="Could not retrieve information", statusCode="500")
        except Exception as e:
            name_space.abort(400, e.__doc__, status="Could not retrieve information", statusCode="400")

# =======================================
@name_space.route("/xrp_usd")
class MainClass(Resource):
    @app.doc(responses={200: 'Success', 400: 'Invalid Argument', 500: 'Mapping Key Error'})
    def get(self):
        try:
            rates = XRP_USD.query.order_by(sqlalchemy.desc(XRP_USD.date)).all()
            rates_dict = {}
            for i in range(len(rates)):
                temp_day = datetime.fromtimestamp(rates[i].date - rates[i].date % 86400).strftime('%d.%m.%Y')
                temp_values = {"min":{"close": rates[i].close,
                                      "open": rates[i].open,
                                      "high": rates[i].high,
                                      "low": rates[i].low,
                                      "volume": rates[i].volume},
                             'max': {"close": rates[i].close,
                                      "open": rates[i].open,
                                      "high": rates[i].high,
                                      "low": rates[i].low,
                                      "volume": rates[i].volume}}
                if rates_dict.get(temp_day) is not None:
                    if temp_values["min"]["low"] < rates_dict[temp_day]["min"]["low"]:
                        rates_dict[temp_day]["min"] = temp_values["min"]
                    if temp_values["max"]["high"] > rates_dict[temp_day]["max"]["high"]:
                        rates_dict[temp_day]["max"] = temp_values["max"]
                else: rates_dict[temp_day] = temp_values
            return rates_dict
        except KeyError as e:
            name_space.abort(500, e.__doc__, status="Could not retrieve information", statusCode="500")
        except Exception as e:
            name_space.abort(400, e.__doc__, status="Could not retrieve information", statusCode="400")

if __name__ == "__main__":
	flask_app.run(debug=True)