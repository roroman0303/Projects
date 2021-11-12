
npc "prontera" "Feery#2021hw_prt" 4_LUDE 133 124 6 0 0
OnClick:
dialog "[Feery]"
dialog "... ARRR!"
Talk2me "Feery#2021hw_prt" "Feery: ARRR!"
close
return

npc "prontera" "Horro#2021hw_prt" 4_LUDE 131 121 7 0 0
OnClick:
dialog "[Horro]"
dialog "Leave!"
Talk2me "Horro#2021hw_prt" "Horro: Leave!"
close
return

npc "prontera" "Phobos#2021hw_prt" 4_LUDE 136 120 8 0 0
OnClick:
dialog "[Phobos]"
dialog "Ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha..."
Talk2me "Phobos#2021hw_prt" "Phobos: Ha ha ha ha ha ha ha ha ha!"
close
return

npc "prontera" "Bright#2021hw_prt" 4_LUDE 134 122 3 0 0
OnInit:
    AddQuestInfo 11498 1 0
    SetQuestLevel 11498 20 1000
return

OnTouch2:
if (v[VAR_CLEVEL] < 20)
else
	if (v[halloebs01] < 1)
		dialog "[Bright]"
		dialog "Higher! Above!"
		Talk2me "Bright#2021hw_prt" "Bright: Higher! Above!"
        wait
        dialog "[Horro]"
        dialog "I can almost touch the cloud now!"
        Talk2me "Horro#2021hw_prt" "Horro: Almost!"
        wait
  choose menu "Keep listening" "Leave "
        case 1
        	dialog "[Phobos]"
			dialog "You heard? You heard? Jack ran away!"
            wait
            dialog "[Horro]"
            dialog "Jack?"
            wait
            dialog "[Bright]"
            dialog "Which Jack?"
            wait
            dialog "[Feery]"
            dialog "What is Jack?"
            wait
            dialog "[Bright]"
            dialog "Our festival won't take place without Jack!"
            wait
            dialog "[Feery]"
            dialog "It is important."
            wait
            dialog "[Phobos]"
            dialog "And it's true."
            wait
            dialog "[Horro]"
            dialog "Find Jack and come back!"
            wait
            dialog "[Phobos]"
            dialog "Good."
            wait
            dialog "[Feery]"
            dialog "Let's find it."
            wait
            dialog "[Bright]"
            dialog "Let's go back!"
            wait
            dialog "[Phobos]"
            dialog "Oh, it's Jack!"
            wait
            dialog "[Horro]"
            dialog "Where?"
            wait
            dialog "[Bright]"
            dialog "Jack!"
            setitem halloebs01 1
            setquest 11498
            close
            	moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Phobos]"
        	dialog "Well, go away!... Jack!.."
        	close
        	return
        break
        endchoose
	endif
endif
return

OnClick:
if (v[VAR_CLEVEL] < 20)
	dialog "[Bright]"
	dialog "Higher! Above!"
	Talk2me "Bright#2021hw_prt" "Bright: Higher! Above!"
	wait
	dialog "[Horro]"
	dialog "I can almost touch the cloud now!"
	Talk2me "Horro#2021hw_prt" "Horro: Almost!"
	wait
endif

if (v[halloebs01] < 1)
	dialog "[Bright]"
	dialog "Higher! Above!"
	Talk2me "Bright#2021hw_prt" "Bright: Higher! Above!"
	wait
	dialog "[Horro]"
	dialog "I can almost touch the cloud now!"
	Talk2me "Horro#2021hw_prt" "Horro: Almost!"
	wait
	choose menu "Keep listening" "Leave "
        case 1
        	dialog "[Phobos]"
			dialog "You heard? You heard? Jack ran away!"
            wait
            dialog "[Horro]"
            dialog "Jack?"
            wait
            dialog "[Bright]"
            dialog "Which Jack?"
            wait
            dialog "[Feery]"
            dialog "What is Jack?"
            wait
            dialog "[Bright]"
            dialog "Our festival won't take place without Jack!"
            wait
            dialog "[Feery]"
            dialog "It is important."
            wait
            dialog "[Phobos]"
            dialog "And it's true."
            wait
            dialog "[Horro]"
            dialog "Find Jack and come back!"
            wait
            dialog "[Phobos]"
            dialog "Good."
            wait
            dialog "[Feery]"
            dialog "Let's find it."
            wait
            dialog "[Bright]"
            dialog "Let's go back!"
            wait
            dialog "[Phobos]"
            dialog "Oh, it's Jack!"
            wait
            dialog "[Horro]"
            dialog "Where?"
            wait
            dialog "[Bright]"
            dialog "Jack!"
            setitem halloebs01 1
            setquest 11498
            close
            	moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Phobos]"
        	dialog "Well, go away!... Jack!.."
        	close
        	return
        break
    endchoose
endif

if (v[halloebs01] == 1)
	dialog "[Bright]"
	dialog "Jack... This is the Scarieest festival..."
	wait
	dialog "[Phobos]"
	dialog "^ff0000In the city of the dead a holiday now^000000!"
	close
	return
else
	dialog "[Bright]"
	dialog "Higher! Above!"
	Talk2me "Bright#2021hw_prt" "Bright: Higher! Above!"
	wait
	dialog "[Horro]"
	dialog "I can almost touch the cloud now!"
	Talk2me "Horro#2021hw_prt" "Horro: Almost!"
    close
    return
endif
return


npc "payon" "Feery#2021hw_pay" 4_LUDE 188 104 3 0 0
OnClick:
dialog "[Feery]"
dialog "... ARRR!"
Talk2me "Feery#2021hw_prt" "Feery: ARRR!"
close
return

npc "payon" "Horro#2021hw_pay" 4_LUDE 190 105 3 0 0
OnClick:
dialog "[Horro]"
dialog "Leave!"
Talk2me "Horro#2021hw_prt" "Horro: Go away!"
close
return

npc "payon" "Phobos#2021hw_pay" 4_LUDE 186 106 8 0 0
OnClick:
dialog "[Phobos]"
dialog "Ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha..."
Talk2me "Phobos#2021hw_prt" "Phobos: Ha ha ha ha ha ha ha ha ha!"
close
return

npc "payon" "Bright#2021hw_pay" 4_LUDE 192 103 5 5 5
OnInit:
    AddQuestInfo 11498 1 0
    SetQuestLevel 11498 20 1000
return

OnTouch2:
if (v[VAR_CLEVEL] < 20)
else
	if (v[halloebs01] < 1)
	dialog "[Bright]"
	dialog "Higher! Above!"
	Talk2me "Bright#2021hw_prt" "Bright: Higher! Above!"
	wait
	dialog "[Horro]"
	dialog "I can almost touch the cloud now!"
	Talk2me "Horro#2021hw_prt" "Horro: Almost!"
	wait
	choose menu "Keep listening" "Leave "
        case 1
        	dialog "[Phobos]"
			dialog "You heard? You heard? Jack ran away!"
            wait
            dialog "[Horro]"
            dialog "Jack?"
            wait
            dialog "[Bright]"
            dialog "Which Jack?"
            wait
            dialog "[Feery]"
            dialog "What is Jack?"
            wait
            dialog "[Bright]"
            dialog "Our festival won't take place without Jack!"
            wait
            dialog "[Feery]"
            dialog "It is important."
            wait
            dialog "[Phobos]"
            dialog "And it's true."
            wait
            dialog "[Horro]"
            dialog "Find Jack and come back!"
            wait
            dialog "[Phobos]"
            dialog "Good."
            wait
            dialog "[Feery]"
            dialog "Let's find it."
            wait
            dialog "[Bright]"
            dialog "Let's go back!"
            wait
            dialog "[Phobos]"
            dialog "Oh, it's Jack!"
            wait
            dialog "[Horro]"
            dialog "Where?"
            wait
            dialog "[Bright]"
            dialog "Jack!"
            setitem halloebs01 1
            setquest 11498
            close
            	moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Phobos]"
        	dialog "Well, go away!... Jack!.."
        	close
        	return
        break
    endchoose
	endif
endif
return

OnClick:
if (v[VAR_CLEVEL] < 20)
	dialog "[Bright]"
	dialog "Higher! Above!"
	Talk2me "Bright#2021hw_prt" "Bright: Higher! Above!"
	wait
	dialog "[Horro]"
	dialog "I can almost touch the cloud now!"
	Talk2me "Horro#2021hw_prt" "Horro: Almost!"
    close
    return
endif

if (v[halloebs01] < 1)
	dialog "[Bright]"
	dialog "Higher! Above!"
	Talk2me "Bright#2021hw_prt" "Bright: Higher! Above!"
	wait
	dialog "[Horro]"
	dialog "I can almost touch the cloud now!"
	Talk2me "Horro#2021hw_prt" "Horro: Almost!"
	wait
	choose menu "Keep listening" "Leave "
        case 1
        	dialog "[Phobos]"
			dialog "You heard? You heard? Jack ran away!"
            wait
            dialog "[Horro]"
            dialog "Jack?"
            wait
            dialog "[Bright]"
            dialog "Which Jack?"
            wait
            dialog "[Feery]"
            dialog "What is Jack?"
            wait
            dialog "[Bright]"
            dialog "Our festival won't take place without Jack!"
            wait
            dialog "[Feery]"
            dialog "It is important."
            wait
            dialog "[Phobos]"
            dialog "And it's true."
            wait
            dialog "[Horro]"
            dialog "Find Jack and come back!"
            wait
            dialog "[Phobos]"
            dialog "Good."
            wait
            dialog "[Feery]"
            dialog "Let's find it."
            wait
            dialog "[Bright]"
            dialog "Let's go back!"
            wait
            dialog "[Phobos]"
            dialog "Oh, it's Jack!"
            wait
            dialog "[Horro]"
            dialog "Where?"
            wait
            dialog "[Bright]"
            dialog "Jack!"
            setitem halloebs01 1
            setquest 11498
            close
            	moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Phobos]"
        	dialog "Well, go away!... Jack!.."
        	close
        	return
        break
    endchoose
endif

if (v[halloebs01] == 1)
	dialog "[Bright]"
	dialog "Jack... This is the Scarieest festival..."
	wait
	dialog "[Phobos]"
	dialog "^ff0000In the city of the dead it's a holiday now^000000!"
	close
	return
else
	dialog "[Bright]"
	dialog "Higher! Above!"
	Talk2me "Bright#2021hw_prt" "Bright: Higher! Above!"
	wait
	dialog "[Horro]"
	dialog "I can almost touch the cloud now!"
	Talk2me "Horro#2021hw_prt" "Horro: Almost!"
    close
    return
endif
return


npc "morocc" "Feery#2021hw_moc" 4_LUDE 168 95 3 0 0
OnClick:
dialog "[Feery]"
dialog "... ARRR!"
Talk2me "Feery#2021hw_prt" "Feery: ARRR!"
close
return

npc "morocc" "Horro#2021hw_moc" 4_LUDE 170 94 3 0 0
OnClick:
dialog "[Horro]"
dialog "Leave!"
Talk2me "Horro#2021hw_prt" "Horro: Go away!"
close
return

npc "morocc" "Phobos#2021hw_moc" 4_LUDE 168 93 8 0 0
OnClick:
dialog "[Phobos]"
dialog "Ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha ha..."
Talk2me "Phobos#2021hw_prt" "Phobos: Ha ha ha ha ha ha ha ha ha!"
close
return

npc "morocc" "Bright#2021hw_moc" 4_LUDE 170 96 5 5 5
OnInit:
    AddQuestInfo 11498 1 0
    SetQuestLevel 11498 20 1000
return

OnTouch2:
if (v[VAR_CLEVEL] < 20)
else
	if (v[halloebs01] < 1)
		dialog "[Bright]"
	dialog "Higher! Above!"
	Talk2me "Bright#2021hw_prt" "Bright: Higher! Above!"
	wait
	dialog "[Horro]"
	dialog "I can almost touch the cloud now!"
	Talk2me "Horro#2021hw_prt" "Horro: Almost!"
	wait
	choose menu "Keep listening" "Leave "
        case 1
        	dialog "[Phobos]"
			dialog "You heard? You heard? Jack ran away!"
            wait
            dialog "[Horro]"
            dialog "Jack?"
            wait
            dialog "[Bright]"
            dialog "Which Jack?"
            wait
            dialog "[Feery]"
            dialog "What is Jack?"
            wait
            dialog "[Bright]"
            dialog "Our festival won't take place without Jack!"
            wait
            dialog "[Feery]"
            dialog "It is important."
            wait
            dialog "[Phobos]"
            dialog "And it's true."
            wait
            dialog "[Horro]"
            dialog "Find Jack and come back!"
            wait
            dialog "[Phobos]"
            dialog "Good."
            wait
            dialog "[Feery]"
            dialog "Let's find it."
            wait
            dialog "[Bright]"
            dialog "Let's go back!"
            wait
            dialog "[Phobos]"
            dialog "Oh, it's Jack!"
            wait
            dialog "[Horro]"
            dialog "Where?"
            wait
            dialog "[Bright]"
            dialog "Jack!"
            setitem halloebs01 1
            setquest 11498
            close
            	moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Phobos]"
        	dialog "Well, go away!... Jack!.."
        	close
        	return
        break
    endchoose
	endif
