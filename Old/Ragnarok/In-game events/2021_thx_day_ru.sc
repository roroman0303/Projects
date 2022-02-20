
npc "alberta" "����#19_thx" 4_F_05 138 169 5 5 5
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
	Talk2me "����#19_thx" "���������� ������� � ��������� �����!"
endif
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[����]"
	dialog "� ������ ������� ������� �������� � ����� ����, ������� ����������� ����� ������ �������� ����������� �� 30 ������."
	close
	return
endif


//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[����]"
	dialog "���� �� ������ ������� ������� � ��������� ����� � ����, ���������� ���������� ���� ���������."
	close
	return
else
endif
//==============================================================================
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[����]"
	dialog "����� ����������! �� ������������ ����, ��� ������� �������� � ����� �������."
	wait
	dialog "[����]"
	dialog "�� ���������� �������! ������� ������� ����������� ������� ������ ����!"
	wait
	dialog "[����]"
	dialog "������� �� �� �������� � ��������� �����, ��� �� �������� � �������� ��������?"
	wait
	choose menu "�����?" "� �� ����� ����."
	case 1
		dialog "[����]"
		dialog "�������� � �������� �������� ��������, ����������� ����."
		wait
		dialog "[����]"
		dialog "�� ��� ������ ���������� ������ �� ��� ����� � ����! � �����, � ��� ����������, �������� ������, ����� �� ������� �� ������ ��� �����!"
		wait
		dialog "[����]"
		dialog "�� �������, ��� � ������� ��� �� ����, ��������� �������� ����� ����������� �������!"
		wait
		dialog "[����]"
		dialog "����, �������� �����, ��� ����, �������������� �� ����, - ��� ������ ���������� � ��������."
		wait
		dialog "[����]"
		dialog "��� ��� ���� ����������, ����� ������������ ���������� ����, ���������� �� ���� � ������ ������, ����� �� ������... � �������� ���� ����� �������������� ���������� ������."
		wait
		dialog "[����]"
		dialog "������ ��� ������ ����������� ���������������. �� ������ ��� ������� ������ �������������� ���������� ���������� �� ������� ������������."
		close
		return
	break
	case 2
		dialog "[����]"
		dialog "��� ������ �� ������ ������� ������� � �����������?"
		wait
		dialog "[����]"
		dialog "��� ����, ����� ����� ������ �������� ���������, ����� ������ ���� �����."
		wait
		dialog "[����]"
		dialog "��� �� ��� ����� ����������, ����� ������ �������� ������! ��� ����� �������� ��������, ������� ����� ������ � ����� ������."
		wait
		dialog "[����]"
		dialog "��� ����� ����������� ^0000cd5 �������� �����, 10 ������ ������ � 1 �������� ������^000000."
		wait
		dialog "[����]"
		dialog "�� �, �������, ����� ������ � �������� �����!"
		wait
		dialog "[����]"
		dialog "���� �� �������� ��, � ��� � ���������, �� ������� ���������� ���������!"
		wait
		dialog "[����]"
		dialog "^0000cd�������� �����^000000 ����� �������� � ������� �����. ��� ������ �� ����� ���������, ������� ����..."
		setquest 3364
		close
		return
	break
	endchoose
elseif (thx_3364 == 1)
	DisableItemMove
	dialog "[����]"
	dialog "�� ������ ����������� � ���������? �� ����������� ��, ��� � ��������?"
	wait
	if ((v[Fire_Arrow] > 0) & (v[Tree_Root] > 9) & (v[Goodly_Bough] > 4))
		dialog "[����]"
		dialog "�������, � ������ �������� �� ��� � �����."
		wait
		ShowEffect "�����#19_thx03" 470
		ShowEffect "�����#19_thx03" 603
		ShowEffect "�����#19_thx03" EF_SIGHTRASHER
		ShowEffect "�����#19_thx01" EF_FIREWALL
		ShowEffect "�����#19_thx02" EF_FIREWALL
		ShowEffect "�����#19_thx03" EF_FIREWALL
		ShowEffect "�����#19_thx04" EF_FIREWALL
		ShowEffect "�����#19_thx05" EF_FIREWALL
		ShowEffect "�����#19_thx06" EF_FIREWALL
		ShowEffect "�����#19_thx07" EF_FIREWALL
		ShowEffect "�����#19_thx08" EF_FIREWALL
		ShowEffect "�����#19_thx09" EF_FIREWALL
		ShowEffect "�����#19_thx10" EF_FIREWALL
		ShowEffect "�����#19_thx11" EF_FIREWALL
		ShowEffect "�����#19_thx12" EF_FIREWALL
		ShowEffect "�����#19_thx13" EF_FIREWALL
		dialog "[����]"
		dialog "���... ������! � ������ �������� ������� �����."
		wait
		ShowEffect "�����#19_thx03" 903
		Talk2me "������#19_thx01" "���! �����!"
		DelayTime 200
		Talk2me "������#19_thx04" "����������� �� ����."
		Talk2me "������#19_thx02" "�� ������ � ������!"
		DelayTime 300
		Talk2me "������#19_thx07" "���������� � �������!"
		Talk2me "������#19_thx05" "������� ������ ��� ������ ������������ � ���� ����."
		DelayTime 300
		Talk2me "������#19_thx03" "����� �������..."
		Talk2me "������#19_thx08" "� �����..."
		dialog "[����]"
		dialog "�� ����� ��������, � ��� �������� ���� �����."
		wait
		dialog "[����]"
		dialog "� � ����� ������� �� ����� ��������� � �� ����� ������������� ������."
		wait
		dialog "[����]"
		dialog "������� �������. ������������ � ���������� �� ��, ��� ������!"
		Talk2me "������#19_thx01" "�������, ��� ������!"
		Talk2me "������#19_thx04" "������..."
		DelayTime 500
		Talk2me "������#19_thx06" "�������!"
		Talk2me "������#19_thx02" "���� �������!"
		Talk2me "������#19_thx05" "������� �� �����."
		DelayTime 300
		Talk2me "������#19_thx03" "����� � ��������� ����� ����� �������!"
		Talk2me "������#19_thx08" "�������!"
		DelayTime 500
		Talk2me "������#19_thx07" "������� ������ �� ���������."
		wait
		ShowEffect "" 603
		dialog "[����]"
		dialog "��������� ����� ������ ����� ���������� � ����� ��� ����� �������� ���. � ��� ��� ��� ������..."
		wait
		dialog "[����]"
		dialog "������ - ����� �� �������,"
		dialog "<NAVI>[������� �������]<INFO>alberta.gat,140,170,0,101,0</INFO></NAVI> ����� ����������� � ���� ����, ���� �� ���������."
		wait
		dialog "[����]"
		dialog "������ - ���������� �����, �� ������ ������������� � <NAVI>[�������]<INFO>alberta.gat,141,188,0,101,0</INFO></NAVI>. ���������� �����, ��� ��������. �������, ��� ��� �� ������ �����������."
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
		dialog "[����]"
		dialog "��... ����� ������� �� �������. �� ������, ��� � ������?"
		wait
		dialog "[����]"
		dialog "������ �����, ��������� ^0000cd5 �������� �����^000000, ^0000cd10 ������ ������^000000, ����� �������� �����, � ^0000cd�������� ������^000000, ����� ������ ���."
		wait
		dialog "[����]"
		dialog "^0000cd�������� �����^000000 ����� �������� � ������� �����. ��� ������ �� ����� ���������, ������� ����..."
		close
		EnableItemMove
		return
	endif
elseif (thx_3364 == 2)
	dialog "[����]"
	dialog "������ ����, ����������. ��� ���� ���������?"
	close
	return
else
	dialog "[����]"
	dialog "����� ����������! �� ������������ ����, ��� ������� ��������!"
	close
	return
endif
return

// =====================================================
npc "alberta" "������#19_thx01" 4_F_BARYO_GIRL 142 168 5 0 0
OnClick:
Talk2me "������#19_thx01" "� ���� ���� � �� ��� ��������� � ���� ������ �����. ��� ��� � ������� ����� ��� �����������."
return
npc "alberta" "������#19_thx02" 4_F_JPN2 145 168 3 0 0
OnClick:
Talk2me "������#19_thx02" "�� ������, ��� ���� ������� �����? � ���������� ������ ������� ���!"
return
npc "alberta" "������#19_thx03" 4_M_RUSCHILD 148 165 3 0 0
OnClick:
Talk2me "������#19_thx03" "��� ����� �������� ����� ����� ������, ��� � � ����� ����."
return
npc "alberta" "������#19_thx04" 4_F_MALAYA 147 161 0 0 0
OnClick:
Talk2me "������#19_thx04" "����� � ���� ����� ������������� ������."
return
npc "alberta" "������#19_thx05" 4_F_CHNWOMAN 144 159 1 0 0
OnClick:
Talk2me "������#19_thx05" "����� ���������� ������ �������..."
return
npc "alberta" "������#19_thx06" 4_F_TWGIRL 141 160 7 0 0
OnClick:
Talk2me "������#19_thx06" "�� ��, ��� ����� ������������ ������� �� ������ ����."
return
npc "alberta" "������#19_thx07" 4_M_THAIAYO 140 163 7 0 0
OnClick:
Talk2me "������#19_thx07" "����� ������ ���� ������ �� ������� � ������ ����, ��� ������ �� ������� ������."
return
npc "alberta" "������#19_thx08" 4_M_DEWWOMAN 140 166 5 0 0
OnClick:
Talk2me "������#19_thx08" "� ���� ����������� ������� �� ������..."
return

