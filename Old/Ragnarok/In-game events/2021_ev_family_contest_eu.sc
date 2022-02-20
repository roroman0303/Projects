//-- 2019 5? ??? ?? ??----???? 2019/02/11--------???? ???----
//--- ????? ?? ????? ????? ???? ??-----------------------
//--- ??? ? Melon ????---------------------------------------------------
//2019: 8311-8312 (???)

//---------------------------------------------?-------------------------------

//--------------------------?? 2018 ???? ??? ?? ??-----------------
//-----------------------???? ???? ????-----------------------------

//Falpadora ?

npc "geffen" "Falpadora#2019family" 4_F_02 142 40 1 3 3
OnTouch2:
	Talk2me "Falpadora#2019family" "Falpadora : Come on! Take part in the competition of the biggest melon!"
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
        dialog "Your inventory is full. Free some "
		dialog "space and come back."
        close
        return
    else
    endif
//-----------------------------------------------?-----------------------------


		var q8311 = isbegin_quest 8311
		var q8312 = checkquest_playtime 8312
		
		var day_of_year = GetGlobalVar "day_of_year"
		var onamae = GetGlobalStr "2019_melonevt_name"
        var pinta = GetGlobalVar "2019_melonevt_size"
		
		dialog "[Falpadora]"
		dialog "Welcome to the Melon Harvest Festival! Take part in the competition!"
		wait
		dialog "[Falpadora]"
		dialog "The rules are very simple. Bring me the largest melon you can get."
		wait
		dialog "[Falpadora]"
		dialog "We, of course, will measure it. The reward for the competition, of course, depends on the size of your melon! Ha-ha! The competition is held every day!"
        wait
        dialog "[Falpadora]"
        dialog "Plus, I could trade special sweet coins for one of our prizes!"
		wait
    choose menu "I want to participate!" "Sweet coin?" "I have to go... " "What's the record?" "Competition rules "
    	case 1
			if (v[jp_event54] == day_of_year)
				dialog "[Falpadora]"
          		dialog "Unfortunately, you have already participate the competition today. Come for more rewards tomorrow!"
          		close 
				return
			endif
    		if (v[Suspicious_Melon] < 1)
        		dialog "[Falpadora]"
          		dialog "Oh, it seems you don't have a melon worthy of participating in the competition... But don't worry, the competition will continue until the end of this festival!"
          		wait
				dialog "[Falpadora]"
          		dialog "You need to get a large melon, they can be found in the fields, along with the usual sweet melons."
				wait
          		dialog "[Falpadora]"
          		dialog "...But here's another thing... It happens that contrabandists visit Geffen, they also have rare-sized melons. But I think you should not participate in such ways..."
          		close
          		return
    		endif
    		var jaljal = rand 1 10000
    		if (jaljal > 9500)
    			var melon_melon = rand 1 100
				if ((melon_melon > 47) & (melon_melon < 55))
					var melon_size = rand 1401 1500
				else
					var melon_size = rand 1001 1400
				endif
    			if (melon_size < pinta)
					dialog "[Falpadora]"
					dialog "Amazing! This is one of the largest melons I have seen today!"
					dialog "Its length - "+melon_size+" mm!"
					dialog "Of course you deserve the best reward!"
        		elseif (melon_size == pinta)
					dialog "[Falpadora]"
					dialog "Amazing! This is one of the largest melons I have seen today!"
					dialog "Its length - "+melon_size+" mm!"
					dialog "Of course you deserve the best reward!"
        		elseif (melon_size > pinta)
        			var name = PcName
    				SetGlobalStr "2019_melonevt_name" name
    				SetGlobalVar "2019_melonevt_size" melon_size
					dialog "[Falpadora]"
    				dialog "Incredible! Your melon is the largest I've seen!"
					dialog "Its length - "+melon_size+" mm!"
					dialog "Of course you deserve the best reward!"
    			endif
    			dropitem Suspicious_Melon 1
				setitem jp_event54 day_of_year
    			//setquest 8312
    			if (jaljal > 9900)
					getitem Apple 1 //C_Mini_Melon 1
				elseif (jaljal > 9800)
					getitem Melon_Juice 100
				elseif (jaljal > 9700)
					getitem Melon_Bread 100
				elseif (jaljal > 9600)
					getitem Sweet_Melon_Juice 100
				else
					getitem Melon_Parfait 5
				endif
    			close
    			return
    		elseif (jaljal > 6000)
    			var melon_size = rand 501 1000
    			if (melon_size < pinta)
        			dialog "[Falpadora]"
					dialog "Your melon is not the biggest one today, but also a worthy participant in the competition!"
					dialog "Its length - "+melon_size+" mm!"
					dialog "Here is your reward."
        		elseif (melon_size == pinta)
        			dialog "[Falpadora]"
					dialog "Your melon is not the biggest one today, but also a worthy participant in the competition!"
					dialog "Its length - "+melon_size+" mm!"
					dialog "Here is your reward."
        		elseif (melon_size > pinta)
        			var name = PcName
    				SetGlobalStr "2019_melonevt_name" name
    				SetGlobalVar "2019_melonevt_size" melon_size
    				dialog "[Falpadora]"
    				dialog "Incredible! Your melon is the largest I've seen!"
					dialog "Its length - "+melon_size+" mm!"
					dialog "Of course you deserve the best reward!"
    			endif
    			dropitem Suspicious_Melon 1
				setitem jp_event54 day_of_year
    			//setquest 8312
    			if (jaljal > 8000)
					getitem Sweet_Melon 30
				elseif (jaljal > 7500)
					getitem Melon_Juice 30
				elseif (jaljal > 7000)
					getitem Melon_Bread 30
				elseif (jaljal > 6500)
					getitem Sweet_Melon_Juice 30
				else
					getitem Melon_Parfait 1
				endif
    			close
    			return
    		else
    			var melon_size = rand 181 500
    			if (melon_size < pinta)
        			dialog "[Falpadora]"
       			dialog "Your melon can feed an entire family, but... it is too small to compete "
				dialog "for the first place. Just "+melon_size+" mm."
				dialog "But don't be discouraged! You also have a reward."
        		elseif (melon_size == pinta)
        			dialog "[Falpadora]"
       			dialog "Your melon can feed an entire family, but... it is too small to compete "
				dialog "for the first place. Just "+melon_size+" mm."
				dialog "But don't be discouraged! You also have a reward."
        		elseif (melon_size > pinta)
        			var name = PcName
    				SetGlobalStr "2019_melonevt_name" name
    				SetGlobalVar "2019_melonevt_size" melon_size
    				dialog "[Falpadora]"
    				dialog "Incredible! Your melon is the largest I've seen!"
					dialog "Its length - "+melon_size+" mm!"
					dialog "Of course you deserve the best reward!"
    			endif
    			dropitem Suspicious_Melon 1
				setitem jp_event54 day_of_year
				//setquest 8312
      			if (jaljal > 3000)
					getitem Sweet_Melon 10
				elseif (jaljal > 2000)
					getitem Melon_Juice 10
				elseif (jaljal > 1000)
					getitem Sweet_Melon_Juice 10
				else
					getitem Melon_Bread 10
				endif
    			close
    			return
    		endif
    	break
    	case 2
            if (v[Evt_May01_KR] > 0)
            dialog "[Falpadora]"
            dialog "Oh, are you talking about sweet coins? They are highly prized in the farming and agronomical community. This is a kind of friendly currency, we exchange it among ourselves."
			wait
			dialog "[Falpadora]"
			dialog "I think for such a coin I could offer you an extra participation in the competition for the largest melon. With rewards, of course."
			wait
			dialog "[Falpadora]"
			dialog "As far as I understand, you have such a coin. Would you like to participate in the competition again? I will provide you with one of my contestant melons."
			wait
            	choose menu "I want to participate!" "I'll save this coin..." "Listen again "
            		case 1
            			dialog "[Falpadora]"
            			dialog "That's agreed! Let's see... Not bad! Here is your reward for the competition."
               			dropitem Evt_May01_KR 1
                		var jaljal = rand 1 10000
                		if (jaljal > 9500)
							var melon_melon = rand 1 100
							if ((melon_melon > 47) & (melon_melon < 55))
								var melon_size = rand 1401 1500
							else
								var melon_size = rand 1001 1400
							endif

							dropitem Suspicious_Melon 1
							if (jaljal > 9900)
								getitem Apple 1 //C_Mini_Melon 1
							elseif (jaljal > 9800)
								getitem Melon_Juice 100
							elseif (jaljal > 9700)
								getitem Melon_Bread 100
							elseif (jaljal > 9600)
								getitem Sweet_Melon_Juice 100
							else
								getitem Melon_Parfait 5
							endif
							close
							return
						//
						elseif (jaljal > 6000)
							var melon_size = rand 501 1000
							dropitem Suspicious_Melon 1
							if (jaljal > 8000)
								getitem Sweet_Melon 30
							elseif (jaljal > 7500)
								getitem Melon_Juice 30
							elseif (jaljal > 7000)
								getitem Melon_Bread 30
							elseif (jaljal > 6500)
								getitem Sweet_Melon_Juice 30
							else
								getitem Melon_Parfait 1
							endif
							close
							return
						//
						else
							var melon_size = rand 181 500
							dropitem Suspicious_Melon 1
							if (jaljal > 3000)
								getitem Sweet_Melon 10
							elseif (jaljal > 2000)
								getitem Melon_Juice 10
							elseif (jaljal > 1000)
								getitem Sweet_Melon_Juice 10
							else
								getitem Melon_Bread 10
							endif
							close
							return
						endif
                		close
                		return
            
            
            		break
            		case 2
            			dialog "[Falpadora]"
            			dialog "Come again!"
            			close
            			return
            		break
            		case 3
            			dialog "[Falpadora]"
						dialog "Oh, are you talking about sweet coins? They are highly prized in the farming and agronomical community. This is a kind of friendly currency, we exchange it among ourselves."
						wait
						dialog "[Falpadora]"
						dialog "I think for such a coin I could offer you an extra participation in the competition for the largest melon. With rewards, of course."
            			close
            			return
            		break
            	endchoose
            else
            	dialog "[Falpadora]"
            	dialog "To take an extra participation in the competition, you need to provide a special currency."
            	close
            	return
            endif
    	break
    	case 3
    			dialog "[Falpadora]"
          		dialog "You need to get a large melon, they can be found in the fields, along with the usual sweet melons."
				wait
          		dialog "[Falpadora]"
          		dialog "...But here's another thing... It happens that contrabandists visit Geffen, they also have rare-sized melons. But I think you should not participate in such ways..."
          		close
          		return
    	break
		case 4
          var onamae = GetGlobalStr "2019_melonevt_name"
          var pinta = GetGlobalVar "2019_melonevt_size"
          dialog "[Falpadora]"
			dialog "Currently the record holder "
			dialog "is "+onamae+"."
			dialog "His melon size is "
			dialog "unimaginable "+pinta+" mm!"
          close
          return
    	case 5
        dialog "[Falpadora]"
		dialog "The rules are very simple. Bring me the largest melon you can get."
		wait
		dialog "[Falpadora]"
		dialog "We, of course, will measure it. The reward for the competition, of course, depends on the size of your melon! Ha-ha! The competition is held every day!"
        close
        return
    	break
    endchoose
