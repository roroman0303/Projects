import Ragnarok.module.files as files
import re
import pytest

def test_diff():
    current = files.open_lines('current.txt')
    new = files.open_lines('new.txt')

    current_dict = dict()
    for line in current:
        if 'maptype' in line.lower():
            type = re.split(r'\s+', line)[1]
            current_dict[type] = list()
            continue
        elif '//' in line: continue
        else: current_dict[type].append(line)
    for key, value in current_dict.items():
        current_dict[key] = sorted(value)

    new_dict = dict()
    for line in new:
        if 'maptype' in line.lower():
            type = re.split(r'\s+', line)[1]
            new_dict[type] = list()
            continue
        elif '//' in line: continue
        else: new_dict[type].append(line)
    for key, value in new_dict.items():
        new_dict[key] = sorted(value)

    assert new_dict == current_dict

if __name__ == '__main__':
    pytest.main(['-rpEf -v'])




