import Ragnarok.module.find as find
import Ragnarok.module.files as files
import Ragnarok.module.db as db
import Ragnarok.module.dbitems as dbitems

region = 'ropru'
if __name__ == '__main__':
    iteminfo = ''
    print("Введите список днеймов (Enter нажать в конце два раза): ")
    dbnames = list(iter(input, ""))
    for dbname in dbnames:
        _, item_dict = db.find_table(region, dbname, 'NAME')
        iteminfo += find.iteminfo(region, item_dict['ID']) + '\n'
    files.write_text(iteminfo, 'iteminfo.lua', codirovka='Windows-1251')

