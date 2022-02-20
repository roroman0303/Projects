import sys
sys.path.append('D:/Games/Scripts/module/')
import db, dbitems
import files

table = files.open_table()
# for row in range(len(table)):
#     for col in range(len(table[row])):
#         print(str(table[row][col])+'\t', end='')
#     print('\n')

skip_one = False
for row in table:
    if skip_one == True: skip_one = False # пропуск шапки
    elif row[0] is None: pass # пропуск пустых
    elif row[0] in dbitems.all_tables: # обновление текущей таблицы
        current_table = row[0]
        skip_one = True
    else:
        print(db.create_row(current_table, row))
