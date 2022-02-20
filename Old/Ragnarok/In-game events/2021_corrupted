
// ====================[NPC]====================
npc "prontera" "MAIN#2021corrupted" 4_M_ROKI2 130 125 5 0 0
OnInit:
	NpcOverBMP "group_3"

	AddQuestIDCondition 1
	SetQuestConditionBegin 1 1 7
	SetQuestConditionEnd
return

OnTouch2:
	if (v[VAR_CLEVEL] > 129)
		Talk2me "MAIN#2021corrupted" "Here!"
	endif
return

OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	var check = GetGlobalVar "ec_allowed"
	if (check_shield > 0)
		dialog "[MAIN]"
		dialog "Hey, GM."
		dialog "What do you want?"
		wait
		choose menu "Turn on/off" "140-150 mob count" "150-160 mob count" "160-170 mob count" "Maze mob count" "Cancel"
		case 1
			var check = GetGlobalVar "ec_allowed"
			if (check == 1)
				dialog "[MAIN]"
				dialog "Turn off?"
				wait
				choose menu "Yes" "Cancel"
				case 1
					SetGlobalVar "ec_allowed" 0
					cmdothernpc "#2021corrupted_maze_low" "off"
					cmdothernpc "#2021corrupted_maze_middle" "off"
					cmdothernpc "#2021corrupted_maze_high" "off"
					cmdothernpc "#2021corrupted_low" "off"
					cmdothernpc "#2021corrupted_middle" "off"
					cmdothernpc "#2021corrupted_high" "off"
					dialog "[MAIN]"
					dialog "Done"
					close
					return
				break
				case 2
					close
					return
				break
				endchoose
			else
				dialog "[MAIN]"
				dialog "Turn on?"
				wait
				choose menu "Yes" "Cancel"
				case 1
					SetGlobalVar "ec_allowed" 1
					cmdothernpc "#2021corrupted_maze_low" "spawn_all"
					cmdothernpc "#2021corrupted_maze_middle" "spawn_all"
					cmdothernpc "#2021corrupted_maze_high" "spawn_all"
					cmdothernpc "#2021corrupted_low" "spawn_all"
					cmdothernpc "#2021corrupted_middle" "spawn_all"
					cmdothernpc "#2021corrupted_high" "spawn_all"
					dialog "[MAIN]"
					dialog "Done"
					close
					return
				break
				case 2
					close
					return
				break
				endchoose
			endif
		break
		case 2
			var mob_count = GetGlobalVar "ec_low_count"
			dialog "[MAIN]"
			dialog "140-150 Monsters now: "+mob_count
			dialog "Want to change?"
			wait
			choose menu "Yes" "Cancel"
			case 1
				dlgwrite 1 1000
				if input == 0
					dialog "[MAIN]"
					dialog "Cancelled."
					close
					return
				elseif error
					dialog "[MAIN]"
					dialog "Error."
					close
					return
				endif
				SetGlobalVar "ec_low_count" input
				var mob_count = GetGlobalVar "ec_low_count"
				dialog "[MAIN]"
				dialog "140-150 Monsters now: "+mob_count
				close
				return
			break
			case 2
				close
				return
			break
			endchoose
		break
		case 3
			var mob_count = GetGlobalVar "ec_middle_count"
			dialog "[MAIN]"
			dialog "150-160 Monsters now: "+mob_count
			dialog "Want to change?"
			wait
			choose menu "Yes" "Cancel"
			case 1
				dlgwrite 1 1000
				if input == 0
					dialog "[MAIN]"
					dialog "Cancelled."
					close
					return
				elseif error
					dialog "[MAIN]"
					dialog "Error."
					close
					return
				endif
				SetGlobalVar "ec_middle_count" input
				var mob_count = GetGlobalVar "ec_middle_count"
				dialog "[MAIN]"
				dialog "150-160 Monsters now: "+mob_count
				close
				return
			break
			case 2
				close
				return
			break
			endchoose
		break
		case 4
			var mob_count = GetGlobalVar "ec_high_count"
			dialog "[MAIN]"
			dialog "160-170 Monsters now: "+mob_count
			dialog "Want to change?"
			wait
			choose menu "Yes" "Cancel"
			case 1
				dlgwrite 1 1000
				if input == 0
					dialog "[MAIN]"
					dialog "Cancelled."
					close
					return
				elseif error
					dialog "[MAIN]"
					dialog "Error."
					close
					return
				endif
				SetGlobalVar "ec_high_count" input
				var mob_count = GetGlobalVar "ec_high_count"
				dialog "[MAIN]"
				dialog "160-170 Monsters now: "+mob_count
				close
				return
			break
			case 2
				close
				return
			break
			endchoose
		break
		case 5
			var mob_count = GetGlobalVar "ec_maze_count"
			dialog "[MAIN]"
			dialog "Maze Monsters now: "+mob_count
			dialog "Want to change?"
			wait
			choose menu "Yes" "Cancel"
			case 1
				dlgwrite 1 1000
				if input == 0
					dialog "[MAIN]"
					dialog "Cancelled."
					close
					return
				elseif error
					dialog "[MAIN]"
					dialog "Error."
					close
					return
				endif
				SetGlobalVar "ec_maze_count" input
				var mob_count = GetGlobalVar "ec_maze_count"
				dialog "[MAIN]"
				dialog "Maze Monsters now: "+mob_count
				close
				return
			break
			case 2
				close
				return
			break
			endchoose
		break
		case 6
			close
			return
		break
		endchoose
	elseif ((check == 1)&(v[VAR_CLEVEL] > 129))
		dialog "[MAIN]"
		dialog "Hey, what do you want?"
		wait
		choose menu "140-150" "150-160" "160-170" "Maze" "Cancel"
		case 1
			dialog "[MAIN]"
			dialog "Good luck!"
			getitem N_Butterfly_Wing 1
			close
			moveto "egef_fild08" 208 335
			return
		break
		case 2
			dialog "[MAIN]"
			dialog "Good luck!"
			getitem N_Butterfly_Wing 1
			close
			moveto "elhz_fild01" 243 114
			return
		break
		case 3
			dialog "[MAIN]"
			dialog "Good luck!"
			getitem N_Butterfly_Wing 1
			close
			moveto "era_fild05" 59 31
			return
		break
		case 4
			dialog "[MAIN]"
			dialog "Good luck!"
			getitem N_Butterfly_Wing 1
			var place = rand 1 16
			close
			if (place == 1)
				moveto "eprt_maze03" 20 20
			elseif (place == 2)
				moveto "eprt_maze03" 59 20
			elseif (place == 3)
				moveto "eprt_maze03" 99 20
			elseif (place == 4)
				moveto "eprt_maze03" 145 20
			elseif (place == 5)
				moveto "eprt_maze03" 175 15
			elseif (place == 6)
				moveto "eprt_maze03" 178 58
			elseif (place == 7)
				moveto "eprt_maze03" 180 100
			elseif (place == 8)
				moveto "eprt_maze03" 180 140
			elseif (place == 9)
				moveto "eprt_maze03" 180 180
			elseif (place == 10)
				moveto "eprt_maze03" 140 180
			elseif (place == 11)
				moveto "eprt_maze03" 99 179
			elseif (place == 12)
				moveto "eprt_maze03" 59 180
			elseif (place == 13)
				moveto "eprt_maze03" 17 178
			elseif (place == 14)
				moveto "eprt_maze03" 17 139
			elseif (place == 15)
				moveto "eprt_maze03" 20 100
			else
				moveto "eprt_maze03" 19 61
			endif
			return
		break
		case 5
			dialog "[MAIN]"
			dialog "Okay"
			close
			return
		break
		endchoose
	else
		dialog "[MAIN]"
		dialog "Closed"
		close
		return
	endif
