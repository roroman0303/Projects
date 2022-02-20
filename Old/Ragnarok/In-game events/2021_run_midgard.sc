npc "prontera" "���� " 4_M_SOCCER9 125 125 5 0 0

OnClick:
	var hat_cost = 30
	var drink_cost = 3
	var curtime = ServerTime
	var curmin = curtime / 100
	var hunt_quest = 17294
	var quest_check = checkquest_hunting hunt_quest
	
	var allow_to_race = GetGlobalVar "allow_to_race"
	var first_place_time = GetGlobalVar "first_place_time"
	var second_place_time = GetGlobalVar "second_place_time"
	var third_place_time = GetGlobalVar "third_place_time"
	
	var first_place_name = GetGlobalStr "first_place_name"
	var second_place_name = GetGlobalStr "second_place_name"
	var third_place_name = GetGlobalStr "third_place_name"
	
	var first_place_min = first_place_time / 60
	var first_place_sec = first_place_time % 60
	var second_place_min = second_place_time / 60
	var second_place_sec = second_place_time % 60
	var third_place_min = third_place_time / 60
	var third_place_sec = third_place_time % 60
	
	var check_shield = GetEquipCount Ahura_Mazda
	
	var boarding = GetBuffValue "EFST_ALL_RIDING"
	
	if (check_shield > 0)
		dialog "�������� �������? "
		wait
		choose menu "�� " "��� "
			case 1
				SetGlobalVar "first_place_time" 10000
				SetGlobalVar "second_place_time" 10000
				SetGlobalVar "third_place_time" 10000
				SetGlobalStr "first_place_name" ""
				SetGlobalStr "second_place_name" ""
				SetGlobalStr "third_place_name" ""
				dialog "������� �������� ������� "
				close
				return
			break
			case 2
			break
		endchoose
	else
		if (v[jp_event46] == 0)
			dialog "[����]"
			dialog "������, �������! "
			dialog "��� ����� ���� ������������ "
			dialog "�� ����! �������������! "
			wait
			choose menu "� �����! " "� �������... "
				case 1
					dialog "[����]"
					dialog "��� ������ ����� ��������, ��� "
					dialog "�� ������������ ��� ��������. "
					dialog "���� �������� ������������� � "
					dialog "������� ������� �� �������� �����, "
					dialog "�� ������� �� ������ �������� "
					dialog "������. "
					wait
					dialog "[����]"					
					dialog "�� ��� �� ������� ������ "
					dialog "����������� ���������, ������ �� "
					dialog "������������, � ����� ���������� "
					dialog "�����! "
					wait
					dialog "[����]"					
					dialog "� ���� �� ������� ����� �� "
					dialog "����� ������� � ��� �������� �� "
					dialog "��� ����� ������������, �� � ����� "
					dialog "���� ���� ������ �������! "
					wait
					dialog "[����]"
					dialog "�� ������ � �� ���� ���� ����������. "
					dialog "���� ����� ������ ����������. "
					dialog "������� �������� ���� ������������. "
					dialog "������ � ��������. "
					wait
					dialog "[����]"
					dialog "�� ������ ����� ��������� � ���� "
					dialog "� ������ �� �������� �� 3 ������. " //prt_fild05.gat 270 212
					dialog "����� ����� ����������� �� ���. "
					dialog "����� �����, �����! "
					setitem jp_event46 1
					setitem jp_event47 curmin
					setquest 17291
					close
					return
				break
				case 2
					dialog "[����]"
					dialog "��� ��������� - �����������! "
					close
					return
				break
			endchoose
		elseif (v[jp_event46] == 1)|(v[jp_event46] == 3)|(v[jp_event46] == 5)
			dialog "[����]"
			dialog "�� ��� ��� �����? ����� ����! ����!"
			close
			return
		elseif (v[jp_event46] == 2)
			dialog "[����]"
			dialog "������ ���� ����� �������� �� ����� "
			dialog "�����, ������� ����� � ������� �� "
			dialog "������ �� ����� �������. �� ��� " //pay_fild08.gat 218 283
			dialog "�������� � ��� ���� 5 �����. "
			setitem jp_event46 3
			setitem jp_event47 curmin
			erasequest 17291
			setquest 17292
			close
			return
		elseif (v[jp_event46] == 4)
			dialog "[����]"
			dialog "��������� ��������� �� ��������, "
			dialog "��� �� ����� �������. "
			dialog "���� ����� �������� ���������� "
			dialog "������ �� ���-������� �� ������. " // moc_fild16.gat 88 304 
			wait
			dialog "[����]"
			dialog "�� ��� ��������� ��� ���� �� "
			dialog "15 �����! ����� ������� � "
			dialog "����� ������� - ��������� "
			dialog "���������� ���� ����. "
			dialog "�����! "
			erasequest 17292
			setquest 17293
			setitem jp_event46 5
			setitem jp_event47 curmin
			close
			return
		elseif (v[jp_event46] == 6)
			if quest_check == 0
				dialog "[����]"
				dialog "� � ������ ������ ����, ��� "
				dialog "�� ����������! ��������� � "
				dialog "��� �� ����! "
				wait
				dialog "[����]"
				dialog "��������� �� ������� ���������. "
				dialog "� ���� ��� ��� �� ����. "
				dialog "���� ����� �������� �� ������� "
				dialog "��������. "
				wait
				dialog "[����]"
				dialog "���� � ���, ��� ������ "
				dialog "��-�� ���� ��������������� "
				dialog "������� ������� ��������� "
				dialog "��������� �����. � ���� ����� "
				dialog "���-�� �������. "
				wait
				dialog "[����]"
				dialog "���� ���������� ���� �� ��� "
				dialog "� ����� �����, ����� ����� "
				dialog "������� �� ������ ����� "
				dialog "������� ��, ����� ������ "
				dialog "������� ���� ���-������� ����� "
				dialog "��������� � ����� �������� "
				dialog "�����. � ��� �� ��������! "
				wait
				dialog "[����]"
				dialog "��� ��� ������ ����� ���� ������! "
				dialog "� �������������� �����, � ��� "
				dialog "�������. ���� �� �� �������� "
				dialog "�� �������, �� ��� ��? "
				dialog "������ 50 ������ - ����� ����� "
				dialog "� ������� ���� �� ��������� ����. "
				changequest 17293 hunt_quest
				close
				return
			elseif quest_check == 1
				dialog "[����]"
				dialog "� ��� ��� �������� ������� ������ "
				dialog "�����. � ��� ���, ����� �� �������� "
				dialog "������ ���������� ������. �������, "
				dialog "����� ���������� � 50 �������. "
				close
				return
			elseif quest_check == 2
				dialog "[����]"
				dialog "�������-�� ���� ����� ������� "
				dialog "����. � ������ �� � ����� "
				dialog "�������� � ��������������� "
				dialog "���������. "
				wait
			endif
			dialog "[����]"
			dialog "��������� ������ ���������. "
			dialog "���, ������� ��, �� ��������. "
			dialog "������ �� ���������� �� ������� "
			dialog "������. ���� ������ ����������� "
			dialog "� ���, ����� �������� �� ����. "
			dialog "� ���� ���� �������� �� �����. "
			wait
			dialog "[����]"
			dialog "�� �� �����, ��� ��� ����� ��� "
			dialog "������. ���� ���� ������ "
			dialog "�����������. �� ����� ����� "
			dialog "�������� �����, ������� ����� "
			dialog "������ �� ���� �������� ��������� "
			dialog "������� - ��� ������������, ��� � "
			dialog "������������. "
			wait
			dialog "[����]"
			dialog "����� �� ����� �������� ����������� "
			dialog "�����, ������� ����� ���� ���������. "
			dialog "��� ��� ������ - ����������� "
			dialog "� ���� ����� ����������. "
			wait
			dialog "[����]"
			dialog "�� ����������� ��� ���� 6 �����. "
			dialog "��� ������ �� �������� �� ������� - "
			dialog "����. �����. "
			setitem jp_event46 7
			changequest hunt_quest 17295
			close
			moveto "eprt_fild02" 20 305
			return
		elseif (v[jp_event46] == 7)
			dialog "[����]"
			dialog "����� ������ ������� �� �����? "
			wait
			choose menu "�����! " "��� ������� �������... "
				case 1
					dialog "[����]"
					dialog "��������!"
					setitem jp_event47 (curtime % 10000)
					close
					moveto "eprt_fild02" 30 305
					return
				break
				case 2
					dialog "[����]"
					dialog "����������� ��� ������� � �������! "
					close
					return
				break
			endchoose
		elseif (v[jp_event46] == 8)
			dialog "[����]"
			dialog "������ �� ����� � ������������� "
			dialog "� ������� �������. �� ��� "
			dialog "������������ �� ������ �������� "
			dialog "������, ������� ������� �������� "
			dialog "� ���� �� �����, �� �� �������� "
			dialog "��� �������! "
			wait
			dialog "[����]"
			dialog "������ � ������ ���� ���������� "
			dialog "� ��������. ��-������, ������������ "
			dialog "����� � ����������� ���������. "
			wait
			dialog "[����]"
			dialog "��-������, ����� ������������ "
			dialog "�� ����� �� ���� � � ����� �������� "
			dialog "�� ����� ���� ������, ����� ������� "
			dialog "� ����������. "
			wait
			dialog "[����]"
			dialog "�� � �-�������, �������� "
			dialog "���������� �����: �� ���������, "
			dialog "�� �������, �������� �� �������. "
			wait
			dialog "[����]"
			dialog "� �����-��, ��� ��� �������. "
			dialog "�������, ���� ����������. "
			wait
			dialog "[����]"
			dialog "1 ������� � ��� ���� ���������. "
			dialog "��������� ���� �������� �������� "
			dialog "� ���� ��� �������� � ������. "
			dialog "�� ����� ����, ��� � ���� "
			dialog "��������� ��������. "
			wait
			getitem Id_Lottery_Ticket 1
			setitem jp_event46 9
			completequest 17295 
			close
			return
		elseif (v[jp_event46] > 8)
			dialog "[����]"
			dialog "������, �������! "
			dialog "� ��� ������? "
			wait
			choose menu "� ���� ����������� � ������! " "� ���� �������� ������ " "������� ������������ "
				case 1
					dialog "[����]"
					dialog "����� ������� �������? "
					dialog "�����. � ������� � ���� "
					dialog "����?! "
					wait
					if (v[Id_Lottery_Ticket]>0)
						if v[VAR_WEIGHT] != 0
							dialog "[����]"
							dialog "� ��� ���� ����������� ��� ������ ��������. "
							dialog "�� ����� ����� ������ ������ " 
							dialog "� �������� � � ����������� "
							dialog "�������� ������� � ��������� �����. "
							close
							return	
						elseif boarding == 1
							dialog "[����]"
							dialog "����� ������������� � ������,"
							dialog "���� ���������� ���������."
							close							
						elseif allow_to_race == 1
							dialog "[����]"
							dialog "���������. ����� �����! "
							dropitem Id_Lottery_Ticket 1
							close
							cart off
							peco off
							UseSkillToPC 2052 5 0 0
							ResetBuff "EFST_MOVHASTE_POTION"
							close
							moveto "eprt_fild02" 20 305
							return
						else
							dialog "[����]"
							dialog "������� ����. �� ���� "
							dialog "���� �����. ������� �������. "
							close
							return
						endif
					else
						dialog "[����]"
						dialog "�� � ��� �� ����� ������� �� "
						dialog "����� ��� ��������? �������, "
						dialog "����� �� ����� � ����. "
						close
						return
					endif
				break
				case 2
					dialog "[����]"
					dialog "�-�-�! �� �� ������� "
					dialog "� ������� ������. "
					dialog "������� � ���� ���� ���������� "
					dialog "����������� ��������, ������� "
					dialog "��� �������� �������� "
					wait
					choose menu "�������� " "������� " "�������� �������� " 
						case 1	
							dialog "[����]"
							dialog "1 �������� ����� 3 ������. "
							dialog "������� �� ������? "
							wait
							dlgwrite 1 30000
							var exchange_input = input
							var total_price = exchange_input*3
							if input == 0
								dialog "[����]"
								dialog "������ 0 �� ���������... "
								close
								return
							elseif error
								dialog "[����]"
								dialog "� ��� ��� ��������? "
								close
								return	
							endif
							dialog "[����]"
							dialog ""+exchange_input+" ���������� �� "+total_price+" �������. ������?"
							wait
							choose menu "����������� " "������ "
								case 1
									if v[Sky_Medal] < total_price
										dialog "[����]"
										dialog "� ���� �� ������� �������... "
										dialog "������� ��� �����. "
										close								
									else
										var item_check = GetInventoryRemainCount Gingerbread exchange_input
										if (item_check == 1)
											dropitem Sky_Medal total_price
											getitem Gingerbread exchange_input
											dialog "[����]"
											dialog "�������! ������� ���! "
											close
											return
										elseif ((item_check == 2) | (item_check == 3))
											dialog "[����]"
											dialog "� ���� ���� ����� � ���������. "
											dialog "�������� ������� � �����������. "
											close
										endif									
									endif
								break
								case 2
									dialog "[����]"
									dialog "���� �����������, �������. "
									dialog "����������� ���������� "
									dialog "� ���� ��� �����! "
									close
									return
								break
							endchoose
						break
						case 2
							dialog "[����]"
							dialog "1 ������� ����� 20 �������. "
							dialog "������� �� ������? "
							wait
							dlgwrite 1 30000
							var exchange_input = input
							var total_price = exchange_input*20
							if input == 0
								dialog "[����]"
								dialog "������ 0 �� ���������... "
								close
								return
							elseif error
								dialog "[����]"
								dialog "� ��� ��� ��������? "
								close
								return	
							endif
							dialog "[����]"
							dialog ""+exchange_input+" ��������� �� "+total_price+" �������. ������?"
							wait
							choose menu "����������� " "������ "
								case 1
									if v[Sky_Medal] < total_price
										dialog "[����]"
										dialog "� ���� �� ������� �������... "
										dialog "������� ��� �����. "
										close								
									else
										var item_check = GetInventoryRemainCount Id_Lottery_Ticket exchange_input
										if (item_check == 1)
											dropitem Sky_Medal total_price
											getitem Id_Lottery_Ticket exchange_input
											dialog "[����]"
											dialog "�������! ������� ���! "
											close
											return
										elseif ((item_check == 2) | (item_check == 3))
											dialog "[����]"
											dialog "� ���� ���� ����� � ���������. "
											dialog "�������� ������� � �����������. "
											close
										endif									
									endif
								break
								case 2
									dialog "[����]"
									dialog "���� �����������, �������. "
									close
									return
								break
							endchoose
						break
						case 3
							if (v[jp_event46] != 10)
								dialog "[����] "
								dialog "��� ����� - ������ ��������! "
								dialog "� �� ������ �� �������� "
								dialog "�� 30 �������! "
								wait
								if v[Sky_Medal] < 30
									dialog "[����] "
									dialog "�� � ��� ���� �� �� �������. "
									close
									return
								else
									dialog "[����] "
									dialog "�� ������? "
									choose menu "����! " "���� �������... "
										case 1
											var item_check = GetInventoryRemainCount C_Gryphon_Hairband 1
											if (item_check == 1)
												dialog "[����] "
												dialog "���� �� � �������������. "
												dropitem Sky_Medal 30
												getitem C_Gryphon_Hairband 1
												setitem jp_event46 10										
												close
												return
											elseif ((item_check == 2) | (item_check == 3))
												dialog "[����]"
												dialog "� ���� ���������� ���������,"
												dialog "�������� ��� � �����������."
												close
											endif
										break
										case 2
											dialog "[����] "
											dialog "�� �������... "
											close
											return
										break
									endchoose
								endif
							else
								dialog "[����]"
								dialog "� ��� ��� ���� ��� ����� "
								close
								return
							endif
						break
					endchoose
				break
				case 3
					dialog "[����]"
					if first_place_time == 10000
						dialog "� ������ ���� ����� �� ����������. "
					elseif first_place_time < 10000
						if first_place_sec < 10
							dialog "1 �����: "+first_place_name+" - "+first_place_min+":0"+first_place_sec+""
						else
							dialog "1 �����: "+first_place_name+" - "+first_place_min+":"+first_place_sec+""
						endif
					endif
					if second_place_time < 10000
						if second_place_sec < 10
							dialog "2 �����: "+second_place_name+" - "+second_place_min+":0"+second_place_sec+""
						else
							dialog "2 �����: "+second_place_name+" - "+second_place_min+":"+second_place_sec+""
						endif
					endif
					if third_place_time < 10000
						if third_place_sec < 10
							dialog "3 �����: "+third_place_name+" - "+third_place_min+":0"+third_place_sec+""
						else
							dialog "3 �����: "+third_place_name+" - "+third_place_min+":"+third_place_sec+""
						endif
					endif
					close
					return
				break
			endchoose
		else
			dialog "[����] "
			dialog "��� ����������� ���������� �� ���� �������! "
			dialog "������� ������� �������!!! "
			close
			return
		endif
	endif
return
