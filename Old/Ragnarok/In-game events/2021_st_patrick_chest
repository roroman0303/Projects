
npc "prt_fild03" "#chest_spawner_npc" 1_M_WIZARD 1 1 6 0 0
OnInit:
	InitTimer
	strlocalvar 1 "event_off"
	strlocalvar 2 "time_flag1"
	strlocalvar 3 "spawn_flag"
	strlocalvar 4 "target_min"

	SetLocalVar "event_off" 0
	SetLocalVar "time_flag1" 0
	SetLocalVar "spawn_flag" 0
	SetLocalVar "target_min" 0
	
	SetGlobalVar "chest_id" 20614
	SetGlobalStr "chest_name" "Набитый монетами сундучок "
	SetGlobalVar "chest_count" 1

return

OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		var mobID = GetGlobalVar "chest_id"
		var mob_name = GetGlobalStr "chest_name"
		var mob_count = GetGlobalVar "chest_count"
		var mobs_remaining = npcv "#chest_spawner_npc" [VAR_MYMOBCOUNT]
		var timer_off = lv["event_off"]
		var time_flag1 = lv["time_flag1"]
		var spawn_flag = lv["spawn_flag"]
		var curtime = ServerTime
		var curmin = (curtime % 10000) / 100
		var cursec = curtime % 100
		var target_min = lv["target_min"]

		dialog "mobs remaining: "+mobs_remaining+""
		dialog "Mob ID: "+mobID+""
		dialog "Mob name: "+mob_name+""
		dialog "Mob count: "+mob_count+""
		dialog "timer_off: "+timer_off+""
		dialog "curmin: "+curmin+""
		dialog "cursec: "+cursec+""
		dialog "target_min: "+target_min+""

		while (1)
			choose menu "Mob ID " "Mob name " "Mob Count " "Turn on " "Kill mobs " "Set Target min " "Start timer" "Stop timer"
				case 1
					dialog "Enter mob ID "
					dlgwrite 0 30000
					SetGlobalVar "chest_id" input
				break
				
				case 2
					dialog "Enter mobname "
					dlgwritestr
					SetGlobalStr "chest_name" inputstr
				break
				
				case 3	
					dialog "Enter mob count "
					dlgwrite 0 15000	
					if ( input > 15000 )
						dialog "You can't choose more than 15000"
						SetGlobalVar "chest_count" 15000
					else
						SetGlobalVar "chest_count" input
					endif
				break
				case 4
					dialog "There will be summoned "+mob_count+" of "+mobID+" with name "+mob_name+""
					choose menu "Turn on " "Cancel "
						case 1
							cmdothernpc "#chest_spawner_npc" "spawn"
							wait
						break	
						case 2
						break
					endchoose
				break

				case 5
					dialog "All monsters will be killed now "
					choose menu "Kill mobs " "Cancel "
						case 1
							resetmymob
						break
						
						case 2
						break
					endchoose
				break
				
				case 6
					dialog "Enter target minutes "
					dlgwrite 0 60
					SetLocalVar "target_min" input
				break
				
				case 7
					InitTimer
					SetLocalVar "event_off" 0
				break

				case 8
					stoptimer
					SetLocalVar "event_off" 1
				break
			endchoose
		endwhile
	else
		dialog "Go away"
	endif
return

OnTimer: 300
	var curtime = ServerTime
	var curmin = (curtime % 10000) / 100
	var cursec = curtime % 100
	var target_min = lv["target_min"]
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Время: "+curmin+":"+cursec+""
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Волна: "+target_min+""
	if target_min == 0
		var broadcast_min = 59
	else
		var broadcast_min = target_min - 1
	endif
	if (curmin == broadcast_min) & (cursec == 0)
		if lv["time_flag1"] == 0
			SetLocalVar "spawn_flag" 0
			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Сундуки появятся через 1 минуту "
			SetLocalVar "time_flag1" 1
		endif
	endif
	if (curmin == target_min) & (cursec == 0)
		if lv["spawn_flag"] == 0
			SetLocalVar "time_flag1" 0
			cmdothernpc "#chest_spawner_npc" "spawn"
			SetLocalVar "spawn_flag" 1
		endif
	endif
	var event_off_loc = lv["event_off"]
	if (event_off_loc == 1)
		stoptimer
	else
		stoptimer
		InitTimer
	endif
