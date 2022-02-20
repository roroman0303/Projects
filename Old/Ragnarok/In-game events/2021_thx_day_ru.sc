
npc "alberta" "Лана#19_thx" 4_F_05 138 169 5 5 5
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd

SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 1
SetQuestConditionItem 902 9 "<"
SetQuestConditionItem 25391 4 "<"
SetQuestConditionItem 1752 0 "<"
SetQuestConditionEnd
return

OnTouch2:
var thx_3364 = isbegin_quest 3364
if ((thx_3364 == 0) & (v[VAR_CLEVEL] > 29))
	Talk2me "Лана#19_thx" "Принимайте участие в фестивале света!"
endif
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Лана]"
	dialog "В данном событии придётся бороться с Диким огнём, поэтому участвовать могут только искатели приключений от 30 уровня."
	close
	return
endif


//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Лана]"
	dialog "Если вы хотите принять участие в Фестивале света и огня, необходимо освободить свой инвентарь."
	close
	return
else
endif
//==============================================================================
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Лана]"
	dialog "Добро пожаловать! Мы приветствуем всех, кто посетил Альберту в такие времена."
	wait
	dialog "[Лана]"
	dialog "Не пропустите событие! Отдайте почести величайшему явлению нашего мира!"
	wait
	dialog "[Лана]"
	dialog "Сможете ли вы побороть и приручить огонь, или же струсите и покинете Альберту?"
	wait
	choose menu "Огонь?" "Я не боюсь огня."
	case 1
		dialog "[Лана]"
		dialog "Ежегодно в Альберте проходит праздник, посвященный огню."
		wait
		dialog "[Лана]"
		dialog "Мы всю неделю благодарим солнце за его тепло и свет! А ночью, в его отсутствие, разводим костры, чтобы ни секунды не прошло без света!"
		wait
		dialog "[Лана]"
		dialog "Мы танцуем, поём и готовим еду на огне, показывая важность этого величайшего явления!"
		wait
		dialog "[Лана]"
		dialog "Люди, уходящие домой, или люди, возвращающиеся из дома, - все вместе собираются в Альберте."
		wait
		dialog "[Лана]"
		dialog "Все эти люди собираются, чтобы безвозмездно поделиться едой, посмотреть на огни в ночном городе, сжечь всё плохое... И пожелать друг другу благополучного следующего сезона."
		wait
		dialog "[Лана]"
		dialog "Раньше все костры создавались собственноручно. Но сейчас эти большие костры контролируются специально посланными из Геффена волшебниками."
		close
		return
	break
	case 2
		dialog "[Лана]"
		dialog "Это значит вы хотите принять участие в мероприятии?"
		wait
		dialog "[Лана]"
		dialog "Для того, чтобы стать частью большого праздника, нужно внести свою лепту."
		wait
		dialog "[Лана]"
		dialog "Как вы уже могли догадаться, нужно помочь развести костры! Для этого подойдут предметы, которые могут хорошо и долго гореть."
		wait
		dialog "[Лана]"
		dialog "Для этого понадобятся ^0000cd5 Смоляных веток, 10 Корней дерева и 1 Огненная Стрела^000000."
		wait
		dialog "[Лана]"
		dialog "Ну и, конечно, нужно прийти и развести пламя!"
		wait
		dialog "[Лана]"
		dialog "Если вы сделаете то, о чём я рассказал, вы станете участником фестиваля!"
		wait
		dialog "[Лана]"
		dialog "^0000cdСмоляные ветки^000000 можно получить с Оживших веток. Они бродят на полях неподалёку, странно дело..."
		setquest 3364
		close
		return
	break
	endchoose
elseif (thx_3364 == 1)
	DisableItemMove
	dialog "[Лана]"
	dialog "Вы готовы участвовать в фестивале? Вы подготовили всё, что я упомянул?"
	wait
	if ((v[Fire_Arrow] > 0) & (v[Tree_Root] > 9) & (v[Goodly_Bough] > 4))
		dialog "[Лана]"
		dialog "Отлично, а теперь положите всё это в костёр."
		wait
		ShowEffect "Костёр#19_thx03" 470
		ShowEffect "Костёр#19_thx03" 603
		ShowEffect "Костёр#19_thx03" EF_SIGHTRASHER
		ShowEffect "Костёр#19_thx01" EF_FIREWALL
		ShowEffect "Костёр#19_thx02" EF_FIREWALL
		ShowEffect "Костёр#19_thx03" EF_FIREWALL
		ShowEffect "Костёр#19_thx04" EF_FIREWALL
		ShowEffect "Костёр#19_thx05" EF_FIREWALL
		ShowEffect "Костёр#19_thx06" EF_FIREWALL
		ShowEffect "Костёр#19_thx07" EF_FIREWALL
		ShowEffect "Костёр#19_thx08" EF_FIREWALL
		ShowEffect "Костёр#19_thx09" EF_FIREWALL
		ShowEffect "Костёр#19_thx10" EF_FIREWALL
		ShowEffect "Костёр#19_thx11" EF_FIREWALL
		ShowEffect "Костёр#19_thx12" EF_FIREWALL
		ShowEffect "Костёр#19_thx13" EF_FIREWALL
		dialog "[Лана]"
		dialog "Так... Хорошо! А теперь отойдите немного назад."
		wait
		ShowEffect "Костёр#19_thx03" 903
		Talk2me "Турист#19_thx01" "Вау! Горит!"
		DelayTime 200
		Talk2me "Турист#19_thx04" "Разгорается всё ярче."
		Talk2me "Турист#19_thx02" "Всё больше и больше!"
		DelayTime 300
		Talk2me "Турист#19_thx07" "Осторожнее с искрами!"
		Talk2me "Турист#19_thx05" "Давайте сожжем все плохие воспоминания в этом огне."
		DelayTime 300
		Talk2me "Турист#19_thx03" "Очень красиво..."
		Talk2me "Турист#19_thx08" "И тепло..."
		dialog "[Лана]"
		dialog "Мы много работали, и это принесло свои плоды."
		wait
		dialog "[Лана]"
		dialog "И с твоей помощью мы можем надеяться и на более благополучное завтра."
		wait
		dialog "[Лана]"
		dialog "Большое спасибо. Поблагодарим и окружающих за то, что пришли!"
		Talk2me "Турист#19_thx01" "Спасибо, что пришли!"
		Talk2me "Турист#19_thx04" "Хорошо..."
		DelayTime 500
		Talk2me "Турист#19_thx06" "Спасибо!"
		Talk2me "Турист#19_thx02" "Всем спасибо!"
		Talk2me "Турист#19_thx05" "Спасибо за тепло."
		DelayTime 300
		Talk2me "Турист#19_thx03" "Пусть и следующий сезон будет удачным!"
		Talk2me "Турист#19_thx08" "Спасибо!"
		DelayTime 500
		Talk2me "Турист#19_thx07" "Давайте делать всё возможное."
		wait
		ShowEffect "" 603
		dialog "[Лана]"
		dialog "Благодаря вашей помощи огонь разгорелся и будет еще долго освещать нас. Я дам вам два билета..."
		wait
		dialog "[Лана]"
		dialog "Первый - билет на корабль,"
		dialog "<NAVI>[Капитан корабля]<INFO>alberta.gat,140,170,0,101,0</INFO></NAVI> может отправиться с вами туда, куда вы попросите."
		wait
		dialog "[Лана]"
		dialog "Другой - лотерейный билет, вы можете поучаствовать у <NAVI>[Лотерея]<INFO>alberta.gat,141,188,0,101,0</INFO></NAVI>. Расскажете потом, что получили. Говорят, что там не бывает проигравших."
		completequest 3364
		dropitem Fire_Arrow 1
		dropitem Tree_Root 10
		dropitem Goodly_Bough 5
		setquest 3365
		setquest 3366
		setquest 3367
		getitem Free_Pass_Ticket 1
		getitem Harvest_Lottery_Ticket 1
		close
		EnableItemMove
		return
	else
		dialog "[Лана]"
		dialog "Хм... этого немного не хватает. Вы забыли, что я сказал?"
		wait
		dialog "[Лана]"
		dialog "Прежде всего, принесите ^0000cd5 Смоляных веток^000000, ^0000cd10 Корней дерева^000000, чтобы улучшить огонь, и ^0000cdОгненную стрелу^000000, чтобы зажечь его."
		wait
		dialog "[Лана]"
		dialog "^0000cdСмоляные ветки^000000 можно получить с Оживших веток. Они бродят на полях неподалёку, странно дело..."
		close
		EnableItemMove
		return
	endif
elseif (thx_3364 == 2)
	dialog "[Лана]"
	dialog "Добрый день, авантюрист. Как тебе фестиваль?"
	close
	return
else
	dialog "[Лана]"
	dialog "Добро пожаловать! Мы приветствуем всех, кто посетил Альберту!"
	close
	return
endif
return

// =====================================================
npc "alberta" "Турист#19_thx01" 4_F_BARYO_GIRL 142 168 5 0 0
OnClick:
Talk2me "Турист#19_thx01" "В этом году я не мог вернуться в свой родной город. Так что я коротаю здесь своё одиночество."
return
npc "alberta" "Турист#19_thx02" 4_F_JPN2 145 168 3 0 0
OnClick:
Talk2me "Турист#19_thx02" "Вы видели, как этот большой костёр? Я специально пришел увидеть это!"
return
npc "alberta" "Турист#19_thx03" 4_M_RUSCHILD 148 165 3 0 0
OnClick:
Talk2me "Турист#19_thx03" "Мне очень нравится сезон сбора урожая, еще и в такой день."
return
npc "alberta" "Турист#19_thx04" 4_F_MALAYA 147 161 0 0 0
OnClick:
Talk2me "Турист#19_thx04" "Огонь в море ночью действительно красив."
return
npc "alberta" "Турист#19_thx05" 4_F_CHNWOMAN 144 159 1 0 0
OnClick:
Talk2me "Турист#19_thx05" "Пусть произойдет только хорошее..."
return
npc "alberta" "Турист#19_thx06" 4_F_TWGIRL 141 160 7 0 0
OnClick:
Talk2me "Турист#19_thx06" "Да уж, это стоит потраченного времени на дорогу сюда."
return
npc "alberta" "Турист#19_thx07" 4_M_THAIAYO 140 163 7 0 0
OnClick:
Talk2me "Турист#19_thx07" "Когда видишь этот костер на корабле в ночном море, это похоже на палящее солнце."
return
npc "alberta" "Турист#19_thx08" 4_M_DEWWOMAN 140 166 5 0 0
OnClick:
Talk2me "Турист#19_thx08" "Я хочу приготовить попкорн на костре..."
return

// ==========================================================
npc "alberta" "Костёр#19_thx01" 4_TRACE 144 166 5 0 0
npc "alberta" "Костёр#19_thx02" 4_TRACE 144 165 5 0 0
npc "alberta" "Костёр#19_thx03" 4_BONFIRE 144 164 5 0 0
npc "alberta" "Костёр#19_thx04" 4_TRACE 144 163 5 0 0
npc "alberta" "Костёр#19_thx05" 4_TRACE 144 162 5 0 0
npc "alberta" "Костёр#19_thx06" 4_TRACE 142 164 5 0 0
npc "alberta" "Костёр#19_thx07" 4_TRACE 143 164 5 0 0
npc "alberta" "Костёр#19_thx08" 4_TRACE 145 164 5 0 0
npc "alberta" "Костёр#19_thx09" 4_TRACE 146 164 5 0 0
npc "alberta" "Костёр#19_thx10" 4_TRACE 143 165 5 0 0
npc "alberta" "Костёр#19_thx11" 4_TRACE 145 165 5 0 0
npc "alberta" "Костёр#19_thx12" 4_TRACE 143 163 5 0 0
npc "alberta" "Костёр#19_thx13" 4_TRACE 145 163 5 0 0
// =========================================================
npc "alberta" "Капитан корабля#19_thx" 4_M_SEAMAN 140 170 3 5 5
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 1
SetQuestConditionBegin 1 1 4
SetQuestConditionQuest 1 0
SetQuestConditionQuest 3364 3
SetQuestConditionItem 25392 0 "<"
SetQuestConditionEnd
return

