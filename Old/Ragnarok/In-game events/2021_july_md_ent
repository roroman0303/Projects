
npc "malangdo" "ТП отсюда#17july" 4_M_MIKID 210 110 5 5 5
OnClick:
	moveto "prontera" 125 125
return

npc "malangdo" "Чарли#17july" 4_M_MIKID 207 110 5 5 5

OnInit:
	AddQuestIDCondition 14714
	SetQuestConditionBegin 14714 1 4
	SetQuestConditionQuest 14697 3
	SetQuestConditionQuest 14714 0
	SetQuestConditionLevel 100 200
	SetQuestConditionEnd
return

OnTouch2:
var noodle_14714 = isbegin_quest 14714
if ((noodle_14697 == 2) & (noodle_14714 == 0) & (v[VAR_CLEVEL] > 99))
	Talk2me "Чарли#17july" "У моей сестры сегодня нет новостей."
endif
return

OnClick:
if (v[VAR_CLEVEL] < 100)
	dialog "[Чарли]"
	dialog "Мне нужна помощь сильного и "
	dialog "опытного человека... "
	close
	return
endif

var name = PcName
var noodle_14714 = isbegin_quest 14714
if ((noodle_14714 == 0) & (noodle_14697 == 2))
	dialog "[Чарли]"
	dialog "У моей сестры сегодня нет новостей."
	wait
	choose menu "Это праздник, но твое лицо выглядит темным."
	case 1
	break
	endchoose
	dialog "[Чарли]"
	dialog "Это все из-за фестиваля. Даже "
	dialog "если я не приехала сюда, моя "
	dialog "сестра пришла! "
	wait
	choose menu "что случилось с твоей сестрой?"
	case 1
	break
	endchoose
	dialog "[Чарли]"
	dialog "Мы с братом любим приключения. И "
	dialog "я очень люблю вкусную еду. Я "
	dialog "приехал сюда, потому что "
	dialog "фестиваль лапши был в самом "
	dialog "разгаре. "
	wait
	dialog "[Чарли]"
	dialog "И я слышал историю о пещере "
	dialog "Дорадо, где уши наших братьев и "
	dialog "сестер, которые жестко ели лапшу, "
	dialog "были полны сокровищ. Мы следили "
	dialog "за слухами о пещере как о долге "
	dialog "авантюриста. "
	wait
	dialog "[Чарли]"
	dialog "И я слышал информацию о пещере от "
	dialog "кого-то, кто был в пещере. Но он "
	dialog "сказал, что для меня было слишком "
	dialog "опасно ехать в детстве. "
	wait
	dialog "[Чарли]"
	dialog "Итак, она оставила меня одного и "
	dialog "ушла на встречу с другим "
	dialog "человеком. Тогда мне следовало "
	dialog "пойти с тобой. Моя сестра не "
	dialog "возвращается даже после того, как "
	dialog "прошло много времени. "
	wait
	dialog "[Чарли]"
	dialog "Когда я спросил окружающих, они "
	dialog "сказали, что никто из ушедших не "
	dialog "вернулся. Тем не менее, моя "
	dialog "сестра придет. точно. Так что я "
	dialog "все еще жду здесь. "
	wait
	choose menu "от кого вы слышали?"
	case 1
	break
	endchoose
	dialog "[Чарли]"
	dialog "Зачем? Ты тоже будешь "
	dialog "авантюристом? Тогда возьми и "
	dialog "меня! Я пойду найду свою сестру! "
	dialog "Два человека лучше, чем один! "
	wait
	choose menu "Пойдем "
	case 1
	break
	endchoose
	dialog "[Чарли]"
	dialog "Ага!! "
	dialog "<NAVI>_Зайдите_[сюда]_<INFO> "
	dialog "malangdo, 133,117,000,0, </INFO> "
	dialog "</NAVI>, чтобы встретиться. "
	setquest 14714
	close
	return
