

npc "prontera" "Чёрные усы#2021pirates" 4_CAT_SAILOR2 125 125 5 0 0
OnInit:
	// NpcOverBMP "group_3"

	AddQuestIDCondition 17401
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 0
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "Чёрные усы#2021pirates" "Тысяча чертей! Свистать всех на верх немедленно!"
return

OnClick:
	var pirate_17401 = isbegin_quest 17401
	if (pirate_17401 == 0)
		dialog "[Чёрные усы]"
		dialog "Приветствую тебя, путешественник."
		dialog "Не хочешь ли пойти к нам "
		dialog "матросом? Работка не пыльная!"
		wait
		dialog "[Чёрные усы]"
		dialog "Мы плаваем где хотим, "
		dialog "делаем что хотим. "
		dialog "Берём что хотим... "
		dialog "Ты не пожалеешь! "
		wait
		choose menu "Вы - пираты?"
		endchoose
		dialog "[Чёрные усы]"
		dialog "Мы называем себя "
		dialog "отчаянными торговцами!"
		dialog "Но если ты хочешь узнать больше,"
		dialog "я могу подсказать, где нас "
		dialog "можно найти."
		wait
		choose menu "Где вас найти?"
		endchoose
		dialog "[Чёрные усы]"
		dialog "Конечно у моря! "
		dialog "Насколько я знаю, сейчас "
		dialog "в Альберте пришвартован корабль "
		dialog "под командованием капитана Мьорна."
		wait
		dialog "[Чёрные усы]"
		dialog "В Излюде - корабль капитана Трюка,"
		dialog "статного пир... моряка."
		dialog "И на моём родном Маллане "
		dialog "расположилась команда "
		dialog "капитана Флинта. У них, кажется,"
		dialog "прямо под носом стянули бриг..."
		wait
		dialog "[Чёрные усы]"
		dialog "Куда вас направить?"
		wait
		choose menu "Альберта " "Маллан " "Излюд "
			case 1
				dialog "[Чёрные усы]"
				dialog "Попутного ветра!"
				setquest 17401
				close
				moveto "alberta" 196 196
				return
			break
			case 2
				dialog "[Чёрные усы]"
				dialog "Попутного ветра!"
				setquest 17401
				close
				moveto "malangdo" 216 87
				return
			break
			case 3
				dialog "[Чёрные усы]"
				dialog "Попутного ветра!"
				setquest 17401
				close
				moveto "izlude" 175 183
				return
			break
		endchoose
	else
		dialog "[Чёрные усы]"
		dialog "Насколько я знаю, сейчас "
		dialog "в Альберте пришвартован корабль "
		dialog "под командованием капитана Мьорна."
		wait
		dialog "[Чёрные усы]"
		dialog "В Излюде - корабль капитана Трюка,"
		dialog "статного пир... моряка."
		dialog "И на моём родном Маллане "
		dialog "расположилась команда "
		dialog "капитана Флинта. У них, кажется,"
		dialog "прямо под носом стянули бриг..."
		close
		return
	endif
return




npc "alberta" "Мурмосса#2021pirates" 4_CAT_ADV1 190 205 5 0 0
OnInit:
	// NpcOverBMP "group_3"

	AddQuestIDCondition 17401
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 0
	SetQuestConditionEnd
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 1
	SetQuestConditionEnd
	
	AddQuestIDCondition 17402
	SetQuestConditionBegin 17402 1 4
	SetQuestConditionQuest 17402 0
	SetQuestConditionEnd
	SetQuestConditionBegin 17402 1 4
	SetQuestConditionQuest 17402 1
	SetQuestConditionEnd
	
	AddQuestIDCondition 17405
	SetQuestConditionBegin 17405 1 4
	SetQuestConditionQuest 17405 2
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "Мурмосса#2021pirates" "Разрази меня гром! Или лучше... разрази меня ром!"
return

