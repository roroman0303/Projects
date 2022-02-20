


MD_Npc "1@drdo" "Язычник#7e102" 4_F_SHADOWCHASER 59 59 3 5 5
OnTouch:
	var str102 = GetMDNpcName "Язычник#7e102"
	var str103 = GetMDNpcName "Язычник#7e103"
	TalkShow str102 "Я найду сокровище!"
	DelayTime 1000
	disablenpc str102
	enablenpc str103
	var nya_map01 = GetMDMapName "1@drdo"
	Navigation_Active nya_map01 0 000 1 69 59
return


MD_Npc "1@drdo" "Язычник#7e103" 4_F_SHADOWCHASER 74 47 3 5 5
OnInit:
	var str103 = GetMDNpcName "Язычник#7e103"
	disablenpc str103
return

OnTouch:
	var str103 = GetMDNpcName "Язычник#7e103"
	TalkShow str103 "Где сокровище?"
	DelayTime 1000
	disablenpc str103
	var nya_map01 = GetMDMapName "1@drdo"
	Navigation_Active nya_map01 0 000 1 94 63
return


MD_Npc "1@drdo" "язычник#7e101" 4_F_SHADOWCHASER 94 63 3 0 0
OnClick:
 var str101 = GetMDNpcName "язычник#7e101"
 var str102 = GetMDNpcName "Язычник#7e102"
 var str103 = GetMDNpcName "Язычник#7e103"
 var fnpc101 = GetMDNpcName "шкатулка с сокровищами#7e101"
 var mon101 = GetMDNpcName "пн#7e101"
 var men_t = rand 1 2
 if (men_t == 1)
	 TalkShow str102 "Я найду сокровище!"
	 DelayTime 1500
	 TalkShow str101 "Мама, подожди минутку!"
	 DelayTime 1500
	 TalkShow str101 "Маркел, ты выйдешь за меня замуж, когда я вернусь успешным?"
	 DelayTime 1500
	 TalkShow "" "Может быть, Валери?"
	 DelayTime 1500
	 TalkShow str101 "кто, кто? Маркел? Мама? Ты здесь, чтобы найти меня?"
	 DelayTime 1500
	 TalkShow str101 "Блин, слишком влажно. Одинокий, уединенный. Я не могу выйти."
	 DelayTime 1500
	 TalkShow "" "Мисс Валери?"
	 DelayTime 1500
	 TalkShow str101 "Валери? кого вы ищете? Разве ты не пришел меня найти? Почему? почему я не смотрю "
	 DelayTime 1500
	 TalkShow str101 "я забыл Моя мать и Маркел забыли меня?"
	 DelayTime 1500
	 TalkShow str101 "не забывай меня пожалуйста."
	 DelayTime 1500
	 TalkShow "" "Я здесь, чтобы найти кого-нибудь еще. Вы когда-нибудь видели это?"
	 DelayTime 1500
	 TalkShow str101 "Нет, не ищи. Этот человек, должно быть, уже умер. был бы мертв!"
	 DelayTime 1500
	 TalkShow str101 "Не ищите! Этого человека тоже нужно забыть! Очень жаль, что забыли только меня!"
	 DelayTime 1500
	 TalkShow str101 "Мне жаль! Мне жаль!!"
 else
	 TalkShow str101 "деньги могут все Покупка сердец людей."
	 DelayTime 1500
	 TalkShow "" "Мисс Валери?"
	 DelayTime 1500
	 TalkShow str101 "Я заранее говорю! Вот и получил первый! Все сокровища здесь мои!"
	 DelayTime 1500
	 TalkShow "" "Меня не интересуют сокровища, я ищу людей "
	 DelayTime 1500
	 TalkShow str101 "Они должны быть похоронены в другом месте в поисках сокровищ. Но все сокровища здесь мои! Я нашел это первым!"
	 DelayTime 1500
	 TalkShow "" "Успойкойся."
	 DelayTime 1500
	 TalkShow str101 "Я собираюсь взять все это и плюнуть в лица игнорирующим меня!"
	 DelayTime 1500
	 TalkShow str101 "Все будут мне завидовать? это мое! Это все мое!"
	 DelayTime 1500
	 TalkShow "" "Все сокровища твои."
	 DelayTime 1500
	 TalkShow str101 "Конечно. Но почему ты здесь торчишь?"
	 DelayTime 1500
	 TalkShow "" "Вы видели Валери?"
	 DelayTime 1500
	 TalkShow str101 "Валери? Я не знаю такого человека. Но знаете, как отсюда выбраться? Я нашел клад... но не могу выбраться..."
	 DelayTime 1500
	 TalkShow str101 "Мне нужно показать свой успех тем, кто меня игнорирует, но я не могу выбраться отсюда!"
	 DelayTime 1500
	 TalkShow str101 "Я не могу отомстить! Так много сокровищ! Почему! Почему!"
	 DelayTime 1500
	 TalkShow str101 "Мне жаль! Мне жаль!!"
 endif
 cmdothernpc mon101 "call"
 cmdothernpc fnpc101 "off"
 disablenpc str101
 disablenpc str102
 disablenpc str103
return

MD_Npc "1@drdo" "пн#7e101" 4_RED_FLOWER 1 1 3 0 0

OnCommand: "call"
	resetmymob
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Мне жаль! Мне жаль!! Я должен все это оставить!"
	var nya_map01 = GetMDMapName "1@drdo"
	callmonster nya_map01 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 70 43
	callmonster nya_map01 E_MD_BOX_PUPPET "миньон в коробке " 78 42
	callmonster nya_map01 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 91 47
	callmonster nya_map01 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 101 49
	callmonster nya_map01 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 91 53
	callmonster nya_map01 E_MD_BOX_PUPPET "миньон в коробке " 84 52
	callmonster nya_map01 E_MD_BOX_PUPPET "миньон в коробке " 72 52
	callmonster nya_map01 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 63 55
	callmonster nya_map01 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 61 67
	callmonster nya_map01 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 70 70
	callmonster nya_map01 E_MD_BOX_PUPPET "миньон в коробке " 80 71
	callmonster nya_map01 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 89 76
	callmonster nya_map01 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 94 75
	callmonster nya_map01 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 77 83
	callmonster nya_map01 E_MD_BOX_PUPPET "миньон в коробке " 60 87
	callmonster nya_map01 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 69 99
	callmonster nya_map01 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 70 106
	callmonster nya_map01 E_MD_BOX_PUPPET "миньон в коробке " 62 102
	callmonster nya_map01 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 55 101
	callmonster nya_map01 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 48 100
	callmonster nya_map01 E_MD_BOX_PUPPET "миньон в коробке " 45 104
	callmonster nya_map01 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 43 110
	callmonster nya_map01 E_MD_BOX_PUPPET "миньон в коробке " 40 100
	callmonster nya_map01 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 40 107
return

OnMyMobDead:
 DelayTime 100
 var mon101 = GetMDNpcName "пн#7e101"
 var mon102 = GetMDNpcName "пн#7e102"
 
 if npcv mon101 [VAR_MYMOBCOUNT] < 1
	 cmdothernpc mon102 "on"
 endif
return

MD_Npc "1@drdo" "пн#7e102" 4_BLUE_FLOWER 3 1 3 0 0