elseif (noodle_14714 == 1)
	dialog "[Чарли]"
	dialog " "
	dialog "<NAVI>_Если_вы_пойдете_[сюда]_<INFO> "
	dialog "malangdo, 133,117,000,0, </INFO> "
	dialog "</NAVI>, вы можете встретить "
	dialog "человека, который знает о пещере "
	dialog "Ньяил. "
	close
	return
else
	dialog "[Чарли]"
	dialog "У моей сестры сегодня нет новостей."
	close
	return
endif
return


npc "malangdo" "форд#17july" 4_CAT_SAILOR3 133 117 3 0 0

OnInit:
	AddQuestIDCondition 14714
	SetQuestConditionBegin 14714 1 4
	SetQuestConditionQuest 14714 1
	SetQuestConditionEnd
return

OnClick:
var noodle_14714 = isbegin_quest 14714
var noodle_14715 = isbegin_quest 14715
if (noodle_14714 == 1)
	dialog "[форд]"
	dialog "Я думаю, меня вырвет"
	wait
	dialog "[Колокол]"
	dialog "Но тебе стоит что-нибудь съесть."
	wait
	// ShowEffect "Чарли#17july01" EF_TELEPORTATION2
	ShowCinematicNpc "Чарли#17july01" 1
	dialog "[Чарли]"
	dialog "Доброе утро?"
	wait
	dialog "[форд]"
	dialog "вы помните меня Я приходил сюда "
	dialog "со своей старшей сестрой раньше и "
	dialog "ходил за информацией о Дорадо. "
	wait
	dialog "[Колокол]"
	dialog "О, этот маленький мальчик. Но... "
	dialog "человек, с которым я общаюсь, не "
	dialog "похож на старшую сестру, как бы я "
	dialog "на это ни смотрел? "
	wait
	dialog "[Чарли]"
	dialog "Моя сестра не вернулась с тех "
	dialog "пор, как уехала в Дорадо. Как и "
	dialog "все. "
	wait
	dialog "[Колокол]"
	dialog "Я скоро вернусь. ждать."
	wait
	dialog "[Чарли]"
	dialog "Все так ждут."
	wait
	choose menu "Я хочу знать о Дорадо."
	case 1
	break
	endchoose
	dialog "[Колокол]"
	dialog "Вы не обязаны это говорить, если "
	dialog "не хотите. "
	wait
	dialog "[форд]"
	dialog "Пещера, пещера... Это была "
	dialog "пещера, на которую я наткнулся "
	dialog "случайно во время путешествия. "
	dialog "Пещера, полная сокровищ, о "
	dialog "которых рассказывают только "
	dialog "легенды... Действительно, пещера "
	dialog "была полна сокровищ. "
	wait
	dialog "[форд]"
	dialog "Я и мои коллеги, починив лодку и "
	dialog "погрузив в нее сокровища, "
	dialog "отправились в путь. Но, опять же, "
	dialog "я встретил бурю и вернулся только "
	dialog "я. С этим ожерельем... "
	wait
	dialog "[Колокол]"
	dialog "Когда многие люди увидели это "
	dialog "ожерелье, принесенное форд, все "
	dialog "они отправились на остров с "
	dialog "мечтой. После этого люди, до "
	dialog "которых дошли слухи о колье, "
	dialog "продолжали приходить. "
	wait
	dialog "[Колокол]"
	dialog "форд очень пострадал от этих "
	dialog "людей. смотрю. это лицо. Я ничего "
	dialog "не мог есть и был худым. Так что, "
	dialog "пожалуйста, остановись сейчас. "
	wait
	choose menu "Я хотел бы знать, где это."
	case 1
	break
	endchoose
	dialog "[Колокол]"
	dialog "Ты тоже хочешь сокровищ? "
	dialog "Достаточно приставать к больному, "
	dialog "чтобы получить информацию? форд "
	dialog "означает, что после "
	dialog "предоставления информации людям, "
	dialog "спрашивающим о местонахождении, "
	dialog "он всегда тяжело болеет. "
	wait
	dialog "[Чарли]"
	dialog "Я должен найти свою сестру!"
	wait
	dialog "[форд]"
	dialog "Малыш, как я уже сказал, ты "
	dialog "слишком молод, чтобы туда идти. "
	dialog "Вот почему твоя сестра тоже "
	dialog "бросила тебя. "
	wait
	dialog "[Чарли]"
	dialog "Но она не вернется! Давай, дай "
	dialog "мне знать! "
	wait
	dialog "[Колокол]"
	dialog "Если вам интересно, Райан только "
	dialog "что вернулся из Дорадо, так что "
	dialog "ищите его. Я также сказал твоей "
	dialog "сестре найти его. "
	wait
	choose menu "Кто-нибудь еще вернулся?"
	case 1
	break
	endchoose
	dialog "[Колокол]"
	dialog "Так что, пожалуйста, перестань "
	dialog "нас искать. Должен ли я переехать "
	dialog "или "
	wait
	dialog "[Чарли]"
	dialog "Где этот человек?"
	wait
	dialog "[Колокол]"
	dialog "<NAVI>_[Угол_Малангдо]_<INFO> "
	dialog "Малангдо, 217 277 000,0, </INFO> "
	dialog "</NAVI> Вот. Его зовут Райан. Мы "
	dialog "собираем там людей и регулярно "
	dialog "говорим о Дорадо. "
	wait
	dialog "[форд]"
	dialog "Дитя, пожалуйста, не уходи, "
	dialog "потому что я тебя умоляю. "
	wait
	dialog "[Чарли]"
	dialog "Потому что мне нужно найти "
	dialog "сестру! Авантюрист, давай! "
	wait
	ShowCinematicNpc "Чарли#17july01" 0
	dialog "[форд]"
	dialog "......"
	completequest 14714
	setquest 14715
	close
	return
