import Ragnarok.module.db as db
import Ragnarok.module.dbitems as dbitems
import Ragnarok.module.files as files
import Ragnarok.module.find as find
import Ragnarok.module.google as google

url = files.get_url('desc_generator')
Except_dict = dict()
Items_dict = dict()
Special_dict = dict()
Monsters_dict = dict()
Skills_dict = dict()
Properties_dict = dict()
Races_dict = dict()
Statuses_dict = dict()
ParamTime_dict = dict()
Param_dict = dict()
Buffs_dict = dict()
Pets_dict = dict()
Var_dict = dict()
Conditions_dict = dict()
Jobs_dict = dict()
Loca_dict = dict()
Class_dict = dict()

# загрузка словарей
def create_Except_dict():
    global Except_dict
    table = google.get_columns(url, 'Except', 1, 1, 2, 3, 4, 5, 6)
    for row in range(len(table[0])):
        Except_dict[table[0][row]] = {'RUname' : table[2][row],
                                      'EUname' : table[3][row],
                                      'RUdescription' : table[4][row],
                                      'EUdescription' : table[5][row]}
        Except_dict[table[1][row]] = {'RUname': table[2][row],
                                      'EUname': table[3][row],
                                      'RUdescription': table[4][row],
                                      'EUdescription': table[5][row]}

