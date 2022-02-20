// Дынный фестиваль 2021 Май
// Флаг jp_event54 - main quest
// Флаг jp_event55 - everyday quest
// Флаг jp_event56 - day of the quest count


npc "prontera" "Lavender " 1_F_04 125 125 5 0 0
OnClick:

    var wt_inven = GetInventoryRemainCount 1301 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "[Lavender]"
        dialog "Your inventory is full. Free some "
		dialog "space and come back."
        close
        return
    else
    endif

	if (v[jp_event54] == 0)
		dialog "[Lavender]"
		dialog "Welcome to the "
		dialog "Melon Harvest Festival!"
		dialog "Adventurers, hurry up to get involved!"
		wait
		dialog "[Lavender]"
		dialog "... This year there was..."
		dialog "a variety... a new... "
		dialog "juicy..."
		Talk2me "Dilpor " "Dilpor : Oh..."
		wait
		dialog "[Lavender]"
		dialog "No... uh..."
		Talk2me "Dilpor " "Dilpor : Take a look on your cheat sheet..."
		wait
		dialog "-- Lavender смотрит на записку, --"
		dialog "-- спрятанную в ладони. --"
		wait
		dialog "[Lavender]"
		dialog "... Так."
		dialog "В этом году выведен новый "
		dialog "сорт сладкой дыни! "
		dialog "Отличный урожай! Ха-ха-ха!"
		wait
		dialog "[Lavender]"
		dialog "В прошлом году, благодаря "
		dialog "усилиям моей семьи, "
		dialog "был собран весь урожай дыни."
		wait
		dialog "[Lavender]"
		dialog "Но сейчас нам нужна помощь!"
		dialog "Я обещаю поддержку искателям "
		dialog "приключений, которые помогут "
		dialog "мне в этом деле! "
		wait
		choose menu "Семейное дело - это хорошо "
		endchoose
		dialog "[Lavender]"
		dialog "Верно. Урожай дынь сейчас "
		dialog "небольшой, конечно. Не такой "
		dialog "как в прошлом году. "
		dialog "Поэтому родители решили,"
		dialog "что я могу справиться одна."
		wait
		dialog "[Lavender]"
		dialog "Но ведь помимо моего дома "
		dialog "есть и дома других фермеров."
		dialog "И весь этот урожай нужно "
		dialog "подготовить к празднованию..."
		wait
		dialog "[Lavender]"
		dialog "Думаю, если мы объединимся, "
		dialog "мы сможем обеспечить фестиваль."
		wait
		dialog "[Lavender]"
		dialog "А если вы еще и поможете мне "
		dialog "с поставками дынь... Я..."
		dialog "Сделаю вам самый вкусный десерт!"
		wait
		choose menu "Это просьба?" "Мне пора..."
			case 1
				dialog "[Lavender]"
				dialog "Да, я прошу вас пройтись "
				dialog "по полям вокруг городов и найти "
				dialog "дынные рассады."
				wait
				dialog "[Lavender]"
				dialog "Эти рассады состоят из..."
				dialog "существ, похожих на порингов."
				dialog "Но не верьте своим глазам!"
				dialog "Это созревшие сладкие дыни!"
				wait
				dialog "[Lavender]"
				dialog "Принесите мне 10 сладких дынь,"
				dialog "А я вам сделаю из них "
				dialog "сладкий десерт."
				setquest 8577
				setitem jp_event54 1
				close
				return
			break
			case 2
				dialog "[Lavender]"
				dialog "Хорошо."
				dialog "Каждый может проводить "
				dialog "время на фестивале так, "
				dialog "как ему захочется. "
				close
				return
			break
		endchoose
	elseif (v[jp_event54] == 1)
		if (v[Sweet_Melon] < 10)
			dialog "[Lavender]"
			dialog "Да, я прошу вас пройтись "
			dialog "по полям вокруг городов и найти "
			dialog "дынные рассады."
			wait
			dialog "[Lavender]"
			dialog "Эти рассады состоят из..."
			dialog "существ, похожих на порингов."
			dialog "Но не верьте своим глазам!"
			dialog "Это созревшие сладкие дыни!"
			wait
			dialog "[Lavender]"
			dialog "Принесите мне 10 сладких дынь,"
			dialog "А я вам сделаю из них "
			dialog "сладкий десерт."
			close
			return
		else
			dialog "[Lavender]"
			dialog "Ах, сладкая дынька..."
			dialog "Ух ты! У тебя есть глаза..."
			dialog "Немного липкая кожура, "
			dialog "свежий аромат и странно "
			dialog "живое ощущение..."
			wait
			dialog "[Lavender]"
			dialog "Но... ничего страшного!"
			dialog "Спасибо тебе большое за помощь."
			wait
			dialog "[Lavender]"
			dialog "Как и обещала, твой сладкий "
			dialog "десерт вот-вот будет готов."
			wait
			dialog "[Lavender]"
			dialog "Держи."
			dialog "Если вдруг захочешь помочь,"
			dialog "приходи! У меня тут осталось "
			dialog "еще одно дело..."
			dropitem Sweet_Melon 10
			completequest 8577
			getitem Melon_Juice 5
			setitem jp_event54 2
			close
			return
		endif
	elseif (v[jp_event54] == 2)
		dialog "[Lavender]"
		dialog "Ой, ты уже здесь?"
		wait
		choose menu "Предложить помощь " "Спросить про дынный сок " "Да, я мимо проходил..."
			case 1
				dialog "[Lavender]"
				dialog "Это очень кстати!"
				dialog "В прошлом году мы разработали "
				dialog "новое меню и устроили "
				dialog "вечеринку-сюрприз для всей семьи."
				wait
				dialog "[Lavender]"
				dialog "Но в этом году мы были заняты "
				dialog "из-за нового сорта дынь, "
				dialog "поэтому у нас не было времени "
				dialog "на развлечения и сладости..."
				wait
				dialog "[Lavender]"
				dialog "Когда я была маленькой "
				dialog "и гостевала у родных,"
				dialog "родители всегда мне присылали "
				dialog "своё фирменное дынное парфе."
				wait
				dialog "[Lavender]"
				dialog "Сейчас родители уехали в отпуск,"
				dialog "и у меня появилась возможность "
				dialog "самой отправить родителям парфе!"
				Talk2me "Dilpor " "Dilpor : Это то фирменное парфе? "
				Talk2me "Lavender " "Lavender : Да, Dilpor... "
				wait
				dialog "[Lavender]"
				dialog "Я была бы очень благодарна,"
				dialog "если бы ты отнёс парфе."
				dialog "В этом холодильнике, конечно."
				dialog "Не хочу чтобы оно растаяло..."
				wait
				choose menu "Конечно " "Я подумаю..."
					case 1
						dialog "[Lavender]"
						dialog "Отлично!"
						dialog "Мои родители сейчас на курорте "
						dialog "в городе Хугель. Я думаю,"
						dialog "что ты сможешь найти их на пляже."
						setquest 8578
						getitem Ice_Box 1
						setitem jp_event54 3
						close
						return
					break
					case 2
						dialog "[Lavender]"
						dialog "Хорошо, я буду ждать."
						close
						return
					break
				endchoose
			break
			case 2
				dialog "[Lavender]"
				dialog "Ты хочешь еще дынного сока?"
				wait
				choose menu "Да " "Нет "
					case 1
						dialog "[Lavender]"
						dialog "А-ха-ха, могла бы и не спрашивать."
						dialog "Перед таким лакомством нельзя "
						dialog "устоять, правда?"
						wait
						dialog "[Lavender]"
						dialog "Для приготовления сока "
						dialog "мне понадобится одна сладкая дыня "
						dialog "и 1000 зени. "
						wait
						dialog "[Lavender]"
						dialog "К тому же, если ты захочешь "
						dialog "получить 50 сока или больше,"
						dialog "я предоставлю тебе комплимент "
						dialog "от заведения!"
						wait
						dialog "[Lavender]"
						dialog "Это специальная сладкая монетка."
						dialog "Она пригодится тебе, если ты "
						dialog "захочешь поучаствовать "
						dialog "в конкурсе на самую большую дыню."
						wait 
						dialog "[Lavender]"
						dialog "Так сколько сока ты хочешь?"
						wait 								
						dlgwrite 1 2000
						var exchange_input = input
						var cost = exchange_input * 1000
						if input == 0
							dialog "[Lavender]"
							dialog "Если ты не хочешь сока, зачем "
							dialog "спрашиваешь? "
							close
							return
						elseif error
							dialog "[Lavender]"
							dialog "Зачем же ты меня пытаешься "
							dialog "обмануть?  "
							close
							return	
						endif
						dialog "[Lavender]"
						dialog ""+exchange_input+" дынного сока."
						dialog "Это будет стоить "+cost+" зени. Хорошо?"					
						wait
						choose menu "Подтвердить " "Отмена "
							case 1
								if ((v[Sweet_Melon] >= input) & (v[VAR_MONEY] >= cost)) 
									var item_check = GetInventoryRemainCount Melon_Juice exchange_input
									if item_check == 1
										dropgold cost
										dropitem Sweet_Melon exchange_input
										getitem Melon_Juice exchange_input
										if (exchange_input > 49)
											getitem Evt_May01_KR 1
										endif
										dialog "[Lavender]"
										dialog "Приходи, если захочешь еще."
										close
										return
									else
										dialog "[Lavender]"
										dialog "У тебя переполнен инвентарь, "
										dialog "освободи его и возвращайся. "
										close
										return
									endif
								else
									dialog "[Lavender]"
									dialog "К сожалению, я не могу "
									dialog "сделать тебе такое количество "
									dialog "дынного сока. "
									close
									return									
								endif
							break
							case 2
								dialog "[Lavender]"
								dialog "Ладно. Приходи, если захочешь "
								dialog "сладкого сока. "
								close
								return
							break
						endchoose
					break
					case 2
					dialog "[Lavender]"
					dialog "Ладно. Приходи, если захочешь "
					dialog "сладкого сока. "
					close
					return
					break
				endchoose
			break
			case 3
			break
		endchoose
	elseif (v[jp_event54] == 3)
		dialog "[Lavender]"
		dialog "О, ты уже тут?"
		wait 
		choose menu "Спросить про дынный сок " "Спросить еще раз о просьбе " "Мне пора "
			case 1
				dialog "[Lavender]"
				dialog "Ты хочешь еще дынного сока?"
				wait
				choose menu "Да " "Нет "
					case 1
						dialog "[Lavender]"
						dialog "А-ха-ха, могла бы и не спрашивать."
						dialog "Перед таким лакомством нельзя "
						dialog "устоять, правда?"
						wait
						dialog "[Lavender]"
						dialog "Для приготовления сока "
						dialog "мне понадобится одна сладкая дыня "
						dialog "и 1000 зени. "
						wait
						dialog "[Lavender]"
						dialog "К тому же, если ты захочешь "
						dialog "получить 50 сока или больше,"
						dialog "я предоставлю тебе комплимент "
						dialog "от заведения!"
						wait
						dialog "[Lavender]"
						dialog "Это специальная сладкая монетка."
						dialog "Она пригодится тебе, если ты "
						dialog "захочешь поучаствовать "
						dialog "в конкурсе на самую большую дыню."
						wait 
						dialog "[Lavender]"
						dialog "Так сколько сока ты хочешь?"
						wait 								
						dlgwrite 1 2000
						var exchange_input = input
						var cost = exchange_input * 1000
						if input == 0
							dialog "[Lavender]"
							dialog "Если ты не хочешь сока, зачем "
							dialog "спрашиваешь? "
							close
							return
						elseif error
							dialog "[Lavender]"
							dialog "Зачем же ты меня пытаешься "
							dialog "обмануть?  "
							close
							return	
						endif
						dialog "[Lavender]"
						dialog ""+exchange_input+" дынного сока."
						dialog "Это будет стоить "+cost+" зени. Хорошо?"					
						wait
						choose menu "Подтвердить " "Отмена "
							case 1
								if ((v[Sweet_Melon] >= input) & (v[VAR_MONEY] >= cost)) 
									var item_check = GetInventoryRemainCount Melon_Juice exchange_input
									if item_check == 1
										dropgold cost
										dropitem Sweet_Melon exchange_input
										getitem Melon_Juice exchange_input
										if (exchange_input > 49)
											getitem Evt_May01_KR 1
										endif
										dialog "[Lavender]"
										dialog "Приходи, если захочешь еще."
										close
										return
									else
										dialog "[Lavender]"
										dialog "У тебя переполнен инвентарь, "
										dialog "освободи его и возвращайся. "
										close
										return
									endif
								else
									dialog "[Lavender]"
									dialog "К сожалению, я не могу "
									dialog "сделать тебе такое количество "
									dialog "дынного сока. "
									close
									return									
								endif
							break
							case 2
								dialog "[Lavender]"
								dialog "Ладно. Приходи, если захочешь "
								dialog "сладкого сока. "
								close
								return
							break
						endchoose
					break
					case 2
					dialog "[Lavender]"
					dialog "Ладно. Приходи, если захочешь "
					dialog "сладкого сока. "
					close
					return
					break
				endchoose
			break
			case 2
				if (v[Ice_Box] == 0)
					dialog "[Lavender]"
					dialog "Ты потерял ящик с парфе?!"
					dialog "Ох, ладно... Я знаю, что "
					dialog "быть искателем приключений "
					dialog "невероятно трудно. Держи,"
					dialog "вот тебе другой ящик."
					Talk2me "Dilpor " "Dilpor : Что? "
					getitem Ice_Box 1
					wait
					dialog "[Lavender]"
					dialog "Пожалуйста, не потеряй его снова."
					close
					return
				else
					dialog "[Lavender]"
					dialog "Сейчас родители уехали в отпуск,"
					dialog "и у меня появилась возможность "
					dialog "самой отправить родителям парфе."
					wait
					dialog "[Lavender]"
					dialog "Я была бы очень благодарна,"
					dialog "если бы ты отнёс парфе в Хугель."
					dialog "В этом холодильнике, конечно."
					dialog "Не хочу чтобы оно растаяло..."
					wait
					dialog "[Lavender]"
					dialog "Моих родителей, думаю,"
					dialog "ты сможешь найти на пляже."
					close
					return
				endif
			break
			case 3
			break
		endchoose
	elseif (v[jp_event54] == 4)
		dialog "[Lavender]"
		dialog "О, привет, искатель приключений!"
		dialog "Ты уже отнес родителям парфе?"
		dialog "Долгий путь, наверное, был."
		dialog "Это записка от отца?"
		wait
		dialog "[Lavender]"
		dialog "Папа беспокоится о том,"
		dialog "справляюсь ли я с управлением "
		dialog "мероприятия. Это и правда "
		dialog "тяжело, но я стараюсь."
		wait
		dialog "[Lavender]"
		dialog "Прошлый год был для родителей "
		dialog "еще тяжелее, но ведь они "
		dialog "справились! Значит и я справлюсь."
		wait
		dialog "[Lavender]"
		dialog "Кстати, пока тебя не было,"
		dialog "я успела приготовить дынный хлеб."
		dialog "Думаю, для первого раза "
		dialog "получилось очень неплохо!"
		dialog "Попробуй сам."
		completequest 8579
		setitem jp_event54 5
		getitem Melon_Bread 10
		getitem Melon_Parfait 1
		wait
		dialog "[Lavender]"
		dialog "Сейчас, мне кажется, тебе стоит "
		dialog "помочь и Dilporу. Он хоть "
		dialog "и мой конкурент, но он тоже "
		dialog "участвует в фестивале. "
		Talk2me "Dilpor " "Dilpor : Вообще-то помощь бы не помешала..."
		wait
		dialog "[Lavender]"
		dialog "А ты, кстати, участвуешь в "
		dialog "конкурсе на самую большую дыню?"
		dialog "Я вот попытаю удачу."
		wait
		dialog "[Lavender]"
		dialog "А моя двоюродная сестра "
		dialog "делает памятные шапки из дынь!"
		dialog "Чтобы настроение фестиваля "
		dialog "осталось с тобой надолго."
		wait
		dialog "[Lavender]"
		dialog "И спасибо еще раз за помощь!"
		dialog "Если тебе понадобится сделать "
		dialog "сладкий сок из дынь или хлеб,"
		dialog "можешь всегда ко мне обращаться."
		close
		return	
	else
		dialog "[Lavender]"
		dialog "О, привет, "+PcName+"!"
		wait 
		choose menu "Спросить про дынный сок " "Спросить про хлеб " "Мне пора "
			case 1
				dialog "[Lavender]"
				dialog "Ты хочешь еще дынного сока?"
				wait
				choose menu "Да " "Нет "
					case 1
						dialog "[Lavender]"
						dialog "А-ха-ха, могла бы и не спрашивать."
						dialog "Перед таким лакомством нельзя "
						dialog "устоять, правда?"
						wait
						dialog "[Lavender]"
						dialog "Для приготовления сока "
						dialog "мне понадобится одна сладкая дыня "
						dialog "и 1000 зени. "
						wait
						dialog "[Lavender]"
						dialog "К тому же, если ты захочешь "
						dialog "получить 50 сока или больше,"
						dialog "я предоставлю тебе комплимент "
						dialog "от заведения!"
						wait
						dialog "[Lavender]"
						dialog "Это специальная сладкая монетка."
						dialog "Она пригодится тебе, если ты "
						dialog "захочешь поучаствовать "
						dialog "в конкурсе на самую большую дыню."
						wait 
						dialog "[Lavender]"
						dialog "Так сколько сока ты хочешь?"
						wait 								
						dlgwrite 1 2000
						var exchange_input = input
						var cost = exchange_input * 1000
						if input == 0
							dialog "[Lavender]"
							dialog "Если ты не хочешь сока, зачем "
							dialog "спрашиваешь? "
							close
							return
						elseif error
							dialog "[Lavender]"
							dialog "Зачем же ты меня пытаешься "
							dialog "обмануть?  "
							close
							return	
						endif
						dialog "[Lavender]"
						dialog ""+exchange_input+" дынного сока."
						dialog "Это будет стоить "+cost+" зени. Хорошо?"					
						wait
						choose menu "Подтвердить " "Отмена "
							case 1
								if ((v[Sweet_Melon] >= input) & (v[VAR_MONEY] >= cost)) 
									var item_check = GetInventoryRemainCount Melon_Juice exchange_input
									if item_check == 1
										dropgold cost
										dropitem Sweet_Melon exchange_input
										getitem Melon_Juice exchange_input
										if (exchange_input > 49)
											getitem Evt_May01_KR 1
										endif
										dialog "[Lavender]"
										dialog "Приходи, если захочешь еще."
										close
										return
									else
										dialog "[Lavender]"
										dialog "У тебя переполнен инвентарь, "
										dialog "освободи его и возвращайся. "
										close
										return
									endif
								else
									dialog "[Lavender]"
									dialog "К сожалению, я не могу "
									dialog "сделать тебе такое количество "
									dialog "дынного сока. "
									close
									return									
								endif
							break
							case 2
								dialog "[Lavender]"
								dialog "Ладно. Приходи, если захочешь "
								dialog "сладкого сока. "
								close
								return
							break
						endchoose
					break
					case 2
					dialog "[Lavender]"
					dialog "Ладно. Приходи, если захочешь "
					dialog "сладкого сока. "
					close
					return
					break
				endchoose
			break
			case 2
				dialog "[Lavender]"
				dialog "Тебе правда понравился "
				dialog "мой дынный хлеб?"
				wait
				choose menu "Да " "Нет "
					case 1
						dialog "[Lavender]"
						dialog "Ну... Тогда я могу предложить "
						dialog "тебе испечь еще."
						wait
						dialog "[Lavender]"
						dialog "Для одного батона дынного хлеба "
						dialog "мне понадобится пять сладких дынь "
						dialog "и 1500 зени за выпечку."
						wait
						dialog "[Lavender]"
						dialog "Так сколько хлеба ты хочешь?"
						wait 								
						dlgwrite 1 2000
						var exchange_input = input
						var cost = exchange_input * 1500
						var melon_for_bread = exchange_input * 5
						if input == 0
							dialog "[Lavender]"
							dialog "Если ты не хочешь хлеба, зачем "
							dialog "спрашиваешь? "
							close
							return
						elseif error
							dialog "[Lavender]"
							dialog "Зачем же ты меня пытаешься "
							dialog "обмануть? "
							close
							return	
						endif
						dialog "[Lavender]"
						dialog "Нужно "+melon_for_bread+" сладких дынь."
						dialog "Получится "+exchange_input+" дынного хлеба."
						dialog "Выпечка будет стоить "+cost+" зени. Хорошо?"					
						wait
						choose menu "Подтвердить " "Отмена "
							case 1
								if ((v[Sweet_Melon] >= melon_for_bread) & (v[VAR_MONEY] >= cost)) 
									var item_check = GetInventoryRemainCount Melon_Bread exchange_input
									if item_check == 1
										dropgold cost
										dropitem Sweet_Melon melon_for_bread
										getitem Melon_Bread exchange_input
										dialog "[Lavender]"
										dialog "Приходи, если захочешь еще."
										close
										return
									else
										dialog "[Lavender]"
										dialog "У тебя переполнен инвентарь, "
										dialog "освободи его и возвращайся. "
										close
										return
									endif
								else
									dialog "[Lavender]"
									dialog "К сожалению, я не могу "
									dialog "сделать тебе такое количество "
									dialog "дынного хлеба. "
									close
									return									
								endif
							break
							case 2
								dialog "[Lavender]"
								dialog "Ладно. Приходи, если захочешь "
								dialog "дынного хлеба. "
								close
								return
							break
						endchoose
					break
					case 2
					dialog "[Lavender]"
					dialog "Ладно. Я пока еще подумаю "
					dialog "над рецептом."
					close
					return
					break
				endchoose
			break
			case 3
			break
		endchoose
	endif
