import re
import Ragnarok.module.files as files

codirovka = 'utf-8'
lines = files.open_lines('msgstringtable.txt', codirovka=codirovka, errors='ignore')

new_lines = list()
counter = 1
for line in lines:
    if line.replace('#', '').isspace() or len(line.replace('#', '')) == 0:
        line = 'missing_line'+str(counter)+'#'
        counter += 1
    new_lines.append(line)

files.write_lines(new_lines, 'msgstringtable2.txt', codirovka=codirovka)