OnCommand: "on"
 resetmymob
 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Несчастная душа материализуется и появляется."
 var nya_map01 = GetMDMapName "1@drdo"
 callmonster nya_map01 E_MD_DEPRESS_SOUL "несчастная душа " 94 63
 MonsterTalkShow "несчастная душа " "Все сокровища будут моими! Это все мое!"
return


OnMyMobDead:
 DelayTime 100
 var mon102 = GetMDNpcName "пн#7e102"
 var doo_r101 = GetMDNpcName "#7e101"
 
 if npcv mon102 [VAR_MYMOBCOUNT] < 1
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Увы... Прости... Я не хочу умереть с этим сокровищем...!"
	 DelayTime 1000
	 DelayTime 1000
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Иди... иди сюда... дверь открыта."
	 cmdothernpc doo_r101 "on"
 endif
 var nya_map01 = GetMDMapName "1@drdo"
 Navigation_Active nya_map01 0 000 1 57 106
return

MD_Warp "1@drdo" "#7e101" 57 106 3 3

OnInit:
	var doo_r101 = GetMDNpcName "#7e101"
	disablenpc doo_r101
return

OnCommand: "on"
	var doo_r101 = GetMDNpcName "#7e101"
	ShowEffect doo_r101 1013
	enablenpc doo_r101
return

OnTouch2:
	var nya_map01 = GetMDMapName "1@drdo"
	var str201 = GetMDNpcName "язычник#7e201"
	enablenpc str201
	moveto nya_map01 65 144
return


MD_Npc "1@drdo" "шкатулка с сокровищами#7e101" 4_TREASURE_BOX 62 65 3 0 0
OnCommand: "off"
	var fnpc101 = GetMDNpcName "шкатулка с сокровищами#7e101"
	var fnpc102 = GetMDNpcName "шкатулка с сокровищами#7e102"
	var fnpc103 = GetMDNpcName "шкатулка с сокровищами#7e103"
	var fnpc104 = GetMDNpcName "шкатулка с сокровищами#7e104"
	var fnpc105 = GetMDNpcName "шкатулка с сокровищами#7e105"
	var fnpc106 = GetMDNpcName "шкатулка с сокровищами#7e106"
	var fnpc107 = GetMDNpcName "шкатулка с сокровищами#7e107"
	var fnpc108 = GetMDNpcName "шкатулка с сокровищами#7e108"
	var fnpc109 = GetMDNpcName "шкатулка с сокровищами#7e109"
	var fnpc110 = GetMDNpcName "шкатулка с сокровищами#7e110"
	var fnpc111 = GetMDNpcName "шкатулка с сокровищами#7e111"
	var fnpc112 = GetMDNpcName "шкатулка с сокровищами#7e112"
	var fnpc113 = GetMDNpcName "шкатулка с сокровищами#7e113"
	var fnpc114 = GetMDNpcName "шкатулка с сокровищами#7e114"
	var fnpc115 = GetMDNpcName "шкатулка с сокровищами#7e115"
	var fnpc116 = GetMDNpcName "шкатулка с сокровищами#7e116"
	var fnpc117 = GetMDNpcName "шкатулка с сокровищами#7e117"
	var fnpc118 = GetMDNpcName "шкатулка с сокровищами#7e118"
	var fnpc119 = GetMDNpcName "шкатулка с сокровищами#7e119"
	disablenpc fnpc101
	disablenpc fnpc102
	disablenpc fnpc103
	disablenpc fnpc104
	disablenpc fnpc105
	disablenpc fnpc106
	disablenpc fnpc107
	disablenpc fnpc108
	disablenpc fnpc109
	disablenpc fnpc110
	disablenpc fnpc111
	disablenpc fnpc112
	disablenpc fnpc113
	disablenpc fnpc114
	disablenpc fnpc115
	disablenpc fnpc116
	disablenpc fnpc117
	disablenpc fnpc118
	disablenpc fnpc119
return

MD_Npc "1@drdo" "шкатулка с сокровищами#7e102" 4_TREASURE_BOX 75 67 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e103" 4_TREASURE_BOX 84 66 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e104" 4_TREASURE_BOX 93 68 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e105" 4_TREASURE_BOX 96 70 3 0 0
OnClick:
	var fnpc105 = GetMDNpcName "шкатулка с сокровищами#7e105"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Cardinal_Jewel_ 1
	endif
	disablenpc fnpc105
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e106" 4_TREASURE_BOX 96 93 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e107" 4_TREASURE_BOX 78 112 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e108" 4_TREASURE_BOX 75 111 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e109" 4_TREASURE_BOX 62 109 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e110" 4_TREASURE_BOX 45 113 3 0 0
OnClick:
	var fnpc110 = GetMDNpcName "шкатулка с сокровищами#7e110"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Blue_Jewel 1
	endif
	disablenpc fnpc110
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e111" 4_TREASURE_BOX 40 106 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e112" 4_TREASURE_BOX 39 103 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e113" 4_TREASURE_BOX 72 52 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e114" 4_TREASURE_BOX 84 51 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e115" 4_TREASURE_BOX 78 47 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e116" 4_TREASURE_BOX 74 43 3 0 0
OnClick:
	var fnpc116 = GetMDNpcName "шкатулка с сокровищами#7e116"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Seed_Of_Yggdrasil_ 3
	endif
	disablenpc fnpc116
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e117" 4_TREASURE_BOX 105 56 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e118" 4_TREASURE_BOX 77 77 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e119" 4_TREASURE_BOX 78 78 3 0 0







MD_Npc "1@drdo" "язычник#7e202" 4_M_RACHMAN2 65 162 3 5 5
OnTouch:
	var str202 = GetMDNpcName "язычник#7e202"
	var str203 = GetMDNpcName "язычник#7e203"
	TalkShow str202 "Увы, ненавижу идти !!!"
	DelayTime 1000
	disablenpc str202
	enablenpc str203
	var nya_map02 = GetMDMapName "1@drdo"
	Navigation_Active nya_map02 0 000 1 66 179
return


MD_Npc "1@drdo" "язычник#7e203" 4_M_RACHMAN2 66 179 3 5 5
OnInit:
	var str203 = GetMDNpcName "язычник#7e203"
	disablenpc str203
return

OnTouch:
	var str203 = GetMDNpcName "язычник#7e203"
	var str204 = GetMDNpcName "язычник#7e204"
	TalkShow str203 "Это опасно!!"
	DelayTime 1000
	disablenpc str203
	enablenpc str204
	var nya_map02 = GetMDMapName "1@drdo"
	Navigation_Active nya_map02 0 000 1 63 195
return


MD_Npc "1@drdo" "язычник#7e204" 4_M_RACHMAN2 63 195 3 5 5
OnInit:
	var str204 = GetMDNpcName "язычник#7e204"
	disablenpc str204
return

OnTouch:
	var str204 = GetMDNpcName "язычник#7e204"
	TalkShow str204 "что я сказал Ты сказал, что не хочешь идти !!"
	DelayTime 1000
	disablenpc str204
	var nya_map02 = GetMDMapName "1@drdo"
	Navigation_Active nya_map02 0 000 1 52 217
return


MD_Npc "1@drdo" "язычник#7e201" 4_M_RACHMAN2 52 217 3 0 0

OnInit:
	var str201 = GetMDNpcName "язычник#7e201"
	disablenpc str201
return

OnCommand: "on"
	var str201 = GetMDNpcName "язычник#7e201"
	enablenpc str201
return

