npc "emjolnir_05" "Mysterious switch#" HIDDEN_NPC 1 1 4 5 5
OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		dialog "turn on. npc? "
		wait
		choose menu "Yes " "no "
			case 1
				enablenpc "Mysterious man#"
				close
				return
			break
			case 2
				dialog "bye "
				close
				return
			break
		endchoose
	endif
return

OnCommand: "turnoff"
	warpallpcinthemap "prontera" 125 122
return

warp "emjolnir_05" "_m05c-m04c" 16 171 2 2
OnTouch:
	moveto  "mjolnir_04" 384 174
	return

warp "emjolnir_05" "_m05b-m12b" 220 382 4 2
OnTouch:
	moveto  "mjolnir_12" 220 29
	return

warp "emjolnir_05" "_m05-m10" 235 16 4 2
OnTouch:
	moveto  "mjolnir_10" 235 378
	return

npc "prontera" "Mysterious man#" 4_M_HUMAN_02 125 125 5 0 0

OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		dialog "turn. off npc? "
		wait
		choose menu "Yes " "No "
			case 1
				cmdothernpc "Mysterious switch#" "turnoff"
				disablenpc "Mysterious man#"
				close
				return
			break
			case 2
				dialog "bye "
				close
				return
			break
		endchoose
	else
		dialog "[Mysterious man]"
		dialog "Greetings, warrior."
		dialog "How may I help?"
		wait
		choose menu "Go to the Unknown area " "What's going on here?" "Leave "
			case 1
				dialog "[Mysterious man]"
				dialog "Are you ready? "
				dialog "That place is totally different from what you've already seen,"
				dialog "think carefully."
				wait
				choose menu "I am ready" "I am not ready yet"
					case 1
						if v[RWC_Ticket] > 0
							dialog "[Mysterious man]"
							dialog "Well, I see your pass!"
							dialog "Let's go!"
							wait
							dropitem RWC_Ticket 1
							moveto "emjolnir_05" 0 0
						else
							dialog "[Mysterious man]"
							dialog "Oh, you don't have a pass."
							dialog "You should still practice in this world!"
							close
							return
						endif
					break
					case 2
						dialog "[Mysterious man]"
						dialog "It's okay, there is no shame in fear."
						dialog "Get back when you will be ready."
						close
						return
					break
				endchoose
			break
			case 2
				dialog "[Mysterious man]"
				dialog "A way to another world has been opened!"
				dialog "Do you really think that "
				dialog "the world you know is the only realm that exists?"
				wait
				choose menu "Isn't it?"
					case 1
					break
				endchoose
				dialog "[Mysterious man]"
				dialog "The universe is multidimensional,"
				dialog "though it is hard to comprehend. "
				dialog "Our realm is almost "
				dialog "identical to yours, but "
				dialog "our creatures are much more dangerous!"
				wait
				choose menu "How did you get here?"
					case 1
					break
				endchoose
				dialog "[Mysterious man]"
				dialog "The question is "
				dialog "how did YOU get us here? "
				dialog "I's all on you, fools!"
				dialog "Uncontrolled magic, fanatical faith,"
				dialog "malicious technology. You are tearing your world apart."
				wait
				choose menu "And what do we do now?.."
					case 1
					break
				endchoose
				dialog "[Mysterious man]"
				dialog "Huh, suffer and struggle,"
				dialog "what else? Be careful though, "
				dialog "appearance may be misleading sometimes."
				dialog "Good luck."
				close
				return
			break
			case 3
				dialog "[Mysterious man]"
				dialog "Get back when you will be ready."
				close
				return
			break
		endchoose
	endif
return
