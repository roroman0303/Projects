# напишите прогу которая ищет числа в диапазоне от 199465 до 199502
# числа который имеют ровно два различных делителя
import math

def simple(number):
    for multi in range(2, round(math.sqrt(number))+1):
        if number % multi == 0: return False
    return True

multipliers = list()
for number in range(199465, 199503):
    for multi1 in range(2, round(math.sqrt(number))):
        if number % multi1 == 0:
            multi2 = number // multi1
            if simple(multi1) == True and simple(multi2) == True:
                if [multi1, multi2] not in multipliers:
                    multipliers.append([multi1, multi2])

for i in multipliers:
    print(i)