OnTouch2:
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 2)
	Talk2me "Капитан корабля#19_thx" "Если у вас есть билет, я могу отправить вас куда угодно."
endif
return

OnClick:
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 2)
	dialog "[Капитан корабля]"
	dialog "Хочешь домой? Или в путешествие? В любом случае, если у тебя есть Билет на корабль, я могу отвезти тебя куда угодно. Конечно, если у 'куда угодно' есть порт. Хе-хе."
	wait
	if (v[Free_Pass_Ticket] < 1)
		dialog "[Капитан корабля]"
		dialog "Но у тебя, кажется, нет билета. Куда ты без него? Сначала билет - потом отплываем."
		close
		return
	endif
	dialog "[Капитан корабля]"
	dialog "Куда желаете поплыть?"
	wait
	choose menu "Геффен " "Комодо " "Лайтхайзен " "Альдебаран " "Эйнброх " "Излюд " "Пайон " "Отмена "
	case 1
		dialog "[Капитан корабля]"
		dialog "Держись крепче!"
		DelayTime 200
		Talk2me "Капитан корабля#19_thx" "Отплываем!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "geffen" 132 48
		return
	break
	case 2
		dialog "[Капитан корабля]"
		dialog "Держись крепче!"
		DelayTime 200
		Talk2me "Капитан корабля#19_thx" "Отплываем!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "comodo" 86 99
		return
	break
	case 3
		dialog "[Капитан корабля]"
		dialog "Держись крепче!"
		DelayTime 200
		Talk2me "Капитан корабля#19_thx" "Отплываем!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "lighthalzen" 246 76
		return
	break
	case 4
		dialog "[Капитан корабля]"
		dialog "Держись крепче!"
		DelayTime 200
		Talk2me "Капитан корабля#19_thx" "Отплываем!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "aldebaran" 225 146
		return
	break
	case 5
		dialog "[Капитан корабля]"
		dialog "Держись крепче!"
		DelayTime 200
		Talk2me "Капитан корабля#19_thx" "Отплываем!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "einbroch" 239 123
		return
	break
	case 6
		dialog "[Капитан корабля]"
		dialog "Держись крепче!"
		DelayTime 200
		Talk2me "Капитан корабля#19_thx" "Отплываем!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "izlude" 196 180
		return
	break
	case 7
		dialog "[Капитан корабля]"
		dialog "Держись крепче!"
		DelayTime 200
		Talk2me "Капитан корабля#19_thx" "Отплываем!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "payon" 129 62
		return
	break
	case 8
		dialog "[Капитан корабля]"
		dialog "Береги себя."
		close
		return
	break
	endchoose
else
	dialog "[Капитан корабля]"
	dialog "Хочешь домой? Или в путешествие? В любом случае, если у тебя есть Билет на корабль, я могу отвезти тебя куда угодно. Конечно, если у 'куда угодно' есть порт. Хе-хе."
	wait
	dialog "[Капитан корабля]"
	dialog "Но у тебя, кажется, нет билета. Куда ты без него? Сначала билет - потом отплываем."
	close
	return
endif
return

// =====================================================
npc "alberta" "Лун#19_thx" 4_M_ARUNA_NFM1 134 162 7 5 5
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3365
SetQuestConditionBegin 3365 1 5
SetQuestConditionQuest 3365 1
SetQuestConditionEnd

AddQuestIDCondition 3369
SetQuestConditionBegin 3369 1 5
SetQuestConditionQuest 3369 2
SetQuestConditionItem 25391 9 "<"
SetQuestConditionEnd

AddQuestIDCondition 3370
SetQuestConditionBegin 3370 1 4
SetQuestConditionQuest 3370 2
SetQuestConditionEnd

SetQuestConditionBegin 3370 1 4
SetQuestConditionQuest 3364 3
SetQuestConditionQuest 3369 0
SetQuestConditionQuest 3370 0
SetQuestConditionEnd
return

OnTouch2:
var thx_3364 = isbegin_quest 3364
var thx_3365 = isbegin_quest 3365
var thx_3369 = isbegin_quest 3369
var thx_3370 = isbegin_quest 3370
if ((thx_3365 == 1) & (thx_3369 == 0) & (thx_3370 == 0) & (thx_3364 == 2))
	Talk2me "Лун#19_thx" "Путник, можешь мне помочь?"
endif
return

OnClick:
//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Лун]"
	dialog "Если вы хотите принять участие в фестивале, освободите свой инвентарь."
	close
	return
else
endif
//==============================================================================
var thx_3364 = isbegin_quest 3364
var thx_3365 = isbegin_quest 3365
var thx_3369 = isbegin_quest 3369
var thx_3370 = isbegin_quest 3370
var hunt_chek01 = checkquest_hunting 3369
var time_check01 = checkquest_playtime 3370
if ((thx_3365 == 1) & (thx_3369 == 0) & (thx_3370 == 0) & (thx_3364 == 2))
	dialog "[Лун]"
	dialog "Здравствуй!"
	wait
	choose menu "Что происходит?"
	endchoose
	dialog "[Лун]"
	dialog "Ты едешь домой?"
	wait
	choose menu "Я приехал на фестиваль "
	endchoose
	dialog "[Лун]"
	dialog "О, это хорошо... Эй, если у тебя есть время... если у тебя есть время... ты можешь мне помочь? Пожалуйста... Пожалуйста, не проходи мимо."
	wait
	choose menu "Конечно помогу " "Я немного занят "
	case 1
		dialog "[Лун]"
		dialog "Эй, это действительно хорошо. Я беспокоился о том, что мне делать. Я волнуюсь, что этот праздник будет испорчен из-за меня, или что континент Мидгард окажется в опасности..."
		wait
		dialog "[Лун]"
		dialog "Хотя, конечно, если это произойдет, континент назовут в мою честь... Как в честь человека, раз и навсегда уничтожившего всё сущее. "
		wait
		choose menu "Какая помощь вам нужна?"
		endchoose
		dialog "[Лун]"
		dialog "Ты участвовал в разведении огня? Я наблюдал со стороны... И ветвь дерева, которую ты принёс..."
		wait
		choose menu "Смоляная ветка?"
		endchoose
		dialog "[Лун]"
		dialog "Похоже, это была ветка, в которую я попал..."
		wait
		choose menu "Правда?"
		endchoose
		dialog "[Лун]"
		dialog "Нет, что ты, это... недоразумение! Ошибка... Несчастный сл... а уже и не важно."
		wait
		dialog "[Лун]"
		dialog "Как ты знаешь, я волшебник ^000000Лун, посланный из Башни Геффен^0000cd для разведения огней для фестиваля."
		wait
		dialog "[Лун]"
		dialog "Как видите, огонь не гаснет, дрова не тлеют... И пепел не разбрасывается вокруг..."
		wait
		dialog "[Лун]"
		dialog "Иногда, когда мне нужно порадоваться, я делаю фальшивый огонь размером с дом, чтобы люди были счастливы..."
		wait
		dialog "[Лун]"
		dialog "Звучит это неплохо, да? Но на самом деле мне уже очень скучно. Рабочее время меньше нескольких минут в день..."
		wait
		dialog "[Лун]"
		dialog "А я ненавижу скучать больше всего на свете... Правда..."
		wait
		choose menu "Что было дальше?"
		endchoose
		dialog "[Лун]"
		dialog "Итак... Мне было скучно и я играл с ветками, которые приносили люди... То есть... Экспериментировал с магией... Итак... Я пробовал магию, которая делает сухие дрова - свежими..."
		wait
		choose menu "Так..."
		endchoose
		dialog "[Лун]"
		dialog "Они, в общем..."
		wait
		choose menu "Что?"
		endchoose
		dialog "[Лун]"
		dialog "В общем, они ожили..."
		wait
		dialog "[Лун]"
		dialog "......"
		Emotion "Лун#19_thx" 40
		wait
		choose menu "Так это из-за тебя?"
		endchoose
		dialog "[Лун]"
		dialog "Ты уже видел Оживших веток, да? Дело в том, что они еще и множатся... Такими темпами весь Мидгард будет скоро покрыт воскрешёнными ветками!"
		wait
		dialog "[Лун]"
		dialog "Но...? Если задуматься, если ветви будут продолжать воскресать и их число будет расти, люди могут научиться жить с Ожившими ветками."
		wait
		dialog "[Лун]"
		dialog "Примете ли вы эти ветви как новых членов общества? Рано или поздно они придут учиться в Геффен? Потом у меня появятся новые выпускники. Это ведь хорошо!"
		wait
		dialog "[Лун]"
		dialog "И тогда они начнут использовать магию против меня самого! Вспомнят, как я их сжигал! Это плохо! Плохо!"
		wait
		dialog "[Лун]"
		dialog "Надо с этим что-то делать! Пока эти ветки не слишком сильные и не агрессивные."
		wait
		choose menu "Верно "
		endchoose
		dialog "[Лун]"
		dialog "Я должен контролировать огонь здесь... Но и думать о том, как остановить нашествие веток..."
		wait
		dialog "[Лун]"
		dialog "Лана пока не знает ничего. Я даже не знала, что ветви воскресли, пока до меня не донеслись слухи."
		wait
		dialog "[Лун]"
		dialog "Итак, я прошу вас пройтись по окрестностям и уничтожить Ожившие ветки. И принести мне ^0000cd10 Смоляных веток^000000 в качестве доказательств, разумеется."
		wait
		dialog "[Лун]"
		dialog "Прошу, сделайте это быстро и тихо, не рассказывайте Лане..."
		completequest 3365
		setquest 3369
		close
		return
	break
	case 2
		dialog "[Лун]"
		dialog "А... Ты должно быть очень занят, если у тебя нет времени на спасение мира..."
		wait
		dialog "[Лун]"
		dialog "Что же... Продолжай в том же духе..."
		close
		return
	break
	endchoose
elseif (thx_3369 == 1)
	DisableItemMove
	if ((v[Goodly_Bough] > 9) & (hunt_chek01 == 2))
		dialog "[Лун]"
		dialog "Хм... Ветки выглядят лучше, чем было раньше. Уже не такие сухие и... Ой, я хотел сказать, что..."
		wait
		ShowEffect "Дрова#19_thx01" EF_POTION4
		dialog "[Лун]"
		dialog "Вообще-то, ты очень быстро расправляешься с этими ветками! Конечно, я мог бы исправить всё, как положено... Но ведь и у тебя хорошо получается."
		wait
		dialog "[Лун]"
		dialog "И у меня... Хе-хе..."
		wait
		choose menu "Так что мне делать?"
		endchoose
		dialog "[Лун]"
		dialog "Я думаю, тебе стоит прийти еще и завтра. Я не беспечный, просто ситуация такая..."
		wait
		dialog "[Лун]"
		dialog "А взамен я вам дам лотерейный билет, думаю вы сможете выиграть что-нибудь достойное."
		wait
		dialog "[Лун]"
		dialog "Вы можете испытать удачу у <NAVI>[Лотерея]<INFO>alberta.gat,141,188,0,101,0</INFO></NAVI>, один билет - одна попытка."
		erasequest 3369
		dropitem Goodly_Bough 10
		getitem Harvest_Lottery_Ticket 1
		setquest 3370
		close
		EnableItemMove
		return
	else
		if (v[Goodly_Bough] < 10)
			dialog "[Лун]"
			dialog "Вы не принесли ничего? Очень жаль..."
			wait
			dialog "[Лун]"
			dialog "Вы пообещали мне истребить Ожившие ветки. А без доказательств я вам не верю."
			wait
			dialog "[Лун]"
			dialog "Итак, снова... Я прошу вас пройтись по окрестностям и уничтожить Ожившие ветки. И принести мне ^0000cd10 Смоляных веток^000000 в качестве доказательств."
			close
			EnableItemMove
			return
		elseif (hunt_chek01 < 2)
			dialog "[Лун]"
			dialog "Хм... мне кажется вы меня перехитрить вздумали!"
			wait
			dialog "[Лун]"
			dialog "Вы пообещали мне истребить Ожившие ветки. А без доказательств я вам не верю."
			wait
			dialog "[Лун]"
			dialog "Итак, снова... Я прошу вас пройтись по окрестностям и уничтожить Ожившие ветки. И принести мне ^0000cd10 Смоляных веток^000000 в качестве доказательств."
			close
			EnableItemMove
			return
		endif
	endif
