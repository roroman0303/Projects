#A string is called prime if it cant be constructed by equal strings

#===============================

def primecheck(symbol_amount, mainstring):
    
    equalstring = mainstring[:symbol_amount]
    if mainstring == equalstring * (len(mainstring) // symbol_amount): return equalstring
    else: return ""    
    

#===============================

mstr = input("Enter a string which should be checked: ")
eqstr = ""

for sym_am in range(1, len(mstr) // 2 + 1):
    
    if eqstr != "": break
    eqstr = primecheck(sym_am, mstr)

if eqstr != "": print("String is not prime! Constructed by [{}]".format(eqstr))
else: print("String is prime!")   
