import re

codirovka = 'UTF-8'
with open("mobdef_roeu.sc", encoding=codirovka, errors='ignore') as file:
    roeu_mobs = file.read().splitlines()

with open("mobdef_roteu.sc", encoding=codirovka, errors='ignore') as file:
    roteu_mobs = file.read().splitlines()
new_roteu_mobs = list()

for line in roteu_mobs:
    if 'mob' in line:
        name = re.split('\s+', line)[1]
        for line2 in roeu_mobs:
            if 'mob' in line2:
                name2 = re.split('\s+', line2)[1]
                if name == name2:
                    string = line.split("\"")[1]
                    string2 = line2.split("\"")[1]
                    line = line.replace(string, string2)
    new_roteu_mobs.append(line)

with open("new_mobdef.sc", "w", errors='ignore') as file:
    for line3 in new_roteu_mobs:
        line3 = line3.replace("  ", " ")
        file.write(line3 + '\n')


