import re

mobdef_pattern = r'^\s*mob\s+(\S+)\s+(".+")\s+\S+'

with open('maps.txt', 'r') as file:
    locations = file.read().splitlines()

with open('D:/RO/roteu/zone/scriptdata/mobdef.sc', 'r') as file:
    mobdefs = file.read().splitlines()

treasure_pattern = \
"""// ================[{map}]======================
npc "{map}" "#{map}_control" HIDDEN_NPC 1 1 5 0 0
OnInit:
	disablenpc "Mark#{map}_1"
	disablenpc "Chest#{map}_1"
	disablenpc "#Aura_{map}_1"
	disablenpc "Mark#{map}_2"
	disablenpc "Chest#{map}_2"
	disablenpc "#Aura_{map}_2"
	disablenpc "Mark#{map}_3"
	disablenpc "Chest#{map}_3"
	disablenpc "#Aura_{map}_3"
	cmdothernpc "#{map}_control" "spawn"
return
OnCommand: "spawn"
	var place = rand 1 3
	if (place == 1)
		enablenpc "Mark#{map}_1"
	elseif (place == 2)
		enablenpc "Mark#{map}_2"
	else
		enablenpc "Mark#{map}_3"
	endif
return
OnCommand: "found"
	disablenpc "Mark#{map}_1"
	disablenpc "Mark#{map}_2"
	disablenpc "Mark#{map}_3"
	InitTimer
return
OnTimer: 10000
	disablenpc "Chest#{map}_1"
	disablenpc "#Aura_{map}_1"
	disablenpc "Chest#{map}_2"
	disablenpc "#Aura_{map}_2"
	disablenpc "Chest#{map}_3"
	disablenpc "#Aura_{map}_3"
return
OnTimer: 600000
	cmdothernpc "#{map}_control" "spawn"
	stoptimer
return
npc "{map}" "Chest#{map}_1" 4_TREASURE_BOX {mark_1_x} {mark_1_y} 5 0 0
npc "{map}" "#Aura_{map}_1" 4_ENERGY_BLACK {mark_1_x} {mark_1_y} 5 0 0
npc "{map}" "Mark#{map}_1" 4_CRACK {mark_1_x} {mark_1_y} 5 0 0
OnClick:
	var pirate_17410 = isbegin_quest 17410
	if (pirate_17410 == 1)
	    setquest 17411
		completequest 17410
	endif
	var found = rand 1 100
	if (found <= 30)
		enablenpc "#Aura_{map}_1"
		ConsumeSpecialItem Anodyne_B
	elseif (found <= 60)
		cmdothernpc "Mark#{map}_1" "zombie"
	else
		cmdothernpc "Mark#{map}_1" "treasure"
	endif
	cmdothernpc "#{map}_control" "found"
return	
OnCommand: "zombie"
	callmonster "{map}" E_ZOMBIE_TREASURE "Pirate's Soul" {mob_1_x_minus} {mark_1_y}
	callmonster "{map}" E_ZOMBIE_TREASURE "Pirate's Soul" {mob_1_x_plus} {mark_1_y}
	callmonster "{map}" E_ZOMBIE_TREASURE "Pirate's Soul" {mark_1_x} {mob_1_y_plus}
	callmonster "{map}" E_ZOMBIE_TREASURE "Pirate's Soul" {mark_1_x} {mob_1_y_minus}
	InitTimer
return
OnTimer: 10000
	resetmymob
	stoptimer
return
OnCommand: "treasure"
	enablenpc "Chest#{map}_1"
	var item_count = 0
	var item1 = C_Blue_Rose_Eyepatch
	var item2 = C_Choco_Minihat
	var item3 = C_Clover_Silkhat
	var item4 = C_Harvest_Festa_Hat
	var item5 = C_Gryphon_Hairband
	var item6 = Azure_Jewel
	var item7 = Cardinal_Jewel
	var item8 = Blue_Jewel
	var item9 = Golden_Jewel
	var item10 = Bluish_Green_Jewel
	var item11 = Crystal_Jewel
	var item12 = Zargon
	var item13 = Skyblue_Jewel
	var item14 = Scarlet_Jewel
	var item15 = Crystal_Jewel_
	var item16 = Acti_Potion
	var item17 = E_Small_Life_Potion
	var item18 = Giant_Fly_Wing
	var item19 = Guyak_Candy
	var item20 = E_Mysterious_Water
	var item21 = Warp_Free_Ticket
	var item22 = Gold
	var item23 = E_Med_Life_Potion
	var item24 = Comp_Tyr's_Blessing
	var item25 = Comp_Kafra_Card
	while(1)
		if (item_count < 13)
			var x = rand {treasure_1_x_minus} {treasure_1_x_plus}
			var y = rand {treasure_1_y_minus} {treasure_1_y_plus}
			var item_number = rand 1 25
			if (item_number == 1)
				ItemDown item1 1 x y
			elseif (item_number == 2)
				ItemDown item2 1 x y
			elseif (item_number == 3)
				ItemDown item3 1 x y
			elseif (item_number == 4)
				ItemDown item4 1 x y
			elseif (item_number == 5)
				ItemDown item5 1 x y
			elseif (item_number == 6)
				ItemDown item6 1 x y
			elseif (item_number == 7)
				ItemDown item7 1 x y
			elseif (item_number == 8)
				ItemDown item8 1 x y
			elseif (item_number == 9)
				ItemDown item9 1 x y
			elseif (item_number == 10)
				ItemDown item10 1 x y
			elseif (item_number == 11)
				ItemDown item11 1 x y
			elseif (item_number == 12)
				ItemDown item12 1 x y
			elseif (item_number == 13)
				ItemDown item13 1 x y
			elseif (item_number == 14)
				ItemDown item14 1 x y
			elseif (item_number == 15)
				ItemDown item15 1 x y
			elseif (item_number == 16)
				ItemDown item16 1 x y
			elseif (item_number == 17)
				ItemDown item17 1 x y
			elseif (item_number == 18)
				ItemDown item18 1 x y
			elseif (item_number == 19)
				ItemDown item19 1 x y
			elseif (item_number == 20)
				ItemDown item20 1 x y
			elseif (item_number == 21)
				ItemDown item21 1 x y
			elseif (item_number == 22)
				ItemDown item22 1 x y
			elseif (item_number == 23)
				ItemDown item23 1 x y
			elseif (item_number == 24)
				ItemDown item24 1 x y
			else
				ItemDown item25 1 x y
			endif
			var item_count = item_count + 1
		else
			exitwhile
		endif
	endwhile
return
npc "{map}" "Chest#{map}_2" 4_TREASURE_BOX {mark_2_x} {mark_2_y} 5 0 0
npc "{map}" "#Aura_{map}_2" 4_ENERGY_BLACK {mark_2_x} {mark_2_y} 5 0 0
npc "{map}" "Mark#{map}_2" 4_CRACK {mark_2_x} {mark_2_y} 5 0 0
OnClick:
	var pirate_17410 = isbegin_quest 17410
	if (pirate_17410 == 1)
	    setquest 17411
		completequest 17410
	endif
	var found = rand 1 100
	if (found <= 30)
		enablenpc "#Aura_{map}_2"
		ConsumeSpecialItem Anodyne_B
	elseif (found <= 60)
		cmdothernpc "Mark#{map}_2" "zombie"
	else
		cmdothernpc "Mark#{map}_2" "treasure"
	endif
	cmdothernpc "#{map}_control" "found"
return	
OnCommand: "zombie"
	callmonster "{map}" E_ZOMBIE_TREASURE "Pirate's Soul" {mob_2_x_minus} {mark_2_y}
	callmonster "{map}" E_ZOMBIE_TREASURE "Pirate's Soul" {mob_2_x_plus} {mark_2_y}
	callmonster "{map}" E_ZOMBIE_TREASURE "Pirate's Soul" {mark_2_x} {mob_2_y_plus}
	callmonster "{map}" E_ZOMBIE_TREASURE "Pirate's Soul" {mark_2_x} {mob_2_y_minus}
	InitTimer
return
OnTimer: 10000
	resetmymob
	stoptimer
return
OnCommand: "treasure"
	enablenpc "Chest#{map}_2"
	var item_count = 0
	var item1 = C_Blue_Rose_Eyepatch
	var item2 = C_Choco_Minihat
	var item3 = C_Clover_Silkhat
	var item4 = C_Harvest_Festa_Hat
	var item5 = C_Gryphon_Hairband
	var item6 = Azure_Jewel
	var item7 = Cardinal_Jewel
	var item8 = Blue_Jewel
	var item9 = Golden_Jewel
	var item10 = Bluish_Green_Jewel
	var item11 = Crystal_Jewel
	var item12 = Zargon
	var item13 = Skyblue_Jewel
	var item14 = Scarlet_Jewel
	var item15 = Crystal_Jewel_
	var item16 = Acti_Potion
	var item17 = E_Small_Life_Potion
	var item18 = Giant_Fly_Wing
	var item19 = Guyak_Candy
	var item20 = E_Mysterious_Water
	var item21 = Warp_Free_Ticket
	var item22 = Gold
	var item23 = E_Med_Life_Potion
	var item24 = Comp_Tyr's_Blessing
	var item25 = Comp_Kafra_Card
	while(1)
		if (item_count < 13)
			var x = rand {treasure_2_x_minus} {treasure_2_x_plus}
			var y = rand {treasure_2_y_minus} {treasure_2_y_plus}
			var item_number = rand 1 25
			if (item_number == 1)
				ItemDown item1 1 x y
			elseif (item_number == 2)
				ItemDown item2 1 x y
			elseif (item_number == 3)
				ItemDown item3 1 x y
			elseif (item_number == 4)
				ItemDown item4 1 x y
			elseif (item_number == 5)
				ItemDown item5 1 x y
			elseif (item_number == 6)
				ItemDown item6 1 x y
			elseif (item_number == 7)
				ItemDown item7 1 x y
			elseif (item_number == 8)
				ItemDown item8 1 x y
			elseif (item_number == 9)
				ItemDown item9 1 x y
			elseif (item_number == 10)
				ItemDown item10 1 x y
			elseif (item_number == 11)
				ItemDown item11 1 x y
			elseif (item_number == 12)
				ItemDown item12 1 x y
			elseif (item_number == 13)
				ItemDown item13 1 x y
			elseif (item_number == 14)
				ItemDown item14 1 x y
			elseif (item_number == 15)
				ItemDown item15 1 x y
			elseif (item_number == 16)
				ItemDown item16 1 x y
			elseif (item_number == 17)
				ItemDown item17 1 x y
			elseif (item_number == 18)
				ItemDown item18 1 x y
			elseif (item_number == 19)
				ItemDown item19 1 x y
			elseif (item_number == 20)
				ItemDown item20 1 x y
			elseif (item_number == 21)
				ItemDown item21 1 x y
			elseif (item_number == 22)
				ItemDown item22 1 x y
			elseif (item_number == 23)
				ItemDown item23 1 x y
			elseif (item_number == 24)
				ItemDown item24 1 x y
			else
				ItemDown item25 1 x y
			endif
			var item_count = item_count + 1
		else
			exitwhile
		endif
	endwhile
return
npc "{map}" "Chest#{map}_3" 4_TREASURE_BOX {mark_3_x} {mark_3_y} 5 0 0
npc "{map}" "#Aura_{map}_3" 4_ENERGY_BLACK {mark_3_x} {mark_3_y} 5 0 0
npc "{map}" "Mark#{map}_3" 4_CRACK {mark_3_x} {mark_3_y} 5 0 0
OnClick:
	var pirate_17410 = isbegin_quest 17410
	if (pirate_17410 == 1)
	    setquest 17411
		completequest 17410
	endif
	var found = rand 1 100
	if (found <= 30)
		enablenpc "#Aura_{map}_3"
		ConsumeSpecialItem Anodyne_B
	elseif (found <= 60)
		cmdothernpc "Mark#{map}_3" "zombie"
	else
		cmdothernpc "Mark#{map}_3" "treasure"
	endif
	cmdothernpc "#{map}_control" "found"
return	
OnCommand: "zombie"
	callmonster "{map}" E_ZOMBIE_TREASURE "Pirate's Soul" {mob_3_x_minus} {mark_3_y}
	callmonster "{map}" E_ZOMBIE_TREASURE "Pirate's Soul" {mob_3_x_plus} {mark_3_y}
	callmonster "{map}" E_ZOMBIE_TREASURE "Pirate's Soul" {mark_3_x} {mob_3_y_plus}
	callmonster "{map}" E_ZOMBIE_TREASURE "Pirate's Soul" {mark_3_x} {mob_3_y_minus}
	InitTimer
return
OnTimer: 10000
	resetmymob
	stoptimer
return
OnCommand: "treasure"
	enablenpc "Chest#{map}_3"
	var item_count = 0
	var item1 = C_Blue_Rose_Eyepatch
	var item2 = C_Choco_Minihat
	var item3 = C_Clover_Silkhat
	var item4 = C_Harvest_Festa_Hat
	var item5 = C_Gryphon_Hairband
	var item6 = Azure_Jewel
	var item7 = Cardinal_Jewel
	var item8 = Blue_Jewel
	var item9 = Golden_Jewel
	var item10 = Bluish_Green_Jewel
	var item11 = Crystal_Jewel
	var item12 = Zargon
	var item13 = Skyblue_Jewel
	var item14 = Scarlet_Jewel
	var item15 = Crystal_Jewel_
	var item16 = Acti_Potion
	var item17 = E_Small_Life_Potion
	var item18 = Giant_Fly_Wing
	var item19 = Guyak_Candy
	var item20 = E_Mysterious_Water
	var item21 = Warp_Free_Ticket
	var item22 = Gold
	var item23 = E_Med_Life_Potion
	var item24 = Comp_Tyr's_Blessing
	var item25 = Comp_Kafra_Card
	while(1)
		if (item_count < 13)
			var x = rand {treasure_3_x_minus} {treasure_3_x_plus}
			var y = rand {treasure_3_y_minus} {treasure_3_y_plus}
			var item_number = rand 1 25
			if (item_number == 1)
				ItemDown item1 1 x y
			elseif (item_number == 2)
				ItemDown item2 1 x y
			elseif (item_number == 3)
				ItemDown item3 1 x y
			elseif (item_number == 4)
				ItemDown item4 1 x y
			elseif (item_number == 5)
				ItemDown item5 1 x y
			elseif (item_number == 6)
				ItemDown item6 1 x y
			elseif (item_number == 7)
				ItemDown item7 1 x y
			elseif (item_number == 8)
				ItemDown item8 1 x y
			elseif (item_number == 9)
				ItemDown item9 1 x y
			elseif (item_number == 10)
				ItemDown item10 1 x y
			elseif (item_number == 11)
				ItemDown item11 1 x y
			elseif (item_number == 12)
				ItemDown item12 1 x y
			elseif (item_number == 13)
				ItemDown item13 1 x y
			elseif (item_number == 14)
				ItemDown item14 1 x y
			elseif (item_number == 15)
				ItemDown item15 1 x y
			elseif (item_number == 16)
				ItemDown item16 1 x y
			elseif (item_number == 17)
				ItemDown item17 1 x y
			elseif (item_number == 18)
				ItemDown item18 1 x y
			elseif (item_number == 19)
				ItemDown item19 1 x y
			elseif (item_number == 20)
				ItemDown item20 1 x y
			elseif (item_number == 21)
				ItemDown item21 1 x y
			elseif (item_number == 22)
				ItemDown item22 1 x y
			elseif (item_number == 23)
				ItemDown item23 1 x y
			elseif (item_number == 24)
				ItemDown item24 1 x y
			else
				ItemDown item25 1 x y
			endif
			var item_count = item_count + 1
		else
			exitwhile
		endif
	endwhile
return

"""
trader_pattern = \
    """// ================[{map}]======================
npc "{map}" "Pirate#{map}" 4_CAT_SAILOR2 {trader_x} {trader_y} {trader_ang} 0 0
OnInit:
	NpcOverBMP "group_3"
	
	AddQuestIDCondition {quest}
	SetQuestConditionBegin {quest} 1 4
	SetQuestConditionQuest {quest} 0
	SetQuestConditionEnd
	SetQuestConditionBegin {quest} 1 4
	SetQuestConditionQuest {quest} 2
	SetQuestConditionEnd
	SetQuestConditionBegin {quest} 1 4
	SetQuestConditionItem 6839 499 "<"
	SetQuestConditionEnd 
return
OnTouch2:
	Talk2me "Pirate#{map}" "Everything fits together on the maps... So where is this chest?"
return
OnClick:
	dialog "[Pirate]"
	dialog "If I could read a map, "
	dialog "I would have become a captain..."
	dialog "Oh! Hi. Looking for someone?"
	dialog "Or maybe something..."
	wait
	choose menu "Tell me about treasures" "Cursed coins" "Help is needed?"
	case 1
		dialog "[Pirate]"
		dialog "What treasures? Ah, okay..."
		dialog "I haven't been able to find "
		dialog "anything for several days."
		wait
		dialog "[Pirate]"
		dialog "You may have noticed that "
		dialog "the local pirates have begun "
		dialog "internecine showdowns."
		dialog "But they often come across both "
		dialog "merchants and ordinary wanderers."
		wait
		dialog "[Pirate]"
		dialog "Therefore, recently, many"
		dialog "sailors and merchants hide"
		dialog "their wealth in chests... "
		dialog "Until better times."
		wait
		dialog "[Pirate]"
		dialog "And... I'm trying to find them,"
		dialog "he-he. If you are lucky enough,"
		dialog "you can find something too."
		close
		return
	break
	case 2
		dialog "[Pirate]"
		dialog "Ah... There is such a legend..."
		dialog "Some time ago,"
		dialog "when there were more pirates,"
		dialog "than ordinary sailors,"
		dialog "a ship full of gold"
		dialog "was sailing across the ocean..."
		wait
		dialog "[Pirate]"
		dialog "It was gold taken away from"
		dialog "the poor and hard workers"
		dialog "from the land. The villainous"
		dialog "sailors who took it away were "
		dialog "pleased at first. They were "
		dialog "wasting it on a dissolute life."
		wait
		dialog "[Pirate]"
		dialog "But soon ... The sea ceased"
		dialog "to delight them ... Rum and food"
		dialog "no longer brought pleasure,"
		dialog "and they truly became"
		dialog "insensitive creatures."
		wait
		dialog "[Pirate]"
		dialog "The coins were cursed by"
		dialog "people from whom it was stolen,"
		dialog "and only a person who collects"
		dialog "five hundred of these gold"
		dialog "coins and donates them to the poor"
		dialog "will remove the curse from this gold."
		wait
		dialog "[Pirate]"
		dialog "...I would like to become the hero"
		dialog "of this legend. But for this "
		dialog "I need to collect these 500 cursed coins..."
		wait
		dialog "[Pirate]"
		dialog "If you bring coins, I'll give you"
		dialog "a real pirate cocked hat!"
		dialog "This is, of course, a strange offer"
		dialog "for 500 gold coins..."
		wait
		dialog "[Pirate]"
		dialog "But then you can contribute to "
		dialog "a good cause! And what can "
		dialog "you do with these cursed coins?..."
		wait
		choose menu "Can I try on a hat?" "Can I buy a pirate hat?" "I don't want a pirate hat..."
            case 1
                if (v[jp_event63] > 4)
                    dialog "[Pirate]"
                    dialog "Wait a minute..."
                    dialog "You have already rented"
                    dialog "this hat 5 times!"
                    dialog "I think you don't need"
                    dialog "to bring Cursed Coins anymore."
                    wait
                    dialog "[Pirate]"
                    dialog "I can't believe..."
                    dialog "You and I will finally remove"
                    dialog "the curse from this gold..."
                    dialog "I will take it upon myself"
                    dialog "to distribute them to the poor."
                    wait
                    dialog "[Pirate]"
                    dialog "And here is my pirate cocked hat."
                    dialog "You deserve it."
                    setitem jp_event63 0
                    getitem C_Pirate_Bandana 1 
                    close
                    return
                else
                    dialog "[Pirate]"
                    dialog "Well, I can give it for a while..."
                    dialog "But I can't trust "
                    dialog "it to just anyone..."
                    wait
                    dialog "[Pirate]"
                    dialog "Rent will cost 100 Cursed Coins."
                    dialog "But if you are going to buy " 
                    dialog "this hat in the future,"
                    dialog "it will cost 100 coins less."
                    dialog "Do you want to rent?"
                    wait
                    choose menu "Rent a hat (100 Cursed Coins)" "Cancel "
                    case 1
                        if (v[Gold_Chocoin] > 99)
                            dropitem Gold_Chocoin 100
                            RentItem C_Pirate_Bandana 86400 0 0 0 0 0 
                            getitem jp_event63 1
                            dialog "[Pirate]"
                            dialog "Here you go. And remember"
                            dialog "that it's only for one day."
                            close
                            return
                        else
                            dialog "[Pirate]"
                            dialog "You don't have enough coins."
                            dialog "Although I'm not good at "
                            dialog "arithmetic, I count "
                            dialog "the coins as they should be. "
                            close
                            return
                        endif
                    break
                    case 2
                        close
                        return
                    break
                    endchoose
				endif
			break
            case 2
                if (v[jp_event63] > 4)
                    dialog "[Pirate]"
                    dialog "Wait a minute..."
                    dialog "You have already rented"
                    dialog "this hat 5 times!"
                    dialog "I think you don't need"
                    dialog "to buy this hat."
                    wait
                    dialog "[Pirate]"
                    dialog "I can't believe..."
                    dialog "You and I will finally remove"
                    dialog "the curse from this gold..."
                    dialog "I will take it upon myself"
                    dialog "to distribute them to the poor."
                    wait
                    dialog "[Pirate]"
                    dialog "And here is my pirate cocked hat."
                    dialog "You deserve it."
                    setitem jp_event63 0
                    getitem C_Pirate_Bandana 1 
                    close
                    return
                else
                    var rent_count = v[jp_event63]
                    var rent_discount = rent_count * 100
                    var hat_cost = 500 - rent_discount
                    dialog "[Pirate]"
                    dialog "Do you remember that you "
                    dialog "have to bring at least 500"
                    dialog "Cursed Coins?"
                    if (hat_cost < 500)
                    dialog "But you rented this hat"
                    dialog ""+rent_count+" times, so I can give it"
                    dialog "to you for "+hat_cost+" coins."
                    endif
                    choose menu "Buy a hat ("+hat_cost+" coins)" "Cancel"
                    case 1
                        if (v[Gold_Chocoin] >= hat_cost)
                            dialog "[Pirate]"
                            dialog "I can't believe..."
                            dialog "You and I will finally remove"
                            dialog "the curse from this gold..."
                            dialog "I will take it upon myself"
                            dialog "to distribute them to the poor."
                            wait
                            dialog "[Pirate]"
                            dialog "And here is my pirate cocked hat."
                            dialog "You deserve it."
                            dropitem Gold_Chocoin hat_cost
                            setitem jp_event63 0
                            getitem C_Pirate_Bandana 1 
                            close
                            return
                        else
                            dialog "[Pirate]"
                            dialog "You don't have enough coins."
                            dialog "Although I'm not good at "
                            dialog "arithmetic, I count "
                            dialog "the coins as they should be. "
                            close
                            return
                        endif
                    break
                    case 2
                        close
                        return
                    break
                    endchoose
                endif
            break
            case 3
			    dialog "[Pirate]"
				dialog "If you don't need it, and neither"
				dialog "do the pirate hat,"
				dialog "then I can exchange them "
				dialog "for several bottles of rum,"
				dialog "one per 5 Cursed coins."
				wait
				choose menu "I want to exchange " "I will keep "
				case 1
				    dialog "[Pirate]"
                    dialog "How many Bottles of Rum do you want to get?"
                    dlgwrite 1 500
                    if input == 0
                        dialog "[Pirate]"
                        dialog "Well, right."
                        close
                        return
                    elseif error
                        dialog "[Pirate]"
                        dialog "So do you want to exchange or not?"
                        close
                        return
                    else
                        var rum_cost = input * 5
                        if (v[Gold_Chocoin] >= rum_cost)
                        var weight_check = GetInventoryRemainCount 23660 input
                        if ((weight_check == 2)|(weight_check == 3))
                            dialog "[Pirate]"
                            dialog "Your inventory is full."
                            close
                            return
                        else
                            dialog "[Pirate]"
                            dialog "Here you go. Your choice, of course... "
                            dropitem Gold_Chocoin rum_cost
                            getitem Dogly_Bottle_Z input
                            close
                            return
                        endif
                        else
                            dialog "[Pirate]"
                            dialog "You don't have enough coins."
                            close
                            return
                        endif
                    endif
				break
				case 2
				    dialog "[Pirate]"
                    dialog "Well, right."
                    close
                    return
				break
				endchoose
			break
		endchoose
	break
	case 3
		var pirate_{quest} = isbegin_quest {quest}
		var hunt_check = checkquest_hunting {quest}
		if (pirate_{quest} == 0)
			dialog "[Pirate]"
			dialog "Actually, yes. It would be nice"
			dialog "if you liberated this area "
			dialog "from the creatures."
			dialog "My team and I just found here..."
			dialog "It doesn't matter what."
			wait
			choose menu "I will take it"
				case 1
					dialog "[Pirate]"
					dialog "Nice."
					dialog "500 creatures will be enough."
					dialog "Of course, I will not leave you without a reward."
					setquest {quest}
					close
					return
				break
			endchoose
		elseif (pirate_{quest} == 1)
			if (hunt_check == 2)
			    var weight_check = GetInventoryRemainCount 1301 2
                if ((weight_check == 2)|(weight_check == 3))
                    dialog "[Pirate]"
                    dialog "Free up some space in "
                    dialog "your inventory and return. "
                    close
                    return
                endif
				dialog "[Pirate]"
				dialog "Great job! A couple of bottles"
				dialog "of our rum will brighten up your evening."
				completequest {quest}
				getitem Comp_Glass_Of_Illusion 10
				getitem Dogly_Bottle_Z 10
				getitem Gold_Chocoin 20
				wait
				dialog "[Pirate]"
				dialog "Also, I found some coins "
				dialog "that you will need if you want "
				dialog "the pirate cocked hat. "
				close
				return
			else
				dialog "[Pirate]"
				dialog "Need help only in liberating "
				dialog "the territory. Come back "
				dialog "when you finish the task."
				close
				return
			endif
		else
			dialog "[Pirate]"
			dialog "Thanks, but no more help is needed here."
			close
			return
		endif
	break
	endchoose
return

"""
questmission_pattern = \
    """quest [
	quest_info ({quest}, "Pirate's trader quest")
	hunt ("{quest_mob}", 500)
]
"""
quest_pattern = \
    """{quest}#Pirate's Pact#SG_FEEL#QUE_NOIMAGE#
You and Pirate have come to an agreement. Kill 500 ^000077{mob_name}^000000 to get a reward.#
Defeat monsters#
"""
treasure_text = ''
trader_text = ''
quests_text = ''
quests_mission = ''

