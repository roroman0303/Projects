import re

mobdef_pattern = r'^\s*mob\s+(\S+)\s+(".+")\s+\S+'

with open('maps.txt', 'r') as file:
    locations = file.read().splitlines()

with open('D:/RO/rot/zone/scriptdata/mobdef.sc', 'r') as file:
    mobdefs = file.read().splitlines()

treasure_pattern = \
"""// ================[{map}]======================
npc "{map}" "#{map}_control" HIDDEN_NPC 1 1 5 0 0
OnInit:
	disablenpc "Метка#{map}_1"
	disablenpc "Сундук#{map}_1"
	disablenpc "#Aura_{map}_1"
	disablenpc "Метка#{map}_2"
	disablenpc "Сундук#{map}_2"
	disablenpc "#Aura_{map}_2"
	disablenpc "Метка#{map}_3"
	disablenpc "Сундук#{map}_3"
	disablenpc "#Aura_{map}_3"
	cmdothernpc "#{map}_control" "spawn"
return
OnCommand: "spawn"
	var place = rand 1 3
	if (place == 1)
		enablenpc "Метка#{map}_1"
	elseif (place == 2)
		enablenpc "Метка#{map}_2"
	else
		enablenpc "Метка#{map}_3"
	endif
return
OnCommand: "found"
	disablenpc "Метка#{map}_1"
	disablenpc "Метка#{map}_2"
	disablenpc "Метка#{map}_3"
	InitTimer
return
OnTimer: 10000
	disablenpc "Сундук#{map}_1"
	disablenpc "#Aura_{map}_1"
	disablenpc "Сундук#{map}_2"
	disablenpc "#Aura_{map}_2"
	disablenpc "Сундук#{map}_3"
	disablenpc "#Aura_{map}_3"
return
OnTimer: 600000
	cmdothernpc "#{map}_control" "spawn"
	stoptimer
return
npc "{map}" "Сундук#{map}_1" 4_TREASURE_BOX {mark_1_x} {mark_1_y} 5 0 0
npc "{map}" "#Aura_{map}_1" 4_ENERGY_BLACK {mark_1_x} {mark_1_y} 5 0 0
npc "{map}" "Метка#{map}_1" 4_CRACK {mark_1_x} {mark_1_y} 5 0 0
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
		cmdothernpc "Метка#{map}_1" "zombie"
	else
		cmdothernpc "Метка#{map}_1" "treasure"
	endif
	cmdothernpc "#{map}_control" "found"
return	
OnCommand: "zombie"
	callmonster "{map}" E_ZOMBIE_TREASURE "Душа пирата " {mob_1_x_minus} {mark_1_y}
	callmonster "{map}" E_ZOMBIE_TREASURE "Душа пирата " {mob_1_x_plus} {mark_1_y}
	callmonster "{map}" E_ZOMBIE_TREASURE "Душа пирата " {mark_1_x} {mob_1_y_plus}
	callmonster "{map}" E_ZOMBIE_TREASURE "Душа пирата " {mark_1_x} {mob_1_y_minus}
	InitTimer
return
OnTimer: 10000
	resetmymob
	stoptimer
return
OnCommand: "treasure"
	enablenpc "Сундук#{map}_1"
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
npc "{map}" "Сундук#{map}_2" 4_TREASURE_BOX {mark_2_x} {mark_2_y} 5 0 0
npc "{map}" "#Aura_{map}_2" 4_ENERGY_BLACK {mark_2_x} {mark_2_y} 5 0 0
npc "{map}" "Метка#{map}_2" 4_CRACK {mark_2_x} {mark_2_y} 5 0 0
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
		cmdothernpc "Метка#{map}_2" "zombie"
	else
		cmdothernpc "Метка#{map}_2" "treasure"
	endif
	cmdothernpc "#{map}_control" "found"
return	
OnCommand: "zombie"
	callmonster "{map}" E_ZOMBIE_TREASURE "Душа пирата " {mob_2_x_minus} {mark_2_y}
	callmonster "{map}" E_ZOMBIE_TREASURE "Душа пирата " {mob_2_x_plus} {mark_2_y}
	callmonster "{map}" E_ZOMBIE_TREASURE "Душа пирата " {mark_2_x} {mob_2_y_plus}
	callmonster "{map}" E_ZOMBIE_TREASURE "Душа пирата " {mark_2_x} {mob_2_y_minus}
	InitTimer
return
OnTimer: 10000
	resetmymob
	stoptimer
return
OnCommand: "treasure"
	enablenpc "Сундук#{map}_2"
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
npc "{map}" "Сундук#{map}_3" 4_TREASURE_BOX {mark_3_x} {mark_3_y} 5 0 0
npc "{map}" "#Aura_{map}_3" 4_ENERGY_BLACK {mark_3_x} {mark_3_y} 5 0 0
npc "{map}" "Метка#{map}_3" 4_CRACK {mark_3_x} {mark_3_y} 5 0 0
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
		cmdothernpc "Метка#{map}_3" "zombie"
	else
		cmdothernpc "Метка#{map}_3" "treasure"
	endif
	cmdothernpc "#{map}_control" "found"
return	
OnCommand: "zombie"
	callmonster "{map}" E_ZOMBIE_TREASURE "Душа пирата " {mob_3_x_minus} {mark_3_y}
	callmonster "{map}" E_ZOMBIE_TREASURE "Душа пирата " {mob_3_x_plus} {mark_3_y}
	callmonster "{map}" E_ZOMBIE_TREASURE "Душа пирата " {mark_3_x} {mob_3_y_plus}
	callmonster "{map}" E_ZOMBIE_TREASURE "Душа пирата " {mark_3_x} {mob_3_y_minus}
	InitTimer
return
OnTimer: 10000
	resetmymob
	stoptimer
return
OnCommand: "treasure"
	enablenpc "Сундук#{map}_3"
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
npc "{map}" "Пират#{map}" 4_CAT_SAILOR2 {trader_x} {trader_y} {trader_ang} 0 0
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
	Talk2me "Пират#{map}" "По карте всё сходится... Ну и где этот сундук?"
return
OnClick:
	dialog "[Пират]"
	dialog "Если бы я умел читать карту, "
	dialog "давно бы уже капитаном стал..."
	dialog "О! Привет. Ищешь кого-то?"
	dialog "Или, может быть, что-то..."
	wait
	choose menu "Расскажи о сокровищах " "О проклятых монетах " "Нужна помощь?"
	case 1
		dialog "[Пират]"
		dialog "Какие сокровища? Ах, ладно..."
		dialog "Я уже несколько дней "
		dialog "ничего не могу найти."
		wait
		dialog "[Пират]"
		dialog "Ты, наверное, мог заметить,"
		dialog "что здешние пираты начали "
		dialog "междуусобные разборки."
		dialog "Но им под руку часто попадаются "
		dialog "и торговцы, и обычные странники."
		wait
		dialog "[Пират]"
		dialog "Поэтому, в последнее время много "
		dialog "моряков и торговцев прячут свои "
		dialog "богатства в сундуках... "
		dialog "До лучших времён."
		wait
		dialog "[Пират]"
		dialog "Ну а я пытаюсь их найти, хе-хе."
		dialog "Если ты достаточно удачлив, "
		dialog "то тоже сможешь найти что-нибудь."
		close
		return
	break
	case 2
		dialog "[Пират]"
		dialog "А... Ходит такая легенда... "
		dialog "Некоторое время назад,"
		dialog "когда пиратов было больше,"
		dialog "чем обычных моряков,"
		dialog "корабль с полным трюмом "
		dialog "золота плыл через океан..."
		wait
		dialog "[Пират]"
		dialog "Это было золото, отнятое "
		dialog "у бедняков и трудяг с суши."
		dialog "Моряки-негодяи, что отняли "
		dialog "его, сначала были довольны "
		dialog "и тратили его на распутную "
		dialog "жизнь. "
		wait
		dialog "[Пират]"
		dialog "Но вскоре... Их перестало "
		dialog "радовать море... "
		dialog "Ром и еда больше не доставляли "
		dialog "удовольствия, а сами они "
		dialog "стали бесчувственными "
		dialog "существами."
		wait
		dialog "[Пират]"
		dialog "Монеты были прокляты людьми,"
		dialog "у которых оно было украдено."
		dialog "И только человек, который "
		dialog "соберёт пять сотен эти золотых "
		dialog "монет и безвозмездно "
		dialog "отдаст их беднякам, снимет "
		dialog "проклятье с этого золота."
		wait
		dialog "[Пират]"
		dialog "...Хотел бы я стать героем "
		dialog "этой легенды. Но для этого "
		dialog "мне нужно собрать эти 500 "
		dialog "проклятых монет... "
		wait
		dialog "[Пират]"
		dialog "Если ты принесёшь монеты,"
		dialog "я дам тебе настоящую "
		dialog "пиратскую треуголку! "
		dialog "За 500 золотых монет "
		dialog "это, конечно, странное "
		dialog "предложение... "
		wait
		dialog "[Пират]"
		dialog "Но зато ты сможешь "
		dialog "поспособствовать благому "
		dialog "делу! Да и зачем тебе "
		dialog "проклятые монеты?... "
		wait
		choose menu "Могу ли я примерить шляпу?" "Могу ли я купить шляпу?" "Мне не нужна шляпа..."
			case 1
			    if (v[jp_event63] > 4)
			        dialog "[Пират]"
                    dialog "Погоди-ка минутку..."
                    dialog "Ты ведь брал её в аренду "
                    dialog "уже 5 раз! Получается, что "
                    dialog "мы уже собрали 500 Проклятых "
                    dialog "монет."
                    wait
                    dialog "[Пират]"
                    dialog "Поверить не могу..."
                    dialog "Мы с тобой наконец "
                    dialog "снимем проклятье с этого "
                    dialog "золота... Я возьму на себя "
                    dialog "их раздачу беднякам. "
                    wait
                    dialog "[Пират]"
                    dialog "А тебе, конечно, я даю свою "
                    dialog "пиратскую треуголку, как "
                    dialog "и обещал."
                    setitem jp_event63 0
                    getitem C_Pirate_Bandana 1 
                    close
                    return
			    else
			        dialog "[Пират]"
			        dialog "Ну, я могу дать её на время..."
                    dialog "Но не могу же я доверять "
                    dialog "её кому попало. "
                    wait
                    dialog "[Пират]"
                    dialog "Аренда шляпы будет стоить "
                    dialog "100 Проклятых монет. Но зато " 
                    dialog "если ты захочешь купить её "
                    dialog "в будущем, тебе останется "
                    dialog "принести на 100 монет меньше."
                    dialog "Что думаешь?"
                    wait
                    choose menu "Аренда (100 Проклятых монет)" "Отмена "
                    case 1
                        if (v[Gold_Chocoin] > 99)
                            dropitem Gold_Chocoin 100
                            RentItem C_Pirate_Bandana 86400 0 0 0 0 0 
                            getitem jp_event63 1
                            dialog "[Пират]"
                            dialog "Держи. И помни, "
                            dialog "что она только на один день."
                            close
                            return
                        else
                            dialog "[Пират]"
                            dialog "У тебя не хватает зени."
                            dialog "Я хоть и не силён в "
                            dialog "арифметике, но монеты "
                            dialog "считаю как надо. "
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
                    dialog "[Пират]"
                    dialog "Погоди-ка минутку..."
                    dialog "Ты ведь брал её в аренду "
                    dialog "уже 5 раз! Получается, что "
                    dialog "мы уже собрали 500 Проклятых "
                    dialog "монет."
                    wait
                    dialog "[Пират]"
                    dialog "Поверить не могу..."
                    dialog "Мы с тобой наконец "
                    dialog "снимем проклятье с этого "
                    dialog "золота... Я возьму на себя "
                    dialog "их раздачу беднякам. "
                    wait
                    dialog "[Пират]"
                    dialog "А тебе, конечно, я даю свою "
                    dialog "пиратскую треуголку, как "
                    dialog "и обещал."
                    setitem jp_event63 0
                    getitem C_Pirate_Bandana 1 
                    close
                    return
                else
                    var rent_count = v[jp_event63]
                    var rent_discount = rent_count * 100
                    var hat_cost = 500 - rent_discount
                    dialog "[Пират]"
                    dialog "Для её получения, нужно собрать "
                    dialog "минимум 500 Проклятых монет."
                    if (hat_cost < 500)
                    dialog "Но ты уже брал у меня эту шляпу "
                    dialog "несколько раз в аренду, поэтому "
                    dialog "я готов предложить тебе её за "
                    dialog ""+hat_cost+" монет."
                    endif
                    choose menu "Купить ("+hat_cost+" монет)" "Отмена "
                    case 1
                        if (v[Gold_Chocoin] >= hat_cost)
                            dialog "[Пират]"
                            dialog "Поверить не могу..."
                            dialog "Мы с тобой наконец "
                            dialog "снимем проклятье с этого "
                            dialog "золота... Я возьму на себя "
                            dialog "их раздачу беднякам. "
                            wait
                            dialog "[Пират]"
                            dialog "А тебе, конечно, я даю свою "
                            dialog "пиратскую треуголку, как "
                            dialog "и обещал."
                            dropitem Gold_Chocoin hat_cost
                            setitem jp_event63 0
                            getitem C_Pirate_Bandana 1 
                            close
                            return
                        else
                            dialog "[Пират]"
                            dialog "У тебя не хватает зени."
                            dialog "Я хоть и не силён в "
                            dialog "арифметике, но монеты "
                            dialog "считаю как надо. "
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
			    dialog "[Пират]"
				dialog "Если тебе они не нужны, "
				dialog "и пиратская шляпа тоже,"
				dialog "то я могу обменять их на "
				dialog "несколько бутылок рома, "
				dialog "по одной за 5 монет."
				wait
				choose menu "Хочу обменять " "Оставлю "
				case 1
				    dialog "[Пират]"
                    dialog "Сколько бутылок рома ты хочешь получить? "
                    dlgwrite 1 500
                    if input == 0
                        dialog "[Пират]"
                        dialog "Ну и правильно."
                        close
                        return
                    elseif error
                        dialog "[Пират]"
                        dialog "Так ты хочешь обменять или нет?"
                        close
                        return
                    else
                        var rum_cost = input * 5
                        if (v[Gold_Chocoin] >= rum_cost)
                        var weight_check = GetInventoryRemainCount 23660 input
                        if ((weight_check == 2)|(weight_check == 3))
                            dialog "[Пират]"
                            dialog "У тебя переполнен инвентарь."
                            close
                            return
                        else
                            dialog "[Пират]"
                            dialog "Держи. Дело твоё, конечно... "
                            dropitem Gold_Chocoin rum_cost
                            getitem Dogly_Bottle_Z input
                            close
                            return
                        endif
                        else
                            dialog "[Пират]"
                            dialog "У тебя не хватает монет. "
                            close
                            return
                        endif
                    endif
				break
				case 2
				    dialog "[Пират]"
                    dialog "Ну и правильно."
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
			dialog "[Пират]"
			dialog "Вообще-то, да. Было бы "
			dialog "славно, если бы ты слегка "
			dialog "освободил этот район от существ."
			dialog "Мы с командой как раз нашли "
			dialog "здесь... А, впрочем, неважно что."
			wait
			choose menu "Я возьмусь "
				case 1
					dialog "[Пират]"
					dialog "Славно."
					dialog "500 существ будет достаточно."
					dialog "Конечно, я не оставлю тебя "
					dialog "без награды."
					setquest {quest}
					close
					return
				break
			endchoose
		elseif (pirate_{quest} == 1)
			if (hunt_check == 2)
			    var weight_check = GetInventoryRemainCount 1301 2
                if ((weight_check == 2)|(weight_check == 3))
                    dialog "[Пират]"
                    dialog "Освободи немного места "
                    dialog "в инвентаре и возвращайся. "
                    close
                    return
                endif
				dialog "[Пират]"
				dialog "Отличная работа!"
				dialog "Пару бутылочек нашего рома "
				dialog "скрасят твой вечер. "
				completequest {quest}
				getitem Comp_Glass_Of_Illusion 10
				getitem Dogly_Bottle_Z 10
				getitem Gold_Chocoin 20
				wait
				dialog "[Пират]"
				dialog "Также, я нашёл немного "
				dialog "золотых монет, которые "
				dialog "понадобятся тебе, если ты "
				dialog "захочешь пиратскую треуголку."
				close
				return
			else
				dialog "[Пират]"
				dialog "Нужна помощь только в очистке "
				dialog "территории. Возвращайся, "
				dialog "когда закончишь задание."
				close
				return
			endif
		else
			dialog "[Пират]"
			dialog "Спасибо, но помощь здесь "
			dialog "больше не нужна. "
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
    """{quest}#Поручение пирата#SG_FEEL#QUE_NOIMAGE#
Пират попросил вас очистить территорию для поисков его команды. Уничтожьте 500 ^000077{mob_name}^000000, чтобы получить награду.#
Очистить территорию#
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

with open('questmission_ru.txt', 'w', encoding='Windows-1251') as file:
    file.write(quests_mission)

with open('questid2display_ru.txt', 'w', encoding='Windows-1251') as file:
    file.write(quests_text)

with open('treasures_ru.sc', 'w', encoding='Windows-1251') as file:
    file.write(treasure_text)

with open('traders_ru.sc', 'w', encoding='Windows-1251') as file:
    file.write(trader_text)
print("Готово!")
