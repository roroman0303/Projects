
npc "alberta" "Lana#19_thx" 4_F_05 138 169 5 5 5
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
	Talk2me "Lana#19_thx" "Take part in the festival of light!"
endif
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Lana]"
	dialog "In this festival, you have to tame the fire, so only adventurers from level 30 can participate."
	close
	return
endif


//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Lana]"
	dialog "If you want to take part in the Festival of Light and Fire, you must empty your inventory."
	close
	return
else
endif
//==============================================================================
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Lana]"
	dialog "Welcome! We welcome everyone who visit Alberta!"
	wait
	dialog "[Lana]"
	dialog "Don't miss the event! Pay homage to the greatest phenomenon of our world!"
	wait
	dialog "[Lana]"
	dialog "Will you be able to fight and tame the fire, or will you chicken out and leave Alberta?"
	wait
	choose menu "Fire?" "I'm not afraid "
	case 1
		dialog "[Lana]"
		dialog "Every year, Alberta hosts a celebration of fire."
		wait
		dialog "[Lana]"
		dialog "We thank the sun all week for its warmth and light! And at night, in its absence, we make fires so that not a second passes without light!"
		wait
		dialog "[Lana]"
		dialog "We dance, sing and cook food on fire, showing the importance of it!"
		wait
		dialog "[Lana]"
		dialog "People leaving home or people returning from home, we all get together in Alberta."
		wait
		dialog "[Lana]"
		dialog "All these people gather to share food for free, to look at the lights in the night city, to burn everything bad... And to wish each other a happy next season."
		wait
		dialog "[Lana]"
		dialog "Previously, all bonfires were created with our own hands. But now these large fires are controlled by wizards specially sent from Geffen."
		close
		return
	break
	case 2
		dialog "[Lana]"
		dialog "Does this mean you want to take part in the festival?"
		wait
		dialog "[Lana]"
		dialog "In order to be part of this event, you need to do your bit."
		wait
		dialog "[Lana]"
		dialog "As you might have guessed, you need to help light the bonfires! Of course, items that can burn well and for a long time are suitable for this."
		wait
		dialog "[Lana]"
		dialog "I think, ^0000cd5 Tarry Branches, 10 Tree roots and 1 Fire Arrow^000000 will be enough for making a fire."
		wait
		dialog "[Lana]"
		dialog "And of course you'll have to make your own efforts to make a fire!"
		wait
		dialog "[Lana]"
		dialog "So, bring me those items and you can take part in the festival."
		wait
		dialog "[Lana]"
		dialog "^0000cdTarry Branches^000000 can be obtained from Revived Branches."
		setquest 3364
		close
		return
	break
	endchoose
elseif (thx_3364 == 1)
	DisableItemMove
	dialog "[Lana]"
	dialog "Are you ready? Have you prepared everything I mentioned?"
	wait
	if ((v[Fire_Arrow] > 0) & (v[Tree_Root] > 9) & (v[Goodly_Bough] > 4))
		dialog "[Lana]"
		dialog "Great, now put it all on the fire."
		wait
		ShowEffect "Bonfire#19_thx03" 470
		ShowEffect "Bonfire#19_thx03" 603
		ShowEffect "Bonfire#19_thx03" EF_SIGHTRASHER
		ShowEffect "Bonfire#19_thx01" EF_FIREWALL
		ShowEffect "Bonfire#19_thx02" EF_FIREWALL
		ShowEffect "Bonfire#19_thx03" EF_FIREWALL
		ShowEffect "Bonfire#19_thx04" EF_FIREWALL
		ShowEffect "Bonfire#19_thx05" EF_FIREWALL
		ShowEffect "Bonfire#19_thx06" EF_FIREWALL
		ShowEffect "Bonfire#19_thx07" EF_FIREWALL
		ShowEffect "Bonfire#19_thx08" EF_FIREWALL
		ShowEffect "Bonfire#19_thx09" EF_FIREWALL
		ShowEffect "Bonfire#19_thx10" EF_FIREWALL
		ShowEffect "Bonfire#19_thx11" EF_FIREWALL
		ShowEffect "Bonfire#19_thx12" EF_FIREWALL
		ShowEffect "Bonfire#19_thx13" EF_FIREWALL
		dialog "[Lana]"
		dialog "So... Good! Now step back a little."
		wait
		ShowEffect "Bonfire#19_thx03" 903
		Talk2me "Tourist#19_thx01" "Wow, it's burning!"
		DelayTime 200
		Talk2me "Tourist#19_thx04" "...Brighter and brighter!"
		Talk2me "Tourist#19_thx02" "...Bigger and bigger!"
		DelayTime 300
		Talk2me "Tourist#19_thx07" "Watch out for sparks!"
		Talk2me "Tourist#19_thx05" "Let's burn all the bad memories in this fire."
		DelayTime 300
		Talk2me "Tourist#19_thx03" "Very nice!"
		Talk2me "Tourist#19_thx08" "And warm."
		dialog "[Lana]"
		dialog "We worked hard and it paid off."
		wait
		dialog "[Lana]"
		dialog "And with your help, we can hope for a more prosperous tomorrow."
		wait
		dialog "[Lana]"
		dialog "Thank you very much. We also thank those around you for coming!"
		Talk2me "Tourist#19_thx01" "Thank you for coming!"
		Talk2me "Tourist#19_thx04" "I'm glad to be here..."
		DelayTime 500
		Talk2me "Tourist#19_thx06" "Thank you!"
		Talk2me "Tourist#19_thx02" "Thank you!"
		Talk2me "Tourist#19_thx05" "Thanks for the warmth."
		DelayTime 300
		Talk2me "Tourist#19_thx03" "May the next season be lucky too!"
		Talk2me "Tourist#19_thx08" "Of course!"
		DelayTime 500
		Talk2me "Tourist#19_thx07" "So we should work hard!"
		wait
		ShowEffect "" 603
		dialog "[Lana]"
		dialog "Thanks to your help, the fire has flared up! I'll give you two tickets..."
		wait
		dialog "[Lana]"
		dialog "The first is a Ship Ticket, <NAVI> [Ship's Captain] <INFO> alberta.gat, 140,170,0,101,0 </INFO> </NAVI> can take you."
		wait
		dialog "[Lana]"
		dialog "Another is a lottery ticket, you can participate in <NAVI> [Lottery ]<INFO>alberta.gat,141,188,0,101,0</INFO> </NAVI>. Tell us later what you got. They say there are no losers there..."
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
		dialog "[Lana]"
		dialog "Hmm... that's a bit missing. Did you forget what I said?"
		wait
		dialog "[Lana]"
		dialog "First of all, bring ^0000cd5 Tarry Branches, 10 Tree roots and 1 Fire Arrow^000000."
		close
		EnableItemMove
		return
	endif
elseif (thx_3364 == 2)
	dialog "[Lana]"
	dialog "Good afternoon, adventurer. How do you like the festival?"
	close
	return
else
	dialog "[Lana]"
	dialog "Welcome! We welcome everyone who has visited Alberta!"
	close
	return
endif
return

// =====================================================
npc "alberta" "Tourist#19_thx01" 4_F_BARYO_GIRL 142 168 5 0 0
OnClick:
Talk2me "Tourist#19_thx01" "This year I could not return to my hometown. So I am spending my loneliness here..."
return
npc "alberta" "Tourist#19_thx02" 4_F_JPN2 145 168 3 0 0
OnClick:
Talk2me "Tourist#19_thx02" "Have you seen how this big Bonfire is? I came to see it on purpose!"
return
npc "alberta" "Tourist#19_thx03" 4_M_RUSCHILD 148 165 3 0 0
OnClick:
Talk2me "Tourist#19_thx03" "I really like the harvest season, even on a day like this."
return
npc "alberta" "Tourist#19_thx04" 4_F_MALAYA 147 161 0 0 0
OnClick:
Talk2me "Tourist#19_thx04" "The fire in the sea at night is really beautiful."
return
npc "alberta" "Tourist#19_thx05" 4_F_CHNWOMAN 144 159 1 0 0
OnClick:
Talk2me "Tourist#19_thx05" "May only good things happen next days..."
return
npc "alberta" "Tourist#19_thx06" 4_F_TWGIRL 141 160 7 0 0
OnClick:
Talk2me "Tourist#19_thx06" "Yeah, it's worth the time it takes to get here."
return
npc "alberta" "Tourist#19_thx07" 4_M_THAIAYO 140 163 7 0 0
OnClick:
Talk2me "Tourist#19_thx07" "When you see this bonfire on a ship in the night sea, it looks like a scorching sun."
return
npc "alberta" "Tourist#19_thx08" 4_M_DEWWOMAN 140 166 5 0 0
OnClick:
Talk2me "Tourist#19_thx08" "I want to make popcorn over the fire..."
return