OnClick:
	var pirate_17401 = isbegin_quest 17401
	if (pirate_17401 == 0)
		setquest 17401
		completequest 17401
	elseif (pirate_17401 == 1)
		completequest 17401
	endif
	var pirate_17400 = isbegin_quest 17400
	var pirate_17402 = isbegin_quest 17402
	var pirate_17403 = isbegin_quest 17403
	var pirate_17404 = isbegin_quest 17404
	var pirate_17413 = isbegin_quest 17413
	var pirate_17414 = isbegin_quest 17414
	var pirate_17415 = isbegin_quest 17415
	var time_check = checkquest_playtime 17405
	
	if ((pirate_17402 == 0) & (pirate_17403 == 0) & (pirate_17404 == 0)) 
		dialog "[Мурмосса]"
		dialog "Интересно, а на всех суднах "
		dialog "так кормят? Терпеть не могу "
		dialog "черепаховый суп... "
		wait
		dialog "[Мурмосса]"
		dialog "Слушай, а можно тебя "
		dialog "попросить узнать, что "
		dialog "происходит у других матросов?"
		dialog "Может мне стоит наконец "
		dialog "сменить капитана..."
		setquest 17402
		completequest 17402
		setquest 17403
		setquest 17404
		close
		return
	elseif ((pirate_17402 == 1) | (pirate_17403 == 1) | (pirate_17404 == 1))
		if (pirate_17402 == 2)
			dialog "[Мурмосса]"
			dialog "Сходи и узнай, как "
			dialog "обстоят дела на других суднах."
			dialog "Я слышал, что другие "
			dialog "пиратские шхуны пришвартовались "
			dialog "около Маллана и Излюда."
			close
			return
		elseif ((pirate_17403 == 1) | (pirate_17404 == 1))
			dialog "[Мурмосса]"
			dialog "Привет, ты что-то хотел?"
			wait
			choose menu "Спросить про условия "
			endchoose
			dialog "[Мурмосса]"
			dialog "Не сказал бы, что легко здесь "
			dialog "быть матросом, но капитан Мьорн "
			dialog "весьма справедлив. Он всегда "
			dialog "делит добычу между всей "
			dialog "командой."
			wait
			dialog "[Мурмосса]"
			dialog "Но кормят здесь просто "
			dialog "отвратительно! Была бы моя "
			dialog "воля, я этому заносчивому "
			dialog "коку руки бы оторвал!"
			completequest 17402
			close
			return
		else
			dialog "[Мурмосса]"
			dialog "Привет, ты что-то хотел?"
			wait
			choose menu "Спросить про условия "
			endchoose
			dialog "[Мурмосса]"
			dialog "Не сказал бы, что легко здесь "
			dialog "быть матросом, но капитан Мьорн "
			dialog "весьма справедлив. Он всегда "
			dialog "делит добычу между всей "
			dialog "командой."
			wait
			dialog "[Мурмосса]"
			dialog "Но кормят здесь просто "
			dialog "отвратительно! Была бы моя "
			dialog "воля, я этому заносчивому "
			dialog "коку руки бы оторвал!"
			choose menu "Рассказать про других "
			endchoose
			wait
			var weight_check = GetInventoryRemainCount 1301 3
			if ((weight_check == 2)|(weight_check == 3))
				dialog "[Мурмосса]"
				dialog "У тебя переполнен инвентарь."
				close
				return
			endif
			dialog "[Мурмосса]"
			dialog "Вот уж не думал..."
			dialog "Хотя, оказывается, кормить "
			dialog "могут крабами! "
			dialog "Ладно... Спасибо, что "
			dialog "рассказал. Завтра приходи еще,"
			dialog "я уйти не могу, сам понимаешь."
			completequest 17402
			setquest 17405
			getitem Jp_event67 1
			getitem Lucky_Potion 10
			getitem Gold_Chocoin 15
			getitem Water_Of_Blessing_ 10
			if ((v[Jp_event67] > 2) & (v[Jp_event67] < 1000))
				dialog "Думаю, это тебе будет "
				dialog "в пору. Ты ведь уже как "
				dialog "часть команды. "
				getitem DragonKnight_Eyepatch 1 
				setitem Jp_event67 1000
			elseif (v[Jp_event67] > 999)
				close
				return
			else
				wait
				dialog "[Мурмосса]"
				dialog "Думаю, если ты еще "
				dialog "пару дней здесь побудешь, "
				dialog "я смогу отыскать для тебя "
				dialog "настоящий пиратский наглазник."
			endif
			close
			return
		endif
	else
		if (time_check == 2)
			var name = PcName
			recall_completequest 17403
			recall_completequest 17404
			recall_completequest 17405
			erasequest 17405
			dialog "[Мурмосса]"
			dialog "О, это снова ты, "+name+"!"
			dialog "Сбегай на другие корабли, "
			dialog "узнай как там дела у матросов,"
			dialog "тебе ведь не сложно, правда?"
			dialog "И передай им эту записку..."
			close
			return
		else
			dialog "[Мурмосса]"
			dialog "Сегодня я больше не могу "
			dialog "отвлекаться от работы. "
			dialog "Приходи завтра."
			close
			return
		endif
	endif
return




