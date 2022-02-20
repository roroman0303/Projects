
npc "malangdo" "�� ������#17july" 4_M_MIKID 210 110 5 5 5
OnClick:
	moveto "prontera" 125 125
return

npc "malangdo" "�����#17july" 4_M_MIKID 207 110 5 5 5

OnInit:
	AddQuestIDCondition 14714
	SetQuestConditionBegin 14714 1 4
	SetQuestConditionQuest 14697 3
	SetQuestConditionQuest 14714 0
	SetQuestConditionLevel 100 200
	SetQuestConditionEnd
return

OnTouch2:
var noodle_14714 = isbegin_quest 14714
if ((noodle_14697 == 2) & (noodle_14714 == 0) & (v[VAR_CLEVEL] > 99))
	Talk2me "�����#17july" "� ���� ������ ������� ��� ��������."
endif
return

OnClick:
if (v[VAR_CLEVEL] < 100)
	dialog "[�����]"
	dialog "��� ����� ������ �������� � "
	dialog "�������� ��������... "
	close
	return
endif

var name = PcName
var noodle_14714 = isbegin_quest 14714
if ((noodle_14714 == 0) & (noodle_14697 == 2))
	dialog "[�����]"
	dialog "� ���� ������ ������� ��� ��������."
	wait
	choose menu "��� ��������, �� ���� ���� �������� ������."
	case 1
	break
	endchoose
	dialog "[�����]"
	dialog "��� ��� ��-�� ���������. ���� "
	dialog "���� � �� �������� ����, ��� "
	dialog "������ ������! "
	wait
	choose menu "��� ��������� � ����� �������?"
	case 1
	break
	endchoose
	dialog "[�����]"
	dialog "�� � ������ ����� �����������. � "
	dialog "� ����� ����� ������� ���. � "
	dialog "������� ����, ������ ��� "
	dialog "��������� ����� ��� � ����� "
	dialog "�������. "
	wait
	dialog "[�����]"
	dialog "� � ������ ������� � ������ "
	dialog "������, ��� ��� ����� ������� � "
	dialog "������, ������� ������ ��� �����, "
	dialog "���� ����� ��������. �� ������� "
	dialog "�� ������� � ������ ��� � ����� "
	dialog "�����������. "
	wait
	dialog "[�����]"
	dialog "� � ������ ���������� � ������ �� "
	dialog "����-��, ��� ��� � ������. �� �� "
	dialog "������, ��� ��� ���� ���� ������� "
	dialog "������ ����� � �������. "
	wait
	dialog "[�����]"
	dialog "����, ��� �������� ���� ������ � "
	dialog "���� �� ������� � ������ "
	dialog "���������. ����� ��� ��������� "
	dialog "����� � �����. ��� ������ �� "
	dialog "������������ ���� ����� ����, ��� "
	dialog "������ ����� �������. "
	wait
	dialog "[�����]"
	dialog "����� � ������� ����������, ��� "
	dialog "�������, ��� ����� �� ������� �� "
	dialog "��������. ��� �� �����, ��� "
	dialog "������ ������. �����. ��� ��� � "
	dialog "��� ��� ��� �����. "
	wait
	choose menu "�� ���� �� �������?"
	case 1
	break
	endchoose
	dialog "[�����]"
	dialog "�����? �� ���� ������ "
	dialog "������������? ����� ������ � "
	dialog "����! � ����� ����� ���� ������! "
	dialog "��� �������� �����, ��� ����! "
	wait
	choose menu "������ "
	case 1
	break
	endchoose
	dialog "[�����]"
	dialog "���!! "
	dialog "<NAVI>_�������_[����]_<INFO> "
	dialog "malangdo, 133,117,000,0, </INFO> "
	dialog "</NAVI>, ����� �����������. "
	setquest 14714
	close
	return
elseif (noodle_14714 == 1)
	dialog "[�����]"
	dialog " "
	dialog "<NAVI>_����_��_�������_[����]_<INFO> "
	dialog "malangdo, 133,117,000,0, </INFO> "
	dialog "</NAVI>, �� ������ ��������� "
	dialog "��������, ������� ����� � ������ "
	dialog "�����. "
	close
	return
else
	dialog "[�����]"
	dialog "� ���� ������ ������� ��� ��������."
	close
	return
endif
return


npc "malangdo" "����#17july" 4_CAT_SAILOR3 133 117 3 0 0