return

//===================[MAZE]======================
npc "eprt_maze03" "#2021corrupted_maze_low" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021corrupted_maze_low" "spawn_all"
return
OnCommand: "off"
	resetmymob
	warpallpcinthemap "prontera" 127 123
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "ec_maze_count"
	var maze_count = max_count / 3
	while (npcv "#2021corrupted_maze_low" [VAR_MYMOBCOUNT] < maze_count)
		cmdothernpc "#2021corrupted_maze_low" "spawn"
	endwhile
return
OnCommand: "spawn"
	var cell = rand 1 8
	if (cell == 1)
		callmonster "eprt_maze03" EC_KOBOLD_1 "Corrupted Kobold" 20 20 10 10 1
		callmonster "eprt_maze03" EC_KOBOLD_ARCHER "Corrupted Kobold Archer" 20 20 10 10 1
		callmonster "eprt_maze03" EC_PERMETER "Corrupted Permeter" 20 20 10 10 1
		callmonster "eprt_maze03" EC_SMOKIE "Corrupted Smokie" 20 20 10 10 1
	elseif (cell == 2)
		callmonster "eprt_maze03" EC_KOBOLD_1 "Corrupted Kobold" 59 19 10 10 1
		callmonster "eprt_maze03" EC_KOBOLD_ARCHER "Corrupted Kobold Archer" 59 19 10 10 1
		callmonster "eprt_maze03" EC_PERMETER "Corrupted Permeter" 59 19 10 10 1
		callmonster "eprt_maze03" EC_SMOKIE "Corrupted Smokie" 59 19 10 10 1
	elseif (cell == 3)
		callmonster "eprt_maze03" EC_KOBOLD_1 "Corrupted Kobold" 101 21 10 10 1
		callmonster "eprt_maze03" EC_KOBOLD_ARCHER "Corrupted Kobold Archer" 101 21 10 10 1
		callmonster "eprt_maze03" EC_PERMETER "Corrupted Permeter" 101 21 10 10 1
		callmonster "eprt_maze03" EC_SMOKIE "Corrupted Smokie" 101 21 10 10 1
	elseif (cell == 4)
		callmonster "eprt_maze03" EC_KOBOLD_1 "Corrupted Kobold" 140 20 10 10 1
		callmonster "eprt_maze03" EC_KOBOLD_ARCHER "Corrupted Kobold Archer" 140 20 10 10 1
		callmonster "eprt_maze03" EC_PERMETER "Corrupted Permeter" 140 20 10 10 1
		callmonster "eprt_maze03" EC_SMOKIE "Corrupted Smokie" 140 20 10 10 1
	elseif (cell == 5)
		callmonster "eprt_maze03" EC_KOBOLD_1 "Corrupted Kobold" 180 20 10 10 1
		callmonster "eprt_maze03" EC_KOBOLD_ARCHER "Corrupted Kobold Archer" 180 20 10 10 1
		callmonster "eprt_maze03" EC_PERMETER "Corrupted Permeter" 180 20 10 10 1
		callmonster "eprt_maze03" EC_SMOKIE "Corrupted Smokie" 180 20 10 10 1
	elseif (cell == 6)
		callmonster "eprt_maze03" EC_KOBOLD_1 "Corrupted Kobold" 180 59 10 10 1
		callmonster "eprt_maze03" EC_KOBOLD_ARCHER "Corrupted Kobold Archer" 180 59 10 10 1
		callmonster "eprt_maze03" EC_PERMETER "Corrupted Permeter" 180 59 10 10 1
		callmonster "eprt_maze03" EC_SMOKIE "Corrupted Smokie" 180 59 10 10 1
	elseif (cell == 7)
		callmonster "eprt_maze03" EC_KOBOLD_1 "Corrupted Kobold" 181 99 10 10 1
		callmonster "eprt_maze03" EC_KOBOLD_ARCHER "Corrupted Kobold Archer" 181 99 10 10 1
		callmonster "eprt_maze03" EC_PERMETER "Corrupted Permeter" 181 99 10 10 1
		callmonster "eprt_maze03" EC_SMOKIE "Corrupted Smokie" 181 99 10 10 1
	else
		callmonster "eprt_maze03" EC_KOBOLD_1 "Corrupted Kobold" 180 140 10 10 1
		callmonster "eprt_maze03" EC_KOBOLD_ARCHER "Corrupted Kobold Archer" 180 140 10 10 1
		callmonster "eprt_maze03" EC_PERMETER "Corrupted Permeter" 180 140 10 10 1
		callmonster "eprt_maze03" EC_SMOKIE "Corrupted Smokie" 180 140 10 10 1
	endif