elseif (noodle_14715 == 1)
	dialog "[форд]"
	dialog "Дорадо - это..."
	wait
	dialog "[Колокол]"
	dialog " "
	dialog "<NAVI>_[Райан]_Вам_следует_посетить_<INFO>malangdo "
	dialog "217 277 000,0 ,</INFO> </NAVI>. "
	dialog "Не беспокойся больше форд. "
	close
	return
else
	dialog "[форд]"
	dialog "Вы здесь, чтобы услышать о Дорадо?"
	wait
	dialog "[Колокол]"
	dialog "Перестань говорить на сегодня и "
	dialog "отдохни. "
	close
	return
endif
return

npc "malangdo" "Колокол#17july" 4_WHITETIGER 131 115 7 0 0

OnClick:
var noodle_14714 = isbegin_quest 14714
var noodle_14715 = isbegin_quest 14715
if (noodle_14714 == 1)
	dialog "[Колокол]"
	dialog "Ты опять пришел мучить этот форд? "
	dialog "Теперь просто позволь ему "
	dialog "отдохнуть. Информацию можно "
	dialog "получить у других. "
	close
	return
elseif (noodle_14715 == 1)
	dialog "[Колокол]"
	dialog "Пойдем к Райану. Я здесь. И "
	dialog "больше не беспокойтесь форд. "
	close
	return
else
	dialog "[Колокол]"
	dialog "Даже не мечтайте спрашивать о "
	dialog "Дорадо. "
	close
	return
endif
return

npc "malangdo" "Чарли#17july01" 4_M_MIKID 132 120 1 0 0

OnInit:
SetCinematicNpc 0
return

npc "malangdo" "Чарли#17july02" 4_M_MIKID 214 276 7 0 0

OnInit:
SetCinematicNpc 0
return

npc "malangdo" "Райан#17july" 4_M_BOSSCAT 217 277 3 0 0

OnInit:
	AddQuestIDCondition 14715
	SetQuestConditionBegin 14715 1 4
	SetQuestConditionQuest 14715 1
	SetQuestConditionEnd
	
	AddQuestIDCondition 14716
	SetQuestConditionBegin 14716 1 4
	SetQuestConditionQuest 14716 2
	SetQuestConditionEnd
	
	AddQuestIDCondition 14717
	SetQuestConditionBegin 14717 1 4
	SetQuestConditionQuest 14717 2
	SetQuestConditionEnd
