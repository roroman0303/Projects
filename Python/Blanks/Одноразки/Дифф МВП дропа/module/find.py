import files
import re

# нахождение упоминания Importantitem.txt для предмета
def Importantitem(region, id):
    path = files.get_path(region, 'Importantitem.txt')
    lines = files.open_lines(path)
    for line in lines:
        if line.strip().startswith(str(id)): return True
    return False

# нахождение упоминания CashItemList.txt для предмета
def CashItemList(region, dbname):
    path = files.get_path(region, 'CashItemList.txt')
    lines = files.open_lines(path)
    for line in lines:
        if "\""+dbname+"\"" in line: return True
    return False

# нахождение упоминания PackageItem.lua для предмета
def PackageItem(region, dbname):
    path = files.get_path(region, 'PackageItem.lua')
    lines = files.open_lines(path)
    pattern = r'^\s*\[(.*)\]\s*=' # боксы
    result = ''
    writing = False
    for line in lines:
        if re.search(pattern, line):
            fixed_line = line.replace(']]','\"').replace('[[','\"')
            if re.search(pattern, fixed_line).group(1).replace('\"','').strip() == dbname: writing = True
            elif writing == True: break
        if writing == True: result += line + '\n'
    return result.strip()

# # нахождение упоминания PackageItem.lua для предмета
# def SimpleCashShopScript(region, dbname):
#

# нахождение упоминания ItemMoveInfo.txt для предмета
def ItemMoveInfo(region, id):
    if region == 'roeu': path = files.get_path(region, 'ItemMoveInfoV4.txt')
    else: path = files.get_path(region, 'ItemMoveInfoV5.txt')
    lines = files.open_lines(path)
    for line in lines:
        if line.strip().startswith(str(id)):
            if region == 'roeu': return ''.join(re.split(r'\s+', line)[1:8])
            else: return ''.join(re.split(r'\s+', line)[1:9])

# нахождение special.sc для предмета
def special(region, dbname):
    path = files.get_path(region, 'special.sc')
    if region == 'ropru': codirovka = 'Windows-1251'
    else: codirovka = 'EUC-KR'
    lines = files.open_lines(path, codirovka)
    result = list()
    writing = False
    for line in lines:
        if re.search(r'^\s*item\s+(\S+)', line):
            if dbname == re.search(r'\s*item\s+(\S+)', line).group(1): writing = True
            else: writing = False
        if writing == True: result.append(line)
    result = '\n'.join(result)
    return result.strip()

if __name__ == '__main__':
    print(PackageItem('ropru', 'FuturisticBox_Prime'))