endif
return

OnClick:
if (v[VAR_CLEVEL] < 20)
	dialog "[Bright]"
	dialog "Higher! Above!"
	Talk2me "Bright#2021hw_prt" "Bright: Higher! Above!"
	wait
	dialog "[Horro]"
	dialog "I can almost touch the cloud now!"
	Talk2me "Horro#2021hw_prt" "Horro: Almost!"
	wait
endif

if (v[halloebs01] < 1)
	dialog "[Bright]"
	dialog "Higher! Above!"
	Talk2me "Bright#2021hw_prt" "Bright: Higher! Above!"
	wait
	dialog "[Horro]"
	dialog "I can almost touch the cloud now!"
	Talk2me "Horro#2021hw_prt" "Horro: Almost!"
	wait
	choose menu "Keep listening" "Leave "
        case 1
        	dialog "[Phobos]"
			dialog "You heard? You heard? Jack ran away!"
            wait
            dialog "[Horro]"
            dialog "Jack?"
            wait
            dialog "[Bright]"
            dialog "Which Jack?"
            wait
            dialog "[Feery]"
            dialog "What is Jack?"
            wait
            dialog "[Bright]"
            dialog "Our festival won't take place without Jack!"
            wait
            dialog "[Feery]"
            dialog "It is important."
            wait
            dialog "[Phobos]"
            dialog "And it's true."
            wait
            dialog "[Horro]"
            dialog "Find Jack and come back!"
            wait
            dialog "[Phobos]"
            dialog "Good."
            wait
            dialog "[Feery]"
            dialog "Let's find it."
            wait
            dialog "[Bright]"
            dialog "Let's go back!"
            wait
            dialog "[Phobos]"
            dialog "Oh, it's Jack!"
            wait
            dialog "[Horro]"
            dialog "Where?"
            wait
            dialog "[Bright]"
            dialog "Jack!"
            setitem halloebs01 1
            setquest 11498
            close
            	moveto "niflheim" 176 241
            return
        break
        case 2
        	dialog "[Phobos]"
        	dialog "Well, go away!... Jack!.."
        	close
        	return
        break
    endchoose
endif

if (v[halloebs01] == 1)
	dialog "[Bright]"
	dialog "Jack... This is the Scarieest festival..."
	wait
	dialog "[Phobos]"
	dialog "^ff0000In the city of the dead it's a holiday now^000000!"
	close
	return
else
	dialog "[Bright]"
	dialog "Higher! Above!"
	Talk2me "Bright#2021hw_prt" "Bright: Higher! Above!"
	wait
	dialog "[Horro]"
	dialog "I can almost touch the cloud now!"
	Talk2me "Horro#2021hw_prt" "Horro: Almost!"
    close
    return
endif
return



npc "niflheim" "Horro#2021hw" 4_LUDE 177 242 5 5 5
OnInit:
    AddQuestInfo 11498 1 0
    SetQuestLevel 11498 20 1000
return

OnTouch2:
var q11498 = isbegin_quest 11498

if (v[VAR_CLEVEL] < 20)
else
	if (v[halloebs01] < 2)
		dialog "[Horro]"
		dialog "Jack!"
		Talk2me "Horro#2021hw" "Horro: Jack!"
        wait
        dialog "[Horro]"
		dialog "Jack, wake up!"
        Talk2me "Horro#2021hw" "Horro: Jack, wake up!"
        wait
        dialog "[Fry]"
        dialog "The festival is here, Jack!"
        wait
        dialog "[Bean]"
        dialog "It's already dark!"
        wait
        dialog "[Fry]"
		dialog "Wake up Jack! The festival is starting soon!"
        wait
        dialog "[Horro]"
        dialog "But... does it matter?"
        wait
        dialog "[Bean]"
        dialog "Jack hasn't returned yet."
        wait
        dialog "[Fry]"
        dialog "Right."
        wait
        dialog "[Horro]"
        dialog "Jack is back, but Jack is not!"
        wait
        dialog "[Bean]"
        dialog "And Jack too!"
        wait
        dialog "[Fry]"
        dialog "What about Jack?"
        wait
        dialog "[Bean]"
        dialog "Jack in the square!"
        wait
        dialog "[Horro]"
        dialog "So what about Jack?"
        wait
        dialog "[Bean]"
        dialog "Where did Jack go?"
        wait
        dialog "[Fry]"
        dialog "Ask ^ff0000Jack^000000!"
        wait
        dialog "[Horro]"
        dialog "Let's ask!"
        wait
        dialog "[Fry]"
        dialog "Jack knows for sure!"
        wait
        dialog "[Horro]"
        dialog "I know!"
        setitem halloebs01 2
        if (q11498 > 0)
        completequest 11498
        endif
        setquest 11499
        close
        return
	endif
endif
return

OnClick:
var q11498 = isbegin_quest 11498
var q11501 = checkquest_hunting 11501
var q11502 = checkquest_playtime 11502
var q11503 = checkquest_hunting 11503

if (v[VAR_CLEVEL] < 20)
	dialog "[Horro]"
    dialog "Jack is back, but Jack is not!"
    close
    return
endif

if (v[halloebs01] < 2)
	dialog "[Horro]"
	dialog "Jack!"
	Talk2me "Horro#2021hw" "Horro: Jack!"
	wait
	dialog "[Horro]"
	dialog "Jack, wake up!"
	Talk2me "Horro#2021hw" "Horro: Jack, wake up!"
	wait
	dialog "[Fry]"
	dialog "The festival is here, Jack!"
	wait
	dialog "[Bean]"
	dialog "It's already dark!"
	wait
	dialog "[Fry]"
	dialog "Wake up Jack! The festival is starting soon!"
	wait
	dialog "[Horro]"
	dialog "But... does it matter?"
	wait
	dialog "[Bean]"
	dialog "Jack hasn't returned yet."
	wait
	dialog "[Fry]"
	dialog "Right."
	wait
	dialog "[Horro]"
	dialog "Jack is back, but Jack is not!"
	wait
	dialog "[Bean]"
	dialog "And Jack too!"
	wait
	dialog "[Fry]"
	dialog "What about Jack?"
	wait
	dialog "[Bean]"
	dialog "Jack in the square!"
	wait
	dialog "[Horro]"
	dialog "So what about Jack?"
	wait
	dialog "[Bean]"
	dialog "Where did Jack go?"
	wait
	dialog "[Fry]"
	dialog "Ask ^ff0000Jack^000000!"
	wait
	dialog "[Horro]"
	dialog "Let's ask!"
	wait
	dialog "[Fry]"
	dialog "Jack knows for sure!"
	wait
	dialog "[Horro]"
	dialog "I know!"
	setitem halloebs01 2
	if (q11498 > 0)
	completequest 11498
	endif
	setquest 11499
	close
	return
endif

if (v[halloebs01] == 2)
	dialog "[Horro]"
    dialog "So what about Jack?"
    wait
    dialog "[Bean]"
    dialog "Where did Jack go?"
    wait
    dialog "[Fry]"
    dialog "Ask ^ff0000Jack^000000!"
    wait
	dialog "[Horro]"
	dialog "Let's ask!"
	wait
	dialog "[Fry]"
	dialog "Jack knows for sure!"
	wait
	dialog "[Horro]"
	dialog "I know!"
    close
    return
endif

if (v[halloebs01] == 3)
    dialog "[Horro]"
    dialog "Fry wants to hear from Jack!"
    wait
    dialog "[Horro]"
    dialog "Jack!"
    wait
    dialog "[Fry]"
    dialog "I want to hear it!"
    wait
    dialog "[Bean]"
    dialog "We need to find Jack!"
    close
    return
endif

if (v[halloebs01] == 4)

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "You have too many items. Free some space in your inventory and try again."
        close
        return
    else
    endif

	if (q11501] > 1)
		if ((v[Pumpkin_Decor] > 9) & (v[White_Thin_Stem] > 19))
			dialog "[Horro]"
			dialog "Jack is back!"
			dropitem Pumpkin_Decor 10
			dropitem White_Thin_Stem 20
			completequest 11501
			setquest 11502
			setitem halloebs01 5
			getitem Cookies_Bat 30
            wait
            dialog "[Fry]"
            dialog "Jack!"
            wait
            dialog "[Bean]"
            dialog "Hooray! Jack!"
            wait
            dialog "[Horro]"
            dialog "Let's all decorate Jack!"
            Talk2me "Horro#2021hw" "Horro: Let's all decorate Jack!"
            wait
            dialog "[Fry]"
            dialog "Paint Jack?"
            Talk2me "Fry#2021hw" "Fry: Paint Jack?"
            wait
            dialog "[Bean]"
            dialog "I am the first!"
            Talk2me "Bean#2021hw" "Bean: I am the first!"
            wait
            dialog "[Fry]"
            dialog "This is a holiday!"
            Talk2me "Fry#2021hw" "Fry: This is a holiday!"
            wait
            dialog "[Horro]"
            dialog "This is creepy!"
            wait
            dialog "[Bean]"
            dialog "This is scary!"
            wait
            dialog "[Horro]"
            dialog "Am I scary?"
            wait
            dialog "[Fry]"
            dialog "Let's decorate now!"
            close
            return
		else
            dialog "[Horro]"
			dialog "Jack! Bring me Jack!"
            wait
            dialog "[Fry]"
            dialog "If you wait too long, Jack may... sprout."
            wait
            dialog "[Bean]"
			dialog "This is awful!"
            wait
            dialog "[Horro]"
            dialog "Green sprouts!"
            wait
            dialog "[Fry]"
            dialog "But fresh."
            wait
            dialog "[Horro]"
            dialog "Bring us 10 ^ff0000Jack'o'Lanterns^000000!"
            wait
            dialog "[Bean]"
            dialog "We also need 20 ^ff0000White Thin Stems^000000. They will serve Jack... as limbs! Aha ha ha ha!"
            close
            return
		endif
	else
        dialog "[Horro]"
		dialog "Jack! Bring me Jack!"
		wait
		dialog "[Fry]"
		dialog "If you wait too long, Jack may... sprout."
		wait
		dialog "[Bean]"
		dialog "This is awful!"
		wait
		dialog "[Horro]"
		dialog "Green sprouts!"
		wait
		dialog "[Fry]"
		dialog "But fresh."
		wait
		dialog "[Horro]"
		dialog "Bring us 10 ^ff0000Jack'o'Lanterns^000000!"
		wait
		dialog "[Bean]"
		dialog "We also need 20 ^ff0000White Thin Stems^000000. They will serve Jack... as limbs! Aha ha ha ha!"
		close
		return
	endif
endif

