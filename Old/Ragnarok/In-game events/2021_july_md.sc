


MD_Npc "1@drdo" "�������#7e102" 4_F_SHADOWCHASER 59 59 3 5 5
OnTouch:
	var str102 = GetMDNpcName "�������#7e102"
	var str103 = GetMDNpcName "�������#7e103"
	TalkShow str102 "� ����� ���������!"
	DelayTime 1000
	disablenpc str102
	enablenpc str103
	var nya_map01 = GetMDMapName "1@drdo"
	Navigation_Active nya_map01 0 000 1 69 59
return


MD_Npc "1@drdo" "�������#7e103" 4_F_SHADOWCHASER 74 47 3 5 5
OnInit:
	var str103 = GetMDNpcName "�������#7e103"
	disablenpc str103
return

OnTouch:
	var str103 = GetMDNpcName "�������#7e103"
	TalkShow str103 "��� ���������?"
	DelayTime 1000
	disablenpc str103
	var nya_map01 = GetMDMapName "1@drdo"
	Navigation_Active nya_map01 0 000 1 94 63
return


MD_Npc "1@drdo" "�������#7e101" 4_F_SHADOWCHASER 94 63 3 0 0
OnClick:
 var str101 = GetMDNpcName "�������#7e101"
 var str102 = GetMDNpcName "�������#7e102"
 var str103 = GetMDNpcName "�������#7e103"
 var fnpc101 = GetMDNpcName "�������� � �����������#7e101"
 var mon101 = GetMDNpcName "��#7e101"
 var men_t = rand 1 2
 if (men_t == 1)
	 TalkShow str102 "� ����� ���������!"
	 DelayTime 1500
	 TalkShow str101 "����, ������� �������!"
	 DelayTime 1500
	 TalkShow str101 "������, �� ������� �� ���� �����, ����� � ������� ��������?"
	 DelayTime 1500
	 TalkShow "" "����� ����, ������?"
	 DelayTime 1500
	 TalkShow str101 "���, ���? ������? ����? �� �����, ����� ����� ����?"
	 DelayTime 1500
	 TalkShow str101 "����, ������� ������. ��������, ����������. � �� ���� �����."
	 DelayTime 1500
	 TalkShow "" "���� ������?"
	 DelayTime 1500
	 TalkShow str101 "������? ���� �� �����? ����� �� �� ������ ���� �����? ������? ������ � �� ������ "
	 DelayTime 1500
	 TalkShow str101 "� ����� ��� ���� � ������ ������ ����?"
	 DelayTime 1500
	 TalkShow str101 "�� ������� ���� ����������."
	 DelayTime 1500
	 TalkShow "" "� �����, ����� ����� ����-������ ���. �� �����-������ ������ ���?"
	 DelayTime 1500
	 TalkShow str101 "���, �� ���. ���� �������, ������ ����, ��� ����. ��� �� �����!"
	 DelayTime 1500
	 TalkShow str101 "�� �����! ����� �������� ���� ����� ������! ����� ����, ��� ������ ������ ����!"
	 DelayTime 1500
	 TalkShow str101 "��� ����! ��� ����!!"
 else
	 TalkShow str101 "������ ����� ��� ������� ������ �����."
	 DelayTime 1500
	 TalkShow "" "���� ������?"
	 DelayTime 1500
	 TalkShow str101 "� ������� ������! ��� � ������� ������! ��� ��������� ����� ���!"
	 DelayTime 1500
	 TalkShow "" "���� �� ���������� ���������, � ��� ����� "
	 DelayTime 1500
	 TalkShow str101 "��� ������ ���� ���������� � ������ ����� � ������� ��������. �� ��� ��������� ����� ���! � ����� ��� ������!"
	 DelayTime 1500
	 TalkShow "" "����������."
	 DelayTime 1500
	 TalkShow str101 "� ��������� ����� ��� ��� � ������� � ���� ������������ ����!"
	 DelayTime 1500
	 TalkShow str101 "��� ����� ��� ����������? ��� ���! ��� ��� ���!"
	 DelayTime 1500
	 TalkShow "" "��� ��������� ����."
	 DelayTime 1500
	 TalkShow str101 "�������. �� ������ �� ����� �������?"
	 DelayTime 1500
	 TalkShow "" "�� ������ ������?"
	 DelayTime 1500
	 TalkShow str101 "������? � �� ���� ������ ��������. �� ������, ��� ������ ���������? � ����� ����... �� �� ���� ���������..."
	 DelayTime 1500
	 TalkShow str101 "��� ����� �������� ���� ����� ���, ��� ���� ����������, �� � �� ���� ��������� ������!"
	 DelayTime 1500
	 TalkShow str101 "� �� ���� ���������! ��� ����� ��������! ������! ������!"
	 DelayTime 1500
	 TalkShow str101 "��� ����! ��� ����!!"
 endif
 cmdothernpc mon101 "call"
 cmdothernpc fnpc101 "off"
 disablenpc str101
 disablenpc str102
 disablenpc str103
return

MD_Npc "1@drdo" "��#7e101" 4_RED_FLOWER 1 1 3 0 0

OnCommand: "call"
	resetmymob
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "��� ����! ��� ����!! � ������ ��� ��� ��������!"
	var nya_map01 = GetMDMapName "1@drdo"
	callmonster nya_map01 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 70 43
	callmonster nya_map01 E_MD_BOX_PUPPET "������ � ������� " 78 42
	callmonster nya_map01 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 91 47
	callmonster nya_map01 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 101 49
	callmonster nya_map01 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 91 53
	callmonster nya_map01 E_MD_BOX_PUPPET "������ � ������� " 84 52
	callmonster nya_map01 E_MD_BOX_PUPPET "������ � ������� " 72 52
	callmonster nya_map01 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 63 55
	callmonster nya_map01 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 61 67
	callmonster nya_map01 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 70 70
	callmonster nya_map01 E_MD_BOX_PUPPET "������ � ������� " 80 71
	callmonster nya_map01 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 89 76
	callmonster nya_map01 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 94 75
	callmonster nya_map01 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 77 83
	callmonster nya_map01 E_MD_BOX_PUPPET "������ � ������� " 60 87
	callmonster nya_map01 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 69 99
	callmonster nya_map01 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 70 106
	callmonster nya_map01 E_MD_BOX_PUPPET "������ � ������� " 62 102
	callmonster nya_map01 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 55 101
	callmonster nya_map01 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 48 100
	callmonster nya_map01 E_MD_BOX_PUPPET "������ � ������� " 45 104
	callmonster nya_map01 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 43 110
	callmonster nya_map01 E_MD_BOX_PUPPET "������ � ������� " 40 100
	callmonster nya_map01 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 40 107
return

OnMyMobDead:
 DelayTime 100
 var mon101 = GetMDNpcName "��#7e101"
 var mon102 = GetMDNpcName "��#7e102"
 
 if npcv mon101 [VAR_MYMOBCOUNT] < 1
	 cmdothernpc mon102 "on"
 endif
return

MD_Npc "1@drdo" "��#7e102" 4_BLUE_FLOWER 3 1 3 0 0

OnCommand: "on"
 resetmymob
 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "���������� ���� ��������������� � ����������."
 var nya_map01 = GetMDMapName "1@drdo"
 callmonster nya_map01 E_MD_DEPRESS_SOUL "���������� ���� " 94 63
 MonsterTalkShow "���������� ���� " "��� ��������� ����� �����! ��� ��� ���!"