return
OnMyMobDead:
	var max_count = GetGlobalVar "ec_maze_count"
	var maze_count = max_count / 3
	if (npcv "#2021corrupted_maze_low" [VAR_MYMOBCOUNT] < maze_count)
	  cmdothernpc "#2021corrupted_maze_low" "spawn"
	endif
return

npc "eprt_maze03" "#2021corrupted_maze_middle" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021corrupted_maze_middle" "spawn_all"
return
OnCommand: "off"
	resetmymob
	warpallpcinthemap "prontera" 127 123
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "ec_maze_count"
	var maze_count = max_count / 3
	while (npcv "#2021corrupted_maze_middle" [VAR_MYMOBCOUNT] < maze_count)
		cmdothernpc "#2021corrupted_maze_middle" "spawn"
	endwhile
return
OnCommand: "spawn"
	var cell = rand 1 8
	if (cell == 1)
		callmonster "eprt_maze03" EC_DESERT_WOLF "Corrupted Desert Wolf" 20 60 10 10 1
		callmonster "eprt_maze03" EC_GALION "Corrupted Galion" 20 60 10 10 1
		callmonster "eprt_maze03" EC_GRAND_PECO "Corrupted Grand Peco" 20 60 10 10 1
		callmonster "eprt_maze03" EC_SAVAGE "Corrupted Savage" 20 60 10 10 1
	elseif (cell == 2)
		callmonster "eprt_maze03" EC_DESERT_WOLF "Corrupted Desert Wolf" 20 100 10 10 1
		callmonster "eprt_maze03" EC_GALION "Corrupted Galion" 20 100 10 10 1
		callmonster "eprt_maze03" EC_GRAND_PECO "Corrupted Grand Peco" 20 100 10 10 1
		callmonster "eprt_maze03" EC_SAVAGE "Corrupted Savage" 20 100 10 10 1
	elseif (cell == 3)
		callmonster "eprt_maze03" EC_DESERT_WOLF "Corrupted Desert Wolf" 20 140 10 10 1
		callmonster "eprt_maze03" EC_GALION "Corrupted Galion" 20 140 10 10 1
		callmonster "eprt_maze03" EC_GRAND_PECO "Corrupted Grand Peco" 20 140 10 10 1
		callmonster "eprt_maze03" EC_SAVAGE "Corrupted Savage" 20 140 10 10 1
	elseif (cell == 4)
		callmonster "eprt_maze03" EC_DESERT_WOLF "Corrupted Desert Wolf" 20 180 10 10 1
		callmonster "eprt_maze03" EC_GALION "Corrupted Galion" 20 180 10 10 1
		callmonster "eprt_maze03" EC_GRAND_PECO "Corrupted Grand Peco" 20 180 10 10 1
		callmonster "eprt_maze03" EC_SAVAGE "Corrupted Savage" 20 180 10 10 1
	elseif (cell == 5)
		callmonster "eprt_maze03" EC_DESERT_WOLF "Corrupted Desert Wolf" 60 180 10 10 1
		callmonster "eprt_maze03" EC_GALION "Corrupted Galion" 60 180 10 10 1
		callmonster "eprt_maze03" EC_GRAND_PECO "Corrupted Grand Peco" 60 180 10 10 1
		callmonster "eprt_maze03" EC_SAVAGE "Corrupted Savage" 60 180 10 10 
	elseif (cell == 6)
		callmonster "eprt_maze03" EC_DESERT_WOLF "Corrupted Desert Wolf" 100 180 10 10 1
		callmonster "eprt_maze03" EC_GALION "Corrupted Galion" 100 180 10 10 1
		callmonster "eprt_maze03" EC_GRAND_PECO "Corrupted Grand Peco" 100 180 10 10 1
		callmonster "eprt_maze03" EC_SAVAGE "Corrupted Savage" 100 180 10 10 
	elseif (cell == 7)
		callmonster "eprt_maze03" EC_DESERT_WOLF "Corrupted Desert Wolf" 140 180 10 10 1
		callmonster "eprt_maze03" EC_GALION "Corrupted Galion" 140 180 10 10 1
		callmonster "eprt_maze03" EC_GRAND_PECO "Corrupted Grand Peco" 140 180 10 10 1
		callmonster "eprt_maze03" EC_SAVAGE "Corrupted Savage" 140 180 10 10 
	else
		callmonster "eprt_maze03" EC_DESERT_WOLF "Corrupted Desert Wolf" 180 180 10 10 1
		callmonster "eprt_maze03" EC_GALION "Corrupted Galion" 180 180 10 10 1
		callmonster "eprt_maze03" EC_GRAND_PECO "Corrupted Grand Peco" 180 180 10 10 1
		callmonster "eprt_maze03" EC_SAVAGE "Corrupted Savage" 180 180 10 10 
	endif
