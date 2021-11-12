import re

codirovka = 'EUC-KR'
with open("iteminfo.lua", encoding=codirovka, errors='ignore') as file:
    lines = file.read().splitlines()

with open("idnum2itemresnametable.txt", encoding=codirovka, errors='ignore') as file:
    res = file.read().splitlines()

not_in_items = list()
here = 0
count = 0
all_count = len(res)
for line in res:
    count += 1
    if '//' in line: continue
    if '#' not in line: continue
    here = 0
    item_id = line.split('#')[0]
    item_id = '['+item_id+']'
    for line2 in lines:
        if item_id in line2:
            here = 1
            break
    print('\rПросмотрено '+str(count)+'/'+str(all_count)+': ' + item_id, end='')
    if (here == 1): continue
    else:
        not_in_items.append(item_id)

with open("not_in_items.txt", "w", encoding=codirovka) as file:
    for line in not_in_items:
        line = line.replace("  ", " ")
        file.write(line + '\n')