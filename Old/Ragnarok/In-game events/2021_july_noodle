
npc "malangdo" "Путь туда # 17_sign01" 2_BOARD2 214 106 1 5 5
OnTouch2:
	Talk2me "Путь туда#17_sign01" "Шаг за шагом, стойко шагайте только по дороге лапши!"
return


npc "malangdo" "Путь туда # 17_sign02" 2_BOARD2 146 129 1 5 5
OnTouch2:
	Talk2me "Путь туда#17_sign02" "Шаг за шагом, стойко шагайте только по дороге лапши!"
return


npc "malangdo" "Информация о объекте # 17_info01" 4_CAT_3COLOR 214 95 5 5 5

OnInit:
AddQuestIDCondition 14696
SetQuestConditionBegin 14696 1 0
SetQuestConditionQuest 14696 0
SetQuestConditionItem 3941 1 ">"
SetQuestConditionLevel 50 200
SetQuestConditionEnd
return

OnTouch2:
	Talk2me "Информация о объекте#17_info01" "Жаркое лето, когда тело и разум устали? Как насчет тарелки вкусной лапши?"
return

OnClick:
dialog "[Информация о объекте]"
dialog "Добро пожаловать в Малангдо!"
wait
dialog "[Информация о объекте]"
dialog "Вы ищете фестиваль лапши? Вы "
dialog "можете провести меня к месту "
dialog "встречи? "
wait
choose menu "Да. Пожалуйста, направь меня." "Я просто пришел посмотреть."
case 1
	dialog "[Информация о объекте]"
	dialog "Место проведения будет отмечено "
	dialog "на мини-карте. "
	compass 0 140 165 1 "0xFFFF3355"
	wait
	dialog "[Информация о объекте]"
	dialog "Прибыв на место проведения, вы "
	dialog "можете подойти к организатору "
	dialog "фестиваля и зарегистрироваться на "
	dialog "мероприятие. Получайте "
	dialog "удовольствие от лапши сегодня !! "
	dialog "Лапша самая лучшая! Лапша самая "
	dialog "лучшая !! "
	close
	Navigation_Active "malangdo" 0 000 1 140 165
	return
break
case 2
	dialog "[Информация о объекте]"
	dialog "Верно! Итак, веселитесь, а если у "
	dialog "вас есть время, посетите место "
	dialog "проведения фестиваля лапши! Лапша "
	dialog "самая лучшая! Лапша самая лучшая "
	dialog "!! "
	close
	return
break
endchoose
return



npc "malangdo" "Информация о объекте # 17_info02" 4_CAT_3COLOR 135 118 5 0 0
OnInit:
AddQuestIDCondition 14696
SetQuestConditionBegin 14696 1 0
SetQuestConditionQuest 14696 0
SetQuestConditionItem 3941 1 ">"
SetQuestConditionLevel 50 200
SetQuestConditionEnd
return

OnTouch2:
	Talk2me "Информация о объекте#17_info02" "Жаркое лето, когда тело и разум устали? Как насчет тарелки вкусной лапши?"
return

OnClick:
dialog "[Информация о объекте]"
dialog "Добро пожаловать в Малангдо!"
wait
dialog "[Информация о объекте]"
dialog "Вы ищете фестиваль лапши? Вы "
dialog "можете провести меня к месту "
dialog "встречи? "
wait
choose menu "Да. Пожалуйста, направь меня." "Я просто пришел посмотреть."
case 1
	dialog "[Информация о объекте]"
	dialog "Место проведения будет отмечено "
	dialog "на мини-карте. "
	compass 0 140 165 1 "0xFFFF3355"
	wait
	dialog "[Информация о объекте]"
	dialog "Прибыв на место проведения, вы "
	dialog "можете подойти к организатору "
	dialog "фестиваля и зарегистрироваться на "
	dialog "мероприятие. Получайте "
	dialog "удовольствие от лапши сегодня !! "
	dialog "Лапша самая лучшая! Лапша самая "
	dialog "лучшая !! "
	close
	Navigation_Active "malangdo" 0 000 1 140 165
	return
break
case 2
	dialog "[Информация о объекте]"
	dialog "Верно! Итак, веселитесь, а если у "
	dialog "вас есть время, посетите место "
	dialog "проведения фестиваля лапши! Лапша "
	dialog "самая лучшая! Лапша самая лучшая "
	dialog "!! "
	close
	return
break
endchoose
return


npc "malangdo" "Прием участников фестиваля № 17_list01" 4_CAT_ADV1 140 165 3 5 5

OnInit:
AddQuestIDCondition 14696
SetQuestConditionBegin 14696 1 0
SetQuestConditionQuest 14696 0
SetQuestConditionItem 3941 1 ">"
SetQuestConditionLevel 50 200
SetQuestConditionEnd
return

OnTouch2:
var noodle_14696 = isbegin_quest 14696 
if (noodle_14696 == 0) 
	Talk2me "Прием участников фестиваля#17_list01" "А теперь ты! Наслаждайтесь жарким летом с вкусной лапшой! Зарегистрируйтесь для участия в фестивале!"
else
	Talk2me "Прием участников фестиваля#17_list01" "жаркое лето! Подавать с вкусной лапшой!"
endif
return


OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[Прием фестиваля фестиваля]"
		dialog "Багаж большой, и он выглядит "
		dialog "тяжелым. Как насчет еще? "
		close
		return
	else
	endif

if (v[VAR_CLEVEL] < 50)
	dialog "[Прием фестиваля фестиваля]"
	dialog "Вам нужно немного повысить "
	dialog "уровень, чтобы участвовать в "
	dialog "фестивале лапши. "
	close
	return
endif
var name = PcName
var noodle_14696 = isbegin_quest 14696 
dialog "[Прием фестиваля фестиваля]"
dialog "Доброе утро! Жаркий день, правда? "
dialog "Добро пожаловать на фестиваль "
dialog "лапши в Малангдо! Разнообразные "
dialog "акции и розыгрыши различных "
dialog "призов! Не упустите шанс и "
dialog "примите участие! "
wait
choose menu "Подать заявку на участие " "Фестиваль лапши?" "Информация о объекте " "Информация о купонах и обмене призами "
case 1
	if (noodle_14696 == 0) 
		dialog "[Прием фестиваля фестиваля]"
		dialog "Хотите присоединиться к "
		dialog "фестивалю? Не могли бы вы "
		dialog "написать здесь свое имя? Мне это "
		dialog "нужно на раздачу. "
		wait
		dlgwritestr
		dialog "[Прием фестиваля фестиваля]"
		dialog "Ага,"+name+"Вы был получен."
		dialog "В память о получении подарю вам "
		dialog "вентилятор ^0000cd^000000. Если вы передадите "
		dialog "этот веер нашему публицисту в "
		dialog "большом городе, вы сможете "
		dialog "приехать на место проведения "
		dialog "фестиваля в любое время. "
		wait
		dialog "[Прием фестиваля фестиваля]"
		dialog "Первый старт фестиваля лапши "
		dialog "начинается с урожая картофеля ^0000cd^000000. "
		wait
		dialog "[Прием фестиваля фестиваля]"
		dialog "Картофель со свининой можно "
		dialog "получить в ^0000cdNyilo^000000, живущем в Nyail "
		dialog "Oyster. "
		wait
		dialog "[Прием фестиваля фестиваля]"
		dialog "Чтобы попасть в пещеру Ньяил, "
		dialog "перейдите к "
		dialog "<NAVI>_[Председатель_фестиваля],_<INFO>malangdo,133,170,000,0 "
		dialog ",</INFO> </NAVI>, привратнику "
		dialog "пещеры Ньяил ^0000cdПещера Нил^000000 и "
		dialog "уходите! "
		setquest 14696
		getitem Promotion_Fan 1
		close
		return
	else
		dialog "[Прием фестиваля фестиваля]"
		dialog "Эээ... Вы уже зарегистрировались "
		dialog "на фестиваль лапши? Вперед и "
		dialog "наслаждайтесь этим жарким летом с "
		dialog "лапшой! "
		close
		return
	endif
break
case 2
	dialog "[Прием фестиваля фестиваля]"
	dialog "Впервые на фестивале лапши? В "
	dialog "Малангдо фестиваль лапши также "
	dialog "называется "
	dialog "^0000cdФестиваль большой луны^000000. Один раз "
	dialog "в год, когда восходит "
	dialog "исключительно большая и красивая "
	dialog "луна, вода выходит за пределы, "
	dialog "так что пристань полностью "
	dialog "погружается под воду. "
	wait
	dialog "[Прием фестиваля фестиваля]"
	dialog "Где-то в это время года рыба и "
	dialog "моллюски, которые имеют немного "
	dialog "другой запах и форму, чем другие "
	dialog "морские существа, уходят прочь, и "
	dialog "никто не знал, что они были или "
	dialog "откуда пришли в прошлом. "
	wait
	dialog "[Прием фестиваля фестиваля]"
	dialog "Было высказано предположение, что "
	dialog "он прибыл из неизвестной пещеры "
	dialog "под названием ^0000cdNyail Cave^000000, о "
	dialog "которой ходят легенды, но никто "
	dialog "никогда не видел пещеру Nyail. "
	wait
	dialog "[Прием фестиваля фестиваля]"
	dialog "Попробовав его, любопытная Дорамс "
	dialog "не могла забыть его лучший вкус. "
	dialog "Однако количество было очень "
	dialog "маленьким, и по истечении этого "
	dialog "периода морские существа исчезли, "
	dialog "и вкуса было мало. "
	wait
	dialog "[Прием фестиваля фестиваля]"
	dialog "Однажды дорам по имени Лапша "
	dialog "отправился в море за Калунаком и "
	dialog "попал в небольшой водоворот. Едва "
	dialog "вырвавшись из водоворота, "
	dialog "Гуксу-ним нашел пещеру, полную "
	dialog "морских существ. "
	wait
	dialog "[Прием фестиваля фестиваля]"
	dialog "Это была пещера Ньяил, "
	dialog "существовавшая только в легендах. "
	dialog "Гуксу-ним, который вернулся "
	dialog "оттуда с множеством "
	dialog "восхитительных существ, сообщил о "
	dialog "существовании пещеры другим "
	dialog "дорам. "
	wait
	dialog "[Прием фестиваля фестиваля]"
	dialog "Люди дали этим существам имя "
	dialog "«лапша»^000000 в честь человека, который обнаружил пещеру ^0000cd. "
	dialog "В это время, когда восходит "
	dialog "большая луна, они проводят "
	dialog "восхитительный фестиваль лапши ^0000cd^000000 и "
	dialog "распространяют информацию в мире "
	dialog "богатого вкуса Мы приглашаем "
	dialog "людей со всего мира насладиться "
	dialog "этим вкусом вместе. "
	wait
	dialog "[Прием фестиваля фестиваля]"
	dialog "В частности, в этом году Лапшой "
	dialog "года в размере "
	dialog "^0000cd, приготовленной в сладко-соленом томатном соусе, была выбрана лапша года^000000! "
	dialog "Если вы съедите его со свининой ^0000cd^000000, "
	dialog "это потрясающе! "
	wait
	dialog "[Прием фестиваля фестиваля]"
	dialog "Попробуйте вкусную лапшу и "
	dialog "насладитесь различными "
	dialog "мероприятиями, чтобы освежить "
	dialog "жаркое лето. "
	close
	return
break
case 3
	while(1)
		dialog "[Прием фестиваля фестиваля]"
		dialog "Куда я могу вас направить?"
		wait
		choose menu "Вход в пещеру Ньяил." "лапша " "Урожай свиного картофеля " "десертный уголок " "ловит рыбу " "отменить "
		case 1
			dialog "[Прием фестиваля фестиваля]"
			dialog "Фестиваль начинается с "
			dialog "^0000cdPork Potato Harvest^000000. Картофель со "
			dialog "свининой можно получить в ^0000cdNyilo^000000, "
			dialog "который обитает только в Nyail "
			dialog "Oyster! "
			wait
			dialog "[Прием фестиваля фестиваля]"
			dialog "В пещеру Ньяил можно попасть "
			dialog "только через "
			dialog "<NAVI>_[Председатель_фестиваля]_<INFO> "
			dialog "malangdo, 133,170,000,0, </INFO> "
			dialog "</NAVI>, привратник пещеры Ньяил. "
			dialog " "
			wait
			dialog "[Прием фестиваля фестиваля]"
			dialog "Не расстраивайтесь, если вы были "
			dialog "в пещере Ньяил, а ее там нет. "
			dialog "Найло быстро восстанавливается. "
			dialog "Затем мы проведем вас к месту "
			dialog "проведения фестиваля "
			dialog "Председателя. "
			wait
		break
		case 2
			dialog "[Прием фестиваля фестиваля]"
			dialog "Если вы собрали длинную тонкую "
			dialog "лапшу, которая плывет в небольшом "
			dialog "водовороте, отнесите ее в "
			dialog "Орчо-ним. Томатная лапша, лапша "
			dialog "года, приготовленная в "
			dialog "восхитительном томатном соусе "
			dialog "путем варки лапши в морской воде "
			dialog "на месте. "
			wait
			dialog "[Прием фестиваля фестиваля]"
			dialog "Я проведу вас к месту, где "
			dialog "находится "
			dialog "<NAVI>_[Орчо_отвечает_за_лапшу]_<INFO> "
			dialog "malangdo, 165,133,000,0, </INFO> "
			dialog "</NAVI>, который скручивает "
			dialog "соленую и кислую томатную лапшу ^0000cd^000000. "
			dialog " "
			wait
		break
		case 3
			dialog "[Прием фестиваля фестиваля]"
			dialog "Вы когда-нибудь слышали о "
			dialog "^0000cdPork Potato Малангдо^000000? Говорят, "
			dialog "что даже если люди никогда не "
			dialog "пробовали его, никто никогда не "
			dialog "ел его ни разу. "
			wait
			dialog "[Прием фестиваля фестиваля]"
			dialog "<NAVI>_[помощник_леща]_<INFO> "
			dialog "malangdo, 183,221,000,0, </INFO> "
			dialog "</NAVI> отвечает за уборку "
			dialog "свиного картофеля. "
			wait
		break
		case 4
			dialog "[Прием фестиваля фестиваля]"
			dialog "Если вы пробовали горячую лапшу, "
			dialog "обязательно попробуйте холодные и "
			dialog "сладкие десерты !! "
			wait
			dialog "[Прием фестиваля фестиваля]"
			dialog "Сочетание сладкого и соленого! В "
			dialog "этом году мы специально "
			dialog "приготовили арбузный пудинг, и "
			dialog "сейчас мы проводим веселое "
			dialog "мероприятие по разбивке арбузов^000000^000000, "
			dialog "так что не забудьте заглянуть. "
			wait
			dialog "[Прием фестиваля фестиваля]"
			dialog "<NAVI> [Модератор Рами] <INFO> malangdo, 196,217,000,0, </INFO> </NAVI>."
			wait
		break
		case 5
			dialog "[Прием фестиваля фестиваля]"
			dialog "Рыбалка в море тоже удовольствие, "
			dialog "не так ли? Малангдо славится "
			dialog "обильной ловлей рыбы, поэтому "
			dialog "многие люди хотят насладиться ее "
			dialog "вкусом. "
			wait
			dialog "[Прием фестиваля фестиваля]"
			dialog "Но ^0000cdЧто происходит в эти "
			dialog "дни? "
			dialog "<NAVI>_[Место_рыбалки]_Я_проведу_вас_к_местоположению_<INFO>malangdo,136,237,000,0 "
			dialog ",</INFO> </NAVI>, не хотите ли вы "
			dialog "его посетить? "
			wait
		break
		case 6
			dialog "[Прием фестиваля фестиваля]"
			dialog "Хорошо. Если вам нужна помощь, "
			dialog "дайте мне знать! "
			close
			return
			exitwhile
		break
		endchoose
	endwhile
break
case 4
	dialog "[Прием фестиваля фестиваля]"
	dialog "Если вы участвуете в различных "
	dialog "мероприятиях во время фестиваля "
	dialog "лапши, вы получите монету ^0000cd^000000, "
	dialog "которую можно обменять на призы в "
	dialog "размере^000000 ^0000cd. "
	wait
	dialog "[Прием фестиваля фестиваля]"
	dialog "Ах, да! Каждый раз, когда я "
	dialog "завершаю все мероприятия, которые "
	dialog "я готовил каждый день, я беру "
	dialog "одну марку^000000 на купон ^0000cd. "
	wait
	dialog "[Прием фестиваля фестиваля]"
	dialog "Если вы проштампите купон ^0000cd10 раз^000000, "
	dialog "вы получите сувенир с фестиваля "
	dialog "лапши <ITEM> Воспоминания о "
	dialog "костюмированной летней лапше "
	dialog "<INFO> 31303 </INFO> </ITEM>. "
	close
	return
break
endchoose
return



npc "malangdo" "Председатель фестиваля № 17_add01" 4_CAT_MERMASTER 133 170 5 5 5

OnInit:
AddQuestIDCondition 14697
SetQuestConditionBegin 14697 1 0
SetQuestConditionQuest 14696 1
SetQuestConditionQuest 14697 0
SetQuestConditionItem 3941 1 ">"
SetQuestConditionEnd

SetQuestConditionBegin 14697 1 0
SetQuestConditionQuest 14697 2
SetQuestConditionItem 23362 0 "<"
SetQuestConditionEnd
return

OnTouch2:
	Talk2me "Председатель фестиваля#17_add01" "Жаркое лето, когда тело и разум устали? Как насчет тарелки вкусной лапши?"
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[Председатель фестиваля]"
		dialog "Багаж большой, и он выглядит "
		dialog "тяжелым. Как насчет еще? "
		close
		return
	else
	endif

var noodle_14696 = isbegin_quest 14696 
var noodle_14697 = isbegin_quest 14697 
var hunt_chek01 = checkquest_hunting 14697
if (noodle_14696 == 1)
	dialog "[Председатель фестиваля]"
	dialog "Добро пожаловать в! Добро "
	dialog "пожаловать на фестиваль лапши. Из "
	dialog "поколения в поколение фестиваль "
	dialog "лапши начинается с сбора урожая "
	dialog "^0000cdСвиной картофель^000000! "
	wait
	dialog "[Председатель фестиваля]"
	dialog "^0000cd Картофель^000000, который можно "
	dialog "получить из ^0000cdNyailo^000000, живущий в "
	dialog "^0000cdNyailo^000000, считается лучшим "
	dialog "ингредиентом из-за его "
	dialog "прекрасного вкуса. "
	wait
	dialog "[Председатель фестиваля]"
	dialog "Этот картофель из свинины "
	dialog "восхитителен как сам по себе, так "
	dialog "и в сочетании с различными "
	dialog "блюдами из лапши для получения "
	dialog "восхитительного вкуса. "
	wait
	dialog "[Председатель фестиваля]"
	dialog "Если вы хотите узнать больше о "
	dialog "картофеле со свининой, послушайте "
	dialog "Прием участников фестиваля. "
	wait
	dialog "[Председатель фестиваля]"
	dialog "Итак, не хотите ли вы пойти в "
	dialog "^0000cdNyil Cave^000000, чтобы собрать "
	dialog "картофель со свининой? "
	wait
	choose menu "Ага! Пожалуйста, отправьте!" "Подожди, я готовлюсь."
	case 1
		dialog "[Председатель фестиваля]"
		dialog "Тогда вперед в Ньяилгуль!"
		completequest 14696
		setquest 14697
		close
		moveto "lasa_sea" 26 142
		return
	break
	case 2
		dialog "[Председатель фестиваля]"
		dialog "Дай мне знать, когда будешь готов."
		close
		return
	break
	endchoose
