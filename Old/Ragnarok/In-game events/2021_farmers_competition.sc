npc "prontera" "ո��� " 4_M_NOV_HUNT 125 125 6 0 0
OnInit:
	SetGlobalStr "farm_mobname" "���� "
	SetGlobalStr "farm_keymobname" "���� "
	SetGlobalVar "farm_winners" 4
	SetGlobalVar "farm_comp_num" 10
	InitTimer
return

OnClick:
	var mobID = GetGlobalVar "farm_mobID"
	var mob_count = GetGlobalVar "farm_mob_count"
	var mob_name = GetGlobalStr "farm_mobname"
	var keymobID = GetGlobalVar "farm_keymobID"
	var keymob_count = GetGlobalVar "farm_keymob_count"
	var keymob_name = GetGlobalStr "farm_keymobname"
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	var farm_winners = GetGlobalVar "farm_winners"
	var farm_win_count = GetGlobalVar "farm_win_count"
	var mobs_remaining = npcv "ո��� " [VAR_MYMOBCOUNT]
	var player_win_count = v[jp_event62]
	var game_id = GetGlobalVar "farm_comp_num"
	
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		dialog "mobs remaining: "+mobs_remaining+""
		dialog "mobs ID: "+mobID+""
		dialog "mobs count: "+mob_count+""
		dialog "mobs name: "+mob_name+""
		dialog "key mobs ID: "+keymobID+""
		dialog "key mobs count: "+keymob_count+""
		dialog "key mobs name: "+keymob_name+""
		dialog "game ID: "+game_id+""

		while (1)
			choose menu "Mob ID " "Mob Name" "Mob Count " "Key Mob ID " "Key Mob Name" "Key Mob Count" "Win Count" "Turn on " "Kill mobs " "My wins" "Start timer" "Stop timer"
				case 1			
					dlgwrite 0 30000	
					SetGlobalVar "farm_mobID" input
				break
				case 2
					dialog "Enter mobname "
					dlgwritestr
					SetGlobalStr "farm_mobname" inputstr
				break
				case 3			
					dlgwrite 0 15000	
					if ( input > 15000 )
						dialog "You can't choose more than 15000"
						SetGlobalVar "farm_mob_count" 15000
					else
						SetGlobalVar "farm_mob_count" input
					endif
				break
				case 4		
					dlgwrite 0 30000	
					SetGlobalVar "farm_keymobID" input
				break
				case 5
					dialog "Enter mobname "
					dlgwritestr
					SetGlobalStr "farm_keymobname" inputstr
				break
				case 6			
					dlgwrite 0 15000	
					if ( input > 15000 )
						dialog "You can't choose more than 15000"
						SetGlobalVar "farm_keymob_count" 15000
					else
						SetGlobalVar "farm_keymob_count" input
					endif
				break
				case 7
					var farm_keymob_count = GetGlobalVar "farm_keymob_count"
					dlgwrite 0 farm_keymob_count
					if ( input > farm_keymob_count )
						dialog "You can't choose more than "+farm_keymob_count+""
						SetGlobalVar "farm_win_count" farm_keymob_count
					else
						SetGlobalVar "farm_win_count" input
					endif
				break
				case 8
					stoptimer
					InitTimer
				break
				case 9
					cmdothernpc "ո��� " "kill"
					cmdothernpc "�������� ո���#blue_team" "kill"
					cmdothernpc "�������� ո���#red_team" "kill"
				break
				case 10
					dlgwrite 0 1000	
					if ( input > 1000 )
						dialog "You can't choose more than 1000"
						setitem v[jp_event62] 1000
					else
						setitem v[jp_event62] input
					endif
				break
				case 11
					InitTimer
				break
				case 12
					stoptimer
				break
			endchoose
		endwhile
	else
		if v[jp_event60] == 0
			dialog "[ո���]"
			dialog "����������! � ո���, � ��, "
			dialog "��������, �����! � ����� ����� "
			dialog "�� ������ ����������. ��������,"
			dialog "�� ������� ��� ������. "
			wait
			dialog "[ո���]"
			dialog "���� � ���, ��� � ����� "
			dialog "��� �����, ��� ����� �������� "
			dialog "������� ���� ��������� � "
			dialog "���������� ����, �������� "
			dialog "�� �������� � ��������. "
			wait
			dialog "[ո���]"
			dialog "� ��� ��������� ��� �������� " 
			dialog "�� ����� ���� � ������� "
			dialog "��������, ��� ��� �� ����� "
			dialog "�����, ��� � ����� ������� " 
			dialog "��� ���� ���������� �����. " 
			wait
			dialog "[ո���]"
			dialog "����� ���������� ������, "
			dialog "������ ���� �, �������, "
			dialog "�������� ����� - ����� ��� ��! "
			wait
			dialog "[ո���]"
			dialog "� ��� ���������� ���� �����, "
			dialog "����� �������������, � ����� "
			dialog "������ � ���������� ������. "
			dialog "� �������� �����, ��� � ������� "
			dialog "��������� � ������ ���������. "
			wait 
			dialog "[ո���]"
			dialog "��� ��� ��������� �� ������� "
			dialog "�������. �� ���� �������� ������. "
			dialog "�� �� ��� �����-�� ��������. "
			dialog "����� ������������ � ���������, "
			dialog "�, ��� �������, ���� ��������� ���������� ���! "
			wait
			dialog "[ո���]"
			dialog "�� � ���� ������ �� ������ �����, "
			dialog "� ������ ��������. ����� �� �����, "
			dialog "��� � ������ �� � �����. �� ��� "
			dialog "������� ��� ���, '������ ���� "
			dialog "����� �� �����, ������ � ��������� "
			dialog "����� ��� ������'. "
			wait
			dialog "[ո���]"
			dialog "������� ��� ����� ��� ������. "
			dialog "���� ������� �� ������� ������ " 
			dialog "� ������� �������, ������� ��� "
			dialog "�� ��� 5 ������ �������� ����, 3 ����� �������� ������� "
			dialog "� 1 ������. ������ � �������� " 
			dialog "���� �� ���� ���������� �����. "
			setquest 17308
			setitem jp_event60 1
			close
			return
		elseif	v[jp_event60] == 1
			if (v[Magic_Clam_Flesh] > 4) & (v[Fore_Flank_Sirloin] > 2) & (v[MAAMOUL_] > 0)
				var item_check = GetInventoryRemainCount Old_Yellow_Box 1
				if (item_check == 1)
					dialog "[ո���]"
					dialog "�����������! ��� �� ��� ����! "
					dialog "���-�... ���������... "
					wait
					dialog "[ո���]"
					dialog "���������! �������� � ������� "
					dialog "������ � ��������! ������� "
					dialog "���������� �������� ��. "
					dialog "��� � ���� �������! ������� " 
					dialog "���� �������! � ���� ���� "
					dialog "��������������� ������ ��� �������. "
					wait
					dialog "[ո���]"
					dialog "[��� ��������� ������� ��� "
					dialog "������� ��� ������� � �����, "
					dialog "�� ������ ��� ��� ��������� "
					dialog "������� ��-�������. ���, "
					dialog "�������, ����������... "
					dialog "��������, ��� ���. "
					dropitem Magic_Clam_Flesh 5
					dropitem Fore_Flank_Sirloin 3
					dropitem MAAMOUL_ 1
					getitem Old_Yellow_Box 1
					setitem jp_event60 2
					completequest 17308
					close
					return
				elseif ((item_check == 2) | (item_check == 3))
					dialog "[ո���]"
					dialog "� ���� ���� ����� � ���������. "
					dialog "�������� ������� � �����������. "
					close
				endif
				
			else
				dialog "[ո���]"
				dialog "����-�� �� �������. ����� �������� � �������. "
				close
				return
			endif			
		elseif v[jp_event60] > 1
			dialog "[ո���]"
			dialog "�-�-�... ������ ����! "
			dialog "� �����, �� ����� ��� "
			dialog "�� ��������, ������� � "
			dialog "��������� ���� ������������� "
			dialog "� ������������. ���������? "
			wait
			choose menu "�������! " "� ��� �� ������������? " "� ������ �� �������� " "� ������� � ���� �����? " "���� ��� ������� "
				case 1
					var mapcount_1 = GetPCCount "egef_swn1.gat"
					var mapcount_2 = GetPCCount "egef_swn2.gat"
					var rand_x = rand 180 190
					var rand_y = rand 160 170
					dialog "[ո���]"
					dialog "������ ������� "
					dialog "� ������� �������: "+mapcount_1+" ����������. "
					dialog "� ����� �������: "+mapcount_2+" ����������. "
					wait
					choose menu "������� ������� " "����� ������� " "���-�� �� �������..."
						case 1
							if mapcount_1 - mapcount_2 > 1
								dialog "[ո���]"
								dialog "� ������� ������� ����� "
								dialog "����������. "
								dialog "�� ������ �������������� "
								dialog "� ����� ������� ��� ������� ���������. "
								close
								return
							else
								var competition_number = GetGlobalVar "farm_comp_num"
								var cont_id = competition_number
								var wug_check = IsEffectStatus EFFECT_STATE_WUG
								var wugrider_check = IsEffectStatus EFFECT_STATE_WUGRIDER
								var drag_check = IsEffectStatus EFFECT_STATE_DRAGON
								var mado_check = IsMadogear
								if ((v[VAR_ISCARTON] == 1) | (v[VAR_ISPECOON] == 1) | (v[VAR_ISFALCONON] == 1) | (wug_check == 1) | (wugrider_check == 1) | (drag_check == 1) | (mado_check == 1))
									dialog "[ո���]"
									dialog "� �� ���� ���� �������, ���� � ���� ���� ������, ����� ��� ������� ��������."
									close
									return
								endif
								if v[VAR_WEIGHT] != 0
									dialog "[ո���]"
									dialog "� ��� ������ ��� ����������. "
									close
									return	
								elseif boarding == 1
									dialog "[ո���]"
									dialog "���� ���������� ��������� "
									close							
								elseif allow_to_hunt == 1
									dialog "[ո���]"
									dialog "�������! � �������� ���� � ����� �������! "
									close
									cart off
									peco off
									UseSkillToPC 2052 5 0 0
									ResetBuff "EFST_MOVHASTE_POTION"
									ResetBuff "EFST_MOVHASTE_HORSE"
									close
									setitem jp_event61 cont_id
									moveto "egef_swn1" rand_x rand_y
									return
								else
									dialog "[ո���]"
									dialog "���� ���� ������������. ������� �������. "
									close
									return
								endif
							endif
						break
						case 2
							if mapcount_2 - mapcount_1 > 1
								dialog "[ո���]"
								dialog "� ����� ������� ����� ����������. "
								dialog "�� ������ �������������� � ������� ������� "
								dialog "��� ������� ���������. "
								close
								return
							else
								var competition_number = GetGlobalVar "farm_comp_num"
								var cont_id = competition_number + 1
								var wug_check = IsEffectStatus EFFECT_STATE_WUG
								var wugrider_check = IsEffectStatus EFFECT_STATE_WUGRIDER
								var drag_check = IsEffectStatus EFFECT_STATE_DRAGON
								var mado_check = IsMadogear
								if ((v[VAR_ISCARTON] == 1) | (v[VAR_ISPECOON] == 1) | (v[VAR_ISFALCONON] == 1) | (wug_check == 1) | (wugrider_check == 1) | (drag_check == 1) | (mado_check == 1))
									dialog "[ո���]"
									dialog "� �� ���� ���� �������, ���� � ���� ���� ������, ����� ��� ������� ��������."
									close
									return
								endif
								if v[VAR_WEIGHT] != 0
									dialog "[ո���]"
									dialog "� ��� ������ ��� ����������. "
									close
									return	
								elseif boarding == 1
									dialog "[ո���]"
									dialog "���� ���������� ���������. "
									close							
								elseif allow_to_hunt == 1
									dialog "[ո���]"
									dialog "�������! � �������� ���� � ����� �������! "
									close
									cart off
									peco off
									UseSkillToPC 2052 5 0 0
									ResetBuff "EFST_MOVHASTE_POTION"
									ResetBuff "EFST_MOVHASTE_HORSE"
									close
									setitem jp_event61 cont_id
									moveto "egef_swn2" rand_x rand_y
									return
								else
									dialog "[ո���]"
									dialog "���� ���� ������������. ������� �������. "
									close
									return
								endif
							endif
						break
						case 3
						break
					endchoose
				break
				case 2
					dialog "[ո���]"
					dialog "����� ���, �� �����-������ "
					dialog "����� ������? ���� ���, "
					dialog "�� �� ���� �� �������������, "
					dialog "��� ��� ������! ��� ������, "
					dialog "������, ����������! "
					wait
					dialog "[ո���]"
					dialog "��� ���, � ��������� ���� "
					dialog "������������ � ������� ������� "
					dialog "� ������� � �������� ������ "
					dialog "������� ������� ����������. "
					wait
					dialog "������ ��� �� ����� ����������� "
					dialog "���� ������! ����� ����� "+farm_win_count+""
					dialog "������ ��� ������ ������! "
					dialog "��� ������ ����� �� ����������, "
					dialog "������� ��� ������ �� ������ ���� ��� � �������. "
					wait
					dialog "[ո���]"
					dialog "�� ���� �� �����, ��� ��� ��� "
					dialog "�������, �� �� ����������! "
					dialog "���� ������ ��������� � ����� "
					dialog "��������� �����������. ������ "
					dialog "������������ ���������� � �����������! "
					wait
					dialog "[ո���]"
					dialog "������ �������� ���, �������� ��� "
					dialog "� ����� ���� � ����� ������� �����, "
					dialog "�������� �� ��� ����������. "
					wait
					dialog "[ո���]"
					dialog "�� �������, ������� ������ ������� "
					dialog "���� ������ ��� ������, ���������. "
					dialog "�� ������ ������� ��������� ���������� "
					dialog "�������, ������� � ����� ���� �� "
					dialog "�����. ��� ����� ����� ������ ���� "
					dialog "����� ����� ������� �� ���. "
					dialog "����� ���� ������ ����� ���������. "
					wait
					dialog "[ո���]"
					dialog "�� ���� ��� �������������� �������, "
					dialog "�� ������, ������, ������ � "
					dialog "������ 5-�� ������! �� ���� "
					dialog "���������� ���� ���������, "
					dialog "�� �����, ��� ����� ������� "
					dialog "������ ������� ����� ����� ������ "
					dialog "�� ������. *����������� � ��������* "
					wait
					dialog "[ո���]"
					dialog "��� � ��� �������. ������ ������ �� ��������!"
					close
					return
				break
				case 3
					var competition_number = GetGlobalVar "farm_comp_num"
					var farm_winners = GetGlobalVar "farm_winners"
					if farm_winners == 1
						var win_id = competition_number - 2
					elseif farm_winners == 2
						var win_id = competition_number - 1
					else
						dialog "[ո���]"
						dialog "�� ������ ������� ������ "
						dialog "��� ���� ������� ���������. "
						dialog "� ����� ������, ���� � ���� "
						dialog "��� ���� ������ ���. "
						dialog "����� ������� � ��������� ���� ������������. "
						close
						return
					endif
					if (v[jp_event61] == win_id) & (allow_to_hunt == 1)
						dialog "[ո���]"
						dialog "�������! �� �������! ��� ���� ����������� �������! "
						setitem jp_event62 (v[jp_event62]+1)
						dialog "� ���� "+v[jp_event62]+" �����. "
						wait
						var item_check = GetInventoryRemainCount Old_Yellow_Box 1
						if (item_check == 1)
							getitem Old_Yellow_Box 1
							dialog "[ո���]"
							dialog "�������! ������� ���! "
							setitem jp_event61 3
							close
						elseif ((item_check == 2) | (item_check == 3))
							dialog "[ո���]"
							dialog "� ���� ���� ����� � ���������. "
							dialog "�������� ������� � �����������. "
							close
						endif
					else
						dialog "[ո���]"
						dialog "�� ������ ������� ������ "
						dialog "��� ���� ������� ���������. "
						dialog "� ����� ������, ���� � ���� "
						dialog "��� ���� ������ ���. "
						dialog "����� ������� � ��������� ���� ������������. "
						close
						return
					endif
					if v[jp_event61] == 3
						if v[jp_event62] == 1
							dialog "[ո���]"
							dialog "��� ���� ������ ������, "
							dialog "���� ��������� ��� � ���! �����! "
							var item_check = GetInventoryRemainCount Fore_Flank_Sirloin 3
							if (item_check == 1)
								getitem Fore_Flank_Sirloin 3
								setitem jp_event61 4
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[ո���]"
								dialog "� ���� ���� ����� � ���������. "
								dialog "�������� ������� � �����������. "
								close
							endif
						elseif v[jp_event62] == 2
							dialog "[ո���]"
							dialog "������ ������! �������! "
							dialog "��� ����! "
							var item_check = GetInventoryRemainCount MAAMOUL_ 3
							if (item_check == 1)
								getitem MAAMOUL_ 3
								setitem jp_event61 4
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[ո���]"
								dialog "� ���� ���� ����� � ���������. "
								dialog "�������� ������� � �����������. "
								close
							endif
						elseif v[jp_event62] == 3
							dialog "[ո���]"
							dialog "��� � ������ ������������ ������! ����������! "
							dialog "���� �� � �������������! "
							var item_check = GetInventoryRemainCount C_Chicken_Hat 1
							if (item_check == 1)
								getitem C_Chicken_Hat 1
								setitem jp_event61 4
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[ո���]"
								dialog "� ���� ���� ����� � ���������. "
								dialog "�������� ������� � �����������. "
								close
							endif
						elseif v[jp_event62] % 5 == 0
							dialog "[ո���]"
							dialog "�� ������� "+v[jp_event62]+" ���! "
							dialog "��� ��� ���� ���������� ��� "
							dialog "���� �������! ������ ��� 5 ���, "
							dialog "����� ����� �������� �������������� �������. "
							var item_check = GetInventoryRemainCount Old_Yellow_Box 1
							if (item_check == 1)
								getitem Old_Yellow_Box 1
								setitem jp_event61 4
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[ո���]"
								dialog "� ���� ���� ����� � ���������. "
								dialog "�������� ������� � �����������. "
								close
							endif
						else
							setitem jp_event61 4
						close
						return
						endif
					endif
				break
				case 4
					dialog "[ո���]"
					dialog "� ���� "+player_win_count+" �����."
					close
					return
				break
			endchoose
		endif
	endif
