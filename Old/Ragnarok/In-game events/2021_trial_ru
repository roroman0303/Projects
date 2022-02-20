npc "prontera" "Посланник Локи#trial_info" 4_M_CHAOS 125 125 5 0 0
OnTouch2:
	Talk2me "Посланник Локи#trial" "Осмелитесь ли вы бросить вызов богу Локи?"
return
OnClick:
	if (v[Chinese_Scroll] == 0)
		dialog "[Посланник Локи]"
		dialog "Настолько ли вы сильны, "
		dialog "проворны и хитры, "
		dialog "как вы думаете? "
		dialog "Осмелитесь ли вы "
		dialog "бросить вызов самому "
		dialog "богу Локи?"
		wait
		choose menu "Взять странный свиток " "Уйти "
		case 1
			dialog "[Посланник Локи]"
			dialog "От великого Локи "
			dialog "мне досталась способность "
			dialog "создавать свои иллюзии..."
			wait
			dialog "[Посланник Локи]"
			dialog "Возьмите этот свиток, "
			dialog "с его помощью вы сможете "
			dialog "создать иллюзию."
			RentItem Chinese_Scroll 43200 0 0 0 0 0
			wait
			dialog "[Посланник Локи]"
			dialog "...Ну и что вы стоите? "
			dialog "Свиток вам зачем?... "
			close
			return
		break
		case 2
		break
		endchoose
		
	else
		dialog "[Посланник Локи]"
		dialog "У вас уже есть свиток "
		dialog "вызова иллюзии. "
		dialog "Я не собираюсь объяснять "
		dialog "несколько раз одно и то же. "
		close
		return
	endif
return

npc "sec_in02" "Посланник Локи#trial" 4_M_CHAOS 143 182 4 0 0
OnTouch2:
	Talk2me "Посланник Локи#trial" "Осмелитесь ли вы бросить вызов богу Локи?"
return

