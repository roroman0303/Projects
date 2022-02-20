

npc "prontera" "Black Whiskers#2021pirates" 4_CAT_SAILOR2 125 125 5 0 0
OnInit:
	NpcOverBMP "group_3"

	AddQuestIDCondition 17401
	SetQuestConditionBegin 17401 1 4
	SetQuestConditionQuest 17401 0
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "Black Whiskers#2021pirates" "Thousand devils! Whistle everyone to the top immediately!"
return

OnClick:
	var pirate_17401 = isbegin_quest 17401
	if (pirate_17401 == 0)
		dialog "[Black Whiskers]"
		dialog "Greetings, traveler. Would you like to go to us as a sailor? The work is not dusty!"
		wait
		dialog "[Black Whiskers]"
		dialog "We swim where we want, we do what we want. We take what we want... You will not regret it!"
		wait
		choose menu "Are you pirates?"
		endchoose
		dialog "[Black Whiskers]"
		dialog "We call ourselves desperate traders! But if you want to know more, I can tell you where to find us."
		wait
		choose menu "Where can I find you?"
		endchoose
		dialog "[Black Whiskers]"
		dialog "Of course by the sea! As far as I know, there is now a ship moored in Alberta under the command of Captain Mjorn."
		wait
		dialog "[Black Whiskers]"
		dialog "In Izlude - the ship of Captain Trick, a stately pir... sailor. And Captain Flint's crew is stationed in Malangdo. They seem to have pulled a brig..."
		wait
		dialog "[Black Whiskers]"
		dialog "Where should I send you?"
		wait
		choose menu "Alberta" "Malangdo" "Izlude"
			case 1
				dialog "[Black Whiskers]"
				dialog "Fair wind!"
				setquest 17401
				close
				moveto "alberta" 196 196
				return
			break
			case 2
				dialog "[Black Whiskers]"
				dialog "Fair wind!"
				setquest 17401
				close
				moveto "malangdo" 216 87
				return
			break
			case 3
				dialog "[Black Whiskers]"
				dialog "Fair wind!"
				setquest 17401
				close
				moveto "izlude" 175 183
				return
			break
		endchoose
	else
		dialog "[Black Whiskers]"
		dialog "As far as I know, there is now a ship moored in Alberta under the command of Captain Mjorn."
		wait
		dialog "[Black Whiskers]"
		dialog "In Izlude - the ship of Captain Trick, a stately pir... sailor. And Captain Flint's crew is stationed in Malangdo. They seem to have pulled a brig..."
		close
		return
	endif
return




npc "alberta" "Murmossa#2021pirates" 4_CAT_ADV1 190 205 5 0 0
OnInit:
	NpcOverBMP "group_3"

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
	Talk2me "Murmossa#2021pirates" "By thunder! Where is my rum? You know!"
return