elseif (thx_3370 == 1)
	if (time_check01 == 2)
		dialog "[Лун]"
		dialog "Эй, путник! Иди быстрее сюда! Нашествие продолжается..."
		wait
		choose menu "Что тебе нужно?" "Сегодня я занят "
		case 1
			dialog "[Лун]"
			dialog "Итак, снова... Я прошу вас пройтись по окрестностям и уничтожить Ожившие ветки. И принести мне ^0000cd10 Смоляных веток^000000 в качестве доказательств."
			erasequest 3370
			setquest 3369
			close
			return
		break
		case 2
			dialog "[Лун]"
			dialog "А... Ты должно быть очень занят, если у тебя нет времени на спасение мира..."
			erasequest 3370
			close
			return
		break
		endchoose
	else
		dialog "[Лун]"
		dialog "Пока Ожившие ветки удалось остановить... Но не думаю, что это надолго. Возвращайся завтра."
		close
		return
	endif
elseif ((thx_3364 == 2) & (thx_3369 == 0) & (thx_3370 == 0))
	dialog "[Лун]"
	dialog "Эй, путник! Иди быстрее сюда! Нашествие продолжается..."
	wait
	choose menu "Что тебе нужно?" "Сегодня я занят "
	case 1
		dialog "[Лун]"
		dialog "Итак, снова... Я прошу вас пройтись по окрестностям и уничтожить Ожившие ветки. И принести мне ^0000cd10 Смоляных веток^000000 в качестве доказательств."
		setquest 3369
		close
		return
	break
	case 2
		dialog "[Лун]"
		dialog "А... Ты должно быть очень занят, если у тебя нет времени на спасение мира..."
		close
		return
	break
	endchoose
else
	dialog "[Лун]"
	dialog "Весь Мидгард в опасности из-за меня..."
	close
	return
endif

// =====================================================
npc "alberta" "Дрова#19_thx01" 4_WOODPILE 131 160 5 0 0
npc "alberta" "Дрова#19_thx02" 4_WOODPILE 132 159 5 0 0
//=========================================================================


// =======================================================
npc "alberta" "Серена#19_thx" 4_F_JOB_HUNTER 152 198 3 5 5
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3366
SetQuestConditionBegin 3366 1 4
SetQuestConditionQuest 3366 1
SetQuestConditionEnd

AddQuestIDCondition 3371
SetQuestConditionBegin 3371 1 5
SetQuestConditionQuest 3371 1
SetQuestConditionItem 25390 9 "<"
SetQuestConditionEnd

AddQuestIDCondition 3372
SetQuestConditionBegin 3372 1 4
SetQuestConditionQuest 3372 2
SetQuestConditionEnd

SetQuestConditionBegin 3372 1 4
SetQuestConditionQuest 3364 3
SetQuestConditionQuest 3371 0
SetQuestConditionQuest 3372 0
SetQuestConditionEnd
return

OnTouch2:
var thx_3364 = isbegin_quest 3364
var thx_3366 = isbegin_quest 3366
var thx_3371 = isbegin_quest 3371
var thx_3372 = isbegin_quest 3372
if ((thx_3366 == 1) | ((thx_3371 == 0) & (thx_3372 == 0) & (thx_3364 == 2)))
	Talk2me "Серена#19_thx" "Мы ищем человека более смелого и терпеливого, чем кто-либо другой!"
endif
return

OnClick:
//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Серена]"
	dialog "Если вы хотите принять участие в фестивале, освободите свой инвентарь."
	close
	return
else
endif
//==============================================================================
var thx_3364 = isbegin_quest 3364
var thx_3366 = isbegin_quest 3366
var thx_3371 = isbegin_quest 3371
var thx_3372 = isbegin_quest 3372
var time_check01 = checkquest_playtime 3372
if (thx_3366 == 1)
	dialog "[Серена]"
	dialog "Привет. Вы здесь на праздник? Вы похожи на опытного искателя приключений, как считаете?"
	wait
	choose menu "Я тоже так считаю "
	endchoose
	dialog "[Серена]"
	dialog "В такое время, когда все делятся друг с другом едой... Вы когда-нибудь слышали о кабане, забирающемся в частный дом, потому что он голоден?"
	wait
	dialog "[Серена]"
	dialog "Иногда они уничтожают посевы, которые еще растут, и съедают лучшее из того, что собрали. В это время года люди охотятся на кабанов..."
	wait
	dialog "[Серена]"
	dialog "Конечно, я охотник, но кабаны просто голодны и спускаются за пропитанием. Нет смысла охотиться на кабанов! Но ведь и люди не должны пострадать..."
	wait
	dialog "[Серена]"
	dialog "Поэтому наш руководящий состав принял решение прекратить охоту на диких кабанов."
	wait
	dialog "[Серена]"
	dialog "Однако бороться с кабанами как-то надо, и мы придумали способ. Правда... Никто пока что не хочет в этом участвовать..."
	wait
	dialog "[Серена]"
	dialog "Мы изготовили ловушки для кабанов. Без вреда для них, мы устраняем проблему нашу!"
	wait
	dialog "[Серена]"
	dialog "Как насчёт того, чтобы помочь нам поймать кабанов? Это ведь совершенно гуманное решение, не так ли?"
	wait
	choose menu "Давай попробуем!" "Вообще-то я занят "
	case 1
		dialog "[Серена]"
		dialog "Отлично! Ты не пожалеешь, это благое дело."
		wait
		dialog "[Серена]"
		dialog "Здесь можно взять специальную ловушку, с помощью которой можно поймать кабана."
		wait
		dialog "[Серена]"
		dialog "Поймайте не менее 10 Голодных кабанов. Не убивайте, их, пожалуйста, а именно поймайте."
		completequest 3366
		setquest 3371
		getitem Savage_Trap 1
		close
		return
	break
	case 2
		dialog "[Серена]"
		dialog "Ладно. Когда у вас будет время, можете прийти снова."
		close
		return
	break
	endchoose
elseif (thx_3371 == 1)
	DisableItemMove
	dialog "[Серена]"
	dialog "Ну что, ты поймал кабанов?"
	wait
	var thx_trap = v[Captured_Savage]
	if (v[Captured_Savage] > 9)
		dialog "[Серена]"
		dialog "Один... два... Ты единственный, поймавший их за такое короткое время. У тебя отлично получилось!"
		wait
		dialog "[Серена]"
		dialog "Как и обещала, вот билет. Принять участие можно у <NAVI>[Лотерея]<INFO>alberta.gat,141,188,0,101,0</INFO></NAVI>, один билет - одна попытка."
		wait
		dialog "[Серена]"
		dialog "Кроме того, думаю, за скорость вам полагается билет на корабль, вы ведь наверняка устали по дороге сюда. Спросите <NAVI>[Капитан корабля]<INFO>alberta.gat,140,170,0,101,0</INFO></NAVI>."
		wait
		dialog "[Серена]"
		dialog "Мы починим эту ловушку и выпустим всех пойманных кабанов. Могу я тебя попросить прийти и завтра?"
		erasequest 3371
		dropitem Savage_Trap 1
		dropitem Captured_Savage thx_trap
		setquest 3372
		getitem Free_Pass_Ticket 1
		getitem Harvest_Lottery_Ticket 1
		close
		EnableItemMove
		return
	else
		dialog "[Серена]"
		dialog "Вам нужно поймать не менее 10 Голодных кабанов."
		close
		EnableItemMove
		return
	endif
elseif (thx_3372 == 1)
	if (time_check01 == 2)
		dialog "[Серена]"
		dialog "Доброе утро! Сегодня хорошая погода, верно? В такие дни кабаны становятся более активными. Поможешь мне сегодня?"
		wait
		choose menu "Конечно, я помогу " "Я хочу отдохнуть..."
		case 1
			dialog "[Серена]"
			dialog "Отлично! Ты не пожалеешь, это благое дело."
			wait
			dialog "[Серена]"
			dialog "Здесь можно взять специальную ловушку, с помощью которой можно поймать кабана."
			wait
			dialog "[Серена]"
			dialog "Поймайте не менее 10 Голодных кабанов. Не убивайте, их, пожалуйста, а именно поймайте."
			erasequest 3372
			setquest 3371
			getitem Savage_Trap 1
			close
			return
		break
		case 2
			dialog "[Серена]"
			dialog "Ладно. Когда у вас будет время, можете прийти снова."
			erasequest 3372
			close
			return
		break
		endchoose
	else
		dialog "[Серена]"
		dialog "Мы починим эту ловушку и выпустим всех пойманных кабанов. Могу я тебя попросить прийти завтра?"
		close
		return
	endif
elseif ((thx_3364 == 2) & (thx_3371 == 0) & (thx_3372 == 0))
	dialog "[Серена]"
	dialog "Доброе утро! Сегодня хорошая погода, верно? В такие дни кабаны становятся более активными. Поможешь мне сегодня?"
	wait
	choose menu "Конечно, я помогу " "Я хочу отдохнуть..."
	case 1
		dialog "[Серена]"
		dialog "Отлично! Ты не пожалеешь, это благое дело."
		wait
		dialog "[Серена]"
		dialog "Здесь можно взять специальную ловушку, с помощью которой можно поймать кабана."
		wait
		dialog "[Серена]"
		dialog "Поймайте не менее 10 Голодных кабанов. Не убивайте, их, пожалуйста, а именно поймайте."
		setquest 3371
		getitem Savage_Trap 1
		close
		return
	break
	case 2
		dialog "[Серена]"
		dialog "Ладно. Когда у вас будет время, можете прийти снова."
		close
		return
	break
	endchoose
else
	dialog "[Серена]"
	dialog "Мы починим эту ловушку и выпустим всех пойманных кабанов. Могу я тебя попросить прийти завтра?"
	close
	return
endif
return

// =========================================================
npc "alberta" "Ева#19_thx" 4_F_TWMIDWOMAN 119 193 3 5 5
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3367
SetQuestConditionBegin 3367 1 4
SetQuestConditionQuest 3367 1
SetQuestConditionEnd

AddQuestIDCondition 3373
SetQuestConditionBegin 3373 1 5
SetQuestConditionQuest 3373 1
SetQuestConditionItem 577 0 "<"
SetQuestConditionItem 518 2 "<"
SetQuestConditionItem 511 9 "<"
SetQuestConditionEnd

AddQuestIDCondition 3374
SetQuestConditionBegin 3374 1 5
SetQuestConditionQuest 3374 1
SetQuestConditionItem 7452 0 "<"
SetQuestConditionItem 1019 2 "<"
SetQuestConditionEnd

AddQuestIDCondition 3375
SetQuestConditionBegin 3375 1 5
SetQuestConditionQuest 3375 1
SetQuestConditionItem 7454 0 "<"
SetQuestConditionItem 568 2 "<"
SetQuestConditionItem 515 9 "<"
SetQuestConditionEnd

AddQuestIDCondition 3376
SetQuestConditionBegin 3376 1 4
SetQuestConditionQuest 3376 2
SetQuestConditionEnd
SetQuestConditionBegin 3376 1 4
SetQuestConditionQuest 3364 3
SetQuestConditionQuest 3373 0
SetQuestConditionQuest 3374 0
SetQuestConditionQuest 3375 0
SetQuestConditionQuest 3376 0
SetQuestConditionEnd
return

