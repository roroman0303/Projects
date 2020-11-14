#==================================
 
def factor(number):
    factors = []
    while  number > 1:
        for i in range(2, number):
            if number % i == 0: 
                factors.append(i)
                number = number//i
                break
    return factors
 
#==================================

print (factor(4623))
