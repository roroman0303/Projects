
npc "niflheim" "Портал#2021hw_prt" 1_SHADOW_NPC 177 248 6 3 3
OnClick:
	dialog "*шепот*"
	dialog "Ты всё-равно вернешься..."
	dialog "Рано или поздно..."
	wait
	choose menu "Вернуться в Пронтеру " "Отмена "
	case 1
		close
		moveto "prontera" 100 100
		return
	break
	case 2
		return
	break
	endchoose
return

npc "prontera" "Фирун#2021hw_prt" 4_LUDE 133 124 6 0 0
OnClick:
dialog "[Фирун]"
dialog "... АРРР!"
Talk2me "Фирун#2021hw_prt" "Фирун: АРРР!"
close
return

npc "prontera" "Хорро#2021hw_prt" 4_LUDE 131 121 7 0 0
OnClick:
dialog "[Хорро]"
dialog "Уходи!"
Talk2me "Хорро#2021hw_prt" "Хорро: Уходи!"
close
return

npc "prontera" "Фобос#2021hw_prt" 4_LUDE 136 120 8 0 0
OnClick:
dialog "[Фобос]"
dialog "Ха-ха-ха-ха-ха-ха-ха-ха-ха ха-ха-ха-ха-ха-ха-ха-ха-ха..."
Talk2me "Фобос#2021hw_prt" "Фобос: Ха-ха-ха-ха-ха-ха-ха-ха-ха!"
close
return

npc "prontera" "Брайт#2021hw_prt" 4_LUDE 134 122 3 5 5
OnInit:
    AddQuestInfo 11498 1 0
    SetQuestLevel 11498 20 1000
return

OnTouch2:
if (v[VAR_CLEVEL] < 20)
else
	if (v[halloebs01] < 1)
		dialog "[Брайт]"
		dialog "Выше! Выше!"
		Talk2me "Брайт#2021hw_prt" "Брайт: Выше! Выше!"
        wait
        dialog "[Хорро]"
        dialog "Я уже почти могу дотронуться до облака!"
        Talk2me "Хорро#2021hw_prt" "Хорро: Почти!"
        wait
    choose menu "Продолжать слушать " "Уйти "
        case 1
        	dialog "[Фобос]"
			dialog "Ты слышал? Ты слышал? Джек убежал!"
            wait
            dialog "[Хорро]"
            dialog "Джек?"
            wait
            dialog "[Брайт]"
            dialog "Какой Джек?"
            wait
            dialog "[Фирун]"
            dialog "Что такое Джек?"
            wait
            dialog "[Брайт]"
            dialog "Без Джека наш фестиваль не состоится!"
            wait
            dialog "[Фирун]"
            dialog "Это важно."
            wait
            dialog "[Фобос]"
            dialog "И правда."
            wait
            dialog "[Хорро]"
            dialog "Найдем Джека и вернемся!"
            wait
            dialog "[Фобос]"
            dialog "Хорошо."
            wait
            dialog "[Фирун]"
            dialog "Давай найдем."
            wait
            dialog "[Брайт]"
            dialog "Давай вернемся!"
            wait
            dialog "[Фобос]"
            dialog "О, это Джек!"
            wait
            dialog "[Хорро]"
            dialog "Где?"
            wait
            dialog "[Брайт]"
            dialog "Джек!"
            setitem halloebs01 1
            setquest 11498
            close
            	moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Фобос]"
        	dialog "Ну и уходи! ...Джек!.."
        	close
        	return
        break
        endchoose
	else
		dialog "[Брайт]"
		dialog "Выше! Выше!"
		Talk2me "Брайт#2021hw_prt" "Брайт: Выше! Выше!"
        wait
        dialog "[Хорро]"
        dialog "Я уже почти могу дотронуться до облака!"
        Talk2me "Хорро#2021hw_prt" "Хорро: Почти!"
        wait
    choose menu "Переместиться в Нифльхейм " "Уйти "
        case 1
            dialog "[Фобос]"
            dialog "О, это Джек!"
            wait
            dialog "[Хорро]"
            dialog "Где?"
            close
            moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Фобос]"
        	dialog "Ну и уходи! ...Джек!.."
        	close
        	return
        break
        endchoose
	endif
endif
return

OnClick:
if (v[VAR_CLEVEL] < 20)
else
	if (v[halloebs01] < 1)
		dialog "[Брайт]"
		dialog "Выше! Выше!"
		Talk2me "Брайт#2021hw_prt" "Брайт: Выше! Выше!"
        wait
        dialog "[Хорро]"
        dialog "Я уже почти могу дотронуться до облака!"
        Talk2me "Хорро#2021hw_prt" "Хорро: Почти!"
        wait
    choose menu "Продолжать слушать " "Уйти "
        case 1
        	dialog "[Фобос]"
			dialog "Ты слышал? Ты слышал? Джек убежал!"
            wait
            dialog "[Хорро]"
            dialog "Джек?"
            wait
            dialog "[Брайт]"
            dialog "Какой Джек?"
            wait
            dialog "[Фирун]"
            dialog "Что такое Джек?"
            wait
            dialog "[Брайт]"
            dialog "Без Джека наш фестиваль не состоится!"
            wait
            dialog "[Фирун]"
            dialog "Это важно."
            wait
            dialog "[Фобос]"
            dialog "И правда."
            wait
            dialog "[Хорро]"
            dialog "Найдем Джека и вернемся!"
            wait
            dialog "[Фобос]"
            dialog "Хорошо."
            wait
            dialog "[Фирун]"
            dialog "Давай найдем."
            wait
            dialog "[Брайт]"
            dialog "Давай вернемся!"
            wait
            dialog "[Фобос]"
            dialog "О, это Джек!"
            wait
            dialog "[Хорро]"
            dialog "Где?"
            wait
            dialog "[Брайт]"
            dialog "Джек!"
            setitem halloebs01 1
            setquest 11498
            close
            	moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Фобос]"
        	dialog "Ну и уходи! ...Джек!.."
        	close
        	return
        break
        endchoose
	else
		dialog "[Брайт]"
		dialog "Выше! Выше!"
		Talk2me "Брайт#2021hw_prt" "Брайт: Выше! Выше!"
        wait
        dialog "[Хорро]"
        dialog "Я уже почти могу дотронуться до облака!"
        Talk2me "Хорро#2021hw_prt" "Хорро: Почти!"
        wait
    choose menu "Переместиться в Нифльхейм " "Уйти "
        case 1
            dialog "[Фобос]"
            dialog "О, это Джек!"
            wait
            dialog "[Хорро]"
            dialog "Где?"
            close
            moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Фобос]"
        	dialog "Ну и уходи! ...Джек!.."
        	close
        	return
        break
        endchoose
	endif
endif
return


npc "payon" "Фирун#2021hw_pay" 4_LUDE 188 104 3 0 0
OnClick:
dialog "[Фирун]"
dialog "... АРРР!"
Talk2me "Фирун#2021hw_prt" "Фирун: АРРР!"
close
return

npc "payon" "Хорро#2021hw_pay" 4_LUDE 190 105 3 0 0
OnClick:
dialog "[Хорро]"
dialog "Уходи!"
Talk2me "Хорро#2021hw_prt" "Хорро: Уходи!"
close
return

npc "payon" "Фобос#2021hw_pay" 4_LUDE 186 106 8 0 0
OnClick:
dialog "[Фобос]"
dialog "Ха-ха-ха-ха-ха-ха-ха-ха-ха ха-ха-ха-ха-ха-ха-ха-ха-ха..."
Talk2me "Фобос#2021hw_prt" "Фобос: Ха-ха-ха-ха-ха-ха-ха-ха-ха!"
close
return

npc "payon" "Брайт#2021hw_pay" 4_LUDE 192 103 5 5 5
OnInit:
    AddQuestInfo 11498 1 0
    SetQuestLevel 11498 20 1000
return

OnTouch2:
if (v[VAR_CLEVEL] < 20)
else
	if (v[halloebs01] < 1)
	dialog "[Брайт]"
	dialog "Выше! Выше!"
	Talk2me "Брайт#2021hw_prt" "Брайт: Выше! Выше!"
	wait
	dialog "[Хорро]"
	dialog "Я уже почти могу дотронуться до облака!"
	Talk2me "Хорро#2021hw_prt" "Хорро: Почти!"
	wait
	choose menu "Продолжать слушать " "Уйти "
        case 1
        	dialog "[Фобос]"
			dialog "Ты слышал? Ты слышал? Джек убежал!"
            wait
            dialog "[Хорро]"
            dialog "Джек?"
            wait
            dialog "[Брайт]"
            dialog "Какой Джек?"
            wait
            dialog "[Фирун]"
            dialog "Что такое Джек?"
            wait
            dialog "[Брайт]"
            dialog "Без Джека наш фестиваль не состоится!"
            wait
            dialog "[Фирун]"
            dialog "Это важно."
            wait
            dialog "[Фобос]"
            dialog "И правда."
            wait
            dialog "[Хорро]"
            dialog "Найдем Джека и вернемся!"
            wait
            dialog "[Фобос]"
            dialog "Хорошо."
            wait
            dialog "[Фирун]"
            dialog "Давай найдем."
            wait
            dialog "[Брайт]"
            dialog "Давай вернемся!"
            wait
            dialog "[Фобос]"
            dialog "О, это Джек!"
            wait
            dialog "[Хорро]"
            dialog "Где?"
            wait
            dialog "[Брайт]"
            dialog "Джек!"
            setitem halloebs01 1
            setquest 11498
            close
            	moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Фобос]"
        	dialog "Ну и уходи! ...Джек!.."
        	close
        	return
        break
    endchoose
	endif
endif
return

OnClick:
if (v[VAR_CLEVEL] < 20)
	dialog "[Брайт]"
	dialog "Выше! Выше!"
	Talk2me "Брайт#2021hw_prt" "Брайт: Выше! Выше!"
	wait
	dialog "[Хорро]"
	dialog "Я уже почти могу дотронуться до облака!"
	Talk2me "Хорро#2021hw_prt" "Хорро: Почти!"
    close
    return
endif

if (v[halloebs01] < 1)
	dialog "[Брайт]"
	dialog "Выше! Выше!"
	Talk2me "Брайт#2021hw_prt" "Брайт: Выше! Выше!"
	wait
	dialog "[Хорро]"
	dialog "Я уже почти могу дотронуться до облака!"
	Talk2me "Хорро#2021hw_prt" "Хорро: Почти!"
	wait
	choose menu "Продолжать слушать " "Уйти "
        case 1
        	dialog "[Фобос]"
			dialog "Ты слышал? Ты слышал? Джек убежал!"
            wait
            dialog "[Хорро]"
            dialog "Джек?"
            wait
            dialog "[Брайт]"
            dialog "Какой Джек?"
            wait
            dialog "[Фирун]"
            dialog "Что такое Джек?"
            wait
            dialog "[Брайт]"
            dialog "Без Джека наш фестиваль не состоится!"
            wait
            dialog "[Фирун]"
            dialog "Это важно."
            wait
            dialog "[Фобос]"
            dialog "И правда."
            wait
            dialog "[Хорро]"
            dialog "Найдем Джека и вернемся!"
            wait
            dialog "[Фобос]"
            dialog "Хорошо."
            wait
            dialog "[Фирун]"
            dialog "Давай найдем."
            wait
            dialog "[Брайт]"
            dialog "Давай вернемся!"
            wait
            dialog "[Фобос]"
            dialog "О, это Джек!"
            wait
            dialog "[Хорро]"
            dialog "Где?"
            wait
            dialog "[Брайт]"
            dialog "Джек!"
            setitem halloebs01 1
            setquest 11498
            close
            	moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Фобос]"
        	dialog "Ну и уходи! ...Джек!.."
        	close
        	return
        break
    endchoose
endif

if (v[halloebs01] == 1)
	dialog "[Брайт]"
	dialog "Джек... Это самый страшный фестиваль..."
	wait
	dialog "[Фобос]"
	dialog "^ff0000А в городе мертвых сейчас праздник^000000!"
	close
	return
else
	dialog "[Брайт]"
	dialog "Выше! Выше!"
	Talk2me "Брайт#2021hw_prt" "Брайт: Выше! Выше!"
	wait
	dialog "[Хорро]"
	dialog "Я уже почти могу дотронуться до облака!"
	Talk2me "Хорро#2021hw_prt" "Хорро: Почти!"
    close
    return
endif
return


npc "morocc" "Фирун#2021hw_moc" 4_LUDE 168 95 3 0 0
OnClick:
dialog "[Фирун]"
dialog "... АРРР!"
Talk2me "Фирун#2021hw_prt" "Фирун: АРРР!"
close
return

npc "morocc" "Хорро#2021hw_moc" 4_LUDE 170 94 3 0 0
OnClick:
dialog "[Хорро]"
dialog "Уходи!"
Talk2me "Хорро#2021hw_prt" "Хорро: Уходи!"
close
return

npc "morocc" "Фобос#2021hw_moc" 4_LUDE 168 93 8 0 0
OnClick:
dialog "[Фобос]"
dialog "Ха-ха-ха-ха-ха-ха-ха-ха-ха ха-ха-ха-ха-ха-ха-ха-ха-ха..."
Talk2me "Фобос#2021hw_prt" "Фобос: Ха-ха-ха-ха-ха-ха-ха-ха-ха!"
close
return

npc "morocc" "Брайт#2021hw_moc" 4_LUDE 170 96 5 5 5
OnInit:
    AddQuestInfo 11498 1 0
    SetQuestLevel 11498 20 1000
return