// ==========================================================
npc "alberta" "Bonfire#19_thx01" 4_TRACE 144 166 5 0 0
npc "alberta" "Bonfire#19_thx02" 4_TRACE 144 165 5 0 0
npc "alberta" "Bonfire#19_thx03" 4_BONFIRE 144 164 5 0 0
npc "alberta" "Bonfire#19_thx04" 4_TRACE 144 163 5 0 0
npc "alberta" "Bonfire#19_thx05" 4_TRACE 144 162 5 0 0
npc "alberta" "Bonfire#19_thx06" 4_TRACE 142 164 5 0 0
npc "alberta" "Bonfire#19_thx07" 4_TRACE 143 164 5 0 0
npc "alberta" "Bonfire#19_thx08" 4_TRACE 145 164 5 0 0
npc "alberta" "Bonfire#19_thx09" 4_TRACE 146 164 5 0 0
npc "alberta" "Bonfire#19_thx10" 4_TRACE 143 165 5 0 0
npc "alberta" "Bonfire#19_thx11" 4_TRACE 145 165 5 0 0
npc "alberta" "Bonfire#19_thx12" 4_TRACE 143 163 5 0 0
npc "alberta" "Bonfire#19_thx13" 4_TRACE 145 163 5 0 0
// =========================================================
npc "alberta" "Ship's Captain#19_thx" 4_M_SEAMAN 140 170 3 5 5
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
	Talk2me "Ship's Captain#19_thx" "If you have a Ship Ticket, I can take you anywhere."
endif
return

OnClick:
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 2)
	dialog "[Ship's Captain]"
	dialog "Do you want to go home? Or on a trip? Anyway, if you have a Ship Ticket, I can take you anywhere. Of course, if 'anywhere' has a port. He-he."
	wait
	if (v[Free_Pass_Ticket] < 1)
		dialog "[Ship's Captain]"
		dialog "But you don't seem to have a ticket. First the ticket - then we sail."
		close
		return
	endif
	dialog "[Ship's Captain]"
	dialog "Where would you like to sail?"
	wait
	choose menu "Geffen " "Comodo " "Lighthalzen " "Al De Baran " "Einbroch " "Izlude " "Payon " "Cancel "
	case 1
		dialog "[Ship's Captain]"
		dialog "Hold on tight!"
		DelayTime 200
		Talk2me "Ship's Captain#19_thx" "We're sailing away!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "geffen" 132 48
		return
	break
	case 2
		dialog "[Ship's Captain]"
		dialog "Hold on tight!"
		DelayTime 200
		Talk2me "Ship's Captain#19_thx" "We're sailing away!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "comodo" 86 99
		return
	break
	case 3
		dialog "[Ship's Captain]"
		dialog "Hold on tight!"
		DelayTime 200
		Talk2me "Ship's Captain#19_thx" "We're sailing away!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "lighthalzen" 246 76
		return
	break
	case 4
		dialog "[Ship's Captain]"
		dialog "Hold on tight!"
		DelayTime 200
		Talk2me "Ship's Captain#19_thx" "We're sailing away!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "aldebaran" 225 146
		return
	break
	case 5
		dialog "[Ship's Captain]"
		dialog "Hold on tight!"
		DelayTime 200
		Talk2me "Ship's Captain#19_thx" "We're sailing away!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "einbroch" 239 123
		return
	break
	case 6
		dialog "[Ship's Captain]"
		dialog "Hold on tight!"
		DelayTime 200
		Talk2me "Ship's Captain#19_thx" "We're sailing away!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "izlude" 196 180
		return
	break
	case 7
		dialog "[Ship's Captain]"
		dialog "Hold on tight!"
		DelayTime 200
		Talk2me "Ship's Captain#19_thx" "We're sailing away!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "payon" 129 62
		return
	break
	case 8
		dialog "[Ship's Captain]"
		dialog "Take care of yourself."
		close
		return
	break
	endchoose
else
	dialog "[Ship's Captain]"
	dialog "Do you want to go home? Or on a trip? Anyway, if you have a Ship Ticket, I can take you anywhere. Of course, if 'anywhere' has a port. He-he."
	wait
	dialog "[Ship's Captain]"
	dialog "But you don't seem to have a ticket. First the ticket - then we sail."
	close
	return
endif
return

// =====================================================
npc "alberta" "Loon#19_thx" 4_M_ARUNA_NFM1 134 162 7 5 5
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
	Talk2me "Loon#19_thx" "Traveler, can you help me?"
endif
return

OnClick:
//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Loon]"
	dialog "If you want to take part in the festival, make your inventory lighter."
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
	dialog "[Loon]"
	dialog "Hello there!"
	wait
	choose menu "What's happening?"
	endchoose
	dialog "[Loon]"
	dialog "Why did you come here?"
	wait
	choose menu "I came to the festival "
	endchoose
	dialog "[Loon]"
	dialog "Oh, that's good... Hey, if you have time... if you have time... Can you help me? Please... Please don't walk by."
	wait
	choose menu "I can help " "I'm busy "
	case 1
		dialog "[Loon]"
		dialog "Hey, this is really good. I was worried about what to do. I am worried that this holiday will be ruined by me, or that the Midgard continent will be in danger..."
		wait
		dialog "[Loon]"
		dialog "Although, of course, if this happens, the continent will be named in my honor... As in honor of a man who once and for all destroyed everything that exists."
		wait
		choose menu "What help do you need?"
		endchoose
		dialog "[Loon]"
		dialog "Did you take part in lighting the fire? I watched from the side... And the branches that you brought..."
		wait
		choose menu "Tarry branches?"
		endchoose
		dialog "[Loon]"
		dialog "It looks like this was the branch I shot."
		wait
		choose menu "What?"
		endchoose
		dialog "[Loon]"
		dialog "No, Ehm... This is... a misunderstanding! Mistake... Unfortunate ca... Oh, but it doesn't matter anymore."
		wait
		dialog "[Loon]"
		dialog "As you know, I am the wizard^000000Loon, from the town of Geffen ^0000cd. I'm here to light fires for the festival."
		wait
		dialog "[Loon]"
		dialog "As you can see, the fire does not go out, the wood does not smolder... And the ashes are not scattered around..."
		wait
		dialog "[Loon]"
		dialog "Sometimes, when I need to be happy, I make a fake fire the size of a house to keep people happy..."
		wait
		dialog "[Loon]"
		dialog "Sounds good, doesn't it? But actually I'm really bored already. Working hours are less than a few minutes a day..."
		wait
		dialog "[Loon]"
		dialog "And I hate being bored more than anything else... Really..."
		wait
		choose menu "What happened?"
		endchoose
		dialog "[Loon]"
		dialog "So... I was bored and played with the branches that people brought in... That is... Experimenting with magic... So... I tried magic that makes dry wood fresh..."
		wait
		choose menu "And..."
		endchoose
		dialog "[Loon]"
		dialog "That branches..."
		wait
		choose menu "What?"
		endchoose
		dialog "[Loon]"
		dialog "Well, they came to life..."
		wait
		dialog "[Loon]"
		dialog "......"
		Emotion "Loon#19_thx" 40
		wait
		choose menu "You did it?!"
		endchoose
		dialog "[Loon]"
		dialog "You have already seen the Revived branches, right? The fact is that they are also multiplying... At this rate, the whole of Midgard will soon be covered with resurrected branches!"
		wait
		dialog "[Loon]"
		dialog "But...? If you think about it, if the branches continue to revive and their number will grow, people can learn how to live with the Revived branches."
		wait
		dialog "[Loon]"
		dialog "Will you accept these branches as new members of society? Will they come to study at Geffen as wizards sometimes? Then I will have new graduates. This is good!"
		wait
		dialog "[Loon]"
		dialog "And then they will start using magic against me! They will remember how I burned them! This is bad! Bad!"
		wait
		dialog "[Loon]"
		dialog "We must do something! So far, these branches are not very strong or aggressive."
		wait
		choose menu "Exactly "
		endchoose
		dialog "[Loon]"
		dialog "I have to light the fire here... But also I think about how to stop the invasion of branches..."
		wait
		dialog "[Loon]"
		dialog "Lana doesn't know anything yet. Actually, I didn't even know that the branches were resurrected until rumors reached me."
		wait
		dialog "[Loon]"
		dialog "So I ask you to walk around the area and destroy the Revived Branches. And bring me ^0000cd10 Tarry Branches^000000 as evidence, of course."
		wait
		dialog "[Loon]"
		dialog "Please do it quickly and quietly, don't tell Lana..."
		completequest 3365
		setquest 3369
		close
		return
	break
	case 2
		dialog "[Loon]"
		dialog "Ah... you must be very busy if you don't have time to save the world..."
		wait
		dialog "[Loon]"
		dialog "Well... Keep it up..."
		close
		return
	break
	endchoose
elseif (thx_3369 == 1)
	DisableItemMove
	if ((v[Goodly_Bough] > 9) & (hunt_chek01 == 2))
		dialog "[Loon]"
		dialog "Hmm... The branches look better than they used to be. Not so dry anymore and... Oh, I wanted to say that..."
		wait
		ShowEffect "Firewood#19_thx01" EF_POTION4
		dialog "[Loon]"
		dialog "Actually, you deal with these branches very quickly! Of course, I could fix everything as it should be... But you are good at it too."
		wait
		dialog "[Loon]"
		dialog "And I am... He-he..."
		wait
		choose menu "So what should I do?"
		endchoose
		dialog "[Loon]"
		dialog "I think you should come again tomorrow. I'm not reckless, it's just the situation..."
		wait
		dialog "[Loon]"
		dialog "And in return I will give you a ^0000cdLottery Ticket^000000, I think you can win something worthy."
		wait
		dialog "[Loon]"
		dialog "You can try your luck in <NAVI><Lottery><INFO>alberta.gat,141,188,0,101,0</INFO> </NAVI>, one ticket - one chance."
		erasequest 3369
		dropitem Goodly_Bough 10
		getitem Harvest_Lottery_Ticket 1
		setquest 3370
		close
		EnableItemMove
		return
	else
		if (v[Goodly_Bough] < 10)
			dialog "[Loon]"
			dialog "Haven't you brought anything? Excuse me..."
			wait
			dialog "[Loon]"
			dialog "You promised me to destroy Revived Branches. And without proof, I don't believe you."
			wait
			dialog "[Loon]"
			dialog "So, again... I ask you to walk around and destroy the Revived Branches. And bring me ^0000cd10 Tarry Branches^000000 as evidence."
			close
			EnableItemMove
			return
		elseif (hunt_chek01 < 2)
			dialog "[Loon]"
			dialog "Hmm... I think you decided to outwit me!"
			wait
			dialog "[Loon]"
			dialog "You promised me to destroy the Revived Branches. And without proof, I don't believe you."
			wait
			dialog "[Loon]"
			dialog "So, again... I ask you to walk around and destroy the Revived Branches. And bring me ^0000cd10 Tarry Branches^000000 as evidence."
			close
			EnableItemMove
			return
		endif
	endif
