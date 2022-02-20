import re

codirovka = 'UTF-8'
with open("items.txt", encoding=codirovka, errors='ignore') as file:
    mobs = file.read().splitlines()
arr = list()
for line in mobs:
    params = line.split("\t")
    sql_str = 'INSERT INTO [script].[dbo].[monmakingitem3] VALUES ('
    for param in params:
        if type(param) is str:
            sql_str = sql_str + param + ', '
    sql_str = sql_str + ')'
    sql_str = sql_str.replace(', )', ')')
    arr.append(sql_str)

for g in arr:
    print(g)



