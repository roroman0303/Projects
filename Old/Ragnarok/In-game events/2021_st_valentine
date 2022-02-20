npc "prontera" "Ромео " 4_M_ALCHE_A 125 125 4 0 0
OnClick:
	if v[jp_event38] == 0
		dialog "[Ромео]"
		dialog "Привет, доброго ут..."
		wait
		dialog "[Ромео]"
		dialog "А? Разве уже вечер?! "
		wait
		dialog "[Ромео]"
		dialog "Как же быстро летит время полное тоски! "
		wait
		dialog "[Ромео]"
		dialog "Все время я томлюсь, тоскую по любви! "
		wait
		dialog "[Ромео]"
		dialog "Эх... Наверняка со стороны я выгляжу нелепо. "
		dialog "Любовь жестока, не так ли?"
		wait
		choose menu "Что случилось? " "Прости, у меня нет времени на тебя. "
			case 1
				dialog "[Ромео]"
				dialog "Ах, что есть любовь?"
				dialog "Слезы? Пламя? Яд?"
				dialog "Или наше спасение?"
				wait
				dialog "[Ромео]"
				dialog "Прощай, мой новый друг..."
				dialog "Я рад что встретил тебя."
				wait
				dialog "[Ромео]"
				dialog "Пойду тосковать в другое место."
				wait
				choose menu "Постой! "
					case 1
						dialog "[Ромео]"
						dialog "Что? Я иду тосковать!"	
						wait
						choose menu "Кого ты так сильно любишь? "
							case 1
								dialog "[Ромео]"
								dialog "Ах... Она неотразимой красоты!"
								dialog "Улыбка её светла и чиста. "
								dialog "А  голосок... Такой звонкий и тонкий..."
								wait
								dialog "[Ромео]"
								dialog "Её зовут Джульетта. Она из знатной семьи в Комодо. "
								dialog "Я встретил её однажды на побережье. "
								dialog "Это любовь с первого взгляда!"			
								wait
								dialog "[Ромео]"
								dialog "Мы весело проводили время вместе. "
								dialog "Однако... Мои родственники против этих отношений!"
								dialog "Ах, как бы я хотел увидеть её еще раз..."										
								wait	
								dialog "[Ромео]"
								dialog "А ведь так я никогда не смогу "
								dialog "взять Джульетту в жены!"										
								wait	
								dialog "[Ромео]"
								dialog "Наши семьи уже с давних времен враждуют. Никто уже и не помнит почему."
								dialog "Однако когда-то мой отец дружил с отцом Джульетты. "
								dialog "Возможно, их дружба могла бы прекратить давнюю вражду. Но вот..."	
								wait	
								dialog "[Ромео]"
								dialog "Все мои попытки примирить их провалились! Я безнадежен, это конец!"
								dialog "..."										
								wait			
								dialog "[Ромео]"
								dialog "Ох, опять я горячусь. Понимаешь, дружок. "
								dialog "Мне советуют обратить внимание на других."
								dialog "Только от этого еще тоскливее."		
								wait			
								dialog "[Ромео]"
								dialog "Наблюдение за другими, только подчеркивает её совершенство... "
								dialog "И я снова понимаю, лучше Джульетты  "
								dialog "во всем Рун-Мидгарде никого!"	
								wait
								dialog "[Ромео]"
								dialog "Эх, возможно, ты мне сможешь помочь."
								dialog "Найди Джульетту в Комодо. Узнай, как у нее дела."
								wait
								dialog "[Ромео]"
								dialog "Скажи, что я скучаю и жду встречи."
								dialog "Хотя не знаю, состоится ли она."
								wait
								dialog "[Ромео]"
								dialog "Ах, Джульетта! Как мне жить без тебя?"	
								wait
								setquest 29150
								setitem jp_event38 1
								close
								return
							break
						endchoose
					break
				endchoose
			case 2
				dialog "[Ромео]"
				dialog "О как мне быть..."
				close
				return
			break
		endchoose
	elseif v[jp_event38] == 8
		dialog "[Ромео]"
		dialog "Свадьба?!"
		wait
		dialog "[Ромео]"
		dialog "Какая свадьба?!"
		dialog "Мы не должны это допустить!"
		wait
		dialog "[Ромео]"
		dialog "Что же мне делать?"
		dialog "Так я потеряю Джульетту навсегда."
		wait
		dialog "[Ромео]"
		dialog "Я даже не успею попрощаться! Как ужасен этот мир."
		dialog "Пора уже смириться."
		wait
		dialog "[Ромео]"
		dialog "Спасибо тебе, мой друг. Ты мне сильно помог."
		dialog "Надеюсь Джульетта найдет свое счатье."
		dialog "Ну а мне... нужно всего лишь отпустить эту любовь."
		wait
		dialog "[Ромео]"
		dialog "Что сказал мой отец? Он так и не разрешил встретиться нам?"
		wait
		dialog "[Ромео]"
		dialog "Пропавшая реликвия? Все это время причиной нашей вражды была какая-то безделушка?!"
		dialog "Хм, так отец Джульетты предлагает разыграть эту реликвию?"
		wait
		dialog "[Ромео]"
		dialog "Я готов поставить все! Если не увижусь с возлюбленной,"
		dialog "то хоть остановлю разногласия."
		dialog "Это меньшее, что я могу сделать."
		wait
		dialog "[Ромео]"
		dialog "Ты должен заключить с её отцом пари."
		dialog "И победить его!"
		dialog "Помни - ты моя последняя надежда..."
		changequest 29157 29158
		setitem jp_event38 9
		close
		return
	elseif v[jp_event38] == 11
		dialog "[Ромео]"
		dialog "У тебя все получилось!"
		dialog "Это просто чудо!"
		dialog "Прошу, расскажи Джульетте!"
		//getitem Feather_Fedora_TW 1
		changequest 29160 29161
		setitem jp_event38 12
		close
		return
	endif
return

npc "cmd_in02" "Джульетта " 4_F_PINKWOMAN 180 107 4 0 0
OnClick:
	if v[jp_event38] == 1
		dialog "[Джульетта]"
		dialog "Ах, ты от Ромео? Здравствуй. "
		dialog "Как он? Боже мой, как я скучаю! "
		wait
		dialog "[Джульетта]"
		dialog "Так горестно тянутся дни..."
		dialog "Я каждый день думаю о нем."
		wait
		dialog "[Джульетта]"
		dialog "Но встретиться нам точно не суждено."
		dialog "Пока находятся в вражде наши отцы."
		dialog "А значит -- враги и мы."
		wait
		dialog "[Джульетта]"
		dialog "Отец Ромео серьезный человек. "
		dialog "Он не пропустит ни одного гонца или письма. "
		dialog "И все попытки встретиться тоже пресечет. "
		wait
		dialog "[Джульетта]"
		dialog "Для него наша вражда, как долг."
		dialog "Но почему же мы враждуем? Никто не скажет..."
		wait
		choose menu "Ромео скучает по тебе. " "Я ничем не могу помочь. "
			case 1
				dialog "[Джульетта]"
				dialog "Ах! Бедный мой Ромео... "
				dialog "Как долго нам еще страдать?"
				wait
				dialog "[Джульетта]"
				dialog "Прошу тебя, ты должен мне помочь!"
				wait
				dialog "[Джульетта]"
				dialog "Я знаю -- отец Ромео добрый человек!"
				dialog "Он не позволит своему сыну впасть в уныние."
				dialog "Ради нашего счастья я соглашусь сделать все, что он попросит."
				wait
				dialog "[Джульетта]"
				dialog "Нам нужно лишь его благословение."
				dialog "Пока не стало слишком поздно..."
				dialog "Отец Ромео живет в Пронтере, это все что я могу сказать."
				wait
				changequest 29150 29151
				setitem jp_event38 2
				close
				return
			break
			case 2
				dialog "[Джульетта]"
				dialog "Прошу, не покидай меня тут!"
				close
				return
			break
		endchoose
	elseif v[jp_event38] == 12
		dialog "[Джульетта]"
		dialog "Здравствуй, наш спаситель! "
		dialog "Ты и представить не можешь, как дорога нам твоя помощь!"
		wait
		dialog "[Джульетта]"
		dialog "Ангелы и купидоны носят с собою маленькие карточные альбомы."
		dialog "Из этих карточек собрать ты сможешь слово love."
		dialog "Собери его и подари моему дедушке и он сделает тебе интересные предложения!"
		wait
		dialog "[Джульетта]"
		dialog "И также ты можешь в любое время "
		dialog "сыграть с моим братом, отцом и сестрой!"
		dialog "Главное, не забывай про валентинки!"
		wait
		dialog "[Джульетта]"
		dialog "Кстати, если ты сможешь победить у моей семьи 100 раз "
		dialog "то получишь интересный подарок у моего дедушки!"
		dialog "Желаю удачи!"
		completequest 29161
		setitem jp_event38 13
		close
		return
	endif