return
OnMyMobDead:
	var max_count = GetGlobalVar "ec_maze_count"
	var maze_count = max_count / 3
	if (npcv "#2021corrupted_maze_middle" [VAR_MYMOBCOUNT] < maze_count)
	  cmdothernpc "#2021corrupted_maze_middle" "spawn"
	endif
return

npc "eprt_maze03" "#2021corrupted_maze_high" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021corrupted_maze_high" "spawn_all"
return
OnCommand: "off"
	resetmymob
	warpallpcinthemap "prontera" 127 123
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "ec_maze_count"
	var maze_count = max_count / 3
	while (npcv "#2021corrupted_maze_high" [VAR_MYMOBCOUNT] < maze_count)
		cmdothernpc "#2021corrupted_maze_high" "spawn"
	endwhile
return
OnCommand: "spawn"
	var cell = rand 1 8
	if (cell == 1)
		callmonster "eprt_maze03" EC_PETIT "Corrupted Ground Petite" 60 60 10 10 1
		callmonster "eprt_maze03" EC_PETIT_ "Corrupted Flying Petite" 60 60 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS "Corrupted Gold Acidus" 60 60 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS_ "Corrupted Blue Acidus" 60 60 10 10 1
		callmonster "eprt_maze03" EC_SCORPION "Corrupted Scorpion" 60 60 10 10 1
		callmonster "eprt_maze03" EC_MAGMARING "Corrupted Magmaring" 60 60 10 10 1
	elseif (cell == 2)
		callmonster "eprt_maze03" EC_PETIT "Corrupted Ground Petite" 60 100 10 10 1
		callmonster "eprt_maze03" EC_PETIT_ "Corrupted Flying Petite" 60 100 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS "Corrupted Gold Acidus" 60 100 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS_ "Corrupted Blue Acidus" 60 100 10 10 1
		callmonster "eprt_maze03" EC_SCORPION "Corrupted Scorpion" 60 100 10 10 1
		callmonster "eprt_maze03" EC_MAGMARING "Corrupted Magmaring" 60 100 10 10 1
	elseif (cell == 3)
		callmonster "eprt_maze03" EC_PETIT "Corrupted Ground Petite" 60 140 10 10 1
		callmonster "eprt_maze03" EC_PETIT_ "Corrupted Flying Petite" 60 140 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS "Corrupted Gold Acidus" 60 140 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS_ "Corrupted Blue Acidus" 60 140 10 10 1
		callmonster "eprt_maze03" EC_SCORPION "Corrupted Scorpion" 60 140 10 10 1
		callmonster "eprt_maze03" EC_MAGMARING "Corrupted Magmaring" 60 140 10 10 1
	elseif (cell == 4)
		callmonster "eprt_maze03" EC_PETIT "Corrupted Ground Petite" 100 140 10 10 1
		callmonster "eprt_maze03" EC_PETIT_ "Corrupted Flying Petite" 100 140 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS "Corrupted Gold Acidus" 100 140 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS_ "Corrupted Blue Acidus" 100 140 10 10 1
		callmonster "eprt_maze03" EC_SCORPION "Corrupted Scorpion" 100 140 10 10 1
		callmonster "eprt_maze03" EC_MAGMARING "Corrupted Magmaring" 100 140 10 10 1
	elseif (cell == 5)
		callmonster "eprt_maze03" EC_PETIT "Corrupted Ground Petite" 140 140 10 10 1
		callmonster "eprt_maze03" EC_PETIT_ "Corrupted Flying Petite" 140 140 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS "Corrupted Gold Acidus" 140 140 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS_ "Corrupted Blue Acidus" 140 140 10 10 1
		callmonster "eprt_maze03" EC_SCORPION "Corrupted Scorpion" 140 140 10 10 1
		callmonster "eprt_maze03" EC_MAGMARING "Corrupted Magmaring" 140 140 10 10 1
	elseif (cell == 6)
		callmonster "eprt_maze03" EC_PETIT "Corrupted Ground Petite" 140 100 10 10 1
		callmonster "eprt_maze03" EC_PETIT_ "Corrupted Flying Petite" 140 100 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS "Corrupted Gold Acidus" 140 100 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS_ "Corrupted Blue Acidus" 140 100 10 10 1
		callmonster "eprt_maze03" EC_SCORPION "Corrupted Scorpion" 140 100 10 10 1
		callmonster "eprt_maze03" EC_MAGMARING "Corrupted Magmaring" 140 100 10 10 1
	elseif (cell == 7)
		callmonster "eprt_maze03" EC_PETIT "Corrupted Ground Petite" 140 60 10 10 1
		callmonster "eprt_maze03" EC_PETIT_ "Corrupted Flying Petite" 140 60 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS "Corrupted Gold Acidus" 140 60 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS_ "Corrupted Blue Acidus" 140 60 10 10 1
		callmonster "eprt_maze03" EC_SCORPION "Corrupted Scorpion" 140 60 10 10 1
		callmonster "eprt_maze03" EC_MAGMARING "Corrupted Magmaring" 140 60 10 10 1
	else
		callmonster "eprt_maze03" EC_PETIT "Corrupted Ground Petite" 100 60 10 10 1
		callmonster "eprt_maze03" EC_PETIT_ "Corrupted Flying Petite" 100 60 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS "Corrupted Gold Acidus" 100 60 10 10 1
		callmonster "eprt_maze03" EC_ACIDUS_ "Corrupted Blue Acidus" 100 60 10 10 1
		callmonster "eprt_maze03" EC_SCORPION "Corrupted Scorpion" 100 60 10 10 1
		callmonster "eprt_maze03" EC_MAGMARING "Corrupted Magmaring" 100 60 10 10 1
	endif
