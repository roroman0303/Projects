import re

codirovka = 'Windows-1251'
with open("mobdef.sc", encoding=codirovka) as file:
    old_mobs = file.read().splitlines()

with open("champions.txt", encoding='utf-8') as file:
    champions = file.read().splitlines()

new_mobs = list()
new_mobs.append("\n//=========[CHAMPIONS]=========\n")

for line in champions:
    champ_dbname = line.split('\t')[0]
    eng_champ_name = line.split('\t')[1]
    champ_name = line.split('\t')[2]
    old_dbname = line.split('\t')[3]
    ru_name = line.split('\t')[4]
    for line2 in old_mobs:
        if 'mob' in line2 and old_dbname == line2.split()[1]:
            new_line = line2.replace(old_dbname, champ_dbname)
            name = new_line.split("\"")[1]
            if len(champ_name) > 23:
                new_line = new_line.replace(name, champ_name + " (БОЛЬШЕ 23)")
            else:
                new_line = new_line.replace(name, champ_name+" ")
            new_mobs.append(new_line)
            new_mobs.append('return\n')
new_mobs = old_mobs + new_mobs

with open("new_mobdef.sc", "w") as file:
    for line in new_mobs:
        line = line.replace("  ", " ")
        file.write(line + '\n')


