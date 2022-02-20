//-- 2018 5? ??? ?? ??----???? 2019/02--------???? ???-------
//--??? ??-----------------------------------------------------------------
//--- ??? ??? ??? -----------------------------------------------------
//2019: 8577??
//Тормод? ?? Дилпор
//Evt_May01_KR ??? ??
//Evt_May02_KR ??? ???
//

npc "geffen" "Дилпор#2019family" 4_M_NFMAN 86 35 5 0 0
OnInit:
PickToNpc SAGE 0 3 2 2 1878 0 0 0
//?????... ???.
	AddQuestIDCondition 8577
	SetQuestConditionBegin 8577 1 4
	SetQuestConditionLevel 20 200
	SetQuestConditionQuest 8577 0
	SetQuestConditionEnd
	SetQuestConditionBegin 8577 1 4
	SetQuestConditionQuest 8577 1
	SetQuestConditionItem 11610 9 "<"
	SetQuestConditionEnd

	AddQuestIDCondition 8578
	SetQuestConditionBegin 8578 1 4
	SetQuestConditionQuest 8577 3
	SetQuestConditionQuest 8578 0
	SetQuestConditionEnd
	SetQuestConditionBegin 8578 1 4
	SetQuestConditionQuest 8578 1
	SetQuestConditionItem 7685 9 "<"
	SetQuestConditionEnd


	AddQuestIDCondition 8579
	SetQuestConditionBegin 8579 1 4
	SetQuestConditionQuest 8579 1
	SetQuestConditionEnd
	


return

OnClick:
//-------------------------??20-----------------------------------------------
	if (v[VAR_CLEVEL] < 20)
	dialog "[Дилпор]"
	dialog "Боюсь, что вы не можете "
	dialog "участвовать в Фестивале "
	dialog "дынного урожая."
	wait
	dialog "Чтобы принять участие в "
	dialog "фестивале, нужно иметь "
	dialog "20 уровень или выше."
	close
	return
	endif

//--------?? ?? ?? ??---------------------------------------------------
    var wt_inven = GetInventoryRemainCount 1301 3
    if ((wt_inven == 2) | (wt_inven == 3))
        dialog "[Дилпор]"
        dialog "Твой инвентарь переполнен,"
		dialog "освободи место и возвращайся."
        close
        return
    else
    endif
//-----------------------------------------------?-----------------------------





var q8577 = isbegin_quest 8577
var q8578 = isbegin_quest 8578
var q8579 = isbegin_quest 8579
var q8584 = isbegin_quest 8584

if (q8577 == 0)
//????
	dialog "[Дилпор]"
	dialog "Добро пожаловать "
	dialog "на Фестиваль урожая!"
	dialog "Искатели приключений,"
	dialog "спешите принять участие!"
	wait
	dialog "[Дилпор]"
	dialog "...В этом году появился..."
	dialog "сорт... новый..."
	dialog "...сочной..."
	Talk2me "Сур#2019family" "Сур : Эх..."
	wait
	dialog "[Дилпор]"
	dialog "Нет... эээ..."
	Talk2me "Сур#2019family" "Сур : Можешь подсмотреть..."
	wait
	dialog "-- Дилпор смотрит на записку, --"
	dialog "-- спрятанную в ладони. --"
	wait
	dialog "[Дилпор]"
	dialog "... Так."
	dialog "В этом году выведен новый "
	dialog "сорт сладкой дыни! "
	dialog "Отличный урожай! Ха-ха-ха!"
	wait
	dialog "[Дилпор]"
	dialog "В прошлом году, благодаря "
	dialog "усилиям моей семьи, "
	dialog "был собран весь урожай дыни."
	wait
	dialog "[Дилпор]"
	dialog "Но сейчас нам нужна помощь!"
	dialog "Я обещаю поддержку искателям "
	dialog "приключений, которые помогут "
	dialog "мне в этом деле! "	
	wait
	choose menu "Семейное дело - это хорошо "
	endchoose
	dialog "[Дилпор]"
	dialog "Верно. Урожай дынь сейчас "
	dialog "небольшой, конечно. Не такой "
	dialog "как в прошлом году. "
	dialog "Поэтому родители решили,"
	dialog "что я могу справиться один."
	wait
	dialog "[Дилпор]"
	dialog "Но ведь помимо моего дома "
	dialog "есть и дома других фермеров."
	dialog "И весь этот урожай нужно "
	dialog "подготовить к празднованию..."
	wait
	dialog "[Дилпор]"
	dialog "Думаю, если мы объединимся, "
	dialog "мы сможем обеспечить фестиваль."
	wait
	dialog "[Дилпор]"
	dialog "А если вы еще и поможете мне "
	dialog "с поставками дынь... Я..."
	dialog "Сделаю вам самый вкусный десерт!"
	wait
	choose menu "Это просьба?" "Мне пора..."
	case 1
		dialog "[Дилпор]"
		dialog "Да, я прошу вас пройтись "
		dialog "по полям вокруг городов и найти "
		dialog "дынные рассады."
		wait
		dialog "[Дилпор]"
		dialog "Эти рассады состоят из..."
		dialog "существ, похожих на порингов."
		dialog "Но не верьте своим глазам!"
		dialog "Это созревшие сладкие дыни!"
		wait
		dialog "[Дилпор]"
		dialog "Принесите мне 10 сладких дынь,"
		dialog "А я вам сделаю из них "
		dialog "сладкий десерт."
		setquest 8577
		close
		return
	break
	case 2
		dialog "[Дилпор]"
		dialog "Хорошо."
		dialog "Каждый может проводить "
		dialog "время на фестивале так, "
		dialog "как ему захочется. "
		close
		return
	break
	endchoose
