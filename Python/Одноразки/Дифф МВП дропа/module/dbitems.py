# таблицы монстров
monster_tables = ['monparameter', 'monmakingitem3', 'MVP']
# таблицы предметов
item_tables = ['ammo', 'armor', 'arrow', 'bothhand', 'bow',
               'cannonball', 'card', 'CashPointItem', 'event',
               'gun', 'heal', 'special', 'ThrowWeapon', 'weapon',
               'armorTMB', 'armorTM', 'armorTB', 'armorMB']
# таблицы брони
armor_tables = ['armor', 'armorTMB', 'armorTM', 'armorTB', 'armorMB']
# таблицы оружия
weapon_tables = ['bow', 'bothhand', 'gun', 'weapon']
# таблицы расходников
consumable_tables = ['special', 'heal']
# все таблицы
all_tables = monster_tables + item_tables
# словари идентичные БД
MVP_dict = {
    'name': '',
    'expPerceent': '',
    'itemName1': '',
    'itemPercent1': '',
    'itemName2': '',
    'itemPercent2': '',
    'itemName3': '',
    'itemPercent3': ''
}
monparameter_dict = {
    'Name': '',
    'aRan': '',
    'LV': '',
    'HP': '',
    'SP': '',
    'str': '',
    'int': '',
    'vit': '',
    'dex': '',
    'agi': '',
    'luk': '',
    'atk1': '',
    'atk2': '',
    'def': '',
    'exp': '',
    'jexp': '',
    'inc': '',
    'as': '',
    'es': '',
    'Mspeed': '',
    'rechargeTime': '',
    'attackedMT': '',
    'attackMT': '',
    'property': '',
    'scale': '',
    'class': '',
    'race': '',
    'mdef': '',
    'attr': ''
}
monmakingitem3_dict = {
    'Name': '',
    'item1': '',
    'percent1': '',
    'optiongroup1': '',
    'item2': '',
    'percent2': '',
    'optiongroup2': '',
    'item3': '',
    'percent3': '',
    'optiongroup3': '',
    'item4': '',
    'percent4': '',
    'optiongroup4': '',
    'item5': '',
    'percent5': '',
    'optiongroup5': '',
    'item6': '',
    'percent6': '',
    'optiongroup6': '',
    'item7': '',
    'percent7': '',
    'optiongroup7': '',
    'item8': '',
    'percent8': '',
    'optiongroup8': ''
}
ammo_dict = {
    'ID': '',
    'NAME': '',
    'ATK': '',
    'PROPERTY': '',
    'PRICE': '',
    'WEIGHT': '',
    'MinLevel': '',
    'MaxLevel': ''
}
armor_dict = {
    'ID': '',
    'NAME': '',
    'DEF': '',
    'SLOT': '',
    'STR': '',
    'INT': '',
    'VIT': '',
    'DEX': '',
    'AGI': '',
    'LUK': '',
    'MHP': '',
    'MSP': '',
    'EFFECT': '',
    'PRICE': '',
    'WEIGHT': '',
    'SEX': '',
    'EQUIP': '',
    'LOCA': '',
    'MDEF': '',
    'CLASS': '',
    'IsRefinable': '',
    'IsDamagable': '',
    'MinLevel': '',
    'MaxLevel': '',
}
arrow_dict = {
    'ID': '',
    'NAME': '',
    'ATK': '',
    'PROPERTY': '',
    'PRICE': '',
    'WEIGHT': '',
    'MinLevel': '',
    'MaxLevel': '',
}
bothhand_dict = {
    'ID': '',
    'NAME': '',
    'ATK': '',
    'MATK': '',
    'AR': '',
    'SLOT': '',
    'STR': '',
    'INT': '',
    'VIT': '',
    'DEX': '',
    'AGI': '',
    'LUK': '',
    'CLASS': '',
    'EFFECT': '',
    'PRICE': '',
    'WEIGHT': '',
    'SEX': '',
    'EQUIP': '',
    'level': '',
    'LOCA': '',
    'property': '',
    'IsRefinable': '',
    'IsDamagable': '',
    'MinLevel': '',
    'MaxLevel': '',
}
bow_dict = {
    'ID': '',
    'NAME': '',
    'ATK': '',
    'AR': '',
    'SLOT': '',
    'STR': '',
    'INT': '',
    'VIT': '',
    'DEX': '',
    'AGI': '',
    'LUK': '',
    'CLASS': '',
    'EFFECT': '',
    'PRICE': '',
    'WEIGHT': '',
    'SEX': '',
    'EQUIP': '',
    'level': '',
    'LOCA': '',
    'property': '',
    'IsRefinable': '',
    'IsDamagable': '',
    'MinLevel': '',
    'MaxLevel': '',
}
cannonball_dict = {
    'ID': '',
    'NAME': '',
    'ATK': '',
    'PROPERTY': '',
    'PRICE': '',
    'WEIGHT': '',
    'MinLevel': '',
    'MaxLevel': '',
}
card_dict = {
    'ID': '',
    'NAME': '',
    'PRICE': '',
    'WEIGHT': '',
    'compositionType': '',
    'compositionPos': '',
    'class': '',
    'property': '',
}
CashPointItem_dict = {
    'ID': '',
    'Name': '',
    'PRICE': '',
    'Weight': '',
    'ChangeItemID': '',
    'Count': '',
    'Ect': '',
}
event_dict = {
    'ID': '',
    'NAME': '',
    'PRICE': '',
    'WEIGHT': '',
}
gun_dict = {
    'ID': '',
    'NAME': '',
    'ATK': '',
    'AR': '',
    'SLOT': '',
    'STR': '',
    'INT': '',
    'VIT': '',
    'DEX': '',
    'AGI': '',
    'LUK': '',
    'CLASS': '',
    'EFFECT': '',
    'PRICE': '',
    'WEIGHT': '',
    'SEX': '',
    'EQUIP': '',
    'level': '',
    'LOCA': '',
    'property': '',
    'IsRefinable': '',
    'IsDamagable': '',
    'MinLevel': '',
    'MaxLevel': '',
}
heal_dict = {
    'ID': '',
    'NAME': '',
    'HPMIN': '',
    'HPMAX': '',
    'SPMIN': '',
    'SPMAX': '',
    'STATUS': '',
    'PRICE': '',
    'WEIGHT': '',
    'ABUSE_GAUGE': '',
    'MinLevel': '',
    'MaxLevel': '',
}
special_dict = {
    'ID': '',
    'NAME': '',
    'EFFECT': '',
    'PRICE': '',
    'WEIGHT': '',
    'MinLevel': '',
    'MaxLevel': '',
}
ThrowWeapon_dict = {
    'ID': '',
    'NAME': '',
    'ATK': '',
    'PROPERTY': '',
    'PRICE': '',
    'WEIGHT': '',
    'EQUIP': '',
    'MinLevel': '',
    'MaxLevel': '',
}
weapon_dict = {
    'ID': '',
    'NAME': '',
    'ATK': '',
    'MATK': '',
    'AR': '',
    'SLOT': '',
    'STR': '',
    'INT': '',
    'VIT': '',
    'DEX': '',
    'AGI': '',
    'LUK': '',
    'CLASS': '',
    'EFFECT': '',
    'PRICE': '',
    'WEIGHT': '',
    'SEX': '',
    'EQUIP': '',
    'level': '',
    'LOCA': '',
    'property': '',
    'IsRefinable': '',
    'IsDamagable': '',
    'MinLevel': '',
    'MaxLevel': '',
}

