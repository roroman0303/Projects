#The Collatz conjecture: start with any positive integer n
#Then each term is obtained from the previous term as follows:
#if the previous term is even, the next term is one half of the previous term
#If the previous term is odd, the next term is 3 times the previous term plus 1
#The conjecture is that no matter what value of n, the sequence will always reach 1

print("Enter a natural number: ")
x = int(input("x = "))

while x != 1:
    #x/2
    if x % 2 == 0:
       print(str(x)+" / 2 = "+str(int(x/2)))
       x = int(x / 2)
    #3x+1   
    else:
       print(str(x)+" * 3 + 1 = "+str(x*3+1))
       x = x * 3 + 1