OnClick:
	var pirate_17401 = isbegin_quest 17401
	if (pirate_17401 == 0)
		setquest 17401
		completequest 17401
	elseif (pirate_17401 == 1)
		completequest 17401
	endif
	
	var pirate_17402 = isbegin_quest 17402
	var pirate_17403 = isbegin_quest 17403
	var pirate_17404 = isbegin_quest 17404
	var pirate_17413 = isbegin_quest 17413
	var pirate_17414 = isbegin_quest 17414
	var pirate_17415 = isbegin_quest 17415
	var time_check = checkquest_playtime 17405
	
	if ((pirate_17402 == 0) & (pirate_17403 == 0) & (pirate_17404 == 0)) 
		dialog "[Murmossa]"
		dialog "Interestingly, and on all ships so feed? I hate turtle soup..."
		wait
		dialog "[Murmossa]"
		dialog "Listen, can I ask you to find out what is going on with the other sailors? Maybe I should finally change the ship..."
		setquest 17402
		completequest 17402
		setquest 17403
		setquest 17404
		close
		return
	elseif ((pirate_17402 == 1) | (pirate_17403 == 1) | (pirate_17404 == 1))
		if (pirate_17402 == 2)
			dialog "[Murmossa]"
			dialog "Go and find out how things are on the other ships. I have heard that other pirate schooners have docked near Malangdo and Izlude."
			close
			return
		elseif ((pirate_17403 == 1) | (pirate_17404 == 1))
			dialog "[Murmossa]"
			dialog "Hi, is there something you wanted?"
			wait
			choose menu "Ask for conditions"
			endchoose
			dialog "[Murmossa]"
			dialog "I wouldn't say it's easy to be a sailor here, but Captain Mjorn is quite fair. He always divides the loot between the whole team."
			wait
			dialog "[Murmossa]"
			dialog "But the food here is just disgusting! If I had my way, I would have ripped off this arrogant cook!"
			completequest 17402
			close
			return
		else
			dialog "[Murmossa]"
			dialog "Hi, is there something you wanted?"
			wait
			choose menu "Ask for conditions"
			endchoose
			dialog "[Murmossa]"
			dialog "I wouldn't say it's easy to be a sailor here, but Captain Mjorn is quite fair. He always divides the loot between the whole team."
			wait
			dialog "[Murmossa]"
			dialog "But the food here is just disgusting! If I had my way, I would have ripped off this arrogant cook!"
			choose menu "Tell about others"
			endchoose
			wait
			var weight_check = GetInventoryRemainCount 1301 3
			if ((weight_check == 2)|(weight_check == 3))
				dialog "[Murmossa]"
				dialog "Your inventory is full."
				close
				return
			endif
			dialog "[Murmossa]"
			dialog "I never thought... Although, it turns out, they eat crabs! Okay... Thanks for telling me. Come back tomorrow. You understand that I can't leave."
			getitem Dogly_Bottle_Z 10
			getitem Gold_Chocoin 15
			getitem Comp_Glass_Of_Illusion 10
			if (pirate_17413 == 0)
				setquest 17413
				completequest 17413
			elseif (pirate_17414 == 0)
				setquest 17414
				completequest 17414			
			endif
			if ((pirate_17413 == 2) & (pirate_17414 == 2) & (pirate_17415 != 2))
				wait
				dialog "[Murmossa]"
				dialog "I think it fits you. You're already part of the team."
				getitem DragonKnight_Eyepatch 1 
				setquest 17415
				completequest 17415
			else
				wait
				dialog "[Murmossa]"
				dialog "I think if you stay here for a couple more days, I can find a real pirate eyepatch for you."
			endif
			completequest 17402
			setquest 17405
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
			dialog "[Murmossa]"
			dialog "Hey, it's you again, "+name+"!"
			dialog "Visit other ships, find out how the sailors are doing there, it's not difficult for you, is it? And give them this note..."
			close
			return
		else
			dialog "[Murmossa]"
			dialog "Today I can no longer be distracted from work. Come tomorrow."
			close
			return
		endif
	endif
return




npc "malangdo" "Henry Murgan#2021pirates" 4_CAT_SAILOR1 213 85 7 0 0
OnInit:
	NpcOverBMP "group_3"

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
	Talk2me "Henry Murgan#2021pirates" "Well, what are you staring at? Haven't you seen any cats floating?"
return