return


OnMyMobDead:
 DelayTime 100
 var mon102 = GetMDNpcName "��#7e102"
 var doo_r101 = GetMDNpcName "#7e101"
 
 if npcv mon102 [VAR_MYMOBCOUNT] < 1
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "���... ������... � �� ���� ������� � ���� ����������...!"
	 DelayTime 1000
	 DelayTime 1000
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "���... ��� ����... ����� �������."
	 cmdothernpc doo_r101 "on"
 endif
 var nya_map01 = GetMDMapName "1@drdo"
 Navigation_Active nya_map01 0 000 1 57 106
return

MD_Warp "1@drdo" "#7e101" 57 106 3 3

OnInit:
	var doo_r101 = GetMDNpcName "#7e101"
	disablenpc doo_r101
return

OnCommand: "on"
	var doo_r101 = GetMDNpcName "#7e101"
	ShowEffect doo_r101 1013
	enablenpc doo_r101
return

OnTouch2:
	var nya_map01 = GetMDMapName "1@drdo"
	var str201 = GetMDNpcName "�������#7e201"
	enablenpc str201
	moveto nya_map01 65 144
return


MD_Npc "1@drdo" "�������� � �����������#7e101" 4_TREASURE_BOX 62 65 3 0 0
OnCommand: "off"
	var fnpc101 = GetMDNpcName "�������� � �����������#7e101"
	var fnpc102 = GetMDNpcName "�������� � �����������#7e102"
	var fnpc103 = GetMDNpcName "�������� � �����������#7e103"
	var fnpc104 = GetMDNpcName "�������� � �����������#7e104"
	var fnpc105 = GetMDNpcName "�������� � �����������#7e105"
	var fnpc106 = GetMDNpcName "�������� � �����������#7e106"
	var fnpc107 = GetMDNpcName "�������� � �����������#7e107"
	var fnpc108 = GetMDNpcName "�������� � �����������#7e108"
	var fnpc109 = GetMDNpcName "�������� � �����������#7e109"
	var fnpc110 = GetMDNpcName "�������� � �����������#7e110"
	var fnpc111 = GetMDNpcName "�������� � �����������#7e111"
	var fnpc112 = GetMDNpcName "�������� � �����������#7e112"
	var fnpc113 = GetMDNpcName "�������� � �����������#7e113"
	var fnpc114 = GetMDNpcName "�������� � �����������#7e114"
	var fnpc115 = GetMDNpcName "�������� � �����������#7e115"
	var fnpc116 = GetMDNpcName "�������� � �����������#7e116"
	var fnpc117 = GetMDNpcName "�������� � �����������#7e117"
	var fnpc118 = GetMDNpcName "�������� � �����������#7e118"
	var fnpc119 = GetMDNpcName "�������� � �����������#7e119"
	disablenpc fnpc101
	disablenpc fnpc102
	disablenpc fnpc103
	disablenpc fnpc104
	disablenpc fnpc105
	disablenpc fnpc106
	disablenpc fnpc107
	disablenpc fnpc108
	disablenpc fnpc109
	disablenpc fnpc110
	disablenpc fnpc111
	disablenpc fnpc112
	disablenpc fnpc113
	disablenpc fnpc114
	disablenpc fnpc115
	disablenpc fnpc116
	disablenpc fnpc117
	disablenpc fnpc118
	disablenpc fnpc119
return

MD_Npc "1@drdo" "�������� � �����������#7e102" 4_TREASURE_BOX 75 67 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e103" 4_TREASURE_BOX 84 66 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e104" 4_TREASURE_BOX 93 68 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e105" 4_TREASURE_BOX 96 70 3 0 0
OnClick:
	var fnpc105 = GetMDNpcName "�������� � �����������#7e105"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Cardinal_Jewel_ 1
	endif
	disablenpc fnpc105
return
MD_Npc "1@drdo" "�������� � �����������#7e106" 4_TREASURE_BOX 96 93 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e107" 4_TREASURE_BOX 78 112 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e108" 4_TREASURE_BOX 75 111 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e109" 4_TREASURE_BOX 62 109 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e110" 4_TREASURE_BOX 45 113 3 0 0
OnClick:
	var fnpc110 = GetMDNpcName "�������� � �����������#7e110"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Blue_Jewel 1
	endif
	disablenpc fnpc110
return
MD_Npc "1@drdo" "�������� � �����������#7e111" 4_TREASURE_BOX 40 106 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e112" 4_TREASURE_BOX 39 103 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e113" 4_TREASURE_BOX 72 52 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e114" 4_TREASURE_BOX 84 51 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e115" 4_TREASURE_BOX 78 47 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e116" 4_TREASURE_BOX 74 43 3 0 0
OnClick:
	var fnpc116 = GetMDNpcName "�������� � �����������#7e116"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Seed_Of_Yggdrasil_ 3
	endif
	disablenpc fnpc116
return
MD_Npc "1@drdo" "�������� � �����������#7e117" 4_TREASURE_BOX 105 56 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e118" 4_TREASURE_BOX 77 77 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e119" 4_TREASURE_BOX 78 78 3 0 0







MD_Npc "1@drdo" "�������#7e202" 4_M_RACHMAN2 65 162 3 5 5
OnTouch:
	var str202 = GetMDNpcName "�������#7e202"
	var str203 = GetMDNpcName "�������#7e203"
	TalkShow str202 "���, �������� ���� !!!"
	DelayTime 1000
	disablenpc str202
	enablenpc str203
	var nya_map02 = GetMDMapName "1@drdo"
	Navigation_Active nya_map02 0 000 1 66 179
return


MD_Npc "1@drdo" "�������#7e203" 4_M_RACHMAN2 66 179 3 5 5
OnInit:
	var str203 = GetMDNpcName "�������#7e203"
	disablenpc str203
return

OnTouch:
	var str203 = GetMDNpcName "�������#7e203"
	var str204 = GetMDNpcName "�������#7e204"
	TalkShow str203 "��� ������!!"
	DelayTime 1000
	disablenpc str203
	enablenpc str204
	var nya_map02 = GetMDMapName "1@drdo"
	Navigation_Active nya_map02 0 000 1 63 195
return


MD_Npc "1@drdo" "�������#7e204" 4_M_RACHMAN2 63 195 3 5 5
OnInit:
	var str204 = GetMDNpcName "�������#7e204"
	disablenpc str204
return

OnTouch:
	var str204 = GetMDNpcName "�������#7e204"
	TalkShow str204 "��� � ������ �� ������, ��� �� ������ ���� !!"
	DelayTime 1000
	disablenpc str204
	var nya_map02 = GetMDMapName "1@drdo"
	Navigation_Active nya_map02 0 000 1 52 217
return


MD_Npc "1@drdo" "�������#7e201" 4_M_RACHMAN2 52 217 3 0 0

OnInit:
	var str201 = GetMDNpcName "�������#7e201"
	disablenpc str201
return

OnCommand: "on"
	var str201 = GetMDNpcName "�������#7e201"
	enablenpc str201
return