return

npc "prontera" "Отец Ромео " 1_M_JOBTESTER 271 217  4 0 0
OnClick:
	var name = PcName
	if v[jp_event38] == 2
		dialog "[Отец Ромео]"
		dialog "Здравствуйте! Как вас зовут?"
		wait
		choose menu name "Не ваше дело."
			case 1
				dialog "[Отец Ромео]"
				dialog name + "? Я правильно понял?"
				dialog "Рад знакомству."
				wait
				dialog "[Отец Ромео]"
				dialog "Ну что же, по какому вы вопросу?"
				wait
				choose menu "Про Джульетту и Ромео "
					case 1
						dialog "[Отец Ромео]"
						dialog "Хм, это Ромео тебе поручил обратиться ко мне?"
						dialog "Ха-ха! Похоже, скоро с неба на меня будут сыпаться просьбы о благословении."
						wait
						dialog "[Отец Ромео]"
						dialog "Уже весь город знает о их любви!"
						dialog "Каждый житель Пронтеры уже считает своим долгом напомнить мне. "
						dialog "О страдающем Ромео и его подруге. "
						wait
						dialog "[Отец Ромео]"
						dialog name + " ты должен понимать. Разрешить своему сыну встречать врага "
						dialog "опасно для всей семьи! "
						wait
						dialog "[Отец Ромео]"
						dialog "Та вражда -- не просто моя прихоть."
						dialog "Ей уже 200 лет, а то и больше."
						dialog "Это часть нашей истории."
						wait
						dialog "[Отец Ромео]"
						dialog "Многие говорят, что и не помнят почему мы стали врагами."
						dialog "Однако мало кто вспомнит о прекрасном гербе моей семьи."
						dialog "Настоящей реликвии!"
						wait
						dialog "[Отец Ромео]"
						dialog "Давным давно её украли! И кто же это был? "
						dialog "Семья Джульетты!"
						wait
						dialog "[Отец Ромео]"
						dialog "Вот если реликвию вы мне вернете."
						dialog "Тогда быть может я подумаю..."
						wait
						choose menu "Я постараюсь. " "Я не смогу вам помочь. "
							case 1
								dialog "[Отец Ромео]"
								dialog "Поговори с отцом Джульетты."
								dialog "Напомни про реликвию."
								dialog "А пока -- прощай."
								changequest 29151 29152
								setitem jp_event38 3
								close
								return
							break
							case 2
								dialog "[Отец Ромео]"
								dialog "Хорошо, прощайте."
								close
								return
							break
						endchoose
					break
				endchoose
			break
			case 2
				dialog "[Отец Ромео]"
				dialog "Как грубо! Уходите. "
				close
				return
			break
		endchoose
	elseif v[jp_event38] == 10
		dialog "[Отец Ромео]"
		dialog "О, здравствуй " +name+" !"
		dialog "Рад увидеть вас опять!"
		dialog "Отец Джульетты вернул реликвию семье. "
		wait
		dialog "[Отец Ромео]"
		dialog "Это первый шаг к прекращению вражды."
		dialog "А это значит, что ты выполнил, что обещал."
		wait
		dialog "[Отец Ромео]"
		dialog "Я... согласен дать благословение."
		dialog "Сообщи Ромео о моем решении."
		setitem jp_event38 11
		changequest 29159 29160
		close
		return
	endif
return