OnTouch2:
var thx_3364 = isbegin_quest 3364
var thx_3367 = isbegin_quest 3367
var thx_3373 = isbegin_quest 3373
var thx_3374 = isbegin_quest 3374
var thx_3375 = isbegin_quest 3375
var thx_3378 = isbegin_quest 3378
if ((thx_3367 == 1) | ((thx_3364 == 2) & (thx_3373 == 0) & (thx_3374 == 0) & (thx_3375 == 0)))
	Talk2me "Ева#19_thx" "Как насчет того, чтобы приготовить немного еды?"
endif
return

OnClick:
//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Ева]"
	dialog "Если вы хотите принять участие в фестивале, освободите свой инвентарь."
	close
	return
else
endif
//==============================================================================
var thx_3364 = isbegin_quest 3364
var thx_3367 = isbegin_quest 3367
var thx_3373 = isbegin_quest 3373
var thx_3374 = isbegin_quest 3374
var thx_3375 = isbegin_quest 3375
var thx_3376 = isbegin_quest 3376
var thx_3377 = isbegin_quest 3377
var thx_3381 = isbegin_quest 3381
var thx_3385 = isbegin_quest 3385
var time_check01 = checkquest_playtime 3376
if ((thx_3367 == 1) | ((thx_3364 == 2) & (thx_3373 == 0) & (thx_3374 == 0) & (thx_3375 == 0) & (thx_3376 == 0)))
	dialog "[Ева]"
	dialog "Привет, я видела вы развёли огонь. А ты... Часто посещаешь такие фестивали?"
	wait
	choose menu "Стараюсь не пропускать "
	endchoose
	dialog "[Ева]"
	dialog "Правда много людей здесь? И ведь все эти люди прибыли сюда, в Альберту, чтобы поучаствовать в фестивале."
	wait
	dialog "[Ева]"
	dialog "Некоторые люди, конечно, приезжают в свой родной город. Но большая часть - это люди, которые приплывают издалека."
	wait
	dialog "[Ева]"
	dialog "Достаточно часто люди приплывают одни. Они так и проводят фестиваль в одиночестве... Но ведь это неправильно."
	wait
	dialog "[Ева]"
	dialog "Может ты сможешь скрасить их одиночество, приготовив пару порций праздничного ужина?"
	wait
	var my_food = rand 1 3
	if (my_food == 1)
		dialog "[Густав]"
		dialog "Я приготовлю! Только принеси ингредиенты."
		Talk2me "Густав#19_thx" "Я приготовлю!"
		setquest 3373
		erasequest 3367
		wait
		dialog "[Ева]"
		dialog "Ты поможешь?"
		wait
		dialog "[Густав]"
		dialog "Конечно. Не вам же это доверить, в самом деле..."
		wait
		dialog "[Ева]"
		dialog "Что? Почему не нам? Ладно... Тебе скорее всего лучше знать. Какие продукты тебе нужны?"
		wait
		dialog "[Густав]"
		dialog "Посмотрим... сегодня у нас воздушная пшеница в меду."
		Talk2me "Густав#19_thx" "Посмотрим... сегодня у нас воздушная пшеница в меду."
		wait
		dialog "[Ева]"
		dialog "Звучит аппетитно!"
		wait
		dialog "[Густав]"
		dialog "А на вкус еще лучше!"
		wait
		dialog "[Ева]"
		dialog "А что тебе для этого нужно? Есть рецепт?"
		wait
		dialog "[Густав]"
		dialog "Рецепт я свой не расскажу, но вот что мне нужно: ^0000cd1 Сухих зёрен, 3 Мёда, 10 Зелёной травы^000000."
		wait
		dialog "[Густав]"
		dialog "Принеси, и поскорее!"		
		close
		return
	elseif (my_food == 2)
		dialog "[Астрид]"
		dialog "Может быть лучше чай?"
		Talk2me "Астрид#19_thx" "Может быть лучше чай?"
		setquest 3374
		erasequest 3367
		wait
		dialog "[Ева]"
		dialog "Астрид, что ты говоришь?"
		wait
		dialog "[Астрид]"
		dialog "Что может быть лучше теплого, согревающего душу чая!"
		wait
		dialog "[Ева]"
		dialog "И правда, ты поможешь нам?"
		wait
		dialog "[Астрид]"
		dialog "Конечно! Мне только нужна ^0000cdЖёлтая приправа^000000 к торту."
		Talk2me "Астрид#19_thx" "Конечно!"
		wait
		dialog "[Ева]"
		dialog "Я думаю это не проблема, правда?"
		wait
		dialog "[Астрид]"
		dialog "Только вот ещё что. У меня заканчиваются дрова для топки печи, а я не могу отвлечься сейчас."
		wait
		dialog "[Астрид]"
		dialog "Пожалуйста, принеси ^0000cd1 Жёлтую приправу и 3 Полена^000000, для растопки печи."
		close
		return
	else
		dialog "[Луи]"
		dialog "Кажется, сейчас моя очередь готовить..."
		Talk2me "Луи#19_thx" "Кажется, сейчас моя очередь готовить..."
		setquest 3375
		erasequest 3367
		wait
		dialog "[Ева]"
		dialog "Луи, в прошлый раз мы вообще остались без ужина..."
		wait
		dialog "[Луи]"
		dialog "Это вышло случайно! Кто же знал, что из перьев не получится суп..."
		wait
		dialog "[Ева]"
		dialog "Перьев? Как бы твои эксперименты нам не повредили..."
		wait
		dialog "[Луи]"
		dialog "Они не могут вам навредить! У меня большой опыт!"
		Talk2me "Луи#19_thx" "Они не могут вам навредить!"
		wait
		dialog "[Ева]"
		dialog "Хорошо, ладно... Что у нас сегодня в меню?"
		wait
		dialog "[Луи]"
		dialog "Изысканный морковно-лимонный коктейль и ягоды в сахаре на десерт."
		wait
		dialog "[Ева]"
		dialog "Думаю, мы можем обойтись и без десерта..."
		wait
		dialog "[Луи]"
		dialog "Ничего вы не понимаете в кухонном творчестве!"
		wait
		dialog "[Луи]"
		dialog "Раз уж десерта в этот раз не заказали, мне будет достаточно ^0000cd1 Пряного соуса, 10 Моркови и 3 Лимона^000000."
		close
		return
	endif
elseif (thx_3373 == 1)
	DisableItemMove
	dialog "[Ева]"
	dialog "Ты уже здесь? Принёс необходимые продукты?"
	wait
	if ((v[Grain] > 0) & (v[Honey] > 2) & (v[Green_Herb] > 9))
		dialog "[Ева]"
		dialog "Так... вроде всё свежее! Теперь мне нужно время это всё приготовить."
		wait
		ShowEffect "Дрова#19_thx03" EF_FIREWALL
		DelayTime 1000
		ShowEffect "Дрова#19_thx03" 608
		DelayTime 1000
		dialog "[Густав]"
		dialog "Всё готово, можно относить!"
		wait
		dialog "[Ева]"
		dialog "Я этим займусь, спасибо."
		wait
		dialog "[Ева]"
		dialog "И тебе спасибо, путник. Как и обещала, твой лотерейный билет."
		dropitem Grain 1
		dropitem Honey 3
		dropitem Green_Herb 10
		getitem Harvest_Lottery_Ticket 2
		erasequest 3373
		setquest 3376
		if (thx_3381 == 0)
			setquest 3381 
			Talk2me "Густав#19_thx" "А как пахнет..."
			close
			EnableItemMove
			return
		endif
		close
		EnableItemMove
		return
	else
		dialog "[Ева]"
		dialog "Помнишь, что попросил Густав? ^0000cd1 Сухие зёрна, 3 Мёда, 10 Зелёной травы^000000."
		close
		EnableItemMove
		return
	endif
elseif (thx_3374 == 1)
	DisableItemMove
	dialog "[Ева]"
	dialog "Ты уже здесь? Принёс необходимые продукты?"
	wait
	if ((v[Yellow_Spice] > 0) & (v[Wooden_Block] > 2))
		dialog "[Ева]"
		dialog "Уже отсюда чувствую, отличные специи!"
		wait
		dialog "[Астрид]"
		dialog "Клади дрова в костёр, а я пока займусь тортом."
		wait
		ShowEffect "Дрова#19_thx02" EF_FIREWALL
		DelayTime 1000
		ShowEffect "Дрова#19_thx02" 608
		DelayTime 1000
		dialog "[Астрид]"
		dialog "Готово!"
		wait
		dialog "[Ева]"
		dialog "Раздачу я возьму на себя, не беспокойся об этом."
		wait
		dialog "[Ева]"
		dialog "Спасибо тебе большое. Ты обеспечил нам всем приятный вечер. Как и обещала, твой лотерейный билет."
		dropitem Yellow_Spice 1
		dropitem Wooden_Block 3
		getitem Harvest_Lottery_Ticket 1
		erasequest 3374
		setquest 3376
		if (thx_3385 == 0)
			setquest 3385 
			Talk2me "Астрид#19_thx" "Эй, подождите меня!"
			close
			EnableItemMove
			return
		endif

	else
		dialog "[Ева]"
		dialog "Помнишь, что просила Астрид? Это: ^0000cd1 Жёлтая приправа и 3 Полена^000000, для растопки печи."
		close
		EnableItemMove
		return
	endif
elseif (thx_3375 == 1)
	DisableItemMove
	dialog "[Ева]"
	dialog "Ты уже здесь? Принёс необходимые продукты?"
	wait
	if ((v[Plain_Sauce] > 0) & (v[Lemon] > 2) & (v[Carrot] > 9))
		dialog "[Ева]"
		dialog "Отлично!"
		wait
		dialog "[Луи]"
		dialog "Давай их скорее сюда, пряный соус, надеюсь, свежий... Иначе ничего не получится!"
		wait
		ShowEffect "Дрова#19_thx01" EF_FIREWALL
		DelayTime 1000
		ShowEffect "Дрова#19_thx01" 608
		DelayTime 1000
		dialog "[Луи]"
		dialog "Готово. Думаю, среди жарких костров освежающий коктейль будет совсем кстати."
		wait
		dialog "[Ева]"
		dialog "Раздачу я возьму на себя, не беспокойся об этом."
		wait
		dialog "[Ева]"
		dialog "Спасибо тебе большое. Ты обеспечил нам всем приятный вечер. Как и обещала, твой лотерейный билет."
		dropitem Plain_Sauce 1
		dropitem Lemon 3
		dropitem Carrot 10
		getitem Harvest_Lottery_Ticket 2
		erasequest 3375
		setquest 3376
		if (thx_3377 == 0)
			setquest 3377 
			Talk2me "Луи#19_thx" "Как это аллергия на морковь? Быстро пей!"
			close
			EnableItemMove
			return
		endif
	else
		dialog "[Ева]"
		dialog "Помнишь что просил Луи? Ему не хватало ^0000cd1 Пряного соуса, 10 Моркови и 3 Лимонов^000000."
		close
		EnableItemMove
		return
	endif
