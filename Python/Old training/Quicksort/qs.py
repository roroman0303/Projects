#=================================

def quicksort(list1):
    
    if list1 == []: 
        return []
    else:
        core = list1[0]
        less = quicksort([x for x in list1[1:] if x < core])
        great = quicksort([x for x in list1[1:] if x >= core])
        return less + [core] + great

#=================================

nums = [0,1,2,3,4,87,34,6,7,3,56,7856,98,65,7]
print(quicksort(nums))