return

OnClick:
var mas_ter = (v[VAR_ISPARTYMASTER])
var par_mem = (v[VAR_CPARTY])
var par_name = PartyName
var md_name = "Legendary Dorado"
var name = PcName

if (par_mem > 0)
	if (mas_ter == 1)
	else
		dialog "[Райан]"
		dialog "Вы в настоящее время не лидер "
		dialog "партии? Хотите создать партию из "
		dialog "одного человека? "
		close
		return
	endif
else
	dialog "[Райан]"
	dialog "Вы не присоединились к тусовке ^0000cd^000000? "
	dialog "Основа приключения - вечеринка! "
	close
	return
endif


var noodle_14715 = isbegin_quest 14715
var noodle_14716 = isbegin_quest 14716
var noodle_14717 = isbegin_quest 14717
var noodle_14718 = isbegin_quest 14718
var hunt_chek01 = checkquest_hunting 14716
var hunt_chek02 = checkquest_hunting 14718
var time_check01 = checkquest_playtime 14717

if (noodle_14715 == 1)
	dialog "[Райан]"
	dialog "Что со мной не так? Хотите узнать "
	dialog "о Дорадо? "
	wait
	choose menu "Да. Я думаю."
	case 1
	break
	endchoose
	// ShowEffect "Чарли#17july02" EF_TELEPORTATION2
	ShowCinematicNpc "Чарли#17july02" 1
	dialog "[Чарли]"
	dialog "Я тоже!"
	wait
	dialog "[Райан]"
	dialog "Это пещера, полная золота. Стены "
	dialog "и полы - все сверкающие "
	dialog "драгоценности. Пещеры полны "
	dialog "сокровищ. посмотри на это Там "
	dialog "полно таких вещей! "
	wait
	choose menu "Как туда попасть?"
	case 1
	break
	endchoose
	dialog "[Райан]"
	dialog "ты пойдешь туда? Но ребенок рядом "
	dialog "с ним выглядит слишком молодым, "
	dialog "чтобы туда идти. Для такого "
	dialog "маленького ребенка, как ты, идти "
	dialog "туда опасно, малыш. "
	wait
	dialog "[Чарли]"
	dialog "Я тоже могу пойти! Мне нужно "
	dialog "найти сестру! "
	wait
	dialog "[Райан]"
	dialog "сестра?"
	wait
	dialog "[Чарли]"
	dialog "Моя старшая сестра тоже сказала, "
	dialog "что отправляется на поиски "
	dialog "сокровищ. Я приехал сюда, потому "
	dialog "что думал, что получил информацию "
	dialog "от своего брата. "
	wait
	dialog "[Райан]"
	dialog "Вы ходили в форд? Да, я помню. "
	dialog "Кто-то вроде тебя пришел. Было бы "
	dialog "хорошо, если бы я пошел с другими "
	dialog "коллегами? "
	wait
	choose menu "Сколько времени это занимает?"
	case 1
	break
	endchoose
	dialog "[Райан]"
	dialog "Это зависит от того, насколько "
	dialog "вам повезло. Это может занять "
	dialog "год, месяц или неделю! Если бы "
	dialog "Дорадо нашли так легко, ее не зря "
	dialog "назвали бы легендой. "
	wait
	choose menu "Вы можете указать мне дорогу?"
	case 1
	break
	endchoose
	dialog "[Райан]"
	dialog "Мне? Нет, я собираюсь арендовать "
	dialog "лодку побольше и соберу кучу "
	dialog "людей. Готовлюсь сейчас. Но и "
	dialog "авантюристам следует "
	dialog "поторопиться. "
	wait
	dialog "[Райан]"
	dialog "Здесь масса сокровищ, но другие "
	dialog "люди, нашедшие пещеру, могут "
	dialog "принести их все с вами, верно? "
	wait
	dialog "[Чарли]"
	dialog "То же самое и с моим братом."
	wait
	dialog "[Райан]"
	dialog "я в порядке Потому что я уверен, "
	dialog "что могу идти быстрее, чем "
	dialog "кто-либо другой. "
	wait
	choose menu "Подскажите, пожалуйста, дорогу."
	case 1
	break
	endchoose
	dialog "[Райан]"
	dialog "Просто дайте мне свинину и "
	dialog "картошку, и я помогу вам найти "
	dialog "паром, чтобы добраться туда. Но "
	dialog "мальчик, давай подождем здесь со "
	dialog "мной. "
	wait
	dialog "[Чарли]"
	dialog "Зачем!"
	wait
	dialog "[Райан]"
	dialog "ты сказал Ребенку ехать опасно."
	wait
	dialog "[Чарли]"
	dialog "Я тоже найду свою сестру!"
	wait
	choose menu "Я найду свою сестру."
	case 1
	break
	endchoose
	dialog "[Чарли]"
	dialog "В самом деле? все хорошо?"
	wait
	choose menu "Я иду на это."
	case 1
	break
	endchoose
	dialog "[Чарли]"
	dialog "Авантюрист, ты такой хороший "
	dialog "человек... Мою сестру зовут "
	dialog "Валери! Кстати, можно подать "
	dialog "свинину с картошкой? "
	wait
	dialog "[Райан]"
	dialog "Неважно, кто дает Итак, вы идете "
	dialog "сейчас? "
	wait
	choose menu "Я пойду." "Мне нужна подготовка."
	case 1
		var nd_wait = MD_Subscription md_name
		if (nd_wait == 0)
			dialog "[Райан]"
			dialog "Что-то странное? Не могли бы вы "
			dialog "повторить попытку через некоторое "
			dialog "время? "
			close
			return
		else
			dialog "[Райан]"
			dialog "ОК. Тогда я выясню, какой паром "
			dialog "идет туда Когда корабль будет "
			dialog "подключен, появится окно с "
			dialog "поиском искателя приключений, так "
			dialog "что смотрите. "
			completequest 14715
			setquest 14716
			close
			return
		endif
	break
	case 2
		dialog "[Райан]"
		dialog "ОК. Возвращайся, когда у тебя "
		dialog "появится идея. "
		close
		return
	break
	endchoose
	if (hunt_chek01 == 2)
		dialog "[Райан]"
		dialog "Эм-м-м...? Авантюрист...? Как...?"
		wait
		choose menu "Где Чарли?"
		case 1
		break
		endchoose
		dialog "[Райан]"
		dialog "Мальчика отправили обратно. "
		dialog "Кстати... Ожерелье случайно не "
		dialog "досталось? "
		wait
		dialog "[Говорит о том, что произошло в "
		dialog "Дорадо.] "
		wait
		dialog "[Райан]"
		dialog "Правильно... Вы были очень "
		dialog "сильным человеком... Итак, не "
		dialog "могли бы вы избавиться от Найло и "
		dialog "наложить на меня проклятие? "
		wait
		choose menu "Больше не присылайте людей."
		case 1
		break
		endchoose
		dialog "[Райан]"
		dialog "Это... это нет. Если больше не "
		dialog "будет жертв, это проклятое "
		dialog "ожерелье обязательно убьет меня. "
		dialog "Потому что ты послал меня живым "
		dialog "при условии, что продолжишь "
		dialog "отсылать людей. "
		wait
		choose menu "Я продолжу идти."
		case 1
		break
		endchoose
		dialog "[Райан]"
		dialog "Авантюрист, пожалуйста. Я думаю, "
		dialog "что единственный человек, который "
		dialog "может снять проклятие, - это ты. "
		dialog "пожалуйста. Ага? Я знаю, что я "
		dialog "эгоистка. "
		wait
		dialog "[Райан]"
		dialog "Но это то, для чего я должен был "
		dialog "жить. Пока авантюрист ушел, я "
		dialog "никогда не отпущу других. "
		wait
		choose menu "Сдерживай свои обещания."
		case 1
		break
		endchoose
		dialog "[Райан]"
		dialog "Аааа. Спасибо вам большое. "
		dialog "Авантюрист... Я никогда не забуду "
		dialog "эту благодать. Пожалуйста, "
		dialog "сделайте перерыв сегодня и "
		dialog "вернитесь после рассвета. Я его "
		dialog "приготовлю. "
		erasequest 14716
		getexp 350000
		getJexp 350000
		close
		return
	else
		if (time_check01 == 1)
			dialog "[Райан]"
			dialog "О, ты пропустил лодку? Но лодка "
			dialog "ходит только раз в день, и вы уже "
			dialog "были там сегодня. Вернись после "
			dialog "рассвета. "
			close
			return
		else
			dialog "[Райан]"
			dialog "Хотите вернуться? Я подключу тебя "
			dialog "к кораблю. Когда корабль будет "
			dialog "подключен, появится окно с "
			dialog "поиском искателя приключений, так "
			dialog "что смотрите. "
			wait
			choose menu "Я пойду сейчас." "Мне нужно время, чтобы подготовиться."
			case 1
				var nd_wait = MD_Subscription md_name
				if (nd_wait == 0)
					dialog "[Райан]"
					dialog "Что-то странное? Не могли бы вы "
					dialog "повторить попытку через некоторое "
					dialog "время? "
					close
					return
				else
					// ShowEffect "Беспилотный экспресс-корабль "Дорадо "#17july" 1019
					dialog "[Райан]"
					dialog "Я знаю. Тогда я выясню, какой "
					dialog "паром идет туда Когда корабль "
					dialog "будет подключен, появится окно с "
					dialog "поиском искателя приключений, так "
					dialog "что смотрите. "
					erasequest 14717
					close
					return
				endif
			break
			case 2
				dialog "[Райан]"
				dialog "Я знаю. Возвращайся, когда будешь "
				dialog "готов. "
				close
				return
			break
			endchoose
		endif
	endif
	if (hunt_chek02 == 2)
		dialog "[Райан]"
		dialog "Авантюрист, ожерелье... Ожерелье "
		dialog "все еще там. Вы не избавились от "
		dialog "этого полностью сегодня? Вздох... "
		dialog " "
		wait
		dialog "[Райан]"
		dialog "Вы через многое прошли. Должно "
		dialog "быть, это было сложно, но просто "
		dialog "отдыхай Если вы планируете снова "
		dialog "пойти завтра, возвращайтесь после "
		dialog "рассвета. Я подключу тебя к "
		dialog "кораблю. "
		erasequest 14718
		getexp 350000
		getJexp 350000
		close
		return
	else
		if (time_check01 == 1)
			dialog "[Райан]"
			dialog "Лодка курсирует только один раз в "
			dialog "день, но вы уже были там сегодня. "
			dialog "Вернись после рассвета. "
			close
			return
		else
			dialog "[Райан]"
			dialog "Хотите вернуться сегодня? Я "
			dialog "подключу тебя к кораблю. Когда "
			dialog "корабль будет подключен, появится "
			dialog "окно с поиском искателя "
			dialog "приключений, так что смотрите. "
			wait
			choose menu "Я пойду сейчас." "Мне нужно время, чтобы подготовиться."
			case 1
				var nd_wait = MD_Subscription md_name
				if (nd_wait == 0)
					dialog "[Райан]"
					dialog "Что-то странное? Не могли бы вы "
					dialog "повторить попытку через некоторое "
					dialog "время? "
					close
					return
				else
					// ShowEffect "Беспилотный экспресс-корабль "Дорадо "#17july" 1019
					dialog "[Райан]"
					dialog "Я знаю. Тогда я выясню, какой "
					dialog "паром идет туда Когда корабль "
					dialog "будет подключен, появится окно с "
					dialog "поиском искателя приключений, так "
					dialog "что смотрите. "
					erasequest 14717
					close
					return
				endif
			break
			case 2
				dialog "[Райан]"
				dialog "Я знаю. Возвращайся, когда будешь "
				dialog "готов. "
				close
				return
			break
			endchoose
		endif
	endif