OnInit:
	AddQuestIDCondition 14714
	SetQuestConditionBegin 14714 1 4
	SetQuestConditionQuest 14714 1
	SetQuestConditionEnd
return

OnClick:
var noodle_14714 = isbegin_quest 14714
var noodle_14715 = isbegin_quest 14715
if (noodle_14714 == 1)
	dialog "[����]"
	dialog "� �����, ���� ������"
	wait
	dialog "[�������]"
	dialog "�� ���� ����� ���-������ ������."
	wait
	// ShowEffect "�����#17july01" EF_TELEPORTATION2
	ShowCinematicNpc "�����#17july01" 1
	dialog "[�����]"
	dialog "������ ����?"
	wait
	dialog "[����]"
	dialog "�� ������� ���� � �������� ���� "
	dialog "�� ����� ������� ������� ������ � "
	dialog "����� �� ����������� � ������. "
	wait
	dialog "[�������]"
	dialog "�, ���� ��������� �������. ��... "
	dialog "�������, � ������� � �������, �� "
	dialog "����� �� ������� ������, ��� �� � "
	dialog "�� ��� �� �������? "
	wait
	dialog "[�����]"
	dialog "��� ������ �� ��������� � ��� "
	dialog "���, ��� ������ � ������. ��� � "
	dialog "���. "
	wait
	dialog "[�������]"
	dialog "� ����� �������. �����."
	wait
	dialog "[�����]"
	dialog "��� ��� ����."
	wait
	choose menu "� ���� ����� � ������."
	case 1
	break
	endchoose
	dialog "[�������]"
	dialog "�� �� ������� ��� ��������, ���� "
	dialog "�� ������. "
	wait
	dialog "[����]"
	dialog "������, ������... ��� ���� "
	dialog "������, �� ������� � ��������� "
	dialog "�������� �� ����� �����������. "
	dialog "������, ������ ��������, � "
	dialog "������� ������������ ������ "
	dialog "�������... �������������, ������ "
	dialog "���� ����� ��������. "
	wait
	dialog "[����]"
	dialog "� � ��� �������, ������� ����� � "
	dialog "�������� � ��� ���������, "
	dialog "����������� � ����. ��, ����� ��, "
	dialog "� �������� ���� � �������� ������ "
	dialog "�. � ���� ���������... "
	wait
	dialog "[�������]"
	dialog "����� ������ ���� ������� ��� "
	dialog "��������, ����������� ����, ��� "
	dialog "��� ����������� �� ������ � "
	dialog "������. ����� ����� ����, �� "
	dialog "������� ����� ����� � �����, "
	dialog "���������� ���������. "
	wait
	dialog "[�������]"
	dialog "���� ����� ��������� �� ���� "
	dialog "�����. ������. ��� ����. � ������ "
	dialog "�� ��� ���� � ��� �����. ��� ���, "
	dialog "����������, ���������� ������. "
	wait
	choose menu "� ����� �� �����, ��� ���."
	case 1
	break
	endchoose
	dialog "[�������]"
	dialog "�� ���� ������ ��������? "
	dialog "���������� ���������� � ��������, "
	dialog "����� �������� ����������? ���� "
	dialog "��������, ��� ����� "
	dialog "�������������� ���������� �����, "
	dialog "������������ � ���������������, "
	dialog "�� ������ ������ ������. "
	wait
	dialog "[�����]"
	dialog "� ������ ����� ���� ������!"
	wait
	dialog "[����]"
	dialog "�����, ��� � ��� ������, �� "
	dialog "������� �����, ����� ���� ����. "
	dialog "��� ������ ���� ������ ���� "
	dialog "������� ����. "
	wait
	dialog "[�����]"
	dialog "�� ��� �� ��������! �����, ��� "
	dialog "��� �����! "
	wait
	dialog "[�������]"
	dialog "���� ��� ���������, ����� ������ "
	dialog "��� �������� �� ������, ��� ��� "
	dialog "����� ���. � ����� ������ ����� "
	dialog "������ ����� ���. "
	wait
	choose menu "���-������ ��� ��������?"
	case 1
	break
	endchoose
	dialog "[�������]"
	dialog "��� ���, ����������, ��������� "
	dialog "��� ������. ������ �� � ��������� "
	dialog "��� "
	wait
	dialog "[�����]"
	dialog "��� ���� �������?"
	wait
	dialog "[�������]"
	dialog "<NAVI>_[����_��������]_<INFO> "
	dialog "��������, 217 277 000,0, </INFO> "
	dialog "</NAVI> ���. ��� ����� �����. �� "
	dialog "�������� ��� ����� � ��������� "
	dialog "������� � ������. "
	wait
	dialog "[����]"
	dialog "����, ����������, �� �����, "
	dialog "������ ��� � ���� ������. "
	wait
	dialog "[�����]"
	dialog "������ ��� ��� ����� ����� "
	dialog "������! ����������, �����! "
	wait
	ShowCinematicNpc "�����#17july01" 0
	dialog "[����]"
	dialog "......"
	completequest 14714
	setquest 14715
	close
	return
