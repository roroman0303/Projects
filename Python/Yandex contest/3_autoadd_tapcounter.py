def howManyTaps(words, new_word):
    for i in range(1, len(new_word)+1):
        match = 0
        # проверяем все слова в словаре words
        for word in words:
            if new_word[0:i] == word[0:i]: match += 1
        # если совпадение только одно, дополняем слово
        # где i - количество введенных символов до дополнения
        if match == 1: return i
    #return len(new_word)


#n = int(input())
text = input()
text = text.split()
words = set()  # множество всех введенных слов
taps = 0

for word in text:
    # если слова нет, придется писать его полностью
    if word not in words:
        taps += len(word)
        words.add(word)
    # если слово есть, проверим сколько нажатий клавиш потребуется
    else:
        taps += howManyTaps(words, word)

print(taps)


