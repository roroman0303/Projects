
npc "malangdo" "���� ���� # 17_sign01" 2_BOARD2 214 106 1 5 5
OnTouch2:
	Talk2me "���� ����#17_sign01" "��� �� �����, ������ ������� ������ �� ������ �����!"
return


npc "malangdo" "���� ���� # 17_sign02" 2_BOARD2 146 129 1 5 5
OnTouch2:
	Talk2me "���� ����#17_sign02" "��� �� �����, ������ ������� ������ �� ������ �����!"
return


npc "malangdo" "���������� � ������� # 17_info01" 4_CAT_3COLOR 214 95 5 5 5

OnInit:
AddQuestIDCondition 14696
SetQuestConditionBegin 14696 1 0
SetQuestConditionQuest 14696 0
SetQuestConditionItem 3941 1 ">"
SetQuestConditionLevel 50 200
SetQuestConditionEnd
return

OnTouch2:
	Talk2me "���������� � �������#17_info01" "������ ����, ����� ���� � ����� ������? ��� ������ ������� ������� �����?"
return

OnClick:
dialog "[���������� � �������]"
dialog "����� ���������� � ��������!"
wait
dialog "[���������� � �������]"
dialog "�� ����� ��������� �����? �� "
dialog "������ �������� ���� � ����� "
dialog "�������? "
wait
choose menu "��. ����������, ������� ����." "� ������ ������ ����������."
case 1
	dialog "[���������� � �������]"
	dialog "����� ���������� ����� �������� "
	dialog "�� ����-�����. "
	compass 0 140 165 1 "0xFFFF3355"
	wait
	dialog "[���������� � �������]"
	dialog "������ �� ����� ����������, �� "
	dialog "������ ������� � ������������ "
	dialog "��������� � ������������������ �� "
	dialog "�����������. ��������� "
	dialog "������������ �� ����� ������� !! "
	dialog "����� ����� ������! ����� ����� "
	dialog "������ !! "
	close
	Navigation_Active "malangdo" 0 000 1 140 165
	return
break
case 2
	dialog "[���������� � �������]"
	dialog "�����! ����, ����������, � ���� � "
	dialog "��� ���� �����, �������� ����� "
	dialog "���������� ��������� �����! ����� "
	dialog "����� ������! ����� ����� ������ "
	dialog "!! "
	close
	return
break
endchoose
return



npc "malangdo" "���������� � ������� # 17_info02" 4_CAT_3COLOR 135 118 5 0 0
OnInit:
AddQuestIDCondition 14696
SetQuestConditionBegin 14696 1 0
SetQuestConditionQuest 14696 0
SetQuestConditionItem 3941 1 ">"
SetQuestConditionLevel 50 200
SetQuestConditionEnd
return

OnTouch2:
	Talk2me "���������� � �������#17_info02" "������ ����, ����� ���� � ����� ������? ��� ������ ������� ������� �����?"
return

OnClick:
dialog "[���������� � �������]"
dialog "����� ���������� � ��������!"
wait
dialog "[���������� � �������]"
dialog "�� ����� ��������� �����? �� "
dialog "������ �������� ���� � ����� "
dialog "�������? "
wait
choose menu "��. ����������, ������� ����." "� ������ ������ ����������."
case 1
	dialog "[���������� � �������]"
	dialog "����� ���������� ����� �������� "
	dialog "�� ����-�����. "
	compass 0 140 165 1 "0xFFFF3355"
	wait
	dialog "[���������� � �������]"
	dialog "������ �� ����� ����������, �� "
	dialog "������ ������� � ������������ "
	dialog "��������� � ������������������ �� "
	dialog "�����������. ��������� "
	dialog "������������ �� ����� ������� !! "
	dialog "����� ����� ������! ����� ����� "
	dialog "������ !! "
	close
	Navigation_Active "malangdo" 0 000 1 140 165
	return
break
case 2
	dialog "[���������� � �������]"
	dialog "�����! ����, ����������, � ���� � "
	dialog "��� ���� �����, �������� ����� "
	dialog "���������� ��������� �����! ����� "
	dialog "����� ������! ����� ����� ������ "
	dialog "!! "
	close
	return
break
endchoose
return


npc "malangdo" "����� ���������� ��������� � 17_list01" 4_CAT_ADV1 140 165 3 5 5

OnInit:
AddQuestIDCondition 14696
SetQuestConditionBegin 14696 1 0
SetQuestConditionQuest 14696 0
SetQuestConditionItem 3941 1 ">"
SetQuestConditionLevel 50 200
SetQuestConditionEnd
return

OnTouch2:
var noodle_14696 = isbegin_quest 14696 
if (noodle_14696 == 0) 
	Talk2me "����� ���������� ���������#17_list01" "� ������ ��! ������������� ������ ����� � ������� ������! ����������������� ��� ������� � ���������!"
else
	Talk2me "����� ���������� ���������#17_list01" "������ ����! �������� � ������� ������!"
endif
return


OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[����� ��������� ���������]"
		dialog "����� �������, � �� �������� "
		dialog "�������. ��� ������ ���? "
		close
		return
	else
	endif

if (v[VAR_CLEVEL] < 50)
	dialog "[����� ��������� ���������]"
	dialog "��� ����� ������� �������� "
	dialog "�������, ����� ����������� � "
	dialog "��������� �����. "
	close
	return
endif
var name = PcName
var noodle_14696 = isbegin_quest 14696 
dialog "[����� ��������� ���������]"
dialog "������ ����! ������ ����, ������? "
dialog "����� ���������� �� ��������� "
dialog "����� � ��������! ������������� "
dialog "����� � ��������� ��������� "
dialog "������! �� �������� ���� � "
dialog "������� �������! "
wait
choose menu "������ ������ �� ������� " "��������� �����?" "���������� � ������� " "���������� � ������� � ������ ������� "
case 1
	if (noodle_14696 == 0) 
		dialog "[����� ��������� ���������]"
		dialog "������ �������������� � "
		dialog "���������? �� ����� �� �� "
		dialog "�������� ����� ���� ���? ��� ��� "
		dialog "����� �� �������. "
		wait
		dlgwritestr
		dialog "[����� ��������� ���������]"
		dialog "���,"+name+"�� ��� �������."
		dialog "� ������ � ��������� ������ ��� "
		dialog "���������� ^0000cd^000000. ���� �� ���������� "
		dialog "���� ���� ������ ���������� � "
		dialog "������� ������, �� ������� "
		dialog "�������� �� ����� ���������� "
		dialog "��������� � ����� �����. "
		wait
		dialog "[����� ��������� ���������]"
		dialog "������ ����� ��������� ����� "
		dialog "���������� � ������ ��������� ^0000cd^000000. "
		wait
		dialog "[����� ��������� ���������]"
		dialog "��������� �� �������� ����� "
		dialog "�������� � ^0000cdNyilo^000000, ������� � Nyail "
		dialog "Oyster. "
		wait
		dialog "[����� ��������� ���������]"
		dialog "����� ������� � ������ �����, "
		dialog "��������� � "
		dialog "<NAVI>_[������������_���������],_<INFO>malangdo,133,170,000,0 "
		dialog ",</INFO> </NAVI>, ����������� "
		dialog "������ ����� ^0000cd������ ���^000000 � "
		dialog "�������! "
		setquest 14696
		getitem Promotion_Fan 1
		close
		return
	else
		dialog "[����� ��������� ���������]"
		dialog "���... �� ��� ������������������ "
		dialog "�� ��������� �����? ������ � "
		dialog "������������� ���� ������ ����� � "
		dialog "������! "
		close
		return
	endif
break
case 2
	dialog "[����� ��������� ���������]"
	dialog "������� �� ��������� �����? � "
	dialog "�������� ��������� ����� ����� "
	dialog "���������� "
	dialog "^0000cd��������� ������� ����^000000. ���� ��� "
	dialog "� ���, ����� �������� "
	dialog "������������� ������� � �������� "
	dialog "����, ���� ������� �� �������, "
	dialog "��� ��� �������� ��������� "
	dialog "����������� ��� ����. "
	wait
	dialog "[����� ��������� ���������]"
	dialog "���-�� � ��� ����� ���� ���� � "
	dialog "��������, ������� ����� ������� "
	dialog "������ ����� � �����, ��� ������ "
	dialog "������� ��������, ������ �����, � "
	dialog "����� �� ����, ��� ��� ���� ��� "
	dialog "������ ������ � �������. "
	wait
	dialog "[����� ��������� ���������]"
	dialog "���� ��������� �������������, ��� "
	dialog "�� ������ �� ����������� ������ "
	dialog "��� ��������� ^0000cdNyail Cave^000000, � "
	dialog "������� ����� �������, �� ����� "
	dialog "������� �� ����� ������ Nyail. "
	wait
	dialog "[����� ��������� ���������]"
	dialog "���������� ���, ���������� ������ "
	dialog "�� ����� ������ ��� ������ ����. "
	dialog "������ ���������� ���� ����� "
	dialog "���������, � �� ��������� ����� "
	dialog "������� ������� �������� �������, "
	dialog "� ����� ���� ����. "
	wait
	dialog "[����� ��������� ���������]"
	dialog "������� ����� �� ����� ����� "
	dialog "���������� � ���� �� ��������� � "
	dialog "����� � ��������� ���������. ���� "
	dialog "���������� �� ����������, "
	dialog "�����-��� ����� ������, ������ "
	dialog "������� �������. "
	wait
	dialog "[����� ��������� ���������]"
	dialog "��� ���� ������ �����, "
	dialog "�������������� ������ � ��������. "
	dialog "�����-���, ������� �������� "
	dialog "������ � ���������� "
	dialog "�������������� �������, ������� � "
	dialog "������������� ������ ������ "
	dialog "�����. "
	wait
	dialog "[����� ��������� ���������]"
	dialog "���� ���� ���� ��������� ��� "
	dialog "������^000000 � ����� ��������, ������� ��������� ������ ^0000cd. "
	dialog "� ��� �����, ����� �������� "
	dialog "������� ����, ��� �������� "
	dialog "�������������� ��������� ����� ^0000cd^000000 � "
	dialog "�������������� ���������� � ���� "
	dialog "�������� ����� �� ���������� "
	dialog "����� �� ����� ���� ����������� "
	dialog "���� ������ ������. "
	wait
	dialog "[����� ��������� ���������]"
	dialog "� ���������, � ���� ���� ������ "
	dialog "���� � ������� "
	dialog "^0000cd, �������������� � ������-������� �������� �����, ���� ������� ����� ����^000000! "
	dialog "���� �� ������� ��� �� �������� ^0000cd^000000, "
	dialog "��� ����������! "
	wait
	dialog "[����� ��������� ���������]"
	dialog "���������� ������� ����� � "
	dialog "����������� ���������� "
	dialog "�������������, ����� �������� "
	dialog "������ ����. "
	close
	return
break
case 3
	while(1)
		dialog "[����� ��������� ���������]"
		dialog "���� � ���� ��� ���������?"
		wait
		choose menu "���� � ������ �����." "����� " "������ ������� ��������� " "��������� ������ " "����� ���� " "�������� "
		case 1
			dialog "[����� ��������� ���������]"
			dialog "��������� ���������� � "
			dialog "^0000cdPork Potato Harvest^000000. ��������� �� "
			dialog "�������� ����� �������� � ^0000cdNyilo^000000, "
			dialog "������� ������� ������ � Nyail "
			dialog "Oyster! "
			wait
			dialog "[����� ��������� ���������]"
			dialog "� ������ ����� ����� ������� "
			dialog "������ ����� "
			dialog "<NAVI>_[������������_���������]_<INFO> "
			dialog "malangdo, 133,170,000,0, </INFO> "
			dialog "</NAVI>, ���������� ������ �����. "
			dialog " "
			wait
			dialog "[����� ��������� ���������]"
			dialog "�� ���������������, ���� �� ���� "
			dialog "� ������ �����, � �� ��� ���. "
			dialog "����� ������ �����������������. "
			dialog "����� �� �������� ��� � ����� "
			dialog "���������� ��������� "
			dialog "������������. "
			wait
		break
		case 2
			dialog "[����� ��������� ���������]"
			dialog "���� �� ������� ������� ������ "
			dialog "�����, ������� ������ � ��������� "
			dialog "����������, �������� �� � "
			dialog "����-���. �������� �����, ����� "
			dialog "����, �������������� � "
			dialog "�������������� �������� ����� "
			dialog "����� ����� ����� � ������� ���� "
			dialog "�� �����. "
			wait
			dialog "[����� ��������� ���������]"
			dialog "� ������� ��� � �����, ��� "
			dialog "��������� "
			dialog "<NAVI>_[����_��������_��_�����]_<INFO> "
			dialog "malangdo, 165,133,000,0, </INFO> "
			dialog "</NAVI>, ������� ���������� "
			dialog "������� � ������ �������� ����� ^0000cd^000000. "
			dialog " "
			wait
		break
		case 3
			dialog "[����� ��������� ���������]"
			dialog "�� �����-������ ������� � "
			dialog "^0000cdPork Potato ��������^000000? �������, "
			dialog "��� ���� ���� ���� ������� �� "
			dialog "��������� ���, ����� ������� �� "
			dialog "�� ��� �� ����. "
			wait
			dialog "[����� ��������� ���������]"
			dialog "<NAVI>_[��������_����]_<INFO> "
			dialog "malangdo, 183,221,000,0, </INFO> "
			dialog "</NAVI> �������� �� ������ "
			dialog "������� ���������. "
			wait
		break
		case 4
			dialog "[����� ��������� ���������]"
			dialog "���� �� ��������� ������� �����, "
			dialog "����������� ���������� �������� � "
			dialog "������� ������� !! "
			wait
			dialog "[����� ��������� ���������]"
			dialog "��������� �������� � ��������! � "
			dialog "���� ���� �� ���������� "
			dialog "����������� �������� ������, � "
			dialog "������ �� �������� ������� "
			dialog "����������� �� �������� �������^000000^000000, "
			dialog "��� ��� �� �������� ���������. "
			wait
			dialog "[����� ��������� ���������]"
			dialog "<NAVI> [��������� ����] <INFO> malangdo, 196,217,000,0, </INFO> </NAVI>."
			wait
		break
		case 5
			dialog "[����� ��������� ���������]"
			dialog "������� � ���� ���� ������������, "
			dialog "�� ��� ��? �������� �������� "
			dialog "�������� ������ ����, ������� "
			dialog "������ ���� ����� ����������� �� "
			dialog "������. "
			wait
			dialog "[����� ��������� ���������]"
			dialog "�� ^0000cd��� ���������� � ��� "
			dialog "���? "
			dialog "<NAVI>_[�����_�������]_�_�������_���_�_��������������_<INFO>malangdo,136,237,000,0 "
			dialog ",</INFO> </NAVI>, �� ������ �� �� "
			dialog "��� ��������? "
			wait
		break
		case 6
			dialog "[����� ��������� ���������]"
			dialog "������. ���� ��� ����� ������, "
			dialog "����� ��� �����! "
			close
			return
			exitwhile
		break
		endchoose
	endwhile
break
case 4
	dialog "[����� ��������� ���������]"
	dialog "���� �� ���������� � ��������� "
	dialog "������������ �� ����� ��������� "
	dialog "�����, �� �������� ������ ^0000cd^000000, "
	dialog "������� ����� �������� �� ����� � "
	dialog "�������^000000 ^0000cd. "
	wait
	dialog "[����� ��������� ���������]"
	dialog "��, ��! ������ ���, ����� � "
	dialog "�������� ��� �����������, ������� "
	dialog "� ������� ������ ����, � ���� "
	dialog "���� �����^000000 �� ����� ^0000cd. "
	wait
	dialog "[����� ��������� ���������]"
	dialog "���� �� ����������� ����� ^0000cd10 ���^000000, "
	dialog "�� �������� ������� � ��������� "
	dialog "����� <ITEM> ������������ � "
	dialog "��������������� ������ ����� "
	dialog "<INFO> 31303 </INFO> </ITEM>. "
	close
	return
break
endchoose
return



npc "malangdo" "������������ ��������� � 17_add01" 4_CAT_MERMASTER 133 170 5 5 5

OnInit:
AddQuestIDCondition 14697
SetQuestConditionBegin 14697 1 0
SetQuestConditionQuest 14696 1
SetQuestConditionQuest 14697 0
SetQuestConditionItem 3941 1 ">"
SetQuestConditionEnd

SetQuestConditionBegin 14697 1 0
SetQuestConditionQuest 14697 2
SetQuestConditionItem 23362 0 "<"
SetQuestConditionEnd
return

OnTouch2:
	Talk2me "������������ ���������#17_add01" "������ ����, ����� ���� � ����� ������? ��� ������ ������� ������� �����?"
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[������������ ���������]"
		dialog "����� �������, � �� �������� "
		dialog "�������. ��� ������ ���? "
		close
		return
	else
	endif

var noodle_14696 = isbegin_quest 14696 
var noodle_14697 = isbegin_quest 14697 
var hunt_chek01 = checkquest_hunting 14697
if (noodle_14696 == 1)
	dialog "[������������ ���������]"
	dialog "����� ���������� �! ����� "
	dialog "���������� �� ��������� �����. �� "
	dialog "��������� � ��������� ��������� "
	dialog "����� ���������� � ����� ������ "
	dialog "^0000cd������ ���������^000000! "
	wait
	dialog "[������������ ���������]"
	dialog "^0000cd ���������^000000, ������� ����� "
	dialog "�������� �� ^0000cdNyailo^000000, ������� � "
	dialog "^0000cdNyailo^000000, ��������� ������ "
	dialog "������������ ��-�� ��� "
	dialog "����������� �����. "
	wait
	dialog "[������������ ���������]"
	dialog "���� ��������� �� ������� "
	dialog "������������ ��� ��� �� ����, ��� "
	dialog "� � ��������� � ���������� "
	dialog "������� �� ����� ��� ��������� "
	dialog "��������������� �����. "
	wait
	dialog "[������������ ���������]"
	dialog "���� �� ������ ������ ������ � "
	dialog "��������� �� ��������, ���������� "
	dialog "����� ���������� ���������. "
	wait
	dialog "[������������ ���������]"
	dialog "����, �� ������ �� �� ����� � "
	dialog "^0000cdNyil Cave^000000, ����� ������� "
	dialog "��������� �� ��������? "
	wait
	choose menu "���! ����������, ���������!" "�������, � ���������."
	case 1
		dialog "[������������ ���������]"
		dialog "����� ������ � ���������!"
		completequest 14696
		setquest 14697
		close
		moveto "lasa_sea" 26 142
		return
	break
	case 2
		dialog "[������������ ���������]"
		dialog "��� ��� �����, ����� ������ �����."
		close
		return
	break
	endchoose
