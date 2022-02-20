import Ragnarok.module.google as google
import Ragnarok.module.files as files
import Ragnarok.module.korean_doc as korean_doc
import Ragnarok.module.update_files as update_files
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
silvervine_except = ['Cargo_Free_Ticket',
                     'Warp_Free_Ticket',
                     'Invitation_Ticket',
                     'Silvervine_Fruit_Box4',
                     'Silvervine_Fruit_Box10',
                     'Silvervine_Fruit_Box40']

# === получить словарь шопа из листа google-документа ===
def create_shop_list(region):
    # === создание словаря {категория : [(предмет, цена), (предмет, цена)],  ...} ===
    url = files.get_url(region + '_shop')
    if region == 'ropru': table = google.get_columns(url, 'LIST', 2, 2, 3, 4, 9, 9, 5)
    elif region == 'ropeu': table = google.get_columns(url, 'LIST', 2, 2, 3, 4, 10, 10, 5)
    elif region == 'roeu': table = google.get_columns(url, 'LIST_NEW', 2, 2, 3, 4, 10, 11, 5)
    else: raise ValueError('Проверьте регион' + region)
    items_count = len(table[0]) # количество позиций
    shop_list = list()
    for row in range(items_count):
        category = table[0][row]
        item_id = table[1][row]
        item_dbname = table[2][row]
        item_price = table[3][row]
        item_silvervine = table[4][row]
        item_name = table[5][row]
        item = (category, item_id, item_dbname, item_price, item_silvervine, item_name)
        shop_list.append(item)
    return shop_list

# === получить список лакибокса из листа google-документа ===
def create_luckybox_list(region):
    url = files.get_url(region + '_luckybox')
    table = google.get_columns(url, 1, 1, 1, 2, 4, 5, 9, 10, 14)
    # === создание списка предметов [(...), (...) ...] ===
    items_count = len(table[0]) # количество позиций
    luckybox_list = list()
    for row in range(items_count):
        if table[0][row].isdigit(): item_id = table[0][row] # ID только числовое
        elif table[0][row] == '' and table[1][row] == '': break
        else: raise ValueError('ID в строке {} не числовой!'.format(row+1))
        item_dbname = table[1][row]
        item_qty = table[2][row]
        item_chance = table[3][row]
        item_move = table[4][row]
        item_special = table[5][row]
        item_broadcast = table[6][row]
        item = (item_id, item_dbname, item_qty, item_chance, item_move, item_special, item_broadcast)
        luckybox_list.append(item)
    return luckybox_list

# === получение реальных категорий в коде ===
def get_shop_type(region):
    if region == 'ropru': shop_type = ropru_shop_type
    elif region == 'ropeu': shop_type = ropeu_shop_type
    elif region == 'roeu': shop_type = roeu_shop_type
    else: raise ValueError('Проверьте регион' + region)
    return shop_type

# === создание шопа из гугл-таблицы ===
def create_shop(region):
    shop_list = create_shop_list(region)
    shop_type = get_shop_type(region)
    shop_text = fill_shop(shop_list, shop_type)
    shop_dict = {'SimpleCashShopScript.lua' : shop_text}
    if region == 'roeu':
        silvervine_text = fill_silvervine(shop_list)
        shop_dict['SilvervineExchange.sc'] = silvervine_text
    return shop_dict

# === создание текста скрипта шопа ===
def fill_shop(shop_list, shop_type):
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
    category = ''
    for item in shop_list:
        if category != item[0]:
            shop_offers += '\n'
            category = item[0]
        item_dbname = item[2]
        item_price = item[3]
        shop_offers += '\t{{t_shop_type.{},\"{}\", {}}},\n'.format(shop_type[category], item_dbname, item_price)
    shop_text = shop_begin + shop_offers + shop_end
    return shop_text