return

npc "prontera" "Наннаби " 4_F_PINKWOMAN 127 125 5 0 0

OnClick:
	if (v[jp_event54] < 5)
		dialog "[Наннаби]"
		dialog "Добро пожаловать "
		dialog "на фестиваль сладкой дыни!"
		wait
		dialog "[Наннаби]"
		dialog "Скоро в продаже появятся "
		dialog "потрясающие шляпы из "
		dialog "растительной кожи!"
		close
		return
	elseif (v[jp_event54] == 5)
		dialog "[Наннаби]"
		dialog "Добро пожаловать "
		dialog "на фестиваль сладой дыни!"
		wait
		dialog "[Наннаби]"
		dialog "Я - мастер по созданию "
		dialog "одежды из растительной кожи."
		dialog "По случаю фестиваля могу "
		dialog "предложить вам сделать "
		dialog "что-нибудь из кожуры дынь."
		wait
		dialog "[Наннаби]"
		dialog "Как насчет памятной шляпы "
		dialog "с фестиваля? По-моему она "
		dialog "очень органично будет смотреться "
		dialog "с вашим снаряжением!"
		wait
		choose menu "Я тоже так считаю "
		endchoose
		dialog "[Наннаби]"
		dialog "Для создания такой шляпы "
		dialog "мне понадобятся 30 твёрдой "
		dialog "дынной кожуры."
		wait
		dialog "[Наннаби]"
		dialog "И поторопитесь, у меня вскоре "
		dialog "могут появиться другие заказы!"
		setquest 8580
		setitem jp_event54 6
		close
		return
	elseif (v[jp_event54] == 6)
		dialog "[Наннаби]"
		dialog "Приветствую тебя еще раз,"
		dialog "искатель приключений!"
		dialog "Ты достал кожуру сладкой дыни?"
		dialog "Без неё, как ты понимаешь,"
		dialog "я сделать ничего не смогу."
		wait
		choose menu "У меня есть кожура дыни " "Мне пора "
			case 1
				if (v[Dalcom_Skin] > 9)
					dialog "[Наннаби]"
					dialog "То, что нужно!"
					dialog "Думаю из такой кожуры получится "
					dialog "отличная памятная шапка."
					dialog "Посмотрим..."
					wait
					dialog "Готово!"
					dialog "Если у тебя есть лишняя "
					dialog "дынная кожура, думаю, я бы "
					dialog "смогла договориться с Лавандой,"
					dialog "чтобы обменять её на немного "
					dialog "дынного сока. "
					dropitem Dalcom_Skin 30
					completequest 8580
					setitem jp_event54 7
					getitem C_Melon_Cap 1
					getitem Melon_Parfait 1
					close
					return
				else
					dialog "[Наннаби]"
					dialog "Для создания красивой шапки "
					dialog "из растительной кожи,"
					dialog "нужно, как минимум,"
					dialog "10 кожуры сладкой дыни."
					wait
					dialog "[Наннаби]"
					dialog "Думаю, её можно получить "
					dialog "из сладких дынь. Ха-ха-ха!"
					close
					return
				endif
			break
			case 2
			break
		endchoose
	else
		dialog "[Наннаби]"
		dialog "Приветствую тебя,"
		dialog "искатель приключений!"
		dialog "Чем могу помочь?"
		wait
		choose menu "У меня есть кожура дыни " "Мне пора "
			case 1
				dialog "[Наннаби]"
				dialog "Могу тебе предложить дынный сок "
				dialog "за 5 кожуры сладкой дыни."
				dialog "На сколько сока тебе хватит? "
				wait
				dlgwrite 1 2000
				var exchange_input = input
				var cost = exchange_input * 5
				if input == 0
					dialog "[Наннаби]"
					dialog "Если ты не хочешь обменять, зачем "
					dialog "спрашиваешь?  "
					close
					return
				elseif error
					dialog "[Наннаби]"
					dialog "Зачем же ты меня пытаешься "
					dialog "обмануть?  "
					close
					return	
				endif
				dialog ""+exchange_input+" дынного сока за "
				dialog ""+cost+" кожуры сладкой дыни. Всё верно?"
				wait
				choose menu "Подтвердить " "Отмена "
					case 1
						if v[Dalcom_Skin] >= cost
							var item_check = GetInventoryRemainCount Melon_Juice exchange_input 
							if item_check == 1
								dropitem Dalcom_Skin cost
								getitem Melon_Juice exchange_input
								dialog "[Наннаби]"
								dialog "Приходи, если захочешь еще."
								close
								return
							else
								dialog "[Наннаби]"
								dialog "У тебя переполнен инвентарь, "
								dialog "освободи его и возвращайся. "
								close
								return
							endif
						else
							dialog "[Наннаби]"
							dialog "У тебя недостаточно кожуры."
							dialog "Я договорилась с Лавандой "
							dialog "на 1 сок дыни за 5 кожуры."
							close
							return									
						endif
					break
					case 2
						dialog "[Наннаби]"
						dialog "Ладно. Приходи, когда надумаешь "
						dialog "обменять. "
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	endif
return