return

OnCommand: "spawn"
	stoptimer
	InitTimer
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Сундуки появились. "
	var mobID = GetGlobalVar "chest_id"
	var mob_count = GetGlobalVar "chest_count"
	var mob_name = GetGlobalStr "chest_name"
	var i = 0
	resetmymob
	while (i < mob_count)

		callmonster "prt_fild00" mobID mob_name 0 0
		callmonster "prt_fild01" mobID mob_name 0 0
		callmonster "prt_fild02" mobID mob_name 0 0
		callmonster "prt_fild03" mobID mob_name 0 0
		callmonster "prt_fild04" mobID mob_name 0 0
		callmonster "prt_fild05" mobID mob_name 0 0
		callmonster "prt_fild06" mobID mob_name 0 0
		callmonster "gef_fild00" mobID mob_name 0 0
		callmonster "gef_fild01" mobID mob_name 0 0
		callmonster "gef_fild02" mobID mob_name 0 0
		callmonster "gef_fild03" mobID mob_name 0 0
		callmonster "gef_fild04" mobID mob_name 0 0
		callmonster "gef_fild05" mobID mob_name 0 0
		callmonster "gef_fild06" mobID mob_name 0 0
		callmonster "gef_fild07" mobID mob_name 0 0
		callmonster "gef_fild08" mobID mob_name 0 0
		callmonster "gef_fild09" mobID mob_name 0 0
		callmonster "gef_fild10" mobID mob_name 0 0
		callmonster "gef_fild11" mobID mob_name 0 0
		callmonster "gef_fild12" mobID mob_name 0 0

//		broadcastserver "FF0000" FW_NORMAL 10 0 0 "Моб № "+i+""
		i = i + 1
	endwhile						
return

npc "pay_fild01" "#chest_spawner_npc3" 1_M_WIZARD 1 1 6 0 0
OnInit:
	InitTimer
	strlocalvar 1 "event_off"
	strlocalvar 2 "time_flag1"
	strlocalvar 3 "spawn_flag"
	strlocalvar 4 "target_min"

	SetLocalVar "event_off" 0
	SetLocalVar "time_flag1" 0
	SetLocalVar "spawn_flag" 0
	SetLocalVar "target_min" 0
	
return

OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		var mobID = GetGlobalVar "chest_id"
		var mob_name = GetGlobalStr "chest_name"
		var mob_count = GetGlobalVar "chest_count"
		var mobs_remaining = npcv "#chest_spawner_npc3" [VAR_MYMOBCOUNT]
		var timer_off = lv["event_off"]
		var time_flag1 = lv["time_flag1"]
		var spawn_flag = lv["spawn_flag"]
		var curtime = ServerTime
		var curmin = (curtime % 10000) / 100
		var cursec = curtime % 100
		var target_min = lv["target_min"]

		dialog "mobs remaining: "+mobs_remaining+""
		dialog "Mob ID: "+mobID+""
		dialog "Mob name: "+mob_name+""
		dialog "Mob count: "+mob_count+""
		dialog "timer_off: "+timer_off+""
		dialog "curmin: "+curmin+""
		dialog "cursec: "+cursec+""
		dialog "target_min: "+target_min+""

		while (1)
			choose menu "Mob ID " "Mob name " "Mob Count " "Turn on " "Kill mobs " "Set Target min " "Start timer" "Stop timer"
				case 1
					dialog "Enter mob ID "
					dlgwrite 0 30000
					SetGlobalVar "chest_id" input
				break
				
				case 2
					dialog "Enter mobname "
					dlgwritestr
					SetGlobalStr "chest_name" inputstr
				break
				
				case 3	
					dialog "Enter mob count "
					dlgwrite 0 15000	
					if ( input > 15000 )
						dialog "You can't choose more than 15000"
						SetGlobalVar "chest_count" 15000
					else
						SetGlobalVar "chest_count" input
					endif
				break
				case 4
					dialog "There will be summoned "+mob_count+" of "+mobID+" with name "+mob_name+""
					choose menu "Turn on " "Cancel "
						case 1
							cmdothernpc "#chest_spawner_npc3" "spawn"							
							wait
						break	
						case 2
						break
					endchoose
				break

				case 5
					dialog "All monsters will be killed now "
					choose menu "Kill mobs " "Cancel "
						case 1
							resetmymob
						break
						
						case 2
						break
					endchoose
				break
				
				case 6
					dialog "Enter target minutes "
					dlgwrite 0 60
					SetLocalVar "target_min" input
				break
				
				case 7
					InitTimer
					SetLocalVar "event_off" 0
				break

				case 8
					stoptimer
					SetLocalVar "event_off" 1
				break
			endchoose
		endwhile
	else
		dialog "Go away"
	endif
