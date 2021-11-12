import re
import Ragnarok.module.files as files
import Ragnarok.module.db as db

item_lines = files.open_lines('ItemSummonList.txt')

ids = set()
for line in item_lines:
    if re.split(r'\s+', line)[0] == 'Old_Blue_Box':
        if re.split(r'\s+', line)[1] not in ids: ids.add(re.split(r'\s+', line)[1])
print(len(ids))

obb_classic = list()
for id in ids:
    table, db_dict = db.find_table('ropru', id)
    obb_classic.append(db_dict['NAME'])

files.write_lines(obb_classic, 'obb_classic.txt')