return

OnTimer: 0
	var competition_number = GetGlobalVar "farm_comp_num"
	var competition_number = competition_number + 2
	SetGlobalVar "allow_to_hunt" 1
	SetGlobalVar "farm_comp_num" competition_number
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "���������� �������� ����� 10 �����! ����������� �������. "
	cmdothernpc "ո��� " "end"
return
OnTimer: 5000
	cmdothernpc "ո��� " "end"
return
OnTimer: 10000
	cmdothernpc "ո��� " "end"
return
//OnTimer: 420000
OnTimer: 20000
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "���������� �������� ����� 3 ������! "
return
//OnTimer: 540000 
OnTimer: 30000 
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "���������� �������� ����� 1 ������! "
return
//OnTimer: 596000
OnTimer: 86000
	cmdothernpc "�������� ո���#blue_team" "ready"
	cmdothernpc "�������� ո���#red_team" "ready"
return
//OnTimer: 598000
OnTimer: 88000
	cmdothernpc "�������� ո���#blue_team" "steady"
	cmdothernpc "�������� ո���#red_team" "steady"
return	
//OnTimer: 600000
OnTimer: 90000
	setitem jp_event61 0
	cmdothernpc "�������� ո���#blue_team" "go"
	cmdothernpc "�������� ո���#red_team" "go"
	cmdothernpc "ո��� " "spawn"
	cmdothernpc "�������� ո���#blue_team" "spawn"
	cmdothernpc "�������� ո���#red_team" "spawn"
	SetGlobalVar "allow_to_hunt" 0
