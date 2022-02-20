
npc "geffen" "Dilpor#2019family" 4_M_NFMAN 86 35 5 0 0
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
	dialog "[Dilpor]"
	dialog "You can't participate in "
	dialog "the Melon Harvest Festival."
	dialog "You need to be level 20 or higher."
	close
	return
	endif

//--------?? ?? ?? ??---------------------------------------------------
    var wt_inven = GetInventoryRemainCount 1301 3
    if ((wt_inven == 2) | (wt_inven == 3))
        dialog "[Dilpor]"
        dialog "Your inventory is full. Free some "
		dialog "space and come back."
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
	dialog "[Dilpor]"
	dialog "Welcome to the Melon Harvest Festival! Adventurers, hurry up to get involved!"
	wait
	dialog "[Dilpor]"
	dialog "... This year there was..."
	dialog "a variety... a new... "
	dialog "juicy..."
	Talk2me "Soor#2019family" "Soor : Oh..."
	wait
	dialog "[Dilpor]"
	dialog "No... uh..."
	Talk2me "Soor#2019family" "Soor : Take a look on your cheat sheet..."
	wait
	dialog "-- Dilpor looks at the note, --"
	dialog "-- hidden in his palm. --"
	wait
	dialog "[Dilpor]"
	dialog "... So. A new sweet melon variety has been introduced this year! Great harvest! Ha ha ha!"
	wait
	dialog "[Dilpor]"
	dialog "Last year, the entire melon crop was harvested, thanks to the efforts of my family."
	wait
	dialog "[Dilpor]"
	dialog "But now we need help! I promise to supply the adventurers who will help me in this matter!"	
	wait
	choose menu "Family business is good business"
	endchoose
	dialog "[Dilpor]"
	dialog "Exactly. The melon harvest is small now, not the same as last year. So my parents decided that I could manage this festival alone."
	wait
	dialog "[Dilpor]"
	dialog "But there are other farmers' houses, besides my house. And all this harvest needs to be cropped..."
	wait
	dialog "[Dilpor]"
	dialog "So if you help me with the supply of melons ...I ...I will make you the most delicious dessert!"
	wait
	choose menu "Are you asking me?" "I have to go..."
	case 1
		dialog "[Dilpor]"
		dialog "Yes, I ask you to explore the fields around the cities and find melon seedlings."
		wait
		dialog "[Dilpor]"
		dialog "These seedlings are consist of... poring-like creatures. But don't believe your eyes! These are only sweet melons!"
		wait
		dialog "[Dilpor]"
		dialog "Bring me 10 sweet melons, and I will make a sweet dessert out of them."
		setquest 8577
		close
		return
	break
	case 2
		dialog "[Dilpor]"
		dialog "Okay. Everyone can spend time at the festival as they want."
		close
		return
	break
	endchoose
elseif (q8577 == 1)
//??? ??? ????? ???
    if (v[Sweet_Melon] < 10)
			dialog "[Dilpor]"
			dialog "Yes, I ask you to explore the fields around the cities and find melon seedlings."
			wait
			dialog "[Dilpor]"
			dialog "These seedlings are consist of... poring-like creatures. But don't believe your eyes! These are only sweet melons!"
			wait
			dialog "[Dilpor]"
			dialog "Bring me 10 sweet melons, and I will make a sweet dessert out of them."
			close
			return
    else
        dialog "[Dilpor]"
		dialog "Ah, sweet melon... Wow! You've got eyes... A little sticky skin, fresh scent and a strange lively sensation..."
        wait
    	dialog "[Dilpor]"
    	dialog "..."
    	wait
        if (v[Sweet_Melon] > 9)
			dialog "[Dilpor]"
			dialog "But... That's all right! Thank you very much for your help."
			wait
			dialog "[Dilpor]"
			dialog "As I promised, here is your sweet dessert."
			dropitem Sweet_Melon 10
			completequest 8577
			getitem Sweet_Melon_Juice 5
			wait
        else
        	dialog "[Dilpor]"
        	dialog "Yes, I ask you to explore the fields around the cities and find melon seedlings."
        	close
        	return
        endif
        dialog "[Dilpor]"
        dialog "Can I ask you for one more request..."
        wait
        dialog "[Dilpor]"
		dialog "If you suddenly want to help, come please! I still have one more thing to do."
        close
        return
    endif
elseif (q8577 == 2)
endif

