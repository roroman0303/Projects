npc "prontera" "Весельчак в зеленом " 4_M_PATRICK 125 125 5 0 0
OnClick:
	
	var day_of_year = GetGlobalVar "day_of_year"
	
	var hat1_cost = 10
	var hat2_cost = 30
	var hunt_quest = 17290
	
	
	dialog "[Весельчак в зеленом] "
	dialog "Здавствуй! Тебе не помешает "
	dialog "немного зеленого цвета, "
	dialog "ты так не считаешь? "
	wait
	choose menu "Я по поводу задания.. " "У меня тут завалялось немного монет... "
		case 1
			var quest_check = checkquest_hunting hunt_quest
			if quest_check == 1
				dialog "[Весельчак в зеленом] "
				dialog "Моя интуиция подсказывает, "
				dialog "что ты не одолел нужное "
				dialog "количество леприкорингов. "
				dialog "Она меня ни разу не "
				dialog "подводила! Приходи, когда "
				dialog "выполнишь задание. "
				close
				return
			elseif quest_check == 2
				dialog "[Весельчак в зеленом] "
				dialog "Прекрасно! Я чувствую, "
				dialog "что снаружи меня ждут "
				dialog "горы леприкорингов,  "
				dialog "поверженных тобой! "
				dialog "Вот твоя награда! "
				dialog "Смотри не потеряй. "
				dialog "А-ха-ха-ха! "
				completequest hunt_quest 
				getitem Event_Coin 10
				close
				return
			elseif (v[jp_event43] < day_of_year)
				dialog "[Весельчак в зеленом] "
				dialog "Я путешествию по разным землям "
				dialog "и торгую шапками и отличным травяным элем. "
				dialog "И если для изготовления эля "
				dialog "у меня есть все, что нужно, "
				dialog "то для шапок мне очень не "
				dialog "хватает зеленого красителя. "
				wait
				dialog "[Весельчак в зеленом] "
				dialog "Раньше я добывал его с обычных "
				dialog "попорингов, но раз в году "
				dialog "появляются странные зеленые "
				dialog "поринги. Я называю их "
				dialog "'Леприкоринги'! Не правда ли, "
				dialog "забавно? А-ха-ха-ха!!! "
				wait
				dialog "[Весельчак в зеленом] "
				dialog "Так вот... Из них получается "
				dialog "гораздо более насыщенный "
				dialog "краситель, от которого шляпы "
				dialog "буквально светятся на солнце! "
				wait
				dialog "[Весельчак в зеленом] "
				dialog "Как и я от моей прибыли в эти дни! "
				dialog "А-ха-ха-ха-ха!!! "
				wait
				dialog "[Весельчак в зеленом] "
				dialog "Тебе нужно победить леприкорингов, "
				dialog "а я вечером пройдусь и соберу "
				dialog "с них все, что нужно для красителя. "
				dialog "Думаю, 50 леприкорингов пока хватит. "
				dialog "Естественно, без награды ты от меня "
				dialog "не уйдешь! А-ха-ха-ха!!! "
				wait
				choose menu "Я помогу тебе! " "Что-то нет настроения... "
					case 1
						dialog "[Весельчак в зеленом] "
						dialog "Вот это настрой! Удачи тебе! "
						dialog "Я бы ей поделился, если б мог, "
						dialog "у меня ее полно! А-ха-ха-ха! "
						setitem jp_event43 day_of_year
						recall_completequest hunt_quest
						erasequest hunt_quest
						setquest hunt_quest 
						close
						return
					break
					case 2
						dialog "[Весельчак в зеленом] "
						dialog "Я для настроения выпиваю кружку "
						dialog "игристого эля, ты тоже попробуй "
						dialog "и возвращайся! "
						close
						return
					break
				endchoose
			elseif (v[jp_event43] == day_of_year)
				dialog "[Весельчак в зеленом] "
				dialog "Сегодня заданий для тебя "
				dialog "больше нет. Приходи завтра. "
				close
				return
			endif
		break
		
		case 2
			dialog "[Весельчак в зеленом] "
			dialog "О-о-о! Так это совсем другой "
			dialog "разговор! За эти монеты я могу "
			dialog "предложить тебе одну из своих "
			dialog "шляп или прохладного травяного "
			dialog "эля. Что тебя интересует? "
			wait
			choose menu "Шляпа " "Эль " "Я передумал... "
				case 1
					dialog "[Весельчак в зеленом] "
					dialog "На выбор у меня есть: Охотничья шапка "
					dialog "или Шляпа трилистника. "
					dialog "Какую ты хочешь взять? "
					wait
					choose menu "Охотничья шапка " "Шляпа трилистника " "Я передумал "
						case 1
							if v[jp_event44] < 1
								dialog "[Весельчак в зеленом] "
								dialog "Она будет стоить тебе всего "
								dialog "10 монет. "
								wait
								if v[Event_Coin] < hat1_cost
									dialog "[Весельчак в зеленом] "
									dialog "Но у вас пока их не хватает. "
									close
									return
								else
									dialog "[Весельчак в зеленом] "
									dialog "Вы берете? "
									wait
									choose menu "Беру! " "Пока подумаю... "
										case 1
											var item_check = GetInventoryRemainCount C_Hunting_Cap 1
											if (item_check == 1)
												dialog "[Весельчак в зеленом] "
												dialog "Носи ее с удовольствием "
												dropitem Event_Coin hat1_cost
												getitem C_Hunting_Cap 1
												setitem jp_event44 1										
												wait
												dialog "[Весельчак в зеленом] "
												dialog "Принеси мне еще 30 монет "
												dialog "и эту шапку, и получишь "
												dialog "шапку получше. "
												close
												return
											elseif ((item_check == 2) | (item_check == 3))
												dialog "[Весельчак в зеленом]"
												dialog "У тебя переполнен инвентарь,"
												dialog "освободите его и возвращайтесь."
												close
											endif
										break
										case 2
											dialog "[Весельчак в зеленом] "
											dialog "Ну подумай... "
											close
											return
										break
									endchoose
								endif
							else
								dialog "[Весельчак в зеленом]"
								dialog "Извини, но у тебя может быть только одна моя шапка. "
								close
								return
							endif
						break
						case 2
							if v[jp_event44] < 2
								dialog "[Весельчак в зеленом] "
								dialog "Это мой шедевр... Его я отдам "
								dialog "тебе за Охотничью шапку и 30 монет. "
								wait
								if v[Event_Coin] < hat2_cost
									dialog "[Весельчак в зеленом] "
									dialog "Но у вас пока недостаточно монет. "
									close
									return
								elseif (v[C_Hunting_Cap] < 1)
									dialog "[Весельчак в зеленом] "
									dialog "Но я не вижу у тебя Охотничьей шапки. "
									close
									return
								else
									dialog "[Весельчак в зеленом] "
									dialog "Вы берете? "
									wait
									choose menu "Беру! " "Пока подумаю... "
										case 1
											var item_check = GetInventoryRemainCount C_Hunting_Cap 1
											if (item_check == 1)
												dialog "[Весельчак в зеленом] "
												dialog "Носи ее с удовольствием "
												dropitem Event_Coin hat2_cost
												dropitem C_Hunting_Cap 1
												getitem C_Clover_Silkhat 1	
												setitem jp_event44 2																					
												close
												return
											elseif ((item_check == 2) | (item_check == 3))
												dialog "[Весельчак в зеленом]"
												dialog "У вас переполнен инвентарь,"
												dialog "освободите его и возвращайтесь."
												close
											endif
										break
										case 2
											dialog "[Весельчак в зеленом] "
											dialog "Ну подумай... "
											close
											return
										break
									endchoose
								endif
							else
								dialog "[Весельчак в зеленом]"
								dialog "Вы уже получили мою лучшую шапку. "
								dialog "Но я могу предложить вам эля. "
								close
								return
							endif
						break
						case 3 
							dialog "[Весельчак в зеленом]"
							dialog "Как знаете... "
							close
							return
						break
					endchoose
				break		
				case 2
					if v[Event_Coin] >= 3	
						dialog "[Весельчак в зеленом]"
						dialog "Сколько эля хотите купить? "
						wait
						dlgwrite 1 30000
						var exchange_input = input
						if input == 0
							dialog "[Весельчак в зеленом]"
							dialog "Извините, но купить 0 эля невозможно! "
							close
							return
						elseif error
							dialog "[Весельчак в зеленом]"
							dialog "Зачем же вы меня пытаетесь обмануть? "
							close
							return	
						endif
					else
						dialog "[Весельчак в зеленом]"
						dialog "Извините, но монет у вас "
						dialog "не хватает даже на одну кружку эля. "
						close
						return
					endif
					var total_price = exchange_input * 3
					dialog "[Весельчак в зеленом]"
					dialog ""+exchange_input+" эля за "+total_price+" монет. Меняем?"
					wait
					choose menu "Подтвердить " "Отмена "
						case 1
							if (v[Event_Coin] >= total_price)
							var item_check = GetInventoryRemainCount Green_Beer exchange_input
								if (item_check == 1)
									dropitem Event_Coin total_price
									getitem Green_Beer exchange_input
									dialog "[Весельчак в зеленом]"
									dialog "Приходите, если еще будут монеты. "
									close
									return
								elseif ((item_check == 2) | (item_check == 3))
									dialog "[Весельчак в зеленом]"
									dialog "У вас переполнен инвентарь,"
									dialog "освободите его и возвращайтесь."
									close
								endif																
							else
								dialog "[Весельчак в зеленом]"
								dialog "Кажется, что вы допустили ошибку при подсчете монет... "
								dialog "Попробуйте еще раз пересчитать их и возвращайтесь. "
								close
							endif
						break
						case 2
							dialog "[Весельчак в зеленом]"
							dialog "Надеюсь, вы не понесете эти "
							dialog "монеты кому-то другому?"
							close
							return
						break
					endchoose
				break
				case 3 
					dialog "[Весельчак в зеленом]"
					dialog "Как знаете... "
					close
					return
			endchoose
		break
	endchoose		
return