elseif (thx_3370 == 1)
	if (time_check01 == 2)
		dialog "[Loon]"
		dialog "Hey, traveler! Come here quickly! The invasion continues..."
		wait
		choose menu "Need any help?" "I'm busy today..."
		case 1
			dialog "[Loon]"
			dialog "So, again... I ask you to walk around and destroy the Revived Branches. And bring me ^0000cd10 Tarry Branches^000000 as evidence."
			erasequest 3370
			setquest 3369
			close
			return
		break
		case 2
			erasequest 3370
			dialog "[Loon]"
			dialog "Ah... you must be very busy if you don't have time to save the world..."
			wait
			dialog "[Loon]"
			dialog "Well... Keep it up..."
			close
			return
		break
		endchoose
	else
		dialog "[Loon]"
		dialog "So far, the revived branches have been stopped... But I don't think it will last long. Come back tomorrow."
		close
		return
	endif
elseif ((thx_3364 == 2) & (thx_3369 == 0) & (thx_3370 == 0))
	dialog "[Loon]"
		dialog "Hey, traveler! Come here quickly! The invasion continues..."
	wait
		choose menu "Need any help?" "I'm busy today..."
	case 1
		dialog "[Loon]"
		dialog "So, again... I ask you to walk around and destroy the Revived Branches. And bring me ^0000cd10 Tarry Branches^000000 as evidence."
		setquest 3369
		close
		return
	break
	case 2
		dialog "[Loon]"
		dialog "Ah... you must be very busy if you don't have time to save the world..."
		close
		return
	break
	endchoose
else
	dialog "[Loon]"
	dialog "All Midgard is in danger because of me..."
	close
	return
endif

// =====================================================
npc "alberta" "Firewood#19_thx01" 4_WOODPILE 131 160 5 0 0
npc "alberta" "Firewood#19_thx02" 4_WOODPILE 132 159 5 0 0
//=========================================================================


// =======================================================
npc "alberta" "Serena#19_thx" 4_F_JOB_HUNTER 152 198 3 5 5
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
	Talk2me "Serena#19_thx" "We are looking for someone more rave and patient than anyone else!"
endif
return

OnClick:
//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Serena]"
	dialog "If you want to take part in the festival, make your inventory lighter."
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
	dialog "[Serena]"
	dialog "Hello. Are you here for a holiday? Do you sound like a seasoned adventurer, do you think?"
	wait
	choose menu "I can't argue "
	endchoose
	dialog "[Serena]"
	dialog "At a time like this when everyone is sharing food with each other... Have you ever heard of a wild boar entering a private house because it is hungry?"
	wait
	dialog "[Serena]"
	dialog "Sometimes they destroy crops that are still growing and eat the best of what we have harvested. At this time of year, people hunt wild boars..."
	wait
	dialog "[Serena]"
	dialog "Of course, I'm a hunter, but the boars are just hungry and go down for food. There is no point in hunting wild boars! But people shouldn't suffer either..."
	wait
	dialog "[Serena]"
	dialog "Therefore, our festival management team decided to stop hunting wild boars."
	wait
	dialog "[Serena]"
	dialog "However, it is necessary to fight the boars somehow, and we have come up with a way. But... Nobody wants to participate in this yet..."
	wait
	dialog "[Serena]"
	dialog "We have made ^0000cdBoar Traps^000000. Without harm to them, we eliminate our problem!"
	wait
	dialog "[Serena]"
	dialog "How about helping us catch the boars? This is a completely humane decision, isn't it?"
	wait
	choose menu "Let's try!" "I'm busy... "
	case 1
		dialog "[Serena]"
		dialog "Excellent, thank you! You will not regret it, this is a good deed."
		wait
		dialog "[Serena]"
		dialog "Here you can take a special trap with which you can catch Hungry Boar."
		wait
		dialog "[Serena]"
		dialog "Catch at least 10 Hungry Boars. Don't kill them, please, just catch."
		completequest 3366
		setquest 3371
		getitem Savage_Trap 1
		close
		return
	break
	case 2
		dialog "[Serena]"
		dialog "When you have time, you can come back."
		close
		return
	break
	endchoose
elseif (thx_3371 == 1)
	DisableItemMove
	dialog "[Serena]"
	dialog "Well, have you caught the boars?"
	wait
	var thx_trap = v[Captured_Savage]
	if (v[Captured_Savage] > 9)
		dialog "[Serena]"
		dialog "One... two... You are the only one to catch them in such a short time. You did a great job!"
		wait
		dialog "[Serena]"
		dialog "As promised, here's the ticket. You can take part in <NAVI> [Lottery ]<INFO>alberta.gat,141,188,0,101,0</INFO> </NAVI>."
		wait
		dialog "[Serena]"
		dialog "Besides, I think you are entitled to a ship ticket, you must have got tired on the way here. Ask <NAVI> [Ship's Captain] <INFO> alberta.gat, 140,170,0,101,0 </INFO> </NAVI>."
		wait
		dialog "[Serena]"
		dialog "We will fix this trap and release captured boars. May I ask you to come tomorrow too?"
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
		dialog "[Serena]"
		dialog "You need to catch at least 10 Hungry Boars."
		close
		EnableItemMove
		return
	endif
elseif (thx_3372 == 1)
	if (time_check01 == 2)
		dialog "[Serena]"
		dialog "Good morning! The weather is good today, right? On such days, Hungry Boars become more active. Will you help me today?"
		wait
		choose menu "Of course, I will. " "I'm busy..."
		case 1
			dialog "[Serena]"
			dialog "Excellent, thank you! You will not regret it, this is a good deed."
			wait
			dialog "[Serena]"
			dialog "Here you can take a special trap with which you can catch Hungry Boar."
			wait
			dialog "[Serena]"
			dialog "Catch at least 10 Hungry Boars. Don't kill them, please, just catch."
			erasequest 3372
			setquest 3371
			getitem Savage_Trap 1
			close
			return
		break
		case 2
			dialog "[Serena]"
			dialog "When you have time, you can come back."
			erasequest 3372
			close
			return
		break
		endchoose
	else
		dialog "[Serena]"
		dialog "We will fix this trap and release captured boars. May I ask you to come tomorrow too?"
		close
		return
	endif
elseif ((thx_3364 == 2) & (thx_3371 == 0) & (thx_3372 == 0))
		dialog "[Serena]"
		dialog "Good morning! The weather is good today, right? On such days, Hungry Boars become more active. Will you help me today?"
		wait
		choose menu "Of course, I will. " "I'm busy..."
		case 1
		dialog "[Serena]"
		dialog "Excellent, thank you! You will not regret it, this is a good deed."
		wait
		dialog "[Serena]"
		dialog "Here you can take a special trap with which you can catch Hungry Boar."
		wait
		dialog "[Serena]"
		dialog "Catch at least 10 Hungry Boars. Don't kill them, please, just catch."
		setquest 3371
		getitem Savage_Trap 1
		close
		return
	break
	case 2
		dialog "[Serena]"
		dialog "Okay. When you have time, you can come back."
		close
		return
	break
	endchoose
else
	dialog "[Serena]"
	dialog "We will fix this trap and release all caught boars. May I ask you to come back tomorrow?"
	close
	return
endif
return

// =========================================================
npc "alberta" "Eve#19_thx" 4_F_TWMIDWOMAN 119 193 3 5 5
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
	Talk2me "Eve#19_thx" "How about cooking some food?"
endif
return

