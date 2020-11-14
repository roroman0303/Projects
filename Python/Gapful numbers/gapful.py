# Gapful Number - is a number of at least 3 digits
# that is divisible by the number formed by the first and last digit of the original number.

while 1:
    print("Choose an option")
    print("1 - check a gapful number")
    print("2 - display all three-digit gapful numbers in a range")
    choice = input("Your choice: ")
    
    if choice == "1":
        
        g_num = input("Enter a three-digit number: ")
        div_num = g_num[0] + g_num[2]
        if int(g_num) % int(div_num) == 0: print("{} is a gapful number\n======================================".format(g_num))
        else: print("{} is not a gapful number\n======================================".format(g_num))
    
    if choice == "2":
        
        num_range = [100,999]
        print("Enter a range: ")
        num_range[0] = input("from ")
        num_range[1] = input("to ")
        print("Gapful numbers:")
        
        for num in range(int(num_range[0]),int(num_range[1])):
            num = str(num)
            divr_num = num[0] + num[2]
            if int(num) % int(divr_num) == 0: print(num)
            
        
