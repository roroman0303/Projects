import re
import Ragnarok.module.files as files
import Ragnarok.module.db as db
import Ragnarok.module.find as find

alph = (
        'й', 'ц', 'у', 'к', 'е', 'н', 'г', 'ш', 'щ', 'з', 'х',
        'ъ', 'ф', 'ы', 'в', 'а', 'п', 'р', 'о', 'л', 'д', 'ж',
        'э', 'я', 'ч', 'с', 'м', 'и', 'т', 'ь', 'б', 'ю', 'ё')

obb_filtered2 = files.open_lines('obb_filtered2.txt')
ovb_filtered2 = files.open_lines('ovb_filtered2.txt')

obb_filtered3 = list()
ovb_filtered3 = list()
for line in obb_filtered2:
    print(re.split(r'\s+', line)[1])
    exist = 0
    table, db_dict = db.find_table('ropru', re.split(r'\s+', line)[1], 'NAME')
    if db_dict is not None:
        info = find.iteminfo('ropru', db_dict['ID']).split('identifiedDisplayName')[1]
        for letter in alph:
            if letter in info:
                exist = 1
                break
    if exist == 0:
        obb_filtered3.append('удалить\t' + re.split(r'\s+', line)[1])
    else:
        obb_filtered3.append(line)

for line in ovb_filtered2:
    print(re.split(r'\s+', line)[1])
    exist = 0
    table, db_dict = db.find_table('ropru', re.split(r'\s+', line)[1], 'NAME')
    if db_dict is not None:
        info = find.iteminfo('ropru', db_dict['ID']).split('identifiedDisplayName')[1]
        for letter in alph:
            if letter in info:
                exist = 1
                break
    if exist == 0:
        ovb_filtered3.append('удалить\t' + re.split(r'\s+', line)[1])
    else:
        ovb_filtered3.append(line)

files.write_lines(obb_filtered3, 'obb_filtered3.txt')
files.write_lines(ovb_filtered3, 'ovb_filtered3.txt')