npc "malangdo" "Генри Мурган#2021pirates" 4_CAT_SAILOR1 213 85 7 0 0
OnInit:
	// NpcOverBMP "group_3"

	AddQuestIDCondition 17401
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 0
	SetQuestConditionEnd
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 1
	SetQuestConditionEnd
	
	AddQuestIDCondition 17403
	SetQuestConditionBegin 17403 1 4
	SetQuestConditionQuest 17403 1
	SetQuestConditionEnd
	SetQuestConditionBegin 17403 1 4
	SetQuestConditionQuest 17403 0
	SetQuestConditionEnd
	
	AddQuestIDCondition 17405
	SetQuestConditionBegin 17405 1 4
	SetQuestConditionQuest 17405 2
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "Генри Мурган#2021pirates" "Ну что уставился? Не видел плавающих котов?"
return

OnClick:
	var pirate_17401 = isbegin_quest 17401
	if (pirate_17401 == 0)
		setquest 17401
		completequest 17401
	elseif (pirate_17401 == 1)
		completequest 17401
	endif
	
	var pirate_17400 = isbegin_quest 17400
	var pirate_17402 = isbegin_quest 17402
	var pirate_17403 = isbegin_quest 17403
	var pirate_17404 = isbegin_quest 17404
	var pirate_17413 = isbegin_quest 17413
	var pirate_17414 = isbegin_quest 17414
	var pirate_17415 = isbegin_quest 17415
	var time_check = checkquest_playtime 17405
	
	if ((pirate_17402 == 0) & (pirate_17403 == 0) & (pirate_17404 == 0)) 
		dialog "[Генри Мурган]"
		dialog "Я так больше не могу!"
		dialog "Не вынесу! Работать в "
		dialog "таких условиях!"
		dialog "Ни рома, ни отдыха, а "
		dialog "теперь еще и без корабля!"
		wait
		dialog "[Генри Мурган]"
		dialog "Да-да! Только мы пришвартовались,"
		dialog "наши боцманы сразу рванули "
		dialog "отсюда..."
		wait
		dialog "[Генри Мурган]"
		dialog "Не удивительно."
		dialog "Ведь наш 'честный' капитан "
		dialog "всю добычу оставлял себе,"
		dialog "а на команду плевать хотел!"
		wait
		dialog "[Генри Мурган]"
		dialog "Вот что. Сходи и узнай,"
		dialog "можно ли где-нибудь записаться  "
		dialog "матросом или коком..."
		dialog "Да хоть попугаем!"
		dialog "Главное не здесь."
		wait
		dialog "[Генри Мурган]"
		dialog "Я слышал, что в Альберте "
		dialog "и Излюде остановились "
		dialog "судна с черными флагами."
		dialog "Думаю, там ты сможешь "
		dialog "что-нибудь выяснить."
		setquest 17402
		setquest 17403
		completequest 17403
		setquest 17404
		close
		return
	elseif ((pirate_17402 == 1) | (pirate_17403 == 1) | (pirate_17404 == 1))
		if (pirate_17403 == 2)
			dialog "[Генри Мурган]"
			dialog "Сходи и узнай,"
			dialog "можно ли где-нибудь записаться  "
			dialog "матросом или коком..."
			dialog "Да хоть попугаем!"
			dialog "Главное не здесь."
			wait
			dialog "[Генри Мурган]"
			dialog "Я слышал, что в Альберте "
			dialog "и Излюде остановились "
			dialog "судна с черными флагами."
			dialog "Думаю, там ты сможешь "
			dialog "что-нибудь выяснить."
			close
			return
		elseif ((pirate_17402 == 1) | (pirate_17404 == 1))
			dialog "[Генри Мурган]"
			dialog "Тебе что-то нужно?"
			dialog "Чего уставился?"
			wait
			choose menu "Спросить про условия "
			endchoose
			dialog "[Генри Мурган]"
			dialog "А сам не видишь?"
			dialog "Остались без гроша "
			dialog "и без корабля,"
			dialog "зато с капитаном "
			dialog "неудачников."
			wait
			dialog "[Генри Мурган]"
			dialog "Вот бы мне по-тихому "
			dialog "отсюда уйти... "
			wait
			choose menu "Рассказать про других "
			endchoose
			dialog "[Генри Мурган]"
			dialog "Хм, я еще подумаю..."
			dialog "Хотя оставаться здесь еще "
			dialog "хоть на секунду..."
			completequest 17403
			close
			return
		else
			dialog "[Генри Мурган]"
			dialog "Тебе что-то нужно?"
			dialog "Чего уставился?"
			wait
			choose menu "Спросить про условия "
			endchoose
			dialog "[Генри Мурган]"
			dialog "А сам не видишь?"
			dialog "Остались без гроша "
			dialog "и без корабля,"
			dialog "зато с капитаном "
			dialog "неудачников."
			wait
			dialog "[Генри Мурган]"
			dialog "Вот бы мне по-тихому "
			dialog "отсюда уйти... "
			wait
			choose menu "Рассказать про других "
			endchoose
			var weight_check = GetInventoryRemainCount 1301 3
			if ((weight_check == 2)|(weight_check == 3))
				dialog "[Генри Мурган]"
				dialog "У тебя переполнен инвентарь."
				close
				return
			endif
			dialog "[Генри Мурган]"
			dialog "Хм, я еще подумаю..."
			dialog "Хотя оставаться здесь еще "
			dialog "хоть на секунду..."
			dialog "Но спасибо, что рассказал."
			dialog "Завтра приходи еще."
			completequest 17403
			setquest 17405
			getitem Jp_event67 1
			getitem Lucky_Potion 10
			getitem Gold_Chocoin 15
			getitem Water_Of_Blessing_ 10
			if ((v[Jp_event67] > 2) & (v[Jp_event67] < 1000))
				dialog "Я, как и обещал,"
				dialog "раздобыл тебе наглазник."
				dialog "Он помогает морякам "
				dialog "проще ориентироваться "
				dialog "в темноте трюма. Сам попробуй."
				getitem DragonKnight_Eyepatch 1 
				setitem Jp_event67 1000
			elseif (v[Jp_event67] > 999)
				close
				return
			else
				wait
				dialog "[Генри Мурган]"
				dialog "Думаю, если ты еще "
				dialog "пару дней здесь побудешь, "
				dialog "я смогу отыскать для тебя "
				dialog "настоящий пиратский наглазник,"
				dialog "за твою помощь." 
				setquest 17415
				completequest 17415
			endif
			close
			return
		endif
	else
		if (time_check == 2)
			var name = PcName
			recall_completequest 17402
			recall_completequest 17404
			recall_completequest 17405
			erasequest 17405
			dialog "[Генри Мурган]"
			dialog "О, это снова ты, "+name+"!"
			dialog "Сбегай на другие корабли, "
			dialog "узнай как там дела у матросов,"
			dialog "тебе ведь не сложно, правда?"
			dialog "И спроси их про условия..."
			close
			return
			close
			return
		else
			dialog "[Генри Мурган]"
			dialog "Надо подумать, где бы лучше "
			dialog "плавать. Хотя море есть море."
			dialog "Приходи позже, а я пока "
			dialog "здесь поспрашиваю."
			close
			return
		endif
	endif