# загрузка словарей
def create_Special_dict():
    global Special_dict
    table = google.get_columns(url, 'Special', 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for row in range(len(table[0])):
        Parameters = list()
        for i in range(1, 5):
            if table[i][row] is None or table[i][row].isspace() or len(table[i][row]) == 0: pass
            else: Parameters.append(table[i][row])
        Special_dict[table[0][row]] = {'Parameters' : Parameters,
                                       'User' : table[5][row],
                                       'Target' : table[6][row],
                                       'RUdescription': table[7][row],
                                       'EUdescription': table[8][row]}

# создание всех словарей
def create_dicts():
    create_Except_dict()
    # create_Items_dict()
    create_Special_dict()
    # create_Monsters_dict()
    # create_Skills_dict()
    # create_Properties_dict()
    # create_Races_dict()
    # create_Statuses_dict()
    # create_ParamTime_dict()
    # create_Param_dict()
    # create_Buffs_dict()
    # create_Pets_dict()
    # create_Var_dict()
    # create_Conditions_dict()
    # create_Jobs_dict()
    # create_Loca_dict()
    # create_Class_dict()

# определение типа описания и создание описания
def create_one(region, id):
    if str(id).isdigit(): table, db_dict = db.find_table(region, id)
    else: table, db_dict = db.find_table(region, id, 'NAME')
    itemmove = find.ItemMoveInfo(region, id)
    if table == 'ammo': return ammo(region, db_dict, itemmove)
    elif table == 'arrow': return arrow(region, db_dict, itemmove)
    elif table == 'card': return card(region, db_dict, itemmove)
    elif table == 'event': return event(region, db_dict, itemmove)
    elif table == 'cannonball': return cannonball(region, db_dict, itemmove)
    elif table == 'ThrowWeapon': return ThrowWeapon(region, db_dict, itemmove)
    elif table == 'CashPointItem': return CashPointItem(region, db_dict, itemmove)
    elif table in dbitems.armor_tables: return armor(region, db_dict, itemmove)
    elif table in dbitems.weapon_tables: return weapon(region, db_dict, itemmove)
    elif table in dbitems.consumable_tables: return consumable(region, db_dict, itemmove)

# # создание описания привязки
# def create_consume_description(region, db_dict):
#
# # создание описания привязки
# def create_equip_description(region, db_dict):

# создание описания привязки
def create_itemmove(region, itemmove):
    if region == 'ropru':
        if itemmove == '11111111': return '\t\t\t\"^ff0000Привязано к персонажу.^000000\",\n'
        elif itemmove == '11011111': return '\t\t\t\"^ff0000Привязано к учетной записи.^000000\",\n'
        else: return ''
    else:
        if itemmove == '11111111': return '\t\t\t\"^ff0000Character Bound.^000000\",\n'
        elif itemmove == '11011111': return '\t\t\t\"^ff0000Account Bound.^000000\",\n'
        else: return ''

# создание описания квалификации карт
def create_card_loca(region, db_dict):
    if region == 'ropru':
        if db_dict['compositionType'] == '1': return '\t\t\t\"Квалификация: ^777777Оружие^000000\",\n'
        else: return '\t\t\t\"Квалификация: ^777777%s^000000\",\n' % (db_dict['compositionPos'])
    else:
        if db_dict['compositionType'] == '1': return '\t\t\t\"Slot: ^777777Weapon^000000\",\n'
        else: return '\t\t\t\"Slot: ^777777%s^000000\",\n' % (db_dict['compositionPos'])


# создание описания защиты брони
def create_def(region, db_dict):
    if region == 'ropru':
        if db_dict['MDEF'] != '0':
            if db_dict['DEF'] == '0': return '\t\t\t\"Маг.защита: ^777777%s^000000\",\n' % (db_dict['MDEF'])
            else:
                if len(db_dict['DEF']+db_dict['MDEF']) > 4:
                    return '\t\t\t\"Защита: ^777777%s^000000 Маг.защита: ^777777%s^000000\",\n' % (db_dict['DEF'], db_dict['MDEF'])
                else:
                    return '\t\t\t\"Защита: ^777777%s^000000 Маг.защ.: ^777777%s^000000\",\n' % (db_dict['DEF'], db_dict['MDEF'])
        else: return '\t\t\t\"Защита: ^777777%s^000000\",\n' % (db_dict['DEF'])
    else:
        if db_dict['MDEF'] != '0':
            if db_dict['DEF'] == '0': return '\t\t\t\"MDEF: ^777777%s^000000\",\n' % (db_dict['MDEF'])
            else:
                return '\t\t\t\"DEF: ^777777%s^000000 MDEF: ^777777%s^000000\",\n' % (db_dict['DEF'], db_dict['MDEF'])
        else: return '\t\t\t\"DEF: ^777777%s^000000\",\n' % (db_dict['DEF'])


# создание описания атаки оружия
def create_atk(region, db_dict):
    if region == 'ropru':
        if db_dict.get('MATK') is not None and db_dict.get('MATK') != '0':
            if db_dict['ATK'] == '0':
                return '\t\t\t\"Маг.атака: ^777777%s^000000\",\n' % (db_dict['MATK'])
            else:
                return '\t\t\t\"Атака: ^777777%s^000000 Маг.атака: ^777777%s^000000\",\n' % (db_dict['ATK'], db_dict['MATK'])
        else:
            return '\t\t\t\"Атака: ^777777%s^000000\",\n' % (db_dict['ATK'])
    else:
        if db_dict.get('MATK') is not None and db_dict.get('MATK') != '0':
            if db_dict['ATK'] == '0':
                return '\t\t\t\"MATK: ^777777%s^000000\",\n' % (db_dict['MATK'])
            else:
                return '\t\t\t\"ATK: ^777777%s^000000 MATK: ^777777%s^000000\",\n' % (db_dict['ATK'], db_dict['MATK'])
        else:
            return '\t\t\t\"ATK: ^777777%s^000000\",\n' % (db_dict['ATK'])


# создание описания веса
def create_weight(region, db_dict):
    if region == 'ropru':
        if int(db_dict['WEIGHT']) % 10 == 0:
            return '\t\t\t\"Вес: ^777777%s^000000\",\n' % (int(db_dict['WEIGHT'])//10)
        else:
            float_weight = str(int(db_dict['WEIGHT'])/10).replace('.', ',')
            return '\t\t\t\"Вес: ^777777%s^000000\",\n' % (float_weight)
    else:
        if int(db_dict['WEIGHT']) % 10 == 0:
            return '\t\t\t\"Weight: ^777777%s^000000\",\n' % (int(db_dict['WEIGHT'])//10)
        else:
            float_weight = str(int(db_dict['WEIGHT'])/10).replace('.', ',')
            return '\t\t\t\"Weight: ^777777%s^000000\",\n' % (float_weight)


# создание описания для патронов
def ammo(region, db_dict, itemmove):
    description = ''
    if itemmove is not None: description += create_itemmove(region, itemmove)
    # description += create_artistic(db_dict['ID'])
    if region == 'ropru':
        description += '\t\t\t\"Класс: ^777777Боеприпасы^000000\",\n'
        description += '\t\t\t\"Атака: ^777777%s^000000\",\n' % (db_dict['ATK'])
        description += '\t\t\t\"Элемент: ^777777%s^000000\",\n' % (db_dict['PROPERTY'])
        description += create_weight(region, db_dict)
    else:
        description += '\t\t\t\"Class: ^777777Bullet^000000\",\n'
        description += '\t\t\t\"ATK: ^777777%s^000000\",\n' % (db_dict['ATK'])
        description += '\t\t\t\"Property: ^777777%s^000000\",\n' % (db_dict['PROPERTY'])
        description += create_weight(region, db_dict)

    iteminfo = '\t[%s] = {\n' % (db_dict['ID'])
    iteminfo += '\t\tunidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tunidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tunidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tslotCount = 0,\n'
    iteminfo += '\t\tClassNum = 0\n' + '\t},\n'

    return iteminfo

# создание описания для стрел
def arrow(region, db_dict, itemmove):
    description = ''
    if itemmove is not None: description += create_itemmove(region, itemmove)
    # description += create_artistic(db_dict['ID'])
    if region == 'ropru':
        description += '\t\t\t\"Класс: ^777777Стрела^000000\",\n'
        description += '\t\t\t\"Атака: ^777777%s^000000\",\n' % (db_dict['ATK'])
        description += '\t\t\t\"Элемент: ^777777%s^000000\",\n' % (db_dict['PROPERTY'])
        description += create_weight(region, db_dict)
    else:
        description += '\t\t\t\"Class: ^777777Стрела^000000\",\n'
        description += '\t\t\t\"ATK: ^777777%s^000000\",\n' % (db_dict['ATK'])
        description += '\t\t\t\"Property: ^777777%s^000000\",\n' % (db_dict['PROPERTY'])
        description += create_weight(region, db_dict)

    iteminfo = '\t[%s] = {\n' % (db_dict['ID'])
    iteminfo += '\t\tunidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tunidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tunidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tslotCount = 0,\n'
    iteminfo += '\t\tClassNum = 0\n' + '\t},\n'
    return iteminfo

# создание описания для карт
def card(region, db_dict, itemmove):
    # if db_dict['compositionType'] == 2: return enchant(db_fict, itemmove)
    description = ''
    if itemmove is not None: description += create_itemmove(region, itemmove)
    # description += create_artistic(db_dict['ID'])
    # description += create_special(db_dict)
    if region == 'ropru':
        description += '\t\t\t\"Класс: ^777777Карта^000000\",\n'
        description += create_card_loca(region, db_dict)
        description += '\t\t\t\"Элемент: ^777777%s^000000\",\n' % (db_dict['PROPERTY'])
        description += create_weight(region, db_dict)
    else:
        description += '\t\t\t\"Class: ^777777Карта^000000\",\n'
        description += create_card_loca(region, db_dict)
        description += '\t\t\t\"Property: ^777777%s^000000\",\n' % (db_dict['PROPERTY'])
        description += create_weight(region, db_dict)

    iteminfo = '\t[%s] = {\n' % (db_dict['ID'])
    iteminfo += '\t\tunidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tunidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tunidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tslotCount = 0,\n'
    iteminfo += '\t\tClassNum = 0\n' + '\t},\n'
    return iteminfo

# создание описания для других предметов
def event(region, db_dict, itemmove):
    description = ''
    if itemmove is not None: description += create_itemmove(region, itemmove)
    # description += create_artistic(db_dict['ID'])
    description += create_weight(region, db_dict)

    iteminfo = '\t[%s] = {\n' % (db_dict['ID'])
    iteminfo += '\t\tunidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tunidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tunidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tslotCount = 0,\n'
    iteminfo += '\t\tClassNum = 0\n' + '\t},\n'
    return iteminfo

# создание описания для ядер
def cannonball(region, db_dict, itemmove):
    description = ''
    if itemmove is not None: description += create_itemmove(region, itemmove)
    # description += create_artistic(db_dict['ID'])
    if region == 'ropru':
        description += '\t\t\t\"Класс: ^777777Ядро^000000\",\n'
        description += '\t\t\t\"Атака: ^777777%s^000000\",\n' % (db_dict['ATK'])
        description += '\t\t\t\"Элемент: ^777777%s^000000\",\n' % (db_dict['PROPERTY'])
        description += create_weight(region, db_dict)
    else:
        description += '\t\t\t\"Class: ^777777Ядро^000000\",\n'
        description += '\t\t\t\"ATK: ^777777%s^000000\",\n' % (db_dict['ATK'])
        description += '\t\t\t\"Property: ^777777%s^000000\",\n' % (db_dict['PROPERTY'])
        description += create_weight(region, db_dict)

    iteminfo = '\t[%s] = {\n' % (db_dict['ID'])
    iteminfo += '\t\tunidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tunidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tunidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tslotCount = 0,\n'
    iteminfo += '\t\tClassNum = 0\n' + '\t},\n'
    return iteminfo

# создание описания для брони
def armor(region, db_dict, itemmove):
    description = ''
    if itemmove is not None: description += create_itemmove(region, itemmove)
    # description += create_artistic(db_dict['ID'])
    # description += create_special(db_dict)
    if region == 'ropru':
        description += '\t\t\t\"Класс: ^777777%s^000000\",\n' % (db_dict['LOCA'])
        description += create_def(region, db_dict)
        description += create_weight(region, db_dict)
        if int(db_dict['MinLevel']) > 1: description += '\t\t\t\"Требуемый уровень: ^777777%s^000000\",\n' % (db_dict['MinLevel'])
        description += '\t\t\t\"Квалификация: ^777777%s^000000\",\n' % (db_dict['EQUIP'])
    else:
        description += '\t\t\t\"Class: ^777777%s^000000\",\n' % (db_dict['LOCA'])
        description += create_def(region, db_dict)
        description += create_weight(region, db_dict)
        if int(db_dict['MinLevel']) > 1: description += '\t\t\t\"Required Level: ^777777%s^000000\",\n' % (
        db_dict['MinLevel'])
        description += '\t\t\t\"Job: ^777777%s^000000\",\n' % (db_dict['EQUIP'])

    iteminfo = '\t[%s] = {\n' % (db_dict['ID'])
    iteminfo += '\t\tunidentifiedDisplayName = \"%s\",\n' % (db_dict['LOCA'])
    iteminfo += '\t\tunidentifiedResourceName = \"\",\n'
    if region == 'ropru': iteminfo += '\t\tunidentifiedDescriptionName = { \"Неизвестный предмет. Для идентификации используйте ^008080увеличительное стекло^000000.\" },\n'
    else: iteminfo += '\t\tunidentifiedDescriptionName = { \"An unknown item that requires appraisal. It can be identified by using a ^008080Magnifier^000000.\" },\n'
    iteminfo += '\t\tidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tslotCount = %s,\n' % (db_dict['SLOT'])
    iteminfo += '\t\tClassNum = %s,\n' % (db_dict['CLASS'])
    if int(db_dict['LOCA']) >= 1024: iteminfo += '\t\tcostume = true,\n'
    else: iteminfo += '\t\tcostume = false,\n'
    iteminfo += '\t},\n'
    return iteminfo

# создание описания для оружия
def weapon(region, db_dict, itemmove):
    description = ''
    if itemmove is not None: description += create_itemmove(region, itemmove)
    # description += create_artistic(db_dict['ID'])
    # description += create_special(db_dict)
    # weapon_type = create_weapon_type(db_dict)
    if region == 'ropru':
        description += '\t\t\t\"Класс: ^777777%s^000000\",\n' % (db_dict['CLASS'])
        description += '\t\t\t\"Элемент: ^777777%s^000000\",\n' % (db_dict['property'])
        description += create_atk(region, db_dict)
        description += create_weight(region, db_dict)
        description += '\t\t\t\"Уровень оружия: ^777777%s^000000\",\n' % (db_dict['level'])
        if int(db_dict['MinLevel']) > 1: description += '\t\t\t\"Требуемый уровень: ^777777%s^000000\",\n' % (db_dict['MinLevel'])
        description += '\t\t\t\"Квалификация: ^777777%s^000000\",\n' % (db_dict['EQUIP'])
    else:
        description += '\t\t\t\"Class: ^777777%s^000000\",\n' % (db_dict['CLASS'])
        description += '\t\t\t\"Property: ^777777%s^000000\",\n' % (db_dict['property'])
        description += create_atk(region, db_dict)
        description += create_weight(region, db_dict)
        description += '\t\t\t\"Weapon Level: ^777777%s^000000\",\n' % (db_dict['level'])
        if int(db_dict['MinLevel']) > 1: description += '\t\t\t\"Required Level: ^777777%s^000000\",\n' % (db_dict['MinLevel'])
        description += '\t\t\t\"Job: ^777777%s^000000\",\n' % (db_dict['EQUIP'])

    iteminfo = '\t[%s] = {\n' % (db_dict['ID'])
    iteminfo += '\t\tunidentifiedDisplayName = \"%s\",\n' % (db_dict['CLASS'])
    iteminfo += '\t\tunidentifiedResourceName = \"\",\n'
    if region == 'ropru': iteminfo += '\t\tunidentifiedDescriptionName = { \"Неизвестный предмет. Для идентификации используйте ^008080увеличительное стекло^000000.\" },\n'
    else: iteminfo += '\t\tunidentifiedDescriptionName = { \"An unknown item that requires appraisal. It can be identified by using a ^008080Magnifier^000000.\" },\n'
    iteminfo += '\t\tidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tslotCount = %s,\n' % (db_dict['SLOT'])
    iteminfo += '\t\tClassNum = %s,\n' % (db_dict['CLASS'])
    iteminfo += '\t},\n'
    return iteminfo

# создание описания для расходных
def consumable(region, db_dict, itemmove):
    description = ''
    if itemmove is not None: description += create_itemmove(region, itemmove)
    # description += create_artistic(db_dict['ID'])
    # description += create_special(db_dict)
    description += create_weight(region, db_dict)

    iteminfo = '\t[%s] = {\n' % (db_dict['ID'])
    iteminfo += '\t\tunidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tunidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tunidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tslotCount = 0,\n'
    iteminfo += '\t\tClassNum = 0,\n'
    iteminfo += '\t},\n'
    return iteminfo

# создание описания для снарядов
def ThrowWeapon(region, db_dict, itemmove):
    description = ''
    if itemmove is not None: description += create_itemmove(region, itemmove)
    # description += create_artistic(db_dict['ID'])
    # description += create_special(db_dict)
    # weapon_type = create_weapon_type(db_dict)
    if region == 'ropru':
        description += '\t\t\t\"Класс: ^777777Снаряд^000000\",\n'
        description += '\t\t\t\"Элемент: ^777777%s^000000\",\n' % (db_dict['PROPERTY'])
        description += '\t\t\t\"Атака: ^777777%s^000000\",\n' % (db_dict['ATK'])
        description += create_weight(region, db_dict)
        if int(db_dict['MinLevel']) > 1: description += '\t\t\t\"Требуемый уровень: ^777777%s^000000\",\n' % (db_dict['MinLevel'])
        description += '\t\t\t\"Квалификация: ^777777%s^000000\",\n' % (db_dict['EQUIP'])
    else:
        description += '\t\t\t\"Class: ^777777Throwing Weapon^000000\",\n'
        description += '\t\t\t\"Property: ^777777%s^000000\",\n' % (db_dict['PROPERTY'])
        description += '\t\t\t\"ATK: ^777777%s^000000\",\n' % (db_dict['ATK'])
        description += create_weight(region, db_dict)
        if int(db_dict['MinLevel']) > 1: description += '\t\t\t\"Required Level: ^777777%s^000000\",\n' % (
        db_dict['MinLevel'])
        description += '\t\t\t\"Job: ^777777%s^000000\",\n' % (db_dict['EQUIP'])

    iteminfo = '\t[%s] = {\n' % (db_dict['ID'])
    iteminfo += '\t\tunidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tunidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tunidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tslotCount = 0,\n'
    iteminfo += '\t\tClassNum = 0,\n'
    iteminfo += '\t},\n'
    return iteminfo

# создание описания для боксов
def CashPointItem(region, db_dict, itemmove):
    description = ''
    if itemmove is not None: description += create_itemmove(region, itemmove)
    # description += create_artistic(db_dict['ID'])
    # description += create_special(db_dict)
    description += create_weight(region, db_dict)

    iteminfo = '\t[%s] = {\n' % (db_dict['ID'])
    iteminfo += '\t\tunidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tunidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tunidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tidentifiedDisplayName = \"%s\",\n' % (db_dict['NAME'])
    iteminfo += '\t\tidentifiedResourceName = \"\",\n'
    iteminfo += '\t\tidentifiedDescriptionName = {\n'
    iteminfo += description + '\t\t},\n'
    iteminfo += '\t\tslotCount = 0,\n'
    iteminfo += '\t\tClassNum = 0,\n'
    iteminfo += '\t},\n'
    return iteminfo

# # создание описания для энчантов
# def enchant(db_dict, itemmove):
# # создание описания для петов
# def pet(db_dict, itemmove):

def create(region = '', ids = ''):
    create_dicts()
    if ids == '':
        print('Введите список dbname-ов или ID (Enter нужно нажать два раза)')
        ids = list(iter(input, ""))
    if region == '': region = input('Введите регион (ropru/ropeu): ')
    text = ''
    for id in ids:
        item_text = create_one(region, id)
        if item_text is not None: text += item_text
    return text

if __name__ == '__main__': create()

