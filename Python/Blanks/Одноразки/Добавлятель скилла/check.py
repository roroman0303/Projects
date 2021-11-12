import re

codirovka = 'UTF-8'
with open("NpcAddSkillInfo.txt", encoding=codirovka) as file:
    lines = file.read().splitlines()

with open("mvps.txt", encoding=codirovka) as file:
    mvps = file.read().splitlines()

new_lines = list()
mvp_added = set()

for line in list(reversed(lines)):
    for mvp in mvps:
        if re.split('\s', line)[0] == mvp and mvp not in mvp_added:
            new_lines.append(mvp+"	RUSH_ST	SM_ENDURE	1	500	0	10000	NO_DISPEL		SEND_EMOTICON 	6	IF_RANGEATTACKED")
            mvp_added.add(mvp)
            break
    new_lines.append(line)

new_lines.reverse()
with open("NpcaddSkillInfo2.txt", "w", encoding=codirovka) as file:
    for line in new_lines:
        line = line.replace("  ", " ")
        file.write(line + '\n')