OnClick:
	var pirate_17401 = isbegin_quest 17401
	if (pirate_17401 == 0)
		setquest 17401
		completequest 17401
	elseif (pirate_17401 == 1)
		completequest 17401
	endif
	
	var pirate_17402 = isbegin_quest 17402
	var pirate_17403 = isbegin_quest 17403
	var pirate_17404 = isbegin_quest 17404
	var pirate_17413 = isbegin_quest 17413
	var pirate_17414 = isbegin_quest 17414
	var pirate_17415 = isbegin_quest 17415
	var time_check = checkquest_playtime 17405
	
	if ((pirate_17402 == 0) & (pirate_17403 == 0) & (pirate_17404 == 0)) 
		dialog "[Henry Murgan]"
		dialog "I can not take it anymore! I can't stand it! Work in such conditions! No rum, no rest, and now without a ship!"
		wait
		dialog "[Henry Murgan]"
		dialog "Yes! As soon as we moored, our boatswains immediately rushed out of here..."
		wait
		dialog "[Henry Murgan]"
		dialog "Not surprising. After all, our 'honest' captain kept all the booty for himself, he wanted to spit on the team!"
		wait
		dialog "[Henry Murgan]"
		dialog "Like this... Go and find out if it is possible to sign up somewhere as a sailor or a cook... Even as a parrot! The main thing is not to be here."
		wait
		dialog "[Henry Murgan]"
		dialog "I heard that ships with black flags stopped at Alberta and Izlude. I think you can find out something there."
		setquest 17402
		setquest 17403
		completequest 17403
		setquest 17404
		close
		return
	elseif ((pirate_17402 == 1) | (pirate_17403 == 1) | (pirate_17404 == 1))
		if (pirate_17403 == 2)
			dialog "[Henry Murgan]"
			dialog "Go and find out if it is possible to sign up somewhere as a sailor or a cook... Even as a parrot! The main thing is not to be here."
			wait
			dialog "[Henry Murgan]"
			dialog "I heard that ships with black flags stopped at Alberta and Izlude. I think you can find out something there."
			close
			return
		elseif ((pirate_17402 == 1) | (pirate_17404 == 1))
			dialog "[Henry Murgan]"
			dialog "Do you need something? What are you staring at?"
			wait
			choose menu "Ask for conditions"
			endchoose
			dialog "[Henry Murgan]"
			dialog "Can't you see it yourself? Left penniless and without a ship, but with the captain of the losers."
			wait
			dialog "[Henry Murgan]"
			dialog "I wish I could quietly leave here..."
			wait
			choose menu "Tell about others"
			endchoose
			dialog "[Henry Murgan]"
			dialog "Hmm, I'll think about it... Is it so good everywhere?"
			completequest 17403
			close
			return
		else
			dialog "[Henry Murgan]"
			dialog "Do you need something? What are you staring at?"
			wait
			choose menu "Ask for conditions"
			endchoose
			dialog "[Henry Murgan]"
			dialog "Can't you see it yourself? Left penniless and without a ship, but with the captain of the losers."
			wait
			dialog "[Henry Murgan]"
			dialog "I wish I could quietly leave here..."
			wait
			choose menu "Tell about others"
			endchoose
			var weight_check = GetInventoryRemainCount 1301 3
			if ((weight_check == 2)|(weight_check == 3))
				dialog "[Henry Murgan]"
				dialog "Your inventory is full."
				close
				return
			endif
			dialog "[Henry Murgan]"
			dialog "Hmm, I'll think about it... But thanks for telling me. Come back tomorrow. Now I'm going to solve..."
			getitem Dogly_Bottle_Z 10
			getitem Gold_Chocoin 15
			getitem Comp_Glass_Of_Illusion 10
			if (pirate_17413 == 0)
				setquest 17413
				completequest 17413
			elseif (pirate_17414 == 0)
				setquest 17414
				completequest 17414			
			endif
			if ((pirate_17413 == 2) & (pirate_17414 == 2) & (pirate_17415 != 2))
				wait
				dialog "[Henry Murgan]"
				dialog "As promised, I got you an eyepatch. It helps sailors find their bearings in the dark of the hold easier. Try it yourself."
				getitem DragonKnight_Eyepatch 1 
				setquest 17415
				completequest 17415
			else
				wait
				dialog "[Henry Murgan]"
				dialog "I think if you stay here a couple more days, I can find a real pirate eyepatch for you, for your help."
				setquest 17415
				completequest 17415
			endif
			completequest 17403
			setquest 17405
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
			dialog "[Henry Murgan]"
			dialog "Hey, it's you again, "+name+"!"
			dialog "Visit other ships, find out how the sailors are doing there, it's not difficult for you, is it? And ask them about the conditions..."
			close
			return
			close
			return
		else
			dialog "[Henry Murgan]"
			dialog "We need to think about where it would be better to work. Although the sea is everywhere... Come back later, while I'm asking around here."
			close
			return
		endif
	endif