return

OnTimer: 300
	var curtime = ServerTime
	var curmin = (curtime % 10000) / 100
	var cursec = curtime % 100
	var target_min = lv["target_min"]
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Время: "+curmin+":"+cursec+""
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Волна: "+target_min+""
	if target_min == 0
		var broadcast_min = 59
	else
		var broadcast_min = target_min - 1
	endif
	if (curmin == broadcast_min) & (cursec == 0)
		if lv["time_flag1"] == 0
			SetLocalVar "spawn_flag" 0
			
			SetLocalVar "time_flag1" 1
		endif
	endif
	if (curmin == target_min) & (cursec == 0)
		if lv["spawn_flag"] == 0
			SetLocalVar "time_flag1" 0
			cmdothernpc "#chest_spawner_npc3" "spawn"
			SetLocalVar "spawn_flag" 1
		endif
	endif
	var event_off_loc = lv["event_off"]
	if (event_off_loc == 1)
		stoptimer
	else
		stoptimer
		InitTimer
	endif
return

OnCommand: "spawn"
	stoptimer
	InitTimer
	
	var mobID = GetGlobalVar "chest_id"
	var mob_count = GetGlobalVar "chest_count"
	var mob_name = GetGlobalStr "chest_name"
	var i = 0
	dialog "mobs remaining: "+mobs_remaining+""
	dialog "Mob ID: "+mobID+""
	dialog "Mob name: "+mob_name+""
	dialog "Mob count: "+mob_count+""
	
	resetmymob
	while (i < mob_count)

		callmonster "pay_fild01" mobID mob_name 0 0
		callmonster "pay_fild02" mobID mob_name 0 0
		callmonster "pay_fild03" mobID mob_name 0 0
		callmonster "pay_fild04" mobID mob_name 0 0
		callmonster "pay_fild05" mobID mob_name 0 0
		callmonster "pay_fild06" mobID mob_name 0 0
		callmonster "pay_fild07" mobID mob_name 0 0
		callmonster "pay_fild08" mobID mob_name 0 0
		callmonster "pay_fild09" mobID mob_name 0 0
		callmonster "pay_fild10" mobID mob_name 0 0
		callmonster "moc_fild02" mobID mob_name 0 0
		callmonster "moc_fild03" mobID mob_name 0 0
		callmonster "moc_fild13" mobID mob_name 0 0

//		broadcastserver "FF0000" FW_NORMAL 10 0 0 "Моб № "+i+""
		i = i + 1
	endwhile						
return

npc "yuno_fild12" "#chest_spawner_npc5" 1_M_WIZARD 1 1 6 0 0
OnInit:
	InitTimer
	strlocalvar 1 "event_off"
	strlocalvar 2 "time_flag1"
	strlocalvar 3 "spawn_flag"
	strlocalvar 4 "target_min"

	SetLocalVar "event_off" 0
	SetLocalVar "time_flag1" 0
	SetLocalVar "spawn_flag" 0
	SetLocalVar "target_min" 0
	
return

OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		var mobID = GetGlobalVar "chest_id"
		var mob_name = GetGlobalStr "chest_name"
		var mob_count = GetGlobalVar "chest_count"
		var mobs_remaining = npcv "#chest_spawner_npc5" [VAR_MYMOBCOUNT]
		var timer_off = lv["event_off"]
		var time_flag1 = lv["time_flag1"]
		var spawn_flag = lv["spawn_flag"]
		var curtime = ServerTime
		var curmin = (curtime % 10000) / 100
		var cursec = curtime % 100
		var target_min = lv["target_min"]

		dialog "mobs remaining: "+mobs_remaining+""
		dialog "Mob ID: "+mobID+""
		dialog "Mob name: "+mob_name+""
		dialog "Mob count: "+mob_count+""
		dialog "timer_off: "+timer_off+""
		dialog "curmin: "+curmin+""
		dialog "cursec: "+cursec+""
		dialog "target_min: "+target_min+""

		while (1)
			choose menu "Mob ID " "Mob name " "Mob Count " "Turn on " "Kill mobs " "Set Target min " "Start timer" "Stop timer"
				case 1
					dialog "Enter mob ID "
					dlgwrite 0 30000
					SetGlobalVar "chest_id" input
				break
				
				case 2
					dialog "Enter mobname "
					dlgwritestr
					SetGlobalStr "chest_name" inputstr
				break
				
				case 3	
					dialog "Enter mob count "
					dlgwrite 0 15000	
					if ( input > 15000 )
						dialog "You can't choose more than 15000"
						SetGlobalVar "chest_count" 15000
					else
						SetGlobalVar "chest_count" input
					endif
				break
				case 4
					dialog "There will be summoned "+mob_count+" of "+mobID+" with name "+mob_name+""
					choose menu "Turn on " "Cancel "
						case 1
							cmdothernpc "#chest_spawner_npc5" "spawn"							
							wait
						break	
						case 2
						break
					endchoose
				break

				case 5
					dialog "All monsters will be killed now "
					choose menu "Kill mobs " "Cancel "
						case 1
							resetmymob
						break
						
						case 2
						break
					endchoose
				break
				
				case 6
					dialog "Enter target minutes "
					dlgwrite 0 60
					SetLocalVar "target_min" input
				break
				
				case 7
					InitTimer
					SetLocalVar "event_off" 0
				break

				case 8
					stoptimer
					SetLocalVar "event_off" 1
				break
			endchoose
		endwhile
	else
		dialog "Go away"
	endif
return

OnTimer: 300
	var curtime = ServerTime
	var curmin = (curtime % 10000) / 100
	var cursec = curtime % 100
	var target_min = lv["target_min"]
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Время: "+curmin+":"+cursec+""
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Волна: "+target_min+""
	if target_min == 0
		var broadcast_min = 59
	else
		var broadcast_min = target_min - 1
	endif
	if (curmin == broadcast_min) & (cursec == 0)
		if lv["time_flag1"] == 0
			SetLocalVar "spawn_flag" 0
			
			SetLocalVar "time_flag1" 1
		endif
	endif
	if (curmin == target_min) & (cursec == 0)
		if lv["spawn_flag"] == 0
			SetLocalVar "time_flag1" 0
			cmdothernpc "#chest_spawner_npc5" "spawn"
			SetLocalVar "spawn_flag" 1
		endif
	endif
	var event_off_loc = lv["event_off"]
	if (event_off_loc == 1)
		stoptimer
	else
		stoptimer
		InitTimer
	endif
return

OnCommand: "spawn"
	stoptimer
	InitTimer
	
	var mobID = GetGlobalVar "chest_id"
	var mob_count = GetGlobalVar "chest_count"
	var mob_name = GetGlobalStr "chest_name"
	var i = 0
	dialog "mobs remaining: "+mobs_remaining+""
	dialog "Mob ID: "+mobID+""
	dialog "Mob name: "+mob_name+""
	dialog "Mob count: "+mob_count+""
	
	resetmymob
	while (i < mob_count)

		callmonster "yuno_fild12" mobID mob_name 0 0