OnTouch2:
if (v[VAR_CLEVEL] < 20)
else
	if (v[halloebs01] < 1)
		dialog "[Брайт]"
	dialog "Выше! Выше!"
	Talk2me "Брайт#2021hw_prt" "Брайт: Выше! Выше!"
	wait
	dialog "[Хорро]"
	dialog "Я уже почти могу дотронуться до облака!"
	Talk2me "Хорро#2021hw_prt" "Хорро: Почти!"
	wait
	choose menu "Продолжать слушать " "Уйти "
        case 1
        	dialog "[Фобос]"
			dialog "Ты слышал? Ты слышал? Джек убежал!"
            wait
            dialog "[Хорро]"
            dialog "Джек?"
            wait
            dialog "[Брайт]"
            dialog "Какой Джек?"
            wait
            dialog "[Фирун]"
            dialog "Что такое Джек?"
            wait
            dialog "[Брайт]"
            dialog "Без Джека наш фестиваль не состоится!"
            wait
            dialog "[Фирун]"
            dialog "Это важно."
            wait
            dialog "[Фобос]"
            dialog "И правда."
            wait
            dialog "[Хорро]"
            dialog "Найдем Джека и вернемся!"
            wait
            dialog "[Фобос]"
            dialog "Хорошо."
            wait
            dialog "[Фирун]"
            dialog "Давай найдем."
            wait
            dialog "[Брайт]"
            dialog "Давай вернемся!"
            wait
            dialog "[Фобос]"
            dialog "О, это Джек!"
            wait
            dialog "[Хорро]"
            dialog "Где?"
            wait
            dialog "[Брайт]"
            dialog "Джек!"
            setitem halloebs01 1
            setquest 11498
            close
            	moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Фобос]"
        	dialog "Ну и уходи! ...Джек!.."
        	close
        	return
        break
    endchoose
	endif
endif
return

OnClick:
if (v[VAR_CLEVEL] < 20)
	dialog "[Брайт]"
	dialog "Выше! Выше!"
	Talk2me "Брайт#2021hw_prt" "Брайт: Выше! Выше!"
	wait
	dialog "[Хорро]"
	dialog "Я уже почти могу дотронуться до облака!"
	Talk2me "Хорро#2021hw_prt" "Хорро: Почти!"
	wait
endif

if (v[halloebs01] < 1)
	dialog "[Брайт]"
	dialog "Выше! Выше!"
	Talk2me "Брайт#2021hw_prt" "Брайт: Выше! Выше!"
	wait
	dialog "[Хорро]"
	dialog "Я уже почти могу дотронуться до облака!"
	Talk2me "Хорро#2021hw_prt" "Хорро: Почти!"
	wait
	choose menu "Продолжать слушать " "Уйти "
        case 1
        	dialog "[Фобос]"
			dialog "Ты слышал? Ты слышал? Джек убежал!"
            wait
            dialog "[Хорро]"
            dialog "Джек?"
            wait
            dialog "[Брайт]"
            dialog "Какой Джек?"
            wait
            dialog "[Фирун]"
            dialog "Что такое Джек?"
            wait
            dialog "[Брайт]"
            dialog "Без Джека наш фестиваль не состоится!"
            wait
            dialog "[Фирун]"
            dialog "Это важно."
            wait
            dialog "[Фобос]"
            dialog "И правда."
            wait
            dialog "[Хорро]"
            dialog "Найдем Джека и вернемся!"
            wait
            dialog "[Фобос]"
            dialog "Хорошо."
            wait
            dialog "[Фирун]"
            dialog "Давай найдем."
            wait
            dialog "[Брайт]"
            dialog "Давай вернемся!"
            wait
            dialog "[Фобос]"
            dialog "О, это Джек!"
            wait
            dialog "[Хорро]"
            dialog "Где?"
            wait
            dialog "[Брайт]"
            dialog "Джек!"
            setitem halloebs01 1
            setquest 11498
            close
            	moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Фобос]"
        	dialog "Ну и уходи! ...Джек!.."
        	close
        	return
        break
    endchoose
endif

if (v[halloebs01] == 1)
	dialog "[Брайт]"
	dialog "Джек... Это самый страшный фестиваль..."
	wait
	dialog "[Фобос]"
	dialog "^ff0000А в городе мертвых сейчас праздник^000000!"
	close
	return
else
	dialog "[Брайт]"
	dialog "Выше! Выше!"
	Talk2me "Брайт#2021hw_prt" "Брайт: Выше! Выше!"
	wait
	dialog "[Хорро]"
	dialog "Я уже почти могу дотронуться до облака!"
	Talk2me "Хорро#2021hw_prt" "Хорро: Почти!"
    close
    return
endif
return



npc "niflheim" "Хорро#2021hw" 4_LUDE 177 242 5 5 5
OnInit:
    AddQuestInfo 11498 1 0
    SetQuestLevel 11498 20 1000
return

OnTouch2:
var q11498 = isbegin_quest 11498

if (v[VAR_CLEVEL] < 20)
else
	if (v[halloebs01] < 2)
		dialog "[Хорро]"
		dialog "Джек!"
		Talk2me "Хорро#2021hw" "Хорро: Джек!"
        wait
        dialog "[Хорро]"
		dialog "Джек, просыпайся!"
        Talk2me "Хорро#2021hw" "Хорро: Джек, просыпайся!"
        wait
        dialog "[Фрай]"
        dialog "Здесь фестиваль, Джек!"
        wait
        dialog "[Боб]"
        dialog "Уже темно!"
        wait
        dialog "[Фрай]"
		dialog "Проснись, Джек! Фестиваль скоро начнется!"
        wait
        dialog "[Хорро]"
        dialog "Но... Разве это важно?"
        wait
        dialog "[Боб]"
        dialog "Джек еще не вернулся."
        wait
        dialog "[Фрай]"
        dialog "Верно."
        wait
        dialog "[Хорро]"
        dialog "Джек вернулся, а Джек нет!"
        wait
        dialog "[Боб]"
        dialog "И Джек тоже!"
        wait
        dialog "[Фрай]"
        dialog "А как же Джек?"
        wait
        dialog "[Боб]"
        dialog "Джек на площади!"
        wait
        dialog "[Хорро]"
        dialog "Так что насчет Джека?"
        wait
        dialog "[Боб]"
        dialog "Куда подевался Джек?"
        wait
        dialog "[Фрай]"
        dialog "Спросите ^ff0000Джека^000000!"
        wait
        dialog "[Хорро]"
        dialog "Давайте спросим!"
        wait
        dialog "[Фрай]"
        dialog "Джек точно знает!"
        wait
        dialog "[Хорро]"
        dialog "Я знаю!"
        setitem halloebs01 2
        if (q11498 > 0)
        completequest 11498
        endif
        setquest 11499
        close
        return
	endif
endif
return

OnClick:
var q11498 = isbegin_quest 11498
var q11501 = checkquest_hunting 11501
var q11502 = checkquest_playtime 11502
var q11503 = checkquest_hunting 11503

if (v[VAR_CLEVEL] < 20)
	dialog "[Хорро]"
    dialog "Джек вернулся, а Джек нет!"
    close
    return
endif

if (v[halloebs01] < 2)
	dialog "[Хорро]"
	dialog "Джек!"
	Talk2me "Хорро#2021hw" "Хорро: Джек!"
	wait
	dialog "[Хорро]"
	dialog "Джек, просыпайся!"
	Talk2me "Хорро#2021hw" "Хорро: Джек, просыпайся!"
	wait
	dialog "[Фрай]"
	dialog "Здесь фестиваль, Джек!"
	wait
	dialog "[Боб]"
	dialog "Уже темно!"
	wait
	dialog "[Фрай]"
	dialog "Проснись, Джек! Фестиваль скоро начнется!"
	wait
	dialog "[Хорро]"
	dialog "Но... Разве это важно?"
	wait
	dialog "[Боб]"
	dialog "Джек еще не вернулся."
	wait
	dialog "[Фрай]"
	dialog "Верно."
	wait
	dialog "[Хорро]"
	dialog "Джек вернулся, а Джек нет!"
	wait
	dialog "[Боб]"
	dialog "И Джек тоже!"
	wait
	dialog "[Фрай]"
	dialog "А как же Джек?"
	wait
	dialog "[Боб]"
	dialog "Джек на площади!"
	wait
	dialog "[Хорро]"
	dialog "Так что насчет Джека?"
	wait
	dialog "[Боб]"
	dialog "Куда подевался Джек?"
	wait
	dialog "[Фрай]"
	dialog "Спросите ^ff0000Джека^000000!"
	wait
	dialog "[Хорро]"
	dialog "Давайте спросим!"
	wait
	dialog "[Фрай]"
	dialog "Джек точно знает!"
	wait
	dialog "[Хорро]"
	dialog "Я знаю!"
	setitem halloebs01 2
	if (q11498 > 0)
	completequest 11498
	endif
	setquest 11499
	close
	return
endif

if (v[halloebs01] == 2)
	dialog "[Хорро]"
    dialog "Так что насчет Джека?"
    wait
    dialog "[Боб]"
    dialog "Куда подевался Джек?"
    wait
    dialog "[Фрай]"
    dialog "Спросите ^ff0000Джека^000000!"
    wait
	dialog "[Хорро]"
	dialog "Давайте спросим!"
	wait
	dialog "[Фрай]"
	dialog "Джек точно знает!"
	wait
	dialog "[Хорро]"
	dialog "Я знаю!"
    close
    return
endif

if (v[halloebs01] == 3)
    dialog "[Хорро]"
    dialog "Фрай хочет получить известие от Джека!"
    wait
    dialog "[Хорро]"
    dialog "Джек!"
    wait
    dialog "[Фрай]"
    dialog "Я хочу это услышать!"
    wait
    dialog "[Боб]"
    dialog "Нам нужно найти Джека!"
    close
    return
endif

if (v[halloebs01] == 4)

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "У вас слишком много вещей. Освободите свой инвентарь и попробуйте еще раз."
        close
        return
    else
    endif

	if (q11501] > 1)
		if ((v[Pumpkin_Decor] > 9) & (v[White_Thin_Stem] > 19))
			dialog "[Хорро]"
			dialog "Джек вернулся!"
			dropitem Pumpkin_Decor 10
			dropitem White_Thin_Stem 20
			completequest 11501
			setquest 11502
			setitem halloebs01 5
			getitem Cookies_Bat 30
            wait
            dialog "[Фрай]"
            dialog "Джек!"
            wait
            dialog "[Боб]"
            dialog "Ура! Джек!"
            wait
            dialog "[Хорро]"
            dialog "Давайте все украсим Джека!"
            Talk2me "Хорро#2021hw" "Хорро: Давайте все украсим Джека!"
            wait
            dialog "[Фрай]"
            dialog "Красить Джека?"
            Talk2me "Фрай#2021hw" "Фрай: Красить Джека?"
            wait
            dialog "[Боб]"
            dialog "Я первый!"
            Talk2me "Боб#2021hw" "Боб: Я первый!"
            wait
            dialog "[Фрай]"
            dialog "Вот это праздник!"
            Talk2me "Фрай#2021hw" "Фрай: Вот это праздник!"
            wait
            dialog "[Хорро]"
            dialog "Это жутко!"
            wait
            dialog "[Боб]"
            dialog "Это страшно!"
            wait
            dialog "[Хорро]"
            dialog "Я страшный?"
            wait
            dialog "[Фрай]"
            dialog "Сейчас украсим!"
            close
            return
		else
            dialog "[Хорро]"
			dialog "Джек! Принеси мне Джека!"
            wait
            dialog "[Фрай]"
            dialog "Если вы будете ждать слишком долго, Джек может... прорасти."
            wait
            dialog "[Боб]"
			dialog "Это же ужасно!"
            wait
            dialog "[Хорро]"
            dialog "Зелёные ростки!"
            wait
            dialog "[Фрай]"
            dialog "Зато свежие."
            wait
            dialog "[Хорро]"
            dialog "Принеси мне 10 ^ff0000Светильников Джека^000000!"
            wait
            dialog "[Боб]"
            dialog "Еще нам нужно 20 ^ff0000Сухих белых веток^000000. Они послужат Джеку... конечностями! Аха-ха-ха-ха!"
            close
            return
		endif
	else
        dialog "[Хорро]"
		dialog "Джек! Принеси мне Джека!"
		wait
		dialog "[Фрай]"
		dialog "Если вы будете ждать слишком долго, Джек может... прорасти."
		wait
		dialog "[Боб]"
		dialog "Это же ужасно!"
		wait
		dialog "[Хорро]"
		dialog "Зелёные ростки!"
		wait
		dialog "[Фрай]"
		dialog "Зато свежие."
		wait
		dialog "[Хорро]"
		dialog "Принеси мне 10 ^ff0000Светильников Джека^000000!"
		wait
		dialog "[Боб]"
		dialog "Еще нам нужно 20 ^ff0000Сухих белых веток^000000. Они послужат Джеку... конечностями! Аха-ха-ха-ха!"
		close
		return
	endif
endif