elseif (thx_3376 == 1)
	var thx_3375 = isbegin_quest 3375
	var thx_3373 = isbegin_quest 3373
	var thx_3374 = isbegin_quest 3374
	var thx_3377 = isbegin_quest 3377
	var thx_3381 = isbegin_quest 3381
	var thx_3385 = isbegin_quest 3385
	if (time_check01 == 2)
		dialog "[Ева]"
		dialog "Добрый вечер, ты снова здесь? Знаешь, было бы неплохо немного разнообразить сегодняшнее меню..."
		wait
		choose menu "Конечно " "Мне пора..."
		case 1
			if (((thx_3377 == 1) | (thx_3377 == 2)) & (thx_3381 == 0) & (thx_3385 == 0))
				var my_food = rand 1 2
				if (my_food == 1)
					dialog "[Ева]"
					dialog "Густав займется готовкой, но ему нужны: ^0000cd1 Сухие зёрна, 3 Мёда, 10 Зелёной травы^000000."
					erasequest 3376
					setquest 3373
					close
					return
				else
					dialog "[Ева]"
					dialog "Серена займется готовкой, но ей нужны: ^0000cd1 Жёлтая специя, 3 Полена^000000."
					erasequest 3376
					setquest 3374
					close
					return
				endif
			elseif ((thx_3377 == 0) & ((thx_3381 == 1) | (thx_3381 == 2)) & (thx_3385 == 0))
				var my_food = rand 1 2
				if (my_food == 1)
					dialog "[Ева]"
					dialog "Серена займется готовкой, но ей нужны: ^0000cd1 Жёлтая специя, 3 Полена^000000."
					erasequest 3376
					setquest 3374
					close
					return
				else
					dialog "[Ева]"
					dialog "Луи займется готовкой, но ему нужны: ^0000cd1 Пряный соус, 3 Лимона, 10 Моркови^000000."
					erasequest 3376
					setquest 3375
					close
					return
				endif
			elseif ((thx_3377 == 0) & (thx_3381 == 0) & ((thx_3385 == 1) | (thx_3385 == 2)))
				var my_food = rand 1 2
				if (my_food == 1)
					dialog "[Ева]"
					dialog "Густав займется готовкой, но ему нужны: ^0000cd1 Сухие зёрна, 3 Мёда, 10 Зелёной травы^000000."
					erasequest 3376
					setquest 3373
					close
					return
				else
					dialog "[Ева]"
					dialog "Луи займется готовкой, но ему нужны: ^0000cd1 Пряный соус, 3 Лимона, 10 Моркови^000000."
					erasequest 3376
					setquest 3375
					close
					return
				endif
			elseif ((thx_3375 == 0) | (thx_3377 == 0)) & ((thx_3381 == 1) | (thx_3381 == 2)) & ((thx_3385 == 1) | (thx_3385 == 2))
					dialog "[Ева]"
					dialog "Луи займется готовкой, но ему нужны: ^0000cd1 Пряный соус, 3 Лимона, 10 Моркови^000000."
					erasequest 3376
					setquest 3375
					close
					return
			elseif ((thx_3373 == 0) | (thx_3381 == 0)) & ((thx_3377 == 1) | (thx_3377 == 2)) & ((thx_3385 == 1) | (thx_3385 == 2))
					dialog "[Ева]"
					dialog "Густав займется готовкой, но ему нужны: ^0000cd1 Сухие зёрна, 3 Мёда, 10 Зелёной травы^000000."
					erasequest 3376
					setquest 3373
					close
					return
			elseif ((thx_3374 == 0) | (thx_3385 == 0)) & ((thx_3377 == 1) | (thx_3377 == 2)) & ((thx_3381 == 1) | (thx_3381 == 2))
					dialog "[Ева]"
					dialog "Серена займется готовкой, но ей нужны: ^0000cd1 Жёлтая специя, 3 Полена^000000."
					erasequest 3376
					setquest 3374
					close
					return
			else
				var my_feed = rand 1 3
				if (my_feed == 1)
					dialog "[Ева]"
					dialog "Густав займется готовкой, но ему нужны: ^0000cd1 Сухие зёрна, 3 Мёда, 10 Зелёной травы^000000."
					erasequest 3376
					setquest 3373
					close
					return
				elseif (my_feed == 2)
					dialog "[Ева]"
					dialog "Серена займется готовкой, но ей нужны: ^0000cd1 Жёлтая специя, 3 Полена^000000."
					erasequest 3376
					setquest 3374
					close
					return
				else
					dialog "[Ева]"
					dialog "Луи займется готовкой, но ему нужны: ^0000cd1 Пряный соус, 3 Лимона, 10 Моркови^000000."
					erasequest 3376
					setquest 3375
					close
					return
				endif
			endif
		break
		case 2
			dialog "[Ева]"
			dialog "Вы пришли просто посмотреть, как готовится еда? Можете заглянуть, но не мешайте, пожалуйста."
			close
			return
		break
		endchoose
	else
		dialog "[Ева]"
		dialog "Вы уже пришли? Мы сейчас пока готовим и нам ничего не нужно, спасибо. Возвращайтесь завтра."
		close
		return
	endif

else
	dialog "[Ева]"
	dialog "Люди приезжают посмотреть на огни фестиваля. Как это приятно..."
	close
	return
endif
return

// =======================================================
npc "alberta" "Густав#19_thx" 4_M_DWARF 119 198 3 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3381
SetQuestConditionBegin 3381 1 4
SetQuestConditionQuest 3381 1
SetQuestConditionQuest 3376 1
SetQuestConditionQuest 3373 0
SetQuestConditionEnd

AddQuestIDCondition 3382
SetQuestConditionBegin 3382 1 5
SetQuestConditionQuest 3382 1
SetQuestConditionItem 25392 1 "<"
SetQuestConditionEnd

AddQuestIDCondition 3383
SetQuestConditionBegin 3383 1 5
SetQuestConditionQuest 3383 1
SetQuestConditionItem 25392 1 "<"
SetQuestConditionEnd

SetQuestConditionBegin 3383 1 4
SetQuestConditionQuest 3384 2
SetQuestConditionEnd

SetQuestConditionBegin 3383 1 4
SetQuestConditionQuest 3381 2
SetQuestConditionQuest 3382 2
SetQuestConditionQuest 3383 0
SetQuestConditionQuest 3384 0
SetQuestConditionEnd
return

OnClick:
//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Густав]"
	dialog "Если вы хотите принять участие в фестивале, освободите свой инвентарь."
	close
	return
else
endif
//==============================================================================
Talk2me "Густав#19_thx" "Вы только попробуйте... Пальчики оближешь, правда ведь?"
var thx_3381 = isbegin_quest 3381
var thx_3382 = isbegin_quest 3382
var thx_3383 = isbegin_quest 3383
var thx_3384 = isbegin_quest 3384
var thx_time = checkquest_playtime 3384
if (thx_3381 == 1)
	dialog "[Густав]"
	dialog "О, приветствую. Это вы помогали Еве с праздничным ужином?"
	wait
	choose menu "Да, это я "
	endchoose
	dialog "[Густав]"
	dialog "Каждый год в этот фестиваль урожая у меня такой плотный график, что мне не удаётся даже увидеться с семьёй."
	wait
	dialog "[Густав]"
	dialog "Эх... моя дочь Кейли всегда хотела жить здесь..."
	wait
	dialog "[Густав]"
	dialog "Она мечтала стать торговцем здесь, в Альберте, но я её отговаривал... Ну вы знаете, эти моряки..."
	wait
	dialog "[Густав]"
	dialog "Лучше бы ей остановиться в городе поспокойнее..."
	wait
	dialog "[Густав]"
	dialog "Я бы мог с ней повидаться, но разве я могу бросить всех этих людей?"
	wait
	dialog "[Густав]"
	dialog "Хотя, ничего же не случится, если я уеду всего на полдня, верно?"
	wait
	choose menu "Конечно "
	endchoose
	dialog "[Густав]"
	dialog "Но для того, чтобы мне проведать дочь, нужно достать где-то билеты на корабль..."
	wait
	choose menu "Я достану билеты " "Вообще-то я занят..."
		case 1
			dialog "[Густав]"
			dialog "Спасибо тебе большое! Что бы я без тебя делал..."
			wait
			dialog "[Густав]"
			dialog "Пожалуйста, принеси ^0000cd2 Билета на корабль^000000, чтобы я мог вернуться и обратно тоже."
			close
			completequest 3381
			setquest 3382
			return
		break
		case 2
			dialog "[Густав]"
			dialog "А, конечно... Хорошо..."
		break
	endchoose
endif

if (thx_3382 == 1)
	if (v[Free_Pass_Ticket] > 1)
		dialog "[Густав]"
		dialog "Два билета! Вот спасибо."
		wait
		dialog "[Густав]"
		dialog "Знаешь, у меня здесь затерялись ^0000cd2 Лотерейных билета^000000... Я в эти мероприятия не особо верю, а тут вот посетители забыли на столе."
		completequest 3382
		setquest 3384
		dropitem Free_Pass_Ticket 2
		getitem Harvest_Lottery_Ticket 2 
		close
	else
		dialog "[Густав]"
		dialog "Пожалуйста, принеси ^0000cd2 Билета на корабль^000000, чтобы я мог проведать мою дочь Кейли."
		close
		return
	endif
endif

if (thx_3384 == 1)
	if (thx_time == 2)
	dialog "[Густав]"
	dialog "О, приветствую снова!"
	wait
	dialog "[Густав]"
	dialog "Помнишь, я тебя просил достать ^0000cd2 Билета на корабль^000000, так вот мне бы пригодились еще парочку..."
	wait
	dialog "[Густав]"
	dialog "Я бы мог с Кейли повидаться. Ничего же не случится, если я уеду всего на полдня, верно?"
	wait
	choose menu "Я достану билеты " "Вообще-то я занят..."
		case 1
			dialog "[Густав]"
			dialog "Спасибо тебе большое! Что бы я без тебя делал..."
			wait
			dialog "[Густав]"
			dialog "Пожалуйста, принеси ^0000cd2 Билета на корабль^000000, чтобы я мог вернуться и обратно тоже."
			close
			erasequest 3384
			setquest 3383
			return
		break
		case 2
			dialog "[Густав]"
			dialog "А, конечно... Хорошо..."
		break
	endchoose
	else
		dialog "[Густав]"
		dialog "Спасибо тебе большое, что выручил. Думаю может проведать Кейли еще и завтра..."
		wait
		dialog "[Густав]"
		dialog "А пока, мне надо работать. Ведь посетителей всё больше!"
		close
		return
	endif
endif
	
if ((thx_3383 == 1) & (thx_3384 == 0))
	if (v[Free_Pass_Ticket] > 1)
		dialog "[Густав]"
		dialog "Два билета! Вот спасибо."
		wait
		dialog "[Густав]"
		dialog "Знаешь, у меня здесь затерялись ^0000cd2 Лотерейных билета^000000... Я в эти мероприятия не особо верю, а тут вот посетители забыли на столе."
		erasequest 3383
		setquest 3384
		dropitem Free_Pass_Ticket 2
		getitem Harvest_Lottery_Ticket 2
		close
		return
	else
		dialog "[Густав]"
		dialog "Пожалуйста, принеси ^0000cd2 Билета на корабль^000000, чтобы я мог проведать мою дочь Кейли."
		close
		return
	endif
endif

//================================================================================================
		
return

npc "alberta" "Дрова#19_thx03" 4_TRACE 118 197 1 0 0
OnClick:
Talk2me "Густав#19_thx" "Так, не подходите близко к огню!"
Talk2me "Астрид#19_thx" "Лучше бы вам отойти подальше."
return

//=========================================================
npc "alberta" "Астрид#19_thx" 4_M_CHNCOOK 117 198 3 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3385
SetQuestConditionBegin 3385 1 4
SetQuestConditionQuest 3385 1
SetQuestConditionQuest 3376 1
SetQuestConditionQuest 3374 0
SetQuestConditionEnd

AddQuestIDCondition 3386
SetQuestConditionBegin 3386 1 5
SetQuestConditionQuest 3386 1
SetQuestConditionItem 11613 9 "<"
SetQuestConditionEnd

AddQuestIDCondition 3387
SetQuestConditionBegin 3387 1 5
SetQuestConditionQuest 3387 1
SetQuestConditionItem 11613 9 "<"
SetQuestConditionEnd

SetQuestConditionBegin 3387 1 4
SetQuestConditionQuest 3388 2
SetQuestConditionEnd

SetQuestConditionBegin 3387 1 4
SetQuestConditionQuest 3385 2 
SetQuestConditionQuest 3386 2
SetQuestConditionQuest 3387 0
SetQuestConditionQuest 3388 0
SetQuestConditionEnd
return