elseif (noodle_14697 == 1)
	if ((hunt_chek01 == 2) & (v[Pig_Potato] > 0))
		dialog "[������������ ���������]"
		dialog "��� ������ ���� ������� "
		dialog "���������? ���������� ��������� "
		dialog "������ ���������. �� "
		dialog "������������, ��� ���� ���� � "
		dialog "����� �����������������. "
		wait
		dialog "[������������ ���������]"
		dialog "� ������ ������� �������� "
		dialog "���������� ���������� ����� � "
		dialog "��������! "
		wait
		dialog "[������������ ���������]"
		dialog "�������� � ����������� ����� "
		dialog "���������, ������� �������� ����, "
		dialog "��� ����� ��������� ������ "
		dialog "�����������, � ��� ����� ���� "
		dialog "������ ���. "
		completequest 14697
		dropitem Pig_Potato 1
		setquest 14706
		setquest 14707
		setquest 14708
		setquest 14709
		getitem Noodle_Festa_Coupon 10
		close
		return
	else
		dialog "[������������ ���������]"
		dialog "��, �� ������ � ������� ������. � "
		dialog "��� ���� �������� �� ������ "
		dialog "������� � ���������? ������ �� �� "
		dialog "����� ����������� � ������ �����? "
		dialog " "
		wait
		choose menu "���! ����������, ���������!" "�������, � ���������."
		case 1
			dialog "[������������ ���������]"
			dialog "����� ������ � ���������!"
			close
			moveto "lasa_sea" 26 142
			return
		break
		case 2
			dialog "[������������ ���������]"
			dialog "��� ��� �����, ����� ������ �����."
			close
			return
		break
		endchoose
	endif
elseif (noodle_14697 == 2)
	dialog "[������������ ���������]"
	dialog "������ �� �� �� ���� ��� ����� "
	dialog "����������� � ������ �����? "
	wait
	choose menu "���! ����������, ���������!" "�������, � ���������."
	case 1
		dialog "[������������ ���������]"
		dialog "����� ������ � ���������!"
		close
		moveto "lasa_sea" 26 142
		return
	break
	case 2
		dialog "[������������ ���������]"
		dialog "��� ��� �����, ����� ������ �����."
		close
		return
	break
	endchoose
else
	dialog "[������������ ���������]"
	dialog "����� ���������� �! ����� "
	dialog "���������� �� ��������� �����. "
	dialog "��� ������ �������� ���� � "
	dialog "�������������� �������������? "
	wait
	dialog "[������������ ���������]"
	dialog " "
	dialog "<NAVI>_[�����_����������_���������]_<INFO> "
	dialog "malangdo, 140,165,000,0, </INFO> "
	dialog "</NAVI> ����������, ������� "
	dialog "����������������� �� ��������� "
	dialog "����, � ����� �������������. "
	close
	return
endif
return



npc "malangdo" "������� ����� # 17_add01" CLEAR_NPC 165 131 5 5 5

npc "malangdo" "���� �������� �� ����� # 17_add01" 4_CAT_CHEF 165 133 5 5 5

OnInit:
AddQuestIDCondition 14698
SetQuestConditionBegin 14698 1 0
SetQuestConditionQuest 14697 3
SetQuestConditionQuest 14698 0
SetQuestConditionEnd

AddQuestIDCondition 14698
SetQuestConditionBegin 14698 1 0
SetQuestConditionQuest 14698 1
SetQuestConditionItem 25365 9 "<"
SetQuestConditionEnd

AddQuestIDCondition 14699
SetQuestConditionBegin 14699 1 0 
SetQuestConditionQuest 14699 2
SetQuestConditionEnd
return

OnTouch2:
	Talk2me "���� �������� �� �����#17_add01" "������ ����, ����� ���� � ����� ������? ��� ������ ������� ������� �����?"
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[���� �������� �� �����]"
		dialog "����� �������, � �� �������� "
		dialog "�������. ��� ������ ���? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
var noodle_14698 = isbegin_quest 14698 
var noodle_14699 = isbegin_quest 14699 
var noodle_14706 = isbegin_quest 14706 
var time_check01 = checkquest_playtime 14699
if (noodle_14706 == 1)
	dialog "[���� �������� �� �����]"
	dialog "������ ����! ������� ����, ����� "
	dialog "�������� �����, �� ��� ��? ��� "
	dialog "������ ������� �����? "
	wait
	dialog "[���� �������� �� �����]"
	dialog " "
	dialog "^0000cd ���� �� ��������� 10 ������� ���� � 3 ������ ���������^000000, "
	dialog "�� ���������� �� �� ����� � "
	dialog "������� ���� � ���������� ������� "
	dialog "�������� ����� ^0000cd^000000. "
	wait
	choose menu "������!" "����� "
	case 1
		dialog "[���� �������� �� �����]"
		dialog "������� � ������ ����� �������� "
		dialog "�� ��������� ���������� ^0000cd^000000, ������� "
		dialog "����� ������� � ��� ����� ����, "
		dialog "��� ��� �� ������ �������� ��, "
		dialog "������ ��. "
		wait
		dialog "[���� �������� �� �����]"
		dialog "��������� �� �������� ����� "
		dialog "�������� � ^0000cdNyilo^000000 � ������ Nyail. "
		dialog "����� ����� � ������ �����, "
		dialog "������������� �� ������������ "
		dialog "���������. "
		wait
		dialog "[���� �������� �� �����]"
		dialog "���� �����, ��� ��� ��������� � "
		dialog "�������! "
		completequest 14706
		setquest 14698
		close
		return
	break
	case 2
		dialog "[���� �������� �� �����]"
		dialog "�� ������? ��, �������, ����� "
		dialog "����� ��������� �����. ����� ��� "
		dialog "����! "
		close
		return
	break
	endchoose
elseif (noodle_14698 == 1)
	if ((v[Thin_Noodle] > 9) & (v[Pig_Potato] > 2))
		dialog "[���� �������� �� �����]"
		dialog "�� �������� ������� ����� � "
		dialog "������ ���������? ���� ��������� "
		dialog "�����! ������ ��� ����� ������� "
		dialog "�����. ���� �������� ��� � ������ "
		dialog "������� ����, ����������� "
		dialog "�������� �� �����. "
		wait
		// ShowEffect "������� ����� # 17_add01" EF_DRAGONSMOKE
		dialog "[���� �������� �� �����]"
		dialog "������, ����� ������� ����� "
		dialog "������ � �������. "
		wait
		// ShowEffect "������� ����� # 17_add01" EF_DRAGONSMOKE
		dialog "[���� �������� �� �����]"
		dialog "��� ������! ��� ������ �� ������, "
		dialog "��� ����� ����������! "
		wait
		// ShowEffect "������� ����� # 17_add01" EF_DRAGONSMOKE
		dialog "[���� �������� �� �����]"
		dialog "������ �������� ��� � �������� "
		dialog "������. "
		wait
		// ShowEffect "������� ����� # 17_add01" EF_DRAGONSMOKE
		dialog "[���� �������� �� �����]"
		dialog "���! ��� ������ !!"
		wait
		// ShowEffect "������� ����� # 17_add01" EF_HEARTCASTING
		dialog "[���� �������� �� �����]"
		dialog "��������� ��������! ���� ��� "
		dialog "����� ������ ����� ^0000cd^000000, ��������� "
		dialog "������� ����� ^0000cd� ������� �����^000000, � "
		dialog "�� ������� ���. "
		wait
		dialog "[���� �������� �� �����]"
		dialog "������, ��� ����."
		completequest 14698
		dropitem Thin_Noodle 10
		dropitem Pig_Potato 3
		setquest 14699
		setquest 14710
		completequest 14710
		getitem Noodle_Festa_Coupon 5
		getitem Tamato_Noodle 5
		var noodle_14710 = isbegin_quest 14710
		var noodle_14711 = isbegin_quest 14711
		var noodle_14712 = isbegin_quest 14712
		var noodle_14713 = isbegin_quest 14713
		if ((noodle_14710 == 2) & (noodle_14711 == 2) & (noodle_14712 == 2) & (noodle_14713 == 2))
			wait
			dialog "[���� �������� �� �����]"
			dialog "���... �� ��������� ��� "
			dialog "����������� �����������? ����� "
			dialog "��� ����� "
			dialog "<NAVI>_[���������_������]_<INFO> "
			dialog "malangdo, 141,155,000,0, </INFO> "
			dialog "</NAVI>! "
		endif
		close
		return
	else
		dialog "[���� �������� �� �����]"
		dialog "�� ����� �� ������ ���? "
		dialog "^0000cd��������� ���������^000000 ���� �� "
		dialog "�������� � ����� "
		dialog "^0000cd10 ������� �������^000000 � "
		dialog "^0000cd3 ��������� �� ��������^000000, �� "
		dialog "���������� ������� �������� "
		dialog "�����. �� ��������! "
		close
		return
	endif
elseif (noodle_14699 == 1)
	if (time_check01 == 2)
		dialog "[���� �������� �� �����]"
		dialog "��-�-�? �� �����, ������ ��� "
		dialog "������ ��� �������� �����? ��� �� "
		dialog "������ ������� ������� � "
		dialog "����������� �� ������������� "
		dialog "�����? "
		wait
		choose menu "���������� � ������������ �� ����� " "������ ��� ����� "
		case 1
			dialog "[���� �������� �� �����]"
			dialog "�������� ����� ������������� "
			dialog "������, �� ��� ��? ������� ���� "
			dialog "���, �� ������� �� �������� ���! "
			dialog "���� ������� ��������� 10 ������� "
			dialog "� ������� ������� "
			dialog "^0000cd� 3 ������ ���������^000000, �� ������� "
			dialog "����� ����� �� �����! "
			erasequest 14699
			recall_completequest 14698
			close
			return
		break
		case 2
			dialog "[���� �������� �� �����]"
			dialog "�������� ����� ������������� "
			dialog "������, �� ��� ��? "
			dialog "^0000cd���� �� ������ ��� 10 ������� �������, 3 ��������� �� �������� � 5000 ������^000000, "
			dialog "� ��� ��� ��� ���� �����. ������� "
			dialog "����� ���� �����? "
			dialog "^0000cd������������ ����� ����������� �� 10 ������^000000. "
			dialog " "
			wait
			dlgwrite 1 10
			if input == 0
				dialog "[���� �������� �� �����]"
				dialog "�, �� �� ������� ����� �������? "
				dialog "�������, ����� �������� �����. "
				close
				return
			elseif error
				dialog "[���� �������� �� �����]"
				dialog "^0000cd �� 10 ������ �� ���^000000. ������ �� "
				dialog "����� �� � �������. "
				close
				return
			else
				var get_moy = input * 5000
				var now_noo = v[Thin_Noodle]
				var now_ptt = v[Pig_Potato]
				var do_noo = input * 10
				var do_ptt = input * 3
				if (v[VAR_MONEY] < get_moy) 
					dialog "[���� �������� �� �����]"
					dialog "� ���� ���� �����. �� ������ "
					dialog "^0000cd1 ��������� 5000 ������, 10 ������� ���������� ������� � 3 ��������� �� ��������^000000. "
					dialog " "
					close
					return
				elseif (now_noo < do_noo)
					dialog "[���� �������� �� �����]"
					dialog "��� �� ������� ������� � ������ "
					dialog "�����. �� ������ "
					dialog "^0000cd1 ��������� 5000 ������, 10 ������� ���������� ������� � 3 ��������� �� ��������^000000. "
					dialog " "
					close
					return
				elseif (now_ptt < do_ptt)
					dialog "[���� �������� �� �����]"
					dialog "������� ��������� ����. �� ������ "
					dialog "^0000cd1 ��������� 5000 ������, 10 ������� ���������� ������� � 3 ��������� �� ��������^000000. "
					dialog " "
					close
					return
				else
					dialog "[���� �������� �� �����]"
					dialog "� ��� � ����� �� ���������. "
					dialog "������������� � ��������� �����! "
					dropgold get_moy
					dropitem Thin_Noodle do_noo
					dropitem Pig_Potato do_ptt
					getitem Tamato_Noodle input
					close
					return
				endif
			endif
		break
		endchoose
	else
		dialog "[���� �������� �� �����]"
		dialog "��-�-�? �� �����, ������ ��� "
		dialog "������ ��� �������� �����? ��� �� "
		dialog "������� ������� � �����������, "
		dialog "��� ��������� ������� � ������ "
		dialog "�����? "
		wait
		choose menu "������ ��� ����� " "���������� � ������������ �� ����� "
		case 1
			dialog "[���� �������� �� �����]"
			dialog "�������� ����� ������������� "
			dialog "������, �� ��� ��? "
			dialog "^0000cd���� �� ������ ��� 10 ������� �������, 3 ��������� �� �������� � 5000 ������^000000, "
			dialog "� ��� ��� ��� ���� �����. ������� "
			dialog "����� ���� �����? "
			dialog "^0000cd������������ ����� ����������� �� 10 ������^000000. "
			dialog " "
			wait
			dlgwrite 1 10
			if input == 0
				dialog "[���� �������� �� �����]"
				dialog "�, �� �� ������� ����� �������? "
				dialog "�������, ����� �������� �����. "
				close
				return
			elseif error
				dialog "[���� �������� �� �����]"
				dialog "^0000cd �� 10 ������ �� ���^000000. ������ �� "
				dialog "����� �� � �������. "
				close
				return
			else
				var get_moy = input * 5000
				var now_noo = v[Thin_Noodle]
				var now_ptt = v[Pig_Potato]
				var do_noo = input * 10
				var do_ptt = input * 3
				if (v[VAR_MONEY] < get_moy) 
					dialog "[���� �������� �� �����]"
					dialog "� ���� ���� �����. �� ������ "
					dialog "^0000cd1 ��������� 5000 ������, 10 ������� ���������� ������� � 3 ��������� �� ��������^000000. "
					dialog " "
					close
					return
				elseif (now_noo < do_noo)
					dialog "[���� �������� �� �����]"
					dialog "��� �� ������� ������� � ������ "
					dialog "�����. �� ������ "
					dialog "^0000cd1 ��������� 5000 ������, 10 ������� ���������� ������� � 3 ��������� �� ��������^000000. "
					dialog " "
					close
					return
				elseif (now_ptt < do_ptt)
					dialog "[���� �������� �� �����]"
					dialog "������� ��������� ����. �� ������ "
					dialog "^0000cd1 ��������� 5000 ������, 10 ������� ���������� ������� � 3 ��������� �� ��������^000000. "
					dialog " "
					close
					return
				else
					dialog "[���� �������� �� �����]"
					dialog "� ��� � ����� �� ���������. "
					dialog "������������� � ��������� �����! "
					dropgold get_moy
					dropitem Thin_Noodle do_noo
					dropitem Pig_Potato do_ptt
					getitem Tamato_Noodle input
					close
					return
				endif
			endif
		break
		case 2
			dialog "[���� �������� �� �����]"
			dialog "������ ����������� ����������� "
			dialog "��� ��� ���������. ���� ���� "
			dialog "����� �����, ����� ��������. "
			dialog "����������, ������� ����� "
			dialog "��������. "
			close
			return
		break
		endchoose
	endif
elseif (noodle_14706 == 2)
	dialog "[���� �������� �� �����]"
	dialog "��-�-�? �� �����, ������ ��� "
	dialog "������ ��� �������� �����? ��� �� "
	dialog "������ ������� ������� � "
	dialog "����������� �� ������������� "
	dialog "�����? "
	wait
	choose menu "���������� � ������������ �� ����� " "������ ��� ����� "
	case 1
		dialog "[���� �������� �� �����]"
		dialog "�������� ����� ������������� "
		dialog "������, �� ��� ��? ������� ���� "
		dialog "���, �� ������� �� �������� ���! "
		dialog "���� ������� ��������� 10 ������� "
		dialog "� ������� ������� "
		dialog "^0000cd� 3 ������ ���������^000000, �� ������� "
		dialog "����� ����� �� �����! "
		erasequest 14699
		recall_completequest 14698
		close
		return
	break
	case 2
		dialog "[���� �������� �� �����]"
		dialog "�������� ����� ������������� "
		dialog "������, �� ��� ��? "
		dialog "^0000cd���� �� ������ ��� 10 ������� �������, 3 ��������� �� �������� � 5000 ������^000000, "
		dialog "� ��� ��� ��� ���� �����. ������� "
		dialog "����� ���� �����? "
		dialog "^0000cd������������ ����� ����������� �� 10 ������^000000. "
		dialog " "
		wait
		dlgwrite 1 10
		if input == 0
			dialog "[���� �������� �� �����]"
			dialog "�, �� �� ������� ����� �������? "
			dialog "�������, ����� �������� �����. "
			close
			return
		elseif error
			dialog "[���� �������� �� �����]"
			dialog "^0000cd �� 10 ������ �� ���^000000. ������ �� "
			dialog "����� �� � �������. "
			close
			return
		else
			var get_moy = input * 5000
			var now_noo = v[Thin_Noodle]
			var now_ptt = v[Pig_Potato]
			var do_noo = input * 10
			var do_ptt = input * 3
			if (v[VAR_MONEY] < get_moy) 
				dialog "[���� �������� �� �����]"
				dialog "� ���� ���� �����. �� ������ "
				dialog "^0000cd1 ��������� 5000 ������, 10 ������� ���������� ������� � 3 ��������� �� ��������^000000. "
				dialog " "
				close
				return
			elseif (now_noo < do_noo)
				dialog "[���� �������� �� �����]"
				dialog "��� �� ������� ������� � ������ "
				dialog "�����. �� ������ "
				dialog "^0000cd1 ��������� 5000 ������, 10 ������� ���������� ������� � 3 ��������� �� ��������^000000. "
				dialog " "
				close
				return
			elseif (now_ptt < do_ptt)
				dialog "[���� �������� �� �����]"
				dialog "������� ��������� ����. �� ������ "
				dialog "^0000cd1 ��������� 5000 ������, 10 ������� ���������� ������� � 3 ��������� �� ��������^000000. "
				dialog " "
				close
				return
			else
				dialog "[���� �������� �� �����]"
				dialog "� ��� � ����� �� ���������. "
				dialog "������������� � ��������� �����! "
				dropgold get_moy
				dropitem Thin_Noodle do_noo
				dropitem Pig_Potato do_ptt
				getitem Tamato_Noodle input
				close
				return
			endif
		endif
	break
	endchoose