if (v[halloebs01] > 4)

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "У вас слишком много вещей. Освободите свой инвентарь и попробуйте еще раз."
        close
        return
    else
    endif

	if (q11503 == 1)
		dialog "[Хорро]"
		dialog "Джек! Принеси мне Джека!"
		wait
		dialog "[Фрай]"
		dialog "Если вы будете ждать слишком долго, Джек может... прорасти."
		wait
		dialog "[Боб]"
		dialog "Это же ужасно!"
		wait
		dialog "[Хорро]"
		dialog "Зелёные ростки!"
		wait
		dialog "[Фрай]"
		dialog "Зато свежие."
		wait
		dialog "[Хорро]"
		dialog "Принеси мне 10 ^ff0000Светильников Джека^000000!"
		wait
		dialog "[Боб]"
		dialog "Еще нам нужно 20 ^ff0000Сухих белых веток^000000. Они послужат Джеку... конечностями! Аха-ха-ха-ха!"
		close
		return
	elseif (q11503 > 1)
		if ((v[Pumpkin_Decor] > 9) & (v[White_Thin_Stem] > 19))
			if ((v[halloebs01] == 10) | (v[halloebs01] == 17) | (v[halloebs01] == 24) | (v[halloebs01] == 31) | (v[halloebs01] == 38) | (v[halloebs01] == 45) | (v[halloebs01] == 52) | (v[halloebs01] == 59) | (v[halloebs01] == 66) | (v[halloebs01] == 73))
				var horo6 = v[halloebs01]
				var horo7 = horo6 + 1
				dialog "[Хорро]"
    			dialog "Джек вернулся!"
				dropitem Pumpkin_Decor 10
				dropitem White_Thin_Stem 20
				if (q11503 == 3)
					recall_completequest 11503
				endif
				erasequest 11503
				setquest 11502
				setitem halloebs01 horo7
				getitem Cookies_Bat 30
				getitem C_Jakk 1
                wait
                dialog "[Фрай]"
				dialog "Джек!"
				wait
				dialog "[Боб]"
				dialog "Ура! Джек!"
				wait
				dialog "[Хорро]"
				dialog "Давайте все украсим Джека!"
				Talk2me "Хорро#2021hw" "Хорро: Давайте все украсим Джека!"
				wait
				dialog "[Фрай]"
				dialog "Красить Джека?"
				Talk2me "Фрай#2021hw" "Фрай: Красить Джека?"
				wait
				dialog "[Боб]"
				dialog "Я первый!"
				Talk2me "Боб#2021hw" "Боб: Я первый!"
				wait
				dialog "[Фрай]"
				dialog "Вот это праздник!"
				Talk2me "Фрай#2021hw" "Фрай: Вот это праздник!"
				wait
				dialog "[Хорро]"
				dialog "Это жутко!"
				wait
				dialog "[Боб]"
				dialog "Это страшно!"
				wait
				dialog "[Хорро]"
				dialog "Я страшный?"
				wait
				dialog "[Фрай]"
				dialog "Сейчас украсим!"
				close
				return
			else
				dialog "[Хорро]"
    			dialog "Джек вернулся!"
				var horo6 = v[halloebs01]
				var horo7 = horo6 + 1
				dropitem Pumpkin_Decor 10
				dropitem White_Thin_Stem 20
				if (q11503 == 3)
					recall_completequest 11503
				endif
				erasequest 11503
				setquest 11502
				setitem halloebs01 horo7
				getitem Cookies_Bat 30
                wait
                dialog "[Фрай]"
				dialog "Джек!"
				wait
				dialog "[Боб]"
				dialog "Ура! Джек!"
				wait
				dialog "[Хорро]"
				dialog "Давайте все украсим Джека!"
				Talk2me "Хорро#2021hw" "Хорро: Давайте все украсим Джека!"
				wait
				dialog "[Фрай]"
				dialog "Красить Джека?"
				Talk2me "Фрай#2021hw" "Фрай: Красить Джека?"
				wait
				dialog "[Боб]"
				dialog "Я первый!"
				Talk2me "Боб#2021hw" "Боб: Я первый!"
				wait
				dialog "[Фрай]"
				dialog "Вот это праздник!"
				Talk2me "Фрай#2021hw" "Фрай: Вот это праздник!"
				wait
				dialog "[Хорро]"
				dialog "Это жутко!"
				wait
				dialog "[Боб]"
				dialog "Это страшно!"
				wait
				dialog "[Хорро]"
				dialog "Я страшный?"
				wait
				dialog "[Фрай]"
				dialog "Сейчас украсим!"
				close
				return
			endif
		else
			dialog "[Хорро]"
			dialog "Джек! Принеси мне Джека!"
			wait
			dialog "[Фрай]"
			dialog "Если вы будете ждать слишком долго, Джек может... прорасти."
			wait
			dialog "[Боб]"
			dialog "Это же ужасно!"
			wait
			dialog "[Хорро]"
			dialog "Зелёные ростки!"
			wait
			dialog "[Фрай]"
			dialog "Зато свежие."
			wait
			dialog "[Хорро]"
			dialog "Принеси мне 10 ^ff0000Светильников Джека^000000!"
			wait
			dialog "[Боб]"
			dialog "Еще нам нужно 20 ^ff0000Сухих белых веток^000000. Они послужат Джеку... конечностями! Аха-ха-ха-ха!"
			close
			return
		endif
	else
		if (q11502 == 0)
			dialog "[Хорро]"
			dialog "Джек! Принеси мне Джека!"
			wait
			dialog "[Фрай]"
			dialog "Если вы будете ждать слишком долго, Джек может... прорасти."
			wait
			dialog "[Боб]"
			dialog "Это же ужасно!"
			wait
			dialog "[Хорро]"
			dialog "Зелёные ростки!"
			wait
			dialog "[Фрай]"
			dialog "Зато свежие."
			wait
			dialog "[Хорро]"
			dialog "Принеси мне 10 ^ff0000Светильников Джека^000000!"
			wait
			dialog "[Боб]"
			dialog "Еще нам нужно 20 ^ff0000Сухих белых веток^000000. Они послужат Джеку... конечностями! Аха-ха-ха-ха!"
            setquest 11503
            close
            return
		elseif (q11502 == 1)
			dialog "[Хорро]"
			dialog "Нельзя находиться в городе мёртвых так долго!"
            wait
            dialog "[Фрай]"
            dialog "Пусть стебли отрастут!"
            wait
            dialog "[Боб]"
			dialog "И Джек станет живым! И зелёным!"
            wait
            dialog "[Фрай]"
            dialog "А руки белые!"
            wait
            dialog "[Хорро]"
            dialog "Пусть отрастёт."
            wait
            dialog "[Боб]"
            dialog "Завтра приходи ещё искать Джеков!"
            close
            return
		else
			if (q11502 == 3)
				recall_completequest 11502
		    endif
		    erasequest 11502
    		dialog "[Хорро]"
			dialog "Джек! Принеси мне Джека!"
			wait
			dialog "[Фрай]"
			dialog "Если вы будете ждать слишком долго, Джек может... прорасти."
			wait
			dialog "[Боб]"
			dialog "Это же ужасно!"
			wait
			dialog "[Хорро]"
			dialog "Зелёные ростки!"
			wait
			dialog "[Фрай]"
			dialog "Зато свежие."
			wait
			dialog "[Хорро]"
			dialog "Принеси мне 10 ^ff0000Светильников Джека^000000!"
			wait
			dialog "[Боб]"
			dialog "Еще нам нужно 20 ^ff0000Сухих белых веток^000000. Они послужат Джеку... конечностями! Аха-ха-ха-ха!"
            setquest 11503
            close
            return
		endif
	endif
else
	dialog "[Фрай]"
	dialog "Джек!"
	wait
	dialog "[Боб]"
	dialog "Ура! Джек!"
	wait
	dialog "[Хорро]"
	dialog "Давайте все украсим Джека!"
	Talk2me "Хорро#2021hw" "Хорро: Давайте все украсим Джека!"
	wait
	dialog "[Фрай]"
	dialog "Красить Джека?"
	Talk2me "Фрай#2021hw" "Фрай: Красить Джека?"
	wait
	dialog "[Боб]"
	dialog "Я первый!"
	Talk2me "Боб#2021hw" "Боб: Я первый!"
	wait
	dialog "[Фрай]"
	dialog "Вот это праздник!"
	Talk2me "Фрай#2021hw" "Фрай: Вот это праздник!"
	wait
	dialog "[Хорро]"
	dialog "Это жутко!"
	wait
	dialog "[Боб]"
	dialog "Это страшно!"
	wait
	dialog "[Хорро]"
	dialog "Я страшный?"
	wait
	dialog "[Фрай]"
	dialog "Сейчас украсим!"
    close
    return
endif
return


npc "niflheim" "Фрай#2021hw" 4_LUDE 180 242 3 0 0
OnClick:
var q11498 = isbegin_quest 11498
var q11501 = checkquest_hunting 11501
if (v[VAR_CLEVEL] < 20)
	dialog "[Фрай]"
    dialog "Джек вернулся, а Джек нет!"
    close
    return
endif

if (v[halloebs01] < 2)
    dialog "[Хорро]"
	dialog "Джек!"
	Talk2me "Хорро#2021hw" "Хорро: Джек!"
	wait
	dialog "[Хорро]"
	dialog "Джек, просыпайся!"
	Talk2me "Хорро#2021hw" "Хорро: Джек, просыпайся!"
	wait
	dialog "[Фрай]"
	dialog "Здесь фестиваль, Джек!"
	wait
	dialog "[Боб]"
	dialog "Уже темно!"
	wait
	dialog "[Фрай]"
	dialog "Проснись, Джек! Фестиваль скоро начнется!"
	wait
	dialog "[Хорро]"
	dialog "Но... Разве это важно?"
	wait
	dialog "[Боб]"
	dialog "Джек еще не вернулся."
	wait
	dialog "[Фрай]"
	dialog "Верно."
	wait
	dialog "[Хорро]"
	dialog "Джек вернулся, а Джек нет!"
	wait
	dialog "[Боб]"
	dialog "И Джек тоже!"
	wait
	dialog "[Фрай]"
	dialog "А как же Джек?"
	wait
	dialog "[Боб]"
	dialog "Джек на площади!"
	wait
	dialog "[Хорро]"
	dialog "Так что насчет Джека?"
	wait
	dialog "[Боб]"
	dialog "Куда подевался Джек?"
	wait
	dialog "[Фрай]"
	dialog "Спросите ^ff0000Джека^000000!"
	wait
	dialog "[Хорро]"
	dialog "Давайте спросим!"
	wait
	dialog "[Фрай]"
	dialog "Джек точно знает!"
	wait
	dialog "[Хорро]"
	dialog "Я знаю!"
	setitem halloebs01 2
	if (q11498 > 0)
	completequest 11498
	endif
	setquest 11499
	close
	return
endif

if (v[halloebs01] == 2)
	dialog "[Хорро]"
    dialog "Так что насчет Джека?"
    wait
    dialog "[Боб]"
    dialog "Куда подевался Джек?"
    wait
    dialog "[Фрай]"
    dialog "Спросите ^ff0000Джека^000000!"
    wait
	dialog "[Хорро]"
	dialog "Давайте спросим!"
	wait
	dialog "[Фрай]"
	dialog "Джек точно знает!"
	wait
	dialog "[Хорро]"
	dialog "Я знаю!"
    close
    return
endif

if (v[halloebs01] == 3)
	dialog "[Фрай]"
    dialog "Хи-хи-хи-хи!"
    wait
    dialog "[Хорро]"
    dialog "Ужасно!"
    wait
    dialog "[Фрай]"
    dialog "Джек позеленел!"
    wait
    dialog "[Хорро]"
    dialog "Он должно быть живой!"
    wait
    dialog "[Боб]"
    dialog "Ясно."
    wait
    dialog "[Фрай]"
    dialog "Оно живое!"
    wait
    dialog "[Боб]"
    dialog "Джек!"
    wait
    dialog "[Фрай]"
    dialog "Если вы не принесете Джека, у вас будут проблемы!"
    wait
    dialog "[Боб]"
    dialog "Нужно оживить Джека!"
    wait
    dialog "[Фрай]"
    dialog "Джека!"
    wait
    dialog "[Хорро]"
	dialog "Принеси нам Джека!"
    wait
    dialog "[Боб]"
	dialog "Джек должен принести Джека!"
    wait
    dialog "[Фрай]"
	dialog "Ты ведь Джек?"
    wait
    dialog "[Хорро]"
	dialog "Это не похоже на Джека."
    wait
    dialog "[Хорро]"
	dialog "Принеси мне 10 ^ff0000Светильников Джека^000000!"
	wait
	dialog "[Боб]"
	dialog "Еще нам нужно 20 ^ff0000Сухих белых веток^000000. Они послужат Джеку... конечностями! Аха-ха-ха-ха!"
    wait
    dialog "[Фрай]"
    dialog "А если вы будете ждать слишком долго, Джек может... прорасти."
	wait
    dialog "[Фрай]"
    dialog "Брось!"
    wait
    dialog "[Хорро]"
    dialog "Не опаздывай!"
    wait
    dialog "[Боб]"
    dialog "А ничего такой, даже страшный немного Джек."
    wait
    dialog "[Фрай]"
    dialog "Да он не Джек!"
    setitem halloebs01 4
    completequest 11500
    setquest 11501
    close
    return
endif

if (v[halloebs01] == 4)
	if (q11501] > 1)
		if ((v[Pumpkin_Decor] > 9) & (v[White_Thin_Stem] > 19))
			dialog "[Боб]"
			dialog "Ура! Джек!"
			wait
			dialog "[Хорро]"
			dialog "Давайте все украсим Джека!"
			Talk2me "Хорро#2021hw" "Хорро: Давайте все украсим Джека!"
			wait
			dialog "[Фрай]"
			dialog "Красить Джека?"
			Talk2me "Фрай#2021hw" "Фрай: Красить Джека?"
			wait
			dialog "[Боб]"
			dialog "Я первый!"
			Talk2me "Боб#2021hw" "Боб: Я первый!"
			wait
			dialog "[Фрай]"
			dialog "Вот это праздник!"
			Talk2me "Фрай#2021hw" "Фрай: Вот это праздник!"
			wait
			dialog "[Хорро]"
			dialog "Это жутко!"
			wait
			dialog "[Боб]"
			dialog "Это страшно!"
			wait
			dialog "[Хорро]"
			dialog "Я страшный?"
			wait
			dialog "[Фрай]"
			dialog "Сейчас украсим!"
			close
			return
		else
            dialog "[Хорро]"
			dialog "Джек! Принеси мне Джека!"
            wait
            dialog "[Фрай]"
            dialog "Если вы будете ждать слишком долго, Джек может... прорасти."
            wait
            dialog "[Боб]"
			dialog "Это же ужасно!"
            wait
            dialog "[Хорро]"
            dialog "Зелёные ростки!"
            wait
            dialog "[Фрай]"
            dialog "Зато свежие."
            wait
            dialog "[Хорро]"
            dialog "Принеси мне 10 ^ff0000Светильников Джека^000000!"
            wait
            dialog "[Боб]"
            dialog "Еще нам нужно 20 ^ff0000Сухих белых веток^000000. Они послужат Джеку... конечностями! Аха-ха-ха-ха!"
            close
            return
		endif
	else
		dialog "[Хорро]"
		dialog "Джек! Принеси мне Джека!"
		wait
		dialog "[Фрай]"
		dialog "Если вы будете ждать слишком долго, Джек может... прорасти."
		wait
		dialog "[Боб]"
		dialog "Это же ужасно!"
		wait
		dialog "[Хорро]"
		dialog "Зелёные ростки!"
		wait
		dialog "[Фрай]"
		dialog "Зато свежие."
		wait
		dialog "[Хорро]"
		dialog "Принеси мне 10 ^ff0000Светильников Джека^000000!"
		wait
		dialog "[Боб]"
		dialog "Еще нам нужно 20 ^ff0000Сухих белых веток^000000. Они послужат Джеку... конечностями! Аха-ха-ха-ха!"
        close
        return
	endif
else
	dialog "[Фрай]"
    dialog "Весь этот ужасно страшный праздник благодаря Джеку!"
    wait
    dialog "[Боб]"
    dialog "Это фестиваль же!"
    wait
    dialog "[Хорро]"
    dialog "Да уж... Полный Джек!"
    close
    return
endif
return


npc "niflheim" "Боб#2021hw" 4_LUDE 179 240 3 0 0
OnClick:
var q11498 = isbegin_quest 11498
var q11501 = checkquest_hunting 11501
if (v[VAR_CLEVEL] < 20)
	dialog "[Боб]"
    dialog "Ты где?"
    close
    return
