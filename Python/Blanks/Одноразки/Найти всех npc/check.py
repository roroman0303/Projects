import re
import Ragnarok.module.files as files

lines = files.open_lines('2021_halloween_ru.sc', 'Windows-1251')

npcs = list()
names = list()
for line in lines:
	if line.strip().startswith('npc '):
		npcs.append(line.strip().replace(' ', '\t'))
		names.append(line.split('\"')[3].split('#')[0])

files.write_lines(npcs, 'npcs.txt', 'Windows-1251')
files.write_lines(names, 'names.txt', 'Windows-1251')