if (v[halloebs01] > 4)

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "You have too many items. Free some space in your inventory and try again."
        close
        return
    else
    endif

	if (q11503 == 1)
		dialog "[Horro]"
		dialog "Jack! Bring me Jack!"
		wait
		dialog "[Fry]"
		dialog "If you wait too long, Jack may... sprout."
		wait
		dialog "[Bean]"
		dialog "This is awful!"
		wait
		dialog "[Horro]"
		dialog "Green sprouts!"
		wait
		dialog "[Fry]"
		dialog "But fresh."
		wait
		dialog "[Horro]"
		dialog "Bring us 10 ^ff0000Jack'o'Lanterns^000000!"
		wait
		dialog "[Bean]"
		dialog "We also need 20 ^ff0000White Thin Stems^000000. They will serve Jack...as limbs! Aha ha ha ha!"
		close
		return
	elseif (q11503 > 1)
		if ((v[Pumpkin_Decor] > 9) & (v[White_Thin_Stem] > 19))
			if ((v[halloebs01] == 10) | (v[halloebs01] == 17) | (v[halloebs01] == 24) | (v[halloebs01] == 31) | (v[halloebs01] == 38) | (v[halloebs01] == 45) | (v[halloebs01] == 52) | (v[halloebs01] == 59) | (v[halloebs01] == 66) | (v[halloebs01] == 73))
				var horo6 = v[halloebs01]
				var horo7 = horo6 + 1
				dialog "[Horro]"
    			dialog "Jack is back!"
				dropitem Pumpkin_Decor 10
				dropitem White_Thin_Stem 20
				if (q11503 == 3)
					recall_completequest 11503
				endif
				erasequest 11503
				setquest 11502
				setitem halloebs01 horo7
				getitem Cookies_Bat 30
				getitem C_Jakk 1
                wait
                dialog "[Fry]"
				dialog "Jack!"
				wait
				dialog "[Bean]"
				dialog "Hooray! Jack!"
				wait
				dialog "[Horro]"
				dialog "Let's all decorate Jack!"
				Talk2me "Horro#2021hw" "Horro: Let's all decorate Jack!"
				wait
				dialog "[Fry]"
				dialog "Paint Jack?"
				Talk2me "Fry#2021hw" "Fry: Paint Jack?"
				wait
				dialog "[Bean]"
				dialog "I am the first!"
				Talk2me "Bean#2021hw" "Bean: I am the first!"
				wait
				dialog "[Fry]"
				dialog "This is a holiday!"
				Talk2me "Fry#2021hw" "Fry: This is a holiday!"
				wait
				dialog "[Horro]"
				dialog "This is creepy!"
				wait
				dialog "[Bean]"
				dialog "This is scary!"
				wait
				dialog "[Horro]"
				dialog "Am I scary?"
				wait
				dialog "[Fry]"
				dialog "Let's decorate now!"
				close
				return
			else
				dialog "[Horro]"
    			dialog "Jack is back!"
				var horo6 = v[halloebs01]
				var horo7 = horo6 + 1
				dropitem Pumpkin_Decor 10
				dropitem White_Thin_Stem 20
				if (q11503 == 3)
					recall_completequest 11503
				endif
				erasequest 11503
				setquest 11502
				setitem halloebs01 horo7
				getitem Cookies_Bat 30
                wait
                dialog "[Fry]"
				dialog "Jack!"
				wait
				dialog "[Bean]"
				dialog "Hooray! Jack!"
				wait
				dialog "[Horro]"
				dialog "Let's all decorate Jack!"
				Talk2me "Horro#2021hw" "Horro: Let's all decorate Jack!"
				wait
				dialog "[Fry]"
				dialog "Paint Jack?"
				Talk2me "Fry#2021hw" "Fry: Paint Jack?"
				wait
				dialog "[Bean]"
				dialog "I am the first!"
				Talk2me "Bean#2021hw" "Bean: I am the first!"
				wait
				dialog "[Fry]"
				dialog "This is a holiday!"
				Talk2me "Fry#2021hw" "Fry: This is a holiday!"
				wait
				dialog "[Horro]"
				dialog "This is creepy!"
				wait
				dialog "[Bean]"
				dialog "This is scary!"
				wait
				dialog "[Horro]"
				dialog "Am I scary?"
				wait
				dialog "[Fry]"
				dialog "Let's decorate now!"
				close
				return
			endif
		else
			dialog "[Horro]"
			dialog "Jack! Bring me Jack!"
			wait
			dialog "[Fry]"
			dialog "If you wait too long, Jack may... sprout."
			wait
			dialog "[Bean]"
			dialog "This is awful!"
			wait
			dialog "[Horro]"
			dialog "Green sprouts!"
			wait
			dialog "[Fry]"
			dialog "But fresh."
			wait
			dialog "[Horro]"
			dialog "Bring us 10 ^ff0000Jack'o'Lanterns^000000!"
			wait
			dialog "[Bean]"
			dialog "We also need 20 ^ff0000White Thin Stems^000000. They will serve Jack...as limbs! Aha ha ha ha!"
			close
			return
		endif
	else
		if (q11502 == 0)
			dialog "[Horro]"
			dialog "Jack! Bring me Jack!"
			wait
			dialog "[Fry]"
			dialog "If you wait too long, Jack may... sprout."
			wait
			dialog "[Bean]"
			dialog "This is awful!"
			wait
			dialog "[Horro]"
			dialog "Green sprouts!"
			wait
			dialog "[Fry]"
			dialog "But fresh."
			wait
			dialog "[Horro]"
			dialog "Bring us 10 ^ff0000Jack'o'Lanterns^000000!"
			wait
			dialog "[Bean]"
			dialog "We also need 20 ^ff0000White Thin Stems^000000. They will serve Jack...as limbs! Aha ha ha ha!"
            setquest 11503
            close
            return
		elseif (q11502 == 1)
			dialog "[Horro]"
			dialog "You can't stay in the city of the dead for so long!"
            wait
            dialog "[Fry]"
            dialog "Let the stems grow!"
            wait
            dialog "[Bean]"
			dialog "And Jack will be alive! And green!"
            wait
            dialog "[Fry]"
            dialog "And the hands are white!"
            wait
            dialog "[Horro]"
            dialog "Let it grow."
            wait
            dialog "[Bean]"
            dialog "Come back tomorrow to look for Jacks!"
            close
            return
		else
			if (q11502 == 3)
				recall_completequest 11502
		    endif
		    erasequest 11502
    		dialog "[Horro]"
			dialog "Jack! Bring me Jack!"
			wait
			dialog "[Fry]"
			dialog "If you wait too long, Jack may... sprout."
			wait
			dialog "[Bean]"
			dialog "This is awful!"
			wait
			dialog "[Horro]"
			dialog "Green sprouts!"
			wait
			dialog "[Fry]"
			dialog "But fresh."
			wait
			dialog "[Horro]"
			dialog "Bring us 10 ^ff0000Jack'o'Lanterns^000000!"
			wait
			dialog "[Bean]"
			dialog "We also need 20 ^ff0000White Thin Stems^000000. They will serve Jack...as limbs! Aha ha ha ha!"
            setquest 11503
            close
            return
		endif
	endif
else
	dialog "[Fry]"
	dialog "Jack!"
	wait
	dialog "[Bean]"
	dialog "Hooray! Jack!"
	wait
	dialog "[Horro]"
	dialog "Let's all decorate Jack!"
	Talk2me "Horro#2021hw" "Horro: Let's all decorate Jack!"
	wait
	dialog "[Fry]"
	dialog "Paint Jack?"
	Talk2me "Fry#2021hw" "Fry: Paint Jack?"
	wait
	dialog "[Bean]"
	dialog "I am the first!"
	Talk2me "Bean#2021hw" "Bean: I am the first!"
	wait
	dialog "[Fry]"
	dialog "This is a holiday!"
	Talk2me "Fry#2021hw" "Fry: This is a holiday!"
	wait
	dialog "[Horro]"
	dialog "This is creepy!"
	wait
	dialog "[Bean]"
	dialog "This is scary!"
	wait
	dialog "[Horro]"
	dialog "Am I scary?"
	wait
	dialog "[Fry]"
	dialog "Let's decorate now!"
    close
    return
endif
return


npc "niflheim" "Fry#2021hw" 4_LUDE 180 242 3 0 0
OnClick:
var q11498 = isbegin_quest 11498
var q11501 = checkquest_hunting 11501
if (v[VAR_CLEVEL] < 20)
	dialog "[Fry]"
    dialog "Jack is back, but Jack is not!"
    close
    return
endif

if (v[halloebs01] < 2)
    dialog "[Horro]"
	dialog "Jack!"
	Talk2me "Horro#2021hw" "Horro: Jack!"
	wait
	dialog "[Horro]"
	dialog "Jack, wake up!"
	Talk2me "Horro#2021hw" "Horro: Jack, wake up!"
	wait
	dialog "[Fry]"
	dialog "The festival is here, Jack!"
	wait
	dialog "[Bean]"
	dialog "It's already dark!"
	wait
	dialog "[Fry]"
	dialog "Wake up Jack! The festival is starting soon!"
	wait
	dialog "[Horro]"
	dialog "But... does it matter?"
	wait
	dialog "[Bean]"
	dialog "Jack hasn't returned yet."
	wait
	dialog "[Fry]"
	dialog "Right."
	wait
	dialog "[Horro]"
	dialog "Jack is back, but Jack is not!"
	wait
	dialog "[Bean]"
	dialog "And Jack too!"
	wait
	dialog "[Fry]"
	dialog "What about Jack?"
	wait
	dialog "[Bean]"
	dialog "Jack in the square!"
	wait
	dialog "[Horro]"
	dialog "So what about Jack?"
	wait
	dialog "[Bean]"
	dialog "Where did Jack go?"
	wait
	dialog "[Fry]"
	dialog "Ask ^ff0000Jack^000000!"
	wait
	dialog "[Horro]"
	dialog "Let's ask!"
	wait
	dialog "[Fry]"
	dialog "Jack knows for sure!"
	wait
	dialog "[Horro]"
	dialog "I know!"
	setitem halloebs01 2
	if (q11498 > 0)
	completequest 11498
	endif
	setquest 11499
	close
	return
endif

if (v[halloebs01] == 2)
	dialog "[Horro]"
    dialog "So what about Jack?"
    wait
    dialog "[Bean]"
    dialog "Where did Jack go?"
    wait
    dialog "[Fry]"
    dialog "Ask ^ff0000Jack^000000!"
    wait
	dialog "[Horro]"
	dialog "Let's ask!"
	wait
	dialog "[Fry]"
	dialog "Jack knows for sure!"
	wait
	dialog "[Horro]"
	dialog "I know!"
    close
    return
endif

if (v[halloebs01] == 3)
	dialog "[Fry]"
    dialog "Hee-hee-hee-hee!"
    wait
    dialog "[Horro]"
    dialog "Terrible!"
    wait
    dialog "[Fry]"
    dialog "Jack turned green!"
    wait
    dialog "[Horro]"
    dialog "He must be alive!"
    wait
    dialog "[Bean]"
    dialog "It's clear."
    wait
    dialog "[Fry]"
    dialog "It's alive!"
    wait
    dialog "[Bean]"
    dialog "Jack!"
    wait
    dialog "[Fry]"
    dialog "If you don't bring Jack, you're in trouble!"
    wait
    dialog "[Bean]"
    dialog "Jack needs to be revived!"
    wait
    dialog "[Fry]"
    dialog "Jack!"
    wait
    dialog "[Horro]"
	dialog "Bring us Jack!"
    wait
    dialog "[Bean]"
	dialog "Jack must bring Jack!"
    wait
    dialog "[Fry]"
	dialog "Are you Jack?"
    wait
    dialog "[Horro]"
	dialog "It doesn't look like Jack."
    wait
    dialog "[Horro]"
	dialog "Bring us 10 ^ff0000Jack'o'Lanterns^000000!"
	wait
	dialog "[Bean]"
	dialog "We also need 20 ^ff0000White Thin Stems^000000. They will serve Jack...as limbs! Aha ha ha ha!"
    wait
    dialog "[Fry]"
    dialog "And if you wait too long, Jack may... sprout."
	wait
    dialog "[Fry]"
    dialog "Give it up!"
    wait
    dialog "[Horro]"
    dialog "Do not be late!"
    wait
    dialog "[Bean]"
    dialog "And nothing like that, even a scary little Jack."
    wait
    dialog "[Fry]"
    dialog "He's not Jack!"
    setitem halloebs01 4
    completequest 11500
    setquest 11501
    close
    return
endif

if (v[halloebs01] == 4)
	if (q11501] > 1)
		if ((v[Pumpkin_Decor] > 9) & (v[White_Thin_Stem] > 19))
			dialog "[Bean]"
			dialog "Hooray! Jack!"
			wait
			dialog "[Horro]"
			dialog "Let's all decorate Jack!"
			Talk2me "Horro#2021hw" "Horro: Let's all decorate Jack!"
			wait
			dialog "[Fry]"
			dialog "Paint Jack?"
			Talk2me "Fry#2021hw" "Fry: Paint Jack?"
			wait
			dialog "[Bean]"
			dialog "I am the first!"
			Talk2me "Bean#2021hw" "Bean: I am the first!"
			wait
			dialog "[Fry]"
			dialog "This is a holiday!"
			Talk2me "Fry#2021hw" "Fry: This is a holiday!"
			wait
			dialog "[Horro]"
			dialog "This is creepy!"
			wait
			dialog "[Bean]"
			dialog "This is scary!"
			wait
			dialog "[Horro]"
			dialog "Am I scary?"
			wait
			dialog "[Fry]"
			dialog "Let's decorate now!"
			close
			return
		else
            dialog "[Horro]"
			dialog "Jack! Bring me Jack!"
            wait
            dialog "[Fry]"
            dialog "If you wait too long, Jack may... sprout."
            wait
            dialog "[Bean]"
			dialog "This is awful!"
            wait
            dialog "[Horro]"
            dialog "Green sprouts!"
            wait
            dialog "[Fry]"
            dialog "But fresh."
            wait
            dialog "[Horro]"
            dialog "Bring us 10 ^ff0000Jack'o'Lanterns^000000!"
            wait
            dialog "[Bean]"
            dialog "We also need 20 ^ff0000White Thin Stems^000000. They will serve Jack... as limbs! Aha ha ha ha!"
            close
            return
		endif
	else
		dialog "[Horro]"
		dialog "Jack! Bring me Jack!"
		wait
		dialog "[Fry]"
		dialog "If you wait too long, Jack may... sprout."
		wait
		dialog "[Bean]"
		dialog "This is awful!"
		wait
		dialog "[Horro]"
		dialog "Green sprouts!"
		wait
		dialog "[Fry]"
		dialog "But fresh."
		wait
		dialog "[Horro]"
		dialog "Bring us 10 ^ff0000Jack'o'Lanterns^000000!"
		wait
		dialog "[Bean]"
		dialog "We also need 20 ^ff0000White Thin Stems^000000. They will serve Jack...as limbs! Aha ha ha ha!"
        close
        return
	endif
else
	dialog "[Fry]"
    dialog "All this terribly scary holiday thanks to Jack!"
    wait
    dialog "[Bean]"
    dialog "This is a festival!"
    wait
    dialog "[Horro]"
    dialog "Yeah... Full Jack!"
    close
    return
endif
return


npc "niflheim" "Bean#2021hw" 4_LUDE 179 240 3 0 0
OnClick:
var q11498 = isbegin_quest 11498
var q11501 = checkquest_hunting 11501
if (v[VAR_CLEVEL] < 20)
	dialog "[Bean]"
    dialog "Where are you?"
    close
    return