// ==========================================================
npc "alberta" "�����#19_thx01" 4_TRACE 144 166 5 0 0
npc "alberta" "�����#19_thx02" 4_TRACE 144 165 5 0 0
npc "alberta" "�����#19_thx03" 4_BONFIRE 144 164 5 0 0
npc "alberta" "�����#19_thx04" 4_TRACE 144 163 5 0 0
npc "alberta" "�����#19_thx05" 4_TRACE 144 162 5 0 0
npc "alberta" "�����#19_thx06" 4_TRACE 142 164 5 0 0
npc "alberta" "�����#19_thx07" 4_TRACE 143 164 5 0 0
npc "alberta" "�����#19_thx08" 4_TRACE 145 164 5 0 0
npc "alberta" "�����#19_thx09" 4_TRACE 146 164 5 0 0
npc "alberta" "�����#19_thx10" 4_TRACE 143 165 5 0 0
npc "alberta" "�����#19_thx11" 4_TRACE 145 165 5 0 0
npc "alberta" "�����#19_thx12" 4_TRACE 143 163 5 0 0
npc "alberta" "�����#19_thx13" 4_TRACE 145 163 5 0 0
// =========================================================
npc "alberta" "������� �������#19_thx" 4_M_SEAMAN 140 170 3 5 5
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
	Talk2me "������� �������#19_thx" "���� � ��� ���� �����, � ���� ��������� ��� ���� ������."
endif
return

OnClick:
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 2)
	dialog "[������� �������]"
	dialog "������ �����? ��� � �����������? � ����� ������, ���� � ���� ���� ����� �� �������, � ���� ������� ���� ���� ������. �������, ���� � '���� ������' ���� ����. ��-��."
	wait
	if (v[Free_Pass_Ticket] < 1)
		dialog "[������� �������]"
		dialog "�� � ����, �������, ��� ������. ���� �� ��� ����? ������� ����� - ����� ���������."
		close
		return
	endif
	dialog "[������� �������]"
	dialog "���� ������� �������?"
	wait
	choose menu "������ " "������ " "���������� " "���������� " "������� " "����� " "����� " "������ "
	case 1
		dialog "[������� �������]"
		dialog "������� ������!"
		DelayTime 200
		Talk2me "������� �������#19_thx" "���������!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "geffen" 132 48
		return
	break
	case 2
		dialog "[������� �������]"
		dialog "������� ������!"
		DelayTime 200
		Talk2me "������� �������#19_thx" "���������!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "comodo" 86 99
		return
	break
	case 3
		dialog "[������� �������]"
		dialog "������� ������!"
		DelayTime 200
		Talk2me "������� �������#19_thx" "���������!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "lighthalzen" 246 76
		return
	break
	case 4
		dialog "[������� �������]"
		dialog "������� ������!"
		DelayTime 200
		Talk2me "������� �������#19_thx" "���������!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "aldebaran" 225 146
		return
	break
	case 5
		dialog "[������� �������]"
		dialog "������� ������!"
		DelayTime 200
		Talk2me "������� �������#19_thx" "���������!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "einbroch" 239 123
		return
	break
	case 6
		dialog "[������� �������]"
		dialog "������� ������!"
		DelayTime 200
		Talk2me "������� �������#19_thx" "���������!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "izlude" 196 180
		return
	break
	case 7
		dialog "[������� �������]"
		dialog "������� ������!"
		DelayTime 200
		Talk2me "������� �������#19_thx" "���������!"
		close
		dropitem Free_Pass_Ticket 1
		moveto "payon" 129 62
		return
	break
	case 8
		dialog "[������� �������]"
		dialog "������ ����."
		close
		return
	break
	endchoose
else
	dialog "[������� �������]"
	dialog "������ �����? ��� � �����������? � ����� ������, ���� � ���� ���� ����� �� �������, � ���� ������� ���� ���� ������. �������, ���� � '���� ������' ���� ����. ��-��."
	wait
	dialog "[������� �������]"
	dialog "�� � ����, �������, ��� ������. ���� �� ��� ����? ������� ����� - ����� ���������."
	close
	return
endif
return

// =====================================================
npc "alberta" "���#19_thx" 4_M_ARUNA_NFM1 134 162 7 5 5
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
	Talk2me "���#19_thx" "������, ������ ��� ������?"
endif
return

OnClick:
//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[���]"
	dialog "���� �� ������ ������� ������� � ���������, ���������� ���� ���������."
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
	dialog "[���]"
	dialog "����������!"
	wait
	choose menu "��� ����������?"
	endchoose
	dialog "[���]"
	dialog "�� ����� �����?"
	wait
	choose menu "� ������� �� ��������� "
	endchoose
	dialog "[���]"
	dialog "�, ��� ������... ��, ���� � ���� ���� �����... ���� � ���� ���� �����... �� ������ ��� ������? ����������... ����������, �� ������� ����."
	wait
	choose menu "������� ������ " "� ������� ����� "
	case 1
		dialog "[���]"
		dialog "��, ��� ������������� ������. � ����������� � ���, ��� ��� ������. � ��������, ��� ���� �������� ����� �������� ��-�� ����, ��� ��� ��������� ������� �������� � ���������..."
		wait
		dialog "[���]"
		dialog "����, �������, ���� ��� ����������, ��������� ������� � ��� �����... ��� � ����� ��������, ��� � �������� ������������� �� �����. "
		wait
		choose menu "����� ������ ��� �����?"
		endchoose
		dialog "[���]"
		dialog "�� ���������� � ���������� ����? � �������� �� �������... � ����� ������, ������� �� �����..."
		wait
		choose menu "�������� �����?"
		endchoose
		dialog "[���]"
		dialog "������, ��� ���� �����, � ������� � �����..."
		wait
		choose menu "������?"
		endchoose
		dialog "[���]"
		dialog "���, ��� ��, ���... �������������! ������... ���������� ��... � ��� � �� �����."
		wait
		dialog "[���]"
		dialog "��� �� ������, � ��������� ^000000���, ��������� �� ����� ������^0000cd ��� ���������� ����� ��� ���������."
		wait
		dialog "[���]"
		dialog "��� ������, ����� �� ������, ����� �� �����... � ����� �� �������������� ������..."
		wait
		dialog "[���]"
		dialog "������, ����� ��� ����� ������������, � ����� ��������� ����� �������� � ���, ����� ���� ���� ���������..."
		wait
		dialog "[���]"
		dialog "������ ��� �������, ��? �� �� ����� ���� ��� ��� ����� ������. ������� ����� ������ ���������� ����� � ����..."
		wait
		dialog "[���]"
		dialog "� � �������� ������� ������ ����� �� �����... ������..."
		wait
		choose menu "��� ���� ������?"
		endchoose
		dialog "[���]"
		dialog "����... ��� ���� ������ � � ����� � �������, ������� ��������� ����... �� ����... ����������������� � ������... ����... � �������� �����, ������� ������ ����� ����� - �������..."
		wait
		choose menu "���..."
		endchoose
		dialog "[���]"
		dialog "���, � �����..."
		wait
		choose menu "���?"
		endchoose
		dialog "[���]"
		dialog "� �����, ��� �����..."
		wait
		dialog "[���]"
		dialog "......"
		Emotion "���#19_thx" 40
		wait
		choose menu "��� ��� ��-�� ����?"
		endchoose
		dialog "[���]"
		dialog "�� ��� ����� ������� �����, ��? ���� � ���, ��� ��� ��� � ��������... ������ ������� ���� ������� ����� ����� ������ ������������� �������!"
		wait
		dialog "[���]"
		dialog "��...? ���� ����������, ���� ����� ����� ���������� ���������� � �� ����� ����� �����, ���� ����� ��������� ���� � �������� �������."
		wait
		dialog "[���]"
		dialog "������� �� �� ��� ����� ��� ����� ������ ��������? ���� ��� ������ ��� ������ ������� � ������? ����� � ���� �������� ����� ����������. ��� ���� ������!"
		wait
		dialog "[���]"
		dialog "� ����� ��� ������ ������������ ����� ������ ���� ������! ��������, ��� � �� ������! ��� �����! �����!"
		wait
		dialog "[���]"
		dialog "���� � ���� ���-�� ������! ���� ��� ����� �� ������� ������� � �� �����������."
		wait
		choose menu "����� "
		endchoose
		dialog "[���]"
		dialog "� ������ �������������� ����� �����... �� � ������ � ���, ��� ���������� ��������� �����..."
		wait
		dialog "[���]"
		dialog "���� ���� �� ����� ������. � ���� �� �����, ��� ����� ���������, ���� �� ���� �� ��������� �����."
		wait
		dialog "[���]"
		dialog "����, � ����� ��� �������� �� ������������ � ���������� ������� �����. � �������� ��� ^0000cd10 �������� �����^000000 � �������� �������������, ����������."
		wait
		dialog "[���]"
		dialog "�����, �������� ��� ������ � ����, �� ������������� ����..."
		completequest 3365
		setquest 3369
		close
		return
	break
	case 2
		dialog "[���]"
		dialog "�... �� ������ ���� ����� �����, ���� � ���� ��� ������� �� �������� ����..."
		wait
		dialog "[���]"
		dialog "��� ��... ��������� � ��� �� ����..."
		close
		return
	break
	endchoose
elseif (thx_3369 == 1)
	DisableItemMove
	if ((v[Goodly_Bough] > 9) & (hunt_chek01 == 2))
		dialog "[���]"
		dialog "��... ����� �������� �����, ��� ���� ������. ��� �� ����� ����� �... ��, � ����� �������, ���..."
		wait
		ShowEffect "�����#19_thx01" EF_POTION4
		dialog "[���]"
		dialog "������-��, �� ����� ������ �������������� � ����� �������! �������, � ��� �� ��������� ��, ��� ��������... �� ���� � � ���� ������ ����������."
		wait
		dialog "[���]"
		dialog "� � ����... ��-��..."
		wait
		choose menu "��� ��� ��� ������?"
		endchoose
		dialog "[���]"
		dialog "� �����, ���� ����� ������ ��� � ������. � �� ���������, ������ �������� �����..."
		wait
		dialog "[���]"
		dialog "� ������ � ��� ��� ���������� �����, ����� �� ������� �������� ���-������ ���������."
		wait
		dialog "[���]"
		dialog "�� ������ �������� ����� � <NAVI>[�������]<INFO>alberta.gat,141,188,0,101,0</INFO></NAVI>, ���� ����� - ���� �������."
		erasequest 3369
		dropitem Goodly_Bough 10
		getitem Harvest_Lottery_Ticket 1
		setquest 3370
		close
		EnableItemMove
		return
	else
		if (v[Goodly_Bough] < 10)
			dialog "[���]"
			dialog "�� �� �������� ������? ����� ����..."
			wait
			dialog "[���]"
			dialog "�� ��������� ��� ��������� ������� �����. � ��� ������������� � ��� �� ����."
			wait
			dialog "[���]"
			dialog "����, �����... � ����� ��� �������� �� ������������ � ���������� ������� �����. � �������� ��� ^0000cd10 �������� �����^000000 � �������� �������������."
			close
			EnableItemMove
			return
		elseif (hunt_chek01 < 2)
			dialog "[���]"
			dialog "��... ��� ������� �� ���� ����������� ��������!"
			wait
			dialog "[���]"
			dialog "�� ��������� ��� ��������� ������� �����. � ��� ������������� � ��� �� ����."
			wait
			dialog "[���]"
			dialog "����, �����... � ����� ��� �������� �� ������������ � ���������� ������� �����. � �������� ��� ^0000cd10 �������� �����^000000 � �������� �������������."
			close
			EnableItemMove
			return
		endif
	endif
