import re
import Ragnarok.module.files as files
import Ragnarok.module.patterns as pattern

obb_filtered1 = files.open_lines('obb_filtered1.txt')
ovb_filtered1 = files.open_lines('ovb_filtered1.txt')

cashitems_ru = files.open_lines('D:/RO/rot/zone/CashItemList.txt')
cashitems_eu = files.open_lines('D:/RO/roteu/zone/CashItemList.txt')
cashitemlist = list()
for line in cashitems_ru:
    if line.strip().startswith('\"'):
        if line.split('\"')[1] not in cashitemlist: cashitemlist.append(line.split('\"')[1])
for line in cashitems_eu:
    if line.strip().startswith('\"'):
        if line.split('\"')[1] not in cashitemlist: cashitemlist.append(line.split('\"')[1])

obb_filtered2 = list()
ovb_filtered2 = list()
for line in obb_filtered1:
    if re.split(r'\s+', line)[1] in cashitemlist: obb_filtered2.append('удалить\t'+re.split(r'\s+', line)[1])
    else: obb_filtered2.append(line)
for line in ovb_filtered1:
    if re.split(r'\s+', line)[1] in cashitemlist: ovb_filtered2.append('удалить\t'+re.split(r'\s+', line)[1])
    else: ovb_filtered2.append(line)

files.write_lines(obb_filtered2, 'obb_filtered2.txt')
files.write_lines(ovb_filtered2, 'ovb_filtered2.txt')