endif

if (v[halloebs01] < 2)
    dialog "[Хорро]"
	dialog "Джек!"
	Talk2me "Хорро#2021hw" "Хорро: Джек!"
	wait
	dialog "[Хорро]"
	dialog "Джек, просыпайся!"
	Talk2me "Хорро#2021hw" "Хорро: Джек, просыпайся!"
	wait
	dialog "[Фрай]"
	dialog "Здесь фестиваль, Джек!"
	wait
	dialog "[Боб]"
	dialog "Уже темно!"
	wait
	dialog "[Фрай]"
	dialog "Проснись, Джек! Фестиваль скоро начнется!"
	wait
	dialog "[Хорро]"
	dialog "Но... Разве это важно?"
	wait
	dialog "[Боб]"
	dialog "Джек еще не вернулся."
	wait
	dialog "[Фрай]"
	dialog "Верно."
	wait
	dialog "[Хорро]"
	dialog "Джек вернулся, а Джек нет!"
	wait
	dialog "[Боб]"
	dialog "И Джек тоже!"
	wait
	dialog "[Фрай]"
	dialog "А как же Джек?"
	wait
	dialog "[Боб]"
	dialog "Джек на площади!"
	wait
	dialog "[Хорро]"
	dialog "Так что насчет Джека?"
	wait
	dialog "[Боб]"
	dialog "Куда подевался Джек?"
	wait
	dialog "[Фрай]"
	dialog "Спросите ^ff0000Джека^000000!"
	wait
	dialog "[Хорро]"
	dialog "Давайте спросим!"
	wait
	dialog "[Фрай]"
	dialog "Джек точно знает!"
	wait
	dialog "[Хорро]"
	dialog "Я знаю!"
	setitem halloebs01 2
	if (q11498 > 0)
	completequest 11498
	endif
	setquest 11499
	close
	return
endif

if (v[halloebs01] == 2)
    dialog "[Боб]"
    dialog "Джек на площади!"
    wait
	dialog "[Хорро]"
    dialog "Так что насчет Джека?"
    wait
    dialog "[Боб]"
    dialog "Куда подевался Джек?"
    wait
    dialog "[Фрай]"
    dialog "Спросите Джека на площади!"
    wait
    dialog "[Хорро]"
    dialog "Давайте спросим!"
    wait
    dialog "[Боб]"
    dialog "Зачем нам?"
    wait
    dialog "[Фрай]"
    dialog "Ты иди!"
    wait
    dialog "[Хорро]"
    dialog "Я знаю!"
    close
    return
endif

if (v[halloebs01] == 3)
    dialog "[Боб]"
    dialog "Фрай хочет услышать Джека!"
    wait
    dialog "[Хорро]"
    dialog "Джек!"
    wait
    dialog "[Фрай]"
    dialog "Я хочу это услышать!"
    wait
    dialog "[Боб]"
    dialog "Джека то нет."
    close
    return
endif

if (v[halloebs01] == 4)
	if (q11501] > 1)
		if ((v[Pumpkin_Decor] > 9) & (v[White_Thin_Stem] > 19))
            dialog "[Боб]"
            dialog "Ура! Джек!"
            wait
            dialog "[Хорро]"
            dialog "Давайте все украсим Джека!"
            Talk2me "Хорро#2021hw" "Хорро: Давайте все украсим Джека!"
            wait
            dialog "[Фрай]"
            dialog "Красить Джека?"
            Talk2me "Фрай#2021hw" "Фрай: Красить Джека?"
            wait
            dialog "[Боб]"
            dialog "Я первый!"
            Talk2me "Боб#2021hw" "Боб: Я первый!"
            wait
            dialog "[Фрай]"
            dialog "Вот это праздник!"
            Talk2me "Фрай#2021hw" "Фрай: Вот это праздник!"
            close
            return
		else
            dialog "[Хорро]"
			dialog "Джек! Принеси мне Джека!"
            wait
            dialog "[Фрай]"
            dialog "Если вы будете ждать слишком долго, Джек может... прорасти."
            wait
            dialog "[Боб]"
			dialog "Это же ужасно!"
            wait
            dialog "[Хорро]"
            dialog "Зелёные ростки!"
            wait
            dialog "[Фрай]"
            dialog "Зато свежие."
            wait
            dialog "[Хорро]"
            dialog "Принеси мне 10 ^ff0000Светильников Джека^000000!"
            wait
            dialog "[Боб]"
            dialog "Еще нам нужно 20 ^ff0000Сухих белых веток^000000. Они послужат Джеку... конечностями! Аха-ха-ха-ха!"
            close
            return
		endif
	else
		dialog "[Хорро]"
		dialog "Джек! Принеси мне Джека!"
		wait
		dialog "[Фрай]"
		dialog "Если вы будете ждать слишком долго, Джек может... прорасти."
		wait
		dialog "[Боб]"
		dialog "Это же ужасно!"
		wait
		dialog "[Хорро]"
		dialog "Зелёные ростки!"
		wait
		dialog "[Фрай]"
		dialog "Зато свежие."
		wait
		dialog "[Хорро]"
		dialog "Принеси мне 10 ^ff0000Светильников Джека^000000!"
		wait
		dialog "[Боб]"
		dialog "Еще нам нужно 20 ^ff0000Сухих белых веток^000000. Они послужат Джеку... конечностями! Аха-ха-ха-ха!"
		close
		return
	endif
else
    dialog "[Боб]"
    dialog "Вот это ужас "
    wait
    dialog "[Хорро]"
    dialog "Полный Джек!"
    close
    return
endif
return


npc "niflheim" "Джек#2021hw_j1" 4_JACK_HEAD 184 199 3 0 0
OnClick:
dialog "[Джек]"
dialog "Я не знаю, где Джек... Не знаю!"
close
return


npc "niflheim" "Джек#2021hw_j2" 4_JACK_HEAD 187 190 5 0 0
OnClick:
var q11446 = isbegin_quest 11446
var q11447 = isbegin_quest 11447
var q11448 = isbegin_quest 11448
var q11449 = isbegin_quest 11449
var q11450 = isbegin_quest 11450
var q11451 = isbegin_quest 11451
var q11484 = isbegin_quest 11484
var q11485 = isbegin_quest 11485
var q11486 = isbegin_quest 11486
var q11487 = isbegin_quest 11487
var q11488 = isbegin_quest 11488
var q11489 = isbegin_quest 11489
var q11490 = isbegin_quest 11490
var q11491 = isbegin_quest 11491
var q11492 = isbegin_quest 11492
var q11493 = isbegin_quest 11493
var q11494 = isbegin_quest 11494
	if (q11446 > 0)
    erasequest 11446
    endif
    if (q11447 > 0)
    erasequest 11447
    endif
    if (q11448 > 0)
    erasequest 11448
    endif
    if (q11449 > 0)
    erasequest 11449
    endif
    if (q11450 > 0)
    erasequest 11450
    endif
    if (q11451 > 0)
    erasequest 11451
    endif
    if (q11484 > 0)
    erasequest 11484
    endif
    if (q11485 > 0)
    erasequest 11485
    endif
    if (q11486 > 0)
    erasequest 11486
    endif
    if (q11487 > 0)
    erasequest 11487
    endif
    if (q11488 > 0)
    erasequest 11488
    endif
    if (q11489 > 0)
    erasequest 11489
    endif
    if (q11490 > 0)
    erasequest 11490
    endif
    if (q11491 > 0)
    erasequest 11491
    endif
    if (q11492 > 0)
    erasequest 11492
    endif
    if (q11493 > 0)
    erasequest 11493
    endif
    if (q11494 > 0)
    erasequest 11494
    endif

if (v[halloebs01] == 2)
    dialog "[Джек]"
	dialog "Почему? Почему все пытаются меня найти?"
    wait
    dialog "[Джек]"
	dialog "Даже ты пытаешься! Все вокруг!"
    wait
    dialog "[Джек]"
    dialog "Кажется, мне придётся вернуться... А то как же они там без меня!"
    setitem halloebs01 3
    completequest 11499
    setquest 11500
    close
    return
else
	dialog "[Джек]"
    dialog "Кажется, мне придётся вернуться... А то как же они там без меня!"
    close
    return
endif
return


npc "niflheim" "Джек#2021hw_j3" 4_JACK_HEAD 196 183 3 0 0
OnClick:
dialog "[Джек]"
dialog "Хе-хе-хе-хе! Пора спать..."
wait
dialog "[Джек]"
dialog "Джек ждет тебя... Надо подправить прическу..."
close
return


npc "niflheim" "Джек#2021hw_j4" 4_JACK_HEAD 203 181 5 0 0
OnClick:
dialog "[Джек]"
dialog "Смотри вон туда, видишь призрака? Красивый он, верно?.."
wait
dialog "[Джек]"
dialog "Как это не красивый? Ничего ты не понимаешь... Джек?"
close
return


npc "niflheim" "Джек#2021hw_j5" 4_JACK_HEAD 202 194 7 0 0
OnClick:
dialog "[Джек]"
dialog "Ты можешь ему помочь?"
wait
dialog "[Джек]"
dialog "Кажется, Джека слишком долго держали в воде, и у него проросли корни!"
close
return


npc "niflheim" "Джек#2021hw_j6" 4_JACK_HEAD 184 202 3 0 0
OnClick:
Talk2me "Джек#2021hw_j6" "Джек: О, привет!"
Talk2me "Джек#2021hw_j1" "Джек: Привет!"
Talk2me "Джек#2021hw_j3" "Джек: Эй!"
Talk2me "Джек#2021hw_j8" "Джек: Кто там?"
Talk2me "Джек#2021hw_j12" "Джек: Привет!"
return


npc "niflheim" "Джек#2021hw_j7" 4_JACK_HEAD 185 198 5 0 0
OnClick:
Talk2me "Джек#2021hw_j7" "Джек: Страх и ужас!"
Talk2me "Джек#2021hw_j2" "Джек: Веселье и радость!"
Talk2me "Джек#2021hw_j6" "Джек: Сладости и гадости!"
Talk2me "Джек#2021hw_j9" "Джек: Пустые головы!"
Talk2me "Джек#2021hw_j11" "Джек: Что?"
return


npc "niflheim" "Джек#2021hw_j8" 4_JACK_HEAD 197 193 3 0 0
OnClick:
Talk2me "Джек#2021hw_j8" "Джек: Конфеты есть?"
Talk2me "Джек#2021hw_j4" "Джек: Я ведь найду!"
Talk2me "Джек#2021hw_j7" "Джек: Ммм... печенье..."
Talk2me "Джек#2021hw_j5" "Джек: Где?"
Talk2me "Джек#2021hw_j10" "Джек: Джек!"
return


npc "niflheim" "Джек#2021hw_j9" 4_JACK_HEAD 194 193 5 0 0
OnClick:
Talk2me "Джек#2021hw_j9" "Джек: Привет!"
Talk2me "Джек#2021hw_j5" "Джек: Hi!"
Talk2me "Джек#2021hw_j2" "Джек: Hola!"
Talk2me "Джек#2021hw_j13" "Джек: Aloha!"
Talk2me "Джек#2021hw_j4" "Джек: Гамарджоба!"
return


npc "niflheim" "Джек#2021hw_j10" 4_JACK_HEAD 208 197 7 0 0
OnClick:
Talk2me "Джек#2021hw_j10" "Джек: Фестиваль страха!"
Talk2me "Джек#2021hw_j3" "Джек: Как страшно!"
Talk2me "Джек#2021hw_j9" "Джек: А мне нет?"
Talk2me "Джек#2021hw_j1" "Джек: У-у-у-у-у-у!"
Talk2me "Джек#2021hw_j6" "Джек: Я не боюсь тебя!"
return


npc "niflheim" "Джек#2021hw_j11" 4_JACK_HEAD 189 178 3 0 0
OnClick:
Talk2me "Джек#2021hw_j11" "Джек: Присядь с нами!"
Talk2me "Джек#2021hw_j7" "Джек: Мы не страшные, ведь так?!"
Talk2me "Джек#2021hw_j5" "Джек: У нас есть сладости!"
Talk2me "Джек#2021hw_j3" "Джек: Давай!"
Talk2me "Джек#2021hw_j8" "Джек: Давай!"
return


npc "niflheim" "Джек#2021hw_j12" 4_JACK_HEAD 203 191 1 0 0
OnClick:
Talk2me "Джек#2021hw_j12" "Джек: Танцуй пока можешь!"
Talk2me "Джек#2021hw_j1" "Джек: Пока не уйдем!"
Talk2me "Джек#2021hw_j4" "Джек: Пой и танцуй!"
Talk2me "Джек#2021hw_j11" "Джек: Да, вот так!"
Talk2me "Джек#2021hw_j10" "Джек: Неплохо!"
return


npc "niflheim" "Джек#2021hw_j13" 4_JACK_HEAD 183 184 1 0 0
OnClick:
Talk2me "Джек#2021hw_j1" "Джек: Привет!"
Talk2me "Джек#2021hw_j2" "Джек: Привет!"
Talk2me "Джек#2021hw_j3" "Джек: Привет!"
Talk2me "Джек#2021hw_j4" "Джек: Привет!"
Talk2me "Джек#2021hw_j5" "Джек: Привет!"
Talk2me "Джек#2021hw_j6" "Джек: Привет!"
Talk2me "Джек#2021hw_j7" "Джек: Привет!"
Talk2me "Джек#2021hw_j8" "Джек: Привет!"
Talk2me "Джек#2021hw_j9" "Джек: Привет!"
Talk2me "Джек#2021hw_j10" "Джек: Привет!"
Talk2me "Джек#2021hw_j11" "Джек: Привет!"
Talk2me "Джек#2021hw_j12" "Джек: Привет!"
return

npc "niflheim" "Джек#2021hw" 4_JACK_HEAD 172 244 3 0 0
OnInit:
    AddQuestInfo 11504 1 0
    SetQuestItem 11504 3918 4 "<"
return

OnClick:
if (v[halloebs01] < 5)
	dialog "[Джек]"
	dialog "Хе-хе... Хе-хе-хе..."
    close
    return	
endif