npc "cmd_in02" "Отец Джульетты " 4_M_MAYOR 172 93 4 0 0
OnClick:
	var coef_thimble = 3
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		dialog "[Крупье] "
		dialog "Регулируем коэффициенты "
		wait
		while(1)
			dlgwrite 1 1000
			if error
				dialog "[Крупье] "
				dialog "Нельзя "
				wait
			else
				var coef_thimble = input
				exitwhile
			endif
		endwhile
		close
		return
	else
		var name = PcName
		if v[jp_event38] == 3
			dialog "[Отец Джульетты]"
			dialog "Добро пожаловать!"
			wait
			choose menu "Зравствуйте! "
				case 1
					dialog "["+name+"]"
					dialog "Меня зовут..."
					wait
				break
			endchoose
			dialog "[Отец Джульетты]"
			dialog "Ах, так ты разговаривал с моей дочерью!"
			dialog "Очередной жених? Или ты от Ромео? "
			dialog "Не трать мое время впустую."
			dialog "Свою дочь я никому не отдам! "
			changequest 29152 29153
			setitem jp_event38 4
			close
			return
		elseif v[jp_event38] == 7
			dialog "[Отец Джульетты]"
			dialog "И снова ты!"
			wait
			dialog "[Отец Джульетты]"
			dialog "Ха, тебя вновь прислал Ромео?"
			dialog "Но счастью его быть не суждено!"
			wait
			dialog "[Отец Джульетты]"
			dialog "Я уже выбрал хорошего черловека для своей дочери."
			dialog "И вскоре они сыграют свадьбу!"
			wait
			dialog "[Отец Джульетты]"
			dialog "Хочешь получить приглашение?"
			dialog "Ожидается большой праздник!"
			changequest 29156 29157
			setitem jp_event38 8
			close
			return
		elseif v[jp_event38] == 9
			dialog "[Отец Джульетты]"
			dialog "А ты настырный!"
			wait
			dialog "[Отец Джульетты]"
			dialog "Ты предлагаешь мне пари?"
			dialog "Хм...Живем игрой..."
			wait
			dialog "[Отец Джульетты]"
			dialog "Мне это по душе!"
			dialog "Попробуй обыграть меня "
			dialog "Коль сможешь, я смогу тебе помочь!"
			wait
			dialog "[Отец Джульетты]"
			dialog "Но кто сказал, что это будет просто?"
			dialog "Кручу, верчу, угадывай где шарик!"
			dialog "Но сразу предупрежу, что твоя ставка 10 валентинок, не больше, не меньше!"
			wait
			choose menu "Играем!" "Нет, я передумал "
				case 1
					var bet = 10
					var qty = bet * coef_thimble
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[Отец Джульетты] "
						dialog "К сожалению, у тебя недостаточно места для участия в игре! Освободи и возвращайся "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[Отец Джульетты] "
						dialog "У вас недостаточно валентинок! Как мы будем играть? "
						close
						return
					else
						dialog "[Отец Джульетты] "
						dialog "Ставки сделаны "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[Отец Джульетты] "
					dialog "Кручу-верчу, запутать хочу. "
					wait
					var thimblerig = rand 1 3 //1 - лево, 2 - центр, 3 - право
					dialog "[Отец Джульетты] "
					dialog "В каком наперстке шарик? "
					wait
					choose menu "В левом! " "В центре! " "В правом! " "Я не уследил. Пока "
						case 1
							var picked_marble = 1
						break
						case 2
							var picked_marble = 2
						break
						case 3
							var picked_marble = 3
						break
						case 4 
							dialog "[Отец Джульетты] "
							dialog "М, ты проиграл! Как жаль ха-ха!"
							close
							return
						break
					endchoose
					if thimblerig == picked_marble
						dialog "[Отец Джульетты] "
						dialog "Что же, ты победил. Я лично верну реликвию отцу Ромео."
						dialog "Однако не думай, что дам я им спокойно жить!"
						var wins = v[jp_event39]
						wins = wins + 1
						setitem jp_event39 wins
						setitem jp_event38 10
						getitem Choco_Drink_Recipe qty
						changequest 29158 29159
						wait
						close
						return
					else
						dialog "[Отец Джульетты] "
						dialog "Не повезло. Шарика тут нет. "
						dialog "Но ты можешь вернуться, когда будешь готов проиграть снова! Ха!"
						close
						return
					endif
				break
				case 2
					dialog "[Отец Джульетты]"
					dialog "Я знал, что ты не справишься!"
					dialog "Прочь отсюда!"
					close
					return
				break
			endchoose		
		elseif v[jp_event38] > 12
			dialog "[Отец Джульетты]"
			dialog "Так ты вернулся?"
			dialog "Давай же сыграем!"
			wait
			choose menu "Играем!" "Нет, я передумал "
				case 1
					var bet = 10
					var qty = bet * coef_thimble
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[Отец Джульетты] "
						dialog "К сожалению, у тебя недостаточно места для участия в игре! Освободи и возвращайся "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[Отец Джульетты] "
						dialog "У вас недостаточно валентинок! Как мы будем играть? "
						close
						return
					else
						dialog "[Отец Джульетты] "
						dialog "Ставки сделаны "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[Отец Джульетты] "
					dialog "Кручу-верчу, запутать хочу. "
					wait
					var thimblerig = rand 1 3 //1 - лево, 2 - центр, 3 - право
					dialog "[Отец Джульетты] "
					dialog "В каком наперстке шарик? "
					wait
					choose menu "В левом! " "В центре! " "В правом! " "Я не уследил. Пока "
						case 1
							var picked_marble = 1
						break
						case 2
							var picked_marble = 2
						break
						case 3
							var picked_marble = 3
						break
						case 4 
							dialog "[Отец Джульетты] "
							dialog "М, ты проиграл! Как жаль ха-ха!"
							close
							return
						break
					endchoose
					if thimblerig == picked_marble
						dialog "[Отец Джульетты] "
						dialog "А у тебя меткий глаз. Поздравляю! "
						var wins = v[jp_event39]
						if wins < 100
							wins = wins + 1
							setitem jp_event39 wins
						endif
						getitem Choco_Drink_Recipe qty
						if v[jp_event39] == 100
							dialog "Ого! Поздравляю! Ты победил у нас 100 раз. Это достойно вознаграждения. Подойди к Деду Джульетты.."
							close
							return
						endif
						close
						return
					else
						dialog "[Отец Джульетты] "
						dialog "Не повезло. Шарика тут нет. "
						dialog "Но ты можешь вернуться, когда будешь готов проиграть снова! Ха!"
						close
						return
					endif
				break
				case 2
					dialog "[Отец Джульетты]"
					dialog "Что ж, возвращайся, когда захочешь."
					close
					return
				break
			endchoose
		endif
	endif
return

