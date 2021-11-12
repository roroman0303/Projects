map = 'gef_fild01'
stri = """ npc "prontera" "#prontera_control" HIDDEN_NPC 1 1 5 0 0
OnInit:
	disablenpc "Mark#{}_1"
	disablenpc "Chest#prontera_1"
	disablenpc "#aura_prontera_1"
	//disablenpc "Mark#prontera_2"
	//disablenpc "Chest#prontera_2"
	//disablenpc "#aura_prontera_2"
	//disablenpc "Mark#prontera_3"
	//disablenpc "Chest#prontera_3"
	//disablenpc "#aura_prontera_3"
	cmdothernpc "#prontera_control" "spawn"
return """.format(map)
print(stri)