if (v[halloebs02] < 1)
	dialog "[Джек]"
	dialog "Хе-хе... Хе-хе-хе..."
    wait
  choose menu "Почему ты улыбаешься?"
    case 1
    break
    endchoose
    dialog "[Джек]"
	dialog "Я не улыбаюсь! Я плачу!"
    wait
	choose menu "Слушать дальше "
    case 1
    break
    endchoose
    dialog "[Джек]"
    dialog "Я не плачу, я плачу!"
    wait
  choose menu "Слушать дальше "
    case 1
    break
    endchoose
    dialog "[Джек]"
	dialog "Аааааааа! Что ты меня достаешь?"
    wait
    dialog "[Джек]"
	dialog "Давай, давай иди куда-нибудь! Или нет! Стой!"
    wait
    dialog "[Джек]"
	dialog "ААААААА! Моя рука! Где она?!"
    wait
  choose menu "Спросить, что можно сделать " "Уйти "
    case 1
    	dialog "[Джек]"
		dialog "Как что? Найти руку!"
        wait
        dialog "[Джек]"
		dialog "Это конец! Я умираю... Аааа..."
        wait
        dialog "[Джек]"
        dialog "Принеси руку... Мне нужна рука..."
        wait
        dialog "[Джек]"
		dialog "Вообще-то и ^ff0000Сухая белая ветка^000000 подойдёт."
        setitem halloebs02 1
        setquest 11504
        close
        return
    break
    case 2
    	dialog "[Джек]"
		dialog "Ты не видел мою руку?!"
    	close
    	return
    break
    endchoose
endif


if (v[halloebs02] == 1)
	if (v[White_Thin_Stem] > 0)
		dialog "[Джек]"
		dialog "Вот это да! Давай её сюда!"
        wait
    choose menu "Отдать ветку..."
        case 1
        break
        endchoose
        dialog "[Герон]"
        dialog "Нет!"
        wait
        dialog "[Лунатик]"
        dialog "Нет!"
        wait
        dialog "[Герон]"
        dialog "Бежим!!!"
        wait
        dialog "[Герон]"
        dialog "Не давайте ему ветку!"
        wait
        dialog "[Лунатик]"
        dialog "Уходим!"
        wait
        dialog "[Герон]"
		dialog "Скорее бежим отсюда!"
        wait
        dialog "[Джек]"
		dialog "Не слушай их!"
        wait
        dialog "[Лунатик]"
		dialog "Не отдавай! Нет!"
        wait
        dialog "[Герон]"
        dialog "Ты не знаешь, что будет!"
        wait
        dialog "[Джек]"
        dialog "Дай сюда!"
        wait
        dialog "[Лунатик]"
        dialog "Лучше не надо!"
        wait
        dialog "[Герон]"
        dialog "Джек..."
        wait
        dialog "[Герон]"
        dialog "С одной всё-равно не убежишь!"
        wait
        dialog "[Лунатик]"
        dialog "Джек не надо!"
        wait
        dialog "[Герон]"
		dialog "У него здесь только одна!"
        wait
    choose menu "Отдать ветку "
        case 1
        break
        endchoose
        if (v[White_Thin_Stem] > 0)
        	dialog "[Джек]"
			dialog "Уф! Думаю, поживу немного... Не слушай их! Потому что это деревня мертвых! Но спасибо! Благодаря тебе я даже могу ходить!"
            dropitem White_Thin_Stem 1
            setitem halloebs02 2
            completequest 11504
            setquest 11505
            wait
            dialog "[Джек]"
			dialog "Спасибо! Но это не всё! Из-за Джека убежал мой кот!"
            wait
            dialog "[Джек]"
            dialog "Думаю, я был так поражен, что у меня он из рук выскользнул!"
            wait
            dialog "[Джек]"
			dialog "Нужно найти моего кота! Если не поторопиться, он потеряется!"
            wait
      choose menu "Я найду кота " "Постой, кота?"
            case 1
            	dialog "[Джек]"
				dialog "Благодарю вас! Думаю, ^ff0000Лунатик^000000 может знать, куда делся мой Скари. Он ничего не забывает."
                close
                return
            break
            case 2
            	dialog "[Джек]"
            	dialog "Кота! Мою Скари!"
                wait
                dialog "[Герон]"
                dialog "Джек виноват!"
                wait
                dialog "[Лунатик]"
                dialog "Он напугал!"
                wait
		choose menu "Я найду кота "
                case 1
                break
                endchoose
                dialog "[Джек]"
				dialog "Благодарю вас! Думаю, ^ff0000Лунатик^000000 может знать, куда делся мой Скари. Он ничего не забывает."
                close
                return
            break
            endchoose
        else
        	dialog "[Джек]"
        	dialog "Где ветка?"
        	wait
            dialog "[Герон]"
            dialog "Постой!"
            wait
            dialog "[Герон]"
            dialog "Не надо!"
            wait
            dialog "[Джек]"
            dialog "Всего одну ^ff0000Сухую белую ветку^000000."
        	close
        	return
        endif
	else
		dialog "[Джек]"
        dialog "Ох... Пожалуйста, спаси меня... Всего одну ^ff0000Сухую белую ветку^000000."
        close
        return
	endif
endif

if (v[halloebs02] == 2)
	dialog "[Джек]"
	dialog "Благодарю вас! ^ff0000Лунатик^000000 может знать, куда делся Скари."
    close
    return
endif

if (v[halloebs02] == 3)
	dialog "[Джек]"
	dialog "Тогда ^ff0000Ламия^000000 может знать, он у западного входа в Нифльхейм!"
	close
	return
endif

if (v[halloebs02] == 4)
	dialog "[Джек]"
	dialog "Вы слышали о Ламии? Что Ламия сказала?"
	close
	return
endif

if (v[halloebs02] == 5)
	dialog "[Джек]"
	dialog "Что же?! Скари один в таком опасном месте! Поторопись и найди его!"
    wait
    dialog "[Джек]"
	dialog "Он ведь не мог пойти в тот страшный лес? Скари, кажется, любил рыбу, которую он доставал в странной деревне."
    wait
    dialog "[Джек]"
    dialog "Когда я... Отправился в этот мир, я прошел длинной сияющей дорогой, где вблизи на очень высоком дереве появился маленький смуглый человек."
    wait
    dialog "[Джек]"
    dialog "Эх... Если бы я вспомнил путь, по которому шёл со мной Скари, мы бы быстро его нашли."
    setitem halloebs02 6
    completequest 11508
    setquest 11509
    close
    return
endif

if (v[halloebs02] == 6)
	dialog "[Джек]"
    dialog "Когда я... Отправился в этот мир, я прошел длинной сияющей дорогой, где вблизи на очень высоком дереве появился маленький смуглый человек."
    wait
    dialog "[Джек]"
    dialog "Думаю, если Скари ждёт меня где-то, то точно там!"
    close
    return
endif

if ((v[halloebs02] > 6) & (v[halloebs02] < 11))
	dialog "[Джек]"
	dialog "Джек! Ты уже здесь? Ты нашел Скари? Оу... Еще нет?"
	wait
	dialog "[Джек]"
	dialog "Где Скари? Хотел бы я вернуться назад..."
	wait
	dialog "[Джек]"
	dialog "Я очень за него беспокоюсь..."
	close
	return
endif

if (v[halloebs02] == 11)

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "У вас слишком много вещей. Освободите свой инвентарь и попробуйте еще раз."
        close
        return
    else
    endif

	dialog "[Джек]"
	dialog "Джек! Ты вернулся! Ты нашёл моего кота?"
    wait
  choose menu "Отдать кости "
    case 1
    break
    endchoose
    dialog "[Джек]"
    dialog "Скари!!!!!"
    wait
    dialog "[Джек]"
	dialog "Как я мог допустить это!"
    wait
    dialog "[Джек]"
	dialog "АААААААА! Остались только кости!"
    wait
    dialog "[Джек]"
	dialog "...Я рад, что ты нашел Скари... Спасибо, Джек."
    wait
    dialog "[Джек]"
	dialog "Это все моя вина, что он стал таким! Я не могу хорошо заботиться о коте, потому что меня поймали..."
    wait
    dialog "[Джек]"
	dialog "Так что, пожалуйста, Джек! Я доверяю тебе ^ff0000Костёнка Скари^000000, позаботься о нём."
    wait
    dialog "[Джек]"
    dialog "Береги его!"
    if (v[Little_Skel_Bone] > 0)
    	dropitem Little_Skel_Bone 1
    endif
    setitem halloebs02 12
    getitem Red_Chorker_Bell 1
    completequest 11514
    GetPetEgg SCATLETON
    close
    return
endif

if (v[halloebs02] == 12)
	dialog "[Джек]"
    dialog "Постой... Если ты нашёл кости Скари, то он тоже появился здесь, в городе мёртвых!"
    wait
    dialog "[Джек]"
	dialog "Как я раньше не догадался!"
    wait
    dialog "[Джек]"
	dialog "Но как я мог его не найти?.."
    wait
    dialog "[Джек]"
	dialog "Меня ведь оставили без рук и ног!"
    wait
    dialog "[Джек]"
	dialog "Мы найдём Скари!"
    wait
    dialog "[Джек]"
	dialog "Нужно срочно двигаться!.. Тебе, конечно."
    wait
    dialog "[Джек]"
	dialog "Ты ведь поможешь мне отыскать его?"
    wait
    dialog "[Джек]"
	dialog "По приметам - это обычный дворовый кот... Только... Без шерсти... Без кожи... Только кости. Эх, Скари..."
	Talk2me "Джек#2021hw" "Джек: Эх, Скари..."
    setitem halloebs02 13
    setquest 11515
    close
    return
endif

if (v[halloebs02] == 13)
    dialog "[Джек]"
	dialog "Мы найдём Скари!"
    wait
    dialog "[Джек]"
	dialog "Нужно срочно двигаться!.. Тебе, конечно."
    wait
    dialog "[Джек]"
	dialog "Ты ведь поможешь мне отыскать его?"
    wait
    dialog "[Джек]"
	dialog "По приметам - это обычный дворовый кот... Только... Без шерсти... Без кожи..."
    close
    return
endif

if (v[halloebs02] == 14)
	dialog "[Джек]"
	dialog "Значит ты нашёл его!"
    wait
    dialog "[Джек]"
    dialog "Какой он сейчас?"
    wait
    dialog "[Джек]"
    dialog "Он помнит меня?"
    wait
    dialog "[Герон]"
    dialog "Конечно, помнит."
    wait
    dialog "[Лунатик]"
    dialog "Я помню Скари."
    wait
    dialog "[Герон]"
    dialog "Джек, ты что, плачешь?"
    wait
    dialog "[Лунатик]"
    dialog "Джек плакса!"
    wait
    dialog "[Герон]"
	dialog "А это точно кот Джека?"
    wait
    dialog "[Герон]"
	dialog "Вообще-то я видел кое-что неподалёку, думаю тебе стоит на это взглянуть."
    setitem halloebs02 15
    completequest 11516
    setquest 11517
    close
    return
endif

if (v[halloebs02] == 15) | (v[halloebs02] == 16)
	dialog "[Джек]"
    dialog "Какой он сейчас?"
    wait
    dialog "[Джек]"
    dialog "Он помнит меня?"
    wait
    dialog "[Герон]"
    dialog "Конечно, помнит."
    wait
    dialog "[Лунатик]"
    dialog "Я помню Скари."
    wait
    dialog "[Герон]"
    dialog "Джек, ты что, плачешь?"
    wait
    dialog "[Лунатик]"
    dialog "Джек плакса!"
    wait
    dialog "[Герон]"
	dialog "А это точно кот Джека?"
    wait
    dialog "[Герон]"
	dialog "Вообще-то я видел кое-что, думаю тебе стоит на это взглянуть."
    close
    return
endif

if (v[halloebs02] == 17)
	var name = PcName
	dialog "[Джек]"
	dialog "Это мой Скари! Это точно он... Как же я скучал по нему!"
    wait
    dialog "[Джек]"
	dialog "Он помнит меня?"
    wait
    dialog "[Джек]"
	dialog "Не могу поверить, что в этом мире мы снова можем вместе искать приключения!"
	wait
    dialog "[Джек]"
	dialog "Жаль только, что он не смог долго побыть живым..."
	wait
    dialog "["+PcName+"]"
	dialog "Действительно, очень жаль..."
    setitem halloebs02 18
    completequest 11519
    setquest 11520
    close
    return
endif

if (v[halloebs02] == 18)
	dialog "[Джек]"
	dialog "Как же я скучал по Скари!"
    wait
    dialog "[Джек]"
	dialog "Не могу поверить, что в этом мире мы снова можем вместе искать приключения!"
    close
    return
endif

if (v[halloebs02] == 19)
	dialog "[Джек]"
	dialog "Хорошо, что ты снова пришёл."
    wait
    dialog "[Джек]"
	dialog "Думаю, раз уж так случилось, Скари нужно немного порадовать... Хм..."
    wait
    dialog "[Джек]"
	dialog "Поможешь мне немного порадовать малыша?"
    wait
    dialog "[Джек]"
    dialog "Нужно принести 10 ^ff0000Сухих белых веток^000000, сразу к Скари. Он всегда любил обустраивать своё место, поэтому, надеюсь, он будет доволен."
    setitem halloebs02 20
    completequest 11521
    setquest 11522
    close
    return
endif

if (v[halloebs02] == 20)
	dialog "[Джек]"
	dialog "Поможешь мне немного порадовать малыша?"
    wait
    dialog "[Джек]"
    dialog "Нужно принести 10 ^ff0000Сухих белых веток^000000, сразу к Скари. Он всегда любил обустраивать своё место, поэтому, надеюсь, он будет доволен."
    close
    return
endif

if ((v[halloebs02] == 21) | (v[halloebs02] == 22) | (v[halloebs02] == 23))
	dialog "[Джек]"
	dialog "Хе-хе... Уж не думал, что когда-нибудь снова пообщаюсь с Скари."
	close
	return
endif

if (v[halloebs02] == 24)

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "У вас слишком много вещей. Освободите свой инвентарь и попробуйте еще раз."
        close
        return
    else
    endif

	dialog "[Джек]"
	dialog "Как там мой кот?"
    wait
    dialog "[Джек]"
    dialog "Ты собираешься уходить? Почему?"
    wait
    dialog "[Джек]"
	dialog "Джек! Джек! Расскажи почему!"
    wait
    dialog "[Джек]"
	dialog "Почему ты хочешь оставить и меня, и Скари в одиночестве?"
    wait
    dialog "[Джек]"
    dialog "Ты можешь мне всё рассказать!"
    wait
	choose menu "Я не могу сказать... "
	endchoose
    dialog "[Джек]"
	dialog "Я подозревал, что ты не всё мне говоришь... Надеюсь, ты хоть нашёл моего кота..."
    wait
    dialog "[Джек]"
    dialog "С самого начала подозревал..."
    wait
    dialog "[Джек]"
	dialog "А знаешь что? Возьми-ка меня с собой! Я шевелиться не могу особо, поэтому хлопот не доставлю..."
    setitem halloebs02 25
    getitem C_Pumpkin_Cock_Hat 1
    completequest 11526
    close
    return
