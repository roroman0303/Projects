import google_doc
import files
import korean_doc
import update_files
import os

ropru_shop_type = { 'Новинки и акции': 'SIMPLE_CASH_NEW',
                    'Хиты продаж': 'SIMPLE_CASH_POPULAR',
                    'Премиум': 'SIMPLE_CASH_LIMITED',
                    'Аренда': 'SIMPLE_CASH_RENTAL',
                    'Снаряжение': 'SIMPLE_CASH_PERPETUITY',
                    'Декор': 'SIMPLE_CASH_BUFF',
                    'Расход': 'SIMPLE_CASH_RECOVERY',
                    'Разное': 'SIMPLE_CASH_ETC'}
ropeu_shop_type = { 'Hot': 'SIMPLE_CASH_NEW',
                    'New': 'SIMPLE_CASH_POPULAR',
                    'Prime': 'SIMPLE_CASH_LIMITED',
                    'Buff': 'SIMPLE_CASH_RENTAL',
                    'Rental': 'SIMPLE_CASH_PERPETUITY',
                    'Gear': 'SIMPLE_CASH_BUFF',
                    'Costume': 'SIMPLE_CASH_RECOVERY',
                    'Other': 'SIMPLE_CASH_ETC'}
roeu_shop_type = {  'Hot': 'SIMPLE_CASH_NEW',
                    'New': 'SIMPLE_CASH_POPULAR',
                    'Prime': 'SIMPLE_CASH_LIMITED',
                    'Buff': 'SIMPLE_CASH_RENTAL',
                    'Rental': 'SIMPLE_CASH_PERPETUITY',
                    'Gear': 'SIMPLE_CASH_BUFF',
                    'Costume': 'SIMPLE_CASH_RECOVERY',
                    'Other': 'SIMPLE_CASH_ETC'}

# === получить словарь шопа из листа google-документа ===
def create_shop_dict(table):
    # === создание словаря {категория : [(предмет, цена), (предмет, цена)],  ...} ===
    items_count = len(table[0]) # количество позиций
    shop_dict = {}
    for row in range(items_count):
        category = table[0][row]
        item_dbname = table[1][row]
        item_price = table[2][row]
        if shop_dict.get(category) is None: shop_dict[category] = list()
        position = (item_dbname, item_price)
        shop_dict[category].append(position)
    return shop_dict

# === получить список лакибокса из листа google-документа ===
def create_luckybox_list(region):
    url = files.get_url(region + '_luckybox')
    table = google_doc.get_columns(url, 1, 1, 1, 2, 4, 5, 9, 10, 14)
    # === создание списка предметов [(...), (...) ...] ===
    items_count = len(table[0]) # количество позиций
    luckybox_list = list()
    for row in range(items_count):
        if table[0][row].isdigit(): item_id = table[0][row] # ID только числовое
        elif table[0][row] == '' and table[1][row] == '': break
        else: raise ValueError('ID в строке {} не числовой!'.format(row))
        item_dbname = table[1][row]
        item_qty = table[2][row]
        item_chance = table[3][row]
        try:
            item_move = table[4][row] # itemmoveinfo не всегда есть
        except IndexError:
            item_move = ''
        try:
            item_special = table[5][row] # special не всегда есть
        except IndexError:
            item_special = ''
        try:
            item_broadcast = table[6][row] # broadcast не всегда есть
        except IndexError:
            item_broadcast = ''
        item = (item_id, item_dbname, item_qty, item_chance, item_move, item_special, item_broadcast)
        luckybox_list.append(item)
    return luckybox_list

# === создание шопа из гугл-таблицы ===
def create_shop(region):
    if region == 'ropru':
        url = files.get_url('ropru_shop')
        shop_type = ropru_shop_type
        table = google_doc.get_columns(url, 'LIST', 2, 2, 4, 9)
    elif region == 'ropeu':
        url = files.get_url('ropeu_shop')
        shop_type = ropeu_shop_type
        table = google_doc.get_columns(url, 'LIST', 2, 2, 4, 9)
    elif region == 'roeu':
        url = files.get_url('roeu_shop')
        shop_type = roeu_shop_type
        table = google_doc.get_columns(url, 'LIST_NEW', 2, 2, 4, 9)
    else: raise ValueError('Проверьте регион' + region)
    shop_dict = create_shop_dict(table)
    text = fill_shop(shop_dict, shop_type)
    return text

# === создание текста скрипта шопа ===
def fill_shop(shop_dict, shop_type):
    shop_begin = """
t_shop_type=
{
    SIMPLE_CASH_NEW 		= 0,
    SIMPLE_CASH_POPULAR 	= 1,
    SIMPLE_CASH_LIMITED 	= 2,
    SIMPLE_CASH_RENTAL		= 3,
    SIMPLE_CASH_PERPETUITY	= 4,
    SIMPLE_CASH_BUFF		= 5,
    SIMPLE_CASH_RECOVERY	= 6,
    SIMPLE_CASH_ETC			= 7,
};

t_item_price = 
{
"""
    shop_offers = ''
    shop_end = """};

function main()
    for k,v in pairs(t_item_price) do
        if not add_cash_item(v[1],v[2],v[3]) 
        then return false, v[2]; end
    end
    return true , "success";
end
    """
    for category, items in shop_dict.items():
        for item in items:
            item_name = item[0]
            item_price = item[1]
            shop_offers += '\t{{t_shop_type.{},\"{}\", {}}},\n'.format(shop_type[category], item_name, item_price)
        shop_offers += '\n'
    shop_text = shop_begin + shop_offers + shop_end
    return shop_text

