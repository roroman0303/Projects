import os
import db
import dbitems
import files

server_files = ['Importantitem.txt','ItemMoveInfoV4.txt',
                'ItemMoveInfoV5.txt','combiItem.sc','special.sc',
                'PackageItem.lua','ItemSummonList.txt','BuffSpecial.sc',
                'Collection.lua','NotDisappearAfterUsingItemList.lua', 'LapineDdukDDakBox.lua']
client_files = ['idnum2itemdesctable.txt', 'idnum2itemdesctable.txt',
                'idnum2itemdisplaynametable.txt', 'num2itemdisplaynametable.txt',
                'idnum2itemresnametable.txt', 'num2itemresnametable.txt',
                'itemslotcounttable.txt', 'cardprefixnametable.txt']

# === создание sql-запросов из корейского Excel файла ===
def create_sql(korean_doc='korean_doc.xlsx'):
    table = files.open_table(filename=korean_doc, sheetname='database(en)')
    sql_rows = list()
    # === переименование нужных таблиц с корейского варианта ===
    for row in range(len(table)):
        if table[row][0] is not None and table[row][1] is None:
            if 'monmakingitem (option)' in table[row][0].lower(): table[row][0] = 'monmakingitem3'
            elif 'mvp' in table[row][0].lower(): table[row][0] = 'MVP'
    # === проходит по всем таблицам и получаем для них запросы для обновления базы ===
    skip_one = False
    skip_table = False
    for row in table:
        if skip_one == True: skip_one = False # пропуск шапки
        elif row[0] is None: pass # пропуск пустых
        elif row[0] is not None and row[1] is None: # обновление таблицы
            skip_table = False # если пропустили предыдущую таблицу
            current_table = row[0]  # пошла новая таблица
            if current_table in dbitems.all_tables: skip_one = True
            else:
                skip_table = True
                print("\033[31m Внимание\033[0m - пропущена таблица {}!".format(current_table))
        elif skip_table == True: pass # пропуск таблицы
        else: sql_rows.append(db.create_row(current_table, row))
    sql_text = '\n'.join(sql_rows)
    return sql_text

# === создание словаря с текстом серверных скриптов из корейского Excel файла ===
def create_server(korean_doc='korean_doc.xlsx'):
    table = files.open_table(filename=korean_doc, sheetname='server(en)')
    server_dict = dict()
    # === переименование нужных файлов с корейского варианта ===
    for row in range(len(table)):
        if table[row][0] is not None and table[row][1] is None:
            if 'importantitem.txt' in table[row][0].lower(): table[row][0] = 'Importantitem.txt'
            elif 'itemmoveinfov5.txt' in table[row][0].lower(): table[row][0] = 'ItemMoveInfoV5.txt'
            elif 'itemmoveinfov4.txt' in table[row][0].lower(): table[row][0] = 'ItemMoveInfoV4.txt'
            elif 'combiitem.sc' in table[row][0].lower(): table[row][0] = 'combiItem.sc'
            elif 'packageitem.lua' in table[row][0].lower(): table[row][0] = 'PackageItem.lua'
    # === нужно строковое представление ===
    for row in range(len(table)):
        for col in range(len(table[row])):
            if table[row][col] is not None: table[row][col] = str(table[row][col])
    # === исправление свойств ===
    for row in range(len(table)):
        if table[row][0] is not None and table[row][0].strip() in server_files: current_file = table[row][0].strip()
        elif table[row][0] is not None and current_file == 'special.sc' and 'item' in table[row][0]: last_item = table[row][0].split(' ')[1]
        elif table[row][2] is not None and 'EQUIPMENT_EFFECT' in table[row][2]:
            broken_dbname = table[row][2].split(' ')[1]
            table[row][2] = table[row][2].replace(broken_dbname, last_item)
    # === создание словаря {файл : текст, ...} ===
    current_file = ''
    for row in range(len(table)):
        if table[row][0] is not None and table[row][0].strip() in server_files:
            if current_file != '' and server_dict[current_file] == '': server_dict.pop(current_file)
            current_file = table[row][0].strip()
            if current_file == 'LapineDdukDDakBox.lua': break
            server_dict[current_file] = ''
        else:
            new_line = ''
            for cell in table[row]:
                if cell is None: new_line += '\t'
                else: new_line += cell + '\t'
            if new_line.isspace() is True: pass
            else: server_dict[current_file] += new_line.rstrip() + '\n'
    return server_dict

# === создание словаря с текстом клиентских файлов из корейского Excel файла ===
def create_client(korean_doc='korean_doc.xlsx'):
    table = files.open_table(filename=korean_doc, sheetname='client')
    client_dict = dict()
    # === создание словаря {файл : текст, ...} ===
    current_file = ''
    for row in range(len(table)):
        if table[row][0] is not None and table[row][0].strip() in client_files:
            if current_file != '' and client_dict[current_file] == '': client_dict.pop(current_file)
            current_file = table[row][0].strip()
            if current_file == 'cardprefixnametable.txt': break
            client_dict[current_file] = ''
        else:
            new_line = ''
            for cell in table[row]:
                if cell is None: new_line += '\t'
                else: new_line += cell + '\t'
            if new_line.isspace() is True: pass
            else: client_dict[current_file] += new_line.rstrip() + '\n'
    return client_dict

def main(sql=True, server=True, client=True):
    filenames = os.listdir()
    for filename in filenames:
        if '.xlsx' in filename:
            if sql == True:
                sql_script = create_sql(filename)
                files.write_text(sql_script, 'script.sql')
            if server == True:
                server_dict = create_server(filename)
                for key in server_dict.keys():
                    if key == 'special.sc': codirovka = 'Windows-1251'
                    else: codirovka = 'UTF-8'
                    files.write_text(server_dict[key], 'NEW_'+key, codirovka=codirovka)
            if client == True:
                client_dict = create_client(filename)
                for key in client_dict.keys():
                    if key == 'idnum2itemresnametable.txt' or key == 'num2itemresnametable.txt': codirovka = 'EUC-KR'
                    else: codirovka = 'UTF-8'
                    files.write_text(client_dict[key], 'NEW_' + key, codirovka=codirovka)
            break

if __name__ == '__main__':
    main()