elseif (thx_3370 == 1)
	if (time_check01 == 2)
		dialog "[���]"
		dialog "��, ������! ��� ������� ����! ��������� ������������..."
		wait
		choose menu "��� ���� �����?" "������� � ����� "
		case 1
			dialog "[���]"
			dialog "����, �����... � ����� ��� �������� �� ������������ � ���������� ������� �����. � �������� ��� ^0000cd10 �������� �����^000000 � �������� �������������."
			erasequest 3370
			setquest 3369
			close
			return
		break
		case 2
			dialog "[���]"
			dialog "�... �� ������ ���� ����� �����, ���� � ���� ��� ������� �� �������� ����..."
			erasequest 3370
			close
			return
		break
		endchoose
	else
		dialog "[���]"
		dialog "���� ������� ����� ������� ����������... �� �� �����, ��� ��� �������. ����������� ������."
		close
		return
	endif
elseif ((thx_3364 == 2) & (thx_3369 == 0) & (thx_3370 == 0))
	dialog "[���]"
	dialog "��, ������! ��� ������� ����! ��������� ������������..."
	wait
	choose menu "��� ���� �����?" "������� � ����� "
	case 1
		dialog "[���]"
		dialog "����, �����... � ����� ��� �������� �� ������������ � ���������� ������� �����. � �������� ��� ^0000cd10 �������� �����^000000 � �������� �������������."
		setquest 3369
		close
		return
	break
	case 2
		dialog "[���]"
		dialog "�... �� ������ ���� ����� �����, ���� � ���� ��� ������� �� �������� ����..."
		close
		return
	break
	endchoose
else
	dialog "[���]"
	dialog "���� ������� � ��������� ��-�� ����..."
	close
	return
endif

// =====================================================
npc "alberta" "�����#19_thx01" 4_WOODPILE 131 160 5 0 0
npc "alberta" "�����#19_thx02" 4_WOODPILE 132 159 5 0 0
//=========================================================================


// =======================================================
npc "alberta" "������#19_thx" 4_F_JOB_HUNTER 152 198 3 5 5
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
	Talk2me "������#19_thx" "�� ���� �������� ����� ������� � �����������, ��� ���-���� ������!"
endif
return

OnClick:
//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[������]"
	dialog "���� �� ������ ������� ������� � ���������, ���������� ���� ���������."
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
	dialog "[������]"
	dialog "������. �� ����� �� ��������? �� ������ �� �������� �������� �����������, ��� ��������?"
	wait
	choose menu "� ���� ��� ������ "
	endchoose
	dialog "[������]"
	dialog "� ����� �����, ����� ��� ������� ���� � ������ ����... �� �����-������ ������� � ������, ������������ � ������� ���, ������ ��� �� �������?"
	wait
	dialog "[������]"
	dialog "������ ��� ���������� ������, ������� ��� ������, � ������� ������ �� ����, ��� �������. � ��� ����� ���� ���� �������� �� �������..."
	wait
	dialog "[������]"
	dialog "�������, � �������, �� ������ ������ ������� � ���������� �� �����������. ��� ������ ��������� �� �������! �� ���� � ���� �� ������ ����������..."
	wait
	dialog "[������]"
	dialog "������� ��� ����������� ������ ������ ������� ���������� ����� �� ����� �������."
	wait
	dialog "[������]"
	dialog "������ �������� � �������� ���-�� ����, � �� ��������� ������. ������... ����� ���� ��� �� ����� � ���� �����������..."
	wait
	dialog "[������]"
	dialog "�� ���������� ������� ��� �������. ��� ����� ��� ���, �� ��������� �������� ����!"
	wait
	dialog "[������]"
	dialog "��� ������ ����, ����� ������ ��� ������� �������? ��� ���� ���������� �������� �������, �� ��� ��?"
	wait
	choose menu "����� ���������!" "������-�� � ����� "
	case 1
		dialog "[������]"
		dialog "�������! �� �� ���������, ��� ������ ����."
		wait
		dialog "[������]"
		dialog "����� ����� ����� ����������� �������, � ������� ������� ����� ������� ������."
		wait
		dialog "[������]"
		dialog "�������� �� ����� 10 �������� �������. �� ��������, ��, ����������, � ������ ��������."
		completequest 3366
		setquest 3371
		getitem Savage_Trap 1
		close
		return
	break
	case 2
		dialog "[������]"
		dialog "�����. ����� � ��� ����� �����, ������ ������ �����."
		close
		return
	break
	endchoose
elseif (thx_3371 == 1)
	DisableItemMove
	dialog "[������]"
	dialog "�� ���, �� ������ �������?"
	wait
	var thx_trap = v[Captured_Savage]
	if (v[Captured_Savage] > 9)
		dialog "[������]"
		dialog "����... ���... �� ������������, ��������� �� �� ����� �������� �����. � ���� ������� ����������!"
		wait
		dialog "[������]"
		dialog "��� � �������, ��� �����. ������� ������� ����� � <NAVI>[�������]<INFO>alberta.gat,141,188,0,101,0</INFO></NAVI>, ���� ����� - ���� �������."
		wait
		dialog "[������]"
		dialog "����� ����, �����, �� �������� ��� ���������� ����� �� �������, �� ���� ��������� ������ �� ������ ����. �������� <NAVI>[������� �������]<INFO>alberta.gat,140,170,0,101,0</INFO></NAVI>."
		wait
		dialog "[������]"
		dialog "�� ������� ��� ������� � �������� ���� ��������� �������. ���� � ���� ��������� ������ � ������?"
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
		dialog "[������]"
		dialog "��� ����� ������� �� ����� 10 �������� �������."
		close
		EnableItemMove
		return
	endif
elseif (thx_3372 == 1)
	if (time_check01 == 2)
		dialog "[������]"
		dialog "������ ����! ������� ������� ������, �����? � ����� ��� ������ ���������� ����� ���������. �������� ��� �������?"
		wait
		choose menu "�������, � ������ " "� ���� ���������..."
		case 1
			dialog "[������]"
			dialog "�������! �� �� ���������, ��� ������ ����."
			wait
			dialog "[������]"
			dialog "����� ����� ����� ����������� �������, � ������� ������� ����� ������� ������."
			wait
			dialog "[������]"
			dialog "�������� �� ����� 10 �������� �������. �� ��������, ��, ����������, � ������ ��������."
			erasequest 3372
			setquest 3371
			getitem Savage_Trap 1
			close
			return
		break
		case 2
			dialog "[������]"
			dialog "�����. ����� � ��� ����� �����, ������ ������ �����."
			erasequest 3372
			close
			return
		break
		endchoose
	else
		dialog "[������]"
		dialog "�� ������� ��� ������� � �������� ���� ��������� �������. ���� � ���� ��������� ������ ������?"
		close
		return
	endif
elseif ((thx_3364 == 2) & (thx_3371 == 0) & (thx_3372 == 0))
	dialog "[������]"
	dialog "������ ����! ������� ������� ������, �����? � ����� ��� ������ ���������� ����� ���������. �������� ��� �������?"
	wait
	choose menu "�������, � ������ " "� ���� ���������..."
	case 1
		dialog "[������]"
		dialog "�������! �� �� ���������, ��� ������ ����."
		wait
		dialog "[������]"
		dialog "����� ����� ����� ����������� �������, � ������� ������� ����� ������� ������."
		wait
		dialog "[������]"
		dialog "�������� �� ����� 10 �������� �������. �� ��������, ��, ����������, � ������ ��������."
		setquest 3371
		getitem Savage_Trap 1
		close
		return
	break
	case 2
		dialog "[������]"
		dialog "�����. ����� � ��� ����� �����, ������ ������ �����."
		close
		return
	break
	endchoose
else
	dialog "[������]"
	dialog "�� ������� ��� ������� � �������� ���� ��������� �������. ���� � ���� ��������� ������ ������?"
	close
	return
endif
return

// =========================================================
npc "alberta" "���#19_thx" 4_F_TWMIDWOMAN 119 193 3 5 5
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
	Talk2me "���#19_thx" "��� ������ ����, ����� ����������� ������� ���?"
endif
return