elseif (q8577 == 1)
//??? ??? ????? ???
    if (v[Sweet_Melon] < 10)
			dialog "[Дилпор]"
			dialog "Да, я прошу вас пройтись "
			dialog "по полям вокруг городов и найти "
			dialog "дынные рассады."
			wait
			dialog "[Дилпор]"
			dialog "Эти рассады состоят из..."
			dialog "существ, похожих на порингов."
			dialog "Но не верьте своим глазам!"
			dialog "Это созревшие сладкие дыни!"
			wait
			dialog "[Дилпор]"
			dialog "Принесите мне 10 сладких дынь,"
			dialog "А я вам сделаю из них "
			dialog "сладкий десерт."
			close
			return
    else
        dialog "[Дилпор]"
		dialog "Ах, сладкая дынька..."
		dialog "Ух ты! У тебя есть глаза..."
		dialog "Немного липкая кожура, "
		dialog "свежий аромат и странно "
		dialog "живое ощущение..."
        wait
    	dialog "[Дилпор]"
    	dialog "..."
    	wait
    	dialog "[Дилпор]"
    	dialog "Но... ничего страшного!"
		dialog "Спасибо тебе большое за помощь."
    	wait
        if (v[Sweet_Melon] > 9)
			dialog "[Дилпор]"
			dialog "Как и обещал, твой сладкий "
			dialog "десерт."
			dropitem Sweet_Melon 10
			completequest 8577
			getitem Sweet_Melon_Juice 5
			wait
        else
        	dialog "[Дилпор]"
        	dialog "Я прошу вас пройтись "
			dialog "по полям вокруг городов и найти "
			dialog "дынные рассады."
        	close
        	return
        endif
        dialog "[Дилпор]"
        dialog "Я хотел бы попросить тебя еще "
		dialog "об одной услуге..."
        wait
        dialog "[Дилпор]"
		dialog "Если вдруг захочешь помочь,"
		dialog "приходи! У меня тут осталось "
		dialog "еще одно дело."
        close
        return
    endif
elseif (q8577 == 2)
endif

if (q8578 == 0)
	dialog "[Дилпор]"
	dialog "Ой, ты уже здесь?"
	wait
	choose menu "Предложить помощь " "Спросить про дынный сок " "Да, я мимо проходил..."
  		case 1
  			dialog "[Дилпор]"
			dialog "Это очень кстати!"
			dialog "В прошлом году мы разработали "
			dialog "новое меню и устроили "
			dialog "вечеринку-сюрприз для всей семьи."
			wait
      		dialog "[Дилпор]"
			dialog "Но в этом году мы были заняты "
			dialog "из-за нового сорта дынь, "
			dialog "поэтому у нас не было времени "
			dialog "на развлечения и сладости..."
			wait
			dialog "[Дилпор]"
			dialog "Когда я был молодым "
			dialog "и гостевал у родных,"
			dialog "родители всегда мне присылали "
			dialog "своё фирменное дынное парфе."
			Talk2me "Сур#2019family" "Сур : Это то фирменное парфе? "
			Talk2me "Дилпор#2019family" "Дилпор : Да, Сур... "
      		wait
      		dialog "[Дилпор]"
			dialog "Сейчас родители уехали в отпуск,"
			dialog "и у меня появилась возможность "
			dialog "самому отправить родителям парфе!"
			wait
			dialog "[Дилпор]"
			dialog "Я был бы очень благодарен,"
			dialog "если бы ты отнёс парфе."
			dialog "В этом холодильнике, конечно."
			dialog "Не хочу чтобы оно растаяло..."
      		wait
      		choose menu "Конечно " "Я подумаю..."
      			case 1
      				dialog "[Дилпор]"
					dialog "Отлично!"
					dialog "Мои родители сейчас на курорте "
					dialog "в городе Хугель. Я думаю,"
					dialog "что ты сможешь найти их на пляже."
      				setquest 8578
      				getitem Ice_Box 1
      				close
      				return
      			break
      			case 2
      				dialog "[Дилпор]"
      				dialog "Хорошо, я буду ждать."
      				close
      				return
      			break
      		endchoose
  		break
  		case 2
            dialog "[Дилпор]"
            dialog "Ты хочешь еще дынного сока?"
            wait
            choose menu "Да, хочу " "Есть ли сок послаще?" "Нет "
             	case 1
             		dialog "[Дилпор]"
					dialog "А-ха-ха, мог бы и не спрашивать."
					dialog "Перед таким лакомством нельзя "
					dialog "устоять, правда?"
					wait
					dialog "[Дилпор]"
					dialog "Для приготовления сока "
					dialog "мне понадобится одна сладкая дыня "
					dialog "и 1000 зени. Максимум - 30 сока за раз."
					wait
					dialog "[Дилпор]"
					dialog "Так сколько сока ты хочешь?"
             		wait   		
            	dlgwrite 1 30
            	if (input == 0)
            		dialog "[Дилпор]"
					dialog "Если ты не хочешь сока, зачем "
					dialog "спрашиваешь? "
            		close
            		return
            	elseif (input > 30)
            		dialog "[Дилпор]"
            		dialog "Столько сока я не смогу "
            		dialog "приготовить за один раз."
            		close
            		return
            	else
            		var nomnom = input * 1000
            		if (v[Sweet_Melon] < input)
            			dialog "[Дилпор]"
            			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "дынного сока. У тебя не хватает "
						dialog "сладких дынь."
            			close
            			return
            		endif
            		if (v[VAR_MONEY] < nomnom)
            			dialog "[Дилпор]"
            			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "дынного сока. У тебя "
						dialog "недостаточно зени."
            			close
            			return
            		endif
            		dialog "[Дилпор]"
            		dialog "Держи, сегодня сок получился "
            		dialog "особенно вкусным."
            		dialog "Приходи, если захочешь еще."
            		dropitem Sweet_Melon input
            		dropgold nomnom
            		getitem Melon_Juice input
            		close
            	endif
             	break
             	case 2 //??? ?? ?? ?? ?? ?
             		dialog "[Дилпор]"
					dialog "А-ха-ха, мог бы и не спрашивать."
					dialog "Перед таким лакомством нельзя "
					dialog "устоять, правда?"
					wait
					dialog "[Дилпор]"
					dialog "Для приготовления сладкого сока "
					dialog "мне понадобится пять сладких дынь "
					dialog "и 2500 зени. "
					wait
             		dialog "[Дилпор]"
					dialog "К тому же, если ты захочешь "
					dialog "получить 10 сока или больше,"
					dialog "я предоставлю тебе комплимент "
					dialog "от заведения!"
             		wait   		
					dialog "[Дилпор]"
					dialog "Так сколько сока ты хочешь?"
					dialog "Максимум - 30 сока за раз. "
             		wait 
              	dlgwrite 1 30
              	if (input == 0)
              		dialog "[Дилпор]"
              		dialog "Если ты не хочешь сока, зачем "
					dialog "спрашиваешь? "
              		close
              		return
              	elseif (input > 30)
              		dialog "[Дилпор]"
              		dialog "Столько сока я не смогу "
            		dialog "приготовить за один раз."
              		close
              		return
              	else
              		var screw = input * 5
              		var nomnomnom = input * 2500
              		if (v[Sweet_Melon] < screw)
              			dialog "[Дилпор]"
              			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "сладкого сока. У тебя не хватает "
						dialog "сладких дынь."
              			close
              			return
              		endif
              		if (v[VAR_MONEY] < nomnomnom)
              			dialog "[Дилпор]"
              			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "дынного сока. У тебя "
						dialog "недостаточно зени."
              			close
              			return
              		endif
              		dialog "[Дилпор]"
              		dialog "Держи, сегодня сок получился "
            		dialog "особенно вкусным и сладким."
            		dialog "Приходи, если захочешь еще."
              		dropitem Sweet_Melon screw
              		dropgold nomnomnom
              		getitem Sweet_Melon_Juice input
              		if (input == 30)
              			getitem Evt_May01_KR 3
              		elseif (input > 19)
              			getitem Evt_May01_KR 2
              		elseif (input > 9)
              			getitem Evt_May01_KR 1
              		endif
              		close
              		return
              	endif
             	break
             	case 3
              	dialog "[Дилпор]"
              	dialog "Хорошо, в другой раз."
              	close
              	return
             	break
          	endchoose
  		break
  		case 3
  			dialog "[Дилпор]"
  			dialog "Хорошо, в другой раз."
  			close
  			return
  		break
  	endchoose
