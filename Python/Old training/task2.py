# текстовый файл состоит из не более чем 10^6 символов xyz
# определите макс. кол-во идущих подряд символов, среди которых нет подстановки zy
with open('24.txt', 'r') as file:
    text = file.read()

maxi = 0
count = 0
for i in range(len(text)-1):
    count += 1
    if text[i] == 'Z':
        if text[i+1] == 'Y':
            if count > maxi:
                maxi = count
            count = 0
print(len(text))
print(maxi)