endif

if (v[halloebs01] < 2)
    dialog "[Horro]"
	dialog "Jack!"
	Talk2me "Horro#2021hw" "Horro: Jack!"
	wait
	dialog "[Horro]"
	dialog "Jack, wake up!"
	Talk2me "Horro#2021hw" "Horro: Jack, wake up!"
	wait
	dialog "[Fry]"
	dialog "The festival is here, Jack!"
	wait
	dialog "[Bean]"
	dialog "It's already dark!"
	wait
	dialog "[Fry]"
	dialog "Wake up Jack! The festival is starting soon!"
	wait
	dialog "[Horro]"
	dialog "But... does it matter?"
	wait
	dialog "[Bean]"
	dialog "Jack hasn't returned yet."
	wait
	dialog "[Fry]"
	dialog "Right."
	wait
	dialog "[Horro]"
	dialog "Jack is back, but Jack is not!"
	wait
	dialog "[Bean]"
	dialog "And Jack too!"
	wait
	dialog "[Fry]"
	dialog "What about Jack?"
	wait
	dialog "[Bean]"
	dialog "Jack in the square!"
	wait
	dialog "[Horro]"
	dialog "So what about Jack?"
	wait
	dialog "[Bean]"
	dialog "Where did Jack go?"
	wait
	dialog "[Fry]"
	dialog "Ask ^ff0000Jack^000000!"
	wait
	dialog "[Horro]"
	dialog "Let's ask!"
	wait
	dialog "[Fry]"
	dialog "Jack knows for sure!"
	wait
	dialog "[Horro]"
	dialog "I know!"
	setitem halloebs01 2
	if (q11498 > 0)
	completequest 11498
	endif
	setquest 11499
	close
	return
endif

if (v[halloebs01] == 2)
    dialog "[Bean]"
    dialog "Jack in the square!"
    wait
	dialog "[Horro]"
    dialog "So what about Jack?"
    wait
    dialog "[Bean]"
    dialog "Where did Jack go?"
    wait
    dialog "[Fry]"
    dialog "Ask Jack in the square!"
    wait
    dialog "[Horro]"
    dialog "Let's ask!"
    wait
    dialog "[Bean]"
    dialog "Why do we need?"
    wait
    dialog "[Fry]"
    dialog "You go!"
    wait
    dialog "[Horro]"
    dialog "I know!"
    close
    return
endif

if (v[halloebs01] == 3)
    dialog "[Bean]"
    dialog "Fry wants to hear Jack!"
    wait
    dialog "[Horro]"
    dialog "Jack!"
    wait
    dialog "[Fry]"
    dialog "I want to hear it!"
    wait
    dialog "[Bean]"
    dialog "Jack is not."
    close
    return
endif

if (v[halloebs01] == 4)
	if (q11501] > 1)
		if ((v[Pumpkin_Decor] > 9) & (v[White_Thin_Stem] > 19))
            dialog "[Bean]"
            dialog "Hooray! Jack!"
            wait
            dialog "[Horro]"
            dialog "Let's all decorate Jack!"
            Talk2me "Horro#2021hw" "Horro: Let's all decorate Jack!"
            wait
            dialog "[Fry]"
            dialog "Paint Jack?"
            Talk2me "Fry#2021hw" "Fry: Paint Jack?"
            wait
            dialog "[Bean]"
            dialog "I am the first!"
            Talk2me "Bean#2021hw" "Bean: I am the first!"
            wait
            dialog "[Fry]"
            dialog "This is a holiday!"
            Talk2me "Fry#2021hw" "Fry: This is a holiday!"
            close
            return
		else
            dialog "[Horro]"
			dialog "Jack! Bring me Jack!"
            wait
            dialog "[Fry]"
            dialog "If you wait too long, Jack may... sprout."
            wait
            dialog "[Bean]"
			dialog "This is awful!"
            wait
            dialog "[Horro]"
            dialog "Green sprouts!"
            wait
            dialog "[Fry]"
            dialog "But fresh."
            wait
            dialog "[Horro]"
            dialog "Bring us 10 ^ff0000Jack'o'Lanterns^000000!"
            wait
            dialog "[Bean]"
            dialog "We also need 20 ^ff0000White Thin Stems^000000. They will serve Jack... as limbs! Aha ha ha ha!"
            close
            return
		endif
	else
		dialog "[Horro]"
		dialog "Jack! Bring me Jack!"
		wait
		dialog "[Fry]"
		dialog "If you wait too long, Jack may... sprout."
		wait
		dialog "[Bean]"
		dialog "This is awful!"
		wait
		dialog "[Horro]"
		dialog "Green sprouts!"
		wait
		dialog "[Fry]"
		dialog "But fresh."
		wait
		dialog "[Horro]"
		dialog "Bring us 10 ^ff0000Jack'o'Lanterns^000000!"
		wait
		dialog "[Bean]"
		dialog "We also need 20 ^ff0000White Thin Stems^000000. They will serve Jack...as limbs! Aha ha ha ha!"
		close
		return
	endif
else
    dialog "[Bean]"
    dialog "This is horror"
    wait
    dialog "[Horro]"
    dialog "Full Jack!"
    close
    return
endif
return


npc "niflheim" "Jack#2021hw_j1" 4_JACK_HEAD 184 199 3 0 0
OnClick:
dialog "[Jack]"
dialog "I don't know where Jack is... I don't know!"
close
return


npc "niflheim" "Jack#2021hw_j2" 4_JACK_HEAD 187 190 5 0 0
OnClick:
var q11446 = isbegin_quest 11446
var q11447 = isbegin_quest 11447
var q11448 = isbegin_quest 11448
var q11449 = isbegin_quest 11449
var q11450 = isbegin_quest 11450
var q11451 = isbegin_quest 11451
var q11484 = isbegin_quest 11484
var q11485 = isbegin_quest 11485
var q11486 = isbegin_quest 11486
var q11487 = isbegin_quest 11487
var q11488 = isbegin_quest 11488
var q11489 = isbegin_quest 11489
var q11490 = isbegin_quest 11490
var q11491 = isbegin_quest 11491
var q11492 = isbegin_quest 11492
var q11493 = isbegin_quest 11493
var q11494 = isbegin_quest 11494
	if (q11446 > 0)
    erasequest 11446
    endif
    if (q11447 > 0)
    erasequest 11447
    endif
    if (q11448 > 0)
    erasequest 11448
    endif
    if (q11449 > 0)
    erasequest 11449
    endif
    if (q11450 > 0)
    erasequest 11450
    endif
    if (q11451 > 0)
    erasequest 11451
    endif
    if (q11484 > 0)
    erasequest 11484
    endif
    if (q11485 > 0)
    erasequest 11485
    endif
    if (q11486 > 0)
    erasequest 11486
    endif
    if (q11487 > 0)
    erasequest 11487
    endif
    if (q11488 > 0)
    erasequest 11488
    endif
    if (q11489 > 0)
    erasequest 11489
    endif
    if (q11490 > 0)
    erasequest 11490
    endif
    if (q11491 > 0)
    erasequest 11491
    endif
    if (q11492 > 0)
    erasequest 11492
    endif
    if (q11493 > 0)
    erasequest 11493
    endif
    if (q11494 > 0)
    erasequest 11494
    endif

if (v[halloebs01] == 2)
    dialog "[Jack]"
	dialog "Why? Why is everyone trying to find me?"
    wait
    dialog "[Jack]"
	dialog "Even you are trying! All around!"
    wait
    dialog "[Jack]"
    dialog "It seems that I will have to return..."
    setitem halloebs01 3
    completequest 11499
    setquest 11500
    close
    return
else
	dialog "[Jack]"
    dialog "It seems that I will have to return..."
    close
    return
endif
return


npc "niflheim" "Jack#2021hw_j3" 4_JACK_HEAD 196 183 3 0 0
OnClick:
dialog "[Jack]"
dialog "He-he-he-he! Time to sleep..."
wait
dialog "[Jack]"
dialog "Jack is waiting for you... I need to fix my hair..."
close
return


npc "niflheim" "Jack#2021hw_j4" 4_JACK_HEAD 203 181 5 0 0
OnClick:
dialog "[Jack]"
dialog "Look over there, see the ghost? He is handsome, right?.."
wait
dialog "[Jack]"
dialog "How is he not beautiful? Don't you understand... Jack?"
close
return


npc "niflheim" "Jack#2021hw_j5" 4_JACK_HEAD 202 194 7 0 0
OnClick:
dialog "[Jack]"
dialog "Can you help him?"
wait
dialog "[Jack]"
dialog "It seems that Jack has been kept in the water for too long and roots have sprouted!"
close
return


npc "niflheim" "Jack#2021hw_j6" 4_JACK_HEAD 184 202 183 3 0 0
OnClick:
Talk2me "Jack#2021hw_j6" "Jack: Oh hello!"
Talk2me "Jack#2021hw_j1" "Jack: Hi!"
Talk2me "Jack#2021hw_j3" "Jack: Hey!"
Talk2me "Jack#2021hw_j8" "Jack: Who's there?"
Talk2me "Jack#2021hw_j12" "Jack: Hi!"
return


npc "niflheim" "Jack#2021hw_j7" 4_JACK_HEAD 185 198 5 0 0
OnClick:
Talk2me "Jack#2021hw_j7" "Jack: Fear and horror!"
Talk2me "Jack#2021hw_j2" "Jack: Fun and joy!"
Talk2me "Jack#2021hw_j6" "Jack: Sweets and nasty things!"
Talk2me "Jack#2021hw_j9" "Jack: Empty heads!"
Talk2me "Jack#2021hw_j11" "Jack: What?"
return


npc "niflheim" "Jack#2021hw_j8" 4_JACK_HEAD 197 193 3 0 0
OnClick:
Talk2me "Jack#2021hw_j8" "Jack: Got candy?"
Talk2me "Jack#2021hw_j4" "Jack: I'll find it!"
Talk2me "Jack#2021hw_j7" "Jack: Mmm... cookies..."
Talk2me "Jack#2021hw_j5" "Jack: Where?"
Talk2me "Jack#2021hw_j10" "Jack: Jack!"
return


npc "niflheim" "Jack#2021hw_j9" 4_JACK_HEAD 194 193 5 0 0
OnClick:
Talk2me "Jack#2021hw_j9" "Jack: Hey!"
Talk2me "Jack#2021hw_j5" "Jack: Hi!"
Talk2me "Jack#2021hw_j2" "Jack: Hola!"
Talk2me "Jack#2021hw_j13" "Jack: Aloha!"
Talk2me "Jack#2021hw_j4" "Jack: Gamarjoba!"
return


npc "niflheim" "Jack#2021hw_j10" 4_JACK_HEAD 208 197 7 0 0
OnClick:
Talk2me "Jack#2021hw_j10" "Jack: Festival of Fear!"
Talk2me "Jack#2021hw_j3" "Jack: How scary!"
Talk2me "Jack#2021hw_j9" "Jack: Don't I?"
Talk2me "Jack#2021hw_j1" "Jack: Oo-oo-oo-oo-oo-oo-oo!"
Talk2me "Jack#2021hw_j6" "Jack: I'm not afraid of you!"
return


npc "niflheim" "Jack#2021hw_j11" 4_JACK_HEAD 189 178 3 0 0
OnClick:
Talk2me "Jack#2021hw_j11" "Jack: Sit down with us!"
Talk2me "Jack#2021hw_j7" "Jack: We're not scary, are we?!"
Talk2me "Jack#2021hw_j5" "Jack: We have sweets!"
Talk2me "Jack#2021hw_j3" "Jack: Come on!"
Talk2me "Jack#2021hw_j8" "Jack: Come on!"
return


npc "niflheim" "Jack#2021hw_j12" 4_JACK_HEAD 203 191 1 0 0
OnClick:
Talk2me "Jack#2021hw_j12" "Jack: Dance if you can!"
Talk2me "Jack#2021hw_j1" "Jack: Don't leave!"
Talk2me "Jack#2021hw_j4" "Jack: Sing and dance!"
Talk2me "Jack#2021hw_j11" "Jack: Yes, that's it!"
Talk2me "Jack#2021hw_j10" "Jack: Not bad!"
return


npc "niflheim" "Jack#2021hw_j13" 4_JACK_HEAD 183 184 1 0 0
OnClick:
Talk2me "Jack#2021hw_j1" "Jack: Hi!"
Talk2me "Jack#2021hw_j2" "Jack: Hi!"
Talk2me "Jack#2021hw_j3" "Jack: Hi!"
Talk2me "Jack#2021hw_j4" "Jack: Hi!"
Talk2me "Jack#2021hw_j5" "Jack: Hi!"
Talk2me "Jack#2021hw_j6" "Jack: Hi!"
Talk2me "Jack#2021hw_j7" "Jack: Hi!"
Talk2me "Jack#2021hw_j8" "Jack: Hi!"
Talk2me "Jack#2021hw_j9" "Jack: Hi!"
Talk2me "Jack#2021hw_j10" "Jack: Hi!"
Talk2me "Jack#2021hw_j11" "Jack: Hi!"
Talk2me "Jack#2021hw_j12" "Jack: Hi!"
return