else
	dialog "[���� �������� �� �����]"
	dialog "��� ������ ������� �������� "
	dialog "�����? ���� ������� �� ����� � "
	dialog "������ ������� ����, ������� "
	dialog "������ �������� ������! �� "
	dialog "��������� ������� �����! "
	close
	return
endif
return


npc "malangdo" "�������� ���� # 17_add01" 4_CAT_SAILOR1 183 221 5 5 5

OnInit:
	AddQuestIDCondition 14700
	SetQuestConditionBegin 14700 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionQuest 14700 0
	SetQuestConditionEnd
	
	AddQuestIDCondition 14700
	SetQuestConditionBegin 14700 1 0
	SetQuestConditionQuest 14700 2
	SetQuestConditionItem 23362 0 "<"
	SetQuestConditionEnd
	
	AddQuestIDCondition 14701
	SetQuestConditionBegin 14701 1 0 
	SetQuestConditionQuest 14701 2
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "�������� ����#17_add01" "����������� ���������� ��������� �� ��������! ������ � ��������� �� ��������!"
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "���� �� ������ ������� ������ "
		dialog "���������, ������� ���� �� "
		dialog "������� ������� ��������! "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
var noodle_14700 = isbegin_quest 14700 
var noodle_14701 = isbegin_quest 14701 
var noodle_14707 = isbegin_quest 14707 
var hunt_chek01 = checkquest_hunting 14700
var time_check01 = checkquest_playtime 14701

if (noodle_14707 == 1)
	dialog "[�������� ����]"
	dialog "�� �������� ���������! ���� �� "
	dialog "��� �������� �������� ������ ��� "
	dialog "� ����, �������, ��� "
	dialog "^0000cd������ ���������^000000! "
	wait
	dialog "[�������� ����]"
	dialog "����������, �� ������ ������ "
	dialog "������� � ���������! ������ � "
	dialog "��������� �� ��������! ������� "
	dialog "��������� ������� �� ������� "
	dialog "��������� �����������! "
	wait
	dialog "[�������� ����]"
	dialog "��, ������ ����, ���� � ������ "
	dialog "�����, ������ �� ��, ��� �� "
	dialog "��������? ����� ��������� "
	dialog "����������� ���������� �� ������ "
	dialog "������ �������? �������� ^0000cdNylo^000000 � "
	dialog "��������� ��������� �� ��������, "
	dialog "������� ���� Nyilo! "
	wait
	dialog "[�������� ����]"
	dialog "�� ���������������, ���� � ��� "
	dialog "��� Nyilo, ����� �� �������� "
	dialog "������ Nyail. ��� ����� ������ "
	dialog "��������������. "
	wait
	choose menu "������!" "��� ��� ������ �� ��������."
	case 1
		dialog "[�������� ����]"
		dialog "������ ���� ^0000cd^000000 ��������! ����� "
		dialog "����������� � ������ �����, "
		dialog "������� "
		dialog "<NAVI>_[������������_���������]_<INFO>malangdo,133,170,000,0,</INFO> "
		dialog "</NAVI>, � �� ������� ��� ���. "
		completequest 14707
		setquest 14700
		close
		return
	break
	case 2
		dialog "[�������� ����]"
		dialog "������??? ����������, �� ������ "
		dialog "������ ������� � ���������! "
		dialog "������ � ��������� �� ��������! "
		dialog "������� ��������� ������� �� "
		dialog "������� ��������� �����������! "
		close
		return
	break
	endchoose
elseif (noodle_14700 == 1)
	if ((hunt_chek01 == 2) & (v[Pig_Potato] > 0))
		dialog "[�������� ����]"
		dialog "�� �������� ������ ���������. "
		dialog "���� �������� ������, ������� "
		dialog "���������� ������, ���� ���� �� "
		dialog "������ ��� � �������! ������� "
		dialog "��������� ������� �����. "
		wait
		dialog "[�������� ����]"
		dialog "��� ������ ��������, ����������� "
		dialog "������������, ����� ������������, "
		dialog "����� ���������� ���� � ����� "
		dialog "�������. �������! ������, ��� "
		dialog "����. "
		completequest 14700
		dropitem Pig_Potato 1
		setquest 14701
		setquest 14711
		completequest 14711
		getitem Noodle_Festa_Coupon 5
		var noodle_14710 = isbegin_quest 14710
		var noodle_14711 = isbegin_quest 14711
		var noodle_14712 = isbegin_quest 14712
		var noodle_14713 = isbegin_quest 14713
		if ((noodle_14710 == 2) & (noodle_14711 == 2) & (noodle_14712 == 2) & (noodle_14713 == 2))
			wait
			dialog "[�������� ����]"
			dialog "�� ��! �� ��������� ��� ������� "
			dialog "���! "
			dialog "<NAVI>_�����,_[���������_������]_<INFO> "
			dialog "malangdo, 141,155,000,0, </INFO> "
			dialog "</NAVI>! "
		endif
		close
		return
	else
		dialog "[�������� ����]"
		dialog "�� ������� ��� ���������, ����� "
		dialog "����������� ��� �� ������ "
		dialog "��������� �� ��������. ������ "
		dialog "��������, ��������� �� ��������! "
		dialog "������ ����� � ������� ��������� "
		dialog "�� ��������, ������� ���� ���� "
		dialog "�����! "
		wait
		dialog "[�������� ����]"
		dialog "�� ���������������, ���� � ��� "
		dialog "��� Nyilo, ����� �� �������� "
		dialog "������ Nyail. ��� ����� ������ "
		dialog "��������������. "
		wait
		dialog "[�������� ����]"
		dialog "� ������������ ���� �������, ��� "
		dialog "��� �������� ���������! "
		close
		return
	endif
elseif (noodle_14701 == 1)
	if (time_check01 == 2)
		dialog "[�������� ����]"
		dialog "������ �� �� ������� "
		dialog "^0000cdPotato Harvest^000000 �������? "
		wait
		choose menu "���!!" "���."
		case 1
			dialog "[�������� ����]"
			dialog "�� ������� ��� ���������, ����� "
			dialog "����������� ��� �� ������ "
			dialog "��������� �� ��������. ������ "
			dialog "��������, ��������� �� ��������! "
			dialog "�������� ^0000cdNylo^000000 � ��������� "
			dialog "1^000000 ^0000cd������ ��������� �� Nyilo! "
			wait
			dialog "[�������� ����]"
			dialog "�� ���������������, ���� � ��� "
			dialog "��� Nyilo, ����� �� �������� "
			dialog "������ Nyail. ��� ����� ������ "
			dialog "��������������. "
			wait
			dialog "[�������� ����]"
			dialog "������������� ������ ��������� "
			dialog "��������� � ���� ������������! "
			erasequest 14701
			recall_completequest 14700
			close
			return
		break
		case 2
			dialog "[�������� ����]"
			dialog "����������� ���������� ��������� "
			dialog "�� ��������! ������ � ��������� "
			dialog "�� ��������! ��������� �� ������� "
			dialog "���� �� �������! "
			close
			return
		break
		endchoose
	else
		dialog "[�������� ����]"
		dialog "����������, ���� ��� ����������� "
		dialog "����������� �������. ��������� "
		dialog "������� ��� ��������� ������ "
		wait
		dialog "[�������� ����]"
		dialog "� ��� ����� ����������� ������ � "
		dialog "������ �����, � ������ ��������� "
		dialog "����������������� �� ������ "
		dialog "�����, �� ������� ����� "
		dialog "����������� ������. "
		wait
		dialog "[�������� ����]"
		dialog "�������, ����������, �������, ��� "
		dialog "�� ������������ ���������� "
		dialog "����������� � ����. ������ "
		dialog "��������� � ������ ����� "
		dialog "����������� ����������! "
		close
		return
	endif
elseif (noodle_14707 == 2)
	dialog "[�������� ����]"
	dialog "�� �������� ���������! ���� �� "
	dialog "��� �������� �������� ������ ��� "
	dialog "� ����, �������, ��� "
	dialog "^0000cd������ ���������^000000! "
	wait
	dialog "[�������� ����]"
	dialog "����������, �� ������ ������ "
	dialog "������� � ���������! ������ � "
	dialog "��������� �� ��������! ������� "
	dialog "��������� ������� �� ������� "
	dialog "��������� �����������! "
	wait
	dialog "[�������� ����]"
	dialog "��, ������ ����, ���� � ������ "
	dialog "�����, ������ �� ��, ��� �� "
	dialog "��������? ����� ��������� "
	dialog "����������� ���������� �� ������ "
	dialog "������ �������? �������� ^0000cdNylo^000000 � "
	dialog "��������� ��������� �� ��������, "
	dialog "������� ���� Nyilo! "
	wait
	dialog "[�������� ����]"
	dialog "�� ���������������, ���� � ��� "
	dialog "��� Nyilo, ����� �� �������� "
	dialog "������ Nyail. ��� ����� ������ "
	dialog "��������������. "
	wait
	choose menu "������!" "��� ��� ������ �� ��������."
	case 1
		dialog "[�������� ����]"
		dialog "������ ���� ^0000cd^000000 ��������! ����� "
		dialog "����������� � ������ �����, "
		dialog "������� "
		dialog "<NAVI>_[������������_���������]_<INFO>malangdo,133,170,000,0,</INFO> "
		dialog "</NAVI>, � �� ������� ��� ���. "
		completequest 14707
		recall_completequest 14700
		close
		return
	break
	case 2
		dialog "[�������� ����]"
		dialog "������??? ����������, �� ������ "
		dialog "������ ������� � ���������! "
		dialog "������ � ��������� �� ��������! "
		dialog "������� ��������� ������� �� "
		dialog "������� ��������� �����������! "
		close
		return
	break
	endchoose
else
	dialog "[�������� ����]"
	dialog "���� ��� ����� ������� ������ ��� "
	dialog "� ����, ������� ��, ������� � "
	dialog "���������! ���, �� ������ ���� "
	dialog "������� � ���������! ������ � "
	dialog "��������� �� ��������! ��������� "
	dialog "�� ������� ���� �� �������! "
	close
	return
endif
return



npc "malangdo" "������ # 17_wamel" WATERMELON 198 217 3 0 0
npc "malangdo" "������� # 17_wamel" WATERMELON 199 216 3 1 1
OnTouch2:
	Talk2me "������#17_wamel" "����! ����! ������� ������ "
	DelayTime 1000
	Talk2me "�������#17_wamel" "�����! �����! � ��� ���� ����!"
	DelayTime 1000
	Talk2me "Daeng Daeng Daeng#17_wamel" "� ��������! ��� ����! ���� ~"
	DelayTime 1000
	Talk2me "������#17_wamel" "������!"
	Talk2me "�������#17_wamel" "�������!"
	Talk2me "Daeng Daeng Daeng#17_wamel" "Daeng Daeng Daeng!"
	DelayTime 1000
	Talk2me "������#17_wamel" "� ���� �����!"
	Talk2me "�������#17_wamel" "� ���� �����!"
	Talk2me "Daeng Daeng Daeng#17_wamel" "� ���� �����!"
return
npc "malangdo" "����� ����� ����� # 17_wamel" WATERMELON 199 215 3 0 0
npc "malangdo" "������ ����� # 17_wamel" WATERMELON 195 235 3 5 5
OnTouch2:
	Talk2me "������ �����#17_wamel" "��� �����, � �������� ���� ���. �� ������ ��� ����������. - ���� -"
return

npc "malangdo" "��������� ���� # 17_add01" 4_CAT_SAILOR2 196 217 3 5 5

OnInit:
	AddQuestIDCondition 14702
	SetQuestConditionBegin 14702 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionQuest 14702 0
	SetQuestConditionEnd
	
	AddQuestIDCondition 14702
	SetQuestConditionBegin 14702 1 0
	SetQuestConditionQuest 14702 2
	SetQuestConditionItem 25367 9 "<"
	SetQuestConditionEnd
	
	AddQuestIDCondition 14703
	SetQuestConditionBegin 14703 1 0 
	SetQuestConditionQuest 14703 2
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "��������� ����#17_add01" "��� ������ ������ ����� ������?"
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "���� �� ������ ������� ������ "
		dialog "���������, ������� ���� �� "
		dialog "������� ������� ��������! "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
var noodle_14702 = isbegin_quest 14702 
var noodle_14703 = isbegin_quest 14703 
var noodle_14708 = isbegin_quest 14708 
var hunt_chek01 = checkquest_hunting 14702
var time_check01 = checkquest_playtime 14703

if (noodle_14708 == 1)
	dialog "[��������� ����]"
	dialog "������ ����? ������������� �����, "
	dialog "������? ���� �� ������, ���� �� � "
	dialog "����� ���� ��� ���� ���������� "
	dialog "������� ����. �� ������� "
	dialog "����������� �����, ������� "
	dialog "������� ��� � ������ ������ ����? "
	dialog " "
	wait
	dialog "[��������� ����]"
	dialog "����� ������� �������� �����, ��� "
	dialog "������ ����������� ��������� "
	dialog "�������^000000^000000? "
	wait
	dialog "[��������� ����]"
	dialog "�� �����-������ �������� "
	dialog "��������� ���� ^0000cd^000000, ���������������� "
	dialog "������ �������� �� ������ � "
	dialog "��������������� � ������� ������? "
	dialog "����� ������ ����� ������ �� "
	dialog "������������? �������� "
	dialog "����������� � ���, ����� ������ "
	dialog "���� ����� ��������. "
	wait
	dialog "[��������� ����]"
	dialog "��������� � ������� ��������� "
	dialog "���������� ^0000cd^000000, ������������ � "
	dialog "�������� ����! ��, ��� ������ "
	dialog "^0000cd10 ����^000000, ������� ������� �������� "
	dialog "������ ^0000cd� ������������ ������^000000! "
	wait
	choose menu "������ �����!" "� ���������."
	case 1
		dialog "[��������� ����]"
		dialog "^0000cd ������ �����^000000 ��� ^0000cdNyail oyster^000000, � "
		dialog "����� ^0000cdMalangdo^000000 ���� �������, "
		dialog "������ �����! ��! �����! � "
		dialog "���������� �����! ������� ������ "
		dialog "� ������� �����! "
		completequest 14708
		setquest 14702
		close
		return
	break
	case 2
		dialog "[��������� ����]"
		dialog "��, ���������, ���������� ������. "
		dialog "�� � ���� ����� �������, ��� �� "
		dialog "����� �������� �����! "
		close
		return
	break
	endchoose
elseif (noodle_14702 == 1)
	if ((hunt_chek01 == 2) & (v[Promotion_Fan] > 9))
		dialog "[��������� ����]"
		dialog "�� ������ � �������! ���������� "
		dialog "������ ����� �������! ���� �� "
		dialog "������ ����������� � ����������� "
		dialog "������ ����, �� �������� "
		dialog "������������� �������, �������, "
		dialog "����������, ���������� ������ "
		dialog "����! ������� ��������, �������! "
		wait
		var 17_noo = v[gooksoo2]
		var noo_hop = 17_noo + 1
		if (v[gooksoo2] == 7)
			dialog "[��������� ����]"
			dialog "������, ��� � ������, ��� "
			dialog "�������... ���� ��������, ������� "
			dialog "7-� ����! � ������ ��� ��������� "
			dialog "������� !!! <ITEM> ������, ����� "
			dialog "������� ������������� <INFO> "
			dialog "31304 </INFO> </ITEM>. "
			completequest 14702
			dropitem Promotion_Fan 10
			setquest 14703
			setquest 14712
			completequest 14712
			setitem gooksoo2 20
			getitem Noodle_Festa_Coupon 5
			getitem E_Watermelon_Pudding 5
			getitem C_Fan_Of_Summer 1
			wait
		elseif (v[gooksoo2] < 7)
			dialog "[��������� ����]"
			dialog "������, ��� � ������, ��� ��� "
			dialog "�������... � �� �����, ��� ���� "
			dialog "�� ���������� ��������� ���� "
			dialog "PR-������ � ������ ������, �� "
			dialog "������� ����� �� ������ �� "
			dialog "�����������? "
			completequest 14702
			dropitem Promotion_Fan 10
			setquest 14703
			setquest 14712
			completequest 14712
			setitem gooksoo2 noo_hop
			getitem Noodle_Festa_Coupon 5
			getitem E_Watermelon_Pudding 5
			wait
		else
			dialog "[��������� ����]"
			dialog "������, ��� � ������, ��� ��� "
			dialog "�������... � �� �����, ��� ���� "
			dialog "�� ���������� ��������� ���� "
			dialog "PR-������ � ������ ������, �� "
			dialog "������� ����� �� ������ �� "
			dialog "�����������? "
			completequest 14702
			dropitem Promotion_Fan 10
			setquest 14703
			setquest 14712
			completequest 14712
			getitem Noodle_Festa_Coupon 5
			getitem E_Watermelon_Pudding 5
			wait
		endif
		var noodle_14710 = isbegin_quest 14710
		var noodle_14711 = isbegin_quest 14711
		var noodle_14712 = isbegin_quest 14712
		var noodle_14713 = isbegin_quest 14713
		if ((noodle_14710 == 2) & (noodle_14711 == 2) & (noodle_14712 == 2) & (noodle_14713 == 2))
			dialog "[��������� ����]"
			dialog "��� ������� ��� ���������! "
			dialog "<NAVI>_[���������_������]_<INFO> "
			dialog "malangdo, 141,155,000,0, </INFO> "
			dialog "</NAVI> �������� ������ �������! "
			wait
		endif
		dialog "[��������� ����]"
		dialog "����� �������� ����� ������!"
		close
		return
	else
		dialog "[��������� ����]"
		dialog "��� ���� ����� �������? ��� ����� "
		dialog "������? ^0000cd������ �����^000000 - ��� "
		dialog "^0000cdoyster oyster^000000, �� ����� ^0000cdMalangdo^000000 "
		dialog "�����, ������� ����������� ����� "
		dialog "���. "
		wait
		dialog "[��������� ����]"
		dialog "���� ������� �����, ����� ������� "
		dialog "10 ������� ^0000cd� ��������� "
		dialog "�����! "
		close
		return
	endif
