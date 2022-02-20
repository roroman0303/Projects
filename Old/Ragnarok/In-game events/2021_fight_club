npc "prontera" "Агент бойцовского клуба#fight_club" 4_M_NOV_HUNT 127 125 0 0 0

OnTouch2:
	var fight_status = GetGlobalVar "fight_status"
	if (fight_status == 0)
		Talk2me "Агент бойцовского клуба " "Агент: участвуй "
	elseif (fight_status == 1)
		Talk2me "Агент бойцовского клуба " "Агент: ставь "
	elseif (fight_status == 2)
		Talk2me "Агент бойцовского клуба " "Агент: бой идёт "
	endif
return

OnClick:
	// jp_event55 - последний бой, на который сделана ставка
	// jp_event56 - боец, на которого сделана ставка
	// jp_event57 - ставка (цифры меньше 10.000)
	// Jp_event63 - ставка (цифры больше 10.000)
	// Jp_event64 - количество ставок
	
	var fight_status = GetGlobalVar "fight_status" // 0 - битвы нет, 1 - время ставок, 2 - битва идёт, 3 - задерка после боя
	var fight_number = GetGlobalVar "fight_number" // битва по счёту
	//var fight_winner = GetGlobalStr "fight_winner" // победитель прошлой битвы
	
	var bet_check = 0 // игрок не ставил
	if (v[jp_event55] == fight_number) // игрок ставил на этот бой
		var bet_check = 1
	elseif ((v[jp_event55] < fight_number)&(v[jp_event55] > 0)) // игрок ставил на прошлые
		var bet_check = 2
	endif
	
	var bet_choose = v[jp_event56]
	var bet_sum = v[jp_event57]
	var bet10k_sum = v[Jp_event63]
	var bet_sum = bet10k_sum * 10000 + bet_sum
	
	var fight_participant1 = GetGlobalStr "fight_participant1" // участники
	var fight_participant2 = GetGlobalStr "fight_participant2"
	var fight_participant3 = GetGlobalStr "fight_participant3"
	var fight_participant4 = GetGlobalStr "fight_participant4"
	var fight_participant5 = GetGlobalStr "fight_participant5"
	var fight_participant6 = GetGlobalStr "fight_participant6"
	var fight_participant7 = GetGlobalStr "fight_participant7"
	var fight_participant8 = GetGlobalStr "fight_participant8"
	
	var name = PcName
	var fighter_check = 0
		if (name == fight_participant1)
		var fighter_check = 1
	elseif (name == fight_participant2)
		var fighter_check = 1
	elseif (name == fight_participant3)
		var fighter_check = 1
	elseif (name == fight_participant4)
		var fighter_check = 1
	elseif (name == fight_participant5)
		var fighter_check = 1
	elseif (name == fight_participant6)
		var fighter_check = 1
	elseif (name == fight_participant7)
		var fighter_check = 1
	elseif (name == fight_participant8)
		var fighter_check = 1
	endif
	
	dialog "Привет!"
				// setitem jp_event55 1 // для теста
				// setitem jp_event56 2 // для теста
				// setitem jp_event57 345 // для теста
				// setitem Jp_event63 1000 // для теста
				// setitem Jp_event64 1 // для теста
	wait
	// Битва не идёт, игрок не участник, ставил на эту битву
	if ((fight_status == 0)&(fighter_check == 0)&(bet_check == 1)) 
		choose menu "Расскажи о бойцовском клубе " "Зарегистрироваться " "Рассчитать ставку "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				dialog "Вы уверены? "
				wait
				choose menu "Да " "Нет "
					case 1
						// снова проверка, чтобы избежать абуза диалогов
						var fight_status = GetGlobalVar "fight_status" 
						if (fight_status != 0)
							dialog "Регистрация окончена "
							close
							return
						endif
						
						var fight_participant1 = GetGlobalStr "fight_participant1" // участники
						var fight_participant2 = GetGlobalStr "fight_participant2"
						var fight_participant3 = GetGlobalStr "fight_participant3"
						var fight_participant4 = GetGlobalStr "fight_participant4"
						var fight_participant5 = GetGlobalStr "fight_participant5"
						var fight_participant6 = GetGlobalStr "fight_participant6"
						var fight_participant7 = GetGlobalStr "fight_participant7"
						var fight_participant8 = GetGlobalStr "fight_participant8"
						
						if (fight_participant1 == "0")
							SetGlobalStr "fight_participant1" name
							var fight_participant1 = GetGlobalStr "fight_participant1"
						elseif (fight_participant2 == "0")
							SetGlobalStr "fight_participant2" name
							var fight_participant2 = GetGlobalStr "fight_participant2"
						elseif (fight_participant3 == "0")
							SetGlobalStr "fight_participant3" name
							var fight_participant3 = GetGlobalStr "fight_participant3"
						elseif (fight_participant4 == "0")
							SetGlobalStr "fight_participant4" name
							var fight_participant4 = GetGlobalStr "fight_participant4"
						elseif (fight_participant5 == "0")
							SetGlobalStr "fight_participant5" name
							var fight_participant5 = GetGlobalStr "fight_participant5"
						elseif (fight_participant6 == "0")
							SetGlobalStr "fight_participant6" name
							var fight_participant6 = GetGlobalStr "fight_participant6"
						elseif (fight_participant7 == "0")
							SetGlobalStr "fight_participant7" name
							var fight_participant7 = GetGlobalStr "fight_participant7"
						elseif (fight_participant8 == "0")
							SetGlobalStr "fight_participant8" name
							var fight_participant8 = GetGlobalStr "fight_participant8"
						else
							dialog "Регистрация окончена "
							close
							return
						endif
						
						var empty_slots = 0 // есть ли свободные слоты
						if (fight_participant1 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant2 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant3 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant4 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant5 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant6 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant7 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant8 == "0")
							var empty_slots = empty_slots + 1
						endif
						
						if (empty_slots == 1)
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Еще один человек будет принимать участие в битве!"
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Остался всего один доброволец до начала битвы!"
						elseif ((empty_slots > 1)&(empty_slots < 5))
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Еще один человек будет принимать участие в битве!"
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Осталось набрать " +empty_slots+ " добровольца до начала битвы!"
						elseif ((empty_slots > 4)&(empty_slots < 8))
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Еще один человек будет принимать участие в битве!"
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Осталось набрать " +empty_slots+ " добровольцев до начала битвы!"
						else
							cmdothernpc "Агент бойцовского клуба#fight_club" "begin_bets"
						endif
						dialog "Вы записаны "
						close
						return		
					break
					case 2
						dialog "Тогда иди отсюда "
						close
						return
					break
				endchoose
			break
			case 3
				// снова проверка, чтобы избежать абуза диалогов
				var fight_number = GetGlobalVar "fight_number" 
				if (v[jp_event55] != fight_number)
					dialog "Начался следующий бой "
					close
					return
				endif
				
				var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
				var bets_on_part2 = GetGlobalVar "bets_on_part2"
				var bets_on_part3 = GetGlobalVar "bets_on_part3"
				var bets_on_part4 = GetGlobalVar "bets_on_part4"
				var bets_on_part5 = GetGlobalVar "bets_on_part5"
				var bets_on_part6 = GetGlobalVar "bets_on_part6"
				var bets_on_part7 = GetGlobalVar "bets_on_part7"
				var bets_on_part8 = GetGlobalVar "bets_on_part8"
				
				var all_bets = bets_on_part1 // подсчёт всех ставок
				var all_bets = all_bets + bets_on_part2
				var all_bets = all_bets + bets_on_part3
				var all_bets = all_bets + bets_on_part4
				var all_bets = all_bets + bets_on_part5
				var all_bets = all_bets + bets_on_part6
				var all_bets = all_bets + bets_on_part7
				var all_bets = all_bets + bets_on_part8	
				
				//var all_bets = 1370680480 // для теста
				//SetGlobalVar "bets_on_part2" 1000000000 // для теста
				
				var bet_choose = v[jp_event56]
				var bet_sum = v[jp_event57]
				var bet10k_sum = v[Jp_event63]
				var bet_sum = bet10k_sum * 10000 + bet_sum
				
				var fight_participant = GetGlobalStr "fight_participant"+bet_choose			
				var bets_on_part = GetGlobalVar "bets_on_part"+bet_choose
				
				var lowed_bets = bets_on_part / 100
				var multiplier = all_bets / lowed_bets // в 100 раз больше
				var reward = bet_sum / 100 * multiplier // чтобы не переваливать через 2ккк
				
				var mult_to_show1 = multiplier / 100
				var mult_to_show2 = multiplier % 100
				
				var fight_winner = GetGlobalStr "fight_winner"
				if (fight_winner != fight_participant)
					dialog "Ваш боец проиграл "
					setitem jp_event55 0 // номер боя
					setitem jp_event56 0 // выбор
					setitem jp_event57 0 // до 10.000
					setitem Jp_event63 0 // после 10.000
					close
					return
				else
					dialog "Банк ставок составляет "
					dialog "" + all_bets + " зени."
					dialog "Вы поставили на " + fight_participant + "."
					dialog "Ваша ставка составила " + bet_sum + "."
					dialog "С коэффициентом " + mult_to_show1 + "." + mult_to_show2 + ""
					dialog "Ваш выигрыш - " + reward + "!"
					
					var max_zeny_check = CheckMaxZeny reward
					if (max_zeny_check == 1)
						wait
						dialog "Многовато зени "
						close
						return
					else
						GetZeny_Range reward reward
						setitem jp_event55 0 // номер боя
						setitem jp_event56 0 // выбор
						setitem jp_event57 0 // до 10.000
						setitem Jp_event63 0 // после 10.000
						close
						return
					endif
				endif
			break
		endchoose
	// Битва не идёт, игрок не участник, ставил на прошлые
	elseif ((fight_status == 0)&(fighter_check == 0)&(bet_check == 2)) 
		choose menu "Расскажи о бойцовском клубе " "Зарегистрироваться " "Проверить ставку "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				dialog "Вы уверены? "
				wait
				choose menu "Да " "Нет "
					case 1
						// снова проверка, чтобы избежать абуза диалогов
						var fight_status = GetGlobalVar "fight_status" 
						if (fight_status != 0)
							dialog "Регистрация окончена "
							close
							return
						endif
						
						var fight_participant1 = GetGlobalStr "fight_participant1" // участники
						var fight_participant2 = GetGlobalStr "fight_participant2"
						var fight_participant3 = GetGlobalStr "fight_participant3"
						var fight_participant4 = GetGlobalStr "fight_participant4"
						var fight_participant5 = GetGlobalStr "fight_participant5"
						var fight_participant6 = GetGlobalStr "fight_participant6"
						var fight_participant7 = GetGlobalStr "fight_participant7"
						var fight_participant8 = GetGlobalStr "fight_participant8"
						
						if (fight_participant1 == "0")
							SetGlobalStr "fight_participant1" name
							var fight_participant1 = GetGlobalStr "fight_participant1"
						elseif (fight_participant2 == "0")
							SetGlobalStr "fight_participant2" name
							var fight_participant2 = GetGlobalStr "fight_participant2"
						elseif (fight_participant3 == "0")
							SetGlobalStr "fight_participant3" name
							var fight_participant3 = GetGlobalStr "fight_participant3"
						elseif (fight_participant4 == "0")
							SetGlobalStr "fight_participant4" name
							var fight_participant4 = GetGlobalStr "fight_participant4"
						elseif (fight_participant5 == "0")
							SetGlobalStr "fight_participant5" name
							var fight_participant5 = GetGlobalStr "fight_participant5"
						elseif (fight_participant6 == "0")
							SetGlobalStr "fight_participant6" name
							var fight_participant6 = GetGlobalStr "fight_participant6"
						elseif (fight_participant7 == "0")
							SetGlobalStr "fight_participant7" name
							var fight_participant7 = GetGlobalStr "fight_participant7"
						elseif (fight_participant8 == "0")
							SetGlobalStr "fight_participant8" name
							var fight_participant8 = GetGlobalStr "fight_participant8"
						else
							dialog "Регистрация окончена "
							close
							return
						endif
						
						var empty_slots = 0 // есть ли свободные слоты
						if (fight_participant1 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant2 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant3 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant4 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant5 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant6 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant7 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant8 == "0")
							var empty_slots = empty_slots + 1
						endif
						
						if (empty_slots == 1)
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Еще один человек будет принимать участие в битве!"
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Остался всего один доброволец до начала битвы!"
						elseif ((empty_slots > 1)&(empty_slots < 5))
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Еще один человек будет принимать участие в битве!"
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Осталось набрать " +empty_slots+ " добровольца до начала битвы!"
						elseif ((empty_slots > 4)&(empty_slots < 8))
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Еще один человек будет принимать участие в битве!"
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Осталось набрать " +empty_slots+ " добровольцев до начала битвы!"
						else
							cmdothernpc "Агент бойцовского клуба#fight_club" "begin_bets"
						endif
						dialog "Вы записаны "
						close
						return		
					break
					case 2
						dialog "Тогда иди отсюда "
						close
						return
					break
				endchoose
			break
			case 3
				dialog "Уже начался новый бой "
				setitem jp_event55 0 // номер боя
				setitem jp_event56 0 // выбор
				setitem jp_event57 0 // до 10.000
				setitem Jp_event63 0 // после 10.000
				close
				return
			break
		endchoose
	// Битва не идёт, игрок не участник, не ставил 
	elseif ((fight_status == 0)&(fighter_check == 0)&(bet_check == 0)) 
		choose menu "Расскажи о бойцовском клубе " "Зарегистрироваться "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				dialog "Вы уверены? "
				wait
				choose menu "Да " "Нет "
					case 1
						// снова проверка, чтобы избежать абуза диалогов
						var fight_status = GetGlobalVar "fight_status" 
						if (fight_status != 0)
							dialog "Регистрация окончена "
							close
							return
						endif
						
						var fight_participant1 = GetGlobalStr "fight_participant1" // участники
						var fight_participant2 = GetGlobalStr "fight_participant2"
						var fight_participant3 = GetGlobalStr "fight_participant3"
						var fight_participant4 = GetGlobalStr "fight_participant4"
						var fight_participant5 = GetGlobalStr "fight_participant5"
						var fight_participant6 = GetGlobalStr "fight_participant6"
						var fight_participant7 = GetGlobalStr "fight_participant7"
						var fight_participant8 = GetGlobalStr "fight_participant8"
						
						if (fight_participant1 == "0")
							SetGlobalStr "fight_participant1" name
							var fight_participant1 = GetGlobalStr "fight_participant1"
						elseif (fight_participant2 == "0")
							SetGlobalStr "fight_participant2" name
							var fight_participant2 = GetGlobalStr "fight_participant2"
						elseif (fight_participant3 == "0")
							SetGlobalStr "fight_participant3" name
							var fight_participant3 = GetGlobalStr "fight_participant3"
						elseif (fight_participant4 == "0")
							SetGlobalStr "fight_participant4" name
							var fight_participant4 = GetGlobalStr "fight_participant4"
						elseif (fight_participant5 == "0")
							SetGlobalStr "fight_participant5" name
							var fight_participant5 = GetGlobalStr "fight_participant5"
						elseif (fight_participant6 == "0")
							SetGlobalStr "fight_participant6" name
							var fight_participant6 = GetGlobalStr "fight_participant6"
						elseif (fight_participant7 == "0")
							SetGlobalStr "fight_participant7" name
							var fight_participant7 = GetGlobalStr "fight_participant7"
						elseif (fight_participant8 == "0")
							SetGlobalStr "fight_participant8" name
							var fight_participant8 = GetGlobalStr "fight_participant8"
						else
							dialog "Регистрация окончена "
							close
							return
						endif
						
						var empty_slots = 0 // есть ли свободные слоты
						if (fight_participant1 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant2 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant3 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant4 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant5 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant6 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant7 == "0")
							var empty_slots = empty_slots + 1
						endif
						if (fight_participant8 == "0")
							var empty_slots = empty_slots + 1
						endif
						
						if (empty_slots == 1)
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Еще один человек будет принимать участие в битве!"
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Остался всего один доброволец до начала битвы!"
						elseif ((empty_slots > 1)&(empty_slots < 5))
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Еще один человек будет принимать участие в битве!"
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Осталось набрать " +empty_slots+ " добровольца до начала битвы!"
						elseif ((empty_slots > 4)&(empty_slots < 8))
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Еще один человек будет принимать участие в битве!"
							broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Осталось набрать " +empty_slots+ " добровольцев до начала битвы!"
						else
							cmdothernpc "Агент бойцовского клуба#fight_club" "begin_bets"
						endif
						dialog "Вы записаны "
						close
						return		
					break
					case 2
						dialog "Тогда иди отсюда "
						close
						return
					break
				endchoose
			break
		endchoose
	// Битва не идёт, игрок участник, ставил на эту битву
	elseif ((fight_status == 0)&(fighter_check == 1)&(bet_check == 1)) 
		choose menu "Расскажи о бойцовском клубе " "Отменить регистрацию " "Рассчитать ставку "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				// снова проверка, чтобы избежать абуза диалогов
				var fight_status = GetGlobalVar "fight_status" 
				if (fight_status != 0)
					dialog "Нельзя отменить регистрацию во время ставок "
					close
					return
				endif
						
				var fight_participant1 = GetGlobalStr "fight_participant1" // участники
				var fight_participant2 = GetGlobalStr "fight_participant2"
				var fight_participant3 = GetGlobalStr "fight_participant3"
				var fight_participant4 = GetGlobalStr "fight_participant4"
				var fight_participant5 = GetGlobalStr "fight_participant5"
				var fight_participant6 = GetGlobalStr "fight_participant6"
				var fight_participant7 = GetGlobalStr "fight_participant7"
				var fight_participant8 = GetGlobalStr "fight_participant8"
						
				if (fight_participant1 == name)
					SetGlobalStr "fight_participant1" "0"
					var fight_participant1 = GetGlobalStr "fight_participant1"
				elseif (fight_participant2 == name)
					SetGlobalStr "fight_participant2" "0"
					var fight_participant2 = GetGlobalStr "fight_participant2"
				elseif (fight_participant3 == name)
					SetGlobalStr "fight_participant3" "0"
					var fight_participant3 = GetGlobalStr "fight_participant3"
				elseif (fight_participant4 == name)
					SetGlobalStr "fight_participant4" "0"
					var fight_participant4 = GetGlobalStr "fight_participant4"
				elseif (fight_participant5 == name)
					SetGlobalStr "fight_participant5" "0"
					var fight_participant5 = GetGlobalStr "fight_participant5"
				elseif (fight_participant6 == name)
					SetGlobalStr "fight_participant6" "0"
					var fight_participant6 = GetGlobalStr "fight_participant6"
				elseif (fight_participant7 == name)
					SetGlobalStr "fight_participant7" "0"
					var fight_participant7 = GetGlobalStr "fight_participant7"
				elseif (fight_participant8 == name)
					SetGlobalStr "fight_participant8" "0"
					var fight_participant8 = GetGlobalStr "fight_participant8"
				else
					dialog "Вы не участвуете в бою "
					close
					return
				endif
				
				var empty_slots = 0 // есть ли свободные слоты
				if (fight_participant1 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant2 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant3 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant4 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant5 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant6 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant7 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant8 == "0")
					var empty_slots = empty_slots + 1
				endif
				
				if (empty_slots == 1)
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Один из добровольцев отказался участвовать в битве."
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Остался всего один доброволец до начала битвы!"
				elseif ((empty_slots > 1)&(empty_slots < 5))
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Один из добровольцев отказался участвовать в битве."
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Осталось набрать " +empty_slots+ " добровольца до начала битвы!"
				elseif ((empty_slots > 4)&(empty_slots < 8))
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Один из добровольцев отказался участвовать в битве."
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Осталось набрать " +empty_slots+ " добровольцев до начала битвы!"
				endif
				dialog "Вы больше не участвуете "
				close
				return		
			break
			case 3
				// снова проверка, чтобы избежать абуза диалогов
				var fight_number = GetGlobalVar "fight_number" 
				if (v[jp_event55] != fight_number)
					dialog "Начался следующий бой "
					close
					return
				endif
				
				var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
				var bets_on_part2 = GetGlobalVar "bets_on_part2"
				var bets_on_part3 = GetGlobalVar "bets_on_part3"
				var bets_on_part4 = GetGlobalVar "bets_on_part4"
				var bets_on_part5 = GetGlobalVar "bets_on_part5"
				var bets_on_part6 = GetGlobalVar "bets_on_part6"
				var bets_on_part7 = GetGlobalVar "bets_on_part7"
				var bets_on_part8 = GetGlobalVar "bets_on_part8"
				
				var all_bets = bets_on_part1 // подсчёт всех ставок
				var all_bets = all_bets + bets_on_part2
				var all_bets = all_bets + bets_on_part3
				var all_bets = all_bets + bets_on_part4
				var all_bets = all_bets + bets_on_part5
				var all_bets = all_bets + bets_on_part6
				var all_bets = all_bets + bets_on_part7
				var all_bets = all_bets + bets_on_part8	
				
				//var all_bets = 1370680480 // для теста
				//SetGlobalVar "bets_on_part2" 1000000000 // для теста
				
				var bet_choose = v[jp_event56]
				var bet_sum = v[jp_event57]
				var bet10k_sum = v[Jp_event63]
				var bet_sum = bet10k_sum * 10000 + bet_sum
				
				var fight_participant = GetGlobalStr "fight_participant"+bet_choose			
				var bets_on_part = GetGlobalVar "bets_on_part"+bet_choose
				
				var lowed_bets = bets_on_part / 100
				var multiplier = all_bets / lowed_bets // в 100 раз больше
				var reward = bet_sum / 100 * multiplier // чтобы не переваливать через 2ккк
				
				var mult_to_show1 = multiplier / 100
				var mult_to_show2 = multiplier % 100
				
				var fight_winner = GetGlobalStr "fight_winner"
				if (fight_winner != fight_participant)
					dialog "Ваш боец проиграл "
					setitem jp_event55 0 // номер боя
					setitem jp_event56 0 // выбор
					setitem jp_event57 0 // до 10.000
					setitem Jp_event63 0 // после 10.000
					close
					return
				else
					dialog "Банк ставок составляет "
					dialog "" + all_bets + " зени."
					dialog "Вы поставили на " + fight_participant + "."
					dialog "Ваша ставка составила " + bet_sum + "."
					dialog "С коэффициентом " + mult_to_show1 + "." + mult_to_show2 + ""
					dialog "Ваш выигрыш - " + reward + "!"
					
					var max_zeny_check = CheckMaxZeny reward
					if (max_zeny_check == 1)
						wait
						dialog "Многовато зени "
						close
						return
					else
						GetZeny_Range reward reward
						setitem jp_event55 0 // номер боя
						setitem jp_event56 0 // выбор
						setitem jp_event57 0 // до 10.000
						setitem Jp_event63 0 // после 10.000
						close
						return
					endif
				endif
			break
		endchoose
	// Битва не идёт, игрок участник, ставил на прошлые
	elseif ((fight_status == 0)&(fighter_check == 1)&(bet_check == 2)) 
		choose menu "Расскажи о бойцовском клубе " "Отменить регистрацию " "Проверить ставку "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				// снова проверка, чтобы избежать абуза диалогов
				var fight_status = GetGlobalVar "fight_status" 
				if (fight_status != 0)
					dialog "Нельзя отменить регистрацию во время ставок "
					close
					return
				endif
					
				var fight_participant1 = GetGlobalStr "fight_participant1" // участники
				var fight_participant2 = GetGlobalStr "fight_participant2"
				var fight_participant3 = GetGlobalStr "fight_participant3"
				var fight_participant4 = GetGlobalStr "fight_participant4"
				var fight_participant5 = GetGlobalStr "fight_participant5"
				var fight_participant6 = GetGlobalStr "fight_participant6"
				var fight_participant7 = GetGlobalStr "fight_participant7"
				var fight_participant8 = GetGlobalStr "fight_participant8"
						
				if (fight_participant1 == name)
					SetGlobalStr "fight_participant1" "0"
					var fight_participant1 = GetGlobalStr "fight_participant1"
				elseif (fight_participant2 == name)
					SetGlobalStr "fight_participant2" "0"
					var fight_participant2 = GetGlobalStr "fight_participant2"
				elseif (fight_participant3 == name)
					SetGlobalStr "fight_participant3" "0"
					var fight_participant3 = GetGlobalStr "fight_participant3"
				elseif (fight_participant4 == name)
					SetGlobalStr "fight_participant4" "0"
					var fight_participant4 = GetGlobalStr "fight_participant4"
				elseif (fight_participant5 == name)
					SetGlobalStr "fight_participant5" "0"
					var fight_participant5 = GetGlobalStr "fight_participant5"
				elseif (fight_participant6 == name)
					SetGlobalStr "fight_participant6" "0"
					var fight_participant6 = GetGlobalStr "fight_participant6"
				elseif (fight_participant7 == name)
					SetGlobalStr "fight_participant7" "0"
					var fight_participant7 = GetGlobalStr "fight_participant7"
				elseif (fight_participant8 == name)
					SetGlobalStr "fight_participant8" "0"
					var fight_participant8 = GetGlobalStr "fight_participant8"
				else
					dialog "Вы не участвуете в бою "
					close
					return
				endif
				
				var empty_slots = 0 // есть ли свободные слоты
				if (fight_participant1 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant2 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant3 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant4 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant5 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant6 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant7 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant8 == "0")
					var empty_slots = empty_slots + 1
				endif
				
				if (empty_slots == 1)
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Один из добровольцев отказался участвовать в битве."
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Остался всего один доброволец до начала битвы!"
				elseif ((empty_slots > 1)&(empty_slots < 5))
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Один из добровольцев отказался участвовать в битве."
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Осталось набрать " +empty_slots+ " добровольца до начала битвы!"
				elseif ((empty_slots > 4)&(empty_slots < 8))
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Один из добровольцев отказался участвовать в битве."
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Осталось набрать " +empty_slots+ " добровольцев до начала битвы!"
				endif
				dialog "Вы больше не участвуете "
				close
				return		
			break
			case 3
				dialog "Уже начался новый бой "
				setitem jp_event55 0 // номер боя
				setitem jp_event56 0 // выбор
				setitem jp_event57 0 // до 10.000
				setitem Jp_event63 0 // после 10.000
				close
				return
			break
		endchoose
	// Битва не идёт, игрок участник, не ставил
	elseif ((fight_status == 0)&(fighter_check == 1)&(bet_check == 0)) 
		choose menu "Расскажи о бойцовском клубе " "Отменить регистрацию "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				// снова проверка, чтобы избежать абуза диалогов
				var fight_status = GetGlobalVar "fight_status" 
				if (fight_status != 0)
					dialog "Нельзя отменить регистрацию во время ставок "
					close
					return
				endif
					
				var fight_participant1 = GetGlobalStr "fight_participant1" // участники
				var fight_participant2 = GetGlobalStr "fight_participant2"
				var fight_participant3 = GetGlobalStr "fight_participant3"
				var fight_participant4 = GetGlobalStr "fight_participant4"
				var fight_participant5 = GetGlobalStr "fight_participant5"
				var fight_participant6 = GetGlobalStr "fight_participant6"
				var fight_participant7 = GetGlobalStr "fight_participant7"
				var fight_participant8 = GetGlobalStr "fight_participant8"
						
				if (fight_participant1 == name)
					SetGlobalStr "fight_participant1" "0"
					var fight_participant1 = GetGlobalStr "fight_participant1"
				elseif (fight_participant2 == name)
					SetGlobalStr "fight_participant2" "0"
					var fight_participant2 = GetGlobalStr "fight_participant2"
				elseif (fight_participant3 == name)
					SetGlobalStr "fight_participant3" "0"
					var fight_participant3 = GetGlobalStr "fight_participant3"
				elseif (fight_participant4 == name)
					SetGlobalStr "fight_participant4" "0"
					var fight_participant4 = GetGlobalStr "fight_participant4"
				elseif (fight_participant5 == name)
					SetGlobalStr "fight_participant5" "0"
					var fight_participant5 = GetGlobalStr "fight_participant5"
				elseif (fight_participant6 == name)
					SetGlobalStr "fight_participant6" "0"
					var fight_participant6 = GetGlobalStr "fight_participant6"
				elseif (fight_participant7 == name)
					SetGlobalStr "fight_participant7" "0"
					var fight_participant7 = GetGlobalStr "fight_participant7"
				elseif (fight_participant8 == name)
					SetGlobalStr "fight_participant8" "0"
					var fight_participant8 = GetGlobalStr "fight_participant8"
				else
					dialog "Вы не участвуете в бою "
					close
					return
				endif
				
				var empty_slots = 0 // есть ли свободные слоты
				if (fight_participant1 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant2 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant3 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant4 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant5 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant6 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant7 == "0")
					var empty_slots = empty_slots + 1
				endif
				if (fight_participant8 == "0")
					var empty_slots = empty_slots + 1
				endif
				
				if (empty_slots == 1)
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Один из добровольцев отказался участвовать в битве."
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Остался всего один доброволец до начала битвы!"
				elseif ((empty_slots > 1)&(empty_slots < 5))
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Один из добровольцев отказался участвовать в битве."
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Осталось набрать " +empty_slots+ " добровольца до начала битвы!"
				elseif ((empty_slots > 4)&(empty_slots < 8))
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Один из добровольцев отказался участвовать в битве."
					broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Осталось набрать " +empty_slots+ " добровольцев до начала битвы!"
				endif
				dialog "Вы больше не участвуете "
				close
				return		
			break
		endchoose
	// Ставки начались, игрок участник, ставил на прошлые
	elseif ((fight_status == 1)&(fighter_check == 1)&(bet_check == 2))
		choose menu "Расскажи о бойцовском клубе " "Проверить ставку "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				dialog "Уже начался новый бой "
				setitem jp_event55 0 // номер боя
				setitem jp_event56 0 // выбор
				setitem jp_event57 0 // до 10.000
				setitem Jp_event63 0 // после 10.000
				close
				return
			break
		endchoose
	// Ставки начались, игрок участник, не ставил
	elseif ((fight_status == 1)&(fighter_check == 1)&(bet_check == 0))
		choose menu "Расскажи о бойцовском клубе " "Узнать текущие ставки "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				// снова проверка, чтобы избежать абуза диалогов
				var fight_status = GetGlobalVar "fight_status" 
				if (fight_status != 1)
					dialog "Сейчас не время ставок "
					close
					return
				endif
				
				var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
				var bets_on_part2 = GetGlobalVar "bets_on_part2"
				var bets_on_part3 = GetGlobalVar "bets_on_part3"
				var bets_on_part4 = GetGlobalVar "bets_on_part4"
				var bets_on_part5 = GetGlobalVar "bets_on_part5"
				var bets_on_part6 = GetGlobalVar "bets_on_part6"
				var bets_on_part7 = GetGlobalVar "bets_on_part7"
				var bets_on_part8 = GetGlobalVar "bets_on_part8"
				
				var all_bets = bets_on_part1 // подсчёт всех ставок
				var all_bets = all_bets + bets_on_part2
				var all_bets = all_bets + bets_on_part3
				var all_bets = all_bets + bets_on_part4
				var all_bets = all_bets + bets_on_part5
				var all_bets = all_bets + bets_on_part6
				var all_bets = all_bets + bets_on_part7
				var all_bets = all_bets + bets_on_part8	
				
				//var all_bets = 1370680480 // для теста
				//SetGlobalVar "bets_on_part2" 1000000000 // для теста
				
				var fight_participant1 = GetGlobalStr "fight_participant1" // участники
				var fight_participant2 = GetGlobalStr "fight_participant2"
				var fight_participant3 = GetGlobalStr "fight_participant3"
				var fight_participant4 = GetGlobalStr "fight_participant4"
				var fight_participant5 = GetGlobalStr "fight_participant5"
				var fight_participant6 = GetGlobalStr "fight_participant6"
				var fight_participant7 = GetGlobalStr "fight_participant7"
				var fight_participant8 = GetGlobalStr "fight_participant8"
				
				if (name == fight_participant1)
					var bets_on_part = bets_on_part1
				elseif (name == fight_participant2)
					var bets_on_part = bets_on_part2
				elseif (name == fight_participant3)
					var bets_on_part = bets_on_part3
				elseif (name == fight_participant4)
					var bets_on_part = bets_on_part4
				elseif (name == fight_participant5)
					var bets_on_part = bets_on_part5
				elseif (name == fight_participant6)
					var bets_on_part = bets_on_part6
				elseif (name == fight_participant7)
					var bets_on_part = bets_on_part7
				elseif (name == fight_participant8)
					var bets_on_part = bets_on_part8
				else
					dialog "Сейчас не время ставок "
					close
					return
				endif
				
				dialog "Банк ставок составляет "
				dialog "" + all_bets + " зени."
				dialog "На вас поставили " + bets_on_part + "зени."
				close
				return
			break
		endchoose
	// Ставки начались, игрок не участник, ставил на эту
	elseif ((fight_status == 1)&(fighter_check == 0)&(bet_check == 1))
		choose menu "Расскажи о бойцовском клубе " "Кто сейчас сражается? " "Проверить ставку "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				dialog "Вы уверены? "
				close
				return
			break
			case 3
				// снова проверка, чтобы избежать абуза диалогов
				var fight_status = GetGlobalVar "fight_status" 
				var fight_number = GetGlobalVar "fight_number"
				if (fight_status != 1)
					dialog "Время ставок окончено "
					close
					return
				elseif (v[jp_event55] != fight_number)
					dialog "Ваша ставка устарела "
					close
					return
				endif
				
				var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
				var bets_on_part2 = GetGlobalVar "bets_on_part2"
				var bets_on_part3 = GetGlobalVar "bets_on_part3"
				var bets_on_part4 = GetGlobalVar "bets_on_part4"
				var bets_on_part5 = GetGlobalVar "bets_on_part5"
				var bets_on_part6 = GetGlobalVar "bets_on_part6"
				var bets_on_part7 = GetGlobalVar "bets_on_part7"
				var bets_on_part8 = GetGlobalVar "bets_on_part8"
				
				var all_bets = bets_on_part1 // подсчёт всех ставок
				var all_bets = all_bets + bets_on_part2
				var all_bets = all_bets + bets_on_part3
				var all_bets = all_bets + bets_on_part4
				var all_bets = all_bets + bets_on_part5
				var all_bets = all_bets + bets_on_part6
				var all_bets = all_bets + bets_on_part7
				var all_bets = all_bets + bets_on_part8	
				
				//var all_bets = 1370680480 // для теста
				//SetGlobalVar "bets_on_part2" 1000000000 // для теста
				
				var bet_choose = v[jp_event56]
				var bet_sum = v[jp_event57]
				var bet10k_sum = v[Jp_event63]
				var bet_sum = bet10k_sum * 10000 + bet_sum
				
				var fight_participant = GetGlobalStr "fight_participant"+bet_choose			
				var bets_on_part = GetGlobalVar "bets_on_part"+bet_choose
				
				var lowed_bets = bets_on_part / 100
				var multiplier = all_bets / lowed_bets // в 100 раз больше
				var reward = bet_sum / 100 * multiplier // чтобы не переваливать через 2ккк			
				
				if (fight_participant != "0")
					dialog "Банк ставок составляет "
					dialog "" + all_bets + " зени."
					dialog "Вы поставили на " + fight_participant + "."
					dialog "Ваша ставка составляет " + bet_sum + "."
					dialog "В случае победы ваш выигрыш "
					dialog "составит " + reward + " зени."
					wait
					choose menu "Повысить ставку " "Уйти "
						case 1
							// снова проверка, чтобы избежать абуза диалогов
							var fight_status = GetGlobalVar "fight_status" 
							var fight_number = GetGlobalVar "fight_number"
							if (fight_status != 1)
								dialog "Время ставок окончено "
								close
								return
							elseif (v[jp_event55] != fight_number)
								dialog "Ваша ставка устарела "
								close
								return
							endif
							
							dialog "В данный момент ваша ставка "
							dialog "на игрока " + fight_participant+""
							dialog "составляет " + bet_sum+ "."
							dialog "На сколько вы хотите её повысить?"
							dialog "Макс. ставка - 100.000.000 зени."
							dialog "0 - для отмены."
							wait
							
							dlgwrite 1000 100000000
							var new_bet = bet_sum + input
							if (input == 0)
								dialog "Ставка отменена "
								close
								return
							elseif error
								dialog "Ставка должна быть в пределах "
								close
								return
							elseif (new_bet > 100000000)
								dialog "Ставка должна быть в пределах "
								close
								return
							endif

							// снова проверка, чтобы избежать абуза диалогов
							var fight_status = GetGlobalVar "fight_status" 
							var fight_number = GetGlobalVar "fight_number"
							if (fight_status != 1)
								dialog "Время ставок окончено "
								close
								return
							elseif (v[jp_event55] != fight_number)
								dialog "Ваша ставка устарела "
								close
								return
							endif
							
							var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
							var bets_on_part2 = GetGlobalVar "bets_on_part2"
							var bets_on_part3 = GetGlobalVar "bets_on_part3"
							var bets_on_part4 = GetGlobalVar "bets_on_part4"
							var bets_on_part5 = GetGlobalVar "bets_on_part5"
							var bets_on_part6 = GetGlobalVar "bets_on_part6"
							var bets_on_part7 = GetGlobalVar "bets_on_part7"
							var bets_on_part8 = GetGlobalVar "bets_on_part8"
							
							var all_bets = bets_on_part1 // подсчёт всех ставок
							var all_bets = all_bets + bets_on_part2
							var all_bets = all_bets + bets_on_part3
							var all_bets = all_bets + bets_on_part4
							var all_bets = all_bets + bets_on_part5
							var all_bets = all_bets + bets_on_part6
							var all_bets = all_bets + bets_on_part7
							var all_bets = all_bets + bets_on_part8
							var all_bets = all_bets + input
							
							if (all_bets > 2000000000)
								dialog "Банк ставок переполнен "
								close
								return
							endif
							
							if v[VAR_MONEY] < input
								dialog "Не хватает денег "
								close
								return
							else
								dialog "Готово "
								
								var bet_sum = new_bet % 10000
								var bet10k_sum = new_bet / 10000
								
								var bets_on_part1 = GetGlobalVar "bets_on_part1"
								var bets_on_part1 = bets_on_part1 + input
								SetGlobalVar "bets_on_part1" bets_on_part1
								
								dropgold input
								setitem jp_event57 bet_sum // до 10.000
								setitem Jp_event63 bet10k_sum // после 10.000
								close
								return
							endif
						break
						case 2
							dialog "Удачного дня "
							close
							return
						break
					endchoose
				else
					dialog "К сожалению, ваш боец выбыл."
					close
					return
				endif
			break
		endchoose
	// Ставки начались, игрок не участник, ставил на прошлые
	elseif ((fight_status == 1)&(fighter_check == 0)&(bet_check == 2))
		choose menu "Расскажи о бойцовском клубе " "Кто сейчас сражается? " "Проверить ставку "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				dialog "Вы уверены? "
				close
				return
			break
			case 3
				dialog "Уже начался новый бой "
				setitem jp_event55 0 // номер боя
				setitem jp_event56 0 // выбор
				setitem jp_event57 0 // до 10.000
				setitem Jp_event63 0 // после 10.000
				close
				return
			break
		endchoose
	// Ставки начались, игрок не участник, не ставил
	elseif ((fight_status == 1)&(fighter_check == 0)&(bet_check == 0))
		choose menu "Расскажи о бойцовском клубе " "Кто сейчас сражается? " "Сделать ставку "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				dialog "Вы уверены? "
				close
				return
			break
			case 3
				// снова проверка, чтобы избежать абуза диалогов
				var fight_status = GetGlobalVar "fight_status" 
				if (fight_status != 1)
					dialog "Сейчас не время ставок "
					close
					return
				endif
				
				var fight_participant1 = GetGlobalStr "fight_participant1" // участники
				var fight_participant2 = GetGlobalStr "fight_participant2"
				var fight_participant3 = GetGlobalStr "fight_participant3"
				var fight_participant4 = GetGlobalStr "fight_participant4"
				var fight_participant5 = GetGlobalStr "fight_participant5"
				var fight_participant6 = GetGlobalStr "fight_participant6"
				var fight_participant7 = GetGlobalStr "fight_participant7"
				var fight_participant8 = GetGlobalStr "fight_participant8"
				
				var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
				var bets_on_part2 = GetGlobalVar "bets_on_part2"
				var bets_on_part3 = GetGlobalVar "bets_on_part3"
				var bets_on_part4 = GetGlobalVar "bets_on_part4"
				var bets_on_part5 = GetGlobalVar "bets_on_part5"
				var bets_on_part6 = GetGlobalVar "bets_on_part6"
				var bets_on_part7 = GetGlobalVar "bets_on_part7"
				var bets_on_part8 = GetGlobalVar "bets_on_part8"
				
				var all_bets = bets_on_part1 // подсчёт всех ставок
				var all_bets = all_bets + bets_on_part2
				var all_bets = all_bets + bets_on_part3
				var all_bets = all_bets + bets_on_part4
				var all_bets = all_bets + bets_on_part5
				var all_bets = all_bets + bets_on_part6
				var all_bets = all_bets + bets_on_part7
				var all_bets = all_bets + bets_on_part8	
				
				//var all_bets = 1370680480 // для теста
				//SetGlobalVar "bets_on_part2" 1000000000 // для теста
				
				var choice_1 = fight_participant1+" - "+bets_on_part1
				var choice_2 = fight_participant2+" - "+bets_on_part2
				var choice_3 = fight_participant3+" - "+bets_on_part3
				var choice_4 = fight_participant4+" - "+bets_on_part4
				var choice_5 = fight_participant5+" - "+bets_on_part5
				var choice_6 = fight_participant6+" - "+bets_on_part6
				var choice_7 = fight_participant7+" - "+bets_on_part7
				var choice_8 = fight_participant8+" - "+bets_on_part8
								
				dialog "Банк ставок составляет "
				dialog "" + all_bets + " зени."
				dialog "На кого вы хотите поставить?"
				wait
				
				choose menu choice_1 choice_2 choice_3 choice_4 choice_5 choice_6 choice_7 choice_8
					case 1
						dialog "Сколько вы хотите поставить?"
						dialog "Мин. ставка - 1.000 зени."
						dialog "Макс. ставка - 100.000.000 зени."
						dialog "Банк ставок ограничен "
						dialog "2.000.000.000 зени."
						dialog "0 - для отмены."
						wait
						dlgwrite 1000 100000000
						
						if (input == 0)
							dialog "Ставка отменена "
							close
							return
						elseif error
							dialog "Ставка должна быть в пределах "
							close
							return
						endif
						
						// снова проверка, чтобы избежать абуза диалогов
						var fight_status = GetGlobalVar "fight_status" 
						if (fight_status != 1)
							dialog "Сейчас не время ставок "
							close
							return
						endif
						
						var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
						var bets_on_part2 = GetGlobalVar "bets_on_part2"
						var bets_on_part3 = GetGlobalVar "bets_on_part3"
						var bets_on_part4 = GetGlobalVar "bets_on_part4"
						var bets_on_part5 = GetGlobalVar "bets_on_part5"
						var bets_on_part6 = GetGlobalVar "bets_on_part6"
						var bets_on_part7 = GetGlobalVar "bets_on_part7"
						var bets_on_part8 = GetGlobalVar "bets_on_part8"
						
						var all_bets = bets_on_part1 // подсчёт всех ставок
						var all_bets = all_bets + bets_on_part2
						var all_bets = all_bets + bets_on_part3
						var all_bets = all_bets + bets_on_part4
						var all_bets = all_bets + bets_on_part5
						var all_bets = all_bets + bets_on_part6
						var all_bets = all_bets + bets_on_part7
						var all_bets = all_bets + bets_on_part8
						var all_bets = all_bets + input
						
						if (all_bets > 2000000000)
							dialog "Банк ставок переполнен "
							close
							return
						endif
						
						if v[VAR_MONEY] < input
							dialog "Не хватает денег "
							close
							return
						else
							dialog "Готово "
							
							var fight_number = GetGlobalVar "fight_number"
							var bet_sum = input % 10000
							var bet10k_sum = input / 10000
							
							var bets_on_part1 = GetGlobalVar "bets_on_part1"
							var bets_on_part1 = bets_on_part1 + input
							SetGlobalVar "bets_on_part1" bets_on_part1
							
							dropgold input
							setitem jp_event55 fight_number // номер боя
							setitem jp_event56 1 // выбор
							setitem jp_event57 bet_sum // до 10.000
							setitem Jp_event63 bet10k_sum // после 10.000
							getitem Jp_event64 1 // количество ставок
							close
							return
						endif		
					break
					case 2
						dialog "Сколько вы хотите поставить?"
						dialog "Мин. ставка - 1.000 зени."
						dialog "Макс. ставка - 100.000.000 зени."
						dialog "Банк ставок ограничен "
						dialog "2.000.000.000 зени."
						dialog "0 - для отмены."
						wait
						dlgwrite 1000 100000000
						
						if (input == 0)
							dialog "Ставка отменена "
							close
							return
						elseif error
							dialog "Ставка должна быть в пределах "
							close
							return
						endif
						
						// снова проверка, чтобы избежать абуза диалогов
						var fight_status = GetGlobalVar "fight_status" 
						if (fight_status != 1)
							dialog "Сейчас не время ставок "
							close
							return
						endif
						
						var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
						var bets_on_part2 = GetGlobalVar "bets_on_part2"
						var bets_on_part3 = GetGlobalVar "bets_on_part3"
						var bets_on_part4 = GetGlobalVar "bets_on_part4"
						var bets_on_part5 = GetGlobalVar "bets_on_part5"
						var bets_on_part6 = GetGlobalVar "bets_on_part6"
						var bets_on_part7 = GetGlobalVar "bets_on_part7"
						var bets_on_part8 = GetGlobalVar "bets_on_part8"
						
						var all_bets = bets_on_part1 // подсчёт всех ставок
						var all_bets = all_bets + bets_on_part2
						var all_bets = all_bets + bets_on_part3
						var all_bets = all_bets + bets_on_part4
						var all_bets = all_bets + bets_on_part5
						var all_bets = all_bets + bets_on_part6
						var all_bets = all_bets + bets_on_part7
						var all_bets = all_bets + bets_on_part8
						var all_bets = all_bets + input
						
						if (all_bets > 2000000000)
							dialog "Банк ставок переполнен "
							close
							return
						endif
						
						if v[VAR_MONEY] < input
							dialog "Не хватает денег "
							close
							return
						else
							dialog "Готово "
							
							var fight_number = GetGlobalVar "fight_number"
							var bet_sum = input % 10000
							var bet10k_sum = input / 10000
							
							var bets_on_part2 = GetGlobalVar "bets_on_part2"
							var bets_on_part2 = bets_on_part2 + input
							SetGlobalVar "bets_on_part2" bets_on_part2
							
							dropgold input
							setitem jp_event55 fight_number // номер боя
							setitem jp_event56 2 // выбор
							setitem jp_event57 bet_sum // до 10.000
							setitem Jp_event63 bet10k_sum // после 10.000
							getitem Jp_event64 1 // количество ставок
							close
							return
						endif
					break
					case 3
						dialog "Сколько вы хотите поставить?"
						dialog "Мин. ставка - 1.000 зени."
						dialog "Макс. ставка - 100.000.000 зени."
						dialog "Банк ставок ограничен "
						dialog "2.000.000.000 зени."
						dialog "0 - для отмены."
						wait
						dlgwrite 1000 100000000
						
						if (input == 0)
							dialog "Ставка отменена "
							close
							return
						elseif error
							dialog "Ставка должна быть в пределах "
							close
							return
						endif
						
						// снова проверка, чтобы избежать абуза диалогов
						var fight_status = GetGlobalVar "fight_status" 
						if (fight_status != 1)
							dialog "Сейчас не время ставок "
							close
							return
						endif
						
						var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
						var bets_on_part2 = GetGlobalVar "bets_on_part2"
						var bets_on_part3 = GetGlobalVar "bets_on_part3"
						var bets_on_part4 = GetGlobalVar "bets_on_part4"
						var bets_on_part5 = GetGlobalVar "bets_on_part5"
						var bets_on_part6 = GetGlobalVar "bets_on_part6"
						var bets_on_part7 = GetGlobalVar "bets_on_part7"
						var bets_on_part8 = GetGlobalVar "bets_on_part8"
						
						var all_bets = bets_on_part1 // подсчёт всех ставок
						var all_bets = all_bets + bets_on_part2
						var all_bets = all_bets + bets_on_part3
						var all_bets = all_bets + bets_on_part4
						var all_bets = all_bets + bets_on_part5
						var all_bets = all_bets + bets_on_part6
						var all_bets = all_bets + bets_on_part7
						var all_bets = all_bets + bets_on_part8
						var all_bets = all_bets + input
						
						if (all_bets > 2000000000)
							dialog "Банк ставок переполнен "
							close
							return
						endif
						
						if v[VAR_MONEY] < input
							dialog "Не хватает денег "
							close
							return
						else
							dialog "Готово "
							
							var fight_number = GetGlobalVar "fight_number"
							var bet_sum = input % 10000
							var bet10k_sum = input / 10000
							
							var bets_on_part3 = GetGlobalVar "bets_on_part3"
							var bets_on_part3 = bets_on_part3 + input
							SetGlobalVar "bets_on_part3" bets_on_part3
							
							dropgold input
							setitem jp_event55 fight_number // номер боя
							setitem jp_event56 3 // выбор
							setitem jp_event57 bet_sum // до 10.000
							setitem Jp_event63 bet10k_sum // после 10.000
							getitem Jp_event64 1 // количество ставок
							close
							return
						endif
					break
					case 4
						dialog "Сколько вы хотите поставить?"
						dialog "Мин. ставка - 1.000 зени."
						dialog "Макс. ставка - 100.000.000 зени."
						dialog "Банк ставок ограничен "
						dialog "2.000.000.000 зени."
						dialog "0 - для отмены."
						wait
						dlgwrite 1000 100000000
						
						if (input == 0)
							dialog "Ставка отменена "
							close
							return
						elseif error
							dialog "Ставка должна быть в пределах "
							close
							return
						endif
						
						// снова проверка, чтобы избежать абуза диалогов
						var fight_status = GetGlobalVar "fight_status" 
						if (fight_status != 1)
							dialog "Сейчас не время ставок "
							close
							return
						endif
						
						var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
						var bets_on_part2 = GetGlobalVar "bets_on_part2"
						var bets_on_part3 = GetGlobalVar "bets_on_part3"
						var bets_on_part4 = GetGlobalVar "bets_on_part4"
						var bets_on_part5 = GetGlobalVar "bets_on_part5"
						var bets_on_part6 = GetGlobalVar "bets_on_part6"
						var bets_on_part7 = GetGlobalVar "bets_on_part7"
						var bets_on_part8 = GetGlobalVar "bets_on_part8"
						
						var all_bets = bets_on_part1 // подсчёт всех ставок
						var all_bets = all_bets + bets_on_part2
						var all_bets = all_bets + bets_on_part3
						var all_bets = all_bets + bets_on_part4
						var all_bets = all_bets + bets_on_part5
						var all_bets = all_bets + bets_on_part6
						var all_bets = all_bets + bets_on_part7
						var all_bets = all_bets + bets_on_part8
						var all_bets = all_bets + input
						
						if (all_bets > 2000000000)
							dialog "Банк ставок переполнен "
							close
							return
						endif
						
						if v[VAR_MONEY] < input
							dialog "Не хватает денег "
							close
							return
						else
							dialog "Готово "
							
							var fight_number = GetGlobalVar "fight_number"
							var bet_sum = input % 10000
							var bet10k_sum = input / 10000
							
							var bets_on_part4 = GetGlobalVar "bets_on_part4"
							var bets_on_part4 = bets_on_part4 + input
							SetGlobalVar "bets_on_part4" bets_on_part4
							
							dropgold input
							setitem jp_event55 fight_number // номер боя
							setitem jp_event56 4 // выбор
							setitem jp_event57 bet_sum // до 10.000
							setitem Jp_event63 bet10k_sum // после 10.000
							getitem Jp_event64 1 // количество ставок
							close
							return
						endif
					break
					case 5
						dialog "Сколько вы хотите поставить?"
						dialog "Мин. ставка - 1.000 зени."
						dialog "Макс. ставка - 100.000.000 зени."
						dialog "Банк ставок ограничен "
						dialog "2.000.000.000 зени."
						dialog "0 - для отмены."
						wait
						dlgwrite 1000 100000000
						
						if (input == 0)
							dialog "Ставка отменена "
							close
							return
						elseif error
							dialog "Ставка должна быть в пределах "
							close
							return
						endif
						
						// снова проверка, чтобы избежать абуза диалогов
						var fight_status = GetGlobalVar "fight_status" 
						if (fight_status != 1)
							dialog "Сейчас не время ставок "
							close
							return
						endif
						
						var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
						var bets_on_part2 = GetGlobalVar "bets_on_part2"
						var bets_on_part3 = GetGlobalVar "bets_on_part3"
						var bets_on_part4 = GetGlobalVar "bets_on_part4"
						var bets_on_part5 = GetGlobalVar "bets_on_part5"
						var bets_on_part6 = GetGlobalVar "bets_on_part6"
						var bets_on_part7 = GetGlobalVar "bets_on_part7"
						var bets_on_part8 = GetGlobalVar "bets_on_part8"
						
						var all_bets = bets_on_part1 // подсчёт всех ставок
						var all_bets = all_bets + bets_on_part2
						var all_bets = all_bets + bets_on_part3
						var all_bets = all_bets + bets_on_part4
						var all_bets = all_bets + bets_on_part5
						var all_bets = all_bets + bets_on_part6
						var all_bets = all_bets + bets_on_part7
						var all_bets = all_bets + bets_on_part8
						var all_bets = all_bets + input
						
						if (all_bets > 2000000000)
							dialog "Банк ставок переполнен "
							close
							return
						endif
						
						if v[VAR_MONEY] < input
							dialog "Не хватает денег "
							close
							return
						else
							dialog "Готово "
							
							var fight_number = GetGlobalVar "fight_number"
							var bet_sum = input % 10000
							var bet10k_sum = input / 10000
							
							var bets_on_part5 = GetGlobalVar "bets_on_part5"
							var bets_on_part5 = bets_on_part5 + input
							SetGlobalVar "bets_on_part5" bets_on_part5
							
							dropgold input
							setitem jp_event55 fight_number // номер боя
							setitem jp_event56 5 // выбор
							setitem jp_event57 bet_sum // до 10.000
							setitem Jp_event63 bet10k_sum // после 10.000
							getitem Jp_event64 1 // количество ставок
							close
							return
						endif
					break
					case 6
						dialog "Сколько вы хотите поставить?"
						dialog "Мин. ставка - 1.000 зени."
						dialog "Макс. ставка - 100.000.000 зени."
						dialog "Банк ставок ограничен "
						dialog "2.000.000.000 зени."
						dialog "0 - для отмены."
						wait
						dlgwrite 1000 100000000
						
						if (input == 0)
							dialog "Ставка отменена "
							close
							return
						elseif error
							dialog "Ставка должна быть в пределах "
							close
							return
						endif
						
						// снова проверка, чтобы избежать абуза диалогов
						var fight_status = GetGlobalVar "fight_status" 
						if (fight_status != 1)
							dialog "Сейчас не время ставок "
							close
							return
						endif
						
						var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
						var bets_on_part2 = GetGlobalVar "bets_on_part2"
						var bets_on_part3 = GetGlobalVar "bets_on_part3"
						var bets_on_part4 = GetGlobalVar "bets_on_part4"
						var bets_on_part5 = GetGlobalVar "bets_on_part5"
						var bets_on_part6 = GetGlobalVar "bets_on_part6"
						var bets_on_part7 = GetGlobalVar "bets_on_part7"
						var bets_on_part8 = GetGlobalVar "bets_on_part8"
						
						var all_bets = bets_on_part1 // подсчёт всех ставок
						var all_bets = all_bets + bets_on_part2
						var all_bets = all_bets + bets_on_part3
						var all_bets = all_bets + bets_on_part4
						var all_bets = all_bets + bets_on_part5
						var all_bets = all_bets + bets_on_part6
						var all_bets = all_bets + bets_on_part7
						var all_bets = all_bets + bets_on_part8
						var all_bets = all_bets + input
						
						if (all_bets > 2000000000)
							dialog "Банк ставок переполнен "
							close
							return
						endif
						
						if v[VAR_MONEY] < input
							dialog "Не хватает денег "
							close
							return
						else
							dialog "Готово "
							
							var fight_number = GetGlobalVar "fight_number"
							var bet_sum = input % 10000
							var bet10k_sum = input / 10000
							
							var bets_on_part6 = GetGlobalVar "bets_on_part6"
							var bets_on_part6 = bets_on_part6 + input
							SetGlobalVar "bets_on_part6" bets_on_part6
							
							dropgold input
							setitem jp_event55 fight_number // номер боя
							setitem jp_event56 6 // выбор
							setitem jp_event57 bet_sum // до 10.000
							setitem Jp_event63 bet10k_sum // после 10.000
							getitem Jp_event64 1 // количество ставок
							close
							return
						endif
					break
					case 7
						dialog "Сколько вы хотите поставить?"
						dialog "Мин. ставка - 1.000 зени."
						dialog "Макс. ставка - 100.000.000 зени."
						dialog "Банк ставок ограничен "
						dialog "2.000.000.000 зени."
						dialog "0 - для отмены."
						wait
						dlgwrite 1000 100000000
						
						if (input == 0)
							dialog "Ставка отменена "
							close
							return
						elseif error
							dialog "Ставка должна быть в пределах "
							close
							return
						endif
						
						// снова проверка, чтобы избежать абуза диалогов
						var fight_status = GetGlobalVar "fight_status" 
						if (fight_status != 1)
							dialog "Сейчас не время ставок "
							close
							return
						endif
						
						var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
						var bets_on_part2 = GetGlobalVar "bets_on_part2"
						var bets_on_part3 = GetGlobalVar "bets_on_part3"
						var bets_on_part4 = GetGlobalVar "bets_on_part4"
						var bets_on_part5 = GetGlobalVar "bets_on_part5"
						var bets_on_part6 = GetGlobalVar "bets_on_part6"
						var bets_on_part7 = GetGlobalVar "bets_on_part7"
						var bets_on_part8 = GetGlobalVar "bets_on_part8"
						
						var all_bets = bets_on_part1 // подсчёт всех ставок
						var all_bets = all_bets + bets_on_part2
						var all_bets = all_bets + bets_on_part3
						var all_bets = all_bets + bets_on_part4
						var all_bets = all_bets + bets_on_part5
						var all_bets = all_bets + bets_on_part6
						var all_bets = all_bets + bets_on_part7
						var all_bets = all_bets + bets_on_part8
						var all_bets = all_bets + input
						
						if (all_bets > 2000000000)
							dialog "Банк ставок переполнен "
							close
							return
						endif
						
						if v[VAR_MONEY] < input
							dialog "Не хватает денег "
							close
							return
						else
							dialog "Готово "
							
							var fight_number = GetGlobalVar "fight_number"
							var bet_sum = input % 10000
							var bet10k_sum = input / 10000
							
							var bets_on_part7 = GetGlobalVar "bets_on_part7"
							var bets_on_part7 = bets_on_part7 + input
							SetGlobalVar "bets_on_part7" bets_on_part7
							
							dropgold input
							setitem jp_event55 fight_number // номер боя
							setitem jp_event56 7 // выбор
							setitem jp_event57 bet_sum // до 10.000
							setitem Jp_event63 bet10k_sum // после 10.000
							getitem Jp_event64 1 // количество ставок
							close
							return
						endif
					break
					case 8
						dialog "Сколько вы хотите поставить?"
						dialog "Мин. ставка - 1.000 зени."
						dialog "Макс. ставка - 100.000.000 зени."
						dialog "Банк ставок ограничен "
						dialog "2.000.000.000 зени."
						dialog "0 - для отмены."
						wait
						dlgwrite 1000 100000000
						
						if (input == 0)
							dialog "Ставка отменена "
							close
							return
						elseif error
							dialog "Ставка должна быть в пределах "
							close
							return
						endif
						
						// снова проверка, чтобы избежать абуза диалогов
						var fight_status = GetGlobalVar "fight_status" 
						if (fight_status != 1)
							dialog "Сейчас не время ставок "
							close
							return
						endif
						
						var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
						var bets_on_part2 = GetGlobalVar "bets_on_part2"
						var bets_on_part3 = GetGlobalVar "bets_on_part3"
						var bets_on_part4 = GetGlobalVar "bets_on_part4"
						var bets_on_part5 = GetGlobalVar "bets_on_part5"
						var bets_on_part6 = GetGlobalVar "bets_on_part6"
						var bets_on_part7 = GetGlobalVar "bets_on_part7"
						var bets_on_part8 = GetGlobalVar "bets_on_part8"
						
						var all_bets = bets_on_part1 // подсчёт всех ставок
						var all_bets = all_bets + bets_on_part2
						var all_bets = all_bets + bets_on_part3
						var all_bets = all_bets + bets_on_part4
						var all_bets = all_bets + bets_on_part5
						var all_bets = all_bets + bets_on_part6
						var all_bets = all_bets + bets_on_part7
						var all_bets = all_bets + bets_on_part8
						var all_bets = all_bets + input
						
						if (all_bets > 2000000000)
							dialog "Банк ставок переполнен "
							close
							return
						endif
						
						if v[VAR_MONEY] < input
							dialog "Не хватает денег "
							close
							return
						else
							dialog "Готово "
							
							var fight_number = GetGlobalVar "fight_number"
							var bet_sum = input % 10000
							var bet10k_sum = input / 10000
							
							var bets_on_part8 = GetGlobalVar "bets_on_part8"
							var bets_on_part8 = bets_on_part8 + input
							SetGlobalVar "bets_on_part8" bets_on_part8
							
							dropgold input
							setitem jp_event55 fight_number // номер боя
							setitem jp_event56 8 // выбор
							setitem jp_event57 bet_sum // до 10.000
							setitem Jp_event63 bet10k_sum // после 10.000
							getitem Jp_event64 1 // количество ставок
							close
							return
						endif
					break
				endchoose
			break
		endchoose
	// Битва началась, игрок участник, ставил на прошлые
	elseif ((fight_status == 2)&(fighter_check == 1)&(bet_check == 2))
		choose menu "Расскажи о бойцовском клубе " "Переместиться на арену " "Проверить ставку "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				dialog "Вы уверены? "
				close
				return
			break
			case 3
				dialog "Уже начался новый бой "
				setitem jp_event55 0 // номер боя
				setitem jp_event56 0 // выбор
				setitem jp_event57 0 // до 10.000
				setitem Jp_event63 0 // после 10.000
				close
				return
			break
		endchoose
	// Битва началась, игрок участник, не ставил
	elseif ((fight_status == 2)&(fighter_check == 1)&(bet_check == 0))
		choose menu "Расскажи о бойцовском клубе " "Переместиться на арену "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				dialog "Вы уверены? "
				close
				return
			break
		endchoose
	// Битва началась, игрок не участник, ставил на прошлые
	elseif ((fight_status == 2)&(fighter_check == 0)&(bet_check == 2))
		choose menu "Расскажи о бойцовском клубе " "Кто сейчас сражается? " "Проверить ставку "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				dialog "Вы уверены? "
				close
				return
			break
			case 3
				dialog "Уже начался новый бой "
				setitem jp_event55 0 // номер боя
				setitem jp_event56 0 // выбор
				setitem jp_event57 0 // до 10.000
				setitem Jp_event63 0 // после 10.000
				close
				return
			break
		endchoose
	// Битва началась, игрок не участник, ставил на эту
	elseif ((fight_status == 2)&(fighter_check == 0)&(bet_check == 1))
		choose menu "Расскажи о бойцовском клубе " "Кто сейчас сражается? " "Проверить ставку "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2
				dialog "Вы уверены? "
				close
				return
			break
			case 3
				// снова проверка, чтобы избежать абуза диалогов
				var fight_status = GetGlobalVar "fight_status" 
				var fight_number = GetGlobalVar "fight_number"
				if ((fight_status != 2)|(v[jp_event55] != fight_number))
					dialog "Ваша ставка устарела "
					close
					return
				endif
				
				var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
				var bets_on_part2 = GetGlobalVar "bets_on_part2"
				var bets_on_part3 = GetGlobalVar "bets_on_part3"
				var bets_on_part4 = GetGlobalVar "bets_on_part4"
				var bets_on_part5 = GetGlobalVar "bets_on_part5"
				var bets_on_part6 = GetGlobalVar "bets_on_part6"
				var bets_on_part7 = GetGlobalVar "bets_on_part7"
				var bets_on_part8 = GetGlobalVar "bets_on_part8"
				
				var all_bets = bets_on_part1 // подсчёт всех ставок
				var all_bets = all_bets + bets_on_part2
				var all_bets = all_bets + bets_on_part3
				var all_bets = all_bets + bets_on_part4
				var all_bets = all_bets + bets_on_part5
				var all_bets = all_bets + bets_on_part6
				var all_bets = all_bets + bets_on_part7
				var all_bets = all_bets + bets_on_part8	
				
				//var all_bets = 1370680480 // для теста
				//SetGlobalVar "bets_on_part2" 1000000000 // для теста
				
				var bet_choose = v[jp_event56]
				var bet_sum = v[jp_event57]
				var bet10k_sum = v[Jp_event63]
				var bet_sum = bet10k_sum * 10000 + bet_sum
				
				var fight_participant = GetGlobalStr "fight_participant"+bet_choose			
				var bets_on_part = GetGlobalVar "bets_on_part"+bet_choose
				
				var lowed_bets = bets_on_part / 100
				var multiplier = all_bets / lowed_bets // в 100 раз больше
				var reward = bet_sum / 100 * multiplier // чтобы не переваливать через 2ккк
				
				
				if (fight_participant != "0")
					dialog "Банк ставок составляет "
					dialog "" + all_bets + " зени."
					dialog "Вы поставили на " + fight_participant + "."
					dialog "Ваша ставка составила " + bet_sum + "."
					dialog "В случае победы ваш выигрыш "
					dialog "составит " + reward + " зени."
					close
					return
				else
					dialog "К сожалению, ваш боец выбыл."
					close
					return
				endif
			break
		endchoose
	// Битва началась, игрок не участник, не ставил
	elseif ((fight_status == 2)&(fighter_check == 0)&(bet_check == 0))
		choose menu "Расскажи о бойцовском клубе " "Узнать текущие ставки "
			case 1
				dialog "Рассказываю о клубе "
				close
				return
			break
			case 2		
				var bets_on_part1 = GetGlobalVar "bets_on_part1" // ставки на участников (цифры меньше 100.000)
				var bets_on_part2 = GetGlobalVar "bets_on_part2"
				var bets_on_part3 = GetGlobalVar "bets_on_part3"
				var bets_on_part4 = GetGlobalVar "bets_on_part4"
				var bets_on_part5 = GetGlobalVar "bets_on_part5"
				var bets_on_part6 = GetGlobalVar "bets_on_part6"
				var bets_on_part7 = GetGlobalVar "bets_on_part7"
				var bets_on_part8 = GetGlobalVar "bets_on_part8"
				
				var all_bets = bets_on_part1 // подсчёт всех ставок
				var all_bets = all_bets + bets_on_part2
				var all_bets = all_bets + bets_on_part3
				var all_bets = all_bets + bets_on_part4
				var all_bets = all_bets + bets_on_part5
				var all_bets = all_bets + bets_on_part6
				var all_bets = all_bets + bets_on_part7
				var all_bets = all_bets + bets_on_part8	
				
				//var all_bets = 1370680480 // для теста
				//SetGlobalVar "bets_on_part2" 1000000000 // для теста
				
				var choice_1 = fight_participant1+" - "+bets_on_part1
				var choice_2 = fight_participant2+" - "+bets_on_part2
				var choice_3 = fight_participant3+" - "+bets_on_part3
				var choice_4 = fight_participant4+" - "+bets_on_part4
				var choice_5 = fight_participant5+" - "+bets_on_part5
				var choice_6 = fight_participant6+" - "+bets_on_part6
				var choice_7 = fight_participant7+" - "+bets_on_part7
				var choice_8 = fight_participant8+" - "+bets_on_part8
				
				dialog "Банк ставок составляет "
				dialog "" + all_bets + " зени."
				dialog "Ставки на бойцов:"
				dialog ""+choice_1+" зени."
				dialog ""+choice_2+" зени."
				dialog ""+choice_3+" зени."
				dialog ""+choice_4+" зени."
				dialog ""+choice_5+" зени."
				dialog ""+choice_6+" зени."
				dialog ""+choice_7+" зени."
				dialog ""+choice_8+" зени."
				close
				return
			break
		endchoose
	endif
