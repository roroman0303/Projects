import re

codirovka = 'EUC-KR'
with open("D:/RO/rot/zone/npcdata/monster/mob.sc", encoding=codirovka, errors='ignore') as file:
    lines = file.read().splitlines()

with open("maps.txt", encoding='utf-8', errors='ignore') as file:
    maps = file.read().splitlines()
    maps = [map.strip() for map in maps]

pattern = r'^\s*\S+\s+(\S+)\s+\S+\s+\S+\s+\S+\s+\S+\s+(\S+)\s+(\S+)'
mob_lines = list()
for map in maps:
    max_count = 0
    for line in lines:
        if line.startswith('putmob') and '\"'+map+'\"' in line:
            count = re.search(pattern, line).group(2)
            mob = re.search(pattern, line).group(3)
            if max_count < int(count):
                max_count = int(count)
                max_mob = map+'\t'+mob
    mob_lines.append(max_mob)


with open("max_mobs.txt", "w", encoding=codirovka) as file:
    for line in mob_lines:
        line = line.replace("  ", " ")
        file.write(line + '\n')