return

//OnTimer: 1620000
OnTimer: 150000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "���������� �������� ����� 3 ������! ���������! "
	endif
return
//OnTimer: 1740000
OnTimer: 210000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "���������� �������� ����� 1 ������! ���������! "
	endif
return
//OnTimer: 1790000
OnTimer: 260000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "�������� ո���#blue_team" "final_countdown"
		cmdothernpc "�������� ո���#red_team" "final_countdown"
	endif
return
//OnTimer: 1791000
OnTimer: 261000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "�������� ո���#blue_team" "final_countdown"
		cmdothernpc "�������� ո���#red_team" "final_countdown"
	endif
return
//OnTimer: 1792000
OnTimer: 262000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "�������� ո���#blue_team" "final_countdown"
		cmdothernpc "�������� ո���#red_team" "final_countdown"
	endif
return
//OnTimer: 1793000
OnTimer: 263000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "�������� ո���#blue_team" "final_countdown"
		cmdothernpc "�������� ո���#red_team" "final_countdown"
	endif
return
//OnTimer: 1794000
OnTimer: 264000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "�������� ո���#blue_team" "final_countdown"
		cmdothernpc "�������� ո���#red_team" "final_countdown"
	endif
return
//OnTimer: 1795000
OnTimer: 265000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "�������� ո���#blue_team" "final_countdown"
		cmdothernpc "�������� ո���#red_team" "final_countdown"
	endif
