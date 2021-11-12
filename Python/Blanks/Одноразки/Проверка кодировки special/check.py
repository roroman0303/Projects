import re

codirovka = 'Windows-1251'
with open("D:/RO/rot/zone/itemdata/special.sc", encoding=codirovka, errors='ignore') as file:
    special = file.read().splitlines()

alert = 0
for line in special:
    if "\"" in line:
        if len(re.findall(r'[‰“Љ…Ќѓ™‡•љ”›ЂЏђЋ‹„†ќџ‘Њ€’њЃћ]+', line)) > 0:
            print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
            print("-----> Кодировка битая <-----")
            print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
            alert = 1
            break

if alert == 0:
    print("=====================")
    print("Кодировка в порядке.")
    print("=====================")