OnClick:
 var str201 = GetMDNpcName "�������#7e201"
 var str202 = GetMDNpcName "�������#7e202"
 var str203 = GetMDNpcName "�������#7e203"
 var str204 = GetMDNpcName "�������#7e204"
 var fnpc201 = GetMDNpcName "�������� � �����������#7e201"
 var mon201 = GetMDNpcName "��#7e201"
 var men_t = rand 1 2
 if (men_t == 1)
	 TalkShow str201 "������! ������� � ���� �������������! � ����� ������ �� �����! �� �����, ����� ������? ����������, ������ ���� "
	 DelayTime 1500
	 TalkShow str201 "� ����� ��� �����, � �����, ��� ����� � ��� "
	 DelayTime 1500
	 TalkShow "" "�� ������ �������� �� ����� ������?"
	 DelayTime 1500
	 TalkShow str201 "���? � �� ����? ��� ������ ���, ������� � �����-���� ������ ������, �� ����?"
	 DelayTime 1500
	 TalkShow str201 "������ ����? ��� ���� �������� ����� � ����� ������ "
	 DelayTime 1500
	 TalkShow str201 "�����? ��� �������? ���� �� ����? �� ����� �� �������� ��������, �� �������� ������ �� ����� ��-�� �������� �������..."
	 DelayTime 1500
	 TalkShow str201 "� ��� ������... �� ��� ���� ������ ����."
	 DelayTime 1500
	 TalkShow str201 "� ������ �������, ����� ������ � ���������... ������... � ������ � ����...?"
	 DelayTime 1500
	 TalkShow str201 "�... ��� ���...? ��� ����� �� ���� ��� ��� � ����?"
	 DelayTime 1500
	 TalkShow str201 "�... �����? �... �����? ��� �� ��� ����...?"
	 DelayTime 1500
	 TalkShow str201 "� ����������� ������ ���� ���������� �����, ����� ���������!"
	 DelayTime 1500
	 TalkShow str201 "������ � ������ ������� �� ��������? ���-�� ���� ����! ��-�� ����-�� ������� !!"
	 DelayTime 1500
	 TalkShow str201 "��� ����! ��� ����!!!"
 else
	 TalkShow str201 "� ����, ��� ��� �� �����. ���������� ���. ��� ���� �������� ���������?"
	 DelayTime 1500
	 TalkShow str201 "�� ����� ��� ��������. ���� ������ ��������, ����� � ��������."
	 DelayTime 1500
	 TalkShow "" "� �����, ����� ����-������ �����."
	 DelayTime 1500
	 TalkShow str201 "���� �������, ������ ����, ��� ����. ���, ��� � �, ��� �������� �������� � ��������� ������ "
	 DelayTime 1500
	 TalkShow str201 "��, � ���� ���� �������� "
	 DelayTime 1500
	 TalkShow str201 "� ��� �������, ����� ������� ����� � ��������� �� ����. �� ������ �� ������ �������, ����� ����, �����?"
	 DelayTime 1500
	 TalkShow str201 "�� ����, ������� ������ ����� ����, ������� �������� ���� ����."
	 DelayTime 1500
	 TalkShow str201 "��� �� ��� ������� ������ ���� ���, ��, �����, ��� ��� �� ������������ ������."
	 DelayTime 1500
	 TalkShow str201 "����������, �������� �� ����� � ��������� ������� ����."
	 DelayTime 1500
	 TalkShow str201 "�� ����� ��, � �� ����. �� ���� ������ �������� ��������."
	 DelayTime 1500
	 TalkShow str201 "���� �� ���� � ���� �� �������� ����, � ��� �� ������ ���� �����..."
	 DelayTime 1500
	 TalkShow str201 "� ������, � ������, � ���� ������! � ����� ����!"
	 DelayTime 1500
	 TalkShow str201 "���� ��� �����, � ��� �� ������ ���� �����, ���� ���� �� ���������� ���� ���������!"
	 DelayTime 1500
	 TalkShow str201 "���� �������� ������ ����! �������� ��������!"
	 DelayTime 1500
	 TalkShow str201 "��� ����! ��� ����!!"
 endif
 cmdothernpc mon201 "call"
 cmdothernpc fnpc201 "off"
 disablenpc str201
 disablenpc str202
 disablenpc str203
 disablenpc str204
return

MD_Npc "1@drdo" "��#7e201" 4_RED_FLOWER 1 2 3 0 0

OnCommand: "call"
	resetmymob
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "��� ����! ��� ����! � �� ����� ���� ���������!"
	var nya_map02 = GetMDMapName "1@drdo"
	callmonster nya_map02 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 36 224
	callmonster nya_map02 E_MD_BOX_PUPPET "������ � ������� " 36 211
	callmonster nya_map02 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 61 212
	callmonster nya_map02 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 84 212
	callmonster nya_map02 E_MD_BOX_PUPPET "������ � ������� " 99 212
	callmonster nya_map02 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 73 214
	callmonster nya_map02 E_MD_BOX_PUPPET "������ � ������� " 92 196
	callmonster nya_map02 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 77 196
	callmonster nya_map02 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 81 183
	callmonster nya_map02 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 71 184
	callmonster nya_map02 E_MD_BOX_PUPPET "������ � ������� " 35 182
	callmonster nya_map02 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 49 167
	callmonster nya_map02 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 71 166
	callmonster nya_map02 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 62 165
	callmonster nya_map02 E_MD_BOX_PUPPET "������ � ������� " 100 165
	callmonster nya_map02 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 83 155
	callmonster nya_map02 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 88 152
	callmonster nya_map02 E_MD_BOX_PUPPET "������ � ������� " 83 145
	callmonster nya_map02 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 77 145
	callmonster nya_map02 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 66 157
	callmonster nya_map02 E_MD_BOX_PUPPET "������ � ������� " 56 146
	callmonster nya_map02 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 49 150
	callmonster nya_map02 E_MD_BOX_PUPPET "������ � ������� " 36 158
	callmonster nya_map02 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 34 165
return


OnMyMobDead:
 DelayTime 100
 var mon201 = GetMDNpcName "��#7e201"
 var mon202 = GetMDNpcName "��#7e202"
 
 if npcv mon201 [VAR_MYMOBCOUNT] < 1
	 cmdothernpc mon202 "on"
 endif
return

MD_Npc "1@drdo" "��#7e202" 4_BLUE_FLOWER 3 2 3 0 0

OnCommand: "on"
 resetmymob
 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "���������� ���� ��������������� � ����������."
 var nya_map01 = GetMDMapName "1@drdo"
 callmonster nya_map01 E_MD_DEPRESS_SOUL "���������� ���� " 52 217
 MonsterTalkShow "���������� ���� " "������ �� �����? ������ � ����! � ���� � ����, ������ ��� � �����!"
return


OnMyMobDead:
 DelayTime 100
 var mon202 = GetMDNpcName "��#7e202"
 var doo_r201 = GetMDNpcName "#7e201"
 
 if npcv mon202 [VAR_MYMOBCOUNT] < 1
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "� ���� ����� �����..."
	 DelayTime 1000
	 DelayTime 1000
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "���... ��� ����... ����� �������."
	 cmdothernpc doo_r201 "on"
 endif
 var nya_map02 = GetMDMapName "1@drdo"
 Navigation_Active nya_map02 0 000 1 111 212
return

MD_Warp "1@drdo" "#7e201" 111 212 2 2

OnInit:
	var doo_r201 = GetMDNpcName "#7e201"
	disablenpc doo_r201
return

