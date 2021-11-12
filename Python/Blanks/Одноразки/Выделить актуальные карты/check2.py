import re
import Ragnarok.module.files as files

exist_maps = files.open_lines('exist_map.txt')
all_maps = files.open_lines('map.txt')

not_exist = list()
for line in all_maps:
	map = line.split()[1]
	type = line.split()[3]
	not_exist.append(type + '\t' + map)

exist = list()
exist_mapss = list()
for i in range(len(not_exist)):
	for exist_map in exist_maps:
		not_map = not_exist[i].split()[1].replace('.gat', '')
		if not_map == exist_map:
			exist.append(not_exist[i])
			not_exist[i] = ''
			exist_mapss.append(not_map)
			break

files.write_lines(exist, 'exist_result.txt')
files.write_lines(not_exist, 'not_exist_result.txt')

for exist_map in exist_maps:
	if exist_map not in exist_mapss: print(exist_map)