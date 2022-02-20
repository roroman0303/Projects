npc "prontera" "Раск " 4_M_SOCCER9 125 125 5 0 0

OnClick:
	var hat_cost = 30
	var drink_cost = 3
	var curtime = ServerTime
	var curmin = curtime / 100
	var hunt_quest = 17294
	var quest_check = checkquest_hunting hunt_quest
	
	var allow_to_race = GetGlobalVar "allow_to_race"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	var first_place_min = first_place_time / 60
	var first_place_sec = first_place_time % 60
	var second_place_min = second_place_time / 60
	var second_place_sec = second_place_time % 60
	var third_place_min = third_place_time / 60
	var third_place_sec = third_place_time % 60
	
	var check_shield = GetEquipCount Ahura_Mazda
	
	var boarding = GetBuffValue "EFST_ALL_RIDING"
	
	if (check_shield > 0)
		dialog "Сбросить рекорды? "
		wait
		choose menu "Да " "Нет "
			case 1
				SetGlobalVar "first_place_time" 10000
				SetGlobalVar "second_place_time" 10000
				SetGlobalVar "third_place_time" 10000
				SetGlobalStr "first_place_name" ""
				SetGlobalStr "second_place_name" ""
				SetGlobalStr "third_place_name" ""
				dialog "Таблица рекордов очищена "
				close
				return
			break
			case 2
			break
		endchoose
	else
		if (v[jp_event46] == 0)
			dialog "[Раск]"
			dialog "Привет, чемпион! "
			dialog "Уже вовсю идут соревнования "
			dialog "по бегу! Присоединяйся! "
			wait
			choose menu "Я готов! " "Я подумаю... "
				case 1
					dialog "[Раск]"
					dialog "Для начала давай расскажу, что "
					dialog "за соревнования тут проходят. "
					dialog "Тебе придется соревноваться с "
					dialog "другими героями за призовые места, "
					dialog "за которые ты будешь получать "
					dialog "медали. "
					wait
					dialog "[Раск]"					
					dialog "На них ты сможешь купить "
					dialog "протеиновые батончики, билеты на "
					dialog "соревнования, а также прекрасную "
					dialog "шапку! "
					wait
					dialog "[Раск]"					
					dialog "А если ты станешь одним из "
					dialog "самых быстрых в Рун Мидгарде за "
					dialog "все время соревнований, то в конце "
					dialog "тебя ждет особая награда! "
					wait
					dialog "[Раск]"
					dialog "Но сейчас я не могу тебя пропустить. "
					dialog "Тебе нужно пройти подготовку. "
					dialog "Сначала проверим твою выносливость. "
					dialog "Начнем с простого. "
					wait
					dialog "[Раск]"
					dialog "Ты должен найти стражника у реки "
					dialog "к западу от Пронтеры за 3 минуты. " //prt_fild05.gat 270 212
					dialog "После этого возвращайся ко мне. "
					dialog "Время пошло, удачи! "
					setitem jp_event46 1
					setitem jp_event47 curmin
					setquest 17291
					close
					return
				break
				case 2
					dialog "[Раск]"
					dialog "Как надумаешь - возвращайся! "
					close
					return
				break
			endchoose
		elseif (v[jp_event46] == 1)|(v[jp_event46] == 3)|(v[jp_event46] == 5)
			dialog "[Раск]"
			dialog "Ты все еще здесь? Время идет! Беги!"
			close
			return
		elseif (v[jp_event46] == 2)
			dialog "[Раск]"
			dialog "Теперь тебе нужно добежать до моего "
			dialog "друга, который стоит к востоку от "
			dialog "Пайона за двумя холмами. На эту " //pay_fild08.gat 218 283
			dialog "пробежку я даю тебе 5 минут. "
			setitem jp_event46 3
			setitem jp_event47 curmin
			erasequest 17291
			setquest 17292
			close
			return
		elseif (v[jp_event46] == 4)
			dialog "[Раск]"
			dialog "Последнее испытание на скорость, "
			dialog "оно же самое сложное. "
			dialog "Тебе нужен продавец мороженого "
			dialog "далеко на юго-востоке от Морока. " // moc_fild16.gat 88 304 
			wait
			dialog "[Раск]"
			dialog "На эту дистанцию даю тебе аж "
			dialog "15 минут! Самое главное в "
			dialog "таких забегах - правильно "
			dialog "рассчитать свои силы. "
			dialog "Удачи! "
			erasequest 17292
			setquest 17293
			setitem jp_event46 5
			setitem jp_event47 curmin
			close
			return
		elseif (v[jp_event46] == 6)
			if quest_check == 0
				dialog "[Раск]"
				dialog "Я с самого начала знал, что "
				dialog "ты справишься! Продолжай в "
				dialog "том же духе! "
				wait
				dialog "[Раск]"
				dialog "Переходим ко второму испытанию. "
				dialog "В этот раз оно на силу. "
				dialog "Тебе нужно победить не простых "
				dialog "порингов. "
				wait
				dialog "[Раск]"
				dialog "Дело в том, что сейчас "
				dialog "из-за моих сверхскоростных "
				dialog "забегов повсюду появились "
				dialog "небольшие вихри. С этим нужно "
				dialog "что-то сделать. "
				wait
				dialog "[Раск]"
				dialog "Тебе необходимо бить по ним "
				dialog "с такой силой, чтобы поток "
				dialog "воздуха от твоего удара "
				dialog "погасил их, иначе такими "
				dialog "темпами весь Рун-Мидгард будет "
				dialog "крутиться в одном огромном "
				dialog "вихре. И это не метафора! "
				wait
				dialog "[Раск]"
				dialog "Так что убьешь сразу двух зайцев! "
				dialog "И подготовишьсяк гонке, и мир "
				dialog "спасешь. Тебе то уж наверное "
				dialog "не впервой, не так ли? "
				dialog "Погаси 50 вихрей - после этого "
				dialog "я пропущу тебя на следующий этап. "
				changequest 17293 hunt_quest
				close
				return
			elseif quest_check == 1
				dialog "[Раск]"
				dialog "Я все еще чувствую сильные порывы "
				dialog "ветра. Я еще жду, когда ты победишь "
				dialog "нужное количество вихрей. Приходи, "
				dialog "когда справишься с 50 вихрями. "
				close
				return
			elseif quest_check == 2
				dialog "[Раск]"
				dialog "Наконец-то этот ветер немного "
				dialog "утих. А значит мы с тобой "
				dialog "подходим к заключительному "
				dialog "испытанию. "
				wait
			endif
			dialog "[Раск]"
			dialog "Последнее третье испытание. "
			dialog "Оно, конечно же, на скорость. "
			dialog "Сейчас мы отправимся на маршрут "
			dialog "забега. Твоя задача заключается "
			dialog "в том, чтобы добежать до меня. "
			dialog "Я буду чуть севернее на холме. "
			wait
			dialog "[Раск]"
			dialog "Но не думай, что все будет так "
			dialog "просто. Тебя ждет полоса "
			dialog "препятствий. На карте будут "
			dialog "спрятаны места, которые будут "
			dialog "влиять на твою скорость случайным "
			dialog "образом - как положительно, так и "
			dialog "отрицательно. "
			wait
			dialog "[Раск]"
			dialog "Также по всему маршруту расставлены "
			dialog "пушки, которые будут тебя замедлять. "
			dialog "Так что поверь - препятствий "
			dialog "у тебя будет достаточно. "
			wait
			dialog "[Раск]"
			dialog "На прохождение даю тебе 6 минут. "
			dialog "Как только ты попадешь на маршрут - "
			dialog "беги. Удачи. "
			setitem jp_event46 7
			changequest hunt_quest 17295
			close
			moveto "eprt_fild02" 20 305
			return
		elseif (v[jp_event46] == 7)
			dialog "[Раск]"
			dialog "Готов пройти маршрут на время? "
			wait
			choose menu "Готов! " "Дай немного времени... "
				case 1
					dialog "[Раск]"
					dialog "Побежали!"
					setitem jp_event47 (curtime % 10000)
					close
					moveto "eprt_fild02" 30 305
					return
				break
				case 2
					dialog "[Раск]"
					dialog "Подготовься как следует и приходи! "
					close
					return
				break
			endchoose
		elseif (v[jp_event46] == 8)
			dialog "[Раск]"
			dialog "Теперь ты готов к соревнованиям "
			dialog "с другими героями. За эти "
			dialog "соревнования ты будешь получать "
			dialog "медали, которые сможешь обменять "
			dialog "у меня на шапку, те же пропуски "
			dialog "или протеин! "
			wait
			dialog "[Раск]"
			dialog "Теперь я должен тебе рассказать "
			dialog "о правилах. Во-первых, использовать "
			dialog "магию и способности запрещено. "
			wait
			dialog "[Раск]"
			dialog "Во-вторых, перед регистрацией "
			dialog "на забег на тебе и в твоих карманах "
			dialog "не может быть ничего, кроме билетов "
			dialog "и батончиков. "
			wait
			dialog "[Раск]"
			dialog "Ну и в-третьих, соблюдай "
			dialog "спортивную этику: не подрезать, "
			dialog "не толкать, подножки не ставить. "
			wait
			dialog "[Раск]"
			dialog "В общем-то, это все правила. "
			dialog "Надеюсь, тебе понравится. "
			wait
			dialog "[Раск]"
			dialog "1 пропуск я дам тебе бесплатно. "
			dialog "Остальные тебе придется покупать "
			dialog "у меня или поискать в вихрях. "
			dialog "Во время бега, они у меня "
			dialog "постоянно выпадают. "
			wait
			getitem Id_Lottery_Ticket 1
			setitem jp_event46 9
			completequest 17295 
			close
			return
		elseif (v[jp_event46] > 8)
			dialog "[Раск]"
			dialog "Привет, чемпион! "
			dialog "С чем пришел? "
			wait
			choose menu "Я хочу участвовать в забеге! " "Я хочу обменять медали " "Таблица рекордсменов "
				case 1
					dialog "[Раск]"
					dialog "Решил принять участие? "
					dialog "Хвалю. А пропуск у тебя "
					dialog "есть?! "
					wait
					if (v[Id_Lottery_Ticket]>0)
						if v[VAR_WEIGHT] != 0
							dialog "[Раск]"
							dialog "У вас есть запрещенные для забега предметы. "
							dialog "На забег можно пройти только " 
							dialog "с билетами и с батночиками "
							dialog "Очистите карманы и приходите снова. "
							close
							return	
						elseif boarding == 1
							dialog "[Раск]"
							dialog "Чтобы поучаствовать в забеге,"
							dialog "тебе необходимо спешиться."
							close							
						elseif allow_to_race == 1
							dialog "[Раск]"
							dialog "Благодарю. Желаю побед! "
							dropitem Id_Lottery_Ticket 1
							close
							cart off
							peco off
							UseSkillToPC 2052 5 0 0
							ResetBuff "EFST_MOVHASTE_POTION"
							close
							moveto "eprt_fild02" 20 305
							return
						else
							dialog "[Раск]"
							dialog "Пропуск вижу. Но пока "
							dialog "идет забег. Подожди немного. "
							close
							return
						endif
					else
						dialog "[Раск]"
						dialog "Ну и как ты хотел попасть на "
						dialog "гонку без пропуска? Приходи, "
						dialog "когда он будет у тебя. "
						close
						return
					endif
				break
				case 2
					dialog "[Раск]"
					dialog "О-о-о! Ты их получил "
					dialog "в честной борьбе. "
					dialog "Поэтому я тебе могу предложить "
					dialog "протеиновый батончик, пропуск "
					dialog "или Грифоний налобник "
					wait
					choose menu "Батончик " "Пропуск " "Грифоний налобник " 
						case 1	
							dialog "[Раск]"
							dialog "1 батончик стоит 3 медали. "
							dialog "Сколько ты хочешь? "
							wait
							dlgwrite 1 30000
							var exchange_input = input
							var total_price = exchange_input*3
							if input == 0
								dialog "[Раск]"
								dialog "Купить 0 не получится... "
								close
								return
							elseif error
								dialog "[Раск]"
								dialog "А это как понимать? "
								close
								return	
							endif
							dialog "[Раск]"
							dialog ""+exchange_input+" батончиков за "+total_price+" медалей. Меняем?"
							wait
							choose menu "Подтвердить " "Отмена "
								case 1
									if v[Sky_Medal] < total_price
										dialog "[Раск]"
										dialog "У тебя не хватает медалей... "
										dialog "Проверь еще разок. "
										close								
									else
										var item_check = GetInventoryRemainCount Gingerbread exchange_input
										if (item_check == 1)
											dropitem Sky_Medal total_price
											getitem Gingerbread exchange_input
											dialog "[Раск]"
											dialog "Отлично! Приходи еще! "
											close
											return
										elseif ((item_check == 2) | (item_check == 3))
											dialog "[Раск]"
											dialog "У тебя мало места в инвентаре. "
											dialog "Освободи немного и возвращайся. "
											close
										endif									
									endif
								break
								case 2
									dialog "[Раск]"
									dialog "Если передумаешь, приходи. "
									dialog "Протеиновых батончиков "
									dialog "у меня еще много! "
									close
									return
								break
							endchoose
						break
						case 2
							dialog "[Раск]"
							dialog "1 пропуск стоит 20 медалей. "
							dialog "Сколько ты хочешь? "
							wait
							dlgwrite 1 30000
							var exchange_input = input
							var total_price = exchange_input*20
							if input == 0
								dialog "[Раск]"
								dialog "Купить 0 не получится... "
								close
								return
							elseif error
								dialog "[Раск]"
								dialog "А это как понимать? "
								close
								return	
							endif
							dialog "[Раск]"
							dialog ""+exchange_input+" пропусков за "+total_price+" медалей. Меняем?"
							wait
							choose menu "Подтвердить " "Отмена "
								case 1
									if v[Sky_Medal] < total_price
										dialog "[Раск]"
										dialog "У тебя не хватает медалей... "
										dialog "Проверь еще разок. "
										close								
									else
										var item_check = GetInventoryRemainCount Id_Lottery_Ticket exchange_input
										if (item_check == 1)
											dropitem Sky_Medal total_price
											getitem Id_Lottery_Ticket exchange_input
											dialog "[Раск]"
											dialog "Отлично! Приходи еще! "
											close
											return
										elseif ((item_check == 2) | (item_check == 3))
											dialog "[Раск]"
											dialog "У тебя мало места в инвентаре. "
											dialog "Освободи немного и возвращайся. "
											close
										endif									
									endif
								break
								case 2
									dialog "[Раск]"
									dialog "Если передумаешь, приходи. "
									close
									return
								break
							endchoose
						break
						case 3
							if (v[jp_event46] != 10)
								dialog "[Раск] "
								dialog "Эта шапка - символ скорости! "
								dialog "И ты можешь ее получить "
								dialog "за 30 медалей! "
								wait
								if v[Sky_Medal] < 30
									dialog "[Раск] "
									dialog "Но у вас пока их не хватает. "
									close
									return
								else
									dialog "[Раск] "
									dialog "Вы берете? "
									choose menu "Беру! " "Пока подумаю... "
										case 1
											var item_check = GetInventoryRemainCount C_Gryphon_Hairband 1
											if (item_check == 1)
												dialog "[Раск] "
												dialog "Носи ее с удовольствием. "
												dropitem Sky_Medal 30
												getitem C_Gryphon_Hairband 1
												setitem jp_event46 10										
												close
												return
											elseif ((item_check == 2) | (item_check == 3))
												dialog "[Раск]"
												dialog "У тебя переполнен инвентарь,"
												dialog "освободи его и возвращайся."
												close
											endif
										break
										case 2
											dialog "[Раск] "
											dialog "Ну подумай... "
											close
											return
										break
									endchoose
								endif
							else
								dialog "[Раск]"
								dialog "У вас уже есть эта шапка "
								close
								return
							endif
						break
					endchoose
				break
				case 3
					dialog "[Раск]"
					if first_place_time == 10000
						dialog "В забеге пока никто не участвовал. "
					elseif first_place_time < 10000
						if first_place_sec < 10
							dialog "1 место: "+first_place_name+" - "+first_place_min+":0"+first_place_sec+""
						else
							dialog "1 место: "+first_place_name+" - "+first_place_min+":"+first_place_sec+""
						endif
					endif
					if second_place_time < 10000
						if second_place_sec < 10
							dialog "2 место: "+second_place_name+" - "+second_place_min+":0"+second_place_sec+""
						else
							dialog "2 место: "+second_place_name+" - "+second_place_min+":"+second_place_sec+""
						endif
					endif
					if third_place_time < 10000
						if third_place_sec < 10
							dialog "3 место: "+third_place_name+" - "+third_place_min+":0"+third_place_sec+""
						else
							dialog "3 место: "+third_place_name+" - "+third_place_min+":"+third_place_sec+""
						endif
					endif
					close
					return
				break
			endchoose
		else
			dialog "[Раск] "
			dialog "Рун Мидгардское состязание по бегу открыто! "
			dialog "Успейте принять участие!!! "
			close
			return
		endif
	endif
return