return
//OnTimer: 1796000
OnTimer: 266000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "�������� ո���#blue_team" "final_countdown"
		cmdothernpc "�������� ո���#red_team" "final_countdown"
	endif
return
//OnTimer: 1797000
OnTimer: 267000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "�������� ո���#blue_team" "final_countdown"
		cmdothernpc "�������� ո���#red_team" "final_countdown"
	endif
return
//OnTimer: 1798000
OnTimer: 268000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "�������� ո���#blue_team" "final_countdown"
		cmdothernpc "�������� ո���#red_team" "final_countdown"
	endif
return
//OnTimer: 1799000
OnTimer: 269000
	var team_won = GetGlobalVar "farm_winners" 
	if team_won == 0
		cmdothernpc "�������� ո���#blue_team" "final_countdown"
		cmdothernpc "�������� ո���#red_team" "final_countdown"
	endif
return
//OnTimer: 1800000
OnTimer: 270000
	var team_won = GetGlobalVar "farm_winners" 
	cmdothernpc "�������� ո���#blue_team" "final_countdown"
	cmdothernpc "�������� ո���#red_team" "final_countdown"
	if team_won == 0
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "���������� ��������! �� ���� ������� �� ������ ������� ���� ������ ������. "
		SetGlobalVar "farm_winners" 4
		cmdothernpc "ո��� " "end"
		stoptimer
		InitTimer
	endif
