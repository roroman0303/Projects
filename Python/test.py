my_dict = {'a': 3, 'c': 1, 'b': 2, '0': 3}
new_dict = sorted(my_dict.items(), key= lambda item: item[0])
print(new_dict)