# === создание текста скрипта обменника сильвервинов ===
def fill_silvervine(shop_list):
    silvervine_list = [[]]
    category = 'Hot'
    category_number = 0
    for item in shop_list:
        if category != item[0]:
            category_number += 1
            category = item[0]
            silvervine_list.append([])
        if item[2] not in silvervine_except: silvervine_list[category_number].append(item)
    silvervine_begin = """//================ Silvervine Exchanger ====================//
// alpha 07.08.2018 ruRO
// beta  08.08.2018
// OBT   14.08.2018
//		 24.08.2018
//			- menu adjusted to Kafra Shop
//			- new items added
//		 22.09.2018
//			- new items added
//			- discount on some products
//=============================================================//
//
//	GetInventoryRemainCount	{ GetInventoryRemainCount DB number Item amount }
// 	Return value:
// 	0 Error
// 	1 Available
// 	2 Exceed Quantity
// 	3 Exceed Weight
//
//==============================================================//

npc "prontera" "Silvervine trader#pcEx" 4_M_OLIVER 146 102 5 0 0
OnClick:
    //======= Weight and item count check =========//
    var itemCountLimitExceeded = GetInventoryRemainCount 1301 1
    if (itemCountLimitExceeded == 2)
        dialog " - Hold on! -"
        dialog "You have too many items "
        dialog "in the inventory."
        dialog "Free up the space and"
        dialog "try again."
        close
        return
    endif
    if (itemCountLimitExceeded == 3)
        dialog "- Hold on! -"
        dialog "You seem to have overweighted "
        dialog "inventory. Get rid of some "
        dialog "stuff and come back again."
        close
        return
    endif
    //=============================================//

    dialog "[Silvervine trader]"
    dialog "Hello there! I can trade marvelous items for some Silvervines."
    wait
    dialog "[Silvervine trader]"
    dialog "Would you like to check the catalog?"
    dialog "I'm sure you'll find something useful!"
    dialog "Also I can stack some items in the same inventory slot!"
    wait
    choose menu "No, thanks " "Yes! " "I want to stack some items. "
        case 1
            dialog "[Silvervine trader]"
            dialog "Come back any time!"
            close
            return
        break

        case 2
            dialog "[Silvervine trader]"
            dialog "I'm sure you'll be amazed."
            wait
            while(1)
                while(1)
                    choose menu "Hot " "New " "Prime " "Buff " "Rental" "Gear " "Costume " "Other " "Leave "
"""
    silvervine_offers = ''
    silvervine_end = """						case 9
                            dialog "[Silvervine trader]"
                            dialog "Come back again!"
                            close
                            return
                        break
                    endchoose
                endwhile

                dialog "[Silvervine trader]"
                dialog "The item you chose is " + chosenItemStr + "."
                dialog "It will cost " + chosenItemPrice + " Silvervine."
                dialog "Confirm purchase?"
                wait
                choose menu "No, thanks " "Yes. "
                    case 1
                        dialog "[Silvervine trader]"
                        dialog "Maybe you chould check some other items?"
                        wait
                    break

                    case 2
                        var poringCoinsAmount = v[Silvervine]
                        if (poringCoinsAmount >= chosenItemPrice)
                            itemCountLimitExceeded = GetInventoryRemainCount chosenItemDB 1
                            if (itemCountLimitExceeded == 2)
                                dialog " - Hold on! -"
                                dialog "You have too many items "
                                dialog "in the inventory."
                                dialog "Free up the space and"
                                dialog "try again."
                                close
                                return
                            endif
                            if (itemCountLimitExceeded == 3)
                                dialog "- Hold on! -"
                                dialog "You seem to have overweighted "
                                dialog "inventory. Get rid of some "
                                dialog "stuff and come back again."
                                close
                                return
                            endif
                            dropitem Silvervine chosenItemPrice
                            getitem chosenItemDB 1
                            dialog "[Silvervine trader]"
                            dialog "Nice choice!"
                            dialog "Continue shopping?"
                            wait
                            choose menu "Yes " "No "
                                case 1
                                    dialog "[Silvervine trader]"
                                    dialog "I'm sure you'll find something good. "
                                    wait
                                break

                                case 2
                                    dialog "[Silvervine trader]"
                                    dialog "Come back any time! "
                                    close
                                    return
                                break
                            endchoose
                        else
                            dialog "[Silvervine trader]"
                            dialog "I'm sorry, but you don't have enough Silvervines."
                            exitwhile
                            close
                            return
                        endif
                    break
                endchoose
            endwhile
        break

        case 3
            MergeItem
            dialog "[Silvervine trader]"
            dialog "Stacking magic at your service!"
            close
            return
        break
    endchoose
return"""
    for category_number in range(0, 8):
        silvervine_offers += '\t\t\t\t\t\tcase {}\n'.format(category_number + 1)
        for i in range(len(silvervine_list[category_number])):
            silvervine_offers += '\t\t\t\t\t\t\tvar itemStr{} = \"{}\"\n'.format(i+1, silvervine_list[category_number][i][5])
            silvervine_offers += '\t\t\t\t\t\t\tvar item{} = {}\n'.format(i+1, silvervine_list[category_number][i][2])
            silvervine_offers += '\t\t\t\t\t\t\tvar itemPrice{} = {}\n\n'.format(i+1, silvervine_list[category_number][i][4])
        silvervine_offers += '\t\t\t\t\t\t\tchoose menu \"...\" '.format(category_number)
        for i in range(len(silvervine_list[category_number])):
            silvervine_offers += 'itemStr' + str(i+1) + ' '
        silvervine_offers += '\n\t\t\t\t\t\t\t\tcase 1\n'
        silvervine_offers += '\t\t\t\t\t\t\t\tbreak\n'
        for i in range(len(silvervine_list[category_number])):
            silvervine_offers += '\n\t\t\t\t\t\t\t\tcase {}\n'.format(i+2)
            silvervine_offers += '\t\t\t\t\t\t\t\t\tvar chosenItemStr = itemStr{}\n'.format(i+1)
            silvervine_offers += '\t\t\t\t\t\t\t\t\tvar chosenItemDB = item{}\n'.format(i+1)
            silvervine_offers += '\t\t\t\t\t\t\t\t\tvar chosenItemPrice = itemPrice{}\n'.format(i+1)
            silvervine_offers += '\t\t\t\t\t\t\t\t\texitwhile\n'
            silvervine_offers += '\t\t\t\t\t\t\t\tbreak\n'
        silvervine_offers += '\t\t\t\t\t\t\tendchoose\n'
        silvervine_offers += '\t\t\t\t\t\tbreak\n'
    silvervine_text = silvervine_begin + silvervine_offers + silvervine_end
    return silvervine_text

