npc "prontera" "��������� � ������� " 4_M_PATRICK 125 125 5 0 0
OnClick:
	
	var day_of_year = GetGlobalVar "day_of_year"
	
	var hat1_cost = 10
	var hat2_cost = 30
	var hunt_quest = 17290
	
	
	dialog "[��������� � �������] "
	dialog "���������! ���� �� �������� "
	dialog "������� �������� �����, "
	dialog "�� ��� �� ��������? "
	wait
	choose menu "� �� ������ �������.. " "� ���� ��� ���������� ������� �����... "
		case 1
			var quest_check = checkquest_hunting hunt_quest
			if quest_check == 1
				dialog "[��������� � �������] "
				dialog "��� �������� ������������, "
				dialog "��� �� �� ������ ������ "
				dialog "���������� �������������. "
				dialog "��� ���� �� ���� �� "
				dialog "���������! �������, ����� "
				dialog "��������� �������. "
				close
				return
			elseif quest_check == 2
				dialog "[��������� � �������] "
				dialog "���������! � ��������, "
				dialog "��� ������� ���� ���� "
				dialog "���� �������������,  "
				dialog "����������� �����! "
				dialog "��� ���� �������! "
				dialog "������ �� �������. "
				dialog "�-��-��-��! "
				completequest hunt_quest 
				getitem Event_Coin 10
				close
				return
			elseif (v[jp_event43] < day_of_year)
				dialog "[��������� � �������] "
				dialog "� ����������� �� ������ ������ "
				dialog "� ������ ������� � �������� �������� ����. "
				dialog "� ���� ��� ������������ ��� "
				dialog "� ���� ���� ���, ��� �����, "
				dialog "�� ��� ����� ��� ����� �� "
				dialog "������� �������� ���������. "
				wait
				dialog "[��������� � �������] "
				dialog "������ � ������� ��� � ������� "
				dialog "����������, �� ��� � ���� "
				dialog "���������� �������� ������� "
				dialog "�������. � ������� �� "
				dialog "'������������'! �� ������ ��, "
				dialog "�������? �-��-��-��!!! "
				wait
				dialog "[��������� � �������] "
				dialog "��� ���... �� ��� ���������� "
				dialog "������� ����� ���������� "
				dialog "���������, �� �������� ����� "
				dialog "��������� �������� �� ������! "
				wait
				dialog "[��������� � �������] "
				dialog "��� � � �� ���� ������� � ��� ���! "
				dialog "�-��-��-��-��!!! "
				wait
				dialog "[��������� � �������] "
				dialog "���� ����� �������� �������������, "
				dialog "� � ������� �������� � ������ "
				dialog "� ��� ���, ��� ����� ��� ���������. "
				dialog "�����, 50 ������������� ���� ������. "
				dialog "�����������, ��� ������� �� �� ���� "
				dialog "�� ������! �-��-��-��!!! "
				wait
				choose menu "� ������ ����! " "���-�� ��� ����������... "
					case 1
						dialog "[��������� � �������] "
						dialog "��� ��� �������! ����� ����! "
						dialog "� �� �� ���������, ���� � ���, "
						dialog "� ���� �� �����! �-��-��-��! "
						setitem jp_event43 day_of_year
						recall_completequest hunt_quest
						erasequest hunt_quest
						setquest hunt_quest 
						close
						return
					break
					case 2
						dialog "[��������� � �������] "
						dialog "� ��� ���������� ������� ������ "
						dialog "��������� ���, �� ���� �������� "
						dialog "� �����������! "
						close
						return
					break
				endchoose
			elseif (v[jp_event43] == day_of_year)
				dialog "[��������� � �������] "
				dialog "������� ������� ��� ���� "
				dialog "������ ���. ������� ������. "
				close
				return
			endif
		break
		
		case 2
			dialog "[��������� � �������] "
			dialog "�-�-�! ��� ��� ������ ������ "
			dialog "��������! �� ��� ������ � ���� "
			dialog "���������� ���� ���� �� ����� "
			dialog "���� ��� ����������� ��������� "
			dialog "���. ��� ���� ����������? "
			wait
			choose menu "����� " "��� " "� ���������... "
				case 1
					dialog "[��������� � �������] "
					dialog "�� ����� � ���� ����: ��������� ����� "
					dialog "��� ����� �����������. "
					dialog "����� �� ������ �����? "
					wait
					choose menu "��������� ����� " "����� ����������� " "� ��������� "
						case 1
							if v[jp_event44] < 1
								dialog "[��������� � �������] "
								dialog "��� ����� ������ ���� ����� "
								dialog "10 �����. "
								wait
								if v[Event_Coin] < hat1_cost
									dialog "[��������� � �������] "
									dialog "�� � ��� ���� �� �� �������. "
									close
									return
								else
									dialog "[��������� � �������] "
									dialog "�� ������? "
									wait
									choose menu "����! " "���� �������... "
										case 1
											var item_check = GetInventoryRemainCount C_Hunting_Cap 1
											if (item_check == 1)
												dialog "[��������� � �������] "
												dialog "���� �� � ������������� "
												dropitem Event_Coin hat1_cost
												getitem C_Hunting_Cap 1
												setitem jp_event44 1										
												wait
												dialog "[��������� � �������] "
												dialog "������� ��� ��� 30 ����� "
												dialog "� ��� �����, � �������� "
												dialog "����� �������. "
												close
												return
											elseif ((item_check == 2) | (item_check == 3))
												dialog "[��������� � �������]"
												dialog "� ���� ���������� ���������,"
												dialog "���������� ��� � �������������."
												close
											endif
										break
										case 2
											dialog "[��������� � �������] "
											dialog "�� �������... "
											close
											return
										break
									endchoose
								endif
							else
								dialog "[��������� � �������]"
								dialog "������, �� � ���� ����� ���� ������ ���� ��� �����. "
								close
								return
							endif
						break
						case 2
							if v[jp_event44] < 2
								dialog "[��������� � �������] "
								dialog "��� ��� ������... ��� � ����� "
								dialog "���� �� ��������� ����� � 30 �����. "
								wait
								if v[Event_Coin] < hat2_cost
									dialog "[��������� � �������] "
									dialog "�� � ��� ���� ������������ �����. "
									close
									return
								elseif (v[C_Hunting_Cap] < 1)
									dialog "[��������� � �������] "
									dialog "�� � �� ���� � ���� ���������� �����. "
									close
									return
								else
									dialog "[��������� � �������] "
									dialog "�� ������? "
									wait
									choose menu "����! " "���� �������... "
										case 1
											var item_check = GetInventoryRemainCount C_Hunting_Cap 1
											if (item_check == 1)
												dialog "[��������� � �������] "
												dialog "���� �� � ������������� "
												dropitem Event_Coin hat2_cost
												dropitem C_Hunting_Cap 1
												getitem C_Clover_Silkhat 1	
												setitem jp_event44 2																					
												close
												return
											elseif ((item_check == 2) | (item_check == 3))
												dialog "[��������� � �������]"
												dialog "� ��� ���������� ���������,"
												dialog "���������� ��� � �������������."
												close
											endif
										break
										case 2
											dialog "[��������� � �������] "
											dialog "�� �������... "
											close
											return
										break
									endchoose
								endif
							else
								dialog "[��������� � �������]"
								dialog "�� ��� �������� ��� ������ �����. "
								dialog "�� � ���� ���������� ��� ���. "
								close
								return
							endif
						break
						case 3 
							dialog "[��������� � �������]"
							dialog "��� ������... "
							close
							return
						break
					endchoose
				break		
				case 2
					if v[Event_Coin] >= 3	
						dialog "[��������� � �������]"
						dialog "������� ��� ������ ������? "
						wait
						dlgwrite 1 30000
						var exchange_input = input
						if input == 0
							dialog "[��������� � �������]"
							dialog "��������, �� ������ 0 ��� ����������! "
							close
							return
						elseif error
							dialog "[��������� � �������]"
							dialog "����� �� �� ���� ��������� ��������? "
							close
							return	
						endif
					else
						dialog "[��������� � �������]"
						dialog "��������, �� ����� � ��� "
						dialog "�� ������� ���� �� ���� ������ ���. "
						close
						return
					endif
					var total_price = exchange_input * 3
					dialog "[��������� � �������]"
					dialog ""+exchange_input+" ��� �� "+total_price+" �����. ������?"
					wait
					choose menu "����������� " "������ "
						case 1
							if (v[Event_Coin] >= total_price)
							var item_check = GetInventoryRemainCount Green_Beer exchange_input
								if (item_check == 1)
									dropitem Event_Coin total_price
									getitem Green_Beer exchange_input
									dialog "[��������� � �������]"
									dialog "���������, ���� ��� ����� ������. "
									close
									return
								elseif ((item_check == 2) | (item_check == 3))
									dialog "[��������� � �������]"
									dialog "� ��� ���������� ���������,"
									dialog "���������� ��� � �������������."
									close
								endif																
							else
								dialog "[��������� � �������]"
								dialog "�������, ��� �� ��������� ������ ��� �������� �����... "
								dialog "���������� ��� ��� ����������� �� � �������������. "
								close
							endif
						break
						case 2
							dialog "[��������� � �������]"
							dialog "�������, �� �� �������� ��� "
							dialog "������ ����-�� �������?"
							close
							return
						break
					endchoose
				break
				case 3 
					dialog "[��������� � �������]"
					dialog "��� ������... "
					close
					return
			endchoose
		break
	endchoose		
return