else

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "У вас слишком много вещей. Освободите свой инвентарь и попробуйте еще раз."
        close
        return
    else
    endif

var q11527 = checkquest_playtime 11527
	if (q11527 == 1)
	    dialog "[Джек]"
		dialog "А? Ты кто? Ты как вылитый я!"
	    close
	    return
	else
	    if ((q11527 == 2) | (q11527 == 3))
	        if (q11527 == 3)
	            recall_completequest 11527
	        endif
	        erasequest 11527
	    endif
	    dialog "[Джек]"
		dialog "О, привет... Как думаешь, Скари сейчас скучает?"
        wait
		dialog "[Джек]"
		dialog "Помню, как я сам делал для него игрушки из шерсти. Скари часами мог играть с ними!"
        wait
		dialog "[Джек]"
		dialog "А, знаешь что? Можно и сейчас сделать ему пару игрушек."
        wait
        dialog "[Джек]"
		dialog "Принеси мне 10 ^ff0000Чёрной шерсти^000000. А я... Отдам всё, что мне довелось найти в городе мертвых!"
        setquest 11528
        wait
		choose menu "Согласиться " "Уйти "
	    case 1
	        if (v[Black_Fur] > 9)
	        	var haha2017 = rand 1 100
				if ((haha2017 > 0) & (haha2017 < 6))
                    dialog "[Джек]"
					dialog "Сделаю ему птичку в этот раз! Вряд ли она полетит, конечно... Хотя в этом городе я ничему не удивлюсь!"
					dropitem Black_Fur 10
                    getitem Yummy_Meat 10
                    getitem Cookies_Bat 10
                    getitem Memory_Of_Gyol 1
                    erasequest 11528
                    setquest 11527
                    wait
                    dialog "[Джек]"
					dialog "На день этой игрушки точно хватит, спасибо."
                    close
                    return
                elseif ((haha2017 > 5) & (haha2017 < 11))
                    dialog "[Джек]"
					dialog "Сделаю ему мышь в этот раз! Так, а вот здесь будет хвост..."
					dropitem Black_Fur 10
                    getitem Yummy_Meat 10
                    getitem Cookies_Bat 10
                    getitem Dark_Mane 1
                    erasequest 11528
                    setquest 11527
                    wait
                    dialog "[Джек]"
					dialog "На день этой игрушки точно хватит, спасибо."
                    close
                    return
                elseif ((haha2017 > 10) & (haha2017 < 21))
                    dialog "[Джек]"
					dialog "Сделаю ему змею в этот раз! Ох... Сколько змей у нас в доме было за ящиками и под столом..."
					dropitem Black_Fur 10
                    getitem Yummy_Meat 10
                    getitem Cookies_Bat 10
                    getitem C_Jjakk 1
                    erasequest 11528
                    setquest 11527
                    wait
                    dialog "[Джек]"
					dialog "На день этой игрушки точно хватит, спасибо."
                    close
                    return
                else
                	dialog "[Джек]"
					dialog "Сделаю ему птичку в этот раз! Вряд ли она полетит, конечно... Хотя в этом городе я ничему не удивлюсь!"
                    dropitem Black_Fur 10
                    getitem Yummy_Meat 10
                    getitem Cookies_Bat 10
                    erasequest 11528
                    setquest 11527
                    wait
                    dialog "[Джек]"
					dialog "На день этой игрушки точно хватит, спасибо."
                    close
                    return
                endif
	        else
	            dialog "[Джек]"
				dialog "Спасибо, Джек... Вот список монстров, шерсть которых подойдёт для создания игрушки."
                close
                return
	        endif
	    break
	    case 2
	    	dialog "[Джек]"
        	dialog "Если всё-таки захочешь помочь мне порадовать Скари, приходи снова!"
        	close
	        return
	    break
	    endchoose
	endif
endif



npc "niflheim" "Джек#2021hw" 4_LUDE 167 242 3 0 0
OnClick:
if (v[halloebs02] < 2)
	dialog "[Джек]"
	dialog "Город, что шепчет..."
	close
	return
endif


npc "niflheim" "Герон#2021hw" 4_LUDE 166 241 3 0 0
OnClick:
if (v[halloebs02] < 2)
	dialog "[Герон]"
	dialog "Стоит ли оборачиваться? Вдруг там... Твоя тень..."
	close
	return
endif


npc "niflheim" "Лунатик#2021hw" 4_LUDE 169 240 5 0 0
OnClick:
if (v[halloebs02] < 2)
	dialog "[Лунатик]"
	dialog "Джек! Это Джек! А... Кажется, это лишь Джек..."
	close
	return
endif

if (v[halloebs02] == 2)
	dialog "[Лунатик]"
	dialog "Джек, это ты?"
    wait
    dialog "[Герон]"
    dialog "Джек!"
    wait
    dialog "[Герон]"
    dialog "Что ты здесь делаешь?"
    wait
    dialog "[Герон]"
    dialog "А выглядит ничего."
    wait
    dialog "[Лунатик]"
    dialog "Хотя я бы добавил белизны."
    wait
    dialog "[Герон]"
    dialog "Вы видели! Вон там!"
    wait
    dialog "[Лунатик]"
    dialog "Там кто-то был в воздухе!"
    wait
    dialog "[Герон]"
	dialog "Кажется, я видел кота!"
    wait
    dialog "[Лунатик]"
	dialog "И красный поводок!"
    wait
    dialog "[Герон]"
    dialog "Кот с поводком? Значит это собака!"
    wait
    dialog "[Лунатик]"
    dialog "Нет, это кот. И это не поводок, а ошейник!"
    wait
    dialog "[Лунатик]"
    dialog "Смотрите, он полетел к ^ff0000Ламии у входа в Нифльхейм^000000!"
    wait
    dialog "[Герон]"
    dialog "Ламия это видела?"
    wait
    dialog "[Герон]"
    dialog "Что там случилось?"
    wait
    dialog "[Лунатик]"
    dialog "Надо спросить у Ламии!"
    wait
    dialog "[Герон]"
    dialog "Давай спросим!"
    wait
    dialog "[Герон]"
    dialog "Ламия знает!"
    setitem halloebs02 3
    completequest 11505
    setquest 11506
    close
    return
endif

if (v[halloebs02] == 3)
	dialog "[Лунатик]"
	dialog "Джек, это ты?"
    wait
    dialog "[Герон]"
    dialog "Джек!"
    wait
    dialog "[Герон]"
    dialog "Что ты здесь делаешь?"
    wait
    dialog "[Герон]"
    dialog "А выглядит ничего."
    wait
    dialog "[Лунатик]"
    dialog "Хотя я бы добавил белизны."
    close
    return
else
	dialog "[Лунатик]"
	dialog "Джек, это ты?"
    wait
    dialog "[Герон]"
    dialog "Джек!"
    wait
    dialog "[Герон]"
    dialog "Что ты здесь делаешь?"
    wait
    dialog "[Герон]"
    dialog "А выглядит ничего."
    wait
    dialog "[Лунатик]"
    dialog "Хотя я бы добавил белизны."
    close
    return
endif
return


npc "niflheim" "Ламия#2021hw" 4_F_NFDEADMGCIAN 43 147 3 0 0
OnClick:
if (v[halloebs02] < 3)
	dialog "[Ламия]"
	dialog "В Мидгарде у всех есть один недостаток... Это кровь и плоть."
	close
	return
endif

if (v[halloebs02] == 3)
	dialog "[Ламия]"
	dialog "Что это было? Я хоть и видела уже достаточно в этом, городе, но что это..."
    wait
    dialog "[Ламия]"
    dialog "Кажется, я видела кошку! Не знаю, она была была или нет, но она была белая, маленькая и очень пугливая!"
    wait
    dialog "[Ламия]"
	dialog "Пролетела она с невероятной скоростью!"
    wait
    dialog "[Ламия]"
    dialog "Но я видел только последние несколько секунд, когда это что-то мелькнуло передо мной. Спросите лучше у Исследователя по ту сторону холма."
    wait
    dialog "[Ламия]"
	dialog "Надеюсь, он до сих пор там стоит. В любом случае я туда пойти не могу... Ведь жители этой земли всё-таки не могут её покинуть..."
	wait
    dialog "[Ламия]"
	dialog "Но перед этим, можешь поспрашивать здешних Джеков, они тоже иногда могут быть полезны."
    setitem halloebs02 4
    completequest 11506
    setquest 11507
    close
    return
endif

if (v[halloebs02] == 4)
    dialog "[Ламия]"
    dialog "Но я видел только последние несколько секунд, когда это что-то мелькнуло передо мной. Спросите лучше у Исследователя по ту сторону холма."
    wait
    dialog "[Ламия]"
	dialog "Надеюсь, он до сих пор там стоит. В любом случае я туда пойти не могу... Ведь жители этой земли всё-таки не могут её покинуть..."
    close
    return
else
	dialog "[Ламия]"
	dialog "В Мидгарде у всех есть один недостаток... Это кровь и плоть."
	close
	return
endif
return

npc "nif_fild02" "Кричащий Джек#2021hw_ex" 4_JACK 366 247 5 0 0
OnClick:
if (v[halloebs02] < 4)
	dialog "[Кричащий Джек]"
	dialog "Ааааааааааааа! Вы видели? Там ходит Лунатик!"
	Talk2me "Кричащий Джек#2021hw_ex" "Кричащий Джек: Ааааааааааааа! Вы видели? Там ходит Лунатик!"
	close
	return
endif

if (v[halloebs02] == 4)
	dialog "[Кричащий Джек]"
	dialog "Аааааааааааа! Вы видели? Недавно там что-то пролетело! "
    wait
    dialog "[Кричащий Джек]"
	dialog "Я слишком боюсь, чтобы сходить и посмотреть! Надо сказать об этом Джеку! Джек!"
    wait
    dialog "[Кричащий Джек]"
    dialog "Не смотри на меня так! Я не обязан ничего тебе говорить! Хочешь еще что-то узнать - спроси у ^ff0000Лунатика^000000..."
    setitem halloebs02 5
    completequest 11507
    setquest 11508
    close
    return
endif

if (v[halloebs02] == 5)
    dialog "[Кричащий Джек]"
	dialog "Я слишком боюсь, чтобы сходить и посмотреть! Надо сказать об этом Джеку! Джек!"
    wait
    dialog "[Кричащий Джек]"
    dialog "Не смотри на меня так! Я не обязан ничего тебе говорить! Хочешь еще что-то узнать - спроси у ^ff0000Лунатика^000000..."
    close
    return
else
	dialog "[Кричащий Джек]"
	dialog "Ааааааааааааа! Вы видели? Там ходит Лунатик!"
	Talk2me "Кричащий Джек#2021hw_ex" "Кричащий Джек: Ааааааааааааа! Вы видели? Там ходит Лунатик!"
	close
	return
endif
return



npc "umbala" "Исследователь#2021hw" 4_LGTSCIENCE 113 287 7 0 0
OnClick:
if (v[halloebs02] < 6)
	dialog "[Исследователь]"
	dialog "Хе-хе-хе-хе-хе-хе, никто не знает что их ждёт!"
    wait
    dialog "[Исследователь]"
    dialog "ААА! Не подкрадывайся так! Я ведь чуть со страху концы не отдал!"
    close
    return
endif

if (v[halloebs02] == 6)
	dialog "[Исследователь]"
	dialog "Хе-хе-хе-хе-хе-хе, никто не знает что их ждёт!"
    wait
    dialog "[Исследователь]"
    dialog "ААА! Не подкрадывайся так! Я ведь чуть со страху концы не отдал!"
    wait
    dialog "[Исследователь]"
	dialog "Ох, мне лучше пойти прилечь пораньше и отдохнуть... Кажется, у меня начались галлюцинации..."
    wait
	choose menu "Спросить про галлюцинации "
    case 1
    break
    endchoose
    dialog "[Исследователь]"
	dialog "Какое тебе дело! Я просто задремал, потому что в эти дни я был измотан своими исследованиями. Такого не может быть! Неважно!"
    wait
	choose menu "Расскажите, пожалуйста "
    case 1
    break
    endchoose
    dialog "[Исследователь]"
	dialog "Я работал здесь некоторое время назад, и вдруг кто-то сзади спросил меня, в какой деревне можно купить вкусной рыбы."
    wait
    dialog "[Исследователь]"
    dialog "Я ему ответил, что в Морроке, там она одна из лучших, хотя я не пробовал в Маллане... Потом я оглянулся во время разговора..."
    wait
    dialog "[Исследователь]"
    dialog "И передо мной появилось очертание четырёхногого существа прямо в воздухе!"
    wait
    dialog "[Исследователь]"
	dialog "Что это было? Это же не привидение, правда ведь? Мне лишь приснилось?"
    setitem halloebs02 7
    completequest 11509
    setquest 11510
    close
    return
endif

if (v[halloebs02] == 7)
    dialog "[Исследователь]"
	dialog "Я работал здесь некоторое время назад, и вдруг кто-то сзади спросил меня, в какой деревне можно купить вкусной рыбы."
    wait
    dialog "[Исследователь]"
    dialog "Я ему ответил, что в Морроке, там она одна из лучших, хотя я не пробовал в Маллане... В общем, потом я оглянулся во время разговора..."
    wait
    dialog "[Исследователь]"
    dialog "И передо мной явилось очертание четырёхногого существа прямо в воздухе!"
    wait
    dialog "[Исследователь]"
	dialog "Что это было? Это же не привидение, правда ведь? Мне лишь приснилось?"
    close
    return
else
	dialog "[Исследователь]"
	dialog "Хе-хе-хе-хе-хе-хе, никто не знает что их ждёт!"
    wait
    dialog "[Исследователь]"
    dialog "ААА! Не подкрадывайся так! Я ведь чуть со страху концы не отдал!"
    close
    return
endif
return


npc "morocc" "Испуганный торговец#2021hw" 1_M_SIGNMCNT 154 248 1 0 0
OnClick:
if (v[halloebs02] < 7)
	dialog "[Испуганный торговец]"
	dialog "На сегодня лавка закрыта... Хватит с меня."
    close
    return