OnClick:
//====================================================
var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[���]"
	dialog "���� �� ������ ������� ������� � ���������, ���������� ���� ���������."
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
	dialog "[���]"
	dialog "������, � ������ �� ������ �����. � ��... ����� ��������� ����� ���������?"
	wait
	choose menu "�������� �� ���������� "
	endchoose
	dialog "[���]"
	dialog "������ ����� ����� �����? � ���� ��� ��� ���� ������� ����, � ��������, ����� ������������� � ���������."
	wait
	dialog "[���]"
	dialog "��������� ����, �������, ��������� � ���� ������ �����. �� ������� ����� - ��� ����, ������� ���������� ��������."
	wait
	dialog "[���]"
	dialog "���������� ����� ���� ���������� ����. ��� ��� � �������� ��������� � �����������... �� ���� ��� �����������."
	wait
	dialog "[���]"
	dialog "����� �� ������� �������� �� �����������, ���������� ���� ������ ������������ �����?"
	wait
	var my_food = rand 1 3
	if (my_food == 1)
		dialog "[������]"
		dialog "� ����������! ������ ������� �����������."
		Talk2me "������#19_thx" "� ����������!"
		setquest 3373
		erasequest 3367
		wait
		dialog "[���]"
		dialog "�� ��������?"
		wait
		dialog "[������]"
		dialog "�������. �� ��� �� ��� ��������, � ����� ����..."
		wait
		dialog "[���]"
		dialog "���? ������ �� ���? �����... ���� ������ ����� ����� �����. ����� �������� ���� �����?"
		wait
		dialog "[������]"
		dialog "���������... ������� � ��� ��������� ������� � ����."
		Talk2me "������#19_thx" "���������... ������� � ��� ��������� ������� � ����."
		wait
		dialog "[���]"
		dialog "������ ���������!"
		wait
		dialog "[������]"
		dialog "� �� ���� ��� �����!"
		wait
		dialog "[���]"
		dialog "� ��� ���� ��� ����� �����? ���� ������?"
		wait
		dialog "[������]"
		dialog "������ � ���� �� ��������, �� ��� ��� ��� �����: ^0000cd1 ����� ����, 3 ̸��, 10 ������ �����^000000."
		wait
		dialog "[������]"
		dialog "�������, � ��������!"		
		close
		return
	elseif (my_food == 2)
		dialog "[������]"
		dialog "����� ���� ����� ���?"
		Talk2me "������#19_thx" "����� ���� ����� ���?"
		setquest 3374
		erasequest 3367
		wait
		dialog "[���]"
		dialog "������, ��� �� ��������?"
		wait
		dialog "[������]"
		dialog "��� ����� ���� ����� �������, ������������ ���� ���!"
		wait
		dialog "[���]"
		dialog "� ������, �� �������� ���?"
		wait
		dialog "[������]"
		dialog "�������! ��� ������ ����� ^0000cdƸ���� ��������^000000 � �����."
		Talk2me "������#19_thx" "�������!"
		wait
		dialog "[���]"
		dialog "� ����� ��� �� ��������, ������?"
		wait
		dialog "[������]"
		dialog "������ ��� ��� ���. � ���� ������������� ����� ��� ����� ����, � � �� ���� ��������� ������."
		wait
		dialog "[������]"
		dialog "����������, ������� ^0000cd1 Ƹ���� �������� � 3 ������^000000, ��� �������� ����."
		close
		return
	else
		dialog "[���]"
		dialog "�������, ������ ��� ������� ��������..."
		Talk2me "���#19_thx" "�������, ������ ��� ������� ��������..."
		setquest 3375
		erasequest 3367
		wait
		dialog "[���]"
		dialog "���, � ������� ��� �� ������ �������� ��� �����..."
		wait
		dialog "[���]"
		dialog "��� ����� ��������! ��� �� ����, ��� �� ������ �� ��������� ���..."
		wait
		dialog "[���]"
		dialog "������? ��� �� ���� ������������ ��� �� ���������..."
		wait
		dialog "[���]"
		dialog "��� �� ����� ��� ���������! � ���� ������� ����!"
		Talk2me "���#19_thx" "��� �� ����� ��� ���������!"
		wait
		dialog "[���]"
		dialog "������, �����... ��� � ��� ������� � ����?"
		wait
		dialog "[���]"
		dialog "���������� ��������-�������� �������� � ����� � ������ �� ������."
		wait
		dialog "[���]"
		dialog "�����, �� ����� �������� � ��� �������..."
		wait
		dialog "[���]"
		dialog "������ �� �� ��������� � �������� ����������!"
		wait
		dialog "[���]"
		dialog "��� �� ������� � ���� ��� �� ��������, ��� ����� ���������� ^0000cd1 ������� �����, 10 ������� � 3 ������^000000."
		close
		return
	endif
elseif (thx_3373 == 1)
	DisableItemMove
	dialog "[���]"
	dialog "�� ��� �����? ����� ����������� ��������?"
	wait
	if ((v[Grain] > 0) & (v[Honey] > 2) & (v[Green_Herb] > 9))
		dialog "[���]"
		dialog "���... ����� �� ������! ������ ��� ����� ����� ��� �� �����������."
		wait
		ShowEffect "�����#19_thx03" EF_FIREWALL
		DelayTime 1000
		ShowEffect "�����#19_thx03" 608
		DelayTime 1000
		dialog "[������]"
		dialog "�� ������, ����� ��������!"
		wait
		dialog "[���]"
		dialog "� ���� �������, �������."
		wait
		dialog "[���]"
		dialog "� ���� �������, ������. ��� � �������, ���� ���������� �����."
		dropitem Grain 1
		dropitem Honey 3
		dropitem Green_Herb 10
		getitem Harvest_Lottery_Ticket 2
		erasequest 3373
		setquest 3376
		if (thx_3381 == 0)
			setquest 3381 
			Talk2me "������#19_thx" "� ��� ������..."
			close
			EnableItemMove
			return
		endif
		close
		EnableItemMove
		return
	else
		dialog "[���]"
		dialog "�������, ��� �������� ������? ^0000cd1 ����� ����, 3 ̸��, 10 ������ �����^000000."
		close
		EnableItemMove
		return
	endif
elseif (thx_3374 == 1)
	DisableItemMove
	dialog "[���]"
	dialog "�� ��� �����? ����� ����������� ��������?"
	wait
	if ((v[Yellow_Spice] > 0) & (v[Wooden_Block] > 2))
		dialog "[���]"
		dialog "��� ������ ��������, �������� ������!"
		wait
		dialog "[������]"
		dialog "����� ����� � �����, � � ���� ������� ������."
		wait
		ShowEffect "�����#19_thx02" EF_FIREWALL
		DelayTime 1000
		ShowEffect "�����#19_thx02" 608
		DelayTime 1000
		dialog "[������]"
		dialog "������!"
		wait
		dialog "[���]"
		dialog "������� � ������ �� ����, �� ���������� �� ����."
		wait
		dialog "[���]"
		dialog "������� ���� �������. �� ��������� ��� ���� �������� �����. ��� � �������, ���� ���������� �����."
		dropitem Yellow_Spice 1
		dropitem Wooden_Block 3
		getitem Harvest_Lottery_Ticket 1
		erasequest 3374
		setquest 3376
		if (thx_3385 == 0)
			setquest 3385 
			Talk2me "������#19_thx" "��, ��������� ����!"
			close
			EnableItemMove
			return
		endif

	else
		dialog "[���]"
		dialog "�������, ��� ������� ������? ���: ^0000cd1 Ƹ���� �������� � 3 ������^000000, ��� �������� ����."
		close
		EnableItemMove
		return
	endif
elseif (thx_3375 == 1)
	DisableItemMove
	dialog "[���]"
	dialog "�� ��� �����? ����� ����������� ��������?"
	wait
	if ((v[Plain_Sauce] > 0) & (v[Lemon] > 2) & (v[Carrot] > 9))
		dialog "[���]"
		dialog "�������!"
		wait
		dialog "[���]"
		dialog "����� �� ������ ����, ������ ����, �������, ������... ����� ������ �� ���������!"
		wait
		ShowEffect "�����#19_thx01" EF_FIREWALL
		DelayTime 1000
		ShowEffect "�����#19_thx01" 608
		DelayTime 1000
		dialog "[���]"
		dialog "������. �����, ����� ������ ������� ���������� �������� ����� ������ ������."
		wait
		dialog "[���]"
		dialog "������� � ������ �� ����, �� ���������� �� ����."
		wait
		dialog "[���]"
		dialog "������� ���� �������. �� ��������� ��� ���� �������� �����. ��� � �������, ���� ���������� �����."
		dropitem Plain_Sauce 1
		dropitem Lemon 3
		dropitem Carrot 10
		getitem Harvest_Lottery_Ticket 2
		erasequest 3375
		setquest 3376
		if (thx_3377 == 0)
			setquest 3377 
			Talk2me "���#19_thx" "��� ��� �������� �� �������? ������ ���!"
			close
			EnableItemMove
			return
		endif
	else
		dialog "[���]"
		dialog "������� ��� ������ ���? ��� �� ������� ^0000cd1 ������� �����, 10 ������� � 3 �������^000000."
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
		dialog "[���]"
		dialog "������ �����, �� ����� �����? ������, ���� �� ������� ������� ������������� ����������� ����..."
		wait
		choose menu "������� " "��� ����..."
		case 1
			if (((thx_3377 == 1) | (thx_3377 == 2)) & (thx_3381 == 0) & (thx_3385 == 0))
				var my_food = rand 1 2
				if (my_food == 1)
					dialog "[���]"
					dialog "������ �������� ��������, �� ��� �����: ^0000cd1 ����� ����, 3 ̸��, 10 ������ �����^000000."
					erasequest 3376
					setquest 3373
					close
					return
				else
					dialog "[���]"
					dialog "������ �������� ��������, �� �� �����: ^0000cd1 Ƹ���� ������, 3 ������^000000."
					erasequest 3376
					setquest 3374
					close
					return
				endif
			elseif ((thx_3377 == 0) & ((thx_3381 == 1) | (thx_3381 == 2)) & (thx_3385 == 0))
				var my_food = rand 1 2
				if (my_food == 1)
					dialog "[���]"
					dialog "������ �������� ��������, �� �� �����: ^0000cd1 Ƹ���� ������, 3 ������^000000."
					erasequest 3376
					setquest 3374
					close
					return
				else
					dialog "[���]"
					dialog "��� �������� ��������, �� ��� �����: ^0000cd1 ������ ����, 3 ������, 10 �������^000000."
					erasequest 3376
					setquest 3375
					close
					return
				endif
			elseif ((thx_3377 == 0) & (thx_3381 == 0) & ((thx_3385 == 1) | (thx_3385 == 2)))
				var my_food = rand 1 2
				if (my_food == 1)
					dialog "[���]"
					dialog "������ �������� ��������, �� ��� �����: ^0000cd1 ����� ����, 3 ̸��, 10 ������ �����^000000."
					erasequest 3376
					setquest 3373
					close
					return
				else
					dialog "[���]"
					dialog "��� �������� ��������, �� ��� �����: ^0000cd1 ������ ����, 3 ������, 10 �������^000000."
					erasequest 3376
					setquest 3375
					close
					return
				endif
			elseif ((thx_3375 == 0) | (thx_3377 == 0)) & ((thx_3381 == 1) | (thx_3381 == 2)) & ((thx_3385 == 1) | (thx_3385 == 2))
					dialog "[���]"
					dialog "��� �������� ��������, �� ��� �����: ^0000cd1 ������ ����, 3 ������, 10 �������^000000."
					erasequest 3376
					setquest 3375
					close
					return
			elseif ((thx_3373 == 0) | (thx_3381 == 0)) & ((thx_3377 == 1) | (thx_3377 == 2)) & ((thx_3385 == 1) | (thx_3385 == 2))
					dialog "[���]"
					dialog "������ �������� ��������, �� ��� �����: ^0000cd1 ����� ����, 3 ̸��, 10 ������ �����^000000."
					erasequest 3376
					setquest 3373
					close
					return
			elseif ((thx_3374 == 0) | (thx_3385 == 0)) & ((thx_3377 == 1) | (thx_3377 == 2)) & ((thx_3381 == 1) | (thx_3381 == 2))
					dialog "[���]"
					dialog "������ �������� ��������, �� �� �����: ^0000cd1 Ƹ���� ������, 3 ������^000000."
					erasequest 3376
					setquest 3374
					close
					return
			else
				var my_feed = rand 1 3
				if (my_feed == 1)
					dialog "[���]"
					dialog "������ �������� ��������, �� ��� �����: ^0000cd1 ����� ����, 3 ̸��, 10 ������ �����^000000."
					erasequest 3376
					setquest 3373
					close
					return
				elseif (my_feed == 2)
					dialog "[���]"
					dialog "������ �������� ��������, �� �� �����: ^0000cd1 Ƹ���� ������, 3 ������^000000."
					erasequest 3376
					setquest 3374
					close
					return
				else
					dialog "[���]"
					dialog "��� �������� ��������, �� ��� �����: ^0000cd1 ������ ����, 3 ������, 10 �������^000000."
					erasequest 3376
					setquest 3375
					close
					return
				endif
			endif
		break
		case 2
			dialog "[���]"
			dialog "�� ������ ������ ����������, ��� ��������� ���? ������ ���������, �� �� �������, ����������."
			close
			return
		break
		endchoose
	else
		dialog "[���]"
		dialog "�� ��� ������? �� ������ ���� ������� � ��� ������ �� �����, �������. ������������� ������."
		close
		return
	endif