return	

OnCommand: "spawn"
	SetGlobalVar "farm_winners" 0
	var mobID = GetGlobalVar "farm_mobID"
	var mob_count = GetGlobalVar "farm_mob_count"
	var mob_name = GetGlobalStr "farm_mobname"
	var mobs_remaining = npcv "ո��� " [VAR_MYMOBCOUNT]
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "mobID: "+mobID+""
	var i = 0
	while (1)
		if (i < mob_count)
			callmonster "egef_swn1" mobID mob_name 0 0
			callmonster "egef_swn2" mobID mob_name 0 0
		endif
		i = i + 1
		if (i >= mob_count)
//			broadcastserver "FF0000" FW_NORMAL 10 0 0 "�������� ���-�� ����� �������� ������� "  //�������
			exitwhile
		endif
	endwhile
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "mobs count: "+mobs_remaining+"" //�������
return


OnCommand: "end"
	cmdothernpc "�������� ո���#blue_team" "warp_all"
	cmdothernpc "�������� ո���#red_team" "warp_all"
	cmdothernpc "ո��� " "kill"
	cmdothernpc "�������� ո���#blue_team" "kill"
	cmdothernpc "�������� ո���#red_team" "kill"
return	

OnCommand: "kill"
	resetmymob
return	

OnCommand: "reset"
	stoptimer
	InitTimer