endif

if (v[halloebs02] == 7)
	dialog "[Испуганный торговец]"
	dialog "На сегодня лавка закрыта... Хватит с меня."
    wait
  choose menu "Что произошло?"
    case 1
    break
    endchoose
    dialog "[Испуганный торговец]"
	dialog "Почему ты вдруг спрашиваешь меня об этом? Ты что-то знаешь?"
    wait
    dialog "[Испуганный торговец]"
    dialog "Что случилось со мной недавно..."
    wait
  choose menu "Расскажи про привидение "
    case 1
    break
    endchoose
    dialog "[Испуганный торговец]"
	dialog "Так ты тоже его видел?! Всё произошло так быстро..."
    wait
    dialog "[Испуганный торговец]"
    dialog "Пока я убирал склад, вдруг кто-то сзади спросил меня, как попасть в деревню, где продают вкусную рыбу."
    wait
    dialog "[Испуганный торговец]"
    dialog "Это было прямо перед Кафрой, и когда я сказал незнакомцу, что можно использовать услуги Кафры, сотрудница вдруг странно посмотрела на меня "
    wait
    dialog "[Испуганный торговец]"
    dialog "Она просто посмотрела на меня и спросила, о чем я говорю."
    wait
    dialog "[Испуганный торговец]"
    dialog "И я показал на того незнакомца, который стоял в направлении Альберты."
    wait
    dialog "[Испуганный торговец]"
	dialog "Но сотрудница Кафры сказала что... За спиной никого нет..."
    wait
    dialog "[Испуганный торговец]"
	dialog "Ха-ха... Может быть, она сказала это, чтобы подшутить надо мной? Ха-ха-ха-ха... Я ведь... Я ведь... Ха-ха-ха-ха-ха-ха!"
    setitem halloebs02 8
    completequest 11510
    setquest 11511
    close
    return
endif

if (v[halloebs02] == 8)
    dialog "[Испуганный торговец]"
    dialog "Пока я убирал склад, вдруг кто-то сзади спросил меня, как попасть в деревню, где продают вкусную рыбу."
    wait
    dialog "[Испуганный торговец]"
    dialog "Это было прямо перед Кафрой, и когда я сказал незнакомцу, что можно использовать услуги Кафры, сотрудница вдруг странно посмотрела на меня "
    wait
    dialog "[Испуганный торговец]"
    dialog "Она просто посмотрела на меня и спросила, о чем я говорю."
    wait
    dialog "[Испуганный торговец]"
    dialog "И я показал на того незнакомца, который стоял в направлении Альберты."
    wait
    dialog "[Испуганный торговец]"
	dialog "Но сотрудница Кафры сказала что... За спиной никого нет..."
    wait
    dialog "[Испуганный торговец]"
	dialog "Ха-ха... Может быть, она сказала это, чтобы подшутить надо мной? Ха-ха-ха-ха... Я ведь... Я ведь... Ха-ха-ха-ха-ха-ха!"
    close
    return
else
	dialog "[Испуганный торговец]"
	dialog "На сегодня лавка закрыта... Хватит с меня."
    close
    return
endif
return


npc "alberta" "Удивлённый кот#2021hw" 4_CAT_DOWN 45 239 5 0 0
OnClick:
if (v[halloebs02] < 8)
	dialog "[Удивлённый кот]"
	dialog "Уже осень... Море в такое вермя года такое холодное и рыбы всё меньше..."
	close
	return
endif

if (v[halloebs02] == 8)
	dialog "[Удивлённый кот]"
	dialog "Да? В чем дело?"
    wait
  choose menu "Вы, кажется, удивлены "
    case 1
    break
    endchoose
    dialog "[Удивлённый кот]"
	dialog "Да, а что? Это так заметно?"
    wait
  choose menu "Ты постоянно оглядываешься "
    case 1
    break
    endchoose
    dialog "[Удивлённый кот]"
    dialog "Просто дни становятся все холоднее и просто холодно."
    wait
  choose menu "...Вы не видели тут кота?"
    case 1
    break
    endchoose
    dialog "[Удивлённый кот]"
	dialog "А? Кота? Как я?"
    wait
  choose menu "Рассказать про кота "
    case 1
    break
    endchoose
    dialog "[Удивлённый кот]"
	dialog "Хм... ^ff0000Белый^000000 кот, который любит ^ff0000вкусную рыбу^000000 и носит маленький ^ff0000бело-красный ошейник^000000."
    wait
    dialog "[Удивлённый кот]"
    dialog "Я такого не видел... А вот если бы он любил портвейн... Я бы точно его заметил. "
    wait
    dialog "[Удивлённый кот]"
    dialog "...Многие ребята собираются здесь за рыбой, так почему бы вам не поискать его тут? "
	wait
    dialog "[Удивлённый кот]"
    dialog "Если он любит вкусную рыбу, думаю, он попал куда надо."
    setitem halloebs02 9
    completequest 11511
    setquest 11512
    close
    return
endif

if (v[halloebs02] == 9)
    dialog "[Удивлённый кот]"
	dialog "Хм... ^ff0000Белый^000000 кот, который любит ^ff0000вкусную рыбу^000000 и носит маленький ^ff0000бело-красный ошейник^000000."
    wait
    dialog "[Удивлённый кот]"
    dialog "Я такого не видел... А вот если бы он любил портвейн... Я бы точно его заметил. "
    wait
    dialog "[Удивлённый кот]"
    dialog "...Многие ребята собираются здесь за рыбой, так почему бы вам не поискать его тут? "
	wait
    dialog "[Удивлённый кот]"
    dialog "Если он любит вкусную рыбу, думаю, он попал куда надо."
    close
    return
else
	dialog "[Удивлённый кот]"
	dialog "Уже осень... Море в такое вермя года такое холодное и рыбы всё меньше..."
	close
	return
endif
return


npc "alberta" "Белый кот#2021hw" 4_CAT 198 50 3 0 0
OnClick:
if (v[halloebs02] < 9)
	dialog "- Белый кот. И, если присмотреться, можно увидеть какие-то черные пятна. -"
	close
	return
endif

if (v[halloebs02] == 9)
	dialog "- Белый кот. И, если присмотреться, можно увидеть, что сквозь него видно землю. -"
	wait
	dialog "- Когда вы подходите ближе, вы останавливаетесь перед ним, и пытаетесь заговорить. -"
	wait
	dialog "- Кот вас не слышит, но он как будто пытается показать на горсть пепла рядом с ним. -"
	setitem halloebs02 10
	completequest 11512
	setquest 11513
	close
	return
endif

if (v[halloebs02] == 10)
	dialog "- Белый кот. И, если присмотреться, можно увидеть, что сквозь него видно землю. -"
	wait
	dialog "- Когда вы подходите ближе, вы останавливаетесь перед ним, и пытаетесь заговорить. -"
	wait
	dialog "- Кот вас не слышит, но он как будто пытается показать на горсть пепла рядом с ним. -"
	close
	return
else
	dialog "- Белый кот. И, если присмотреться, можно увидеть какие-то черные пятна. -"
	close
	return
endif
return


npc "alberta" "Горсть пепла#2021hw" 4_SOIL 199 51 1 0 0
OnClick:
if (v[halloebs02] < 10)
	dialog "- Обычная куча пепла и песка -"
	close
	return
endif

if (v[halloebs02] == 10)

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "У вас слишком много вещей. Освободите свой инвентарь и попробуйте еще раз."
        close
        return
    else
    endif
	
	var name = PcName
	dialog "- Глядя на кучу пепла, вы видите какие-то белые вкрапления. -"
	wait
	dialog "- Это ^ff0000кости^000000, которые, кажется, принадлежали маленькому животному. -"
	wait
	dialog "- И сквозь кости видно рваную ^ff0000красную нить^000000. Похоже, это был ошейник маленького животного. -"
    wait
	dialog "["+name+"]"
	dialog "Кажется, поиски закончены... Нужно отнести это Джеку."
    setitem halloebs02 11
    getitem Little_Skel_Bone 1
    completequest 11513
    setquest 11514
    close
    return
endif

if (v[halloebs02] == 11)
	var name = PcName
	dialog "- Глядя на кучу пепла, вы видите какие-то белые вкрапления. -"
	wait
	dialog "- Это ^ff0000кости^000000, которые, кажется, принадлежали маленькому животному. -"
	wait
	dialog "- И сквозь кости видно рваную ^ff0000красную нить^000000. Похоже, это был ошейник маленького животного. -"
    wait
	dialog "["+name+"]"
	dialog "Кажется, поиски закончены... Нужно отнести это Джеку."
    close
    return
else
	dialog "- Обычная куча пепла и песка -"
	close
	return
endif
return




npc "niflheim" "Кот с черной гривой#2017hw" 4_SCATLETON 147 199 3 0 0
OnClick:
if (v[halloebs02] < 13)
    dialog "[Кот с черной гривой]"
	dialog "У-у-у-у-у... "
    close
    return
endif

if (v[halloebs02] == 13)
    dialog "[Кот с черной гривой]"
	dialog "У-у-у-у-у... "
    wait
    dialog "[Кот с черной гривой]"
	dialog "... Это дует зловещий ветер..."
    wait
    dialog "[Кот с черной гривой]"
    dialog "...Как тебе страшно..."
    wait
    dialog "[Кот с черной гривой]"
	dialog "...Ладно! Зачем вы пришли ко мне? Если вы здесь, чтобы задавать глупые вопросы, например, о том, чтобы быть иметь красивую гриву, уходите."
    wait
  choose menu "Рассказать о Джеке "
    case 1
    break
    endchoose
    dialog "[Кот с черной гривой]"
	dialog "...Очень давно я не слышал его имени... Был такой молодой человек... Но теперь его имя забыто."
    wait
    dialog "[Кот с черной гривой]"
	dialog "Пожалуйста, передайте это и ему. Больше нет милого мяуканья... Того котёнка больше нет..."
    wait
  choose menu "Что произошло?"
    case 1
    break
    endchoose
	dialog "[Кот с черной гривой]"
	dialog "Джек когда-то был моим хозяином, но те времена давно прошли. Он бросил меня, голодного и одинокого."
    wait
    dialog "[Кот с черной гривой]"
	dialog "Сначала это было просто приключение. Я хотел сбегать и посмотреть, всё что было в округе. Но когда я вернулся, Джека уже не было."
    wait
    dialog "[Кот с черной гривой]"
    dialog "Я несколько дней ждал, пока он вернётся, но он так и не пришёл."
    wait
    dialog "[Кот с черной гривой]"
    dialog "И однажды, когда я проснулся, я решил уйти навсегда..."
	wait
    dialog "[Кот с черной гривой]"
    dialog "Это был последний раз, когда я доверился человеку."
    wait
    dialog "[Кот с черной гривой]"
	dialog "В любом случае, теперь, я нахожусь в этом мире, без хозяина. "
	wait
    dialog "[Кот с черной гривой]"
	dialog "Того котёнка больше нет, ты должен сказать это Джеку. Ему будет легче принять это, если ты отдашь эти кости мне."
    setitem halloebs02 14
    completequest 11515
    setquest 11516
    close
    return
endif

if (v[halloebs02] == 14)
	dialog "[Кот с черной гривой]"
	dialog "Того котёнка больше нет, ты должен сказать это Джеку. Ему будет легче принять это, если ты отдашь эти кости мне."
    close
    return
endif

if (v[halloebs02] == 15)
	dialog "[Кот с черной гривой]"
    dialog "Ты рассказал Джеку о том, что случилось?"
    close
    return
endif

if (v[halloebs02] == 16)
	dialog "[Кот с черной гривой]"
    dialog "Ты рассказал Джеку о том, что случилось?"
    close
    return
endif

if (v[halloebs02] == 17)
	dialog "[Кот с черной гривой]"
    dialog "Ты рассказал Джеку о том, что случилось?"
    close
    return
endif

if (v[halloebs02] == 18)
	dialog "[Кот с черной гривой]"
	dialog "Почему ты вернулся?"
    wait
  choose menu "Я не смог сказать..."
    case 1
    break
    endchoose
    dialog "[Кот с черной гривой]"
	dialog "Хватает же тебе упрямости! Но вообще-то я думал... Не то чтобы я не думал возвращаться к Джеку..."
    wait
    dialog "[Кот с черной гривой]"
	dialog "Но посмотри на меня. Я больше не белое и милое создание."
    wait
    dialog "[Кот с черной гривой]"
	dialog "Изменился не только внешний вид. У меня все изменился и характер."
    wait
    dialog "[Кот с черной гривой]"
	dialog "Это все, что я могу тебе сказать... "
    setitem halloebs02 19
    completequest 11520
    setquest 11521
    close
    return
endif

if (v[halloebs02] > 18) & (v[halloebs02] < 23)
	dialog "[Кот с черной гривой]"
	dialog "Это все, что я могу тебе сказать... "
    close
    return
endif

if (v[halloebs02] == 23)
	dialog "[Кот с черной гривой]"
	dialog "А он ведь действительно парень, который не сдается..."
    wait
  choose menu "Рассказать про Костёнка "
    case 1
    break
    endchoose
    dialog "[Кот с черной гривой]"
	dialog "Это правда?.. Возможно, в тот момент, когда я решил уйти из дома, во мне умер тот милый котёнок..."
    wait
	dialog "[Кот с черной гривой]"
	dialog "Если это так, то получается здесь находится две мои копии! Как странно... "
    wait
	dialog "[Кот с черной гривой]"
	dialog "Хоть я и не смогу заново прожить свою жизнь, то возможно Джек может продолжить жить здесь, в этом мире, с тем котёнком, что остался тогда без хозяина."
    wait
  choose menu "Откуда ты знаешь?"
    case 1
    break
    endchoose
    dialog "[Кот с черной гривой]"
	dialog "Это ведь очень похоже на меня. Вкусная рыба, красный ошейник... Пятна! Ну, конечно, это тогда был я."
    wait
    dialog "- Кот опустил голову, а затем снова заговорил. -"
    wait
    dialog "[Кот с черной гривой]"
	dialog "Нельзя Джеку об этом знать."
    wait
    dialog "[Кот с черной гривой]"
    dialog "Если он узнает, что я прожил всю жизнь без него, он никогда меня не поймёт."
    wait
    dialog "[Кот с черной гривой]"
	dialog "Я должен уйти, отправиться в странствия..."
    wait
    dialog "[Кот с черной гривой]"
	dialog "Скажи Джеку, что меня нет. Я не знаю, когда вернусь, поэтому, пожалуйста, не жди меня..."
    setitem halloebs02 24
    completequest 11525
    setquest 11526
    close
    return