return




npc "izlude" "One Eyed Meowk#2021pirates" 4_CAT_SAILOR1 198 179 2 0 0
OnInit:
	NpcOverBMP "group_3"

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
	Talk2me "One Eyed Meowk#2021pirates" "Bite me a shark, you are..."
return

OnClick:
	var pirate_17401 = isbegin_quest 17401
	if (pirate_17401 == 0)
		setquest 17401
		completequest 17401
	elseif (pirate_17401 == 1)
		completequest 17401
	endif
	
	var pirate_17402 = isbegin_quest 17402
	var pirate_17403 = isbegin_quest 17403
	var pirate_17404 = isbegin_quest 17404
	var pirate_17413 = isbegin_quest 17413
	var pirate_17414 = isbegin_quest 17414
	var pirate_17415 = isbegin_quest 17415
	var time_check = checkquest_playtime 17405
	
	if ((pirate_17402 == 0) & (pirate_17403 == 0) & (pirate_17404 == 0)) 
		dialog "[One Eyed Meowk]"
		dialog "Good day, traveler, do you want to join the team? It's a pity, but now we have a full crew of sailors."
		wait
		choose menu "Who you are?"
		endchoose
		dialog "[One Eyed Meowk]"
		dialog "Although we sail under the black flag, I think we have more honor than some sailors and merchants..."
		wait
		dialog "[One Eyed Meowk]"
		dialog "If you don't believe, you can go and ask yourself. In other port cities, Alberta and Izlude, ships are also at anchor."
		setquest 17402
		setquest 17403
		setquest 17404
		completequest 17404
		close
		return
	elseif ((pirate_17402 == 1) | (pirate_17403 == 1) | (pirate_17404 == 1))
		if (pirate_17404 == 2)
			dialog "[One Eyed Meowk]"
			dialog "Although we sail under the black flag, I think we have more honor than some sailors and merchants..."
			wait
			dialog "[One Eyed Meowk]"
			dialog "Go ask yourself. In other port cities, Alberta and Izlude, ships are also at anchor."
			close
			return
		elseif ((pirate_17402 == 1) | (pirate_17403 == 1))
			dialog "[One Eyed Meowk]"
			dialog "If you want to join the team? It's a pity, but now we have a full crew of sailors."
			wait
			choose menu "Ask for conditions"
			endchoose
			dialog "[One Eyed Meowk]"
			dialog "In fact, I am very glad that I got into this team. We all do our own job, no one can even think of a riot."
			wait
			dialog "[One Eyed Meowk]"
			dialog "The booty is divided among everyone, and we also have a cook from Malangdo Island, Orcho, you may have heard of it. He always makes sure that the team is well fed."
			wait
			choose menu "Tell about others"
			endchoose
			dialog "[One Eyed Meowk]"
			dialog "Well, can't say that I have not expect this... Captains are rarely famous for their ambition. Unlike ours, of course, he-he."
			completequest 17404
			close
			return
		else
			dialog "[One Eyed Meowk]"
			dialog "If you want to join the team? It's a pity, but now we have a full crew of sailors."
			wait
			choose menu "Ask for conditions"
			endchoose
			dialog "[One Eyed Meowk]"
			dialog "In fact, I am very glad that I got into this team. We all do their job, no one can even think of a riot."
			wait
			dialog "[One Eyed Meowk]"
			dialog "The booty is divided among everyone, and we also have a cook from Malangdo Island, Orcho, you may have heard of it. He always makes sure that the team is well fed."
			wait
			choose menu "Tell about others"
			endchoose
			dialog "[One Eyed Meowk]"
			dialog "Well, can't say that I have not expect this... Captains are rarely famous for their ambition. But thanks for the information. Maybe we can get a couple of nice guys on board after all."
			wait
			var weight_check = GetInventoryRemainCount 1301 3
			if ((weight_check == 2)|(weight_check == 3))
				dialog "[Henry Murgan]"
				dialog "Your inventory is full."
				close
				return
			endif
			dialog "[One Eyed Meowk]"
			dialog "I'll talk to the captain, and you come back tomorrow, okay?"
			getitem Dogly_Bottle_Z 10
			getitem Gold_Chocoin 15
			getitem Comp_Glass_Of_Illusion 10
			if (pirate_17413 == 0)
				setquest 17413
				completequest 17413
			elseif (pirate_17414 == 0)
				setquest 17414
				completequest 17414			
			endif
			if ((pirate_17413 == 2) & (pirate_17414 == 2) & (pirate_17415 != 2))
				wait
				dialog "[Murmossa]"
				dialog "I'll think about taking Henry... It's a tricky situation, isn't it? But for your help, as I promised, you are entitled to something. Try it on."
				getitem DragonKnight_Eyepatch 1 
				setquest 17415
				completequest 17415
			else
				wait
				dialog "[One Eyed Meowk]"
				dialog "And I could offer you a unique eyepatch, if we take someone on your tip."
				setquest 17415
				completequest 17415
			endif
			completequest 17404
			setquest 17405
			close
			return
		endif
	else
		if (time_check == 2)
			recall_completequest 17402
			recall_completequest 17403
			recall_completequest 17405
			erasequest 17405
			dialog "[One Eyed Meowk]"
			dialog "Although we sail under the black flag, I think we have more honor than some sailors and merchants..."
			wait
			dialog "[One Eyed Meowk]"
			dialog "Ask the other sailors yourself, and at the same time ask if they would like to join us on board."
			close
			return
		else
			dialog "[One Eyed Meowk]"
			dialog "I'll talk to the captain, and you come back tomorrow, okay?"
			close
			return
		endif
	endif