npc "prontera" "Dilpor " 4_M_NFMAN 129 125 5 0 0
OnClick:
	var courier_number = rand 4 7
	var day_of_year = GetGlobalVar "day_of_year"
	
	if (v[jp_event54] < 5)
		dialog "[Dilpor]"
		dialog "Что... А, добрый день!"
		Talk2me "Lavender " "Lavender : Dilpor, просыпайся уже!"
		close
		return
	else
		if (v[jp_event55] == 0)
			dialog "[Dilpor]"
			dialog "Добрый день, путник!"
			dialog "Спасибо за то, что помогаешь "
			dialog "нам в организации фестиваля."
			wait
			dialog "[Dilpor]"
			dialog "Я видел, что ты уже помог Лаванде,"
			dialog "может ты сможешь и мне помочь..."
			wait
			dialog "[Dilpor]"
			dialog "Я хотел в этом году вывести "
			dialog "новый сорт дыни. Она росла "
			dialog "очень хорошо, даже сорняки "
			dialog "ей не мешали. Но в один момент "
			dialog "я узнал почему. Она оказалась..."
			wait
			dialog "[Dilpor]"
			dialog "Кислая! Да, именно кислая! "
			dialog "Это полный провал. Как же мне "
			dialog "конкурировать с Лавандой "
			dialog "за самый сладкий сорт дыни,"
			dialog "если мой сорт - не сладкий!"
			wait
			Talk2me "Lavender " "Lavender : Что-что, не сладкий?"
			Talk2me "Dilpor " "Dilpor : Тебе послышалось, Lavender!"	
			choose menu "Что же теперь делать?"
			endchoose
			dialog "[Dilpor]"
			dialog "Мне нужно где-то добыть "
			dialog "сладких дынь, потому что "
			dialog "сам вырастить я уже не успею..."
			wait
			dialog "[Dilpor]"
			dialog "Добудь где-нибудь "
			dialog "10 сладких дынь и принеси мне."
			wait
			choose menu "Согласиться "	"Уйти "
				case 1
					dialog "[Dilpor]"
					dialog "Вот спасибо! Возвращайся скорее!"
					dialog "И пожалуйста, никому не говори,"
					dialog "что ты собираешь дыни для меня."
					setitem jp_event55 1
					setquest 8581
					close
					return
				break
				case 2
				break
			endchoose
		elseif (v[jp_event55] == 1)
			if (v[Sweet_Melon] < 10)
				dialog "[Dilpor]"
				dialog "Мне нужно где-то добыть "
				dialog "сладких дынь, потому что "
				dialog "сам вырастить я уже не успею..."
				wait
				dialog "[Dilpor]"
				dialog "Добудь где-нибудь "
				dialog "10 сладких дынь и принеси мне."
				close
				return
			else
				dialog "[Dilpor]"
				dialog "Кажется, это дыни Лаванды..."
				dialog "Эх... Мне стыдно использовать их."
				Talk2me "Lavender " "Lavender : Dilpor, не будь таким принципиальным!"
				wait
				dialog "[Dilpor]"
				dialog "Я не могу обманывать всех,"
				dialog "что это мой урожай."
				dialog "Но ведь я могу же "
				dialog "испортить фестиваль..."
				Talk2me "Lavender " "Lavender : Ничего, урожая хватит на всех."
				wait
				dialog "[Dilpor]"
				dialog "Решено. В этом году "
				dialog "я помогу Лаванде! "
				dialog "Даже если мне не удалось "
				dialog "вырастить свои дыни, это не повод "
				dialog "грустить и портить праздник."
				Talk2me "Lavender " "Lavender : Присоединяйся, конечно! Сразу бы так!"
				wait
				dialog "[Dilpor]"
				dialog "Предлагаю в честь объединения "
				dialog "отведать чудного парфе из дыни."
				getitem Melon_Parfait 1
				setitem jp_event55 2
				completequest 8581
				wait
				dialog "[Dilpor]"
				dialog "Но на этом наши приготовления "
				dialog "к фестивалю не заканчиваются."
				dialog "Нам еще нужна будет помощь,"
				dialog "я в этом уверен..."
				dialog "Заглядывай почаще, "+PcName+"."
				close
				return
			endif
		elseif (v[jp_event55] == 3)
			if (v[Sweet_Melon] < 10)
				dialog "[Dilpor]"
				dialog "Тебе нужно добыть 10 "
				dialog "сладких дынь. Как только "
				dialog "они будут у тебя, приноси их "
				dialog "мне. Мы с Лавандой сделаем парфе "
				dialog "и выдадим потом холодильник."
				close
				return
			else
				dialog "[Dilpor]"
				dialog "Привет. Ты уже принёс "
				dialog "сладкие дыни? Молодец."
				dialog "Я вот слегка замотался с этим "
				dialog "фестивалем и забыл про эту "
				dialog "доставку, представляешь? "
				wait
				dialog "[Dilpor]"
				dialog "Сейчас... Передай их, пожалуйста, "
				dialog "Лаванде, она изготовит своё "
				dialog "фирменное парфе."
				Talk2me "Lavender " "Lavender : Ух ты, отличные дыньки! Минуточку..."
				dropitem Sweet_Melon 10
				wait
				if (courier_number == 4)
					dialog "[Dilpor]"
					dialog "Так. Парфе готово. Посмотрим..."
					dialog "Сегодня сладкие дыни нужно "
					dialog "отнести в Моррок."
					wait
					dialog "[Dilpor]"
					dialog "Там тебя встретит один из "
					dialog "организаторов фестиваля,"
					dialog "где-нибудь в центре города."
					changequest 8582 8584
					setitem jp_event55 4
					getitem Ice_Box 1
					close
					return
				elseif (courier_number == 5)
					dialog "[Dilpor]"
					dialog "Так. Парфе готово. Посмотрим..."
					dialog "Сегодня сладкие дыни нужно "
					dialog "отнести в Хугель."
					wait
					dialog "[Dilpor]"
					dialog "Там тебя встретит один из "
					dialog "организаторов фестиваля,"
					dialog "где-нибудь в центре города."
					changequest 8582 8585
					setitem jp_event55 5
					getitem Ice_Box 1
					close
					return
				elseif (courier_number == 6)
					dialog "[Dilpor]"
					dialog "Так. Парфе готово. Посмотрим..."
					dialog "Сегодня сладкие дыни нужно "
					dialog "отнести в Комодо."
					wait
					dialog "[Dilpor]"
					dialog "Там тебя встретит один из "
					dialog "организаторов фестиваля,"
					dialog "где-нибудь в центре города."
					changequest 8582 8586
					setitem jp_event55 6
					getitem Ice_Box 1
					close
					return
				else
					dialog "[Dilpor]"
					dialog "Так. Парфе готово. Посмотрим..."
					dialog "Сегодня сладкие дыни нужно "
					dialog "отнести в Пайон."
					wait
					dialog "[Dilpor]"
					dialog "Там тебя встретит один из "
					dialog "организаторов фестиваля,"
					dialog "где-нибудь в центре города."
					changequest 8582 8587
					setitem jp_event55 7
					getitem Ice_Box 1
					close
					return
				endif
			endif
		elseif (v[jp_event55] == 4)
			if (v[Ice_Box] == 0)
				dialog "[Dilpor]"
				dialog "Ты потерял холодильник?!"
				dialog "Ладно... У нас еще осталось "
				dialog "немного парфе, только прошу "
				dialog "тебя, эти не потеряй!"
				getitem Ice_Box 1
				wait
			endif
			dialog "[Dilpor]"
			dialog "Сегодня сладкие дыни нужно "
			dialog "отнести в Моррок."
			dialog "Там тебя встретит один из "
			dialog "организаторов фестиваля,"
			dialog "где-нибудь в центре города."
			close
			return
		elseif (v[jp_event55] == 5)
			if (v[Ice_Box] == 0)
				dialog "[Dilpor]"
				dialog "Ты потерял холодильник?!"
				dialog "Ладно... У нас еще осталось "
				dialog "немного парфе, только прошу "
				dialog "тебя, эти не потеряй!"
				getitem Ice_Box 1
				wait
			endif
			dialog "[Dilpor]"
			dialog "Сегодня сладкие дыни нужно "
			dialog "отнести в Хугель."
			dialog "Там тебя встретит один из "
			dialog "организаторов фестиваля,"
			dialog "где-нибудь в центре города."
			close
			return
		elseif (v[jp_event55] == 6)
			if (v[Ice_Box] == 0)
				dialog "[Dilpor]"
				dialog "Ты потерял холодильник?!"
				dialog "Ладно... У нас еще осталось "
				dialog "немного парфе, только прошу "
				dialog "тебя, эти не потеряй!"
				getitem Ice_Box 1
				wait
			endif
			dialog "[Dilpor]"
			dialog "Сегодня сладкие дыни нужно "
			dialog "отнести в Комодо."
			dialog "Там тебя встретит один из "
			dialog "организаторов фестиваля,"
			dialog "где-нибудь в центре города."
			close
			return
		elseif (v[jp_event55] == 7)
			if (v[Ice_Box] == 0)
				dialog "[Dilpor]"
				dialog "Ты потерял холодильник?!"
				dialog "Ладно... У нас еще осталось "
				dialog "немного парфе, только прошу "
				dialog "тебя, эти не потеряй!"
				getitem Ice_Box 1
				wait
			endif
			dialog "[Dilpor]"
			dialog "Сегодня сладкие дыни нужно "
			dialog "отнести в Пайон."
			dialog "Там тебя встретит один из "
			dialog "организаторов фестиваля,"
			dialog "где-нибудь в центре города."
			close
			return
		elseif (v[jp_event55] == 8)
			dialog "[Dilpor]"
			dialog "Отличная работа, "+PcName+"!"
			dialog "С твоей помощью мы точно "
			dialog "организуем лучший праздник "
			dialog "урожая за последние года!"
			wait
			dialog "[Dilpor]"
			dialog "Приходи каждый день и,"
			dialog "думаю, что мы сможем хорошо "
			dialog "тебя отблагодарить за твою помощь!"
			setitem jp_event55 day_of_year
			completequest 8588
			if (v[jp_event56] == 0)
				setitem jp_event56 1
				getitem Melon_Bread 10
			elseif (v[jp_event56] == 1)
				setitem jp_event56 2
				getitem Melon_Juice 15
			elseif (v[jp_event56] == 2)
				setitem jp_event56 3
				getitem Melon_Parfait 3
			else 
				setitem jp_event55 1000
				setitem jp_event56 1000
				getitem Apple 1 //C_Dalcom_Helmet 1
			endif
			close
			return
		elseif (v[jp_event55] < day_of_year)
			dialog "[Dilpor]"
			dialog "Ты уже здесь, "+PcName+"?"
			dialog "Как раз вовремя, нам с Лавандой "
			dialog "не помешала бы помощь в доставке "
			dialog "парфе из дынь нашим "
			dialog "участникам фестиваля."
			wait
			dialog "[Dilpor]"
			dialog "Холодильник мы тебе выдадим,"
			dialog "а вот сладкие дыни для "
			dialog "изготовления парфе тебе "
			dialog "добывать самому."
			wait
			dialog "[Dilpor]"
			dialog "Тебе нужно добыть 10 "
			dialog "сладких дынь. Как только "
			dialog "они будут у тебя, приноси их "
			dialog "мне. Мы с Лавандой сделаем парфе "
			dialog "и выдадим холодильник. Хорошо?"
			wait
			choose menu "Согласиться " "У меня много дел..."
				case 1
					dialog "[Dilpor]"
					dialog "Отлично!"
					dialog "Не забудь - 10 сладких дынь."
					Talk2me "Lavender " "Lavender : Что бы мы без тебя делали..."
					setitem jp_event55 3
					setquest 8582
					close
					return
				break
				case 2
				break
			endchoose
		elseif (v[jp_event55] == day_of_year)
			dialog "[Dilpor]"
			dialog "Привет, "+PcName+"!"
			dialog "С праздником урожая!"
			dialog "Сегодня твоя помощь не требуется,"
			dialog "приходи завтра."
			close
			return
		else
			dialog "[Dilpor]"
			dialog "Привет, "+PcName+"!"
			dialog "С праздником урожая!"
			dialog "Большое спасибо за твою "
			dialog "помощь. Это лучший фестиваль,"
			dialog "в котором я принимал участие!"
			close
			return
		endif
	endif
