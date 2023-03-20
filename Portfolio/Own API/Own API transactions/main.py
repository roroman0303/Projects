from flask import Flask, request
from flask_restplus import Api, Resource, fields
from flask_sqlalchemy import SQLAlchemy
from flask_migrate import Migrate
from datetime import datetime
import time
import os
import psycopg2
import sqlalchemy
import threading

flask_app = Flask(__name__)
app = Api(app=flask_app)
namespace = app.namespace('transactions',
                          version='0.1',
                          title='Transactions',
                          description='Use POST request to make a transaction')
flask_app.config['SQLALCHEMY_DATABASE_URI'] = "postgresql://postgres:postgres@localhost:5432/transactions"
flask_app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False
db = SQLAlchemy(app=flask_app)
migrate = Migrate(flask_app, db)

class Balance(db.Model):
    __tablename__ = 'balance'

    id = db.Column(db.Integer, nullable=False, unique=True, primary_key=True, autoincrement=True)
    client_key = db.Column(db.String(80), unique=True, nullable=False)
    balance = db.Column(db.Integer, nullable=False)
    update = db.Column(db.Integer, nullable=False)

    def __init__(self, client_key, balance=0, update=datetime.now().timestamp()):
        self.client_key = client_key
        self.balance = balance
        self.update = update

    def __repr__(self):
        return '<Balance for client {}: {} (last update {})>'.format(self.client_key,
                                                                     self.balance,
                                                                     datetime.fromtimestamp(self.update))


class ClientThread():
    key = None
    transactions = None
    thread = None

    def __init__(self, client_key, value):
        print(f'New thread for {client_key}')
        self.key = client_key
        self.transactions = [value]
        self.thread = threading.Thread(target=self.conducting)
        self.thread.start()

    def add(self, value):
        self.transactions.append(value)
        if not self.thread.is_alive():
            self.thread = threading.Thread(target=self.conducting)
            self.thread.start()

    def conducting(self):
        while len(self.transactions) > 0:
            value = self.transactions[0]
            conduct(self.key, value)
            self.transactions = self.transactions[1:]
            print(f'Transaction {value} for {self.key} was successfully conducted')


class ThreadManager():
    threads = None

    def __init__(self):
        self.threads = dict()

    def add(self, client_key, value):
        if self.threads.get(client_key) is None:
            self.threads[client_key] = ClientThread(client_key, value)
        else:
            self.threads[client_key].add(value)


thread_manager = ThreadManager()
payload_model = app.model('Transaction Model',
                          {'value': fields.Integer(required=True,
                                                  description="Input positive or negative value",
                                                  help="Cannot be blank."),
                           'client_key': fields.String(required=True,
                                                  description="Input client key string",
                                                  help="Cannot be blank.")})


def conduct(client_key, value):
    time.sleep(10) # <------------------------------- показательная пауза (можно удалить) -----------------------------
    balance = Balance.query.filter_by(client_key=client_key).first()
    if balance is None:
        if value < 0: return {'error': 'First transaction cannot be negative'}
        else:
            new_balance = Balance(client_key, value)
            db.session.add(new_balance)
            db.session.commit()
            return {'client_key': client_key, 'balance': value}
    else:
        if (balance.balance + value) < 0: return {'error': 'You have insufficient balance for this transaction'}
        else:
            balance.balance = balance.balance + value
            balance.update = datetime.now().timestamp()
            db.session.add(balance)
            db.session.commit()
            return {'client_key': client_key, 'balance': balance.balance}


@namespace.route("/all", methods=['GET'])
class AllTransactions(Resource):
    @app.doc(responses={200: 'Success', 400: 'Invalid Arguments', 500: 'Mapping Key Error'})
    def get(self):
        try:
            results = [{'client_key': balance.client_key,
                        'balance': balance.balance,
                        'date': str(datetime.fromtimestamp(balance.update))}
                       for balance in Balance.query.all()]
            return results
        except KeyError as error:
            namespace.abort(500, error.__doc__, status="Could not retrieve information", statusCode="500")
        except Exception as error:
            namespace.abort(400, error.__doc__, status="Could not retrieve information", statusCode="400")


@namespace.route("/conduct", methods=['POST'])
class ConductTransaction(Resource):
    @app.doc(responses={200: 'Success', 400: 'Invalid Arguments', 500: 'Mapping Key Error'})
    @app.expect(payload_model)
    def post(self):
        try:
            if request.is_json:
                body = request.get_json()
                client_key = body['client_key']
                value = body['value']
                thread_manager.add(client_key, value)
                current_balance = Balance.query.filter_by(client_key=client_key).first()
                if current_balance is None:
                    if value < 0: return {'First transaction cannot be negative'}
                    else: return {'Please, wait for transaction to be conducted'}
                else: return {'balance': current_balance.balance, 'date': current_balance.update}
            else: raise Exception
        except KeyError as error:
            namespace.abort(500, error.__doc__, status="Could not retrieve information", statusCode="500")
        except Exception as error:
            namespace.abort(400, error.__doc__, status="Could not retrieve information", statusCode="400")


if __name__ == "__main__":
    flask_app.run(debug=True)