return


npc "alberta" "Captain Mjorn#2021pirates" 4_CAT_ADMIRAL 195 202 4 0 0
OnInit:
	NpcOverBMP "group_3"

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
		dialog "[Captain Mjorn]"
		dialog "I see you found the hiding places, well, commendable. I think my team and I will go there soon."
		wait
		dialog "[Captain Mjorn]"
		dialog "If you don't lose your luck tomorrow, then be sure to come."
		getitem Dogly_Bottle_Z 30
		getitem Gold_Chocoin 20
		completequest 17411
		setquest 17412
		close
		return
	elseif (pirate_17410 == 1)
		dialog "[Captain Mjorn]"
		dialog "Not found? We need to find out where local merchants like to hide their jewelry."
		wait
		dialog "[Captain Mjorn]"
		dialog "They usually mark such places."
		close
		return
	elseif (pirate_17410 == 0) 
		dialog "[Captain Mjorn]"
		dialog "Good afternoon. If you want to join the team, please contact Henry."
		wait
		choose menu "Do you need help?"
		endchoose
		dialog "[Captain Mjorn]"
		dialog "Do you think we're not doing it ourselves? We have the best team in all of Rune Midgard! Wait a minute though... There is one thing..."
		wait
		dialog "[Captain Mjorn]"
		dialog "We need to find out where local merchants like to hide their jewelry. The main thing is to find a tip, and then we take..."
		wait
		dialog "[Captain Mjorn]"
		dialog "They usually mark such places."
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
			dialog "[Captain Mjorn]"
			dialog "I'm glad to see you,"
			dialog ""+name+"!"
			wait
			dialog "[Captain Mjorn]"
			dialog "If you're free again, we need to find out where local merchants like to hide their jewelry. The main thing is to find a tip, and then we take..."
			wait
			dialog "[Captain Mjorn]"
			dialog "They usually mark such places."
			close
			return
		else
			dialog "[Captain Mjorn]"
			dialog "That's enough for us today. Come back tomorrow."
			close
			return
		endif
	endif
return