elseif (noodle_14715 == 1)
	dialog "[����]"
	dialog "������ - ���..."
	wait
	dialog "[�������]"
	dialog " "
	dialog "<NAVI>_[�����]_���_�������_��������_<INFO>malangdo "
	dialog "217 277 000,0 ,</INFO> </NAVI>. "
	dialog "�� ���������� ������ ����. "
	close
	return
else
	dialog "[����]"
	dialog "�� �����, ����� �������� � ������?"
	wait
	dialog "[�������]"
	dialog "��������� �������� �� ������� � "
	dialog "�������. "
	close
	return
endif
return

npc "malangdo" "�������#17july" 4_WHITETIGER 131 115 7 0 0

OnClick:
var noodle_14714 = isbegin_quest 14714
var noodle_14715 = isbegin_quest 14715
if (noodle_14714 == 1)
	dialog "[�������]"
	dialog "�� ����� ������ ������ ���� ����? "
	dialog "������ ������ ������� ��� "
	dialog "���������. ���������� ����� "
	dialog "�������� � ������. "
	close
	return
elseif (noodle_14715 == 1)
	dialog "[�������]"
	dialog "������ � ������. � �����. � "
	dialog "������ �� ������������ ����. "
	close
	return
else
	dialog "[�������]"
	dialog "���� �� �������� ���������� � "
	dialog "������. "
	close
	return
endif
return

npc "malangdo" "�����#17july01" 4_M_MIKID 132 120 1 0 0

OnInit:
SetCinematicNpc 0
return

npc "malangdo" "�����#17july02" 4_M_MIKID 214 276 7 0 0

OnInit:
SetCinematicNpc 0
return

npc "malangdo" "�����#17july" 4_M_BOSSCAT 217 277 3 0 0

OnInit:
	AddQuestIDCondition 14715
	SetQuestConditionBegin 14715 1 4
	SetQuestConditionQuest 14715 1
	SetQuestConditionEnd
	
	AddQuestIDCondition 14716
	SetQuestConditionBegin 14716 1 4
	SetQuestConditionQuest 14716 2
	SetQuestConditionEnd
	
	AddQuestIDCondition 14717
	SetQuestConditionBegin 14717 1 4
	SetQuestConditionQuest 14717 2
	SetQuestConditionEnd
return

OnClick:
var mas_ter = (v[VAR_ISPARTYMASTER])
var par_mem = (v[VAR_CPARTY])
var par_name = PartyName
var md_name = "Legendary Dorado"
var name = PcName

if (par_mem > 0)
	if (mas_ter == 1)
	else
		dialog "[�����]"
		dialog "�� � ��������� ����� �� ����� "
		dialog "������? ������ ������� ������ �� "
		dialog "������ ��������? "
		close
		return
	endif
else
	dialog "[�����]"
	dialog "�� �� �������������� � ������� ^0000cd^000000? "
	dialog "������ ����������� - ���������! "
	close
	return
endif


var noodle_14715 = isbegin_quest 14715
var noodle_14716 = isbegin_quest 14716
var noodle_14717 = isbegin_quest 14717
var noodle_14718 = isbegin_quest 14718
var hunt_chek01 = checkquest_hunting 14716
var hunt_chek02 = checkquest_hunting 14718
var time_check01 = checkquest_playtime 14717

