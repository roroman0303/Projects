//-- 2019 5? ??? ?? ??----???? 2019/02/11--------???? ???----
//--- ????? ?? ????? ????? ???? ??-----------------------
//--- ??? ? Melon ????---------------------------------------------------
//2019: 8311-8312 (???)

//---------------------------------------------?-------------------------------

//--------------------------?? 2018 ???? ??? ?? ??-----------------
//-----------------------???? ???? ????-----------------------------

//Фалпадора ?

npc "geffen" "Фалпадора#2019family" 4_F_02 142 40 1 3 3
OnTouch2:
	Talk2me "Фалпадора#2019family" "Фалпадора : Подходите! Участвуйте в конкурсе!"
return

OnInit:
AddQuestIDCondition 8311
SetQuestConditionBegin 8311 1 4
SetQuestConditionQuest 8311 0
SetQuestConditionEnd

AddQuestIDCondition 8311
SetQuestConditionBegin 8311 1 4
SetQuestConditionQuest 8311 3
SetQuestConditionEnd


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



	var q8311 = isbegin_quest 8311
	var q8312 = checkquest_playtime 8312
if (q8312 == 1)
	dialog "[Фалпадора]"
	dialog "Добро пожаловать "
	dialog "на фестиваль дынного урожая!"
	dialog "Предлагаю вам поучаствовать "
	dialog "в конкурсе!"
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
	choose menu "Я хочу участвовать!" "Что за сладкая монета?" "Уйти " "Кто сейчас рекордсмен?" "Правила конкурса "
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
				dialog "обычными дынями."
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
        	endif
    		var jaljal = rand 1 10000
    		if ((jaljal > 0) & (jaljal < 2976))
    			//C
    			var melon_size = rand 1 180
    			dialog "[Фалпадора]"
    			dialog "Вашей дыней можно накормить "
				dialog "целую семью, но, увы..."
				dialog "Она слишком мала для состязания "
				dialog "за первое место. Всего "+melon_size+" мм."
				dialog "Но не расстраивайтесь!"
				dialog "Вам тоже положена награда."
    			dropitem Suspicious_Melon 1
    			getitem Sweet_Melon 5
    			close
    			return
    			elseif ((jaljal > 2975) & (jaljal < 3976))
    			//B-1: Sweet_Melon_Juice
    			var melon_size = rand 181 500
    			dialog "[Фалпадора]"
    			dialog "Вашей дыней можно накормить "
				dialog "целую семью, но, увы..."
				dialog "Она слишком мала для состязания "
				dialog "за первое место. Всего "+melon_size+" мм."
				dialog "Но не расстраивайтесь!"
				dialog "Вам тоже положена награда."
    			dropitem Suspicious_Melon 1
    			//B???-1: Sweet_Melon_Juice(10%)
   				getitem Sweet_Melon_Juice 1
    			close
    			return
    		elseif ((jaljal > 3975) & (jaljal < 4039))
    			//S
    			var melon_melon = rand 1 100
    			if ((melon_melon > 47) & (melon_melon < 55))
    				var melon_size = rand 1401 1500
    			else
    				var melon_size = rand 1001 1400
    			endif
       			dialog "[Фалпадора]"
       			dialog "Невероятно!"
				dialog "Ваша дыня - самая большая "
				dialog "из тех, что я видел сегодня!"
				dialog "Её длина - "+melon_size+" мм!"
				dialog "Конечно, вы достойны "
				dialog "лучшей награды!"
    			dropitem Suspicious_Melon 1
      			//S???
      			if ((jaljal > 3975) & (jaljal < 4001))
      				//0.25%
          			//???? ????
          			// getitem K_Secret_Key 1
      			elseif ((jaljal > 4000) & (jaljal < 4013))
      				getitem Magic_Card_Album 1
      			elseif ((jaljal > 4012) & (jaljal < 4026))
      				getitem Bloody_Dead_Branch 1
      			else
      			//~4038
      				getitem Old_Card_Album 1
      			endif
    			close
    			return
    		elseif ((jaljal > 4038) & (jaljal < 7190))
    			//B-2: ?? ??
    			var melon_size = rand 181 500
    			dialog "[Фалпадора]"
    			dialog "Неплохо!"
				dialog "Ваша дыня, конечно, не самая "
				dialog "большая за сегодня, но тоже "
				dialog "достойная участница конкурса!"
				dialog "Её длина - "+melon_size+" мм."
				dialog "И вот, конечно же, ваша награда."
    			dropitem Suspicious_Melon 1
    			//B???-2
    			var shouhinb = rand 1 3151
    			if ((shouhinb > 0) & (shouhinb < 501))
    				getitem Inspector_Certificate 1
    			elseif ((shouhinb > 500) & (shouhinb < 1001))
    				getitem Branch_Of_Dead_Tree 1
    			elseif ((shouhinb > 1000) & (shouhinb < 1501))
    				getitem Old_Blue_Box 1
    			elseif ((shouhinb > 1500) & (shouhinb < 2001))
    				getitem Honey_Pastry 1
    			elseif ((shouhinb > 2000) & (shouhinb < 2336))
    				getitem Sesame_Pastry 1
    			elseif ((shouhinb > 2335) & (shouhinb < 2744))
    				getitem Pineapple 1
    			else
    				getitem Melon 1
    			endif
    			close
    			return
    		elseif ((jaljal > 7189) & (jaljal < 8201))
    			//A
    			var melon_size = rand 501 1000
       			dialog "Невероятно!"
				dialog "Ваша дыня - самая большая "
				dialog "из тех, что я видел сегодня!"
				dialog "Её длина - "+melon_size+" мм!"
				dialog "Конечно, вы достойны "
				dialog "лучшей награды!"
    			dropitem Suspicious_Melon 1
    			//A???
      			var momodi = rand 1 1011
      			if ((momodi > 0) & (momodi < 142))
      				getitem Yggdrasilberry 1
      			elseif ((momodi > 141) & (momodi < 244))
      				getitem Old_Violet_Box 1
      			elseif ((momodi > 243) & (momodi < 584))
      				getitem Melon_Parfait 1
      			elseif ((momodi > 583) & (momodi < 714))
      				// getitem BraisedShortRibs 1
      			elseif ((momodi > 713) & (momodi < 844))
      				getitem BraisedSpareribs 1
      			elseif ((momodi > 713) & (momodi < 912))
      				getitem Set_Of_Taiming_Item 1
      			else
      				//1%(2019)
      				// getitem C_Mini_Melon 1
      			endif
    			close
    			return
   			elseif ((jaljal > 8200) & (jaljal < 9701))
    			//B-3: Sweet_Melon_Juice
    			var melon_size = rand 181 500
    			dialog "[Фалпадора]"
    			dialog "Вашей дыней можно накормить "
				dialog "целую семью, но, увы..."
				dialog "Она слишком мала для состязания "
				dialog "за первое место. Всего "+melon_size+" мм."
				dialog "Но не расстраивайтесь!"
				dialog "Вам тоже положена награда."
    			dropitem Suspicious_Melon 1
    			//B???-3: Melon_Juice(15%)
   				getitem Melon_Juice 1
    			close
    			return
    		elseif ((jaljal > 9700) & (jaljal < 10001))
    			//C
    			var melon_size = rand 1 180
    			dialog "[Фалпадора]"
    			dialog "Вашей дыней можно накормить "
				dialog "целую семью, но, увы..."
				dialog "Она слишком мала для состязания "
				dialog "за первое место. Всего "+melon_size+" мм."
				dialog "Но не расстраивайтесь!"
				dialog "Вам тоже положена награда."
    			dropitem Suspicious_Melon 1
    			getitem Sweet_Melon 5
    			close
    			return
    		else
    			//C
    			var melon_size = rand 1 180
    			dialog "[Фалпадора]"
    			dialog "Вашей дыней можно накормить "
				dialog "целую семью, но, увы..."
				dialog "Она слишком мала для состязания "
				dialog "за первое место. Всего "+melon_size+" мм."
				dialog "Но не расстраивайтесь!"
				dialog "Вам тоже положена награда."
    			dropitem Suspicious_Melon 1
    			getitem Sweet_Melon 5
    			close
    			return
    		endif
		break
		case 2
            if (v[Evt_May01_KR] > 0)
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
			wait
			dialog "[Фалпадора]"
			dialog "Насколько я поняла,"
			dialog "у вас есть такая монетка."
			dialog "Желаете поучаствовать в "
			dialog "конкурсе еще раз?"
			dialog "Я предоставлю вам одну из своих "
			dialog "дынь-конкурсантов."
			wait
            	choose menu "Я хочу участвовать!" "Приберегу монету..." "Послушать еще раз "
            		case 1
            			dialog "[Фалпадора]"
            			dialog "Вот и договорились!"
            			dialog "Посмотрим..."
						dialog "Неплохо! Вот ваша награда "
						dialog "за участие в конкурсе."
               			dropitem Evt_May01_KR 1
                		var jaljal = rand 1 10000
                		if ((jaljal > 0) & (jaljal < 2976))
                			//C
                			getitem Sweet_Melon 5
                		elseif ((jaljal > 2975) & (jaljal < 3976))
                			//B???-1: Sweet_Melon_Juice(10%)
               				getitem Sweet_Melon_Juice 1
                		elseif ((jaljal > 3975) & (jaljal < 4039))
                			//S???
                			if ((jaljal > 3975) & (jaljal < 4001))
                				//0.25%
                    			//???? ????
                    			// getitem K_Secret_Key 1
                			elseif ((jaljal > 4000) & (jaljal < 4013))
                				getitem Magic_Card_Album 1
                			elseif ((jaljal > 4012) & (jaljal < 4026))
                				getitem Bloody_Dead_Branch 1
                			else
                			//~4038
                				getitem Old_Card_Album 1
                			endif
                		elseif ((jaljal > 4038) & (jaljal < 7190))
                			//B???-2
                			var shouhinb = rand 1 3151
                			if ((shouhinb > 0) & (shouhinb < 501))
                				getitem Inspector_Certificate 1
                			elseif ((shouhinb > 500) & (shouhinb < 1001))
                				getitem Branch_Of_Dead_Tree 1
                			elseif ((shouhinb > 1000) & (shouhinb < 1501))
                				getitem Old_Blue_Box 1
                			elseif ((shouhinb > 1500) & (shouhinb < 2001))
                				getitem Honey_Pastry 1
                			elseif ((shouhinb > 2000) & (shouhinb < 2336))
                				getitem Sesame_Pastry 1
                			elseif ((shouhinb > 2335) & (shouhinb < 2744))
                				getitem Pineapple 1
                			else
                				getitem Melon 1
                			endif
                		elseif ((jaljal > 7189) & (jaljal < 8201))
                			//A???
                			var momodi = rand 1 1011
                			if ((momodi > 0) & (momodi < 142))
                				getitem Yggdrasilberry 1
                			elseif ((momodi > 141) & (momodi < 244))
                				getitem Old_Violet_Box 1
                			elseif ((momodi > 243) & (momodi < 584))
                				getitem Melon_Parfait 1
                			elseif ((momodi > 583) & (momodi < 714))
                				// getitem BraisedShortRibs 1
                			elseif ((momodi > 713) & (momodi < 844))
                				getitem BraisedSpareribs 1
                			elseif ((momodi > 713) & (momodi < 912))
                				getitem Set_Of_Taiming_Item 1
                			else
                				//1%(2019)
                				// getitem C_Mini_Melon 1
                			endif
               			elseif ((jaljal > 8200) & (jaljal < 9701))
                			//B???-3: Melon_Juice(15%)
               				getitem Melon_Juice 1
               			else
                		//elseif ((jaljal > 9700) & (jaljal < 10001))
                			//C
                			getitem Sweet_Melon 5
                		endif
                		close
                		return
            
            
            		break
            		case 2
            			dialog "[Фалпадора]"
            			dialog "Приходите и участвуйте!"
            			close
            			return
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
            			close
            			return
            		break
            	endchoose
            else
            	dialog "[Фалпадора]"
            	dialog "Чтобы принять внеочередное "
				dialog "участие в конкурсе, нужно "
				dialog "предоставить специльную валюту."
            	close
            	return
            endif
		break
		case 3
			dialog "[Фалпадора]"
			dialog "Приходите еще!"
			close
			return
		break
    	case 4
          var onamae = GetGlobalStr "2019_melonevt_name"
          var pinta = GetGlobalVar "2019_melonevt_size"
          dialog "[Фалпадора]"
			dialog "На текущий момент рекордсменом "
			dialog "является "+onamae+"."
			dialog "Размер его дыни составляет "
			dialog "целых "+pinta+" мм!"
          close
          return
    	break
    	case 5
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
        close
        return
    	break
	endchoose