return




npc "izlude" "Одноглазый Мью#2021pirates" 4_CAT_SAILOR1 198 179 2 0 0
OnInit:
	// NpcOverBMP "group_3"

	AddQuestIDCondition 17401
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 0
	SetQuestConditionEnd
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 1
	SetQuestConditionEnd
	
	AddQuestIDCondition 17404
	SetQuestConditionBegin 17404 1 4
	SetQuestConditionQuest 17404 1
	SetQuestConditionEnd
	SetQuestConditionBegin 17404 1 4
	SetQuestConditionQuest 17404 0
	SetQuestConditionEnd
	
	AddQuestIDCondition 17405
	SetQuestConditionBegin 17405 1 4
	SetQuestConditionQuest 17405 2
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "Одноглазый Мью#2021pirates" "Укуси меня акула, ты же тот самый... Ну как его..."
return

OnClick:
	var pirate_17401 = isbegin_quest 17401
	if (pirate_17401 == 0)
		setquest 17401
		completequest 17401
	elseif (pirate_17401 == 1)
		completequest 17401
	endif
	
	var pirate_17400 = isbegin_quest 17400
	var pirate_17402 = isbegin_quest 17402
	var pirate_17403 = isbegin_quest 17403
	var pirate_17404 = isbegin_quest 17404
	var pirate_17413 = isbegin_quest 17413
	var pirate_17414 = isbegin_quest 17414
	var pirate_17415 = isbegin_quest 17415
	var time_check = checkquest_playtime 17405
	
	if ((pirate_17402 == 0) & (pirate_17403 == 0) & (pirate_17404 == 0)) 
		dialog "[Одноглазый Мью]"
		dialog "Доброго времени суток,"
		dialog "путник, ты хочешь записаться "
		dialog "в команду? Жаль, "
		dialog "но сейчас у нас полная "
		dialog "команда матросов. "
		wait
		choose menu "Кто вы такие? "
		endchoose
		dialog "[Одноглазый Мью]"
		dialog "Хоть мы и ходим под черным "
		dialog "флагом, думаю, что у нас "
		dialog "больше чести, чем у "
		dialog "некоторых моряков и торговцев..."
		wait
		dialog "[Одноглазый Мью]"
		dialog "Если не веришь, можешь сам "
		dialog "сходить спросить. "
		dialog "В других портовых городах,"
		dialog "Альберте и Излюде,"
		dialog "тоже на якоре стоят суда."
		setquest 17402
		setquest 17403
		setquest 17404
		completequest 17404
		close
		return
	elseif ((pirate_17402 == 1) | (pirate_17403 == 1) | (pirate_17404 == 1))
		if (pirate_17404 == 2)
			dialog "[Одноглазый Мью]"
			dialog "Хоть мы и ходим под черным "
			dialog "флагом, думаю, что у нас "
			dialog "больше чести, чем у "
			dialog "некоторых моряков и торговцев..."
			wait
			dialog "[Одноглазый Мью]"
			dialog "Сходи спроси сам."
			dialog "В других портовых городах,"
			dialog "Альберте и Излюде,"
			dialog "тоже на якоре стоят суда."
			close
			return
		elseif ((pirate_17402 == 1) | (pirate_17403 == 1))
			dialog "[Одноглазый Мью]"
			dialog "Если ты хочешь записаться "
			dialog "в команду? Жаль, "
			dialog "но сейчас у нас полная "
			dialog "команда матросов. "
			wait
			choose menu "Спросить про условия "
			endchoose
			dialog "[Одноглазый Мью]"
			dialog "На самом деле, я очень рад, "
			dialog "что попал в эту команду."
			dialog "У нас все делают своё дело,"
			dialog "никто и подумать не может о бунте."
			wait
			dialog "[Одноглазый Мью]"
			dialog "Добыча делится между всеми,"
			dialog "а еще и кок у нас с острова "
			dialog "Маллан, Орчо, может вы "
			dialog "слышали о нём. Он "
			dialog "всегда заботится о том,"
			dialog "чтобы команда была сыта."
			wait
			choose menu "Рассказать про других "
			endchoose
			dialog "[Одноглазый Мью]"
			dialog "Ну, не сказать, что я этого "
			dialog "не ожидал... Капитаны "
			dialog "редко славятся честолюбием."
			dialog "В отличие от нашего,"
			dialog "конечно, хе-хе."
			completequest 17404
			close
			return
		else
			dialog "[Одноглазый Мью]"
			dialog "Если ты хочешь записаться "
			dialog "в команду? Жаль, "
			dialog "но сейчас у нас полная "
			dialog "команда матросов. "
			wait
			choose menu "Спросить про условия "
			endchoose
			dialog "[Одноглазый Мью]"
			dialog "На самом деле, я очень рад, "
			dialog "что попал в эту команду."
			dialog "У нас все делают своё дело,"
			dialog "никто и подумать не может о бунте."
			wait
			dialog "[Одноглазый Мью]"
			dialog "Добыча делится между всеми,"
			dialog "а еще и кок у нас с острова "
			dialog "Маллан, Орчо, может вы "
			dialog "слышали о нём. Он "
			dialog "всегда заботится о том,"
			dialog "чтобы команда была сыта."
			wait
			choose menu "Рассказать про других "
			endchoose
			dialog "[Одноглазый Мью]"
			dialog "Ну, не сказать, что я этого "
			dialog "не ожидал... Капитаны "
			dialog "редко славятся честолюбием."
			dialog "Но за информацию спасибо."
			dialog "Возможно мы всё-таки сможем "
			dialog "взять пару славных ребят на борт."
			wait
			var weight_check = GetInventoryRemainCount 1301 3
			if ((weight_check == 2)|(weight_check == 3))
				dialog "[Генри Мурган]"
				dialog "У тебя переполнен инвентарь."
				close
				return
			endif
			dialog "[Одноглазый Мью]"
			dialog "Я поговорю с капитаном, "
			dialog "а ты приходи завтра,"
			dialog "хорошо?"
			completequest 17404
			setquest 17405
			getitem Jp_event67 1
			getitem Lucky_Potion 10
			getitem Gold_Chocoin 15
			getitem Water_Of_Blessing_ 10
			if ((v[Jp_event67] > 2) & (v[Jp_event67] < 1000))
				dialog "Я подумаю насчёт того,"
				dialog "чтобы взять Генри..."
				dialog "Непростая у него ситуация,"
				dialog "не так ли? Но а тебе за помощь "
				dialog "я, как и обещал, полагается "
				dialog "кое-что. Примерь-ка."
				getitem DragonKnight_Eyepatch 1 
				setitem Jp_event67 1000
			elseif (v[Jp_event67] > 999)
				close
				return
			else
				wait
				dialog "[Одноглазый Мью]"
				dialog "А тебе я бы мог предложить "
				dialog "уникальный наглазник, "
				dialog "если мы всё же возьмём "
				dialog "кого-нибудь по твоей наводке."
				setquest 17415
				completequest 17415
			endif
			close
			return
		endif
	else
		if (time_check == 2)
			recall_completequest 17402
			recall_completequest 17403
			recall_completequest 17405
			erasequest 17405
			dialog "[Одноглазый Мью]"
			dialog "Хоть мы и ходим под черным "
			dialog "флагом, думаю, что у нас "
			dialog "больше чести, чем у "
			dialog "некоторых моряков и торговцев..."
			wait
			dialog "[Одноглазый Мью]"
			dialog "Спроси сам у других моряков,"
			dialog "а заодно и спроси, не хотят "
			dialog "ли они к нам на борт."
			close
			return
		else
			dialog "[Одноглазый Мью]"
			dialog "Я поговорю с капитаном, "
			dialog "а ты приходи завтра,"
			dialog "хорошо?"
			close
			return
		endif
	endif