elseif (q8578 == 1)
	dialog "[Дилпор]"
	dialog "О, ты уже тут?"
	wait 
	choose menu "Спросить про дынный сок " "Спросить еще раз о просьбе " "Мне пора "
  		case 1
            dialog "[Дилпор]"
			dialog "Ты хочешь еще дынного сока?"
            wait
            choose menu "Да, хочу " "Есть ли сок послаще?" "Нет "
             	case 1
             		dialog "[Дилпор]"
					dialog "А-ха-ха, мог бы и не спрашивать."
					dialog "Перед таким лакомством нельзя "
					dialog "устоять, правда?"
					wait
					dialog "[Дилпор]"
					dialog "Для приготовления сока "
					dialog "мне понадобится одна сладкая дыня "
					dialog "и 1000 зени. Максимум - 30 сока за раз. "
					wait
					dialog "[Дилпор]"
					dialog "Так сколько сока ты хочешь?"
             		wait   		
            	dlgwrite 1 30
            	if (input == 0)
            		dialog "[Дилпор]"
					dialog "Если ты не хочешь сока, зачем "
					dialog "спрашиваешь? "
            		close
            		return
            	elseif (input > 30)
            		dialog "[Дилпор]"
            		dialog "Столько сока я не смогу "
            		dialog "приготовить за один раз."
            		close
            		return
            	else
            		var nomnom = input * 1000
            		if (v[Sweet_Melon] < input)
            			dialog "[Дилпор]"
            			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "дынного сока. У тебя не хватает "
						dialog "сладких дынь."
            			close
            			return
            		endif
            		if (v[VAR_MONEY] < nomnom)
            			dialog "[Дилпор]"
            			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "дынного сока. У тебя "
						dialog "недостаточно зени."
            			close
            			return
            		endif
            		dialog "[Дилпор]"
            		dialog "Держи, сегодня сок получился "
            		dialog "особенно вкусным."
            		dialog "Приходи, если захочешь еще."
            		dropitem Sweet_Melon input
            		dropgold nomnom
            		getitem Melon_Juice input
            		close
            	endif
             	break
             	case 2 //??? ?? ?? ?? ?? ?
             		dialog "[Дилпор]"
					dialog "А-ха-ха, мог бы и не спрашивать."
					dialog "Перед таким лакомством нельзя "
					dialog "устоять, правда?"
					wait
					dialog "[Дилпор]"
					dialog "Для приготовления сладкого сока "
					dialog "мне понадобится пять сладких дынь "
					dialog "и 2500 зени. "
					wait
             		dialog "[Дилпор]"
					dialog "К тому же, если ты захочешь "
					dialog "получить 10 сока или больше,"
					dialog "я предоставлю тебе комплимент "
					dialog "от заведения!"
             		wait   		
					dialog "[Дилпор]"
					dialog "Так сколько сока ты хочешь?"
					dialog "Максимум - 30 сока за раз. "
             		wait   
              	dlgwrite 1 30
              	if (input == 0)
              		dialog "[Дилпор]"
              		dialog "Если ты не хочешь сока, зачем "
					dialog "спрашиваешь? "
              		close
              		return
              	elseif (input > 30)
              		dialog "[Дилпор]"
              		dialog "Столько сока я не смогу "
            		dialog "приготовить за один раз."
              		close
              		return
              	else
              		var screw = input * 5
              		var nomnomnom = input * 2500
              		if (v[Sweet_Melon] < screw)
              			dialog "[Дилпор]"
              			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "сладкого сока. У тебя не хватает "
						dialog "сладких дынь."
              			close
              			return
              		endif
              		if (v[VAR_MONEY] < nomnomnom)
              			dialog "[Дилпор]"
              			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "дынного сока. У тебя "
						dialog "недостаточно зени."
              			close
              			return
              		endif
              		dialog "[Дилпор]"
              		dialog "Держи, сегодня сок получился "
            		dialog "особенно вкусным и сладким."
            		dialog "Приходи, если захочешь еще."
              		dropitem Sweet_Melon screw
              		dropgold nomnomnom
              		getitem Sweet_Melon_Juice input
              		if (input == 30)
              			getitem Evt_May01_KR 3
              		elseif (input > 19)
              			getitem Evt_May01_KR 2
              		elseif (input > 9)
              			getitem Evt_May01_KR 1
              		endif
              		close
              		return
              	endif
             	break
             	case 3
              	dialog "[Дилпор]"
              	dialog "Хорошо, в другой раз."
              	close
              	return
             	break
          	endchoose
  		break
  		case 2
			if (v[Ice_Box] == 0)
				dialog "[Дилпор]"
				dialog "Ты потерял ящик с парфе?!"
				dialog "Ох, ладно... Я знаю, что "
				dialog "быть искателем приключений "
				dialog "невероятно трудно. Держи,"
				dialog "вот тебе другой ящик."
				getitem Ice_Box 1
				wait
				dialog "[Дилпор]"
				dialog "Пожалуйста, не потеряй его снова."
				close
				return
			else
				dialog "[Дилпор]"
				dialog "Сейчас родители уехали в отпуск,"
				dialog "и у меня появилась возможность "
				dialog "самому отправить родителям парфе."
				wait
				dialog "[Дилпор]"
				dialog "Я был бы очень благодарен,"
				dialog "если бы ты отнёс парфе в Хугель."
				dialog "В этом холодильнике, конечно."
				dialog "Не хочу чтобы оно растаяло..."
				wait
				dialog "[Дилпор]"
				dialog "Моих родителей, думаю,"
				dialog "ты сможешь найти на пляже."
				close
				return
			endif
      	break
      	case 3
  			dialog "[Дилпор]"
  			dialog "Хорошо, в другой раз."
  			close
  			return
  		break
  	endchoose