npc "cmd_in02" "Дед Джульетты " 4_M_CHNOLD 182 101 4 0 0
OnClick:
	if v[jp_event39] == 100
		dialog "[Дед Джульетты]"	
		dialog "Ого, вы победили 100 раз во всех играх?"
		dialog "Это большое достижение!"
		dialog "Вы можете забрать свой эксклюзивный подарок!"
		wait
		//var item_check = GetInventoryRemainCount C_Heart_Card_In_Mouth 1
		var item_check = GetInventoryRemainCount C_Heart_Card_In_Mouth 1
		if item_check != 1
			dialog "[Дед Джульетты] "
			dialog "Ох, освободите сперва место для подарочка, затем и возвращайтесь! "
			close
			return
		endif
		dialog "[Дед Джульетты]"
		dialog "Еще раз примите мои поздравления!"
		setitem jp_event39 101
		getitem C_Heart_Card_In_Mouth 1
		close
		return
	endif
	if v[jp_event38] == 4
		dialog "[Дед Джульетты]"
		dialog "О, здравствуйте."
		dialog "До меня уже дошли слухи вашего "
		dialog "неудачного разговора с моим сыном."
		wait
		dialog "[Дед Джульетты]"
		dialog "Впрочем, такое часто происходит, "
		dialog "не принимайте близко к сердцу."
		wait
		dialog "[Дед Джульетты]"
		dialog "Джульетта хорошая девочка. У неё много поклонников. "
		dialog "Они все обращаются к моему сыну, но он очень занятой человек, понимаете..."                                
		wait
		choose menu "Но у меня есть дело! "
			case 1
				dialog "[Дед Джульетты]"
				dialog "Хм и что же это за дело?"
				dialog "Оно действительно такое важное чтобы отнимать чужое время?"
				wait
				dialog "[Дед Джульетты]"
				dialog "Чтобы пообщаться с моим сыном простой вежливости будет недостаточно."
				dialog "Нужно понять чем он живет."
				wait
				dialog "[Дед Джульетты]"
				dialog "Многие поклонники Джульетты проваливают и этот этап."
				dialog "Но вы мне нравитесь, что-то у вас есть такое... М-м-м..."
				wait
				dialog "[Дед Джульетты]"
				dialog "Как вы видите, у нас не самая обычная семья ха-ха."
				dialog "Вы готовы погрузиться в азартный мир Комодо?"
				wait
				choose menu "Да... " "Нет, мне некогда!"
					case 1
						dialog "[Дед Джульетты]"
						dialog "Для начала тебе нужно кое-что подготовить."
						dialog "Это особенный предмет, который ты можешь найти в это время года."
						wait
						dialog "[Дед Джульетты]"
						dialog "Тебе нужно принести 25 валентинок. "
						dialog "Отнять их можно у беспокойных ангелов и купидонов "
						changequest 29153 29154
						setitem jp_event38 5
						close
						return
					break
					case 2
						dialog "[Дед Джульетты]"
						dialog "Прощайте."
						close
						return
					break
				endchoose
			break
		endchoose
	elseif v[jp_event38] == 5
		if v[Choco_Drink_Recipe] > 24
			dialog "[Дед Джульетты]"
			dialog "Неплохо, неплохо. "
			dialog "Теперь мы можем продолжить разговор! "
			wait
			dialog "[Дед Джульетты]"
			dialog "Мы предпочитаем не использовать зени."
			dialog "Эти валентинки наполнены силой чистой любви..."
			dialog "А также они заработаны честным трудом."
			wait
			dialog "[Дед Джульетты]"
			dialog "Эти две вещи делают валентинки особенной валютой."
			dialog "Но какой у нее смысл, если её нельзя приумножить?"
			wait
			dialog "[Дед Джульетты]"
			dialog "Жизнь это фортуна и каждую секунду мы ее испытываем."
			dialog "Возможно, сейчас решается твоя судьба."
			wait
			dialog "[Дед Джульетты]"
			dialog "Полагаясь на фортуну мы приумножаем валентинки в честной игре с судьбой."
			dialog "Ха-ха. Звучит сложно? У нас здесь не простое казино."
			wait
			dialog "[Дед Джульетты]"
			dialog "Уже более 300 лет мы занимаемся игорным бизнесом."
			dialog "Из поколения в поколение наша семья предоставляет жителям Рун-Мидгарда возможность поиграть с судьбой."
			wait
			dialog "[Дед Джульетты]"
			dialog "Победа в этой игре может принести много счастья "
			dialog "Чтобы поговорить с моим сыном тебе нужно доказать то, что ты способен обыграть судьбу."
			wait
			dialog "[Дед Джульетты]"
			dialog "Моя внучка, Розалин -- старшая сестра Джульетты. "
			dialog "Она обожает играть в карты, отгадывать масти и цвета!"
			dialog "У нее явно в этом талант. "
			wait
			dialog "[Дед Джульетты]"
			dialog "А мой внучек, Тибальт -- братец Джульетты. "
			dialog "Любит рыбалку и игру в бинго. Это может показаться старомодным," 
			dialog "но тем не менее Тибальт смог добиться определенных успехов."
			wait
			dialog "[Дед Джульетты]"
			dialog "Мои внуки только начинают учиться нашему ремеслу. "
			dialog "Начни с игр с ними, а там я спрошу их мнение."
			wait
			dialog "[Дед Джульетты]"
			dialog "И только после победы над моими внуками у тебя появится шанс пообщаться с отцом семейства."
			changequest 29154 29155
			setitem jp_event38 6
			setitem jp_event39 0
			close
			return
		else
			dialog "[Дед Джульетты]"
			dialog "Мне кажется, ты не собрал даже 25 валентинок! Разговор окончен! "
			close
			return
		endif
	elseif v[jp_event38] == 13
		dialog "[Дед Джульетты]"
		dialog "Ты смог собрать слово love?" 
		wait
		if ((v[BlueCard_L] > 0) & (v[BlueCard_O] > 0) & (v[Blue_Card_V] > 0) & (v[BlueCard_E] > 0))
			dialog "[Дед Джульетты]"
			dialog "Ого, совсем неплохо!"
			wait
			dialog "[Дед Джульетты]"
			dialog "Знаешь, ты мне нравишься еще больше! С тобой так приятно иметь дело."
			dialog "Особому гостю в этих стенах я могу предложить особые услуги..."
			wait
			dialog "[Дед Джульетты]"
			dialog "Приходи с собранными валентинками ко мне. Помни, не меньше 15 валентинок! "
			dialog "У меня есть особое предложение для тебя."
			dropitem BlueCard_L 1
			dropitem BlueCard_O 1
			dropitem Blue_Card_V 1
			dropitem BlueCard_E 1
			setitem jp_event38 14
			close
			return
		else
			dialog "[Дед Джульетты]"
			dialog "Кажется, ты не собрал еще все карточки." 
			close
			return
		endif
	elseif v[jp_event38] > 13
		var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
		if item_check != 1
			dialog "[Дед Джульетты] "
			dialog "К сожалению, у тебя недостаточно места! Освободи и возвращайся "
			close
			return
		endif
		
		dialog "[Дед Джульетты]"
		dialog "Ха-ха! Ну что, добро пожаловать в мой магазин!"
		dialog "Удивлен? Наше казино предоставляет и такие услуги. "
		dialog "Наша валюта - валентинки. И никаких монет! Правда здорово? "
		wait
		dialog "[Дед Джульетты]"
		dialog "За 15 валентинок я могу предложить тебе Шоколадный шарик. " 
		dialog "За 150 валентинок я могу предложить тебе Трилби с перьями. " 
		dialog "Ух, хочешь что-то? " 
		wait
		choose menu "У вас есть что-то вкусное? " "Вы продаете одежду? " "Уйти "
			case 1
				if v[Choco_Drink_Recipe] > 14 
					dialog "[Дед Джульетты]"
					dialog "Ох, ты обратился прямо по адресу! Только для тебя, особое предложение!"	
					dialog "За 15 валентинок я могу тебе дать 1 Шоколадный шарик "
					wait
					dialog "[Дед Джульетты]"
					dialog "Эта сладость эксклюзивная для этого сезона. Пальчики оближешь!"
					dialog "Сколько ты хочешь? "
					wait
					dlgwrite 1 1500
					var exchange_input = input
					if input == 0
						dialog "Эх, а они ведь вкусные! "
						close
						return
					elseif error
						dialog "Эх, а они ведь вкусные!  "
						close
						return	
					endif
					var exchange_coins = exchange_input * 15
					dialog "За "+exchange_input+" шоколадных шариков нужно "+exchange_coins+" валентинок. Ты не передумал?"
					wait
					choose menu "Подтвердить " "Отмена "
						case 1
							if v[Choco_Drink_Recipe] >= exchange_coins
								var item_check = GetInventoryRemainCount Silvervine_Choco exchange_input
								if (item_check == 1)
									dropitem Choco_Drink_Recipe exchange_coins
									getitem Silvervine_Choco exchange_input
									dialog "[Дед Джульетты]"
									dialog "Прекрасно-прекрасно! Наслаждайся этими сладостями... "
									wait
									dialog "[Дед Джульетты]"
									dialog "Хочешь совет? Только это секрет! "
									wait
									dialog "[Дед Джульетты]"
									dialog "Эта сладость станет вкуснее, если ты подаришь её любимому человеку! "
									dialog "А, или ты одинок? Понимаю! Шоколад поднимает настроение в любом случае. "
									close
									return
								elseif ((item_check == 2) | (item_check == 3))
									dialog "Ох, не хватает у тебя места. Очисть свой инвентарь и возвращайся!"
									close
									return
								endif
							else
								dialog "[Дед Джульетты]"
								dialog "Неужели ты меня хотел обмануть?! "
								close
								return
							endif
						break
						case 2
							dialog "[Дед Джульетты]"
							dialog "Возвращайся, когда передумаешь. "
							close
							return
						break
					endchoose
				else
					dialog "[Дед Джульетты]"
					dialog "Валентинок маловато, сынок "
					close
					return
				endif
			break
			case 2
				if ((v[Choco_Drink_Recipe] > 149) & (v[jp_event38] < 15))
					dropitem Choco_Drink_Recipe 150
					getitem Feather_Fedora_TW 1
					setitem jp_event38 15
					dialog "[Дед Джульетты]"
					dialog "Поздравляю! Вот твоя Трилби с перьями! "
					dialog "Пусть все знают, что ты наш почетный гость! "

					close
					return
				elseif v[jp_event38] >= 15
					dialog "[Дед Джульетты]"
					dialog "Ты уже получил свою шапку!"
					close
					return
				else
					dialog "[Дед Джульетты]"
					dialog "Валентинок маловато, сынок "
					close
					return
				endif
			break
			case 3
				dialog "[Дед Джульетты]"
				dialog "Свидимся!"
				close
				return
			break
		endchoose
	endif
return