OnClick:
//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Астрид]"
	dialog "Если вы хотите принять участие в фестивале, освободите свой инвентарь."
	close
	return
else
endif
//==============================================================================
Talk2me "Астрид#19_thx" "Я всегда много времени трачу на украшение тортов. Ведь всегда вкуснее есть торт, когда он похож на торт..."
var thx_3385 = isbegin_quest 3385
var thx_3386 = isbegin_quest 3386
var thx_3387 = isbegin_quest 3387
var thx_3388 = isbegin_quest 3388
var thx_time = checkquest_playtime 3388
if (thx_3385 == 1)
	dialog "[Астрид]"
	dialog "О, привет, можешь немного со мной поговорить?"
	wait
	dialog "[Астрид]"
	dialog "...Извини, что так странно к тебе обратилась, вообще-то мне не помешала бы помощь."
	wait
	dialog "[Астрид]"
	dialog "Я тут недолго, и такой фестиваль у меня впервые. Я не справляюсь с такой нагрузкой..." 
	wait
	dialog "[Астрид]"
	dialog "Не мог бы ты помочь?"
	wait
	choose menu "Но... я не кондитер."
	endchoose
	dialog "[Астрид]"
	dialog "Конечно. Ха-ха. Но это и не важно..."
	wait
	choose menu "Правда?"
	endchoose
	dialog "[Астрид]"
	dialog "Насколько я понимаю, Ожившие ветки, гуляющие в последнее время неподалёку, приноровились к сладкому..."
	wait
	dialog "[Астрид]"
	dialog "Но ведь... Это ветки. Ха-ха! Как они могут есть сладкое?"
	wait
	dialog "[Астрид]"
	dialog "Поэтому они просто собирают всё сладкое, что находят поблизости."
	wait
	dialog "[Астрид]"
	dialog "Думаю, что у них можно достать немного ^0000cdФестивального печенья^000000, потерянного пару дней назад."
	wait
	dialog "[Астрид]"
	dialog "Кроме того, Голодные кабаны тоже нередко любят ими полакомиться."
	wait
	choose menu "Сколько нужно печенья?" 
	endchoose
	dialog "[Астрид]"
	dialog "Думаю, что 10 штук вполне хватит."
	wait
	dialog "[Астрид]"
	dialog "Ну что, сможешь мне помочь? Я отдам тебе свой ^0000cdЛотерейный билет^000000, если ты справишься."
	wait
	choose menu "Конечно помогу " "Я занят..."
	case 1
		dialog "[Астрид]"
		dialog "Отлично! ^0000cd10 Фестивального печенья^000000, помнишь?"
		completequest 3385
		setquest 3386
		close
		return
	break
	case 2
		dialog "[Астрид]"
		dialog "Хорошо, не проблема..."
		wait
		dialog "[Астрид]"
		dialog "Придётся потрудиться, чтобы в одиночку обеспечить десертами весь фестиваль..."
		close
		return
	break
	endchoose
endif

if (thx_3386 == 1)
	if (v[Harvest_Cookie] > 9)
		dialog "[Астрид]"
		dialog "Отлично! Печенье, конечно, немного затвердевшее, но нисколько не потеряло своего вкуса."
		wait
		dialog "[Астрид]"
		dialog "Спасибо за помощь, вот твой билет. Думаю, ты можешь заглянуть и завтра, посетителей всё больше и больше, а я одна..."
		completequest 3386
		setquest 3388
		dropitem Harvest_Cookie 10
		getitem Harvest_Lottery_Ticket 1 
		close
	else
		dialog "[Астрид]"
		dialog "^0000cd10 Фестивального печенья^000000, помнишь? Я совсем не успеваю..."
		close
		return
	endif
endif

if (thx_3388 == 1)
	if (thx_time == 2)
		dialog "[Астрид]"
		dialog "Привет, помнишь ты приносил мне ^0000cdФестивальное печенье^000000?"
		wait
		dialog "[Астрид]"
		dialog "Так вот, мне бы пригодились еще несколько штук. Посетителям оно понравилось."
		wait
		choose menu "Я принесу еще " "Я немного занят..."
		case 1
			dialog "[Астрид]"
			dialog "Я знала, что на тебя можно положиться!"
			wait
			dialog "[Астрид]"
			dialog "^0000cd10 Фестивального печенья^000000, помнишь? Я совсем не успеваю..."
			close
			setquest 3387
			erasequest 3388
			return
		break
		case 2
			dialog "[Астрид]"
			dialog "..."
			wait
			dialog "[Астрид]"
			dialog "Ничего страшного, сделаю сама..."
			close
			return
		break
		endchoose
	else
		dialog "[Астрид]"
		dialog "Спасибо еще раз за помощь, все сладкоежки довольны."
		wait
		dialog "[Астрид]"
		dialog "Но, честно говоря, я думаю, что завтра будет еще больше туристов... И мне бы снова не помешала твоя помощь."
		close
		return
	endif
endif

if ((thx_3387 == 1) & (thx_3388 == 0))
	if (v[Harvest_Cookie] > 9)
		dialog "[Астрид]"
		dialog "Отлично! Печенье, конечно, немного затвердевшее, но нисколько не потеряло своего вкуса."
		wait
		dialog "[Астрид]"
		dialog "Спасибо за помощь, вот твой билет. Думаю, ты можешь заглянуть и завтра, посетителей всё больше и больше, а я одна..."
		erasequest 3387
		setquest 3388
		dropitem Harvest_Cookie 10
		getitem Harvest_Lottery_Ticket 1
		close
		return
	else
		dialog "[Астрид]"
		dialog "^0000cd10 Фестивального печенья^000000, помнишь? Я совсем не успеваю..."
		close
		return
	endif
endif
return

npc "alberta" "Дрова#19_thx02" 4_TRACE 116 197 1 0 0
OnClick:
Talk2me "Густав#19_thx" "Так, не подходите близко к огню!"
Talk2me "Астрид#19_thx" "Лучше бы вам отойти подальше."
return

// =======================================================


npc "alberta" "Луи#19_thx" 4_COOK 115 198 3 4 4
OnInit:

PickToNpc BLACKSMITH 0 3 10 0 1932 0 0 0

NpcOverBMP "group_3"

AddQuestIDCondition 3377
SetQuestConditionBegin 3377 1 4
SetQuestConditionQuest 3377 1
SetQuestConditionQuest 3376 1
SetQuestConditionQuest 3375 0
SetQuestConditionEnd

AddQuestIDCondition 3378
SetQuestConditionBegin 3378 1 5
SetQuestConditionQuest 3378 1
SetQuestConditionItem 940 29 "<"
SetQuestConditionItem 511 19 "<"
SetQuestConditionItem 11613 19 "<"
SetQuestConditionEnd

AddQuestIDCondition 3379
SetQuestConditionBegin 3379 1 5
SetQuestConditionQuest 3379 1
SetQuestConditionItem 940 29 "<"
SetQuestConditionItem 511 19 "<"
SetQuestConditionItem 11613 19 "<"
SetQuestConditionEnd

SetQuestConditionBegin 3379 1 4
SetQuestConditionQuest 3380 2
SetQuestConditionEnd

SetQuestConditionBegin 3379 1 4
SetQuestConditionQuest 3377 2
SetQuestConditionQuest 3378 2
SetQuestConditionQuest 3379 0
SetQuestConditionQuest 3380 0
SetQuestConditionEnd
return

OnClick:
//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Луи]"
	dialog "Если вы хотите принять участие в фестивале, освободите свой инвентарь."
	close
	return
else
endif
//==============================================================================
Talk2me "Луи#19_thx" "Не всем дано понять все изыски моей кухни..."
var thx_3377 = isbegin_quest 3377
var thx_3378 = isbegin_quest 3378
var thx_3379 = isbegin_quest 3379
var thx_3380 = isbegin_quest 3380
var thx_time = checkquest_playtime 3380
if (thx_3377 == 1)
	dialog "[Луи]"
	dialog "Эй, странник. Погоди-ка."
	wait
	choose menu "Что случилось?"
	endchoose
	dialog "[Луи]"
	dialog "Ничего не случилось... Просто, я бы хотел попросить тебя попробовать кое-что."
	wait
	dialog "[Луи]"
	dialog "Слушай, а у тебя сильный желудок?"
	wait
	dialog "[Луи]"
	dialog "Ой... Можешь не отвечать уже... Кажется моё желе из желлопи куда-то убежало."
	wait
	dialog "[Луи]"
	dialog "Ладно. Думаю, я смогу найти тебе применение."
	wait
	dialog "[Луи]"
	dialog "Надо как-нибудь всем доказать, что я тоже достоин быть шефом собственной кухни."
	wait
	dialog "[Луи]"
	dialog "А то как только все хотят чего-нибудь необычного - сразу к Густаву."
	wait
	dialog "[Луи]"
	dialog "Я меня как будто не замечают, а я ведь уже несколько лет стараюсь и совершенствую свои рецепты..."
	wait
	dialog "[Луи]"
	dialog "Я тут подумал... Нужно выпустить в свет моё новое творение - изысканные Лапки кузнечика с маринованной зеленью."
	wait
	dialog "[Луи]"
	dialog "Но, конечно, для такого количества людей мне понадобится очень много ^0000cdЛапок кузнечика и Зелёной травы^000000."
	wait
	dialog "[Луи]"
	dialog "Ну, что? Ты поможешь мне осуществить это мероприятие? Думаю, я смог бы отдать тебе свой аксессуар с Конкурса неординарных поваров."
	wait
	choose menu "Я помогу " "Странное дело..."
	case 1
		dialog "[Луи]"
		dialog "Кто бы сомневался. Я... То есть, мы ведь прославимся на весь Мидгард, если у нас получится."
		wait
		dialog "[Луи]"
		dialog "Только я вот подумал, что без десерта - никуда. Нужно еще ^0000cdФестивальное печенье^000000."
		wait
		dialog "[Луи]"
		dialog "Так... посмотрим..."
		wait
		dialog "[Луи]"
		dialog "Мне понадобятся ^0000cd30 Лапок кузнечика, 20 Фестивального печенья и 20 Зелёной травы^000000."
		wait
		choose menu "Я принесу " "Вообще-то я занят..."
		case 1 
			dialog "[Луи]"
			dialog "Отлично, приноси их поскорее. А я пока начну готовить специи и разжигать костёр."
			completequest 3377
			setquest 3378
			close
			return
		break
		case 2
			dialog "[Луи]"
			dialog "Конечно, занят!"
			wait
			dialog "[Луи]"
			dialog "Все заняты! А теперь дай мне спокойно приготовить напитки... Заказов куча! Ясно?"
			close
			return
		break
		endchoose
	break
	case 2
		dialog "[Луи]"
		dialog "Почему странное? Ничего ты не понимаешь! "
		Talk2me "Луи#19_thx" "Ничего ты не понимаешь!"
		wait
		dialog "[Луи]"
		dialog "Как же плохо быть единственным ценителем необычной кухни..."
		close
		return
	break
	endchoose
endif