OnCommand: "on"
	var doo_r201 = GetMDNpcName "#7e201"
	ShowEffect doo_r201 1013
	enablenpc doo_r201
return

OnTouch2:
	var nya_map02 = GetMDMapName "1@drdo"
	var str301 = GetMDNpcName "�������#7e301"
	enablenpc str301
	moveto nya_map02 132 207
return

MD_Npc "1@drdo" "�������� � �����������#7e201" 4_TREASURE_BOX 32 163 3 0 0
OnCommand: "off"
	var fnpc201 = GetMDNpcName "�������� � �����������#7e201"
	var fnpc202 = GetMDNpcName "�������� � �����������#7e202"
	var fnpc203 = GetMDNpcName "�������� � �����������#7e203"
	var fnpc204 = GetMDNpcName "�������� � �����������#7e204"
	var fnpc205 = GetMDNpcName "�������� � �����������#7e205"
	var fnpc206 = GetMDNpcName "�������� � �����������#7e206"
	var fnpc207 = GetMDNpcName "�������� � �����������#7e207"
	var fnpc208 = GetMDNpcName "�������� � �����������#7e208"
	var fnpc209 = GetMDNpcName "�������� � �����������#7e209"
	var fnpc210 = GetMDNpcName "�������� � �����������#7e210"
	var fnpc211 = GetMDNpcName "�������� � �����������#7e211"
	var fnpc212 = GetMDNpcName "�������� � �����������#7e212"
	var fnpc213 = GetMDNpcName "�������� � �����������#7e213"
	var fnpc214 = GetMDNpcName "�������� � �����������#7e214"
	var fnpc215 = GetMDNpcName "�������� � �����������#7e215"
	var fnpc216 = GetMDNpcName "�������� � �����������#7e216"
	var fnpc217 = GetMDNpcName "�������� � �����������#7e217"
	var fnpc218 = GetMDNpcName "�������� � �����������#7e218"
	var fnpc219 = GetMDNpcName "�������� � �����������#7e219"
	var fnpc220 = GetMDNpcName "�������� � �����������#7e220"
	disablenpc fnpc201
	disablenpc fnpc202
	disablenpc fnpc203
	disablenpc fnpc204
	disablenpc fnpc205
	disablenpc fnpc206
	disablenpc fnpc207
	disablenpc fnpc208
	disablenpc fnpc209
	disablenpc fnpc210
	disablenpc fnpc211
	disablenpc fnpc212
	disablenpc fnpc213
	disablenpc fnpc214
	disablenpc fnpc215
	disablenpc fnpc216
	disablenpc fnpc217
	disablenpc fnpc218
	disablenpc fnpc219
	disablenpc fnpc220
return

MD_Npc "1@drdo" "�������� � �����������#7e202" 4_TREASURE_BOX 32 160 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e203" 4_TREASURE_BOX 37 155 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e204" 4_TREASURE_BOX 104 168 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e205" 4_TREASURE_BOX 102 166 3 0 0
OnClick:
	var fnpc205 = GetMDNpcName "�������� � �����������#7e205"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Red_Jewel 1
	endif
	disablenpc fnpc205
return
MD_Npc "1@drdo" "�������� � �����������#7e206" 4_TREASURE_BOX 110 189 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e207" 4_TREASURE_BOX 42 225 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e208" 4_TREASURE_BOX 39 224 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e209" 4_TREASURE_BOX 36 224 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e210" 4_TREASURE_BOX 39 227 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e211" 4_TREASURE_BOX 55 224 3 0 0
OnClick:
	var fnpc211 = GetMDNpcName "�������� � �����������#7e211"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Scarlet_Jewel 1
	endif
	disablenpc fnpc211
return
MD_Npc "1@drdo" "�������� � �����������#7e212" 4_TREASURE_BOX 57 223 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e213" 4_TREASURE_BOX 60 224 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e214" 4_TREASURE_BOX 57 226 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e215" 4_TREASURE_BOX 53 216 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e216" 4_TREASURE_BOX 55 218 3 0 0
OnClick:
	var fnpc216 = GetMDNpcName "�������� � �����������#7e216"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Seed_Of_Yggdrasil_ 3
	endif
	disablenpc fnpc216
return
MD_Npc "1@drdo" "�������� � �����������#7e217" 4_TREASURE_BOX 56 216 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e218" 4_TREASURE_BOX 42 216 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e219" 4_TREASURE_BOX 40 217 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e220" 4_TREASURE_BOX 38 215 3 0 0








MD_Npc "1@drdo" "�������#7e302" 4_M_ORIENT02 145 202 3 5 5
OnTouch:
	var str302 = GetMDNpcName "�������#7e302"
	var str303 = GetMDNpcName "�������#7e303"
	TalkShow str302 "����� ����..."
	DelayTime 1000
	disablenpc str302
	enablenpc str303
	var nya_map03 = GetMDMapName "1@drdo"
	Navigation_Active nya_map03 0 000 1 158 192
return


MD_Npc "1@drdo" "�������#7e303" 4_M_ORIENT02 158 192 3 5 5
OnInit:
	var str303 = GetMDNpcName "�������#7e303"
	disablenpc str303
return

OnTouch:
	var str303 = GetMDNpcName "�������#7e303"
	TalkShow str303 "�� ������!!"
	DelayTime 1000
	disablenpc str303
	var nya_map03 = GetMDMapName "1@drdo"
	Navigation_Active nya_map03 0 000 1 176 197
return


MD_Npc "1@drdo" "�������#7e301" 4_M_ORIENT02 176 197 3 0 0

OnInit:
	var str301 = GetMDNpcName "�������#7e301"
	disablenpc str301
return