return
OnMyMobDead:
	var max_count = GetGlobalVar "ec_maze_count"
	var maze_count = max_count / 3
	if (npcv "#2021corrupted_maze_high" [VAR_MYMOBCOUNT] < maze_count)
	  cmdothernpc "#2021corrupted_maze_high" "spawn"
	endif
return

//===================[LOW]======================
npc "egef_fild08" "#2021corrupted_low" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021corrupted_low" "spawn_all"
return
OnCommand: "off"
	resetmymob
	warpallpcinthemap "prontera" 127 123
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "ec_low_count"
	while (npcv "#2021corrupted_low" [VAR_MYMOBCOUNT] < max_count)
		cmdothernpc "#2021corrupted_low" "spawn"
	endwhile
return
OnCommand: "spawn"
	callmonster "egef_fild08" EC_KOBOLD_1 "Corrupted Kobold" 0 0
	callmonster "egef_fild08" EC_KOBOLD_ARCHER "Corrupted Kobold Archer" 0 0
	callmonster "egef_fild08" EC_PERMETER "Corrupted Permeter" 0 0
	callmonster "egef_fild08" EC_SMOKIE "Corrupted Smokie" 0 0
return
OnMyMobDead:
	var max_count = GetGlobalVar "ec_low_count"
	if (npcv "#2021corrupted_low" [VAR_MYMOBCOUNT] < max_count)
	  cmdothernpc "#2021corrupted_low" "spawn"
	endif
return

//===================[MIDDLE]======================
npc "elhz_fild01" "#2021corrupted_middle" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021corrupted_middle" "spawn_all"
return
OnCommand: "off"
	resetmymob
	warpallpcinthemap "prontera" 127 123
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "ec_middle_count"
	while (npcv "#2021corrupted_middle" [VAR_MYMOBCOUNT] < max_count)
		cmdothernpc "#2021corrupted_middle" "spawn"
	endwhile
return
OnCommand: "spawn"
	callmonster "elhz_fild01" EC_DESERT_WOLF "Corrupted Desert Wolf" 0 0
	callmonster "elhz_fild01" EC_GALION "Corrupted Galion" 0 0
	callmonster "elhz_fild01" EC_GRAND_PECO "Corrupted Grand Peco" 0 0
	callmonster "elhz_fild01" EC_SAVAGE "Corrupted Savage" 0 0
return
OnMyMobDead:
	var max_count = GetGlobalVar "ec_middle_count"
	if (npcv "#2021corrupted_middle" [VAR_MYMOBCOUNT] < max_count)
		cmdothernpc "#2021corrupted_middle" "spawn"
	endif
return

//===================[HIGH]======================
npc "era_fild05" "#2021corrupted_high" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021corrupted_high" "spawn_all"
return
OnCommand: "off"
	resetmymob
	warpallpcinthemap "prontera" 127 123
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "ec_high_count"
	while (npcv "#2021corrupted_high" [VAR_MYMOBCOUNT] < max_count)
		cmdothernpc "#2021corrupted_high" "spawn"
	endwhile
return
OnCommand: "spawn"
	callmonster "era_fild05" EC_PETIT "Corrupted Ground Petite" 0 0
	callmonster "era_fild05" EC_PETIT_ "Corrupted Flying Petite" 0 0
	callmonster "era_fild05" EC_ACIDUS "Corrupted Gold Acidus" 0 0
	callmonster "era_fild05" EC_ACIDUS_ "Corrupted Blue Acidus" 0 0
	callmonster "era_fild05" EC_SCORPION "Corrupted Scorpion" 0 0
	callmonster "era_fild05" EC_MAGMARING "Corrupted Magmaring" 0 0
	callmonster "era_fild05" EC_DRAGON_EGG "Corrupted Egg" 0 0
return
OnMyMobDead:
	var max_count = GetGlobalVar "ec_high_count"
	if (npcv "#2021corrupted_high" [VAR_MYMOBCOUNT] < max_count)
		cmdothernpc "#2021corrupted_high" "spawn"
	endif
return