elseif (noodle_14697 == 1)
	if ((hunt_chek01 == 2) & (v[Pig_Potato] > 0))
		dialog "[Председатель фестиваля]"
		dialog "Как прошел сбор свинины "
		dialog "картофеля? Попробуйте собранный "
		dialog "свиной картофель. Вы "
		dialog "почувствуете, как ваше тело и "
		dialog "разум восстанавливаются. "
		wait
		dialog "[Председатель фестиваля]"
		dialog "А теперь давайте серьезно "
		dialog "насладимся фестивалем лапши в "
		dialog "Малангдо! "
		wait
		dialog "[Председатель фестиваля]"
		dialog "Спросите у сотрудников Прием "
		dialog "фестиваля, стоящих напротив меня, "
		dialog "где будет проходить каждое "
		dialog "мероприятие, и они будут рады "
		dialog "помочь вам. "
		completequest 14697
		dropitem Pig_Potato 1
		setquest 14706
		setquest 14707
		setquest 14708
		setquest 14709
		getitem Noodle_Festa_Coupon 10
		close
		return
	else
		dialog "[Председатель фестиваля]"
		dialog "Ой, ты пришел с пустыми руками. У "
		dialog "вас были проблемы со сбором "
		dialog "свинины и картофеля? Хотели бы вы "
		dialog "снова отправиться в пещеру Ньяил? "
		dialog " "
		wait
		choose menu "Ага! Пожалуйста, отправьте!" "Подожди, я готовлюсь."
		case 1
			dialog "[Председатель фестиваля]"
			dialog "Тогда вперед в Ньяилгуль!"
			close
			moveto "lasa_sea" 26 142
			return
		break
		case 2
			dialog "[Председатель фестиваля]"
			dialog "Дай мне знать, когда будешь готов."
			close
			return
		break
		endchoose
	endif
elseif (noodle_14697 == 2)
	dialog "[Председатель фестиваля]"
	dialog "Хотели бы вы на этот раз снова "
	dialog "отправиться в пещеру Ньяил? "
	wait
	choose menu "Ага! Пожалуйста, отправьте!" "Подожди, я готовлюсь."
	case 1
		dialog "[Председатель фестиваля]"
		dialog "Тогда вперед в Ньяилгуль!"
		close
		moveto "lasa_sea" 26 142
		return
	break
	case 2
		dialog "[Председатель фестиваля]"
		dialog "Дай мне знать, когда будешь готов."
		close
		return
	break
	endchoose
else
	dialog "[Председатель фестиваля]"
	dialog "Добро пожаловать в! Добро "
	dialog "пожаловать на фестиваль лапши. "
	dialog "Как насчет вкусного лета с "
	dialog "разнообразными мероприятиями? "
	wait
	dialog "[Председатель фестиваля]"
	dialog " "
	dialog "<NAVI>_[Прием_участников_фестиваля]_<INFO> "
	dialog "malangdo, 140,165,000,0, </INFO> "
	dialog "</NAVI> Пожалуйста, сначала "
	dialog "зарегистрируйтесь на фестиваль "
	dialog "ОДИН, а затем возвращайтесь. "
	close
	return
endif
return



npc "malangdo" "кипящий котел # 17_add01" CLEAR_NPC 165 131 5 5 5

npc "malangdo" "Орчо отвечает за лапшу # 17_add01" 4_CAT_CHEF 165 133 5 5 5

OnInit:
AddQuestIDCondition 14698
SetQuestConditionBegin 14698 1 0
SetQuestConditionQuest 14697 3
SetQuestConditionQuest 14698 0
SetQuestConditionEnd

AddQuestIDCondition 14698
SetQuestConditionBegin 14698 1 0
SetQuestConditionQuest 14698 1
SetQuestConditionItem 25365 9 "<"
SetQuestConditionEnd

AddQuestIDCondition 14699
SetQuestConditionBegin 14699 1 0 
SetQuestConditionQuest 14699 2
SetQuestConditionEnd
return

OnTouch2:
	Talk2me "Орчо отвечает за лапшу#17_add01" "Жаркое лето, когда тело и разум устали? Как насчет тарелки вкусной лапши?"
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[Орчо отвечает за лапшу]"
		dialog "Багаж большой, и он выглядит "
		dialog "тяжелым. Как насчет еще? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
var noodle_14698 = isbegin_quest 14698 
var noodle_14699 = isbegin_quest 14699 
var noodle_14706 = isbegin_quest 14706 
var time_check01 = checkquest_playtime 14699
if (noodle_14706 == 1)
	dialog "[Орчо отвечает за лапшу]"
	dialog "Доброе утро! Хороший день, чтобы "
	dialog "скрутить лапшу, не так ли? Как "
	dialog "насчет вкусной лапши? "
	wait
	dialog "[Орчо отвечает за лапшу]"
	dialog " "
	dialog "^0000cd Если вы принесете 10 длинных лапш и 3 свиных картофеля^000000, "
	dialog "мы приготовим их на месте в "
	dialog "морской воде и приготовим вкусную "
	dialog "томатную лапшу ^0000cd^000000. "
	wait
	choose menu "хорошо!" "позже "
	case 1
		dialog "[Орчо отвечает за лапшу]"
		dialog "Длинная и тонкая лапша катается "
		dialog "на небольшом водовороте ^0000cd^000000, который "
		dialog "можно увидеть в это время года, "
		dialog "так что вы можете получить их, "
		dialog "поймав их. "
		wait
		dialog "[Орчо отвечает за лапшу]"
		dialog "Картофель со свининой можно "
		dialog "получить в ^0000cdNyilo^000000 в пещере Nyail. "
		dialog "Чтобы пойти в пещеру Ньяил, "
		dialog "отправляйтесь на Председателя "
		dialog "фестиваля. "
		wait
		dialog "[Орчо отвечает за лапшу]"
		dialog "Вода кипит, так что приходите и "
		dialog "уходите! "
		completequest 14706
		setquest 14698
		close
		return
	break
	case 2
		dialog "[Орчо отвечает за лапшу]"
		dialog "Вы заняты? Да, приходи, когда "
		dialog "будет свободное время. Лапша ждёт "
		dialog "всех! "
		close
		return
	break
	endchoose
elseif (noodle_14698 == 1)
	if ((v[Thin_Noodle] > 9) & (v[Pig_Potato] > 2))
		dialog "[Орчо отвечает за лапшу]"
		dialog "Вы принесли длинную лапшу и "
		dialog "свиной картофель? Этот ароматный "
		dialog "запах! Теперь мне нужно сварить "
		dialog "лапшу. Если отварить его в чистой "
		dialog "морской воде, приправлять "
		dialog "отдельно не нужно. "
		wait
		// ShowEffect "кипящий котел # 17_add01" EF_DRAGONSMOKE
		dialog "[Орчо отвечает за лапшу]"
		dialog "Похоже, лапша сегодня будет "
		dialog "мягкая и крепкая. "
		wait
		// ShowEffect "кипящий котел # 17_add01" EF_DRAGONSMOKE
		dialog "[Орчо отвечает за лапшу]"
		dialog "Все варено! Чем больше вы варите, "
		dialog "тем мягче становится! "
		wait
		// ShowEffect "кипящий котел # 17_add01" EF_DRAGONSMOKE
		dialog "[Орчо отвечает за лапшу]"
		dialog "Теперь смешайте его с томатным "
		dialog "соусом. "
		wait
		// ShowEffect "кипящий котел # 17_add01" EF_DRAGONSMOKE
		dialog "[Орчо отвечает за лапшу]"
		dialog "дже! Все готово !!"
		wait
		// ShowEffect "кипящий котел # 17_add01" EF_HEARTCASTING
		dialog "[Орчо отвечает за лапшу]"
		dialog "Приятного аппетита! Если вам "
		dialog "нужно больше лапши ^0000cd^000000, принесите "
		dialog "длинную лапшу ^0000cdи немного денег^000000, и "
		dialog "мы накатим еще. "
		wait
		dialog "[Орчо отвечает за лапшу]"
		dialog "Хорошо, вот Койн."
		completequest 14698
		dropitem Thin_Noodle 10
		dropitem Pig_Potato 3
		setquest 14699
		setquest 14710
		completequest 14710
		getitem Noodle_Festa_Coupon 5
		getitem Tamato_Noodle 5
		var noodle_14710 = isbegin_quest 14710
		var noodle_14711 = isbegin_quest 14711
		var noodle_14712 = isbegin_quest 14712
		var noodle_14713 = isbegin_quest 14713
		if ((noodle_14710 == 2) & (noodle_14711 == 2) & (noodle_14712 == 2) & (noodle_14713 == 2))
			wait
			dialog "[Орчо отвечает за лапшу]"
			dialog "Эээ... Вы завершили все "
			dialog "сегодняшние мероприятия? Затем "
			dialog "вам нужно "
			dialog "<NAVI>_[Получение_купона]_<INFO> "
			dialog "malangdo, 141,155,000,0, </INFO> "
			dialog "</NAVI>! "
		endif
		close
		return
	else
		dialog "[Орчо отвечает за лапшу]"
		dialog "ты здесь Но запаха нет? "
		dialog "^0000cdНебольшой водоворот^000000 Если вы "
		dialog "возьмете с собой "
		dialog "^0000cd10 длинных макарон^000000 и "
		dialog "^0000cd3 картофеля со свининой^000000, мы "
		dialog "приготовим вкусную томатную "
		dialog "лапшу. До свидания! "
		close
		return
	endif
elseif (noodle_14699 == 1)
	if (time_check01 == 2)
		dialog "[Орчо отвечает за лапшу]"
		dialog "Эм-м-м? Вы здесь, потому что "
		dialog "хотите еще томатной лапши? Или вы "
		dialog "хотите принять участие в "
		dialog "мероприятии по приготовлению "
		dialog "лапши? "
		wait
		choose menu "Участвуйте в мероприятиях по лапше " "Купите еще лапши "
		case 1
			dialog "[Орчо отвечает за лапшу]"
			dialog "Томатная лапша действительно "
			dialog "хороша, не так ли? Однажды съев "
			dialog "его, вы никогда не забудете его! "
			dialog "Если сегодня принесете 10 длинных "
			dialog "и длинных макарон "
			dialog "^0000cdи 3 свиных картофеля^000000, мы скатаем "
			dialog "лапшу прямо на месте! "
			erasequest 14699
			recall_completequest 14698
			close
			return
		break
		case 2
			dialog "[Орчо отвечает за лапшу]"
			dialog "Томатная лапша действительно "
			dialog "хороша, не так ли? "
			dialog "^0000cdЕсли вы дадите мне 10 длинных макарон, 3 картофеля со свининой и 5000 дженни^000000, "
			dialog "я дам вам еще одну миску. Сколько "
			dialog "людей тебе нужно? "
			dialog "^0000cdОдновременно можно приготовить до 10 порций^000000. "
			dialog " "
			wait
			dlgwrite 1 10
			if input == 0
				dialog "[Орчо отвечает за лапшу]"
				dialog "О, ты не слишком много думаешь? "
				dialog "Приходи, когда захочешь лапши. "
				close
				return
			elseif error
				dialog "[Орчо отвечает за лапшу]"
				dialog "^0000cd До 10 порций за раз^000000. Горшок не "
				dialog "такой уж и большой. "
				close
				return
			else
				var get_moy = input * 5000
				var now_noo = v[Thin_Noodle]
				var now_ptt = v[Pig_Potato]
				var do_noo = input * 10
				var do_ptt = input * 3
				if (v[VAR_MONEY] < get_moy) 
					dialog "[Орчо отвечает за лапшу]"
					dialog "У тебя мало денег. На порцию "
					dialog "^0000cd1 требуется 5000 дженни, 10 длинных макаронных изделий и 3 картофеля со свининой^000000. "
					dialog " "
					close
					return
				elseif (now_noo < do_noo)
					dialog "[Орчо отвечает за лапшу]"
					dialog "Вам не хватает длинной и тонкой "
					dialog "лапши. На порцию "
					dialog "^0000cd1 требуется 5000 дженни, 10 длинных макаронных изделий и 3 картофеля со свининой^000000. "
					dialog " "
					close
					return
				elseif (now_ptt < do_ptt)
					dialog "[Орчо отвечает за лапшу]"
					dialog "Свинина Картофеля мало. На порцию "
					dialog "^0000cd1 требуется 5000 дженни, 10 длинных макаронных изделий и 3 картофеля со свининой^000000. "
					dialog " "
					close
					return
				else
					dialog "[Орчо отвечает за лапшу]"
					dialog "А вот и лапша из помидоров. "
					dialog "Наслаждайтесь и приходите снова! "
					dropgold get_moy
					dropitem Thin_Noodle do_noo
					dropitem Pig_Potato do_ptt
					getitem Tamato_Noodle input
					close
					return
				endif
			endif
		break
		endchoose
	else
		dialog "[Орчо отвечает за лапшу]"
		dialog "Эм-м-м? Вы здесь, потому что "
		dialog "хотите еще томатной лапши? Или вы "
		dialog "примете участие в мероприятии, "
		dialog "где принесете длинную и тонкую "
		dialog "лапшу? "
		wait
		choose menu "Купите еще лапши " "Участвуйте в мероприятиях по лапше "
		case 1
			dialog "[Орчо отвечает за лапшу]"
			dialog "Томатная лапша действительно "
			dialog "хороша, не так ли? "
			dialog "^0000cdЕсли вы дадите мне 10 длинных макарон, 3 картофеля со свининой и 5000 дженни^000000, "
			dialog "я дам вам еще одну миску. Сколько "
			dialog "людей тебе нужно? "
			dialog "^0000cdОдновременно можно приготовить до 10 порций^000000. "
			dialog " "
			wait
			dlgwrite 1 10
			if input == 0
				dialog "[Орчо отвечает за лапшу]"
				dialog "О, ты не слишком много думаешь? "
				dialog "Приходи, когда захочешь лапши. "
				close
				return
			elseif error
				dialog "[Орчо отвечает за лапшу]"
				dialog "^0000cd До 10 порций за раз^000000. Горшок не "
				dialog "такой уж и большой. "
				close
				return
			else
				var get_moy = input * 5000
				var now_noo = v[Thin_Noodle]
				var now_ptt = v[Pig_Potato]
				var do_noo = input * 10
				var do_ptt = input * 3
				if (v[VAR_MONEY] < get_moy) 
					dialog "[Орчо отвечает за лапшу]"
					dialog "У тебя мало денег. На порцию "
					dialog "^0000cd1 требуется 5000 дженни, 10 длинных макаронных изделий и 3 картофеля со свининой^000000. "
					dialog " "
					close
					return
				elseif (now_noo < do_noo)
					dialog "[Орчо отвечает за лапшу]"
					dialog "Вам не хватает длинной и тонкой "
					dialog "лапши. На порцию "
					dialog "^0000cd1 требуется 5000 дженни, 10 длинных макаронных изделий и 3 картофеля со свининой^000000. "
					dialog " "
					close
					return
				elseif (now_ptt < do_ptt)
					dialog "[Орчо отвечает за лапшу]"
					dialog "Свинина Картофеля мало. На порцию "
					dialog "^0000cd1 требуется 5000 дженни, 10 длинных макаронных изделий и 3 картофеля со свининой^000000. "
					dialog " "
					close
					return
				else
					dialog "[Орчо отвечает за лапшу]"
					dialog "А вот и лапша из помидоров. "
					dialog "Наслаждайтесь и приходите снова! "
					dropgold get_moy
					dropitem Thin_Noodle do_noo
					dropitem Pig_Potato do_ptt
					getitem Tamato_Noodle input
					close
					return
				endif
			endif
		break
		case 2
			dialog "[Орчо отвечает за лапшу]"
			dialog "Однако сегодняшнее мероприятие "
			dialog "все еще готовится. Воду тоже "
			dialog "нужно время, чтобы закипеть. "
			dialog "Пожалуйста, вернись после "
			dialog "рассвета. "
			close
			return
		break
		endchoose
	endif
elseif (noodle_14706 == 2)
	dialog "[Орчо отвечает за лапшу]"
	dialog "Эм-м-м? Вы здесь, потому что "
	dialog "хотите еще томатной лапши? Или вы "
	dialog "хотите принять участие в "
	dialog "мероприятии по приготовлению "
	dialog "лапши? "
	wait
	choose menu "Участвуйте в мероприятиях по лапше " "Купите еще лапши "
	case 1
		dialog "[Орчо отвечает за лапшу]"
		dialog "Томатная лапша действительно "
		dialog "хороша, не так ли? Однажды съев "
		dialog "его, вы никогда не забудете его! "
		dialog "Если сегодня принесете 10 длинных "
		dialog "и длинных макарон "
		dialog "^0000cdи 3 свиных картофеля^000000, мы скатаем "
		dialog "лапшу прямо на месте! "
		erasequest 14699
		recall_completequest 14698
		close
		return
	break
	case 2
		dialog "[Орчо отвечает за лапшу]"
		dialog "Томатная лапша действительно "
		dialog "хороша, не так ли? "
		dialog "^0000cdЕсли вы дадите мне 10 длинных макарон, 3 картофеля со свининой и 5000 дженни^000000, "
		dialog "я дам вам еще одну миску. Сколько "
		dialog "людей тебе нужно? "
		dialog "^0000cdОдновременно можно приготовить до 10 порций^000000. "
		dialog " "
		wait
		dlgwrite 1 10
		if input == 0
			dialog "[Орчо отвечает за лапшу]"
			dialog "О, ты не слишком много думаешь? "
			dialog "Приходи, когда захочешь лапши. "
			close
			return
		elseif error
			dialog "[Орчо отвечает за лапшу]"
			dialog "^0000cd До 10 порций за раз^000000. Горшок не "
			dialog "такой уж и большой. "
			close
			return
		else
			var get_moy = input * 5000
			var now_noo = v[Thin_Noodle]
			var now_ptt = v[Pig_Potato]
			var do_noo = input * 10
			var do_ptt = input * 3
			if (v[VAR_MONEY] < get_moy) 
				dialog "[Орчо отвечает за лапшу]"
				dialog "У тебя мало денег. На порцию "
				dialog "^0000cd1 требуется 5000 дженни, 10 длинных макаронных изделий и 3 картофеля со свининой^000000. "
				dialog " "
				close
				return
			elseif (now_noo < do_noo)
				dialog "[Орчо отвечает за лапшу]"
				dialog "Вам не хватает длинной и тонкой "
				dialog "лапши. На порцию "
				dialog "^0000cd1 требуется 5000 дженни, 10 длинных макаронных изделий и 3 картофеля со свининой^000000. "
				dialog " "
				close
				return
			elseif (now_ptt < do_ptt)
				dialog "[Орчо отвечает за лапшу]"
				dialog "Свинина Картофеля мало. На порцию "
				dialog "^0000cd1 требуется 5000 дженни, 10 длинных макаронных изделий и 3 картофеля со свининой^000000. "
				dialog " "
				close
				return
			else
				dialog "[Орчо отвечает за лапшу]"
				dialog "А вот и лапша из помидоров. "
				dialog "Наслаждайтесь и приходите снова! "
				dropgold get_moy
				dropitem Thin_Noodle do_noo
				dropitem Pig_Potato do_ptt
				getitem Tamato_Noodle input
				close
				return
			endif
		endif
	break
	endchoose