npc "niflheim" "Jack#2021hw" 4_JACK_HEAD 172 244 3 0 0
OnInit:
    AddQuestInfo 11504 1 0
    SetQuestItem 11504 3918 4 "<"
return

OnClick:
if (v[halloebs01] < 5)
	dialog "[Jack]"
	dialog "Heh heh... Heh heh heh..."
    close
    return	
endif

if (v[halloebs02] < 1)
	dialog "[Jack]"
	dialog "Heh heh... Heh heh heh..."
    wait
 choose menu "Why are you smiling?"
    case 1
    break
    endchoose
    dialog "[Jack]"
	dialog "I am not smiling! I'm crying!"
    wait
	choose menu "Listen further"
    case 1
    break
    endchoose
    dialog "[Jack]"
    dialog "I am not crying, I am crying!"
    wait
 choose menu "Listen further"
    case 1
    break
    endchoose
    dialog "[Jack]"
	dialog "Aaaaaaaa! What are you getting me for?"
    wait
    dialog "[Jack]"
	dialog "Come on, come on go somewhere! Or not! Stop!"
    wait
    dialog "[Jack]"
	dialog "AAAAAAA! My hand! Where is it?!"
    wait
 choose menu "Ask about it" "Leave "
    case 1
    	dialog "[Jack]"
		dialog "Like what? Find a hand!"
        wait
        dialog "[Jack]"
		dialog "This is the end! I'm dying... Ahhh..."
        wait
        dialog "[Jack]"
        dialog "Bring my hand... I need a hand..."
        wait
        dialog "[Jack]"
		dialog "Actually ^ff0000White Thin Stem^000000 will be better."
        setitem halloebs02 1
        setquest 11504
        close
        return
    break
    case 2
    	dialog "[Jack]"
		dialog "Have you seen my hand?!"
    	close
    	return
    break
    endchoose
endif


if (v[halloebs02] == 1)
	if (v[White_Thin_Stem] > 0)
		dialog "[Jack]"
		dialog "Blimey! Give it to me!"
        wait
  choose menu "Give a stem..."
        case 1
        break
        endchoose
        dialog "[Heron]"
        dialog "No!"
        wait
        dialog "[Sleepwalker]"
        dialog "No!"
        wait
        dialog "[Heron]"
        dialog "Let's run!"
        wait
        dialog "[Heron]"
        dialog "Don't give him a stem!"
        wait
        dialog "[Sleepwalker]"
        dialog "Let's go!"
        wait
        dialog "[Heron]"
		dialog "Rather, we run from here!"
        wait
        dialog "[Jack]"
		dialog "Do not listen to them!"
        wait
        dialog "[Sleepwalker]"
		dialog "Don't give it back! No!"
        wait
        dialog "[Heron]"
        dialog "You don't know what will happen!"
        wait
        dialog "[Jack]"
        dialog "Give it to me!"
        wait
        dialog "[Sleepwalker]"
        dialog "Better not!"
        wait
        dialog "[Heron]"
        dialog "Jack..."
        wait
        dialog "[Heron]"
        dialog "You can't run away with one!"
        wait
        dialog "[Sleepwalker]"
        dialog "Jack is not necessary!"
        wait
        dialog "[Heron]"
		dialog "He has only one!"
        wait
  choose menu "Give a stem"
        case 1
        break
        endchoose
        if (v[White_Thin_Stem] > 0)
        	dialog "[Jack]"
			dialog "Phew! I think I'll live a little... Don't listen to them! Because this is the village of the dead! But thanks! Thanks to you, I can even walk!"
            dropitem White_Thin_Stem 1
            setitem halloebs02 2
            completequest 11504
            setquest 11505
            wait
            dialog "[Jack]"
			dialog "Thanks! But that's not all! Because of Jacks, my cat ran away!"
            wait
            dialog "[Jack]"
            dialog "I think I was so amazed that it slipped out of my hands!"
            wait
            dialog "[Jack]"
			dialog "I need to find my cat! If you don't hurry, he will be lost!"
            wait
   choose menu "I will find a cat" "Wait, cat?"
            case 1
            	dialog "[Jack]"
				dialog "Thank you! I think ^ff0000Sleepwalker^000000 might know where my Scarie went. He forgets nothing."
                close
                return
            break
            case 2
            	dialog "[Jack]"
            	dialog "Cat! My Scarie!"
                wait
                dialog "[Heron]"
                dialog "Jack is to blame!"
                wait
                dialog "[Sleepwalker]"
                dialog "He scared!"
                wait
		choose menu "I will find a cat"
                case 1
                break
                endchoose
                dialog "[Jack]"
				dialog "Thank you! I think ^ff0000Sleepwalker^000000 might know where my Scarie went. He forgets nothing."
                close
                return
            break
            endchoose
        else
        	dialog "[Jack]"
        	dialog "Where is the stem?"
        	wait
            dialog "[Heron]"
            dialog "Wait!"
            wait
            dialog "[Heron]"
            dialog "Do not!"
            wait
            dialog "[Jack]"
            dialog "Just one ^ff0000White Thin Stem^000000."
        	close
        	return
        endif
	else
		dialog "[Jack]"
        dialog "Oh... Please save me... Just one ^ff0000White Thin Stem^000000."
        close
        return
	endif
endif

if (v[halloebs02] == 2)
	dialog "[Jack]"
	dialog "Thank you! ^ff0000Sleepwalker^000000 may know where Scarie has gone."
    close
    return
endif

if (v[halloebs02] == 3)
	dialog "[Jack]"
	dialog "Then ^ff0000Lamia^000000 might know. She's at the western entrance to Niflheim!"
	close
	return
endif

if (v[halloebs02] == 4)
	dialog "[Jack]"
	dialog "Have you heard of Lamia? What did Lamia say?"
	close
	return
endif

if (v[halloebs02] == 5)
	dialog "[Jack]"
	dialog "What?! Scarie alone in such a dangerous place! Hurry up and find him!"
    wait
    dialog "[Jack]"
	dialog "He couldn't have gone to that scary forest, could he? Scarie seemed to love the fish he got from the strange village."
    wait
    dialog "[Jack]"
    dialog "When I... went to this world, I walked a long shining path, where a small dark-skinned man appeared on a very high tree nearby."
    wait
    dialog "[Jack]"
    dialog "Eh... If I remembered the path that Scarie walked with me, we would quickly find him."
    setitem halloebs02 6
    completequest 11508
    setquest 11509
    close
    return
endif

if (v[halloebs02] == 6)
	dialog "[Jack]"
    dialog "When I... went to this world, I walked a long shining path, where a small dark-skinned man appeared on a very high tree nearby."
    wait
    dialog "[Jack]"
    dialog "I think if Scarie is waiting for me somewhere, then exactly there!"
    close
    return
endif

if ((v[halloebs02] > 6) & (v[halloebs02] < 11))
	dialog "[Jack]"
	dialog "Jack! You're already here? Did you find Scarie? Oh... Not yet?"
	wait
	dialog "[Jack]"
	dialog "Where is Scarie? I wish I could go back..."
	wait
	dialog "[Jack]"
	dialog "I am very worried about him..."
	close
	return
endif

if (v[halloebs02] == 11)

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "You have too many items. Free some space in your inventory and try again."
        close
        return
    else
    endif

	dialog "[Jack]"
	dialog "Jack! You are back! Did you find my cat?"
    wait
 choose menu "Give away the bones"
    case 1
    break
    endchoose
    dialog "[Jack]"
    dialog "Scarie !!!!!"
    wait
    dialog "[Jack]"
	dialog "How could I let this happen!"
    wait
    dialog "[Jack]"
	dialog "AAAAAAAA! Only bones are left!"
    wait
    dialog "[Jack]"
	dialog "... Thanks, you found Scarie... Thanks, Jack."
    wait
    dialog "[Jack]"
	dialog "It's all my fault that he became like this! I can't take good care of the cat because I got caught..."
    wait
    dialog "[Jack]"
	dialog "So please Jack! I trust you my ^ff0000Scarie^000000, take care of him."
    wait
    dialog "[Jack]"
    dialog "Keep him safe!"
    if (v[Little_Skel_Bone] > 0)
    	dropitem Little_Skel_Bone 1
    endif
    setitem halloebs02 12
    getitem Red_Chorker_Bell 1
    completequest 11514
    GetPetEgg SCATLETON
    close
    return
endif

if (v[halloebs02] == 12)
	dialog "[Jack]"
    dialog "Wait... if you found Scarie's bones, then he also appeared here, in the city of the dead!"
    wait
    dialog "[Jack]"
	dialog "As I had not guessed before!"
    wait
    dialog "[Jack]"
	dialog "But how could I not find him?.."
    wait
    dialog "[Jack]"
	dialog "I was left without arms and legs!"
    wait
    dialog "[Jack]"
	dialog "We'll find Scarie!"
    wait
    dialog "[Jack]"
	dialog "We need to move urgently!.. You, of course."
    wait
    dialog "[Jack]"
	dialog "Will you help me find him?"
    wait
    dialog "[Jack]"
	dialog "By signs, this is an ordinary yard cat... Only... Without hair... Without skin... Only bones. Eh, Scarie..."
	Talk2me "Jack#2021hw" "Jack: Eh, Scarie..."
    setitem halloebs02 13
    setquest 11515
    close
    return
endif

if (v[halloebs02] == 13)
    dialog "[Jack]"
	dialog "We'll find Scarie!"
    wait
    dialog "[Jack]"
	dialog "We need to move urgently!.. You, of course."
    wait
    dialog "[Jack]"
	dialog "Will you help me find him?"
    wait
    dialog "[Jack]"
	dialog "According to signs, this is an ordinary yard cat... Only... Without hair... Without skin..."
    close
    return
endif

if (v[halloebs02] == 14)
	dialog "[Jack]"
	dialog "So you found it!"
    wait
    dialog "[Jack]"
    dialog "What is he like now?"
    wait
    dialog "[Jack]"
    dialog "Does he remember me?"
    wait
    dialog "[Heron]"
    dialog "Of course he does."
    wait
    dialog "[Sleepwalker]"
    dialog "I remember Scarie."
    wait
    dialog "[Heron]"
    dialog "Jack, are you crying?"
    wait
    dialog "[Sleepwalker]"
    dialog "Jack is crybaby!"
    wait
    dialog "[Heron]"
	dialog "Is this really Jack's cat?"
    wait
    dialog "[Heron]"
	dialog "Actually, I saw something nearby, I think you should take a look at it."
    setitem halloebs02 15
    completequest 11516
    setquest 11517
    close
    return
endif

if (v[halloebs02] == 15) | (v[halloebs02] == 16)
	dialog "[Jack]"
    dialog "What is he like now?"
    wait
    dialog "[Jack]"
    dialog "Does he remember me?"
    wait
    dialog "[Heron]"
    dialog "Of course he does."
    wait
    dialog "[Sleepwalker]"
    dialog "I remember Scarie."
    wait
    dialog "[Heron]"
    dialog "Jack, are you crying?"
    wait
    dialog "[Sleepwalker]"
    dialog "Jack is crybaby!"
    wait
    dialog "[Heron]"
	dialog "Is this really Jack's cat?"
    wait
    dialog "[Heron]"
	dialog "Actually I saw something, I think you should take a look at it."
    close
    return
endif

if (v[halloebs02] == 17)
	var name = PcName
	dialog "[Jack]"
	dialog "This is my Scarie! This is definitely him... How I missed him!"
    wait
    dialog "[Jack]"
	dialog "Does he remember me?"
    wait
    dialog "[Jack]"
	dialog "I can't believe we can find adventure together again in this world!"
	wait
    dialog "[Jack]"
	dialog "It's a pity that he could not stay alive for a long time..."
	wait
    dialog "["+PcName+"]"
	dialog "Indeed, it's a pity..."
    setitem halloebs02 18
    completequest 11519
    setquest 11520
    close
    return
endif

if (v[halloebs02] == 18)
	dialog "[Jack]"
	dialog "How I missed Scarie!"
    wait
    dialog "[Jack]"
	dialog "I can't believe we can find adventure together again in this world!"
    close
    return
endif

if (v[halloebs02] == 19)
	dialog "[Jack]"
	dialog "It's good that you came again."
    wait
    dialog "[Jack]"
	dialog "I think since this is the case, Scary needs a little fun... Hmm..."
    wait
    dialog "[Jack]"
	dialog "Can you help me please the kid a little?"
    wait
    dialog "[Jack]"
    dialog "Need to bring 10 ^ff0000White Thin Stems^000000, directly to Scarie. He has always loved arranging his place, so I hope he will be happy."
    setitem halloebs02 20
    completequest 11521
    setquest 11522
    close
    return
endif

if (v[halloebs02] == 20)
	dialog "[Jack]"
	dialog "Can you help me please the kid a little?"
    wait
    dialog "[Jack]"
    dialog "Need to bring 10 ^ff0000White Thin Stems^000000, directly to Scarie. He has always loved arranging his place, so I hope he will be happy."
    close
    return