elseif (q8578 == 2)
endif

if (q8579 == 1)
	dialog "[Дилпор]"
	dialog "О, привет, искатель приключений!"
	dialog "Ты уже отнес родителям парфе?"
	dialog "Долгий путь, наверное, был."
	dialog "Это записка от отца?"
	wait
	dialog "[Дилпор]"
	dialog "Папа беспокоится о том,"
	dialog "справляюсь ли я с управлением "
	dialog "мероприятия. Это и правда "
	dialog "тяжело, но я стараюсь."
	wait
	dialog "[Дилпор]"
	dialog "Прошлый год был для родителей "
	dialog "еще тяжелее, но ведь они "
	dialog "справились! Значит и я справлюсь."
	wait
	dialog "[Дилпор]"
	dialog "Кстати, пока тебя не было,"
	dialog "я успел приготовить дынный хлеб."
	dialog "Думаю, для первого раза "
	dialog "получилось очень неплохо!"
	dialog "Попробуй сам."
	completequest 8579
	setquest 8584
	getitem Melon_Bread 10
	getitem Melon_Parfait 5
	wait
	var q8580 = isbegin_quest 8580
	if (q8580 == 0)
		dialog "[Дилпор]"
		dialog "Сейчас, мне кажется, тебе стоит "
		dialog "помочь и Суру. Он хоть "
		dialog "и мой конкурент, но он тоже "
		dialog "участвует в фестивале. "
		Talk2me "Сур#2019family" "Сур : Вообще-то помощь бы не помешала..."
	elseif (q8580 == 1)
		dialog "[Дилпор]"
		dialog "Сейчас, мне кажется, тебе стоит "
		dialog "помочь и Суру. Он хоть "
		dialog "и мой конкурент, но он тоже "
		dialog "участвует в фестивале. "
		Talk2me "Сур#2019family" "Сур : Я всё еще жду..."
	elseif (q8580 == 2)
    	dialog "[Дилпор]"
		dialog "Сейчас, мне кажется, тебе стоит "
		dialog "помочь и Суру. Он хоть "
		dialog "и мой конкурент, но он тоже "
		dialog "участвует в фестивале. "
		Talk2me "Сур#2019family" "Сур : Я всё еще жду..."
    endif
	wait
	dialog "[Дилпор]"
	dialog "А ты, кстати, участвуешь в "
	dialog "конкурсе на самую большую дыню?"
	dialog "Я вот попытаю удачу."
	wait
	dialog "[Дилпор]"
	dialog "А моя двоюродная сестра "
	dialog "делает памятные шапки из дынь!"
	dialog "Чтобы настроение фестиваля "
	dialog "осталось с тобой надолго."
	wait
	dialog "[Дилпор]"
	dialog "И спасибо еще раз за помощь!"
	dialog "Если тебе понадобится сделать "
	dialog "сладкий сок из дынь или хлеб,"
	dialog "можешь всегда ко мне обращаться."
	close
	return	
elseif (q8579 == 2)
  //?? ??
        dialog "[Дилпор]"
        dialog "Рад тебя видеть!"
        dialog "Хочешь что нибудь заказать?"
        wait
        choose menu "Дынный сок " "Сладкий дынный сок " "Дынный хлеб " "Мне пора "
         	case 1
             		dialog "[Дилпор]"
					dialog "А-ха-ха, мог бы и не спрашивать."
					dialog "Перед таким лакомством нельзя "
					dialog "устоять, правда?"
					wait
					dialog "[Дилпор]"
					dialog "Для приготовления сока "
					dialog "мне понадобится одна сладкая дыня "
					dialog "и 1000 зени. Максимум - 30 сока за раз. "
					wait
					dialog "[Дилпор]"
					dialog "Так сколько сока ты хочешь?"
             		wait   		
            	dlgwrite 1 30
            	if (input == 0)
            		dialog "[Дилпор]"
					dialog "Если ты не хочешь сока, зачем "
					dialog "спрашиваешь? "
            		close
            		return
            	elseif (input > 30)
            		dialog "[Дилпор]"
            		dialog "Столько сока я не смогу "
            		dialog "приготовить за один раз."
            		close
            		return
            	else
            		var nomnom = input * 1000
            		if (v[Sweet_Melon] < input)
            			dialog "[Дилпор]"
            			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "дынного сока. У тебя не хватает "
						dialog "сладких дынь."
            			close
            			return
            		endif
            		if (v[VAR_MONEY] < nomnom)
            			dialog "[Дилпор]"
            			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "дынного сока. У тебя "
						dialog "недостаточно зени."
            			close
            			return
            		endif
            		dialog "[Дилпор]"
            		dialog "Держи, сегодня сок получился "
            		dialog "особенно вкусным."
            		dialog "Приходи, если захочешь еще."
            		dropitem Sweet_Melon input
            		dropgold nomnom
            		getitem Melon_Juice input
            		close
            	endif
             	break
             	case 2 //??? ?? ?? ?? ?? ?
             		dialog "[Дилпор]"
					dialog "А-ха-ха, мог бы и не спрашивать."
					dialog "Перед таким лакомством нельзя "
					dialog "устоять, правда?"
					wait
					dialog "[Дилпор]"
					dialog "Для приготовления сладкого сока "
					dialog "мне понадобится пять сладких дынь "
					dialog "и 2500 зени. "
					wait
             		dialog "[Дилпор]"
					dialog "К тому же, если ты захочешь "
					dialog "получить 10 сока или больше,"
					dialog "я предоставлю тебе комплимент "
					dialog "от заведения!"
             		wait   		
					dialog "[Дилпор]"
					dialog "Так сколько сока ты хочешь?"
					dialog "Максимум - 30 сока за раз. "
             		wait 
              	dlgwrite 1 30
              	if (input == 0)
              		dialog "[Дилпор]"
              		dialog "Если ты не хочешь сока, зачем "
					dialog "спрашиваешь? "
              		close
              		return
              	elseif (input > 30)
              		dialog "[Дилпор]"
              		dialog "Столько сока я не смогу "
            		dialog "приготовить за один раз."
              		close
              		return
              	else
              		var screw = input * 5
              		var nomnomnom = input * 2500
              		if (v[Sweet_Melon] < screw)
              			dialog "[Дилпор]"
              			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "сладкого сока. У тебя не хватает "
						dialog "сладких дынь."
              			close
              			return
              		endif
              		if (v[VAR_MONEY] < nomnomnom)
              			dialog "[Дилпор]"
              			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "дынного сока. У тебя "
						dialog "недостаточно зени."
              			close
              			return
              		endif
              		dialog "[Дилпор]"
              		dialog "Держи, сегодня сок получился "
            		dialog "особенно вкусным и сладким."
            		dialog "Приходи, если захочешь еще."
              		dropitem Sweet_Melon screw
              		dropgold nomnomnom
              		getitem Sweet_Melon_Juice input
              		if (input == 30)
              			getitem Evt_May01_KR 3
              		elseif (input > 19)
              			getitem Evt_May01_KR 2
              		elseif (input > 9)
              			getitem Evt_May01_KR 1
              		endif
              		close
              		return
              	endif
             	break
         	case 3
       			dialog "[Дилпор]"
				dialog "Хлеб я только учусь печь,"
				dialog "но в последний раз он вышел "
				dialog "очень вкусный."
				wait
				dialog "[Дилпор]"
				dialog "Для выпечки хлеба "
				dialog "мне понадобится пять сладких дынь "
				dialog "и 1500 зени. Максимум - 30 хлеба за раз. "
				wait
				dialog "[Дилпор]"
				dialog "Так сколько хлеба ты хочешь?"
             	wait		
            	dlgwrite 1 30
            	if (input == 0)
            		dialog "[Дилпор]"
            		dialog "Если ты не хочешь хлеба, зачем "
					dialog "спрашиваешь? "
            		close
            		return
            	elseif (input > 30)
            		dialog "[Дилпор]"
              		dialog "Столько хлеба я не смогу "
            		dialog "приготовить за один раз."
              		close
              		return
            	else
            		var screw = input * 5
            		var nomnomnom = input * 1500
            		if (v[Sweet_Melon] < screw)
            			dialog "[Дилпор]"
              			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "дынного хлеба. У тебя не хватает "
						dialog "сладких дынь."
              			close
              			return
            		endif
            		if (v[VAR_MONEY] < nomnomnom)
            			dialog "[Дилпор]"
              			dialog "К сожалению, я не могу "
						dialog "сделать тебе такое количество "
						dialog "дынного хлеба. У тебя "
						dialog "недостаточно зени."
              			close
              			return
            		endif
            		dialog "[Дилпор]"
            		dialog "Держи, сегодня хлеб получился "
            		dialog "особенно вкусным и мягким."
            		dialog "Приходи, если захочешь еще."
            		dropitem Sweet_Melon screw
            		dropgold nomnomnom
            		getitem Melon_Bread input
            		close
            		return
            	endif
	      	break
         	case 4
          	dialog "[Дилпор]"
          	dialog "Хорошо, в другой раз."
          	close
          	return
         	break
      	endchoose
  endif