else
	dialog "[Орчо отвечает за лапшу]"
	dialog "Как насчет вкусной томатной "
	dialog "лапши? Вкус вареной на месте в "
	dialog "чистой морской воде, залитой "
	dialog "свежим томатным соусом! Не "
	dialog "покупайте тарелку лапши! "
	close
	return
endif
return


npc "malangdo" "помощник леща # 17_add01" 4_CAT_SAILOR1 183 221 5 5 5

OnInit:
	AddQuestIDCondition 14700
	SetQuestConditionBegin 14700 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionQuest 14700 0
	SetQuestConditionEnd
	
	AddQuestIDCondition 14700
	SetQuestConditionBegin 14700 1 0
	SetQuestConditionQuest 14700 2
	SetQuestConditionItem 23362 0 "<"
	SetQuestConditionEnd
	
	AddQuestIDCondition 14701
	SetQuestConditionBegin 14701 1 0 
	SetQuestConditionQuest 14701 2
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "помощник леща#17_add01" "Обязательно попробуйте картофель со свининой! Верьте в картофель со свининой!"
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Если вы хотите собрать свиной "
		dialog "картофель, неплохо было бы "
		dialog "немного снизить нагрузку! "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
var noodle_14700 = isbegin_quest 14700 
var noodle_14701 = isbegin_quest 14701 
var noodle_14707 = isbegin_quest 14707 
var hunt_chek01 = checkquest_hunting 14700
var time_check01 = checkquest_playtime 14701

if (noodle_14707 == 1)
	dialog "[помощник леща]"
	dialog "Вы участник фестиваля! Если бы "
	dialog "мне пришлось выбирать лучшую еду "
	dialog "в мире, конечно, это "
	dialog "^0000cdСвиной картофель^000000! "
	wait
	dialog "[помощник леща]"
	dialog "Авантюрист, ты должен съесть "
	dialog "свинину с картошкой! Верьте в "
	dialog "картофель со свининой! Свинина "
	dialog "Картофель никогда не предаст "
	dialog "искателей приключений! "
	wait
	dialog "[помощник леща]"
	dialog "Вы, должно быть, были в пещере "
	dialog "Ньяил, знаете ли вы, как ее "
	dialog "получить? Разве изюминкой "
	dialog "спортивного состязания не станет "
	dialog "дерево Бактера? Возьмите ^0000cdNylo^000000 и "
	dialog "принесите картофель со свининой, "
	dialog "который сеет Nyilo! "
	wait
	dialog "[помощник леща]"
	dialog "Не расстраивайтесь, если у вас "
	dialog "нет Nyilo, когда вы посетите "
	dialog "пещеру Nyail. Это будет быстро "
	dialog "воспроизведено. "
	wait
	choose menu "хорошо!" "Мне это сейчас не нравится."
	case 1
		dialog "[помощник леща]"
		dialog "Только один ^0000cd^000000 подойдет! Чтобы "
		dialog "отправиться в пещеру Ньяил, "
		dialog "скажите "
		dialog "<NAVI>_[Председателю_фестиваля]_<INFO>malangdo,133,170,000,0,</INFO> "
		dialog "</NAVI>, и он пришлет вам это. "
		completequest 14707
		setquest 14700
		close
		return
	break
	case 2
		dialog "[помощник леща]"
		dialog "Почему??? Авантюрист, ты должен "
		dialog "съесть свинину с картошкой! "
		dialog "Верьте в картофель со свининой! "
		dialog "Свинина Картофель никогда не "
		dialog "предаст искателей приключений! "
		close
		return
	break
	endchoose
elseif (noodle_14700 == 1)
	if ((hunt_chek01 == 2) & (v[Pig_Potato] > 0))
		dialog "[помощник леща]"
		dialog "Вы собирали свиной картофель. "
		dialog "Этот красивый аромат, который "
		dialog "невозможно скрыть, даже если вы "
		dialog "носите его в кармане! Свинина "
		dialog "Картофель высшего сорта. "
		wait
		dialog "[помощник леща]"
		dialog "Эта свиная картошка, принесенная "
		dialog "авантюристом, будет использована, "
		dialog "чтобы рассказать миру о вкусе "
		dialog "свинины. Спасибо! Хорошо, вот "
		dialog "Койн. "
		completequest 14700
		dropitem Pig_Potato 1
		setquest 14701
		setquest 14711
		completequest 14711
		getitem Noodle_Festa_Coupon 5
		var noodle_14710 = isbegin_quest 14710
		var noodle_14711 = isbegin_quest 14711
		var noodle_14712 = isbegin_quest 14712
		var noodle_14713 = isbegin_quest 14713
		if ((noodle_14710 == 2) & (noodle_14711 == 2) & (noodle_14712 == 2) & (noodle_14713 == 2))
			wait
			dialog "[помощник леща]"
			dialog "Ух ты! Вы завершили все события "
			dialog "дня! "
			dialog "<NAVI>_Давай,_[Получение_купона]_<INFO> "
			dialog "malangdo, 141,155,000,0, </INFO> "
			dialog "</NAVI>! "
		endif
		close
		return
	else
		dialog "[помощник леща]"
		dialog "Мы сделаем все возможное, чтобы "
		dialog "познакомить мир со вкусом "
		dialog "картофеля со свининой. Символ "
		dialog "изобилия, Картофель со свининой! "
		dialog "Поймай Найло и принеси картофель "
		dialog "со свининой, который дает тебе "
		dialog "Найло! "
		wait
		dialog "[помощник леща]"
		dialog "Не расстраивайтесь, если у вас "
		dialog "нет Nyilo, когда вы посетите "
		dialog "пещеру Nyail. Это будет быстро "
		dialog "воспроизведено. "
		wait
		dialog "[помощник леща]"
		dialog "С уверенностью могу сказать, что "
		dialog "это изюминка фестиваля! "
		close
		return
	endif
elseif (noodle_14701 == 1)
	if (time_check01 == 2)
		dialog "[помощник леща]"
		dialog "Хотели бы вы сделать "
		dialog "^0000cdPotato Harvest^000000 сегодня? "
		wait
		choose menu "Ага!!" "нет."
		case 1
			dialog "[помощник леща]"
			dialog "Мы сделаем все возможное, чтобы "
			dialog "познакомить мир со вкусом "
			dialog "картофеля со свининой. Символ "
			dialog "изобилия, Картофель со свининой! "
			dialog "Возьмите ^0000cdNylo^000000 и принесите "
			dialog "1^000000 ^0000cdСвиной картофель из Nyilo! "
			wait
			dialog "[помощник леща]"
			dialog "Не расстраивайтесь, если у вас "
			dialog "нет Nyilo, когда вы посетите "
			dialog "пещеру Nyail. Это будет быстро "
			dialog "воспроизведено. "
			wait
			dialog "[помощник леща]"
			dialog "Наслаждайтесь яркими событиями "
			dialog "фестиваля в свое удовольствие! "
			erasequest 14701
			recall_completequest 14700
			close
			return
		break
		case 2
			dialog "[помощник леща]"
			dialog "Обязательно попробуйте картофель "
			dialog "со свининой! Верьте в картофель "
			dialog "со свининой! Картофель из свинины "
			dialog "тебя не предаст! "
			close
			return
		break
		endchoose
	else
		dialog "[помощник леща]"
		dialog "Авантюрист, тебе уже понравились "
		dialog "сегодняшние моменты. Картофеля "
		dialog "свинины для праздника хватит "
		wait
		dialog "[помощник леща]"
		dialog "В это время открывается дорога к "
		dialog "пещере Ньяил, и Ньяйло постоянно "
		dialog "восстанавливается из пещеры "
		dialog "Ньяил, но слишком много "
		dialog "посетителей вредны. "
		wait
		dialog "[помощник леща]"
		dialog "Поэтому, пожалуйста, поймите, что "
		dialog "мы ограничиваем количество "
		dialog "посетителей в день. Хорошо "
		dialog "отдохните и завтра снова "
		dialog "насладитесь фестивалем! "
		close
		return
	endif
elseif (noodle_14707 == 2)
	dialog "[помощник леща]"
	dialog "Вы участник фестиваля! Если бы "
	dialog "мне пришлось выбирать лучшую еду "
	dialog "в мире, конечно, это "
	dialog "^0000cdСвиной картофель^000000! "
	wait
	dialog "[помощник леща]"
	dialog "Авантюрист, ты должен съесть "
	dialog "свинину с картошкой! Верьте в "
	dialog "картофель со свининой! Свинина "
	dialog "Картофель никогда не предаст "
	dialog "искателей приключений! "
	wait
	dialog "[помощник леща]"
	dialog "Вы, должно быть, были в пещере "
	dialog "Ньяил, знаете ли вы, как ее "
	dialog "получить? Разве изюминкой "
	dialog "спортивного состязания не станет "
	dialog "дерево Бактера? Возьмите ^0000cdNylo^000000 и "
	dialog "принесите картофель со свининой, "
	dialog "который сеет Nyilo! "
	wait
	dialog "[помощник леща]"
	dialog "Не расстраивайтесь, если у вас "
	dialog "нет Nyilo, когда вы посетите "
	dialog "пещеру Nyail. Это будет быстро "
	dialog "воспроизведено. "
	wait
	choose menu "хорошо!" "Мне это сейчас не нравится."
	case 1
		dialog "[помощник леща]"
		dialog "Только один ^0000cd^000000 подойдет! Чтобы "
		dialog "отправиться в пещеру Ньяил, "
		dialog "скажите "
		dialog "<NAVI>_[Председателю_фестиваля]_<INFO>malangdo,133,170,000,0,</INFO> "
		dialog "</NAVI>, и он пришлет вам это. "
		completequest 14707
		recall_completequest 14700
		close
		return
	break
	case 2
		dialog "[помощник леща]"
		dialog "Почему??? Авантюрист, ты должен "
		dialog "съесть свинину с картошкой! "
		dialog "Верьте в картофель со свининой! "
		dialog "Свинина Картофель никогда не "
		dialog "предаст искателей приключений! "
		close
		return
	break
	endchoose
else
	dialog "[помощник леща]"
	dialog "Если вам нужно выбрать лучшую еду "
	dialog "в мире, конечно же, свинину и "
	dialog "картофель! Все, вы должны есть "
	dialog "свинину с картошкой! Верьте в "
	dialog "картофель со свининой! Картофель "
	dialog "из свинины тебя не предаст! "
	close
	return
endif
return



npc "malangdo" "пухлый # 17_wamel" WATERMELON 198 217 3 0 0
npc "malangdo" "опухший # 17_wamel" WATERMELON 199 216 3 1 1
OnTouch2:
	Talk2me "пухлый#17_wamel" "Семя! Семя! Посейте семена "
	DelayTime 1000
	Talk2me "опухший#17_wamel" "точно! точно! Я дал тебе воду!"
	DelayTime 1000
	Talk2me "Daeng Daeng Daeng#17_wamel" "с ночевкой! две ночи! Тссс ~"
	DelayTime 1000
	Talk2me "пухлый#17_wamel" "пухлый!"
	Talk2me "опухший#17_wamel" "опухший!"
	Talk2me "Daeng Daeng Daeng#17_wamel" "Daeng Daeng Daeng!"
	DelayTime 1000
	Talk2me "пухлый#17_wamel" "У меня арбуз!"
	Talk2me "опухший#17_wamel" "У меня арбуз!"
	Talk2me "Daeng Daeng Daeng#17_wamel" "У меня арбуз!"
return
npc "malangdo" "Даенг Даенг Даенг # 17_wamel" WATERMELON 199 215 3 0 0
npc "malangdo" "крутой арбуз # 17_wamel" WATERMELON 195 235 3 5 5
OnTouch2:
	Talk2me "крутой арбуз#17_wamel" "Это арбуз, у которого есть кол. не трогай это Охлаждение. - Лами -"
return

npc "malangdo" "Модератор Рами # 17_add01" 4_CAT_SAILOR2 196 217 3 5 5

OnInit:
	AddQuestIDCondition 14702
	SetQuestConditionBegin 14702 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionQuest 14702 0
	SetQuestConditionEnd
	
	AddQuestIDCondition 14702
	SetQuestConditionBegin 14702 1 0
	SetQuestConditionQuest 14702 2
	SetQuestConditionItem 25367 9 "<"
	SetQuestConditionEnd
	
	AddQuestIDCondition 14703
	SetQuestConditionBegin 14703 1 0 
	SetQuestConditionQuest 14703 2
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "Модератор Рами#17_add01" "Как насчет крутой арбуз пудинг?"
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Если вы хотите собрать свиной "
		dialog "картофель, неплохо было бы "
		dialog "немного снизить нагрузку! "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
var noodle_14702 = isbegin_quest 14702 
var noodle_14703 = isbegin_quest 14703 
var noodle_14708 = isbegin_quest 14708 
var hunt_chek01 = checkquest_hunting 14702
var time_check01 = checkquest_playtime 14703

if (noodle_14708 == 1)
	dialog "[Модератор Рами]"
	dialog "Доброе утро? Действительно жарко, "
	dialog "правда? Было бы хорошо, если бы в "
	dialog "такой день дул даже прохладный "
	dialog "морской бриз. Вы жаждете "
	dialog "прохладного бриза, который "
	dialog "освежит вас в жаркий летний день? "
	dialog " "
	wait
	dialog "[Модератор Рами]"
	dialog "После тарелки томатной лапши, как "
	dialog "насчет освежающего арбузного "
	dialog "пудинга^000000^000000? "
	wait
	dialog "[Модератор Рами]"
	dialog "Вы когда-нибудь получали "
	dialog "рекламный веер ^0000cd^000000, распространяемый "
	dialog "нашими агентами по связям с "
	dialog "общественностью в большом городе? "
	dialog "Разве мягкий запах арбуза не "
	dialog "восхитителен? Хитрость "
	dialog "заключается в том, чтобы зарыть "
	dialog "веер между арбузами. "
	wait
	dialog "[Модератор Рами]"
	dialog "Приходите и найдите рекламный "
	dialog "вентилятор ^0000cd^000000, похороненный в "
	dialog "арбузном поле! Те, кто найдет "
	dialog "^0000cd10 штук^000000, получат вкусный арбузный "
	dialog "пудинг ^0000cdи фестивальные монеты^000000! "
	wait
	choose menu "Обожаю арбуз!" "Я осмотрюсь."
	case 1
		dialog "[Модератор Рами]"
		dialog "^0000cd Спелый арбуз^000000 это ^0000cdNyail oyster^000000, а "
		dialog "здесь ^0000cdMalangdo^000000 Если найдешь, "
		dialog "хватай арбуз! Ой! Тугой! И "
		dialog "просыпайся круто! Снимает стресс "
		dialog "и находит долги! "
		completequest 14708
		setquest 14702
		close
		return
	break
	case 2
		dialog "[Модератор Рами]"
		dialog "Да, приходите, посмотрите вокруг. "
		dialog "Но у меня такое чувство, что мы "
		dialog "скоро увидимся снова! "
		close
		return
	break
	endchoose
elseif (noodle_14702 == 1)
	if ((hunt_chek01 == 2) & (v[Promotion_Fan] > 9))
		dialog "[Модератор Рами]"
		dialog "Вы пришли с долгами! Попробуйте "
		dialog "крутой арбуз пудинга! Если вы "
		dialog "будете участвовать в мероприятии "
		dialog "каждый день, вы получите "
		dialog "замечательный сувенир, поэтому, "
		dialog "пожалуйста, участвуйте каждый "
		dialog "день! Деловое свидание, встреча! "
		wait
		var 17_noo = v[gooksoo2]
		var noo_hop = 17_noo + 1
		if (v[gooksoo2] == 7)
			dialog "[Модератор Рами]"
			dialog "Теперь, как и обещал, дам "
			dialog "монетку... Если подумать, сегодня "
			dialog "7-й день! Я подарю вам особенный "
			dialog "сувенир !!! <ITEM> Одежда, фанат "
			dialog "летнего солнцестояния <INFO> "
			dialog "31304 </INFO> </ITEM>. "
			completequest 14702
			dropitem Promotion_Fan 10
			setquest 14703
			setquest 14712
			completequest 14712
			setitem gooksoo2 20
			getitem Noodle_Festa_Coupon 5
			getitem E_Watermelon_Pudding 5
			getitem C_Fan_Of_Summer 1
			wait
		elseif (v[gooksoo2] < 7)
			dialog "[Модератор Рами]"
			dialog "Теперь, как и обещал, дам вам "
			dialog "монетку... А вы знали, что если "
			dialog "вы передадите рекламный веер "
			dialog "PR-агенту в каждом городе, то "
			dialog "сможете сразу же прийти на "
			dialog "мероприятие? "
			completequest 14702
			dropitem Promotion_Fan 10
			setquest 14703
			setquest 14712
			completequest 14712
			setitem gooksoo2 noo_hop
			getitem Noodle_Festa_Coupon 5
			getitem E_Watermelon_Pudding 5
			wait
		else
			dialog "[Модератор Рами]"
			dialog "Теперь, как и обещал, дам вам "
			dialog "монетку... А вы знали, что если "
			dialog "вы передадите рекламный веер "
			dialog "PR-агенту в каждом городе, то "
			dialog "сможете сразу же прийти на "
			dialog "мероприятие? "
			completequest 14702
			dropitem Promotion_Fan 10
			setquest 14703
			setquest 14712
			completequest 14712
			getitem Noodle_Festa_Coupon 5
			getitem E_Watermelon_Pudding 5
			wait
		endif
		var noodle_14710 = isbegin_quest 14710
		var noodle_14711 = isbegin_quest 14711
		var noodle_14712 = isbegin_quest 14712
		var noodle_14713 = isbegin_quest 14713
		if ((noodle_14710 == 2) & (noodle_14711 == 2) & (noodle_14712 == 2) & (noodle_14713 == 2))
			dialog "[Модератор Рами]"
			dialog "Все события дня завершены! "
			dialog "<NAVI>_[Получение_купона]_<INFO> "
			dialog "malangdo, 141,155,000,0, </INFO> "
			dialog "</NAVI> Осталось только сделать! "
			wait
		endif
		dialog "[Модератор Рами]"
		dialog "Тогда увидимся снова завтра!"
		close
		return
	else
		dialog "[Модератор Рами]"
		dialog "Все ваши долги пропали? Или арбуз "
		dialog "пропал? ^0000cdСпелый арбуз^000000 - это "
		dialog "^0000cdoyster oyster^000000, но здесь ^0000cdMalangdo^000000 "
		dialog "везде, поэтому обязательно ищите "
		dialog "его. "
		wait
		dialog "[Модератор Рами]"
		dialog "Если разбить арбуз, можно собрать "
		dialog "10 фанатов ^0000cdв рекламных "
		dialog "целях! "
		close
		return
	endif
