import re
import Ragnarok.module.files as files
import Ragnarok.module.patterns as pattern

obb_lines = files.open_lines('obb_kRO.txt')
ovb_lines = files.open_lines('ovb_kRO.txt')

obb_classic_lines = files.open_lines('obb_classic.txt')
ovb_classic_lines = files.open_lines('ovb_classic.txt')

obb_filtered1 = list()
ovb_filtered1 = list()
for line in obb_lines:
    if line in obb_classic_lines: obb_filtered1.append('добавить\t'+line)
    else: obb_filtered1.append('\t'+line)
for line in ovb_lines:
    if line in ovb_classic_lines: ovb_filtered1.append('добавить\t'+line)
    else: ovb_filtered1.append('\t' + line)

files.write_lines(obb_filtered1, 'obb_filtered1.txt')
files.write_lines(ovb_filtered1, 'ovb_filtered1.txt')