elseif (noodle_14717 == 1)
	if (time_check01 == 1)
		dialog "[Райан]"
		dialog "Лодка курсирует только один раз в "
		dialog "день, но вы уже были там сегодня. "
		dialog "Вернись после рассвета. "
		close
		return
	else
		dialog "[Райан]"
		dialog "Авантюрист, хочешь вернуться "
		dialog "сегодня? Я подключу тебя к "
		dialog "кораблю. Когда корабль будет "
		dialog "подключен, появится окно с "
		dialog "поиском искателя приключений, так "
		dialog "что смотрите. "
		wait
		choose menu "Я пойду сейчас." "Мне нужно время, чтобы подготовиться."
		case 1
			var nd_wait = MD_Subscription md_name
			if (nd_wait == 0)
				dialog "[Райан]"
				dialog "Что-то странное? Не могли бы вы "
				dialog "повторить попытку через некоторое "
				dialog "время? "
				close
				return
			else
				// ShowEffect "Беспилотный экспресс-корабль "Дорадо "#17july" 1019
				dialog "[Райан]"
				dialog "Я знаю. Тогда я выясню, какой "
				dialog "паром идет туда Когда корабль "
				dialog "будет подключен, появится окно с "
				dialog "поиском искателя приключений, так "
				dialog "что смотрите. "
				erasequest 14717
				setquest 14718
				close
				return
			endif
		break
		case 2
			dialog "[Райан]"
			dialog "Я знаю. Возвращайся, когда будешь "
			dialog "готов. "
			close
			return
		break
		endchoose
	endif
