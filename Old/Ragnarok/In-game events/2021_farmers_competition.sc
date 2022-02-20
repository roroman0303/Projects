npc "prontera" "Хёрде " 4_M_NOV_HUNT 125 125 6 0 0
OnInit:
	SetGlobalStr "farm_mobname" "Свин "
	SetGlobalStr "farm_keymobname" "Свин "
	SetGlobalVar "farm_winners" 4
	SetGlobalVar "farm_comp_num" 10
	InitTimer
return

OnClick:
	var mobID = GetGlobalVar "farm_mobID"
	var mob_count = GetGlobalVar "farm_mob_count"
	var mob_name = GetGlobalStr "farm_mobname"
	var keymobID = GetGlobalVar "farm_keymobID"
	var keymob_count = GetGlobalVar "farm_keymob_count"
	var keymob_name = GetGlobalStr "farm_keymobname"
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	var farm_winners = GetGlobalVar "farm_winners"
	var farm_win_count = GetGlobalVar "farm_win_count"
	var mobs_remaining = npcv "Хёрде " [VAR_MYMOBCOUNT]
	var player_win_count = v[jp_event62]
	var game_id = GetGlobalVar "farm_comp_num"
	
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		dialog "mobs remaining: "+mobs_remaining+""
		dialog "mobs ID: "+mobID+""
		dialog "mobs count: "+mob_count+""
		dialog "mobs name: "+mob_name+""
		dialog "key mobs ID: "+keymobID+""
		dialog "key mobs count: "+keymob_count+""
		dialog "key mobs name: "+keymob_name+""
		dialog "game ID: "+game_id+""

		while (1)
			choose menu "Mob ID " "Mob Name" "Mob Count " "Key Mob ID " "Key Mob Name" "Key Mob Count" "Win Count" "Turn on " "Kill mobs " "My wins" "Start timer" "Stop timer"
				case 1			
					dlgwrite 0 30000	
					SetGlobalVar "farm_mobID" input
				break
				case 2
					dialog "Enter mobname "
					dlgwritestr
					SetGlobalStr "farm_mobname" inputstr
				break
				case 3			
					dlgwrite 0 15000	
					if ( input > 15000 )
						dialog "You can't choose more than 15000"
						SetGlobalVar "farm_mob_count" 15000
					else
						SetGlobalVar "farm_mob_count" input
					endif
				break
				case 4		
					dlgwrite 0 30000	
					SetGlobalVar "farm_keymobID" input
				break
				case 5
					dialog "Enter mobname "
					dlgwritestr
					SetGlobalStr "farm_keymobname" inputstr
				break
				case 6			
					dlgwrite 0 15000	
					if ( input > 15000 )
						dialog "You can't choose more than 15000"
						SetGlobalVar "farm_keymob_count" 15000
					else
						SetGlobalVar "farm_keymob_count" input
					endif
				break
				case 7
					var farm_keymob_count = GetGlobalVar "farm_keymob_count"
					dlgwrite 0 farm_keymob_count
					if ( input > farm_keymob_count )
						dialog "You can't choose more than "+farm_keymob_count+""
						SetGlobalVar "farm_win_count" farm_keymob_count
					else
						SetGlobalVar "farm_win_count" input
					endif
				break
				case 8
					stoptimer
					InitTimer
				break
				case 9
					cmdothernpc "Хёрде " "kill"
					cmdothernpc "Помощник Хёрде#blue_team" "kill"
					cmdothernpc "Помощник Хёрде#red_team" "kill"
				break
				case 10
					dlgwrite 0 1000	
					if ( input > 1000 )
						dialog "You can't choose more than 1000"
						setitem v[jp_event62] 1000
					else
						setitem v[jp_event62] input
					endif
				break
				case 11
					InitTimer
				break
				case 12
					stoptimer
				break
			endchoose
		endwhile
	else
		if v[jp_event60] == 0
			dialog "[Хёрде]"
			dialog "Здравствуй! Я Хёрде, а ты, "
			dialog "наверное, герой! Я сразу понял "
			dialog "по твоему снаряжению. Возможно,"
			dialog "ты сможешь мне помочь. "
			wait
			dialog "[Хёрде]"
			dialog "Дело в том, что я давно "
			dialog "ищу место, где можно спокойно "
			dialog "завести свое хозяйство и "
			dialog "беззаботно жить, ухаживая "
			dialog "за свинками и коровами. "
			wait
			dialog "[Хёрде]"
			dialog "Я уже несколько лет скитаюсь " 
			dialog "по этому миру и впервые "
			dialog "чувствую, что это то самое "
			dialog "место, где я смогу прожить " 
			dialog "всю свою оставшуюся жизнь. " 
			wait
			dialog "[Хёрде]"
			dialog "Здесь прекрасная погода, "
			dialog "добрые люди и, конечно, "
			dialog "отважные герои - такие как ты! "
			wait
			dialog "[Хёрде]"
			dialog "Я уже присмотрел одно место, "
			dialog "начал отстраиваться, и решил "
			dialog "начать с разведения свинок. "
			dialog "С прошлого места, где я пытался "
			dialog "освоиться я привел несколько. "
			wait 
			dialog "[Хёрде]"
			dialog "Они мне достались от другого "
			dialog "фермера. Он тоже разводил свиней. "
			dialog "Но он был каким-то странным. "
			dialog "Любил рассказывать о возмездии, "
			dialog "и, мне кажется, даже устраивал подпольные бои! "
			wait
			dialog "[Хёрде]"
			dialog "Но в один момент он просто исчез, "
			dialog "а свинки остались. Жалко их стало, "
			dialog "вот и забрал их с собой. Но как "
			dialog "говорил мой дед, 'Родная жена "
			dialog "уйдет из семьи, покуда в хозяйстве "
			dialog "всего две свиньи'. "
			wait
			dialog "[Хёрде]"
			dialog "Поэтому мне нужны еще свинки. "
			dialog "Если увидишь за городом резвых " 
			dialog "и молодых поросят, принеси мне "
			dialog "от них 5 кусков Коленого сала, 3 куска Копченой свинины "
			dialog "и 1 Смалец. Взамен я приглашу " 
			dialog "тебя на свою строящуюся ферму. "
			setquest 17308
			setitem jp_event60 1
			close
			return
		elseif	v[jp_event60] == 1
			if (v[Magic_Clam_Flesh] > 4) & (v[Fore_Flank_Sirloin] > 2) & (v[MAAMOUL_] > 0)
				var item_check = GetInventoryRemainCount Old_Yellow_Box 1
				if (item_check == 1)
					dialog "[Хёрде]"
					dialog "Великолепно! Это то что надо! "
					dialog "Так-с... Посмотрим... "
					wait
					dialog "[Хёрде]"
					dialog "Прекрасно! Здоровые и молодые "
					dialog "свинки и поросята! Попрошу "
					dialog "помощников половить их. "
					dialog "Они в этом мастера! Спасибо " 
					dialog "тебе большое! В знак моей "
					dialog "признательности возьми эту коробку. "
					wait
					dialog "[Хёрде]"
					dialog "[Мои помощники готовят эти "
					dialog "коробки для продажи в город, "
					dialog "но каждый раз они заполняют "
					dialog "коробку по-разному. Эта, "
					dialog "кажется, тяжеловата... "
					dialog "Посмотри, что там. "
					dropitem Magic_Clam_Flesh 5
					dropitem Fore_Flank_Sirloin 3
					dropitem MAAMOUL_ 1
					getitem Old_Yellow_Box 1
					setitem jp_event60 2
					completequest 17308
					close
					return
				elseif ((item_check == 2) | (item_check == 3))
					dialog "[Хёрде]"
					dialog "У тебя мало места в инвентаре. "
					dialog "Освободи немного и возвращайся. "
					close
				endif
				
			else
				dialog "[Хёрде]"
				dialog "Чего-то не хватает. Добей предметы и приходи. "
				close
				return
			endif			
		elseif v[jp_event60] > 1
			dialog "[Хёрде]"
			dialog "О-о-о... Привет тебе! "
			dialog "Я помню, ты помог мне "
			dialog "со свинками, поэтому я "
			dialog "приглашаю тебя поучаствовать "
			dialog "в соревновании. Интересно? "
			wait
			choose menu "Конечно! " "А что за соревнования? " "Я пришел за наградой " "А сколько у меня побед? " "Пока нет времени "
				case 1
					var mapcount_1 = GetPCCount "egef_swn1.gat"
					var mapcount_2 = GetPCCount "egef_swn2.gat"
					var rand_x = rand 180 190
					var rand_y = rand 160 170
					dialog "[Хёрде]"
					dialog "Выбери команду "
					dialog "В красной команде: "+mapcount_1+" участников. "
					dialog "В синей команде: "+mapcount_2+" участников. "
					wait
					choose menu "Красная команда " "Синяя команда " "Что-то не хочется..."
						case 1
							if mapcount_1 - mapcount_2 > 1
								dialog "[Хёрде]"
								dialog "В красной команде много "
								dialog "участников. "
								dialog "Ты можешь присоединиться "
								dialog "к синей команде или немного подождать. "
								close
								return
							else
								var competition_number = GetGlobalVar "farm_comp_num"
								var cont_id = competition_number
								var wug_check = IsEffectStatus EFFECT_STATE_WUG
								var wugrider_check = IsEffectStatus EFFECT_STATE_WUGRIDER
								var drag_check = IsEffectStatus EFFECT_STATE_DRAGON
								var mado_check = IsMadogear
								if ((v[VAR_ISCARTON] == 1) | (v[VAR_ISPECOON] == 1) | (v[VAR_ISFALCONON] == 1) | (wug_check == 1) | (wugrider_check == 1) | (drag_check == 1) | (mado_check == 1))
									dialog "[Хёрде]"
									dialog "Я не могу тебя пустить, если у тебя есть телега, сокол или ездовое животное."
									close
									return
								endif
								if v[VAR_WEIGHT] != 0
									dialog "[Хёрде]"
									dialog "К нам только без экипировки. "
									close
									return	
								elseif boarding == 1
									dialog "[Хёрде]"
									dialog "Тебе необходимо спешиться "
									close							
								elseif allow_to_hunt == 1
									dialog "[Хёрде]"
									dialog "Отлично! Я перенесу тебя к твоей команде! "
									close
									cart off
									peco off
									UseSkillToPC 2052 5 0 0
									ResetBuff "EFST_MOVHASTE_POTION"
									ResetBuff "EFST_MOVHASTE_HORSE"
									close
									setitem jp_event61 cont_id
									moveto "egef_swn1" rand_x rand_y
									return
								else
									dialog "[Хёрде]"
									dialog "Пока идут соревнования. Подожди немного. "
									close
									return
								endif
							endif
						break
						case 2
							if mapcount_2 - mapcount_1 > 1
								dialog "[Хёрде]"
								dialog "В синей команде много участников. "
								dialog "Ты можешь присоединиться к красной команде "
								dialog "или немного подождать. "
								close
								return
							else
								var competition_number = GetGlobalVar "farm_comp_num"
								var cont_id = competition_number + 1
								var wug_check = IsEffectStatus EFFECT_STATE_WUG
								var wugrider_check = IsEffectStatus EFFECT_STATE_WUGRIDER
								var drag_check = IsEffectStatus EFFECT_STATE_DRAGON
								var mado_check = IsMadogear
								if ((v[VAR_ISCARTON] == 1) | (v[VAR_ISPECOON] == 1) | (v[VAR_ISFALCONON] == 1) | (wug_check == 1) | (wugrider_check == 1) | (drag_check == 1) | (mado_check == 1))
									dialog "[Хёрде]"
									dialog "Я не могу тебя пустить, если у тебя есть телега, сокол или ездовое животное."
									close
									return
								endif
								if v[VAR_WEIGHT] != 0
									dialog "[Хёрде]"
									dialog "К нам только без экипировки. "
									close
									return	
								elseif boarding == 1
									dialog "[Хёрде]"
									dialog "Тебе необходимо спешиться. "
									close							
								elseif allow_to_hunt == 1
									dialog "[Хёрде]"
									dialog "Отлично! Я перенесу тебя к твоей команде! "
									close
									cart off
									peco off
									UseSkillToPC 2052 5 0 0
									ResetBuff "EFST_MOVHASTE_POTION"
									ResetBuff "EFST_MOVHASTE_HORSE"
									close
									setitem jp_event61 cont_id
									moveto "egef_swn2" rand_x rand_y
									return
								else
									dialog "[Хёрде]"
									dialog "Пока идут соревнования. Подожди немного. "
									close
									return
								endif
							endif
						break
						case 3
						break
					endchoose
				break
				case 2
					dialog "[Хёрде]"
					dialog "Скажи мне, ты когда-нибудь "
					dialog "ловил свинок? Если нет, "
					dialog "то ты даже не представляешь, "
					dialog "как это сложно! Они бегают, "
					dialog "визжат, вырываются! "
					wait
					dialog "[Хёрде]"
					dialog "Так вот, я предлагаю тебе "
					dialog "объединиться с другими героями "
					dialog "в команду и выловить свинок "
					dialog "быстрее команды противника. "
					wait
					dialog "Однако вам не нужно отлавливать "
					dialog "всех свиней! Всего будет "+farm_win_count+""
					dialog "нужных для отлова свинок! "
					dialog "Они внешне ничем не отличаются, "
					dialog "поэтому для победы ты должен быть еще и удачлив. "
					wait
					dialog "[Хёрде]"
					dialog "Но если ты думал, что это все "
					dialog "условия, то ты ошибаешься! "
					dialog "Тебе нельзя приходить с твоей "
					dialog "геройской экипировкой. Нельзя "
					dialog "пользоваться снадобьями и волшебством! "
					wait
					dialog "[Хёрде]"
					dialog "Только ловкость рук, быстрота ног "
					dialog "и удача твоя и твоей команды решат, "
					dialog "победите вы или проиграете. "
					wait
					dialog "[Хёрде]"
					dialog "Та команда, которая первая поймает "
					dialog "всех нужных мне свинок, побеждает. "
					dialog "За победу каждому участнику полагается "
					dialog "коробка, которую я дарил тебе до "
					dialog "этого. Для этого после победы тебе "
					dialog "нужно сразу подойти ко мне. "
					dialog "Тогда твоя победа будет засчитана. "
					wait
					dialog "[Хёрде]"
					dialog "Но есть еще дополнительные награды, "
					dialog "за первую, вторую, третью и "
					dialog "каждую 5-ую победу! Не буду "
					dialog "раскрывать всех сюрпризов, "
					dialog "но скажу, что после третьей "
					dialog "победы награду можно будет надеть "
					dialog "на голову. *подмигивает с ухмылкой* "
					wait
					dialog "[Хёрде]"
					dialog "Вот и все правила. Теперь вперед за свинками!"
					close
					return
				break
				case 3
					var competition_number = GetGlobalVar "farm_comp_num"
					var farm_winners = GetGlobalVar "farm_winners"
					if farm_winners == 1
						var win_id = competition_number - 2
					elseif farm_winners == 2
						var win_id = competition_number - 1
					else
						dialog "[Хёрде]"
						dialog "Ты пришел слишком поздно "
						dialog "или твоя команда проиграла. "
						dialog "В любом случае, пока у меня "
						dialog "для тебя ничего нет. "
						dialog "Прими участие в следующем моем соревновании. "
						close
						return
					endif
					if (v[jp_event61] == win_id) & (allow_to_hunt == 1)
						dialog "[Хёрде]"
						dialog "Молодец! Ты победил! Это твоя заслуженная награда! "
						setitem jp_event62 (v[jp_event62]+1)
						dialog "У тебя "+v[jp_event62]+" побед. "
						wait
						var item_check = GetInventoryRemainCount Old_Yellow_Box 1
						if (item_check == 1)
							getitem Old_Yellow_Box 1
							dialog "[Хёрде]"
							dialog "Отлично! Приходи еще! "
							setitem jp_event61 3
							close
						elseif ((item_check == 2) | (item_check == 3))
							dialog "[Хёрде]"
							dialog "У тебя мало места в инвентаре. "
							dialog "Освободи немного и возвращайся. "
							close
						endif
					else
						dialog "[Хёрде]"
						dialog "Ты пришел слишком поздно "
						dialog "или твоя команда проиграла. "
						dialog "В любом случае, пока у меня "
						dialog "для тебя ничего нет. "
						dialog "Прими участие в следующем моем соревновании. "
						close
						return
					endif
					if v[jp_event61] == 3
						if v[jp_event62] == 1
							dialog "[Хёрде]"
							dialog "Это твоя первая победа, "
							dialog "тебе достается еще и это! Держи! "
							var item_check = GetInventoryRemainCount Fore_Flank_Sirloin 3
							if (item_check == 1)
								getitem Fore_Flank_Sirloin 3
								setitem jp_event61 4
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Хёрде]"
								dialog "У тебя мало места в инвентаре. "
								dialog "Освободи немного и возвращайся. "
								close
							endif
						elseif v[jp_event62] == 2
							dialog "[Хёрде]"
							dialog "Вторая победа! Неплохо! "
							dialog "Это тебе! "
							var item_check = GetInventoryRemainCount MAAMOUL_ 3
							if (item_check == 1)
								getitem MAAMOUL_ 3
								setitem jp_event61 4
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Хёрде]"
								dialog "У тебя мало места в инвентаре. "
								dialog "Освободи немного и возвращайся. "
								close
							endif
						elseif v[jp_event62] == 3
							dialog "[Хёрде]"
							dialog "Вот и третья долгожданная победа! Поздравляю! "
							dialog "Носи ее с удовольствием! "
							var item_check = GetInventoryRemainCount C_Chicken_Hat 1
							if (item_check == 1)
								getitem C_Chicken_Hat 1
								setitem jp_event61 4
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Хёрде]"
								dialog "У тебя мало места в инвентаре. "
								dialog "Освободи немного и возвращайся. "
								close
							endif
						elseif v[jp_event62] % 5 == 0
							dialog "[Хёрде]"
							dialog "Ты победил "+v[jp_event62]+" раз! "
							dialog "Так что тебе полагается еще "
							dialog "одна коробка! Победи еще 5 раз, "
							dialog "чтобы снова получить дополнительную коробку. "
							var item_check = GetInventoryRemainCount Old_Yellow_Box 1
							if (item_check == 1)
								getitem Old_Yellow_Box 1
								setitem jp_event61 4
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Хёрде]"
								dialog "У тебя мало места в инвентаре. "
								dialog "Освободи немного и возвращайся. "
								close
							endif
						else
							setitem jp_event61 4
						close
						return
						endif
					endif
				break
				case 4
					dialog "[Хёрде]"
					dialog "У тебя "+player_win_count+" побед."
					close
					return
				break
			endchoose
		endif
	endif