OnClick:
 var str201 = GetMDNpcName "язычник#7e201"
 var str202 = GetMDNpcName "язычник#7e202"
 var str203 = GetMDNpcName "язычник#7e203"
 var str204 = GetMDNpcName "язычник#7e204"
 var fnpc201 = GetMDNpcName "шкатулка с сокровищами#7e201"
 var mon201 = GetMDNpcName "пн#7e201"
 var men_t = rand 1 2
 if (men_t == 1)
	 TalkShow str201 "Привет! Приятно с Вами познакомиться! Я давно никого не видел! Вы здесь, чтобы спасти? пожалуйста, вытащи меня "
	 DelayTime 1500
	 TalkShow str201 "Я здесь так долго, я думаю, что схожу с ума "
	 DelayTime 1500
	 TalkShow "" "Вы видели человека по имени Валери?"
	 DelayTime 1500
	 TalkShow str201 "нет? Я не знаю? Это первое имя, которое я когда-либо слышал Кстати, ты один?"
	 DelayTime 1500
	 TalkShow str201 "другие люди? Мне тоже придется взять с собой коллег "
	 DelayTime 1500
	 TalkShow str201 "ждать? мои коллеги? Куда ты ушел? Мы пошли по опасному маршруту, по которому обычно не ходим из-за срочного графика..."
	 DelayTime 1500
	 TalkShow str201 "Я был против... но все были против меня."
	 DelayTime 1500
	 TalkShow str201 "С другой стороны, после шторма я проснулся... Постой... Я пришел в себя...?"
	 DelayTime 1500
	 TalkShow str201 "Я... еще жив...? Как долго вы были без еды и воды?"
	 DelayTime 1500
	 TalkShow str201 "Я... мертв? Я... мертв? Это не моя вина...?"
	 DelayTime 1500
	 TalkShow str201 "Я определенно сказал идти безопасным путем, чтобы вернуться!"
	 DelayTime 1500
	 TalkShow str201 "Почему я должен умирать за капитана? Кто-то меня убил! Из-за кого-то другого !!"
	 DelayTime 1500
	 TalkShow str201 "Мне жаль! Мне жаль!!!"
 else
	 TalkShow str201 "Я знаю, что это за место. авантюрист там. Вас тоже ослепило сокровище?"
	 DelayTime 1500
	 TalkShow str201 "Но здесь нет сокровищ. Есть только отчаяние, страх и гордость."
	 DelayTime 1500
	 TalkShow "" "Я здесь, чтобы кого-нибудь найти."
	 DelayTime 1500
	 TalkShow str201 "Этот человек, должно быть, уже умер. Или, как и я, они получили ожерелье и вернулись живыми "
	 DelayTime 1500
	 TalkShow str201 "да, у меня есть ожерелье "
	 DelayTime 1500
	 TalkShow str201 "И они солгали, чтобы собрать людей и отправить их сюда. Ты ничего не можешь сделать, чтобы жить, верно?"
	 DelayTime 1500
	 TalkShow str201 "Но люди, которые хотели найти клад, посмели затащить меня сюда."
	 DelayTime 1500
	 TalkShow str201 "Как же мне повезло выжить один раз, но, думаю, мне это не понадобилось дважды."
	 DelayTime 1500
	 TalkShow str201 "Авантюрист, откажись от мысли о выживании слишком рано."
	 DelayTime 1500
	 TalkShow str201 "Но опять же, я не знаю. Вы тоже можете получить ожерелье."
	 DelayTime 1500
	 TalkShow str201 "Если бы меня и меня не привезли сюда, я мог бы спасти свою жизнь..."
	 DelayTime 1500
	 TalkShow str201 "Я сделал, я сделал, и меня тащили! Я хотел жить!"
	 DelayTime 1500
	 TalkShow str201 "Лгав всю жизнь, я мог бы спасти свою жизнь, даже если бы чувствовал себя виноватым!"
	 DelayTime 1500
	 TalkShow str201 "Меня привезли жадные люди! Вынужден принести!"
	 DelayTime 1500
	 TalkShow str201 "Мне жаль! Мне жаль!!"
 endif
 cmdothernpc mon201 "call"
 cmdothernpc fnpc201 "off"
 disablenpc str201
 disablenpc str202
 disablenpc str203
 disablenpc str204
return

MD_Npc "1@drdo" "пн#7e201" 4_RED_FLOWER 1 2 3 0 0

OnCommand: "call"
	resetmymob
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Мне жаль! Мне жаль! Я не хотел сюда приходить!"
	var nya_map02 = GetMDMapName "1@drdo"
	callmonster nya_map02 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 36 224
	callmonster nya_map02 E_MD_BOX_PUPPET "миньон в коробке " 36 211
	callmonster nya_map02 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 61 212
	callmonster nya_map02 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 84 212
	callmonster nya_map02 E_MD_BOX_PUPPET "миньон в коробке " 99 212
	callmonster nya_map02 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 73 214
	callmonster nya_map02 E_MD_BOX_PUPPET "миньон в коробке " 92 196
	callmonster nya_map02 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 77 196
	callmonster nya_map02 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 81 183
	callmonster nya_map02 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 71 184
	callmonster nya_map02 E_MD_BOX_PUPPET "миньон в коробке " 35 182
	callmonster nya_map02 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 49 167
	callmonster nya_map02 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 71 166
	callmonster nya_map02 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 62 165
	callmonster nya_map02 E_MD_BOX_PUPPET "миньон в коробке " 100 165
	callmonster nya_map02 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 83 155
	callmonster nya_map02 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 88 152
	callmonster nya_map02 E_MD_BOX_PUPPET "миньон в коробке " 83 145
	callmonster nya_map02 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 77 145
	callmonster nya_map02 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 66 157
	callmonster nya_map02 E_MD_BOX_PUPPET "миньон в коробке " 56 146
	callmonster nya_map02 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 49 150
	callmonster nya_map02 E_MD_BOX_PUPPET "миньон в коробке " 36 158
	callmonster nya_map02 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 34 165
return


OnMyMobDead:
 DelayTime 100
 var mon201 = GetMDNpcName "пн#7e201"
 var mon202 = GetMDNpcName "пн#7e202"
 
 if npcv mon201 [VAR_MYMOBCOUNT] < 1
	 cmdothernpc mon202 "on"
 endif
return

MD_Npc "1@drdo" "пн#7e202" 4_BLUE_FLOWER 3 2 3 0 0

OnCommand: "on"
 resetmymob
 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Несчастная душа материализуется и появляется."
 var nya_map01 = GetMDMapName "1@drdo"
 callmonster nya_map01 E_MD_DEPRESS_SOUL "несчастная душа " 52 217
 MonsterTalkShow "несчастная душа " "только ты идешь? возьми и меня! Я имею в виду, возьми это с собой!"
return


OnMyMobDead:
 DelayTime 100
 var mon202 = GetMDNpcName "пн#7e202"
 var doo_r201 = GetMDNpcName "#7e201"
 
 if npcv mon202 [VAR_MYMOBCOUNT] < 1
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Я тоже хотел выйти..."
	 DelayTime 1000
	 DelayTime 1000
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Иди... иди сюда... дверь открыта."
	 cmdothernpc doo_r201 "on"
 endif
 var nya_map02 = GetMDMapName "1@drdo"
 Navigation_Active nya_map02 0 000 1 111 212
return

