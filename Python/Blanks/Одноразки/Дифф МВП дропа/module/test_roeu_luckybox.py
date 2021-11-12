import re
import pytest
import find
import monetization
region = 'roeu'
luckybox_list = ''

def test_ImportantItem():
    global luckybox_list
    if luckybox_list == '': luckybox_list = monetization.create_luckybox_list(region)
    google_ids = [item[0] for item in luckybox_list]
    repo_ids = list()
    for id in google_ids:
        if find.Importantitem(region, id) == True: repo_ids.append(id)
    assert repo_ids == google_ids

def test_CashItemList():
    global luckybox_list
    if luckybox_list == '': luckybox_list = monetization.create_luckybox_list(region)
    google_dbnames = [item[1] for item in luckybox_list]
    repo_dbnames = list()
    for dbname in google_dbnames:
        if find.CashItemList(region, dbname) == True: repo_dbnames.append(dbname)
    assert repo_dbnames == google_dbnames

def test_PackageItem():
    global luckybox_list
    if luckybox_list == '': luckybox_list = monetization.create_luckybox_list(region)
    google_list = [[item[1],item[2],int(item[3].replace(',', '').replace('%','')),item[6]] for item in luckybox_list]
    for i in range(len(google_list)):
        if 'broadcast' in google_list[i][3]: google_list[i][3] = True
        else: google_list[i][3] = False
    pattern = r'{ name = \[\[natural_random\]\], item = \[\[(\S+)\]\], cnt = (\S+), hour = 0, onair = (\S+), guid = false, probability = (\S+) }'
    lines = find.PackageItem(region, google_list[0][0]).splitlines()
    google_list = google_list[1:]
    repo_list = list()
    for line in lines:
        if re.search(pattern, line):
            dbname = re.search(pattern, line).group(1)
            qty = re.search(pattern, line).group(2)
            chance = int(re.search(pattern, line).group(4))
            if re.search(pattern, line).group(1) == 'true': broadcast = True
            else: broadcast = False
            repo_list.append([dbname, qty, chance, broadcast])
    assert repo_list == google_list

def all():
    pytest.main(['-rpEf -v'])

if __name__ == '__main__':
    pytest.main(['-rpEf -v'])
