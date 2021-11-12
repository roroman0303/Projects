import re

files = ['Jtunheimr_link.sc', 'manuk_link.sc', 'splendide_link.sc']

codirovka = 'utf-8'

lines = list()
for filename in files:
    with open(filename, encoding=codirovka, errors='ignore') as file:
        temp_lines = file.read().splitlines()
        lines = lines + temp_lines

warps = list()

for line in lines:
    if 'warp' in line:
        loca_from = line.strip().split('\"')[1]
        loca_from_x = re.split(r'\s', line)[3]
        loca_from_y = re.split(r'\s', line)[4]
        warps.append(loca_from+'\t'+loca_from_x+'\t'+loca_from_y+'\t')
    if 'moveto' in line:
        loca_to = line.strip().split('\"')[1]
        loca_to_x = re.split(r'\s', line.split('\"')[2].strip())[0]
        loca_to_y = re.split(r'\s', line.split('\"')[2].strip())[1]
        warps.append(loca_to + '\t' + loca_to_x + '\t' + loca_to_y + '\n')

with open("warps.txt", "w", encoding=codirovka) as file:
    for line in warps:
        file.write(line)