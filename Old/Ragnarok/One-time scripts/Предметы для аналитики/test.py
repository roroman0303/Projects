import Ragnarok.module.files as files

all_consumable = files.open_lines("consumable.txt")
consumable = list()
for line in all_consumable:
    if line.strip() not in consumable: consumable.append(line.strip())
consumable = sorted(consumable)

all_important = files.open_lines("important.txt")
important = list()
for line in all_important:
    if line.strip() not in important: important.append(line.strip())

important = sorted(important)
files.write_lines(important, 'all_important_items.txt')

important_consumable = list()
for line in important:
    if line in consumable: important_consumable.append(line)

important_consumable = sorted(important_consumable)
files.write_lines(important_consumable, 'all_important_consumable_items.txt')