MD_Warp "1@drdo" "#7e201" 111 212 2 2

OnInit:
	var doo_r201 = GetMDNpcName "#7e201"
	disablenpc doo_r201
return

OnCommand: "on"
	var doo_r201 = GetMDNpcName "#7e201"
	ShowEffect doo_r201 1013
	enablenpc doo_r201
return

OnTouch2:
	var nya_map02 = GetMDMapName "1@drdo"
	var str301 = GetMDNpcName "язычник#7e301"
	enablenpc str301
	moveto nya_map02 132 207
return

MD_Npc "1@drdo" "шкатулка с сокровищами#7e201" 4_TREASURE_BOX 32 163 3 0 0
OnCommand: "off"
	var fnpc201 = GetMDNpcName "шкатулка с сокровищами#7e201"
	var fnpc202 = GetMDNpcName "шкатулка с сокровищами#7e202"
	var fnpc203 = GetMDNpcName "шкатулка с сокровищами#7e203"
	var fnpc204 = GetMDNpcName "шкатулка с сокровищами#7e204"
	var fnpc205 = GetMDNpcName "шкатулка с сокровищами#7e205"
	var fnpc206 = GetMDNpcName "шкатулка с сокровищами#7e206"
	var fnpc207 = GetMDNpcName "шкатулка с сокровищами#7e207"
	var fnpc208 = GetMDNpcName "шкатулка с сокровищами#7e208"
	var fnpc209 = GetMDNpcName "шкатулка с сокровищами#7e209"
	var fnpc210 = GetMDNpcName "шкатулка с сокровищами#7e210"
	var fnpc211 = GetMDNpcName "шкатулка с сокровищами#7e211"
	var fnpc212 = GetMDNpcName "шкатулка с сокровищами#7e212"
	var fnpc213 = GetMDNpcName "шкатулка с сокровищами#7e213"
	var fnpc214 = GetMDNpcName "шкатулка с сокровищами#7e214"
	var fnpc215 = GetMDNpcName "шкатулка с сокровищами#7e215"
	var fnpc216 = GetMDNpcName "шкатулка с сокровищами#7e216"
	var fnpc217 = GetMDNpcName "шкатулка с сокровищами#7e217"
	var fnpc218 = GetMDNpcName "шкатулка с сокровищами#7e218"
	var fnpc219 = GetMDNpcName "шкатулка с сокровищами#7e219"
	var fnpc220 = GetMDNpcName "шкатулка с сокровищами#7e220"
	disablenpc fnpc201
	disablenpc fnpc202
	disablenpc fnpc203
	disablenpc fnpc204
	disablenpc fnpc205
	disablenpc fnpc206
	disablenpc fnpc207
	disablenpc fnpc208
	disablenpc fnpc209
	disablenpc fnpc210
	disablenpc fnpc211
	disablenpc fnpc212
	disablenpc fnpc213
	disablenpc fnpc214
	disablenpc fnpc215
	disablenpc fnpc216
	disablenpc fnpc217
	disablenpc fnpc218
	disablenpc fnpc219
	disablenpc fnpc220
return

MD_Npc "1@drdo" "шкатулка с сокровищами#7e202" 4_TREASURE_BOX 32 160 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e203" 4_TREASURE_BOX 37 155 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e204" 4_TREASURE_BOX 104 168 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e205" 4_TREASURE_BOX 102 166 3 0 0
OnClick:
	var fnpc205 = GetMDNpcName "шкатулка с сокровищами#7e205"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Red_Jewel 1
	endif
	disablenpc fnpc205
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e206" 4_TREASURE_BOX 110 189 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e207" 4_TREASURE_BOX 42 225 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e208" 4_TREASURE_BOX 39 224 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e209" 4_TREASURE_BOX 36 224 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e210" 4_TREASURE_BOX 39 227 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e211" 4_TREASURE_BOX 55 224 3 0 0
OnClick:
	var fnpc211 = GetMDNpcName "шкатулка с сокровищами#7e211"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Scarlet_Jewel 1
	endif
	disablenpc fnpc211
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e212" 4_TREASURE_BOX 57 223 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e213" 4_TREASURE_BOX 60 224 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e214" 4_TREASURE_BOX 57 226 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e215" 4_TREASURE_BOX 53 216 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e216" 4_TREASURE_BOX 55 218 3 0 0
OnClick:
	var fnpc216 = GetMDNpcName "шкатулка с сокровищами#7e216"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Seed_Of_Yggdrasil_ 3
	endif
	disablenpc fnpc216
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e217" 4_TREASURE_BOX 56 216 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e218" 4_TREASURE_BOX 42 216 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e219" 4_TREASURE_BOX 40 217 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e220" 4_TREASURE_BOX 38 215 3 0 0








MD_Npc "1@drdo" "язычник#7e302" 4_M_ORIENT02 145 202 3 5 5
OnTouch:
	var str302 = GetMDNpcName "язычник#7e302"
	var str303 = GetMDNpcName "язычник#7e303"
	TalkShow str302 "Какой друг..."
	DelayTime 1000
	disablenpc str302
	enablenpc str303
	var nya_map03 = GetMDMapName "1@drdo"
	Navigation_Active nya_map03 0 000 1 158 192
return


MD_Npc "1@drdo" "язычник#7e303" 4_M_ORIENT02 158 192 3 5 5
OnInit:
	var str303 = GetMDNpcName "язычник#7e303"
	disablenpc str303
return

OnTouch:
	var str303 = GetMDNpcName "язычник#7e303"
	TalkShow str303 "Мы друзья!!"
	DelayTime 1000
	disablenpc str303
	var nya_map03 = GetMDMapName "1@drdo"
	Navigation_Active nya_map03 0 000 1 176 197
return


MD_Npc "1@drdo" "язычник#7e301" 4_M_ORIENT02 176 197 3 0 0

OnInit:
	var str301 = GetMDNpcName "язычник#7e301"
	disablenpc str301
return