OnClick:
 var str301 = GetMDNpcName "�������#7e301"
 var str302 = GetMDNpcName "�������#7e302"
 var str303 = GetMDNpcName "�������#7e303"
 var fnpc301 = GetMDNpcName "�������� � �����������#7e301"
 var mon301 = GetMDNpcName "��#7e301"
 var men_t = rand 1 2
 if (men_t == 1)
	 TalkShow str301 "������, � �� ���? ���� ��� ������ ��� ����?"
	 DelayTime 1500
	 TalkShow "" "�, ������?"
	 DelayTime 1500
	 TalkShow str301 "������� ���! ��� ���. ��� ���-�� ������..."
	 DelayTime 1500
	 TalkShow "" "�� ������ ������?"
	 DelayTime 1500
	 TalkShow str301 "������? ���, �� ����. � ����� ���� ������ ��� �����������."
	 DelayTime 1500
	 TalkShow str301 "������ ��������, ��� �������: ������� ������ ���������, ������� �� � ������� ���� � �����..."
	 DelayTime 1500
	 TalkShow str301 "� �����, ����� ������� ����, ����� �� ������..."
	 DelayTime 1500
	 TalkShow str301 "� �����, ��� ����� ������... �� ��� �� ������ � �������."
	 DelayTime 1500
	 TalkShow str301 "��� ������, ������� ������ �� ����, ����. ������� ���� �����... ������ ����..."
	 DelayTime 1500
	 TalkShow str301 "����� ����� ������! �� ��� ��� �����!"
	 DelayTime 1500
	 TalkShow str301 "������ ���� ������ � ���� �����! ������� � ������� ���� ������!"
	 DelayTime 1500
	 TalkShow str301 "���� �� ��� �������! ����� ����� ������! ��� �������!"
	 DelayTime 1500
	 TalkShow str301 "��� ����! ��� ����!!"
 else
	 TalkShow str301 "�� ������ ������� �������� ���� ������ ����. �� ��� ��� �� ���� � ������."
	 DelayTime 1500
	 TalkShow str301 "�� ���� ��������, ��� ������ ����� � ��� ��� � �����."
	 DelayTime 1500
	 TalkShow "" "�� ������?"
	 DelayTime 1500
	 TalkShow str301 "��� ��� �� ���� �� ������� ���� �������� ��� ����?"
	 DelayTime 1500
	 TalkShow "" "� �����, ����� ����� ���������� ��������."
	 DelayTime 1500
	 TalkShow str301 "������ �� �� ������ ���, ��� ����� �� ��������� ���� �� ��������?"
	 DelayTime 1500
	 TalkShow str301 "�� ������ ������� ��������� ���� ������ ���! �� �������, ��� ����������� ����� �����!"
	 DelayTime 1500
	 TalkShow "" "�, � ���� �� ����..."
	 DelayTime 1500
	 TalkShow str301 "�� ������������, ��� �������� ��������? �������� ����?"
	 DelayTime 1500
	 TalkShow str301 "�� ������� ���� � ������! ����, �� ������ ���� ����! �� ������ �� ��� �� ��������?"
	 DelayTime 1500
	 TalkShow str301 "���� �� �� ��, � �� ��� ���� ��������! ���� �� �� ��!"
	 DelayTime 1500
	 TalkShow str301 "��� ����! ��� ����!!"
 endif
 cmdothernpc mon301 "call"
 cmdothernpc fnpc301 "off"
 disablenpc str301
 disablenpc str302
 disablenpc str303
return

MD_Npc "1@drdo" "��#7e301" 4_RED_FLOWER 1 3 3 0 0

OnCommand: "call"
	resetmymob
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "��� ����! ��� ����! � ���� �������!"
	var nya_map03 = GetMDMapName "1@drdo"
	callmonster nya_map03 E_MD_BOX_PUPPET "������ � ������� " 140 230
	callmonster nya_map03 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 152 225
	callmonster nya_map03 E_MD_BOX_PUPPET "������ � ������� " 137 219
	callmonster nya_map03 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 151 218
	callmonster nya_map03 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 137 209
	callmonster nya_map03 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 147 209
	callmonster nya_map03 E_MD_BOX_PUPPET "������ � ������� " 136 198
	callmonster nya_map03 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 145 192
	callmonster nya_map03 E_MD_BOX_PUPPET "������ � ������� " 147 176
	callmonster nya_map03 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 163 185
	callmonster nya_map03 E_MD_BOX_PUPPET "������ � ������� " 169 175
	callmonster nya_map03 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 172 157
	callmonster nya_map03 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 185 158
	callmonster nya_map03 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 198 156
	callmonster nya_map03 E_MD_BOX_PUPPET "������ � ������� " 201 163
	callmonster nya_map03 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 197 169
	callmonster nya_map03 E_MD_BOX_PUPPET "������ � ������� " 199 184
	callmonster nya_map03 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 208 186
	callmonster nya_map03 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 221 181
	callmonster nya_map03 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 228 187
	callmonster nya_map03 E_MD_BOX_PUPPET "������ � ������� " 224 198
	callmonster nya_map03 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 214 205
	callmonster nya_map03 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 208 220
	callmonster nya_map03 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 197 213
return

OnMyMobDead:
DelayTime 100
var mon301 = GetMDNpcName "��#7e301"
var mon302 = GetMDNpcName "��#7e302"

if npcv mon301 [VAR_MYMOBCOUNT] < 1
	cmdothernpc mon302 "on"
endif
return

MD_Npc "1@drdo" "��#7e302" 4_BLUE_FLOWER 3 3 3 0 0

OnCommand: "on"
 resetmymob
 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "���������� ���� ��������������� � ����������."
 var nya_map01 = GetMDMapName "1@drdo"
 callmonster nya_map01 E_MD_DEPRESS_SOUL "���������� ���� " 176 197
 MonsterTalkShow "���������� ���� " "�� �������� ����? ���� �� ������, �� ������ ���� ������ �������� !!"
return


OnMyMobDead:
 DelayTime 100
 var mon302 = GetMDNpcName "��#7e302"
 var doo_r301 = GetMDNpcName "#7e301"
 
 if npcv mon302 [VAR_MYMOBCOUNT] < 1
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "���� ��� ������� � �������..."
	 DelayTime 1000
	 DelayTime 1000
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "���... ��� ����... ����� �������."
	 cmdothernpc doo_r301 "on"
 endif
 var nya_map03 = GetMDMapName "1@drdo"
 Navigation_Active nya_map03 0 000 1 197 152
return

MD_Warp "1@drdo" "#7e301" 197 152 2 2

OnInit:
	var doo_r301 = GetMDNpcName "#7e301"
	disablenpc doo_r301
return

OnCommand: "on"
	var doo_r301 = GetMDNpcName "#7e301"
	ShowEffect doo_r301 1073
	enablenpc doo_r301
return

OnTouch2:
	var nya_map03 = GetMDMapName "1@drdo"
	var str401 = GetMDNpcName "�������#7e401"
	enablenpc str401
	moveto nya_map03 196 127
return


MD_Npc "1@drdo" "�������� � �����������#7e301" 4_TREASURE_BOX 166 201 3 0 0
OnCommand: "off"
	var fnpc301 = GetMDNpcName "�������� � �����������#7e301"
	var fnpc302 = GetMDNpcName "�������� � �����������#7e302"
	var fnpc303 = GetMDNpcName "�������� � �����������#7e303"
	var fnpc304 = GetMDNpcName "�������� � �����������#7e304"
	var fnpc305 = GetMDNpcName "�������� � �����������#7e305"
	var fnpc306 = GetMDNpcName "�������� � �����������#7e306"
	var fnpc307 = GetMDNpcName "�������� � �����������#7e307"
	var fnpc308 = GetMDNpcName "�������� � �����������#7e308"
	var fnpc309 = GetMDNpcName "�������� � �����������#7e309"
	var fnpc310 = GetMDNpcName "�������� � �����������#7e310"
	var fnpc311 = GetMDNpcName "�������� � �����������#7e311"
	var fnpc312 = GetMDNpcName "�������� � �����������#7e312"
	var fnpc313 = GetMDNpcName "�������� � �����������#7e313"
	var fnpc314 = GetMDNpcName "�������� � �����������#7e314"
	var fnpc315 = GetMDNpcName "�������� � �����������#7e315"
	var fnpc316 = GetMDNpcName "�������� � �����������#7e316"
	var fnpc317 = GetMDNpcName "�������� � �����������#7e317"
	var fnpc318 = GetMDNpcName "�������� � �����������#7e318"
	var fnpc319 = GetMDNpcName "�������� � �����������#7e319"
	var fnpc320 = GetMDNpcName "�������� � �����������#7e320"
	var fnpc321 = GetMDNpcName "�������� � �����������#7e321"
	disablenpc fnpc301
	disablenpc fnpc302
	disablenpc fnpc303
	disablenpc fnpc304
	disablenpc fnpc305
	disablenpc fnpc306
	disablenpc fnpc307
	disablenpc fnpc308
	disablenpc fnpc309
	disablenpc fnpc310
	disablenpc fnpc311
	disablenpc fnpc312
	disablenpc fnpc313
	disablenpc fnpc314
	disablenpc fnpc315
	disablenpc fnpc316
	disablenpc fnpc317
	disablenpc fnpc318
	disablenpc fnpc319
	disablenpc fnpc320
	disablenpc fnpc321
