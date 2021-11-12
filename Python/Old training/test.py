str1 = '3' * 47
while (1):
    for i in range(len(str1)-2):
        if str1[i] == '3' and str1[i+1] == '3' and str1[i+2] == '3':
            str1 = str1[:i] + '1' + str1[i+3:]
            break
        if str1[i] == '1' and str1[i+1] == '1' and str1[i+2] == '1':
            str1 = str1[:i] + '3' + str1[i+3:]
            break
    print(str1)
