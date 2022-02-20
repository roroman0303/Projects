npc "eprt_fild02" "Табличка " 2_BOARD1 145 200 5 0 0
OnClick:
	dialog "Проход закрыт! "
	close
	return
return

npc "eprt_fild02" "Раск " 4_M_SOCCER9 45 347 5 0 0

OnInit:
	InitTimer
	strlocalvar 1 "warpson"
	
	SetLocalVar "warpson" 1
return

OnClick:
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	var current_place = GetGlobalVar "race_place"
	if v[jp_event46] == 7
		if curtime_in_sec < start_timer_in_sec
			var race_time = curtime_in_sec + 3600 - start_timer_in_sec
		else
			var race_time = curtime_in_sec - start_timer_in_sec
		endif
	else
		var race_time = v[jp_event49]
	endif
	var race_min = race_time / 60
	var race_sec = race_time % 60
	
	var name = PcName
	
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	
	var check_shield = GetEquipCount Ahura_Mazda
	
	if (check_shield > 0)
		dialog "warps on: "+lv["warpson"]+""
		wait
		while 1
			choose menu "warps on" "warps off"
				case 1
					enablenpc "warp10"
					enablenpc "warp50"
					enablenpc "warp90"
					SetLocalVar "warpson" 1
					dialog "enabled"
					close
					return
				break
				case 2
					disablenpc "warp10"
					disablenpc "warp50"
					disablenpc "warp90"
					SetLocalVar "warpson" 0
					dialog "disabled"
					close
					return
				break
			endchoose
		endwhile
	else
		if v[jp_event46] == 7
			if race_time > 360
				dialog "[Раск]"
				dialog "Неплохой результат, но "
				dialog "нужно бежать еще быстрее. "
				dialog "Попробуй улучшить время. "
				close
				moveto "eprt_fild02" 20 305
				return
			else
				dialog "[Раск]"
				dialog "Отличный результат. Может "
				dialog "когда нибудь ты составишь мне "
				dialog "конкуренцию в бегах. Теперь возвращаемся. "
				setitem jp_event46 8
				close
				moveto "prontera" 125 123
				return
			endif
		else
			dialog "[Раск]"
			dialog "Ты пробежал за "+race_min+":"+race_sec+""
			if race_time == first_place_time
				dialog "Невероятно! Это новый рекорд! "
				dialog "Теперь ты - быстрейший герой "
				dialog "Рун-Мидгарда! Поздравляю! "
				wait
			elseif race_time == second_place_time
				dialog "Ого! Ты очень близок к рекорду! "
				dialog "Молодец!!! "
				wait
			elseif race_time == third_place_time
				dialog "Ты вошел в тройку быстрейших "
				dialog "героев Рун-Мидгарда! "
				dialog "Потрясающе!!! "
				wait
			endif
			dialog "Ты занял "+players_place+" место. Вот твоя награда. "
			close
			if players_place == 1
				getitem Sky_Medal 30
			elseif players_place == 2
				getitem Sky_Medal 25
			elseif players_place == 3
				getitem Sky_Medal 20
			elseif (players_place > 3)&(players_place < 11)
				getitem Sky_Medal 10
			elseif players_place > 11
				getitem Sky_Medal 5
			else
				dialog "[Раск]"
				dialog "Ты не участвовал в гонке, как ты тут оказался? "
				close
				return
			endif
			moveto "prontera" 125 123
			return
		endif
	endif
return

OnTimer: 540000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Гонка кончится через 1 минуту! Поспешите! "
return
OnTimer: 590000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "10! "
return
OnTimer: 591000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "9! "
return
OnTimer: 592000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "8! "
return
OnTimer: 593000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "7! "
return
OnTimer: 594000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "6! "
return
OnTimer: 595000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "5! "
return
OnTimer: 596000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "4! "
return
OnTimer: 597000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "3! "
return
OnTimer: 598000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "2! "
return
OnTimer: 599000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "1! "
return
OnTimer: 600000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Гонка окончена! "
	warpallpcinthemap "prontera" 125 125
	SetGlobalVar "race_place" 0
	SetGlobalVar "allow_to_race" 1
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Гонка начнется через 5 минут! Регистрация открыта. "
return
OnTimer: 720000
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Гонка начнется через 3 минуты! "
return
OnTimer: 840000
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Гонка начнется через 1 минуту! "
return
OnTimer: 896000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "На Старт! "
return
OnTimer: 898000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Внимание! "
return
OnTimer: 900000
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Марш! "
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Гонка началась! Регистрация временно закрыта. "
	SetGlobalVar "race_place" 1
	SetGlobalVar "allow_to_race" 0
	stoptimer
	InitTimer
return

putmob "eprt_fild02" 0 0 0 0 150 E_POTON_CANON 5000 0 0