return


npc "alberta" "Капитан Мьорн#2021pirates" 4_CAT_ADMIRAL 195 202 4 0 0
OnInit:
	// NpcOverBMP "group_3"

	AddQuestIDCondition 17401
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 0
	SetQuestConditionEnd
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 1
	SetQuestConditionEnd
	
	AddQuestIDCondition 17410
	SetQuestConditionBegin 17410 1 4
	SetQuestConditionQuest 17410 0
	SetQuestConditionEnd
	
	AddQuestIDCondition 17412
	SetQuestConditionBegin 17412 1 4
	SetQuestConditionQuest 17412 2
	SetQuestConditionEnd
	
	AddQuestIDCondition 17411
	SetQuestConditionBegin 17411 1 4
	SetQuestConditionQuest 17411 1
	SetQuestConditionEnd
return

OnClick:

	var weight_check = GetInventoryRemainCount 1301 3
	if ((weight_check == 2)|(weight_check == 3))
		dialog "[Капитан Мьорн]"
		dialog "У тебя переполнен инвентарь."
		close
		return
	endif
			
	var pirate_17401 = isbegin_quest 17401
	if (pirate_17401 == 0)
		setquest 17401
		completequest 17401
	elseif (pirate_17401 == 1)
		completequest 17401
	endif
	
	var pirate_17410 = isbegin_quest 17410
	var pirate_17411 = isbegin_quest 17411
	var time_check = checkquest_playtime 17412
	
	if (pirate_17411 == 1)
		dialog "[Капитан Мьорн]"
		dialog "Я вижу ты нашёл тайники,"
		dialog "что же, похвально."
		dialog "Думаю, мы с командой "
		dialog "скоро туда наведаемся."
		wait
		dialog "[Капитан Мьорн]"
		dialog "Если ты и завтра не "
		dialog "растеряешь свою удачу,"
		dialog "то обязательно приходи."
		getitem Lucky_Potion 30
		getitem Gold_Chocoin 20
		completequest 17411
		setquest 17412
		close
		return
	elseif (pirate_17410 == 1)
		dialog "[Капитан Мьорн]"
		dialog "Не нашел?"
		dialog "Нам нужно узнать где "
		dialog "местные торговцы любят "
		dialog "прятать свои драгоценности."
		wait
		dialog "[Капитан Мьорн]"
		dialog "Такие места они обычно "
		dialog "обозначают меткой."
		close
		return
	elseif (pirate_17410 == 0) 
		dialog "[Капитан Мьорн]"
		dialog "Добрый день."
		dialog "Если вы хотите в команду,"
		dialog "обратитесь к Генри."
		wait
		choose menu "Нужна ли помощь? "
		endchoose
		dialog "[Капитан Мьорн]"
		dialog "Ты думаешь, мы сами "
		dialog "не справляемся?"
		dialog "У нас лучшая команда "
		dialog "во всём Рун-Мидгарде!"
		dialog "Хотя погоди-ка..."
		dialog "Есть одна вещь..."
		wait
		dialog "[Капитан Мьорн]"
		dialog "Нам нужно узнать, где "
		dialog "местные торговцы любят "
		dialog "прятать свои драгоценности."
		dialog "Главное - найди наводку,"
		dialog "а дальше мы сами..."
		wait
		dialog "[Капитан Мьорн]"
		dialog "Такие места они обычно "
		dialog "обозначают меткой."
		setquest 17410
		close
		return
	else
		if (time_check == 2)
			var name = PcName
			recall_completequest 17410
			erasequest 17410
			setquest 17410
			recall_completequest 17411
			erasequest 17411
			recall_completequest 17412
			erasequest 17412
			dialog "[Капитан Мьорн]"
			dialog "Рад тебя видеть,"
			dialog ""+name+"!"
			wait
			dialog "[Капитан Мьорн]"
			dialog "Если ты снова свободен,"
			dialog "нам нужно узнать, где "
			dialog "местные торговцы любят "
			dialog "прятать свои драгоценности."
			dialog "Главное - найди наводку,"
			dialog "а дальше мы сами..."
			wait
			dialog "[Капитан Мьорн]"
			dialog "Такие места они обычно "
			dialog "обозначают меткой."
			close
			return
		else
			dialog "[Капитан Мьорн]"
			dialog "На сегодня нам хватит."
			dialog "Возвращайся завтра."
			close
			return
		endif
	endif