//		broadcastserver "FF0000" FW_NORMAL 10 0 0 "Моб № "+i+""
		i = i + 1
	endwhile						
return

npc "gef_fild13" "#chest_spawner_npc6" 1_M_WIZARD 1 1 6 0 0
OnInit:
	InitTimer
	strlocalvar 1 "event_off"
	strlocalvar 2 "time_flag1"
	strlocalvar 3 "spawn_flag"
	strlocalvar 4 "target_min"

	SetLocalVar "event_off" 0
	SetLocalVar "time_flag1" 0
	SetLocalVar "spawn_flag" 0
	SetLocalVar "target_min" 0
	
return

OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		var mobID = GetGlobalVar "chest_id"
		var mob_name = GetGlobalStr "chest_name"
		var mob_count = GetGlobalVar "chest_count"
		var mobs_remaining = npcv "#chest_spawner_npc6" [VAR_MYMOBCOUNT]
		var timer_off = lv["event_off"]
		var time_flag1 = lv["time_flag1"]
		var spawn_flag = lv["spawn_flag"]
		var curtime = ServerTime
		var curmin = (curtime % 10000) / 100
		var cursec = curtime % 100
		var target_min = lv["target_min"]

		dialog "mobs remaining: "+mobs_remaining+""
		dialog "Mob ID: "+mobID+""
		dialog "Mob name: "+mob_name+""
		dialog "Mob count: "+mob_count+""
		dialog "timer_off: "+timer_off+""
		dialog "curmin: "+curmin+""
		dialog "cursec: "+cursec+""
		dialog "target_min: "+target_min+""

		while (1)
			choose menu "Mob ID " "Mob name " "Mob Count " "Turn on " "Kill mobs " "Set Target min " "Start timer" "Stop timer"
				case 1
					dialog "Enter mob ID "
					dlgwrite 0 30000
					SetGlobalVar "chest_id" input
				break
				
				case 2
					dialog "Enter mobname "
					dlgwritestr
					SetGlobalStr "chest_name" inputstr
				break
				
				case 3	
					dialog "Enter mob count "
					dlgwrite 0 15000	
					if ( input > 15000 )
						dialog "You can't choose more than 15000"
						SetGlobalVar "chest_count" 15000
					else
						SetGlobalVar "chest_count" input
					endif
				break
				case 4
					dialog "There will be summoned "+mob_count+" of "+mobID+" with name "+mob_name+""
					choose menu "Turn on " "Cancel "
						case 1
							cmdothernpc "#chest_spawner_npc6" "spawn"							
							wait
						break	
						case 2
						break
					endchoose
				break

				case 5
					dialog "All monsters will be killed now "
					choose menu "Kill mobs " "Cancel "
						case 1
							resetmymob
						break
						
						case 2
						break
					endchoose
				break
				
				case 6
					dialog "Enter target minutes "
					dlgwrite 0 60
					SetLocalVar "target_min" input
				break
				
				case 7
					InitTimer
					SetLocalVar "event_off" 0
				break

				case 8
					stoptimer
					SetLocalVar "event_off" 1
				break
			endchoose
		endwhile
	else
		dialog "Go away"
	endif
return

OnTimer: 300
	var curtime = ServerTime
	var curmin = (curtime % 10000) / 100
	var cursec = curtime % 100
	var target_min = lv["target_min"]
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Время: "+curmin+":"+cursec+""
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Волна: "+target_min+""
	if target_min == 0
		var broadcast_min = 59
	else
		var broadcast_min = target_min - 1
	endif
	if (curmin == broadcast_min) & (cursec == 0)
		if lv["time_flag1"] == 0
			SetLocalVar "spawn_flag" 0
			
			SetLocalVar "time_flag1" 1
		endif
	endif
	if (curmin == target_min) & (cursec == 0)
		if lv["spawn_flag"] == 0
			SetLocalVar "time_flag1" 0
			cmdothernpc "#chest_spawner_npc6" "spawn"
			SetLocalVar "spawn_flag" 1
		endif
	endif
	var event_off_loc = lv["event_off"]
	if (event_off_loc == 1)
		stoptimer
	else
		stoptimer
		InitTimer
	endif