if (noodle_14715 == 1)
	dialog "[�����]"
	dialog "��� �� ���� �� ���? ������ ������ "
	dialog "� ������? "
	wait
	choose menu "��. � �����."
	case 1
	break
	endchoose
	// ShowEffect "�����#17july02" EF_TELEPORTATION2
	ShowCinematicNpc "�����#17july02" 1
	dialog "[�����]"
	dialog "� ����!"
	wait
	dialog "[�����]"
	dialog "��� ������, ������ ������. ����� "
	dialog "� ���� - ��� ���������� "
	dialog "�������������. ������ ����� "
	dialog "��������. �������� �� ��� ��� "
	dialog "����� ����� �����! "
	wait
	choose menu "��� ���� �������?"
	case 1
	break
	endchoose
	dialog "[�����]"
	dialog "�� ������� ����? �� ������� ����� "
	dialog "� ��� �������� ������� �������, "
	dialog "����� ���� ����. ��� ������ "
	dialog "���������� �������, ��� ��, ���� "
	dialog "���� ������, �����. "
	wait
	dialog "[�����]"
	dialog "� ���� ���� �����! ��� ����� "
	dialog "����� ������! "
	wait
	dialog "[�����]"
	dialog "������?"
	wait
	dialog "[�����]"
	dialog "��� ������� ������ ���� �������, "
	dialog "��� ������������ �� ������ "
	dialog "��������. � ������� ����, ������ "
	dialog "��� �����, ��� ������� ���������� "
	dialog "�� ������ �����. "
	wait
	dialog "[�����]"
	dialog "�� ������ � ����? ��, � �����. "
	dialog "���-�� ����� ���� ������. ���� �� "
	dialog "������, ���� �� � ����� � ������� "
	dialog "���������? "
	wait
	choose menu "������� ������� ��� ��������?"
	case 1
	break
	endchoose
	dialog "[�����]"
	dialog "��� ������� �� ����, ��������� "
	dialog "��� �������. ��� ����� ������ "
	dialog "���, ����� ��� ������! ���� �� "
	dialog "������ ����� ��� �����, �� �� ��� "
	dialog "������� �� ��������. "
	wait
	choose menu "�� ������ ������� ��� ������?"
	case 1
	break
	endchoose
	dialog "[�����]"
	dialog "���? ���, � ��������� ���������� "
	dialog "����� �������� � ������ ���� "
	dialog "�����. ��������� ������. �� � "
	dialog "������������ ������� "
	dialog "������������. "
	wait
	dialog "[�����]"
	dialog "����� ����� ��������, �� ������ "
	dialog "����, �������� ������, ����� "
	dialog "�������� �� ��� � ����, �����? "
	wait
	dialog "[�����]"
	dialog "�� �� ����� � � ���� ������."
	wait
	dialog "[�����]"
	dialog "� � ������� ������ ��� � ������, "
	dialog "��� ���� ���� �������, ��� "
	dialog "���-���� ������. "
	wait
	choose menu "����������, ����������, ������."
	case 1
	break
	endchoose
	dialog "[�����]"
	dialog "������ ����� ��� ������� � "
	dialog "��������, � � ������ ��� ����� "
	dialog "�����, ����� ��������� ����. �� "
	dialog "�������, ����� �������� ����� �� "
	dialog "����. "
	wait
	dialog "[�����]"
	dialog "�����!"
	wait
	dialog "[�����]"
	dialog "�� ������ ������� ����� ������."
	wait
	dialog "[�����]"
	dialog "� ���� ����� ���� ������!"
	wait
	choose menu "� ����� ���� ������."
	case 1
	break
	endchoose
	dialog "[�����]"
	dialog "� ����� ����? ��� ������?"
	wait
	choose menu "� ��� �� ���."
	case 1
	break
	endchoose
	dialog "[�����]"
	dialog "����������, �� ����� ������� "
	dialog "�������... ��� ������ ����� "
	dialog "������! ������, ����� ������ "
	dialog "������� � ���������? "
	wait
	dialog "[�����]"
	dialog "�������, ��� ���� ����, �� ����� "
	dialog "������? "
	wait
	choose menu "� �����." "��� ����� ����������."
	case 1
		var nd_wait = MD_Subscription md_name
		if (nd_wait == 0)
			dialog "[�����]"
			dialog "���-�� ��������? �� ����� �� �� "
			dialog "��������� ������� ����� ��������� "
			dialog "�����? "
			close
			return
		else
			dialog "[�����]"
			dialog "��. ����� � ������, ����� ����� "
			dialog "���� ���� ����� ������� ����� "
			dialog "���������, �������� ���� � "
			dialog "������� �������� �����������, ��� "
			dialog "��� ��������. "
			completequest 14715
			setquest 14716
			close
			return
		endif
	break
	case 2
		dialog "[�����]"
		dialog "��. �����������, ����� � ���� "
		dialog "�������� ����. "
		close
		return
	break
	endchoose
	if (hunt_chek01 == 2)
		dialog "[�����]"
		dialog "��-�-�...? ����������...? ���...?"
		wait
		choose menu "��� �����?"
		case 1
		break
		endchoose
		dialog "[�����]"
		dialog "�������� ��������� �������. "
		dialog "������... �������� �������� �� "
		dialog "���������? "
		wait
		dialog "[������� � ���, ��� ��������� � "
		dialog "������.] "
		wait
		dialog "[�����]"
		dialog "���������... �� ���� ����� "
		dialog "������� ���������... ����, �� "
		dialog "����� �� �� ���������� �� ����� � "
		dialog "�������� �� ���� ���������? "
		wait
		choose menu "������ �� ���������� �����."
		case 1
		break
		endchoose
		dialog "[�����]"
		dialog "���... ��� ���. ���� ������ �� "
		dialog "����� �����, ��� ��������� "
		dialog "�������� ����������� ����� ����. "
		dialog "������ ��� �� ������ ���� ����� "
		dialog "��� �������, ��� ���������� "
		dialog "�������� �����. "
		wait
		choose menu "� �������� ����."
		case 1
		break
		endchoose
		dialog "[�����]"
		dialog "����������, ����������. � �����, "
		dialog "��� ������������ �������, ������� "
		dialog "����� ����� ���������, - ��� ��. "
		dialog "����������. ���? � ����, ��� � "
		dialog "��������. "
		wait
		dialog "[�����]"
		dialog "�� ��� ��, ��� ���� � ������ ��� "
		dialog "����. ���� ���������� ����, � "
		dialog "������� �� ������ ������. "
		wait
		choose menu "��������� ���� ��������."
		case 1
		break
		endchoose
		dialog "[�����]"
		dialog "����. ������� ��� �������. "
		dialog "����������... � ������� �� ������ "
		dialog "��� ���������. ����������, "
		dialog "�������� ������� ������� � "
		dialog "��������� ����� ��������. � ��� "
		dialog "����������. "
		erasequest 14716
		getexp 350000
		getJexp 350000
		close
		return
	else
		if (time_check01 == 1)
			dialog "[�����]"
			dialog "�, �� ��������� �����? �� ����� "
			dialog "����� ������ ��� � ����, � �� ��� "
			dialog "���� ��� �������. ������� ����� "
			dialog "��������. "
			close
			return
		else
			dialog "[�����]"
			dialog "������ ���������? � �������� ���� "
			dialog "� �������. ����� ������� ����� "
			dialog "���������, �������� ���� � "
			dialog "������� �������� �����������, ��� "
			dialog "��� ��������. "
			wait
			choose menu "� ����� ������." "��� ����� �����, ����� �������������."
			case 1
				var nd_wait = MD_Subscription md_name
				if (nd_wait == 0)
					dialog "[�����]"
					dialog "���-�� ��������? �� ����� �� �� "
					dialog "��������� ������� ����� ��������� "
					dialog "�����? "
					close
					return
				else
					// ShowEffect "����������� ��������-������� "������ "#17july" 1019
					dialog "[�����]"
					dialog "� ����. ����� � ������, ����� "
					dialog "����� ���� ���� ����� ������� "
					dialog "����� ���������, �������� ���� � "
					dialog "������� �������� �����������, ��� "
					dialog "��� ��������. "
					erasequest 14717
					close
					return
				endif
			break
			case 2
				dialog "[�����]"
				dialog "� ����. �����������, ����� ������ "
				dialog "�����. "
				close
				return
			break
			endchoose
		endif
	endif
	if (hunt_chek02 == 2)
		dialog "[�����]"
		dialog "����������, ��������... �������� "
		dialog "��� ��� ���. �� �� ���������� �� "
		dialog "����� ��������� �������? �����... "
		dialog " "
		wait
		dialog "[�����]"
		dialog "�� ����� ������ ������. ������ "
		dialog "����, ��� ���� ������, �� ������ "
		dialog "������� ���� �� ���������� ����� "
		dialog "����� ������, ������������� ����� "
		dialog "��������. � �������� ���� � "
		dialog "�������. "
		erasequest 14718
		getexp 350000
		getJexp 350000
		close
		return
	else
		if (time_check01 == 1)
			dialog "[�����]"
			dialog "����� ��������� ������ ���� ��� � "
			dialog "����, �� �� ��� ���� ��� �������. "
			dialog "������� ����� ��������. "
			close
			return
		else
			dialog "[�����]"
			dialog "������ ��������� �������? � "
			dialog "�������� ���� � �������. ����� "
			dialog "������� ����� ���������, �������� "
			dialog "���� � ������� �������� "
			dialog "�����������, ��� ��� ��������. "
			wait
			choose menu "� ����� ������." "��� ����� �����, ����� �������������."
			case 1
				var nd_wait = MD_Subscription md_name
				if (nd_wait == 0)
					dialog "[�����]"
					dialog "���-�� ��������? �� ����� �� �� "
					dialog "��������� ������� ����� ��������� "
					dialog "�����? "
					close
					return
				else
					// ShowEffect "����������� ��������-������� "������ "#17july" 1019
					dialog "[�����]"
					dialog "� ����. ����� � ������, ����� "
					dialog "����� ���� ���� ����� ������� "
					dialog "����� ���������, �������� ���� � "
					dialog "������� �������� �����������, ��� "
					dialog "��� ��������. "
					erasequest 14717
					close
					return
				endif
			break
			case 2
				dialog "[�����]"
				dialog "� ����. �����������, ����� ������ "
				dialog "�����. "
				close
				return
			break
			endchoose
		endif
	endif