OnClick:
 var str301 = GetMDNpcName "язычник#7e301"
 var str302 = GetMDNpcName "язычник#7e302"
 var str303 = GetMDNpcName "язычник#7e303"
 var fnpc301 = GetMDNpcName "шкатулка с сокровищами#7e301"
 var mon301 = GetMDNpcName "пн#7e301"
 var men_t = rand 1 2
 if (men_t == 1)
	 TalkShow str301 "Ребята, а вы где? Куда все делись без меня?"
	 DelayTime 1500
	 TalkShow "" "Я, Валери?"
	 DelayTime 1500
	 TalkShow str301 "Сеобанг Ким! Нет нет. Это кто-то другой..."
	 DelayTime 1500
	 TalkShow "" "Вы видели Валери?"
	 DelayTime 1500
	 TalkShow str301 "Валери? Нет, не знаю. Я здесь один Теперь два авантюриста."
	 DelayTime 1500
	 TalkShow str301 "Увидев ожерелье, все сказали: «Пойдем искать сокровище», поэтому мы с азартом сели в лодку..."
	 DelayTime 1500
	 TalkShow str301 "Я здесь, чтобы сказать тебе, чтобы ты уходил..."
	 DelayTime 1500
	 TalkShow str301 "Я думал, это будет весело... но это не весело и страшно."
	 DelayTime 1500
	 TalkShow str301 "Все друзья, которые пришли со мной, ушли. Оставив меня здесь... Только меня..."
	 DelayTime 1500
	 TalkShow str301 "Думал будет весело! Но что это такое!"
	 DelayTime 1500
	 TalkShow str301 "Оставь меня одного в этом месте! Одиноко и страшно быть одному!"
	 DelayTime 1500
	 TalkShow str301 "куда вы все пропали! Думал будет весело! мне изменял!"
	 DelayTime 1500
	 TalkShow str301 "Мне жаль! Мне жаль!!"
 else
	 TalkShow str301 "Ты только однажды попросил меня помочь тебе. Но это был бы путь к гибели."
	 DelayTime 1500
	 TalkShow str301 "Не могу поверить, что всегда думал о нем как о друге."
	 DelayTime 1500
	 TalkShow "" "Вы Валери?"
	 DelayTime 1500
	 TalkShow str301 "кто еще ты Кого вы убедили меня привести вас сюда?"
	 DelayTime 1500
	 TalkShow "" "Я здесь, чтобы найти пропавшего человека."
	 DelayTime 1500
	 TalkShow str301 "Почему ты не сказал мне, что никто из пришедших сюда не вернулся?"
	 DelayTime 1500
	 TalkShow str301 "Вы только однажды попросили меня помочь вам! Вы сказали, что заработаете много денег!"
	 DelayTime 1500
	 TalkShow "" "О, я тебе не друг..."
	 DelayTime 1500
	 TalkShow str301 "Вы единственный, кто получает ожерелье? оставьте меня?"
	 DelayTime 1500
	 TalkShow str301 "Вы просили меня о помощи! Итак, вы прошли весь путь! Но почему ты мне не поможешь?"
	 DelayTime 1500
	 TalkShow str301 "Если бы не ты, я бы уже спал спокойно! Если бы не ты!"
	 DelayTime 1500
	 TalkShow str301 "Мне жаль! Мне жаль!!"
 endif
 cmdothernpc mon301 "call"
 cmdothernpc fnpc301 "off"
 disablenpc str301
 disablenpc str302
 disablenpc str303
return

MD_Npc "1@drdo" "пн#7e301" 4_RED_FLOWER 1 3 3 0 0

OnCommand: "call"
	resetmymob
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Мне жаль! Мне жаль! Я тебе доверял!"
	var nya_map03 = GetMDMapName "1@drdo"
	callmonster nya_map03 E_MD_BOX_PUPPET "миньон в коробке " 140 230
	callmonster nya_map03 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 152 225
	callmonster nya_map03 E_MD_BOX_PUPPET "миньон в коробке " 137 219
	callmonster nya_map03 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 151 218
	callmonster nya_map03 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 137 209
	callmonster nya_map03 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 147 209
	callmonster nya_map03 E_MD_BOX_PUPPET "миньон в коробке " 136 198
	callmonster nya_map03 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 145 192
	callmonster nya_map03 E_MD_BOX_PUPPET "миньон в коробке " 147 176
	callmonster nya_map03 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 163 185
	callmonster nya_map03 E_MD_BOX_PUPPET "миньон в коробке " 169 175
	callmonster nya_map03 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 172 157
	callmonster nya_map03 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 185 158
	callmonster nya_map03 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 198 156
	callmonster nya_map03 E_MD_BOX_PUPPET "миньон в коробке " 201 163
	callmonster nya_map03 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 197 169
	callmonster nya_map03 E_MD_BOX_PUPPET "миньон в коробке " 199 184
	callmonster nya_map03 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 208 186
	callmonster nya_map03 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 221 181
	callmonster nya_map03 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 228 187
	callmonster nya_map03 E_MD_BOX_PUPPET "миньон в коробке " 224 198
	callmonster nya_map03 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 214 205
	callmonster nya_map03 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 208 220
	callmonster nya_map03 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 197 213
return

OnMyMobDead:
DelayTime 100
var mon301 = GetMDNpcName "пн#7e301"
var mon302 = GetMDNpcName "пн#7e302"

if npcv mon301 [VAR_MYMOBCOUNT] < 1
	cmdothernpc mon302 "on"
endif
return

MD_Npc "1@drdo" "пн#7e302" 4_BLUE_FLOWER 3 3 3 0 0

OnCommand: "on"
 resetmymob
 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Несчастная душа материализуется и появляется."
 var nya_map01 = GetMDMapName "1@drdo"
 callmonster nya_map01 E_MD_DEPRESS_SOUL "несчастная душа " 176 197
 MonsterTalkShow "несчастная душа " "вы говорите друг? Если мы друзья, мы должны быть вместе навсегда !!"
return


OnMyMobDead:
 DelayTime 100
 var mon302 = GetMDNpcName "пн#7e302"
 var doo_r301 = GetMDNpcName "#7e301"
 
 if npcv mon302 [VAR_MYMOBCOUNT] < 1
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Один так одиноко и одиноко..."
	 DelayTime 1000
	 DelayTime 1000
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Иди... иди сюда... дверь открыта."
	 cmdothernpc doo_r301 "on"
 endif
 var nya_map03 = GetMDMapName "1@drdo"
 Navigation_Active nya_map03 0 000 1 197 152
return

MD_Warp "1@drdo" "#7e301" 197 152 2 2

OnInit:
	var doo_r301 = GetMDNpcName "#7e301"
	disablenpc doo_r301
return

OnCommand: "on"
	var doo_r301 = GetMDNpcName "#7e301"
	ShowEffect doo_r301 1073
	enablenpc doo_r301
return

OnTouch2:
	var nya_map03 = GetMDMapName "1@drdo"
	var str401 = GetMDNpcName "язычник#7e401"
	enablenpc str401
	moveto nya_map03 196 127
return


