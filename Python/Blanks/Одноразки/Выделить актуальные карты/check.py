import re
import Ragnarok.module.files as files
import Ragnarok.module.patterns as patterns

list_txt = files.open_lines('D:/RO/rot/zone/npcdata/list.txt')
active_scripts = list()
for line in list_txt:
	if line.startswith('./npcdata'): active_scripts.append(line)

maps = set()
for script in active_scripts:
	print(script)
	path = script.replace('.', 'D:/RO/rot/zone/', 1)
	script_lines = files.open_lines(path, codirovka='Windows-1251', errors='ignore')
	for line in script_lines:
		if re.search(patterns.callmonster, line):
			map = re.search(patterns.callmonster, line).group(1)
			maps.add(map)
		if re.search(patterns.moveto, line):
			map = re.search(patterns.moveto, line).group(1)
			maps.add(map)
		if re.search(patterns.npc, line):
			map = re.search(patterns.npc, line).group(1)
			maps.add(map)
		if re.search(patterns.trader, line):
			map = re.search(patterns.trader, line).group(1)
			maps.add(map)

maps = sorted(list(maps))
for i in range(len(maps)): maps[i] = maps[i].replace('\"', '')
files.write_lines(maps, 'maps_not_putmob.txt')