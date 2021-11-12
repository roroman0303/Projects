import module.files as files

lines = files.open_lines('mobs.txt')
new_lines = list()
for line in lines:
    new_lines.append(line)
    new_lines.append('')
    new_lines.append('')
    new_lines.append('')
    new_lines.append('')

files.write_lines(new_lines, 'mobs2.txt')