return	

npc "egef_swn1" "�������� ո���#red_team" 4_M_CHILD1 190 175 6 0 0
OnInit:
	InitTimer
	strlocalvar 1 "countdown"
	strlocalvar 2 "farm_reset"
	
	SetLocalVar "countdown" 11
	SetLocalVar "farm_reset" 0
	
	SetGlobalVar "farm_mobID" 20631
	SetGlobalVar "farm_keymobID" 20632
return

OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		
		var keymobID = GetGlobalVar "farm_keymobID"
		var keymob_count = GetGlobalVar "farm_keymob_count"
		var keymob_name = GetGlobalStr "farm_keymobname"
		var mobs_remaining = npcv "�������� ո���#red_team" [VAR_MYMOBCOUNT]
		dialog "key mobs ID: "+keymobID+""
		dialog "key mobs count: "+keymob_count+""
		dialog "key mobs name: "+keymob_name+""
		dialog "mobs remaining: "+mobs_remaining+""
		wait
	else
		var allow_to_hunt = GetGlobalVar "allow_to_hunt"
		if allow_to_hunt == 0
			var mobs_remaining_red = GetGlobalVar "mobs_remaining_red"
			var mobs_remaining_blue = GetGlobalVar "mobs_remaining_blue"
			var farm_win_count = GetGlobalVar "farm_win_count"
			var keymob_count = GetGlobalVar "farm_keymob_count"		
			dialog "[�������� ո���]"
			dialog "������� ������� �������� ����� "+mobs_remaining_red+" ������. "
			dialog "����� ������� �������� ����� "+mobs_remaining_blue+" ������. "
			close
			return
		else
			dialog "[�������� ո���]"
			dialog "� ���� ������ �� ���! ������, ������� �������!"
			close
			return
		endif
	endif
return

OnTimer: 1000
	var keymobID = GetGlobalVar "farm_keymobID"
	var keymob_count = GetGlobalVar "farm_keymob_count"
	var keymob_name = GetGlobalStr "farm_keymobname"
	var mobs_remaining = npcv "�������� ո���#red_team" [VAR_MYMOBCOUNT]
	var farm_win_count = GetGlobalVar "farm_win_count"
	var mobs_remaining_blue = GetGlobalVar "mobs_remaining_blue"
	var mobs_remaining_red = GetGlobalVar "mobs_remaining_red"
	var mobs_remaining_red_actual = farm_win_count - (keymob_count - mobs_remaining)
	var farm_winners = GetGlobalVar "farm_winners"
	var farm_reset = lv["farm_reset"]
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	if ((allow_to_hunt == 0) & (farm_winners == 0))
//		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "mobs_remaining_red: "+mobs_remaining_red+""
//		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "mobs_remaining_blue: "+mobs_remaining_blue+""
//		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "mobs_remaining: "+mobs_remaining+""
		if ((mobs_remaining_red_actual < mobs_remaining_red) & (mobs_remaining_red_actual >= 0))
			SetGlobalVar "mobs_remaining_red" mobs_remaining_red_actual
			cmdothernpc "�������� ո���#blue_team" "broadcast_red"
			cmdothernpc "�������� ո���#red_team" "broadcast_red"
		endif
	endif
	if farm_winners == 1
		if farm_reset == 1
			SetLocalVar "farm_reset" 0
			cmdothernpc "ո��� " "reset"
		elseif allow_to_hunt == 0
			cmdothernpc "�������� ո���#blue_team" "final_countdown"
			cmdothernpc "�������� ո���#red_team" "final_countdown"
		endif
	endif	
	stoptimer
	InitTimer
return

OnCommand: "spawn"
	var keymobID = GetGlobalVar "farm_keymobID"
	var keymob_count = GetGlobalVar "farm_keymob_count"
	var keymob_name = GetGlobalStr "farm_keymobname"
	var farm_win_count = GetGlobalVar "farm_win_count"
	SetLocalVar "countdown" 11
	var i = 0
	while (1)
		if (i < keymob_count)
			callmonster "egef_swn1" keymobID keymob_name 0 0
		endif
		i = i + 1
		if (i >= keymob_count)
//			broadcastserver "FF0000" FW_NORMAL 10 0 0 "�������� ���-�� ����� �������� ������� "  //�������
			exitwhile
		endif
	endwhile
	SetGlobalVar "mobs_remaining_red" farm_win_count
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "mobs count: "+mobs_remaining+"" //�������
return

