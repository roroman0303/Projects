import re
import json
import files
import db

# === обновить все файлы на сервере, клиенте и бд ===
def all(files_dict, region):
    date = input('Введите дату профилактики в формате дд.мм: ')
    date = '2021' + date.split('.')[1] + date.split('.')[0]
    for file, text in files_dict.items():
        if files_dict.get(file) is not None and files_dict.get(file).isspace() is not True:
            if file == 'special.sc': special(text, region)
            elif file == 'script.sql': script_sql(text, region, date)
            elif file == 'Importantitem.txt': Importantitem(text, region)
            elif file == 'CashItemList.txt': CashItemList(text, region)
            elif file == 'ItemMoveInfoV4.txt': ItemMoveInfoV(text, region, 4)
            elif file == 'ItemMoveInfoV5.txt': ItemMoveInfoV(text, region, 5)
            elif file == 'combiItem.sc': combiItem(text, region)
            elif file == 'BuffSpecial.sc': BuffSpecial(text, region)
            elif file == 'PackageItem.lua': PackageItem(text, region)
            # elif file == 'iteminfo.lua': iteminfo(text, region, date)
            # elif file == 'itemslotcounttable.txt': itemslotcounttable(text, region, date)
            # elif file == 'num2itemresnametable.txt': num2itemresnametable(text, region, date)
            # elif file == 'idnum2itemresnametable.txt': idnum2itemresnametable(text, region, date)
            # elif file == 'accname.lua': accname(text, region, date)
            # elif file == 'accessoryid.lua': accessoryid(text, region, date)
            # elif file == 'spriterobeid.lua': spriterobeid(text, region, date)
            # elif file == 'spriterobename.lua': spriterobename(text, region, date)
            # elif file == 'tb_layer_priority.lua': tb_layer_priority(text, region, date)
            # elif file == 'ItemSummonList.txt': ItemSummonList(text, region, date)
            # elif file == 'Collection.lua': Collection(text, region, date)
            # elif file == 'NotDisappearAfterUsingItemList.lua': NotDisappearAfterUsingItemList(text, region, date)

    return

# === обновить special.sc в репо ===
def special(text, region):
    path = files.get_path(region, 'special.sc')
    if region == 'ropru': codirovka = 'Windows-1251'
    else: codirovka = 'utf-8'

    pattern = r'^\s*item\s+(\S+)\s*'
    new_items = list()
    for line in text.splitlines():
        if re.search(pattern, line):
            new_items.append(re.search(pattern, line).group(1))

    old_lines = files.open_lines(path, codirovka)
    skip = False
    old_lines_fixed = list()
    for line in old_lines:
        if re.search(pattern, line): skip = False
        if re.search(pattern, line) is not None and re.search(pattern, line).group(1) in new_items: skip = True
        if skip == True: pass
        else: old_lines_fixed.append(line)
    old_text_fixed = '\n'.join(old_lines_fixed)

    begin = old_text_fixed.rsplit('return', 1)[0] + '\n\n'
    end = old_text_fixed.rsplit('return', 1)[1]
    new_text = begin + text.strip() + end
    files.write_text(new_text, path, codirovka, errors='ignore')

# === обновить combiItem.sc в репо ===
def combiItem(text, region):
    path = files.get_path(region, 'combiItem.sc')

    pattern = r'^\s*COMBIITEM(\S+)\s*'
    new_combiitems = list()
    for line in text.splitlines():
        if re.search(pattern, line):
            new_combiitems.append(re.search(pattern, line).group(1))

    old_lines = files.open_lines(path)
    skip = False
    old_lines_fixed = list()
    for line in old_lines:
        if re.search(pattern, line): skip = False
        if re.search(pattern, line) is not None and re.search(pattern, line).group(1) in new_combiitems: skip = True
        if skip == True: pass
        else: old_lines_fixed.append(line)
    old_text_fixed = '\n'.join(old_lines_fixed)

    new_text = old_text_fixed + '\n' + text
    files.write_text(new_text, path)

# === обновить BuffSpecial.sc в репо ===
def BuffSpecial(text, region):
    path = files.get_path(region, 'BuffSpecial.sc')

    pattern = r'^\s*Buff\s+(\S+)\s*'
    new_buffs = list()
    for line in text.splitlines():
        if re.search(pattern, line):
            new_buffs.append(re.search(pattern, line).group(1))

    old_lines = files.open_lines(path, codirovka='EUC-KR')
    skip = False
    old_lines_fixed = list()
    for line in old_lines:
        if re.search(pattern, line): skip = False
        if re.search(pattern, line) is not None and re.search(pattern, line).group(1) in new_buffs: skip = True
        if skip == True: pass
        else: old_lines_fixed.append(line)
    old_text_fixed = '\n'.join(old_lines_fixed)

    begin = old_text_fixed.rsplit('return', 1)[0] + '\n\n'
    end = old_text_fixed.rsplit('return', 1)[1]
    new_text = begin + text.strip() + end
    files.write_text(new_text, path, codirovka='EUC-KR')

