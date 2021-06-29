#Lab number is a number such that the square
#of any of its prime divisors is still one of its divisors

def labcheck(number):
    for i in factor(number):
        if number % (i**2) == 0: return True
    return False    
    
#====================================

def factor(number):
    factors = []
    while  number > 1:
        for i in range(2, number+1):
            if number % i == 0: 
                factors.append(i)
                number = number//i
                break
    return factors

#====================================

print(factor(50))
print(labcheck(50))    