return

OnCommand: "begin_bets"
	var fight_number = GetGlobalVar "fight_number"
	var fight_number = fight_number + 1
	SetGlobalVar "fight_number" fight_number
	SetGlobalVar "fight_status" 1
	
	InitTimer
	broadcastserver "FF3100" FW_NORMAL 10 0 0 "Битва бойцовского клуба начнётся через 10 минут!"
return

OnCommand: "begin_battle"
	SetGlobalVar "fight_status" 2
	stoptimer
	InitTimer
return

OnTimer: 1000
	var fight_status = GetGlobalVar "fight_status"
	if (fight_status == 1)
		broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Самое время делать ставки на победителя!"
	elseif (fight_status == 2)
		broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Прошу участников битвы подойти ко мне."
	endif
return

OnTimer: 60000
	var fight_status = GetGlobalVar "fight_status"
	if (fight_status == 2)
		broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Если боец не появится в комнате ожидания, ему будет засчитано техническое поражение."
	endif
return

OnTimer: 300000
	var fight_status = GetGlobalVar "fight_status"
	if (fight_status == 1)
		broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Битва бойцовского клуба начнётся через 5 минут!"
	endif
return

OnTimer: 540000
	var fight_status = GetGlobalVar "fight_status"
	if (fight_status == 1)
		broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Битва бойцовского клуба начнётся через 1 минуту!"
	endif
return

OnTimer: 541000
	var fight_status = GetGlobalVar "fight_status"
	if (fight_status == 1)
		broadcastinmap2 "FF3100" FW_NORMAL 12 0 0 "Последний шанс сделать ставку на победителя!"
	endif
return

OnTimer: 600000
	var fight_status = GetGlobalVar "fight_status"
	if (fight_status == 1)
		cmdothernpc "Агент бойцовского клуба#fight_club" "begin_battle"
		broadcastserver "FF3100" FW_NORMAL 10 0 0 "Битва бойцовского клуба началась!"
	endif
return

