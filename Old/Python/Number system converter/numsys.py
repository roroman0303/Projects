#========================
#func: converts a number to another number system
#only 2-10

def numsysconvert(number, numbersystem2, numbersystem1 = 10):
    
    #converting number to the decimal system
    if numbersystem1 != 10:
        
        number = str(number)
        number10 = 0
        
        for i in range(0,len(number)):
            number10 += int(number[i]) * ( numbersystem1 ** (len(number)-i-1) )
            
        number = number10
        numbersystem1 = 10
        
    #converting number to desired number system
    if numbersystem2 != numbersystem1:
        
        con_number = ""
        
        while(number != 0):
            con_number = str(number % numbersystem2) + con_number
            number = number // numbersystem2
        return int(con_number)
        
    else: return number  
    
    
#========================

print("Number system converter")

num = int(input("Enter a number: "))
num_sys1 = int(input("Enter a number system which you want to convert to (2 for binary): "))

num = numsysconvert(num, num_sys1)
print("Converted number (number system is {}): {}".format(num_sys1, num))

while(1):
    num_sys2 = int(input("Enter a number system if you want to continue converting: "))
    num = numsysconvert(num, num_sys2, num_sys1)
    num_sys1 = num_sys2
    print("Converted number (number system is {}): {}".format(num_sys2, num))
