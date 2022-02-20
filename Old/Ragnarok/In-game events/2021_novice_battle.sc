npc "pvp_novice" "Снабженец#armory" 4_M_03 49 16 5 0 0

OnClick:
	var day_of_year = GetGlobalVar "day_of_year"

	if v[jp_event52] != day_of_year	
		dialog "[Снабженец]"
		dialog "Возьми эти предметы, они тебе пригодятся "
		RentItem Knife_ 3600 0 0 0 0 0
		RentItem Novice_Potion 3600 0 0 0 0 0
		RentItem Novice_Potion 3600 0 0 0 0 0
		RentItem Novice_Potion 3600 0 0 0 0 0
		RentItem Novice_Potion 3600 0 0 0 0 0
		RentItem Novice_Potion 3600 0 0 0 0 0
		setitem jp_event52 day_of_year
		close
		return
	else
		dialog "[Снабженец]"
		dialog "Ты уже получил предметы. "
		close
		return
	endif
return

npc "pvp_novice" "Помощник арены#hidden" HIDDEN_NPC 7 7 5 0 0
OnCommand: "start"
	InitTimer
return
OnCommand: "stop"
	stoptimer
return
OnTimer: 120000
	var mapcount = GetPCCount "pvp_novice.gat"
	var gm_in = GetGlobalVar "nb_d_gm_in"
	if gm_in == 1
		mapcount = mapcount - 1
	endif
	if (mapcount < 10) | (mapcount == 0)
		broadcastinmap "Кажется, Вас слишком мало для начала боя. Приходите в следующий раз!"
		warpallpcinthemap "prontera" 125 122
	else
		cmdothernpc "Ведущий битвы#hidden" "start"
		warpallpcinthemap "pvp_n_1-2" 0 0
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "Битва новичков началась!"
	endif
	cmdothernpc "Помощник арены новичков#novicePvP" "close"
return

OnTimer: 150000
	warpallpcinthemap "prontera" 125 122
	SetGlobalVar "nov_start_time" 75600
	stoptimer
return

OnTimer: 200000
	warpallpcinthemap "prontera" 125 122
	SetGlobalVar "nov_start_time" 75600
	stoptimer
return

npc "pvp_n_1-2" "Ведущий битвы#hidden" HIDDEN_NPC 1 1 5 0 0
OnInit:
	strlocalvar 0 "flag_2"
	SetLocalVar "flag_2" 0
return
OnCommand: "start"
	var mapcount = GetPCCount "pvp_n_1-2.gat"
	var gm_in = GetGlobalVar "nb_d_gm_in"
	if gm_in == 1
		mapcount = mapcount - 1
	endif
	if (mapcount < 1) | (mapcount == 0)
		warpallpcinthemap "prontera" 125 122
		stoptimer
	else
		broadcastinmap " " + mapcount + " человек. Помните! Победитель может быть лишь 1. "
		InitTimer
	endif
return

OnTimer: 15	
	var count = GetPCCount "pvp_n_1-2.gat"
	var gm_in = GetGlobalVar "nb_d_gm_in"
	var flag_2 = lv["flag_2"]
	if gm_in == 1
		count = count - 1
	endif
	if ((count == 2) & (flag_2 == 0))
		broadcastinmap "Осталось всего 2 участника? Кто окажется сильнее?"
		SetLocalVar "flag_2" 1
	endif
	if count == 0
		SetLocalVar "flag_2" 0
	elseif count == 1
		broadcastinmap "Победитель определен! Подойди же ко мне."
		enablenpc "Легендарный новичок#rewards"
		warpallpcinthemap "pvp_n_1-2" 101 101
		stoptimer
		SetLocalVar "flag_2" 0
	//elseif stop_flag == 1
		//stoptimer
	else
		stoptimer
		InitTimer
	endif
return

hiddenwarp "pvp_n_1-2" "save_warp" 1 1 1 1
OnTouch:
	moveto "pvp_n_1-2" 0 0
return	

hiddenwarp "pvp_n_1-2" "save_warp" 2 2 1 1
OnTouch:
	moveto "pvp_n_1-2" 0 0
return	