if (q8578 == 0)
	dialog "[Dilpor]"
	dialog "Oh, you're already here, advanturer."
	wait
	choose menu "Offer help " "Ask about melon juice "  "I have to go..."
  		case 1
  			dialog "[Dilpor]"
			dialog "This is very handy! Last year we developed a new menu and threw a surprise party for the whole family."
			wait
      		dialog "[Dilpor]"
			dialog "But this year we were busy with a new variety of melons, so we didn't have time for fun and relax..."
			wait
			dialog "[Dilpor]"
			dialog "When I was young and visiting my family, my parents always sent me their specialty, melon parfait."
			Talk2me "Soor#2019family" "Soor : Is this a melon parfait? "
			Talk2me "Dilpor#2019family" "Dilpor : Yes, Soor... "
      		wait
      		dialog "[Dilpor]"
			dialog "Now my parents have gone on vacation, and I have the opportunity to send the parfait to my parents by myself!"
			wait
			dialog "[Dilpor]"
			dialog "I would be very grateful if you could bring the parfait. In this cooler, of course. I don't want it to melt ..."
      		wait
      		choose menu "Of course " "I'll think about it..."
      			case 1
      				dialog "[Dilpor]"
					dialog "Great! My parents now are at a resort in the city of Hugel. I think you can find them on the beach."
      				setquest 8578
      				getitem Ice_Box 1
      				close
      				return
      			break
      			case 2
      				dialog "[Dilpor]"
      				dialog "Okay, I will be waiting."
      				close
      				return
      			break
      		endchoose
  		break
  		case 2
            dialog "[Dilpor]"
            dialog "Do you want some melon juice?"
            wait
            choose menu "Yes " "Is there any sweeter juice?" "No "
             	case 1
             		dialog "[Dilpor]"
					dialog "Ha-ha-ha, I might not have asked. Noone can resist such a delicacy, right?"
					wait
					dialog "[Dilpor]"
					dialog "To make melon juice, I need one sweet melon and 1000 zeny. I can make 30 glasses of a juice at a time."
					wait
					dialog "[Dilpor]"
					dialog "So how much melon juice do you want?"
             		wait   		
            	dlgwrite 1 30
            	if (input == 0)
            		dialog "[Dilpor]"
					dialog "If you don't want juice, why are you asking?"
            		close
            		return
            	elseif (input > 30)
            		dialog "[Dilpor]"
            		dialog "I can't make that much juice."
            		close
            		return
            	else
            		var nomnom = input * 1000
            		if (v[Sweet_Melon] < input)
            			dialog "[Dilpor]"
            			dialog "Unfortunately, I cannot make you that much juice. You have not enough sweet melons."
            			close
            			return
            		endif
            		if (v[VAR_MONEY] < nomnom)
            			dialog "[Dilpor]"
            			dialog "Unfortunately, I cannot make you that much juice. You have not enough zeny."
            			close
            			return
            		endif
            		dialog "[Dilpor]"
            		dialog "Here you go, today the juice is especially tasty and sweet. Come if you want more."
            		dropitem Sweet_Melon input
            		dropgold nomnom
            		getitem Melon_Juice input
            		close
            	endif
             	break
             	case 2 //??? ?? ?? ?? ?? ?
             		dialog "[Dilpor]"
					dialog "Ha-ha-ha, I might not have asked. Noone can resist such a delicacy, right?"
					wait
					dialog "[Dilpor]"
					dialog "To make melon juice, I need five sweet melons and 2500 zeny."
					wait
             		dialog "[Dilpor]"
					dialog "Plus, if you want 10 or more juices, I'll give you a compliment from the establishment!"
             		wait   	
					dialog "[Dilpor]"
					dialog "So how much juice do you want? Maximum is 30 juice at a time."
             		wait 					
              	dlgwrite 1 30
              	if (input == 0)
              		dialog "[Dilpor]"
              		dialog "If you don't want juice, why are you asking?"
              		close
              		return
              	elseif (input > 30)
              		dialog "[Dilpor]"
              		dialog "I can't make that much juice."
              		close
              		return
              	else
              		var screw = input * 5
              		var nomnomnom = input * 2500
              		if (v[Sweet_Melon] < screw)
              			dialog "[Dilpor]"
              			dialog "Unfortunately, I cannot make you that much juice. You have not enough sweet melons."
              			close
              			return
              		endif
              		if (v[VAR_MONEY] < nomnomnom)
              			dialog "[Dilpor]"
              			dialog "Unfortunately, I cannot make you that much juice. You have not enough zeny."
              			close
              			return
              		endif
              		dialog "[Dilpor]"
              		dialog "Here you go, today the juice is especially tasty and sweet. Come if you want more."
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
              	dialog "[Dilpor]"
              	dialog "Next time..."
              	close
              	return
             	break
          	endchoose
  		break
  		case 3
  			dialog "[Dilpor]"
  			dialog "Next time..."
  			close
  			return
  		break
  	endchoose