endif

if ((v[halloebs02] == 21) | (v[halloebs02] == 22) | (v[halloebs02] == 23))
	dialog "[Jack]"
	dialog "Hehe... I never thought I'd ever talk to Scarie again."
	close
	return
endif

if (v[halloebs02] == 24)

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "You have too many items. Free some space in your inventory and try again."
        close
        return
    else
    endif

	dialog "[Jack]"
	dialog "How is my cat?"
    wait
    dialog "[Jack]"
    dialog "Are you going to leave? Why"
    wait
    dialog "[Jack]"
	dialog "Jack! Jack! Tell me why!"
    wait
    dialog "[Jack]"
	dialog "Why do you want to leave both me and Scarie alone?"
    wait
    dialog "[Jack]"
    dialog "You can tell me everything!"
    wait
	choose menu "I can't tell you..."
	endchoose
    dialog "[Jack]"
	dialog "What? Don't you want to help me? Well..."
    wait
    dialog "[Jack]"
    dialog "I suspected from the very beginning..."
    wait
    dialog "[Jack]"
	dialog "Do you know what? Take me! I can't move too much, so I won't cause trouble..."
    setitem halloebs02 25
    getitem C_Jjakk 1
    completequest 11526
    close
    return
else

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "You have too many items. Free some space in your inventory and try again."
        close
        return
    else
    endif

var q11527 = checkquest_playtime 11527
	if (q11527 == 1)
	    dialog "[Jack]"
		dialog "A? Who are you? You are like the spitting image of me!"
	    close
	    return
	else
	    if ((q11527 == 2) | (q11527 == 3))
	        if (q11527 == 3)
	            recall_completequest 11527
	        endif
	        erasequest 11527
	    endif
	    dialog "[Jack]"
		dialog "Oh, hi... Do you think Scarie is bored right now?"
        wait
		dialog "[Jack]"
		dialog "I remember how I made wool toys for him myself. Scarie could play with them for hours!"
        wait
		dialog "[Jack]"
		dialog "You know what? You can still make him a couple of toys."
        wait
        dialog "[Jack]"
		dialog "Bring me 10 ^ff0000Black Fur^000000. And I... I will give everything that I happened to find in the city of the dead!"
        setquest 11528
        wait
		choose menu "Agree" "Leave "
	    case 1
	        if (v[Black_Fur] > 9)
	        	var haha2017 = rand 1 100
				if ((haha2017 > 0) & (haha2017 < 6))
                    dialog "[Jack]"
					dialog "I'll make him a bird this time! It is unlikely that she will fly, of course... Although in this city I will not be surprised at anything!"
					dropitem Black_Fur 10
                    getitem Yummy_Meat 10
                    getitem Cookies_Bat 10
                    getitem Memory_Of_Gyol 1
                    erasequest 11528
                    setquest 11527
                    wait
                    dialog "[Jack]"
					dialog "This toy will definitely be enough for the day, thanks."
                    close
                    return
                elseif ((haha2017 > 5) & (haha2017 < 11))
                    dialog "[Jack]"
					dialog "I'll make him a mouse this time! So, here is the tail..."
					dropitem Black_Fur 10
                    getitem Yummy_Meat 10
                    getitem Cookies_Bat 10
                    getitem Dark_Mane 1
                    erasequest 11528
                    setquest 11527
                    wait
                    dialog "[Jack]"
					dialog "This toy will definitely be enough for the day, thanks."
                    close
                    return
                elseif ((haha2017 > 10) & (haha2017 < 21))
                    dialog "[Jack]"
					dialog "I'll make him a snake this time! Oh... How many snakes in our house were behind the boxes and under the table..."
					dropitem Black_Fur 10
                    getitem Yummy_Meat 10
                    getitem Cookies_Bat 10
                    getitem C_Jjakk 1
                    erasequest 11528
                    setquest 11527
                    wait
                    dialog "[Jack]"
					dialog "This toy will definitely be enough for the day, thanks."
                    close
                    return
                else
                	dialog "[Jack]"
					dialog "I'll make him a bird this time! It is unlikely that she will fly, of course... Although in this city I will not be surprised at anything!"
                    dropitem Black_Fur 10
                    getitem Yummy_Meat 10
                    getitem Cookies_Bat 10
                    erasequest 11528
                    setquest 11527
                    wait
                    dialog "[Jack]"
					dialog "This toy will definitely be enough for the day, thanks."
                    close
                    return
                endif
	        else
	            dialog "[Jack]"
				dialog "Thank you Jack... Here is a list of monsters whose fur is suitable for making a toy."
                close
                return
	        endif
	    break
	    case 2
	    	dialog "[Jack]"
        	dialog "If you still want to help me please Scarie, come again!"
        	close
	        return
	    break
	    endchoose
	endif
endif



npc "niflheim" "Jack#2021hw" 4_LUDE 167 242 3 0 0
OnClick:
if (v[halloebs02] < 2)
	dialog "[Jack]"
	dialog "The city that whispers..."
	close
	return
endif


npc "niflheim" "Heron#2021hw" 4_LUDE 166 241 3 0 0
OnClick:
if (v[halloebs02] < 2)
	dialog "[Heron]"
	dialog "Should I turn around? Suddenly there... Your shadow..."
	close
	return
endif


npc "niflheim" "Sleepwalker#2021hw" 4_LUDE 169 240 5 0 0
OnClick:
if (v[halloebs02] < 2)
	dialog "[Sleepwalker]"
	dialog "Jack! It's Jack! Ah... I think it's just Jack..."
	close
	return
endif

if (v[halloebs02] == 2)
	dialog "[Sleepwalker]"
	dialog "Jack, is that you?"
    wait
    dialog "[Heron]"
    dialog "Jack!"
    wait
    dialog "[Heron]"
    dialog "What are you doing here?"
    wait
    dialog "[Heron]"
    dialog "It looks nothing."
    wait
    dialog "[Sleepwalker]"
    dialog "Although I would add whiteness."
    wait
    dialog "[Heron]"
    dialog "Have you seen! Over there!"
    wait
    dialog "[Sleepwalker]"
    dialog "There was someone in the air!"
    wait
    dialog "[Heron]"
	dialog "I think I saw a cat!"
    wait
    dialog "[Sleepwalker]"
	dialog "And a red leash!"
    wait
    dialog "[Heron]"
    dialog "A cat with a leash? So it's a dog!"
    wait
    dialog "[Sleepwalker]"
    dialog "No, it's a cat. And this is not a leash, but a collar!"
    wait
    dialog "[Sleepwalker]"
    dialog "Look, he flew to ^ff0000Lamia at the entrance to Niflheim^000000!"
    wait
    dialog "[Heron]"
    dialog "Did Lamia see this?"
    wait
    dialog "[Heron]"
    dialog "What happened there?"
    wait
    dialog "[Sleepwalker]"
    dialog "I have to ask Lamia!"
    wait
    dialog "[Heron]"
    dialog "Let's ask!"
    wait
    dialog "[Heron]"
    dialog "Lamia knows!"
    setitem halloebs02 3
    completequest 11505
    setquest 11506
    close
    return
endif

if (v[halloebs02] == 3)
	dialog "[Sleepwalker]"
	dialog "Jack, is that you?"
    wait
    dialog "[Heron]"
    dialog "Jack!"
    wait
    dialog "[Heron]"
    dialog "What are you doing here?"
    wait
    dialog "[Heron]"
    dialog "It looks nothing."
    wait
    dialog "[Sleepwalker]"
    dialog "Although I would add whiteness."
    close
    return
else
	dialog "[Sleepwalker]"
	dialog "Jack, is that you?"
    wait
    dialog "[Heron]"
    dialog "Jack!"
    wait
    dialog "[Heron]"
    dialog "What are you doing here?"
    wait
    dialog "[Heron]"
    dialog "It looks nothing."
    wait
    dialog "[Sleepwalker]"
    dialog "Although I would add whiteness."
    close
    return
endif
return


npc "niflheim" "Lamia#2021hw" 4_F_NFDEADMGCIAN 43 147 3 0 0
OnClick:
if (v[halloebs02] < 3)
	dialog "[Lamia]"
	dialog "In Rune-Midgard, everyone has one flaw... It's blood and flesh."
	close
	return
endif

if (v[halloebs02] == 3)
	dialog "[Lamia]"
	dialog "What was it? Although I have already seen enough in this city, but what is it..."
    wait
    dialog "[Lamia]"
    dialog "I think I saw a cat! I don't know if she was or not, but she was white, small and very shy!"
    wait
    dialog "[Lamia]"
	dialog "She flew by with incredible speed!"
    wait
    dialog "[Lamia]"
    dialog "But I only saw the last few seconds when something flashed in front of me. Better ask the Researcher on the other side of the hill."
    wait
    dialog "[Lamia]"
	dialog "Hope it's still there. In any case, I cannot go there... After all, the inhabitants of this land still cannot leave it..."
	wait
    dialog "[Lamia]"
	dialog "But before that, you can ask around the local Jacks, they can also sometimes be useful."
    setitem halloebs02 4
    completequest 11506
    setquest 11507
    close
    return
endif

if (v[halloebs02] == 4)
    dialog "[Lamia]"
    dialog "But I only saw the last few seconds when something flashed in front of me. Better ask the Researcher on the other side of the hill."
    wait
    dialog "[Lamia]"
	dialog "Hope it's still there. In any case, I cannot go there... After all, the inhabitants of this land still cannot leave it..."
    close
    return
else
	dialog "[Lamia]"
	dialog "In Midgard, everyone has one flaw... It's blood and flesh."
	close
	return
endif
return

npc "nif_fild02" "Screaming Jack#2021hw_ex" 4_JACK 366 247 5 0 0
OnClick:
if (v[halloebs02] < 4)
	dialog "[Screaming Jack]"
	dialog "Aaaaaaaaaaaaa! Have you seen? Sleepwalker goes there!"
	Talk2me "Screaming Jack#2021hw_ex" "Screaming Jack: Aaaaaaaaaaaaa! Have you seen? The Sleepwalker walks there!"
	close
	return
endif

if (v[halloebs02] == 4)
	dialog "[Screaming Jack]"
	dialog "Aaaaaaaaaaaa! Have you seen? Recently, something flew there!"
    wait
    dialog "[Screaming Jack]"
	dialog "I'm too scared to go and see! I must tell Jack about this! Jack!"
    wait
    dialog "[Screaming Jack]"
    dialog "Do not look at me so! I don't have to tell you anything! If you want to know something else - ask ^ff0000Sleepwalker^000000..."
    setitem halloebs02 5
    completequest 11507
    setquest 11508
    close
    return
endif

if (v[halloebs02] == 5)
    dialog "[Screaming Jack]"
	dialog "I'm too scared to go and see! I must tell Jack about this! Jack!"
    wait
    dialog "[Screaming Jack]"
    dialog "Do not look at me so! I don't have to tell you anything! If you want to know something else - ask ^ff0000Sleepwalker^000000..."
    close
    return
else
	dialog "[Screaming Jack]"
	dialog "Aaaaaaaaaaaaa! Have you seen? Sleepwalker goes there!"
	Talk2me "Screaming Jack#2021hw_ex" "Screaming Jack: Aaaaaaaaaaaaa! Have you seen? The Sleepwalker walks there!"
	close
	return
endif
return



npc "umbala" "Researcher#2021hw" 4_LGTSCIENCE 113 287 7 0 0
OnClick:
if (v[halloebs02] < 6)
	dialog "[Researcher]"
	dialog "He-he-he-he-he-he, no one knows what awaits them!"
    wait
    dialog "[Researcher]"
    dialog "AAA! Don't sneak up like that! After all, I almost had a heart attack..."
    close
    return
endif

if (v[halloebs02] == 6)
	dialog "[Researcher]"
	dialog "He-he-he-he-he-he, no one knows what awaits them!"
    wait
    dialog "[Researcher]"
    dialog "AAA! Don't sneak up like that! After all, I almost had a heart attack..."
    wait
    dialog "[Researcher]"
	dialog "Oh, I'd better go to bed early and rest... I think I'm starting to hallucinate..."
    wait
	choose menu "Asking about hallucinations"
    case 1
    break
    endchoose
    dialog "[Researcher]"
	dialog "What do you care! I just dozed off because these days I was exhausted from my research. It can not be so! No matter!"
    wait
	choose menu "Tell me, please"
    case 1
    break
    endchoose
    dialog "[Researcher]"
	dialog "I was working here a while ago, and suddenly someone from behind asked me in which village you can buy delicious fish."
    wait
    dialog "[Researcher]"
    dialog "I told him that in Morrok, there is one of the best, although I did not try in Malangdo... Then I looked back during the conversation..."
    wait
    dialog "[Researcher]"
    dialog "And the outline of a four-legged creature appeared in front of me right in the air!"
    wait
    dialog "[Researcher]"
	dialog "What was it? It's not a ghost, is it? Did I just dream?"
    setitem halloebs02 7
    completequest 11509
    setquest 11510
    close
    return
endif