if (thx_3377 == 3) & (thx_3380 == 0)
	dialog "[Луи]"
	dialog "Слушай, а у тебя сильный желудок?"
	wait
	dialog "[Луи]"
	dialog "Ой... Можешь не отвечать уже... Кажется моё желе из желлопи куда-то убежало."
	wait
	dialog "[Луи]"
	dialog "Ладно. Думаю, я смогу найти тебе применение."
	wait
	dialog "[Луи]"
	dialog "Надо как-нибудь всем доказать, что я тоже достоин быть шефом собственной кухни."
	wait
	dialog "[Луи]"
	dialog "А то как только все хотят чего-нибудь необычного - сразу к Густаву."
	wait
	dialog "[Луи]"
	dialog "Я меня как будто не замечают, а я ведь уже несколько лет стараюсь и совершенствую свои рецепты..."
	wait
	dialog "[Луи]"
	dialog "Я тут подумал... Нужно выпустить в свет моё новое творение - изысканные Лапки кузнечика с маринованной зеленью."
	wait
	dialog "[Луи]"
	dialog "Но, конечно, для такого количества людей мне понадобится очень много ^0000cdЛапок кузнечика и Зелёной травы^000000."
	wait
	dialog "[Луи]"
	dialog "Ну, что? Ты поможешь мне осуществить это мероприятие? Думаю, я смог бы отдать тебе свой аксессуар с Конкурса неординарных поваров."
	wait
	choose menu "Я помогу " "Странное дело..."
	case 1
		dialog "[Луи]"
		dialog "Кто бы сомневался. Я... То есть, мы ведь прославимся на весь Мидгард, если у нас получится."
		wait
		dialog "[Луи]"
		dialog "Только я вот подумал, что без десерта - никуда. Нужно еще ^0000cdФестивальное печенье^000000."
		wait
		dialog "[Луи]"
		dialog "Так... посмотрим..."
		wait
		dialog "[Луи]"
		dialog "Мне понадобятся ^0000cd30 Лапок кузнечика, 20 Фестивального печенья и 20 Зелёной травы^000000."
		wait
		choose menu "Я принесу " "Вообще-то я занят..."
		case 1 
			dialog "[Луи]"
			dialog "Отлично, приноси их поскорее. А я пока начну готовить специи и разжигать костёр."
			completequest 3377
			setquest 3378
			close
			return
		break
		case 2
			dialog "[Луи]"
			dialog "Конечно, занят!"
			wait
			dialog "[Луи]"
			dialog "Все заняты! А теперь дай мне спокойно приготовить напитки... Заказов куча! Ясно?"
			close
			return
		break
		endchoose
	break
	case 2
		dialog "[Луи]"
		dialog "Почему странное? Ничего ты не понимаешь! "
		Talk2me "Луи#19_thx" "Ничего ты не понимаешь!"
		wait
		dialog "[Луи]"
		dialog "Как же плохо быть единственным ценителем необычной кухни..."
		close
		return
	break
	endchoose
endif
	
if (thx_3378 == 1)
	if (v[Grasshopper's_Leg] > 29 ) & (v[Green_Herb] > 19) & (v[Harvest_Cookie] > 19)
		dialog "[Луи]"
		dialog "Где ты пропадал? Я уже начал беспокоиться о том, что ты меня обманул!"
		wait
		dialog "[Луи]"
		dialog "Хорошо, ты принёс лапки и зелень?"
		wait
		dialog "[Луи]"
		dialog "Вижу, что принёс. Сейчас начну готовить, посмотрим, как моё... То есть, наше блюдо оценят посетители. "
		wait
		dialog "[Луи]"
		dialog "Я тебе обещал свой аксессуар с конкурса, вот держи. И в добавок, возьми-ка этот лотерейный билет. Мне некогда."
		completequest 3378
		setquest 3380
		dropitem Grasshopper's_Leg 30
		dropitem Green_Herb 20
		dropitem Harvest_Cookie 20
		getitem C_Autumnal_Flavor 1
		getitem Harvest_Lottery_Ticket 1
		close
		return
	else
		dialog "[Луи]"
		dialog "Помнишь, о чём я тебя просил?"
		wait
		dialog "[Луи]"
		dialog "Мне понадобятся для блюда - ^0000cd30 Лапок кузнечика, 20 Фестивального печенья и 20 Зелёной травы^000000."
		close
		return
	endif
endif


if (thx_3380 == 1)
	if (thx_time == 2)
		dialog "[Луи]"
		dialog "Странник! Ты здесь."
		wait
		dialog "[Луи]"
		dialog "Отличные новости - моё блюдо понравилось всем!"
		wait
		dialog "[Луи]"
		dialog "Всем, кто осмелился попробовать... Но всем! Думаю, что нам надо продолжать продвигать наши идеи в массы!"
		wait
		choose menu "Я тоже так думаю " "Думаю, не стоит "
		case 1 
			dialog "[Луи]"
			dialog "Хорошо, тогда попробуем приготовить его и сегодня."
			wait
			dialog "[Луи]"
			dialog "Мне понадобятся для блюда - ^0000cd30 Лапок кузнечика, 20 Фестивального печенья и 20 Зелёной травы^000000."
			close
			erasequest 3380
			setquest 3379
			return
		break
		case 2
			dialog "[Луи]"
			dialog "Что значит 'не стоит'?"
			wait
			dialog "[Луи]"
			dialog "Мы же могли прославиться!"
			close
			return
		break
		endchoose
	else
		dialog "[Луи]"
		dialog "Надеюсь, что мы не зря старались... Думаю, что нужно будет завтра тоже приготовить."
		wait
		dialog "[Луи]"
		dialog "О, друг! Эй! Попробуй новое блюдо! Такого ты никогда не пробовал!"
		Talk2me "Луи#19_thx" "Эй! Попробуй новое блюдо! Такого ты никогда не пробовал!"
		close
		return
	endif
endif

if ((thx_3379 == 1) & (thx_3380 == 0))
	if (v[Grasshopper's_Leg] > 29 ) & (v[Green_Herb] > 19) & (v[Harvest_Cookie] > 19)
		dialog "[Луи]"
		dialog "Привет, ты принёс лапки и зелень?"
		wait
		dialog "[Луи]"
		dialog "Вижу, что принёс. Сейчас начну готовить, посмотрим, как моё... То есть, наше блюдо оценят сегодня."
		wait
		dialog "[Луи]"
		dialog "Возьми-ка эти лотерейные билеты. Мне они достались от недовольных посетителей... Вместо оплаты..."
		erasequest 3379
		setquest 3380
		dropitem Grasshopper's_Leg 30
		dropitem Green_Herb 20
		dropitem Harvest_Cookie 20
		getitem Harvest_Lottery_Ticket 2
		close
		return
	else
		dialog "[Луи]"
		dialog "Помнишь, о чём я тебя просил?"
		wait
		dialog "[Луи]"
		dialog "Мне понадобятся для блюда - ^0000cd30 Лапок кузнечика, 20 Фестивального печенья и 20 Зелёной травы^000000."
		close
		return
	endif
endif

//================

npc "alberta" "Дрова#19_thx01" 4_TRACE 114 197 1 0 0
OnClick:
Talk2me "Густав#19_thx" "Так, не подходите близко к огню!"
Talk2me "Астрид#19_thx" "Лучше бы вам отойти подальше."
Talk2me "Луи#19_thx" "Да ничего страшного, пробуй прямо с огня!"
return

// ====================================================
npc "alberta" "Домашняя еда#19_thx" 4_EP16_FOOD 119 190 3 0 0
OnClick:
return

// ====================================================

npc "alberta" "Ведущий лотереи#19_thx" 4_M_KHMAN 141 188 3 0 0
OnInit:

NpcOverBMP "group_3"
NpcSecondName "<Лотерея>"

OnClick:
//====================================================

var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Ведущий лотереи]"
	dialog "Если вы хотите принять участие в фестивале, освободите свой инвентарь."
	close
	return
else
endif
//==============================================================================	
	var whilechk = 0
	dialog "[Ведущий лотереи]"
	dialog "Добро пожаловать на фестиваль огня и света!"
	wait
	dialog "[Ведущий лотереи]"
	dialog "Подходите! Участвуйте в лотерее!"
	wait
	dialog "[Ведущий лотереи]"
	dialog "Для участия нужен всего лишь ^0000cd1 Лотерейный билет^000000."
	wait
	while(1)
//====================================================

var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Ведущий лотереи]"
	dialog "Если вы хотите принять участие в лотерее, освободите свой инвентарь."
	close
	return
else
endif
//==============================================================================	
	if (whilechk > 0)
		dialog "[Ведущий лотереи]"
		dialog "Хотите снова участвовать?"
		wait
	else
		dialog "[Ведущий лотереи]"
		dialog "Хотите участвовать?"
		wait
	endif

	choose menu "Да " "Уйти "
	case 1 
		if (v[Harvest_Lottery_Ticket] > 0)
			dropitem Harvest_Lottery_Ticket 1
			ConsumePackageItem Season_Evt_Reward
			dialog "[Ведущий лотереи]"	
			dialog "Иии... Крутим! "
			dialog "Вот ваш выигрыш!"
			var whilechk = whilechk + 1
			close
		else
			dialog "[Ведущий лотереи]"
			dialog "Для участия нужен ^0000cd1 Лотерейный билет^000000."
			wait
			dialog "[Ведущий лотереи]"
			dialog "Их можно получить у участников фестиваля."
			close
			exitwhile
			return
		endif
	break
	case 2
		close
		exitwhile
		return
	break
	endchoose
	endwhile
return
	

npc "alberta" "Помощник ведущего#19_thx_2" 4_M_KHMAN 138 188 3 0 0
OnInit:

NpcOverBMP "group_3"
NpcSecondName "<Лотерея>"

OnClick:
//====================================================

var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Помощник ведущего]"
	dialog "Если вы хотите принять участие в фестивале, освободите свой инвентарь."
	close
	return
else
endif
//==============================================================================	
	dialog "[Помощник ведущего]"
	dialog "Приветствую вас."
	wait
	dialog "[Помощник ведущего]"
	dialog "Если вы хотите принять участие в лотерее, вам нужно обратиться к Ведущему лотереи."
	wait
	dialog "[Помощник ведущего]"
	dialog "Для участия нужен ^0000cd1 Лотерейный билет^000000."
	wait
	choose menu "Могу ли я участвовать без билета?" "Уйти "
		case 1
		break
		case 2
			close
			return
		break
	endchoose
	dialog "[Помощник ведущего]"
	dialog "Вообще-то, я бы не отказался от ^0000cd10 Смоляных веток^000000. Я мог бы предложить поучаствовать в лотерее за них."
	wait
	choose menu "Участвовать " "Уйти "
	case 1
		if (v[Goodly_Bough] > 9)
			dropitem Goodly_Bough 10
			ConsumePackageItem Season_Evt_Reward
			dialog "[Помощник ведущего]"
			dialog "Итак, вот ваша награда."
			close
			return
		else
			dialog "[Помощник ведущего]"
			dialog "У вас нет ^0000cd10 Смоляных веток^000000."
			close
			return
		endif
	break
	case 2
	break
	endchoose
return



///////////////////////////////////////////////////////

// ========================================================
npc "prontera" "Участник фестиваля#18_thx01" 4_M_GRANDMONK 125 125 5 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Участник фестиваля#18_thx01" "Фестиваль огня и света празднуется в Альберте. Не пропустите!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Участник фестиваля]"
	dialog "Кажется, вы слишком молоды и неопытны, я бы не советовал вам рисковать."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Участник фестиваля]"
	dialog "Солнце всё выше и выше, сезон сбора урожая в самом разгаре..."
	wait
	dialog "[Участник фестиваля]"
	dialog "Чего не хватает в такие тёплые и урожайные дни? Конечно, большого праздника со вкусной едой и приятной компанией."
	wait
	dialog "[Участник фестиваля]"
	dialog "Портовый город Альберта ждёт всех своих коренных жителей, но, также, готова гостеприимно принять всех туристов!"
	wait
	dialog "[Участник фестиваля]"
	dialog "Кроме еды, танцев и хорошего настроения, вас также ожидает лотерея, которую организовали сами участвующие фестиваля."
	wait
	dialog "[Участник фестиваля]"
	dialog "Ну что? Вы готовы принять участие в фестивале? Думаю, я смог бы помочь вам добраться до города."
	wait
	choose menu "Я хочу " "Не готов "
	case 1
		dialog "[Участник фестиваля]"
		dialog "Приятного вам времяпрепровождения!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Участник фестиваля]"
		dialog "Ничего страшного, приходите, когда будете готовы."
		close
		return
	break
	endchoose
else
	dialog "[Участник фестиваля]"
	dialog "Привет, странник! Я рад, что ты участвуешь с нами в фестивале."
	close
	return
endif
return