elseif (q8578 == 1)
	dialog "[Dilpor]"
	dialog "Oh, you're already here, advanturer."
	wait 
	choose menu "Ask about melon juice " "Ask about a request " "I have to go..."
  		case 1
            dialog "[Dilpor]"
			dialog "Do you want some melon juice?"
            wait
            choose menu "Yes " "Is there any sweeter juice?" "No "
             	case 1
             		dialog "[Dilpor]"
					dialog "Ha-ha-ha, I might not have asked. Noone can resist such a delicacy, right?"
					wait
					dialog "[Dilpor]"
					dialog "To make melon juice, I need one sweet melon and 1000 zeny. I can make 30 glasses of a juice at a time."
					wait
					dialog "[Dilpor]"
					dialog "So how much melon juice do you want?"
             		wait   		
            	dlgwrite 1 30
            	if (input == 0)
            		dialog "[Dilpor]"
					dialog "If you don't want juice, why are you asking?"
            		close
            		return
            	elseif (input > 30)
            		dialog "[Dilpor]"
            		dialog "I can't make that much juice."
            		close
            		return
            	else
            		var nomnom = input * 1000
            		if (v[Sweet_Melon] < input)
            			dialog "[Dilpor]"
            			dialog "Unfortunately, I cannot make you that much juice. You have not enough sweet melons."
            			close
            			return
            		endif
            		if (v[VAR_MONEY] < nomnom)
            			dialog "[Dilpor]"
            			dialog "Unfortunately, I cannot make you that much juice. You have not enough zeny."
            			close
            			return
            		endif
            		dialog "[Dilpor]"
            		dialog "Here you go, today the juice is especially tasty and sweet. Come if you want more."
            		dropitem Sweet_Melon input
            		dropgold nomnom
            		getitem Melon_Juice input
            		close
            	endif
             	break
             	case 2 //??? ?? ?? ?? ?? ?
             		dialog "[Dilpor]"
					dialog "Ha-ha-ha, I might not have asked. Noone can resist such a delicacy, right?"
					wait
					dialog "[Dilpor]"
					dialog "To make melon juice, I need five sweet melons and 2500 zeny."
					wait
             		dialog "[Dilpor]"
					dialog "Plus, if you want 10 or more juices, I'll give you a compliment from the establishment!"
             		wait   	
					dialog "[Dilpor]"
					dialog "So how much juice do you want? Maximum is 30 juice at a time."
             		wait 					
              	dlgwrite 1 30
              	if (input == 0)
              		dialog "[Dilpor]"
              		dialog "If you don't want juice, why are you asking?"
              		close
              		return
              	elseif (input > 30)
              		dialog "[Dilpor]"
              		dialog "I can't make that much juice."
              		close
              		return
              	else
              		var screw = input * 5
              		var nomnomnom = input * 2500
              		if (v[Sweet_Melon] < screw)
              			dialog "[Dilpor]"
              			dialog "Unfortunately, I cannot make you that much juice. You have not enough sweet melons."
              			close
              			return
              		endif
              		if (v[VAR_MONEY] < nomnomnom)
              			dialog "[Dilpor]"
              			dialog "Unfortunately, I cannot make you that much juice. You have not enough zeny."
              			close
              			return
              		endif
              		dialog "[Dilpor]"
              		dialog "Here you go, today the juice is especially tasty and sweet. Come if you want more."
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
              	dialog "[Dilpor]"
              	dialog "Next time..."
              	close
              	return
             	break
          	endchoose
  		break
  		case 2
			if (v[Ice_Box] == 0)
				dialog "[Dilpor]"
				dialog "Have you lost the cooler?! Oh, okay... I know... being an adventurer is incredibly difficult. Here's another box for you."
				getitem Ice_Box 1
				wait
				dialog "[Dilpor]"
				dialog "Please don't lose it again."
				close
				return
			else
				dialog "[Dilpor]"
				dialog "I have the opportunity to send the parfait to my parents by myself!"
				wait
				dialog "[Dilpor]"
				dialog "I would be very grateful if you could bring the parfait. In this cooler, of course. I don't want it to melt ..."
				wait
      			dialog "[Dilpor]"
				dialog "My parents now are at a resort in the city of Hugel. I think you can find them on the beach."
				close
				return
			endif
      	break
      	case 3
  			dialog "[Dilpor]"
  			dialog "Next time..."
  			close
  			return
  		break
  	endchoose
elseif (q8578 == 2)
endif

