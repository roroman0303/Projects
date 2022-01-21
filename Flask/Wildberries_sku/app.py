from flask import Flask, request
from flask_restplus import Api, Resource, fields
from datetime import datetime
import requests
from bs4 import BeautifulSoup

# =======================================
flask_app = Flask(__name__)  # определяем, что будет использоваться фреймворк Flask
app = Api(app=flask_app)  # определяем, что нужно будет запускать проект в API из flask_restplus (т.е. как Swagger UI)
name_space = app.namespace('sku',  # пространство имён main с описанием
                           version="0.1",
                           title="Wildberries SKU",
                           description="Use requests to get categories and search values")

# =======================================
def get_categories(sku):
    r = requests.get("https://www.wildberries.ru/catalog/{}/detail.aspx".format(32721735))
    soup = BeautifulSoup(r.text, 'html.parser')
    categories_soup = soup.findAll('a', class_="breadcrumbs__link")

    categories_list = list()
    for data in categories_soup:
        categories_list.append([data.get('href'), data.text.replace('\n', '')])
    return categories_list[1:]

# =======================================
def get_search_values(categories_list):
    search_list = list()
    if categories_list[-1][0].startswith('/brands'):
        brand = categories_list[-1]
        r = requests.get("https://www.wildberries.ru" + brand[0])
        soup = BeautifulSoup(r.text, 'html.parser')
        search_result = soup.find('span', class_="brand-custom-header__count").text.strip().replace('\xa0', ' ')
        search_list.append([brand[1], search_result])

        category = categories_list[-2]
        r = requests.get("https://www.wildberries.ru" + category[0])
        soup = BeautifulSoup(r.text, 'html.parser')
        search_result = soup.find('span', class_="goods-count").text.strip().replace('\xa0', ' ')
        search_list.append([category[1], search_result])
    else:
        category = categories_list[-1]
        r = requests.get("https://www.wildberries.ru" + category[0])
        soup = BeautifulSoup(r.text, 'html.parser')
        search_result = soup.find('span', class_="goods-count").text.strip().replace('\xa0', ' ')
        search_list.append([category[1], search_result])

    return search_list

# =======================================
@name_space.route("/categories/<int:sku>")
class MainClass(Resource):
    @app.doc(responses={200: 'Success', 400: 'Invalid Argument', 500: 'Mapping Key Error'})
    def get(self, sku):
        try:
            categories_list = get_categories(sku)
            categories_dict = {len(categories_list) : [cat[1] for cat in categories_list]}
            return categories_dict
        except KeyError as e:
            name_space.abort(500, e.__doc__, status="Could not retrieve information", statusCode="500")
        except Exception as e:
            name_space.abort(400, e.__doc__, status="Could not retrieve information", statusCode="400")


# =======================================
@name_space.route("/search/<int:sku>")
class MainClass(Resource):
    @app.doc(responses={200: 'Success', 400: 'Invalid Argument', 500: 'Mapping Key Error'})
    def get(self, sku):
        try:
            categories_list = get_categories(sku)
            search_list = get_search_values(categories_list)
            search_dict = {"search_results" : { search[0] : search[1] for search in search_list}}
            return search_dict
        except KeyError as e:
            name_space.abort(500, e.__doc__, status="Could not retrieve information", statusCode="500")
        except Exception as e:
            name_space.abort(400, e.__doc__, status="Could not retrieve information", statusCode="400")