hiddenwarp "pvp_n_1-2" "save_warp" 30 30 1 1
OnTouch:
	moveto "pvp_n_1-2" 0 0
return

npc "pvp_n_1-2" "Легендарный новичок#rewards" 4_GEFFEN_02 100 100 5 0 0

OnInit:
	strlocalvar 0 "novice_rew"
	SetLocalVar "novice_rew" 0
	InitTimer
return

OnCommand: "start"
	SetLocalVar "novice_rew" 0
	enablenpc "Легендарный новичок#rewards"
	InitTimer
return

OnCommand: "stop"
	SetLocalVar "novice_rew" 0
	stoptimer
	disablenpc "Легендарный новичок#rewards"
return

OnClick:
	var name = PcName
	// var d_rewards = GetGlobalVar "zomb_d_rewards"
	var rew = lv["novice_rew"]
	var win_name1 = GetGlobalStr "nov_win1"
	// var win_name2 = GetGlobalStr "nov_win2"
	// var win_name3 = GetGlobalStr "nov_win3"
	// var win_name4 = GetGlobalStr "nov_win4"
	// var win_name5 = GetGlobalStr "nov_win5"
	// var win_name6 = GetGlobalStr "nov_win6"
	// var win_name7 = GetGlobalStr "nov_win7"
	// var win_name8 = GetGlobalStr "nov_win8"
	
	var win_count1 = GetGlobalVar "nov_cwin1"
	// var win_count2 = GetGlobalVar "nov_cwin2"
	// var win_count3 = GetGlobalVar "nov_cwin3"
	// var win_count4 = GetGlobalVar "nov_cwin4"
	// var win_count5 = GetGlobalVar "nov_cwin5"
	// var win_count6 = GetGlobalVar "nov_cwin6"
	// var win_count7 = GetGlobalVar "nov_cwin7"
	// var win_count8 = GetGlobalVar "nov_cwin8"
	
	var p_name = PcName
	if win_name1 == p_name
		win_count1 = win_count1 + 1
		SetGlobalVar "nov_cwin1" win_count1
	/* elseif win_name2 == p_name
		win_count2 = win_count2 + 1
		SetGlobalVar "nov_cwin2" win_count2
	elseif win_name3 == p_name
		win_count3 = win_count3 + 1
		SetGlobalVar "nov_cwin3" win_count3
	elseif win_name4 == p_name
		win_count4 = win_count4 + 1
		SetGlobalVar "nov_cwin4" win_count4
	elseif win_name5 == p_name
		win_count5 = win_count5 + 1
		SetGlobalVar "nov_cwin5" win_count5
	elseif win_name6 == p_name
		win_count6 = win_count6 + 1
		SetGlobalVar "nov_cwin6" win_count6
	elseif win_name7 == p_name
		win_count7 = win_count7 + 1
		SetGlobalVar "nov_cwin7" win_count7
	elseif win_name8 == p_name
		win_count8 = win_count8 + 1
		SetGlobalVar "nov_cwin8" win_count8
		*/
	else
		SetGlobalStr "nov_win1" p_name
		SetGlobalVar "nov_cwin1" 1
		if v[VAR_SEX] == 1
			SetGlobalVar "nov_cwin2" 1
		else
			SetGlobalVar "nov_cwin2" 2
		endif
		/*
		SetGlobalStr "nov_win2" win_name1
		SetGlobalVar "nov_cwin2" win_count1
		SetGlobalStr "nov_win3" win_name2
		SetGlobalVar "nov_cwin3" win_count2
		SetGlobalStr "nov_win4" win_name3
		SetGlobalVar "nov_cwin4" win_count3
		SetGlobalStr "nov_win5" win_name4
		SetGlobalVar "nov_cwin5" win_count4
		SetGlobalStr "nov_win6" win_name5
		SetGlobalVar "nov_cwin6" win_count5
		SetGlobalStr "nov_win7" win_name6
		SetGlobalVar "nov_cwin7" win_count6
		SetGlobalStr "nov_win8" win_name7
		SetGlobalVar "nov_cwin8" win_count7
		*/
	endif
	if rew < 1
		rew = rew + 1
		SetLocalVar "novice_rew" rew
		dialog "[Легендарный новичок]"
		dialog "Отличный бой! Давно не видал "
		dialog "таких. Найди меня в Пронтере. "
		dialog "Только приходи с этим билетом! "
		wait
		broadcastserver "FF0000" FW_NORMAL 10 0 0 " " + name + " одерживает победу в Битве новичков!"
		getitem Update_Ticket 1
	else
		dialog "[Легендарный новичок]"
		dialog "Возможно, у вас возникла проблема? Пожалуйста, обратитесь в техническую поддержку."
		close
	endif
	close
	moveto "prontera" 150 165
