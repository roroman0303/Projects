n = int(input())
pers = list()

weight = 0
for i in range(n):
    ai, bi = (int(i) for i in input().split())

    # все веса ip-адресов, добавляем новый
    pers.append(ai * bi / 100)
    # вес - доля, приходящаяся на вероятность ошибки
    weight += ai * bi / 100
    # weight - сумма всех долей (общий вес)

for i in range(n):
    # вероятность - вес одного адреса / общий вес
    print(pers[i] / weight)