elseif (noodle_14703 == 1)
	if (time_check01 == 2)
		dialog "[��������� ����]"
		dialog "��� ���? ������ ������� ����� "
		dialog "������� �����? "
		wait
		choose menu "�������!" "������� ������..."
		case 1
			dialog "[��������� ����]"
			dialog "������ ������ ����� ����� � "
			dialog "�������� ����� ��� � ���� "
			dialog "��������, ��� ��� ����� ��. "
			wait
			dialog "[��������� ����]"
			dialog "���� ������� ������ �����, ����� "
			dialog "������� 10 ������� ^0000cd� "
			dialog "��������� �����! "
			erasequest 14703
			recall_completequest 14702
			close
			return
		break
		case 2
			dialog "[��������� ����]"
			dialog "���� �� ������ ����������� "
			dialog "�������� ������, ��������� ���� � "
			dialog "����� �����! "
			close
			return
		break
		endchoose
	else
		dialog "[��������� ����]"
		dialog "�� ��������� ������ ���� � "
		dialog "�������� � �������� ��������? "
		dialog "����������� ����������� "
		dialog "�����������. � ���� ���� ���� ��� "
		dialog "��������� �������, �� �� ����. "
		wait
		dialog "[��������� ����]"
		dialog "������ �� ������ ����� �� ����� "
		dialog "�� ������ � �� ����������� "
		dialog "������� ������? ��� �� �������, "
		dialog "��� �� ��������� �� ������������, "
		dialog "������� � ��� �� ����? �������� "
		dialog "������! "
		close
		return
	endif
elseif (noodle_14708 == 2)
	dialog "[��������� ����]"
	dialog "������ ����? ������������� �����, "
	dialog "������? ���� �� ������, ���� �� � "
	dialog "����� ���� ��� ���� ���������� "
	dialog "������� ����. �� ������� "
	dialog "����������� �����, ������� "
	dialog "������� ��� � ������ ������ ����? "
	dialog " "
	wait
	dialog "[��������� ����]"
	dialog "����� ������� �������� �����, ��� "
	dialog "������ ����������� ��������� "
	dialog "�������^000000^000000? "
	wait
	dialog "[��������� ����]"
	dialog "�� �����-������ �������� "
	dialog "��������� ���� ^0000cd^000000, ���������������� "
	dialog "������ �������� �� ������ � "
	dialog "��������������� � ������� ������? "
	dialog "����� ������ ����� ������ �� "
	dialog "������������? �������� "
	dialog "����������� � ���, ����� ������ "
	dialog "���� ����� ��������. "
	wait
	dialog "[��������� ����]"
	dialog "��������� � ������� ��������� "
	dialog "���������� ^0000cd^000000, ������������ � "
	dialog "�������� ����! ��, ��� ������ "
	dialog "^0000cd10 ����^000000, ������� ������� �������� "
	dialog "������ ^0000cd� ������������ ������^000000! "
	wait
	choose menu "������ �����!" "� ���������."
	case 1
		dialog "[��������� ����]"
		dialog "^0000cd ������ �����^000000 ��� ^0000cdNyail oyster^000000, � "
		dialog "����� ^0000cdMalangdo^000000 ���� �������, "
		dialog "������ �����! ��! �����! � "
		dialog "���������� �����! ������� ������ "
		dialog "� ������� �����! "
		completequest 14708
		recall_completequest 14702
		close
		return
	break
	case 2
		dialog "[��������� ����]"
		dialog "��, ���������, ���������� ������. "
		dialog "�� � ���� ����� �������, ��� �� "
		dialog "����� �������� �����! "
		close
		return
	break
	endchoose
else
	dialog "[��������� ����]"
	dialog "�� ������� ����������� ����� � "
	dialog "������ ������ ����? ��� ������ "
	dialog "�������� ������� ������ ����� "
	dialog "����� ������� �������� �����? "
	close
	return
endif
return



npc "malangdo" "������ # 17_add01" 4_F_HUGIRL 138 235 3 0 0

OnInit:
	AddQuestIDCondition 14704
	SetQuestConditionBegin 14704 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionQuest 14704 0
	SetQuestConditionEnd
	
	AddQuestIDCondition 14704
	SetQuestConditionBegin 14704 1 0
	SetQuestConditionQuest 14704 1
	SetQuestConditionItem 25344 9 "<"
	SetQuestConditionEnd
	
	AddQuestIDCondition 14705
	SetQuestConditionBegin 14705 1 0 
	SetQuestConditionQuest 14705 2
	SetQuestConditionEnd
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[������]"
		dialog "������, � ���� ������� ����� "
		dialog "������, �� � �������? "
		close
		return
	else
	endif

var name = PcName
var noodle_14697 = isbegin_quest 14697 
var noodle_14704 = isbegin_quest 14704 
var noodle_14705 = isbegin_quest 14705 
var noodle_14709 = isbegin_quest 14709 
var time_check01 = checkquest_playtime 14705

if (noodle_14709 == 1)
	dialog "[����]"
	dialog "��, �� ������ ���������!"
	wait
	dialog "[����]"
	dialog "���! ���� �������! ����� � ����� "
	dialog "���� �������! "
	wait
	dialog "[����]"
	dialog "��, ���������� �����������!"
	wait
	dialog "[����]"
	dialog "���� �� ���������� ������ � "
	dialog "�������, ��� ����� �����������! "
	dialog "����� �� ��� - ����� ����! ������ "
	dialog "� ����! "
	wait
	dialog "[������]"
	dialog "��... ������ �������� ��� ������ "
	dialog "�������? � �� �������. "
	wait
	dialog "[����]"
	dialog "���, ������ ����? ��� ������� �� "
	dialog "���� ����? "
	wait
	dialog "[����]"
	dialog "���� ������ ��� ��� �������, ��� "
	dialog "���� ������� ����� ��������� "
	dialog "����? "
	wait
	dialog "[������]"
	dialog "���!!"
	wait
	dialog "[����]"
	dialog "����� �� �� ���������?"
	wait
	dialog "[������]"
	dialog "���!!"
	wait
	dialog "[����]"
	dialog "����, ����� ���� �� �������, ��� "
	dialog "��� ������ ������? "
	wait
	dialog "[������]"
	dialog "���� �������!"
	wait
	dialog "[����]"
	dialog "�����? ��, ��� ����� ��������!"
	wait
	dialog "[����]"
	dialog "����������, ���������!"
	wait
	choose menu "�����, ��� ����������?"
	case 1
	break
	endchoose
	dialog "[������]"
	dialog "� �� ���� ������ ��������."
	wait
	choose menu "��. ������ �������� �� ���� ����."
	case 1
	break
	endchoose
	dialog "[������]"
	dialog "�����������, ��� �������� ��� "
	dialog "�����? ��� ��� �� ��������. ���� "
	dialog "���� ����������� ��� ������� � "
	dialog "������ � ��������, ������ ��� "
	dialog "������ ����. "
	wait
	dialog "[������]"
	dialog "� ����� ���� � �������� �����, "
	dialog "������� �������� ��� ����� � "
	dialog "�����, � �� ������, ��� ��� ���� "
	dialog "������ ������������. � ��� ����. "
	dialog "2 ������ �� �������� � 1 ����� �� "
	dialog "�����. ����, ���� ������� ����. "
	wait
	dialog "[������]"
	dialog "���� ���������� ��, ��� � �� "
	dialog "�������� �����, �������� ������ � "
	dialog "����. �� ����� ���� � ���� "
	dialog "������� �� ������ ���������� "
	dialog "���������? "
	wait
	choose menu "������ ���� ���� ������ "
	case 1
	break
	endchoose
	dialog "[������]"
	dialog "��. � ������ ������, ����� "
	dialog "������� � ����. ����� ��������� "
	dialog "����� ������������! ������ "
	dialog "������� �� ����, ����� ���������� "
	dialog "� ���� � ���������! "
	wait
	choose menu "�������������!"
	case 1
	break
	endchoose
	dialog "[������]"
	dialog "���� ���� ������ �� �� �����. �� "
	dialog "� ����. ��� ����, ��� �������� "
	dialog "����� ��������� �����! "
	wait
	dialog "[������]"
	dialog "� ����� ���������� ����. ��� �� "
	dialog "�������� � ������, ��� ������ �� "
	dialog "�����������! � ����� ����� "
	dialog "������, �� ����� �� �����. "
	wait
	dialog "[������]"
	dialog "�� �������� ����������� �����, "
	dialog "��� ����� ����� � ����� ����, "
	dialog "�����? "
	wait
	choose menu "���, ����� ����?"
	case 1
	break
	endchoose
	dialog "[������]"
	dialog "������ ��� �������� ����� ������ "
	dialog "�� ��������� ����� ����. � ������ "
	dialog "��� ��������� ^0000cd� ����� ��^000000. "
	wait
	dialog "[������]"
	dialog "���� ������� ������ ����, ����� "
	dialog "������� �������� � ���� ������ � "
	dialog "���������. ���� ���� �������. �� "
	dialog "��� ����� ����. ������ ���� ����� "
	dialog "������� � ����. "
	wait
	dialog "[������]"
	dialog "����������, �� �������, � ��� "
	dialog "������? "
	wait
	choose menu "���� ���� ������������, �� ���������."
	case 1
	break
	endchoose
	dialog "[������]"
	dialog "�����. � ��������."
	wait
	choose menu "�� ������ �� ������ ����?"
	case 1
	break
	endchoose
	dialog "[������]"
	dialog "��, ��� � ���! ��������� �� ����, "
	dialog "��� ������ ����� � ����, "
	dialog "��������� ���, ������� �� ���� "
	dialog "������ ^0000cd, ���������� ������^000000. �, "
	dialog "������ ����, ������ ��� �� ���, "
	dialog "������ ��� �� ��� ��������. "
	wait
	dialog "[������]"
	dialog "�����, ���� �� ������� ������ "
	dialog "����� � ����, ������� ���� � "
	dialog "��������� ������ ������. "
	wait
	choose menu "�� ������ �������?"
	case 1
	break
	endchoose
	dialog "[������]"
	dialog "���!"
	wait
	choose menu "��� ��� ������ ���� � ������?"
	case 1
	break
	endchoose
	dialog "[������]"
	dialog "���! �� �� ������ �������� "
	dialog "����-������, ��� � ���� �����! "
	wait
	choose menu "�� ������������� �������, ��� ��� �����."
	case 1
	break
	endchoose
	dialog "[������]"
	dialog "��� ���� ���� ���� ������ ��� "
	dialog "���. �� ����� ��� �� �����������, "
	dialog "��� ������ �� �������, ��� ������ "
	dialog "������� ����? "
	wait
	dialog "[������]"
	dialog "���, ������, Adventurer ����� "
	dialog "�������? "
	wait
	choose menu "������ �� � "
	case 1
	break
	endchoose
	dialog "[������]"
	dialog "���� �� ������� ������� ���� �� "
	dialog "��� ��������, � ��� "
	dialog "���^000000 �����, ������� � ��� ����^000000. "
	dialog "���� ��� ���� ���� ���� ����� "
	dialog "����, � ������������, ��� � ���� "
	dialog "������, ����� ��� ������, - ��� "
	dialog "������������ �����������. "
	wait
	dialog "[������]"
	dialog "�� ��� ��� ������ �� �����..."
	wait
	choose menu "��� �������� ���� ������?" "������ ��� ������."
	case 1
		dialog "[������]"
		dialog "��� ������� ������� "
		dialog "������^000000, ���������� ����� ����. �������� ���� - ������� �����, �� ������ ��� ������� � ��� ^0000cd^000000. "
		dialog "�������, ��������� ����� �������� "
		dialog "����� ���. "
		wait
		dialog "[������]"
		dialog "��� ���, ���� �� ����������, ��� "
		dialog "�� ���, �� ������� ����� ������, "
		dialog "������� �������� ������ ���. �� "
		dialog "������ �������� ��� ������ ����� "
		dialog "10 ^0000cd^000000? � ������ ����� ��� "
		dialog "���������. "
		wait
		choose menu "� ��� ���� ������� ����� ������?"
		case 1
		break
		endchoose
		dialog "[������]"
		dialog "� ����� ��� �����. �� ��� �, "
		dialog "����������! "
		completequest 14709
		setquest 14704
		close
		return
	break
	case 2
		dialog "[������]"
		dialog "������? ����� ������ �� "
		dialog "���������. ���, ��� � ���� "
		dialog "�������, ��� ���������� ������� "
		dialog "���� �����... �� ��������, "
		dialog "�������� �����������. "
		close
		return
	break
	endchoose
elseif (noodle_14704 == 1)
	if (v[Flat_Round_Stone] > 9)
		dialog "[����]"
		dialog "���, ��� ��� �� ����?"
		wait
		dialog "[����]"
		dialog "� ���� �� ����. �� ��� �� �� "
		dialog "����, ������� �� ����. "
		wait
		dialog "[����]"
		dialog "����� ������� ����"
		wait
		dialog "[������]"
		dialog "��-�-�? ����������! � �����, ��� "
		dialog "�� �����, ������ ��� �� �� "
		dialog "������. "
		wait
		choose menu "� �� ���� ��� �����."
		case 1
		break
		endchoose
		dialog "[������]"
		dialog "�� ������ �����?"
		wait
		choose menu "��� ����� ���� ������?"
		case 1
		break
		endchoose
		dialog "[������]"
		dialog "��������� ��� ������� ������� "
		dialog "����, �����, �� �� ������� ��� � "
		dialog "������� �������? ������� ��� "
		dialog "�������, �������� �����������. � "
		dialog "��� ��� ������, ��� � ������. "
		wait
		choose menu "�� ����, ������� ��."
		case 1
		break
		endchoose
		dialog "[������]"
		dialog "� ��� ����� ������ ���. � ��� ��� "
		dialog "����� �� �����. "
		wait
		choose menu "�������, � ������ ��� "
		case 1
		break
		endchoose
		dialog "[������]"
		dialog "����������, ������� ������, �� "
		dialog "������ ������. "
		completequest 14704
		dropitem Flat_Round_Stone 10
		setquest 14705
		setquest 14713
		completequest 14713
		getitem Noodle_Festa_Coupon 5
		var noodle_14710 = isbegin_quest 14710
		var noodle_14711 = isbegin_quest 14711
		var noodle_14712 = isbegin_quest 14712
		var noodle_14713 = isbegin_quest 14713
		if ((noodle_14710 == 2) & (noodle_14711 == 2) & (noodle_14712 == 2) & (noodle_14713 == 2))
			wait
			dialog "[������]"
			dialog "��, ������! ����������, �������� "
			dialog "�� ���! � ����� ��� ����������� "
			dialog "�����������! "
			dialog "<NAVI>_[���������_������]_<INFO> "
			dialog "malangdo, 141,155,000,0, </INFO> "
			dialog "</NAVI> � ������. ����� ������ "
		endif
		close
		return
	else
		dialog "[������]"
		dialog "����������, ���� ������ �������� "
		dialog "����� ������. ������ ���? ���� �� "
		dialog "������ ������� ������, �� ������ "
		dialog "�������� ������� � ������� ����� "
		dialog "^0000cd^000000, ��, ����������, ��������� �� �� "
		dialog "����� ^0000cd10 ����^000000. "
		close
		return
	endif
elseif (noodle_14705 == 1)
	if (time_check01 == 2)
		dialog "[������]"
		dialog "����� ������, ������� ���������� "
		dialog "������ ��� � ������� ���, ����� "
		dialog "���� �� ����! �� ������ �������� "
		dialog "��� ����� �������? "
		wait
		choose menu "������. � ������� ��� ����." "� ������� ������ ������."
		case 1
			dialog "[������]"
			dialog "���! ����� ��� ����� ����� "
			dialog "�������! ��� ������� �����, "
			dialog "������� ����� ��������, ���� "
			dialog "������� ������ ^0000cd! 10^000000 ���! "
			erasequest 14705
			recall_completequest 14704
			close
			return
		break
		case 2
			dialog "[������]"
			dialog "��� �... ����� ���� ����������� "
			dialog "����� ������, ����� �� �� �����. "
			dialog "������� ��������, �������! "
			close
			return
		break
		endchoose
	else
		dialog "[����]"
		dialog "��� ������ �����? ��?"
		wait
		dialog "[����]"
		dialog "���... ��� �� ���. �����..."
		wait
		dialog "[����]"
		dialog "��� �����, ��� ������?"
		wait
		dialog "[����]"
		dialog "� ��� �� ���������� �� ���, "
		dialog "�������, ����������, "
		dialog "��������������� �� ����� �������. "
		dialog " "
		wait
		dialog "[����]"
		dialog "��."
		wait
		dialog "[������]"
		dialog "� ��� ����� ������ �� ������� "
		dialog "�����, ������� ��� ������ "
		dialog "����������. ���� ���� �� ������ "
		dialog "����� ����. � ���� ������ �� ���� "
		dialog "������ �� ���� �� ��������. "
		wait
		dialog "[����]"
		dialog "������?"
		wait
		dialog "[������]"
		dialog "���!!"
		wait
		dialog "[����]"
		dialog "���� �� ������ ��� ������?"
		wait
		dialog "[������]"
		dialog "���!!! ����������, ������� �� �� "
		dialog "����� ����� ��������? "
		close
		return
	endif
