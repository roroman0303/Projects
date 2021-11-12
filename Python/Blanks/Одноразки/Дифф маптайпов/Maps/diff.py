import Ragnarok.module.files as files


for maptype in [0,1,2,3,4,6,8,9,10,12,13,14,15,16,18,19,21,23,24,25,27,28,29,31,39,40,41]:
    maps = files.open_lines('maps_'+str(maptype)+'.txt')
    new_maps = set()
    old_maps = set()
    new = False
    old = False
    for line in maps:
        map = line.strip()
        if '[new]' in line:
            new = True
            continue
        if '[old]' in line:
            new = False
            old = True
            continue
        if new == True: new_maps.add(map)
        elif old == True: old_maps.add(map)
        added = new_maps.difference(old_maps)
        deleted = old_maps.difference(new_maps)
        differ = ['Добавлены'] + sorted(list(added)) + ['Удалены'] + sorted(list(deleted))
        files.write_lines(differ, 'differ_'+str(maptype)+'.txt')