OnClick:
//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Eve]"
	dialog "If you want to take part in the festival, make your inventory lighter."
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
	dialog "[Eve]"
	dialog "Hi, I saw you light a fire. Do you... often attend such festivals?"
	wait
	choose menu "I try not to miss "
	endchoose
	dialog "[Eve]"
	dialog "Are there really a lot of people here? And all these people came here, to Alberta, to take part in the festival."
	wait
	dialog "[Eve]"
	dialog "Some people, of course, come to their hometown. But most of them are people who sail from afar."
	wait
	dialog "[Eve]"
	dialog "Quite often people come alone. They are holding the festival alone... But this is wrong."
	wait
	dialog "[Eve]"
	dialog "Maybe you can brighten up their loneliness by preparing a couple of portions of a festive dinner?"
	wait
	var my_food = rand 1 3
	if (my_food == 1)
		dialog "[Gustav]"
		dialog "I will cook! Just bring the ingredients."
		Talk2me "Gustav#19_thx" "I will cook!"
		setquest 3373
		erasequest 3367
		wait
		dialog "[Eve]"
		dialog "Will you help?"
		wait
		dialog "[Gustav]"
		dialog "Sure. We can't entrust this to you..."
		wait
		dialog "[Eve]"
		dialog "What? Why not us? Ehm... you probably know best. What products do you need?"
		wait
		dialog "[Gustav]"
		dialog "Let's see... today we have puffed wheat in honey."
		Talk2me "Gustav#19_thx" "Let's see... today we have puffed wheat in honey."
		wait
		dialog "[Eve]"
		dialog "Sounds delicious!"
		wait
		dialog "[Gustav]"
		dialog "It tastes even better!"
		wait
		dialog "[Eve]"
		dialog "What do you need for this? Have a recipe?"
		wait
		dialog "[Gustav]"
		dialog "I won't tell you my recipe, but here's what I need: ^0000cd1 Bag of Grain, 3 Honey, 10 Green Herbs^000000."
		wait
		dialog "[Gustav]"
		dialog "Bring these, and hurry up!"		
		close
		return
	elseif (my_food == 2)
		dialog "[Estrid]"
		dialog "Maybe tea is better?"
		Talk2me "Estrid#19_thx" "Maybe tea is better?"
		setquest 3374
		erasequest 3367
		wait
		dialog "[Eve]"
		dialog "Estrid, what are you talking about?"
		wait
		dialog "[Estrid]"
		dialog "What could be better than warm, soul-warming tea!"
		wait
		dialog "[Eve]"
		dialog "Will you really help us?"
		wait
		dialog "[Estrid]"
		dialog "Of course, but I need ^0000cdYellow Spice^000000 for the cake."
		Talk2me "Estrid#19_thx" "Of course!"
		wait
		dialog "[Eve]"
		dialog "I guess that's not a problem, is it?"
		wait
		dialog "[Estrid]"
		dialog "Just one more thing. I am running out of firewood for the heating of the stove, but I can't get distracted now."
		wait
		dialog "[Estrid]"
		dialog "Please bring ^0000cdYellow Spice and 3 Trunks^000000, for the heating of the stove."
		close
		return
	else
		dialog "[Louie]"
		dialog "It seems that now is my turn to cook..."
		Talk2me "Louie#19_thx" "It seems that now is my turn to cook..."
		setquest 3375
		erasequest 3367
		wait
		dialog "[Eve]"
		dialog "Louie, last time we had no dinner at all..."
		wait
		dialog "[Louie]"
		dialog "It was an accident! I didn't know that feathers would not make soup..."
		wait
		dialog "[Eve]"
		dialog "Feathers? I wish your experiments don't hurt us..."
		wait
		dialog "[Louie]"
		dialog "It can't hurt you! I have a lot of experience!"
		Talk2me "Louie#19_thx" "It can't hurt you!"
		wait
		dialog "[Eve]"
		dialog "Okay, okay... What's on the menu today?"
		wait
		dialog "[Louie]"
		dialog "Gourmet carrot-lemon cocktail and sugar-coated berries for dessert."
		wait
		dialog "[Eve]"
		dialog "I think we can go without dessert..."
		wait
		dialog "[Louie]"
		dialog "You don't understand anything about kitchen art!"
		wait
		dialog "[Louie]"
		dialog "Since dessert was not ordered this time, ^0000cd1 Savory Sauce, 10 Carrots and 3 Lemons^000000 will be enough for me."
		close
		return
	endif
elseif (thx_3373 == 1)
	DisableItemMove
	dialog "[Eve]"
	dialog "Are you already here? Have you got the ingredients we need?"
	wait
	if ((v[Grain] > 0) & (v[Honey] > 2) & (v[Green_Herb] > 9))
		dialog "[Eve]"
		dialog "So... everything seems to be fresh! Now I need time to prepare all this."
		wait
		ShowEffect "Firewood#19_thx03" EF_FIREWALL
		DelayTime 1000
		ShowEffect "Firewood#19_thx03" 608
		DelayTime 1000
		dialog "[Gustav]"
		dialog "Everything is ready, you can relate!"
		wait
		dialog "[Eve]"
		dialog "I'll take care of it, thanks."
		wait
		dialog "[Eve]"
		dialog "And thank you, traveler. As promised, your ^0000cdLottery Ticket^000000."
		dropitem Grain 1
		dropitem Honey 3
		dropitem Green_Herb 10
		getitem Harvest_Lottery_Ticket 2
		erasequest 3373
		setquest 3376
		if (thx_3381 == 0)
			setquest 3381 
			Talk2me "Gustav#19_thx" "It smells so tasty..."
			close
			EnableItemMove
			return
		endif
		close
		EnableItemMove
		return
	else
		dialog "[Eve]"
		dialog "Remember what Gustav asked for? ^0000cd1 Bag of Grain, 3 Honey, 10 Green Herbs^000000."
		close
		EnableItemMove
		return
	endif
elseif (thx_3374 == 1)
	DisableItemMove
	dialog "[Eve]"
	dialog "You're already here? Did you bring the necessary products?"
	wait
	if ((v[Yellow_Spice] > 0) & (v[Wooden_Block] > 2))
		dialog "[Eve]"
		dialog "I feel excellent spices already!"
		wait
		dialog "[Estrid]"
		dialog "Put the firewood in fire. I'll handle the cake."
		wait
		ShowEffect "Firewood#19_thx02" EF_FIREWALL
		DelayTime 1000
		ShowEffect "Firewood#19_thx02" 608
		DelayTime 1000
		dialog "[Estrid]"
		dialog "Done!"
		wait
		dialog "[Eve]"
		dialog "I'll take over the distribution, don't worry about it."
		wait
		dialog "[Eve]"
		dialog "Thank you very much. You have provided us all with a pleasant evening. As promised, ^0000cdLottery Ticket^000000."
		dropitem Yellow_Spice 1
		dropitem Wooden_Block 3
		getitem Harvest_Lottery_Ticket 1
		erasequest 3374
		setquest 3376
		if (thx_3385 == 0)
			setquest 3385 
			Talk2me "Estrid#19_thx" "Hey, come here!"
			close
			EnableItemMove
			return
		endif

	else
		dialog "[Eve]"
		dialog "Remember what Estrid asked? These are: ^0000cd1 Yellow Seasoning and 3 Trunks^000000, for kindling the stove."
		close
		EnableItemMove
		return
	endif
elseif (thx_3375 == 1)
	DisableItemMove
	dialog "[Eve]"
	dialog "You're already here? Did you bring the necessary products?"
	wait
	if ((v[Plain_Sauce] > 0) & (v[Lemon] > 2) & (v[Carrot] > 9))
		dialog "[Eve]"
		dialog "Excellent!"
		wait
		dialog "[Louie]"
		dialog "Give them here soon, Savory Sauce, I hope fresh... Otherwise, it won't work!"
		wait
		ShowEffect "Firewood#19_thx01" EF_FIREWALL
		DelayTime 1000
		ShowEffect "Firewood#19_thx01" 608
		DelayTime 1000
		dialog "[Louie]"
		dialog "Done. I think a refreshing cocktail will come in handy among the hot fires."
		wait
		dialog "[Eve]"
		dialog "I'll take over the distribution, don't worry about it."
		wait
		dialog "[Eve]"
		dialog "Thank you very much. You have provided us all with a pleasant evening. As promised, your lottery ticket."
		dropitem Plain_Sauce 1
		dropitem Lemon 3
		dropitem Carrot 10
		getitem Harvest_Lottery_Ticket 2
		erasequest 3375
		setquest 3376
		if (thx_3377 == 0)
			setquest 3377 
			Talk2me "Louie#19_thx" "What? Carrot allergy?! Drink! Quickly!"
			close
			EnableItemMove
			return
		endif
	else
		dialog "[Eve]"
		dialog "Remember what Louie asked for? He lacked ^0000cd1 Savory Sauce, 10 Carrots and 3 Lemons^000000."
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
		dialog "[Eve]"
		dialog "Good evening, are you here again? You know, it would be nice to diversify today's menu a little..."
		wait
		choose menu "I can help " "I have to go..."
		case 1
			if (((thx_3377 == 1) | (thx_3377 == 2)) & (thx_3381 == 0) & (thx_3385 == 0))
				var my_food = rand 1 2
				if (my_food == 1)
					dialog "[Eve]"
					dialog "Gustav will be cooking, but he needs: ^0000cd1 Bag of Grain, 3 Honey, 10 Green Herbs^000000."
					erasequest 3376
					setquest 3373
					close
					return
				else
					dialog "[Eve]"
					dialog "Serena will be cooking, but she needs: ^0000cd1 Yellow Spice, 3 Trunks^000000."
					erasequest 3376
					setquest 3374
					close
					return
				endif
			elseif ((thx_3377 == 0) & ((thx_3381 == 1) | (thx_3381 == 2)) & (thx_3385 == 0))
				var my_food = rand 1 2
				if (my_food == 1)
					dialog "[Eve]"
					dialog "Serena will be cooking, but she needs: ^0000cd1 Yellow Spice, 3 Trunks^000000."
					erasequest 3376
					setquest 3374
					close
					return
				else
					dialog "[Eve]"
					dialog "Louie will be cooking, but he needs: ^0000cd1 Savory Sauce, 3 Lemons, 10 Carrots^000000."
					erasequest 3376
					setquest 3375
					close
					return
				endif
			elseif ((thx_3377 == 0) & (thx_3381 == 0) & ((thx_3385 == 1) | (thx_3385 == 2)))
				var my_food = rand 1 2
				if (my_food == 1)
					dialog "[Eve]"
					dialog "Gustav will be cooking, but he needs: ^0000cd1 Bag of Grain, 3 Honey, 10 Green Herbs^000000."
					erasequest 3376
					setquest 3373
					close
					return
				else
					dialog "[Eve]"
					dialog "Louie will be cooking, but he needs: ^0000cd1 Savory Sauce, 3 Lemons, 10 Carrots^000000."
					erasequest 3376
					setquest 3375
					close
					return
				endif
			elseif ((thx_3375 == 0) | (thx_3377 == 0)) & ((thx_3381 == 1) | (thx_3381 == 2)) & ((thx_3385 == 1) | (thx_3385 == 2))
					dialog "[Eve]"
					dialog "Louie will be cooking, but he needs: ^0000cd1 Savory Sauce, 3 Lemons, 10 Carrots^000000."
					erasequest 3376
					setquest 3375
					close
					return
			elseif ((thx_3373 == 0) | (thx_3381 == 0)) & ((thx_3377 == 1) | (thx_3377 == 2)) & ((thx_3385 == 1) | (thx_3385 == 2))
					dialog "[Eve]"
					dialog "Gustav will be cooking, but he needs: ^0000cd1 Bag of Grain, 3 Honey, 10 Green Herbs^000000."
					erasequest 3376
					setquest 3373
					close
					return
			elseif ((thx_3374 == 0) | (thx_3385 == 0)) & ((thx_3377 == 1) | (thx_3377 == 2)) & ((thx_3381 == 1) | (thx_3381 == 2))
					dialog "[Eve]"
					dialog "Serena will be cooking, but she needs: ^0000cd1 Yellow Spice, 3 Trunks^000000."
					erasequest 3376
					setquest 3374
					close
					return
			else
				var my_feed = rand 1 3
				if (my_feed == 1)
					dialog "[Eve]"
					dialog "Gustav will be cooking, but he needs: ^0000cd1 Bag of Grain, 3 Honey, 10 Green Herbs^000000."
					erasequest 3376
					setquest 3373
					close
					return
				elseif (my_feed == 2)
					dialog "[Eve]"
					dialog "Serena will be cooking, but she needs: ^0000cd1 Yellow Spice, 3 Trunks^000000."
					erasequest 3376
					setquest 3374
					close
					return
				else
					dialog "[Eve]"
					dialog "Louie will be cooking, but he needs: ^0000cd1 Savory Sauce, 3 Lemons, 10 Carrots^000000."
					erasequest 3376
					setquest 3375
					close
					return
				endif
			endif
		break
		case 2
			dialog "[Eve]"
			dialog "Did you just come to see how the food is prepared? You can drop by, but please don't bother."
			close
			return
		break
		endchoose
	else
		dialog "[Eve]"
		dialog "We are currently preparing and we do not need anything, thanks. Come back tomorrow."
		close
		return
	endif