elseif (noodle_14709 == 2)
	dialog "[������]"
	dialog "����� ������, ������� ���������� "
	dialog "������ ��� � ������� ���, ����� "
	dialog "���� �� ����! �� ������ �������� "
	dialog "��� ����� �������? "
	wait
	choose menu "������. � ������� ��� ����." "� ������� ������ ������."
	case 1
		dialog "[������]"
		dialog "���! ����� ��� ����� ����� "
		dialog "�������! ��� ������� �����, "
		dialog "������� ����� ��������, ���� "
		dialog "������� ������ ^0000cd! 10^000000 ���! "
		erasequest 14705
		recall_completequest 14704
		close
		return
	break
	case 2
		dialog "[������]"
		dialog "��� �... ����� ���� ����������� "
		dialog "����� ������, ����� �� �� �����. "
		dialog "������� ��������, �������! "
		close
		return
	break
	endchoose
else
	dialog "[������]"
	dialog "����, ������� � ������ ~"
	close
	return
endif
return


npc "malangdo" "���� # 17_add01" 4_F_04 136 235 3 0 0
OnClick:
dialog "[����]"
dialog "����������� ������� �� �������?"
wait
dialog "[����]"
dialog "������� �� �������."
close
return


npc "malangdo" "���� # 17_add01" 4_CAT_SAILOR3 135 236 3 0 0
OnClick:
dialog "[����]"
dialog "����� �� ������� ���� �� ������� "
dialog "� ������ �����? "
wait
dialog "[����]"
dialog "��� ����� ��� ������ ��������. � "
dialog "��� �� ����������� ���� � ������ "
dialog "����� �����. "
wait
dialog "[����]"
dialog "� �������. ������������ ������� "
dialog "��� ����� ������. "
close
return


npc "malangdo" "����� # 17_add01" 4_M_MERCAT2 136 237 5 0 0
OnClick:
var noodle_14697 = isbegin_quest 14697 

if (noodle_14697 == 0)
	dialog "[�����]"
	dialog "��� ������ �� �������� ���������� "
	dialog "������. ��� ������� ������. �, �� "
	dialog "����� �� �������? ������ �� �� "
	dialog "����� �� "
	dialog "<NAVI>_[�����_����������_���������]_<INFO> "
	dialog "malangdo, 140,165,000,0, </INFO> "
	dialog "</NAVI> � ������ � ����� "
	dialog "���������� ���������? "
	close
	return
else
	dialog "[�����]"
	dialog "�, �� ����� �� �������? �� ���? � "
	dialog "�����, ��� ������ ������� ������ "
	dialog "������ ����... ��� ������� � �� "
	dialog "������� �� ������. "
	wait
	dialog "[�����]"
	dialog "��� ��� ������ - �������������� "
	dialog "��� ����, �� ��� ���� ���� "
	dialog "��������� ���������... ��������� "
	dialog "�������. "
	close
	return
endif
return



npc "malangdo" "��������� ������ # 17_add01" 4_M_MERCAT2 141 155 3 5 5

OnInit:
	AddQuestIDCondition 14713
	SetQuestConditionBegin 14713 1 0
	SetQuestConditionQuest 14713 3
	SetQuestConditionQuest 14712 3
	SetQuestConditionQuest 14711 3
	SetQuestConditionQuest 14710 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "��������� ������#17_add01" "����������, ��������� ������, ����� �� ��������� ��� ����������� �������!"
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[��������� ������]"
		dialog "����� �������, � �� �������� "
		dialog "�������. �������� ������! "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
var noodle_14710 = isbegin_quest 14710
var noodle_14711 = isbegin_quest 14711
var noodle_14712 = isbegin_quest 14712
var noodle_14713 = isbegin_quest 14713


if (noodle_14697 == 2) 
	if (v[gooksoo1] > 10)
		dialog "[��������� ������]"
		dialog "�� ������ ���� ���� ��������� "
		dialog "������? �� ���� ������ �������� "
		dialog "��������? � ���������, �������� "
		dialog "^0000cd�������� ������ ���� ���^000000. "
		wait
		dialog "[��������� ������]"
		dialog "�� ��������� ��� ��� "
		dialog "������������, ��� ��� ������ � "
		dialog "������������� ���� ������ ����� "
		dialog "������ � ����������! "
		close
		return
	endif
	dialog "[��������� ������]"
	dialog "������ ����! ���� �� ����������� "
	dialog "�� ���� ����������� ������������, "
	dialog "������������ �����! ���� �� "
	dialog "�������� ��� �����, �� �������� "
	dialog "�������! "
	wait
	choose menu "������������ �����!" "�����? �������?" "��� ��� �� ���������."
	case 1
	break
	case 2
		showimage "177_01.bmp" 4
		dialog "[��������� ������]"
		dialog "���! ����� �� ��������� ��� 4 "
		dialog "�����������, �������������� �� "
		dialog "��������� ����� ������ ����, �� "
		dialog "�������� ����� �� ������ �������� "
		dialog "������. "
		wait
		showimage "177_01.bmp" 255
		dialog "[��������� ������]"
		dialog "���� �� ������� 10 ���, �� "
		dialog "������� ��� ������� <ITEM> "
		dialog "������������ � ��������� ������ "
		dialog "����� <INFO>31303</INFO> </ITEM>. "
		dialog " "
		wait
		dialog "[��������� ������]"
		dialog "������� ��������, ��� ������ ���� "
		dialog "<NAVI> [���� �������� �� �����] "
		dialog "<INFO> malangdo, 165,133,000,0, "
		dialog "</INFO> </NAVI> <NAVI> [Crew "
		dialog "Bream] <INFO> malangdo, "
		dialog "183,221,000,0, </ INFO> </NAVI> "
		dialog "<NAVI> [����� ����] <INFO> "
		dialog "��������, 196 217 000,0, </INFO> "
		dialog "</NAVI> <NAVI> [����� �������] "
		dialog "<INFO> ��������, 136 237 000,0, "
		dialog "</ �� ������ ��������� ��� 4 "
		dialog "�������, �������������� � INFO> "
		dialog "</NAVI>, ����� �������� ����� "
		dialog "���� ���. "
		wait
		dialog "[��������� ������]"
		dialog "���� ���� �� ��������� ���� � �� "
		dialog "�� ����������� 4 ���� � ������� "
		dialog "���������� ����, �� �� �������� "
		dialog "�����. �� ������? "
		close
		return
	break
	case 3
		dialog "[��������� ������]"
		dialog "����������? ���� ���������, "
		dialog "���������! ��������� ������ ���� "
		dialog "�� ������� �����! "
		close
		return
	break
	endchoose
	dialog "[��������� ������]"
	dialog "�� ������ �������� ����� �� "
	dialog "������? � ������� ��� ����� "
	dialog "������. ��������� ~ "
	wait
	if ((noodle_14710 == 2) & (noodle_14711 == 2) & (noodle_14712 == 2) & (noodle_14713 == 2))
		dialog "[��������� ������]"
		dialog "� ����������� ����������� "
		dialog "����������� ���! ������. � "
		dialog "���������� �����. "
		var gs_now = v[gooksoo1]
		var now_pl = gs_now + 1
		recall_completequest 14710
		recall_completequest 14711
		recall_completequest 14712
		recall_completequest 14713
		erasequest 14710
		erasequest 14711
		erasequest 14712
		erasequest 14713
		setitem gooksoo1 now_pl
		var left_gs = 10 - now_pl
		wait
		if ((now_pl == 1) | (now_pl == 6))
			showimage "177_01.bmp" 4
			dialog "[��������� ������]"
			dialog "��������! � ���������������. � ������������ ��� "+now_pl+"�� ������� ������! ������ "+left_gs+"���� �������� ��� ���, � ����� ���� <ITEM> �������<INFO>31303</INFO> </ITEM>. �������� ������ ����� ~ �� �������� ~"
			close
			showimage "177_01.bmp" 255
			return
		elseif ((now_pl == 2) | (now_pl == 7))
			showimage "177_02.bmp" 4
			dialog "[��������� ������]"
			dialog "��������! � ���������������. � ������������ ��� "+now_pl+"�� ������� ������! ������ "+left_gs+"���� �������� ��� ���, � ����� ���� <ITEM> �������<INFO>31303</INFO> </ITEM>. �������� ������ ����� ~ �� �������� ~"
			close
			showimage "177_02.bmp" 255
			return
		elseif ((now_pl == 3) | (now_pl == 8))
			showimage "177_03.bmp" 4
			dialog "[��������� ������]"
			dialog "��������! � ���������������. � ������������ ��� "+now_pl+"�� ������� ������! ������ "+left_gs+"���� �������� ��� ���, � ����� ���� <ITEM> �������<INFO>31303</INFO> </ITEM>. �������� ������ ����� ~ �� �������� ~"
			close
			showimage "177_03.bmp" 255
			return
		elseif ((now_pl == 4) | (now_pl == 9))
			showimage "177_04.bmp" 4
			dialog "[��������� ������]"
			dialog "��������! � ���������������. � ������������ ��� "+now_pl+"�� ������� ������! ������ "+left_gs+"���� �������� ��� ���, � ����� ���� <ITEM> �������<INFO>31303</INFO> </ITEM>. �������� ������ ����� ~ �� �������� ~"
			close
			showimage "177_04.bmp" 255
			return
		elseif (now_pl == 5)
			showimage "177_05.bmp" 4
			dialog "[��������� ������]"
			dialog "��������! � ���������������. � ������������ ��� "+now_pl+"�� ������� ������! � �������� ���� �����, ��� ��� � ����������� ��� � �������� �� ���� ����� �����."
			wait
			dialog "[��������� ������]"
			dialog "������ "+left_gs+"���� �������� ��� ���, � ������ ���� �������. �������� ������ ����� ~ �� �������� ~"
			close
			showimage "177_05.bmp" 255
			return
		elseif (now_pl == 10)
			showimage "177_05.bmp" 4
			dialog "[��������� ������]"
			dialog "�� ��! ������� �� ������� 10 "
			dialog "�������! ����� ������ ��� ������� "
			dialog "�� ������� � ���������! ���� �� "
			dialog "��� �������... "
			wait
			dialog "[��������� ������]"
			dialog "��������! ���, ����������! "
			dialog "�������� �����, �� �� ����� ~ "
			dialog "����, ������������� ���������� � "
			dialog "��������� ����� � ��������� ����! "
			dialog " "
			getitem C_Memory_Of_Noodle 1
			showimage "177_05.bmp" 255
			close
			return
		else
			dialog "[��������� ������]"
			dialog "�� ������ ���� ���� ��������� "
			dialog "������? �� ���� ������ �������� "
			dialog "��������? � ���������, ������� "
			dialog "�������� ������ ���� ���. "
			close
			return
		endif
	else
		dialog "[��������� ������]"
		dialog "���� �����������, ������� ��� �� "
		dialog "���������. "
		wait
		if (noodle_14710 == 0)
			dialog "[��������� ������]"
			dialog "����... � ���� � ���� ����� ^0000cd^000000. "
			dialog "<NAVI>_�������_[����_��������_��_�����]_<INFO> "
			dialog "malangdo, 165,133,000,0, </INFO> "
			dialog "</NAVI>, ��������� ����������� � "
			dialog "�������������. "
			close
			return
		elseif (noodle_14711 == 0)
			dialog "[��������� ������]"
			dialog "����... "
			dialog "^0000cd������ ������� � ���������^000000. "
			dialog "<NAVI>_[�����_����]_���������_��_<INFO>malangdo,183,221,000,0 "
			dialog ",</INFO> </NAVI>, ����� ��������� "
			dialog "������� � ���������. "
			close
			return
		elseif (noodle_14712 == 0)
			dialog "[��������� ������]"
			dialog "����... ^0000cd����� ��������^000000. "
			dialog "<NAVI>_[�����_����]_<INFO> "
			dialog "������� ��������, 196,217,000,0, "
			dialog "</INFO> </NAVI>, ��������� "
			dialog "����������� � �������������. "
			close
			return
		elseif (noodle_14713 == 0)
			dialog "[��������� ������]"
			dialog "����... ^0000cdFishing Ground Event^000000. "
			dialog "��������� �� "
			dialog "<NAVI>_[�����_]<INFO>malangdo,136,237,000,0,</INFO> "
			dialog "</NAVI>, ��������� ����������� � "
			dialog "�������������. "
			close
			return
		endif
	endif
else
	dialog "[��������� ������]"
	dialog "����� ����� ������! ����� ����� "
	dialog "������! ���, ��� ������ ������ �� "
	dialog "�����, ����� �������� �����? �� "
	dialog "���� �� ��� ���? "
	wait
	dialog "[��������� ������]"
	dialog "������� ���� "
	dialog "<NAVI>_[�����_����������_���������]_<INFO> "
	dialog "malangdo, 140,165,000,0, </INFO> "
	dialog "</NAVI> � ������� ���, ��� �� "
	dialog "������ ����������� � ���������. "
	close
	return
endif
return


npc "malangdo" "����� ������� # 17_add01" 2_MONEMUS 139 152 3 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "����� �������#17_add01" "������� ����� ������� �� Noodle Festival Coins!"
return

OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[����� �������]"
		dialog "����� �������, � �� �������� "
		dialog "�������. �������� ������! "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
var noodle_14698 = isbegin_quest 14698
var noodle_14700 = isbegin_quest 14700
var noodle_14702 = isbegin_quest 14702
var noodle_14704 = isbegin_quest 14704
if (noodle_14697 == 2) 
	dialog "[����� �������]"
	dialog "������, ���������� �� "
	dialog "������������ ��������� �����, "
	dialog "����� ����� �������� �� ��������� "
	dialog "�����. "
	wait
	dialog "[����� �������]"
	dialog "�������� �������, ������� ������ "
	dialog "��������. "
	wait
	choose menu "� ���� ����� ����� - 3" "�������� - 35 ��." "������ ��� ������ ������� - 3 ��." "������ Summer Noodle Memories - 200"
	case 1
		var 17ran_dom
		17ran_dom = 1
	break
	case 2
		var 17sea_dive
		17sea_dive = 1
	break
	case 3
		var 17sea_side
		17sea_side = 1
	break
	case 4
		var 17sea_memo
		17sea_memo = 1
	break
	endchoose
else
	dialog "[����� �������]"
	dialog "�������� ������ ���, ��� "
	dialog "���������� � ������� ������� "
	dialog "��������� �����. �� "
	dialog "�������������� ����������� "
	dialog "����������� � "
	dialog "<NAVI>_[�����_����������_���������]_<INFO> "
	dialog "malangdo, 140,165,000,0, </INFO> "
	dialog "</NAVI>. "
	close
	return
endif

if (17ran_dom == 1)
	dialog "[����� �������]"
	dialog "���� � ������, ��� �������� ��� "
	dialog "������� �����. "
	wait
	dialog "[����� �������]"
	dialog "����, � �����! <ITEM> ��������� "
	dialog "����� � ��������� "
	dialog "<INFO>19803</INFO> </ITEM>, "
	dialog "������������ �������, ������� "
	dialog "����� �������� ������ ����� !!! "
	wait
	dialog "[����� �������]"
	dialog "����, ������ �� �� ������� "
	dialog "�������� � ���� ����� � ������� "
	dialog "������� � ��������� ��������� "
	dialog "������? "
	wait
	choose menu "� ������� ���� �����!" "� ������ �������."
	case 1
		if (v[Noodle_Festa_Coupon] > 2)
			dialog "[����� �������]"
			dialog "������! ���������, ��� ������."
			wait
			dropitem Noodle_Festa_Coupon 3
			var ran_ma = rand 1 100
			if ((ran_ma > 0) & (ran_ma < 17))
				getitem E_Watermelon_Pudding 3
			elseif ((ran_ma > 16) & (ran_ma < 33))
				getitem Cold_Watermelon_Juice 3
			elseif ((ran_ma > 32) & (ran_ma < 49))
				getitem Tamato_Noodle 3
			elseif ((ran_ma > 48) & (ran_ma < 54))
				getitem Scuba_Mask_K 1
			elseif ((ran_ma > 53) & (ran_ma < 57))
				getitem Supper_Swimsuit_K 1
			elseif ((ran_ma > 56) & (ran_ma < 59))
				getitem C_Fan_Of_Summer 1
			elseif ((ran_ma > 58) & (ran_ma < 64))
				getitem C_Pinwheel_Cap 1
			elseif ((ran_ma > 63) & (ran_ma < 69))
				getitem Oxygen_Bomb_K 1
			elseif ((ran_ma > 68) & (ran_ma < 85))
				getitem Ice_Cream 10
			else
				getitem Iceflake 3
			endif
			dialog "[����� �������]"
			dialog "��� ���? ������� ������������� "
			dialog "����? ����������, ����������� ��� "
			dialog "����� � ��������� ���! "
			close
			return
		else
			dialog "[����� �������]"
			dialog "��������. � ��� ������������ "
			dialog "�����. ����������, ����������� "
			dialog "��� ��� ����� �������������. "
			close
			return
		endif
	break
	case 2
		dialog "[����� �������]"
		dialog "������� �� ���� �������������."
		close
		return
	break
	endchoose
