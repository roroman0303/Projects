#========================
#func that check if a number is prime

def isprime(number):
    counter = 0
    if number > 2: 
        for i in range(2, number // 2 + 1):
            if number % i == 0: counter += 1
    return bool(counter) == False

#========================
#Every number can be expressed as sum of 2 prime numbers

num = input("Enter a number: ")
num = int(num)
for i in range(1, num // 2 + 1):
    if isprime(i) == True and isprime(num - i) == True: print("{} = {} + {}".format(num, str(i), str(int(num) - i)))
