npc "prontera" "Loki's Missioner#trial_info" 4_M_CHAOS 125 125 5 0 0
OnTouch2:
	Talk2me "Loki's Missioner#trial" "Do you dare to challenge the god Loki?"
return
OnClick:
	if (v[Chinese_Scroll] == 0)
		dialog "[Loki's Missioner]"
		dialog "Are you as strong, agile and cunning as you think? Do you dare to challenge the god Loki himself?"
		wait
		choose menu "Take a strange scroll" "Go away"
		case 1
			dialog "[Loki's Missioner]"
			dialog "From the great Loki I got the ability to create my own illusions..."
			wait
			dialog "[Loki's Missioner]"
			dialog "Take this scroll, with it you can create my illusion."
			RentItem Chinese_Scroll 43200 0 0 0 0 0
			wait
			dialog "[Loki's Missioner]"
			dialog "... So what are you standing there? Why do you need a scroll?..."
			close
			return
		break
		case 2
		break
		endchoose
		
	else
		dialog "[Loki's Missioner]"
		dialog "You already have an Illusion Summon Scroll. I don't want to explain the same thing several times."
		close
		return
	endif
return

npc "sec_in02" "Loki's Missioner#trial" 4_M_CHAOS 143 182 4 0 0
OnTouch2:
	Talk2me "Loki's Missioner#trial" "Do you dare to challenge the god Loki?"
return

