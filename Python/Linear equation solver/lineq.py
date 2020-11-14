print("Enter an equation Ax+B=0: ")
eq = input()
eq = eq.replace(" ","")
eq = eq.lower()
#eq = "11x-23=0" #input Ax+B=0
A = float((eq.split("=")[0]).split("x")[0])
B = float((eq.split("=")[0]).split("x")[1])
x = -(B / A)
print("x = "+str(x))
