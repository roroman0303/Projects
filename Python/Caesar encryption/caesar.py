#Ceasar encoder uses ASCII table
#This method shifts every symbol in the string
#Key is the shift size

while(1):
    
    choice = int(input("Select an option (1 - encode, 2 - decode, 3 - hack): "))
    
    #encryption
    if choice == 1:
        text = input("Input text that should be encoded: ")
        key = int(input("Input key: "))
        newtext = ""
        for s in range(0, len(text)):
            
            c_sym = chr(ord(text[s]) + key)
            newtext += c_sym
        
        print(newtext) 
        
    #decryption    
    elif choice == 2:
        text = input("Input text that should be decoded: ")
        key = int(input("Input key: \n"))
        newtext = ""
        for s in range(0, len(text)):
            
            c_sym = chr(ord(text[s]) - key)
            newtext += c_sym
        
        print(newtext) 
        
    #hacking    
    elif choice == 3:
        text = input("Input text that should be hacked: ")
        key_range = int(input("Input hacking range: "))
        
        for key in range(0, key_range * 2):
            
            newtext = ""
            for s in range(0, len(text)):
                c_sym = chr(ord(text[s]) + key - key_range)
                newtext += c_sym
            print(newtext)