# === создание словаря лакибокса из таблицы и Excel-таблицы ===
def create_luckybox(region, xlsname='korean_doc.xlsx'):
    luckybox_list = create_luckybox_list(region)
    luckybox_dict = dict()
    luckybox_dict.update(create_packageitem(luckybox_list))
    importantitem_list = [(item[0], item[1]) for item in luckybox_list]
    luckybox_dict.update(create_importantitem(importantitem_list))
    cashitemlist_list = [item[1] for item in luckybox_list]
    luckybox_dict.update(create_cashitemlist(cashitemlist_list))
    luckybox_dict.update(create_itemmoveinfo(luckybox_list, region))
    luckybox_dict.update(korean_doc.create_files(region, xlsname, True))
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
        item_chance = int(item[3].replace(',', '').replace('%', ''))
        if 'broadcast' in item[6].lower(): item_broadcast = 'true'
        else: item_broadcast = 'false'
        new_line = '\t{ name = [[natural_random]], item = [[%s]], cnt = %s, hour = 0, onair = %s, guid = false, probability = %s };\n'
        packageitem_lines += new_line % (item_name, item_qty, item_broadcast, item_chance)
    packageitem_text = packageitem_begin + packageitem_lines + packageitem_end
    packageitem_dict = {'PackageItem.lua': packageitem_text}
    return packageitem_dict

# === создание текста Packageitem из списка [(id, dbname),(id, dbname)...] ===
def create_importantitem(importantitem_list):
    importantitem_text = ''
    for item in importantitem_list:
        item_id = item[0]
        item_name = item[1]
        importantitem_text += '{}\t{}\n'.format(item_id, item_name)
    importantitem_dict = {'Importantitem.txt': importantitem_text}
    return importantitem_dict

# === создание текста CashItemList из списка [dbname, dbname...] ===
def create_cashitemlist(cashitemlist_list):
    cashitemlist_text = ''
    for item_name in cashitemlist_list:
        cashitemlist_text += '\"{}\"\n'.format(item_name)
    cashitemlist_dict = {'CashItemList.txt': cashitemlist_text}
    return cashitemlist_dict

# === создание текста Packageitem из листа лакибокса ===
def create_itemmoveinfo(luckybox_list, region):
    itemmoveinfo_text = ''
    for item in luckybox_list:
        item_id = item[0]
        item_name = item[1]
        if item[4].isspace() or item[4] == '' or '0000000' in item[4]: continue
        elif '1000111' in item[4]:
            if region == 'roeu': item_move = '1\t0\t0\t0\t1\t1\t1'
            else: item_move = '1\t0\t0\t0\t1\t1\t1\t0'
        elif '1101111' in item[4] or 'к акку' in item[4].lower():
            if region == 'roeu': item_move = '1\t1\t0\t1\t1\t1\t1'
            else: item_move = '1\t1\t0\t1\t1\t1\t1\t1'
        elif '1111111' in item[4]:
            if region == 'roeu': item_move = '1\t1\t1\t1\t1\t1\t1'
            else: item_move = '1\t1\t0\t1\t1\t1\t1\t1'
        else: raise ValueError('Проверьте передаваемость предметов')
        itemmoveinfo_text += '{}\t{}\t//{}\n'.format(item_id, item_move, item_name)
    if region == 'roeu': itemmoveinfo_dict = {'ItemMoveInfoV4.txt': itemmoveinfo_text}
    else: itemmoveinfo_dict = {'ItemMoveInfoV5.txt': itemmoveinfo_text}
    return itemmoveinfo_dict

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