return

OnCommand: "spawn"
	stoptimer
	InitTimer
	
	var mobID = GetGlobalVar "chest_id"
	var mob_count = GetGlobalVar "chest_count"
	var mob_name = GetGlobalStr "chest_name"
	var i = 0
	dialog "mobs remaining: "+mobs_remaining+""
	dialog "Mob ID: "+mobID+""
	dialog "Mob name: "+mob_name+""
	dialog "Mob count: "+mob_count+""
	
	resetmymob
	while (i < mob_count)

		callmonster "gef_fild13" mobID mob_name 0 0

//		broadcastserver "FF0000" FW_NORMAL 10 0 0 "Моб № "+i+""
		i = i + 1
	endwhile						
return

npc "prt_fild07" "#chest_spawner_npc11" 1_M_WIZARD 1 1 6 0 0
OnInit:
	InitTimer
	strlocalvar 1 "event_off"
	strlocalvar 2 "time_flag1"
	strlocalvar 3 "spawn_flag"
	strlocalvar 4 "target_min"

	SetLocalVar "event_off" 0
	SetLocalVar "time_flag1" 0
	SetLocalVar "spawn_flag" 0
	SetLocalVar "target_min" 0
	
return

OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		var mobID = GetGlobalVar "chest_id"
		var mob_name = GetGlobalStr "chest_name"
		var mob_count = GetGlobalVar "chest_count"
		var mobs_remaining = npcv "#chest_spawner_npc11" [VAR_MYMOBCOUNT]
		var timer_off = lv["event_off"]
		var time_flag1 = lv["time_flag1"]
		var spawn_flag = lv["spawn_flag"]
		var curtime = ServerTime
		var curmin = (curtime % 10000) / 100
		var cursec = curtime % 100
		var target_min = lv["target_min"]

		dialog "mobs remaining: "+mobs_remaining+""
		dialog "Mob ID: "+mobID+""
		dialog "Mob name: "+mob_name+""
		dialog "Mob count: "+mob_count+""
		dialog "timer_off: "+timer_off+""
		dialog "curmin: "+curmin+""
		dialog "cursec: "+cursec+""
		dialog "target_min: "+target_min+""

		while (1)
			choose menu "Mob ID " "Mob name " "Mob Count " "Turn on " "Kill mobs " "Set Target min " "Start timer" "Stop timer"
				case 1
					dialog "Enter mob ID "
					dlgwrite 0 30000
					SetGlobalVar "chest_id" input
				break
				
				case 2
					dialog "Enter mobname "
					dlgwritestr
					SetGlobalStr "chest_name" inputstr
				break
				
				case 3	
					dialog "Enter mob count "
					dlgwrite 0 15000	
					if ( input > 15000 )
						dialog "You can't choose more than 15000"
						SetGlobalVar "chest_count" 15000
					else
						SetGlobalVar "chest_count" input
					endif
				break
				case 4
					dialog "There will be summoned "+mob_count+" of "+mobID+" with name "+mob_name+""
					choose menu "Turn on " "Cancel "
						case 1
							cmdothernpc "#chest_spawner_npc11" "spawn"							
							wait
						break	
						case 2
						break
					endchoose
				break

				case 5
					dialog "All monsters will be killed now "
					choose menu "Kill mobs " "Cancel "
						case 1
							resetmymob
						break
						
						case 2
						break
					endchoose
				break
				
				case 6
					dialog "Enter target minutes "
					dlgwrite 0 60
					SetLocalVar "target_min" input
				break
				
				case 7
					InitTimer
					SetLocalVar "event_off" 0
				break

				case 8
					stoptimer
					SetLocalVar "event_off" 1
				break
			endchoose
		endwhile
	else
		dialog "Go away"
	endif
return