// ==================[WARPS]====================
// LOW
warp "egef_fild08" "eg08a-g06a" 200 355 4 2
OnTouch:
	moveto "elhz_fild01" 210 22
	return
warp "egef_fild08" "eg08b-g07b" 360 187 2 4
OnTouch:
	moveto "era_fild05" 30 15
	return
// MIDDLE
warp "elhz_fild01" "eLhzF01Dn_LightzDoor" 210 18 1 1
OnTouch:
    moveto "egef_fild08" 200 351
    return
warp "elhz_fild01" "eLhzF01R_LhzF02L" 367 222 1 1
OnTouch:
    moveto "era_fild05" 36 352
    return
// HIGH
warp "era_fild05" "eraF05S_raF09N" 27 13 1 1
OnTouch:
    moveto "egef_fild08" 356 187
    return
warp "era_fild05" "eraF05W_raF04E" 33 353 1 1
OnTouch:
    moveto "elhz_fild01" 363 222
    return
// MAZE
warp "eprt_maze03"	"e3maze1a1_3maze2d2" 5 186	1 1
OnTouch:
	moveto "eprt_maze03"	151 134
	return
warp "eprt_maze03"	"e3maze1a2_3maze4e1" 22 194	1 1
OnTouch:
	moveto "eprt_maze03"	175 48
	return				
warp "eprt_maze03"	"e3maze1b1_Random1" 58 194	1 1
OnTouch:				
	var ranMaze= rand 1 4			
	if ranMaze	== 1			
		moveto "eprt_maze03" 88 146
	elseif ranMaze	== 2			
		moveto "eprt_maze03" 8 58
	elseif ranMaze == 3			
		moveto "eprt_maze03" 137 128
	else			
		moveto "eprt_maze03" 48 21
	endif			
return				
warp "eprt_maze03"	"e3maze1c1_3maze4a3" 85 174	1 1
OnTouch:
	moveto "eprt_maze03"	14 48
	return
warp "eprt_maze03"	"e3maze1c2_3maze4d2" 102 165	1 1
OnTouch:
	moveto "eprt_maze03"	137 71
	return
warp "eprt_maze03"	"e3maze1d1_3maze3c2" 125 171	1 1
OnTouch:
	moveto "eprt_maze03"	105 111
	return
warp "eprt_maze03"	"e3maze1d2_3maze4d1" 154 181	1 1
OnTouch:
	moveto "eprt_maze03"	139 48
	return
warp "eprt_maze03"	"e3maze1e1_3maze5b3" 175 165	1 1
OnTouch:
	moveto "eprt_maze03"	71 12
	return
warp "eprt_maze03"	"e3maze1e2_3maze2e2" 194 175	1 1
OnTouch:
	moveto "eprt_maze03"	191 139
	return
warp "eprt_maze03"	"e3maze2a1_3maze4c4" 5 140	1 1
OnTouch:
	moveto "eprt_maze03"	111 56
	return
warp "eprt_maze03"	"e3maze2a2_3maze5b1" 18 154	1 1
OnTouch:
	moveto "eprt_maze03"	48 21
	return
warp "eprt_maze03"	"e3maze2a3_3maze4e2" 23 125	1 1
OnTouch:
	moveto "eprt_maze03"	177 71
	return
warp "eprt_maze03"	"e3maze2b1_3maze3d2" 54 154	1 1
OnTouch:
	moveto "eprt_maze03"	142 111
	return
warp "eprt_maze03"	"e3maze2b2_3maze3c1" 63 125	1 1
OnTouch:
	moveto "eprt_maze03"	88 97
	return
warp "eprt_maze03"	"e3maze2c1_3maze3a2" 85 146	1 1
OnTouch:
	moveto "eprt_maze03"	22 88
	return
warp "eprt_maze03"	"e3maze2c2_3maze5c2" 98 154	1 1
OnTouch:
	moveto "eprt_maze03"	99 31
	return
warp "eprt_maze03"	"e3maze2c3_3maze5e1" 114 145	1 1
OnTouch:
	moveto "eprt_maze03"	168 22
	return
warp "eprt_maze03"	"e3maze2d1_3maze4b2" 137 125	1 1
OnTouch:
	moveto "eprt_maze03"	71 71
	return
warp "eprt_maze03"	"e3maze2d2_3maze1a1" 154 134	1 1
OnTouch:
	moveto "eprt_maze03"	8 186
	return
warp "eprt_maze03"	"e3maze2e1_3maze3b4" 166 139	1 1
OnTouch:
	moveto "eprt_maze03"	63 88
	return
warp "eprt_maze03"	"e3maze2e2_3maze1e2" 194 139	1 1
OnTouch:
	moveto "eprt_maze03"	191 175
	return
warp "eprt_maze03"	"e3maze3a1_3maze3d1" 17 114	1 1
OnTouch:
	moveto "eprt_maze03"	129 102
	return
warp "eprt_maze03"	"e3maze3a2_3maze2c1" 22 85	1 1
OnTouch:
	moveto "eprt_maze03"	88 146
	return
warp "eprt_maze03"	"e3maze3b1_3maze4c3" 45 104	1 1
OnTouch:
	moveto "eprt_maze03"	96 48
	return
warp "eprt_maze03"	"e3maze3b2_3maze4a2" 63 114	1 1
OnTouch:
	moveto "eprt_maze03"	14 71
	return
