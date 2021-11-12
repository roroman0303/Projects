# текстовый файл состоит из не более чем 10^6 символов xyz
# определите макс. кол-во идущих подряд символов, среди которых нет подстановки zy
with open('27-A.txt', 'r') as file:
    lines = file.read().splitlines()[1:]

for line in lines:

    number1 = int(line.split()[0])
    number2 = int(line.split()[1])
    if number1 > number2: razn = number1 - number2
    else: razn = number2 - number1
    if razn % 13 != 0: print(razn)