elseif (noodle_14703 == 1)
	if (time_check01 == 2)
		dialog "[Модератор Рами]"
		dialog "как это? Хотите сегодня круто "
		dialog "разбить арбуз? "
		wait
		choose menu "Вставай!" "немного сейчас..."
		case 1
			dialog "[Модератор Рами]"
			dialog "Спелые арбузы можно найти в "
			dialog "устрицах Ньяил или в поле "
			dialog "Малангдо, так что ищите их. "
			wait
			dialog "[Модератор Рами]"
			dialog "Если разбить спелый арбуз, можно "
			dialog "собрать 10 фанатов ^0000cdв "
			dialog "рекламных целях! "
			erasequest 14703
			recall_completequest 14702
			close
			return
		break
		case 2
			dialog "[Модератор Рами]"
			dialog "Если вы хотите попробовать "
			dialog "арбузный пудинг, приходите сюда в "
			dialog "любое время! "
			close
			return
		break
		endchoose
	else
		dialog "[Модератор Рами]"
		dialog "Вы проводите жаркое лето в "
		dialog "прохладе с арбузным пудингом? "
		dialog "Сегодняшнее мероприятие "
		dialog "закончилось. Я хочу дать тебе еще "
		dialog "арбузного пудинга, но не могу. "
		wait
		dialog "[Модератор Рами]"
		dialog "Почему бы вместо этого не сесть "
		dialog "на причал и не насладиться "
		dialog "морским бризом? Вам не кажется, "
		dialog "что вы вспомните те воспоминания, "
		dialog "которых у вас не было? Увидимся "
		dialog "завтра! "
		close
		return
	endif
elseif (noodle_14708 == 2)
	dialog "[Модератор Рами]"
	dialog "Доброе утро? Действительно жарко, "
	dialog "правда? Было бы хорошо, если бы в "
	dialog "такой день дул даже прохладный "
	dialog "морской бриз. Вы жаждете "
	dialog "прохладного бриза, который "
	dialog "освежит вас в жаркий летний день? "
	dialog " "
	wait
	dialog "[Модератор Рами]"
	dialog "После тарелки томатной лапши, как "
	dialog "насчет освежающего арбузного "
	dialog "пудинга^000000^000000? "
	wait
	dialog "[Модератор Рами]"
	dialog "Вы когда-нибудь получали "
	dialog "рекламный веер ^0000cd^000000, распространяемый "
	dialog "нашими агентами по связям с "
	dialog "общественностью в большом городе? "
	dialog "Разве мягкий запах арбуза не "
	dialog "восхитителен? Хитрость "
	dialog "заключается в том, чтобы зарыть "
	dialog "веер между арбузами. "
	wait
	dialog "[Модератор Рами]"
	dialog "Приходите и найдите рекламный "
	dialog "вентилятор ^0000cd^000000, похороненный в "
	dialog "арбузном поле! Те, кто найдет "
	dialog "^0000cd10 штук^000000, получат вкусный арбузный "
	dialog "пудинг ^0000cdи фестивальные монеты^000000! "
	wait
	choose menu "Обожаю арбуз!" "Я осмотрюсь."
	case 1
		dialog "[Модератор Рами]"
		dialog "^0000cd Спелый арбуз^000000 это ^0000cdNyail oyster^000000, а "
		dialog "здесь ^0000cdMalangdo^000000 Если найдешь, "
		dialog "хватай арбуз! Ой! Тугой! И "
		dialog "просыпайся круто! Снимает стресс "
		dialog "и находит долги! "
		completequest 14708
		recall_completequest 14702
		close
		return
	break
	case 2
		dialog "[Модератор Рами]"
		dialog "Да, приходите, посмотрите вокруг. "
		dialog "Но у меня такое чувство, что мы "
		dialog "скоро увидимся снова! "
		close
		return
	break
	endchoose
else
	dialog "[Модератор Рами]"
	dialog "Вы жаждете прохладного бриза в "
	dialog "жаркий летний день? Как насчет "
	dialog "сладкого пудинга крутой арбуз "
	dialog "после тарелки томатной лапши? "
	close
	return
endif
return



npc "malangdo" "корона # 17_add01" 4_F_HUGIRL 138 235 3 0 0

OnInit:
	AddQuestIDCondition 14704
	SetQuestConditionBegin 14704 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionQuest 14704 0
	SetQuestConditionEnd
	
	AddQuestIDCondition 14704
	SetQuestConditionBegin 14704 1 0
	SetQuestConditionQuest 14704 1
	SetQuestConditionItem 25344 9 "<"
	SetQuestConditionEnd
	
	AddQuestIDCondition 14705
	SetQuestConditionBegin 14705 1 0 
	SetQuestConditionQuest 14705 2
	SetQuestConditionEnd
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[корона]"
		dialog "Похоже, у меня слишком много "
		dialog "багажа, ты в порядке? "
		close
		return
	else
	endif

var name = PcName
var noodle_14697 = isbegin_quest 14697 
var noodle_14704 = isbegin_quest 14704 
var noodle_14705 = isbegin_quest 14705 
var noodle_14709 = isbegin_quest 14709 
var time_check01 = checkquest_playtime 14705

if (noodle_14709 == 1)
	dialog "[Мама]"
	dialog "Ой, он просто сдвинулся!"
	wait
	dialog "[Папа]"
	dialog "Шшш! Будь спокоен! Тогда я снова "
	dialog "буду скучать! "
	wait
	dialog "[Мама]"
	dialog "Ой, посмотрите внимательно!"
	wait
	dialog "[Папа]"
	dialog "Если вы достаточно знаете о "
	dialog "рыбалке, вам стоит попробовать! "
	dialog "Ловля во рту - номер один! Лучший "
	dialog "в мире! "
	wait
	dialog "[корона]"
	dialog "Ух... Почему взрослые так хорошо "
	dialog "дерутся? Я не понимаю. "
	wait
	dialog "[Мама]"
	dialog "Там, корона дети? Кто виноват во "
	dialog "всем этом? "
	wait
	dialog "[Папа]"
	dialog "Мама Потому что кто виноват, что "
	dialog "папа рыбачил здесь несколько "
	dialog "дней? "
	wait
	dialog "[корона]"
	dialog "Мне!!"
	wait
	dialog "[Мама]"
	dialog "Разве ты не гордишься?"
	wait
	dialog "[корона]"
	dialog "Ага!!"
	wait
	dialog "[Папа]"
	dialog "Итак, чтобы рыба не убежала, что "
	dialog "нам делать корона? "
	wait
	dialog "[корона]"
	dialog "Будь спокоен!"
	wait
	dialog "[Папа]"
	dialog "верно? Ой, джи снова движется!"
	wait
	dialog "[Мама]"
	dialog "Пожалуйста, подождите!"
	wait
	choose menu "Малыш, что происходит?"
	case 1
	break
	endchoose
	dialog "[корона]"
	dialog "Я не могу сейчас говорить."
	wait
	choose menu "ОК. Просто поговори со мной тихо."
	case 1
	break
	endchoose
	dialog "[корона]"
	dialog "Авантюристы, вам нравится это "
	dialog "место? Мне это не нравится. Мама "
	dialog "Папа посоветовал нам поехать в "
	dialog "отпуск в Малангдо, потому что "
	dialog "сейчас лето. "
	wait
	dialog "[корона]"
	dialog "Я хотел уйти в холодное место, "
	dialog "поэтому попросил его пойти к "
	dialog "Рутье, и он сказал, что это было "
	dialog "решено голосованием. Я был глуп. "
	dialog "2 голоса за Малангдо и 1 голос за "
	dialog "Рутье. Итак, меня привели сюда. "
	wait
	dialog "[корона]"
	dialog "Меня раздражает то, что я ем "
	dialog "томатную лапшу, арбузный пудинг и "
	dialog "жару. Но какая рыба в мире "
	dialog "ловится на удочки начинающих "
	dialog "рыболовов? "
	wait
	choose menu "должно быть было скучно "
	case 1
	break
	endchoose
	dialog "[корона]"
	dialog "Да. Я бросил камень, чтобы "
	dialog "попасть в море. Затем произошло "
	dialog "нечто удивительное! Камень "
	dialog "побежал по воде, затем погрузился "
	dialog "в воду и спрятался! "
	wait
	choose menu "Водоснабжение!"
	case 1
	break
	endchoose
	dialog "[корона]"
	dialog "Мама Папа сказал то же самое. Но "
	dialog "я знаю. Это было, фея морского "
	dialog "камня вернулась домой! "
	wait
	dialog "[корона]"
	dialog "И понял шокирующий факт. Чем он "
	dialog "округлее и ровнее, тем дольше он "
	dialog "проработает! Я искал такой "
	dialog "камень, но нигде не нашел. "
	wait
	dialog "[корона]"
	dialog "Но искатель приключений знает, "
	dialog "что синяя птица в нашем доме, "
	dialog "верно? "
	wait
	choose menu "эээ, может быть?"
	case 1
	break
	endchoose
	dialog "[корона]"
	dialog "Именно так выглядел синий камень "
	dialog "на воротнике нашей Мамы. Я удалил "
	dialog "все украшения ^0000cdи отдал их^000000. "
	wait
	dialog "[корона]"
	dialog "Мама праздно ловила рыбу, когда "
	dialog "увидела уходящий в воду камень и "
	dialog "закричала. Папа меня отругал. Но "
	dialog "мне очень жаль. Камень тоже хотел "
	dialog "вернуть в море. "
	wait
	dialog "[корона]"
	dialog "Авантюрист, ты думаешь, я был "
	dialog "неправ? "
	wait
	choose menu "Если Мама расстроилась, вы ошибались."
	case 1
	break
	endchoose
	dialog "[корона]"
	dialog "Верно. Я ошибался."
	wait
	choose menu "Но почему ты ловишь рыбу?"
	case 1
	break
	endchoose
	dialog "[корона]"
	dialog "Ой, вот и все! Незадолго до того, "
	dialog "как камень исчез в воде, "
	dialog "несколько рыб, похожих на змею "
	dialog "длиной ^0000cd, проглотили камень^000000. Я, "
	dialog "должно быть, принял его за еду, "
	dialog "потому что он был игристым. "
	wait
	dialog "[корона]"
	dialog "Думаю, было бы быстрее просто "
	dialog "пойти в воду, поймать рыбу и "
	dialog "заглянуть внутрь живота. "
	wait
	choose menu "Ты умеешь плавать?"
	case 1
	break
	endchoose
	dialog "[корона]"
	dialog "нет!"
	wait
	choose menu "Так что насчет отца и матери?"
	case 1
	break
	endchoose
	dialog "[корона]"
	dialog "нет! Но вы можете спросить "
	dialog "кого-нибудь, кто в этом хорош! "
	wait
	choose menu "Вы действительно думаете, что мир прост."
	case 1
	break
	endchoose
	dialog "[корона]"
	dialog "Мой папа Мама тоже сказал мне "
	dialog "это. Но разве это не эффективнее, "
	dialog "чем сидеть на рыбалке, где нельзя "
	dialog "поймать улов? "
	wait
	dialog "[корона]"
	dialog "Так, кстати, Adventurer умеет "
	dialog "плавать? "
	wait
	choose menu "Должен ли я "
	case 1
	break
	endchoose
	dialog "[корона]"
	dialog "Было бы неплохо сделать Если вы "
	dialog "это сделаете, я дам "
	dialog "вам^000000 монет, которые у вас есть^000000. "
	dialog "Мама Мой папа весь день ловит "
	dialog "рыбу, и единственное, что я могу "
	dialog "делать, когда мне скучно, - это "
	dialog "фестивальное мероприятие. "
	wait
	dialog "[корона]"
	dialog "Но мне эта монета не нужна..."
	wait
	choose menu "Как выглядит этот камень?" "Сейчас это сложно."
	case 1
		dialog "[корона]"
		dialog "Это круглый плоский "
		dialog "камень^000000, излучающий синий свет. Название рыбы - морской червь, но обычно она обитает в яме ^0000cd^000000. "
		dialog "Говорят, дождевому червю нравится "
		dialog "такая еда. "
		wait
		dialog "[корона]"
		dialog "Так что, если вы посмотрите, что "
		dialog "вы ели, вы найдете много камней, "
		dialog "которые выглядят именно так. Вы "
		dialog "можете принести мне только около "
		dialog "10 ^0000cd^000000? Я выберу среди них "
		dialog "настоящую. "
		wait
		choose menu "У вас есть странно умный уголок?"
		case 1
		break
		endchoose
		dialog "[корона]"
		dialog "Я часто это слышу. Ну что ж, "
		dialog "пожалуйста! "
		completequest 14709
		setquest 14704
		close
		return
	break
	case 2
		dialog "[корона]"
		dialog "Хорошо? Тогда ничего не "
		dialog "поделаешь. Все, что я могу "
		dialog "сделать, это продолжать убивать "
		dialog "себя здесь... До свидания, "
		dialog "искатель приключений. "
		close
		return
	break
	endchoose
elseif (noodle_14704 == 1)
	if (v[Flat_Round_Stone] > 9)
		dialog "[Папа]"
		dialog "Нет, что это за рыба?"
		wait
		dialog "[Мама]"
		dialog "Я тоже не знаю. Но это не та "
		dialog "рыба, которую мы ищем. "
		wait
		dialog "[Папа]"
		dialog "Давай отпусти меня"
		wait
		dialog "[корона]"
		dialog "Эм-м-м? Авантюрист! Я думал, что "
		dialog "он мертв, потому что он не "
		dialog "пришел. "
		wait
		choose menu "Я не умру так легко."
		case 1
		break
		endchoose
		dialog "[корона]"
		dialog "Ты принес камни?"
		wait
		choose menu "Это среди этих камней?"
		case 1
		break
		endchoose
		dialog "[корона]"
		dialog "Поскольку это любимый предмет "
		dialog "Мамы, может, вы не узнаете его с "
		dialog "первого взгляда? Большое вам "
		dialog "спасибо, искатель приключений. Я "
		dialog "дам вам монеты, как и обещал. "
		wait
		choose menu "Не знаю, выдержу ли."
		case 1
		break
		endchoose
		dialog "[корона]"
		dialog "Я все равно получу это. И мне это "
		dialog "особо не нужно. "
		wait
		choose menu "спасибо, я получу это "
		case 1
		break
		endchoose
		dialog "[корона]"
		dialog "Пожалуйста, приходи завтра, на "
		dialog "всякий случай. "
		completequest 14704
		dropitem Flat_Round_Stone 10
		setquest 14705
		setquest 14713
		completequest 14713
		getitem Noodle_Festa_Coupon 5
		var noodle_14710 = isbegin_quest 14710
		var noodle_14711 = isbegin_quest 14711
		var noodle_14712 = isbegin_quest 14712
		var noodle_14713 = isbegin_quest 14713
		if ((noodle_14710 == 2) & (noodle_14711 == 2) & (noodle_14712 == 2) & (noodle_14713 == 2))
			wait
			dialog "[корона]"
			dialog "Ой, погоди! Авантюрист, посмотри "
			dialog "на это! Я делал все сегодняшние "
			dialog "мероприятия! "
			dialog "<NAVI>_[Получение_купона]_<INFO> "
			dialog "malangdo, 141,155,000,0, </INFO> "
			dialog "</NAVI> Я должен. тогда привет "
		endif
		close
		return
	else
		dialog "[корона]"
		dialog "Авантюрист, твой карман выглядит "
		dialog "таким легким. Камней нет? Если вы "
		dialog "ловите морских червей, вы можете "
		dialog "получить круглые и плоские камни "
		dialog "^0000cd^000000, но, пожалуйста, принесите их не "
		dialog "более ^0000cd10 штук^000000. "
		close
		return
	endif
elseif (noodle_14705 == 1)
	if (time_check01 == 2)
		dialog "[корона]"
		dialog "Среди камней, которые авантюрист "
		dialog "принес мне в прошлый раз, броши "
		dialog "Мамы не было! Вы можете принести "
		dialog "это снова сегодня? "
		wait
		choose menu "хорошо. Я принесу это тебе." "Я немного занята сейчас."
		case 1
			dialog "[корона]"
			dialog "Ага! Тогда вам будет очень "
			dialog "приятно! Это плоский валун, "
			dialog "который можно получить, ловя "
			dialog "морских червей ^0000cd! 10^000000 лет! "
			erasequest 14705
			recall_completequest 14704
			close
			return
		break
		case 2
			dialog "[корона]"
			dialog "Что ж... Тогда тебе обязательно "
			dialog "стоит прийти, когда ты не занят. "
			dialog "Деловое свидание, встреча! "
			close
			return
		break
		endchoose
	else
		dialog "[Папа]"
		dialog "Как насчет этого? Да?"
		wait
		dialog "[Мама]"
		dialog "Это... это не так. Вздох..."
		wait
		dialog "[Папа]"
		dialog "Так много, без брошей?"
		wait
		dialog "[Мама]"
		dialog "Я еще не просмотрел их все, "
		dialog "поэтому, пожалуйста, "
		dialog "сосредоточьтесь на своей рыбалке. "
		dialog " "
		wait
		dialog "[Папа]"
		dialog "ОК."
		wait
		dialog "[корона]"
		dialog "Я все время смотрю на плоский "
		dialog "валун, который мне принес "
		dialog "авантюрист. Мама даже не узнает "
		dialog "брошь Мамы. В этом случае ни один "
		dialog "камень не имел бы значения. "
		wait
		dialog "[Мама]"
		dialog "корона?"
		wait
		dialog "[корона]"
		dialog "Ага!!"
		wait
		dialog "[Мама]"
		dialog "Мама Вы можете мне помочь?"
		wait
		dialog "[корона]"
		dialog "Ага!!! Авантюрист, придете ли вы "
		dialog "снова после рассвета? "
		close
		return
	endif