return

OnTimer: 0
	var competition_number = GetGlobalVar "farm_comp_num"
	var competition_number = competition_number + 2
	SetGlobalVar "allow_to_hunt" 1
	SetGlobalVar "farm_comp_num" competition_number
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Состязания начнутся через 10 минут! Регистрация открыта. "
	cmdothernpc "Хёрде " "end"
return
OnTimer: 5000
	cmdothernpc "Хёрде " "end"
return
OnTimer: 10000
	cmdothernpc "Хёрде " "end"
return
//OnTimer: 420000
OnTimer: 20000
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Состязания начнутся через 3 минуты! "
return
//OnTimer: 540000 
OnTimer: 30000 
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Состязания начнутся через 1 минуту! "
return
//OnTimer: 596000
OnTimer: 86000
	cmdothernpc "Помощник Хёрде#blue_team" "ready"
	cmdothernpc "Помощник Хёрде#red_team" "ready"
return
//OnTimer: 598000
OnTimer: 88000
	cmdothernpc "Помощник Хёрде#blue_team" "steady"
	cmdothernpc "Помощник Хёрде#red_team" "steady"
return	
//OnTimer: 600000
OnTimer: 90000
	setitem jp_event61 0
	cmdothernpc "Помощник Хёрде#blue_team" "go"
	cmdothernpc "Помощник Хёрде#red_team" "go"
	cmdothernpc "Хёрде " "spawn"
	cmdothernpc "Помощник Хёрде#blue_team" "spawn"
	cmdothernpc "Помощник Хёрде#red_team" "spawn"
	SetGlobalVar "allow_to_hunt" 0
