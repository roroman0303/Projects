# 10024 до 40635 подсчитать числа остаток деления на 7 равен 3 не делятся ни на 4 ни на 5, кол-во чисел и минимальные из них
count = 0
min = 40635
for i in range (10024, 40636):
    if i % 4 != 0 and i % 5 != 0:
        if i % 7 == 3:
            count += 1
            if i < min: min = i

print('мин - {} кол-во - {}'.format (min, count))