else
	if (q8312 > 1)
		if (q8312 == 3)
  	    recall_completequest 8312
  	    endif
  	    erasequest 8312
  	endif
	if (q8311 == 0)
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
        dialog "Кроме того, я бы мог обменять специальные сладкие монеты на один из наших призов!"
		setquest 8311
		completequest 8311
		wait
    endif
    var onamae = GetGlobalStr "2019_melonevt_name"
    var pinta = GetGlobalVar "2019_melonevt_size"
    dialog "[Фалпадора]"
	dialog "На текущий момент рекордсменом "
	dialog "является "+onamae+"."
	dialog "Размер его дыни составляет "
	dialog "целых "+pinta+" мм!"
    wait
    dialog "[Фалпадора]"
    dialog "Чтобы принять участие, "
    dialog "нужно принести и продемонстрировать "
	dialog "лучшую вашу дыню."
    wait
    choose menu "Я хочу участвовать!" "Что за сладкая монета?" "Уйти " "Правила конкурса "
    	case 1
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
    		endif
    		var jaljal = rand 1 10000
    		if ((jaljal > 0) & (jaljal < 2976))
    			//C
    			var melon_size = rand 1 180
    			if (melon_size < pinta)
					dialog "[Фалпадора]"
        			dialog "Вашей дыней можно накормить "
					dialog "целую семью, но, увы..."
					dialog "Она слишком мала для состязания "
					dialog "за первое место. Всего "+melon_size+" мм."
					dialog "Вам положен утешительный приз."
        		elseif (melon_size == pinta)
					dialog "[Фалпадора]"
        			dialog "Вашей дыней можно накормить "
					dialog "целую семью, но, увы..."
					dialog "Она слишком мала для состязания "
					dialog "за первое место. Всего "+melon_size+" мм."
					dialog "Вам положен утешительный приз."
        		elseif (melon_size > pinta)
        			var name = PcName
    				SetGlobalStr "2019_melonevt_name" name
    				SetGlobalVar "2019_melonevt_size" melon_size
					dialog "[Фалпадора]"
    				dialog "Невероятно!"
					dialog "Ваша дыня - самая большая "
					dialog "из тех, что я видел сегодня!"
					dialog "Её длина - "+melon_size+" мм!"
					dialog "Но вы уже получали призовые."
						dialog "Можете получить приз за участие."
    			endif
    			dropitem Suspicious_Melon 1
    			setquest 8312
    			getitem Sweet_Melon 5
    			close
    			return
    			elseif ((jaljal > 2975) & (jaljal < 3976))
    			//B-1: Sweet_Melon_Juice
    			var melon_size = rand 181 500
    			if (melon_size < pinta)
        			dialog "[Фалпадора]"
						dialog "Ваша дыня, конечно, не самая "
						dialog "большая за сегодня, но тоже "
						dialog "достойная участница конкурса!"
						dialog "Её длина - "+melon_size+" мм."
						dialog "Но вы уже получали призовые."
						dialog "Можете получить приз за участие."
        		elseif (melon_size == pinta)
        			dialog "[Фалпадора]"
						dialog "Ваша дыня, конечно, не самая "
						dialog "большая за сегодня, но тоже "
						dialog "достойная участница конкурса!"
						dialog "Её длина - "+melon_size+" мм."
						dialog "Но вы уже получали призовые."
						dialog "Можете получить приз за участие."
        		elseif (melon_size > pinta)
        			var name = PcName
    				SetGlobalStr "2019_melonevt_name" name
    				SetGlobalVar "2019_melonevt_size" melon_size
    				dialog "[Фалпадора]"
    				dialog "Невероятно!"
						dialog "Ваша дыня - самая большая "
						dialog "из тех, что я видел сегодня!"
						dialog "Её длина - "+melon_size+" мм!"
						dialog "Но вы уже получали призовые."
						dialog "Можете получить приз за участие."
    			endif
    			dropitem Suspicious_Melon 1
    			setquest 8312
    			//B???-1: Sweet_Melon_Juice(10%)
   				getitem Sweet_Melon_Juice 1
    			close
    			return
    		elseif ((jaljal > 3975) & (jaljal < 4039))
    			//S
    			var melon_melon = rand 1 100
    			if ((melon_melon > 47) & (melon_melon < 55))
    				var melon_size = rand 1401 1500
    			else
    				var melon_size = rand 1001 1400
    			endif
    			if (melon_size < pinta)
        			dialog "[Фалпадора]"
        			dialog "Поразительно!"
						dialog "Это одна из самых больших дынь "
						dialog "из тех, что я видел сегодня!"
						dialog "Её длина - "+melon_size+" мм!"
						dialog "Но вы уже получали призовые."
						dialog "Можете получить приз за участие."
        		elseif (melon_size == pinta)
        			dialog "[Фалпадора]"
        			dialog "Поразительно!"
						dialog "Это одна из самых больших дынь "
						dialog "из тех, что я видел сегодня!"
						dialog "Её длина - "+melon_size+" мм!"
						dialog "Но вы уже получали призовые."
						dialog "Можете получить приз за участие."
        		elseif (melon_size > pinta)
        			var name = PcName
    				SetGlobalStr "2019_melonevt_name" name
    				SetGlobalVar "2019_melonevt_size" melon_size
    				dialog "[Фалпадора]"
    				dialog "Невероятно!"
						dialog "Ваша дыня - самая большая "
						dialog "из тех, что я видел сегодня!"
						dialog "Её длина - "+melon_size+" мм!"
						dialog "Но вы уже получали призовые."
						dialog "Можете получить приз за участие."
    			endif
    			dropitem Suspicious_Melon 1
      			//S???
      			if ((jaljal > 3975) & (jaljal < 4001))
      				//0.25%
          			//???? ????
          			// getitem K_Secret_Key 1
      			elseif ((jaljal > 4000) & (jaljal < 4013))
      				getitem Magic_Card_Album 1
      			elseif ((jaljal > 4012) & (jaljal < 4026))
      				getitem Bloody_Dead_Branch 1
      			else
      			//~4038
      				getitem Old_Card_Album 1
      			endif
    			close
    			return
    		elseif ((jaljal > 4038) & (jaljal < 7190))
    			//B-2: ?? ??
    			var melon_size = rand 181 500
    			if (melon_size < pinta)
					dialog "[Фалпадора]"
        			dialog "Неплохо!"
						dialog "Ваша дыня, конечно, не самая "
						dialog "большая за сегодня, но тоже "
						dialog "достойная участница конкурса!"
						dialog "Её длина - "+melon_size+" мм."
						dialog "И вот, конечно же, ваша награда."
        		elseif (melon_size == pinta)
        			dialog "[Фалпадора]"
        			dialog "Неплохо!"
						dialog "Ваша дыня, конечно, не самая "
						dialog "большая за сегодня, но тоже "
						dialog "достойная участница конкурса!"
						dialog "Её длина - "+melon_size+" мм."
						dialog "И вот, конечно же, ваша награда."
        		elseif (melon_size > pinta)
        			var name = PcName
    				SetGlobalStr "2019_melonevt_name" name
    				SetGlobalVar "2019_melonevt_size" melon_size
    				dialog "[Фалпадора]"
						dialog "Невероятно!"
						dialog "Ваша дыня - самая большая "
						dialog "из тех, что я видел сегодня!"
						dialog "Её длина - "+melon_size+" мм!"
						dialog "Конечно, вы достойны "
						dialog "лучшей награды!"
    			endif
    			dropitem Suspicious_Melon 1
    			setquest 8312
    			//B???-2
    			var shouhinb = rand 1 3151
    			if ((shouhinb > 0) & (shouhinb < 501))
    				getitem Inspector_Certificate 1
    			elseif ((shouhinb > 500) & (shouhinb < 1001))
    				getitem Branch_Of_Dead_Tree 1
    			elseif ((shouhinb > 1000) & (shouhinb < 1501))
    				getitem Old_Blue_Box 1
    			elseif ((shouhinb > 1500) & (shouhinb < 2001))
    				getitem Honey_Pastry 1
    			elseif ((shouhinb > 2000) & (shouhinb < 2336))
    				getitem Sesame_Pastry 1
    			elseif ((shouhinb > 2335) & (shouhinb < 2744))
    				getitem Pineapple 1
    			else
    				getitem Melon 1
    			endif
    			close
    			return
    		elseif ((jaljal > 7189) & (jaljal < 8201))
    			//A
    			var melon_size = rand 501 1000
    			if (melon_size < pinta)
        			dialog "[Фалпадора]"
        			dialog "Поразительно!"
						dialog "Это одна из самых больших дынь "
						dialog "из тех, что я видел!"
						dialog "Её длина - "+melon_size+" мм! Но,"
						dialog "к сожалению, вы уже участвовали "
						dialog "и получали награду сегодня."
        		elseif (melon_size == pinta)
        			dialog "[Фалпадора]"
        			dialog "Поразительно!"
						dialog "Это одна из самых больших дынь "
						dialog "из тех, что я видел!"
						dialog "Её длина - "+melon_size+" мм! Но,"
						dialog "к сожалению, вы уже участвовали "
						dialog "и получали награду сегодня."
        		elseif (melon_size > pinta)
        			var name = PcName
    				SetGlobalStr "2019_melonevt_name" name
    				SetGlobalVar "2019_melonevt_size" melon_size
    				dialog "[Фалпадора]"
    				dialog "Невероятно!"
						dialog "Ваша дыня - самая большая "
						dialog "из тех, что я видел сегодня!"
						dialog "Её длина - "+melon_size+" мм!"
						dialog "Конечно, вы достойны "
						dialog "лучшей награды!"
    			endif
    			dropitem Suspicious_Melon 1
    			setquest 8312
    			//A???
    			var momodi = rand 1 1011
    			if ((momodi > 0) & (momodi < 142))
    				getitem Yggdrasilberry 1
    			elseif ((momodi > 141) & (momodi < 244))
    				getitem Old_Violet_Box 1
    			elseif ((momodi > 243) & (momodi < 584))
    				getitem Melon_Parfait 1
    			elseif ((momodi > 583) & (momodi < 714))
    				// getitem BraisedShortRibs 1
    			elseif ((momodi > 713) & (momodi < 844))
    				getitem BraisedSpareribs 1
      			elseif ((momodi > 713) & (momodi < 912))
      				getitem Set_Of_Taiming_Item 1
      			else
      				//1%(2019)
      				// getitem C_Mini_Melon 1
      			endif
    			close
    			return
   			elseif ((jaljal > 8201) & (jaljal < 9701))
    			//B-3: Sweet_Melon_Juice
    			var melon_size = rand 181 500
    			if (melon_size < pinta)
        			dialog "[Фалпадора]"
        			dialog "Вашей дыней можно накормить "
						dialog "целую семью, но, увы..."
						dialog "Она слишком мала для состязания "
						dialog "за первое место. Всего "+melon_size+" мм."
						dialog "Но не расстраивайтесь!"
						dialog "Вам тоже положена награда."
        		elseif (melon_size == pinta)
        			dialog "[Фалпадора]"
        			dialog "Вашей дыней можно накормить "
						dialog "целую семью, но, увы..."
						dialog "Она слишком мала для состязания "
						dialog "за первое место. Всего "+melon_size+" мм."
						dialog "Но не расстраивайтесь!"
						dialog "Вам тоже положена награда."
        		elseif (melon_size > pinta)
        			var name = PcName
    				SetGlobalStr "2019_melonevt_name" name
    				SetGlobalVar "2019_melonevt_size" melon_size
    				dialog "[Фалпадора]"
    				dialog "Невероятно!"
						dialog "Ваша дыня - самая большая "
						dialog "из тех, что я видел сегодня!"
						dialog "Её длина - "+melon_size+" мм!"
						dialog "Конечно, вы достойны "
						dialog "лучшей награды!"
    			endif
    			dropitem Suspicious_Melon 1
    			setquest 8312
    			//B???-3: Melon_Juice(15%)
   				getitem Melon_Juice 1
    			close
    			return
    		else
    		//elseif ((jaljal > 9700) & (jaljal < 10001))
    			//C
    			var melon_size = rand 1 180
    			if (melon_size < pinta)
        			dialog "[Фалпадора]"
        			dialog "Вашей дыней можно накормить "
						dialog "целую семью, но, увы..."
						dialog "Она слишком мала для состязания "
						dialog "за первое место. Всего "+melon_size+" мм."
						dialog "Но не расстраивайтесь!"
						dialog "Вам тоже положена награда."
        		elseif (melon_size == pinta)
        			dialog "[Фалпадора]"
        			dialog "Вашей дыней можно накормить "
						dialog "целую семью, но, увы..."
						dialog "Она слишком мала для состязания "
						dialog "за первое место. Всего "+melon_size+" мм."
						dialog "Но не расстраивайтесь!"
						dialog "Вам тоже положена награда."
        		elseif (melon_size > pinta)
        			var name = PcName
    				SetGlobalStr "2019_melonevt_name" name
    				SetGlobalVar "2019_melonevt_size" melon_size
    				dialog "[Фалпадора]"
    				dialog "Невероятно!"
						dialog "Ваша дыня - самая большая "
						dialog "из тех, что я видел сегодня!"
						dialog "Её длина - "+melon_size+" мм!"
						dialog "Конечно, вы достойны "
						dialog "лучшей награды!"
    			endif
    			dropitem Suspicious_Melon 1
    			setquest 8312
    			getitem Sweet_Melon 5
    			close
    			return
    		endif
    	break
    	case 2
            if (v[Evt_May01_KR] > 0)
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
			wait
			dialog "[Фалпадора]"
			dialog "Насколько я поняла,"
			dialog "у вас есть такая монетка."
			dialog "Желаете поучаствовать в "
			dialog "конкурсе еще раз?"
			dialog "Я предоставлю вам одну из своих "
			dialog "дынь-конкурсантов."
			wait
            	choose menu "Я хочу участвовать!" "Приберегу монету..." "Послушать еще раз "
            		case 1
            			dialog "[Фалпадора]"
            			dialog "Вот и договорились!"
            			dialog "Посмотрим..."
						dialog "Неплохо! Вот ваша награда "
						dialog "за участие в конкурсе."
               			dropitem Evt_May01_KR 1
                		var jaljal = rand 1 10000
                		if ((jaljal > 0) & (jaljal < 2976))
                			//C
                			getitem Sweet_Melon 5
                		elseif ((jaljal > 2975) & (jaljal < 3976))
                			//B???-1: Sweet_Melon_Juice(10%)
               				getitem Sweet_Melon_Juice 1
                		elseif ((jaljal > 3975) & (jaljal < 4039))
                			//S???
                			if ((jaljal > 3975) & (jaljal < 4001))
                				//0.25%
                    			//???? ????
                    			// getitem K_Secret_Key 1
                			elseif ((jaljal > 4000) & (jaljal < 4013))
                				getitem Magic_Card_Album 1
                			elseif ((jaljal > 4012) & (jaljal < 4026))
                				getitem Bloody_Dead_Branch 1
                			else
                			//~4038
                				getitem Old_Card_Album 1
                			endif
                		elseif ((jaljal > 4038) & (jaljal < 7190))
                			//B???-2
                			var shouhinb = rand 1 3151
                			if ((shouhinb > 0) & (shouhinb < 501))
                				getitem Inspector_Certificate 1
                			elseif ((shouhinb > 500) & (shouhinb < 1001))
                				getitem Branch_Of_Dead_Tree 1
                			elseif ((shouhinb > 1000) & (shouhinb < 1501))
                				getitem Old_Blue_Box 1
                			elseif ((shouhinb > 1500) & (shouhinb < 2001))
                				getitem Honey_Pastry 1
                			elseif ((shouhinb > 2000) & (shouhinb < 2336))
                				getitem Sesame_Pastry 1
                			elseif ((shouhinb > 2335) & (shouhinb < 2744))
                				getitem Pineapple 1
                			else
                				getitem Melon 1
                			endif
                		elseif ((jaljal > 7189) & (jaljal < 8201))
                			//A???
                			var momodi = rand 1 1011
                			if ((momodi > 0) & (momodi < 142))
                				getitem Yggdrasilberry 1
                			elseif ((momodi > 141) & (momodi < 244))
                				getitem Old_Violet_Box 1
                			elseif ((momodi > 243) & (momodi < 584))
                				getitem Melon_Parfait 1
                			elseif ((momodi > 583) & (momodi < 714))
                				// getitem BraisedShortRibs 1
                			elseif ((momodi > 713) & (momodi < 844))
                				getitem BraisedSpareribs 1
                			elseif ((momodi > 713) & (momodi < 912))
                				getitem Set_Of_Taiming_Item 1
                			else
                				//1%(2019)
                				// getitem C_Mini_Melon 1
                			endif
               			elseif ((jaljal > 8200) & (jaljal < 9701))
                			//B???-3: Melon_Juice(15%)
               				getitem Melon_Juice 1
               			else
                		//elseif ((jaljal > 9700) & (jaljal < 10001))
                			//C
                			getitem Sweet_Melon 5
                		endif
                		close
                		return
            
            
            		break
            		case 2
            			dialog "[Фалпадора]"
            			dialog "Приходите еще!"
            			close
            			return
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
            			close
            			return
            		break
            	endchoose
            else
            	dialog "[Фалпадора]"
            	dialog "Чтобы принять внеочередное "
				dialog "участие в конкурсе, нужно "
				dialog "предоставить специльную валюту."
            	close
            	return
            endif
    	break
    	case 3
    		dialog "[Фалпадора]"
          		dialog "Вам необходимо достать дыню "
          		dialog "большого размера, они могут "
          		dialog "встречаться на полях, наряду с "
				dialog "обычными дынями."
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
    	break
    	case 4
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
          close
          return
    	break
    endchoose