MD_Npc "1@drdo" "шкатулка с сокровищами#7e301" 4_TREASURE_BOX 166 201 3 0 0
OnCommand: "off"
	var fnpc301 = GetMDNpcName "шкатулка с сокровищами#7e301"
	var fnpc302 = GetMDNpcName "шкатулка с сокровищами#7e302"
	var fnpc303 = GetMDNpcName "шкатулка с сокровищами#7e303"
	var fnpc304 = GetMDNpcName "шкатулка с сокровищами#7e304"
	var fnpc305 = GetMDNpcName "шкатулка с сокровищами#7e305"
	var fnpc306 = GetMDNpcName "шкатулка с сокровищами#7e306"
	var fnpc307 = GetMDNpcName "шкатулка с сокровищами#7e307"
	var fnpc308 = GetMDNpcName "шкатулка с сокровищами#7e308"
	var fnpc309 = GetMDNpcName "шкатулка с сокровищами#7e309"
	var fnpc310 = GetMDNpcName "шкатулка с сокровищами#7e310"
	var fnpc311 = GetMDNpcName "шкатулка с сокровищами#7e311"
	var fnpc312 = GetMDNpcName "шкатулка с сокровищами#7e312"
	var fnpc313 = GetMDNpcName "шкатулка с сокровищами#7e313"
	var fnpc314 = GetMDNpcName "шкатулка с сокровищами#7e314"
	var fnpc315 = GetMDNpcName "шкатулка с сокровищами#7e315"
	var fnpc316 = GetMDNpcName "шкатулка с сокровищами#7e316"
	var fnpc317 = GetMDNpcName "шкатулка с сокровищами#7e317"
	var fnpc318 = GetMDNpcName "шкатулка с сокровищами#7e318"
	var fnpc319 = GetMDNpcName "шкатулка с сокровищами#7e319"
	var fnpc320 = GetMDNpcName "шкатулка с сокровищами#7e320"
	var fnpc321 = GetMDNpcName "шкатулка с сокровищами#7e321"
	disablenpc fnpc301
	disablenpc fnpc302
	disablenpc fnpc303
	disablenpc fnpc304
	disablenpc fnpc305
	disablenpc fnpc306
	disablenpc fnpc307
	disablenpc fnpc308
	disablenpc fnpc309
	disablenpc fnpc310
	disablenpc fnpc311
	disablenpc fnpc312
	disablenpc fnpc313
	disablenpc fnpc314
	disablenpc fnpc315
	disablenpc fnpc316
	disablenpc fnpc317
	disablenpc fnpc318
	disablenpc fnpc319
	disablenpc fnpc320
	disablenpc fnpc321
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e302" 4_TREASURE_BOX 167 196 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e303" 4_TREASURE_BOX 178 190 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e304" 4_TREASURE_BOX 189 200 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e305" 4_TREASURE_BOX 189 205 3 0 0
OnClick:
	var fnpc305 = GetMDNpcName "шкатулка с сокровищами#7e305"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Violet_Jewel 1
	endif
	disablenpc fnpc305
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e306" 4_TREASURE_BOX 193 186 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e307" 4_TREASURE_BOX 195 182 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e308" 4_TREASURE_BOX 187 165 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e309" 4_TREASURE_BOX 186 160 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e310" 4_TREASURE_BOX 208 162 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e311" 4_TREASURE_BOX 206 166 3 0 0
OnClick:
	var fnpc311 = GetMDNpcName "шкатулка с сокровищами#7e311"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Cardinal_Jewel_ 1
	endif
	disablenpc fnpc311
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e312" 4_TREASURE_BOX 233 181 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e313" 4_TREASURE_BOX 231 186 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e314" 4_TREASURE_BOX 233 187 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e315" 4_TREASURE_BOX 201 233 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e316" 4_TREASURE_BOX 204 234 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e317" 4_TREASURE_BOX 203 231 3 0 0
OnClick:
	var fnpc317 = GetMDNpcName "шкатулка с сокровищами#7e317"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Skyblue_Jewel 1
	endif
	disablenpc fnpc317
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e318" 4_TREASURE_BOX 140 235 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e319" 4_TREASURE_BOX 137 234 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e320" 4_TREASURE_BOX 134 234 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e321" 4_TREASURE_BOX 140 192 3 0 0










MD_Npc "1@drdo" "язычник#7e402" 4_F_SHABBY 191 116 3 5 5
OnTouch:
	var str402 = GetMDNpcName "язычник#7e402"
	var str403 = GetMDNpcName "язычник#7e403"
	TalkShow str402 "Хорошие дни придут и для меня "
	DelayTime 1000
	disablenpc str402
	enablenpc str403
	var nya_map04 = GetMDMapName "1@drdo"
	Navigation_Active nya_map04 0 000 1 184 102
return


MD_Npc "1@drdo" "язычник#7e403" 4_F_SHABBY 184 102 3 5 5
OnInit:
	var str403 = GetMDNpcName "язычник#7e403"
	disablenpc str403
return

OnTouch:
	var str403 = GetMDNpcName "язычник#7e403"
	TalkShow str403 "Я хочу вернуться..."
	DelayTime 1000
	disablenpc str403
	var nya_map04 = GetMDMapName "1@drdo"
	Navigation_Active nya_map04 0 000 1 184 80
return



MD_Npc "1@drdo" "язычник#7e401" 4_F_SHABBY 184 80 3 0 0

OnInit:
	var str401 = GetMDNpcName "язычник#7e401"
	disablenpc str401
return

OnClick:
 var str401 = GetMDNpcName "язычник#7e401"
 var str402 = GetMDNpcName "язычник#7e402"
 var str403 = GetMDNpcName "язычник#7e403"
 var fnpc401 = GetMDNpcName "шкатулка с сокровищами#7e401"
 var mon401 = GetMDNpcName "пн#7e401"
 var men_t = rand 1 2
 if (men_t == 1)
	 TalkShow str401 "Если мы возьмем эти вещи с собой, разве мы не займемся домашними делами?"
	 DelayTime 1500
	 TalkShow str401 "Мне просто нужно потрудиться и пострадать. Мои родители больны, а мои младшие братья и сестры еще молоды."
	 DelayTime 1500
	 TalkShow str401 "Но... как ты все это несешь? Куда вы все пропали? наша лодка?"
	 DelayTime 1500
	 TalkShow "" "Мисс Валери?"
	 DelayTime 1500
	 TalkShow str401 "Валери? Я не знаю. Но кто ты? О, кто бы это ни был, все было прекрасно. Можешь переместить это со мной?"
	 DelayTime 1500
	 TalkShow "" "Что ты имеешь в виду?"
	 DelayTime 1500
	 TalkShow str401 "Эти сокровища. Если вы мне поможете, я приведу пример. Вы можете принести это на наш корабль?"
	 DelayTime 1500
	 TalkShow "" "живот? Я не видел лодки, но я не видел здесь ни одной лодки."
	 DelayTime 1500
	 TalkShow str401 "У нас есть лодка. Старые, но обшарпанные мы, наш... наш корабль..."
	 DelayTime 1500
	 TalkShow str401 "На все деньги я арендовал лодку..."
	 DelayTime 1500
	 TalkShow str401 "Я встретил бурю... Я, я... здесь... теперь, теперь я вижу свет...!"
	 DelayTime 1500
	 TalkShow str401 "Я даже не могу наслаждаться жизнью! Я только жертвовал! Теперь у меня отняли даже жизнь!"
	 DelayTime 1500
	 TalkShow str401 "Теперь, когда моя жизнь цветет все украдено!"
	 DelayTime 1500
	 TalkShow str401 "Мне жаль! Мне жаль!!"
 else
	 TalkShow str401 "Ни один. Никто? не будет никого "
	 DelayTime 1500
	 TalkShow "" "Я, Валери?"
	 DelayTime 1500
	 TalkShow str401 "Ой, это сюрприз! Почему ты здесь?"
	 DelayTime 1500
	 TalkShow "" "Я здесь, чтобы кого-нибудь найти."
	 DelayTime 1500
	 TalkShow str401 "Нет, ты знаешь, что это за место? Ага?"
	 DelayTime 1500
	 TalkShow "" "Я просто здесь кого-то ищу..."
	 DelayTime 1500
	 TalkShow str401 "Многие люди погибли, когда пришли сюда, ничего не зная!"
	 DelayTime 1500
	 TalkShow str401 "Вы знаете, почему люди приходят сюда и никогда не возвращаются?"
	 DelayTime 1500
	 TalkShow str401 "Я пришел сюда, чтобы расследовать это, и вот что случилось, не так ли? Я здесь для расследования!"
	 DelayTime 1500
	 TalkShow str401 "Я даже никому не могу сказать! Я даже не могу вернуться! Есть много вещей, которые еще не изучены!"
	 DelayTime 1500
	 TalkShow str401 "Если бы я знал, что это будет так, я бы не пришел сюда!"
	 DelayTime 1500
	 TalkShow str401 "Этого даже никто не знает!"
	 DelayTime 1500
	 TalkShow str401 "Мне жаль! Мне жаль!!!"
 endif
 cmdothernpc mon401 "call"
 cmdothernpc fnpc401 "off"
 disablenpc str401
 disablenpc str402
 disablenpc str403