return

OnTimer: 120000
	SetLocalVar "novice_rew" 0
	warpallpcinthemap "prontera" 150 165
	disablenpc "Легендарный новичок#rewards"
	// SetGlobalVar "zomb_d_rewards" 0
	SetLocalVar "novice_rew" 0
	SetGlobalVar "nb_d_gm_in" 0
	stoptimer
return

npc "prontera" "Легендарный новичок#prontera" 4_GEFFEN_02 146 166 5 0 0
OnClick:
	dialog "[Легендарный новичок]"
	dialog "Здравствуй, боец!"
	dialog "С каким вопросом ты пришел ко мне?"
	wait
	choose menu "Я пришел за наградой " "Я хочу узнать имя победителя " "Я ошибся "
		case 1
			if v[Update_Ticket] > 0
				var now_weight = v[VAR_MAXWEIGHT] - v[VAR_WEIGHT]
				var item_check1 = GetInventoryRemainCount Knife 4
				if (item_check1 != 1)
					dialog "[Легендарный новичок]"
					dialog "Кажется, у вас не хватает места для наград! Освободите место и возвращайтесь!"
					close
					return
					if now_weight < 320
						dialog "[Легендарный новичок]"
						dialog "Кажется, у вас не хватает места для наград! Освободите место и возвращайтесь!"
						close
						return
					endif
				endif
				dialog "[Легендарный новичок]"
				dialog "Наслаждайтесь вашим триумфом! Пока вас не подвинут, ха-ха!"
				dropitem Update_Ticket 1
				getitem RU_Premium_Box_30d 1
				getitem Bubble_Gum_Box 1
				getitem J_Captain_Hat 1
				getitem Max_Weight_Up_Scroll 1
				close
				return
			else
				dialog "[Легендарный новичок]"
				dialog "Не вижу вашего купона победителя!"
				dialog "Продолжим разговор, когда он появится у вас."
				close
				return
			endif
		break
		case 2
			var win_name1 = GetGlobalStr "nov_win1"
			var win_count1 = GetGlobalVar "nov_cwin1"
			var win_sex = GetGlobalVar "nov_cwin2"
			var p_name = PcName
			if win_sex == 1
				dialog "[Легендарный новичок]"
				dialog "В прошлой Битве новичков одержал победу "+win_name1+"."
				if win_count1 > 1
				dialog "На его счету уже "+win_count1+" побед подряд!"
				endif
			else 
				dialog "[Легендарный новичок]"
				dialog "В прошлой Битве новичков одержалa победу "+win_name1+"."
				if win_count1 > 1
				dialog "На её счету уже "+win_count1+" побед подряд!"
				endif
			endif
			if p_name == win_name1
				dialog "Участвуйте в битве новичков, чтобы удержать свой титул!"
			else
				dialog "Участвуйте в битве новичков и возвращайтесь победителем!"
			endif
			close
			return
		break
		case 3
			dialog "[Легендарный новичок]"
			dialog "Вы ошиблись? Ничего, не проблема. "
			dialog "Участвуйте в битве новичков и возвращайтесь победителем ко мне! Ха!"
			close
			return
		break
	endchoose
return