if (v[halloebs02] == 7)
    dialog "[Researcher]"
	dialog "I was working here a while ago, and suddenly someone from behind asked me in which village you can buy delicious fish."
    wait
    dialog "[Researcher]"
    dialog "I told him that in Morrok, there is one of the best, although I did not try in Malangdo... Then I looked back during the conversation..."
    wait
    dialog "[Researcher]"
    dialog "And the outline of a four-legged creature appeared in front of me right in the air!"
    wait
    dialog "[Researcher]"
	dialog "What was it? It's not a ghost, is it? Did I just dream?"
    close
    return
else
	dialog "[Researcher]"
	dialog "He-he-he-he-he-he, no one knows what awaits them!"
    wait
    dialog "[Researcher]"
    dialog "AAA! Don't sneak up like that! After all, I almost had a heart attack..."
    close
    return
endif
return


npc "morocc" "Terrified merchant#2021hw" 1_M_SIGNMCNT 154 248 1 0 0
OnClick:
if (v[halloebs02] < 7)
	dialog "[Terrified merchant]"
	dialog "The shop is closed for today... I've had enough."
    close
    return
endif

if (v[halloebs02] == 7)
	dialog "[Terrified merchant]"
	dialog "The shop is closed for today... I've had enough."
    wait
 choose menu "What happened?"
    case 1
    break
    endchoose
    dialog "[Terrified merchant]"
	dialog "Why are you suddenly asking me this? Do you know something?"
    wait
    dialog "[Terrified merchant]"
    dialog "What happened to me recently..."
    wait
 choose menu "Tell me about the ghost"
    case 1
    break
    endchoose
    dialog "[Terrified merchant]"
	dialog "So you saw him too?! It all happened so quickly..."
    wait
    dialog "[Terrified merchant]"
    dialog "While I was cleaning the warehouse, suddenly someone from behind asked me how to get to the village where they sell delicious fish."
    wait
    dialog "[Terrified merchant]"
    dialog "It was right in front of Kafra, and when I told the stranger that Kafra's services could be used, the employee suddenly looked at me strangely."
    wait
    dialog "[Terrified merchant]"
    dialog "She just looked at me and asked what I was talking about."
    wait
    dialog "[Terrified merchant]"
    dialog "And I pointed to that stranger who was standing in the direction of Alberta."
    wait
    dialog "[Terrified merchant]"
	dialog "But Kafra's employee said that... There is no one behind..."
    wait
    dialog "[Terrified merchant]"
	dialog "Haha... Maybe she said that to play a trick on me? Ha ha ha ha... I'm... I'm... Ha ha ha ha ha ha!"
    setitem halloebs02 8
    completequest 11510
    setquest 11511
    close
    return
endif

if (v[halloebs02] == 8)
    dialog "[Terrified merchant]"
	dialog "So you saw him too?! It all happened so quickly..."
    wait
    dialog "[Terrified merchant]"
    dialog "While I was cleaning the warehouse, suddenly someone from behind asked me how to get to the village where they sell delicious fish."
    wait
    dialog "[Terrified merchant]"
    dialog "It was right in front of Kafra, and when I told the stranger that Kafra's services could be used, the employee suddenly looked at me strangely."
    wait
    dialog "[Terrified merchant]"
    dialog "She just looked at me and asked what I was talking about."
    wait
    dialog "[Terrified merchant]"
    dialog "And I pointed to that stranger who was standing in the direction of Alberta."
    wait
    dialog "[Terrified merchant]"
	dialog "But Kafra's employee said that... There is no one behind..."
    wait
    dialog "[Terrified merchant]"
	dialog "Haha... Maybe she said that to play a trick on me? Ha ha ha ha... I'm... I'm... Ha ha ha ha ha ha!"
    close
    return
else
	dialog "[Terrified merchant]"
	dialog "The shop is closed for today... I've had enough."
    close
    return
endif
return


npc "alberta" "Surprised cat#2021hw" 4_CAT_DOWN 45 239 5 0 0
OnClick:
if (v[halloebs02] < 8)
	dialog "[Surprised cat]"
	dialog "It's already autumn... The sea is so cold at this time of the year and there are fewer fish..."
	close
	return
endif

if (v[halloebs02] == 8)
	dialog "[Surprised cat]"
	dialog "Yes? What's the matter?"
    wait
 choose menu "You seem surprised"
    case 1
    break
    endchoose
    dialog "[Surprised cat]"
	dialog "Yes, why? Is it so noticeable?"
    wait
 choose menu "You keep looking around"
    case 1
    break
    endchoose
    dialog "[Surprised cat]"
    dialog "It's just that the days are getting colder and just cold."
    wait
 choose menu "... Have you seen a cat here?"
    case 1
    break
    endchoose
    dialog "[Surprised cat]"
	dialog "A? Cat? Like me?"
    wait
 choose menu "Tell about Scarie"
    case 1
    break
    endchoose
    dialog "[Surprised cat]"
	dialog "Hmm... ^ff0000White^000000 cat who loves ^ff0000tasty fish^000000 and wears a small ^ff0000red collar^000000."
    wait
    dialog "[Surprised cat]"
    dialog "I have not seen this... But if he loved port... I would definitely notice him."
    wait
    dialog "[Surprised cat]"
    dialog "... A lot of guys gather here for fish, so why don't you look for it here?"
	wait
    dialog "[Surprised cat]"
    dialog "If he likes tasty fish, I think he has got to the right place."
    setitem halloebs02 9
    completequest 11511
    setquest 11512
    close
    return
endif

if (v[halloebs02] == 9)
    dialog "[Surprised cat]"
	dialog "Hmm... ^ff0000White^000000 cat who loves ^ff0000tasty fish^000000 and wears a small ^ff0000red collar^000000."
    wait
    dialog "[Surprised cat]"
    dialog "I have not seen this... But if he loved port... I would definitely notice him."
    wait
    dialog "[Surprised cat]"
    dialog "... A lot of guys gather here for fish, so why don't you look for it here?"
	wait
    dialog "[Surprised cat]"
    dialog "If he likes tasty fish, I think he has got to the right place."
    close
    return
else
	dialog "[Surprised cat]"
	dialog "It's already autumn... The sea is so cold at this time of the year and there are fewer fish..."
	close
	return
endif
return


npc "alberta" "White cat#2021hw" 4_CAT 198 50 3 0 0
OnClick:
if (v[halloebs02] < 9)
	dialog "- White cat. And if you look closely, you can see some black spots. -"
	close
	return
endif

if (v[halloebs02] == 9)
	dialog "- White cat. And if you look closely, you can see that through it you can see the earth. -"
	wait
	dialog "- When you get closer, you stop in front of him, and try to speak. -"
	wait
	dialog "- The cat does not hear you, but he seems to be trying to point to a handful of ashes next to him. -"
	setitem halloebs02 10
	completequest 11512
	setquest 11513
	close
	return
endif

if (v[halloebs02] == 10)
	dialog "- White cat. And if you look closely, you can see that through it you can see the earth. -"
	wait
	dialog "- When you get closer, you stop in front of him, and try to speak. -"
	wait
	dialog "- The cat does not hear you, but he seems to be trying to point to a handful of ashes next to him. -"
	close
	return
else
	dialog "- White cat. And if you look closely, you can see some black spots. -"
	close
	return
endif
return


npc "alberta" "A handful of ashes#2021hw" 4_SOIL 199 51 1 0 0
OnClick:
if (v[halloebs02] < 10)
	dialog "- The usual pile of ash and sand -"
	close
	return
endif

if (v[halloebs02] == 10)

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "You have too many items. Free some space in your inventory and try again."
        close
        return
    else
    endif
	
	var name = PcName
	dialog "- Looking at a pile of ash, you see some white bones. -"
	wait
	dialog "- It seems to belong to a small animal. -"
	wait
	dialog "- And through the bones you can see the torn ^ff0000red thread^000000. It looks like it was a small animal's collar. -"
    wait
	dialog "["+name+"]"
	dialog "Looks like the search is over... We need to take this to Jack."
    setitem halloebs02 11
    getitem Little_Skel_Bone 1
    completequest 11513
    setquest 11514
    close
    return
endif

if (v[halloebs02] == 11)
	var name = PcName
	dialog "- Looking at a pile of ash, you see some white blotches. -"
	wait
	dialog "- It's ^ff0000 of^000000, which seems to belong to a small animal. -"
	wait
	dialog "- And through the bones you can see the torn ^ff0000 red thread^000000. It looks like it was a small animal's collar. -"
    wait
	dialog "["+name+"]"
	dialog "Looks like the search is over... We need to take this to Jack."
    close
    return
else
	dialog "- The usual pile of ash and sand -"
	close
	return
endif
return




npc "niflheim" "Cat with black mane#2017hw" 4_SCATLETON 147 199 3 0 0
OnClick:
if (v[halloebs02] < 13)
    dialog "[Cat with black mane]"
	dialog "Oo-oo-oo-oo-oo..."
    close
    return
endif

if (v[halloebs02] == 13)
    dialog "[Cat with black mane]"
	dialog "Oo-oo-oo-oo-oo..."
    wait
    dialog "[Cat with black mane]"
	dialog "... It blows an ominous wind..."
    wait
    dialog "[Cat with black mane]"
    dialog "... How scared you are..."
    wait
    dialog "[Cat with black mane]"
	dialog "...Okay! Why did you come to me? If you're here to ask stupid questions, such as how to be and have a nice mane, walk away."
    wait
 choose menu "Tell about Jack"
    case 1
    break
    endchoose
    dialog "[Cat with black mane]"
	dialog "... For a long time I did not hear his name... There was such a young man... But now his name is forgotten."
    wait
    dialog "[Cat with black mane]"
	dialog "Please pass this on to him too. There is no more cute meow... That kitten is no more..."
    wait
 choose menu "What happened?"
    case 1
    break
    endchoose
	dialog "[Cat with black mane]"
	dialog "Jack was once my master, but those days are long gone. He left me hungry and alone."
    wait
    dialog "[Cat with black mane]"
	dialog "At first it was just an adventure. I wanted to run and see what was around. But when I returned, Jack was gone."
    wait
    dialog "[Cat with black mane]"
    dialog "I waited several days for him to return, but he never came."
    wait
    dialog "[Cat with black mane]"
    dialog "And one day, when I woke up, I decided to leave forever..."
	wait
    dialog "[Cat with black mane]"
    dialog "This was the last time I trusted a person."
    wait
    dialog "[Cat with black mane]"
	dialog "In any case, now, I am in this world, without a master."
	wait
    dialog "[Cat with black mane]"
	dialog "That kitten is gone, you have to tell Jack that. It will be easier for him to accept this if you give these bones to me."
    setitem halloebs02 14
    completequest 11515
    setquest 11516
    close
    return
endif

if (v[halloebs02] == 14)
	dialog "[Cat with black mane]"
	dialog "That kitten is gone, you have to tell Jack that. It will be easier for him to accept this if you give these bones to me."
    close
    return
endif

if (v[halloebs02] == 15)
	dialog "[Cat with black mane]"
    dialog "Did you tell Jack what happened?"
    close
    return
endif

if (v[halloebs02] == 16)
	dialog "[Cat with black mane]"
    dialog "Did you tell Jack what happened?"
    close
    return
endif

if (v[halloebs02] == 17)
	dialog "[Cat with black mane]"
    dialog "Did you tell Jack what happened?"
    close
    return
endif

if (v[halloebs02] == 18)
	dialog "[Cat with black mane]"
	dialog "Why did you come back?"
    wait
 choose menu "I couldn't tell..."
    case 1
    break
    endchoose
    dialog "[Cat with black mane]"
	dialog "You have enough stubbornness! But actually I thought... Not that I didn't think to go back to Jack..."
    wait
    dialog "[Cat with black mane]"
	dialog "But look at me. I am no longer a white and sweet kitten."
    wait
    dialog "[Cat with black mane]"
	dialog "Not only the appearance has changed. Everything has changed for me and my character."
    wait
    dialog "[Cat with black mane]"
	dialog "That's all I can tell you..."
    setitem halloebs02 19
    completequest 11520
    setquest 11521
    close
    return
endif

if (v[halloebs02] > 18) & (v[halloebs02] < 23)
	dialog "[Cat with black mane]"
	dialog "That's all I can tell you..."
    close
    return
endif

if (v[halloebs02] == 23)
	dialog "[Cat with black mane]"
	dialog "And he's really a guy who doesn't give up..."
    wait
 choose menu "Tell about Skelitty"
    case 1
    break
    endchoose
    dialog "[Cat with black mane]"
	dialog "Is it true?.. Perhaps at the moment when I decided to leave home, that cute kitten died in me..."
    wait
	dialog "[Cat with black mane]"
	dialog "If so, then it turns out there are two of my copies! How strange..."
    wait
	dialog "[Cat with black mane]"
	dialog "Although I won't be able to live my life anew, it is possible that Jack can continue to live here, in this world, with the kitten that was then left without an owner."
    wait
 choose menu "How do you know?"
    case 1
    break
    endchoose
    dialog "[Cat with black mane]"
	dialog "This is very similar to me. Delicious fish, red collar... Stains! Well, of course it was me then."
    wait
    dialog "- Cat lowered his head and then spoke again. -"
    wait
    dialog "[Cat with black mane]"
	dialog "Jack can't know about this."
    wait
    dialog "[Cat with black mane]"
    dialog "If he finds out that I have lived my whole life without him, he will never understand me."
    wait
    dialog "[Cat with black mane]"
	dialog "I must go, go on a journey..."
    wait
    dialog "[Cat with black mane]"
	dialog "Tell Jack I'm not here. I don't know when I'll be back, so please don't wait for me..."
    setitem halloebs02 24
    completequest 11525
    setquest 11526
    close
    return