return

MD_Npc "1@drdo" "пн#7e401" 4_RED_FLOWER 1 4 3 0 0

OnCommand: "call"
	resetmymob
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Мне жаль! Мне жаль! Думал, наступит хороший день, если подожду!"
	var nya_map04 = GetMDMapName "1@drdo"
	callmonster nya_map04 E_MD_BOX_PUPPET "миньон в коробке " 177 121
	callmonster nya_map04 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 194 122
	callmonster nya_map04 E_MD_BOX_PUPPET "миньон в коробке " 208 124
	callmonster nya_map04 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 204 114
	callmonster nya_map04 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 187 114
	callmonster nya_map04 E_MD_BOX_PUPPET "миньон в коробке " 180 106
	callmonster nya_map04 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 198 115
	callmonster nya_map04 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 201 104
	callmonster nya_map04 E_MD_BOX_PUPPET "миньон в коробке " 209 106
	callmonster nya_map04 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 210 96
	callmonster nya_map04 E_MD_BOX_PUPPET "миньон в коробке " 208 81
	callmonster nya_map04 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 198 92
	callmonster nya_map04 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 200 83
	callmonster nya_map04 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 205 67
	callmonster nya_map04 E_MD_BOX_PUPPET "миньон в коробке " 213 70
	callmonster nya_map04 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 167 38
	callmonster nya_map04 E_MD_BOX_PUPPET "миньон в коробке " 179 38
	callmonster nya_map04 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 174 42
	callmonster nya_map04 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 166 46
	callmonster nya_map04 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 175 53
	callmonster nya_map04 E_MD_BOX_PUPPET "миньон в коробке " 181 51
	callmonster nya_map04 E_MD_S_TREASURE_BOX "коробка, которая глотает что угодно " 177 64
	callmonster nya_map04 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 169 70
	callmonster nya_map04 E_MD_B_TREASURE_BOX "коробка, которая глотает что угодно " 174 78
	callmonster nya_map04 E_MD_BOX_PUPPET "миньон в коробке " 184 72
return


OnMyMobDead:
 DelayTime 100
 var mon401 = GetMDNpcName "пн#7e401"
 var mon402 = GetMDNpcName "пн#7e402"
 
 if npcv mon401 [VAR_MYMOBCOUNT] < 1
	 cmdothernpc mon402 "on"
 endif
return


MD_Npc "1@drdo" "пн#7e402" 4_BLUE_FLOWER 3 4 3 0 0

OnCommand: "on"
 resetmymob
 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Несчастная душа материализуется и появляется."
 var nya_map01 = GetMDMapName "1@drdo"
 callmonster nya_map01 E_MD_DEPRESS_SOUL "несчастная душа " 184 80
 MonsterTalkShow "несчастная душа " "Я не могу быть единственным несчастным! Вы, должно быть, тоже несчастны!"
return


OnMyMobDead:
 DelayTime 100
 var mon402 = GetMDNpcName "пн#7e402"
 var doo_r401 = GetMDNpcName "#7e401"
 
 if npcv mon402 [VAR_MYMOBCOUNT] < 1
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Ах .. Прости... Прости... Умереть после таких страданий."
	 DelayTime 1000
	 DelayTime 1000
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Иди... иди сюда... дверь открыта."
	 cmdothernpc doo_r401 "on"
 endif
 var nya_map04 = GetMDMapName "1@drdo"
 Navigation_Active nya_map04 0 000 1 161 62
return


MD_Warp "1@drdo" "#7e401" 161 62 2 2

OnInit:
	var doo_r401 = GetMDNpcName "#7e401"
	disablenpc doo_r401
return

OnCommand: "on"
	var doo_r401 = GetMDNpcName "#7e401"
	ShowEffect doo_r401 1073
	enablenpc doo_r401
return

OnTouch2:
	var nya_map04 = GetMDMapName "1@drdo"
	var str501 = GetMDNpcName "Нило#7e501"
	enablenpc str501
	moveto nya_map04 134 61
return


MD_Npc "1@drdo" "шкатулка с сокровищами#7e401" 4_TREASURE_BOX 186 88 3 0 0
OnCommand: "off"
	var fnpc401 = GetMDNpcName "шкатулка с сокровищами#7e401"
	var fnpc402 = GetMDNpcName "шкатулка с сокровищами#7e402"
	var fnpc403 = GetMDNpcName "шкатулка с сокровищами#7e403"
	var fnpc404 = GetMDNpcName "шкатулка с сокровищами#7e404"
	var fnpc405 = GetMDNpcName "шкатулка с сокровищами#7e405"
	var fnpc406 = GetMDNpcName "шкатулка с сокровищами#7e406"
	var fnpc407 = GetMDNpcName "шкатулка с сокровищами#7e407"
	var fnpc408 = GetMDNpcName "шкатулка с сокровищами#7e408"
	var fnpc409 = GetMDNpcName "шкатулка с сокровищами#7e409"
	var fnpc410 = GetMDNpcName "шкатулка с сокровищами#7e410"
	var fnpc411 = GetMDNpcName "шкатулка с сокровищами#7e411"
	var fnpc412 = GetMDNpcName "шкатулка с сокровищами#7e412"
	var fnpc413 = GetMDNpcName "шкатулка с сокровищами#7e413"
	var fnpc414 = GetMDNpcName "шкатулка с сокровищами#7e414"
	var fnpc415 = GetMDNpcName "шкатулка с сокровищами#7e415"
	var fnpc416 = GetMDNpcName "шкатулка с сокровищами#7e416"
	var fnpc417 = GetMDNpcName "шкатулка с сокровищами#7e417"
	var fnpc418 = GetMDNpcName "шкатулка с сокровищами#7e418"
	var fnpc419 = GetMDNpcName "шкатулка с сокровищами#7e419"
	var fnpc420 = GetMDNpcName "шкатулка с сокровищами#7e420"
	var fnpc421 = GetMDNpcName "шкатулка с сокровищами#7e421"
	disablenpc fnpc401
	disablenpc fnpc402
	disablenpc fnpc403
	disablenpc fnpc404
	disablenpc fnpc405
	disablenpc fnpc406
	disablenpc fnpc407
	disablenpc fnpc408
	disablenpc fnpc409
	disablenpc fnpc410
	disablenpc fnpc411
	disablenpc fnpc412
	disablenpc fnpc413
	disablenpc fnpc414
	disablenpc fnpc415
	disablenpc fnpc416
	disablenpc fnpc417
	disablenpc fnpc418
	disablenpc fnpc419
	disablenpc fnpc420
	disablenpc fnpc421
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e402" 4_TREASURE_BOX 189 77 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e403" 4_TREASURE_BOX 192 82 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e404" 4_TREASURE_BOX 190 87 3 0 0
OnClick:
	var fnpc404 = GetMDNpcName "шкатулка с сокровищами#7e404"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Seed_Of_Yggdrasil_ 3
	endif
	disablenpc fnpc404
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e405" 4_TREASURE_BOX 186 88 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e406" 4_TREASURE_BOX 181 86 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e407" 4_TREASURE_BOX 178 83 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e408" 4_TREASURE_BOX 179 79 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e409" 4_TREASURE_BOX 182 75 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e410" 4_TREASURE_BOX 170 97 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e411" 4_TREASURE_BOX 168 93 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e412" 4_TREASURE_BOX 169 71 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e413" 4_TREASURE_BOX 165 52 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e414" 4_TREASURE_BOX 173 37 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e415" 4_TREASURE_BOX 176 38 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e416" 4_TREASURE_BOX 179 40 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e417" 4_TREASURE_BOX 215 69 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e418" 4_TREASURE_BOX 213 67 3 0 0
OnClick:
	var fnpc418 = GetMDNpcName "шкатулка с сокровищами#7e418"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Cardinal_Jewel_ 2
	endif
	disablenpc fnpc418
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e419" 4_TREASURE_BOX 208 63 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e420" 4_TREASURE_BOX 207 123 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e421" 4_TREASURE_BOX 177 121 3 0 0
OnClick:
	var fnpc421 = GetMDNpcName "шкатулка с сокровищами#7e421"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Azure_Jewel 1
	endif
	disablenpc fnpc421