elseif (noodle_14715 == 2)
	if ((hunt_chek01 == 2) | (hunt_chek02 == 2))
		dialog "[Райан]"
		dialog "Авантюрист, ожерелье... Ожерелье "
		dialog "все еще там. Вы не избавились от "
		dialog "этого полностью сегодня? Вздох... "
		dialog " "
		wait
		dialog "[Райан]"
		dialog "Вы через многое прошли. Должно "
		dialog "быть, это было сложно, но просто "
		dialog "отдыхай Если вы планируете снова "
		dialog "пойти завтра, возвращайтесь после "
		dialog "рассвета. Я подключу тебя к "
		dialog "кораблю. "
		erasequest 14718
		getexp 350000
		getJexp 350000
		close
		return
	else
		if (time_check01 == 1)
			dialog "[Райан]"
			dialog "Лодка курсирует только один раз в "
			dialog "день, но вы уже были там сегодня. "
			dialog "Вернись после рассвета. "
			close
			return
		else
			dialog "[Райан]"
			dialog "Хотите вернуться сегодня? Я "
			dialog "подключу тебя к кораблю. Когда "
			dialog "корабль будет подключен, появится "
			dialog "окно с поиском искателя "
			dialog "приключений, так что смотрите. "
			wait
			choose menu "Я пойду сейчас." "Мне нужно время, чтобы подготовиться."
			case 1
				var nd_wait = MD_Subscription md_name
				if (nd_wait == 0)
					dialog "[Райан]"
					dialog "Что-то странное? Не могли бы вы "
					dialog "повторить попытку через некоторое "
					dialog "время? "
					close
					return
				else
					// ShowEffect "Беспилотный экспресс-корабль "Дорадо "#17july" 1019
					dialog "[Райан]"
					dialog "Я знаю. Тогда я выясню, какой "
					dialog "паром идет туда Когда корабль "
					dialog "будет подключен, появится окно с "
					dialog "поиском искателя приключений, так "
					dialog "что смотрите. "
					erasequest 14717
					close
					return
				endif
			break
			case 2
				dialog "[Райан]"
				dialog "Я знаю. Возвращайся, когда будешь "
				dialog "готов. "
				close
				return
			break
			endchoose
		endif
	endif