for location in locations:
    one = re.split(r'\s+', location)
    map = one[0]
    mark_1_x = one[1]
    mark_1_y = one[2]
    mark_2_x = one[3]
    mark_2_y = one[4]
    mark_3_x = one[5]
    mark_3_y = one[6]
    trader_x = one[7]
    trader_y = one[8]
    mob_1_x_plus = str(int(mark_1_x) + 2)
    mob_1_x_minus = str(int(mark_1_x) - 2)
    mob_1_y_plus = str(int(mark_1_y) + 2)
    mob_1_y_minus = str(int(mark_1_y) - 2)
    mob_2_x_plus = str(int(mark_2_x) + 2)
    mob_2_x_minus = str(int(mark_2_x) - 2)
    mob_2_y_plus = str(int(mark_2_y) + 2)
    mob_2_y_minus = str(int(mark_2_y) - 2)
    mob_3_x_plus = str(int(mark_3_x) + 2)
    mob_3_x_minus = str(int(mark_3_x) - 2)
    mob_3_y_plus = str(int(mark_3_y) + 2)
    mob_3_y_minus = str(int(mark_3_y) - 2)
    treasure_1_x_plus = str(int(mark_1_x) + 7)
    treasure_1_x_minus = str(int(mark_1_x) - 7)
    treasure_1_y_plus = str(int(mark_1_y) + 7)
    treasure_1_y_minus = str(int(mark_1_y) - 7)
    treasure_2_x_plus = str(int(mark_2_x) + 7)
    treasure_2_x_minus = str(int(mark_2_x) - 7)
    treasure_2_y_plus = str(int(mark_2_y) + 7)
    treasure_2_y_minus = str(int(mark_2_y) - 7)
    treasure_3_x_plus = str(int(mark_3_x) + 7)
    treasure_3_x_minus = str(int(mark_3_x) - 7)
    treasure_3_y_plus = str(int(mark_3_y) + 7)
    treasure_3_y_minus = str(int(mark_3_y) - 7)
    trader_ang = one[9]
    quest = one[10]
    quest_mob = one[11]
    print(quest_mob)
    for mobdef in mobdefs:
        mobdef = mobdef.strip()
        if re.search(mobdef_pattern, mobdef):
            mob_dbname = re.search(mobdef_pattern, mobdef).group(1)
            if mob_dbname == quest_mob: mob_name = re.search(mobdef_pattern, mobdef).group(2).replace('\"', '')
        else:
            pass
    new_treasure = treasure_pattern.format(map=map,
                                           mark_1_x=mark_1_x,
                                           mark_1_y=mark_1_y,
                                           mark_2_x=mark_2_x,
                                           mark_2_y=mark_2_y,
                                           mark_3_x=mark_3_x,
                                           mark_3_y=mark_3_y,
                                           mob_1_x_plus=mob_1_x_plus,
                                           mob_1_x_minus=mob_1_x_minus,
                                           mob_1_y_plus=mob_1_y_plus,
                                           mob_1_y_minus=mob_1_y_minus,
                                           mob_2_x_plus=mob_2_x_plus,
                                           mob_2_x_minus=mob_2_x_minus,
                                           mob_2_y_plus=mob_2_y_plus,
                                           mob_2_y_minus=mob_2_y_minus,
                                           mob_3_x_plus=mob_3_x_plus,
                                           mob_3_x_minus=mob_3_x_minus,
                                           mob_3_y_plus=mob_3_y_plus,
                                           mob_3_y_minus=mob_3_y_minus,
                                           treasure_1_x_plus=treasure_1_x_plus,
                                           treasure_1_x_minus=treasure_1_x_minus,
                                           treasure_1_y_plus=treasure_1_y_plus,
                                           treasure_1_y_minus=treasure_1_y_minus,
                                           treasure_2_x_plus=treasure_2_x_plus,
                                           treasure_2_x_minus=treasure_2_x_minus,
                                           treasure_2_y_plus=treasure_2_y_plus,
                                           treasure_2_y_minus=treasure_2_y_minus,
                                           treasure_3_x_plus=treasure_3_x_plus,
                                           treasure_3_x_minus=treasure_3_x_minus,
                                           treasure_3_y_plus=treasure_3_y_plus,
                                           treasure_3_y_minus=treasure_3_y_minus)
    treasure_text += new_treasure
    new_trader = trader_pattern.format(map=map,
                                       trader_x=trader_x,
                                       trader_y=trader_y,
                                       trader_ang=trader_ang,
                                       quest=quest,
                                       quest_mob=quest_mob)
    trader_text += new_trader
    new_quest = quest_pattern.format(quest=quest,
                                     mob_name=mob_name)
    quests_text += new_quest
    new_questmission = questmission_pattern.format(quest=quest,
                                                   quest_mob=quest_mob)
    quests_mission += new_questmission

with open('questmission_eu.txt', 'w', encoding='utf-8') as file:
    file.write(quests_mission)

with open('questid2display_eu.txt', 'w', encoding='utf-8') as file:
    file.write(quests_text)

with open('treasures_eu.sc', 'w', encoding='utf-8') as file:
    file.write(treasure_text)

with open('traders_eu.sc', 'w', encoding='utf-8') as file:
    file.write(trader_text)
print("Готово!")
