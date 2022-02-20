
npc "alberta" "#2021birthday_alberta" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_alberta" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_alberta" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "alberta" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "alberta" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_alberta" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_alberta" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_alberta" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_alberta" [VAR_MYMOBCOUNT] < max_count)
		callmonster "alberta" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "alberta" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "aldebaran" "#2021birthday_aldebaran" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_aldebaran" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_aldebaran" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "aldebaran" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "aldebaran" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_aldebaran" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_aldebaran" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_aldebaran" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_aldebaran" [VAR_MYMOBCOUNT] < max_count)
		callmonster "aldebaran" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "aldebaran" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "amatsu" "#2021birthday_amatsu" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_amatsu" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_amatsu" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "amatsu" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "amatsu" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_amatsu" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_amatsu" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_amatsu" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_amatsu" [VAR_MYMOBCOUNT] < max_count)
		callmonster "amatsu" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "amatsu" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "ayothaya" "#2021birthday_ayothaya" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_ayothaya" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_ayothaya" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "ayothaya" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "ayothaya" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_ayothaya" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_ayothaya" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_ayothaya" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_ayothaya" [VAR_MYMOBCOUNT] < max_count)
		callmonster "ayothaya" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "ayothaya" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "brasilis" "#2021birthday_brasilis" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_brasilis" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_brasilis" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "brasilis" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "brasilis" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_brasilis" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_brasilis" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_brasilis" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_brasilis" [VAR_MYMOBCOUNT] < max_count)
		callmonster "brasilis" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "brasilis" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "comodo" "#2021birthday_comodo" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_comodo" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_comodo" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "comodo" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "comodo" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_comodo" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_comodo" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_comodo" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_comodo" [VAR_MYMOBCOUNT] < max_count)
		callmonster "comodo" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "comodo" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "dewata" "#2021birthday_dewata" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_dewata" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_dewata" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "dewata" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "dewata" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_dewata" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_dewata" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_dewata" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_dewata" [VAR_MYMOBCOUNT] < max_count)
		callmonster "dewata" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "dewata" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "eclage" "#2021birthday_eclage" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_eclage" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_eclage" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "eclage" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "eclage" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_eclage" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_eclage" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_eclage" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_eclage" [VAR_MYMOBCOUNT] < max_count)
		callmonster "eclage" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "eclage" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "geffen" "#2021birthday_geffen" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_geffen" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_geffen" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "geffen" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "geffen" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_geffen" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_geffen" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_geffen" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_geffen" [VAR_MYMOBCOUNT] < max_count)
		callmonster "geffen" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "geffen" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "gonryun" "#2021birthday_gonryun" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_gonryun" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_gonryun" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "gonryun" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "gonryun" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_gonryun" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_gonryun" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_gonryun" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_gonryun" [VAR_MYMOBCOUNT] < max_count)
		callmonster "gonryun" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "gonryun" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "harboro1" "#2021birthday_harboro1" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_harboro1" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_harboro1" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "harboro1" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "harboro1" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_harboro1" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_harboro1" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_harboro1" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_harboro1" [VAR_MYMOBCOUNT] < max_count)
		callmonster "harboro1" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "harboro1" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "izlude_a" "#2021birthday_izlude_a" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_izlude_a" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_izlude_a" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "izlude_a" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "izlude_a" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_izlude_a" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_izlude_a" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_izlude_a" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_izlude_a" [VAR_MYMOBCOUNT] < max_count)
		callmonster "izlude_a" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "izlude_a" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "izlude_b" "#2021birthday_izlude_b" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_izlude_b" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_izlude_b" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "izlude_b" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "izlude_b" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_izlude_b" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_izlude_b" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_izlude_b" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_izlude_b" [VAR_MYMOBCOUNT] < max_count)
		callmonster "izlude_b" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "izlude_b" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "izlude_c" "#2021birthday_izlude_c" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_izlude_c" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_izlude_c" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "izlude_c" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "izlude_c" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_izlude_c" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_izlude_c" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_izlude_c" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_izlude_c" [VAR_MYMOBCOUNT] < max_count)
		callmonster "izlude_c" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "izlude_c" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "izlude_d" "#2021birthday_izlude_d" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_izlude_d" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_izlude_d" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "izlude_d" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "izlude_d" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_izlude_d" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_izlude_d" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_izlude_d" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_izlude_d" [VAR_MYMOBCOUNT] < max_count)
		callmonster "izlude_d" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "izlude_d" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "jawaii" "#2021birthday_jawaii" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_jawaii" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_jawaii" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "jawaii" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "jawaii" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_jawaii" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_jawaii" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_jawaii" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_jawaii" [VAR_MYMOBCOUNT] < max_count)
		callmonster "jawaii" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "jawaii" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "lasagna" "#2021birthday_lasagna" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_lasagna" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_lasagna" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "lasagna" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "lasagna" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_lasagna" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_lasagna" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_lasagna" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_lasagna" [VAR_MYMOBCOUNT] < max_count)
		callmonster "lasagna" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "lasagna" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "louyang" "#2021birthday_louyang" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_louyang" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_louyang" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "louyang" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "louyang" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_louyang" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_louyang" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_louyang" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_louyang" [VAR_MYMOBCOUNT] < max_count)
		callmonster "louyang" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "louyang" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "malangdo" "#2021birthday_malangdo" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_malangdo" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_malangdo" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "malangdo" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "malangdo" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_malangdo" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_malangdo" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_malangdo" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_malangdo" [VAR_MYMOBCOUNT] < max_count)
		callmonster "malangdo" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "malangdo" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "malaya" "#2021birthday_malaya" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_malaya" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_malaya" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "malaya" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "malaya" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_malaya" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_malaya" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_malaya" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_malaya" [VAR_MYMOBCOUNT] < max_count)
		callmonster "malaya" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "malaya" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "mora" "#2021birthday_mora" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_mora" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_mora" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "mora" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "mora" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_mora" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_mora" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_mora" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_mora" [VAR_MYMOBCOUNT] < max_count)
		callmonster "mora" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "mora" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "morocc_mem" "#2021birthday_morocc_mem" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_morocc_mem" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_morocc_mem" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "morocc_mem" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "morocc_mem" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_morocc_mem" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_morocc_mem" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_morocc_mem" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_morocc_mem" [VAR_MYMOBCOUNT] < max_count)
		callmonster "morocc_mem" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "morocc_mem" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "morocc" "#2021birthday_morocc" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_morocc" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_morocc" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "morocc" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "morocc" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_morocc" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_morocc" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_morocc" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_morocc" [VAR_MYMOBCOUNT] < max_count)
		callmonster "morocc" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "morocc" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "moscovia" "#2021birthday_moscovia" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_moscovia" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_moscovia" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "moscovia" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "moscovia" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_moscovia" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_moscovia" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_moscovia" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_moscovia" [VAR_MYMOBCOUNT] < max_count)
		callmonster "moscovia" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "moscovia" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "payon" "#2021birthday_payon" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_payon" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_payon" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "payon" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "payon" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_payon" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_payon" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_payon" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_payon" [VAR_MYMOBCOUNT] < max_count)
		callmonster "payon" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "payon" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "prontera" "#2021birthday_prontera" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_prontera" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_prontera" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "prontera" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "prontera" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_prontera" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_prontera" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_prontera" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_prontera" [VAR_MYMOBCOUNT] < max_count)
		callmonster "prontera" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "prontera" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "ra_temple" "#2021birthday_ra_temple" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_ra_temple" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_ra_temple" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "ra_temple" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "ra_temple" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_ra_temple" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_ra_temple" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_ra_temple" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_ra_temple" [VAR_MYMOBCOUNT] < max_count)
		callmonster "ra_temple" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "ra_temple" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "rachel" "#2021birthday_rachel" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_rachel" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_rachel" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "rachel" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "rachel" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_rachel" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_rachel" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_rachel" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_rachel" [VAR_MYMOBCOUNT] < max_count)
		callmonster "rachel" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "rachel" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "umbala" "#2021birthday_umbala" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_umbala" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_umbala" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "umbala" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "umbala" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_umbala" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_umbala" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_umbala" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_umbala" [VAR_MYMOBCOUNT] < max_count)
		callmonster "umbala" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "umbala" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "veins" "#2021birthday_veins" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_veins" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_veins" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "veins" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "veins" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_veins" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_veins" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_veins" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_veins" [VAR_MYMOBCOUNT] < max_count)
		callmonster "veins" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "veins" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "xmas" "#2021birthday_xmas" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_xmas" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_xmas" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "xmas" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "xmas" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_xmas" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_xmas" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_xmas" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_xmas" [VAR_MYMOBCOUNT] < max_count)
		callmonster "xmas" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "xmas" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "yuno" "#2021birthday_yuno" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_yuno" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_yuno" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "yuno" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "yuno" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_yuno" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_yuno" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_yuno" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_yuno" [VAR_MYMOBCOUNT] < max_count)
		callmonster "yuno" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "yuno" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "hugel" "#2021birthday_hugel" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_hugel" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_hugel" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "hugel" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "hugel" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_hugel" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_hugel" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_hugel" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_hugel" [VAR_MYMOBCOUNT] < max_count)
		callmonster "hugel" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "hugel" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "einbroch" "#2021birthday_einbroch" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_einbroch" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_einbroch" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "einbroch" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "einbroch" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_einbroch" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_einbroch" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_einbroch" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_einbroch" [VAR_MYMOBCOUNT] < max_count)
		callmonster "einbroch" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "einbroch" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "izlude" "#2021birthday_izlude" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_izlude" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_izlude" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "izlude" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "izlude" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_izlude" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_izlude" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_izlude" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_izlude" [VAR_MYMOBCOUNT] < max_count)
		callmonster "izlude" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "izlude" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return


npc "lighthalzen" "#2021birthday_lighthalzen" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_lighthalzen" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_lighthalzen" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "lighthalzen" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "lighthalzen" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_lighthalzen" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_lighthalzen" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_lighthalzen" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_lighthalzen" [VAR_MYMOBCOUNT] < max_count)
		callmonster "lighthalzen" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "lighthalzen" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return

