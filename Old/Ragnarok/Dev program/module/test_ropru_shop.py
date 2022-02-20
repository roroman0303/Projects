import re
import pytest
import Ragnarok.module.find as find
import Ragnarok.module.monetization as monetization
import Ragnarok.module.files as files
region = 'ropru'
shop_type = monetization.get_shop_type(region)
shop_list = ''

def test_ImportantItem():
    global shop_list
    if shop_list == '': shop_list = monetization.create_shop_list(region)
    google_ids = [item[1] for item in shop_list]
    repo_ids = list()
    for id in google_ids:
        if find.Importantitem(region, id) == True: repo_ids.append(id)
    assert repo_ids == google_ids

def test_CashItemList():
    global shop_list
    if shop_list == '': shop_list = monetization.create_shop_list(region)
    google_dbnames = [item[2] for item in shop_list]
    repo_dbnames = list()
    for dbname in google_dbnames:
        if find.CashItemList(region, dbname) == True: repo_dbnames.append(dbname)
    assert repo_dbnames == google_dbnames

def test_SimpleCashShopScript():
    global shop_list
    if shop_list == '': shop_list = monetization.create_shop_list(region)
    google_list = [[shop_type[item[0]],item[2],item[3]] for item in shop_list]
    pattern = r'{t_shop_type.(\S+),\"(\S+)\", (\S+)}'
    lines = files.open_lines(files.get_path(region, 'SimpleCashShopScript.lua'))
    repo_list = list()
    for line in lines:
        if re.search(pattern, line):
            category = re.search(pattern, line).group(1)
            item_dbname = re.search(pattern, line).group(2)
            item_price = re.search(pattern, line).group(3)
            repo_list.append([category, item_dbname, item_price])
    assert repo_list == google_list

def all():
    pytest.main(['-rpEf -v', 'module/test_{}_shop.py'.format(region)])

if __name__ == '__main__':
    pytest.main(['-rpEf -v', 'module/test_{}_shop.py'.format(region)])