elseif (noodle_14709 == 2)
	dialog "[корона]"
	dialog "Среди камней, которые авантюрист "
	dialog "принес мне в прошлый раз, броши "
	dialog "Мамы не было! Вы можете принести "
	dialog "это снова сегодня? "
	wait
	choose menu "хорошо. Я принесу это тебе." "Я немного занята сейчас."
	case 1
		dialog "[корона]"
		dialog "Ага! Тогда вам будет очень "
		dialog "приятно! Это плоский валун, "
		dialog "который можно получить, ловя "
		dialog "морских червей ^0000cd! 10^000000 лет! "
		erasequest 14705
		recall_completequest 14704
		close
		return
	break
	case 2
		dialog "[корона]"
		dialog "Что ж... Тогда тебе обязательно "
		dialog "стоит прийти, когда ты не занят. "
		dialog "Деловое свидание, встреча! "
		close
		return
	break
	endchoose
else
	dialog "[корона]"
	dialog "Итак, поехали в Лютиру ~"
	close
	return
endif
return


npc "malangdo" "Мама # 17_add01" 4_F_04 136 235 3 0 0
OnClick:
dialog "[Мама]"
dialog "Собираешься сегодня на рыбалку?"
wait
dialog "[Папа]"
dialog "Надеюсь на рыбалку."
close
return


npc "malangdo" "Папа # 17_add01" 4_CAT_SAILOR3 135 236 3 0 0
OnClick:
dialog "[Папа]"
dialog "Разве не быстрее было бы сдаться "
dialog "и купить новый? "
wait
dialog "[Мама]"
dialog "Под небом нет ничего прежнего. И "
dialog "мне не обязательно быть в животе "
dialog "этого парня. "
wait
dialog "[Папа]"
dialog "Я понимаю. Постарайтесь поймать "
dialog "как можно больше. "
close
return


npc "malangdo" "рыбак # 17_add01" 4_M_MERCAT2 136 237 5 0 0
OnClick:
var noodle_14697 = isbegin_quest 14697 

if (noodle_14697 == 0)
	dialog "[рыбак]"
	dialog "Эти ребята не покидают рыболовные "
	dialog "угодья. Это большая сделка. О, ты "
	dialog "здесь на рыбалке? Можете ли вы "
	dialog "пойти на "
	dialog "<NAVI>_[Прием_участников_фестиваля]_<INFO> "
	dialog "malangdo, 140,165,000,0, </INFO> "
	dialog "</NAVI> и начать с Прием "
	dialog "участников фестиваля? "
	close
	return
else
	dialog "[рыбак]"
	dialog "О, ты здесь на рыбалке? Но что? Я "
	dialog "думаю, что сейчас немного сложно "
	dialog "ловить рыбу... Они садятся и не "
	dialog "отходят от дороги. "
	wait
	dialog "[рыбак]"
	dialog "Это моя работа - организовывать "
	dialog "эти вещи, но эти люди тоже "
	dialog "участники фестиваля... Подождите "
	dialog "минутку. "
	close
	return
endif
return



npc "malangdo" "Получение купона # 17_add01" 4_M_MERCAT2 141 155 3 5 5

OnInit:
	AddQuestIDCondition 14713
	SetQuestConditionBegin 14713 1 0
	SetQuestConditionQuest 14713 3
	SetQuestConditionQuest 14712 3
	SetQuestConditionQuest 14711 3
	SetQuestConditionQuest 14710 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "Получение купона#17_add01" "Пожалуйста, Получение купона, когда вы завершите все сегодняшние события!"
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[Получение купона]"
		dialog "Багаж большой, и он выглядит "
		dialog "тяжелым. Получите меньше! "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
var noodle_14710 = isbegin_quest 14710
var noodle_14711 = isbegin_quest 14711
var noodle_14712 = isbegin_quest 14712
var noodle_14713 = isbegin_quest 14713


if (noodle_14697 == 2) 
	if (v[gooksoo1] > 10)
		dialog "[Получение купона]"
		dialog "Вы пришли сюда ради Получения "
		dialog "купона? Вы ведь раньше покупали "
		dialog "сувениры? К сожалению, сувениры "
		dialog "^0000cdвыдаются только один раз^000000. "
		wait
		dialog "[Получение купона]"
		dialog "Но фестиваль все еще "
		dialog "продолжается, так что вперед и "
		dialog "наслаждайтесь этим жарким летом "
		dialog "вместе с фестивалем! "
		close
		return
	endif
	dialog "[Получение купона]"
	dialog "Доброе утро! Если вы участвовали "
	dialog "во всех сегодняшних мероприятиях, "
	dialog "проштампуйте купон! Если вы "
	dialog "заберете все марки, то получите "
	dialog "сувенир! "
	wait
	choose menu "Проштампуйте купон!" "купон? сувенир?" "Мне это не интересно."
	case 1
	break
	case 2
		showimage "177_01.bmp" 4
		dialog "[Получение купона]"
		dialog "Ага! Когда вы завершите все 4 "
		dialog "мероприятия, подготовленные на "
		dialog "фестивале лапши каждый день, вы "
		dialog "получите штамп на каждом подобном "
		dialog "купоне. "
		wait
		showimage "177_01.bmp" 255
		dialog "[Получение купона]"
		dialog "Если вы топнете 10 раз, мы "
		dialog "подарим вам сувенир <ITEM> "
		dialog "Воспоминания о костюмной летней "
		dialog "лапше <INFO>31303</INFO> </ITEM>. "
		dialog " "
		wait
		dialog "[Получение купона]"
		dialog "Следует отметить, что каждый день "
		dialog "<NAVI> [Орчо отвечает за лапшу] "
		dialog "<INFO> malangdo, 165,133,000,0, "
		dialog "</INFO> </NAVI> <NAVI> [Crew "
		dialog "Bream] <INFO> malangdo, "
		dialog "183,221,000,0, </ INFO> </NAVI> "
		dialog "<NAVI> [Агент Рами] <INFO> "
		dialog "малангдо, 196 217 000,0, </INFO> "
		dialog "</NAVI> <NAVI> [Место рыбалки] "
		dialog "<INFO> малангдо, 136 237 000,0, "
		dialog "</ Вы должны выполнить все 4 "
		dialog "события, подготовленные в INFO> "
		dialog "</NAVI>, чтобы получить штамп "
		dialog "один раз. "
		wait
		dialog "[Получение купона]"
		dialog "Даже если вы завершите одно и то "
		dialog "же мероприятие 4 раза в течение "
		dialog "нескольких дней, вы не получите "
		dialog "штамп. Ты знаешь? "
		close
		return
	break
	case 3
		dialog "[Получение купона]"
		dialog "Пожалуйста? Если интересно, "
		dialog "приходите! Получение штампа даже "
		dialog "не требует денег! "
		close
		return
	break
	endchoose
	dialog "[Получение купона]"
	dialog "Вы пришли получить штамп на "
	dialog "купоне? Я проверю это через "
	dialog "минуту. Посмотрим ~ "
	wait
	if ((noodle_14710 == 2) & (noodle_14711 == 2) & (noodle_14712 == 2) & (noodle_14713 == 2))
		dialog "[Получение купона]"
		dialog "В сегодняшнем мероприятии "
		dialog "участвовали все! хорошо. Я "
		dialog "проштампую купон. "
		var gs_now = v[gooksoo1]
		var now_pl = gs_now + 1
		recall_completequest 14710
		recall_completequest 14711
		recall_completequest 14712
		recall_completequest 14713
		erasequest 14710
		erasequest 14711
		erasequest 14712
		erasequest 14713
		setitem gooksoo1 now_pl
		var left_gs = 10 - now_pl
		wait
		if ((now_pl == 1) | (now_pl == 6))
			showimage "177_01.bmp" 4
			dialog "[Получение купона]"
			dialog "персонаж! Я сфотографировал. к сегодняшнему дню "+now_pl+"Вы собрали первую! сейчас "+left_gs+"Если соберешь еще раз, я куплю тебе <ITEM> сувенир<INFO>31303</INFO> </ITEM>. Увидимся завтра снова ~ До свидания ~"
			close
			showimage "177_01.bmp" 255
			return
		elseif ((now_pl == 2) | (now_pl == 7))
			showimage "177_02.bmp" 4
			dialog "[Получение купона]"
			dialog "персонаж! Я сфотографировал. к сегодняшнему дню "+now_pl+"Вы собрали первую! сейчас "+left_gs+"Если соберешь еще раз, я куплю тебе <ITEM> сувенир<INFO>31303</INFO> </ITEM>. Увидимся завтра снова ~ До свидания ~"
			close
			showimage "177_02.bmp" 255
			return
		elseif ((now_pl == 3) | (now_pl == 8))
			showimage "177_03.bmp" 4
			dialog "[Получение купона]"
			dialog "персонаж! Я сфотографировал. к сегодняшнему дню "+now_pl+"Вы собрали первую! сейчас "+left_gs+"Если соберешь еще раз, я куплю тебе <ITEM> сувенир<INFO>31303</INFO> </ITEM>. Увидимся завтра снова ~ До свидания ~"
			close
			showimage "177_03.bmp" 255
			return
		elseif ((now_pl == 4) | (now_pl == 9))
			showimage "177_04.bmp" 4
			dialog "[Получение купона]"
			dialog "персонаж! Я сфотографировал. к сегодняшнему дню "+now_pl+"Вы собрали первую! сейчас "+left_gs+"Если соберешь еще раз, я куплю тебе <ITEM> сувенир<INFO>31303</INFO> </ITEM>. Увидимся завтра снова ~ До свидания ~"
			close
			showimage "177_04.bmp" 255
			return
		elseif (now_pl == 5)
			showimage "177_05.bmp" 4
			dialog "[Получение купона]"
			dialog "персонаж! Я сфотографировал. к сегодняшнему дню "+now_pl+"Вы собрали первую! Я заполнил один купон, так что с завтрашнего дня я поставлю на него новый купон."
			wait
			dialog "[Получение купона]"
			dialog "сейчас "+left_gs+"Если соберешь еще раз, я подарю тебе сувенир. Увидимся завтра снова ~ До свидания ~"
			close
			showimage "177_05.bmp" 255
			return
		elseif (now_pl == 10)
			showimage "177_05.bmp" 4
			dialog "[Получение купона]"
			dialog "Ух ты! Сегодня вы собрали 10 "
			dialog "купонов! Тогда подарю вам сувенир "
			dialog "от участия в фестивале! куда ты "
			dialog "его положил... "
			wait
			dialog "[Получение купона]"
			dialog "персонаж! Вот, пожалуйста! "
			dialog "Выглядит жарко, но не жарко ~ "
			dialog "Итак, наслаждайтесь фестивалем и "
			dialog "приходите снова в следующем году! "
			dialog " "
			getitem C_Memory_Of_Noodle 1
			showimage "177_05.bmp" 255
			close
			return
		else
			dialog "[Получение купона]"
			dialog "Вы пришли сюда ради Получения "
			dialog "купона? Вы ведь раньше покупали "
			dialog "сувениры? К сожалению, сувенир "
			dialog "выдается только один раз. "
			close
			return
		endif
	else
		dialog "[Получение купона]"
		dialog "Есть мероприятия, которые еще не "
		dialog "завершены. "
		wait
		if (noodle_14710 == 0)
			dialog "[Получение купона]"
			dialog "Итак... Я имею в виду лапшу ^0000cd^000000. "
			dialog "<NAVI>_Найдите_[Орчо_отвечает_за_лапшу]_<INFO> "
			dialog "malangdo, 165,133,000,0, </INFO> "
			dialog "</NAVI>, завершите мероприятие и "
			dialog "возвращайтесь. "
			close
			return
		elseif (noodle_14711 == 0)
			dialog "[Получение купона]"
			dialog "Итак... "
			dialog "^0000cdУрожай свинины и картофеля^000000. "
			dialog "<NAVI>_[Агент_Доми]_Перейдите_на_<INFO>malangdo,183,221,000,0 "
			dialog ",</INFO> </NAVI>, чтобы завершить "
			dialog "событие и вернуться. "
			close
			return
		elseif (noodle_14712 == 0)
			dialog "[Получение купона]"
			dialog "Итак... ^0000cdАрбуз ломается^000000. "
			dialog "<NAVI>_[Агент_Рами]_<INFO> "
			dialog "Найдите малангдо, 196,217,000,0, "
			dialog "</INFO> </NAVI>, завершите "
			dialog "мероприятие и возвращайтесь. "
			close
			return
		elseif (noodle_14713 == 0)
			dialog "[Получение купона]"
			dialog "Итак... ^0000cdFishing Ground Event^000000. "
			dialog "Перейдите на "
			dialog "<NAVI>_[рыбак_]<INFO>malangdo,136,237,000,0,</INFO> "
			dialog "</NAVI>, завершите мероприятие и "
			dialog "возвращайтесь. "
			close
			return
		endif
	endif
else
	dialog "[Получение купона]"
	dialog "Лапша самая лучшая! Лапша самая "
	dialog "лучшая! Нет, мне правда ничего не "
	dialog "нужно, кроме томатной лапши? ты "
	dialog "поел Ты все еще? "
	wait
	dialog "[Получение купона]"
	dialog "Пойдите туда "
	dialog "<NAVI>_[Прием_участников_фестиваля]_<INFO> "
	dialog "malangdo, 140,165,000,0, </INFO> "
	dialog "</NAVI> и скажите ему, что вы "
	dialog "хотите участвовать в фестивале. "
	close
	return
endif
return


npc "malangdo" "обмен призами # 17_add01" 2_MONEMUS 139 152 3 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "обмен призами#17_add01" "Делайте обмен призами на Noodle Festival Coins!"
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[обмен призами]"
		dialog "Багаж большой, и он выглядит "
		dialog "тяжелым. Получите меньше! "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
var noodle_14698 = isbegin_quest 14698
var noodle_14700 = isbegin_quest 14700
var noodle_14702 = isbegin_quest 14702
var noodle_14704 = isbegin_quest 14704
if (noodle_14697 == 2) 
	dialog "[обмен призами]"
	dialog "Монеты, полученные на "
	dialog "мероприятиях Фестиваля лапши, "
	dialog "можно будет обменять на различные "
	dialog "призы. "
	wait
	dialog "[обмен призами]"
	dialog "Выберите предмет, который хотите "
	dialog "обменять. "
	wait
	choose menu "Я верю своей удаче - 3" "Акваланг - 35 шт." "Наряды для летних каникул - 3 шт." "Костюм Summer Noodle Memories - 200"
	case 1
		var 17ran_dom
		17ran_dom = 1
	break
	case 2
		var 17sea_dive
		17sea_dive = 1
	break
	case 3
		var 17sea_side
		17sea_side = 1
	break
	case 4
		var 17sea_memo
		17sea_memo = 1
	break
	endchoose
else
	dialog "[обмен призами]"
	dialog "Доступно только тем, кто "
	dialog "участвовал в главном событии "
	dialog "Фестиваля лапши. За "
	dialog "дополнительной информацией "
	dialog "обращайтесь в "
	dialog "<NAVI>_[Прием_участников_фестиваля]_<INFO> "
	dialog "malangdo, 140,165,000,0, </INFO> "
	dialog "</NAVI>. "
	close
	return
endif

if (17ran_dom == 1)
	dialog "[обмен призами]"
	dialog "Хотя я машина, мне нравятся эти "
	dialog "горячие парни. "
	wait
	dialog "[обмен призами]"
	dialog "Итак, я готов! <ITEM> Костюмная "
	dialog "шляпа с вертушкой "
	dialog "<INFO>19803</INFO> </ITEM>, "
	dialog "ограниченный предмет, который "
	dialog "можно получить только здесь !!! "
	wait
	dialog "[обмен призами]"
	dialog "Итак, хотели бы вы сегодня "
	dialog "поверить в свою удачу и принять "
	dialog "участие в розыгрыше случайных "
	dialog "призов? "
	wait
	choose menu "Я проверю свою удачу!" "Я просто вернусь."
	case 1
		if (v[Noodle_Festa_Coupon] > 2)
			dialog "[обмен призами]"
			dialog "хорошо! Посмотрим, что выйдет."
			wait
			dropitem Noodle_Festa_Coupon 3
			var ran_ma = rand 1 100
			if ((ran_ma > 0) & (ran_ma < 17))
				getitem E_Watermelon_Pudding 3
			elseif ((ran_ma > 16) & (ran_ma < 33))
				getitem Cold_Watermelon_Juice 3
			elseif ((ran_ma > 32) & (ran_ma < 49))
				getitem Tamato_Noodle 3
			elseif ((ran_ma > 48) & (ran_ma < 54))
				getitem Scuba_Mask_K 1
			elseif ((ran_ma > 53) & (ran_ma < 57))
				getitem Supper_Swimsuit_K 1
			elseif ((ran_ma > 56) & (ran_ma < 59))
				getitem C_Fan_Of_Summer 1
			elseif ((ran_ma > 58) & (ran_ma < 64))
				getitem C_Pinwheel_Cap 1
			elseif ((ran_ma > 63) & (ran_ma < 69))
				getitem Oxygen_Bomb_K 1
			elseif ((ran_ma > 68) & (ran_ma < 85))
				getitem Ice_Cream 10
			else
				getitem Iceflake 3
			endif
			dialog "[обмен призами]"
			dialog "как это? Получил понравившийся "
			dialog "приз? Пожалуйста, используйте его "
			dialog "снова в следующий раз! "
			close
			return
		else
			dialog "[обмен призами]"
			dialog "Простите. У вас недостаточно "
			dialog "монет. Пожалуйста, используйте "
			dialog "еще раз после подтверждения. "
			close
			return
		endif
	break
	case 2
		dialog "[обмен призами]"
		dialog "Спасибо за ваше использование."
		close
		return
	break
	endchoose