if (q8579 == 1)
	dialog "[Dilpor]"
	dialog "Hello adventurer! Have you already brought the parfait to your parents? It must have been a long way. Is this a note from my father?"
	wait
	dialog "[Dilpor]"
	dialog "Dad is worried about whether I can manage the event. It's really hard."
	wait
	dialog "[Dilpor]"
	dialog "But last year was even harder for the parents, but they did it! So I can do it too."
	wait
	dialog "[Dilpor]"
	dialog "By the way, while you were away, I made melon bread. I think it worked out well for the first time! You can try it."
	completequest 8579
	setquest 8584
	getitem Melon_Bread 10
	getitem Melon_Parfait 5
	wait
	var q8580 = isbegin_quest 8580
	if (q8580 == 0)
		dialog "[Dilpor]"
		dialog "Now, I think you should help Soor too. Although he is my competitor, he also participates in the festival."
		Talk2me "Soor#2019family" "Soor : In fact, help would be welcome..."
	elseif (q8580 == 1)
		dialog "[Dilpor]"
		dialog "Now, I think you should help Soor too. Although he is my competitor, he also participates in the festival."
		Talk2me "Soor#2019family" "Soor : I'm still waiting..."
	elseif (q8580 == 2)
    	dialog "[Dilpor]"
		dialog "Now, I think you should help Soor too. Although he is my competitor, he also participates in the festival."
		Talk2me "Soor#2019family" "Soor : I'm still waiting..."
    endif
	wait
	dialog "[Dilpor]"
	dialog "By the way, are you taking part in the competition for the biggest melon? I'll try my luck."
	wait
	dialog "[Dilpor]"
	dialog "And my cousin makes commemorative hats out of melons! To keep the mood of the festival with you for a long time."
	wait
	dialog "[Dilpor]"
	dialog "And thanks again for your help! If you need to make melon juice or bread, you can always ask me."
	close
	return	
elseif (q8579 == 2)
  //?? ??
        dialog "[Dilpor]"
        dialog "Glad to see you! Do you want to order something?"
        wait
        choose menu "Melon juice " "Sweet melon juice " "Melon bread " "I have to go... "
         	case 1
             		dialog "[Dilpor]"
					dialog "Ha-ha-ha, I might not have asked. Noone can resist such a delicacy, right?"
					wait
					dialog "[Dilpor]"
					dialog "To make melon juice, I need one sweet melon and 1000 zeny. I can make 30 glasses of a juice at a time."
					wait
					dialog "[Dilpor]"
					dialog "So how much melon juice do you want?"
             		wait   		
            	dlgwrite 1 30
            	if (input == 0)
            		dialog "[Dilpor]"
					dialog "If you don't want juice, why are you asking?"
            		close
            		return
            	elseif (input > 30)
            		dialog "[Dilpor]"
            		dialog "I can't make that much juice."
            		close
            		return
            	else
            		var nomnom = input * 1000
            		if (v[Sweet_Melon] < input)
            			dialog "[Dilpor]"
            			dialog "Unfortunately, I cannot make you that much juice. You have not enough sweet melons."
            			close
            			return
            		endif
            		if (v[VAR_MONEY] < nomnom)
            			dialog "[Dilpor]"
            			dialog "Unfortunately, I cannot make you that much juice. You have not enough zeny."
            			close
            			return
            		endif
            		dialog "[Dilpor]"
            		dialog "Here you go, today the juice is especially tasty and sweet. Come if you want more."
            		dropitem Sweet_Melon input
            		dropgold nomnom
            		getitem Melon_Juice input
            		close
            	endif
             	break
             	case 2 //??? ?? ?? ?? ?? ?
             		dialog "[Dilpor]"
					dialog "Ha-ha-ha, I might not have asked. Noone can resist such a delicacy, right?"
					wait
					dialog "[Dilpor]"
					dialog "To make melon juice, I need five sweet melons and 2500 zeny."
					wait
             		dialog "[Dilpor]"
					dialog "Plus, if you want 10 or more juices, I'll give you a compliment from the establishment!"
             		wait   	
					dialog "[Dilpor]"
					dialog "So how much juice do you want? Maximum is 30 juice at a time."
             		wait 					
              	dlgwrite 1 30
              	if (input == 0)
              		dialog "[Dilpor]"
              		dialog "If you don't want juice, why are you asking?"
              		close
              		return
              	elseif (input > 30)
              		dialog "[Dilpor]"
              		dialog "I can't make that much juice."
              		close
              		return
              	else
              		var screw = input * 5
              		var nomnomnom = input * 2500
              		if (v[Sweet_Melon] < screw)
              			dialog "[Dilpor]"
              			dialog "Unfortunately, I cannot make you that much juice. You have not enough sweet melons."
              			close
              			return
              		endif
              		if (v[VAR_MONEY] < nomnomnom)
              			dialog "[Dilpor]"
              			dialog "Unfortunately, I cannot make you that much juice. You have not enough zeny."
              			close
              			return
              		endif
              		dialog "[Dilpor]"
              		dialog "Here you go, today the juice is especially tasty and sweet. Come if you want more."
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
       			dialog "[Dilpor]"
				dialog "I’m just learning how to bake the bread, but the last time it came out very tasty."
				wait
				dialog "[Dilpor]"
				dialog "To make melon bread, I need five sweet melons and 1500 zeny."
				wait
				dialog "[Dilpor]"
				dialog "So how much bread do you want? Maximum is 30 bread at a time."
             	wait		
            	dlgwrite 1 30
            	if (input == 0)
            		dialog "[Dilpor]"
            		dialog "If you don't want bread, why are you asking?"
            		close
            		return
            	elseif (input > 30)
            		dialog "[Dilpor]"
              		dialog "I can't make that much bread."
              		close
              		return
            	else
            		var screw = input * 5
            		var nomnomnom = input * 1500
            		if (v[Sweet_Melon] < screw)
              			dialog "[Dilpor]"
              			dialog "Unfortunately, I cannot make you that much bread. You have not enough sweet melons."
              			close
              			return
              		endif
              		if (v[VAR_MONEY] < nomnomnom)
              			dialog "[Dilpor]"
              			dialog "Unfortunately, I cannot make you that much bread. You have not enough zeny."
              			close
              			return
              		endif
            		dialog "[Dilpor]"
            		dialog "Here you go, today the bread is especially tasty and soft. Come if you want more."
            		dropitem Sweet_Melon screw
            		dropgold nomnomnom
            		getitem Melon_Bread input
            		close
            		return
            	endif
	      	break
         	case 4
          	dialog "[Dilpor]"
          	dialog "Next time..."
          	close
          	return
         	break
      	endchoose
  endif

