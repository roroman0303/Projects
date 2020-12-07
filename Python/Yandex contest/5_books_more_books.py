def nextDay(day):
    if day == 7: return 1
    return day + 1

a = [int(i) for i in input().split()]
k = a[0]  # можно взять
m = a[1]  # запас
day = a[2]  # день
read_today = 1
while m > 0:
    #print("день " + str(day))
    # берем в библиотеке
    if day >= 1 and day <= 5:
        m += k
        #print("берем в библиотеке {0} и запас теперь {1}".format(k, m))
    # читаем
    m -= read_today
    #print("прочли {0} и осталось {1}".format(read_today, m))
    # если книг сегодня не хватило или завтра будет недостаточно книг
    if m < 0: break
    if m == 0 and read_today + 1 > k: break
    # на следующий день
    day = nextDay(day)
    read_today += 1
print(read_today)