npc "geffen" "Наннаби#2019family" 1_F_04 106 63 5 3 3
OnInit:
PickToNpc MAGICIAN 0 1 3 8 1878 0 0 0

	AddQuestIDCondition 8584
	SetQuestConditionBegin 8584 1 4
	SetQuestConditionQuest 8584 1
	SetQuestConditionEnd

	AddQuestIDCondition 8585
	SetQuestConditionBegin 8585 1 4
	SetQuestConditionQuest 8585 1
	SetQuestConditionItem 25318 29 "<"
	SetQuestConditionEnd
return





OnTouch2:
	Talk2me "Наннаби#2019family" "Наннаби : Памятные шляпы из растительной кожи! Подходите, выбирайте!"
return



OnClick:
//--------?? ?? ?? ??---------------------------------------------------
    var wt_inven = GetInventoryRemainCount 1301 3
    if ((wt_inven == 2) | (wt_inven == 3))
        dialog "Твой инвентарь переполнен,"
		dialog "освободи место и возвращайся."
        close
        return
    else
    endif
//-----------------------------------------------?-----------------------------

	var q8579 = isbegin_quest 8579
	var q8584 = isbegin_quest 8584
	var q8585 = isbegin_quest 8585
if (q8584 == 0)
	dialog "[Наннаби]"
	dialog "Добро пожаловать "
	dialog "на фестиваль сладкой дыни!"
	wait
	dialog "[Наннаби]"
	dialog "Скоро в продаже появятся "
	dialog "потрясающие шляпы из "
	dialog "растительной кожи!"
	wait
	dialog "[Наннаби]"
  	dialog "А пока могу предложить вам "
  	dialog "сладкий дынный сок за 10 "
  	dialog "дынной кожуры."
  	wait
  	choose menu "У меня есть кожура дыни " "Мне пора "
  		case 1
  			dialog "[Наннаби]"
  			dialog "Сколько вы хотите обменять?"
  			dialog "Я могу сделать до 100 сока за раз."
  			wait
    		dlgwrite 1 100
    		if (input == 0)
    			dialog "Если ты не хочешь обменять, зачем "
				dialog "спрашиваешь? "
    			close
    			return
    		elseif (input > 100)
    			dialog "[Наннаби]"
    			dialog "Ой..."
    			dialog "Столько дынного сока за раз я сделать не смогу."
    			close
    			return
    		else
    			var merona = input * 10
    			if (v[Dalcom_Skin] < merona)
    				dialog "[Наннаби]"
    				dialog "К сожалению, я не могу "
					dialog "сделать тебе такое количество "
					dialog "сладкого сока. У тебя не хватает "
					dialog "сладких дынь."
    				close
    				return
    			else
          			dialog "[Наннаби]"
          			dialog "Держи, сегодня сок получился "
            		dialog "особенно вкусным и сладким."
            		dialog "Приходи, если захочешь еще."
          			dropitem Dalcom_Skin merona
          			getitem Sweet_Melon_Juice input
          			close
          			return
    			endif
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
elseif (q8584 == 1)
//Дилпор ??? ???
        	dialog "[Наннаби]"
			dialog "Добро пожаловать "
			dialog "на фестиваль сладкой дыни!"
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
        	completequest 8584
        	setquest 8585
        	close
        	return
endif