elseif (17sea_dive == 1)
	dialog "[обмен призами]"
	dialog "Акваланг! Я придумал "
	dialog "оборудование, которое делает "
	dialog "летнее море еще более "
	dialog "захватывающим. Какое оборудование "
	dialog "вы бы выбрали? "
	wait
	choose menu "Подводная маска - 35 монет " "Купальник серфера - 35 монет " "Кислородный баллон - 35 монет " "отменить "
	case 1
		dialog "[обмен призами]"
		dialog "Вы хотите обменять 35 "
		dialog "^0000cdфестивальных купонов^000000 на "
		dialog "^0000cd<ITEM> МАСКА ДЛЯ АКВАЛАНГА <INFO> 19162 </INFO> </ITEM>^000000? "
		dialog " "
		wait
		choose menu "Да." "нет."
		case 1
			if (v[Noodle_Festa_Coupon] > 34)
				dialog "[обмен призами]"
				dialog "поменял нормально. Спасибо, что "
				dialog "воспользовались им. Наслаждайтесь "
				dialog "фестивалем и пользуйтесь им "
				dialog "снова! "
				dropitem Noodle_Festa_Coupon 35
				getitem Scuba_Mask_K 1
				close
				return
			else
				dialog "[обмен призами]"
				dialog "Простите. У вас недостаточно "
				dialog "монет. Пожалуйста, используйте "
				dialog "еще раз после подтверждения. "
				close
				return
			endif
		break
		case 2
			dialog "[обмен призами]"
			dialog "Спасибо за ваше использование."
			close
			return
		break
		endchoose
	break
	case 2
		dialog "[обмен призами]"
		dialog "Вы хотите обменять 35 "
		dialog "^0000cdFestival Coupons^000000 на "
		dialog "^0000cd<ITEM> Surfer Swimsuit <INFO> 15174 </INFO> </ITEM>^000000? "
		dialog " "
		wait
		choose menu "Да." "нет."
		case 1
			if (v[Noodle_Festa_Coupon] > 34)
				dialog "[обмен призами]"
				dialog "поменял нормально. Спасибо, что "
				dialog "воспользовались им. Наслаждайтесь "
				dialog "фестивалем и пользуйтесь им "
				dialog "снова! "
				dropitem Noodle_Festa_Coupon 35
				getitem Supper_Swimsuit_K 1
				close
				return
			else
				dialog "[обмен призами]"
				dialog "Простите. У вас недостаточно "
				dialog "монет. Пожалуйста, используйте "
				dialog "еще раз после подтверждения. "
				close
				return
			endif
		break
		case 2
			dialog "[обмен призами]"
			dialog "Спасибо за ваше использование."
			close
			return
		break
		endchoose
	break
	case 3
		dialog "[обмен призами]"
		dialog "Вы хотите обменять 35 "
		dialog "^0000cdфестивальных купонов^000000 на "
		dialog "^0000cd<ITEM> кислородный баллон <INFO> 20819 </INFO> </ITEM>^000000? "
		dialog " "
		wait
		choose menu "Да." "нет."
		case 1
			if (v[Noodle_Festa_Coupon] > 34)
				dialog "[обмен призами]"
				dialog "поменял нормально. Спасибо, что "
				dialog "воспользовались им. Наслаждайтесь "
				dialog "фестивалем и пользуйтесь им "
				dialog "снова! "
				dropitem Noodle_Festa_Coupon 35
				getitem Oxygen_Bomb_K 1
				close
				return
			else
				dialog "[обмен призами]"
				dialog "Простите. У вас недостаточно "
				dialog "монет. Пожалуйста, используйте "
				dialog "еще раз после подтверждения. "
				close
				return
			endif
		break
		case 2
			dialog "[обмен призами]"
			dialog "Спасибо за ваше использование."
			close
			return
		break
		endchoose
	break
	case 4
		dialog "[обмен призами]"
		dialog "Спасибо за ваше использование."
		close
		return
	break
	endchoose
elseif (17sea_side == 1)
	if (v[VAR_JOB] == DO_SUMMONER)
		dialog "[обмен призами]"
		dialog "Вы Дорам? Существует ограничение "
		dialog "на ношение "
		dialog "^0000cd<ITEM> экипировки для летних каникул <INFO> 22822 </INFO> </ITEM>^000000 "
		dialog "по разным причинам. Хотите ее "
		dialog "приобрести? "
		wait
		choose menu "Ага " "нет."
		case 1
		break
		case 2
			dialog "[обмен призами]"
			dialog "Хорошо. Спасибо за ваше "
			dialog "использование. "
			close
			return
		break
		endchoose
	endif
	dialog "[обмен призами]"
	dialog "Вы хотите обменять "
	dialog "^0000cd3 монеты фестиваля лапши^000000 на "
	dialog "<ITEM> 5 нарядов для летних "
	dialog "каникул <INFO>22822</INFO> "
	dialog "</ITEM>? "
	wait
	choose menu "Да." "нет."
	case 1
		if (v[Noodle_Festa_Coupon] > 2)
			dialog "[обмен призами]"
			dialog "поменял нормально. Спасибо, что "
			dialog "воспользовались им. Наслаждайтесь "
			dialog "фестивалем и пользуйтесь им "
			dialog "снова! "
			dropitem Noodle_Festa_Coupon 3
			getitem Apple 5 // SW_Wear2014
			close
			return
		else
			dialog "[обмен призами]"
			dialog "Простите. У вас недостаточно "
			dialog "монет. Пожалуйста, используйте "
			dialog "еще раз после подтверждения. "
			close
			return
		endif
	break
	case 2
		dialog "[обмен призами]"
		dialog "Спасибо за ваше использование."
		close
		return
	break
	endchoose
elseif (17sea_memo == 1)
	dialog "[обмен призами]"
	dialog "Вы хотите обменять 200 "
	dialog "^0000cdмонет фестиваля лапши^000000 на <ITEM> "
	dialog "Costume Summer Noodle Memories "
	dialog "<INFO> 31303 </INFO> </ITEM>? "
	wait
	choose menu "Да." "нет."
	case 1
		if (v[Noodle_Festa_Coupon] > 199)
			dialog "[обмен призами]"
			dialog "поменял нормально. Спасибо, что "
			dialog "воспользовались им. Наслаждайтесь "
			dialog "фестивалем и пользуйтесь им "
			dialog "снова! "
			dropitem Noodle_Festa_Coupon 200
			getitem C_Memory_Of_Noodle 1
			close
			return
		else
			dialog "[обмен призами]"
			dialog "Простите. У вас недостаточно "
			dialog "монет. Пожалуйста, используйте "
			dialog "еще раз после подтверждения. "
			close
			return
		endif
	break
	case 2
		dialog "[обмен призами]"
		dialog "Спасибо за ваше использование."
		close
		return
	break
	endchoose
else
endif
return



npc "malangdo" "аренда оборудования # 17_add01" 4_M_MERCAT1 141 158 3 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "аренда оборудования#17_add01" "Скажите аренда оборудования перед отъездом в пещеру Нил!"
return


OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[аренда оборудования]"
		dialog "Багаж большой и кажется тяжелым. "
		dialog "Могу ли я одолжить оборудование и "
		dialog "привезти его с собой? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 2)
	dialog "[аренда оборудования]"
	dialog "Доброе утро? Хорошая погода, "
	dialog "правда? Подводное плавание с "
	dialog "аквалангом - лучшее в такой день! "
	dialog "Или вы можете почувствовать "
	dialog "прохладный ветерок в тени. "
	wait
	dialog "[аренда оборудования]"
	dialog "У вас есть монеты фестиваля "
	dialog "лапши? С Coins или Jenny, почему "
	dialog "бы не арендовать комплект "
	dialog "акваланга или духовой комплект, "
	dialog "сделанный специально для "
	dialog "фестиваля, по доступной цене на "
	dialog "24 часа? "
	wait
	dialog "[аренда оборудования]"
	dialog "Намного лучше, чем обычный "
	dialog "комплект акваланга или ветряной "
	dialog "установки. Еще лучше, если у вас "
	dialog "будет все необходимое! "
	wait
	dialog "[аренда оборудования]"
	dialog "Хотели бы вы арендовать "
	dialog "оборудование у Дженни? Или вы "
	dialog "хотели бы арендовать за Noodle "
	dialog "Festival Coins? "
	wait
	choose menu "Прокат с монетами фестиваля лапши " "аренда с Дженни " "давай посмотрим что " "не сдавать в аренду "
	case 1
		dialog "[аренда оборудования]"
		dialog "Что бы вы хотели арендовать?"
		wait
		choose menu "Аренда кислородного баллона - 2 в день " "Аренда купальника для серфера - 2 раза в день " "Аренда подводной маски - 2 в день " "Прокат костюмированной шляпы Вертушка - 2 в день " "Прокат костюмированного фаната летнего солнцестояния - 2 в день " "отменить "
		case 1
			dialog "[аренда оборудования]"
			dialog "^0000cd 2 монеты фестиваля лапши^000000 Хотите "
			dialog "арендовать <ITEM> кислородный "
			dialog "баллон <INFO> 20855 </INFO> "
			dialog "</ITEM> за ^0000cdна 1 день^000000? "
			wait
			choose menu "Да." "нет."
			case 1
				if (v[Noodle_Festa_Coupon] > 1)
					dialog "[аренда оборудования]"
					dialog "поменял нормально. Спасибо, что "
					dialog "воспользовались им. Наслаждайтесь "
					dialog "фестивалем и пользуйтесь им "
					dialog "снова! "
					dropitem Noodle_Festa_Coupon 2
					RentItem Rental_Oxygen_Bomb 86400 0 0 0 0 0
					close
					return
				else
					dialog "[аренда оборудования]"
					dialog "Простите. У вас недостаточно "
					dialog "монет. Пожалуйста, используйте "
					dialog "еще раз после подтверждения. "
					close
					return
				endif
			break
			case 2
				dialog "[аренда оборудования]"
				dialog "Спасибо за ваше использование."
				close
				return
			break
			endchoose
		break
		case 2
			dialog "[аренда оборудования]"
			dialog "Вы бы хотели одолжить "
			dialog "^0000cdна 1 день <ITEM> Прокатного купальника Surfer <INFO> 15210 </INFO> </ITEM> за ^0000cd2 "
			dialog "Монеты фестиваля лапши^000000? "
			wait
			choose menu "Да." "нет."
			case 1
				if (v[Noodle_Festa_Coupon] > 1)
					dialog "[аренда оборудования]"
					dialog "поменял нормально. Спасибо, что "
					dialog "воспользовались им. Наслаждайтесь "
					dialog "фестивалем и пользуйтесь им "
					dialog "снова! "
					dropitem Noodle_Festa_Coupon 2
					RentItem Rental_SupperSwimsuit 86400 0 0 0 0 0
					close
					return
				else
					dialog "[аренда оборудования]"
					dialog "Простите. У вас недостаточно "
					dialog "монет. Пожалуйста, используйте "
					dialog "еще раз после подтверждения. "
					close
					return
				endif
			break
			case 2
				dialog "[аренда оборудования]"
				dialog "Спасибо за ваше использование."
				close
				return
			break
			endchoose
		break
		case 3
			dialog "[аренда оборудования]"
			dialog "Вы хотите взять напрокат <ITEM> "
			dialog "Маску для подводного плавания "
			dialog "<INFO> 19275 </INFO> </ITEM> за "
			dialog "^0000cd2 монеты фестиваля лапши^000000 "
			dialog "^0000cdна 1 день^000000? "
			wait
			choose menu "Да." "нет."
			case 1
				if (v[Noodle_Festa_Coupon] > 1)
					dialog "[аренда оборудования]"
					dialog "поменял нормально. Спасибо, что "
					dialog "воспользовались им. Наслаждайтесь "
					dialog "фестивалем и пользуйтесь им "
					dialog "снова! "
					dropitem Noodle_Festa_Coupon 2
					RentItem Rental_Scuba_Mask 86400 0 0 0 0 0
					close
					return
				else
					dialog "[аренда оборудования]"
					dialog "Простите. У вас недостаточно "
					dialog "монет. Пожалуйста, используйте "
					dialog "еще раз после подтверждения. "
					close
					return
				endif
			break
			case 2
				dialog "[аренда оборудования]"
				dialog "Спасибо за ваше использование."
				close
				return
			break
			endchoose
		break
		case 4
			dialog "[аренда оборудования]"
			dialog "Вы бы хотели одолжить "
			dialog "^0000cdна 1 день <ITEM> арендованной шляпы с вертушкой для костюмов <INFO> 31320 </INFO> </ITEM> за ^0000cd2 "
			dialog "монеты фестиваля лапши^000000? "
			wait
			choose menu "Да." "нет."
			case 1
				if (v[Noodle_Festa_Coupon] > 1)
					dialog "[аренда оборудования]"
					dialog "поменял нормально. Спасибо, что "
					dialog "воспользовались им. Наслаждайтесь "
					dialog "фестивалем и пользуйтесь им "
					dialog "снова! "
					dropitem Noodle_Festa_Coupon 2
					RentItem C_Pinwheel_Cap_R 86400 0 0 0 0 0
					close
					return
				else
					dialog "[аренда оборудования]"
					dialog "Простите. У вас недостаточно "
					dialog "монет. Пожалуйста, используйте "
					dialog "еще раз после подтверждения. "
					close
					return
				endif
			break
			case 2
				dialog "[аренда оборудования]"
				dialog "Спасибо за ваше использование."
				close
				return
			break
			endchoose
		break
		case 5
			dialog "[аренда оборудования]"
			dialog "Вы бы хотели одолжить "
			dialog "^0000cdна 1 день <ITEM> Прокат костюмов Midsummer Fan <INFO> 31319 </INFO> </ITEM> за ^0000cd2 "
			dialog "Монеты фестиваля лапши^000000? "
			wait
			choose menu "Да." "нет."
			case 1
				if (v[Noodle_Festa_Coupon] > 1)
					dialog "[аренда оборудования]"
					dialog "поменял нормально. Спасибо, что "
					dialog "воспользовались им. Наслаждайтесь "
					dialog "фестивалем и пользуйтесь им "
					dialog "снова! "
					dropitem Noodle_Festa_Coupon 2
					RentItem C_Fan_Of_Summer_R 86400 0 0 0 0 0
					close
					return
				else
					dialog "[аренда оборудования]"
					dialog "Простите. У вас недостаточно "
					dialog "монет. Пожалуйста, используйте "
					dialog "еще раз после подтверждения. "
					close
					return
				endif
			break
			case 2
				dialog "[аренда оборудования]"
				dialog "Спасибо за ваше использование."
				close
				return
			break
			endchoose
		break
		case 6
			dialog "[аренда оборудования]"
			dialog "Спасибо за ваше использование."
			close
			return
		break
		endchoose
	case 2
		dialog "[аренда оборудования]"
		dialog "Что бы вы хотели арендовать?"
		wait
		choose menu "Аренда кислородного баллона - 50 000 дженни в день." "Аренда купальника серфера - 50 000 дженни в день." "Прокат акваланга - 50 000 дженни в день." "Прокат костюмированной шляпы-вертушки - 50 000 дженни в день." "Аренда костюма в середине лета - 50 000 дженни в день." "отменить "
		case 1
			dialog "[аренда оборудования]"
			dialog " "
			dialog "^0000cd50000 Хотите арендовать <ITEM> кислородный баллон для аренды <INFO> 20855 </INFO> </ITEM> с Дженни^000000 "
			dialog "^0000cdна 1 день^000000? "
			wait
			choose menu "Да." "нет."
			case 1
				if (v[VAR_MONEY] > 49999)
					dialog "[аренда оборудования]"
					dialog "поменял нормально. Спасибо, что "
					dialog "воспользовались им. Наслаждайтесь "
					dialog "фестивалем и пользуйтесь им "
					dialog "снова! "
					dropgold 50000
					RentItem Rental_Oxygen_Bomb 86400 0 0 0 0 0
					close
					return
				else
					dialog "[аренда оборудования]"
					dialog "Простите. В настоящее время мне "
					dialog "не хватает средств. Пожалуйста, "
					dialog "используйте еще раз после "
					dialog "подтверждения. "
					close
					return
				endif
			break
			case 2
				dialog "[аренда оборудования]"
				dialog "Спасибо за ваше использование."
				close
				return
			break
			endchoose
		break
		case 2
			dialog "[аренда оборудования]"
			dialog "Хотите арендовать <ITEM> "
			dialog "Купальник Surfer Swimsuit <INFO> "
			dialog "15210 </INFO> </ITEM> с Дженни^000000 ^0000cdна "
			dialog "1 день^000000? "
			wait
			choose menu "Да." "нет."
			case 1
				if (v[VAR_MONEY] > 49999)
					dialog "[аренда оборудования]"
					dialog "поменял нормально. Спасибо, что "
					dialog "воспользовались им. Наслаждайтесь "
					dialog "фестивалем и пользуйтесь им "
					dialog "снова! "
					dropgold 50000
					RentItem Rental_SupperSwimsuit 86400 0 0 0 0 0
					close
					return
				else
					dialog "[аренда оборудования]"
					dialog "Простите. В настоящее время мне "
					dialog "не хватает средств. Пожалуйста, "
					dialog "используйте еще раз после "
					dialog "подтверждения. "
					close
					return
				endif
			break
			case 2
				dialog "[аренда оборудования]"
				dialog "Спасибо за ваше использование."
				close
				return
			break
			endchoose
		break
		case 3
			dialog "[аренда оборудования]"
			dialog " "
			dialog "^0000cd50000 Вы бы хотели одолжить <ITEM> Прокат маски для подводного плавания <INFO> 19275 </INFO> </ITEM> у Дженни^000000 "
			dialog "^0000cdна 1 день^000000? "
			wait
			choose menu "Да." "нет."
			case 1
				if (v[VAR_MONEY] > 49999)
					dialog "[аренда оборудования]"
					dialog "поменял нормально. Спасибо, что "
					dialog "воспользовались им. Наслаждайтесь "
					dialog "фестивалем и пользуйтесь им "
					dialog "снова! "
					dropgold 50000
					RentItem Rental_Scuba_Mask 86400 0 0 0 0 0
					close
					return
				else
					dialog "[аренда оборудования]"
					dialog "Простите. В настоящее время мне "
					dialog "не хватает средств. Пожалуйста, "
					dialog "используйте еще раз после "
					dialog "подтверждения. "
					close
					return
				endif
			break
			case 2
				dialog "[аренда оборудования]"
				dialog "Спасибо за ваше использование."
				close
				return
			break
			endchoose
		break
		case 4
			dialog "[аренда оборудования]"
			dialog "Хотели бы вы арендовать <ITEM> "
			dialog "Шляпу с вертушкой для проката "
			dialog "костюмов <INFO> 31320 </INFO> "
			dialog "</ITEM> с Дженни^000000 ^0000cdна 1 день ^0000cd^000000? "
			wait
			choose menu "Да." "нет."
			case 1
				if (v[VAR_MONEY] > 49999)
					dialog "[аренда оборудования]"
					dialog "поменял нормально. Спасибо, что "
					dialog "воспользовались им. Наслаждайтесь "
					dialog "фестивалем и пользуйтесь им "
					dialog "снова! "
					dropgold 50000
					RentItem C_Pinwheel_Cap_R 86400 0 0 0 0 0
					close
					return
				else
					dialog "[аренда оборудования]"
					dialog "Простите. В настоящее время мне "
					dialog "не хватает средств. Пожалуйста, "
					dialog "используйте еще раз после "
					dialog "подтверждения. "
					close
					return
				endif
			break
			case 2
				dialog "[аренда оборудования]"
				dialog "Спасибо за ваше использование."
				close
				return
			break
			endchoose
		break
		case 5
			dialog "[аренда оборудования]"
			dialog "Вы бы хотели одолжить ^0000cd50000 Jenny^000000 "
			dialog "для <ITEM> Прокат костюмов для "
			dialog "фанатов летнего солнцестояния "
			dialog "<INFO> 31319 </INFO> </ITEM> "
			dialog "^0000cdна 1 день^000000? "
			wait
			choose menu "Да." "нет."
			case 1
				if (v[VAR_MONEY] > 49999)
					dialog "[аренда оборудования]"
					dialog "поменял нормально. Спасибо, что "
					dialog "воспользовались им. Наслаждайтесь "
					dialog "фестивалем и пользуйтесь им "
					dialog "снова! "
					dropgold 50000
					RentItem C_Fan_Of_Summer_R 86400 0 0 0 0 0
					close
					return
				else
					dialog "[аренда оборудования]"
					dialog "Простите. В настоящее время мне "
					dialog "не хватает средств. Пожалуйста, "
					dialog "используйте еще раз после "
					dialog "подтверждения. "
					close
					return
				endif
			break
			case 2
				dialog "[аренда оборудования]"
				dialog "Спасибо за ваше использование."
				close
				return
			break
			endchoose
		break
		case 6
			dialog "[аренда оборудования]"
			dialog "Спасибо за ваше использование."
			close
			return
		break
		endchoose
	break
	case 3
		dialog "[аренда оборудования]"
		dialog "Хотите узнать об аренде "
		dialog "оборудования? Тогда вам стоит "
		dialog "заглянуть в каталог. "
		wait
		dialog "[Аренда подводного снаряжения]"
		dialog "<ITEM> Аренда баллона с "
		dialog "кислородом <INFO> 20855 </INFO> "
		dialog "</ITEM> - 2 монеты или 50 000 "
		dialog "Дженни <ITEM> Аренда купальника "
		dialog "серфера <INFO> 15210 </INFO> "
		dialog "</ITEM> - 2 монеты или 50 000 "
		dialog "монет Дженни < ПУНКТ> Прокат "
		dialog "маски для подводного плавания "
		dialog "<INFO>19275</INFO> </ITEM> - 2 "
		dialog "монеты или 50 000 Дженни "
		dialog "Рекомендуется, особенно при "
		dialog "отбытии в Дорадо "
		wait
		dialog "[Аренда ветряного оборудования]"
		dialog "<ITEM> Аренда костюма Вертушка "
		dialog "Hat <INFO> 31320 </INFO> </ITEM> "
		dialog "- 2 монеты или 50 000 Дженни "
		dialog "<ITEM> Прокат костюма Фанат "
		dialog "летнего солнцестояния <INFO> "
		dialog "31319 </INFO> </ITEM> - 2 монеты "
		dialog "собаки или 50 000 Дженни Хорошо "
		dialog "использовать в любом месте "
		wait
		dialog "[аренда оборудования]"
		dialog "как это? Вам что-то понравилось?"
		close
		return
	break
	case 4
		dialog "[аренда оборудования]"
		dialog "Спасибо за ваше использование."
		close
		return
	break
	endchoose