// endif
return
		



npc "geffen" "Fruit contrabandist#2019family" 4_M_03 149 68 1 3 3
OnTouch2:
	Talk2me "Fruit contrabandist#2019family" "Fruit contrabandist : Do you want to buy huge melons?"
return
OnClick:
//--------?? ?? ?? ??---------------------------------------------------
    var wt_inven = GetInventoryRemainCount 1301 3
    if ((wt_inven == 2) | (wt_inven == 3))
        dialog "Your inventory is full. Free some "
		dialog "space and come back."
        close
        return
    else
    endif
//-----------------------------------------------?-----------------------------
	dialog "[Fruit contrabandist]"
	dialog "Buddy, would you like some juicy overseas fruit? By your appearance, I can understand that you are a wealthy person and appreciate quality products."
	wait
	dialog "[Fruit contrabandist]"
	dialog "I have an offer for you! How about a fruit like melon? Not a simple, of course..."
	wait
	dialog "[Fruit contrabandist]"
	dialog "It is of a special variety, the best of the best! Do you want to win the competition for the biggest melon?"
	wait
	choose menu "Yes, of course!" "What are you doing here?" "I'm not interested in this "
	case 1
		dialog "[Fruit contrabandist]"
		dialog "Take these. But... money, you know, doesn't interest me. I prefer barter."
		wait
		dialog "[Fruit contrabandist]"
		dialog "I can offer these amazing melons for... 10 sweet melons. But I don’t give more than 100 pieces to one person. What do you think? How much do you need?"
		wait
      	dlgwrite 1 100
        	if (input == 0)
        		dialog "[Fruit contrabandist]"
        		dialog "Such offers even sound unconvincing."
        		close
        		return
        	elseif (input > 100)
        		dialog "[Fruit contrabandist]"
        		dialog "As I say, in one hand 100 rare melons. Or you have to find another supplier."
        		close
        		return
        	else
        		var candie = input * 10
        		if (v[Sweet_Melon] < candie)
        			dialog "[Fruit contrabandist]"
        			dialog "I don't think you have what I need, let's put the deal on hold."
        			close
        			return
        		endif
    			dialog "[Fruit contrabandist]"
    			dialog "Here you go. And don't spread rumors about where you got them. Just in case..."
    			dropitem Sweet_Melon candie
    			getitem Suspicious_Melon input
    			wait
    			dialog "[Fruit contrabandist]"
    			dialog "Come again..."
    			close
    			return
        	endif
	break
	case 2
		dialog "[Fruit contrabandist]"
		dialog "Actually, I didn't even plan to be in Geffen. It was my business that brought me here."
		wait
		dialog "[Fruit contrabandist]"
		dialog "What business? The smell of coins! Ha-ha... I don't want to miss this opportunity."
		wait
		dialog "[Fruit contrabandist]"
		dialog "Don't miss your profit, friend, come back..."
		close
		return
	break
	case 3
		dialog "[Fruit contrabandist]"
		dialog "Got it. Come if you need any fruits."
		close
		return
	break
	endchoose








//==============================================================================