npc "geffen" "Nannabi#2019family" 1_F_04 106 63 5 3 3
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
	Talk2me "Nannabi#2019family" "Nannabi : Commemorative hats made of vegetable leather! Come, choose!"
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

	var q8579 = isbegin_quest 8579
	var q8584 = isbegin_quest 8584
	var q8585 = isbegin_quest 8585
if (q8584 == 0)
	dialog "[Nannabi]"
	dialog "Welcome to the Melon Harvest Festival!"
	wait
	dialog "[Nannabi]"
	dialog "Beautiful vegetable leather hats coming soon!"
	wait
	dialog "[Nannabi]"
  	dialog "In the meantime, I can offer you sweet melon juice for 10 melon skin."
  	wait
  	choose menu "I have a melon skin " "I have to go... "
  		case 1
  			dialog "[Nannabi]"
  			dialog "So how much juice do you want? Maximum is 100 juice at a time."
  			wait
    		dlgwrite 1 100
    		if (input == 0)
				dialog "[Nannabi]"
    			dialog "If you don't want juice, why are you asking?"
    			close
    			return
    		elseif (input > 100)
    			dialog "[Nannabi]"
    			dialog "I can't make that much juice."
    			close
    			return
    		else
    			var merona = input * 10
    			if (v[Dalcom_Skin] < merona)
    				dialog "[Nannabi]"
            		dialog "Unfortunately, I cannot make you that much juice. You have not enough sweet melons."
    				close
    				return
    			else
          			dialog "[Nannabi]"
          			dialog "Here you go, today the juice is especially tasty and sweet. Come if you want more."
          			dropitem Dalcom_Skin merona
          			getitem Sweet_Melon_Juice input
          			close
          			return
    			endif
    		endif
    	break
    	case 2
    		dialog "[Nannabi]"
    		dialog "Okay, come next time! "
    		close
    		return
    	break
  	endchoose
elseif (q8584 == 1)
//Dilpor ??? ???
        	dialog "[Nannabi]"
			dialog "Welcome to the Melon Harvest Festival!"
			wait
			dialog "[Nannabi]"
			dialog "I am a master of vegetable leather clothing. I can suggest you make something from the melons' skin."
			wait
			dialog "[Nannabi]"
			dialog "How about a commemorative hat from the festival? In my opinion, this hat really suits you and your equipment!"
			wait
			choose menu "I think so too!"
			endchoose
			dialog "[Nannabi]"
			dialog "To create this hat I will need 30 melon skin parts."
			wait
			dialog "[Nannabi]"
			dialog "And hurry up, I may have more orders soon!"
        	completequest 8584
        	setquest 8585
        	close
        	return
