my_dict = {'a': 3, 'c': 1, 'b': 2, '0': 3}
keys = [1, 2, 3, 4]
values = [5, 6, 7, 8]
new_dict = my_dict.fromkeys(keys, values)
print(new_dict)