OnClick:

	var time_check = checkquest_playtime 17600 
	var quest_check1 = isbegin_quest 17601 
	var quest_check2 = isbegin_quest 17602
	var quest_check3 = isbegin_quest 17603
	var quest_check4 = isbegin_quest 17604
	var quest_check5 = isbegin_quest 17605
	var quest_check6 = isbegin_quest 17606 
	var quest_check7 = isbegin_quest 17607
	var quest_check8 = isbegin_quest 17608
	var quest_check9 = isbegin_quest 17609
	var quest_check10 = isbegin_quest 17610
	var quest_check11 = isbegin_quest 17611 
	var quest_check12 = isbegin_quest 17612
	var quest_check13 = isbegin_quest 17613
	var quest_check14 = isbegin_quest 17614
	var quest_check15 = isbegin_quest 17615
	
	if (time_check == 1) 
		if (quest_check1 == 1)
			var reward = 5
			var quest = 17601
		elseif (quest_check2 == 1)
			var reward = 10
			var quest = 17602
		elseif (quest_check3 == 1)
			var reward = 20
			var quest = 17603
		elseif (quest_check4 == 1)
			var reward = 40
			var quest = 17604
		elseif (quest_check5 == 1)
			var reward = 80
			var quest = 17605
		elseif (quest_check6 == 1)
			var reward = 5
			var quest = 17606
		elseif (quest_check7 == 1)
			var reward = 10
			var quest = 17607
		elseif (quest_check8 == 1)
			var reward = 20
			var quest = 17608
		elseif (quest_check9 == 1)
			var reward = 40
			var quest = 17609
		elseif (quest_check10 == 1)
			var reward = 80
			var quest = 17610
		elseif (quest_check11 == 1)
			var reward = 5
			var quest = 17611
		elseif (quest_check12 == 1)
			var reward = 10
			var quest = 17612
		elseif (quest_check13 == 1)
			var reward = 20
			var quest = 17613
		elseif (quest_check14 == 1)
			var reward = 40
			var quest = 17614
		elseif (quest_check15 == 1)
			var reward = 80
			var quest = 17615
		else
			dialog "Error 1"
			close
			return
		endif
		
		var hunt_check = checkquest_hunting quest
		if (hunt_check < 2)
			dialog "[Loki's Missioner]"
			dialog "Your trial is not over yet! Time is still running, hurry up!"
			close
			return
		endif
		
		dialog "[Loki's Missioner]"
		dialog "Congratulations, you have successfully completed the trial stage!"
		completequest quest
		erasequest 17600
		var old_reward = v[Jp_event66]
		var new_reward = old_reward + reward
		setitem Jp_event66 new_reward
		wait
		if ((quest == 17605)|(quest == 17610)|(quest == 17615))
			var wt_inven = GetInventoryRemainCount 1301 3
			if ((wt_inven == 2) | (wt_inven == 3))
				dialog "[Loki's Missioner]"
				dialog "Your inventory is full. Free some space and return to me."
				close
				return
			else
			endif
			dialog "[Loki's Missioner]"
			dialog "This concludes your trial. For perseverance and cunning, for your abilities and loyalty, you are entitled to the highest reward."
			getitem Lucky_Cookie01 v[Jp_event66]
			setitem Jp_event66 0
			recall_completequest 17605
			recall_completequest 17610
			recall_completequest 17615
			erasequest 17605
			erasequest 17610
			erasequest 17615
			close
			return	
		else
			var next_reward = new_reward + (reward * 2)
			dialog "[Loki's Missioner]"
			dialog "Do you want to continue the trial?"
			dialog "Current reward: "+new_reward+""
			dialog "Next reward: "+next_reward+""
			wait
			choose menu "Yes" "Take the reward"
				case 1
					dialog "[Loki's Missioner]"
					dialog "Go! Time is running."
					recall_completequest quest
					erasequest quest
					setquest 17600
					setquest quest+1
					close
					return
				break
				case 2
					var wt_inven = GetInventoryRemainCount 1301 3
					if ((wt_inven == 2) | (wt_inven == 3))
						dialog "[Loki's Missioner]"
						dialog "Your inventory is full. Free some space and return to me."
						close
						return
					else
					endif
					dialog "[Loki's Missioner]"
					dialog "Loki appreciates your efforts. However, I am convinced that you are capable of more..."
					getitem Lucky_Cookie01 v[Jp_event66]
					setitem Jp_event66 0
					recall_completequest quest
					erasequest quest
					close
					return
				break
			endchoose
		endif
	elseif (time_check == 2) 
		var wt_inven = GetInventoryRemainCount 1301 3
		if ((wt_inven == 2) | (wt_inven == 3))
			dialog "[Loki's Missioner]"
			dialog "Your inventory is full. Free some space and return to me."
			close
			return
		else
		endif
		if (v[Jp_event66] > 0)
			dialog "[Loki's Missioner]"
			dialog "... You have failed the trial. You were given 15 minutes to complete, but you failed."
			wait
			dialog "[Loki's Missioner]"
			dialog "Loki is disappointed. I can give you a consolation prize on my own, but don't expect any rewards from him."
			getitem Lucky_Cookie01 (v[Jp_event66]/3)
			setitem Jp_event66 0
			recall_completequest 17600
			recall_completequest 17601
			recall_completequest 17602
			recall_completequest 17603
			recall_completequest 17604
			recall_completequest 17605
			recall_completequest 17606
			recall_completequest 17607
			recall_completequest 17608
			recall_completequest 17609
			recall_completequest 17610
			recall_completequest 17611
			recall_completequest 17612
			recall_completequest 17613
			recall_completequest 17614
			recall_completequest 17615
			erasequest 17600
			erasequest 17601
			erasequest 17602
			erasequest 17603
			erasequest 17604
			erasequest 17605
			erasequest 17606
			erasequest 17607
			erasequest 17608
			erasequest 17609
			erasequest 17610
			erasequest 17611
			erasequest 17612
			erasequest 17613
			erasequest 17614
			erasequest 17615
			close
			return
		else
			dialog "[Loki's Missioner]"
			dialog "... You have failed the trial. You were given 15 minutes to complete, but you failed. Loki is disappointed."
			recall_completequest 17600
			recall_completequest 17601
			recall_completequest 17602
			recall_completequest 17603
			recall_completequest 17604
			recall_completequest 17605
			recall_completequest 17606
			recall_completequest 17607
			recall_completequest 17608
			recall_completequest 17609
			recall_completequest 17610
			recall_completequest 17611
			recall_completequest 17612
			recall_completequest 17613
			recall_completequest 17614
			recall_completequest 17615
			erasequest 17600
			erasequest 17601
			erasequest 17602
			erasequest 17603
			erasequest 17604
			erasequest 17605
			erasequest 17606
			erasequest 17607
			erasequest 17608
			erasequest 17609
			erasequest 17610
			erasequest 17611
			erasequest 17612
			erasequest 17613
			erasequest 17614
			erasequest 17615
			close
			return
		endif
	else
		var quest = 0
		if (quest_check1 == 2)
			var reward = 5
			var quest = 17601
		elseif (quest_check2 == 2)
			var reward = 10
			var quest = 17602
		elseif (quest_check3 == 2)
			var reward = 20
			var quest = 17603
		elseif (quest_check4 == 2)
			var reward = 40
			var quest = 17604
		elseif (quest_check5 == 2)
			var reward = 80
			var quest = 17605
		elseif (quest_check6 == 2)
			var reward = 5
			var quest = 17606
		elseif (quest_check7 == 2)
			var reward = 10
			var quest = 17607
		elseif (quest_check8 == 2)
			var reward = 20
			var quest = 17608
		elseif (quest_check9 == 2)
			var reward = 40
			var quest = 17609
		elseif (quest_check10 == 2)
			var reward = 80
			var quest = 17610
		elseif (quest_check11 == 2)
			var reward = 5
			var quest = 17611
		elseif (quest_check12 == 2)
			var reward = 10
			var quest = 17612
		elseif (quest_check13 == 2)
			var reward = 20
			var quest = 17613
		elseif (quest_check14 == 2)
			var reward = 40
			var quest = 17614
		elseif (quest_check15 == 2)
			var reward = 80
			var quest = 17615
		endif
		
		if (quest > 0)
			if ((quest == 17605)|(quest == 17610)|(quest == 17615))
				var wt_inven = GetInventoryRemainCount 1301 3
				if ((wt_inven == 2) | (wt_inven == 3))
					dialog "[Loki's Missioner]"
					dialog "Your inventory is full. Free some space and return to me."
					close
					return
				else
				endif
				dialog "[Loki's Missioner]"
				dialog "This concludes your trial. For perseverance and cunning, for your abilities and loyalty, you are entitled to the highest reward."
				getitem Lucky_Cookie01 v[Jp_event66]
				setitem Jp_event66 0
				recall_completequest 17605
				recall_completequest 17610
				recall_completequest 17615
				erasequest 17605
				erasequest 17610
				erasequest 17615
				close
				return	
			else
				var new_reward = v[Jp_event66]
				var next_reward = new_reward + reward
				dialog "[Loki's Missioner]"
				dialog "Do you want to continue the trial?"
				dialog "Current reward: "+new_reward+""
				dialog "Next reward: "+next_reward+""
				wait
				choose menu "Yes" "Pick up the reward"
					case 1
						dialog "[Loki's Missioner]"
						dialog "Go! Time is running."
						recall_completequest quest
						erasequest quest
						setquest 17600
						setquest quest+1
						close
						return
					break
					case 2
						var wt_inven = GetInventoryRemainCount 1301 3
						if ((wt_inven == 2) | (wt_inven == 3))
							dialog "[Loki's Missioner]"
							dialog "Your inventory is full. Free some space and return to me."
							close
							return
						else
						endif
						dialog "[Loki's Missioner]"
						dialog "Loki appreciates your efforts. However, I am convinced that you are capable of more..."
						getitem Lucky_Cookie01 v[Jp_event66]
						setitem Jp_event66 0
						recall_completequest quest
						erasequest quest
						close
						return
					break
				endchoose
			endif
		else
			dialog "[Loki's Missioner]"
			dialog "... Where am I? Oh! I remember you. Would you like to start the trial?"
			wait
			choose menu "Learn about trials" "Start trial" "Go away"
				case 1
					dialog "[Loki's Missioner]"
					dialog "As a true follower of Loki, I can introduce you to him through several trials."
					wait
					dialog "[Loki's Missioner]"
					dialog "You must prove that you are worthy of his patronage."
					wait
					dialog "[Loki's Missioner]"
					dialog "You can choose three different trials for this: agility, cunning, or strength."
					wait
					dialog "[Loki's Missioner]"
					dialog "At first they may seem easy to you, but with each new stage they will become more difficult."
					wait
					dialog "[Loki's Missioner]"
					dialog "Loki's attention and reward will grow every time. But..."
					wait
					dialog "[Loki's Missioner]"
					dialog "If you fail the test, you may not count on Loki's favor... He does not tolerate losers."
					close
					return
				break
				case 2
					dialog "[Loki's Missioner]"
					dialog "Which trial do you want to start?"
					wait
					choose menu "Cancel" "Cunning" "Agility" "Strength"
						case 1
							dialog "[Loki's Missioner]"
							dialog "Well... I didn't think you'd give up so quickly."
							close
							return
						break
						case 2
							dialog "[Loki's Missioner]"
							dialog "Are you sure you want to start the cunning test? You will have 15 minutes to complete it."
							wait
							choose menu "Yes" "Cancel"
								case 1
									dialog "[Loki's Missioner]"
									dialog "You need to catch Rapid Event Imps. They can be found near Prontera, right in the fields."
									wait
									dialog "[Loki's Missioner]"
									dialog "Go! Time is running."
									setquest 17600
									setquest 17601
									close
									return
								break
								case 2
									close
									return
								break
							endchoose
						break
						case 3
							dialog "[Loki's Missioner]"
							dialog "Are you sure you want to start the agility test? You will have 15 minutes to complete it."
							wait
							choose menu "Yes" "Cancel"
								case 1
									dialog "[Loki's Missioner]"
									dialog "You need to catch Hiding Event Imps. They can be found near Prontera, right in the fields."
									wait
									dialog "[Loki's Missioner]"
									dialog "Go! Time is running."
									setquest 17600
									setquest 17606
									close
									return
								break
								case 2
									close
									return
								break
							endchoose
						break
						case 4
							dialog "[Loki's Missioner]"
							dialog "Are you sure you want to start the strength test? You will have 15 minutes to complete it."
							wait
							choose menu "Yes" "Cancel"
								case 1
									dialog "[Loki's Missioner]"
									dialog "You need to catch Solid Event Imps. They can be found near Prontera, right in the fields."
									wait
									dialog "[Loki's Missioner]"
									dialog "Forward! Time has passed."
									setquest 17600
									setquest 17611
									close
									return
								break
								case 2
									close
									return
								break
							endchoose
						break
					endchoose
				break
				case 3
				break
			endchoose
		endif
	endif
return