else
    dialog "[Кот с черной гривой]"
	dialog "Нельзя Джеку знать обо мне."
    wait
    dialog "[Кот с черной гривой]"
    dialog "Если он узнает, что я прожил всю жизнь без него, он никогда меня не поймёт."
    wait
    dialog "[Кот с черной гривой]"
	dialog "Я должен уйти, отправиться в странствия..."
    wait
    dialog "[Кот с черной гривой]"
	dialog "Скажи Джеку, что меня нет. Я не знаю, когда вернусь, поэтому, пожалуйста, не жди меня..."
    close
    return
endif


npc "nif_fild02" "Надгробие#2017hw1" 4_SOIL 131 231 0 0 0
OnClick:
dialog "[Надгробие]"
dialog "Здесь так холодно..."
close
return

npc "nif_fild02" "Надгробие#2017hw2" 4_SOIL 133 232 0 0 0
OnClick:
dialog "[Надгробие]"
dialog "Я вижу только тьму... ."
close
return

npc "nif_fild02" "Надгробие#2017hw3" 4_SOIL 132 229 0 0 0
OnClick:
dialog "[Надгробие]"
dialog "Воздух здесь такой холодный..."
close
return

npc "nif_fild02" "Надгробие#2017hw4" 4_SOIL 137 228 3 0 0
OnClick:
if (v[halloebs02] < 15)
	dialog "[Надгробие]"
	dialog "Как здесь холодно..."
    wait
    dialog "[Надгробие]"
	dialog "Как будто меня не греет моя шерсть."
    close
    return
endif

if (v[halloebs02] == 15)
	var name = PcName
	dialog "[Надгробие]"
	dialog "Как здесь холодно..."
    wait
    dialog "[Надгробие]"
	dialog "В моем теле нет сил... Что это? Я умер?"
    wait
    dialog "[Надгробие]"
	dialog "Там кто-то есть?"
    wait
    dialog "[Надгробие]"
	dialog "Меня зовут Скари, там кто-то есть? Мне очень одиноко."
    wait
	dialog "["+name+"]"
    dialog "Скари?! Ты ведь кот Джека, так ведь? Может я могу тебе чем то помочь?"
    wait
    dialog "[Скари]"
    dialog "Ты видел Джека? Я его недавно потерял."
    wait
    dialog "[Скари]"
	dialog "...Ух-х-х, тут так холодно, ты можешь принести мне немного шерсти? 5 штук ^ff0000Чёрной шерсти^000000 подойдёт."
    setitem halloebs02 16
    completequest 11517
    setquest 11518
    close
    return
endif

if (v[halloebs02] == 16)
	if (v[Black_Fur] > 4)
		dialog "[Скари]"
		dialog "Ах... Ты уже здесь..."
		wait
		choose menu "Отдать черную шерсть " "Уйти "
		case 1
			var name = PcName
			dialog "[Скари]"
			dialog "Большое спасибо... Теперь я могу спокойно поспать..."
            dropitem Black_Fur 5
            setitem halloebs02 17
            completequest 11518
            setquest 11519
            wait
            dialog "[Скари]"
			dialog "Ааа... Очень горячо!"
            wait
            dialog "[Скари]"
			dialog "Что это такое? Это ведь... Просто шерсть, правда?"
            wait
            dialog "[Скари]"
			dialog "А без неё очень холодно! Я не понимаю..."
            wait
			choose menu "Ты знаешь, где мы?"
            case 1
            break
            endchoose
            dialog "[Скари]"
			dialog "А, кстати... Где мы?"
            wait
			dialog "["+name+"]"
			dialog "Мы в Нифльхейме, в городе мертвых..."
            wait
            dialog "[Скари]"
			dialog "Что?! Как?! Я не понимаю! И куда пропала моя шерсть!"
            wait
            dialog "[Скари]"
			dialog "Я даже телом не могу пошевелить, почему это так! Что это такое? Ой-ой-ой..."
            wait
            dialog "- Скари так взволнован, что, кажется, больше невозможно разговаривать. Вернемся к Джеку. -"            
            close
            return
		break
		case 2
			dialog "[Скари]"
			dialog "Ты видел Джека? Я его недавно потерял."
			wait
			dialog "[Скари]"
			dialog "...Ух-х-х, тут так холодно, ты можешь принести мне немного шерсти? 5 штук ^ff0000Чёрной шерсти^000000 подойдёт."
            close
            return
		break
		endchoose
	else
		dialog "["+name+"]"
		dialog "Скари?! Ты ведь кот Джека, так ведь? Может я могу тебе чем то помочь?"
		wait
		dialog "[Скари]"
		dialog "Ты видел Джека? Я его недавно потерял."
		wait
		dialog "[Скари]"
		dialog "...Ух-х-х, тут так холодно, ты можешь принести мне немного шерсти? 5 штук ^ff0000Чёрной шерсти^000000 подойдёт."
        close
        return
	endif
endif

if (v[halloebs02] == 17)
	dialog "["+name+"]"
	dialog "Мы в Нифльхейме, в городе мертвых..."
	wait
	dialog "[Скари]"
	dialog "Что?! Как?! Я не понимаю! И куда пропала моя шерсть!"
	wait
	dialog "[Скари]"
	dialog "Я даже телом не могу пошевелить, почему это так! Что это такое? Ой-ой-ой..."
	wait
	dialog "- Скари так взволнован, что, кажется, больше невозможно разговаривать. Вернемся к Джеку. -"            
    close
    return
endif

if (v[halloebs02] == 18)
	dialog "[Скари]"
	dialog "- Скари так взволнован, что, кажется, больше невозможно разговаривать. -"            
    close
    return
endif

if (v[halloebs02] == 19)
	dialog "[Скари]"
	dialog "- Скари так взволнован, что, кажется, больше невозможно разговаривать. -"            
    close
    return
endif

if (v[halloebs02] == 20)
	if (v[White_Thin_Stem] > 9)
		dialog "[Скари]"
		dialog "Я даже телом не могу пошевелить, почему это так! Что это такое? Ой-ой-ой..."
        dropitem White_Thin_Stem 10
        setitem halloebs02 21
        completequest 11522
        setquest 11523
        wait
        dialog "[Скари]"
		dialog "Ты снова здесь, чтобы посмеяться надо мной, потому что я даже не могу пошевелиться?!"
        wait
    choose menu "Отдать сухие ветки "
        case 1
        break
        endchoose
        dialog "[Скари]"
		dialog "Зачем мне твои сухие ветки? "
        wait
        dialog "[Скари]"
		dialog "Как я могу хоть что-либо сделать без движения?!"
        wait
        dialog "[Скари]"
		dialog "Я ведь теперь скелет..."
        wait
        dialog "[Скари]"
		dialog "Постой... Мне кажется... Ветки, которые ты принёс, достаточно крепкие... Дай их сюда... То есть... Поставь... Сюда..."
        wait
        dialog "[Скари]"
        dialog "Думаю, мне придется немного привыкнуть к этому, чтобы нормально двигаться, но это намного лучше, чем раньше..."
        wait
        dialog "[Скари]"
        dialog "-  Вам кажется, что надгробие начинает двигаться.  -"
        wait
        dialog "[Скари]"
		dialog "Могу я попросить тебя об одолжении?"
        wait
        dialog "[Скари]"
		dialog "Ты, кажется, меня хорошо знаешь... Можешь принести мне немного ^ff0000Свежей рыбы^000000, всего 10 штук?"
        close
        return
	else
		dialog "[Скари]"
		dialog "Я даже телом не могу пошевелить, почему это так! Что это такое? Ой-ой-ой..."
        close
        return
	endif
endif

if (v[halloebs02] == 21)
	if (v[Delicious_Fish] > 9)
		choose menu "Отдать рыбу " "Уйти "
		case 1
			dialog "[Скари]"
			dialog "Ох... Что за вкус! Этот сладкий рыбный запах, эта рыбка скользит по моему рту будто впервые."
            dropitem Delicious_Fish 10
            setitem halloebs02 22
            completequest 11523
            setquest 11524
            wait
            dialog "[Скари]"
			dialog "Уникальная текстура, будто каждая чешуйка живая! Я никогда не пробовал такого вкуса при жизни."
            wait
            dialog "[Скари]"
            dialog "Спасибо тебе."
            wait
            dialog "[Скари]"
			dialog "А может тогда... Мы и скелет мой восстановим? Пригодилось бы еще 20 ^ff0000Сухих белых веток^000000."
            close
            return
        break
        case 2
        break
        endchoose
	else
        dialog "[Скари]"
		dialog "Могу я попросить тебя об одолжении?"
        wait
        dialog "[Скари]"
		dialog "Ты, кажется, меня хорошо знаешь... Можешь принести мне немного ^ff0000Свежей рыбы^000000, всего 10 штук?"
        close
        return
	endif
endif

if (v[halloebs02] == 22)
	if (v[White_Thin_Stem] > 19)

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "У вас слишком много вещей. Освободите свой инвентарь и попробуйте еще раз."
        close
        return
    else
    endif

		dialog "- Посмотрев на Скари с новым скелетом, складывается впечатление, что я уже где-то это видел. -"
		dropitem White_Thin_Stem 20
		setitem halloebs02 23
		getitem Memory_Of_Gyol 1
		completequest 11524
		setquest 11525
        wait
        dialog "[Скари]"
		dialog "Вернулся... Большое спасибо."
        wait
        dialog "[Скари]"
        dialog "Я переродился здесь в отчаянии... Но нужно принять то, кем я стал."
        wait
        dialog "[Скари]"
        dialog "Но видя, как ты мне помогаешь, видя, что Джек тоже здесь, мне становится спокойно."
        wait
        dialog "[Скари]"
        dialog "Джек... всегда заботился обо мне, мне обязательно надо его найти."
        wait
        dialog "[Скари]"
        dialog "Это единственный фрагмент моей памяти, который остался."
        wait
        dialog "[Скари]"
		dialog "И прежде чем я уйду, я отдам тебе это взамен за помощь мне. Я даже не знаю, что это."
        wait
        dialog "[Скари]"
        dialog "Но мне кажется, что ты знаешь, зачем это и к кому идти."
        close
        return
	else
		dialog "[Скари]"
		dialog "А может тогда... Мы и скелет мой восстановим? Пригодилось бы еще 20 ^ff0000Сухих белых веток^000000."
        close
        return
	endif
endif   
        
if (v[halloebs02] == 23)
	dialog "[Скари]"
	dialog "Я переродился здесь в отчаянии... Но нужно принять то, кем я стал."
	wait
	dialog "[Скари]"
	dialog "Но видя, как ты мне помогаешь, видя, что Джек тоже здесь, мне становится спокойно."
	wait
	dialog "[Скари]"
	dialog "Джек... всегда заботился обо мне, мне обязательно надо его найти."
	wait
	dialog "[Скари]"
	dialog "Это единственный фрагмент моей памяти, который остался."
    close
    return
else
	dialog "[Скари]"
	dialog "Я даже телом не могу пошевелить, почему это так! Что это такое? Ой-ой-ой..."
    close
    return
endif
return



npc "niflheim" "Джек#2017hw_j1" 4_JJAK 176 133 3 0 0
OnClick:
dialog "[Джек]"
dialog "Помогите!"
Talk2me "Джек#2017hw_j1" "Джек: Спасите меня!"
close
return


npc "niflheim" "Джек#2017hw_j2" 4_JJAK 185 138 5 5 5
OnTouch2:
Talk2me "Джек#2017hw_j2" "Джек: Что ты тут делаешь?"
return

OnClick:
dialog "[Джек]"
dialog "Хе-хе-хе!"
Talk2me "Джек#2017hw_j2" "Джек: Хе-хе-хе-хе!"
close
return


npc "niflheim" "Джек#2017hw_j3" 4_JJAK 204 166 8 5 5
OnTouch2:
Talk2me "Джек#2017hw_j3" "Джек: Бежим!"
return

OnClick:
dialog "[Джек]"
dialog "Бежим!"
Talk2me "Джек#2017hw_j3" "Джек: Ура! Бежим!"
close
return


npc "niflheim" "Джек#2017hw_j4" 4_JJAK 164 189 1 5 5
OnTouch2:
Talk2me "Джек#2017hw_j4" "Джек: Долина мертвых жива как никогда!"
return

OnClick:
dialog "[Джек]"
dialog "Долина мертвых жива как никогда!"
Talk2me "Джек#2017hw_j4" "Джек: Долина мертвых жива как никогда!"
close
return


npc "niflheim" "Костигр#2017hw" 4_SKELION 138 199 5 0 0
OnClick:
	dialog "[Костигр]"
	dialog "Немногие в это верят, но в долине мёртвых существуют облики не только погибших..."
	wait
	dialog "[Костигр]"
	dialog "Я могу улучшить жизнь существа здесь, вернув ему силу. Правда, можно ли это назвать жизнью..."
	wait
	dialog "- Вы можете улучшить Костёнка. Вам нужно ^ff00001 Яйцо Костёнка, 2 Воспоминания о Костигре, 100 Вкусный поросенок, 100 Завтрак Дракулы^000000 чтобы улучшить его в Костигра. -"
	wait
	dialog "- ^ff0000Некоторые предметы можно получить с помощью заданий события.^000000 -"
	dialog "- ^ff0000Осторожно, при улучшении в Костигра вы не сможете обернуть питомца назад в Костёнка.^000000 -"
	wait
	choose menu "Превратить в Костигра " "Отмена "
		case 1
			if ((v[Scatletoncarrier] > 0) & (v[Memory_Of_Gyol] > 1) & (v[Yummy_Meat] > 99) & (v[Cookies_Bat] > 99))
				dialog "[Костигр]"
				dialog "Каково, это Скари? Стать снова живым. Живее, чем ты когда-либо был."
				dropitem Scatletoncarrier 1
				dropitem Memory_Of_Gyol 2
				dropitem Yummy_Meat 100
				dropitem Cookies_Bat 100
				GetPetEgg SKELION
				close
				return
			else
				dialog "[Костигр]"
				dialog "У вас недостаточно предметов для улучшения Костёнка."
				close
				return
			endif
		break
		case 2
			dialog "[Костигр]"
			dialog "Возможно, так ему будет спокойнее."
			close
			return
		break
	endchoose
return