OnCommand: "kill"
	resetmymob
return

OnCommand: "broadcast_blue"
	var mobs_remaining_blue =  GetGlobalVar "mobs_remaining_blue"
	if mobs_remaining_blue != 0
		broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "����� ������� ����� ������ ������! �������� ��� "+mobs_remaining_blue+""
	endif
return

OnCommand: "broadcast_red"
	var mobs_remaining_red = GetGlobalVar "mobs_remaining_red"
	if mobs_remaining_red == 0
		var competition_number = GetGlobalVar "farm_comp_num"
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "������� ������� ����� ���� ������ ������! ������� ������� ��������! "
		SetGlobalVar "farm_winners" 1
//		if v[jp_event61] == 1
//			var wins_count = v[jp_event62] + 1
//			setitem jp_event62 wins_count
//		endif
	else
		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "������� ������� ����� ������ ������! �������� ��� "+mobs_remaining_red+""
	endif
return

OnCommand: "warp_all"
	warpallpcinthemap "prontera" 125 123
return

OnCommand: "final_countdown"
	var countdown = lv["countdown"]
	var countdown = countdown - 1
	var farm_winners = GetGlobalVar "farm_winners"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "��� �������� � �������� ����� "+countdown+"!"
	if countdown < 1
		SetLocalVar "countdown" 11
		if farm_winners == 1
			SetLocalVar "farm_reset" 1
			cmdothernpc "ո��� " "end"
		endif
	else
		SetLocalVar "countdown" countdown
	endif
return

OnCommand: "ready"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "�� �����!"
return

OnCommand: "steady"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "��������!"
return

OnCommand: "go"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "����!"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "�������� ������! ������� ����� ��� ����������! "
return

OnCommand: "three_min_bc"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "���������� �������� ����� 3 ������! "
return

OnCommand: "one_min_bc"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "���������� �������� ����� 1 ������! "
return

OnCommand: "nobody_wins_bc"
	broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "���������� ��������! �� ���� ������� �� ������ ������� ���� ������ ������. "
return

npc "egef_swn2" "�������� ո���#blue_team" 4_M_CHILD1 190 175 6 0 0
OnInit:
	InitTimer
	strlocalvar 1 "countdown"
	strlocalvar 2 "farm_reset"
	
	SetLocalVar "countdown" 11
	SetLocalVar "farm_reset" 0
	
	SetGlobalVar "farm_mobID" 20631
	SetGlobalVar "farm_keymobID" 20632
return

OnClick:
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		
		var keymobID = GetGlobalVar "farm_keymobID"
		var keymob_count = GetGlobalVar "farm_keymob_count"
		var keymob_name = GetGlobalStr "farm_keymobname"
		var mobs_remaining = npcv "�������� ո���#blue_team" [VAR_MYMOBCOUNT]
		dialog "key mobs ID: "+keymobID+""
		dialog "key mobs count: "+keymob_count+""
		dialog "key mobs name: "+keymob_name+""
		dialog "mobs remaining: "+mobs_remaining+""
		wait
	else
		var allow_to_hunt = GetGlobalVar "allow_to_hunt"
		if allow_to_hunt == 0
			var mobs_remaining_red = GetGlobalVar "mobs_remaining_red"
			var mobs_remaining_blue = GetGlobalVar "mobs_remaining_blue"
			var farm_win_count = GetGlobalVar "farm_win_count"
			var keymob_count = GetGlobalVar "farm_keymob_count"		
			dialog "[�������� ո���]"
			dialog "������� ������� �������� ����� "+mobs_remaining_red+" ������. "
			dialog "����� ������� �������� ����� "+mobs_remaining_blue+" ������. "
			close
			return
		else
			dialog "[�������� ո���]"
			dialog "� ���� ������ �� ���! ������, ����� �������!"
			close
			return
		endif
	endif
return

OnTimer: 1000
	var keymobID = GetGlobalVar "farm_keymobID"
	var keymob_count = GetGlobalVar "farm_keymob_count"
	var keymob_name = GetGlobalStr "farm_keymobname"
	var mobs_remaining = npcv "�������� ո���#blue_team" [VAR_MYMOBCOUNT]
	var farm_win_count = GetGlobalVar "farm_win_count"
	var mobs_remaining_blue = GetGlobalVar "mobs_remaining_blue"
	var mobs_remaining_red = GetGlobalVar "mobs_remaining_red"
	var mobs_remaining_blue_actual = farm_win_count - (keymob_count - mobs_remaining)
	var farm_winners = GetGlobalVar "farm_winners"
	var farm_reset = lv["farm_reset"]
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	if ((allow_to_hunt == 0) & (farm_winners == 0))
//		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "mobs_remaining_red: "+mobs_remaining_red+""
//		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "mobs_remaining_blue: "+mobs_remaining_blue+""
//		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "mobs_remaining: "+mobs_remaining+""
		if ((mobs_remaining_blue_actual < mobs_remaining_blue) & (mobs_remaining_blue_actual >= 0))
			SetGlobalVar "mobs_remaining_blue" mobs_remaining_blue_actual
			cmdothernpc "�������� ո���#blue_team" "broadcast_blue"
			cmdothernpc "�������� ո���#red_team" "broadcast_blue"
		endif
	endif
	if farm_winners == 2
		if farm_reset == 1
			SetLocalVar "farm_reset" 0
			cmdothernpc "ո��� " "reset"
		elseif allow_to_hunt == 0
			cmdothernpc "�������� ո���#blue_team" "final_countdown"
			cmdothernpc "�������� ո���#red_team" "final_countdown"
		endif
	endif
	stoptimer
	InitTimer