else
	dialog "[Райан]"
	dialog "Вы слышали о Дорадо? Это пещера, "
	dialog "полная золота. Стены и полы - все "
	dialog "сверкающие драгоценности. Пещеры "
	dialog "полны сокровищ. "
	close
	return
endif
return


npc "malangdo" "Экспресс-корабль#17july" 2_POSTBOX 214 279 3 0 0

OnClick:
if (v[VAR_CLEVEL] < 100)
	dialog "[Руководство по беспилотному "
	dialog "ограниченному экспрессу] Я не "
	dialog "сжигаю никого слабее себя. Чтобы "
	dialog "оседлать меня, ты должен пройти "
	dialog "как минимум 100 уровень. "
	close
	return
endif

var mas_ter = (v[VAR_ISPARTYMASTER])
var par_mem = (v[VAR_CPARTY])
var par_name = PartyName
var md_name = "Legendary Dorado"
var name = PcName

if (par_mem > 0)

else
	dialog "[Руководство по беспилотному "
	dialog "ограниченному экспрессу] Если вы "
	dialog "не являетесь членом группы, "
	dialog "создайте группу с ^0000cd1^000000 и повторите "
	dialog "попытку. "
	close
	return
endif
var noodle_14717 = isbegin_quest 14717
var time_check01 = checkquest_playtime 14717
if (time_check01 == 1)
	dialog "[Руководство по беспилотному "
	dialog "ограниченному экспрессу] Этот "
	dialog "ограниченный экспресс-корабль "
	dialog "требует перерыва на определенное "
	dialog "время. Пожалуйста, вернись после "
	dialog "рассвета. "
	close
	return