return

//OnTimer: 1620000
OnTimer: 150000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "Состязания кончатся через 3 минуты! Поспешите! "
	endif
return
//OnTimer: 1740000
OnTimer: 210000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "Состязания кончатся через 1 минуту! Поспешите! "
	endif
return
//OnTimer: 1790000
OnTimer: 260000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
		cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
	endif
return
//OnTimer: 1791000
OnTimer: 261000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
		cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
	endif
return
//OnTimer: 1792000
OnTimer: 262000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
		cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
	endif
return
//OnTimer: 1793000
OnTimer: 263000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
		cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
	endif
return
//OnTimer: 1794000
OnTimer: 264000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
		cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
	endif
return
//OnTimer: 1795000
OnTimer: 265000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
		cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
	endif
return
//OnTimer: 1796000
OnTimer: 266000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
		cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
	endif
return
//OnTimer: 1797000
OnTimer: 267000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
		cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
	endif
return
//OnTimer: 1798000
OnTimer: 268000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
		cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
	endif
return
//OnTimer: 1799000
OnTimer: 269000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
		cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
	endif
return
//OnTimer: 1800000
OnTimer: 270000
	var team_won = GetGlobalVar "farm_winners" 
	cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
	cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
	if team_won == 0
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "Состязания окончены! Ни одна команда не успела поймать всех нужных свинок. "
		SetGlobalVar "farm_winners" 4
		cmdothernpc "Хёрде " "end"
		stoptimer
		InitTimer
	endif