# получить название первого столбца в БД (ключ)
def get_first_column(table):
    if table in item_tables: return 'ID'
    elif table in monster_tables: return 'Name'
    else:
        print('Таблица не найдена')
        return None

# превращаем строку в словарь {столбец: значение}
def fill_dict(table, row):
    if table == 'ammo':
        temp_dict = ammo_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'ATK': '{}'.format(row[2]),
            'PROPERTY': '{}'.format(row[3]),
            'PRICE': '{}'.format(row[4]),
            'WEIGHT': '{}'.format(row[5]),
            'MinLevel': '{}'.format(row[6]),
            'MaxLevel': '{}'.format(row[7])
        })
    elif table in armor_tables:
        temp_dict = armor_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'DEF': '{}'.format(row[2]),
            'SLOT': '{}'.format(row[3]),
            'STR': '{}'.format(row[4]),
            'INT': '{}'.format(row[5]),
            'VIT': '{}'.format(row[6]),
            'DEX': '{}'.format(row[7]),
            'AGI': '{}'.format(row[8]),
            'LUK': '{}'.format(row[9]),
            'MHP': '{}'.format(row[10]),
            'MSP': '{}'.format(row[11]),
            'EFFECT': '{}'.format(row[12]),
            'PRICE': '{}'.format(row[13]),
            'WEIGHT': '{}'.format(row[14]),
            'SEX': '{}'.format(row[15]),
            'EQUIP': '{}'.format(row[16]),
            'LOCA': '{}'.format(row[17]),
            'MDEF': '{}'.format(row[18]),
            'CLASS': '{}'.format(row[19]),
            'IsRefinable': '{}'.format(row[20]),
            'IsDamagable': '{}'.format(row[21]),
            'MinLevel': '{}'.format(row[22]),
            'MaxLevel': '{}'.format(row[23]),
        })
    elif table == 'arrow':
        temp_dict = arrow_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'ATK': '{}'.format(row[2]),
            'PROPERTY': '{}'.format(row[3]),
            'PRICE': '{}'.format(row[4]),
            'WEIGHT': '{}'.format(row[5]),
            'MinLevel': '{}'.format(row[6]),
            'MaxLevel': '{}'.format(row[7]),
        })
    elif table == 'bothhand':
        temp_dict = bothhand_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'ATK': '{}'.format(row[2]),
            'MATK': '{}'.format(row[3]),
            'AR': '{}'.format(row[4]),
            'SLOT': '{}'.format(row[5]),
            'STR': '{}'.format(row[6]),
            'INT': '{}'.format(row[7]),
            'VIT': '{}'.format(row[8]),
            'DEX': '{}'.format(row[9]),
            'AGI': '{}'.format(row[10]),
            'LUK': '{}'.format(row[11]),
            'CLASS': '{}'.format(row[12]),
            'EFFECT': '{}'.format(row[13]),
            'PRICE': '{}'.format(row[14]),
            'WEIGHT': '{}'.format(row[15]),
            'SEX': '{}'.format(row[16]),
            'EQUIP': '{}'.format(row[17]),
            'level': '{}'.format(row[18]),
            'LOCA': '{}'.format(row[19]),
            'property': '{}'.format(row[20]),
            'IsRefinable': '{}'.format(row[21]),
            'IsDamagable': '{}'.format(row[22]),
            'MinLevel': '{}'.format(row[23]),
            'MaxLevel': '{}'.format(row[24]),
        })
    elif table == 'bow':
        temp_dict = bow_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'ATK': '{}'.format(row[2]),
            'AR': '{}'.format(row[3]),
            'SLOT': '{}'.format(row[4]),
            'STR': '{}'.format(row[5]),
            'INT': '{}'.format(row[6]),
            'VIT': '{}'.format(row[7]),
            'DEX': '{}'.format(row[8]),
            'AGI': '{}'.format(row[9]),
            'LUK': '{}'.format(row[10]),
            'CLASS': '{}'.format(row[11]),
            'EFFECT': '{}'.format(row[12]),
            'PRICE': '{}'.format(row[13]),
            'WEIGHT': '{}'.format(row[14]),
            'SEX': '{}'.format(row[15]),
            'EQUIP': '{}'.format(row[16]),
            'level': '{}'.format(row[17]),
            'LOCA': '{}'.format(row[18]),
            'property': '{}'.format(row[19]),
            'IsRefinable': '{}'.format(row[20]),
            'IsDamagable': '{}'.format(row[21]),
            'MinLevel': '{}'.format(row[22]),
            'MaxLevel': '{}'.format(row[23]),
        })
    elif table == 'cannonball':
        temp_dict = cannonball_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'ATK': '{}'.format(row[2]),
            'PROPERTY': '{}'.format(row[3]),
            'PRICE': '{}'.format(row[4]),
            'WEIGHT': '{}'.format(row[5]),
            'MinLevel': '{}'.format(row[6]),
            'MaxLevel': '{}'.format(row[7]),
        })
    elif table == 'card':
        temp_dict = card_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'PRICE': '{}'.format(row[2]),
            'WEIGHT': '{}'.format(row[3]),
            'compositionType': '{}'.format(row[4]),
            'compositionPos': '{}'.format(row[5]),
            'class': '{}'.format(row[6]),
            'property': '{}'.format(row[7]),
        })
    elif table == 'CashPointItem':
        temp_dict = CashPointItem_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'Name': '{}'.format(row[1]),
            'PRICE': '{}'.format(row[2]),
            'Weight': '{}'.format(row[3]),
            'ChangeItemID': '{}'.format(row[4]),
            'Count': '{}'.format(row[5]),
            'Ect': '{}'.format(row[6]),
        })
    elif table == 'event':
        temp_dict = event_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'PRICE': '{}'.format(row[2]),
            'WEIGHT': '{}'.format(row[3]),
        })
    elif table == 'gun':
        temp_dict = gun_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'ATK': '{}'.format(row[2]),
            'AR': '{}'.format(row[3]),
            'SLOT': '{}'.format(row[4]),
            'STR': '{}'.format(row[5]),
            'INT': '{}'.format(row[6]),
            'VIT': '{}'.format(row[7]),
            'DEX': '{}'.format(row[8]),
            'AGI': '{}'.format(row[9]),
            'LUK': '{}'.format(row[10]),
            'CLASS': '{}'.format(row[11]),
            'EFFECT': '{}'.format(row[12]),
            'PRICE': '{}'.format(row[13]),
            'WEIGHT': '{}'.format(row[14]),
            'SEX': '{}'.format(row[15]),
            'EQUIP': '{}'.format(row[16]),
            'level': '{}'.format(row[17]),
            'LOCA': '{}'.format(row[18]),
            'property': '{}'.format(row[19]),
            'IsRefinable': '{}'.format(row[20]),
            'IsDamagable': '{}'.format(row[21]),
            'MinLevel': '{}'.format(row[22]),
            'MaxLevel': '{}'.format(row[23]),
        })
    elif table == 'heal':
        temp_dict = heal_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'HPMIN': '{}'.format(row[2]),
            'HPMAX': '{}'.format(row[3]),
            'SPMIN': '{}'.format(row[4]),
            'SPMAX': '{}'.format(row[5]),
            'STATUS': '{}'.format(row[6]),
            'PRICE': '{}'.format(row[7]),
            'WEIGHT': '{}'.format(row[8]),
            'ABUSE_GAUGE': '{}'.format(row[9]),
            'MinLevel': '{}'.format(row[10]),
            'MaxLevel': '{}'.format(row[11]),
        })
    elif table == 'special':
        temp_dict = special_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'EFFECT': '{}'.format(row[2]),
            'PRICE': '{}'.format(row[3]),
            'WEIGHT': '{}'.format(row[4]),
            'MinLevel': '{}'.format(row[5]),
            'MaxLevel': '{}'.format(row[6]),
        })
    elif table == 'ThrowWeapon':
        temp_dict = ThrowWeapon_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'ATK': '{}'.format(row[2]),
            'PROPERTY': '{}'.format(row[3]),
            'PRICE': '{}'.format(row[4]),
            'WEIGHT': '{}'.format(row[5]),
            'EQUIP': '{}'.format(row[6]),
            'MinLevel': '{}'.format(row[7]),
            'MaxLevel': '{}'.format(row[8]),
        })
    elif table == 'weapon':
        temp_dict = weapon_dict.copy()
        temp_dict.update({
            'ID': '{}'.format(row[0]),
            'NAME': '{}'.format(row[1]),
            'ATK': '{}'.format(row[2]),
            'MATK': '{}'.format(row[3]),
            'AR': '{}'.format(row[4]),
            'SLOT': '{}'.format(row[5]),
            'STR': '{}'.format(row[6]),
            'INT': '{}'.format(row[7]),
            'VIT': '{}'.format(row[8]),
            'DEX': '{}'.format(row[9]),
            'AGI': '{}'.format(row[10]),
            'LUK': '{}'.format(row[11]),
            'CLASS': '{}'.format(row[12]),
            'EFFECT': '{}'.format(row[13]),
            'PRICE': '{}'.format(row[14]),
            'WEIGHT': '{}'.format(row[15]),
            'SEX': '{}'.format(row[16]),
            'EQUIP': '{}'.format(row[17]),
            'level': '{}'.format(row[18]),
            'LOCA': '{}'.format(row[19]),
            'property': '{}'.format(row[20]),
            'IsRefinable': '{}'.format(row[21]),
            'IsDamagable': '{}'.format(row[22]),
            'MinLevel': '{}'.format(row[23]),
            'MaxLevel': '{}'.format(row[24]),
        })
    elif table == 'monparameter':
        temp_dict = monparameter_dict.copy()
        temp_dict.update({
            'Name': '{}'.format(row[0]),
            'aRan': '{}'.format(row[1]),
            'LV': '{}'.format(row[2]),
            'HP': '{}'.format(row[3]),
            'SP': '{}'.format(row[4]),
            'str': '{}'.format(row[5]),
            'int': '{}'.format(row[6]),
            'vit': '{}'.format(row[7]),
            'dex': '{}'.format(row[8]),
            'agi': '{}'.format(row[9]),
            'luk': '{}'.format(row[10]),
            'atk1': '{}'.format(row[11]),
            'atk2': '{}'.format(row[12]),
            'def': '{}'.format(row[13]),
            'exp': '{}'.format(row[14]),
            'jexp': '{}'.format(row[15]),
            'inc': '{}'.format(row[16]),
            'as': '{}'.format(row[17]),
            'es': '{}'.format(row[18]),
            'Mspeed': '{}'.format(row[19]),
            'rechargeTime': '{}'.format(row[20]),
            'attackedMT': '{}'.format(row[21]),
            'attackMT': '{}'.format(row[22]),
            'property': '{}'.format(row[23]),
            'scale': '{}'.format(row[24]),
            'class': '{}'.format(row[25]),
            'race': '{}'.format(row[26]),
            'mdef': '{}'.format(row[27]),
            'attr': '{}'.format(row[28])
        })
    elif table == 'monmakingitem3':
        temp_dict = monmakingitem3_dict.copy()
        temp_dict.update({
            'Name': '{}'.format(row[0]),
            'item1': '{}'.format(row[1]),
            'percent1': '{}'.format(row[2]),
            'optiongroup1': '{}'.format(row[3]),
            'item2': '{}'.format(row[4]),
            'percent2': '{}'.format(row[5]),
            'optiongroup2': '{}'.format(row[6]),
            'item3': '{}'.format(row[7]),
            'percent3': '{}'.format(row[8]),
            'optiongroup3': '{}'.format(row[9]),
            'item4': '{}'.format(row[10]),
            'percent4': '{}'.format(row[11]),
            'optiongroup4': '{}'.format(row[12]),
            'item5': '{}'.format(row[13]),
            'percent5': '{}'.format(row[14]),
            'optiongroup5': '{}'.format(row[15]),
            'item6': '{}'.format(row[16]),
            'percent6': '{}'.format(row[17]),
            'optiongroup6': '{}'.format(row[18]),
            'item7': '{}'.format(row[19]),
            'percent7': '{}'.format(row[20]),
            'optiongroup7': '{}'.format(row[21]),
            'item8': '{}'.format(row[22]),
            'percent8': '{}'.format(row[23]),
            'optiongroup8': '{}'.format(row[24]),
        })
    elif table == 'MVP':
        temp_dict = MVP_dict.copy()
        temp_dict.update({
            'name': '{}'.format(row[0]),
            'expPerceent': '{}'.format(row[1]),
            'itemName1': '{}'.format(row[2]),
            'itemPercent1': '{}'.format(row[3]),
            'itemName2': '{}'.format(row[4]),
            'itemPercent2': '{}'.format(row[5]),
            'itemName3': '{}'.format(row[6]),
            'itemPercent3': '{}'.format(row[7]),
        })
    return temp_dict
