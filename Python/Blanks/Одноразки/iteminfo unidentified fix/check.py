import re

codirovka = 'Windows-1251'
with open("iteminfo.lua", 'r', encoding=codirovka) as file:
    lines = file.read().splitlines()

new_lines = list()
mvp_added = set()

deletion = False
end = False
for line in lines:
    if 'main = function()' in line: end = True
    if deletion == False:
        if 'unidentifiedDescriptionName' in line and end == False:
            deletion = True
            new_lines.append('\t\tunidentifiedDescriptionName =  { \"Неизвестный предмет. Для идентификации используйте ^008080увеличительное стекло^000000.\" },')
            if '}' in line:
                deletion = False
        else: new_lines.append(line)
    elif deletion == True:
        if '}' in line:
            deletion = False
    elif end == True: new_lines.append(line)

with open("iteminfo2.lua", "w", encoding=codirovka) as file:
    for line in new_lines:
        file.write(line + '\n')