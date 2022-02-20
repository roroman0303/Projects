// Дынный фестиваль 2021 Май
// Флаг jp_event57 - contest
// Apple -> Evt_May01_KR
// Banana -> Melon_Bread
// Grape -> Melon_Juice
// Carrot -> Melon_Parfait
// Meat -> C_Mini_Melon
// Honey -> Suspicious_Melon
// Milk -> Sweet_Melon

npc "prontera" "Фалпадора " 4_F_02 141 125 5 0 0

OnClick:

	var day_of_year = GetGlobalVar "day_of_year"
	var top_melon_name = GetGlobalStr "top_melon_name"
    var top_melon_size = GetGlobalVar "top_melon_size"
	
	var top_melon_day = GetGlobalVar "top_melon_day"
	if (top_melon_day < day_of_year)
		SetGlobalVar "top_melon_size" 0
		SetGlobalVar "top_melon_day" day_of_year
		var top_melon_size = GetGlobalVar "top_melon_size"
	endif
	
	if (top_melon_size > 1000)
		var max_melon_size = top_melon_size + 100
	else
		var max_melon_size = 1100
	endif
	
	var wt_inven = GetInventoryRemainCount 1301 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "[Лаванда]"
        dialog "Твой инвентарь переполнен,"
		dialog "освободи место и возвращайся."
        close
        return
    else
    endif
	
	dialog "[Фалпадора]"
	dialog "Добро пожаловать "
	dialog "на фестиваль дынного урожая!"
	dialog "Предлагаю вам поучаствовать "
	dialog "в конкурсе!"
	Talk2me "Фалпадора " "Фалпадора : Подходите! Участвуйте в конкурсе!"
	wait
	dialog "[Фалпадора]"
	dialog "Правила очень просты."
	dialog "Принесите мне дыню, "
	dialog "самую большую которую вы "
	dialog "сможете достать."
	wait
	dialog "[Фалпадора]"
	dialog "Мы, в свою очередь,"
	dialog "измерим её. Награда за наше "
	dialog "состязание, конечно, зависит "
	dialog "от размеров вашей дыни! Ха-ха!"
	dialog "Конкурс проводится каждый день!"
	wait
	dialog "[Фалпадора]"
	dialog "Но учтите, что и награду можно "
	dialog "получить только один раз в день."
	dialog "Если же вы претендуете на мировой "
	dialog "рекорд, то можете участвовать еще,"
	dialog "но награду получите только,"
	dialog "если поставите рекорд! Ну что?"
	wait
	choose menu "Я хочу участвовать!" "Кто сейчас рекордсмен?" "Что за сладкая монета?" "Мне пора..." 
		case 1
			dialog "[Фалпадора]"
			dialog "Отлично! Посмотрим..."
			wait
            if (v[Suspicious_Melon] < 1)
          		dialog "[Фалпадора]"
          		dialog "Ой, кажется у вас нет "
          		dialog "ни одной дыни, достойной "
          		dialog "участия в конкурсе..."
				dialog "Но не расстраивайтесь,"
          		dialog "конкурс будет идти до конца "
          		dialog "этого фестиваля!"
          		wait
				dialog "[Фалпадора]"
          		dialog "Вам необходимо достать дыню "
          		dialog "большого размера, они могут "
          		dialog "встречаться на полях, наряду с "
				dialog "обычными сладкими дынями."
				wait
          		dialog "[Фалпадора]"
          		dialog "...Но вот еще что..."
          		dialog "Тут, бывает, ходят "
          		dialog "контрабандисты, у них тоже "
				dialog "встречаются редких размеров дыни."
				dialog "Но участвовать такими способами "
				dialog "я вам не советую..."
          		close
          		return
        	else
				var sector_priz = rand 1 10000
				if (sector_priz > 9500)
					var melon_size = rand 1001 max_melon_size
					if (melon_size > top_melon_size)
						dialog "[Фалпадора]"
						dialog "Невероятно!"
						dialog "Ваша дыня - самая большая "
						dialog "из тех, что я видел сегодня!"
						dialog "Её длина - "+melon_size+" мм!"
						dialog "Конечно, вы достойны "
						dialog "лучшей награды!"
						broadcastserver "FF0000" FW_NORMAL 10 0 0 ""+PcName+" поставил новый рекорд в конкурсе! Размер его дыни - "+melon_size+" мм!"
						SetGlobalVar "top_melon_size" melon_size
						SetGlobalStr "top_melon_name" PcName
						dropitem Suspicious_Melon 1
						setitem jp_event57 day_of_year
						if (sector_priz > 9800)
							getitem Apple 1 // C_Mini_Melon 1
						elseif (sector_priz > 9700)
							getitem Melon_Juice 50
						elseif (sector_priz > 9600)
							getitem Melon_Bread 50
						else
							getitem Melon_Parfait 5
						endif
						close
						return
					elseif (jp_event57 < day_of_year)
						dialog "[Фалпадора]"
						dialog "Поразительно!"
						dialog "Это одна из самых больших дынь "
						dialog "из тех, что я видел сегодня!"
						dialog "Её длина - "+melon_size+" мм!"
						dialog "Конечно, вы достойны "
						dialog "лучшей награды!"
						dropitem Suspicious_Melon 1
						setitem jp_event57 day_of_year
						if (sector_priz > 9800)
							getitem Apple 1 // C_Mini_Melon 1
						elseif (sector_priz > 9700)
							getitem Melon_Juice 50
						elseif (sector_priz > 9600)
							getitem Melon_Bread 50
						else
							getitem Melon_Parfait 5
						endif
						close
						return
					else 
						dialog "[Фалпадора]"
						dialog "Поразительно!"
						dialog "Это одна из самых больших дынь "
						dialog "из тех, что я видел!"
						dialog "Её длина - "+melon_size+" мм! Но,"
						dialog "к сожалению, вы уже участвовали "
						dialog "и получали награду сегодня."
						dropitem Suspicious_Melon 1
						close
						return
					endif
				elseif (sector_priz > 6000)
					var melon_size = rand 501 1000
					if (melon_size > top_melon_size)
						dialog "[Фалпадора]"
						dialog "Невероятно!"
						dialog "Ваша дыня - самая большая "
						dialog "из тех, что я видел сегодня!"
						dialog "Её длина - "+melon_size+" мм!"
						dialog "Конечно, вы достойны "
						dialog "лучшей награды!"
						broadcastserver "FF0000" FW_NORMAL 10 0 0 ""+PcName+" поставил новый рекорд в конкурсе! Размер его дыни - "+melon_size+" мм!"
						SetGlobalVar "top_melon_size" melon_size
						SetGlobalStr "top_melon_name" PcName
						dropitem Suspicious_Melon 1
						setitem jp_event57 day_of_year
						if (sector_priz > 8000)
							getitem Sweet_Melon 20
						elseif (sector_priz > 7250)
							getitem Melon_Juice 20
						elseif (sector_priz > 6500)
							getitem Melon_Bread 20
						else
							getitem Melon_Parfait 1
						endif
						close
						return
					elseif (jp_event57 < day_of_year)
						dialog "[Фалпадора]"
						dialog "Неплохо!"
						dialog "Ваша дыня, конечно, не самая "
						dialog "большая за сегодня, но тоже "
						dialog "достойная участница конкурса!"
						dialog "Её длина - "+melon_size+" мм."
						dialog "И вот, конечно же, ваша награда."
						dropitem Suspicious_Melon 1
						setitem jp_event57 day_of_year
						if (sector_priz > 8000)
							getitem Sweet_Melon 20
						elseif (sector_priz > 7250)
							getitem Melon_Juice 20
						elseif (sector_priz > 6500)
							getitem Melon_Bread 20
						else
							getitem Melon_Parfait 1
						endif
						close
						return
					else 
						dialog "[Фалпадора]"
						dialog "Неплохо!"
						dialog "Ваша дыня, конечно, не самая "
						dialog "большая за сегодня, но тоже "
						dialog "достойная участница конкурса!"
						dialog "Её длина - "+melon_size+" мм. Но "
						dialog "награду вы сегодня уже получили."
						dropitem Suspicious_Melon 1
						close
						return
					endif
				else
					var melon_size = rand 200 500
					if (melon_size > top_melon_size)
						dialog "[Фалпадора]"
						dialog "Невероятно!"
						dialog "Ваша дыня - самая большая "
						dialog "из тех, что я видел сегодня!"
						dialog "Её длина - "+melon_size+" мм!"
						dialog "Конечно, вы достойны "
						dialog "лучшей награды!"
						broadcastserver "FF0000" FW_NORMAL 10 0 0 ""+PcName+" поставил новый рекорд в конкурсе! Размер его дыни - "+melon_size+" мм!"
						SetGlobalVar "top_melon_size" melon_size
						SetGlobalStr "top_melon_name" PcName
						dropitem Suspicious_Melon 1
						setitem jp_event57 day_of_year
						if (sector_priz > 3000)
							getitem Sweet_Melon 10
						elseif (sector_priz > 1500)
							getitem Melon_Juice 10
						else
							getitem Melon_Bread 10
						endif
						close
						return
					elseif (jp_event57 < day_of_year)
						dialog "[Фалпадора]"
						dialog "Вашей дыней можно накормить "
						dialog "целую семью, но, увы..."
						dialog "Она слишком мала для состязания "
						dialog "за первое место. Всего "+melon_size+" мм."
						dialog "Но не расстраивайтесь!"
						dialog "Вам тоже положена награда."
						dropitem Suspicious_Melon 1
						setitem jp_event57 day_of_year
						if (sector_priz > 3000)
							getitem Sweet_Melon 10
						elseif (sector_priz > 1500)
							getitem Melon_Juice 10
						else
							getitem Melon_Bread 10
						endif
						close
						return
					else 
						dialog "[Фалпадора]"
						dialog "Вашей дыней можно накормить "
						dialog "целую семью, но, увы..."
						dialog "Она слишком мала для состязания "
						dialog "за первое место. Всего "+melon_size+" мм."
						dialog "Но не расстраивайтесь. Завтра "
						dialog "можете попробовать снова!"
						dropitem Suspicious_Melon 1
						close
						return
					endif
				endif
			endif
		break
		case 2
			if (top_melon_size == 0)
				dialog "[Фалпадора]"
				dialog "Вчера рекордсменом "
				dialog "был "+top_melon_name+"."
				dialog "Сегодня в конкурсе никто не "
				dialog "участвовал. Вы можете "
				dialog "стать первым!"
				close
				return
			else
				dialog "[Фалпадора]"
				dialog "На текущий момент рекордсменом "
				dialog "является "+top_melon_name+"."
				dialog "Размер его дыни составляет "
				dialog "целых "+top_melon_size+" мм!"
				close
				return
			endif
		break
		case 3
			dialog "[Фалпадора]"
			dialog "О, вы про сладкие монеты?"
			dialog "Они очень ценятся в сообществе "
			dialog "фермеров и агрономов."
			dialog "Это своеобразная дружеская валюта,"
			dialog "мы обмениваемся ею между собой."
			wait
			dialog "[Фалпадора]"
			dialog "Думаю, за такую монетку "
			dialog "я бы мог предложить вам "
			dialog "внеочередное участие в конкурсе "
			dialog "на самую большую дыню."
			dialog "С наградами, само собой."
			if (v[Evt_May01_KR] < 1)
				close
				return
			else
				wait
				dialog "[Фалпадора]"
				dialog "Насколько я поняла,"
				dialog "у вас есть такая монетка."
				dialog "Желаете поучаствовать в "
				dialog "конкурсе еще раз?"
				dialog "Я предоставлю вам одну из своих "
				dialog "дынь-конкурсантов."
				wait
				choose menu "Я хочу участвовать!" "Приберегу монету..."
					case 1
						var sector_priz = rand 1 10000
						if (sector_priz > 9500)
							var melon_size = rand 1001 max_melon_size
							if (melon_size > top_melon_size)
								dialog "[Фалпадора]"
								dialog "Невероятно!"
								dialog "Ваша дыня - самая большая "
								dialog "из тех, что я видел сегодня!"
								dialog "Её длина - "+melon_size+" мм!"
								dialog "Конечно, вы достойны "
								dialog "лучшей награды!"
								broadcastserver "FF0000" FW_NORMAL 10 0 0 ""+PcName+" поставил новый рекорд в конкурсе! Размер его дыни - "+melon_size+" мм!"
								SetGlobalVar "top_melon_size" melon_size
								SetGlobalStr "top_melon_name" PcName
								dropitem Suspicious_Melon 1
								if (sector_priz > 9800)
									getitem Apple 1 // C_Mini_Melon 1
								elseif (sector_priz > 9700)
									getitem Melon_Juice 50
								elseif (sector_priz > 9600)
									getitem Melon_Bread 50
								else
									getitem Melon_Parfait 5
								endif
								close
								return
							else
								dialog "[Фалпадора]"
								dialog "Поразительно!"
								dialog "Это одна из самых больших дынь "
								dialog "из тех, что я видел сегодня!"
								dialog "Её длина - "+melon_size+" мм!"
								dialog "Конечно, вы достойны "
								dialog "лучшей награды!"
								dropitem Suspicious_Melon 1
								if (sector_priz > 9800)
									getitem Apple 1 // C_Mini_Melon 1
								elseif (sector_priz > 9700)
									getitem Melon_Juice 50
								elseif (sector_priz > 9600)
									getitem Melon_Bread 50
								else
									getitem Melon_Parfait 5
								endif
								close
								return
							endif
						elseif (sector_priz > 6000)
							var melon_size = rand 501 1000
							if (melon_size > top_melon_size)
								dialog "[Фалпадора]"
								dialog "Невероятно!"
								dialog "Ваша дыня - самая большая "
								dialog "из тех, что я видел сегодня!"
								dialog "Её длина - "+melon_size+" мм!"
								dialog "Конечно, вы достойны "
								dialog "лучшей награды!"
								broadcastserver "FF0000" FW_NORMAL 10 0 0 ""+PcName+" поставил новый рекорд в конкурсе! Размер его дыни - "+melon_size+" мм!"
								SetGlobalVar "top_melon_size" melon_size
								SetGlobalStr "top_melon_name" PcName
								dropitem Suspicious_Melon 1
								if (sector_priz > 8000)
									getitem Sweet_Melon 20
								elseif (sector_priz > 7250)
									getitem Melon_Juice 20
								elseif (sector_priz > 6500)
									getitem Melon_Bread 20
								else
									getitem Melon_Parfait 1
								endif
								close
								return
							else
								dialog "[Фалпадора]"
								dialog "Неплохо!"
								dialog "Ваша дыня, конечно, не самая "
								dialog "большая за сегодня, но тоже "
								dialog "достойная участница конкурса!"
								dialog "Её длина - "+melon_size+" мм."
								dialog "И вот, конечно же, ваша награда."
								dropitem Suspicious_Melon 1
								if (sector_priz > 8000)
									getitem Sweet_Melon 20
								elseif (sector_priz > 7250)
									getitem Melon_Juice 20
								elseif (sector_priz > 6500)
									getitem Melon_Bread 20
								else
									getitem Melon_Parfait 1
								endif
								close
								return
							endif
						else
							var melon_size = rand 200 500
							if (melon_size > top_melon_size)
								dialog "[Фалпадора]"
								dialog "Невероятно!"
								dialog "Ваша дыня - самая большая "
								dialog "из тех, что я видел сегодня!"
								dialog "Её длина - "+melon_size+" мм!"
								dialog "Конечно, вы достойны "
								dialog "лучшей награды!"
								broadcastserver "FF0000" FW_NORMAL 10 0 0 ""+PcName+" поставил новый рекорд в конкурсе! Размер его дыни - "+melon_size+" мм!"
								SetGlobalVar "top_melon_size" melon_size
								SetGlobalStr "top_melon_name" PcName
								dropitem Suspicious_Melon 1
								if (sector_priz > 3000)
									getitem Sweet_Melon 10
								elseif (sector_priz > 1500)
									getitem Melon_Juice 10
								else
									getitem Melon_Bread 10
								endif
								close
								return
							else
								dialog "[Фалпадора]"
								dialog "Вашей дыней можно накормить "
								dialog "целую семью, но, увы..."
								dialog "Она слишком мала для состязания "
								dialog "за первое место. Всего "+melon_size+" мм."
								dialog "Но не расстраивайтесь!"
								dialog "Вам тоже положена награда."
								dropitem Suspicious_Melon 1
								if (sector_priz > 3000)
									getitem Sweet_Melon 10
								elseif (sector_priz > 1500)
									getitem Melon_Juice 10
								else
									getitem Melon_Bread 10
								endif
								close
								return
							endif
						endif
					break
					case 2
					break
				endchoose
			endif
		break
		case 4
		break
	endchoose
