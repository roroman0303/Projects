
def isFree(dates, new_date):  # new_date = [day, hour, minute, duration, name1 ..]
    # для проверки новой встречи посчитаем абсолютное время в минутах
    new_date_start = 1440 * new_date[0] + 60 * int(new_date[1]) + int(new_date[2])
    new_date_finish = 1440 * new_date[0] + 60 * int(new_date[1]) + int(new_date[2]) + int(new_date[3])
    for date in dates:
        date_start = 1440 * date[0] + 60 * int(date[1]) + int(date[2])
        date_finish = 1440 * date[0] + 60 * int(date[1]) + int(date[2]) + int(date[3])
        # если встреча пересекается с другой, вернем имена занявших данное время
        if date_start <= new_date_start < date_finish: return " ".join(date[4:])
        if date_start < new_date_finish <= date_finish: return " ".join(date[4:])
        if new_date_start < date_start and new_date_finish > date_finish: return " ".join(date[4:])
    return "OK"


dates = list()  # [[day, hour, minute, duration, name1 ..], ..]
n = int(input())  # счетчик запросов

for i in range(n):
    a = [k for k in input().split()]  # запрос
    action = a[0]
    if action == 'APPOINT':
        # разбиваем на составляющие
        day = int(a[1])
        time = a[2]
        duration = int(a[3])
        k = a[4]  # не нужно
        names = a[5:]
        hour = time.split(':')[0]
        minute = time.split(':')[1]
        # date - потенциально новая запись
        date = [day, hour, minute, duration]
        date.extend(names)
        if isFree(dates, date) == "OK":  # проверяем пересекаются ли записи
            print("OK")
            dates.append(date)  # если не пересекаются, добавляем
        else: print("FAIL\n" + " ".join(names))  # если пересекаются
    if action == 'PRINT':
        # разбиваем на составляющие
        day = int(a[1])
        name = a[2]
        dates.sort()
        # создаем список встреч в данный день
        dates_today = list(filter(lambda item: item[0] == day, dates))
        for date in dates_today:
            if name in date:
                print("{0}:{1} {2} ".format(date[1], date[2], date[3]) + " ".join(date[4:]))


