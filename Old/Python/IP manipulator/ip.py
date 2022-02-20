#=======================

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
        dict3.update(great)
        dict3.update({core_id : core})
        dict3.update(less)
        return dict3
    
#=======================

#input like multiple lines "[10.10.2010 12:00:00] 0.0.0.0"
with open("ips_log.txt") as ips_log:
    ips_logs = ips_log.readlines()
ips = list()

for i in ips_logs:
    if i != None and i != "":
        ptr = i[22:]
        ptr = ptr.replace("\n", "")
        ips.append(ptr)
 
ips_dict = dict()
for el in ips:
    ips_dict.setdefault(el, 0)
    ips_dict[el] += 1
ips_dict.pop("")

ips_dict = dict_values_quicksort(ips_dict)
#print(ips_dict2)
counter = 1
for el in ips_dict:
    print(str(counter)+".\t"+el+" - "+str(ips_dict[el]))
    counter += 1
    

        

    
