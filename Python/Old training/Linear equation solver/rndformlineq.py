
#func: multiply all elements of the list
def multiply(mylist) : 
    result = 1
    for x in mylist:
        if x != "": result = result * int(x) 
    return str(result) 
    
#====================================

#input like '-3x+9-6=4*x+2+3*4*x*2'
#print("Enter a linear equation: ")
eq = input("Enter a linear equation: \n")

#removing spaces
eq = eq.replace(" ","")
eq = eq.lower()


#removing single 'x' (reveal 1)
eq = "@" + eq
eq = eq.replace("@x","1x")
eq = eq.replace("@","")
eq = eq.replace("-x","-1x")
eq = eq.replace("+x","+1x")
eq = eq.replace("=x","=1x")
print(eq)

#splitting into right and left
if eq[len(eq)-2:] != "=0":
    leftside = eq.partition("=")[0]
    rightside = eq.partition("=")[2]

#add '+' to split
leftside = leftside.replace("-","+-")
leftside = "@" + leftside
leftside = leftside.replace("@+","")
leftside = leftside.replace("@","")

#changing '+' -> '-'
if rightside[0] != "-": rightside = "+" + rightside
rightside = rightside.replace("-","@")
rightside = rightside.replace("+","-")
rightside = rightside.replace("@","+")
rightside = rightside.replace("-","+-")
rightside = "@" + rightside
rightside = rightside.replace("@+","")
rightside = rightside.replace("@","")

add = leftside.split("+") + rightside.split("+")

#multiplying
for i in range(len(add)):
    if "*" in add[i]:
        if "x" in add[i]:
            add[i] = add[i].replace("x","")
            add[i] = multiply(add[i].split("*"))
            add[i] = add[i] + "x"
        else: add[i] = multiply(add[i].split("*"))

#print(add)

#splitting adds that have 'x'
x_add = []
num_add = []
for i in add:
    if "x" in i:
        x_add.append(float(i.replace("x","")))
    else:
        num_add.append(float(i))

#solving
A = sum(x_add)
B = sum(num_add)

x = -(B / A)
print("x = "+str(x))