return	

OnCommand: "spawn"
	SetGlobalVar "farm_winners" 0
	var mobID = GetGlobalVar "farm_mobID"
	var mob_count = GetGlobalVar "farm_mob_count"
	var mob_name = GetGlobalStr "farm_mobname"
	var mobs_remaining = npcv "Хёрде " [VAR_MYMOBCOUNT]
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "mobID: "+mobID+""
	var i = 0
	while (1)
		if (i < mob_count)
			callmonster "egef_swn1" mobID mob_name 0 0
			callmonster "egef_swn2" mobID mob_name 0 0
		endif
		i = i + 1
		if (i >= mob_count)
//			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Проверка кол-ва мобов включена обратно "  //отладка
			exitwhile
		endif
	endwhile
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "mobs count: "+mobs_remaining+"" //отладка
return


OnCommand: "end"
	cmdothernpc "Помощник Хёрде#blue_team" "warp_all"
	cmdothernpc "Помощник Хёрде#red_team" "warp_all"
	cmdothernpc "Хёрде " "kill"
	cmdothernpc "Помощник Хёрде#blue_team" "kill"
	cmdothernpc "Помощник Хёрде#red_team" "kill"
return	

OnCommand: "kill"
	resetmymob
return	

OnCommand: "reset"
	stoptimer
	InitTimer
