# на грузовом судне надо перевезти контейнеры имеющие один размер и разные массы
# масса контейнеров превышает грузоподъемность
# кол-во мест не меньше кол-ва контейнеров
# макс кол-во контейнеров за один рейс и масса большего из них

with open('26.txt', 'r') as file:
    lines = file.read().splitlines()
    maxi = int(lines[0].split()[0])
    weights = lines[1:]

print(maxi)
current = 0
count = 0
weights = sorted(weights)

for weight in weights:
    weight = int(weight)
    if current + weight > maxi:
        max_weight = weight
        max_current = current
        break
    else:
        current += weight
        count += 1
        print(current)

print(str(max_weight)+' '+str(count))