npc "cmd_in02" "Розалин " 4_F_IU 181 98 4 0 0
OnClick:
	var bet
	var card_color
	var card_suit
	var thimblerig
	var picked_color
	var picked_suit
	var picked_marble
	var card_game
	var coef_color = 2
	var coef_suit = 4
	var coef_bingo_1 = 3
	var coef_bingo_2 = 11
	var coef_bingo_3 = 37
	var match_count = 0
	var coef_thimble = 3
	var x = v[jp_event40]
	var x1 = 1
	var x2 = 2
	var x3 = 4
	var x4 = 8
	var check_shield = GetEquipCount Ahura_Mazda

	if (check_shield > 0)
		dialog "[Крупье] "
		dialog "Регулируем коэффициенты "
		wait
		choose menu "Угадай карту " "Рыбалка " "Бинго " // "Наперстки " "Буквы " "Не хочу играть "
			case 1
				dialog "[Крупье] "
				dialog "Цвет или масть? "
				wait
				choose menu "Цвет " "Масть "
					case 1
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[Крупье] "
								dialog "Нельзя "
								wait
							else
								var coef_color = input
								exitwhile
							endif
						endwhile
						close
						return
					break
					case 2
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[Крупье] "
								dialog "Нельзя "
								wait
							else
								var coef_suit = input
								exitwhile
							endif
						endwhile
						close
						return
					break
				endchoose
			break
			case 2
				close
				return
			break
			case 3
				dialog "[Крупье] "
				dialog "На одно, два или три числа? "
				choose menu "1 " "2 " "3 "
					case 1
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[Крупье] "
								dialog "Нельзя "
								wait
							else
								var coef_bingo_1 = input
								exitwhile
							endif
						endwhile
						close
						return
					break
					case 2
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[Крупье] "
								dialog "Нельзя "
								wait
							else
								var coef_bingo_2 = input
								exitwhile
							endif
						endwhile
						close
						return
					break
					case 3
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[Крупье] "
								dialog "Нельзя "
								wait
							else
								var coef_bingo_3 = input
								exitwhile
							endif
						endwhile
						close
						return
					break					
				endchoose
			break
			case 4
				while(1)
					dlgwrite 1 1000
					if error
						dialog "[Крупье] "
						dialog "Нельзя "
						wait
					else
						var coef_thimble = input
						exitwhile
					endif
				endwhile
				close
				return
			break
		endchoose
	else
		if v[jp_event38] == 6
			var y4 = x - x4
			if y4 < 0
				var z4 = 0
				x4 = 0
			else
				var z4 = 1
			endif
			var y3 = x - x4 - x3
			if y3 < 0
				var z3 = 0
				x3 = 0
			else
				var z3 = 1
			endif
			var y2 = x - x4 - x3 - x2
			if y2 < 0
				var z2 = 0
				x2 = 0
			else
				var z2 = 1
			endif
			var y1 = x - x4 - x3 - x2 - x1
			if y1 < 0
				var z1 = 0
				x1 = 0
			else
				var z1 = 1
			endif
			var n = 4 - z1 - z2 - z3 - z4
			if n == 0
				dialog "[Розалин]"
				dialog "Вы отличный игрок! Вам стоит поговорить с моим отцом!"
				changequest 29155 29156
				setitem jp_event38 7
				close
				return
			endif
			dialog "[Розалин]"
			dialog "Привет! Я Розалин!"
			dialog "Я просто обожаю карты! Ох, чего только не сделаешь с их помощью."
			dialog "Можно предсказывать будущее, устраивать фокусы, а еще... Конечно же играть!"
			dialog "Во что сыграем на этот раз?"

			wait
			choose menu "Угадай цвет карты " "Угадай масть карты " "Уйти "
				case 1
					if z1 == 1
						dialog "[Розалин]"
						dialog "Вы уже победили в этой игре!"
						close
						return
					endif
					dialog "[Розалин] "
					dialog "Назови свою ставку (5 - 10) "
					dialog "Введите 0 для отказа от игры "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[Розалин]"
							dialog "До свидания."
							close
							return
						endif
						if error
							dialog "[Розалин] "
							dialog "Ставка должна быть от 5 до 10 валентинок! Такие правила! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_color
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[Розалин] "
						dialog "К сожалению, у тебя недостаточно места для участия в игре! Освободи и возвращайся "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[Розалин] "
						dialog "У вас недостаточно валентинок! Как мы будем играть? "
						close
						return
					else
						dialog "[Розалин] "
						dialog "Ставки сделаны "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[Розалин] "
					dialog "Я вытянула карту "
					wait
					var card_color = rand 1 2 	// 1 - черная, 2 - красная
					dialog "[Розалин] "
					dialog "Какой у нее цвет? "
					wait
					choose menu "Черный! " "Красный! " "Я не знаю "
						case 1
							var picked_color = 1
						break
						case 2
							var picked_color = 2
						break
						case 3
							dialog "[Розалин] "
							dialog "Просто сдался...Ну что же...Ставку я вернуть тебе не могу "
							close
							return
						break
					endchoose
					if card_color == picked_color
						dialog "[Розалин] "
						dialog "Поздравляю, ты отгадал! "
						var wins = v[jp_event39]
						wins = wins + 1
						setitem jp_event39 wins
						var qwin = v[jp_event40]
						qwin = qwin + 1
						setitem jp_event40 qwin
						getitem Choco_Drink_Recipe qty
						close
						return
					else
						dialog "[Розалин] "
						dialog "К сожалению, ты проиграл! "
						dialog "Удачи в следующий раз "
						close
						return
					endif
				break
				case 2
					if z2 == 1
						dialog "[Розалин]"
						dialog "Вы уже победили в этой игре!"
						close
						return
					endif
					dialog "[Розалин] "
					dialog "Назовите свою ставку (5 - 10) "
					dialog "Введите 0 для отказа от игры "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[Розалин]"
							dialog "До свидания."
							close
							return
						endif
						if error
							dialog "[Розалин] "
							dialog "Ставка должна быть от 5 до 10 валентинок! Такие правила! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_suit
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[Розалин] "
						dialog "К сожалению, у тебя недостаточно места для участия в игре! Освободи и возвращайся "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[Розалин] "
						dialog "У вас недостаточно валентинок! Как мы будем играть? "
						close
						return
					else
						dialog "[Розалин] "
						dialog "Ставки сделаны "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[Розалин] "
					dialog "Я вытянула карту "
					wait
					var card_suit = rand 1 4 	// 1 - пики, 2 - бубны, 3 - трефы, 4 - червы
					dialog "[Розалин] "
					dialog "Какая у нее масть? "
					wait
					choose menu "Пики! " "Бубны! " "Трефы " "Червы " "Я не знаю "
						case 1
							var picked_suit = 1
						break
						case 2
							var picked_suit = 2
						break
						case 3
							var picked_suit = 3
						break
						case 4
							var picked_suit = 4
						break
						case 5
							dialog "[Розалин] "
							dialog "Просто сдался...Ну что же...Ставку я вернуть тебе не могу "
							close
							return
						break
					endchoose
					if card_suit == picked_suit
						dialog "[Розалин] "
						dialog "Поздравляю, ты отгадал! "
						var wins = v[jp_event39]
						wins = wins + 1
						setitem jp_event39 wins
						var qwin = v[jp_event40]
						qwin = qwin + 2
						setitem jp_event40 qwin
						getitem Choco_Drink_Recipe qty
						close
						return
					else
						dialog "[Розалин] "
						dialog "К сожалению, ты проиграл! "
						dialog "Удачи в следующий раз "
						close
						return
					endif
				break
				case 3
					dialog "[Розалин]"
					dialog "Возвращайся, поиграем еще!"
					close
					return
				break
			endchoose
		elseif v[jp_event38] > 12
			dialog "[Розалин]"
			dialog "Хочешь сыграть со мной?"
			wait
			choose menu "Угадай цвет карты " "Угадай масть карты " "Уйти "
				case 1
					dialog "[Розалин] "
					dialog "Назови свою ставку (5 - 10) "
					dialog "Введите 0 для отказа от игры "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[Розалин]"
							dialog "До свидания."
							close
							return
						endif
						if error
							dialog "[Розалин] "
							dialog "Ставка должна быть от 5 до 10 валентинок! Такие правила! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_color
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[Розалин] "
						dialog "К сожалению, у тебя недостаточно места для участия в игре! Освободи и возвращайся "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[Розалин] "
						dialog "У вас недостаточно валентинок! Как мы будем играть? "
						close
						return
					else
						dialog "[Розалин] "
						dialog "Ставки сделаны "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[Розалин] "
					dialog "Я вытянула карту "
					wait
					var card_color = rand 1 2 	// 1 - черная, 2 - красная
					dialog "[Розалин] "
					dialog "Какой у нее цвет? "
					wait
					choose menu "Черный! " "Красный! " "Я не знаю "
						case 1
							var picked_color = 1
						break
						case 2
							var picked_color = 2
						break
						case 3
							dialog "[Розалин] "
							dialog "Просто сдался...Ну что же...Ставку я вернуть тебе не могу "
							close
							return
						break
					endchoose
					if card_color == picked_color
						dialog "[Розалин] "
						dialog "Поздравляю, ты отгадал! "
						var wins = v[jp_event39]
						if wins < 100
							wins = wins + 1
							setitem jp_event39 wins
						endif
						getitem Choco_Drink_Recipe qty
						if v[jp_event39] == 100
							dialog "Ого! Поздравляю! Ты победил у нас 100 раз. Это достойно вознаграждения. Подойди к Деду Джульетты.."
							close
							return
						endif
						close
						return
					else
						dialog "[Розалин] "
						dialog "К сожалению, ты проиграл! "
						dialog "Удачи в следующий раз "
						close
						return
					endif
				break
				case 2
					if z2 == 2
						dialog "[Розалин]"
						dialog "Вы уже победили в этой игре!"
						close
						return
					endif
					dialog "[Розалин] "
					dialog "Назовите свою ставку (5 - 10) "
					dialog "Введите 0 для отказа от игры "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[Розалин]"
							dialog "До свидания."
							close
							return
						endif
						if error
							dialog "[Розалин] "
							dialog "Ставка должна быть от 5 до 10 валентинок! Такие правила! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_suit
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[Розалин] "
						dialog "К сожалению, у тебя недостаточно места для участия в игре! Освободи и возвращайся "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[Розалин] "
						dialog "У вас недостаточно валентинок! Как мы будем играть? "
						close
						return
					else
						dialog "[Розалин] "
						dialog "Ставки сделаны "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[Розалин] "
					dialog "Я вытянула карту "
					wait
					var card_suit = rand 1 4 	// 1 - пики, 2 - бубны, 3 - трефы, 4 - червы
					dialog "[Крупье] "
					dialog "Какая у нее масть? "
					wait
					choose menu "Пики! " "Бубны! " "Трефы " "Червы " "Я не знаю "
						case 1
							var picked_suit = 1
						break
						case 2
							var picked_suit = 2
						break
						case 3
							var picked_suit = 3
						break
						case 4
							var picked_suit = 4
						break
						case 5
							dialog "[Розалин] "
							dialog "Просто сдался...Ну что же...Ставку я вернуть тебе не могу "
							close
							return
						break
					endchoose
					if card_suit == picked_suit
						dialog "[Розалин] "
						dialog "Поздравляю, ты отгадал! "
						var wins = v[jp_event39]
						if wins < 100
							wins = wins + 1
							setitem jp_event39 wins
						endif
						getitem Choco_Drink_Recipe qty
						if v[jp_event39] == 100
							dialog "Ого! Поздравляю! Ты победил у нас 100 раз. Это достойно вознаграждения. Подойди к Деду Джульетты.."
							close
							return
						endif
						close
						return
					else
						dialog "[Розалин] "
						dialog "К сожалению, ты проиграл! "
						dialog "Удачи в следующий раз "
						close
						return
					endif
				break
				case 3
					dialog "[Розалин]"
					dialog "Возвращайся, поиграем еще!"
					close
					return
				break
			endchoose
		endif
	endif