else
	dialog "[���]"
	dialog "���� ��������� ���������� �� ���� ���������. ��� ��� �������..."
	close
	return
endif
return

// =======================================================
npc "alberta" "������#19_thx" 4_M_DWARF 119 198 3 0 0
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
	dialog "[������]"
	dialog "���� �� ������ ������� ������� � ���������, ���������� ���� ���������."
	close
	return
else
endif
//==============================================================================
Talk2me "������#19_thx" "�� ������ ����������... �������� ��������, ������ ����?"
var thx_3381 = isbegin_quest 3381
var thx_3382 = isbegin_quest 3382
var thx_3383 = isbegin_quest 3383
var thx_3384 = isbegin_quest 3384
var thx_time = checkquest_playtime 3384
if (thx_3381 == 1)
	dialog "[������]"
	dialog "�, �����������. ��� �� �������� ��� � ����������� ������?"
	wait
	choose menu "��, ��� � "
	endchoose
	dialog "[������]"
	dialog "������ ��� � ���� ��������� ������ � ���� ����� ������� ������, ��� ��� �� ������ ���� ��������� � ������."
	wait
	dialog "[������]"
	dialog "��... ��� ���� ����� ������ ������ ���� �����..."
	wait
	dialog "[������]"
	dialog "��� ������� ����� ��������� �����, � ��������, �� � � �����������... �� �� ������, ��� ������..."
	wait
	dialog "[������]"
	dialog "����� �� �� ������������ � ������ �����������..."
	wait
	dialog "[������]"
	dialog "� �� ��� � ��� ����������, �� ����� � ���� ������� ���� ���� �����?"
	wait
	dialog "[������]"
	dialog "����, ������ �� �� ��������, ���� � ���� ����� �� ������, �����?"
	wait
	choose menu "������� "
	endchoose
	dialog "[������]"
	dialog "�� ��� ����, ����� ��� ��������� ����, ����� ������� ���-�� ������ �� �������..."
	wait
	choose menu "� ������� ������ " "������-�� � �����..."
		case 1
			dialog "[������]"
			dialog "������� ���� �������! ��� �� � ��� ���� �����..."
			wait
			dialog "[������]"
			dialog "����������, ������� ^0000cd2 ������ �� �������^000000, ����� � ��� ��������� � ������� ����."
			close
			completequest 3381
			setquest 3382
			return
		break
		case 2
			dialog "[������]"
			dialog "�, �������... ������..."
		break
	endchoose
endif

if (thx_3382 == 1)
	if (v[Free_Pass_Ticket] > 1)
		dialog "[������]"
		dialog "��� ������! ��� �������."
		wait
		dialog "[������]"
		dialog "������, � ���� ����� ���������� ^0000cd2 ���������� ������^000000... � � ��� ����������� �� ����� ����, � ��� ��� ���������� ������ �� �����."
		completequest 3382
		setquest 3384
		dropitem Free_Pass_Ticket 2
		getitem Harvest_Lottery_Ticket 2 
		close
	else
		dialog "[������]"
		dialog "����������, ������� ^0000cd2 ������ �� �������^000000, ����� � ��� ��������� ��� ���� �����."
		close
		return
	endif
endif

if (thx_3384 == 1)
	if (thx_time == 2)
	dialog "[������]"
	dialog "�, ����������� �����!"
	wait
	dialog "[������]"
	dialog "�������, � ���� ������ ������� ^0000cd2 ������ �� �������^000000, ��� ��� ��� �� ����������� ��� �������..."
	wait
	dialog "[������]"
	dialog "� �� ��� � ����� ����������. ������ �� �� ��������, ���� � ���� ����� �� ������, �����?"
	wait
	choose menu "� ������� ������ " "������-�� � �����..."
		case 1
			dialog "[������]"
			dialog "������� ���� �������! ��� �� � ��� ���� �����..."
			wait
			dialog "[������]"
			dialog "����������, ������� ^0000cd2 ������ �� �������^000000, ����� � ��� ��������� � ������� ����."
			close
			erasequest 3384
			setquest 3383
			return
		break
		case 2
			dialog "[������]"
			dialog "�, �������... ������..."
		break
	endchoose
	else
		dialog "[������]"
		dialog "������� ���� �������, ��� �������. ����� ����� ��������� ����� ��� � ������..."
		wait
		dialog "[������]"
		dialog "� ����, ��� ���� ��������. ���� ����������� �� ������!"
		close
		return
	endif
endif
	
if ((thx_3383 == 1) & (thx_3384 == 0))
	if (v[Free_Pass_Ticket] > 1)
		dialog "[������]"
		dialog "��� ������! ��� �������."
		wait
		dialog "[������]"
		dialog "������, � ���� ����� ���������� ^0000cd2 ���������� ������^000000... � � ��� ����������� �� ����� ����, � ��� ��� ���������� ������ �� �����."
		erasequest 3383
		setquest 3384
		dropitem Free_Pass_Ticket 2
		getitem Harvest_Lottery_Ticket 2
		close
		return
	else
		dialog "[������]"
		dialog "����������, ������� ^0000cd2 ������ �� �������^000000, ����� � ��� ��������� ��� ���� �����."
		close
		return
	endif
endif

//================================================================================================
		
return

npc "alberta" "�����#19_thx03" 4_TRACE 118 197 1 0 0
OnClick:
Talk2me "������#19_thx" "���, �� ��������� ������ � ����!"
Talk2me "������#19_thx" "����� �� ��� ������ ��������."
return

//=========================================================
npc "alberta" "������#19_thx" 4_M_CHNCOOK 117 198 3 0 0
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
	dialog "[������]"
	dialog "���� �� ������ ������� ������� � ���������, ���������� ���� ���������."
	close
	return
else
endif
//==============================================================================
Talk2me "������#19_thx" "� ������ ����� ������� ����� �� ��������� ������. ���� ������ ������� ���� ����, ����� �� ����� �� ����..."
var thx_3385 = isbegin_quest 3385
var thx_3386 = isbegin_quest 3386
var thx_3387 = isbegin_quest 3387
var thx_3388 = isbegin_quest 3388
var thx_time = checkquest_playtime 3388
if (thx_3385 == 1)
	dialog "[������]"
	dialog "�, ������, ������ ������� �� ���� ����������?"
	wait
	dialog "[������]"
	dialog "...������, ��� ��� ������� � ���� ����������, ������-�� ��� �� �������� �� ������."
	wait
	dialog "[������]"
	dialog "� ��� �������, � ����� ��������� � ���� �������. � �� ���������� � ����� ���������..." 
	wait
	dialog "[������]"
	dialog "�� ��� �� �� ������?"
	wait
	choose menu "��... � �� ��������."
	endchoose
	dialog "[������]"
	dialog "�������. ��-��. �� ��� � �� �����..."
	wait
	choose menu "������?"
	endchoose
	dialog "[������]"
	dialog "��������� � �������, ������� �����, �������� � ��������� ����� ���������, ������������� � ��������..."
	wait
	dialog "[������]"
	dialog "�� ����... ��� �����. ��-��! ��� ��� ����� ���� �������?"
	wait
	dialog "[������]"
	dialog "������� ��� ������ �������� �� �������, ��� ������� ����������."
	wait
	dialog "[������]"
	dialog "�����, ��� � ��� ����� ������� ������� ^0000cd������������� �������^000000, ����������� ���� ���� �����."
	wait
	dialog "[������]"
	dialog "����� ����, �������� ������ ���� ������� ����� ��� ������������."
	wait
	choose menu "������� ����� �������?" 
	endchoose
	dialog "[������]"
	dialog "�����, ��� 10 ���� ������ ������."
	wait
	dialog "[������]"
	dialog "�� ���, ������� ��� ������? � ����� ���� ���� ^0000cd���������� �����^000000, ���� �� ����������."
	wait
	choose menu "������� ������ " "� �����..."
	case 1
		dialog "[������]"
		dialog "�������! ^0000cd10 ������������� �������^000000, �������?"
		completequest 3385
		setquest 3386
		close
		return
	break
	case 2
		dialog "[������]"
		dialog "������, �� ��������..."
		wait
		dialog "[������]"
		dialog "������� �����������, ����� � �������� ���������� ��������� ���� ���������..."
		close
		return
	break
	endchoose