elseif (17sea_dive == 1)
	dialog "[����� �������]"
	dialog "��������! � �������� "
	dialog "������������, ������� ������ "
	dialog "������ ���� ��� ����� "
	dialog "�������������. ����� ������������ "
	dialog "�� �� �������? "
	wait
	choose menu "��������� ����� - 35 ����� " "��������� ������� - 35 ����� " "����������� ������ - 35 ����� " "�������� "
	case 1
		dialog "[����� �������]"
		dialog "�� ������ �������� 35 "
		dialog "^0000cd������������ �������^000000 �� "
		dialog "^0000cd<ITEM> ����� ��� ��������� <INFO> 19162 </INFO> </ITEM>^000000? "
		dialog " "
		wait
		choose menu "��." "���."
		case 1
			if (v[Noodle_Festa_Coupon] > 34)
				dialog "[����� �������]"
				dialog "������� ���������. �������, ��� "
				dialog "��������������� ��. ������������� "
				dialog "���������� � ����������� �� "
				dialog "�����! "
				dropitem Noodle_Festa_Coupon 35
				getitem Scuba_Mask_K 1
				close
				return
			else
				dialog "[����� �������]"
				dialog "��������. � ��� ������������ "
				dialog "�����. ����������, ����������� "
				dialog "��� ��� ����� �������������. "
				close
				return
			endif
		break
		case 2
			dialog "[����� �������]"
			dialog "������� �� ���� �������������."
			close
			return
		break
		endchoose
	break
	case 2
		dialog "[����� �������]"
		dialog "�� ������ �������� 35 "
		dialog "^0000cdFestival Coupons^000000 �� "
		dialog "^0000cd<ITEM> Surfer Swimsuit <INFO> 15174 </INFO> </ITEM>^000000? "
		dialog " "
		wait
		choose menu "��." "���."
		case 1
			if (v[Noodle_Festa_Coupon] > 34)
				dialog "[����� �������]"
				dialog "������� ���������. �������, ��� "
				dialog "��������������� ��. ������������� "
				dialog "���������� � ����������� �� "
				dialog "�����! "
				dropitem Noodle_Festa_Coupon 35
				getitem Supper_Swimsuit_K 1
				close
				return
			else
				dialog "[����� �������]"
				dialog "��������. � ��� ������������ "
				dialog "�����. ����������, ����������� "
				dialog "��� ��� ����� �������������. "
				close
				return
			endif
		break
		case 2
			dialog "[����� �������]"
			dialog "������� �� ���� �������������."
			close
			return
		break
		endchoose
	break
	case 3
		dialog "[����� �������]"
		dialog "�� ������ �������� 35 "
		dialog "^0000cd������������ �������^000000 �� "
		dialog "^0000cd<ITEM> ����������� ������ <INFO> 20819 </INFO> </ITEM>^000000? "
		dialog " "
		wait
		choose menu "��." "���."
		case 1
			if (v[Noodle_Festa_Coupon] > 34)
				dialog "[����� �������]"
				dialog "������� ���������. �������, ��� "
				dialog "��������������� ��. ������������� "
				dialog "���������� � ����������� �� "
				dialog "�����! "
				dropitem Noodle_Festa_Coupon 35
				getitem Oxygen_Bomb_K 1
				close
				return
			else
				dialog "[����� �������]"
				dialog "��������. � ��� ������������ "
				dialog "�����. ����������, ����������� "
				dialog "��� ��� ����� �������������. "
				close
				return
			endif
		break
		case 2
			dialog "[����� �������]"
			dialog "������� �� ���� �������������."
			close
			return
		break
		endchoose
	break
	case 4
		dialog "[����� �������]"
		dialog "������� �� ���� �������������."
		close
		return
	break
	endchoose
elseif (17sea_side == 1)
	if (v[VAR_JOB] == DO_SUMMONER)
		dialog "[����� �������]"
		dialog "�� �����? ���������� ����������� "
		dialog "�� ������� "
		dialog "^0000cd<ITEM> ���������� ��� ������ ������� <INFO> 22822 </INFO> </ITEM>^000000 "
		dialog "�� ������ ��������. ������ �� "
		dialog "����������? "
		wait
		choose menu "��� " "���."
		case 1
		break
		case 2
			dialog "[����� �������]"
			dialog "������. ������� �� ���� "
			dialog "�������������. "
			close
			return
		break
		endchoose
	endif
	dialog "[����� �������]"
	dialog "�� ������ �������� "
	dialog "^0000cd3 ������ ��������� �����^000000 �� "
	dialog "<ITEM> 5 ������� ��� ������ "
	dialog "������� <INFO>22822</INFO> "
	dialog "</ITEM>? "
	wait
	choose menu "��." "���."
	case 1
		if (v[Noodle_Festa_Coupon] > 2)
			dialog "[����� �������]"
			dialog "������� ���������. �������, ��� "
			dialog "��������������� ��. ������������� "
			dialog "���������� � ����������� �� "
			dialog "�����! "
			dropitem Noodle_Festa_Coupon 3
			getitem Apple 5 // SW_Wear2014
			close
			return
		else
			dialog "[����� �������]"
			dialog "��������. � ��� ������������ "
			dialog "�����. ����������, ����������� "
			dialog "��� ��� ����� �������������. "
			close
			return
		endif
	break
	case 2
		dialog "[����� �������]"
		dialog "������� �� ���� �������������."
		close
		return
	break
	endchoose
elseif (17sea_memo == 1)
	dialog "[����� �������]"
	dialog "�� ������ �������� 200 "
	dialog "^0000cd����� ��������� �����^000000 �� <ITEM> "
	dialog "Costume Summer Noodle Memories "
	dialog "<INFO> 31303 </INFO> </ITEM>? "
	wait
	choose menu "��." "���."
	case 1
		if (v[Noodle_Festa_Coupon] > 199)
			dialog "[����� �������]"
			dialog "������� ���������. �������, ��� "
			dialog "��������������� ��. ������������� "
			dialog "���������� � ����������� �� "
			dialog "�����! "
			dropitem Noodle_Festa_Coupon 200
			getitem C_Memory_Of_Noodle 1
			close
			return
		else
			dialog "[����� �������]"
			dialog "��������. � ��� ������������ "
			dialog "�����. ����������, ����������� "
			dialog "��� ��� ����� �������������. "
			close
			return
		endif
	break
	case 2
		dialog "[����� �������]"
		dialog "������� �� ���� �������������."
		close
		return
	break
	endchoose
else
endif
return



npc "malangdo" "������ ������������ # 17_add01" 4_M_MERCAT1 141 158 3 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "������ ������������#17_add01" "������� ������ ������������ ����� �������� � ������ ���!"
return


OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[������ ������������]"
		dialog "����� ������� � ������� �������. "
		dialog "���� �� � �������� ������������ � "
		dialog "�������� ��� � �����? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 2)
	dialog "[������ ������������]"
	dialog "������ ����? ������� ������, "
	dialog "������? ��������� �������� � "
	dialog "���������� - ������ � ����� ����! "
	dialog "��� �� ������ ������������� "
	dialog "���������� ������� � ����. "
	wait
	dialog "[������ ������������]"
	dialog "� ��� ���� ������ ��������� "
	dialog "�����? � Coins ��� Jenny, ������ "
	dialog "�� �� ���������� �������� "
	dialog "��������� ��� ������� ��������, "
	dialog "��������� ���������� ��� "
	dialog "���������, �� ��������� ���� �� "
	dialog "24 ����? "
	wait
	dialog "[������ ������������]"
	dialog "������� �����, ��� ������� "
	dialog "�������� ��������� ��� �������� "
	dialog "���������. ��� �����, ���� � ��� "
	dialog "����� ��� �����������! "
	wait
	dialog "[������ ������������]"
	dialog "������ �� �� ���������� "
	dialog "������������ � ������? ��� �� "
	dialog "������ �� ���������� �� Noodle "
	dialog "Festival Coins? "
	wait
	choose menu "������ � �������� ��������� ����� " "������ � ������ " "����� ��������� ��� " "�� ������� � ������ "
	case 1
		dialog "[������ ������������]"
		dialog "��� �� �� ������ ����������?"
		wait
		choose menu "������ ������������ ������� - 2 � ���� " "������ ���������� ��� ������� - 2 ���� � ���� " "������ ��������� ����� - 2 � ���� " "������ ��������������� ����� �������� - 2 � ���� " "������ ���������������� ������ ������� ������������� - 2 � ���� " "�������� "
		case 1
			dialog "[������ ������������]"
			dialog "^0000cd 2 ������ ��������� �����^000000 ������ "
			dialog "���������� <ITEM> ����������� "
			dialog "������ <INFO> 20855 </INFO> "
			dialog "</ITEM> �� ^0000cd�� 1 ����^000000? "
			wait
			choose menu "��." "���."
			case 1
				if (v[Noodle_Festa_Coupon] > 1)
					dialog "[������ ������������]"
					dialog "������� ���������. �������, ��� "
					dialog "��������������� ��. ������������� "
					dialog "���������� � ����������� �� "
					dialog "�����! "
					dropitem Noodle_Festa_Coupon 2
					RentItem Rental_Oxygen_Bomb 86400 0 0 0 0 0
					close
					return
				else
					dialog "[������ ������������]"
					dialog "��������. � ��� ������������ "
					dialog "�����. ����������, ����������� "
					dialog "��� ��� ����� �������������. "
					close
					return
				endif
			break
			case 2
				dialog "[������ ������������]"
				dialog "������� �� ���� �������������."
				close
				return
			break
			endchoose
		break
		case 2
			dialog "[������ ������������]"
			dialog "�� �� ������ �������� "
			dialog "^0000cd�� 1 ���� <ITEM> ���������� ���������� Surfer <INFO> 15210 </INFO> </ITEM> �� ^0000cd2 "
			dialog "������ ��������� �����^000000? "
			wait
			choose menu "��." "���."
			case 1
				if (v[Noodle_Festa_Coupon] > 1)
					dialog "[������ ������������]"
					dialog "������� ���������. �������, ��� "
					dialog "��������������� ��. ������������� "
					dialog "���������� � ����������� �� "
					dialog "�����! "
					dropitem Noodle_Festa_Coupon 2
					RentItem Rental_SupperSwimsuit 86400 0 0 0 0 0
					close
					return
				else
					dialog "[������ ������������]"
					dialog "��������. � ��� ������������ "
					dialog "�����. ����������, ����������� "
					dialog "��� ��� ����� �������������. "
					close
					return
				endif
			break
			case 2
				dialog "[������ ������������]"
				dialog "������� �� ���� �������������."
				close
				return
			break
			endchoose
		break
		case 3
			dialog "[������ ������������]"
			dialog "�� ������ ����� �������� <ITEM> "
			dialog "����� ��� ���������� �������� "
			dialog "<INFO> 19275 </INFO> </ITEM> �� "
			dialog "^0000cd2 ������ ��������� �����^000000 "
			dialog "^0000cd�� 1 ����^000000? "
			wait
			choose menu "��." "���."
			case 1
				if (v[Noodle_Festa_Coupon] > 1)
					dialog "[������ ������������]"
					dialog "������� ���������. �������, ��� "
					dialog "��������������� ��. ������������� "
					dialog "���������� � ����������� �� "
					dialog "�����! "
					dropitem Noodle_Festa_Coupon 2
					RentItem Rental_Scuba_Mask 86400 0 0 0 0 0
					close
					return
				else
					dialog "[������ ������������]"
					dialog "��������. � ��� ������������ "
					dialog "�����. ����������, ����������� "
					dialog "��� ��� ����� �������������. "
					close
					return
				endif
			break
			case 2
				dialog "[������ ������������]"
				dialog "������� �� ���� �������������."
				close
				return
			break
			endchoose
		break
		case 4
			dialog "[������ ������������]"
			dialog "�� �� ������ �������� "
			dialog "^0000cd�� 1 ���� <ITEM> ������������ ����� � ��������� ��� �������� <INFO> 31320 </INFO> </ITEM> �� ^0000cd2 "
			dialog "������ ��������� �����^000000? "
			wait
			choose menu "��." "���."
			case 1
				if (v[Noodle_Festa_Coupon] > 1)
					dialog "[������ ������������]"
					dialog "������� ���������. �������, ��� "
					dialog "��������������� ��. ������������� "
					dialog "���������� � ����������� �� "
					dialog "�����! "
					dropitem Noodle_Festa_Coupon 2
					RentItem C_Pinwheel_Cap_R 86400 0 0 0 0 0
					close
					return
				else
					dialog "[������ ������������]"
					dialog "��������. � ��� ������������ "
					dialog "�����. ����������, ����������� "
					dialog "��� ��� ����� �������������. "
					close
					return
				endif
			break
			case 2
				dialog "[������ ������������]"
				dialog "������� �� ���� �������������."
				close
				return
			break
			endchoose
		break
		case 5
			dialog "[������ ������������]"
			dialog "�� �� ������ �������� "
			dialog "^0000cd�� 1 ���� <ITEM> ������ �������� Midsummer Fan <INFO> 31319 </INFO> </ITEM> �� ^0000cd2 "
			dialog "������ ��������� �����^000000? "
			wait
			choose menu "��." "���."
			case 1
				if (v[Noodle_Festa_Coupon] > 1)
					dialog "[������ ������������]"
					dialog "������� ���������. �������, ��� "
					dialog "��������������� ��. ������������� "
					dialog "���������� � ����������� �� "
					dialog "�����! "
					dropitem Noodle_Festa_Coupon 2
					RentItem C_Fan_Of_Summer_R 86400 0 0 0 0 0
					close
					return
				else
					dialog "[������ ������������]"
					dialog "��������. � ��� ������������ "
					dialog "�����. ����������, ����������� "
					dialog "��� ��� ����� �������������. "
					close
					return
				endif
			break
			case 2
				dialog "[������ ������������]"
				dialog "������� �� ���� �������������."
				close
				return
			break
			endchoose
		break
		case 6
			dialog "[������ ������������]"
			dialog "������� �� ���� �������������."
			close
			return
		break
		endchoose
	case 2
		dialog "[������ ������������]"
		dialog "��� �� �� ������ ����������?"
		wait
		choose menu "������ ������������ ������� - 50 000 ������ � ����." "������ ���������� ������� - 50 000 ������ � ����." "������ ��������� - 50 000 ������ � ����." "������ ��������������� �����-�������� - 50 000 ������ � ����." "������ ������� � �������� ���� - 50 000 ������ � ����." "�������� "
		case 1
			dialog "[������ ������������]"
			dialog " "
			dialog "^0000cd50000 ������ ���������� <ITEM> ����������� ������ ��� ������ <INFO> 20855 </INFO> </ITEM> � ������^000000 "
			dialog "^0000cd�� 1 ����^000000? "
			wait
			choose menu "��." "���."
			case 1
				if (v[VAR_MONEY] > 49999)
					dialog "[������ ������������]"
					dialog "������� ���������. �������, ��� "
					dialog "��������������� ��. ������������� "
					dialog "���������� � ����������� �� "
					dialog "�����! "
					dropgold 50000
					RentItem Rental_Oxygen_Bomb 86400 0 0 0 0 0
					close
					return
				else
					dialog "[������ ������������]"
					dialog "��������. � ��������� ����� ��� "
					dialog "�� ������� �������. ����������, "
					dialog "����������� ��� ��� ����� "
					dialog "�������������. "
					close
					return
				endif
			break
			case 2
				dialog "[������ ������������]"
				dialog "������� �� ���� �������������."
				close
				return
			break
			endchoose
		break
		case 2
			dialog "[������ ������������]"
			dialog "������ ���������� <ITEM> "
			dialog "��������� Surfer Swimsuit <INFO> "
			dialog "15210 </INFO> </ITEM> � ������^000000 ^0000cd�� "
			dialog "1 ����^000000? "
			wait
			choose menu "��." "���."
			case 1
				if (v[VAR_MONEY] > 49999)
					dialog "[������ ������������]"
					dialog "������� ���������. �������, ��� "
					dialog "��������������� ��. ������������� "
					dialog "���������� � ����������� �� "
					dialog "�����! "
					dropgold 50000
					RentItem Rental_SupperSwimsuit 86400 0 0 0 0 0
					close
					return
				else
					dialog "[������ ������������]"
					dialog "��������. � ��������� ����� ��� "
					dialog "�� ������� �������. ����������, "
					dialog "����������� ��� ��� ����� "
					dialog "�������������. "
					close
					return
				endif
			break
			case 2
				dialog "[������ ������������]"
				dialog "������� �� ���� �������������."
				close
				return
			break
			endchoose
		break
		case 3
			dialog "[������ ������������]"
			dialog " "
			dialog "^0000cd50000 �� �� ������ �������� <ITEM> ������ ����� ��� ���������� �������� <INFO> 19275 </INFO> </ITEM> � ������^000000 "
			dialog "^0000cd�� 1 ����^000000? "
			wait
			choose menu "��." "���."
			case 1
				if (v[VAR_MONEY] > 49999)
					dialog "[������ ������������]"
					dialog "������� ���������. �������, ��� "
					dialog "��������������� ��. ������������� "
					dialog "���������� � ����������� �� "
					dialog "�����! "
					dropgold 50000
					RentItem Rental_Scuba_Mask 86400 0 0 0 0 0
					close
					return
				else
					dialog "[������ ������������]"
					dialog "��������. � ��������� ����� ��� "
					dialog "�� ������� �������. ����������, "
					dialog "����������� ��� ��� ����� "
					dialog "�������������. "
					close
					return
				endif
			break
			case 2
				dialog "[������ ������������]"
				dialog "������� �� ���� �������������."
				close
				return
			break
			endchoose
		break
		case 4
			dialog "[������ ������������]"
			dialog "������ �� �� ���������� <ITEM> "
			dialog "����� � ��������� ��� ������� "
			dialog "�������� <INFO> 31320 </INFO> "
			dialog "</ITEM> � ������^000000 ^0000cd�� 1 ���� ^0000cd^000000? "
			wait
			choose menu "��." "���."
			case 1
				if (v[VAR_MONEY] > 49999)
					dialog "[������ ������������]"
					dialog "������� ���������. �������, ��� "
					dialog "��������������� ��. ������������� "
					dialog "���������� � ����������� �� "
					dialog "�����! "
					dropgold 50000
					RentItem C_Pinwheel_Cap_R 86400 0 0 0 0 0
					close
					return
				else
					dialog "[������ ������������]"
					dialog "��������. � ��������� ����� ��� "
					dialog "�� ������� �������. ����������, "
					dialog "����������� ��� ��� ����� "
					dialog "�������������. "
					close
					return
				endif
			break
			case 2
				dialog "[������ ������������]"
				dialog "������� �� ���� �������������."
				close
				return
			break
			endchoose
		break
		case 5
			dialog "[������ ������������]"
			dialog "�� �� ������ �������� ^0000cd50000 Jenny^000000 "
			dialog "��� <ITEM> ������ �������� ��� "
			dialog "������� ������� ������������� "
			dialog "<INFO> 31319 </INFO> </ITEM> "
			dialog "^0000cd�� 1 ����^000000? "
			wait
			choose menu "��." "���."
			case 1
				if (v[VAR_MONEY] > 49999)
					dialog "[������ ������������]"
					dialog "������� ���������. �������, ��� "
					dialog "��������������� ��. ������������� "
					dialog "���������� � ����������� �� "
					dialog "�����! "
					dropgold 50000
					RentItem C_Fan_Of_Summer_R 86400 0 0 0 0 0
					close
					return
				else
					dialog "[������ ������������]"
					dialog "��������. � ��������� ����� ��� "
					dialog "�� ������� �������. ����������, "
					dialog "����������� ��� ��� ����� "
					dialog "�������������. "
					close
					return
				endif
			break
			case 2
				dialog "[������ ������������]"
				dialog "������� �� ���� �������������."
				close
				return
			break
			endchoose
		break
		case 6
			dialog "[������ ������������]"
			dialog "������� �� ���� �������������."
			close
			return
		break
		endchoose
	break
	case 3
		dialog "[������ ������������]"
		dialog "������ ������ �� ������ "
		dialog "������������? ����� ��� ����� "
		dialog "��������� � �������. "
		wait
		dialog "[������ ���������� ����������]"
		dialog "<ITEM> ������ ������� � "
		dialog "���������� <INFO> 20855 </INFO> "
		dialog "</ITEM> - 2 ������ ��� 50 000 "
		dialog "������ <ITEM> ������ ���������� "
		dialog "������� <INFO> 15210 </INFO> "
		dialog "</ITEM> - 2 ������ ��� 50 000 "
		dialog "����� ������ < �����> ������ "
		dialog "����� ��� ���������� �������� "
		dialog "<INFO>19275</INFO> </ITEM> - 2 "
		dialog "������ ��� 50 000 ������ "
		dialog "�������������, �������� ��� "
		dialog "������� � ������ "
		wait
		dialog "[������ ��������� ������������]"
		dialog "<ITEM> ������ ������� �������� "
		dialog "Hat <INFO> 31320 </INFO> </ITEM> "
		dialog "- 2 ������ ��� 50 000 ������ "
		dialog "<ITEM> ������ ������� ����� "
		dialog "������� ������������� <INFO> "
		dialog "31319 </INFO> </ITEM> - 2 ������ "
		dialog "������ ��� 50 000 ������ ������ "
		dialog "������������ � ����� ����� "
		wait
		dialog "[������ ������������]"
		dialog "��� ���? ��� ���-�� �����������?"
		close
		return
	break
	case 4
		dialog "[������ ������������]"
		dialog "������� �� ���� �������������."
		close
		return
	break
	endchoose