if (q8585 == 1)
	dialog "[Наннаби]"
	dialog "Приветствую тебя еще раз,"
	dialog "искатель приключений!"
	dialog "Ты достал кожуру сладкой дыни?"
	dialog "Без неё, как ты понимаешь,"
	dialog "я сделать ничего не смогу."
	wait
	choose menu "Купить памятную шапку " "Спросить про сладкий сок " "Мне пора "
    	case 1
    		if (v[Dalcom_Skin] > 29)
    			dialog "[Наннаби]"
    			dialog "То, что нужно!"
				dialog "Думаю из такой кожуры получится "
				dialog "отличная памятная шапка."
				dialog "Посмотрим..."
				wait
				dialog "[Наннаби]"
				dialog "Готово!"
				dialog "Если у тебя есть лишняя "
				dialog "дынная кожура, думаю, я бы "
				dialog "смогла договориться с Суром,"
				dialog "чтобы обменять её на немного "
				dialog "дынного сока. "
    			dropitem Dalcom_Skin 30
    			completequest 8585
    			getitem C_Melon_Cap 1
    			getitem Melon_Parfait 1
    			wait
    			dialog "[Наннаби]"
    			dialog "Приходите за сладким соком!"
    			close
    			return
    		else
    			dialog "[Наннаби]"
    			dialog "Для создания красивой шапки "
				dialog "из растительной кожи,"
				dialog "нужно, как минимум,"
				dialog "30 кожуры сладкой дыни."
    			close
    			return
    		endif
    	break
    	case 2
  			dialog "[Наннаби]"
  			dialog "Сколько вы хотите обменять?"
  			dialog "Я могу сделать до 100 сока за раз."
  			wait
    		dlgwrite 1 100
    		if (input == 0)
				dialog "[Наннаби]"
    			dialog "Если ты не хочешь обменять, зачем "
				dialog "спрашиваешь? "
    			close
    			return
    		elseif (input > 100)
    			dialog "[Наннаби]"
    			dialog "Ой..."
    			dialog "Столько дынного сока за раз я сделать не смогу."
    			close
    			return
    		else
    			var merona = input * 10
    			if (v[Dalcom_Skin] < merona)
    				dialog "[Наннаби]"
    				dialog "К сожалению, я не могу "
					dialog "сделать тебе такое количество "
					dialog "сладкого сока. У тебя не хватает "
					dialog "сладких дынь."
    				close
    				return
    			else
          			dialog "[Наннаби]"
          			dialog "Держи, сегодня сок получился "
            		dialog "особенно вкусным и сладким."
            		dialog "Приходи, если захочешь еще."
          			dropitem Dalcom_Skin merona
          			getitem Sweet_Melon_Juice input
          			close
          			return
    			endif
    		endif
    	break
    	case 3
    		dialog "[Наннаби]"
    		dialog "Ладно. Наслаждайтесь дынным "
			dialog "фестивалем!"
    		close
    		return
    	break
	endchoose
else
  //??? ?? ???
	dialog "[Наннаби]"
	dialog "Приветствую тебя еще раз,"
	dialog "искатель приключений!"
  	dialog "Могу предложить тебе "
  	dialog "сладкий дынный сок за 10 "
  	dialog "дынной кожуры."
  	wait
  	choose menu "У меня есть кожура дыни " "Мне пора "
  		case 1
  			dialog "[Наннаби]"
  			dialog "Сколько вы хотите обменять?"
  			dialog "Я могу сделать до 100 сока за раз."
  			wait
    		dlgwrite 1 100
    		if (input == 0)
				dialog "[Наннаби]"
    			dialog "Если ты не хочешь обменять, зачем "
				dialog "спрашиваешь? "
    			close
    			return
    		elseif (input > 100)
    			dialog "[Наннаби]"
    			dialog "Ой..."
    			dialog "Столько дынного сока за раз я сделать не смогу."
    			close
    			return
    		else
    			var merona = input * 10
    			if (v[Dalcom_Skin] < merona)
    				dialog "[Наннаби]"
    				dialog "К сожалению, я не могу "
					dialog "сделать тебе такое количество "
					dialog "сладкого сока. У тебя не хватает "
					dialog "сладких дынь."
    				close
    				return
    			else
          			dialog "[Наннаби]"
          			dialog "Держи, сегодня сок получился "
            		dialog "особенно вкусным и сладким."
            		dialog "Приходи, если захочешь еще."
          			dropitem Dalcom_Skin merona
          			getitem Sweet_Melon_Juice input
          			close
          			return
    			endif
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
endif


npc "geffen" "Сур#2019family" 4_M_NFMAN 89 35 3 0 0
OnInit:
PickToNpc ALCHEMIST 0 1 8 8 1878 0 0 0
//?????... ???.

	AddQuestIDCondition 8580
	SetQuestConditionBegin 8580 1 4
	SetQuestConditionQuest 8577 1
	SetQuestConditionQuest 8580 0
	SetQuestConditionEnd
	SetQuestConditionBegin 8580 1 4
	SetQuestConditionQuest 8577 3
	SetQuestConditionQuest 8580 0
	SetQuestConditionEnd
	SetQuestConditionBegin 8580 1 4
	SetQuestConditionQuest 8580 1
	SetQuestConditionItem 7685 9 "<"
	SetQuestConditionEnd

	AddQuestIDCondition 8582
	SetQuestConditionBegin 8582 1 4
	SetQuestConditionQuest 8581 2
	SetQuestConditionEnd
	SetQuestConditionBegin 8582 1 4
	SetQuestConditionQuest 8582 1
	SetQuestConditionItem 7685 9 "<"
	SetQuestConditionEnd
	SetQuestConditionBegin 8582 1 4
	SetQuestConditionQuest 8583 2
	SetQuestConditionEnd

//
//	AddQuestIDCondition 8581
//  //? ??? ??
//	SetQuestConditionBegin 8581 1 4
//	SetQuestConditionQuest 8581 2
//	SetQuestConditionEnd


//	AddQuestIDCondition 8583
//	//??? ?? ???
//	SetQuestConditionBegin 8583 1 4
//	SetQuestConditionQuest 8583 2
//	SetQuestConditionEnd


return

OnClick:

//--------?? ?? ?? ??---------------------------------------------------
    var wt_inven = GetInventoryRemainCount 1301 3
    if ((wt_inven == 2) | (wt_inven == 3))
        dialog "Твой инвентарь переполнен,"
		dialog "освободи место и возвращайся."
        close
        return
    else
    endif
//-----------------------------------------------?-----------------------------





var q8577 = isbegin_quest 8577
var q8580 = isbegin_quest 8580
var q8581 = checkquest_playtime 8581
var q8582 = isbegin_quest 8582
var q8583 = checkquest_playtime 8583

if (q8577 == 0)
//??? ?? ?
	dialog "[Сур]"
	dialog "Что... А, добрый день!"
	Talk2me "Дилпор#2019family" "Дилпор : Сур, просыпайся уже!"
	close
	return
elseif (q8577 > 0)
endif