OnTimer: 300
	var curtime = ServerTime
	var curmin = (curtime % 10000) / 100
	var cursec = curtime % 100
	var target_min = lv["target_min"]
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Время: "+curmin+":"+cursec+""
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Волна: "+target_min+""
	if target_min == 0
		var broadcast_min = 59
	else
		var broadcast_min = target_min - 1
	endif
	if (curmin == broadcast_min) & (cursec == 0)
		if lv["time_flag1"] == 0
			SetLocalVar "spawn_flag" 0
			
			SetLocalVar "time_flag1" 1
		endif
	endif
	if (curmin == target_min) & (cursec == 0)
		if lv["spawn_flag"] == 0
			SetLocalVar "time_flag1" 0
			cmdothernpc "#chest_spawner_npc11" "spawn"
			SetLocalVar "spawn_flag" 1
		endif
	endif
	var event_off_loc = lv["event_off"]
	if (event_off_loc == 1)
		stoptimer
	else
		stoptimer
		InitTimer
	endif
return

OnCommand: "spawn"
	stoptimer
	InitTimer
	
	var mobID = GetGlobalVar "chest_id"
	var mob_count = GetGlobalVar "chest_count"
	var mob_name = GetGlobalStr "chest_name"
	var i = 0
	dialog "mobs remaining: "+mobs_remaining+""
	dialog "Mob ID: "+mobID+""
	dialog "Mob name: "+mob_name+""
	dialog "Mob count: "+mob_count+""
	
	resetmymob
	while (i < mob_count)

		callmonster "prt_fild07" mobID mob_name 0 0
		callmonster "prt_fild08" mobID mob_name 0 0
		callmonster "prt_fild09" mobID mob_name 0 0
		callmonster "prt_fild10" mobID mob_name 0 0
		callmonster "prt_fild11" mobID mob_name 0 0

//		broadcastserver "FF0000" FW_NORMAL 10 0 0 "Моб № "+i+""
		i = i + 1
	endwhile						
return

npc "moc_fild01" "#chest_spawner_npc14" 1_M_WIZARD 1 1 6 0 0
OnInit:
	InitTimer
	strlocalvar 1 "event_off"
	strlocalvar 2 "time_flag1"
	strlocalvar 3 "spawn_flag"
	strlocalvar 4 "target_min"

	SetLocalVar "event_off" 0
	SetLocalVar "time_flag1" 0
	SetLocalVar "spawn_flag" 0
	SetLocalVar "target_min" 0
	
return

OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		var mobID = GetGlobalVar "chest_id"
		var mob_name = GetGlobalStr "chest_name"
		var mob_count = GetGlobalVar "chest_count"
		var mobs_remaining = npcv "#chest_spawner_npc14" [VAR_MYMOBCOUNT]
		var timer_off = lv["event_off"]
		var time_flag1 = lv["time_flag1"]
		var spawn_flag = lv["spawn_flag"]
		var curtime = ServerTime
		var curmin = (curtime % 10000) / 100
		var cursec = curtime % 100
		var target_min = lv["target_min"]

		dialog "mobs remaining: "+mobs_remaining+""
		dialog "Mob ID: "+mobID+""
		dialog "Mob name: "+mob_name+""
		dialog "Mob count: "+mob_count+""
		dialog "timer_off: "+timer_off+""
		dialog "curmin: "+curmin+""
		dialog "cursec: "+cursec+""
		dialog "target_min: "+target_min+""

		while (1)
			choose menu "Mob ID " "Mob name " "Mob Count " "Turn on " "Kill mobs " "Set Target min " "Start timer" "Stop timer"
				case 1
					dialog "Enter mob ID "
					dlgwrite 0 30000
					SetGlobalVar "chest_id" input
				break
				
				case 2
					dialog "Enter mobname "
					dlgwritestr
					SetGlobalStr "chest_name" inputstr
				break
				
				case 3	
					dialog "Enter mob count "
					dlgwrite 0 15000	
					if ( input > 15000 )
						dialog "You can't choose more than 15000"
						SetGlobalVar "chest_count" 15000
					else
						SetGlobalVar "chest_count" input
					endif
				break
				case 4
					dialog "There will be summoned "+mob_count+" of "+mobID+" with name "+mob_name+""
					choose menu "Turn on " "Cancel "
						case 1
							cmdothernpc "#chest_spawner_npc14" "spawn"							
							wait
						break	
						case 2
						break
					endchoose
				break

				case 5
					dialog "All monsters will be killed now "
					choose menu "Kill mobs " "Cancel "
						case 1
							resetmymob
						break
						
						case 2
						break
					endchoose
				break
				
				case 6
					dialog "Enter target minutes "
					dlgwrite 0 60
					SetLocalVar "target_min" input
				break
				
				case 7
					InitTimer
					SetLocalVar "event_off" 0
				break

				case 8
					stoptimer
					SetLocalVar "event_off" 1
				break
			endchoose
		endwhile
	else
		dialog "Go away"
	endif