elseif (noodle_14717 == 1)
	if (time_check01 == 1)
		dialog "[�����]"
		dialog "����� ��������� ������ ���� ��� � "
		dialog "����, �� �� ��� ���� ��� �������. "
		dialog "������� ����� ��������. "
		close
		return
	else
		dialog "[�����]"
		dialog "����������, ������ ��������� "
		dialog "�������? � �������� ���� � "
		dialog "�������. ����� ������� ����� "
		dialog "���������, �������� ���� � "
		dialog "������� �������� �����������, ��� "
		dialog "��� ��������. "
		wait
		choose menu "� ����� ������." "��� ����� �����, ����� �������������."
		case 1
			var nd_wait = MD_Subscription md_name
			if (nd_wait == 0)
				dialog "[�����]"
				dialog "���-�� ��������? �� ����� �� �� "
				dialog "��������� ������� ����� ��������� "
				dialog "�����? "
				close
				return
			else
				// ShowEffect "����������� ��������-������� "������ "#17july" 1019
				dialog "[�����]"
				dialog "� ����. ����� � ������, ����� "
				dialog "����� ���� ���� ����� ������� "
				dialog "����� ���������, �������� ���� � "
				dialog "������� �������� �����������, ��� "
				dialog "��� ��������. "
				erasequest 14717
				setquest 14718
				close
				return
			endif
		break
		case 2
			dialog "[�����]"
			dialog "� ����. �����������, ����� ������ "
			dialog "�����. "
			close
			return
		break
		endchoose
	endif
