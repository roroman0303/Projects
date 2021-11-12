import Ragnarok.module.files as files
import Ragnarok.module.db as db
ids = files.open_lines('ids.txt')
id_dbname = list()
for line in ids:
    table, dict = db.find_table('ropru', int(line))
    print(line)
    try:
        new = line +'\t'+ dict['NAME']
        id_dbname.append(new)
    except:
        new = line
        id_dbname.append(new)
files.write_lines(id_dbname, 'ids_dbnames.txt')