warp "eprt_maze03"	"e3maze3b3_3maze5b2" 74 97	1 1
OnTouch:
	moveto "eprt_maze03"	56 8
	return
warp "eprt_maze03"	"e3maze3b4_3maze2e1" 63 85	1 1
OnTouch:
	moveto "eprt_maze03"	169 139
	return
warp "eprt_maze03"	"e3maze3c1_3maze2b2" 85 97	1 1
OnTouch:
	moveto "eprt_maze03"	63 128
	return
warp "eprt_maze03"	"e3maze3c2_3maze1d1" 105 114	1 1
OnTouch:
	moveto "eprt_maze03"	128 174
	return
warp "eprt_maze03"	"e3maze3c3_3maze5e2" 114 95	1 1
OnTouch:
	moveto "eprt_maze03"	176 8
	return
warp "eprt_maze03"	"e3maze3d1_3maze1b1" 125 105	1 1
OnTouch:
	moveto "eprt_maze03"	58 191
	return
warp "eprt_maze03"	"e3maze3d2_3maze2b1" 142 114	1 1
OnTouch:
	moveto "eprt_maze03"	54 151
	return
warp "eprt_maze03"	"e3maze3e1_3maze4e3" 168 94	1 1
OnTouch:
	moveto "eprt_maze03"	191 54
	return
warp "eprt_maze03"	"e3maze3e3_3maze5d1" 194 94	1 1
OnTouch:
	moveto "eprt_maze03"	151 22
	return
warp "eprt_maze03"	"e3maze4a1_3maze5e4" 5 58	1 1
OnTouch:
	moveto "eprt_maze03"	191 15
	return
warp "eprt_maze03"	"e3maze4a2_3maze3b2" 14 74	1 1
OnTouch:
	moveto "eprt_maze03"	63 111
	return
warp "eprt_maze03"	"e3maze4a3_3maze1c1" 14 45	1 1
OnTouch:
	moveto "eprt_maze03"	88 174
	return
warp "eprt_maze03"	"e3maze4b1_3maze5a2" 52 45	1 1
OnTouch:
	moveto "eprt_maze03"	16 31
	return				
warp "eprt_maze03"	"e3maze4b2_Random2" 74 74	1 1
OnTouch:				
	var ranMaze= rand 1 4			
	if ranMaze	== 1			
		moveto "eprt_maze03" 88 146
	elseif ranMaze	== 2			
		moveto "eprt_maze03" 8 58
	elseif ranMaze == 3			
		moveto "eprt_maze03" 137 128
	else			
		moveto "eprt_maze03" 48 21
	endif			
return
warp "eprt_maze03"	"e3maze4c1_3maze5e3" 85 56	1 1
OnTouch:
	moveto "eprt_maze03"	176 31
	return
warp "eprt_maze03"	"e3maze4c2_3maze5c3" 104 74	1 1
OnTouch:
	moveto "eprt_maze03"	111 22
	return
warp "eprt_maze03"	"e3maze4c3_3maze3b1" 96 45	1 1
OnTouch:
	moveto "eprt_maze03"	48 104
	return
warp "eprt_maze03"	"e3maze4c4_3maze2a1" 114 56	1 1
OnTouch:
	moveto "eprt_maze03"	8 140
	return					
warp "eprt_maze03"	"e3maze4d1_Random3" 139 45	1 1
OnTouch:				
	var ranMaze= rand 1 4			
	if ranMaze	== 1			
		moveto "eprt_maze03" 88 146
	elseif ranMaze	== 2			
		moveto "eprt_maze03" 8 58
	elseif ranMaze == 3			
		moveto "eprt_maze03" 137 128
	else			
		moveto "eprt_maze03" 48 21
	endif			
return
warp "eprt_maze03"	"e3maze4d2_3maze1c2" 137 74	1 1
OnTouch:
	moveto "eprt_maze03"	102 168
	return
warp "eprt_maze03"	"e3maze4e1_3maze1a2" 175 45	1 1
OnTouch:
	moveto "eprt_maze03"	22 191
	return
warp "eprt_maze03"	"e3maze4e2_3maze2a3" 177 74	1 1
OnTouch:
	moveto "eprt_maze03"	23 128
	return
warp "eprt_maze03"	"e3maze4e3_3maze3e1" 194 54	1 1
OnTouch:
	moveto "eprt_maze03"	171 94
	return
warp "eprt_maze03"	"e3maze5a1_3maze5c1" 23 5	1 1
OnTouch:
	moveto "eprt_maze03"	88 13
	return
warp "eprt_maze03"	"e3maze5a2_3maze4b1" 16 34	1 1
OnTouch:
	moveto "eprt_maze03"	52 48
	return
warp "eprt_maze03"	"e3maze5b1_3maze2a2" 45 21	1 1
OnTouch:
	moveto "eprt_maze03"	18 151
	return
warp "eprt_maze03"	"e3maze5b2_3maze3b3" 54 5	1 1
OnTouch:
	moveto "eprt_maze03"	71 97
	return
warp "eprt_maze03"	"e3maze5b3_3maze1e1" 74 12	1 1
OnTouch:
	moveto "eprt_maze03"	175 168
	return
warp "eprt_maze03"	"e3maze5c1_3maze5a1" 85 13	1 1
OnTouch:
	moveto "eprt_maze03"	23 8
	return
warp "eprt_maze03"	"e3maze5c2_3maze2c2" 99 34	1 1
OnTouch:
	moveto "eprt_maze03"	98 151
	return