return

npc "morocc" "Организатор фестиваля " 8_F_GIRL 158 100 3 0 0
OnClick:
	if (v[jp_event55] != 4)
		dialog "[Организатор фестиваля]"
		dialog "С праздником! "
		dialog "Урожайный год, не так ли?"
		close 
		return
	else
		dialog "[Организатор фестиваля]"
		dialog "С праздником! "
		dialog "Урожайный год, не так ли?"
		dialog "У вас есть что-то для меня?"
		wait
		choose menu "У меня посылка для вас "
		endchoose
		dialog "[Организатор фестиваля]"
		dialog "Дынное парфе! Очень вовремя."
		dialog "Спасибо большое, и "
		dialog "Лаванде тоже передайте "
		dialog "мою благодарность."
		dropitem Ice_Box 1
		setitem jp_event55 8
		changequest 8584 8588
		close 
		return
	endif
return

npc "hugel" "Организатор фестиваля " 8_F_GIRL 90 150 6 0 0
OnClick:
	if (v[jp_event55] != 5)
		dialog "[Организатор фестиваля]"
		dialog "С праздником! "
		dialog "Урожайный год, не так ли?"
		close 
		return
	else
		dialog "[Организатор фестиваля]"
		dialog "С праздником! "
		dialog "Урожайный год, не так ли?"
		dialog "У вас есть что-то для меня?"
		wait
		choose menu "У меня посылка для вас "
		endchoose
		dialog "[Организатор фестиваля]"
		dialog "Дынное парфе! Очень вовремя."
		dialog "Спасибо большое, и "
		dialog "Лаванде тоже передайте "
		dialog "мою благодарность."
		dropitem Ice_Box 1
		setitem jp_event55 8
		changequest 8585 8588
		close 
		return
	endif