return	

npc "egef_swn1" "Помощник Хёрде#red_team" 4_M_CHILD1 190 175 6 0 0
OnInit:
	InitTimer
	strlocalvar 1 "countdown"
	strlocalvar 2 "farm_reset"
	
	SetLocalVar "countdown" 11
	SetLocalVar "farm_reset" 0
	
	SetGlobalVar "farm_mobID" 20631
	SetGlobalVar "farm_keymobID" 20632
return

OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		
		var keymobID = GetGlobalVar "farm_keymobID"
		var keymob_count = GetGlobalVar "farm_keymob_count"
		var keymob_name = GetGlobalStr "farm_keymobname"
		var mobs_remaining = npcv "Помощник Хёрде#red_team" [VAR_MYMOBCOUNT]
		dialog "key mobs ID: "+keymobID+""
		dialog "key mobs count: "+keymob_count+""
		dialog "key mobs name: "+keymob_name+""
		dialog "mobs remaining: "+mobs_remaining+""
		wait
	else
		var allow_to_hunt = GetGlobalVar "allow_to_hunt"
		if allow_to_hunt == 0
			var mobs_remaining_red = GetGlobalVar "mobs_remaining_red"
			var mobs_remaining_blue = GetGlobalVar "mobs_remaining_blue"
			var farm_win_count = GetGlobalVar "farm_win_count"
			var keymob_count = GetGlobalVar "farm_keymob_count"		
			dialog "[Помощник Хёрде]"
			dialog "Красной команде осталось найти "+mobs_remaining_red+" свинок. "
			dialog "Синей команде осталось найти "+mobs_remaining_blue+" свинок. "
			close
			return
		else
			dialog "[Помощник Хёрде]"
			dialog "Я буду болеть за вас! Вперед, красная команда!"
			close
			return
		endif
	endif