else
	dialog "[аренда оборудования]"
	dialog "Арендовать его смогут только те, "
	dialog "кто участвовал в главном "
	dialog "мероприятии фестиваля лапши. Мне "
	dialog "жаль. "
	wait
	dialog "[аренда оборудования]"
	dialog " "
	dialog "<NAVI>_[Прием_участников_фестиваля]_Пожалуйста,_подайте_заявку_от_<INFO>malangdo,140,165,000,0 "
	dialog ",</INFO> </NAVI> и приходите. "
	close
	return
endif

npc "пронтера " "PR-персонал Noodle Festival # 17_add01" 4_CAT_3COLOR 164 173 4 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 0
	SetQuestConditionLevel 50 200
	SetQuestConditionEnd
	
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "PR-персонал Noodle Festival#17_add01" "Жаркое лето, когда тело и разум устали? Как насчет тарелки вкусной лапши?"
return


OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Багаж большой, и он выглядит "
		dialog "тяжелым. Как насчет еще? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 0) 
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Доброе утро! Жаркое лето, когда "
	dialog "тело и разум устали? Как насчет "
	dialog "тарелки вкусной лапши? "
	wait
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Сейчас ^0000cdФестиваль лапши^000000 в Малангдо "
	dialog "в самом разгаре! Если вы съедите "
	dialog "тарелку жевательной и вкусной "
	dialog "лапши, вы освежитесь! "
	wait
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Хотите поехать в Малангдо, чтобы "
	dialog "вылечить усталое тело лапшой? Мы "
	dialog "можем отправить его вам прямо "
	dialog "сейчас! "
	wait
	choose menu "Пойдем прямо сейчас!" "Я пойду позже."
	case 1
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "хорошо! Если во время мероприятия "
		dialog "у вас будет много <ITEM> "
		dialog "общественных фанатов <INFO> 25367 "
		dialog "</INFO> </ITEM>, приведите их к "
		dialog "нам. Мы отправим его прямо на "
		dialog "место проведения. Конечно, первый "
		dialog "бесплатный! "
		wait
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Тогда я проведу вас прямо сейчас! "
		dialog "Лапша самая лучшая! Лапша самая "
		dialog "лучшая !! "
		close
		moveto "malangdo" 214 90
		return
	break
	case 2
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Мероприятие проводится в первый "
		dialog "месяц большой луны, поэтому "
		dialog "обязательно приходите к нам в "
		dialog "гости позже! Но не опаздывайте, "
		dialog "ведь в полнолуние луна "
		dialog "наклоняется! Лапша самая лучшая! "
		dialog "Лапша самая лучшая !! "
		close
		return
	break
	endchoose
else
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Вам нравится летний фестиваль "
	dialog "лапши? О, я тоже хочу есть лапшу! "
	dialog "Если вы дадите мне рекламный "
	dialog "вентилятор "
	dialog "^0000cd, я направлю вас на сайт мероприятия^000000. "
	dialog " "
	wait
	choose menu "Отправьте прямо сейчас!" "Я пойду позже "
	case 1
		if (v[Promotion_Fan] > 0)
			dialog "[Агент по связям с "
			dialog "общественностью Noodle Festival] "
			dialog "хорошо! Мы проведем вас прямо "
			dialog "сейчас! Лапша самая лучшая! Лапша "
			dialog "самая лучшая !! "
			dropitem Promotion_Fan 1
			close
			moveto "malangdo" 214 90
			return
		else
			dialog "[Агент по связям с "
			dialog "общественностью Noodle Festival] "
			dialog "Эээ... Я не вижу рекламного "
			dialog "вентилятора? Разве вы не оставили "
			dialog "его где-нибудь еще? Пожалуйста, "
			dialog "вернитесь после проверки! Я "
			dialog "пришлю его вам в любое время в "
			dialog "течение всего периода. "
			close
			return
		endif
	break
	case 2
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Мероприятие проводится в первый "
		dialog "месяц большой луны, поэтому "
		dialog "обязательно приходите к нам в "
		dialog "гости позже! Но не опаздывайте, "
		dialog "ведь в полнолуние луна "
		dialog "наклоняется! Лапша самая лучшая! "
		dialog "Лапша самая лучшая !! "
		close
		return
	break
	endchoose
endif
return

npc "Payon" "PR-персонал Noodle Festival # 17_add02" 4_CAT_3COLOR 193 108 4 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 0
	SetQuestConditionLevel 50 200
	SetQuestConditionEnd
	
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "PR-персонал Noodle Festival#17_add02" "Жаркое лето, когда тело и разум устали? Как насчет тарелки вкусной лапши?"
return

OnClick:
if (v[VAR_CLEVEL] < 50)
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Хотите присоединиться к фестивалю "
	dialog "лапши? Жалко, но я думаю, тебе "
	dialog "нужно еще немного повзрослеть. "
	close
	return
endif

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Багаж большой, и он выглядит "
		dialog "тяжелым. Как насчет еще? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 0) 
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Доброе утро! Жаркое лето, когда "
	dialog "тело и разум устали? Как насчет "
	dialog "тарелки вкусной лапши? "
	wait
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Сейчас ^0000cdФестиваль лапши^000000 в Малангдо "
	dialog "в самом разгаре! Если вы съедите "
	dialog "тарелку жевательной и вкусной "
	dialog "лапши, вы освежитесь! "
	wait
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Хотите поехать в Малангдо, чтобы "
	dialog "вылечить усталое тело лапшой? Мы "
	dialog "можем отправить его вам прямо "
	dialog "сейчас! "
	wait
	choose menu "Пойдем прямо сейчас!" "Я пойду позже."
	case 1
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "хорошо! Если во время мероприятия "
		dialog "у вас будет много <ITEM> "
		dialog "общественных фанатов <INFO> 25367 "
		dialog "</INFO> </ITEM>, приведите их к "
		dialog "нам. Мы отправим его прямо на "
		dialog "место проведения. Конечно, первый "
		dialog "бесплатный! "
		wait
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Тогда я проведу вас прямо сейчас! "
		dialog "Лапша самая лучшая! Лапша самая "
		dialog "лучшая !! "
		close
		moveto "malangdo" 214 90
		return
	break
	case 2
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Мероприятие проводится в первый "
		dialog "месяц большой луны, поэтому "
		dialog "обязательно приходите к нам в "
		dialog "гости позже! Но не опаздывайте, "
		dialog "ведь в полнолуние луна "
		dialog "наклоняется! Лапша самая лучшая! "
		dialog "Лапша самая лучшая !! "
		close
		return
	break
	endchoose
else
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Вам нравится летний фестиваль "
	dialog "лапши? О, я тоже хочу есть лапшу! "
	dialog "Если вы дадите мне рекламный "
	dialog "вентилятор "
	dialog "^0000cd, я направлю вас на сайт мероприятия^000000. "
	dialog " "
	wait
	choose menu "Отправьте прямо сейчас!" "Я пойду позже "
	case 1
		if (v[Promotion_Fan] > 0)
			dialog "[Агент по связям с "
			dialog "общественностью Noodle Festival] "
			dialog "хорошо! Мы проведем вас прямо "
			dialog "сейчас! Лапша самая лучшая! Лапша "
			dialog "самая лучшая !! "
			dropitem Promotion_Fan 1
			close
			moveto "malangdo" 214 90
			return
		else
			dialog "[Агент по связям с "
			dialog "общественностью Noodle Festival] "
			dialog "Эээ... Я не вижу рекламного "
			dialog "вентилятора? Разве вы не оставили "
			dialog "его где-нибудь еще? Пожалуйста, "
			dialog "вернитесь после проверки! Я "
			dialog "пришлю его вам в любое время в "
			dialog "течение всего периода. "
			close
			return
		endif
	break
	case 2
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Мероприятие проводится в первый "
		dialog "месяц большой луны, поэтому "
		dialog "обязательно приходите к нам в "
		dialog "гости позже! Но не опаздывайте, "
		dialog "ведь в полнолуние луна "
		dialog "наклоняется! Лапша самая лучшая! "
		dialog "Лапша самая лучшая !! "
		close
		return
	break
	endchoose
endif
return


npc "альдебаран " "PR-персонал Noodle Festival # 17_add03" 4_CAT_3COLOR 143 115 4 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 0
	SetQuestConditionLevel 50 200
	SetQuestConditionEnd
	
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "PR-персонал Noodle Festival#17_add03" "Жаркое лето, когда тело и разум устали? Как насчет тарелки вкусной лапши?"
return

OnClick:
if (v[VAR_CLEVEL] < 50)
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Хотите присоединиться к фестивалю "
	dialog "лапши? Жалко, но я думаю, тебе "
	dialog "нужно еще немного повзрослеть. "
	close
	return
endif

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Багаж большой, и он выглядит "
		dialog "тяжелым. Как насчет еще? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 0) 
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Доброе утро! Жаркое лето, когда "
	dialog "тело и разум устали? Как насчет "
	dialog "тарелки вкусной лапши? "
	wait
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Сейчас ^0000cdФестиваль лапши^000000 в Малангдо "
	dialog "в самом разгаре! Если вы съедите "
	dialog "тарелку жевательной и вкусной "
	dialog "лапши, вы освежитесь! "
	wait
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Хотите поехать в Малангдо, чтобы "
	dialog "вылечить усталое тело лапшой? Мы "
	dialog "можем отправить его вам прямо "
	dialog "сейчас! "
	wait
	choose menu "Пойдем прямо сейчас!" "Я пойду позже."
	case 1
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "хорошо! Если во время мероприятия "
		dialog "у вас будет много <ITEM> "
		dialog "общественных фанатов <INFO> 25367 "
		dialog "</INFO> </ITEM>, приведите их к "
		dialog "нам. Мы отправим его прямо на "
		dialog "место проведения. Конечно, первый "
		dialog "бесплатный! "
		wait
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Тогда я проведу вас прямо сейчас! "
		dialog "Лапша самая лучшая! Лапша самая "
		dialog "лучшая !! "
		close
		moveto "malangdo" 214 90
		return
	break
	case 2
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Мероприятие проводится в первый "
		dialog "месяц большой луны, поэтому "
		dialog "обязательно приходите к нам в "
		dialog "гости позже! Но не опаздывайте, "
		dialog "ведь в полнолуние луна "
		dialog "наклоняется! Лапша самая лучшая! "
		dialog "Лапша самая лучшая !! "
		close
		return
	break
	endchoose
else
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Вам нравится летний фестиваль "
	dialog "лапши? О, я тоже хочу есть лапшу! "
	dialog "Если вы дадите мне рекламный "
	dialog "вентилятор "
	dialog "^0000cd, я направлю вас на сайт мероприятия^000000. "
	dialog " "
	wait
	choose menu "Отправьте прямо сейчас!" "Я пойду позже "
	case 1
		if (v[Promotion_Fan] > 0)
			dialog "[Агент по связям с "
			dialog "общественностью Noodle Festival] "
			dialog "хорошо! Мы проведем вас прямо "
			dialog "сейчас! Лапша самая лучшая! Лапша "
			dialog "самая лучшая !! "
			dropitem Promotion_Fan 1
			close
			moveto "malangdo" 214 90
			return
		else
			dialog "[Агент по связям с "
			dialog "общественностью Noodle Festival] "
			dialog "Эээ... Я не вижу рекламного "
			dialog "вентилятора? Разве вы не оставили "
			dialog "его где-нибудь еще? Пожалуйста, "
			dialog "вернитесь после проверки! Я "
			dialog "пришлю его вам в любое время в "
			dialog "течение всего периода. "
			close
			return
		endif
	break
	case 2
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Мероприятие проводится в первый "
		dialog "месяц большой луны, поэтому "
		dialog "обязательно приходите к нам в "
		dialog "гости позже! Но не опаздывайте, "
		dialog "ведь в полнолуние луна "
		dialog "наклоняется! Лапша самая лучшая! "
		dialog "Лапша самая лучшая !! "
		close
		return
	break
	endchoose
endif
return


npc "Geffen" "PR-персонал Noodle Festival # 17_add04" 4_CAT_3COLOR 129 57 4 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 0
	SetQuestConditionLevel 50 200
	SetQuestConditionEnd
	
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "PR-персонал Noodle Festival#17_add04" "Жаркое лето, когда тело и разум устали? Как насчет тарелки вкусной лапши?"
return

OnClick:
if (v[VAR_CLEVEL] < 50)
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Хотите присоединиться к фестивалю "
	dialog "лапши? Жалко, но я думаю, тебе "
	dialog "нужно еще немного повзрослеть. "
	close
	return
endif

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Багаж большой, и он выглядит "
		dialog "тяжелым. Как насчет еще? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 0) 
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Доброе утро! Жаркое лето, когда "
	dialog "тело и разум устали? Как насчет "
	dialog "тарелки вкусной лапши? "
	wait
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Сейчас ^0000cdФестиваль лапши^000000 в Малангдо "
	dialog "в самом разгаре! Если вы съедите "
	dialog "тарелку жевательной и вкусной "
	dialog "лапши, вы освежитесь! "
	wait
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Хотите поехать в Малангдо, чтобы "
	dialog "вылечить усталое тело лапшой? Мы "
	dialog "можем отправить его вам прямо "
	dialog "сейчас! "
	wait
	choose menu "Пойдем прямо сейчас!" "Я пойду позже."
	case 1
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "хорошо! Если во время мероприятия "
		dialog "у вас будет много <ITEM> "
		dialog "общественных фанатов <INFO> 25367 "
		dialog "</INFO> </ITEM>, приведите их к "
		dialog "нам. Мы отправим его прямо на "
		dialog "место проведения. Конечно, первый "
		dialog "бесплатный! "
		wait
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Тогда я проведу вас прямо сейчас! "
		dialog "Лапша самая лучшая! Лапша самая "
		dialog "лучшая !! "
		close
		moveto "malangdo" 214 90
		return
	break
	case 2
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Мероприятие проводится в первый "
		dialog "месяц большой луны, поэтому "
		dialog "обязательно приходите к нам в "
		dialog "гости позже! Но не опаздывайте, "
		dialog "ведь в полнолуние луна "
		dialog "наклоняется! Лапша самая лучшая! "
		dialog "Лапша самая лучшая !! "
		close
		return
	break
	endchoose