//??? ?? ??
if (q8580 == 0)
  	dialog "[Сур]"
	dialog "Добрый день, путник!"
	dialog "Спасибо за то, что помогаешь "
	dialog "нам в организации фестиваля."
	wait
	dialog "[Сур]"
	dialog "Я видел, что ты уже помог Дилпору,"
	dialog "может ты сможешь и мне помочь..."
  	wait
  	choose menu "У меня мало времени " "Помочь "
  		case 1
  			dialog "[Сур]"
  			dialog "Ладно..."
  			Talk2me "Дилпор#2019family" "Дилпор : Ну что же ты..."
  			close
  			return
  		break
  		case 2
  		break
  	endchoose
  	dialog "[Сур]"
	dialog "Я хотел в этом году вывести "
	dialog "новый сорт дыни. Она росла "
	dialog "очень хорошо, даже сорняки "
	dialog "ей не мешали. Но в один момент "
	dialog "я узнал почему. Она оказалась..."
	wait
	dialog "[Сур]"
	dialog "Кислая! Да, именно кислая! "
	dialog "Это полный провал. Как же мне "
	dialog "конкурировать с Дилпором "
	dialog "за самый сладкий сорт дыни,"
	dialog "если мой сорт - не сладкий!"
  	Talk2me "Дилпор#2019family" "Дилпор : Что-что, не сладкий?"
	Talk2me "Сур#2019family" "Сур : Тебе послышалось, Дилпор!"
  	wait
  	dialog "[Сур]"
	dialog "Как мне теперь быть... "
	dialog "Как обеспечить мою ферму... "
  	wait
  	choose menu "Что же теперь делать?"
	endchoose
  	dialog "[Сур]"
  	dialog "Давай хорошенько подумаем..."
  	wait
  	dialog "[Сур]"
  	dialog "Думаю, сначала стоит получить образец "
  	dialog "кислой дыни."
  	dialog "Ты же ведь искатель приключений!"
  	wait
  	dialog "[Сур]"
  	dialog "Думаю тебе не составит труда "
  	dialog "помочь мне!"
  	wait
  	choose menu "Помочь " "Не помогать "
  		case 1
  		break
  		case 2
  			dialog "[Сур]"
  			dialog "На что я рассчитывал..."
  			dialog "Мне никогда не смыть с себя этой позор!"
  			Talk2me "Дилпор#2019family" "Дилпор : Ты всё-равно неплохой фермер..."
  			close
  			return
  		break
  	endchoose
  	dialog "[Сур]"
  	dialog "Спасибо!"
  	dialog "Как ты уже мог заметить, "
  	dialog "дыни появляются на полях."
  	wait
  	dialog "[Сур]"
  	dialog "Возможно ты уже мог заметить "
	dialog "эти недоразумения, они странного "
	dialog "фиолетового цвета. "
  	wait
  	dialog "[Сур]"
  	dialog "Добудь, пожалуйста, 10 кислых "
  	dialog "дынь и принеси мне, посмотрим "
	dialog "на них поближе."
	Talk2me "Сур#2019family" "Сур : Что что?"
  	Talk2me "Дилпор#2019family" "Дилпор : Не стоит об этом..."
  	setquest 8580
  	close
  	return
elseif (q8580 == 1)
	if (v[Sour_Melon] > 9)
    	dialog "[Сур]"
    	dialog "Привет, авантюрист..."
    	wait
    	choose menu "Я принес кислые дыни " "Послушать жалобы "
    		case 1
    		break
    		case 2
    			dialog "[Сур]"
    			dialog "У кого-то всё с первого раза "
				dialog "получается, а кому-то приходится "
				dialog "постоянно пробовать..."
    			wait
    			dialog "[Сур]"
    			dialog "Сначала я вообще "
				dialog "выращивал виноград."
				dialog "Интересно, если бы до сих пор "
				dialog "выращил виноград, что бы "
				dialog "было сейчас?"
    			Talk2me "Дилпор#2019family" "Дилпор : Виноград??"
    			Talk2me "Сур#2019family" "Сур : Я был тогда молодым..."
    			wait
    			dialog "[Сур]"
    			dialog "Может быть я просто выбрал не ту профессию..."
    			wait
    			dialog "[Сур]"
    			dialog "Хотя, скорее всего, и там "
				dialog "у меня были бы одни провалы..."
    			close
    			return
    		break
    	endchoose
    	//case1
        dialog "[Сур]"
        dialog "Ничего себе!"
        dialog "Я не думал, что ты придешь "
		dialog "так скоро... "
        dialog "Это что еще такое??"
        wait
        dialog "[Сур]"
        dialog "Выкинь это немедленно!"
        dialog "Пока никто не заметил..."
        wait
    	dialog "[Сур]"
    	dialog "..."
    	wait
    	dialog "[Сур]"
    	dialog "Такого я не ожидал..."
		Talk2me "Сур#2019family" "Сур : Вот это да..."
		Talk2me "Дилпор#2019family" "Дилпор : Глазам не верю..."
    	wait
        if (v[Sour_Melon] > 9)
          dialog "[Сур]"
          dialog "В любом случае, спасибо тебе "
          dialog "за помощь, мы хотя бы "
		  dialog "узнали с чем имеем дело..."
          dropitem Sour_Melon 10
          completequest 8580
          setquest 8581
          ConsumeSpecialItem Melon_Parfait
          getitem Sweet_Melon_Juice 5
          wait
        else
        	dialog "[Сур]"
        	dialog "Погоди, что?"
        	dialog "Ты не принес кислые дыни?"
        	close
        	return
        endif
        dialog "[Сур]"
        dialog "Если всё в силе, можно мне попросить тебя о помощи еще?"
        wait
		dialog "[Сур]"
		dialog "А пока я проведу небольшое исследование..."
        close
        return
    else
    			dialog "[Сур]"
    			dialog "У кого-то всё с первого раза "
				dialog "получается, а кому-то приходится "
				dialog "постоянно пробовать..."
    			wait
    			dialog "[Сур]"
    			dialog "Сначала я вообще "
				dialog "выращивал виноград."
				dialog "Интересно, если бы до сих пор "
				dialog "выращил виноград, что бы "
				dialog "было сейчас?"
    			Talk2me "Дилпор#2019family" "Дилпор : Виноград??"
    			Talk2me "Сур#2019family" "Сур : Я был тогда молодым..."
    			wait
    			dialog "[Сур]"
    			dialog "Может быть я просто выбрал не ту профессию..."
    			wait
    			dialog "[Сур]"
    			dialog "Хотя, скорее всего, и там "
				dialog "у меня были бы одни провалы..."
    			close
    			return
    endif