elseif (noodle_14715 == 2)
	if ((hunt_chek01 == 2) | (hunt_chek02 == 2))
		dialog "[�����]"
		dialog "����������, ��������... �������� "
		dialog "��� ��� ���. �� �� ���������� �� "
		dialog "����� ��������� �������? �����... "
		dialog " "
		wait
		dialog "[�����]"
		dialog "�� ����� ������ ������. ������ "
		dialog "����, ��� ���� ������, �� ������ "
		dialog "������� ���� �� ���������� ����� "
		dialog "����� ������, ������������� ����� "
		dialog "��������. � �������� ���� � "
		dialog "�������. "
		erasequest 14718
		getexp 350000
		getJexp 350000
		close
		return
	else
		if (time_check01 == 1)
			dialog "[�����]"
			dialog "����� ��������� ������ ���� ��� � "
			dialog "����, �� �� ��� ���� ��� �������. "
			dialog "������� ����� ��������. "
			close
			return
		else
			dialog "[�����]"
			dialog "������ ��������� �������? � "
			dialog "�������� ���� � �������. ����� "
			dialog "������� ����� ���������, �������� "
			dialog "���� � ������� �������� "
			dialog "�����������, ��� ��� ��������. "
			wait
			choose menu "� ����� ������." "��� ����� �����, ����� �������������."
			case 1
				var nd_wait = MD_Subscription md_name
				if (nd_wait == 0)
					dialog "[�����]"
					dialog "���-�� ��������? �� ����� �� �� "
					dialog "��������� ������� ����� ��������� "
					dialog "�����? "
					close
					return
				else
					// ShowEffect "����������� ��������-������� "������ "#17july" 1019
					dialog "[�����]"
					dialog "� ����. ����� � ������, ����� "
					dialog "����� ���� ���� ����� ������� "
					dialog "����� ���������, �������� ���� � "
					dialog "������� �������� �����������, ��� "
					dialog "��� ��������. "
					erasequest 14717
					close
					return
				endif
			break
			case 2
				dialog "[�����]"
				dialog "� ����. �����������, ����� ������ "
				dialog "�����. "
				close
				return
			break
			endchoose
		endif
	endif