return







MD_Npc "1@drdo" "Нило#7e501" E_MD_NYAILO 129 128 3 5 5

OnInit:
	var str501 = GetMDNpcName "Нило#7e501"
	disablenpc str501
return

OnTouch2:
 var str501 = GetMDNpcName "Нило#7e501"
 var fnpc501 = GetMDNpcName "шкатулка с сокровищами#7e501"
 var mon501 = GetMDNpcName "пн#7e501"
 TalkShow str501 "Ну же Я ждал, когда ты приедешь сюда."
 DelayTime 1500
 TalkShow "" "Вы... Нило из Нилгула?"
 DelayTime 1500
 TalkShow str501 "Это лишь малая часть меня. Я везде "
 DelayTime 1500
 TalkShow "" "Вы когда-нибудь видели пропавших без вести? Я ищу кого-то по имени Валери."
 DelayTime 1500
 TalkShow str501 "Должно быть, это была часть меня, либо блуждающая где-то здесь, либо умирающая во время странствий."
 DelayTime 1500
 TalkShow "" "Что значит быть частью?"
 DelayTime 1500
 TalkShow str501 "Ты сильный, но с тусклыми волосами..."
 DelayTime 1500
 TalkShow str501 "Все являются этим телом, а это тело - все. Все, на что вы наступаете и что видите, - это тело."
 DelayTime 1500
 TalkShow "" "Все это... ты? Кто ты?"
 DelayTime 1500
 TalkShow str501 "Я Нило. И скоро все, что существует, буду я."
 DelayTime 1500
 TalkShow "" "Вы убили людей, которые были здесь?"
 DelayTime 1500
 TalkShow str501 "Тело - это всего лишь оболочка, в которой находится душа. не грусти Все я принял и стал мной."
 DelayTime 1500
 TalkShow "" "Почему?"
 DelayTime 1500
 TalkShow str501 "Этот мир состоит из бесконечных линий и кругов, которые вечно вращаются в одном месте."
 DelayTime 1500
 TalkShow str501 "Поэтому я идеален."
 DelayTime 1500
 TalkShow str501 "Больше существ должно стать совершенным мной."
 DelayTime 1500
 TalkShow str501 "Ты тоже станешь мной и станешь совершенным. Похоже, у вас нет таланта ослеплять окружающих ожерельем."
 DelayTime 1500
 TalkShow "" "ожерелье? Вы заманивали людей, заставляя их лгать о сокровищах?"
 DelayTime 1500
 TalkShow str501 "Разве это не лучше, чем жизнь, страдающая от несовершенства?"
 DelayTime 1500
 TalkShow "" "Не вам решать!"
 DelayTime 1500
 TalkShow str501 "Приезд сюда был выбором каждого."
 DelayTime 1500
 TalkShow "" "Это была уловка!"
 DelayTime 1500
 TalkShow str501 "Похоже, ты не собираешься становиться мной. тупая штука. Было бы неплохо следить..."
 cmdothernpc mon501 "call"
 cmdothernpc fnpc501 "off"
 disablenpc str501
return

MD_Npc "1@drdo" "пн#7e501" 4_YELL_FLOWER 2 5 3 0 0

OnCommand: "call"
 resetmymob
 DelayTime 1500
 var nya_map05 = GetMDMapName "1@drdo"
 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Я одолею тебя и сделаю собой "
 callmonster nya_map05 E_MD_NYAILO "Нило " 129 128
return


OnMyMobDead:
 DelayTime 100
 var mon501 = GetMDNpcName "пн#7e501"
 var doo_r501 = GetMDNpcName "#7e501"
 if npcv mon501 [VAR_MYMOBCOUNT] < 1
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Пока твоя жадность не исчезнет, я не исчезну !!!"
	 cmdothernpc doo_r501 "on"
 endif
 var nya_map05 = GetMDMapName "1@drdo"
 Navigation_Active nya_map05 0 000 1 130 135
return



MD_Warp "1@drdo" "#7e501" 130 135 2 2

OnInit:
	var doo_r501 = GetMDNpcName "#7e501"
	disablenpc doo_r501
return

OnCommand: "on"
	var doo_r501 = GetMDNpcName "#7e501"
	ShowEffect doo_r501 1073
	enablenpc doo_r501
return

OnTouch2:
	moveto "malangdo" 214 253
return

MD_Npc "1@drdo" "шкатулка с сокровищами#7e501" 4_TREASURE_BOX 119 88 3 0 0
OnCommand: "off"
	var fnpc501 = GetMDNpcName "шкатулка с сокровищами#7e501"
	var fnpc502 = GetMDNpcName "шкатулка с сокровищами#7e502"
	var fnpc503 = GetMDNpcName "шкатулка с сокровищами#7e503"
	var fnpc504 = GetMDNpcName "шкатулка с сокровищами#7e504"
	var fnpc505 = GetMDNpcName "шкатулка с сокровищами#7e505"
	var fnpc506 = GetMDNpcName "шкатулка с сокровищами#7e506"
	var fnpc507 = GetMDNpcName "шкатулка с сокровищами#7e507"
	var fnpc508 = GetMDNpcName "шкатулка с сокровищами#7e508"
	disablenpc fnpc501
	disablenpc fnpc502
	disablenpc fnpc503
	disablenpc fnpc504
	disablenpc fnpc505
	disablenpc fnpc506
	disablenpc fnpc507
	disablenpc fnpc508
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e502" 4_TREASURE_BOX 149 90 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e503" 4_TREASURE_BOX 142 74 3 0 0
OnClick:
	var fnpc503 = GetMDNpcName "шкатулка с сокровищами#7e503"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Cardinal_Jewel_ 1
	endif
	disablenpc fnpc503
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e504" 4_TREASURE_BOX 151 134 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e505" 4_TREASURE_BOX 154 129 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e506" 4_TREASURE_BOX 116 141 3 0 0
MD_Npc "1@drdo" "шкатулка с сокровищами#7e507" 4_TREASURE_BOX 125 74 3 0 0
OnClick:
	var fnpc507 = GetMDNpcName "шкатулка с сокровищами#7e507"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "Ой! Есть что-то!!!"
	getitem Seed_Of_Yggdrasil_ 3
	endif
	disablenpc fnpc507
return
MD_Npc "1@drdo" "шкатулка с сокровищами#7e508" 4_TREASURE_BOX 105 118 3 0 0