else
    dialog "[Cat with black mane]"
	dialog "Jack can't know about me."
    wait
    dialog "[Cat with black mane]"
    dialog "If he finds out that I have lived my whole life without him, he will never understand me."
    wait
    dialog "[Cat with black mane]"
	dialog "I must go, go on a journey..."
    wait
    dialog "[Cat with black mane]"
	dialog "Tell Jack I'm not here. I don't know when I'll be back, so please don't wait for me..."
    close
    return
endif


npc "nif_fild02" "Headstone#2017hw1" 4_SOIL 131 231 0 0 0
OnClick:
dialog "[Headstone]"
dialog "It is so cold here..."
close
return

npc "nif_fild02" "Headstone#2017hw2" 4_SOIL 133 232 0 0 0
OnClick:
dialog "[Headstone]"
dialog "I see only darkness...."
close
return

npc "nif_fild02" "Headstone#2017hw3" 4_SOIL 132 229 0 0 0
OnClick:
dialog "[Headstone]"
dialog "The air is so cold here..."
close
return

npc "nif_fild02" "Headstone#2017hw4" 4_SOIL 137 228 3 0 0
OnClick:
if (v[halloebs02] < 15)
	dialog "[Headstone]"
	dialog "How cold it is here..."
    wait
    dialog "[Headstone]"
	dialog "As if my fur doesn't warm me."
    close
    return
endif

if (v[halloebs02] == 15)
	var name = PcName
	dialog "[Headstone]"
	dialog "How cold it is here..."
    wait
    dialog "[Headstone]"
	dialog "There is no strength in my body... What is this? I died?"
    wait
    dialog "[Headstone]"
	dialog "Is there someone there?"
    wait
    dialog "[Headstone]"
	dialog "My name is Scarie, is there someone there? I'm very lonely."
    wait
	dialog "["+name+"]"
    dialog "Scarie?! You're Jack's cat, aren't you? Maybe I can help you with something?"
    wait
    dialog "[Scarie]"
    dialog "Have you seen Jack? I recently lost it."
    wait
    dialog "[Scarie]"
	dialog "... Wow, it's so cold in here, can you get me some fur? 5 pieces of ^ff0000Black Fur^000000."
    setitem halloebs02 16
    completequest 11517
    setquest 11518
    close
    return
endif

if (v[halloebs02] == 16)
	if (v[Black_Fur] > 4)
		dialog "[Scarie]"
		dialog "Ah... you are already here..."
		wait
		choose menu "Give black fur" "Leave "
		case 1
			var name = PcName
			dialog "[Scarie]"
			dialog "Thank you very much... Now I can sleep peacefully..."
            dropitem Black_Fur 5
            setitem halloebs02 17
            completequest 11518
            setquest 11519
            wait
            dialog "[Scarie]"
			dialog "Ahh... Very hot!"
            wait
            dialog "[Scarie]"
			dialog "What it is? It's... It's just fur, isn't it?"
            wait
            dialog "[Scarie]"
			dialog "And it's very cold without it! I do not understand..."
            wait
			choose menu "Do you know where we are?"
            case 1
            break
            endchoose
            dialog "[Scarie]"
			dialog "By the way... Where are we?"
            wait
			dialog "["+name+"]"
			dialog "We are in Niflheim, the city of the dead..."
            wait
            dialog "[Scarie]"
			dialog "What?! How?! I do not understand! And where did my fur go!"
            wait
            dialog "[Scarie]"
			dialog "I can't even move my body, why is this so! What it is? Oh oh oh..."
            wait
            dialog "- Scarie is so agitated that it seems impossible to talk anymore. Let's go back to Jack. -"            
            close
            return
		break
		case 2
			dialog "[Scarie]"
			dialog "Have you seen Jack? I recently lost it."
			wait
			dialog "[Scarie]"
	dialog "... Wow, it's so cold in here, can you get me some fur? 5 pieces of ^ff0000Black Fur^000000."
            close
            return
		break
		endchoose
	else
		dialog "["+name+"]"
		dialog "Scarie ?! You're Jack's cat, aren't you? Maybe I can help you with something?"
		wait
		dialog "[Scarie]"
		dialog "Have you seen Jack? I recently lost it."
		wait
		dialog "[Scarie]"
	dialog "... Wow, it's so cold in here, can you get me some fur? 5 pieces of ^ff0000Black Fur^000000."
        close
        return
	endif
endif

if (v[halloebs02] == 17)
	dialog "["+name+"]"
	dialog "We are in Niflheim, the city of the dead..."
	wait
	dialog "[Scarie]"
	dialog "What?! How?! I do not understand! And where did my fur go!"
	wait
	dialog "[Scarie]"
	dialog "I can't even move my body, why is this so! What it is? Oh oh oh..."
	wait
	dialog "- Scarie is so agitated that it seems impossible to talk anymore. Let's go back to Jack. -"            
    close
    return
endif

if (v[halloebs02] == 18)
	dialog "[Scarie]"
	dialog "- Scarie is so agitated that it seems impossible to talk anymore. -"            
    close
    return
endif

if (v[halloebs02] == 19)
	dialog "[Scarie]"
	dialog "- Scarie is so agitated that it seems impossible to talk anymore. -"            
    close
    return
endif

if (v[halloebs02] == 20)
	if (v[White_Thin_Stem] > 9)
		dialog "[Scarie]"
		dialog "I can't even move my body, why is this so! What it is? Oh oh oh..."
        dropitem White_Thin_Stem 10
        setitem halloebs02 21
        completequest 11522
        setquest 11523
        wait
        dialog "[Scarie]"
		dialog "Are you here to laugh at me again because I can't even move?!"
        wait
  choose menu "Give stems"
        case 1
        break
        endchoose
        dialog "[Scarie]"
		dialog "Why do I need your dry branches?"
        wait
        dialog "[Scarie]"
		dialog "How can I do anything without moving?!"
        wait
        dialog "[Scarie]"
		dialog "I'm a skeleton now..."
        wait
        dialog "[Scarie]"
		dialog "Wait... I think... The branches you brought are good enough... Give them here... That is... Put them... Here..."
        wait
        dialog "[Scarie]"
        dialog "I guess I'll have to get used to it a bit in order to move normally, but it's much better than before..."
        wait
        dialog "[Scarie]"
        dialog "- It seems to you that the tombstone is starting to move. -"
        wait
        dialog "[Scarie]"
		dialog "May I ask you a favor?"
        wait
        dialog "[Scarie]"
		dialog "You seem to know me well... Can you bring me some ^ff0000Fresh fish^000000, 10 in total?"
        close
        return
	else
		dialog "[Scarie]"
		dialog "I can't even move my body, why is this so! What it is? Oh oh oh..."
        close
        return
	endif
endif

if (v[halloebs02] == 21)
	if (v[Delicious_Fish] > 9)
		choose menu "Give the fish" "Leave "
		case 1
			dialog "[Scarie]"
			dialog "Oh... what a taste! This sweet fishy smell, this fish slides over my mouth as if for the first time."
            dropitem Delicious_Fish 10
            setitem halloebs02 22
            completequest 11523
            setquest 11524
            wait
            dialog "[Scarie]"
			dialog "Unique texture, as if every scale is alive! I have never tasted such a taste in my life."
            wait
            dialog "[Scarie]"
            dialog "Thank you."
            wait
            dialog "[Scarie]"
			dialog "And maybe then... We will restore my skeleton? Another 20^ff0000 White Thin Stems^000000 would be useful."
            close
            return
        break
        case 2
        break
        endchoose
	else
        dialog "[Scarie]"
		dialog "May I ask you a favor?"
        wait
        dialog "[Scarie]"
		dialog "You seem to know me well... Can you bring me some ^ff0000Fresh fish^000000, 10 in total?"
        close
        return
	endif
endif

if (v[halloebs02] == 22)
	if (v[White_Thin_Stem] > 19)

    var wt_inven = GetInventoryRemainCount 1119 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "You have too many items. Free some space in your inventory and try again."
        close
        return
    else
    endif

		dialog "- Looking at Scarie with a new skeleton, you get the impression that you've already seen this somewhere. -"
		dropitem White_Thin_Stem 20
		setitem halloebs02 23
		getitem Memory_Of_Gyol 1
		completequest 11524
		setquest 11525
        wait
        dialog "[Scarie]"
		dialog "Thanks a lot."
        wait
        dialog "[Scarie]"
        dialog "I was reborn here in despair... But I have to accept what I have become."
        wait
        dialog "[Scarie]"
        dialog "But seeing how you help me, seeing that Jack is also here, I feel calm."
        wait
        dialog "[Scarie]"
        dialog "Jack... has always cared about me, I really need to find him."
        wait
        dialog "[Scarie]"
        dialog "This is the only fragment of my memory that remains."
        wait
        dialog "[Scarie]"
		dialog "And before I leave, I will give it to you in return for helping me. I don't even know what it is."
        wait
        dialog "[Scarie]"
        dialog "But it seems to me that you know what is this and who to go to."
        close
        return
	else
		dialog "[Scarie]"
		dialog "And maybe then... We will restore my skeleton? Another 20 ^ff0000White Thin Stems^000000 would be useful."
        close
        return
	endif
endif   
        
if (v[halloebs02] == 23)
	dialog "[Scarie]"
	dialog "I was reborn here in despair... But I have to accept what I have become."
	wait
	dialog "[Scarie]"
	dialog "But seeing how you help me, seeing that Jack is also here, I feel calm."
	wait
	dialog "[Scarie]"
	dialog "Jack... has always cared about me, I really need to find him."
	wait
	dialog "[Scarie]"
	dialog "This is the only fragment of my memory that remains."
    close
    return
else
	dialog "[Scarie]"
	dialog "I can't even move my body, why is this so! What it is? Oh oh oh..."
    close
    return
endif
return



npc "niflheim" "Jack#2017hw_j1" 4_JJAK 176 133 3 0 0
OnClick:
dialog "[Jack]"
dialog "Help!"
Talk2me "Jack#2017hw_j1" "Jack: Save me!"
close
return


npc "niflheim" "Jack#2017hw_j2" 4_JJAK 185 138 5 5 5
OnTouch2:
Talk2me "Jack#2017hw_j2" "Jack: What are you doing here?"
return

OnClick:
dialog "[Jack]"
dialog "He-he-he!"
Talk2me "Jack#2017hw_j2" "Jack: He-he-he-he!"
close
return


npc "niflheim" "Jack#2017hw_j3" 4_JJAK 204 166 8 5 5
OnTouch2:
Talk2me "Jack#2017hw_j3" "Jack: Let's run!"
return

OnClick:
dialog "[Jack]"
dialog "Let's run!"
Talk2me "Jack#2017hw_j3" "Jack: Hurray! Let's run!"
close
return


npc "niflheim" "Jack#2017hw_j4" 4_JJAK 164 189 1 5 5
OnTouch2:
Talk2me "Jack#2017hw_j4" "Jack: The Valley of the Dead is more alive than ever!"
return

OnClick:
dialog "[Jack]"
dialog "The Valley of the Dead is more alive than ever!"
Talk2me "Jack#2017hw_j4" "Jack: The Valley of the Dead is more alive than ever!"
close
return


npc "niflheim" "Skelion#2017hw" SKELION 138 199 5 0 0
OnClick:
	dialog "[Skelion]"
	dialog "Few believe it, but in the Valley of the Dead there are not only the images of the dead..."
	wait
	dialog "[Skelion]"
	dialog "I can resurrect the life of a creature here by restoring its strength. True, can this be called life..."
	wait
	dialog "- You can upgrade Skelitty. You need ^ff00001 Skelitty's Egg, 2 Memories of Skelion, 100 Yummy Meat, 100 Bat Cookie^000000. -"
	wait
	dialog "- ^ff0000Some items can be obtained from event quests.^ff0000 - "
	wait
	choose menu "Upgrade to Skelion" "Cancel "
		case 1
			if ((v[Scatletoncarrier] > 0) & (v[Memory_Of_Gyol] > 1) & (v[Yummy_Meat] > 99) & (v[Cookies_Bat] > 99))
				dialog "[Skelion]"
				dialog "How is it Scarie? Become alive again. Livelier than you've ever been."
				dropitem Scatletoncarrier 1
				dropitem Memory_Of_Gyol 2
				dropitem Yummy_Meat 100
				dropitem Cookies_Bat 100
				GetPetEgg SKELION
				close
				return
			else
				dialog "[Skelion]"
				dialog "You don't have enough items to upgrade Skelitty."
				close
				return
			endif
		break
		case 2
			dialog "[Skelion]"
			dialog "Perhaps this will make him calmer."
			close
			return
		break
	endchoose
return