return

npc "comodo" "Организатор фестиваля " 8_F_GIRL 211 314 4 0 0
OnClick:
	if (v[jp_event55] != 6)
		dialog "[Организатор фестиваля]"
		dialog "С праздником! "
		dialog "Урожайный год, не так ли?"
		close 
		return
	else
		dialog "[Организатор фестиваля]"
		dialog "С праздником! "
		dialog "Урожайный год, не так ли?"
		dialog "У вас есть что-то для меня?"
		wait
		choose menu "У меня посылка для вас "
		endchoose
		dialog "[Организатор фестиваля]"
		dialog "Дынное парфе! Очень вовремя."
		dialog "Спасибо большое, и "
		dialog "Лаванде тоже передайте "
		dialog "мою благодарность."
		dropitem Ice_Box 1
		setitem jp_event55 8
		changequest 8586 8588
		close 
		return
	endif
return

npc "payon" "Организатор фестиваля " 8_F_GIRL 165 100 5 0 0
OnClick:
	if (v[jp_event55] != 7)
		dialog "[Организатор фестиваля]"
		dialog "С праздником! "
		dialog "Урожайный год, не так ли?"
		close 
		return
	else
		dialog "[Организатор фестиваля]"
		dialog "С праздником! "
		dialog "Урожайный год, не так ли?"
		dialog "У вас есть что-то для меня?"
		wait
		choose menu "У меня посылка для вас "
		endchoose
		dialog "[Организатор фестиваля]"
		dialog "Дынное парфе! Очень вовремя."
		dialog "Спасибо большое, и "
		dialog "Лаванде тоже передайте "
		dialog "мою благодарность."
		dropitem Ice_Box 1
		setitem jp_event55 8
		changequest 8587 8588
		close 
		return
	endif
