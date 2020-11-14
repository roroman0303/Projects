import random
#===========================

def numstrsum(string):
    n = list(string)
    sum = 0
    for i in range(len(string)):
        sum += int(n[i])
    return sum

#============================

def twopairs(dice):
    counter = 0
    for i in range(5):
        if len(dice.replace(dice[i],"")) == 3: counter +=1
    if counter == 4: return True        
    return False

#============================

def straight(dice):
    if numstrsum(dice) == 15 or numstrsum(dice) == 20:
        if len(set(dice)) == 5: return True
    return False

#============================

def fullhouse(dice):
    if threeofakind(dice) and twoofakind(dice): return True
    return False

#============================

def twoofakind(dice):
    for i in range(4):
        if len(dice.replace(dice[i],"")) == 3: return True
    return False

#============================

def threeofakind(dice):
    for i in range(3):
        if len(dice.replace(dice[i],"")) == 2: return True
    return False

#============================

def fourofakind(dice):
    for i in range(2):
        if len(dice.replace(dice[i],"")) == 1: return True
    return False

#============================

def fiveofakind(dice):
    if dice[0]==dice[1]==dice[2]==dice[3]==dice[4]:
        return True
    return False

#============================

def combination(dice):
    if fiveofakind(dice): return 7
    if fourofakind(dice): return 6
    if fullhouse(dice): return 5
    if straight(dice): return 4
    if threeofakind(dice): return 3
    if twopairs(dice): return 2
    if twoofakind(dice): return 1
    return 0

#============================

def diceroll():
    return random.randint(1,6)

#============================

print("Welcome to the Dice Poker simulator!")
player_counter = int(input("Enter a number of players: "))

player_name = []
width_name = []
round_result = []
round_combo = []

combo_name = []
combo_name.append("Kicker")
combo_name.append("Two of a Kind")
combo_name.append("Two pairs")
combo_name.append("Three of a Kind")
combo_name.append("Straight")
combo_name.append("Full House")
combo_name.append("Four of a Kind")
combo_name.append("Five of a Kind")

for i in range(0, player_counter):
    
    player_name.append(input("Enter the name of №"+str(i+1)+" player: "))
    width_name.append(len(player_name[i]))
    round_result.append("")
    round_combo.append("")
    
head = ""
for i in range(0, player_counter):
    head += player_name[i] + " "*4

while(1):

    input("\nPress Enter if you want to play...\n")
    result_head = ""
    
    for i in range(0, player_counter):
        
        for dicecount in range(0, 5):
            round_result[i] += str(diceroll())

        round_combo[i] = combination(round_result[i])    
        space = " "*(width_name[i] + 4 - 5) 
        result_head += round_result[i] + space
        round_result[i] = ""
        
    max_combo = max(round_combo)    
    print(head)
    print(result_head)

    if max_combo == 0: print("There is no winner.")
    else:
        for i in range(0, player_counter):
            if round_combo[i] == max_combo:
                print("The winner is {0} with {1}!".format(player_name[i], combo_name[max_combo]))

    
        
        
    