npc "malangdo" "Captain Flint#2021pirates" 4_CAT_SAILOR5 213 92 6 0 0
OnInit:
	NpcOverBMP "group_3"

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
		dialog "[Captain Flint]"
		dialog "I don't give a damn about that, just give the fish to me!"
		wait
		dialog "[Captain Flint]"
		dialog "Who are you? It was not enough for us to have another competitor here..."
		wait
		choose menu "You seem to be doing badly"
		endchoose
		dialog "[Captain Flint]"
		dialog "Really? The ship was stolen, what could be worse?"
		wait
		dialog "[Captain Flint]"
		dialog "Also these rumors about the zombie... No zombies! Even now the sailors do not want to work, but now these fairy tales have hammered their heads."
		wait
		dialog "[Captain Flint]"
		dialog "If you find at least one dead man, then we'll see."
		setquest 17408
		close
		return
	elseif (pirate_17408 == 1)
		if (hunt_check == 2)
			dialog "[Captain Flint]"
			dialog "I can not believe it..."
			wait
			dialog "[Captain Flint]"
			dialog "If this is true, and the zombies are wandering in the fields, then something must be done about it. Come tomorrow. I think your help will still be needed."
			getitem Dogly_Bottle_Z 20
			getitem Comp_Glass_Of_Illusion 20
			completequest 17408
			setquest 17409
			close
			return
		else
			dialog "[Captain Flint]"
			dialog "If this is true, and the dead are wandering in the fields, then something must be done about it. Come on, you find their leader and deal with it."
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
			dialog "[Captain Flint]"
			dialog "I still can't believe it..."
			wait
			dialog "[Captain Flint]"
			dialog "If this is true, and the dead are wandering in the fields, then something must be done about it. Come on, you find their leader and deal with it."
			close
			return
		else
			dialog "[Captain Flint]"
			dialog "It seems that the dead are no longer visible nearby. But we'll see."
			close
			return
		endif
	endif
return



npc "izlude" "Captain Trick#2021pirates" 4_CAT_SAILOR5 177 185 3 0 0
OnInit:
	NpcOverBMP "group_3"

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
		dialog "[Captain Trick]"
		dialog "Lately sailors have been complaining about food, but our last raid also failed..."
		wait
		dialog "[Captain Trick]"
		dialog "Yes, I would buy supplies, but where will I get the zeny for all this... This is our permanent port, we cannot rob here."
		wait
		dialog "[Captain Trick]"
		dialog "If you bring ^0000FF5 Meat^000000, ^0000FFAwakening Potion^000000, and ^0000FF10 Apples^000000, I would be very grateful."
		setquest 17406
		close
		return
	elseif (pirate_17406 == 1)
		if ((v[Apple] > 9) & (v[Meat] > 4) & (v[Awakening_Potion] > 0))
			dialog "[Captain Trick]"
			dialog "Thanks. I think while we are in port it would be nice if you could provide us with supplies. In return, we can share rum, we have an abundance of it..."
			dropitem Apple 10
			dropitem Meat 5
			dropitem Awakening_Potion 1
			getitem Dogly_Bottle_Z 20
			getitem Comp_Glass_Of_Illusion 10
			getitem Gold_Chocoin 5
			completequest 17406
			setquest 17407
			close
			return
		else
			dialog "[Captain Trick]"
			dialog "Didn't you bring anything?"
			close
			return
		endif
	else
		if (time_check == 2)
			recall_completequest 17407
			recall_completequest 17406
			erasequest 17407
			dialog "[Captain Trick]"
			dialog "Lately sailors have been complaining about food."
			wait
			dialog "[Captain Trick]"
			dialog "If you bring ^0000FF5 Meat^000000, ^0000FFAwakening Potion^000000, and ^0000FF10 Apples^000000, I would be very grateful."
			close
			return
		else
			dialog "[Captain Trick]"
			dialog "The team and I are very grateful for the help. I think while we are in port it would be nice if you could provide us with supplies."
			close
			return
		endif
	endif
return