return

OnTimer: 1000
	var keymobID = GetGlobalVar "farm_keymobID"
	var keymob_count = GetGlobalVar "farm_keymob_count"
	var keymob_name = GetGlobalStr "farm_keymobname"
	var mobs_remaining = npcv "Помощник Хёрде#red_team" [VAR_MYMOBCOUNT]
	var farm_win_count = GetGlobalVar "farm_win_count"
	var mobs_remaining_blue = GetGlobalVar "mobs_remaining_blue"
	var mobs_remaining_red = GetGlobalVar "mobs_remaining_red"
	var mobs_remaining_red_actual = farm_win_count - (keymob_count - mobs_remaining)
	var farm_winners = GetGlobalVar "farm_winners"
	var farm_reset = lv["farm_reset"]
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	if ((allow_to_hunt == 0) & (farm_winners == 0))
//		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "mobs_remaining_red: "+mobs_remaining_red+""
//		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "mobs_remaining_blue: "+mobs_remaining_blue+""
//		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "mobs_remaining: "+mobs_remaining+""
		if ((mobs_remaining_red_actual < mobs_remaining_red) & (mobs_remaining_red_actual >= 0))
			SetGlobalVar "mobs_remaining_red" mobs_remaining_red_actual
			cmdothernpc "Помощник Хёрде#blue_team" "broadcast_red"
			cmdothernpc "Помощник Хёрде#red_team" "broadcast_red"
		endif
	endif
	if farm_winners == 1
		if farm_reset == 1
			SetLocalVar "farm_reset" 0
			cmdothernpc "Хёрде " "reset"
		elseif allow_to_hunt == 0
			cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
			cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
		endif
	endif	
	stoptimer
	InitTimer
return

OnCommand: "spawn"
	var keymobID = GetGlobalVar "farm_keymobID"
	var keymob_count = GetGlobalVar "farm_keymob_count"
	var keymob_name = GetGlobalStr "farm_keymobname"
	var farm_win_count = GetGlobalVar "farm_win_count"
	SetLocalVar "countdown" 11
	var i = 0
	while (1)
		if (i < keymob_count)
			callmonster "egef_swn1" keymobID keymob_name 0 0
		endif
		i = i + 1
		if (i >= keymob_count)
//			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Проверка кол-ва мобов включена обратно "  //отладка
			exitwhile
		endif
	endwhile
	SetGlobalVar "mobs_remaining_red" farm_win_count
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "mobs count: "+mobs_remaining+"" //отладка
return

OnCommand: "kill"
	resetmymob
return

