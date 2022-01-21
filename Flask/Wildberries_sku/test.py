import requests
from bs4 import BeautifulSoup

r = requests.get("https://www.wildberries.ru/catalog/{}/detail.aspx".format(32721735))
soup = BeautifulSoup(r.text, 'html.parser')
categories_soup = soup.findAll('a', class_="breadcrumbs__link")

categories_list = list()
for data in categories_soup:
    categories_list.append([data.get('href'), data.text.replace('\n', '')])
print(categories_soup)
categories_list = categories_list[1:]
print(categories_list)

search_list = list()
if categories_list[-1][0].startswith('/brands'):
    brand = categories_list[-1]
    r = requests.get("https://www.wildberries.ru" + brand[0])
    soup = BeautifulSoup(r.text, 'html.parser')
    search_result = soup.find('span', class_="brand-custom-header__count").text.strip().replace('\xa0',' ')
    search_list.append([brand[1], search_result])

    category = categories_list[-2]
    r = requests.get("https://www.wildberries.ru" + category[0])
    soup = BeautifulSoup(r.text, 'html.parser')
    search_result = soup.find('span', class_="goods-count").text.strip().replace('\xa0',' ')
    search_list.append([category[1], search_result])
else:
    category = categories_list[-1]
    r = requests.get("https://www.wildberries.ru" + category[0])
    soup = BeautifulSoup(r.text, 'html.parser')
    search_result = soup.find('span', class_="goods-count").text.strip().replace('\xa0',' ')
    search_list.append([category[1], search_result])

print(search_list)

