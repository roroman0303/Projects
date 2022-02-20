// Тестовые NPC

npc "prontera" "Обнулить jp_event " 1_F_04 120 125 5 0 0
OnClick:
	dialog "[QA]"
    dialog "Что обнулить?"
	wait
	choose menu "jp_event55 " "jp_event56 " "jp_event57 " "jp_event63 " "jp_event64 "
		case 1
			dialog "[QA]"
			dialog "Готово!"
			setitem jp_event55 0
			close
			return
		break
		case 2
			dialog "[QA]"
			dialog "Готово!"
			setitem jp_event56 0
			close
			return
		break
		case 3
			dialog "[QA]"
			dialog "Готово!"
			setitem jp_event57 0
			close
			return
		break
		case 4
			dialog "[QA]"
			dialog "Готово!"
			setitem Jp_event63 0
			close
			return
		break
		case 5
			dialog "[QA]"
			dialog "Готово!"
			setitem Jp_event64 0
			close
			return
		break
	endchoose
return

npc "prontera" "Глобалки " 1_F_04 118 125 5 0 0
OnClick:
	dialog "[QA]"
    dialog "Что обнулить?"
	wait
	choose menu "top_melon_size " "top_melon_name " "top_melon_day "
		case 1
			dialog "[QA]"
			dialog "Готово!"
			SetGlobalVar "top_melon_size" 0
			close
			return
		break
		case 2
			dialog "[QA]"
			dialog "Готово!"
			SetGlobalStr "top_melon_name" ""
			close
			return
		break
		case 3
			dialog "[QA]"
			dialog "Готово!"
			SetGlobalVar "top_melon_day" 0
			close
			return
		break
	endchoose
return

npc "prontera" "Выполнить квест " 1_F_04 116 125 5 0 0
OnClick:
	dialog "[QA]"
    dialog "Выполнить квест?"
	wait
	choose menu "Да " "Уйти "
	case 1
		dialog "[QA]"
		dialog "Введите ID: "
		wait
		dlgwrite 1 30000
		completequest input
		wait
		dialog "[QA]"
		dialog "Готово! "
	break
	case 2
		close
		return
	break
	endchoose
return

npc "prontera" "Узнать глобалку " 1_F_04 114 125 5 0 0
OnClick:
	dialog "[QA]"
    dialog "узнать глобалку?"
	wait
	choose menu "day_of_week" "bets_on_part1" "test"
	case 1
		var day_of_the_week = GetGlobalVar "day_of_week"
		dialog "[QA]"
		dialog "day_of_the_week: "+day_of_the_week+""
		close
		return
	break
	case 2
		SetGlobalVar "bets_on_part1" 2000000000
		var bets_on_part1 = GetGlobalVar "bets_on_part1"
		dialog "[QA]"
		dialog "bets_on_part1: "+bets_on_part1+""
		close
		return
	break
	case 3
		var peremen = 2000000000
		dialog "[QA]"
		dialog "peremen: "+peremen+""
		close
		return
	break
	endchoose
return