# === создание словаря лакибокса из таблицы и Excel-таблицы ===
def create_luckybox(region, xlsname='korean_doc.xlsx'):
    luckybox_list = create_luckybox_list(region)
    luckybox_dict = dict()
    luckybox_dict['PackageItem.lua'] = create_packageitem(luckybox_list)
    importantitem_list = [(item[0], item[1]) for item in luckybox_list]
    luckybox_dict['Importantitem.txt'] = create_importantitem(importantitem_list)
    cashitemlist_list = [item[1] for item in luckybox_list]
    luckybox_dict['CashItemList.txt'] = create_cashitemlist(cashitemlist_list)
    if region == 'roeu': luckybox_dict['ItemMoveInfoV4.txt'],_ = create_itemmoveinfo(luckybox_list)
    else: _,luckybox_dict['ItemMoveInfoV5.txt'] = create_itemmoveinfo(luckybox_list)
    luckybox_dict['script.sql'] = korean_doc.create_sql(xlsname)
    server_dict = korean_doc.create_server(xlsname)
    client_dict = korean_doc.create_client(xlsname)
    if server_dict.get('special.sc') is not None: luckybox_dict['special.sc'] = server_dict['special.sc']
    if server_dict.get('combiItem.sc') is not None: luckybox_dict['combiItem.sc'] = server_dict['combiItem.sc']
    if client_dict.get('idnum2itemresnametable.txt') is not None: luckybox_dict['idnum2itemresnametable.txt'] = client_dict['idnum2itemresnametable.txt']
    if client_dict.get('num2itemresnametable.txt') is not None: luckybox_dict['num2itemresnametable.txt'] = client_dict['num2itemresnametable.txt']
    if client_dict.get('itemslotcounttable.txt') is not None: luckybox_dict['itemslotcounttable.txt'] = client_dict['itemslotcounttable.txt']
    return luckybox_dict

# === создание текста Packageitem из листа лакибокса ===
def create_packageitem(luckybox_list):
    luckybox_name = luckybox_list[0][1]
    luckybox_list = luckybox_list[1:]
    packageitem_begin = '[ [['+luckybox_name+']] ] =\n{\n'
    packageitem_lines = ''
    packageitem_end = '},'
    for item in luckybox_list:
        item_name = item[1]
        item_qty = item[2]
        item_chance = int(item[3].replace(',', '').replace('%',''))
        if 'broadcast' in item[6].lower(): item_broadcast = 'true'
        else: item_broadcast = 'false'
        new_line = '\t{ name = [[natural_random]], item = [[%s]], cnt = %s, hour = 0, onair = %s, guid = false, probability = %s };\n'
        packageitem_lines += new_line % (item_name, item_qty, item_broadcast, item_chance)
    packageitem_text = packageitem_begin + packageitem_lines + packageitem_end
    return packageitem_text

# === создание текста Packageitem из списка [(id, dbname),(id, dbname)...] ===
def create_importantitem(importantitem_list):
    importantitem_text = ''
    for item in importantitem_list:
        item_id = item[0]
        item_name = item[1]
        importantitem_text += '{}\t{}\n'.format(item_id, item_name)
    return importantitem_text

# === создание текста CashItemList из списка [dbname, dbname...] ===
def create_cashitemlist(cashitemlist_list):
    cashitemlist_text = ''
    for item_name in cashitemlist_list:
        cashitemlist_text += '\"{}\"\n'.format(item_name)
    return cashitemlist_text

# === создание текста Packageitem из листа лакибокса ===
def create_itemmoveinfo(luckybox_list):
    itemmoveinfov4_text = ''
    itemmoveinfov5_text = ''
    for item in luckybox_list:
        item_id = item[0]
        item_name = item[1]
        if item[4].isspace() or item[4] == '' or '0000000' in item[4]: continue
        elif '1000111' in item[4]:
            item_move4 = '1\t0\t0\t0\t1\t1\t1'
            item_move5 = '1\t0\t0\t0\t1\t1\t1\t0'
        elif '1101111' in item[4]:
            item_move4 = '1\t1\t0\t1\t1\t1\t1'
            item_move5 = '1\t1\t0\t1\t1\t1\t1\t1'
        elif '1111111' in item[4]:
            item_move4 = '1\t1\t1\t1\t1\t1\t1'
            item_move5 = '1\t1\t0\t1\t1\t1\t1\t1'
        else: raise ValueError('Проверьте передаваемость предметов')
        itemmoveinfov4_text += '{}\t{}\t//{}\n'.format(item_id, item_move4, item_name)
        itemmoveinfov5_text += '{}\t{}\t//{}\n'.format(item_id, item_move5, item_name)
    return itemmoveinfov4_text, itemmoveinfov5_text

if __name__ == '__main__':
    print("\033[31mМонетизация\033[0m")
    print('1 - Шоп')
    print('2 - Лакибокс')
    choice = input('Выбор: ')
    print("\033[31mВыберите регион\033[0m:")
    print('1 - ropru')
    print('2 - ropeu')
    print('3 - roeu')
    region = input('Выбор: ')

    if region.strip() == '1': region = 'ropru'
    elif region.strip() == '2': region = 'ropeu'
    elif region.strip() == '3': region = 'roeu'

    if '1' in choice.strip():
        shop = create_shop(region)
        files.write_text(shop, 'SimpleCashShopScript.lua')
    if '2' in choice.strip():
        filenames = os.listdir()
        for filename in filenames:
            if '.xlsx' in filename:
                xlsx_filename = filename
                break

        luckybox_dict = create_luckybox(region, xlsx_filename)
        for file,text in luckybox_dict.items():
            files.write_text(text, 'NEW_files/NEW_'+file)
            files.open_with_notepad('NEW_files/NEW_'+file)
        print('Хотите обновить файлы сервера/клиента/бд? (да/нет)')
        want_to_update = input('Выбор: ')
        if 'да' in want_to_update.strip().lower(): update_files.all(luckybox_dict, region)