else
endif

if (mas_ter == 1)
	dialog "[Руководство по беспилотному "
	dialog "ограниченному экспрессу] "
	wait
	choose menu "Да. Я пойду." "нет."
	case 1
		var move_md = MD_Exist md_name
		if (move_md == 3)
			dialog "[Руководство по беспилотному "
			dialog "ограниченному экспрессу] "
			dialog "^ff0000 Произошла неизвестная ошибка.^000000 "
			close
			return
		elseif (move_md == 2)
			dialog "[Руководство по беспилотному "
			dialog "ограниченному экспрессу] На "
			dialog "скоростном судне, направляющемся "
			dialog "в Дорадо, не было сигнала. "
			wait
			dialog "[Руководство по беспилотному "
			dialog "ограниченному экспрессу] "
			dialog "Обращайтесь к Райан. "
			close
			return
		elseif (move_md == 1)
			dialog "[Руководство по беспилотному "
			dialog "ограниченному экспрессу] Если вы "
			dialog "не являетесь членом группы, "
			dialog "создайте группу с ^0000cd1^000000 и повторите "
			dialog "попытку. "
			close
			return
		elseif (move_md == 0)
			dialog "[Руководство по беспилотному "
			dialog "ограниченному экспрессу] "
			dialog "Беспилотный экспресс-корабль "
			dialog "Дорадо. Операция начинается. "
			dialog "Желаю вам удачи. "
			broadcastinmap2 "00ff99" FW_NORMAL 12 0 0 " Член группы "+par_name+", " + name + " начинает операцию " + md_name
			setquest 14717
			MD_Enter md_name
			return
		endif
	break
	case 2
		dialog "[Руководство по беспилотному "
		dialog "ограниченному экспрессу] Обратите "
		dialog "внимание, что Dorado Limited "
		dialog "Express курсирует постоянно. "
		close
		return
	break
	endchoose
else
	dialog "[Руководство по беспилотному "
	dialog "ограниченному экспрессу] Этим "
	dialog "курьерским судном может "
	dialog "пользоваться только капитан "
	dialog "партии. "
	close
	return
endif
return