endif

if (thx_3386 == 1)
	if (v[Harvest_Cookie] > 9)
		dialog "[������]"
		dialog "�������! �������, �������, ������� ������������, �� ��������� �� �������� ������ �����."
		wait
		dialog "[������]"
		dialog "������� �� ������, ��� ���� �����. �����, �� ������ ��������� � ������, ����������� �� ������ � ������, � � ����..."
		completequest 3386
		setquest 3388
		dropitem Harvest_Cookie 10
		getitem Harvest_Lottery_Ticket 1 
		close
	else
		dialog "[������]"
		dialog "^0000cd10 ������������� �������^000000, �������? � ������ �� �������..."
		close
		return
	endif
endif

if (thx_3388 == 1)
	if (thx_time == 2)
		dialog "[������]"
		dialog "������, ������� �� �������� ��� ^0000cd������������ �������^000000?"
		wait
		dialog "[������]"
		dialog "��� ���, ��� �� ����������� ��� ��������� ����. ����������� ��� �����������."
		wait
		choose menu "� ������� ��� " "� ������� �����..."
		case 1
			dialog "[������]"
			dialog "� �����, ��� �� ���� ����� ����������!"
			wait
			dialog "[������]"
			dialog "^0000cd10 ������������� �������^000000, �������? � ������ �� �������..."
			close
			setquest 3387
			erasequest 3388
			return
		break
		case 2
			dialog "[������]"
			dialog "..."
			wait
			dialog "[������]"
			dialog "������ ���������, ������ ����..."
			close
			return
		break
		endchoose
	else
		dialog "[������]"
		dialog "������� ��� ��� �� ������, ��� ���������� ��������."
		wait
		dialog "[������]"
		dialog "��, ������ ������, � �����, ��� ������ ����� ��� ������ ��������... � ��� �� ����� �� �������� ���� ������."
		close
		return
	endif
endif

if ((thx_3387 == 1) & (thx_3388 == 0))
	if (v[Harvest_Cookie] > 9)
		dialog "[������]"
		dialog "�������! �������, �������, ������� ������������, �� ��������� �� �������� ������ �����."
		wait
		dialog "[������]"
		dialog "������� �� ������, ��� ���� �����. �����, �� ������ ��������� � ������, ����������� �� ������ � ������, � � ����..."
		erasequest 3387
		setquest 3388
		dropitem Harvest_Cookie 10
		getitem Harvest_Lottery_Ticket 1
		close
		return
	else
		dialog "[������]"
		dialog "^0000cd10 ������������� �������^000000, �������? � ������ �� �������..."
		close
		return
	endif
endif
return

npc "alberta" "�����#19_thx02" 4_TRACE 116 197 1 0 0
OnClick:
Talk2me "������#19_thx" "���, �� ��������� ������ � ����!"
Talk2me "������#19_thx" "����� �� ��� ������ ��������."
return

// =======================================================


npc "alberta" "���#19_thx" 4_COOK 115 198 3 4 4
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
	dialog "[���]"
	dialog "���� �� ������ ������� ������� � ���������, ���������� ���� ���������."
	close
	return
else
endif
//==============================================================================
Talk2me "���#19_thx" "�� ���� ���� ������ ��� ������ ���� �����..."
var thx_3377 = isbegin_quest 3377
var thx_3378 = isbegin_quest 3378
var thx_3379 = isbegin_quest 3379
var thx_3380 = isbegin_quest 3380
var thx_time = checkquest_playtime 3380
if (thx_3377 == 1)
	dialog "[���]"
	dialog "��, ��������. ������-��."
	wait
	choose menu "��� ���������?"
	endchoose
	dialog "[���]"
	dialog "������ �� ���������... ������, � �� ����� ��������� ���� ����������� ���-���."
	wait
	dialog "[���]"
	dialog "������, � � ���� ������� �������?"
	wait
	dialog "[���]"
	dialog "��... ������ �� �������� ���... ������� �� ���� �� ������� ����-�� �������."
	wait
	dialog "[���]"
	dialog "�����. �����, � ����� ����� ���� ����������."
	wait
	dialog "[���]"
	dialog "���� ���-������ ���� ��������, ��� � ���� ������� ���� ����� ����������� �����."
	wait
	dialog "[���]"
	dialog "� �� ��� ������ ��� ����� ����-������ ���������� - ����� � �������."
	wait
	dialog "[���]"
	dialog "� ���� ��� ����� �� ��������, � � ���� ��� ��������� ��� �������� � ������������� ���� �������..."
	wait
	dialog "[���]"
	dialog "� ��� �������... ����� ��������� � ���� �� ����� �������� - ���������� ����� ��������� � ������������ �������."
	wait
	dialog "[���]"
	dialog "��, �������, ��� ������ ���������� ����� ��� ����������� ����� ����� ^0000cd����� ��������� � ������ �����^000000."
	wait
	dialog "[���]"
	dialog "��, ���? �� �������� ��� ����������� ��� �����������? �����, � ���� �� ������ ���� ���� ��������� � �������� ������������ �������."
	wait
	choose menu "� ������ " "�������� ����..."
	case 1
		dialog "[���]"
		dialog "��� �� ����������. �... �� ����, �� ���� ����������� �� ���� �������, ���� � ��� ���������."
		wait
		dialog "[���]"
		dialog "������ � ��� �������, ��� ��� ������� - ������. ����� ��� ^0000cd������������ �������^000000."
		wait
		dialog "[���]"
		dialog "���... ���������..."
		wait
		dialog "[���]"
		dialog "��� ����������� ^0000cd30 ����� ���������, 20 ������������� ������� � 20 ������ �����^000000."
		wait
		choose menu "� ������� " "������-�� � �����..."
		case 1 
			dialog "[���]"
			dialog "�������, ������� �� ��������. � � ���� ����� �������� ������ � ��������� �����."
			completequest 3377
			setquest 3378
			close
			return
		break
		case 2
			dialog "[���]"
			dialog "�������, �����!"
			wait
			dialog "[���]"
			dialog "��� ������! � ������ ��� ��� �������� ����������� �������... ������� ����! ����?"
			close
			return
		break
		endchoose
	break
	case 2
		dialog "[���]"
		dialog "������ ��������? ������ �� �� ���������! "
		Talk2me "���#19_thx" "������ �� �� ���������!"
		wait
		dialog "[���]"
		dialog "��� �� ����� ���� ������������ ��������� ��������� �����..."
		close
		return
	break
	endchoose
endif

if (thx_3377 == 3) & (thx_3380 == 0)
	dialog "[���]"
	dialog "������, � � ���� ������� �������?"
	wait
	dialog "[���]"
	dialog "��... ������ �� �������� ���... ������� �� ���� �� ������� ����-�� �������."
	wait
	dialog "[���]"
	dialog "�����. �����, � ����� ����� ���� ����������."
	wait
	dialog "[���]"
	dialog "���� ���-������ ���� ��������, ��� � ���� ������� ���� ����� ����������� �����."
	wait
	dialog "[���]"
	dialog "� �� ��� ������ ��� ����� ����-������ ���������� - ����� � �������."
	wait
	dialog "[���]"
	dialog "� ���� ��� ����� �� ��������, � � ���� ��� ��������� ��� �������� � ������������� ���� �������..."
	wait
	dialog "[���]"
	dialog "� ��� �������... ����� ��������� � ���� �� ����� �������� - ���������� ����� ��������� � ������������ �������."
	wait
	dialog "[���]"
	dialog "��, �������, ��� ������ ���������� ����� ��� ����������� ����� ����� ^0000cd����� ��������� � ������ �����^000000."
	wait
	dialog "[���]"
	dialog "��, ���? �� �������� ��� ����������� ��� �����������? �����, � ���� �� ������ ���� ���� ��������� � �������� ������������ �������."
	wait
	choose menu "� ������ " "�������� ����..."
	case 1
		dialog "[���]"
		dialog "��� �� ����������. �... �� ����, �� ���� ����������� �� ���� �������, ���� � ��� ���������."
		wait
		dialog "[���]"
		dialog "������ � ��� �������, ��� ��� ������� - ������. ����� ��� ^0000cd������������ �������^000000."
		wait
		dialog "[���]"
		dialog "���... ���������..."
		wait
		dialog "[���]"
		dialog "��� ����������� ^0000cd30 ����� ���������, 20 ������������� ������� � 20 ������ �����^000000."
		wait
		choose menu "� ������� " "������-�� � �����..."
		case 1 
			dialog "[���]"
			dialog "�������, ������� �� ��������. � � ���� ����� �������� ������ � ��������� �����."
			completequest 3377
			setquest 3378
			close
			return
		break
		case 2
			dialog "[���]"
			dialog "�������, �����!"
			wait
			dialog "[���]"
			dialog "��� ������! � ������ ��� ��� �������� ����������� �������... ������� ����! ����?"
			close
			return
		break
		endchoose
	break
	case 2
		dialog "[���]"
		dialog "������ ��������? ������ �� �� ���������! "
		Talk2me "���#19_thx" "������ �� �� ���������!"
		wait
		dialog "[���]"
		dialog "��� �� ����� ���� ������������ ��������� ��������� �����..."
		close
		return
	break
	endchoose
endif
	
