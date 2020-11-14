#==========================

def smartadd(dictionary, key, word):
    if dictionary.get(key) != None: dictionary[key] += ", "+word
    elif dictionary.get(key) == None: dictionary[key] = word

#==========================
from datetime import datetime as datetime
    
old_dict = input("Enter a name of the .txt-file: ")

with open(old_dict+".txt") as dict:
    dictionary = dict.read()
    print(dictionary)
    dictionary = dictionary.replace(" ","")

dictionary_lines = dictionary.splitlines()

new_dictionary = {}

for line in dictionary_lines:
    current_line = line.split("-")
    word = current_line[0]
    translate = current_line[1]

    if "," in translate:
        translate_arr = translate.split(",")
        for i in translate_arr: smartadd(new_dictionary, i, word)

    else: smartadd(new_dictionary, translate, word)

new_dict_name = "dictionary"+str(datetime.today())[:19]
new_dict_name = new_dict_name.replace("-", ".")
new_dict_name = new_dict_name.replace(":", "-")

with open(new_dict_name+".txt", "w") as new_dict:
    for i in new_dictionary:
        print(i+" - "+new_dictionary[i])
        new_dict.write(i+" - "+new_dictionary[i]+"\n")