return

npc "comodo" "Тибальт " 4W_M_01 136 117 4 0 0
OnClick:
	var bet
	var card_color
	var card_suit
	var thimblerig
	var picked_color
	var picked_suit
	var picked_marble
	var card_game
	var coef_color = 2
	var coef_suit = 4
	var coef_bingo_1 = 3
	var coef_bingo_2 = 11
	var coef_bingo_3 = 37
	var match_count = 0
	var coef_thimble = 3
	var x = v[jp_event40]
	var x1 = 1
	var x2 = 2
	var x3 = 4
	var x4 = 8
	var check_shield = GetEquipCount Ahura_Mazda
	var coef_fish = 2
	if (check_shield > 0)
		dialog "[Крупье] "
		dialog "Регулируем коэффициенты "
		wait
		choose menu "Рыбалка " "Бинго " "Уйти " // "Буквы " "Не хочу играть "
			case 1
				while(1)
					dlgwrite 1 1000
					if error
						dialog "[Крупье] "
						dialog "Нельзя "
						wait
					else
						var coef_fish = input
						exitwhile
					endif
				endwhile
				close
				return
			break
			case 2
				dialog "[Крупье] "
				dialog "На одно, два или три числа? "
				choose menu "1 " "2 " "3 "
					case 1
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[Крупье] "
								dialog "Нельзя "
								wait
							else
								var coef_bingo_1 = input
								exitwhile
							endif
						endwhile
						close
						return
					break
					case 2
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[Крупье] "
								dialog "Нельзя "
								wait
							else
								var coef_bingo_2 = input
								exitwhile
							endif
						endwhile
						close
						return
					break
					case 3
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[Крупье] "
								dialog "Нельзя "
								wait
							else
								var coef_bingo_3 = input
								exitwhile
							endif
						endwhile
						close
						return
					break					
				endchoose
			break
			case 3
				close
				return
			break
		endchoose
	else
		if v[jp_event38] == 6
			var fish_win = 0
			var y4 = x - x4
			if y4 < 0
				var z4 = 0
				x4 = 0
			else
				var z4 = 1
			endif
			var y3 = x - x4 - x3
			if y3 < 0
				var z3 = 0
				x3 = 0
			else
				var z3 = 1
			endif
			var y2 = x - x4 - x3 - x2
			if y2 < 0
				var z2 = 0
				x2 = 0
			else
				var z2 = 1
			endif
			var y1 = x - x4 - x3 - x2 - x1
			if y1 < 0
				var z1 = 0
				x1 = 0
			else
				var z1 = 1
			endif
			var n = 4 - z1 - z2 - z3 - z4
			if n == 0
				dialog "[Тибальт]"
				dialog "Вы отличный игрок! Вам стоит поговорить с моим отцом!"
				changequest 29155 29156
				setitem jp_event38 7
				close
				return
			endif
			dialog "[Тибальт]"
			dialog "Привет! Я Тибальт."
			dialog "Я лучший рыбак Комодо! Но еще лучше я играю в Бинго. "
			dialog "Если есть свободные валентинки - можем сыграть. "
			wait
			dialog "[Тибальт]"
			dialog "Если ты сможешь меня одолеть - в чем я очень сомневаюсь - я обязательно расскажу о тебе отцу."
			wait
			choose menu "Рыбалка " "Бинго " "Уйти "
				case 1
					if z3 == 1
						dialog "[Тибальт]"
						dialog "Вы уже победили в этой игре!"
						close
						return
					endif
					dialog "[Тибальт] "
					dialog "Назови свою ставку (5 - 10) "
					dialog "Введите 0 для отказа от игры "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[Тибальт]"
							dialog "До свидания."
							close
							return
						endif
						if error
							dialog "[Тибальт] "
							dialog "Ставка должна быть от 5 до 10 валентинок! Такие правила! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_fish
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[Тибальт] "
						dialog "К сожалению, у тебя недостаточно места для участия в игре! Освободи и возвращайся "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[Тибальт] "
						dialog "У тебя недостаточно валентинок! Как мы будем играть? "
						close
						return
					else
						dialog "[Тибальт] "
						dialog "Ставки сделаны "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					var fish_weight = rand 1 9
					dialog "[Тибальт] "
					dialog "Я только что вытянул огромную рыбу "
					dialog "весом "+fish_weight+" кг! "
					dialog "Сможешь выловить рыбу побольше? "
					wait
					choose menu "Легко! " "Может быть потом... "
						case 1
							var i = 0
							while(i < 5)
								while(1)
									dialog "*Ты закинул удочку и ждешь...* "
									wait
									var bait_flag = rand 1 5
									if bait_flag == 5
										dialog "*Клюнуло!* "
										dialog "*Ты подсекаешь и тянешь рыбу* "
										wait
										exitwhile
									else
										dialog "Не клюет... "
										wait
									endif
								endwhile
								var try_weight = rand 1 10
								dialog "*Ты поймал рыбу весом "+try_weight+" кг! "
								wait
								if try_weight > fish_weight
									dialog "[Тибальт] "
									dialog "Какая большая рыба! Ты победил! "
									var fish_win = 1
									wait
									exitwhile
								else
									dialog "[Тибальт] "
									dialog "Неплохо... "
									dialog "Но нужно выловить рыбу еще больше "
									i = i + 1
									wait
								endif
							endwhile
							if fish_win == 0
								dialog "[Тибальт] "
								dialog "У тебя не получилось выудить рыбу больше моей, а значит я победил! "
								close
								return
							elseif fish_win == 1
								dialog "[Тибальт] "
								dialog "Как же так! Как я мог проиграть! Но уговор есть уговор... "
								var wins = v[jp_event39]
								wins = wins + 1
								setitem jp_event39 wins
								var qwin = v[jp_event40]
								qwin = qwin + 4
								setitem jp_event40 qwin
								getitem Choco_Drink_Recipe qty
								close
								return
							endif
						break
						case 2
							dialog "[Тибальт]"
							dialog "Ахахах, я знал, что нет никого лучше меня в этом деле! Свою ставку не жди назад!"
							close
							return
						break
					endchoose
				break
				case 2
					if z4 == 1
						dialog "[Тибальт]"
						dialog "Вы уже победили в этой игре!"
						close
						return
					endif
					dialog "[Тибальт] "
					dialog "Назови свою ставку (5 - 10) "
					dialog "Введите 0 для отказа от игры "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[Тибальт]"
							dialog "До свидания."
							close
							return
						endif
						if error
							dialog "[Тибальт] "
							dialog "Ставка должна быть от 5 до 10 валентинок! Такие правила! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_bingo_3
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[Тибальт] "
						dialog "К сожалению, у тебя недостаточно места для участия в игре! Освободи и возвращайся "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[Тибальт] "
						dialog "У тебя недостаточно валентинок! Как мы будем играть? "
						close
						return
					else
						dialog "[Тибальт] "
						dialog "Ставки сделаны "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[Тибальт] "
					dialog "Вы можете поставить на 3 числа от 1 до 10 "
					dialog "Какое ваше первое число? "
					wait
					dlgwrite 1 10
					var number_1 = input
					while(1)
						dialog "[Тибальт] "
						dialog "Какое ваше второе число? "
						wait
						dlgwrite 1 10
						if error
							dialog "[Тибальт] "
							dialog "Нельзя "
							wait
						else
							var number_2 = input
							if number_2 == number_1
								dialog "[Тибальт] "	
								dialog "Вы уже ставили на это число "
								dialog "Поставьте на другое "
							else
								exitwhile
							endif
						endif
					endwhile
					while(1)
						dialog "[Тибальт] "
						dialog "Какое ваше третье число? "
						wait
						dlgwrite 1 10
						if error
							dialog "[Тибальт] "
							dialog "Нельзя "
							wait
						else
							var number_3 = input
							if (number_3 == number_1)|(number_3 == number_2)
								dialog "[Тибальт] "
								dialog "Вы уже ставили на это число "
								dialog "Поставьте на другое "
							else
								exitwhile
							endif
						endif
					endwhile
					dialog "[Тибальт] "
					dialog "Ставки приняты. "
					wait
					dialog "[Тибальт] "
					dialog "Итак, первое выигрышное число этого тура... "
					wait
					var match_count = 0
					var win_number_1 = rand 1 10
					dialog "[Тибальт] "
					dialog win_number_1+"!!! "
					wait
					if (number_1 == win_number_1)
						match_count = match_count + 1
					endif
					dialog "[Тибальт] "
					dialog "Продолжаем... второе число... "
					wait
					var win_number_2 = rand 1 10
					dialog "[Тибальт] "
					dialog win_number_2+"!!! "
					wait
					if (number_2 == win_number_2)
						match_count = match_count + 1
					endif
					dialog "[Тибальт] "
					dialog "И наконец последнее третье число... "
					wait
					var win_number_3 = rand 1 10
					dialog "[Тибальт] "
					dialog win_number_3+"!!!"
					wait
					if (number_3 == win_number_3)
						match_count = match_count + 1
					endif
					dialog "[Тибальт] "
					dialog "Итак счастливые номера этого тура: "
					dialog win_number_1+", "+win_number_2+" и "+win_number_3+"! "
					wait
					dialog "[Тибальт] "
					dialog "Вы отгадали "+match_count+" чисел из трех. "
					wait
					if match_count == 0
						dialog "[Тибальт] "
						dialog "К сожалению, вы проиграли "
						dialog "Удачи в следующий раз "
						close
						return
					elseif match_count == 1
						dialog "[Тибальт] "
						dialog "Неплохой результат, 1 из 3..."
						qty = coef_bingo_1 * bet
						var wins = v[jp_event39]
						wins = wins + 1
						setitem jp_event39 wins
						var qwin = v[jp_event40]
						qwin = qwin + 8
						setitem jp_event40 qwin
						getitem Choco_Drink_Recipe qty
						close
						return
					elseif match_count == 2
						dialog "[Тибальт] "
						dialog "Действительно сильная игра, 2 из 3 "
						qty = coef_bingo_2 * bet
						var wins = v[jp_event39]
						wins = wins + 1
						setitem jp_event39 wins
						var qwin = v[jp_event40]
						qwin = qwin + 8
						setitem jp_event40 qwin
						getitem Choco_Drink_Recipe qty
						close
						return
					elseif match_count == 3
						dialog "[Тибальт] "
						dialog "Невероятно!!! "
						dialog "Вы отгадали все 3 числа! "
						qty = coef_bingo_3 * bet
						var wins = v[jp_event39]
						wins = wins + 1
						setitem jp_event39 wins
						var qwin = v[jp_event40]
						qwin = qwin + 8
						setitem jp_event40 qwin
						getitem Choco_Drink_Recipe qty
						close
						return
					endif
				break
				case 3
					dialog "[Тибальт] "
					dialog "Ну что же, увидимся!"
					close
					return
				break
			endchoose
		elseif v[jp_event38] > 12
			dialog "[Тибальт]"
			dialog "О, так ты вернулся? Хочешь попытать счастья снова?"
			wait
			choose menu "Рыбалка " "Бинго " "Уйти "
				case 1
					dialog "[Тибальт] "
					dialog "Назови свою ставку (5 - 10) "
					dialog "Введите 0 для отказа от игры "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[Тибальт]"
							dialog "До свидания."
							close
							return
						endif
						if error
							dialog "[Тибальт] "
							dialog "Ставка должна быть от 5 до 10 валентинок! Такие правила! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_fish
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[Тибальт] "
						dialog "К сожалению, у тебя недостаточно места для участия в игре! Освободи и возвращайся "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[Тибальт] "
						dialog "У тебя недостаточно валентинок! Как мы будем играть? "
						close
						return
					else
						dialog "[Тибальт] "
						dialog "Ставки сделаны "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					var fish_weight = rand 1 9
					dialog "[Тибальт] "
					dialog "Я только что вытянул огромную рыбу "
					dialog "весом "+fish_weight+" кг! "
					dialog "Сможешь выловить рыбу побольше? "
					wait
					choose menu "Легко! " "Может быть потом... "
						case 1
							var i = 0
							while(i < 5)
								while(1)
									dialog "*Ты закинул удочку и ждешь...* "
									var bait_flag = rand 1 5
									if bait_flag == 5
										dialog "*Клюнуло!* "
										dialog "*Ты подсекаешь и тянешь рыбу* "
										exitwhile
									else
										dialog "Не клюет... "
										wait
									endif
								endwhile
								var try_weight = rand 1 10
								dialog "*Ты поймал рыбу весом "+try_weight+" кг! "
								if try_weight > fish_weight
									dialog "[Тибальт] "
									dialog "Какая большая рыба! Ты победил! "
									var fish_win = 1
									exitwhile
								else
									dialog "[Тибальт] "
									dialog "Неплохо... "
									dialog "Но нужно выловить рыбу еще больше "
									i = i + 1
								endif
							endwhile
							if fish_win == 0
								dialog "[Тибальт] "
								dialog "У тебя не получилось выудить рыбу больше моей, а значит я победил! "
								close
								return
							elseif fish_win == 1
								dialog "[Тибальт] "
								dialog "Как же так! Как я мог проиграть! Но уговор есть уговор... "
								var wins = v[jp_event39]
								if wins < 100
									wins = wins + 1
									setitem jp_event39 wins
								endif
								getitem Choco_Drink_Recipe qty
								if v[jp_event39] == 100
									dialog "Ого! Поздравляю! Ты победил у нас 100 раз. Это достойно вознаграждения. Подойди к Деду Джульетты.."
									close
									return
								endif
								close
								return
							endif
						break
						case 2
							dialog "[Тибальт]"
							dialog "Ахахах, я знал, что нет никого лучше меня в этом деле! Свою ставку не жди назад! "
							close
							return
						break
					endchoose
				break
				case 2
					dialog "[Тибальт] "
					dialog "Назови свою ставку (5 - 10) "
					dialog "Введите 0 для отказа от игры "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[Тибальт]"
							dialog "До свидания."
							close
							return
						endif
						if error
							dialog "[Тибальт] "
							dialog "Ставка должна быть от 5 до 10 валентинок! Такие правила! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_bingo_3
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[Тибальт] "
						dialog "К сожалению, у тебя недостаточно места для участия в игре! Освободи и возвращайся "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[Тибальт] "
						dialog "У тебя недостаточно валентинок! Как мы будем играть? "
						close
						return
					else
						dialog "[Тибальт] "
						dialog "Ставки сделаны "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[Тибальт] "
					dialog "Вы можете поставить на 3 числа от 1 до 10 "
					dialog "Какое ваше первое число? "
					wait
					dlgwrite 1 10
					var number_1 = input
					while(1)
						dialog "[Тибальт] "
						dialog "Какое ваше второе число? "
						wait
						dlgwrite 1 10
						if error
							dialog "[Тибальт] "
							dialog "Нельзя "
							wait
						else
							var number_2 = input
							if number_2 == number_1
								dialog "[Тибальт] "	
								dialog "Вы уже ставили на это число "
								dialog "Поставьте на другое "
							else
								exitwhile
							endif
						endif
					endwhile
					while(1)
						dialog "[Тибальт] "
						dialog "Какое ваше третье число? "
						wait
						dlgwrite 1 10
						if error
							dialog "[Тибальт] "
							dialog "Нельзя "
							wait
						else
							var number_3 = input
							if (number_3 == number_1)|(number_3 == number_2)
								dialog "[Тибальт] "
								dialog "Вы уже ставили на это число "
								dialog "Поставьте на другое "
							else
								exitwhile
							endif
						endif
					endwhile
					var match_count = 0
					dialog "[Тибальт] "
					dialog "Ставки приняты. "
					wait
					dialog "[Тибальт] "
					dialog "Итак, первое выигрышное число этого тура... "
					wait
					var win_number_1 = rand 1 10
					dialog "[Тибальт] "
					dialog win_number_1+"!!! "
					wait
					if (number_1 == win_number_1)
						match_count = match_count + 1
					endif
					dialog "[Тибальт] "
					dialog "Продолжаем... второе число... "
					wait
					var win_number_2 = rand 1 10
					dialog "[Тибальт] "
					dialog win_number_2+"!!! "
					wait
					if (number_2 == win_number_2)
						match_count = match_count + 1
					endif
					dialog "[Тибальт] "
					dialog "И наконец последнее третье число... "
					wait
					var win_number_3 = rand 1 10
					dialog "[Тибальт] "
					dialog win_number_3+"!!!"
					wait
					if (number_3 == win_number_3)
						match_count = match_count + 1
					endif
					dialog "[Тибальт] "
					dialog "Итак счастливые номера этого тура: "
					dialog win_number_1+", "+win_number_2+" и "+win_number_3+"! "
					wait
					dialog "[Тибальт] "
					dialog "Вы отгадали "+match_count+" чисел из трех. "
					wait
					if match_count == 0
						dialog "[Тибальт] "
						dialog "К сожалению, вы проиграли "
						dialog "Удачи в следующий раз "
						close
						return
					elseif match_count == 1
						dialog "[Тибальт] "
						dialog "Неплохой результат, 1 из 3..."
						qty = coef_bingo_1 * bet
						var wins = v[jp_event39]
						if wins < 100
							wins = wins + 1
							setitem jp_event39 wins
						endif
						getitem Choco_Drink_Recipe qty
						if v[jp_event39] == 100
							dialog "Ого! Поздравляю! Ты победил у нас 100 раз. Это достойно вознаграждения. Подойди к Деду Джульетты.."
							close
							return
						endif
						close
						return
					elseif match_count == 2
						dialog "[Тибальт] "
						dialog "Действительно сильная игра, 2 из 3 "
						qty = coef_bingo_2 * bet
						var wins = v[jp_event39]
						if wins < 100
							wins = wins + 1
							setitem jp_event39 wins
						endif
						getitem Choco_Drink_Recipe qty
						if v[jp_event39] == 100
							dialog "Ого! Поздравляю! Ты победил у нас 100 раз. Это достойно вознаграждения. Подойди к Деду Джульетты.."
							close
							return
						endif
						close
						return
					elseif match_count == 3
						dialog "[Тибальт] "
						dialog "Невероятно!!! "
						dialog "Вы отгадали все 3 числа! "
						qty = coef_bingo_3 * bet
						var wins = v[jp_event39]
						if wins < 100
							wins = wins + 1
							setitem jp_event39 wins
						endif
						getitem Choco_Drink_Recipe qty
						if v[jp_event39] == 100
							dialog "Ого! Поздравляю! Ты победил у нас 100 раз. Это достойно вознаграждения. Подойди к Деду Джульетты.."
							close
							return
						endif
						close
						return
					endif
				break
				case 3
					dialog "[Тибальт] "
					dialog "Ну что же, увидимся!"
					close
					return
				break
			endchoose
		endif
	endif
return