else
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Вам нравится летний фестиваль "
	dialog "лапши? О, я тоже хочу есть лапшу! "
	dialog "Если вы дадите мне рекламный "
	dialog "вентилятор "
	dialog "^0000cd, я направлю вас на сайт мероприятия^000000. "
	dialog " "
	wait
	choose menu "Отправьте прямо сейчас!" "Я пойду позже "
	case 1
		if (v[Promotion_Fan] > 0)
			dialog "[Агент по связям с "
			dialog "общественностью Noodle Festival] "
			dialog "хорошо! Мы проведем вас прямо "
			dialog "сейчас! Лапша самая лучшая! Лапша "
			dialog "самая лучшая !! "
			dropitem Promotion_Fan 1
			close
			moveto "malangdo" 214 90
			return
		else
			dialog "[Агент по связям с "
			dialog "общественностью Noodle Festival] "
			dialog "Эээ... Я не вижу рекламного "
			dialog "вентилятора? Разве вы не оставили "
			dialog "его где-нибудь еще? Пожалуйста, "
			dialog "вернитесь после проверки! Я "
			dialog "пришлю его вам в любое время в "
			dialog "течение всего периода. "
			close
			return
		endif
	break
	case 2
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Мероприятие проводится в первый "
		dialog "месяц большой луны, поэтому "
		dialog "обязательно приходите к нам в "
		dialog "гости позже! Но не опаздывайте, "
		dialog "ведь в полнолуние луна "
		dialog "наклоняется! Лапша самая лучшая! "
		dialog "Лапша самая лучшая !! "
		close
		return
	break
	endchoose
endif
return


npc "марокко " "PR-персонал Noodle Festival # 17_add05" 4_CAT_3COLOR 168 87 4 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 0
	SetQuestConditionLevel 50 200
	SetQuestConditionEnd
	
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "PR-персонал Noodle Festival#17_add05" "Жаркое лето, когда тело и разум устали? Как насчет тарелки вкусной лапши?"
return

OnClick:
if (v[VAR_CLEVEL] < 50)
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Хотите присоединиться к фестивалю "
	dialog "лапши? Жалко, но я думаю, тебе "
	dialog "нужно еще немного повзрослеть. "
	close
	return
endif

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Багаж большой, и он выглядит "
		dialog "тяжелым. Как насчет еще? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 0) 
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Доброе утро! Жаркое лето, когда "
	dialog "тело и разум устали? Как насчет "
	dialog "тарелки вкусной лапши? "
	wait
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Сейчас ^0000cdФестиваль лапши^000000 в Малангдо "
	dialog "в самом разгаре! Если вы съедите "
	dialog "тарелку жевательной и вкусной "
	dialog "лапши, вы освежитесь! "
	wait
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Хотите поехать в Малангдо, чтобы "
	dialog "вылечить усталое тело лапшой? Мы "
	dialog "можем отправить его вам прямо "
	dialog "сейчас! "
	wait
	choose menu "Пойдем прямо сейчас!" "Я пойду позже."
	case 1
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "хорошо! Если во время мероприятия "
		dialog "у вас будет много <ITEM> "
		dialog "общественных фанатов <INFO> 25367 "
		dialog "</INFO> </ITEM>, приведите их к "
		dialog "нам. Мы отправим его прямо на "
		dialog "место проведения. Конечно, первый "
		dialog "бесплатный! "
		wait
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Тогда я проведу вас прямо сейчас! "
		dialog "Лапша самая лучшая! Лапша самая "
		dialog "лучшая !! "
		close
		moveto "malangdo" 214 90
		return
	break
	case 2
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Мероприятие проводится в первый "
		dialog "месяц большой луны, поэтому "
		dialog "обязательно приходите к нам в "
		dialog "гости позже! Но не опаздывайте, "
		dialog "ведь в полнолуние луна "
		dialog "наклоняется! Лапша самая лучшая! "
		dialog "Лапша самая лучшая !! "
		close
		return
	break
	endchoose
else
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Вам нравится летний фестиваль "
	dialog "лапши? О, я тоже хочу есть лапшу! "
	dialog "Если вы дадите мне рекламный "
	dialog "вентилятор "
	dialog "^0000cd, я направлю вас на сайт мероприятия^000000. "
	dialog " "
	wait
	choose menu "Отправьте прямо сейчас!" "Я пойду позже "
	case 1
		if (v[Promotion_Fan] > 0)
			dialog "[Агент по связям с "
			dialog "общественностью Noodle Festival] "
			dialog "хорошо! Мы проведем вас прямо "
			dialog "сейчас! Лапша самая лучшая! Лапша "
			dialog "самая лучшая !! "
			dropitem Promotion_Fan 1
			close
			moveto "malangdo" 214 90
			return
		else
			dialog "[Агент по связям с "
			dialog "общественностью Noodle Festival] "
			dialog "Эээ... Я не вижу рекламного "
			dialog "вентилятора? Разве вы не оставили "
			dialog "его где-нибудь еще? Пожалуйста, "
			dialog "вернитесь после проверки! Я "
			dialog "пришлю его вам в любое время в "
			dialog "течение всего периода. "
			close
			return
		endif
	break
	case 2
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Мероприятие проводится в первый "
		dialog "месяц большой луны, поэтому "
		dialog "обязательно приходите к нам в "
		dialog "гости позже! Но не опаздывайте, "
		dialog "ведь в полнолуние луна "
		dialog "наклоняется! Лапша самая лучшая! "
		dialog "Лапша самая лучшая !! "
		close
		return
	break
	endchoose
endif
return


npc "moc_para01" "PR-персонал Noodle Festival # 17_add06" 4_CAT_3COLOR 40 20 4 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 0
	SetQuestConditionLevel 50 200
	SetQuestConditionEnd
	
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "PR-персонал Noodle Festival#17_add06" "Жаркое лето, когда тело и разум устали? Как насчет тарелки вкусной лапши?"
return

OnClick:
if (v[VAR_CLEVEL] < 50)
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Хотите присоединиться к фестивалю "
	dialog "лапши? Жалко, но я думаю, тебе "
	dialog "нужно еще немного повзрослеть. "
	close
	return
endif

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Багаж большой, и он выглядит "
		dialog "тяжелым. Как насчет еще? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 0) 
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Доброе утро! Жаркое лето, когда "
	dialog "тело и разум устали? Как насчет "
	dialog "тарелки вкусной лапши? "
	wait
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Сейчас ^0000cdФестиваль лапши^000000 в Малангдо "
	dialog "в самом разгаре! Если вы съедите "
	dialog "тарелку жевательной и вкусной "
	dialog "лапши, вы освежитесь! "
	wait
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Хотите поехать в Малангдо, чтобы "
	dialog "вылечить усталое тело лапшой? Мы "
	dialog "можем отправить его вам прямо "
	dialog "сейчас! "
	wait
	choose menu "Пойдем прямо сейчас!" "Я пойду позже."
	case 1
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "хорошо! Если во время мероприятия "
		dialog "у вас будет много <ITEM> "
		dialog "общественных фанатов <INFO> 25367 "
		dialog "</INFO> </ITEM>, приведите их к "
		dialog "нам. Мы отправим его прямо на "
		dialog "место проведения. Конечно, первый "
		dialog "бесплатный! "
		wait
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Тогда я проведу вас прямо сейчас! "
		dialog "Лапша самая лучшая! Лапша самая "
		dialog "лучшая !! "
		close
		moveto "malangdo" 214 90
		return
	break
	case 2
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Мероприятие проводится в первый "
		dialog "месяц большой луны, поэтому "
		dialog "обязательно приходите к нам в "
		dialog "гости позже! Но не опаздывайте, "
		dialog "ведь в полнолуние луна "
		dialog "наклоняется! Лапша самая лучшая! "
		dialog "Лапша самая лучшая !! "
		close
		return
	break
	endchoose
else
	dialog "[Агент по связям с "
	dialog "общественностью Noodle Festival] "
	dialog "Вам нравится летний фестиваль "
	dialog "лапши? О, я тоже хочу есть лапшу! "
	dialog "Если вы дадите мне рекламный "
	dialog "вентилятор "
	dialog "^0000cd, я направлю вас на сайт мероприятия^000000. "
	dialog " "
	wait
	choose menu "Отправьте прямо сейчас!" "Я пойду позже "
	case 1
		if (v[Promotion_Fan] > 0)
			dialog "[Агент по связям с "
			dialog "общественностью Noodle Festival] "
			dialog "хорошо! Мы проведем вас прямо "
			dialog "сейчас! Лапша самая лучшая! Лапша "
			dialog "самая лучшая !! "
			dropitem Promotion_Fan 1
			close
			moveto "malangdo" 214 90
			return
		else
			dialog "[Агент по связям с "
			dialog "общественностью Noodle Festival] "
			dialog "Эээ... Я не вижу рекламного "
			dialog "вентилятора? Разве вы не оставили "
			dialog "его где-нибудь еще? Пожалуйста, "
			dialog "вернитесь после проверки! Я "
			dialog "пришлю его вам в любое время в "
			dialog "течение всего периода. "
			close
			return
		endif
	break
	case 2
		dialog "[Агент по связям с "
		dialog "общественностью Noodle Festival] "
		dialog "Мероприятие проводится в первый "
		dialog "месяц большой луны, поэтому "
		dialog "обязательно приходите к нам в "
		dialog "гости позже! Но не опаздывайте, "
		dialog "ведь в полнолуние луна "
		dialog "наклоняется! Лапша самая лучшая! "
		dialog "Лапша самая лучшая !! "
		close
		return
	break
	endchoose
endif
return





npc "lasa_sea" "Переключатель Nyil Pig # 1" 4_F_04 1 2 3 0 0

OnInit:
	cmdothernpc "Переключатель Nyil Pig # 1" "start"
return

OnClick:
dlgwrite 0 999999
if (input == 1854)
 dialog "Пароль совпадает!"
 wait
elseif (input == 0)
 dialog "отменить "
 close
 return
else
 dialog "неправильный пароль "
 close
 return
endif

if npcv "Переключатель Nyil Pig # 1" [VAR_MYMOBCOUNT] > 0
	dialog "еще жив "
	close
	return
endif

dialog "[Nyil Pig Switch # 1]"
dialog "Нажмите, когда Найло исчезнет "
dialog "из-за аварии. "
wait
choose menu "отменить " "отменить " "отменить " "отменить " "Вызывает "
case 1
break
case 2
break
case 3
break
case 4
break
case 5
	cmdothernpc "Переключатель Nyil Pig # 1" "start"
break
endchoose
return

OnTimer: 300000
	cmdothernpc "Переключатель Nyil Pig # 1" "start"
	stoptimer
return

OnCommand: "start"
	resetmymob
	callmonster "lasa_sea" E_NYAIL_PIG "Нило " 134 91
	broadcastinmap2 "EE0000" FW_NORMAL 12 0 0 "Неа! Неа!! ня ня ня ня? Неа!!!"
return

OnMyMobDead:
	DelayTime 500
	if npcv "Переключатель Nyil Pig # 1" [VAR_MYMOBCOUNT] < 1
		resetmymob
		var gamja = 0
		while(1)
			if (gamja < 7)
				var x = rand 113 129
				var y = rand 79 98
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(2)
			if (gamja < 7)
				var x = rand 141 154
				var y = rand 54 81
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(3)
			if (gamja < 6)
				var x = rand 143 157
				var y = rand 94 116
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
	endif
	InitTimer
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Картофель свинина льется! Наслаждайтесь радостью урожая!"
return




npc "lasa_sea" "Nyil Pig Switch02 # 2" 4_F_04 1 4 3 0 0

OnInit:
	cmdothernpc "Nyil Pig Switch02 # 2" "start"
return

OnClick:
dlgwrite 0 999999
if (input == 1854)
 dialog "Пароль совпадает!"
 wait
elseif (input == 0)
 dialog "отменить "
 close
 return
else
 dialog "неправильный пароль "
 close
 return
endif

if npcv "Nyil Pig Switch02 # 2" [VAR_MYMOBCOUNT] > 0
	dialog "еще жив "
	close
	return
endif

dialog "[Nyil Pig Switch02 # 2]"
dialog "Нажмите, когда Найло исчезнет "
dialog "из-за аварии. "
wait
choose menu "отменить " "отменить " "отменить " "отменить " "Вызывает "
case 1
break
case 2
break
case 3
break
case 4
break
case 5
	cmdothernpc "Nyil Pig Switch02 # 2" "start"
break
endchoose
return

OnTimer: 300000
	cmdothernpc "Nyil Pig Switch02 # 2" "start"
	stoptimer
return

OnCommand: "start"
	resetmymob
	callmonster "lasa_sea" E_NYAIL_PIG "Нило " 41 41
	broadcastinmap2 "EE0000" FW_NORMAL 12 0 0 "Неа?? Nyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
return

OnMyMobDead:
	DelayTime 500
	if npcv "Nyil Pig Switch02 # 2" [VAR_MYMOBCOUNT] < 1
		resetmymob
		var gamja = 0
		while(1)
			if (gamja < 7)
				var x = rand 36 74
				var y = rand 29 35
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(2)
			if (gamja < 7)
				var x = rand 27 37
				var y = rand 37 61
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(3)
			if (gamja < 6)
				var x = rand 37 61
				var y = rand 54 62
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
	endif
	InitTimer
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Картофель свинина льется! Наслаждайтесь радостью урожая!"
return



npc "lasa_sea" "Nyil Pig Switch03 # 3" 4_F_04 1 6 3 0 0

OnInit:
	cmdothernpc "Nyil Pig Switch03 # 3" "start"
return

OnClick:
dlgwrite 0 999999
if (input == 1854)
 dialog "Пароль совпадает!"
 wait
elseif (input == 0)
 dialog "отменить "
 close
 return
else
 dialog "неправильный пароль "
 close
 return
endif

if npcv "Nyil Pig Switch03 # 3" [VAR_MYMOBCOUNT] > 0
	dialog "еще жив "
	close
	return
endif

dialog "[Nyil Pig Switch03 # 3]"
dialog "Нажмите, когда Найло исчезнет "
dialog "из-за аварии. "
wait
choose menu "отменить " "отменить " "отменить " "отменить " "Вызывает "
case 1
break
case 2
break
case 3
break
case 4
break
case 5
	cmdothernpc "Nyil Pig Switch03 # 3" "start"
break
endchoose
return

OnTimer: 300000
	cmdothernpc "Nyil Pig Switch03 # 3" "start"
	stoptimer
return

OnCommand: "start"
	resetmymob
	callmonster "lasa_sea" E_NYAIL_PIG "Нило " 186 164
	broadcastinmap2 "EE0000" FW_NORMAL 12 0 0 "Nya ~~~ Nyaaaaaaaaaaaaaaaaaaa"
return

OnMyMobDead:
	DelayTime 500
	if npcv "Nyil Pig Switch03 # 3" [VAR_MYMOBCOUNT] < 1
		resetmymob
		var gamja = 0
		while(1)
			if (gamja < 7)
				var x = rand 183 203
				var y = rand 131 150
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(2)
			if (gamja < 7)
				var x = rand 172 185
				var y = rand 156 170
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(3)
			if (gamja < 6)
				var x = rand 189 199
				var y = rand 155 169
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
	endif
	InitTimer
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Картофель свинина льется! Наслаждайтесь радостью урожая!"
return




npc "lasa_sea" "Nyil Pig Switch04 # 4" 4_F_04 1 8 3 0 0

OnInit:
	cmdothernpc "Nyil Pig Switch04 # 4" "start"
return

OnClick:
dlgwrite 0 999999
if (input == 1854)
 dialog "Пароль совпадает!"
 wait
elseif (input == 0)
 dialog "отменить "
 close
 return
else
 dialog "неправильный пароль "
 close
 return
endif

if npcv "Nyil Pig Switch04 # 4" [VAR_MYMOBCOUNT] > 0
	dialog "еще жив "
	close
	return
endif

dialog "[Nyil Pig Switch04 # 4]"
dialog "Нажмите, когда Найло исчезнет "
dialog "из-за аварии. "
wait
choose menu "отменить " "отменить " "отменить " "отменить " "Вызывает "
case 1
break
case 2
break
case 3
break
case 4
break
case 5
	cmdothernpc "Nyil Pig Switch04 # 4" "start"
break
endchoose
return

OnTimer: 300000
	cmdothernpc "Nyil Pig Switch04 # 4" "start"
	stoptimer
return

OnCommand: "start"
	resetmymob
	callmonster "lasa_sea" E_NYAIL_PIG "Нило " 71 186
	broadcastinmap2 "EE0000" FW_NORMAL 12 0 0 "Неа! Неа! Неа! Неа! Неа!"
return

OnMyMobDead:
	DelayTime 500
	if npcv "Nyil Pig Switch04 # 4" [VAR_MYMOBCOUNT] < 1
		resetmymob
		var gamja = 0
		while(1)
			if (gamja < 7)
				var x = rand 63 82
				var y = rand 170 193
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(2)
			if (gamja < 7)
				var x = rand 52 93
				var y = rand 186 202
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(3)
			if (gamja < 6)
				var x = rand 46 74
				var y = rand 164 176
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
	endif
	InitTimer
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Картофель свинина льется! Наслаждайтесь радостью урожая!"
return




npc "lasa_sea" "Nyil Pig Switch05 # 5" 4_F_04 1 10 3 0 0

OnInit:
	cmdothernpc "Nyil Pig Switch05 # 5" "start"
return

OnClick:
dlgwrite 0 999999
if (input == 1854)
 dialog "Пароль совпадает!"
 wait
elseif (input == 0)
 dialog "отменить "
 close
 return
else
 dialog "неправильный пароль "
 close
 return
endif

if npcv "Nyil Pig Switch05 # 5" [VAR_MYMOBCOUNT] > 0
	dialog "еще жив "
	close
	return
endif

dialog "[Nyil Pig Switch05 # 5]"
dialog "Нажмите, когда Найло исчезнет "
dialog "из-за аварии. "
wait
choose menu "отменить " "отменить " "отменить " "отменить " "Вызывает "
case 1
break
case 2
break
case 3
break
case 4
break
case 5
	cmdothernpc "Nyil Pig Switch05 # 5" "start"
break
endchoose
return

OnTimer: 300000
	cmdothernpc "Nyil Pig Switch05 # 5" "start"
	stoptimer
return

OnCommand: "start"
	resetmymob
	callmonster "lasa_sea" E_NYAIL_PIG "Нило " 147 35
	broadcastinmap2 "EE0000" FW_NORMAL 12 0 0 "Ня ня ~ ня! Ня ня ~ ня!"
return

OnMyMobDead:
	DelayTime 500
	if npcv "Nyil Pig Switch05 # 5" [VAR_MYMOBCOUNT] < 1
		resetmymob
		var gamja = 0
		while(1)
			if (gamja < 7)
				var x = rand 127 147
				var y = rand 22 43
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(2)
			if (gamja < 7)
				var x = rand 150 163
				var y = rand 22 35
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(3)
			if (gamja < 6)
				var x = rand 141 154
				var y = rand 38 61
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
	endif
	InitTimer
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "Картофель свинина льется! Наслаждайтесь радостью урожая!"
return



warp "lasa_sea" "# 17gook" 17 144 3 5 5

OnTouch2:
	moveto "malangdo" 214 90
return