hiddenwarp "eprt_fild02" "start " 27 298 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 299 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 300 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 301 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 302 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 303 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 304 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 305 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 306 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 307 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 308 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 309 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 310 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "start " 27 311 0 0
OnTouch:
	var current_place = GetGlobalVar "race_place"
	var curtime = ServerTime
	setitem jp_event47 (curtime % 10000)
	if v[jp_event46] > 7
		if current_place != 0
			setitem jp_event48 0
		else
			moveto "eprt_fild02" 23 300
		endif
	endif
	
return

hiddenwarp "eprt_fild02" "finish " 50 318 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 319 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 320 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 321 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 322 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 323 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 324 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 325 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 326 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 327 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 328 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 329 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 330 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 331 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 332 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 333 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 334 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 335 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 336 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 337 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 338 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 339 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 340 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 341 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 342 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 343 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 344 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 345 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 346 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 347 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 348 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 349 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 350 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 351 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 352 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return

hiddenwarp "eprt_fild02" "finish " 50 353 0 0 
OnTouch:
	var name = PcName
	
	var start_timer = v[jp_event47]
	var start_min = (start_timer / 100)
	var start_sec = (start_timer % 100)
	var start_timer_in_sec = 60 * start_min + start_sec
	var players_place = v[jp_event48]
	var curtime = ServerTime
	var curmin = (curtime / 100 % 100)
	var cursec = (curtime % 100)
	var curtime_in_sec = 60 * curmin + cursec
	
	if curtime_in_sec < start_timer_in_sec
		var race_time = curtime_in_sec + 3600 - start_timer_in_sec
	else
		var race_time = curtime_in_sec - start_timer_in_sec
	endif
	
	var race_min = race_time / 60
	var race_sec = race_time % 60
		
	var current_place = GetGlobalVar "race_place"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	setitem jp_event49 race_time
	if (v[jp_event46] > 7) & (v[jp_event48] == 0)
		if race_time < first_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" first_place_time
			SetGlobalStr "second_place_name" second_place_name
			SetGlobalVar "first_place_time" race_time
			SetGlobalStr "first_place_name" name
			if race_sec < 10
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":0"+race_sec+""
			else
				broadcastserver "FF0000" FW_NORMAL 10 0 0 "Установлен новый рекорд! "+name+" - "+race_min+":"+race_sec+""
			endif
		elseif race_time < second_place_time
			SetGlobalVar "third_place_time" second_place_time
			SetGlobalStr "third_place_name" second_place_name
			SetGlobalVar "second_place_time" race_time
			SetGlobalStr "second_place_name" name
		elseif race_time < third_place_time
			SetGlobalVar "third_place_time" race_time
			SetGlobalStr "third_place_name" name
		endif
		if current_place == 1
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "В забеге победил "+name+"! "
		elseif current_place == 2
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Вторым пришел "+name+"! "
		elseif current_place == 3
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Замкнул тройку победителей "+name+"! "
		endif
		setitem jp_event48 current_place
		current_place = current_place + 1
		SetGlobalVar "race_place" current_place
	endif
return