return



npc "malangdo" "Капитан Флинт#2021pirates" 4_CAT_SAILOR5 213 92 6 0 0
OnInit:
	// NpcOverBMP "group_3"

	AddQuestIDCondition 17401
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 0
	SetQuestConditionEnd
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 1
	SetQuestConditionEnd
	
	AddQuestIDCondition 17408
	SetQuestConditionBegin 17408 1 4
	SetQuestConditionQuest 17408 2
	SetQuestConditionEnd
	SetQuestConditionBegin 17408 1 4
	SetQuestConditionQuest 17408 0
	SetQuestConditionEnd
	
	AddQuestIDCondition 17409
	SetQuestConditionBegin 17409 1 4
	SetQuestConditionQuest 17409 2
	SetQuestConditionEnd
return

OnClick:
	var weight_check = GetInventoryRemainCount 1301 3
	if ((weight_check == 2)|(weight_check == 3))
		dialog "[Капитан Флинт]"
		dialog "У тебя переполнен инвентарь."
		close
		return
	endif

	var pirate_17401 = isbegin_quest 17401
	if (pirate_17401 == 0)
		setquest 17401
		completequest 17401
	elseif (pirate_17401 == 1)
		completequest 17401
	endif
	
	var pirate_17408 = isbegin_quest 17408
	var hunt_check = checkquest_hunting 17408
	var time_check = checkquest_playtime 17409
	
	if (pirate_17408 == 0) 
		dialog "[Капитан Флинт]"
		dialog "Да мне плевать на это,"
		dialog "просто отдай рыбу мне!"
		wait
		dialog "[Капитан Флинт]"
		dialog "А ты еще кто?"
		dialog "Не хватало, чтобы у нас тут "
		dialog "еще один конкурент появился..."
		wait
		choose menu "Кажется, дела у вас плохи "
		endchoose
		dialog "[Капитан Флинт]"
		dialog "Неужели?"
		dialog "Да, у нас украли кобраль,"
		dialog "что может быть еще хуже?"	
		wait
		dialog "[Капитан Флинт]"
		dialog "Еще и эти слухи про "
		dialog "мертвецов... Никаких мертвецов!"
		dialog "Матросы и сейчас работать "
		dialog "не хотят, а теперь еще и "
		dialog "эти сказки им голову забили. "
		wait
		dialog "[Капитан Флинт]"
		dialog "Если найдешь хоть одного "
		dialog "мертвеца - тогда и посмотрим."
		setquest 17408
		close
		return
	elseif (pirate_17408 == 1)
		if (hunt_check == 2)
			dialog "[Капитан Флинт]"
			dialog "Не могу поверить "
			dialog "в это..."
			wait
			dialog "[Капитан Флинт]"
			dialog "Если это правда, и по полям "
			dialog "блуждают мертвецы, то надо "
			dialog "с этим что-то делать."
			dialog "Приходи завтра. "
			dialog "Думаю, твоя помощь "
			dialog "еще понадобится."
			getitem Lucky_Potion 20
			getitem Water_Of_Blessing_ 20
			completequest 17408
			setquest 17409
			close
			return
		else
			dialog "[Капитан Флинт]"
			dialog "Если это правда, и по полям "
			dialog "блуждают мертвецы, то надо "
			dialog "с этим что-то делать."
			dialog "Давай-ка ты найдешь их "
			dialog "главаря и разберёшься с ним."
			close
			return
		endif
	else
		if (time_check == 2)
			recall_completequest 17408
			erasequest 17408
			setquest 17408
			recall_completequest 17409
			erasequest 17409
			dialog "[Капитан Флинт]"
			dialog "До сих пор не могу поверить "
			dialog "в это..."
			wait
			dialog "[Капитан Флинт]"
			dialog "Если это правда, и по полям "
			dialog "блуждают мертвецы, то надо "
			dialog "с этим что-то делать."
			dialog "Давай-ка ты найдешь их "
			dialog "главаря и разберёшься с ним."
			close
			return
		else
			dialog "[Капитан Флинт]"
			dialog "Кажется, мертвецов поблизости "
			dialog "больше не видно. Но еще не "
			dialog "завтра. "
			close
			return
		endif
	endif