else
	dialog "[Eve]"
	dialog "People come to see the lights of the festival. It is so pleasant..."
	close
	return
endif
return

// =======================================================
npc "alberta" "Gustav#19_thx" 4_M_DWARF 119 198 3 0 0
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
	dialog "[Gustav]"
	dialog "If you want to take part in the festival, make your inventory lighter."
	close
	return
else
endif
//==============================================================================
Talk2me "Gustav#19_thx" "You can taste, but don't eat it all at once!"
var thx_3381 = isbegin_quest 3381
var thx_3382 = isbegin_quest 3382
var thx_3383 = isbegin_quest 3383
var thx_3384 = isbegin_quest 3384
var thx_time = checkquest_playtime 3384
if (thx_3381 == 1)
	dialog "[Gustav]"
	dialog "Oh, welcome. Did you help Eve with her holiday dinner?"
	wait
	choose menu "Yes, it was me"
	endchoose
	dialog "[Gustav]"
	dialog "Every year on this festival I have such a busy schedule that I don't even get to see my family."
	wait
	dialog "[Gustav]"
	dialog "Eh... my daughter Kayley always wanted to live here..."
	wait
	dialog "[Gustav]"
	dialog "She dreamed of becoming a merchant here in Alberta, but I discouraged her... You know, these sailors..."
	wait
	dialog "[Gustav]"
	dialog "It would be better for her to stay in a quieter city..."
	wait
	dialog "[Gustav]"
	dialog "I could see her, but how can I leave all these people?"
	wait
	dialog "[Gustav]"
	dialog "Although, nothing will happen if I only leave for half a day, right?"
	wait
	choose menu "Yes "
	endchoose
	dialog "[Gustav]"
	dialog "But in order for me to visit my daughter, I need to get tickets for the ship somewhere..."
	wait
	choose menu "I can bring you tickets " "I'm busy now..."
		case 1
			dialog "[Gustav]"
			dialog "Thank you very much! You may help me a lot!"
			wait
			dialog "[Gustav]"
			dialog "And please bring ^0000cd2 Ship Tickets^000000 so I can come back too."
			close
			completequest 3381
			setquest 3382
			return
		break
		case 2
			dialog "[Gustav]"
			dialog "Oh... Okay..."
		break
	endchoose
endif

if (thx_3382 == 1)
	if (v[Free_Pass_Ticket] > 1)
		dialog "[Gustav]"
		dialog "Two tickets! Well, thank you."
		wait
		dialog "[Gustav]"
		dialog "You know, I've got ^0000cd2 Lottery tickets^000000 lost here... I don't really believe in these events. The visitors have forgotten on the table."
		completequest 3382
		setquest 3384
		dropitem Free_Pass_Ticket 2
		getitem Harvest_Lottery_Ticket 2 
		close
	else
		dialog "[Gustav]"
		dialog "Please bring ^0000cd2 Ship Tickets^000000 so I can visit my daughter Kayley."
		close
		return
	endif
endif

if (thx_3384 == 1)
	if (thx_time == 2)
	dialog "[Gustav]"
	dialog "Oh, welcome again!"
	wait
	dialog "[Gustav]"
	dialog "Do you remember, I asked you to get ^0000cd2 Ship Tickets^000000..."
	wait
	dialog "[Gustav]"
	dialog "I could see Kayley. Nothing's going to happen if I only leave for half a day, right?"
	wait
	choose menu "I can bring you tickets " "I'm busy now..."
		case 1
			dialog "[Gustav]"
			dialog "Thank you very much! What would I do without you..."
			wait
			dialog "[Gustav]"
			dialog "Please bring ^0000cd2 Ship Ticket^000000 so I can come back and forth too."
			close
			completequest 3381
			setquest 3382
			return
		break
		case 2
			dialog "[Gustav]"
			dialog "Oh... Okay..."
		break
	endchoose
	else
		dialog "[Gustav]"
		dialog "Thank you very much for helping out. I think I can visit Kayley tomorrow too..."
		wait
		dialog "[Gustav]"
		dialog "Until then, I have to work. After all, there are more and more visitors!"
		close
		return
	endif
endif
	
if ((thx_3383 == 1) & (thx_3384 == 0))
	if (v[Free_Pass_Ticket] > 1)
		dialog "[Gustav]"
		dialog "Two tickets! Well, thank you."
		wait
		dialog "[Gustav]"
		dialog "You know, I've got ^0000cd2 Lottery tickets^000000 lost here... I don't really believe in these events. The visitors have forgotten on the table."
		erasequest 3383
		setquest 3384
		dropitem Free_Pass_Ticket 2
		getitem Harvest_Lottery_Ticket 2
		close
		return
	else
		dialog "[Gustav]"
		dialog "Please bring ^0000cd2 Ship Tickets^000000 so I can visit my daughter Kayley."
		close
		return
	endif
endif

//================================================================================================
		
return

npc "alberta" "Firewood#19_thx03" 4_TRACE 118 197 1 0 0
OnClick:
Talk2me "Gustav#19_thx" "Wow, don't get close to the fire!"
Talk2me "Estrid#19_thx" "It would be better for you to step further away."
return

//=========================================================
npc "alberta" "Estrid#19_thx" 4_M_CHNCOOK 117 198 3 0 0
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
	dialog "[Estrid]"
	dialog "If you want to take part in the festival, make your inventory lighter."
	close
	return
else
endif
//==============================================================================
Talk2me "Estrid#19_thx" "I always spend a lot of time decorating cakes. After all, it is always tastier to eat a cake when it looks like a cake..."
var thx_3385 = isbegin_quest 3385
var thx_3386 = isbegin_quest 3386
var thx_3387 = isbegin_quest 3387
var thx_3388 = isbegin_quest 3388
var thx_time = checkquest_playtime 3388
if (thx_3385 == 1)
	dialog "[Estrid]"
	dialog "Oh hello, can you talk to me a little?"
	wait
	dialog "[Estrid]"
	dialog "...Sorry for appealing to you so strangely, actually I could use some help."
	wait
	dialog "[Estrid]"
	dialog "I have not been here for long, and this is the first time I have such a festival. I can't handle such a load..." 
	wait
	dialog "[Estrid]"
	dialog "Could you please help?"
	wait
	choose menu "But... I'm not a pastry chef."
	endchoose
	dialog "[Estrid]"
	dialog "Sure. Haha. But it doesn't matter..."
	wait
	choose menu "Really?"
	endchoose
	dialog "[Estrid]"
	dialog "As far as I understand, the Revived Branches that have been walking nearby lately have adapted to the sweet..."
	wait
	dialog "[Estrid]"
	dialog "But... They are branches. Ha-ha! How can they eat sweets?"
	wait
	dialog "[Estrid]"
	dialog "Therefore, they simply collect these sweets they find nearby."
	wait
	dialog "[Estrid]"
	dialog "I think they can get some ^0000cdFestival Cookies^000000 lost a couple of days ago."
	wait
	dialog "[Estrid]"
	dialog "In addition, Hungry Boars often enjoy eating them too."
	wait
	choose menu "How many cookies?" 
	endchoose
	dialog "[Estrid]"
	dialog "I think 10 pieces will be enough."
	wait
	dialog "[Estrid]"
	dialog "Well, can you help me? I'll give you my ^0000cdLottery ticket^000000 if you can handle it."
	wait
	choose menu "I can help " "I'm busy..."
	case 1
		dialog "[Estrid]"
		dialog "Excellent! ^0000cd10 Festival Cookies^000000, remember?"
		completequest 3385
		setquest 3386
		close
		return
	break
	case 2
		dialog "[Estrid]"
		dialog "No problem..."
		wait
		dialog "[Estrid]"
		dialog "I'll have to work hard to provide the entire festival with desserts alone..."
		close
		return
	break
	endchoose