if (thx_3378 == 1)
	if (v[Grasshopper's_Leg] > 29 ) & (v[Green_Herb] > 19) & (v[Harvest_Cookie] > 19)
		dialog "[���]"
		dialog "��� �� ��������? � ��� ����� ������������ � ���, ��� �� ���� �������!"
		wait
		dialog "[���]"
		dialog "������, �� ����� ����� � ������?"
		wait
		dialog "[���]"
		dialog "����, ��� �����. ������ ����� ��������, ���������, ��� ��... �� ����, ���� ����� ������ ����������. "
		wait
		dialog "[���]"
		dialog "� ���� ������ ���� ��������� � ��������, ��� �����. � � �������, ������-�� ���� ���������� �����. ��� �������."
		completequest 3378
		setquest 3380
		dropitem Grasshopper's_Leg 30
		dropitem Green_Herb 20
		dropitem Harvest_Cookie 20
		getitem C_Autumnal_Flavor 1
		getitem Harvest_Lottery_Ticket 1
		close
		return
	else
		dialog "[���]"
		dialog "�������, � ��� � ���� ������?"
		wait
		dialog "[���]"
		dialog "��� ����������� ��� ����� - ^0000cd30 ����� ���������, 20 ������������� ������� � 20 ������ �����^000000."
		close
		return
	endif
endif


if (thx_3380 == 1)
	if (thx_time == 2)
		dialog "[���]"
		dialog "��������! �� �����."
		wait
		dialog "[���]"
		dialog "�������� ������� - �� ����� ����������� ����!"
		wait
		dialog "[���]"
		dialog "����, ��� ��������� �����������... �� ����! �����, ��� ��� ���� ���������� ���������� ���� ���� � �����!"
		wait
		choose menu "� ���� ��� ����� " "�����, �� ����� "
		case 1 
			dialog "[���]"
			dialog "������, ����� ��������� ����������� ��� � �������."
			wait
			dialog "[���]"
			dialog "��� ����������� ��� ����� - ^0000cd30 ����� ���������, 20 ������������� ������� � 20 ������ �����^000000."
			close
			erasequest 3380
			setquest 3379
			return
		break
		case 2
			dialog "[���]"
			dialog "��� ������ '�� �����'?"
			wait
			dialog "[���]"
			dialog "�� �� ����� ������������!"
			close
			return
		break
		endchoose
	else
		dialog "[���]"
		dialog "�������, ��� �� �� ��� ���������... �����, ��� ����� ����� ������ ���� �����������."
		wait
		dialog "[���]"
		dialog "�, ����! ��! �������� ����� �����! ������ �� ������� �� ��������!"
		Talk2me "���#19_thx" "��! �������� ����� �����! ������ �� ������� �� ��������!"
		close
		return
	endif
endif

if ((thx_3379 == 1) & (thx_3380 == 0))
	if (v[Grasshopper's_Leg] > 29 ) & (v[Green_Herb] > 19) & (v[Harvest_Cookie] > 19)
		dialog "[���]"
		dialog "������, �� ����� ����� � ������?"
		wait
		dialog "[���]"
		dialog "����, ��� �����. ������ ����� ��������, ���������, ��� ��... �� ����, ���� ����� ������ �������."
		wait
		dialog "[���]"
		dialog "������-�� ��� ���������� ������. ��� ��� ��������� �� ����������� �����������... ������ ������..."
		erasequest 3379
		setquest 3380
		dropitem Grasshopper's_Leg 30
		dropitem Green_Herb 20
		dropitem Harvest_Cookie 20
		getitem Harvest_Lottery_Ticket 2
		close
		return
	else
		dialog "[���]"
		dialog "�������, � ��� � ���� ������?"
		wait
		dialog "[���]"
		dialog "��� ����������� ��� ����� - ^0000cd30 ����� ���������, 20 ������������� ������� � 20 ������ �����^000000."
		close
		return
	endif
endif

//================

npc "alberta" "�����#19_thx01" 4_TRACE 114 197 1 0 0
OnClick:
Talk2me "������#19_thx" "���, �� ��������� ������ � ����!"
Talk2me "������#19_thx" "����� �� ��� ������ ��������."
Talk2me "���#19_thx" "�� ������ ���������, ������ ����� � ����!"
return

// ====================================================
npc "alberta" "�������� ���#19_thx" 4_EP16_FOOD 119 190 3 0 0
OnClick:
return

// ====================================================

npc "alberta" "������� �������#19_thx" 4_M_KHMAN 141 188 3 0 0
OnInit:

NpcOverBMP "group_3"
NpcSecondName "<�������>"

OnClick:
//====================================================

var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[������� �������]"
	dialog "���� �� ������ ������� ������� � ���������, ���������� ���� ���������."
	close
	return
else
endif
//==============================================================================	
	var whilechk = 0
	dialog "[������� �������]"
	dialog "����� ���������� �� ��������� ���� � �����!"
	wait
	dialog "[������� �������]"
	dialog "���������! ���������� � �������!"
	wait
	dialog "[������� �������]"
	dialog "��� ������� ����� ����� ���� ^0000cd1 ���������� �����^000000."
	wait
	while(1)
//====================================================

var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[������� �������]"
	dialog "���� �� ������ ������� ������� � �������, ���������� ���� ���������."
	close
	return
else
endif
//==============================================================================	
	if (whilechk > 0)
		dialog "[������� �������]"
		dialog "������ ����� �����������?"
		wait
	else
		dialog "[������� �������]"
		dialog "������ �����������?"
		wait
	endif

	choose menu "�� " "���� "
	case 1 
		if (v[Harvest_Lottery_Ticket] > 0)
			dropitem Harvest_Lottery_Ticket 1
			ConsumePackageItem Season_Evt_Reward
			dialog "[������� �������]"	
			dialog "���... ������! "
			dialog "��� ��� �������!"
			var whilechk = whilechk + 1
			close
		else
			dialog "[������� �������]"
			dialog "��� ������� ����� ^0000cd1 ���������� �����^000000."
			wait
			dialog "[������� �������]"
			dialog "�� ����� �������� � ���������� ���������."
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
	

npc "alberta" "�������� ��������#19_thx_2" 4_M_KHMAN 138 188 3 0 0
OnInit:

NpcOverBMP "group_3"
NpcSecondName "<�������>"

OnClick:
//====================================================

var gabang_now = GetInventoryRemainCount 1304 3
if ((gabang_now == 2) | (gabang_now == 3))
	dialog "[�������� ��������]"
	dialog "���� �� ������ ������� ������� � ���������, ���������� ���� ���������."
	close
	return
else
endif
//==============================================================================	
	dialog "[�������� ��������]"
	dialog "����������� ���."
	wait
	dialog "[�������� ��������]"
	dialog "���� �� ������ ������� ������� � �������, ��� ����� ���������� � �������� �������."
	wait
	dialog "[�������� ��������]"
	dialog "��� ������� ����� ^0000cd1 ���������� �����^000000."
	wait
	choose menu "���� �� � ����������� ��� ������?" "���� "
		case 1
		break
		case 2
			close
			return
		break
	endchoose
	dialog "[�������� ��������]"
	dialog "������-��, � �� �� ��������� �� ^0000cd10 �������� �����^000000. � ��� �� ���������� ������������� � ������� �� ���."
	wait
	choose menu "����������� " "���� "
	case 1
		if (v[Goodly_Bough] > 9)
			dropitem Goodly_Bough 10
			ConsumePackageItem Season_Evt_Reward
			dialog "[�������� ��������]"
			dialog "����, ��� ���� �������."
			close
			return
		else
			dialog "[�������� ��������]"
			dialog "� ��� ��� ^0000cd10 �������� �����^000000."
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
npc "prontera" "�������� ���������#18_thx01" 4_M_GRANDMONK 125 125 5 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "�������� ���������#18_thx01" "��������� ���� � ����� ����������� � ��������. �� ����������!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[�������� ���������]"
	dialog "�������, �� ������� ������ � ��������, � �� �� ��������� ��� ���������."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[�������� ���������]"
	dialog "������ �� ���� � ����, ����� ����� ������ � ����� �������..."
	wait
	dialog "[�������� ���������]"
	dialog "���� �� ������� � ����� ����� � ��������� ���? �������, �������� ��������� �� ������� ���� � �������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�������� ����� �������� ��� ���� ����� �������� �������, ��, �����, ������ ������������ ������� ���� ��������!"
	wait
	dialog "[�������� ���������]"
	dialog "����� ���, ������ � �������� ����������, ��� ����� ������� �������, ������� ������������ ���� ����������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�� ���? �� ������ ������� ������� � ���������? �����, � ���� �� ������ ��� ��������� �� ������."
	wait
	choose menu "� ���� " "�� ����� "
	case 1
		dialog "[�������� ���������]"
		dialog "��������� ��� �������������������!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[�������� ���������]"
		dialog "������ ���������, ���������, ����� ������ ������."
		close
		return
	break
	endchoose
else
	dialog "[�������� ���������]"
	dialog "������, ��������! � ���, ��� �� ���������� � ���� � ���������."
	close
	return
endif
return


// ==========================================================
npc "payon" "�������� ���������#18_thx02" 4_M_GRANDMONK 165 99 6 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "�������� ���������#18_thx01" "��������� ���� � ����� ����������� � ��������. �� ����������!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[�������� ���������]"
	dialog "�������, �� ������� ������ � ��������, � �� �� ��������� ��� ���������."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[�������� ���������]"
	dialog "������ �� ���� � ����, ����� ����� ������ � ����� �������..."
	wait
	dialog "[�������� ���������]"
	dialog "���� �� ������� � ����� ����� � ��������� ���? �������, �������� ��������� �� ������� ���� � �������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�������� ����� �������� ��� ���� ����� �������� �������, ��, �����, ������ ������������ ������� ���� ��������!"
	wait
	dialog "[�������� ���������]"
	dialog "����� ���, ������ � �������� ����������, ��� ����� ������� �������, ������� ������������ ���� ����������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�� ���? �� ������ ������� ������� � ���������? �����, � ���� �� ������ ��� ��������� �� ������."
	wait
	choose menu "� ���� " "�� ����� "
	case 1
		dialog "[�������� ���������]"
		dialog "��������� ��� �������������������!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[�������� ���������]"
		dialog "������ ���������, ���������, ����� ������ ������."
		close
		return
	break
	endchoose
else
	dialog "[�������� ���������]"
	dialog "������, ��������! � ���, ��� �� ���������� � ���� � ���������."
	close
	return
endif
return

// ========================================================
npc "aldebaran" "�������� ���������#18_thx03" 4_M_GRANDMONK 143 115 4 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "�������� ���������#18_thx01" "��������� ���� � ����� ����������� � ��������. �� ����������!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[�������� ���������]"
	dialog "�������, �� ������� ������ � ��������, � �� �� ��������� ��� ���������."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[�������� ���������]"
	dialog "������ �� ���� � ����, ����� ����� ������ � ����� �������..."
	wait
	dialog "[�������� ���������]"
	dialog "���� �� ������� � ����� ����� � ��������� ���? �������, �������� ��������� �� ������� ���� � �������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�������� ����� �������� ��� ���� ����� �������� �������, ��, �����, ������ ������������ ������� ���� ��������!"
	wait
	dialog "[�������� ���������]"
	dialog "����� ���, ������ � �������� ����������, ��� ����� ������� �������, ������� ������������ ���� ����������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�� ���? �� ������ ������� ������� � ���������? �����, � ���� �� ������ ��� ��������� �� ������."
	wait
	choose menu "� ���� " "�� ����� "
	case 1
		dialog "[�������� ���������]"
		dialog "��������� ��� �������������������!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[�������� ���������]"
		dialog "������ ���������, ���������, ����� ������ ������."
		close
		return
	break
	endchoose
else
	dialog "[�������� ���������]"
	dialog "������, ��������! � ���, ��� �� ���������� � ���� � ���������."
	close
	return
endif
return


// ============================================================
npc "geffen" "�������� ���������#18_thx04" 4_M_GRANDMONK 129 57 4 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "�������� ���������#18_thx01" "��������� ���� � ����� ����������� � ��������. �� ����������!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[�������� ���������]"
	dialog "�������, �� ������� ������ � ��������, � �� �� ��������� ��� ���������."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[�������� ���������]"
	dialog "������ �� ���� � ����, ����� ����� ������ � ����� �������..."
	wait
	dialog "[�������� ���������]"
	dialog "���� �� ������� � ����� ����� � ��������� ���? �������, �������� ��������� �� ������� ���� � �������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�������� ����� �������� ��� ���� ����� �������� �������, ��, �����, ������ ������������ ������� ���� ��������!"
	wait
	dialog "[�������� ���������]"
	dialog "����� ���, ������ � �������� ����������, ��� ����� ������� �������, ������� ������������ ���� ����������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�� ���? �� ������ ������� ������� � ���������? �����, � ���� �� ������ ��� ��������� �� ������."
	wait
	choose menu "� ���� " "�� ����� "
	case 1
		dialog "[�������� ���������]"
		dialog "��������� ��� �������������������!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[�������� ���������]"
		dialog "������ ���������, ���������, ����� ������ ������."
		close
		return
	break
	endchoose
else
	dialog "[�������� ���������]"
	dialog "������, ��������! � ���, ��� �� ���������� � ���� � ���������."
	close
	return
endif
return

// =========================================================
npc "morocc" "�������� ���������#18_thx05" 4_M_GRANDMONK 168 87 4 0 0
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "�������� ���������#18_thx01" "��������� ���� � ����� ����������� � ��������. �� ����������!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[�������� ���������]"
	dialog "�������, �� ������� ������ � ��������, � �� �� ��������� ��� ���������."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[�������� ���������]"
	dialog "������ �� ���� � ����, ����� ����� ������ � ����� �������..."
	wait
	dialog "[�������� ���������]"
	dialog "���� �� ������� � ����� ����� � ��������� ���? �������, �������� ��������� �� ������� ���� � �������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�������� ����� �������� ��� ���� ����� �������� �������, ��, �����, ������ ������������ ������� ���� ��������!"
	wait
	dialog "[�������� ���������]"
	dialog "����� ���, ������ � �������� ����������, ��� ����� ������� �������, ������� ������������ ���� ����������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�� ���? �� ������ ������� ������� � ���������? �����, � ���� �� ������ ��� ��������� �� ������."
	wait
	choose menu "� ���� " "�� ����� "
	case 1
		dialog "[�������� ���������]"
		dialog "��������� ��� �������������������!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[�������� ���������]"
		dialog "������ ���������, ���������, ����� ������ ������."
		close
		return
	break
	endchoose
else
	dialog "[�������� ���������]"
	dialog "������, ��������! � ���, ��� �� ���������� � ���� � ���������."
	close
	return
endif
return

// ============================================================
npc "yuno" "�������� ���������#18_thx07" 4_M_GRANDMONK 148 181 5 5 5
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "�������� ���������#18_thx01" "��������� ���� � ����� ����������� � ��������. �� ����������!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[�������� ���������]"
	dialog "�������, �� ������� ������ � ��������, � �� �� ��������� ��� ���������."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[�������� ���������]"
	dialog "������ �� ���� � ����, ����� ����� ������ � ����� �������..."
	wait
	dialog "[�������� ���������]"
	dialog "���� �� ������� � ����� ����� � ��������� ���? �������, �������� ��������� �� ������� ���� � �������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�������� ����� �������� ��� ���� ����� �������� �������, ��, �����, ������ ������������ ������� ���� ��������!"
	wait
	dialog "[�������� ���������]"
	dialog "����� ���, ������ � �������� ����������, ��� ����� ������� �������, ������� ������������ ���� ����������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�� ���? �� ������ ������� ������� � ���������? �����, � ���� �� ������ ��� ��������� �� ������."
	wait
	choose menu "� ���� " "�� ����� "
	case 1
		dialog "[�������� ���������]"
		dialog "��������� ��� �������������������!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[�������� ���������]"
		dialog "������ ���������, ���������, ����� ������ ������."
		close
		return
	break
	endchoose
else
	dialog "[�������� ���������]"
	dialog "������, ��������! � ���, ��� �� ���������� � ���� � ���������."
	close
	return
endif
return


// =======================================================
npc "rachel" "�������� ���������#18_thx08" 4_M_GRANDMONK 111 134 4 5 5
OnInit:

NpcOverBMP "group_3"

AddQuestIDCondition 3364
SetQuestConditionBegin 3364 1 5
SetQuestConditionQuest 3364 0
SetQuestConditionLevel 30 200
SetQuestConditionEnd
return

OnTouch2:
Talk2me "�������� ���������#18_thx01" "��������� ���� � ����� ����������� � ��������. �� ����������!"
return

OnClick:
if (v[VAR_CLEVEL] < 30)
	dialog "[�������� ���������]"
	dialog "�������, �� ������� ������ � ��������, � �� �� ��������� ��� ���������."
	close
	return
endif
var thx_3364 = isbegin_quest 3364
if (thx_3364 == 0)
	dialog "[�������� ���������]"
	dialog "������ �� ���� � ����, ����� ����� ������ � ����� �������..."
	wait
	dialog "[�������� ���������]"
	dialog "���� �� ������� � ����� ����� � ��������� ���? �������, �������� ��������� �� ������� ���� � �������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�������� ����� �������� ��� ���� ����� �������� �������, ��, �����, ������ ������������ ������� ���� ��������!"
	wait
	dialog "[�������� ���������]"
	dialog "����� ���, ������ � �������� ����������, ��� ����� ������� �������, ������� ������������ ���� ����������� ���������."
	wait
	dialog "[�������� ���������]"
	dialog "�� ���? �� ������ ������� ������� � ���������? �����, � ���� �� ������ ��� ��������� �� ������."
	wait
	choose menu "� ���� " "�� ����� "
	case 1
		dialog "[�������� ���������]"
		dialog "��������� ��� �������������������!"
		close
		moveto "alberta" 121 139
		return
	break
	case 2
		dialog "[�������� ���������]"
		dialog "������ ���������, ���������, ����� ������ ������."
		close
		return
	break
	endchoose
else
	dialog "[�������� ���������]"
	dialog "������, ��������! � ���, ��� �� ���������� � ���� � ���������."
	close
	return
endif
return


////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
npc "alberta" "��������#18_thx" 4_M_GUSLIMAN 148 170 3 0 0
OnClick:
Talk2me "��������#18_thx" "�� ����������, �� �����������, ������� � ���� �� �� �����..."
return

npc "alberta" "��������#18_thx_2" 2_M_BARD_ORIENT 146 171 3 0 0
OnClick:
Talk2me "��������#18_thx_2" "�... ���! ���! ���!"
return

npc "alberta" "�������� ������#18_thx" 4_M_05 149 168 3 0 0
OnClick:
Talk2me "�������� ������#18_thx" "��, ��� ����� ��������..."
return

npc "alberta" "������#18_thx01" 4_M_06 149 157 1 0 0
OnClick:
Talk2me "������#18_thx01" "��� ��� ����� ������������, �� � �� ���� �������� ���� �� �����."
return




npc "alberta" "��������#18_thx09" 4_F_LGTGIRL 133 150 5 0 0
OnClick:
Talk2me "��������#18_thx09" "��� ����� ����� �������... ���..."
DelayTime 1000
Talk2me "������#18_thx10" "��� ���������� ��������� ����."
DelayTime 1000
Talk2me "��������#18_thx09" "���������? � ��� �� ��� ����?"
DelayTime 1000
Talk2me "������#18_thx10" "� ���� �������."
DelayTime 1000
Talk2me "��������#18_thx09" "�������. ����� � ��� ������!"
DelayTime 1000
Talk2me "������#18_thx10" "������� ���. ��-��-�� "
return

npc "alberta" "������#18_thx10" 4_M_CHNMAN 135 148 1 0 0
OnClick:
Talk2me "������#18_thx10" "� ����� ��� ����� ���������?"
DelayTime 1000
Talk2me "��������#18_thx09" "����� ��."
DelayTime 1000
Talk2me "������#18_thx10" "���������, ����� ����� ���������?"
DelayTime 1000
Talk2me "��������#18_thx09" "����� ����� �� �����..."
return

////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////