return

OnTimer: 300
	var curtime = ServerTime
	var curmin = (curtime % 10000) / 100
	var cursec = curtime % 100
	var target_min = lv["target_min"]
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Время: "+curmin+":"+cursec+""
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Волна: "+target_min+""
	if target_min == 0
		var broadcast_min = 59
	else
		var broadcast_min = target_min - 1
	endif
	if (curmin == broadcast_min) & (cursec == 0)
		if lv["time_flag1"] == 0
			SetLocalVar "spawn_flag" 0
			
			SetLocalVar "time_flag1" 1
		endif
	endif
	if (curmin == target_min) & (cursec == 0)
		if lv["spawn_flag"] == 0
			SetLocalVar "time_flag1" 0
			cmdothernpc "#chest_spawner_npc14" "spawn"
			SetLocalVar "spawn_flag" 1
		endif
	endif
	var event_off_loc = lv["event_off"]
	if (event_off_loc == 1)
		stoptimer
	else
		stoptimer
		InitTimer
	endif
return

OnCommand: "spawn"
	stoptimer
	InitTimer
	
	var mobID = GetGlobalVar "chest_id"
	var mob_count = GetGlobalVar "chest_count"
	var mob_name = GetGlobalStr "chest_name"
	var i = 0
	dialog "mobs remaining: "+mobs_remaining+""
	dialog "Mob ID: "+mobID+""
	dialog "Mob name: "+mob_name+""
	dialog "Mob count: "+mob_count+""
	
	resetmymob
	while (i < mob_count)

		callmonster "yuno_fild01" mobID mob_name 0 0
		callmonster "yuno_fild02" mobID mob_name 0 0
		callmonster "yuno_fild03" mobID mob_name 0 0
		callmonster "yuno_fild04" mobID mob_name 0 0
		callmonster "yuno_fild05" mobID mob_name 0 0
		callmonster "yuno_fild06" mobID mob_name 0 0
		callmonster "yuno_fild07" mobID mob_name 0 0
		callmonster "yuno_fild08" mobID mob_name 0 0
		callmonster "yuno_fild09" mobID mob_name 0 0
		callmonster "yuno_fild10" mobID mob_name 0 0
		callmonster "yuno_fild11" mobID mob_name 0 0
		callmonster "moc_fild01" mobID mob_name 0 0
		callmonster "moc_fild04" mobID mob_name 0 0
		callmonster "moc_fild05" mobID mob_name 0 0
		callmonster "moc_fild06" mobID mob_name 0 0
		callmonster "moc_fild07" mobID mob_name 0 0
		callmonster "moc_fild08" mobID mob_name 0 0
		callmonster "moc_fild09" mobID mob_name 0 0
		callmonster "moc_fild10" mobID mob_name 0 0
		callmonster "moc_fild11" mobID mob_name 0 0
		callmonster "moc_fild12" mobID mob_name 0 0
		callmonster "moc_fild14" mobID mob_name 0 0
		callmonster "moc_fild15" mobID mob_name 0 0
		callmonster "moc_fild16" mobID mob_name 0 0
		callmonster "moc_fild17" mobID mob_name 0 0
		callmonster "moc_fild18" mobID mob_name 0 0

//		broadcastserver "FF0000" FW_NORMAL 10 0 0 "Моб № "+i+""
		i = i + 1
	endwhile						
return