endif

if (thx_3386 == 1)
	if (v[Harvest_Cookie] > 9)
		dialog "[Estrid]"
		dialog "Excellent! The cookies, of course, are a little hardened, but they have not lost their taste at all."
		wait
		dialog "[Estrid]"
		dialog "Thanks for your help, here's your ticket. I think you can drop by tomorrow too, there are more and more visitors, but I'm alone..."
		completequest 3386
		setquest 3388
		dropitem Harvest_Cookie 10
		getitem Harvest_Lottery_Ticket 1 
		close
	else
		dialog "[Estrid]"
		dialog "^0000cd10 Festival Cookies^000000, remember? I will not be in time..."
		close
		return
	endif
endif

if (thx_3388 == 1)
	if (thx_time == 2)
		dialog "[Estrid]"
		dialog "Hi, remember you brought me ^0000cdFestival Cookies^000000?"
		wait
		dialog "[Estrid]"
		dialog "So, a few more pieces would be useful to me. The visitors liked it."
		wait
		choose menu "I can bring more " "I'm busy..."
		case 1
			dialog "[Estrid]"
			dialog "I knew you could be relied on!"
			wait
			dialog "[Estrid]"
			dialog "^0000cd10 Festival Cookies^000000, remember? I will not be in time..."
			close
			setquest 3387
			erasequest 3388
			return
		break
		case 2
			dialog "[Estrid]"
			dialog "..."
			wait
			dialog "[Estrid]"
			dialog "It's okay, I'll do it myself..."
			close
			return
		break
		endchoose
	else
		dialog "[Estrid]"
		dialog "Thanks again for your help, all sweet tooth are happy."
		wait
		dialog "[Estrid]"
		dialog "But to be honest, I think there will be even more tourists tomorrow... And I could use your help again."
		close
		return
	endif
endif

if ((thx_3387 == 1) & (thx_3388 == 0))
	if (v[Harvest_Cookie] > 9)
		dialog "[Estrid]"
		dialog "Excellent! The cookies, of course, are a little hardened, but they have not lost their taste at all."
		wait
		dialog "[Estrid]"
		dialog "Thanks for your help, here's your ticket. I think you can drop by tomorrow too, there are more and more visitors, but I'm alone..."
		erasequest 3387
		setquest 3388
		dropitem Harvest_Cookie 10
		getitem Harvest_Lottery_Ticket 1
		close
		return
	else
		dialog "[Estrid]"
		dialog "^0000cd10 Festival Cookies^000000, remember? I will not be in time..."
		close
		return
	endif
endif
return

npc "alberta" "Firewood#19_thx02" 4_TRACE 116 197 1 0 0
OnClick:
Talk2me "Gustav#19_thx" "Wow, don't get close to the fire!"
Talk2me "Estrid#19_thx" "It would be better for you to step further away."
return

// =======================================================


npc "alberta" "Louie#19_thx" 4_COOK 115 198 3 4 4
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
	dialog "[Louie]"
	dialog "If you want to take part in the festival, make your inventory lighter."
	close
	return
else
endif
//==============================================================================
Talk2me "Louie#19_thx" "Not everyone can understand all the delights of my kitchen..."
var thx_3377 = isbegin_quest 3377
var thx_3378 = isbegin_quest 3378
var thx_3379 = isbegin_quest 3379
var thx_3380 = isbegin_quest 3380
var thx_time = checkquest_playtime 3380
if (thx_3377 == 1)
	dialog "[Louie]"
	dialog "Hey wanderer. Wait a minute."
	wait
	choose menu "What happened?"
	endchoose
	dialog "[Louie]"
	dialog "Nothing happened... It's just, I would like to ask you to try something."
	wait
	dialog "[Louie]"
	dialog "Listen, do you have a strong stomach?"
	wait
	dialog "[Louie]"
	dialog "Oh... You don't have to answer already... It seems my jelly has escaped from the table somewhere."
	wait
	dialog "[Louie]"
	dialog "Okay. I think I can find a use for you."
	wait
	dialog "[Louie]"
	dialog "I must somehow prove to everyone that I deserve to be the chef of my own kitchen too."
	wait
	dialog "[Louie]"
	dialog "And then as soon as everyone wants something unusual - go straight to Gustav."
	wait
	dialog "[Louie]"
	dialog "They don't seem to notice me, but I've been trying and improving my recipes for several years now..."
	wait
	dialog "[Louie]"
	dialog "I just thought... I need to release my new creation - exquisite Grasshopper Paws with pickled greens."
	wait
	dialog "[Louie]"
	dialog "But of course, if so many people, I would need a lot of ^0000cdGrasshopper's Legs and Green Herbs^000000."
	wait
	dialog "[Louie]"
	dialog "Well? Will you help me carry out this event? I think I could give you my accessory from the Contest of Extraordinary Chefs."
	wait
	choose menu "I'll help " "It is so strange..."
	case 1
		dialog "[Louie]"
		dialog "Who would doubt it. I... That is, we will become famous throughout Midgard, if we succeed."
		wait
		dialog "[Louie]"
		dialog "Only I just thought that without dessert - nowhere. We also need ^0000cdFestival cookies^000000."
		wait
		dialog "[Louie]"
		dialog "So... let's see..."
		wait
		dialog "[Louie]"
		dialog "I will need ^0000cd30 Grasshopper's Legs, 20 Festival Cookies and 20 Green Herbs^000000."
		wait
		choose menu "I will bring " "I'm busy..."
		case 1 
			dialog "[Louie]"
			dialog "Great, bring them soon. In the meantime, I'll start making the spices and lighting up the bonfire."
			completequest 3377
			setquest 3378
			close
			return
		break
		case 2
			dialog "[Louie]"
			dialog "Of course busy!"
			wait
			dialog "[Louie]"
			dialog "Everyone is busy! Now let me prepare drinks in peace... There are a lot of orders! Clear?"
			close
			return
		break
		endchoose
	break
	case 2
		dialog "[Louie]"
		dialog "Why strange? You do not understand anything!"
		Talk2me "Louie#19_thx" "You do not understand anything!"
		wait
		dialog "[Louie]"
		dialog "How bad it is to be the only connoisseur of unusual cuisine..."
		close
		return
	break
	endchoose
endif

if (thx_3377 == 3) & (thx_3380 == 0)
	dialog "[Louie]"
	dialog "Listen, do you have a strong stomach?"
	wait
	dialog "[Louie]"
	dialog "Oh... You don't have to answer already... It seems my jelly has escaped from the bastard somewhere."
	wait
	dialog "[Louie]"
	dialog "Okay. I think I can find a use for you."
	wait
	dialog "[Louie]"
	dialog "I must somehow prove to everyone that I, too, deserve to be the chef of my own kitchen."
	wait
	dialog "[Louie]"
	dialog "And then as soon as everyone wants something unusual - go straight to Gustav."
	wait
	dialog "[Louie]"
	dialog "They don't seem to notice me, but I've been trying and improving my recipes for several years now..."
	wait
	dialog "[Louie]"
	dialog "I just thought... I need to release my new creation - exquisite Grasshopper Paws with pickled greens."
	wait
	dialog "[Louie]"
	dialog "But of course, for so many people, I would need a lot of ^0000cd Grasshopper's Legs and Green Herbs^000000."
	wait
	dialog "[Louie]"
	dialog "Well? Will you help me carry out this event? I think I could give you my accessory from the Contest of Extraordinary Chefs."
	wait
	choose menu "I'll help " "It is so strange..."
	case 1
		dialog "[Louie]"
		dialog "Who would doubt it. I... That is, we will become famous throughout Midgard, if we succeed."
		wait
		dialog "[Louie]"
		dialog "Only I just thought that without dessert - nowhere. We also need ^0000cdFestival cookies^000000."
		wait
		dialog "[Louie]"
		dialog "So... let's see..."
		wait
		dialog "[Louie]"
		dialog "I will need ^0000cd30 Grasshopper's Leg, 20 Festival Cookies and 20 Green Herbs^000000."
		wait
		choose menu "I will bring " "I'm busy..."
		case 1 
			dialog "[Louie]"
			dialog "Great, bring them soon. In the meantime, I'll start making the spices and lighting up the bonfire."
			completequest 3377
			setquest 3378
			close
			return
		break
		case 2
			dialog "[Louie]"
			dialog "Of course busy!"
			wait
			dialog "[Louie]"
			dialog "Everyone is busy! Now let me prepare drinks in peace... There are a lot of orders! Clear?"
			close
			return
		break
		endchoose
	break
	case 2
		dialog "[Louie]"
		dialog "Why strange? You do not understand anything!"
		Talk2me "Louie#19_thx" "You do not understand anything!"
		wait
		dialog "[Louie]"
		dialog "How bad it is to be the only connoisseur of unusual cuisine..."
		close
		return
	break
	endchoose
