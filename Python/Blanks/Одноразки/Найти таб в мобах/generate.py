import re

codirovka = 'UTF-8'
with open("mobdef.sc", encoding=codirovka, errors='ignore') as file:
    mobs = file.read().splitlines()

for line in mobs:
    if 'mob' in line:
        name = line.split("\"")[1]
        if len(name) > 23: print(name)


