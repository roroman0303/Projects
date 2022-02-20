
npc "prontera" "Bulletin board#sign" 2_BULLETIN_BOARD 125 125 5 0 0

OnTouch2:
	Talk2me "Bulletin board#sign" "The Sea Hunt has already begun!"
return

OnClick:

	var achieve_17309 = isbegin_quest 17309 
	var achieve_17310 = isbegin_quest 17310
	var achieve_17311 = isbegin_quest 17311 
	var achieve_17312 = isbegin_quest 17312
	var achieve_17313 = isbegin_quest 17313 
	var achieve_17314 = isbegin_quest 17314
	var achieve_17315 = isbegin_quest 17315 
	var achieve_17316 = isbegin_quest 17316
	var achieve_17317 = isbegin_quest 17317 
	var achieve_17318 = isbegin_quest 17318
	var achieve_17319 = isbegin_quest 17319 
	var achieve_17320 = isbegin_quest 17320
	var achieve_17321 = isbegin_quest 17321 
	var achieve_17322 = isbegin_quest 17322
	var achieve_17323 = isbegin_quest 17323 
	
	var hunt_17309 = checkquest_hunting 17309
	var hunt_17310 = checkquest_hunting 17310
	var hunt_17311 = checkquest_hunting 17311
	var hunt_17312 = checkquest_hunting 17312
	var hunt_17313 = checkquest_hunting 17313
	var hunt_17314 = checkquest_hunting 17314
	var hunt_17315 = checkquest_hunting 17315
	var hunt_17316 = checkquest_hunting 17316
	var hunt_17317 = checkquest_hunting 17317
	var hunt_17318 = checkquest_hunting 17318
	var hunt_17319 = checkquest_hunting 17319
	var hunt_17320 = checkquest_hunting 17320
	var hunt_17321 = checkquest_hunting 17321
	var hunt_17322 = checkquest_hunting 17322
	var hunt_17323 = checkquest_hunting 17323
	
	
	dialog "[Bulletin board]"
	dialog "The sea hunt has already begun! We need experienced adventurers to fight the strongest sea creatures."
	wait
	dialog "[Bulletin board]"
	dialog "Everyone will be able to find a task within their powers. Want to take on a order?"
	wait
	choose menu "Get the order" "Hand over the order" "Cancel"
	case 1
		dialog "[Bulletin board]"
		dialog "At the moment, such tasks are available."
		wait
		choose menu "Roda Frog" "Crab" "Shellfish" "Kukre" "Penomena" "Marse" "Vadon" "Special order"
		case 1
			if ((achieve_17309 == 1)|(achieve_17310 == 1))
				dialog "[Bulletin board]"
				dialog "You have already accepted this quest."
				close
				return
			elseif (achieve_17309 == 2)
				dialog "[Bulletin board]"
				dialog "The order to kill ^0000cd200 Roda Frogs^000000 has become available. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd200 Roda Frogs^000000 and return for your reward."
					setquest 17310
					close
					return
				break
				endchoose
				close
				return
			elseif (achieve_17310 == 2)
				dialog "[Bulletin board]"
				dialog "You have completed all the quests for the hunt for ^0000cdRoda Frogs^000000."
				close
				return
			else
				dialog "[Bulletin board]"
				dialog "Assassination order available, ^0000cd50 Roda Frogs^000000. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd50 Roda Frogs^000000 and return for your reward."
					setquest 17309
					close
					return
				break
				endchoose
				close
				return
			endif
		break
		case 2
			if ((achieve_17311 == 1)|(achieve_17312 == 1))
				dialog "[Bulletin board]"
				dialog "You have already accepted this quest."
				close
				return
			elseif (achieve_17311 == 2)
				dialog "[Bulletin board]"
				dialog "The order to kill ^0000cd200 Crabs^000000 has become available. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd200 Crabs^000000 and return for your reward."
					setquest 17312
					close
					return
				break
				endchoose
				close
				return
			elseif (achieve_17312 == 2)
				dialog "[Bulletin board]"
				dialog "You have completed all the quests for the hunt for ^0000cdCrabs^000000."
				close
				return
			else
				dialog "[Bulletin board]"
				dialog "Assassination order available, ^0000cd50 Crabs^000000. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd50 Crabs^000000 and return for your reward."
					setquest 17311
					close
					return
				break
				endchoose
				close
				return
			endif
		break
		case 3
			if ((achieve_17313 == 1)|(achieve_17314 == 1))
				dialog "[Bulletin board]"
				dialog "You have already accepted this quest."
				close
				return
			elseif (achieve_17313 == 2)
				dialog "[Bulletin board]"
				dialog "The order to kill ^0000cd200 Shellfishes^000000 has become available. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd200 Shellfishes^000000 and return for your reward."
					setquest 17314
					close
					return
				break
				endchoose
				close
				return
			elseif (achieve_17314 == 2)
				dialog "[Bulletin board]"
				dialog "You have completed all the quests to hunt for ^0000cdShellfishes^000000."
				close
				return
			else
				dialog "[Bulletin board]"
				dialog "Assassination order available, ^0000cd50 Shellfishes^000000. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd50 Shellfishes^000000 and return for your reward."
					setquest 17313
					close
					return
				break
				endchoose
				close
				return
			endif
		break
		case 4
			if ((achieve_17315 == 1)|(achieve_17316 == 1))
				dialog "[Bulletin board]"
				dialog "You have already accepted this quest."
				close
				return
			elseif (achieve_17315 == 2)
				dialog "[Bulletin board]"
				dialog "The order to kill ^0000cd200 Kukre^000000 has become available. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd200 Kukre^000000 and return for your reward."
					setquest 17316
					close
					return
				break
				endchoose
				close
				return
			elseif (achieve_17316 == 2)
				dialog "[Bulletin board]"
				dialog "You have completed all the quests for the hunt for ^0000cdKukre^000000."
				close
				return
			else
				dialog "[Bulletin board]"
				dialog "Assassination order available, ^0000cd50 Kukre^000000. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd50 Kukre^000000 and return for your reward."
					setquest 17315
					close
					return
				break
				endchoose
				close
				return
			endif
		break
		case 5
			if ((achieve_17317 == 1)|(achieve_17318 == 1))
				dialog "[Bulletin board]"
				dialog "You have already accepted this quest."
				close
				return
			elseif (achieve_17317 == 2)
				dialog "[Bulletin board]"
				dialog "The order to kill ^0000cd200 Penomenas^000000 has become available. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd200 Penomenas^000000 and return for your reward."
					setquest 17318
					close
					return
				break
				endchoose
				close
				return
			elseif (achieve_17318 == 2)
				dialog "[Bulletin board]"
				dialog "You have completed all the quests for the hunt for ^0000cdPenomenas^000000."
				close
				return
			else
				dialog "[Bulletin board]"
				dialog "Assassination order available, ^0000cd50 Penomenas^000000. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd50 Penomenas^000000 and return for your reward."
					setquest 17317
					close
					return
				break
				endchoose
				close
				return
			endif
		break
		case 6
			if ((achieve_17319 == 1)|(achieve_17320 == 1))
				dialog "[Bulletin board]"
				dialog "You have already accepted this quest."
				close
				return
			elseif (achieve_17319 == 2)
				dialog "[Bulletin board]"
				dialog "The order to kill ^0000cd200 Marses^000000 has become available. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd200 Marses^000000 and return for your reward."
					setquest 17320
					close
					return
				break
				endchoose
				close
				return
			elseif (achieve_17320 == 2)
				dialog "[Bulletin board]"
				dialog "You have completed all the quests for the hunt for ^0000cdMarses^000000."
				close
				return
			else
				dialog "[Bulletin board]"
				dialog "Assassination order available, ^0000cd50 Marses^000000. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd50 Marses^000000 and return for your reward."
					setquest 17319
					close
					return
				break
				endchoose
				close
				return
			endif
		break
		case 7
			if ((achieve_17321 == 1)|(achieve_17322 == 1))
				dialog "[Bulletin board]"
				dialog "You have already accepted this quest."
				close
				return
			elseif (achieve_17321 == 2)
				dialog "[Bulletin board]"
				dialog "The order to kill ^0000cd200 Vadons^000000 has become available. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd200 Vadons^000000 and return for your reward."
					setquest 17322
					close
					return
				break
				endchoose
				close
				return
			elseif (achieve_17322 == 2)
				dialog "[Bulletin board]"
				dialog "You have completed all the quests for the hunt for ^0000cdVadons^000000."
				close
				return
			else
				dialog "[Bulletin board]"
				dialog "Assassination order available, ^0000cd50 Vadons^000000. Want to take on a order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd50 Vadons^000000 and return for your reward."
					setquest 17321
					close
					return
				break
				endchoose
				close
				return
			endif
		break
		case 8
			if (achieve_17323 == 1)
				dialog "[Bulletin board]"
				dialog "You have already accepted this quest."
				close
				return
			elseif (achieve_17323 == 2)
				dialog "[Bulletin board]"
				dialog "You have already completed a Special order."
				close
				return
			else
				dialog "[Bulletin board]"
				dialog "This is the Assassination order ^0000cd10.000 Roda Frogs^000000. Are you sure you want to take on the order?"
				wait
				choose menu "Yes" "No"
				case 1
					dialog "[Bulletin board]"
					dialog "Destroy ^0000cd10.000 Roda Frogs^000000 and return for your reward."
					setquest 17323
					close
					return
				break
				endchoose
				close
				return
			endif
		break
		endchoose
	break
	case 2
		if ((achieve_17309 == 1)&(hunt_17309 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the quest by destroying ^0000cd50 Roda Frogs^000000. Here is your reward."
			getitem Special_Box1 1
			completequest 17309
			if ((achieve_17311 == 2)&(achieve_17313 == 2)&(achieve_17315 == 2)&(achieve_17317 == 2)&(achieve_17319 == 2)&(achieve_17321 == 2))
				dialog "Since you have already completed a very large number of tasks, you get the best hunter accessory."
				getitem Fin_Helm 1
			endif
			if ((achieve_17311 == 2)&(achieve_17313 == 2))
				dialog "And for your active participation in the sea hunt, you are entitled to a special souvenir."
				getitem Fish_On_Head 1
			else
				dialog "Complete other tasks and then you will receive a sea hunt souvenir."
			endif
			close
			return
		elseif ((achieve_17311 == 1)&(hunt_17311 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the task by destroying ^0000cd50 Crabs^000000. Here is your reward."
			getitem Special_Box1 1
			completequest 17311
			if ((achieve_17309 == 2)&(achieve_17313 == 2)&(achieve_17315 == 2)&(achieve_17317 == 2)&(achieve_17319 == 2)&(achieve_17321 == 2))
				dialog "Since you have already completed a very large number of tasks, you get the best hunter accessory."
				getitem Fin_Helm 1
			endif
			if ((achieve_17309 == 2)&(achieve_17313 == 2))
				dialog "And for your active participation in the sea hunt, you are entitled to a special souvenir."
				getitem Fish_On_Head 1
			else
				dialog "Complete other tasks and then you will receive a sea hunt souvenir."
			endif
			close
			return
		elseif ((achieve_17313 == 1)&(hunt_17313 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the quest by destroying ^0000cd50 Shellfishes^000000. Here is your reward."
			getitem Special_Box1 1
			completequest 17313
			if ((achieve_17311 == 2)&(achieve_17309 == 2)&(achieve_17315 == 2)&(achieve_17317 == 2)&(achieve_17319 == 2)&(achieve_17321 == 2))
				dialog "Since you have already completed a very large number of tasks, you get the best hunter accessory."
				getitem Fin_Helm 1
			endif
			if ((achieve_17311 == 2)&(achieve_17309 == 2))
				dialog "And for your active participation in the sea hunt, you are entitled to a special souvenir."
				getitem Fish_On_Head 1
			else
				dialog "Complete other tasks and then you will receive a sea hunt souvenir."
			endif
			close
			return
		elseif ((achieve_17315 == 1)&(hunt_17315 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the quest by destroying ^0000cd50 Kukre^000000. Here is your reward."
			getitem Special_Box1 1
			completequest 17315
			if ((achieve_17311 == 2)&(achieve_17313 == 2)&(achieve_17309 == 2)&(achieve_17317 == 2)&(achieve_17319 == 2)&(achieve_17321 == 2))
				dialog "Since you have already completed a very large number of tasks, you get the best hunter accessory."
				getitem Fin_Helm 1
			else
				dialog "Complete other tasks and then you will receive a hunter's accessory."
			endif
			close
			return
		elseif ((achieve_17317 == 1)&(hunt_17317 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the quest by destroying ^0000cd50 Penomenas^000000. Here is your reward."
			getitem Special_Box1 1
			completequest 17317
			if ((achieve_17311 == 2)&(achieve_17313 == 2)&(achieve_17309 == 2)&(achieve_17315 == 2)&(achieve_17319 == 2)&(achieve_17321 == 2))
				dialog "Since you have already completed a very large number of tasks, you get the best hunter accessory."
				getitem Fin_Helm 1
			else
				dialog "Complete other tasks and then you will receive a hunter's accessory."
			endif
			close
			return
		elseif ((achieve_17319 == 1)&(hunt_17319 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the quest by destroying ^0000cd50 Marses^000000. Here is your reward."
			getitem Special_Box1 1
			completequest 17319
			if ((achieve_17311 == 2)&(achieve_17313 == 2)&(achieve_17309 == 2)&(achieve_17317 == 2)&(achieve_17315 == 2)&(achieve_17321 == 2))
				dialog "Since you have already completed a very large number of tasks, you get the best hunter accessory."
				getitem Fin_Helm 1
			else
				dialog "Complete other tasks and then you will receive a hunter's accessory."
			endif
			close
			return
		elseif ((achieve_17321 == 1)&(hunt_17321 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the quest by destroying ^0000cd50 Vadons^000000. Here is your reward."
			getitem Special_Box1 1
			completequest 17321
			if ((achieve_17311 == 2)&(achieve_17313 == 2)&(achieve_17309 == 2)&(achieve_17317 == 2)&(achieve_17319 == 2)&(achieve_17315 == 2))
				dialog "Since you have already completed a very large number of tasks, you get the best hunter accessory."
				getitem Fin_Helm 1
			else
				dialog "Complete other tasks and then you will receive a hunter's accessory."
			endif
			close
			return
		elseif ((achieve_17310 == 1)&(hunt_17310 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the quest by destroying ^0000cd200 Roda Frogs^000000. Here is your reward."
			getitem Special_Box3 1
			completequest 17310
			close
			return
		elseif ((achieve_17312 == 1)&(hunt_17312 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the task by destroying ^0000cd200 Crabs^000000. Here is your reward."
			getitem Special_Box3 1
			completequest 17312
			close
			return
		elseif ((achieve_17314 == 1)&(hunt_17314 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the quest by destroying ^0000cd200 Shellfishes^000000. Here is your reward."
			getitem Special_Box3 1
			completequest 17314
			close
			return
		elseif ((achieve_17316 == 1)&(hunt_17316 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the quest by destroying ^0000cd200 Kukre^000000. Here is your reward."
			getitem Special_Box3 1
			completequest 17316
			close
			return
		elseif ((achieve_17318 == 1)&(hunt_17318 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the task by destroying ^0000cd200 Penomenas^000000. Here is your reward."
			getitem Special_Box3 1
			completequest 17318
			close
			return
		elseif ((achieve_17320 == 1)&(hunt_17320 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the quest by destroying ^0000cd200 Marses^000000. Here is your reward."
			getitem Special_Box3 1
			completequest 17320
			close
			return
		elseif ((achieve_17322 == 1)&(hunt_17322 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the task by destroying ^0000cd200 Vadons^000000. Here is your reward."
			getitem Special_Box3 1
			completequest 17322
			close
			return
		elseif ((achieve_17323 == 1)&(hunt_17323 == 2))
			dialog "[Bulletin board]"
			dialog "You completed the quest by destroying ^0000cd10.000 Roda Frogs^000000. Here is your reward."
			getitem Special_Box3 1
			getitem Frog_Cap 1
			completequest 17323
			close
			return
		else 
			dialog "[Bulletin board]"
			dialog "You have no completed orders."
			close
			return
		endif
	break
	case 3
		close
		return
	break
	endchoose
return