endif

if (q8585 == 1)
	dialog "[Nannabi]"
	dialog "Hello again! Did you get the melon skin? Without it, as you know, I can't do anything."
	wait
	choose menu "Buy a hat " "Ask about melon juice" "I have to go... "
    	case 1
    		if (v[Dalcom_Skin] > 29)
    			dialog "[Nannabi]"
    			dialog "Really good skin parts! I think I can make an excellent commemorative hat from them. Wait a moment..."
				wait
				dialog "[Nannabi]"
				dialog "Done! If you have an extra melon skin, I think I could talk with Soor to exchange it for some sweet melon juice."
    			dropitem Dalcom_Skin 30
    			completequest 8585
    			getitem C_Melon_Cap 1
    			getitem Melon_Parfait 1
    			wait
    			dialog "[Nannabi]"
    			dialog "Come for sweet melon juice!"
    			close
    			return
    		else
    			dialog "[Nannabi]"
    			dialog "To create a beautiful vegetable leather hat, you need at least 30 melon skin parts."
    			close
    			return
    		endif
    	break
    	case 2
  			dialog "[Nannabi]"
  			dialog "So how much juice do you want? Maximum is 100 juice at a time."
  			wait
    		dlgwrite 1 100
    		if (input == 0)
				dialog "[Nannabi]"
    			dialog "If you don't want juice, why are you asking?"
    			close
    			return
    		elseif (input > 100)
    			dialog "[Nannabi]"
    			dialog "I can't make that much juice."
    			close
    			return
    		else
    			var merona = input * 10
    			if (v[Dalcom_Skin] < merona)
    				dialog "[Nannabi]"
            		dialog "Unfortunately, I cannot make you that much juice. You have not enough sweet melons."
    				close
    				return
    			else
          			dialog "[Nannabi]"
          			dialog "Here you go, today the juice is especially tasty and sweet. Come if you want more."
          			dropitem Dalcom_Skin merona
          			getitem Sweet_Melon_Juice input
          			close
          			return
    			endif
    		endif
    	break
    	case 3
    		dialog "[Nannabi]"
    		dialog "Okay. Enjoy the Melon Harvest Festival!"
    		close
    		return
    	break
	endchoose
else
  //??? ?? ???
	dialog "[Nannabi]"
	dialog "Welcome to the Melon Harvest Festival!"
	wait
	dialog "[Nannabi]"
  	dialog "I can offer you sweet melon juice for 10 melon skin."
  	wait
  	choose menu "I have a melon skin " "I have to go... "
  		case 1
  			dialog "[Nannabi]"
  			dialog "So how much juice do you want? Maximum is 100 juice at a time."
  			wait
    		dlgwrite 1 100
    		if (input == 0)
				dialog "[Nannabi]"
    			dialog "If you don't want juice, why are you asking?"
    			close
    			return
    		elseif (input > 100)
    			dialog "[Nannabi]"
    			dialog "I can't make that much juice."
    			close
    			return
    		else
    			var merona = input * 10
    			if (v[Dalcom_Skin] < merona)
    				dialog "[Nannabi]"
            		dialog "Unfortunately, I cannot make you that much juice. You have not enough sweet melons."
    				close
    				return
    			else
          			dialog "[Nannabi]"
          			dialog "Here you go, today the juice is especially tasty and sweet. Come if you want more."
          			dropitem Dalcom_Skin merona
          			getitem Sweet_Melon_Juice input
          			close
          			return
    			endif
    		endif
    	break
    	case 2
    		dialog "[Nannabi]"
    		dialog "Okay, come next time! "
    		close
    		return
    	break
  	endchoose
endif


npc "geffen" "Soor#2019family" 4_M_NFMAN 89 35 3 0 0
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
        dialog "Your inventory is full. Free some "
		dialog "space and come back."
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
	dialog "[Soor]"
	dialog "Uh... what... Oh! Good morning!"
	Talk2me "Dilpor#2019family" "Dilpor : Soor, wake up! Finally..."
	close
	return
elseif (q8577 > 0)
endif