// ==========================================================
npc "payon" "Участник фестиваля#18_thx02" 4_M_GRANDMONK 165 99 6 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Участник фестиваля#18_thx01" "Фестиваль огня и света празднуется в Альберте. Не пропустите!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Участник фестиваля]"
	dialog "Кажется, вы слишком молоды и неопытны, я бы не советовал вам рисковать."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Участник фестиваля]"
	dialog "Солнце всё выше и выше, сезон сбора урожая в самом разгаре..."
	wait
	dialog "[Участник фестиваля]"
	dialog "Чего не хватает в такие тёплые и урожайные дни? Конечно, большого праздника со вкусной едой и приятной компанией."
	wait
	dialog "[Участник фестиваля]"
	dialog "Портовый город Альберта ждёт всех своих коренных жителей, но, также, готова гостеприимно принять всех туристов!"
	wait
	dialog "[Участник фестиваля]"
	dialog "Кроме еды, танцев и хорошего настроения, вас также ожидает лотерея, которую организовали сами участвующие фестиваля."
	wait
	dialog "[Участник фестиваля]"
	dialog "Ну что? Вы готовы принять участие в фестивале? Думаю, я смог бы помочь вам добраться до города."
	wait
	choose menu "Я хочу " "Не готов "
	case 1
		dialog "[Участник фестиваля]"
		dialog "Приятного вам времяпрепровождения!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Участник фестиваля]"
		dialog "Ничего страшного, приходите, когда будете готовы."
		close
		return
	break
	endchoose
else
	dialog "[Участник фестиваля]"
	dialog "Привет, странник! Я рад, что ты участвуешь с нами в фестивале."
	close
	return
endif
return

// ========================================================
npc "aldebaran" "Участник фестиваля#18_thx03" 4_M_GRANDMONK 143 115 4 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Участник фестиваля#18_thx01" "Фестиваль огня и света празднуется в Альберте. Не пропустите!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Участник фестиваля]"
	dialog "Кажется, вы слишком молоды и неопытны, я бы не советовал вам рисковать."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Участник фестиваля]"
	dialog "Солнце всё выше и выше, сезон сбора урожая в самом разгаре..."
	wait
	dialog "[Участник фестиваля]"
	dialog "Чего не хватает в такие тёплые и урожайные дни? Конечно, большого праздника со вкусной едой и приятной компанией."
	wait
	dialog "[Участник фестиваля]"
	dialog "Портовый город Альберта ждёт всех своих коренных жителей, но, также, готова гостеприимно принять всех туристов!"
	wait
	dialog "[Участник фестиваля]"
	dialog "Кроме еды, танцев и хорошего настроения, вас также ожидает лотерея, которую организовали сами участвующие фестиваля."
	wait
	dialog "[Участник фестиваля]"
	dialog "Ну что? Вы готовы принять участие в фестивале? Думаю, я смог бы помочь вам добраться до города."
	wait
	choose menu "Я хочу " "Не готов "
	case 1
		dialog "[Участник фестиваля]"
		dialog "Приятного вам времяпрепровождения!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Участник фестиваля]"
		dialog "Ничего страшного, приходите, когда будете готовы."
		close
		return
	break
	endchoose
else
	dialog "[Участник фестиваля]"
	dialog "Привет, странник! Я рад, что ты участвуешь с нами в фестивале."
	close
	return
endif
return


// ============================================================
npc "geffen" "Участник фестиваля#18_thx04" 4_M_GRANDMONK 129 57 4 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Участник фестиваля#18_thx01" "Фестиваль огня и света празднуется в Альберте. Не пропустите!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Участник фестиваля]"
	dialog "Кажется, вы слишком молоды и неопытны, я бы не советовал вам рисковать."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Участник фестиваля]"
	dialog "Солнце всё выше и выше, сезон сбора урожая в самом разгаре..."
	wait
	dialog "[Участник фестиваля]"
	dialog "Чего не хватает в такие тёплые и урожайные дни? Конечно, большого праздника со вкусной едой и приятной компанией."
	wait
	dialog "[Участник фестиваля]"
	dialog "Портовый город Альберта ждёт всех своих коренных жителей, но, также, готова гостеприимно принять всех туристов!"
	wait
	dialog "[Участник фестиваля]"
	dialog "Кроме еды, танцев и хорошего настроения, вас также ожидает лотерея, которую организовали сами участвующие фестиваля."
	wait
	dialog "[Участник фестиваля]"
	dialog "Ну что? Вы готовы принять участие в фестивале? Думаю, я смог бы помочь вам добраться до города."
	wait
	choose menu "Я хочу " "Не готов "
	case 1
		dialog "[Участник фестиваля]"
		dialog "Приятного вам времяпрепровождения!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Участник фестиваля]"
		dialog "Ничего страшного, приходите, когда будете готовы."
		close
		return
	break
	endchoose
else
	dialog "[Участник фестиваля]"
	dialog "Привет, странник! Я рад, что ты участвуешь с нами в фестивале."
	close
	return
endif
return

// =========================================================
npc "morocc" "Участник фестиваля#18_thx05" 4_M_GRANDMONK 168 87 4 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Участник фестиваля#18_thx01" "Фестиваль огня и света празднуется в Альберте. Не пропустите!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Участник фестиваля]"
	dialog "Кажется, вы слишком молоды и неопытны, я бы не советовал вам рисковать."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Участник фестиваля]"
	dialog "Солнце всё выше и выше, сезон сбора урожая в самом разгаре..."
	wait
	dialog "[Участник фестиваля]"
	dialog "Чего не хватает в такие тёплые и урожайные дни? Конечно, большого праздника со вкусной едой и приятной компанией."
	wait
	dialog "[Участник фестиваля]"
	dialog "Портовый город Альберта ждёт всех своих коренных жителей, но, также, готова гостеприимно принять всех туристов!"
	wait
	dialog "[Участник фестиваля]"
	dialog "Кроме еды, танцев и хорошего настроения, вас также ожидает лотерея, которую организовали сами участвующие фестиваля."
	wait
	dialog "[Участник фестиваля]"
	dialog "Ну что? Вы готовы принять участие в фестивале? Думаю, я смог бы помочь вам добраться до города."
	wait
	choose menu "Я хочу " "Не готов "
	case 1
		dialog "[Участник фестиваля]"
		dialog "Приятного вам времяпрепровождения!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Участник фестиваля]"
		dialog "Ничего страшного, приходите, когда будете готовы."
		close
		return
	break
	endchoose
else
	dialog "[Участник фестиваля]"
	dialog "Привет, странник! Я рад, что ты участвуешь с нами в фестивале."
	close
	return
endif
return

// ============================================================
npc "yuno" "Участник фестиваля#18_thx07" 4_M_GRANDMONK 148 181 5 5 5
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Участник фестиваля#18_thx01" "Фестиваль огня и света празднуется в Альберте. Не пропустите!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Участник фестиваля]"
	dialog "Кажется, вы слишком молоды и неопытны, я бы не советовал вам рисковать."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Участник фестиваля]"
	dialog "Солнце всё выше и выше, сезон сбора урожая в самом разгаре..."
	wait
	dialog "[Участник фестиваля]"
	dialog "Чего не хватает в такие тёплые и урожайные дни? Конечно, большого праздника со вкусной едой и приятной компанией."
	wait
	dialog "[Участник фестиваля]"
	dialog "Портовый город Альберта ждёт всех своих коренных жителей, но, также, готова гостеприимно принять всех туристов!"
	wait
	dialog "[Участник фестиваля]"
	dialog "Кроме еды, танцев и хорошего настроения, вас также ожидает лотерея, которую организовали сами участвующие фестиваля."
	wait
	dialog "[Участник фестиваля]"
	dialog "Ну что? Вы готовы принять участие в фестивале? Думаю, я смог бы помочь вам добраться до города."
	wait
	choose menu "Я хочу " "Не готов "
	case 1
		dialog "[Участник фестиваля]"
		dialog "Приятного вам времяпрепровождения!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Участник фестиваля]"
		dialog "Ничего страшного, приходите, когда будете готовы."
		close
		return
	break
	endchoose
else
	dialog "[Участник фестиваля]"
	dialog "Привет, странник! Я рад, что ты участвуешь с нами в фестивале."
	close
	return
endif
return


// =======================================================
npc "rachel" "Участник фестиваля#18_thx08" 4_M_GRANDMONK 111 134 4 5 5
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Участник фестиваля#18_thx01" "Фестиваль огня и света празднуется в Альберте. Не пропустите!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Участник фестиваля]"
	dialog "Кажется, вы слишком молоды и неопытны, я бы не советовал вам рисковать."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Участник фестиваля]"
	dialog "Солнце всё выше и выше, сезон сбора урожая в самом разгаре..."
	wait
	dialog "[Участник фестиваля]"
	dialog "Чего не хватает в такие тёплые и урожайные дни? Конечно, большого праздника со вкусной едой и приятной компанией."
	wait
	dialog "[Участник фестиваля]"
	dialog "Портовый город Альберта ждёт всех своих коренных жителей, но, также, готова гостеприимно принять всех туристов!"
	wait
	dialog "[Участник фестиваля]"
	dialog "Кроме еды, танцев и хорошего настроения, вас также ожидает лотерея, которую организовали сами участвующие фестиваля."
	wait
	dialog "[Участник фестиваля]"
	dialog "Ну что? Вы готовы принять участие в фестивале? Думаю, я смог бы помочь вам добраться до города."
	wait
	choose menu "Я хочу " "Не готов "
	case 1
		dialog "[Участник фестиваля]"
		dialog "Приятного вам времяпрепровождения!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Участник фестиваля]"
		dialog "Ничего страшного, приходите, когда будете готовы."
		close
		return
	break
	endchoose
else
	dialog "[Участник фестиваля]"
	dialog "Привет, странник! Я рад, что ты участвуешь с нами в фестивале."
	close
	return
endif
return


////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
npc "alberta" "Музыкант#18_thx" 4_M_GUSLIMAN 148 170 3 0 0
OnClick:
Talk2me "Музыкант#18_thx" "Не печальтесь, не тревожьтесь, сьешьте с нами вы по ложке..."
return

npc "alberta" "Музыкант#18_thx_2" 2_M_BARD_ORIENT 146 171 3 0 0
OnClick:
Talk2me "Музыкант#18_thx_2" "И... Раз! Два! Три!"
return

npc "alberta" "Коренной житель#18_thx" 4_M_05 149 168 3 0 0
OnClick:
Talk2me "Коренной житель#18_thx" "Ой, как много туристов..."
return

npc "alberta" "Турист#18_thx01" 4_M_06 149 157 1 0 0
OnClick:
Talk2me "Турист#18_thx01" "Мне уже нужно отправляться, но я не могу оторвать глаз от огней."
return




npc "alberta" "Туристка#18_thx09" 4_F_LGTGIRL 133 150 5 0 0
OnClick:
Talk2me "Туристка#18_thx09" "Еда здесь такая вкусная... Ммм..."
DelayTime 1000
Talk2me "Турист#18_thx10" "Мне понравился фруктовый микс."
DelayTime 1000
Talk2me "Туристка#18_thx09" "Фруктовый? А где ты его взял?"
DelayTime 1000
Talk2me "Турист#18_thx10" "Я тебе принесу."
DelayTime 1000
Talk2me "Туристка#18_thx09" "Спасибо. Можно и две порции!"
DelayTime 1000
Talk2me "Турист#18_thx10" "Принесу три. Ха-ха-ха "
return

npc "alberta" "Турист#18_thx10" 4_M_CHNMAN 135 148 1 0 0
OnClick:
Talk2me "Турист#18_thx10" "А будут еще такие фестивали?"
DelayTime 1000
Talk2me "Туристка#18_thx09" "Думаю да."
DelayTime 1000
Talk2me "Турист#18_thx10" "Интересно, какой будет следующим?"
DelayTime 1000
Talk2me "Туристка#18_thx09" "Этого никто не знает..."
return

////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////