OnCommand: "broadcast_blue"
	var mobs_remaining_blue =  GetGlobalVar "mobs_remaining_blue"
	if mobs_remaining_blue != 0
		broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "Синяя команда нашла нужную свинку! Осталось еще "+mobs_remaining_blue+""
	endif
return

OnCommand: "broadcast_red"
	var mobs_remaining_red = GetGlobalVar "mobs_remaining_red"
	if mobs_remaining_red == 0
		var competition_number = GetGlobalVar "farm_comp_num"
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "Красная команда нашла всех нужных свинок! Красная команда победила! "
		SetGlobalVar "farm_winners" 1
//		if v[jp_event61] == 1
//			var wins_count = v[jp_event62] + 1
//			setitem jp_event62 wins_count
//		endif
	else
		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Красная команда нашла нужную свинку! Осталось еще "+mobs_remaining_red+""
	endif
return

OnCommand: "warp_all"
	warpallpcinthemap "prontera" 125 123
return

OnCommand: "final_countdown"
	var countdown = lv["countdown"]
	var countdown = countdown - 1
	var farm_winners = GetGlobalVar "farm_winners"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Вас отправит в Пронтеру через "+countdown+"!"
	if countdown < 1
		SetLocalVar "countdown" 11
		if farm_winners == 1
			SetLocalVar "farm_reset" 1
			cmdothernpc "Хёрде " "end"
		endif
	else
		SetLocalVar "countdown" countdown
	endif
return

OnCommand: "ready"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "На старт!"
return

OnCommand: "steady"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Внимание!"
return

OnCommand: "go"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Марш!"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Выпускаю свинок! Найдите среди них породистых! "
return

OnCommand: "three_min_bc"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Состязания кончатся через 3 минуты! "
return

OnCommand: "one_min_bc"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Состязания кончатся через 1 минуту! "
return

OnCommand: "nobody_wins_bc"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Состязания окончены! Ни одна команда не успела поймать всех нужных свинок. "
return

npc "egef_swn2" "Помощник Хёрде#blue_team" 4_M_CHILD1 190 175 6 0 0
OnInit:
	InitTimer
	strlocalvar 1 "countdown"
	strlocalvar 2 "farm_reset"
	
	SetLocalVar "countdown" 11
	SetLocalVar "farm_reset" 0
	
	SetGlobalVar "farm_mobID" 20631
	SetGlobalVar "farm_keymobID" 20632
return

OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		
		var keymobID = GetGlobalVar "farm_keymobID"
		var keymob_count = GetGlobalVar "farm_keymob_count"
		var keymob_name = GetGlobalStr "farm_keymobname"
		var mobs_remaining = npcv "Помощник Хёрде#blue_team" [VAR_MYMOBCOUNT]
		dialog "key mobs ID: "+keymobID+""
		dialog "key mobs count: "+keymob_count+""
		dialog "key mobs name: "+keymob_name+""
		dialog "mobs remaining: "+mobs_remaining+""
		wait
	else
		var allow_to_hunt = GetGlobalVar "allow_to_hunt"
		if allow_to_hunt == 0
			var mobs_remaining_red = GetGlobalVar "mobs_remaining_red"
			var mobs_remaining_blue = GetGlobalVar "mobs_remaining_blue"
			var farm_win_count = GetGlobalVar "farm_win_count"
			var keymob_count = GetGlobalVar "farm_keymob_count"		
			dialog "[Помощник Хёрде]"
			dialog "Красной команде осталось найти "+mobs_remaining_red+" свинок. "
			dialog "Синей команде осталось найти "+mobs_remaining_blue+" свинок. "
			close
			return
		else
			dialog "[Помощник Хёрде]"
			dialog "Я буду болеть за вас! Вперед, синяя команда!"
			close
			return
		endif
	endif
return