endif
//1? ???
//? ???? 1?? ?????. 2?? ???? ???? ???? 8583???.
if (q8581 == 0)
//??
elseif (q8581 == 1)
	dialog "[Сур]"
	dialog "Спасибо тебе!"
	dialog "Я был бы очень рад, если бы ты помог мне еще завтра."
	close
	return
elseif (q8581 > 1)
	if (q8581 == 2)
   		erasequest 8581
		//?? ? ??? ?? ??
	elseif (q8581 == 3)
   		recall_completequest 8581
	   	erasequest 8581
		//???? ??
	endif
endif


//2?? ???? ???? ????? ??? ????.
if (q8583 == 1)
	dialog "[Сур]"
	dialog "Спасибо тебе!"
	dialog "Я был бы очень рад, если бы ты помог мне еще завтра."
	close
	return
elseif (q8583 > 1)
  	if (q8583 == 2)
  		erasequest 8583
  	elseif (q8583 == 3)
  		recall_completequest 8583
  		erasequest 8583
  	endif
else
//0
endif
//???? ?? ??
if (q8582 == 0)
    dialog "[Сур]"
    dialog "Авантюрист, ты вернулся!"
    dialog "Тогда мне бы не помешала помощь."
	dialog "Сможешь принести мне 10 кислых дынь, как и в прошлый раз?"
    wait
    choose menu "Помочь " "Мне пора "
    	case 1
        	setquest 8582
        	dialog "[Сур]"
        	dialog "Спасибо! Скоро я выясню что не так с этими дынями..."
        	Talk2me "Дилпор#2019family" "Дилпор : Это странно..."
        	//???
        	close
        	return
    	break
    	case 2
    		dialog "[Сур]"
    		dialog "Ну что ж, ты видимо очень занят."
    		dialog "Раз не хочешь помочь бедному "
    		dialog "фермеру..."
    		close
    		return
    	break
    endchoose
elseif (q8582 == 1)
	if (v[Sour_Melon] > 9)
    	dialog "[Сур]"
    	dialog "Ты принес мне кислые дыни? Мне нужно было 10 штук..."
    	wait
    	choose menu "Я принес кислые дыни " "Послушать жалобы "
    		case 1
              dialog "[Сур]"
			  dialog "Ну и ну... Как такое вообще "
			  dialog "могло получиться... "
			  dialog "В любом случае, спасибо тебе "
			  dialog "за помощь, мы хотя бы "
			  dialog "узнали с чем имеем дело..."
              dropitem Sour_Melon 10
              erasequest 8582
              setquest 8583
              ConsumeSpecialItem Melon_Parfait
              getitem Sweet_Melon_Juice 5
              wait
              dialog "[Сур]"
              dialog "Приходи еще..."
			  dialog "Я пока займусь исследованиями."
              close
              return
    		break
    		case 2
    			dialog "[Сур]"
    			dialog "У кого-то всё с первого раза "
				dialog "получается, а кому-то приходится "
				dialog "постоянно пробовать..."
    			wait
    			dialog "[Сур]"
    			dialog "Сначала я вообще "
				dialog "выращивал виноград."
				dialog "Интересно, если бы до сих пор "
				dialog "выращил виноград, что бы "
				dialog "было сейчас?"
    			Talk2me "Дилпор#2019family" "Дилпор : Виноград??"
    			Talk2me "Сур#2019family" "Сур : Я был тогда молодым..."
    			wait
    			dialog "[Сур]"
    			dialog "Может быть я просто выбрал не ту профессию..."
    			wait
    			dialog "[Сур]"
    			dialog "Хотя, скорее всего, и там "
				dialog "у меня были бы одни провалы..."
    			close
    			return
    		break
    	endchoose
    else
    	dialog "[Сур]"
    	dialog "Я бы попросил вас собрать 10 кислых дынь для меня."
    	dialog "Они обычно встречаются на полях наряду с обычнми сладкими дынями..."
    	close
    	return
    endif
endif




npc "hugel" "Тормод#2019family" 1_M_HOF 218 230 5 0 0

OnInit:
	AddQuestIDCondition 8578
	SetQuestConditionBegin 8578 1 4
	SetQuestConditionQuest 8578 1
	SetQuestConditionEnd

OnClick:
//--------?? ?? ?? ??---------------------------------------------------
    var wt_inven = GetInventoryRemainCount 1301 3
    if ((wt_inven == 2) | (wt_inven == 3))
        dialog "Твой инвентарь переполнен,"
		dialog "освободи место и возвращайся."
        close
        return
    else
    endif
//-----------------------------------------------?-----------------------------
	var q8578 = isbegin_quest 8578
	var q8579 = isbegin_quest 8579
if (q8578 == 1)
	if (v[Ice_Box] > 0)
    	dialog "["+PcName+"]"
    	dialog "Привет, Тормод."
    	dialog "Дилпор передал вам кое-что."
    	wait
    	dialog "-- Тормод открывает холодильник --"
    	wait
    	dialog "[Тормод]"
    	dialog "...Хм?"
    	dialog "Ух ты, спасибо большое!"
    	dialog "Зря я, наверное, так загрузил "
    	dialog "Дилпора. А ему еще захотелось "
		dialog "отнести мне парфе..."
    	wait
    	dialog "[Тормод]"
    	dialog "И тебе ведь путник пришлось..."
    	dialog "Пересечь весь материк, чтобы добраться сюда с этим тяжелым ящиком."
    	wait
    	dialog "[Тормод]"
    	dialog "Спасибо тебе. Думаю, что "
    	dialog "Дилпор будет не против, если я "
		dialog "угощу тебя парфе, как считаешь?"
		dialog "И вот еще что, передай эту "
		dialog "записку Дилпору, пожалуйста."
    	dropitem Ice_Box 1
    	completequest 8578
    	setquest 8579
    	getitem Melon_Parfait 5
    	wait
    	dialog "-- Тормод отдал записку --"
    	wait
    	dialog "[Тормод]"
    	dialog "Только не потеряй её."
    	close
    	return
	else
		dialog "[Тормод]"
    	dialog "...Хм?"
    	dialog "Вы хотели мне что-то передать?"
    	dialog "Если так, то вы, видимо, "
    	dialog "потеряли это по пути..."
		close
		return
	endif
else
	dialog "[Тормод]"
	dialog "В этом году я оставил свою ферму моему младшему сыну."
	dialog "Это из-за того, что люди много работают, они становятся нервными."
	close
	return
endif




//-------------------------------------------????---------------------------