return

npc "prontera" "Контрабандист фруктов " 4_M_03 149 128 5 0 0

OnClick:

	dialog "[Контрабандист фруктов]"
	dialog "Дружище, не хочешь сочных "
	dialog "заморских фруктов?"
	dialog "По твоему внешнему виду "
	dialog "можно понять, что ты человек "
	dialog "обеспеченный, и ценишь "
	dialog "качественные продукты."
	wait
	dialog "[Контрабандист фруктов]"
	dialog "У меня для есть актуальное "
	dialog "предложение! Как насчет такого "
	dialog "фрукта, как дыня? "
	dialog "Не простая, конечно..."
	wait
	dialog "[Контрабандист фруктов]"
	dialog "Она особого сорта,"
	dialog "лучшая из лучших!"
	dialog "Ты же хочешь победить в "
	dialog "конкурсе на самую большую дыню?"
	wait
	choose menu "Да, хочу!" "Мне это не интересно "
	case 1
		dialog "[Контрабандист фруктов]"
		dialog "Тогда бери вот эту."
    	dialog "Но... Деньги, знаешь ли, меня "
    	dialog "не интересуют. Я предпочитаю "
		dialog "обмен."
		wait
		dialog "[Контрабандист фруктов]"
		dialog "Могу предложить эту "
    	dialog "потрясающую дыню за..."
    	dialog "10 сладких дынь."
		dialog "Что думаешь? По рукам?"
		wait
      	choose menu "Согласиться " "Уйти "
			case 1
				if (v[Sweet_Melon] > 9)
					dialog "[Контрабандист фруктов]"
					dialog "Держи."
					dialog "И не распространяй слухов "
					dialog "о том, где ты её взял."
					dialog "На всякий случай..."
					getitem Suspicious_Melon 1
					dropitem Sweet_Melon 10
					close
					return
				else
					dialog "[Контрабандист фруктов]"
					dialog "Не думаю, что у тебя "
					dialog "есть то, что мне нужно,"
					dialog "давай отложим сделку."
					close
					return
				endif
			break
			case 2
			break
		endchoose
	break
	case 2
		dialog "[Контрабандист фруктов]"
		dialog "Понял. Приходи, если тебе "
		dialog "понадобится необычный товар."
		close
		return
	break
	endchoose
return