hiddenwarp "eprt_fild02" "warp10" 105 352 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 105 353 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 105 354 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 105 355 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 105 356 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 105 357 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 105 358 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 105 359 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 105 360 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 357 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 358 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 359 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 360 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 361 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 362 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 363 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 364 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 365 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 366 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 367 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 368 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 369 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 370 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 371 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 149 372 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 68 199 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 69 199 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 69 198 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 70 198 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 70 197 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 71 197 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 71 196 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 72 196 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 72 195 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 73 195 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 73 194 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 74 194 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 74 193 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 75 193 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 75 192 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 79 76 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 78 76 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 78 75 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 77 75 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 77 74 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 76 74 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 76 73 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 75 73 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 75 72 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 74 72 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 74 71 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 73 71 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 73 70 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 72 70 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 72 69 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 71 69 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 71 68 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 284 93 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 285 93 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 285 92 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 286 92 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 286 91 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 287 91 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 287 90 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 288 90 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 288 89 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 289 89 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 289 88 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 290 88 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 290 87 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 291 87 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 291 86 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 292 86 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 260 210 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 261 210 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 262 210 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 263 210 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 264 210 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 265 210 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 266 210 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 247 316 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 247 317 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 247 318 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 247 319 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 247 320 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 247 321 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 247 322 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 247 323 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 247 324 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 224 120 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 225 120 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 226 120 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 227 120 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 228 120 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 229 120 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 230 120 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 231 120 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 232 120 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 233 120 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 234 120 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 235 120 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 220 148 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 220 149 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 220 150 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 220 151 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 220 152 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 220 153 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 220 154 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 138 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 139 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 139 131 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 140 131 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 140 132 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 141 132 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 141 133 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 142 133 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 142 134 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 143 134 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 143 135 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 144 135 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 178 179 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 178 178 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 178 177 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 178 176 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 178 175 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 178 174 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 346 203 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 345 203 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 344 203 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 99 240 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 98 240 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 97 240 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 96 240 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp10" 95 240 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff < 10
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 10
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 51 288 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 51 287 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 50 287 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 50 286 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 49 286 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 49 285 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 48 285 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 48 284 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 47 284 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 47 283 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 46 283 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 46 282 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 101 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 100 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 99 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 98 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 97 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 96 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 95 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 94 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 93 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 92 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 91 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 90 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 89 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 88 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 87 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 86 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 85 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 113 211 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 113 210 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 114 210 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 114 209 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 115 209 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 115 208 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 116 208 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 116 207 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 117 207 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 117 206 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 118 206 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 118 205 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 119 205 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 119 204 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 190 251 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 191 251 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 192 251 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 193 251 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 194 251 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 195 251 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 196 251 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 95 290 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 95 289 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 95 288 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 95 287 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 95 286 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 95 285 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 95 284 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 151 65 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 151 64 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 151 63 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 151 62 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 151 61 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 151 60 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 210 59 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 211 59 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 211 58 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 212 58 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 212 57 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 213 57 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 213 56 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 214 56 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 214 55 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 215 55 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 215 54 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 216 54 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 216 53 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 217 53 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 217 52 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 218 52 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 218 51 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 219 51 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 219 50 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 220 50 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 292 63 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 293 63 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 293 62 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 294 62 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 294 61 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 295 61 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 295 60 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 296 60 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 296 59 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 297 59 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 297 58 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 298 58 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 298 57 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 299 57 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 299 56 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 300 56 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 300 55 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 301 55 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 301 54 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 302 54 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 302 53 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 303 53 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 303 52 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 304 52 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 304 51 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 305 51 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 305 50 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 306 50 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 306 49 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 298 130 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 299 130 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 300 130 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 301 130 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 302 130 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 303 130 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 215 230 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 216 230 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 217 230 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 218 230 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 219 230 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 220 230 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 221 230 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 222 230 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 223 230 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 224 230 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 225 230 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 235 281 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 235 282 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 235 283 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 235 284 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 235 285 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 156 78 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 155 78 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 155 79 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 154 79 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 154 80 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 153 80 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 153 81 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 152 81 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 152 82 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 151 82 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 151 83 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 150 83 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 150 84 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 258 106 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 257 106 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 257 107 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 256 107 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 256 108 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 255 108 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 255 109 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 254 109 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 254 110 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 253 110 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 253 111 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 252 111 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 252 112 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 251 112 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 251 113 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 39 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 40 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 41 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 42 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 43 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 44 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 45 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 46 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 47 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 48 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 49 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 50 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 51 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 52 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 53 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 54 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 55 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 56 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 57 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 58 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 59 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 60 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 61 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 62 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 63 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 64 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 65 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 66 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 67 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 68 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 69 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 70 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 71 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 72 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 73 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp50" 74 150 0 0
OnTouch:
	var random_buff = rand 1 2
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff == 2
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 140 321 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 140 322 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 140 323 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 140 324 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 140 325 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 140 326 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 140 327 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 140 328 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 140 329 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 140 330 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 140 331 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 91 318 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 90 318 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 90 317 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 89 317 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 89 316 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 88 316 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 88 315 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 87 315 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 87 314 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 86 314 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 86 313 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 85 313 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 85 312 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 84 312 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 84 311 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 274 122 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 273 122 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 273 123 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 272 123 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 272 124 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 271 124 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 271 125 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 270 125 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 270 126 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 364 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 365 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 366 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 367 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 368 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 369 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 370 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 371 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 372 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 373 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 374 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 375 130 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 352 228 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 353 228 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 353 227 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 354 227 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 354 226 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 355 292 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 355 291 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 356 291 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 356 290 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 357 290 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 357 289 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 128 232 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 127 232 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 127 233 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 126 233 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 126 234 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 125 234 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 125 235 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 124 235 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 124 236 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 123 236 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 123 237 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 122 237 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 122 238 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 124 251 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 125 251 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 125 252 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 126 252 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 126 253 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 127 253 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 127 254 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 128 254 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 128 255 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 129 255 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 129 256 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 130 256 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 42 208 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 42 207 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 43 207 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 43 206 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 44 206 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 44 205 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 45 205 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 45 204 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 46 204 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 46 203 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 54 58 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 54 57 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 53 57 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 53 56 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 52 56 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 52 55 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 51 55 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 51 54 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 50 54 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 50 53 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 49 53 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 49 52 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 48 52 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 48 51 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 320 178 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 319 178 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 319 177 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 318 177 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 318 176 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 317 176 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 317 175 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 316 175 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 316 174 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 315 174 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 315 173 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 314 173 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 314 172 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 313 172 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 313 171 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 312 171 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 312 170 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 311 170 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 311 169 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 325 200 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 325 201 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

hiddenwarp "eprt_fild02" "warp90" 325 202 0 0
OnTouch:
	var random_buff = rand 1 10
	var curtime = ServerTime
	if (curtime % 10000) - v[jp_event49] > 1
		if random_buff == 1
			Condition EFFECTSlowPotion 5 100
			setitem jp_event49 (curtime % 10000)
		elseif random_buff > 1
			Condition EFFECTHaste 5 100
			setitem jp_event49 (curtime % 10000)
		endif
	else
		setitem jp_event49 (curtime % 10000)
	endif
return

