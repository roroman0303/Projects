import re

codirovka = 'utf-8'
with open("ItemSummonList_eu.txt", 'r', encoding=codirovka) as file:
    eu_lines = file.read().splitlines()
with open("ItemSummonList_ru.txt", 'r', encoding=codirovka) as file:
    ru_lines = file.read().splitlines()

obb_lines = list()
ru_lines_no_obb = list()
for line in eu_lines:
    if 'Old_Blue_Box' in line or 'Old_Violet_Box' in line:
        obb_lines.append(line)

for line in ru_lines:
    if 'Old_Blue_Box' in line or 'Old_Violet_Box' in line:
        pass
    else:
        ru_lines_no_obb.append(line)

new_lines = obb_lines + ru_lines_no_obb

with open("ItemSummonList_ru_new.txt", "w", encoding=codirovka) as file:
    for line in new_lines:
        file.write(line + '\n')