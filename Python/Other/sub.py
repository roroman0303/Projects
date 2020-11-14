#=====================================
#func: multiply all elements of the list

def multiply(mylist) : 
    result = 1
    for x in mylist:
        if x != "": result = result * int(x) 
    return str(result) 
    
#=====================================
#func: check if a number is prime

def isprime(number):
    counter = 0
    if number > 2: 
        for i in range(2, number // 2 + 1):
            if number % i == 0: counter += 1
    return bool(counter) == False

#=================================
#func: quicksort

def quicksort(list1):
    
    if list1 == []: 
        return []
    else:
        core = list1[0]
        less = quicksort([x for x in list1[1:] if x < core])
        great = quicksort([x for x in list1[1:] if x >= core])
        return less + [core] + great

#=================================
#func: sum of a string of numbers

def numstrsum(string):
    n = list(string)
    sum = 0
    for i in range(len(string)):
        sum += int(n[i])
    return sum
#===========================
#func: factorization

def factor(number):
    factors = []
    while  number > 1:
        for i in range(2, number+1):
            if number % i == 0: 
                factors.append(i)
                number = number//i
                break
    return factors
    
#=====================================
#func: creates two-dim massive

def td_list(a, b):
    
    l = [[0] * b for i in range(a)]
    print(l)
    return l

#===============================

def dict_values_quicksort(dict1):

    if len(dict1) == 0: 
        return dict1
    else:
        dict2 = dict1.copy()
        core_id = list(dict2.keys())[0]
        core = dict2[core_id]
        dict2.pop(core_id)
        less = dict_values_quicksort({el_id : dict2[el_id] for el_id in dict2 if dict2[el_id] < core})
        great = dict_values_quicksort({el_id : dict2[el_id] for el_id in dict2 if dict2[el_id] >= core})
        dict3 = dict()
        dict3.update(less)
        dict3.update({core_id : core})
        dict3.update(great)
        return dict3
    
#=======================