return



npc "izlude" "Капитан Трюк#2021pirates" 4_CAT_SAILOR5 177 185 3 0 0
OnInit:
	// NpcOverBMP "group_3"

	AddQuestIDCondition 17401
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 0
	SetQuestConditionEnd
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 1
	SetQuestConditionEnd
	
	AddQuestIDCondition 17406
	SetQuestConditionBegin 17406 1 4
	SetQuestConditionQuest 17406 0
	SetQuestConditionEnd
	SetQuestConditionBegin 17406 1 4
	SetQuestConditionQuest 17406 1
	SetQuestConditionItem 656 0 "<"
	SetQuestConditionItem 512 9 "<"
	SetQuestConditionItem 517 4 "<"
	SetQuestConditionEnd
	
	AddQuestIDCondition 17407
	SetQuestConditionBegin 17407 1 4
	SetQuestConditionQuest 17407 2
	SetQuestConditionEnd
return

OnClick:
	var weight_check = GetInventoryRemainCount 1301 3
	if ((weight_check == 2)|(weight_check == 3))
		dialog "[Капитан Трюк]"
		dialog "У тебя переполнен инвентарь."
		close
		return
	endif

	var pirate_17401 = isbegin_quest 17401
	if (pirate_17401 == 0)
		setquest 17401
		completequest 17401
	elseif (pirate_17401 == 1)
		completequest 17401
	endif
	
	var pirate_17406 = isbegin_quest 17406
	var time_check = checkquest_playtime 17407
	
	if (pirate_17406 == 0) 
		dialog "[Капитан Трюк]"
		dialog "В последнее время "
		dialog "матросы жалуются на пищу,"
		dialog "но ведь и последний налёт "
		dialog "у нас провалился..."
		wait
		dialog "[Капитан Трюк]"
		dialog "Да я бы купил припасы,"
		dialog "но где я возьму зени на "
		dialog "всё это... Это наш постоянный "
		dialog "порт, мы не может грабить тут."
		wait
		dialog "[Капитан Трюк]"
		dialog "Если ты принесёшь "
		dialog "^0000FF5 Мяса^000000, ^0000FFЗелье пробуждения^000000,"
		dialog "и ^0000FF10 Яблок^000000,"
		dialog "я был бы очень благодарен."
		setquest 17406
		close
		return
	elseif (pirate_17406 == 1)
		if ((v[Apple] > 9) & (v[Meat] > 4) & (v[Awakening_Potion] > 0))
			dialog "[Капитан Трюк]"
			dialog "Спасибо."
			dialog "Думаю, пока мы в порту,"
			dialog "было бы неплохо, если бы ты "
			dialog "снабжал нас припасами. "
			dialog "Мы взамен можем поделиться ромом,"
			dialog "уж его у нас в избытке..."
			dropitem Apple 10
			dropitem Meat 5
			dropitem Awakening_Potion 1
			getitem Lucky_Potion 20
			getitem Water_Of_Blessing_ 10
			getitem Gold_Chocoin 5
			completequest 17406
			setquest 17407
			close
			return
		else
			dialog "[Капитан Трюк]"
			dialog "Ничего не принёс?"
			close
			return
		endif
	else
		if (time_check == 2)
			recall_completequest 17407
			recall_completequest 17406
			erasequest 17407
			dialog "[Капитан Трюк]"
			dialog "В последнее время "
			dialog "матросы жалуются на пищу."
			wait
			dialog "[Капитан Трюк]"
			dialog "Если ты принесёшь "
			dialog "^0000FF5 Мяса^000000, ^0000FFЗелье пробуждения^000000,"
			dialog "и ^0000FF10 Яблок^000000,"
			dialog "я был бы очень благодарен."
			close
			return
		else
			dialog "[Капитан Трюк]"
			dialog "Мы с командой очень "
			dialog "благодарны за помощь. "
			dialog "Думаю, пока мы в порту,"
			dialog "было бы неплохо, если бы ты "
			dialog "снабжал нас припасами. "
			close
			return
		endif
	endif
return




