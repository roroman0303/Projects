import re

import module.files as files

ru_mvp = files.open_lines('ru.txt')
eu_mvp = files.open_lines('eu.txt')
kro_mvp = files.open_lines('kro.txt')

diff = list()
for ru_line in ru_mvp:
    for kro_line in kro_mvp:
        if re.split(r'\s+', ru_line)[0] == re.split(r'\s+', kro_line)[0]:
            name = re.split(r'\s+', ru_line)[0]
            ru_row = re.split(r'\s+', ru_line)
            kro_row = re.split(r'\s+', kro_line)
            diff.append(name + '\tkRO\t' + '\t'.join(kro_row[2:]))
            diff.append('\tROP\t' + '\t'.join(ru_row[2:]))
            for eu_line in eu_mvp:
                if re.split(r'\s+', eu_line)[0] == name:
                    eu_row = re.split(r'\s+', eu_line)
                    diff.append('\tROPEU\t' + '\t'.join(eu_row[2:]))
            diff.append('\t')

files.write_lines(diff, 'diff.txt')