return
MD_Npc "1@drdo" "�������� � �����������#7e302" 4_TREASURE_BOX 167 196 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e303" 4_TREASURE_BOX 178 190 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e304" 4_TREASURE_BOX 189 200 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e305" 4_TREASURE_BOX 189 205 3 0 0
OnClick:
	var fnpc305 = GetMDNpcName "�������� � �����������#7e305"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Violet_Jewel 1
	endif
	disablenpc fnpc305
return
MD_Npc "1@drdo" "�������� � �����������#7e306" 4_TREASURE_BOX 193 186 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e307" 4_TREASURE_BOX 195 182 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e308" 4_TREASURE_BOX 187 165 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e309" 4_TREASURE_BOX 186 160 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e310" 4_TREASURE_BOX 208 162 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e311" 4_TREASURE_BOX 206 166 3 0 0
OnClick:
	var fnpc311 = GetMDNpcName "�������� � �����������#7e311"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Cardinal_Jewel_ 1
	endif
	disablenpc fnpc311
return
MD_Npc "1@drdo" "�������� � �����������#7e312" 4_TREASURE_BOX 233 181 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e313" 4_TREASURE_BOX 231 186 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e314" 4_TREASURE_BOX 233 187 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e315" 4_TREASURE_BOX 201 233 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e316" 4_TREASURE_BOX 204 234 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e317" 4_TREASURE_BOX 203 231 3 0 0
OnClick:
	var fnpc317 = GetMDNpcName "�������� � �����������#7e317"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Skyblue_Jewel 1
	endif
	disablenpc fnpc317
return
MD_Npc "1@drdo" "�������� � �����������#7e318" 4_TREASURE_BOX 140 235 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e319" 4_TREASURE_BOX 137 234 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e320" 4_TREASURE_BOX 134 234 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e321" 4_TREASURE_BOX 140 192 3 0 0










MD_Npc "1@drdo" "�������#7e402" 4_F_SHABBY 191 116 3 5 5
OnTouch:
	var str402 = GetMDNpcName "�������#7e402"
	var str403 = GetMDNpcName "�������#7e403"
	TalkShow str402 "������� ��� ������ � ��� ���� "
	DelayTime 1000
	disablenpc str402
	enablenpc str403
	var nya_map04 = GetMDMapName "1@drdo"
	Navigation_Active nya_map04 0 000 1 184 102
return


MD_Npc "1@drdo" "�������#7e403" 4_F_SHABBY 184 102 3 5 5
OnInit:
	var str403 = GetMDNpcName "�������#7e403"
	disablenpc str403
return

OnTouch:
	var str403 = GetMDNpcName "�������#7e403"
	TalkShow str403 "� ���� ���������..."
	DelayTime 1000
	disablenpc str403
	var nya_map04 = GetMDMapName "1@drdo"
	Navigation_Active nya_map04 0 000 1 184 80
return



MD_Npc "1@drdo" "�������#7e401" 4_F_SHABBY 184 80 3 0 0

OnInit:
	var str401 = GetMDNpcName "�������#7e401"
	disablenpc str401
return

OnClick:
 var str401 = GetMDNpcName "�������#7e401"
 var str402 = GetMDNpcName "�������#7e402"
 var str403 = GetMDNpcName "�������#7e403"
 var fnpc401 = GetMDNpcName "�������� � �����������#7e401"
 var mon401 = GetMDNpcName "��#7e401"
 var men_t = rand 1 2
 if (men_t == 1)
	 TalkShow str401 "���� �� ������� ��� ���� � �����, ����� �� �� �������� ��������� ������?"
	 DelayTime 1500
	 TalkShow str401 "��� ������ ����� ����������� � ����������. ��� �������� ������, � ��� ������� ������ � ������ ��� ������."
	 DelayTime 1500
	 TalkShow str401 "��... ��� �� ��� ��� ������? ���� �� ��� �������? ���� �����?"
	 DelayTime 1500
	 TalkShow "" "���� ������?"
	 DelayTime 1500
	 TalkShow str401 "������? � �� ����. �� ��� ��? �, ��� �� ��� �� ���, ��� ���� ���������. ������ ����������� ��� �� ����?"
	 DelayTime 1500
	 TalkShow "" "��� �� ������ � ����?"
	 DelayTime 1500
	 TalkShow str401 "��� ���������. ���� �� ��� ��������, � ������� ������. �� ������ �������� ��� �� ��� �������?"
	 DelayTime 1500
	 TalkShow "" "�����? � �� ����� �����, �� � �� ����� ����� �� ����� �����."
	 DelayTime 1500
	 TalkShow str401 "� ��� ���� �����. ������, �� ����������� ��, ���... ��� �������..."
	 DelayTime 1500
	 TalkShow str401 "�� ��� ������ � ��������� �����..."
	 DelayTime 1500
	 TalkShow str401 "� �������� ����... �, �... �����... ������, ������ � ���� ����...!"
	 DelayTime 1500
	 TalkShow str401 "� ���� �� ���� ������������ ������! � ������ ���������! ������ � ���� ������ ���� �����!"
	 DelayTime 1500
	 TalkShow str401 "������, ����� ��� ����� ������ ��� ��������!"
	 DelayTime 1500
	 TalkShow str401 "��� ����! ��� ����!!"
 else
	 TalkShow str401 "�� ����. �����? �� ����� ������ "
	 DelayTime 1500
	 TalkShow "" "�, ������?"
	 DelayTime 1500
	 TalkShow str401 "��, ��� �������! ������ �� �����?"
	 DelayTime 1500
	 TalkShow "" "� �����, ����� ����-������ �����."
	 DelayTime 1500
	 TalkShow str401 "���, �� ������, ��� ��� �� �����? ���?"
	 DelayTime 1500
	 TalkShow "" "� ������ ����� ����-�� ���..."
	 DelayTime 1500
	 TalkShow str401 "������ ���� �������, ����� ������ ����, ������ �� ����!"
	 DelayTime 1500
	 TalkShow str401 "�� ������, ������ ���� �������� ���� � ������� �� ������������?"
	 DelayTime 1500
	 TalkShow str401 "� ������ ����, ����� ������������ ���, � ��� ��� ���������, �� ��� ��? � ����� ��� �������������!"
	 DelayTime 1500
	 TalkShow str401 "� ���� ������ �� ���� �������! � ���� �� ���� ���������! ���� ����� �����, ������� ��� �� �������!"
	 DelayTime 1500
	 TalkShow str401 "���� �� � ����, ��� ��� ����� ���, � �� �� ������ ����!"
	 DelayTime 1500
	 TalkShow str401 "����� ���� ����� �� �����!"
	 DelayTime 1500
	 TalkShow str401 "��� ����! ��� ����!!!"
 endif
 cmdothernpc mon401 "call"
 cmdothernpc fnpc401 "off"
 disablenpc str401
 disablenpc str402
 disablenpc str403
return