OnClick:

	var time_check = checkquest_playtime 17600 
	var quest_check1 = isbegin_quest 17601 
	var quest_check2 = isbegin_quest 17602
	var quest_check3 = isbegin_quest 17603
	var quest_check4 = isbegin_quest 17604
	var quest_check5 = isbegin_quest 17605
	var quest_check6 = isbegin_quest 17606 
	var quest_check7 = isbegin_quest 17607
	var quest_check8 = isbegin_quest 17608
	var quest_check9 = isbegin_quest 17609
	var quest_check10 = isbegin_quest 17610
	var quest_check11 = isbegin_quest 17611 
	var quest_check12 = isbegin_quest 17612
	var quest_check13 = isbegin_quest 17613
	var quest_check14 = isbegin_quest 17614
	var quest_check15 = isbegin_quest 17615
	
	if (time_check == 1) 
		if (quest_check1 == 1)
			var reward = 5
			var quest = 17601
		elseif (quest_check2 == 1)
			var reward = 10
			var quest = 17602
		elseif (quest_check3 == 1)
			var reward = 20
			var quest = 17603
		elseif (quest_check4 == 1)
			var reward = 40
			var quest = 17604
		elseif (quest_check5 == 1)
			var reward = 80
			var quest = 17605
		elseif (quest_check6 == 1)
			var reward = 5
			var quest = 17606
		elseif (quest_check7 == 1)
			var reward = 10
			var quest = 17607
		elseif (quest_check8 == 1)
			var reward = 20
			var quest = 17608
		elseif (quest_check9 == 1)
			var reward = 40
			var quest = 17609
		elseif (quest_check10 == 1)
			var reward = 80
			var quest = 17610
		elseif (quest_check11 == 1)
			var reward = 5
			var quest = 17611
		elseif (quest_check12 == 1)
			var reward = 10
			var quest = 17612
		elseif (quest_check13 == 1)
			var reward = 20
			var quest = 17613
		elseif (quest_check14 == 1)
			var reward = 40
			var quest = 17614
		elseif (quest_check15 == 1)
			var reward = 80
			var quest = 17615
		else
			dialog "Error 1"
			close
			return
		endif
		
		var hunt_check = checkquest_hunting quest
		if (hunt_check < 2)
			dialog "[Посланник Локи]"
			dialog "Ваше испытание ещё не закончено! Время еще идёт, поторопитесь!"
			close
			return
		endif
		
		dialog "[Посланник Локи]"
		dialog "Поздравляю, вы успешно прошли этап испытания!"
		completequest quest
		erasequest 17600
		var old_reward = v[Jp_event66]
		var new_reward = old_reward + reward
		setitem Jp_event66 new_reward
		wait
		if ((quest == 17605)|(quest == 17610)|(quest == 17615))
			var wt_inven = GetInventoryRemainCount 1301 3
			if ((wt_inven == 2) | (wt_inven == 3))
				dialog "[Посланник Локи]"
				dialog "Ваш инвентарь заполнен. Освободите его и возвращайтесь."
				close
				return
			else
			endif
			dialog "[Посланник Локи]"
			dialog "На этом ваши испытания закончены."
			dialog "За упорство и хитрость,"
			dialog "за незаурядные способности и "
			dialog "преданность Локи вам "
			dialog "полагается высочайшая награда."
			getitem Lucky_Cookie01 v[Jp_event66]
			setitem Jp_event66 0
			recall_completequest 17605
			recall_completequest 17610
			recall_completequest 17615
			erasequest 17605
			erasequest 17610
			erasequest 17615
			close
			return	
		else
			var next_reward = new_reward + (reward * 2)
			dialog "[Посланник Локи]"
			dialog "Хотите ли вы продолжить испытание?"
			dialog "Текущая награда: "+new_reward+""
			dialog "Возможная награда: "+next_reward+""
			wait
			choose menu "Да " "Забрать награду "
				case 1
					dialog "[Посланник Локи]"
					dialog "Вперёд! Время пошло."
					recall_completequest quest
					erasequest quest
					setquest 17600
					setquest quest+1
					close
					return
				break
				case 2
					var wt_inven = GetInventoryRemainCount 1301 3
					if ((wt_inven == 2) | (wt_inven == 3))
						dialog "[Посланник Локи]"
						dialog "Ваш инвентарь заполнен. Освободите его и возвращайтесь."
						close
						return
					else
					endif
					dialog "[Посланник Локи]"
					dialog "Локи достойно оценил "
					dialog "ваши старания. "
					dialog "Однако я убеждён, что "
					dialog "вы способны на большее..."
					getitem Lucky_Cookie01 v[Jp_event66]
					setitem Jp_event66 0
					recall_completequest quest
					erasequest quest
					close
					return
				break
			endchoose
		endif
	elseif (time_check == 2) 
		var wt_inven = GetInventoryRemainCount 1301 3
		if ((wt_inven == 2) | (wt_inven == 3))
			dialog "[Посланник Локи]"
			dialog "Ваш инвентарь заполнен. Освободите его и возвращайтесь."
			close
			return
		else
		endif
		if (v[Jp_event66] > 0)
			dialog "[Посланник Локи]"
			dialog "...Вы провалили испытание."
			dialog "На выполнение вам давалось "
			dialog "целых 15 минут, но вы "
			dialog "не справились."
			wait
			dialog "[Посланник Локи]"
			dialog "Локи разочарован вами."
			dialog "От себя я могу дать вам "
			dialog "утешительный приз, но "
			dialog "от него наград не ждите."
			getitem Lucky_Cookie01 (v[Jp_event66]/3)
			setitem Jp_event66 0
			recall_completequest 17600
			recall_completequest 17601
			recall_completequest 17602
			recall_completequest 17603
			recall_completequest 17604
			recall_completequest 17605
			recall_completequest 17606
			recall_completequest 17607
			recall_completequest 17608
			recall_completequest 17609
			recall_completequest 17610
			recall_completequest 17611
			recall_completequest 17612
			recall_completequest 17613
			recall_completequest 17614
			recall_completequest 17615
			erasequest 17600
			erasequest 17601
			erasequest 17602
			erasequest 17603
			erasequest 17604
			erasequest 17605
			erasequest 17606
			erasequest 17607
			erasequest 17608
			erasequest 17609
			erasequest 17610
			erasequest 17611
			erasequest 17612
			erasequest 17613
			erasequest 17614
			erasequest 17615
			close
			return
		else
			dialog "[Посланник Локи]"
			dialog "...Вы провалили испытание."
			dialog "На выполнение вам давалось "
			dialog "целых 15 минут, но вы "
			dialog "не справились."
			dialog "Локи разочарован вами."
			recall_completequest 17600
			recall_completequest 17601
			recall_completequest 17602
			recall_completequest 17603
			recall_completequest 17604
			recall_completequest 17605
			recall_completequest 17606
			recall_completequest 17607
			recall_completequest 17608
			recall_completequest 17609
			recall_completequest 17610
			recall_completequest 17611
			recall_completequest 17612
			recall_completequest 17613
			recall_completequest 17614
			recall_completequest 17615
			erasequest 17600
			erasequest 17601
			erasequest 17602
			erasequest 17603
			erasequest 17604
			erasequest 17605
			erasequest 17606
			erasequest 17607
			erasequest 17608
			erasequest 17609
			erasequest 17610
			erasequest 17611
			erasequest 17612
			erasequest 17613
			erasequest 17614
			erasequest 17615
			close
			return
		endif
	else
		var quest = 0
		if (quest_check1 == 2)
			var reward = 5
			var quest = 17601
		elseif (quest_check2 == 2)
			var reward = 10
			var quest = 17602
		elseif (quest_check3 == 2)
			var reward = 20
			var quest = 17603
		elseif (quest_check4 == 2)
			var reward = 40
			var quest = 17604
		elseif (quest_check5 == 2)
			var reward = 80
			var quest = 17605
		elseif (quest_check6 == 2)
			var reward = 5
			var quest = 17606
		elseif (quest_check7 == 2)
			var reward = 10
			var quest = 17607
		elseif (quest_check8 == 2)
			var reward = 20
			var quest = 17608
		elseif (quest_check9 == 2)
			var reward = 40
			var quest = 17609
		elseif (quest_check10 == 2)
			var reward = 80
			var quest = 17610
		elseif (quest_check11 == 2)
			var reward = 5
			var quest = 17611
		elseif (quest_check12 == 2)
			var reward = 10
			var quest = 17612
		elseif (quest_check13 == 2)
			var reward = 20
			var quest = 17613
		elseif (quest_check14 == 2)
			var reward = 40
			var quest = 17614
		elseif (quest_check15 == 2)
			var reward = 80
			var quest = 17615
		endif
		
		if (quest > 0)
			if ((quest == 17605)|(quest == 17610)|(quest == 17615))
				var wt_inven = GetInventoryRemainCount 1301 3
				if ((wt_inven == 2) | (wt_inven == 3))
					dialog "[Посланник Локи]"
					dialog "Ваш инвентарь заполнен. Освободите его и возвращайтесь."
					close
					return
				else
				endif
				dialog "[Посланник Локи]"
				dialog "На этом ваши испытания закончены."
				dialog "За упорство и хитрость,"
				dialog "за незаурядные способности и "
				dialog "преданность Локи вам "
				dialog "полагается высочайшая награда."
				getitem Lucky_Cookie01 v[Jp_event66]
				setitem Jp_event66 0
				recall_completequest 17605
				recall_completequest 17610
				recall_completequest 17615
				erasequest 17605
				erasequest 17610
				erasequest 17615
				close
				return	
			else
				var new_reward = v[Jp_event66]
				var next_reward = new_reward + reward
				dialog "[Посланник Локи]"
				dialog "Хотите ли вы продолжить испытание?"
				dialog "Текущая награда: "+new_reward+""
				dialog "Возможная награда: "+next_reward+""
				wait
				choose menu "Да " "Забрать награду "
					case 1
						dialog "[Посланник Локи]"
						dialog "Вперёд! Время пошло."
						recall_completequest quest
						erasequest quest
						setquest 17600
						setquest quest+1
						close
						return
					break
					case 2
						var wt_inven = GetInventoryRemainCount 1301 3
						if ((wt_inven == 2) | (wt_inven == 3))
							dialog "[Посланник Локи]"
							dialog "Ваш инвентарь заполнен. Освободите его и возвращайтесь."
							close
							return
						else
						endif
						dialog "[Посланник Локи]"
						dialog "Локи достойно оценил "
						dialog "ваши старания. "
						dialog "Однако я убеждён, что "
						dialog "вы способны на большее..."
						getitem Lucky_Cookie01 v[Jp_event66]
						setitem Jp_event66 0
						recall_completequest quest
						erasequest quest
						close
						return
					break
				endchoose
			endif
		else
			dialog "[Посланник Локи]"
			dialog "... Где это я?"
			dialog "А! Я вас помню."
			dialog "Желаете пройти испытание?"
			wait
			choose menu "Узнать об испытаниях " "Начать испытание " "Уйти "
				case 1
					dialog "[Посланник Локи]"
					dialog "Я, как истинный последователь "
					dialog "Локи, могу представить вас "
					dialog "ему с помощью нескольких "
					dialog "испытаний."
					wait
					dialog "[Посланник Локи]"
					dialog "Вы - должны доказать, "
					dialog "что достойны его "
					dialog "покровительства. "
					wait
					dialog "[Посланник Локи]"
					dialog "Вы можете выбрать для этого "
					dialog "три разных испытания: "
					dialog "на ловкость, "
					dialog "на хитрость, "
					dialog "или на силу. "
					wait
					dialog "[Посланник Локи]"
					dialog "Сначала они могут показаться "
					dialog "вам легкими, но с каждым "
					dialog "новым этапом они будут "
					dialog "становиться сложнее."
					wait
					dialog "[Посланник Локи]"
					dialog "Так же с каждым разом "
					dialog "внимание и награда Локи "
					dialog "будет расти. Но..."
					wait
					dialog "[Посланник Локи]"
					dialog "Если вы провалите испытание, "
					dialog "можете и не рассчитывать "
					dialog "на благоволение Локи..."
					dialog "Он не терпит неудачников."
					close
					return
				break
				case 2
					dialog "[Посланник Локи]"
					dialog "Какое испытание вы хотите начать?"
					wait
					choose menu "Отмена " "Хитрость " "Ловкость " "Сила "
						case 1
							dialog "[Посланник Локи]"
							dialog "Что же... Не думал, что вы сдадитесь так быстро."
							close
							return
						break
						case 2
							dialog "[Посланник Локи]"
							dialog "Вы уверены, что хотите начать испытание на хитрость? У вас будет 15 минут на его выполнение."
							wait
							choose menu "Да " "Отмена "
								case 1
									dialog "[Посланник Локи]"
									dialog "Вам необходимо поймать "
									dialog "быстрых дьяволёнков."
									dialog "Их можно встретить около "
									dialog "Пронтеры, прямо на полях."
									wait
									dialog "[Посланник Локи]"
									dialog "Вперёд! Время пошло."
									setquest 17600
									setquest 17601
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
							dialog "[Посланник Локи]"
							dialog "Вы уверены, что хотите начать испытание на ловкость? У вас будет 15 минут на его выполнение."
							wait
							choose menu "Да " "Отмена "
								case 1
									dialog "[Посланник Локи]"
									dialog "Вам необходимо поймать "
									dialog "исчезающих дьяволёнков."
									dialog "Их можно встретить около "
									dialog "Пронтеры, прямо на полях."
									wait
									dialog "[Посланник Локи]"
									dialog "Вперёд! Время пошло."
									setquest 17600
									setquest 17606
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
							dialog "[Посланник Локи]"
							dialog "Вы уверены, что хотите начать испытание на ловкость? У вас будет 15 минут на его выполнение."
							wait
							choose menu "Да " "Отмена "
								case 1
									dialog "[Посланник Локи]"
									dialog "Вам необходимо поймать "
									dialog "крупных дьяволёнков."
									dialog "Их можно встретить около "
									dialog "Пронтеры, прямо на полях."
									wait
									dialog "[Посланник Локи]"
									dialog "Вперёд! Время пошло."
									setquest 17600
									setquest 17611
									close
									return
								break
								case 2
									close
									return
								break
							endchoose
						break
					endchoose
				break
				case 3
				break
			endchoose
		endif
	endif
return