else
	dialog "[������ ������������]"
	dialog "���������� ��� ������ ������ ��, "
	dialog "��� ���������� � ������� "
	dialog "����������� ��������� �����. ��� "
	dialog "����. "
	wait
	dialog "[������ ������������]"
	dialog " "
	dialog "<NAVI>_[�����_����������_���������]_����������,_�������_������_��_<INFO>malangdo,140,165,000,0 "
	dialog ",</INFO> </NAVI> � ���������. "
	close
	return
endif

npc "�������� " "PR-�������� Noodle Festival # 17_add01" 4_CAT_3COLOR 164 173 4 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 0
	SetQuestConditionLevel 50 200
	SetQuestConditionEnd
	
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "PR-�������� Noodle Festival#17_add01" "������ ����, ����� ���� � ����� ������? ��� ������ ������� ������� �����?"
return


OnClick:

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����� �������, � �� �������� "
		dialog "�������. ��� ������ ���? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 0) 
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ����! ������ ����, ����� "
	dialog "���� � ����� ������? ��� ������ "
	dialog "������� ������� �����? "
	wait
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ^0000cd��������� �����^000000 � �������� "
	dialog "� ����� �������! ���� �� ������� "
	dialog "������� ����������� � ������� "
	dialog "�����, �� ����������! "
	wait
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ������� � ��������, ����� "
	dialog "�������� ������� ���� ������? �� "
	dialog "����� ��������� ��� ��� ����� "
	dialog "������! "
	wait
	choose menu "������ ����� ������!" "� ����� �����."
	case 1
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "������! ���� �� ����� ����������� "
		dialog "� ��� ����� ����� <ITEM> "
		dialog "������������ ������� <INFO> 25367 "
		dialog "</INFO> </ITEM>, ��������� �� � "
		dialog "���. �� �������� ��� ����� �� "
		dialog "����� ����������. �������, ������ "
		dialog "����������! "
		wait
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����� � ������� ��� ����� ������! "
		dialog "����� ����� ������! ����� ����� "
		dialog "������ !! "
		close
		moveto "malangdo" 214 90
		return
	break
	case 2
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����������� ���������� � ������ "
		dialog "����� ������� ����, ������� "
		dialog "����������� ��������� � ��� � "
		dialog "����� �����! �� �� �����������, "
		dialog "���� � ���������� ���� "
		dialog "�����������! ����� ����� ������! "
		dialog "����� ����� ������ !! "
		close
		return
	break
	endchoose
else
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "��� �������� ������ ��������� "
	dialog "�����? �, � ���� ���� ���� �����! "
	dialog "���� �� ������ ��� ��������� "
	dialog "���������� "
	dialog "^0000cd, � �������� ��� �� ���� �����������^000000. "
	dialog " "
	wait
	choose menu "��������� ����� ������!" "� ����� ����� "
	case 1
		if (v[Promotion_Fan] > 0)
			dialog "[����� �� ������ � "
			dialog "��������������� Noodle Festival] "
			dialog "������! �� �������� ��� ����� "
			dialog "������! ����� ����� ������! ����� "
			dialog "����� ������ !! "
			dropitem Promotion_Fan 1
			close
			moveto "malangdo" 214 90
			return
		else
			dialog "[����� �� ������ � "
			dialog "��������������� Noodle Festival] "
			dialog "���... � �� ���� ���������� "
			dialog "�����������? ����� �� �� �������� "
			dialog "��� ���-������ ���? ����������, "
			dialog "��������� ����� ��������! � "
			dialog "������ ��� ��� � ����� ����� � "
			dialog "������� ����� �������. "
			close
			return
		endif
	break
	case 2
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����������� ���������� � ������ "
		dialog "����� ������� ����, ������� "
		dialog "����������� ��������� � ��� � "
		dialog "����� �����! �� �� �����������, "
		dialog "���� � ���������� ���� "
		dialog "�����������! ����� ����� ������! "
		dialog "����� ����� ������ !! "
		close
		return
	break
	endchoose
endif
return

npc "Payon" "PR-�������� Noodle Festival # 17_add02" 4_CAT_3COLOR 193 108 4 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 0
	SetQuestConditionLevel 50 200
	SetQuestConditionEnd
	
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "PR-�������� Noodle Festival#17_add02" "������ ����, ����� ���� � ����� ������? ��� ������ ������� ������� �����?"
return

OnClick:
if (v[VAR_CLEVEL] < 50)
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ �������������� � ��������� "
	dialog "�����? �����, �� � �����, ���� "
	dialog "����� ��� ������� �����������. "
	close
	return
endif

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����� �������, � �� �������� "
		dialog "�������. ��� ������ ���? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 0) 
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ����! ������ ����, ����� "
	dialog "���� � ����� ������? ��� ������ "
	dialog "������� ������� �����? "
	wait
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ^0000cd��������� �����^000000 � �������� "
	dialog "� ����� �������! ���� �� ������� "
	dialog "������� ����������� � ������� "
	dialog "�����, �� ����������! "
	wait
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ������� � ��������, ����� "
	dialog "�������� ������� ���� ������? �� "
	dialog "����� ��������� ��� ��� ����� "
	dialog "������! "
	wait
	choose menu "������ ����� ������!" "� ����� �����."
	case 1
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "������! ���� �� ����� ����������� "
		dialog "� ��� ����� ����� <ITEM> "
		dialog "������������ ������� <INFO> 25367 "
		dialog "</INFO> </ITEM>, ��������� �� � "
		dialog "���. �� �������� ��� ����� �� "
		dialog "����� ����������. �������, ������ "
		dialog "����������! "
		wait
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����� � ������� ��� ����� ������! "
		dialog "����� ����� ������! ����� ����� "
		dialog "������ !! "
		close
		moveto "malangdo" 214 90
		return
	break
	case 2
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����������� ���������� � ������ "
		dialog "����� ������� ����, ������� "
		dialog "����������� ��������� � ��� � "
		dialog "����� �����! �� �� �����������, "
		dialog "���� � ���������� ���� "
		dialog "�����������! ����� ����� ������! "
		dialog "����� ����� ������ !! "
		close
		return
	break
	endchoose
else
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "��� �������� ������ ��������� "
	dialog "�����? �, � ���� ���� ���� �����! "
	dialog "���� �� ������ ��� ��������� "
	dialog "���������� "
	dialog "^0000cd, � �������� ��� �� ���� �����������^000000. "
	dialog " "
	wait
	choose menu "��������� ����� ������!" "� ����� ����� "
	case 1
		if (v[Promotion_Fan] > 0)
			dialog "[����� �� ������ � "
			dialog "��������������� Noodle Festival] "
			dialog "������! �� �������� ��� ����� "
			dialog "������! ����� ����� ������! ����� "
			dialog "����� ������ !! "
			dropitem Promotion_Fan 1
			close
			moveto "malangdo" 214 90
			return
		else
			dialog "[����� �� ������ � "
			dialog "��������������� Noodle Festival] "
			dialog "���... � �� ���� ���������� "
			dialog "�����������? ����� �� �� �������� "
			dialog "��� ���-������ ���? ����������, "
			dialog "��������� ����� ��������! � "
			dialog "������ ��� ��� � ����� ����� � "
			dialog "������� ����� �������. "
			close
			return
		endif
	break
	case 2
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����������� ���������� � ������ "
		dialog "����� ������� ����, ������� "
		dialog "����������� ��������� � ��� � "
		dialog "����� �����! �� �� �����������, "
		dialog "���� � ���������� ���� "
		dialog "�����������! ����� ����� ������! "
		dialog "����� ����� ������ !! "
		close
		return
	break
	endchoose
endif
return


npc "���������� " "PR-�������� Noodle Festival # 17_add03" 4_CAT_3COLOR 143 115 4 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 0
	SetQuestConditionLevel 50 200
	SetQuestConditionEnd
	
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "PR-�������� Noodle Festival#17_add03" "������ ����, ����� ���� � ����� ������? ��� ������ ������� ������� �����?"
return

OnClick:
if (v[VAR_CLEVEL] < 50)
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ �������������� � ��������� "
	dialog "�����? �����, �� � �����, ���� "
	dialog "����� ��� ������� �����������. "
	close
	return
endif

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����� �������, � �� �������� "
		dialog "�������. ��� ������ ���? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 0) 
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ����! ������ ����, ����� "
	dialog "���� � ����� ������? ��� ������ "
	dialog "������� ������� �����? "
	wait
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ^0000cd��������� �����^000000 � �������� "
	dialog "� ����� �������! ���� �� ������� "
	dialog "������� ����������� � ������� "
	dialog "�����, �� ����������! "
	wait
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ������� � ��������, ����� "
	dialog "�������� ������� ���� ������? �� "
	dialog "����� ��������� ��� ��� ����� "
	dialog "������! "
	wait
	choose menu "������ ����� ������!" "� ����� �����."
	case 1
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "������! ���� �� ����� ����������� "
		dialog "� ��� ����� ����� <ITEM> "
		dialog "������������ ������� <INFO> 25367 "
		dialog "</INFO> </ITEM>, ��������� �� � "
		dialog "���. �� �������� ��� ����� �� "
		dialog "����� ����������. �������, ������ "
		dialog "����������! "
		wait
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����� � ������� ��� ����� ������! "
		dialog "����� ����� ������! ����� ����� "
		dialog "������ !! "
		close
		moveto "malangdo" 214 90
		return
	break
	case 2
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����������� ���������� � ������ "
		dialog "����� ������� ����, ������� "
		dialog "����������� ��������� � ��� � "
		dialog "����� �����! �� �� �����������, "
		dialog "���� � ���������� ���� "
		dialog "�����������! ����� ����� ������! "
		dialog "����� ����� ������ !! "
		close
		return
	break
	endchoose
else
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "��� �������� ������ ��������� "
	dialog "�����? �, � ���� ���� ���� �����! "
	dialog "���� �� ������ ��� ��������� "
	dialog "���������� "
	dialog "^0000cd, � �������� ��� �� ���� �����������^000000. "
	dialog " "
	wait
	choose menu "��������� ����� ������!" "� ����� ����� "
	case 1
		if (v[Promotion_Fan] > 0)
			dialog "[����� �� ������ � "
			dialog "��������������� Noodle Festival] "
			dialog "������! �� �������� ��� ����� "
			dialog "������! ����� ����� ������! ����� "
			dialog "����� ������ !! "
			dropitem Promotion_Fan 1
			close
			moveto "malangdo" 214 90
			return
		else
			dialog "[����� �� ������ � "
			dialog "��������������� Noodle Festival] "
			dialog "���... � �� ���� ���������� "
			dialog "�����������? ����� �� �� �������� "
			dialog "��� ���-������ ���? ����������, "
			dialog "��������� ����� ��������! � "
			dialog "������ ��� ��� � ����� ����� � "
			dialog "������� ����� �������. "
			close
			return
		endif
	break
	case 2
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����������� ���������� � ������ "
		dialog "����� ������� ����, ������� "
		dialog "����������� ��������� � ��� � "
		dialog "����� �����! �� �� �����������, "
		dialog "���� � ���������� ���� "
		dialog "�����������! ����� ����� ������! "
		dialog "����� ����� ������ !! "
		close
		return
	break
	endchoose
endif
return


npc "Geffen" "PR-�������� Noodle Festival # 17_add04" 4_CAT_3COLOR 129 57 4 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 0
	SetQuestConditionLevel 50 200
	SetQuestConditionEnd
	
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "PR-�������� Noodle Festival#17_add04" "������ ����, ����� ���� � ����� ������? ��� ������ ������� ������� �����?"
return

OnClick:
if (v[VAR_CLEVEL] < 50)
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ �������������� � ��������� "
	dialog "�����? �����, �� � �����, ���� "
	dialog "����� ��� ������� �����������. "
	close
	return
endif

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����� �������, � �� �������� "
		dialog "�������. ��� ������ ���? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 0) 
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ����! ������ ����, ����� "
	dialog "���� � ����� ������? ��� ������ "
	dialog "������� ������� �����? "
	wait
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ^0000cd��������� �����^000000 � �������� "
	dialog "� ����� �������! ���� �� ������� "
	dialog "������� ����������� � ������� "
	dialog "�����, �� ����������! "
	wait
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ������� � ��������, ����� "
	dialog "�������� ������� ���� ������? �� "
	dialog "����� ��������� ��� ��� ����� "
	dialog "������! "
	wait
	choose menu "������ ����� ������!" "� ����� �����."
	case 1
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "������! ���� �� ����� ����������� "
		dialog "� ��� ����� ����� <ITEM> "
		dialog "������������ ������� <INFO> 25367 "
		dialog "</INFO> </ITEM>, ��������� �� � "
		dialog "���. �� �������� ��� ����� �� "
		dialog "����� ����������. �������, ������ "
		dialog "����������! "
		wait
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����� � ������� ��� ����� ������! "
		dialog "����� ����� ������! ����� ����� "
		dialog "������ !! "
		close
		moveto "malangdo" 214 90
		return
	break
	case 2
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����������� ���������� � ������ "
		dialog "����� ������� ����, ������� "
		dialog "����������� ��������� � ��� � "
		dialog "����� �����! �� �� �����������, "
		dialog "���� � ���������� ���� "
		dialog "�����������! ����� ����� ������! "
		dialog "����� ����� ������ !! "
		close
		return
	break
	endchoose
else
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "��� �������� ������ ��������� "
	dialog "�����? �, � ���� ���� ���� �����! "
	dialog "���� �� ������ ��� ��������� "
	dialog "���������� "
	dialog "^0000cd, � �������� ��� �� ���� �����������^000000. "
	dialog " "
	wait
	choose menu "��������� ����� ������!" "� ����� ����� "
	case 1
		if (v[Promotion_Fan] > 0)
			dialog "[����� �� ������ � "
			dialog "��������������� Noodle Festival] "
			dialog "������! �� �������� ��� ����� "
			dialog "������! ����� ����� ������! ����� "
			dialog "����� ������ !! "
			dropitem Promotion_Fan 1
			close
			moveto "malangdo" 214 90
			return
		else
			dialog "[����� �� ������ � "
			dialog "��������������� Noodle Festival] "
			dialog "���... � �� ���� ���������� "
			dialog "�����������? ����� �� �� �������� "
			dialog "��� ���-������ ���? ����������, "
			dialog "��������� ����� ��������! � "
			dialog "������ ��� ��� � ����� ����� � "
			dialog "������� ����� �������. "
			close
			return
		endif
	break
	case 2
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����������� ���������� � ������ "
		dialog "����� ������� ����, ������� "
		dialog "����������� ��������� � ��� � "
		dialog "����� �����! �� �� �����������, "
		dialog "���� � ���������� ���� "
		dialog "�����������! ����� ����� ������! "
		dialog "����� ����� ������ !! "
		close
		return
	break
	endchoose
