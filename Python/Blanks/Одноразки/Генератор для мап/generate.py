
codirovka = "Windows-1251"
#==================INPUT====================#
filename1 = "locations.txt"
filename2 = "checkers.txt"
#==================BEGIN====================#
with open(filename1) as file:
    locations = file.read().splitlines()

#generate
with open(filename2, "w", encoding=codirovka) as file:
    for loc in locations:
        
        file.write('    var check = GetPCCount \"'+loc+'\"\n')
        file.write('    dialog \"'+loc.split('.')[0]+' - [ \" + check + \" ]\"\n')

print("Готово!")
    