//??? ?? ??
if (q8580 == 0)
  	dialog "[Soor]"
	dialog "Good afternoon, traveler! Thank you for helping us organize the festival."
	wait
	dialog "[Soor]"
	dialog "I saw that you have already helped Dilpor, maybe you can help me too..."
  	wait
  	choose menu "I do not have much time... " "Offer help "
  		case 1
  			dialog "[Soor]"
  			dialog "Well, next time..."
  			Talk2me "Dilpor#2019family" "Dilpor : Eh..."
  			close
  			return
  		break
  		case 2
  		break
  	endchoose
  	dialog "[Soor]"
	dialog "I wanted to introduce a new melon variety this year. It grew very well, even the weeds did not bother her. But at one point I found out why. It turned out to be..."
	wait
	dialog "[Soor]"
	dialog "Sour! Yes, exactly sour! This is a complete failure. How can I compete with Dilpor for the sweetest melons if my melons are not sweet!"
  	Talk2me "Dilpor#2019family" "Dilpor : What's not sweet?"
	Talk2me "Soor#2019family" "Soor : Very sweet, Dilpor!"
  	wait
  	dialog "[Soor]"
	dialog "How can I be now... How to provide my farm..."
  	wait
  	choose menu "What do we have to do now?"
	endchoose
  	dialog "[Soor]"
  	dialog "Let's think it over..."
  	wait
  	dialog "[Soor]"
  	dialog "I think it's worth getting a sample of the sour melon first."
  	wait
  	dialog "[Soor]"
  	dialog "I think it won't be difficult for you to help me!"
  	wait
  	choose menu "Help " "Don't help "
  		case 1
  		break
  		case 2
  			dialog "[Soor]"
  			dialog "Oh, okay... I can't shame you."
  			Talk2me "Dilpor#2019family" "Dilpor : You are still a good farmer..."
  			close
  			return
  		break
  	endchoose
  	dialog "[Soor]"
  	dialog "Thank you! As you may have noticed, sour melons appear in the fields."
  	wait
  	dialog "[Soor]"
  	dialog "Also you may have already noticed that they are strange and purple."
  	wait
  	dialog "[Soor]"
  	dialog "Please get 10 sour melons and bring me, let's take a closer look at them."
	Talk2me "Soor#2019family" "Soor : Wh... What?"
  	Talk2me "Dilpor#2019family" "Dilpor : Don't reply it please..."
  	setquest 8580
  	close
  	return
elseif (q8580 == 1)
	if (v[Sour_Melon] > 9)
    	dialog "[Soor]"
    	dialog "Hello adventurer..."
    	wait
    	choose menu "I bring sour melons " "Complaints "
    		case 1
    		break
    		case 2
    			dialog "[Soor]"
    			dialog "Someone succeeds the first time, but someone has to try constantly..."
    			wait
    			dialog "[Soor]"
    			dialog "At first, I actually started growing grapes. I wonder if I had still grown grapes, what would have happened now?"
    			Talk2me "Dilpor#2019family" "Dilpor : Grape??"
    			Talk2me "Soor#2019family" "Soor : I was young..."
    			wait
    			dialog "[Soor]"
    			dialog "Maybe I just chose the wrong profession..."
    			wait
    			dialog "[Soor]"
    			dialog "Although, most likely, I would have only failures everywhere..."
    			close
    			return
    		break
    	endchoose
    	//case1
        dialog "[Soor]"
        dialog "Wow! I didn't think you'd be here so soon... What the hell is that??"
        wait
        dialog "[Soor]"
        dialog "Throw it out immediately! Until no one noticed..."
        wait
    	dialog "[Soor]"
    	dialog "..."
    	wait
    	dialog "[Soor]"
    	dialog "I didn't expect that..."
		Talk2me "Soor#2019family" "Soor : Oops, clumsy..."
		Talk2me "Dilpor#2019family" "Dilpor : That was really strange..."
    	wait
        if (v[Sour_Melon] > 9)
          dialog "[Soor]"
          dialog "Anyway, thank you for your help, we at least found out what we are dealing with..."
          dropitem Sour_Melon 10
          completequest 8580
          setquest 8581
          ConsumeSpecialItem Melon_Parfait
          getitem Sweet_Melon_Juice 5
          wait
        else
        	dialog "[Soor]"
        	dialog "Wait... Did you bring the sour melons? No?"
        	close
        	return
        endif
        dialog "[Soor]"
        dialog "If everything is in place, can I ask you for help more?"
        wait
		dialog "[Soor]"
		dialog "Until then, I'll do some research..."
        close
        return
    else
    			dialog "[Soor]"
    			dialog "Someone succeeds the first time, but someone has to try constantly..."
    			wait
    			dialog "[Soor]"
    			dialog "At first, I actually started growing grapes. I wonder if I had still grown grapes, what would have happened now?"
    			Talk2me "Dilpor#2019family" "Dilpor : Grape??"
    			Talk2me "Soor#2019family" "Soor : I was young..."
    			wait
    			dialog "[Soor]"
    			dialog "Maybe I just chose the wrong profession..."
    			wait
    			dialog "[Soor]"
    			dialog "Although, most likely, I would have only failures everywhere..."
    			close
    			return
    endif