OnTimer: 1000
	var keymobID = GetGlobalVar "farm_keymobID"
	var keymob_count = GetGlobalVar "farm_keymob_count"
	var keymob_name = GetGlobalStr "farm_keymobname"
	var mobs_remaining = npcv "Помощник Хёрде#blue_team" [VAR_MYMOBCOUNT]
	var farm_win_count = GetGlobalVar "farm_win_count"
	var mobs_remaining_blue = GetGlobalVar "mobs_remaining_blue"
	var mobs_remaining_red = GetGlobalVar "mobs_remaining_red"
	var mobs_remaining_blue_actual = farm_win_count - (keymob_count - mobs_remaining)
	var farm_winners = GetGlobalVar "farm_winners"
	var farm_reset = lv["farm_reset"]
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	if ((allow_to_hunt == 0) & (farm_winners == 0))
//		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "mobs_remaining_red: "+mobs_remaining_red+""
//		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "mobs_remaining_blue: "+mobs_remaining_blue+""
//		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "mobs_remaining: "+mobs_remaining+""
		if ((mobs_remaining_blue_actual < mobs_remaining_blue) & (mobs_remaining_blue_actual >= 0))
			SetGlobalVar "mobs_remaining_blue" mobs_remaining_blue_actual
			cmdothernpc "Помощник Хёрде#blue_team" "broadcast_blue"
			cmdothernpc "Помощник Хёрде#red_team" "broadcast_blue"
		endif
	endif
	if farm_winners == 2
		if farm_reset == 1
			SetLocalVar "farm_reset" 0
			cmdothernpc "Хёрде " "reset"
		elseif allow_to_hunt == 0
			cmdothernpc "Помощник Хёрде#blue_team" "final_countdown"
			cmdothernpc "Помощник Хёрде#red_team" "final_countdown"
		endif
	endif
	stoptimer
	InitTimer
return

OnCommand: "spawn"
	var keymobID = GetGlobalVar "farm_keymobID"
	var keymob_count = GetGlobalVar "farm_keymob_count"
	var keymob_name = GetGlobalStr "farm_keymobname"
	var farm_win_count = GetGlobalVar "farm_win_count"
	SetLocalVar "countdown" 11
	var i = 0
	while (1)
		if (i < keymob_count)
			callmonster "egef_swn2" keymobID keymob_name 0 0
		endif
		i = i + 1
		if (i >= keymob_count)
//			broadcastserver "FF0000" FW_NORMAL 10 0 0 "Проверка кол-ва мобов включена обратно "  //отладка
			exitwhile
		endif
	endwhile
	SetGlobalVar "mobs_remaining_blue" farm_win_count
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "mobs count: "+mobs_remaining+"" //отладка
return

OnCommand: "kill"
	resetmymob
return

OnCommand: "broadcast_blue"
	var mobs_remaining_blue =  GetGlobalVar "mobs_remaining_blue"
	if mobs_remaining_blue == 0
		var competition_number = GetGlobalVar "farm_comp_num"
		broadcastserver "0099FF" FW_NORMAL 10 0 0 "Синяя команда нашла всех нужных свинок! Синяя команда победила! "
		SetGlobalVar "farm_winners" 2
//		if v[jp_event61] == 2
//			var wins_count = v[jp_event62] + 1
//			setitem jp_event62 wins_count
//		endif
	else
		broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "Синяя команда нашла нужную свинку! Осталось еще "+mobs_remaining_blue+""
	endif
return

OnCommand: "broadcast_red"
	var mobs_remaining_red = GetGlobalVar "mobs_remaining_red"
	if mobs_remaining_red != 0
		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "Красная команда нашла нужную свинку! Осталось еще "+mobs_remaining_red+""
	endif
return

OnCommand: "warp_all"
	warpallpcinthemap "prontera" 125 123
return

OnCommand: "final_countdown"
	var countdown = lv["countdown"]
	var countdown = countdown - 1
	var farm_winners = GetGlobalVar "farm_winners"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "Вас отправит в Пронтеру через "+countdown+"!"
	if countdown < 1
		SetLocalVar "countdown" 11
		if farm_winners == 2
			SetLocalVar "farm_reset" 1
			cmdothernpc "Хёрде " "end"
		endif
	else
		SetLocalVar "countdown" countdown
	endif
return

OnCommand: "ready"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "На старт!"
return

OnCommand: "steady"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "Внимание!"
return

OnCommand: "go"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "Марш!"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "Выпускаю свинок! Найдите среди них породистых! "
return

OnCommand: "three_min_bc"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "Состязания кончатся через 3 минуты! "
return

OnCommand: "one_min_bc"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "Состязания кончатся через 1 минуту! "
return

OnCommand: "nobody_wins_bc"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "Состязания окончены! Ни одна команда не успела поймать всех нужных свинок. "
return

hiddenwarp "egef_swn1" "warp1 " 186 150 4 0
OnTouch:
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	if allow_to_hunt == 1
		moveto "egef_swn1" 180 180
	endif
return

hiddenwarp "egef_swn1" "warp2 " 186 203 4 0
OnTouch:
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	if allow_to_hunt == 1
		moveto "egef_swn1" 180 180
	endif
return


hiddenwarp "egef_swn2" "warp3 " 186 150 4 0
OnTouch:
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	if allow_to_hunt == 1
		moveto "egef_swn2" 180 180
	endif
return

hiddenwarp "egef_swn2" "warp4 " 186 203 4 0
OnTouch:
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	if allow_to_hunt == 1
		moveto "egef_swn2" 180 180
	endif
return