endif
	
if (thx_3378 == 1)
	if (v[Grasshopper's_Leg] > 29 ) & (v[Green_Herb] > 19) & (v[Harvest_Cookie] > 19)
		dialog "[Louie]"
		dialog "Where have you been? I was already beginning to worry that you deceived me!"
		wait
		dialog "[Louie]"
		dialog "Okay, did you bring the ingredients?"
		wait
		dialog "[Louie]"
		dialog "I see what you brought. Now I'll start cooking, let's see... That is, our dish will be appreciated by visitors."
		wait
		dialog "[Louie]"
		dialog "I promised you my accessory from the competition, here you go. Plus, take this ^0000cdLottery Ticket^000000."
		completequest 3378
		setquest 3380
		dropitem Grasshopper's_Leg 30
		dropitem Green_Herb 20
		dropitem Harvest_Cookie 20
		getitem Harvest_Festa_Hat 1
		getitem Harvest_Lottery_Ticket 1
		close
		return
	else
		dialog "[Louie]"
		dialog "Do you remember what I asked you?"
		wait
		dialog "[Louie]"
		dialog "I will need for the dish - ^0000cd30 Grasshopper's Leg, 20 Festival Cookies and 20 Green Herb^000000."
		close
		return
	endif
endif


if (thx_3380 == 1)
	if (thx_time == 2)
		dialog "[Louie]"
		dialog "Wanderer!"
		wait
		dialog "[Louie]"
		dialog "Great news - everyone liked my dish!"
		wait
		dialog "[Louie]"
		dialog "Everyone who dared to try... But everyone! I think we need to keep promoting our ideas to the masses!"
		wait
		choose menu "I think so too " "Not worth it "
		case 1 
			dialog "[Louie]"
			dialog "Okay, then let's try to cook it today."
			wait
			dialog "[Louie]"
			dialog "I will need for the dish - ^0000cd30 Grasshopper's Legs, 20 Festival Cookies and 20 Green Herbs^000000."
			close
			erasequest 3380
			setquest 3379
			return
		break
		case 2
			dialog "[Louie]"
			dialog "What do you mean 'not worth it'?"
			wait
			dialog "[Louie]"
			dialog "We could have become famous!"
			close
			return
		break
		endchoose
	else
		dialog "[Louie]"
		dialog "I hope that we did our best not in vain... I think that it will be necessary to cook tomorrow too."
		wait
		dialog "[Louie]"
		dialog "Oh friend! Hey! Try a new dish! You have never tried this!"
		Talk2me "Louie#19_thx" "Hey! Try a new dish! You have never tried this!"
		close
		return
	endif
endif

if ((thx_3379 == 1) & (thx_3380 == 0))
	if (v[Grasshopper's_Leg] > 29 ) & (v[Green_Herb] > 19) & (v[Harvest_Cookie] > 19)
		dialog "[Louie]"
		dialog "Hi, did you bring the ingredients?"
		wait
		dialog "[Louie]"
		dialog "I see what I brought. Now I'll start cooking, let's see how mine... That is, our dish will be appreciated today."
		wait
		dialog "[Louie]"
		dialog "Take these lottery tickets. I got them from disgruntled visitors... Instead of paying..."
		erasequest 3379
		setquest 3380
		dropitem Grasshopper's_Leg 30
		dropitem Green_Herb 20
		dropitem Harvest_Cookie 20
		getitem Harvest_Lottery_Ticket 2
		close
		return
	else
		dialog "[Louie]"
		dialog "Do you remember what I asked you?"
		wait
		dialog "[Louie]"
		dialog "I will need for the dish - ^0000cd30 Grasshopper's Legs, 20 Festival Cookies and 20 Green Herbs^000000."
		close
		return
	endif
endif

//================

npc "alberta" "Firewood#19_thx01" 4_TRACE 114 197 1 0 0
OnClick:
Talk2me "Gustav#19_thx" "Wow, don't get close to the fire!"
Talk2me "Estrid#19_thx" "It would be better for you to step further away."
Talk2me "Louie#19_thx" "It's okay, try it straight from the fire!"
return

// ====================================================
npc "alberta" "Homemade food#19_thx" 4_EP16_FOOD 119 190 3 0 0
OnClick:
return

// ====================================================

npc "alberta" "Lottery Host#19_thx" 4_M_KHMAN 141 188 3 0 0
OnInit:

NpcOverBMP "group_3"
NpcSecondName "<Lottery>"

OnClick:
//====================================================

var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Lottery host]"
	dialog "If you want to take part in the festival, make your inventory lighter."
	close
	return
else
endif
//==============================================================================	
	var whilechk = 0
	dialog "[Lottery host]"
	dialog "Welcome to the Festival of Fire and Light!"
	wait
	dialog "[Lottery host]"
	dialog "Come on! Take part in the lottery!"
	wait
	dialog "[Lottery host]"
	dialog "To participate you only need ^0000cd1 Lottery ticket^000000."
	wait
	while(1)
//====================================================

var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Lottery host]"
	dialog "If you want to take part in the lottery, empty your inventory."
	close
	return
else
endif
//==============================================================================	
	if (whilechk > 0)
		dialog "[Lottery host]"
		dialog "Want to participate again?"
		wait
	else
		dialog "[Lottery host]"
		dialog "Do you want to participate?"
		wait
	endif

	choose menu "Yes " "Leave "
	case 1 
		if (v[Harvest_Lottery_Ticket] > 0)
			dropitem Harvest_Lottery_Ticket 1
			ConsumePackageItem Season_Evt_Reward
			dialog "[Lottery host]"	
			dialog "Aaand... Spin! Here's your winnings!"
			var whilechk = whilechk + 1
			close
		else
			dialog "[Lottery host]"
			dialog "To participate you need ^0000cd1 Lottery ticket^000000."
			wait
			dialog "[Lottery host]"
			dialog "They can be obtained from the participants of the festival."
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
	

npc "alberta" "Host Assistant#19_thx_2" 4_M_KHMAN 138 188 3 0 0
OnInit:

NpcOverBMP "group_3"
NpcSecondName "<Lottery>"

OnClick:
//====================================================

var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[Host Assistant]"
	dialog "If you want to take part in the festival, make your inventory lighter."
	close
	return
else
endif
//==============================================================================	
	dialog "[Host Assistant]"
	dialog "Greetings."
	wait
	dialog "[Host Assistant]"
	dialog "If you want to take part in the lottery, you need to contact the Lottery Host."
	wait
	dialog "[Host Assistant]"
	dialog "To participate you need ^0000cd1 Lottery ticket^000000."
	wait
	choose menu "Can I participate without a ticket?" "Leave "
		case 1
		break
		case 2
			close
			return
		break
	endchoose
	dialog "[Host Assistant]"
	dialog "Actually, I would like the ^0000cd10 Festival Cookies^000000. I could offer to participate in the lottery for them."
	wait
	choose menu "Take part " "Leave "
	case 1
		if (v[Harvest_Cookie] > 9)
			dropitem Harvest_Cookie 10
			ConsumePackageItem Season_Evt_Reward
			dialog "[Host Assistant]"
			dialog "So, here's your reward."
			close
			return
		else
			dialog "[Host Assistant]"
			dialog "You don't have ^0000cd10 Festival Cookies^000000."
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
npc "prontera" "Festival participant#18_thx01" 4_M_GRANDMONK 125 125 5 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Festival participant#18_thx01" "The Fire and Light Festival is celebrated in Alberta. Do not miss!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Festival participant]"
	dialog "It seems that you are too young and inexperienced, I would not advise you to take risks."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Festival participant]"
	dialog "The sun is getting higher and higher, the harvest season is in full swing..."
	wait
	dialog "[Festival participant]"
	dialog "What is missing on such warm and productive days? Of course, a great holiday with delicious food and pleasant company."
	wait
	dialog "[Festival participant]"
	dialog "The port city of Alberta is waiting for all its indigenous people, but also ready to hospitably welcome all tourists!"
	wait
	dialog "[Festival participant]"
	dialog "In addition to food, dancing and good mood, you will also find a lottery organized by the participants of the festival."
	wait
	dialog "[Festival participant]"
	dialog "Well? Are you ready to take part in the festival? I think I could help you get to town."
	wait
	choose menu "I want to participate " "I am not ready "
	case 1
		dialog "[Festival participant]"
		dialog "Enjoy the festival!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Festival participant]"
		dialog "It's okay, come when you're ready."
		close
		return
	break
	endchoose
else
	dialog "[Festival participant]"
	dialog "Hello wanderer! I am glad that you are participating with us in the festival."
	close
	return
endif
return


// ==========================================================
npc "payon" "Festival participant#18_thx02" 4_M_GRANDMONK 165 99 6 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Festival participant#18_thx01" "The Fire and Light Festival is celebrated in Alberta. Do not miss!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Festival participant]"
	dialog "It seems that you are too young and inexperienced, I would not advise you to take risks."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Festival participant]"
	dialog "The sun is getting higher and higher, the harvest season is in full swing..."
	wait
	dialog "[Festival participant]"
	dialog "What is missing on such warm and productive days? Of course, a great holiday with delicious food and pleasant company."
	wait
	dialog "[Festival participant]"
	dialog "The port city of Alberta is waiting for all its indigenous people, but also ready to hospitably welcome all tourists!"
	wait
	dialog "[Festival participant]"
	dialog "In addition to food, dancing and good mood, you will also find a lottery organized by the participants of the festival."
	wait
	dialog "[Festival participant]"
	dialog "Well? Are you ready to take part in the festival? I think I could help you get to town."
	wait
	choose menu "I want to participate " "I am not ready "
	case 1
		dialog "[Festival participant]"
		dialog "Enjoy the festival!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Festival participant]"
		dialog "It's okay, come when you're ready."
		close
		return
	break
	endchoose