endif
//1? ???
//? ???? 1?? ?????. 2?? ???? ???? ???? 8583???.
if (q8581 == 0)
//??
elseif (q8581 == 1)
	dialog "[Soor]"
	dialog "Thank you for today! I would be very glad if you could help me more tomorrow..."
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
	dialog "[Soor]"
	dialog "Thank you for today! I would be very glad if you could help me more tomorrow..."
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
    dialog "[Soor]"
    dialog "Adventurer, you're back! Then I could use some help. Can you get me 10 sour melons like you did last time?"
    wait
    choose menu "Help " "I have to go... "
    	case 1
        	setquest 8582
        	dialog "[Soor]"
        	dialog "Thank you! I will soon find out what is wrong with these melons..."
        	Talk2me "Dilpor#2019family" "Dilpor : This is strange..."
        	//???
        	close
        	return
    	break
    	case 2
    		dialog "[Soor]"
    		dialog "Well, you must be very busy. If you don't want to help the poor farmer..."
    		close
    		return
    	break
    endchoose
elseif (q8582 == 1)
	if (v[Sour_Melon] > 9)
    	dialog "[Soor]"
    	dialog "Do you bring me sour melons? I need 10 of them ..."
    	wait
    	choose menu "I bring sour melons " "Complaints "
    		case 1
              dialog "[Soor]"
			  dialog "I didn't expect that..."
			  dialog "Anyway, thank you for your help, we at least found out what we are dealing with..."
              dropitem Sour_Melon 10
              erasequest 8582
              setquest 8583
              ConsumeSpecialItem Melon_Parfait
              getitem Sweet_Melon_Juice 5
              wait
			dialog "[Soor]"
			dialog "I can ask you for help more."
			dialog "Until then, I'll do some research..."
              close
              return
    		break
    		case 2
    			dialog "[Soor]"
    			dialog "Someone succeeds the first time, but someone has to try constantly..."
    			wait
    			dialog "[Soor]"
    			dialog "At first, I actually started growing grapes. I wonder if I had still grown grapes, what would have happened now?"
    			Talk2me "Dilpor#2019family" "Dilpor : Grape??"
    			Talk2me "Soor#2019family" "Soor : I was young..."
    			wait
    			dialog "[Soor]"
    			dialog "Maybe I just chose the wrong profession..."
    			wait
    			dialog "[Soor]"
    			dialog "Although, most likely, I would have only failures everywhere..."
    			close
    			return
    		break
    	endchoose
    else
    	dialog "[Soor]"
    	dialog "I would ask you to collect 10 sour melons for me. They can be found in the fields along with the usual sweet melons ..."
    	close
    	return
    endif
endif




npc "hugel" "Tormod#2019family" 1_M_HOF 218 230 5 0 0

OnInit:
	AddQuestIDCondition 8578
	SetQuestConditionBegin 8578 1 4
	SetQuestConditionQuest 8578 1
	SetQuestConditionEnd

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
	var q8578 = isbegin_quest 8578
	var q8579 = isbegin_quest 8579
if (q8578 == 1)
	if (v[Ice_Box] > 0)
    	dialog "["+PcName+"]"
    	dialog "Hi, Tormod. Dilpor sent you something."
    	wait
    	dialog "-- Tormod opens a cooler --"
    	wait
    	dialog "[Tormod]"
    	dialog "...Hmm? Wow, thanks a lot! In vain I, probably, so loaded Dilpor. And he also wanted to take this parfait to me..."
    	wait
    	dialog "[Tormod]"
    	dialog "And you had to... Cross the whole mainland to get here with this heavy box."
    	wait
    	dialog "[Tormod]"
    	dialog "Thank you. I think Dilpor won't mind if I treat you to a parfait, what do you think? And one more... Pass this note to Dilpor, please."
    	dropitem Ice_Box 1
    	completequest 8578
    	setquest 8579
    	getitem Melon_Parfait 5
    	wait
    	dialog "-- Tormod gave you a note --"
    	wait
    	dialog "[Tormod]"
    	dialog "Don't lose it please."
    	close
    	return
	else
		dialog "[Tormod]"
    	dialog "...Hmm? Do you want to give something to me? If so, then you apparently lost it along the way..."
		close
		return
	endif
else
	dialog "[Tormod]"
	dialog "This year I left my farm to my youngest son ...Due to the fact that people work a lot, they become nervous."
	close
	return
endif




//-------------------------------------------????---------------------------