MD_Npc "1@drdo" "��#7e401" 4_RED_FLOWER 1 4 3 0 0

OnCommand: "call"
	resetmymob
	broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "��� ����! ��� ����! �����, �������� ������� ����, ���� �������!"
	var nya_map04 = GetMDMapName "1@drdo"
	callmonster nya_map04 E_MD_BOX_PUPPET "������ � ������� " 177 121
	callmonster nya_map04 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 194 122
	callmonster nya_map04 E_MD_BOX_PUPPET "������ � ������� " 208 124
	callmonster nya_map04 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 204 114
	callmonster nya_map04 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 187 114
	callmonster nya_map04 E_MD_BOX_PUPPET "������ � ������� " 180 106
	callmonster nya_map04 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 198 115
	callmonster nya_map04 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 201 104
	callmonster nya_map04 E_MD_BOX_PUPPET "������ � ������� " 209 106
	callmonster nya_map04 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 210 96
	callmonster nya_map04 E_MD_BOX_PUPPET "������ � ������� " 208 81
	callmonster nya_map04 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 198 92
	callmonster nya_map04 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 200 83
	callmonster nya_map04 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 205 67
	callmonster nya_map04 E_MD_BOX_PUPPET "������ � ������� " 213 70
	callmonster nya_map04 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 167 38
	callmonster nya_map04 E_MD_BOX_PUPPET "������ � ������� " 179 38
	callmonster nya_map04 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 174 42
	callmonster nya_map04 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 166 46
	callmonster nya_map04 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 175 53
	callmonster nya_map04 E_MD_BOX_PUPPET "������ � ������� " 181 51
	callmonster nya_map04 E_MD_S_TREASURE_BOX "�������, ������� ������� ��� ������ " 177 64
	callmonster nya_map04 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 169 70
	callmonster nya_map04 E_MD_B_TREASURE_BOX "�������, ������� ������� ��� ������ " 174 78
	callmonster nya_map04 E_MD_BOX_PUPPET "������ � ������� " 184 72
return


OnMyMobDead:
 DelayTime 100
 var mon401 = GetMDNpcName "��#7e401"
 var mon402 = GetMDNpcName "��#7e402"
 
 if npcv mon401 [VAR_MYMOBCOUNT] < 1
	 cmdothernpc mon402 "on"
 endif
return


MD_Npc "1@drdo" "��#7e402" 4_BLUE_FLOWER 3 4 3 0 0

OnCommand: "on"
 resetmymob
 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "���������� ���� ��������������� � ����������."
 var nya_map01 = GetMDMapName "1@drdo"
 callmonster nya_map01 E_MD_DEPRESS_SOUL "���������� ���� " 184 80
 MonsterTalkShow "���������� ���� " "� �� ���� ���� ������������ ����������! ��, ������ ����, ���� ���������!"
return


OnMyMobDead:
 DelayTime 100
 var mon402 = GetMDNpcName "��#7e402"
 var doo_r401 = GetMDNpcName "#7e401"
 
 if npcv mon402 [VAR_MYMOBCOUNT] < 1
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "�� .. ������... ������... ������� ����� ����� ���������."
	 DelayTime 1000
	 DelayTime 1000
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "���... ��� ����... ����� �������."
	 cmdothernpc doo_r401 "on"
 endif
 var nya_map04 = GetMDMapName "1@drdo"
 Navigation_Active nya_map04 0 000 1 161 62
return


MD_Warp "1@drdo" "#7e401" 161 62 2 2

OnInit:
	var doo_r401 = GetMDNpcName "#7e401"
	disablenpc doo_r401
return

OnCommand: "on"
	var doo_r401 = GetMDNpcName "#7e401"
	ShowEffect doo_r401 1073
	enablenpc doo_r401
return

OnTouch2:
	var nya_map04 = GetMDMapName "1@drdo"
	var str501 = GetMDNpcName "����#7e501"
	enablenpc str501
	moveto nya_map04 134 61
return


MD_Npc "1@drdo" "�������� � �����������#7e401" 4_TREASURE_BOX 186 88 3 0 0
OnCommand: "off"
	var fnpc401 = GetMDNpcName "�������� � �����������#7e401"
	var fnpc402 = GetMDNpcName "�������� � �����������#7e402"
	var fnpc403 = GetMDNpcName "�������� � �����������#7e403"
	var fnpc404 = GetMDNpcName "�������� � �����������#7e404"
	var fnpc405 = GetMDNpcName "�������� � �����������#7e405"
	var fnpc406 = GetMDNpcName "�������� � �����������#7e406"
	var fnpc407 = GetMDNpcName "�������� � �����������#7e407"
	var fnpc408 = GetMDNpcName "�������� � �����������#7e408"
	var fnpc409 = GetMDNpcName "�������� � �����������#7e409"
	var fnpc410 = GetMDNpcName "�������� � �����������#7e410"
	var fnpc411 = GetMDNpcName "�������� � �����������#7e411"
	var fnpc412 = GetMDNpcName "�������� � �����������#7e412"
	var fnpc413 = GetMDNpcName "�������� � �����������#7e413"
	var fnpc414 = GetMDNpcName "�������� � �����������#7e414"
	var fnpc415 = GetMDNpcName "�������� � �����������#7e415"
	var fnpc416 = GetMDNpcName "�������� � �����������#7e416"
	var fnpc417 = GetMDNpcName "�������� � �����������#7e417"
	var fnpc418 = GetMDNpcName "�������� � �����������#7e418"
	var fnpc419 = GetMDNpcName "�������� � �����������#7e419"
	var fnpc420 = GetMDNpcName "�������� � �����������#7e420"
	var fnpc421 = GetMDNpcName "�������� � �����������#7e421"
	disablenpc fnpc401
	disablenpc fnpc402
	disablenpc fnpc403
	disablenpc fnpc404
	disablenpc fnpc405
	disablenpc fnpc406
	disablenpc fnpc407
	disablenpc fnpc408
	disablenpc fnpc409
	disablenpc fnpc410
	disablenpc fnpc411
	disablenpc fnpc412
	disablenpc fnpc413
	disablenpc fnpc414
	disablenpc fnpc415
	disablenpc fnpc416
	disablenpc fnpc417
	disablenpc fnpc418
	disablenpc fnpc419
	disablenpc fnpc420
	disablenpc fnpc421
return
MD_Npc "1@drdo" "�������� � �����������#7e402" 4_TREASURE_BOX 189 77 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e403" 4_TREASURE_BOX 192 82 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e404" 4_TREASURE_BOX 190 87 3 0 0
OnClick:
	var fnpc404 = GetMDNpcName "�������� � �����������#7e404"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Seed_Of_Yggdrasil_ 3
	endif
	disablenpc fnpc404
return
MD_Npc "1@drdo" "�������� � �����������#7e405" 4_TREASURE_BOX 186 88 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e406" 4_TREASURE_BOX 181 86 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e407" 4_TREASURE_BOX 178 83 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e408" 4_TREASURE_BOX 179 79 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e409" 4_TREASURE_BOX 182 75 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e410" 4_TREASURE_BOX 170 97 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e411" 4_TREASURE_BOX 168 93 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e412" 4_TREASURE_BOX 169 71 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e413" 4_TREASURE_BOX 165 52 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e414" 4_TREASURE_BOX 173 37 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e415" 4_TREASURE_BOX 176 38 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e416" 4_TREASURE_BOX 179 40 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e417" 4_TREASURE_BOX 215 69 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e418" 4_TREASURE_BOX 213 67 3 0 0
OnClick:
	var fnpc418 = GetMDNpcName "�������� � �����������#7e418"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Cardinal_Jewel_ 2
	endif
	disablenpc fnpc418