else
	dialog "[�����]"
	dialog "�� ������� � ������? ��� ������, "
	dialog "������ ������. ����� � ���� - ��� "
	dialog "���������� �������������. ������ "
	dialog "����� ��������. "
	close
	return
endif
return


npc "malangdo" "��������-�������#17july" 2_POSTBOX 214 279 3 0 0

OnClick:
if (v[VAR_CLEVEL] < 100)
	dialog "[����������� �� ������������ "
	dialog "������������� ���������] � �� "
	dialog "������ ������ ������ ����. ����� "
	dialog "�������� ����, �� ������ ������ "
	dialog "��� ������� 100 �������. "
	close
	return
endif

var mas_ter = (v[VAR_ISPARTYMASTER])
var par_mem = (v[VAR_CPARTY])
var par_name = PartyName
var md_name = "Legendary Dorado"
var name = PcName

if (par_mem > 0)

else
	dialog "[����������� �� ������������ "
	dialog "������������� ���������] ���� �� "
	dialog "�� ��������� ������ ������, "
	dialog "�������� ������ � ^0000cd1^000000 � ��������� "
	dialog "�������. "
	close
	return
endif
var noodle_14717 = isbegin_quest 14717
var time_check01 = checkquest_playtime 14717
if (time_check01 == 1)
	dialog "[����������� �� ������������ "
	dialog "������������� ���������] ���� "
	dialog "������������ ��������-������� "
	dialog "������� �������� �� ������������ "
	dialog "�����. ����������, ������� ����� "
	dialog "��������. "
	close
	return
else
endif

if (mas_ter == 1)
	dialog "[����������� �� ������������ "
	dialog "������������� ���������] "
	wait
	choose menu "��. � �����." "���."
	case 1
		var move_md = MD_Exist md_name
		if (move_md == 3)
			dialog "[����������� �� ������������ "
			dialog "������������� ���������] "
			dialog "^ff0000 ��������� ����������� ������.^000000 "
			close
			return
		elseif (move_md == 2)
			dialog "[����������� �� ������������ "
			dialog "������������� ���������] �� "
			dialog "���������� �����, �������������� "
			dialog "� ������, �� ���� �������. "
			wait
			dialog "[����������� �� ������������ "
			dialog "������������� ���������] "
			dialog "����������� � �����. "
			close
			return
		elseif (move_md == 1)
			dialog "[����������� �� ������������ "
			dialog "������������� ���������] ���� �� "
			dialog "�� ��������� ������ ������, "
			dialog "�������� ������ � ^0000cd1^000000 � ��������� "
			dialog "�������. "
			close
			return
		elseif (move_md == 0)
			dialog "[����������� �� ������������ "
			dialog "������������� ���������] "
			dialog "����������� ��������-������� "
			dialog "������. �������� ����������. "
			dialog "����� ��� �����. "
			broadcastinmap2 "00ff99" FW_NORMAL 12 0 0 " ���� ������ "+par_name+", " + name + " �������� �������� " + md_name
			setquest 14717
			MD_Enter md_name
			return
		endif
	break
	case 2
		dialog "[����������� �� ������������ "
		dialog "������������� ���������] �������� "
		dialog "��������, ��� Dorado Limited "
		dialog "Express ��������� ���������. "
		close
		return
	break
	endchoose
else
	dialog "[����������� �� ������������ "
	dialog "������������� ���������] ���� "
	dialog "���������� ������ ����� "
	dialog "������������ ������ ������� "
	dialog "������. "
	close
	return
endif
return