endif
return


npc "������� " "PR-�������� Noodle Festival # 17_add05" 4_CAT_3COLOR 168 87 4 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 0
	SetQuestConditionLevel 50 200
	SetQuestConditionEnd
	
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "PR-�������� Noodle Festival#17_add05" "������ ����, ����� ���� � ����� ������? ��� ������ ������� ������� �����?"
return

OnClick:
if (v[VAR_CLEVEL] < 50)
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ �������������� � ��������� "
	dialog "�����? �����, �� � �����, ���� "
	dialog "����� ��� ������� �����������. "
	close
	return
endif

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����� �������, � �� �������� "
		dialog "�������. ��� ������ ���? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 0) 
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ����! ������ ����, ����� "
	dialog "���� � ����� ������? ��� ������ "
	dialog "������� ������� �����? "
	wait
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ^0000cd��������� �����^000000 � �������� "
	dialog "� ����� �������! ���� �� ������� "
	dialog "������� ����������� � ������� "
	dialog "�����, �� ����������! "
	wait
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ������� � ��������, ����� "
	dialog "�������� ������� ���� ������? �� "
	dialog "����� ��������� ��� ��� ����� "
	dialog "������! "
	wait
	choose menu "������ ����� ������!" "� ����� �����."
	case 1
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "������! ���� �� ����� ����������� "
		dialog "� ��� ����� ����� <ITEM> "
		dialog "������������ ������� <INFO> 25367 "
		dialog "</INFO> </ITEM>, ��������� �� � "
		dialog "���. �� �������� ��� ����� �� "
		dialog "����� ����������. �������, ������ "
		dialog "����������! "
		wait
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����� � ������� ��� ����� ������! "
		dialog "����� ����� ������! ����� ����� "
		dialog "������ !! "
		close
		moveto "malangdo" 214 90
		return
	break
	case 2
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����������� ���������� � ������ "
		dialog "����� ������� ����, ������� "
		dialog "����������� ��������� � ��� � "
		dialog "����� �����! �� �� �����������, "
		dialog "���� � ���������� ���� "
		dialog "�����������! ����� ����� ������! "
		dialog "����� ����� ������ !! "
		close
		return
	break
	endchoose
else
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "��� �������� ������ ��������� "
	dialog "�����? �, � ���� ���� ���� �����! "
	dialog "���� �� ������ ��� ��������� "
	dialog "���������� "
	dialog "^0000cd, � �������� ��� �� ���� �����������^000000. "
	dialog " "
	wait
	choose menu "��������� ����� ������!" "� ����� ����� "
	case 1
		if (v[Promotion_Fan] > 0)
			dialog "[����� �� ������ � "
			dialog "��������������� Noodle Festival] "
			dialog "������! �� �������� ��� ����� "
			dialog "������! ����� ����� ������! ����� "
			dialog "����� ������ !! "
			dropitem Promotion_Fan 1
			close
			moveto "malangdo" 214 90
			return
		else
			dialog "[����� �� ������ � "
			dialog "��������������� Noodle Festival] "
			dialog "���... � �� ���� ���������� "
			dialog "�����������? ����� �� �� �������� "
			dialog "��� ���-������ ���? ����������, "
			dialog "��������� ����� ��������! � "
			dialog "������ ��� ��� � ����� ����� � "
			dialog "������� ����� �������. "
			close
			return
		endif
	break
	case 2
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����������� ���������� � ������ "
		dialog "����� ������� ����, ������� "
		dialog "����������� ��������� � ��� � "
		dialog "����� �����! �� �� �����������, "
		dialog "���� � ���������� ���� "
		dialog "�����������! ����� ����� ������! "
		dialog "����� ����� ������ !! "
		close
		return
	break
	endchoose
endif
return


npc "moc_para01" "PR-�������� Noodle Festival # 17_add06" 4_CAT_3COLOR 40 20 4 5 5

OnInit:
	AddQuestIDCondition 14697
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 0
	SetQuestConditionLevel 50 200
	SetQuestConditionEnd
	
	SetQuestConditionBegin 14697 1 0
	SetQuestConditionQuest 14697 3
	SetQuestConditionEnd
return

OnTouch2:
	Talk2me "PR-�������� Noodle Festival#17_add06" "������ ����, ����� ���� � ����� ������? ��� ������ ������� ������� �����?"
return

OnClick:
if (v[VAR_CLEVEL] < 50)
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ �������������� � ��������� "
	dialog "�����? �����, �� � �����, ���� "
	dialog "����� ��� ������� �����������. "
	close
	return
endif

var gabang_now = GetInventoryRemainCount 1304 3
	if ((gabang_now == 2) | (gabang_now == 3))
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����� �������, � �� �������� "
		dialog "�������. ��� ������ ���? "
		close
		return
	else
	endif

var noodle_14697 = isbegin_quest 14697 
if (noodle_14697 == 0) 
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ����! ������ ����, ����� "
	dialog "���� � ����� ������? ��� ������ "
	dialog "������� ������� �����? "
	wait
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ^0000cd��������� �����^000000 � �������� "
	dialog "� ����� �������! ���� �� ������� "
	dialog "������� ����������� � ������� "
	dialog "�����, �� ����������! "
	wait
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "������ ������� � ��������, ����� "
	dialog "�������� ������� ���� ������? �� "
	dialog "����� ��������� ��� ��� ����� "
	dialog "������! "
	wait
	choose menu "������ ����� ������!" "� ����� �����."
	case 1
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "������! ���� �� ����� ����������� "
		dialog "� ��� ����� ����� <ITEM> "
		dialog "������������ ������� <INFO> 25367 "
		dialog "</INFO> </ITEM>, ��������� �� � "
		dialog "���. �� �������� ��� ����� �� "
		dialog "����� ����������. �������, ������ "
		dialog "����������! "
		wait
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����� � ������� ��� ����� ������! "
		dialog "����� ����� ������! ����� ����� "
		dialog "������ !! "
		close
		moveto "malangdo" 214 90
		return
	break
	case 2
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����������� ���������� � ������ "
		dialog "����� ������� ����, ������� "
		dialog "����������� ��������� � ��� � "
		dialog "����� �����! �� �� �����������, "
		dialog "���� � ���������� ���� "
		dialog "�����������! ����� ����� ������! "
		dialog "����� ����� ������ !! "
		close
		return
	break
	endchoose
else
	dialog "[����� �� ������ � "
	dialog "��������������� Noodle Festival] "
	dialog "��� �������� ������ ��������� "
	dialog "�����? �, � ���� ���� ���� �����! "
	dialog "���� �� ������ ��� ��������� "
	dialog "���������� "
	dialog "^0000cd, � �������� ��� �� ���� �����������^000000. "
	dialog " "
	wait
	choose menu "��������� ����� ������!" "� ����� ����� "
	case 1
		if (v[Promotion_Fan] > 0)
			dialog "[����� �� ������ � "
			dialog "��������������� Noodle Festival] "
			dialog "������! �� �������� ��� ����� "
			dialog "������! ����� ����� ������! ����� "
			dialog "����� ������ !! "
			dropitem Promotion_Fan 1
			close
			moveto "malangdo" 214 90
			return
		else
			dialog "[����� �� ������ � "
			dialog "��������������� Noodle Festival] "
			dialog "���... � �� ���� ���������� "
			dialog "�����������? ����� �� �� �������� "
			dialog "��� ���-������ ���? ����������, "
			dialog "��������� ����� ��������! � "
			dialog "������ ��� ��� � ����� ����� � "
			dialog "������� ����� �������. "
			close
			return
		endif
	break
	case 2
		dialog "[����� �� ������ � "
		dialog "��������������� Noodle Festival] "
		dialog "����������� ���������� � ������ "
		dialog "����� ������� ����, ������� "
		dialog "����������� ��������� � ��� � "
		dialog "����� �����! �� �� �����������, "
		dialog "���� � ���������� ���� "
		dialog "�����������! ����� ����� ������! "
		dialog "����� ����� ������ !! "
		close
		return
	break
	endchoose
endif
return





npc "lasa_sea" "������������� Nyil Pig # 1" 4_F_04 1 2 3 0 0

OnInit:
	cmdothernpc "������������� Nyil Pig # 1" "start"
return

OnClick:
dlgwrite 0 999999
if (input == 1854)
 dialog "������ ���������!"
 wait
elseif (input == 0)
 dialog "�������� "
 close
 return
else
 dialog "������������ ������ "
 close
 return
endif

if npcv "������������� Nyil Pig # 1" [VAR_MYMOBCOUNT] > 0
	dialog "��� ��� "
	close
	return
endif

dialog "[Nyil Pig Switch # 1]"
dialog "�������, ����� ����� �������� "
dialog "��-�� ������. "
wait
choose menu "�������� " "�������� " "�������� " "�������� " "�������� "
case 1
break
case 2
break
case 3
break
case 4
break
case 5
	cmdothernpc "������������� Nyil Pig # 1" "start"
break
endchoose
return

OnTimer: 300000
	cmdothernpc "������������� Nyil Pig # 1" "start"
	stoptimer
return

OnCommand: "start"
	resetmymob
	callmonster "lasa_sea" E_NYAIL_PIG "���� " 134 91
	broadcastinmap2 "EE0000" FW_NORMAL 12 0 0 "���! ���!! �� �� �� ��? ���!!!"
return

OnMyMobDead:
	DelayTime 500
	if npcv "������������� Nyil Pig # 1" [VAR_MYMOBCOUNT] < 1
		resetmymob
		var gamja = 0
		while(1)
			if (gamja < 7)
				var x = rand 113 129
				var y = rand 79 98
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(2)
			if (gamja < 7)
				var x = rand 141 154
				var y = rand 54 81
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(3)
			if (gamja < 6)
				var x = rand 143 157
				var y = rand 94 116
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
	endif
	InitTimer
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "��������� ������� ������! ������������� �������� ������!"
return




npc "lasa_sea" "Nyil Pig Switch02 # 2" 4_F_04 1 4 3 0 0

OnInit:
	cmdothernpc "Nyil Pig Switch02 # 2" "start"
return

OnClick:
dlgwrite 0 999999
if (input == 1854)
 dialog "������ ���������!"
 wait
elseif (input == 0)
 dialog "�������� "
 close
 return
else
 dialog "������������ ������ "
 close
 return
endif

if npcv "Nyil Pig Switch02 # 2" [VAR_MYMOBCOUNT] > 0
	dialog "��� ��� "
	close
	return
endif

dialog "[Nyil Pig Switch02 # 2]"
dialog "�������, ����� ����� �������� "
dialog "��-�� ������. "
wait
choose menu "�������� " "�������� " "�������� " "�������� " "�������� "
case 1
break
case 2
break
case 3
break
case 4
break
case 5
	cmdothernpc "Nyil Pig Switch02 # 2" "start"
break
endchoose
return

OnTimer: 300000
	cmdothernpc "Nyil Pig Switch02 # 2" "start"
	stoptimer
return

OnCommand: "start"
	resetmymob
	callmonster "lasa_sea" E_NYAIL_PIG "���� " 41 41
	broadcastinmap2 "EE0000" FW_NORMAL 12 0 0 "���?? Nyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
return

OnMyMobDead:
	DelayTime 500
	if npcv "Nyil Pig Switch02 # 2" [VAR_MYMOBCOUNT] < 1
		resetmymob
		var gamja = 0
		while(1)
			if (gamja < 7)
				var x = rand 36 74
				var y = rand 29 35
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(2)
			if (gamja < 7)
				var x = rand 27 37
				var y = rand 37 61
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(3)
			if (gamja < 6)
				var x = rand 37 61
				var y = rand 54 62
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
	endif
	InitTimer
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "��������� ������� ������! ������������� �������� ������!"
return



npc "lasa_sea" "Nyil Pig Switch03 # 3" 4_F_04 1 6 3 0 0

OnInit:
	cmdothernpc "Nyil Pig Switch03 # 3" "start"
return

OnClick:
dlgwrite 0 999999
if (input == 1854)
 dialog "������ ���������!"
 wait
elseif (input == 0)
 dialog "�������� "
 close
 return
else
 dialog "������������ ������ "
 close
 return
endif

if npcv "Nyil Pig Switch03 # 3" [VAR_MYMOBCOUNT] > 0
	dialog "��� ��� "
	close
	return
endif

dialog "[Nyil Pig Switch03 # 3]"
dialog "�������, ����� ����� �������� "
dialog "��-�� ������. "
wait
choose menu "�������� " "�������� " "�������� " "�������� " "�������� "
case 1
break
case 2
break
case 3
break
case 4
break
case 5
	cmdothernpc "Nyil Pig Switch03 # 3" "start"
break
endchoose
return

OnTimer: 300000
	cmdothernpc "Nyil Pig Switch03 # 3" "start"
	stoptimer
return

OnCommand: "start"
	resetmymob
	callmonster "lasa_sea" E_NYAIL_PIG "���� " 186 164
	broadcastinmap2 "EE0000" FW_NORMAL 12 0 0 "Nya ~~~ Nyaaaaaaaaaaaaaaaaaaa"
return

OnMyMobDead:
	DelayTime 500
	if npcv "Nyil Pig Switch03 # 3" [VAR_MYMOBCOUNT] < 1
		resetmymob
		var gamja = 0
		while(1)
			if (gamja < 7)
				var x = rand 183 203
				var y = rand 131 150
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(2)
			if (gamja < 7)
				var x = rand 172 185
				var y = rand 156 170
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(3)
			if (gamja < 6)
				var x = rand 189 199
				var y = rand 155 169
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
	endif
	InitTimer
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "��������� ������� ������! ������������� �������� ������!"
return




npc "lasa_sea" "Nyil Pig Switch04 # 4" 4_F_04 1 8 3 0 0

OnInit:
	cmdothernpc "Nyil Pig Switch04 # 4" "start"
return

OnClick:
dlgwrite 0 999999
if (input == 1854)
 dialog "������ ���������!"
 wait
elseif (input == 0)
 dialog "�������� "
 close
 return
else
 dialog "������������ ������ "
 close
 return
endif

if npcv "Nyil Pig Switch04 # 4" [VAR_MYMOBCOUNT] > 0
	dialog "��� ��� "
	close
	return
endif

dialog "[Nyil Pig Switch04 # 4]"
dialog "�������, ����� ����� �������� "
dialog "��-�� ������. "
wait
choose menu "�������� " "�������� " "�������� " "�������� " "�������� "
case 1
break
case 2
break
case 3
break
case 4
break
case 5
	cmdothernpc "Nyil Pig Switch04 # 4" "start"
break
endchoose
return

OnTimer: 300000
	cmdothernpc "Nyil Pig Switch04 # 4" "start"
	stoptimer
return

OnCommand: "start"
	resetmymob
	callmonster "lasa_sea" E_NYAIL_PIG "���� " 71 186
	broadcastinmap2 "EE0000" FW_NORMAL 12 0 0 "���! ���! ���! ���! ���!"
return

OnMyMobDead:
	DelayTime 500
	if npcv "Nyil Pig Switch04 # 4" [VAR_MYMOBCOUNT] < 1
		resetmymob
		var gamja = 0
		while(1)
			if (gamja < 7)
				var x = rand 63 82
				var y = rand 170 193
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(2)
			if (gamja < 7)
				var x = rand 52 93
				var y = rand 186 202
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(3)
			if (gamja < 6)
				var x = rand 46 74
				var y = rand 164 176
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
	endif
	InitTimer
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "��������� ������� ������! ������������� �������� ������!"
return




npc "lasa_sea" "Nyil Pig Switch05 # 5" 4_F_04 1 10 3 0 0

OnInit:
	cmdothernpc "Nyil Pig Switch05 # 5" "start"
return

OnClick:
dlgwrite 0 999999
if (input == 1854)
 dialog "������ ���������!"
 wait
elseif (input == 0)
 dialog "�������� "
 close
 return
else
 dialog "������������ ������ "
 close
 return
endif

if npcv "Nyil Pig Switch05 # 5" [VAR_MYMOBCOUNT] > 0
	dialog "��� ��� "
	close
	return
endif

dialog "[Nyil Pig Switch05 # 5]"
dialog "�������, ����� ����� �������� "
dialog "��-�� ������. "
wait
choose menu "�������� " "�������� " "�������� " "�������� " "�������� "
case 1
break
case 2
break
case 3
break
case 4
break
case 5
	cmdothernpc "Nyil Pig Switch05 # 5" "start"
break
endchoose
return

OnTimer: 300000
	cmdothernpc "Nyil Pig Switch05 # 5" "start"
	stoptimer
return

OnCommand: "start"
	resetmymob
	callmonster "lasa_sea" E_NYAIL_PIG "���� " 147 35
	broadcastinmap2 "EE0000" FW_NORMAL 12 0 0 "�� �� ~ ��! �� �� ~ ��!"
return

OnMyMobDead:
	DelayTime 500
	if npcv "Nyil Pig Switch05 # 5" [VAR_MYMOBCOUNT] < 1
		resetmymob
		var gamja = 0
		while(1)
			if (gamja < 7)
				var x = rand 127 147
				var y = rand 22 43
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(2)
			if (gamja < 7)
				var x = rand 150 163
				var y = rand 22 35
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
		
		var gamja = 0
		while(3)
			if (gamja < 6)
				var x = rand 141 154
				var y = rand 38 61
				ItemDown Pig_Potato 1 x y
				var gamja = gamja + 1
			else
				exitwhile
			endif
		endwhile
	endif
	InitTimer
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "��������� ������� ������! ������������� �������� ������!"
return



warp "lasa_sea" "# 17gook" 17 144 3 5 5

OnTouch2:
	moveto "malangdo" 214 90
return