return

npc "hugel" "Лилия " 4W_F_01 205 198 5 0 0
OnClick:
	dialog "[Лилия]"
    dialog "Не загораживайте мне солнце, "
    dialog "пожалуйста. "
	close 
	return
	
return

npc "hugel" "Тормод " 1_M_HOF 203 198 5 0 0
OnClick:
	if (v[jp_event54] == 3)
		if (v[Ice_Box] > 0)
			dialog "[Тормод]"
			dialog "Приветствую."
			wait
			choose menu "У меня посылка от Лаванды "
			endchoose
			dialog "[Тормод]"
			dialog "Хм... Правда?"
			wait
			dialog "[Тормод]"
			dialog "Ой, это же дынное парфе."
			dialog "Ха-ха, спасибо большое, "
			dialog "в такую погоду очень кстати."
			Talk2me "Лилия " "Лилия : Ох, Lavender..."
			wait
			dialog "[Тормод]"
			dialog "Спасибо и тебе, путник."
			dialog "Ты, получается, пересёк "
			dialog "целый континент, чтобы доставить "
			dialog "нам этот ящик."
			dropitem Ice_Box 1
			changequest 8578 8579
			setitem jp_event54 4
			wait
			dialog "[Тормод]"
			dialog "Думаю и тебе тоже полагается "
			dialog "возможность попробовать этот "
			dialog "десерт."
			getitem Melon_Parfait 1
			wait
			dialog "[Тормод]"
			dialog "Конечно, хотелось бы, чтобы и "
			dialog "Lavender была с нами. Когда мы "
			dialog "прибудем обратно, мы обязательно "
			dialog "вместе отпразднуем фестиваль."
			wait
			dialog "[Тормод]"
			dialog "А пока... Можешь передать эту "
			dialog "записку Лаванде?"
			close
			return
		else
			dialog "[Тормод]"
			dialog "Приветствую."
			wait
			choose menu "У меня посылка от Лаванды "
			endchoose
			dialog "[Тормод]"
			dialog "Думаю, вы потеряли её по дороге..."
			close
			return
		endif
	else
		dialog "[Тормод]"
		dialog "Приветствую."
		dialog "Жаркая погода, не так ли?"
		close
		return
	endif
return