else
	dialog "[Festival participant]"
	dialog "Hello wanderer! I am glad that you are participating with us in the festival."
	close
	return
endif
return

// ========================================================
npc "aldebaran" "Festival participant#18_thx03" 4_M_GRANDMONK 143 115 4 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Festival participant#18_thx01" "The Fire and Light Festival is celebrated in Alberta. Do not miss!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Festival participant]"
	dialog "It seems that you are too young and inexperienced, I would not advise you to take risks."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Festival participant]"
	dialog "The sun is getting higher and higher, the harvest season is in full swing..."
	wait
	dialog "[Festival participant]"
	dialog "What is missing on such warm and productive days? Of course, a great holiday with delicious food and pleasant company."
	wait
	dialog "[Festival participant]"
	dialog "The port city of Alberta is waiting for all its indigenous people, but also ready to hospitably welcome all tourists!"
	wait
	dialog "[Festival participant]"
	dialog "In addition to food, dancing and good mood, you will also find a lottery organized by the participants of the festival."
	wait
	dialog "[Festival participant]"
	dialog "Well? Are you ready to take part in the festival? I think I could help you get to town."
	wait
	choose menu "I want to participate " "I am not ready "
	case 1
		dialog "[Festival participant]"
		dialog "Enjoy the festival!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Festival participant]"
		dialog "It's okay, come when you're ready."
		close
		return
	break
	endchoose
else
	dialog "[Festival participant]"
	dialog "Hello wanderer! I am glad that you are participating with us in the festival."
	close
	return
endif
return


// ============================================================
npc "geffen" "Festival participant#18_thx04" 4_M_GRANDMONK 129 57 4 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Festival participant#18_thx01" "The Fire and Light Festival is celebrated in Alberta. Do not miss!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Festival participant]"
	dialog "It seems that you are too young and inexperienced, I would not advise you to take risks."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Festival participant]"
	dialog "The sun is getting higher and higher, the harvest season is in full swing..."
	wait
	dialog "[Festival participant]"
	dialog "What is missing on such warm and productive days? Of course, a great holiday with delicious food and pleasant company."
	wait
	dialog "[Festival participant]"
	dialog "The port city of Alberta is waiting for all its indigenous people, but also ready to hospitably welcome all tourists!"
	wait
	dialog "[Festival participant]"
	dialog "In addition to food, dancing and good mood, you will also find a lottery organized by the participants of the festival."
	wait
	dialog "[Festival participant]"
	dialog "Well? Are you ready to take part in the festival? I think I could help you get to town."
	wait
	choose menu "I want to participate " "I am not ready "
	case 1
		dialog "[Festival participant]"
		dialog "Enjoy the festival!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Festival participant]"
		dialog "It's okay, come when you're ready."
		close
		return
	break
	endchoose
else
	dialog "[Festival participant]"
	dialog "Hello wanderer! I am glad that you are participating with us in the festival."
	close
	return
endif
return

// =========================================================
npc "morocc" "Festival participant#18_thx05" 4_M_GRANDMONK 168 87 4 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Festival participant#18_thx01" "The Fire and Light Festival is celebrated in Alberta. Do not miss!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Festival participant]"
	dialog "It seems that you are too young and inexperienced, I would not advise you to take risks."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Festival participant]"
	dialog "The sun is getting higher and higher, the harvest season is in full swing..."
	wait
	dialog "[Festival participant]"
	dialog "What is missing on such warm and productive days? Of course, a great holiday with delicious food and pleasant company."
	wait
	dialog "[Festival participant]"
	dialog "The port city of Alberta is waiting for all its indigenous people, but also ready to hospitably welcome all tourists!"
	wait
	dialog "[Festival participant]"
	dialog "In addition to food, dancing and good mood, you will also find a lottery organized by the participants of the festival."
	wait
	dialog "[Festival participant]"
	dialog "Well? Are you ready to take part in the festival? I think I could help you get to town."
	wait
	choose menu "I want to participate " "I am not ready "
	case 1
		dialog "[Festival participant]"
		dialog "Enjoy the festival!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Festival participant]"
		dialog "It's okay, come when you're ready."
		close
		return
	break
	endchoose
else
	dialog "[Festival participant]"
	dialog "Hello wanderer! I am glad that you are participating with us in the festival."
	close
	return
endif
return

// ============================================================
npc "yuno" "Festival participant#18_thx07" 4_M_GRANDMONK 148 181 5 5 5
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Festival participant#18_thx01" "The Fire and Light Festival is celebrated in Alberta. Do not miss!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Festival participant]"
	dialog "It seems that you are too young and inexperienced, I would not advise you to take risks."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Festival participant]"
	dialog "The sun is getting higher and higher, the harvest season is in full swing..."
	wait
	dialog "[Festival participant]"
	dialog "What is missing on such warm and productive days? Of course, a great holiday with delicious food and pleasant company."
	wait
	dialog "[Festival participant]"
	dialog "The port city of Alberta is waiting for all its indigenous people, but also ready to hospitably welcome all tourists!"
	wait
	dialog "[Festival participant]"
	dialog "In addition to food, dancing and good mood, you will also find a lottery organized by the participants of the festival."
	wait
	dialog "[Festival participant]"
	dialog "Well? Are you ready to take part in the festival? I think I could help you get to town."
	wait
	choose menu "I want to participate " "I am not ready "
	case 1
		dialog "[Festival participant]"
		dialog "Enjoy the festival!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Festival participant]"
		dialog "It's okay, come when you're ready."
		close
		return
	break
	endchoose
else
	dialog "[Festival participant]"
	dialog "Hello wanderer! I am glad that you are participating with us in the festival."
	close
	return
endif
return


// =======================================================
npc "rachel" "Festival participant#18_thx08" 4_M_GRANDMONK 111 134 4 5 5
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "Festival participant#18_thx01" "The Fire and Light Festival is celebrated in Alberta. Do not miss!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[Festival participant]"
	dialog "It seems that you are too young and inexperienced, I would not advise you to take risks."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[Festival participant]"
	dialog "The sun is getting higher and higher, the harvest season is in full swing..."
	wait
	dialog "[Festival participant]"
	dialog "What is missing on such warm and productive days? Of course, a great holiday with delicious food and pleasant company."
	wait
	dialog "[Festival participant]"
	dialog "The port city of Alberta is waiting for all its indigenous people, but also ready to hospitably welcome all tourists!"
	wait
	dialog "[Festival participant]"
	dialog "In addition to food, dancing and good mood, you will also find a lottery organized by the participants of the festival."
	wait
	dialog "[Festival participant]"
	dialog "Well? Are you ready to take part in the festival? I think I could help you get to town."
	wait
	choose menu "I want to participate " "I am not ready "
	case 1
		dialog "[Festival participant]"
		dialog "Enjoy the festival!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[Festival participant]"
		dialog "It's okay, come when you're ready."
		close
		return
	break
	endchoose
else
	dialog "[Festival participant]"
	dialog "Hello wanderer! I am glad that you are participating with us in the festival."
	close
	return
endif
return


/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
npc "alberta" "Musician#18_thx" 4_M_GUSLIMAN 148 170 3 0 0
OnClick:
Talk2me "Musician#18_thx" "Do not be sad, do not be alarmed, eat the dish with us..."
return

npc "alberta" "Musician#18_thx_2" 2_M_BARD_ORIENT 146 171 3 0 0
OnClick:
Talk2me "Musician#18_thx_2" "And... One! Two! Three! Four!"
return

npc "alberta" "Aborigine#18_thx" 4_M_05 149 168 3 0 0
OnClick:
Talk2me "Aborigine#18_thx" "Oh, how many tourists ..."
return

npc "alberta" "Tourist#18_thx01" 4_M_06 149 157 1 0 0
OnClick:
Talk2me "Tourist#18_thx01" "I have to leave already, but I can't take my eyes off the lights."
return




npc "alberta" "Tourist#18_thx09" 4_F_LGTGIRL 133 150 5 0 0
OnClick:
Talk2me "Tourist#18_thx09" "The food here is so delicious... Mmm..."
DelayTime 1000
Talk2me "Tourist#18_thx10" "I liked the fruity mix."
DelayTime 1000
Talk2me "Tourist#18_thx09" "Fruity? Where did you get it?"
DelayTime 1000
Talk2me "Tourist#18_thx10" "I'll get you."
DelayTime 1000
Talk2me "Tourist#18_thx09" "Thanks. You can also bring two!"
DelayTime 1000
Talk2me "Tourist#18_thx10" "I'll bring three. Ha-ha-ha "
return

npc "alberta" "Tourist#18_thx10" 4_M_CHNMAN 135 148 1 0 0
OnClick:
Talk2me "Tourist#18_thx10" "Will there be more such festivals?"
DelayTime 1000
Talk2me "Tourist#18_thx09" "I think so."
DelayTime 1000
Talk2me "Tourist#18_thx10" "I wonder which one will be next?"
DelayTime 1000
Talk2me "Tourist#18_thx09" "Noone knows."
return

///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////