/*
npc "prontera" "Новички - победители!#rewards" 4_BOARD3 142 163 5 0 0
OnClick:	
	dialog "Победители Осени "
	
	var winner1 = "Канизак "
	var winner2 = "Тупое "
	var winner3 = "Даздранагон "
	var winner4 = "Такахули "
	var winner5 = "БезбашеннаяДура "
	var winner6 = "Оптимус "
	
	var wins1 = 1
	var wins2 = 1
	var wins3 = 1
	var wins4 = 5
	var wins5 = 1
	var wins6 = 1
	
	dialog winner1 + " - " + wins1
	dialog winner2 + " - " + wins2
	dialog winner3 + " - " + wins3
	dialog winner4 + " - " + wins4
	dialog winner5 + " - " + wins5
	dialog winner6 + " - " + wins6
	return
	
npc "prontera" "Новички - победители!#rewards" 4_BOARD3 142 161 5 0 0
OnClick:	
	dialog "Победители Зимы "
	
	var winner1 = "Даздрасмыгда "
	var winner2 = "Наайс "
	var winner3 = "Даздранагон "
	var winner4 = "Такахули "

	
	var wins1 = 1
	var wins2 = 1
	var wins3 = 11
	var wins4 = 5

	
	dialog winner1 + " - " + wins1
	dialog winner2 + " - " + wins2
	dialog winner3 + " - " + wins3
	dialog winner4 + " - " + wins4

	return
	
npc "prontera" "Новички - победители!#rewards" 4_BOARD3 142 159 5 0 0
OnClick:
	var check_shield = GetEquipCount Angra_Manyu
	if (check_shield == 0)
		var win_name1 = GetGlobalStr "nov_win1"
		var win_name2 = GetGlobalStr "nov_win2"
		var win_name3 = GetGlobalStr "nov_win3"
		var win_name4 = GetGlobalStr "nov_win4"
		var win_name5 = GetGlobalStr "nov_win5"
		var win_name6 = GetGlobalStr "nov_win6"
		var win_name7 = GetGlobalStr "nov_win7"
		var win_name8 = GetGlobalStr "nov_win8"
		
		var win_count1 = GetGlobalVar "nov_cwin1"
		var win_count2 = GetGlobalVar "nov_cwin2"
		var win_count3 = GetGlobalVar "nov_cwin3"
		var win_count4 = GetGlobalVar "nov_cwin4"
		var win_count5 = GetGlobalVar "nov_cwin5"
		var win_count6 = GetGlobalVar "nov_cwin6"
		var win_count7 = GetGlobalVar "nov_cwin7"
		var win_count8 = GetGlobalVar "nov_cwin8"
		
		dialog "Победители Весны "
		
		if win_name1 != ""
			dialog win_name1 + " - " + win_count1
		endif
		if win_name2 != ""
			dialog win_name2 + " - " + win_count2
		endif
		if win_name3 != ""
			dialog win_name3 + " - " + win_count3
		endif
		if win_name4 != ""
			dialog win_name4 + " - " + win_count4
		endif
		if win_name5 != ""
			dialog win_name5 + " - " + win_count5
		endif
		if win_name6 != ""
			dialog win_name6 + " - " + win_count6
		endif
		if win_name7 != ""
			dialog win_name7 + " - " + win_count7
		endif
		if win_name8 != ""
			dialog win_name8 + " - " + win_count8
		endif
		return
	else
		dialog "Очистить список победителей?"
		wait
		choose menu "Да " "Нет "
			case 1
				SetGlobalStr "nov_win1" ""
				SetGlobalStr "nov_win2" ""
				SetGlobalStr "nov_win3" ""
				SetGlobalStr "nov_win4" ""
				SetGlobalStr "nov_win5" ""
				SetGlobalStr "nov_win6" ""
				SetGlobalStr "nov_win7" ""
				SetGlobalStr "nov_win8" ""
				SetGlobalVar "nov_cwin1" 0
				SetGlobalVar "nov_cwin2" 0
				SetGlobalVar "nov_cwin3" 0
				SetGlobalVar "nov_cwin4" 0
				SetGlobalVar "nov_cwin5" 0
				SetGlobalVar "nov_cwin6" 0
				SetGlobalVar "nov_cwin7" 0
				SetGlobalVar "nov_cwin8" 0
				dialog "Список победителей успешно очищен "
				close
				return
			break
			case 2
				close
				return
			break
		endchoose
	endif
return
*/