warp "eprt_maze03"	"e3maze5c3_3maze4c2" 114 22	1 1
OnTouch:
	moveto "eprt_maze03"	104 71
	return				
warp "eprt_maze03"	"e3maze5d1_Random4" 154 22	1 1
OnTouch:				
	var ranMaze= rand 1 4			
	if ranMaze	== 1			
		moveto "eprt_maze03" 88 146
	elseif ranMaze	== 2			
		moveto "eprt_maze03" 8 58
	elseif ranMaze == 3			
		moveto "eprt_maze03" 137 128
	else			
		moveto "eprt_maze03" 48 21
	endif			
return	
warp "eprt_maze03"	"e3maze5e1_3maze2c3" 165 22	1 1
OnTouch:
	moveto "eprt_maze03"	111 146
	return
warp "eprt_maze03"	"e3maze5e2_3maze3c3" 176 5	1 1
OnTouch:
	moveto "eprt_maze03"	111 95
	return
warp "eprt_maze03"	"e3maze5e3_3maze4c1" 176 34	1 1
OnTouch:
	moveto "eprt_maze03"	88 56
	return
warp "eprt_maze03"	"e3maze5e4_3maze4a1" 194 15	1 1
OnTouch:
	moveto "eprt_maze03"	8 58
	return

// ==================[MONSTERS]====================
// LOW
// putmob "egef_fild08" 0 0 0 0 70 EC_KOBOLD_1 5000 0 0
// putmob "egef_fild08" 0 0 0 0 70 EC_KOBOLD_ARCHER 5000 0 0
// putmob "egef_fild08" 0 0 0 0 100 EC_PERMETER 5000 0 0
// putmob "egef_fild08" 0 0 0 0 60 EC_SMOKIE 5000 0 0
// MIDDLE
// putmob "elhz_fild01" 0 0 0 0 120 EC_DESERT_WOLF 5000 0 0
// putmob "elhz_fild01" 0 0 0 0 80 EC_GALION 5000 0 0
// putmob "elhz_fild01" 0 0 0 0 50 EC_GRAND_PECO 5000 0 0
// putmob "elhz_fild01" 0 0 0 0 50 EC_SAVAGE 5000 0 0
// HIGH
// putmob "era_fild05" 0 0 0 0 60 EC_PETIT 5000 0 0
// putmob "era_fild05" 0 0 0 0 60 EC_PETIT_ 5000 0 0
// putmob "era_fild05" 0 0 0 0 60 EC_ACIDUS 5000 0 0
// putmob "era_fild05" 0 0 0 0 60 EC_ACIDUS_ 5000 0 0
// putmob "era_fild05" 0 0 0 0 40 EC_SCORPION 5000 0 0
// putmob "era_fild05" 0 0 0 0 40 EC_MAGMARING 5000 0 0
// putmob "era_fild05" 0 0 0 0 20 EC_DRAGON_EGG 5000 0 0
// MAZE
// putmob "eprt_maze03" 42 82 32 72 25 EC_KOBOLD_1 5000 0 0
// putmob "eprt_maze03" 42 82 32 72 25 EC_KOBOLD_ARCHER 5000 0 0
// putmob "eprt_maze03" 42 82 32 72 30 EC_PERMETER 5000 0 0
// putmob "eprt_maze03" 42 82 32 72 20 EC_SMOKIE 5000 0 0

// putmob "eprt_maze03" 100 140 15 15 4 EC_DESERT_WOLF 20000 0 0
// putmob "eprt_maze03" 100 140 15 15 3 EC_GALION 20000 0 0
// putmob "eprt_maze03" 100 140 15 15 2 EC_GRAND_PECO 20000 0 0
// putmob "eprt_maze03" 100 140 15 15 2 EC_SAVAGE 20000 0 0
// putmob "eprt_maze03" 101 179 93 15 24 EC_DESERT_WOLF 5000 0 0
// putmob "eprt_maze03" 101 179 93 15 16 EC_GALION 5000 0 0
// putmob "eprt_maze03" 101 179 93 15 10 EC_GRAND_PECO 5000 0 0
// putmob "eprt_maze03" 101 179 93 15 10 EC_SAVAGE 5000 0 0
// putmob "eprt_maze03" 100 41 14 33 10 EC_DESERT_WOLF 5000 0 0
// putmob "eprt_maze03" 100 41 14 33 7 EC_GALION 5000 0 0
// putmob "eprt_maze03" 100 41 14 33 3 EC_GRAND_PECO 5000 0 0
// putmob "eprt_maze03" 100 41 14 33 3 EC_SAVAGE 5000 0 0

// putmob "eprt_maze03" 162 62 33 53 20 EC_PETIT 5000 0 0
// putmob "eprt_maze03" 162 62 33 53 20 EC_PETIT_ 5000 0 0
// putmob "eprt_maze03" 162 62 33 53 20 EC_ACIDUS 5000 0 0
// putmob "eprt_maze03" 162 62 33 53 20 EC_ACIDUS_ 5000 0 0
// putmob "eprt_maze03" 162 62 33 53 15 EC_SCORPION 5000 0 0
// putmob "eprt_maze03" 162 62 33 53 15 EC_MAGMARING 5000 0 0
// putmob "eprt_maze03" 162 62 33 53 5 EC_DRAGON_EGG 5000 0 0
