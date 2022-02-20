import re

with open('maps.txt', 'r') as file:
    locations = file.read().splitlines()

spawn_pattern = \
"""
npc "{map}" "#2021birthday_{map}" HIDDEN_NPC 1 1 5 0 0
OnInit:
	cmdothernpc "#2021birthday_{map}" "spawn_all"
	InitTimer
return
OnMyMobDead:
	var max_count = GetGlobalVar "birthday_2021_count"
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((npcv "#2021birthday_{map}" [VAR_MYMOBCOUNT] < max_count) & (spawn == 1))
		callmonster "{map}" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "{map}" E_GOLD_PORING "Золотой поринг " 0 0
	endif
return
OnTimer: 60000
	var spawn = GetGlobalVar "birthday_2021_spawn"
	if ((spawn == 1) & (npcv "#2021birthday_{map}" [VAR_MYMOBCOUNT] == 0))
		cmdothernpc "#2021birthday_{map}" "spawn_all"
	elseif ((spawn == 0) & (npcv "#2021birthday_{map}" [VAR_MYMOBCOUNT] > 0))
		resetmymob
	endif
	stoptimer
	InitTimer
return
OnCommand: "spawn_all"
	var max_count = GetGlobalVar "birthday_2021_count"
	while (npcv "#2021birthday_{map}" [VAR_MYMOBCOUNT] < max_count)
		callmonster "{map}" E_GOLD_PORING "Золотой поринг " 0 0
		callmonster "{map}" E_GOLD_PORING "Золотой поринг " 0 0
	endwhile
return

"""

text = ''

for location in locations:
    text += spawn_pattern.format(map=location)

with open('birthday.sc', 'w', encoding='Windows-1251') as file:
    file.write(text)
print("Готово!")