return

OnCommand: "spawn"
	var keymobID = GetGlobalVar "farm_keymobID"
	var keymob_count = GetGlobalVar "farm_keymob_count"
	var keymob_name = GetGlobalStr "farm_keymobname"
	var farm_win_count = GetGlobalVar "farm_win_count"
	SetLocalVar "countdown" 11
	var i = 0
	while (1)
		if (i < keymob_count)
			callmonster "egef_swn2" keymobID keymob_name 0 0
		endif
		i = i + 1
		if (i >= keymob_count)
//			broadcastserver "FF0000" FW_NORMAL 10 0 0 "�������� ���-�� ����� �������� ������� "  //�������
			exitwhile
		endif
	endwhile
	SetGlobalVar "mobs_remaining_blue" farm_win_count
//	broadcastserver "FF0000" FW_NORMAL 10 0 0 "mobs count: "+mobs_remaining+"" //�������
return

OnCommand: "kill"
	resetmymob
return

OnCommand: "broadcast_blue"
	var mobs_remaining_blue =  GetGlobalVar "mobs_remaining_blue"
	if mobs_remaining_blue == 0
		var competition_number = GetGlobalVar "farm_comp_num"
		broadcastserver "0099FF" FW_NORMAL 10 0 0 "����� ������� ����� ���� ������ ������! ����� ������� ��������! "
		SetGlobalVar "farm_winners" 2
//		if v[jp_event61] == 2
//			var wins_count = v[jp_event62] + 1
//			setitem jp_event62 wins_count
//		endif
	else
		broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "����� ������� ����� ������ ������! �������� ��� "+mobs_remaining_blue+""
	endif
return

OnCommand: "broadcast_red"
	var mobs_remaining_red = GetGlobalVar "mobs_remaining_red"
	if mobs_remaining_red != 0
		broadcastinmap2 "FF0000" FW_NORMAL 10 0 0 "������� ������� ����� ������ ������! �������� ��� "+mobs_remaining_red+""
	endif
return

OnCommand: "warp_all"
	warpallpcinthemap "prontera" 125 123
return

OnCommand: "final_countdown"
	var countdown = lv["countdown"]
	var countdown = countdown - 1
	var farm_winners = GetGlobalVar "farm_winners"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "��� �������� � �������� ����� "+countdown+"!"
	if countdown < 1
		SetLocalVar "countdown" 11
		if farm_winners == 2
			SetLocalVar "farm_reset" 1
			cmdothernpc "ո��� " "end"
		endif
	else
		SetLocalVar "countdown" countdown
	endif
return

OnCommand: "ready"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "�� �����!"
return

OnCommand: "steady"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "��������!"
return

OnCommand: "go"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "����!"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "�������� ������! ������� ����� ��� ����������! "
return

OnCommand: "three_min_bc"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "���������� �������� ����� 3 ������! "
return

OnCommand: "one_min_bc"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "���������� �������� ����� 1 ������! "
return

OnCommand: "nobody_wins_bc"
	broadcastinmap2 "0099FF" FW_NORMAL 10 0 0 "���������� ��������! �� ���� ������� �� ������ ������� ���� ������ ������. "
return

hiddenwarp "egef_swn1" "warp1 " 186 150 4 0
OnTouch:
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	if allow_to_hunt == 1
		moveto "egef_swn1" 180 180
	endif
return

hiddenwarp "egef_swn1" "warp2 " 186 203 4 0
OnTouch:
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	if allow_to_hunt == 1
		moveto "egef_swn1" 180 180
	endif
return


hiddenwarp "egef_swn2" "warp3 " 186 150 4 0
OnTouch:
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	if allow_to_hunt == 1
		moveto "egef_swn2" 180 180
	endif
return

hiddenwarp "egef_swn2" "warp4 " 186 203 4 0
OnTouch:
	var allow_to_hunt = GetGlobalVar "allow_to_hunt"
	if allow_to_hunt == 1
		moveto "egef_swn2" 180 180
	endif
return