endif
		



npc "geffen" "Контрабандист фруктов#2019family" 4_M_03 149 68 1 3 3
OnTouch2:
	Talk2me "Контрабандист фруктов#2019family" "Контрабандист фруктов : Вам нужны дыни огромных размеров?"
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
	choose menu "Да, хочу!" "Что ты тут делаешь?" "Мне это не интересно "
	case 1
		dialog "[Контрабандист фруктов]"
		dialog "Тогда бери вот эти."
    	dialog "Но... Деньги, знаешь ли, меня "
    	dialog "не интересуют. Я предпочитаю "
		dialog "обмен."
		wait
		dialog "[Контрабандист фруктов]"
		dialog "Могу предложить эти "
    	dialog "потрясающие дыни за..."
    	dialog "10 сладких дынь."
		dialog "Но больше 100 штук в одни "
		dialog "руки я не даю."
		dialog "Что думаешь? Сколько нужно?"
		wait
      	dlgwrite 1 100
        	if (input == 0)
        		dialog "[Контрабандист фруктов]"
        		dialog "Такие предложения "
        		dialog "даже звучат неубедительно."
        		close
        		return
        	elseif (input > 100)
        		dialog "[Контрабандист фруктов]"
        		dialog "Я же говорю, в одни руки "
        		dialog "100 штук. Или тебе придётся найти "
        		dialog "другого поставщика."
        		close
        		return
        	else
        		var candie = input * 10
        		if (v[Sweet_Melon] < candie)
        			dialog "[Контрабандист фруктов]"
        			dialog "Не думаю, что у тебя "
					dialog "есть то, что мне нужно,"
					dialog "давай отложим сделку."
        			close
        			return
        		endif
    			dialog "[Контрабандист фруктов]"
    			dialog "Держи."
				dialog "И не распространяй слухов "
				dialog "о том, где ты их взял."
				dialog "На всякий случай..."
    			dropitem Sweet_Melon candie
    			getitem Suspicious_Melon input
    			wait
    			dialog "[Контрабандист фруктов]"
    			dialog "Приходи еще."
    			close
    			return
        	endif
	break
	case 2
		dialog "[Контрабандист фруктов]"
		dialog "Я здесь совсем недавно."
		dialog "Вообще, я даже не планировал "
		dialog "оказаться в Геффене. Это "
		dialog "меня дела сюда привели."
		wait
		dialog "[Контрабандист фруктов]"
		dialog "Знаешь какие дела?"
		dialog "Запах монет! Ха-ха..."
		dialog "Я не хочу упускать такую возможность."
		wait
		dialog "[Контрабандист фруктов]"
		dialog "Не упусти свою выгоду, друг, заходи почаще."
		close
		return
	break
	case 3
		dialog "[Контрабандист фруктов]"
		dialog "Понял. Приходи, если тебе "
		dialog "понадобится необычный товар."
		close
		return
	break
	endchoose








//==============================================================================