return
MD_Npc "1@drdo" "�������� � �����������#7e419" 4_TREASURE_BOX 208 63 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e420" 4_TREASURE_BOX 207 123 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e421" 4_TREASURE_BOX 177 121 3 0 0
OnClick:
	var fnpc421 = GetMDNpcName "�������� � �����������#7e421"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Azure_Jewel 1
	endif
	disablenpc fnpc421
return







MD_Npc "1@drdo" "����#7e501" E_MD_NYAILO 129 128 3 5 5

OnInit:
	var str501 = GetMDNpcName "����#7e501"
	disablenpc str501
return

OnTouch2:
 var str501 = GetMDNpcName "����#7e501"
 var fnpc501 = GetMDNpcName "�������� � �����������#7e501"
 var mon501 = GetMDNpcName "��#7e501"
 TalkShow str501 "�� �� � ����, ����� �� �������� ����."
 DelayTime 1500
 TalkShow "" "��... ���� �� �������?"
 DelayTime 1500
 TalkShow str501 "��� ���� ����� ����� ����. � ����� "
 DelayTime 1500
 TalkShow "" "�� �����-������ ������ ��������� ��� �����? � ��� ����-�� �� ����� ������."
 DelayTime 1500
 TalkShow str501 "������ ����, ��� ���� ����� ����, ���� ���������� ���-�� �����, ���� ��������� �� ����� ����������."
 DelayTime 1500
 TalkShow "" "��� ������ ���� ������?"
 DelayTime 1500
 TalkShow str501 "�� �������, �� � �������� ��������..."
 DelayTime 1500
 TalkShow str501 "��� �������� ���� �����, � ��� ���� - ���. ���, �� ��� �� ���������� � ��� ������, - ��� ����."
 DelayTime 1500
 TalkShow "" "��� ���... ��? ��� ��?"
 DelayTime 1500
 TalkShow str501 "� ����. � ����� ���, ��� ����������, ���� �."
 DelayTime 1500
 TalkShow "" "�� ����� �����, ������� ���� �����?"
 DelayTime 1500
 TalkShow str501 "���� - ��� ����� ���� ��������, � ������� ��������� ����. �� ������ ��� � ������ � ���� ����."
 DelayTime 1500
 TalkShow "" "������?"
 DelayTime 1500
 TalkShow str501 "���� ��� ������� �� ����������� ����� � ������, ������� ����� ��������� � ����� �����."
 DelayTime 1500
 TalkShow str501 "������� � �������."
 DelayTime 1500
 TalkShow str501 "������ ������� ������ ����� ����������� ����."
 DelayTime 1500
 TalkShow str501 "�� ���� ������� ���� � ������� �����������. ������, � ��� ��� ������� ��������� ���������� ���������."
 DelayTime 1500
 TalkShow "" "��������? �� ���������� �����, ��������� �� ����� � ����������?"
 DelayTime 1500
 TalkShow str501 "����� ��� �� �����, ��� �����, ���������� �� ��������������?"
 DelayTime 1500
 TalkShow "" "�� ��� ������!"
 DelayTime 1500
 TalkShow str501 "������ ���� ��� ������� �������."
 DelayTime 1500
 TalkShow "" "��� ���� ������!"
 DelayTime 1500
 TalkShow str501 "������, �� �� ����������� ����������� ����. ����� �����. ���� �� ������� �������..."
 cmdothernpc mon501 "call"
 cmdothernpc fnpc501 "off"
 disablenpc str501
return

MD_Npc "1@drdo" "��#7e501" 4_YELL_FLOWER 2 5 3 0 0

OnCommand: "call"
 resetmymob
 DelayTime 1500
 var nya_map05 = GetMDMapName "1@drdo"
 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "� ������ ���� � ������ ����� "
 callmonster nya_map05 E_MD_NYAILO "���� " 129 128
return


OnMyMobDead:
 DelayTime 100
 var mon501 = GetMDNpcName "��#7e501"
 var doo_r501 = GetMDNpcName "#7e501"
 if npcv mon501 [VAR_MYMOBCOUNT] < 1
	 broadcastinmap2 "00ff00" FW_NORMAL 12 0 0 "���� ���� �������� �� ��������, � �� ������� !!!"
	 cmdothernpc doo_r501 "on"
 endif
 var nya_map05 = GetMDMapName "1@drdo"
 Navigation_Active nya_map05 0 000 1 130 135
return



MD_Warp "1@drdo" "#7e501" 130 135 2 2

OnInit:
	var doo_r501 = GetMDNpcName "#7e501"
	disablenpc doo_r501
return

OnCommand: "on"
	var doo_r501 = GetMDNpcName "#7e501"
	ShowEffect doo_r501 1073
	enablenpc doo_r501
return

OnTouch2:
	moveto "malangdo" 214 253
return

MD_Npc "1@drdo" "�������� � �����������#7e501" 4_TREASURE_BOX 119 88 3 0 0
OnCommand: "off"
	var fnpc501 = GetMDNpcName "�������� � �����������#7e501"
	var fnpc502 = GetMDNpcName "�������� � �����������#7e502"
	var fnpc503 = GetMDNpcName "�������� � �����������#7e503"
	var fnpc504 = GetMDNpcName "�������� � �����������#7e504"
	var fnpc505 = GetMDNpcName "�������� � �����������#7e505"
	var fnpc506 = GetMDNpcName "�������� � �����������#7e506"
	var fnpc507 = GetMDNpcName "�������� � �����������#7e507"
	var fnpc508 = GetMDNpcName "�������� � �����������#7e508"
	disablenpc fnpc501
	disablenpc fnpc502
	disablenpc fnpc503
	disablenpc fnpc504
	disablenpc fnpc505
	disablenpc fnpc506
	disablenpc fnpc507
	disablenpc fnpc508
return
MD_Npc "1@drdo" "�������� � �����������#7e502" 4_TREASURE_BOX 149 90 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e503" 4_TREASURE_BOX 142 74 3 0 0
OnClick:
	var fnpc503 = GetMDNpcName "�������� � �����������#7e503"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Cardinal_Jewel_ 1
	endif
	disablenpc fnpc503
return
MD_Npc "1@drdo" "�������� � �����������#7e504" 4_TREASURE_BOX 151 134 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e505" 4_TREASURE_BOX 154 129 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e506" 4_TREASURE_BOX 116 141 3 0 0
MD_Npc "1@drdo" "�������� � �����������#7e507" 4_TREASURE_BOX 125 74 3 0 0
OnClick:
	var fnpc507 = GetMDNpcName "�������� � �����������#7e507"
	var bo_mul = rand 1 100
	if ((bo_mul == 23) | (bo_mul == 55) | (bo_mul == 77))
	TalkShow "" "��! ���� ���-��!!!"
	getitem Seed_Of_Yggdrasil_ 3
	endif
	disablenpc fnpc507
return
MD_Npc "1@drdo" "�������� � �����������#7e508" 4_TREASURE_BOX 105 118 3 0 0



