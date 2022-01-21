
dataset = {'admin$': 2, 'daemon_': 6, 'Kovalev': 16, 'Anderson': 21, 'Corvin': 3, 'Borat': 23, 'aBrams': 14, '13': 20,
           'Gerhaгd': 19, 'Zidane': 12, 'Messi': 10, 'Rupert': 10}

footballers = ['Messi', 'Zidane']

cleared_dataset = dict()
for name, value in dataset.items():
    if name.isalpha() is True and name not in footballers:
        if value % 2 == 1: value -= 1
        cleared_dataset[name] = value

print(cleared_dataset)

sorted_list = sorted([value for value in cleared_dataset.values()])
median = sorted_list[len(sorted_list) // 2]

print('Медиана - '+str(median))

second_list = list()
for name, value in cleared_dataset.items():
    if value > median:
        second_list.append([name, value])

result = [name[0] for name in reversed(sorted(second_list, key=lambda name: name[1]))]

print(result)