# === обновить script.sql в репо ===
def script_sql(text, region, date):
    path = files.get_path(region, 'script.sql')
    if region == 'ropru': path = path.replace('script.sql', date+'_script_prime.sql')
    elif region == 'ropeu': path = path.replace('script.sql', date+'_script_euprime.sql')
    elif region == 'roeu': path = path.replace('script.sql', date+'_script_chaos.sql')
    try:
        old_text = files.open_text(path)
        new_text = old_text.rstrip() + '\n\n' + text
        files.write_text(new_text, path)
    except FileNotFoundError:
        files.write_text(text, path)
    print('Прогнать SQL скрипт в базе данных? (да/нет)')
    choice = input('Выбор: ')
    if 'да' in choice.lower(): db.execute(text)

# === обновить Importantitem.txt в репо ===
def Importantitem(text, region):
    path = files.get_path(region, 'Importantitem.txt')

    pattern = r'^\s*(\S+)\s+'
    new_items = list()
    for line in text.splitlines():
        if re.search(pattern, line):
            new_items.append(re.search(pattern, line).group(1))

    old_lines = files.open_lines(path)
    old_lines_fixed = list()
    for line in old_lines:
        if re.search(pattern, line) is not None and re.search(pattern, line).group(1) in new_items: pass
        else: old_lines_fixed.append(line)
    old_text_fixed = '\n'.join(old_lines_fixed)

    new_text = old_text_fixed + '\n' + text
    files.write_text(new_text, path)

# === обновить 'CashItemList.txt' в репо ===
def CashItemList(text, region):
    path = files.get_path(region, 'CashItemList.txt')

    pattern = r'^\s*("\S+")\s*'
    new_items = list()
    for line in text.splitlines():
        if re.search(pattern, line):
            new_items.append(re.search(pattern, line).group(1))

    old_lines = files.open_lines(path)
    old_lines_fixed = list()
    for line in old_lines:
        if re.search(pattern, line) is not None and re.search(pattern, line).group(1) in new_items: pass
        else: old_lines_fixed.append(line)
    old_text_fixed = '\n'.join(old_lines_fixed)

    new_text = old_text_fixed + '\n' + text
    files.write_text(new_text, path)

# === обновить 'ItemMoveInfoV*.txt' в репо ===
def ItemMoveInfoV(text, region, version=5):
    path = files.get_path(region, 'ItemMoveInfoV{}.txt'.format(version))

    pattern = r'^\s*(\S+)\s*'
    new_items = list()
    for line in text.splitlines():
        if re.search(pattern, line):
            new_items.append(re.search(pattern, line).group(1))

    old_lines = files.open_lines(path)
    old_lines_fixed = list()
    for line in old_lines:
        if re.search(pattern, line) is not None and re.search(pattern, line).group(1) in new_items: pass
        else: old_lines_fixed.append(line)
    old_text_fixed = '\n'.join(old_lines_fixed)

    new_text = old_text_fixed + '\n' + text
    files.write_text(new_text, path)

# === обновить PackageItem.lua в репо ===
def PackageItem(text, region):
    path = files.get_path(region, 'PackageItem.lua')

    pattern = r'^\s*\[(.*)\]\s*='
    new_items = list()
    for line in text.splitlines():
        if re.search(pattern, line):
            name = re.search(pattern, line).group(1).replace('[[', '\"').replace(']]', '\"').strip().replace('\"', '')
            new_items.append(name)

    old_lines = files.open_lines(path)
    skip = False
    lines = list()
    for line in old_lines:
        if re.search(pattern, line):
            name = re.search(pattern, line).group(1).replace('[[', '\"').replace(']]', '\"').strip().replace('\"', '')
            skip = False
        if re.search(pattern, line) is not None and name in new_items: skip = True
        if 'function' in line: break
        elif skip == True: pass
        else: lines.append(line)
    old_text = '\n'.join(lines).rsplit('};', 1)[0]
    function_block = list()
    block_write = False
    for line in old_lines:
        if 'function' in line: block_write = True
        if block_write == True: function_block.append(line)
    function_block = '\n'.join(function_block).rsplit('};', 1)[0]
    new_text = old_text + text + '};\n\n\n' + function_block
    files.write_text(new_text, path)

