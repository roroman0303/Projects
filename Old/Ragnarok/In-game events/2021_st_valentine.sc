npc "prontera" "����� " 4_M_ALCHE_A 125 125 4 0 0
OnClick:
	if v[jp_event38] == 0
		dialog "[�����]"
		dialog "������, ������� ��..."
		wait
		dialog "[�����]"
		dialog "�? ����� ��� �����?! "
		wait
		dialog "[�����]"
		dialog "��� �� ������ ����� ����� ������ �����! "
		wait
		dialog "[�����]"
		dialog "��� ����� � �������, ������ �� �����! "
		wait
		dialog "[�����]"
		dialog "��... ��������� �� ������� � ������� ������. "
		dialog "������ �������, �� ��� ��?"
		wait
		choose menu "��� ���������? " "������, � ���� ��� ������� �� ����. "
			case 1
				dialog "[�����]"
				dialog "��, ��� ���� ������?"
				dialog "�����? �����? ��?"
				dialog "��� ���� ��������?"
				wait
				dialog "[�����]"
				dialog "������, ��� ����� ����..."
				dialog "� ��� ��� �������� ����."
				wait
				dialog "[�����]"
				dialog "����� ��������� � ������ �����."
				wait
				choose menu "������! "
					case 1
						dialog "[�����]"
						dialog "���? � ��� ���������!"	
						wait
						choose menu "���� �� ��� ������ ������? "
							case 1
								dialog "[�����]"
								dialog "��... ��� ����������� �������!"
								dialog "������ � ������ � �����. "
								dialog "�  �������... ����� ������� � ������..."
								wait
								dialog "[�����]"
								dialog "Ÿ ����� ���������. ��� �� ������� ����� � ������. "
								dialog "� �������� � ������� �� ���������. "
								dialog "��� ������ � ������� �������!"			
								wait
								dialog "[�����]"
								dialog "�� ������ ��������� ����� ������. "
								dialog "������... ��� ������������ ������ ���� ���������!"
								dialog "��, ��� �� � ����� ������� � ��� ���..."										
								wait	
								dialog "[�����]"
								dialog "� ���� ��� � ������� �� ����� "
								dialog "����� ��������� � ����!"										
								wait	
								dialog "[�����]"
								dialog "���� ����� ��� � ������ ������ ��������. ����� ��� � �� ������ ������."
								dialog "������ �����-�� ��� ���� ������ � ����� ���������. "
								dialog "��������, �� ������ ����� �� ���������� ������ ������. �� ���..."	
								wait	
								dialog "[�����]"
								dialog "��� ��� ������� ��������� �� �����������! � ����������, ��� �����!"
								dialog "..."										
								wait			
								dialog "[�����]"
								dialog "��, ����� � ��������. ���������, ������. "
								dialog "��� �������� �������� �������� �� ������."
								dialog "������ �� ����� ��� ���������."		
								wait			
								dialog "[�����]"
								dialog "���������� �� �������, ������ ������������ � ������������... "
								dialog "� � ����� �������, ����� ���������  "
								dialog "�� ���� ���-�������� ������!"	
								wait
								dialog "[�����]"
								dialog "��, ��������, �� ��� ������� ������."
								dialog "����� ��������� � ������. �����, ��� � ��� ����."
								wait
								dialog "[�����]"
								dialog "�����, ��� � ������ � ��� �������."
								dialog "���� �� ����, ��������� �� ���."
								wait
								dialog "[�����]"
								dialog "��, ���������! ��� ��� ���� ��� ����?"	
								wait
								setquest 29150
								setitem jp_event38 1
								close
								return
							break
						endchoose
					break
				endchoose
			case 2
				dialog "[�����]"
				dialog "� ��� ��� ����..."
				close
				return
			break
		endchoose
	elseif v[jp_event38] == 8
		dialog "[�����]"
		dialog "�������?!"
		wait
		dialog "[�����]"
		dialog "����� �������?!"
		dialog "�� �� ������ ��� ���������!"
		wait
		dialog "[�����]"
		dialog "��� �� ��� ������?"
		dialog "��� � ������� ��������� ��������."
		wait
		dialog "[�����]"
		dialog "� ���� �� ����� �����������! ��� ������ ���� ���."
		dialog "���� ��� ���������."
		wait
		dialog "[�����]"
		dialog "������� ����, ��� ����. �� ��� ������ �����."
		dialog "������� ��������� ������ ���� ������."
		dialog "�� � ���... ����� ����� ���� ��������� ��� ������."
		wait
		dialog "[�����]"
		dialog "��� ������ ��� ����? �� ��� � �� �������� ����������� ���?"
		wait
		dialog "[�����]"
		dialog "��������� ��������? ��� ��� ����� �������� ����� ������ ���� �����-�� ����������?!"
		dialog "��, ��� ���� ��������� ���������� ��������� ��� ��������?"
		wait
		dialog "[�����]"
		dialog "� ����� ��������� ���! ���� �� ������� � ������������,"
		dialog "�� ���� ��������� �����������."
		dialog "��� �������, ��� � ���� �������."
		wait
		dialog "[�����]"
		dialog "�� ������ ��������� � � ����� ����."
		dialog "� �������� ���!"
		dialog "����� - �� ��� ��������� �������..."
		changequest 29157 29158
		setitem jp_event38 9
		close
		return
	elseif v[jp_event38] == 11
		dialog "[�����]"
		dialog "� ���� ��� ����������!"
		dialog "��� ������ ����!"
		dialog "�����, �������� ���������!"
		//getitem Feather_Fedora_TW 1
		changequest 29160 29161
		setitem jp_event38 12
		close
		return
	endif
return

npc "cmd_in02" "��������� " 4_F_PINKWOMAN 180 107 4 0 0
OnClick:
	if v[jp_event38] == 1
		dialog "[���������]"
		dialog "��, �� �� �����? ����������. "
		dialog "��� ��? ���� ���, ��� � ������! "
		wait
		dialog "[���������]"
		dialog "��� �������� ������� ���..."
		dialog "� ������ ���� ����� � ���."
		wait
		dialog "[���������]"
		dialog "�� ����������� ��� ����� �� �������."
		dialog "���� ��������� � ������ ���� ����."
		dialog "� ������ -- ����� � ��."
		wait
		dialog "[���������]"
		dialog "���� ����� ��������� �������. "
		dialog "�� �� ��������� �� ������ ����� ��� ������. "
		dialog "� ��� ������� ����������� ���� ��������. "
		wait
		dialog "[���������]"
		dialog "��� ���� ���� ������, ��� ����."
		dialog "�� ������ �� �� ��������? ����� �� ������..."
		wait
		choose menu "����� ������� �� ����. " "� ����� �� ���� ������. "
			case 1
				dialog "[���������]"
				dialog "��! ������ ��� �����... "
				dialog "��� ����� ��� ��� ��������?"
				wait
				dialog "[���������]"
				dialog "����� ����, �� ������ ��� ������!"
				wait
				dialog "[���������]"
				dialog "� ���� -- ���� ����� ������ �������!"
				dialog "�� �� �������� ������ ���� ������ � ������."
				dialog "���� ������ ������� � ��������� ������� ���, ��� �� ��������."
				wait
				dialog "[���������]"
				dialog "��� ����� ���� ��� �������������."
				dialog "���� �� ����� ������� ������..."
				dialog "���� ����� ����� � ��������, ��� ��� ��� � ���� �������."
				wait
				changequest 29150 29151
				setitem jp_event38 2
				close
				return
			break
			case 2
				dialog "[���������]"
				dialog "�����, �� ������� ���� ���!"
				close
				return
			break
		endchoose
	elseif v[jp_event38] == 12
		dialog "[���������]"
		dialog "����������, ��� ���������! "
		dialog "�� � ����������� �� ������, ��� ������ ��� ���� ������!"
		wait
		dialog "[���������]"
		dialog "������ � �������� ����� � ����� ��������� ��������� �������."
		dialog "�� ���� �������� ������� �� ������� ����� love."
		dialog "������ ��� � ������ ����� ������� � �� ������� ���� ���������� �����������!"
		wait
		dialog "[���������]"
		dialog "� ����� �� ������ � ����� ����� "
		dialog "������� � ���� ������, ����� � �������!"
		dialog "�������, �� ������� ��� ����������!"
		wait
		dialog "[���������]"
		dialog "������, ���� �� ������� �������� � ���� ����� 100 ��� "
		dialog "�� �������� ���������� ������� � ����� �������!"
		dialog "����� �����!"
		completequest 29161
		setitem jp_event38 13
		close
		return
	endif
return

npc "prontera" "���� ����� " 1_M_JOBTESTER 271 217  4 0 0
OnClick:
	var name = PcName
	if v[jp_event38] == 2
		dialog "[���� �����]"
		dialog "������������! ��� ��� �����?"
		wait
		choose menu name "�� ���� ����."
			case 1
				dialog "[���� �����]"
				dialog name + "? � ��������� �����?"
				dialog "��� ����������."
				wait
				dialog "[���� �����]"
				dialog "�� ��� ��, �� ������ �� �������?"
				wait
				choose menu "��� ��������� � ����� "
					case 1
						dialog "[���� �����]"
						dialog "��, ��� ����� ���� ������� ���������� �� ���?"
						dialog "��-��! ������, ����� � ���� �� ���� ����� �������� ������� � �������������."
						wait
						dialog "[���� �����]"
						dialog "��� ���� ����� ����� � �� �����!"
						dialog "������ ������ �������� ��� ������� ����� ������ ��������� ���. "
						dialog "� ���������� ����� � ��� �������. "
						wait
						dialog "[���� �����]"
						dialog name + " �� ������ ��������. ��������� ������ ���� ��������� ����� "
						dialog "������ ��� ���� �����! "
						wait
						dialog "[���� �����]"
						dialog "�� ������ -- �� ������ ��� �������."
						dialog "�� ��� 200 ���, � �� � ������."
						dialog "��� ����� ����� �������."
						wait
						dialog "[���� �����]"
						dialog "������ �������, ��� � �� ������ ������ �� ����� �������."
						dialog "������ ���� ��� �������� � ���������� ����� ���� �����."
						dialog "��������� ��������!"
						wait
						dialog "[���� �����]"
						dialog "������ ����� � ������! � ��� �� ��� ���? "
						dialog "����� ���������!"
						wait
						dialog "[���� �����]"
						dialog "��� ���� �������� �� ��� �������."
						dialog "����� ���� ����� � �������..."
						wait
						choose menu "� ����������. " "� �� ����� ��� ������. "
							case 1
								dialog "[���� �����]"
								dialog "�������� � ����� ���������."
								dialog "������� ��� ��������."
								dialog "� ���� -- ������."
								changequest 29151 29152
								setitem jp_event38 3
								close
								return
							break
							case 2
								dialog "[���� �����]"
								dialog "������, ��������."
								close
								return
							break
						endchoose
					break
				endchoose
			break
			case 2
				dialog "[���� �����]"
				dialog "��� �����! �������. "
				close
				return
			break
		endchoose
	elseif v[jp_event38] == 10
		dialog "[���� �����]"
		dialog "�, ���������� " +name+" !"
		dialog "��� ������� ��� �����!"
		dialog "���� ��������� ������ �������� �����. "
		wait
		dialog "[���� �����]"
		dialog "��� ������ ��� � ����������� ������."
		dialog "� ��� ������, ��� �� ��������, ��� ������."
		wait
		dialog "[���� �����]"
		dialog "�... �������� ���� �������������."
		dialog "������ ����� � ���� �������."
		setitem jp_event38 11
		changequest 29159 29160
		close
		return
	endif
return

npc "cmd_in02" "���� ��������� " 4_M_MAYOR 172 93 4 0 0
OnClick:
	var coef_thimble = 3
	var check_shield = GetEquipCount Ahura_Mazda
	if (check_shield > 0)
		dialog "[������] "
		dialog "���������� ������������ "
		wait
		while(1)
			dlgwrite 1 1000
			if error
				dialog "[������] "
				dialog "������ "
				wait
			else
				var coef_thimble = input
				exitwhile
			endif
		endwhile
		close
		return
	else
		var name = PcName
		if v[jp_event38] == 3
			dialog "[���� ���������]"
			dialog "����� ����������!"
			wait
			choose menu "�����������! "
				case 1
					dialog "["+name+"]"
					dialog "���� �����..."
					wait
				break
			endchoose
			dialog "[���� ���������]"
			dialog "��, ��� �� ������������ � ���� �������!"
			dialog "��������� �����? ��� �� �� �����? "
			dialog "�� ����� ��� ����� �������."
			dialog "���� ���� � ������ �� �����! "
			changequest 29152 29153
			setitem jp_event38 4
			close
			return
		elseif v[jp_event38] == 7
			dialog "[���� ���������]"
			dialog "� ����� ��!"
			wait
			dialog "[���� ���������]"
			dialog "��, ���� ����� ������� �����?"
			dialog "�� ������� ��� ���� �� �������!"
			wait
			dialog "[���� ���������]"
			dialog "� ��� ������ �������� ��������� ��� ����� ������."
			dialog "� ������ ��� ������� �������!"
			wait
			dialog "[���� ���������]"
			dialog "������ �������� �����������?"
			dialog "��������� ������� ��������!"
			changequest 29156 29157
			setitem jp_event38 8
			close
			return
		elseif v[jp_event38] == 9
			dialog "[���� ���������]"
			dialog "� �� ���������!"
			wait
			dialog "[���� ���������]"
			dialog "�� ����������� ��� ����?"
			dialog "��...����� �����..."
			wait
			dialog "[���� ���������]"
			dialog "��� ��� �� ����!"
			dialog "�������� �������� ���� "
			dialog "���� �������, � ����� ���� ������!"
			wait
			dialog "[���� ���������]"
			dialog "�� ��� ������, ��� ��� ����� ������?"
			dialog "�����, �����, �������� ��� �����!"
			dialog "�� ����� ����������, ��� ���� ������ 10 ����������, �� ������, �� ������!"
			wait
			choose menu "������!" "���, � ��������� "
				case 1
					var bet = 10
					var qty = bet * coef_thimble
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[���� ���������] "
						dialog "� ���������, � ���� ������������ ����� ��� ������� � ����! �������� � ����������� "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[���� ���������] "
						dialog "� ��� ������������ ����������! ��� �� ����� ������? "
						close
						return
					else
						dialog "[���� ���������] "
						dialog "������ ������� "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[���� ���������] "
					dialog "�����-�����, �������� ����. "
					wait
					var thimblerig = rand 1 3 //1 - ����, 2 - �����, 3 - �����
					dialog "[���� ���������] "
					dialog "� ����� ��������� �����? "
					wait
					choose menu "� �����! " "� ������! " "� ������! " "� �� �������. ���� "
						case 1
							var picked_marble = 1
						break
						case 2
							var picked_marble = 2
						break
						case 3
							var picked_marble = 3
						break
						case 4 
							dialog "[���� ���������] "
							dialog "�, �� ��������! ��� ���� ��-��!"
							close
							return
						break
					endchoose
					if thimblerig == picked_marble
						dialog "[���� ���������] "
						dialog "��� ��, �� �������. � ����� ����� �������� ���� �����."
						dialog "������ �� �����, ��� ��� � �� �������� ����!"
						var wins = v[jp_event39]
						wins = wins + 1
						setitem jp_event39 wins
						setitem jp_event38 10
						getitem Choco_Drink_Recipe qty
						changequest 29158 29159
						wait
						close
						return
					else
						dialog "[���� ���������] "
						dialog "�� �������. ������ ��� ���. "
						dialog "�� �� ������ ���������, ����� ������ ����� ��������� �����! ��!"
						close
						return
					endif
				break
				case 2
					dialog "[���� ���������]"
					dialog "� ����, ��� �� �� ����������!"
					dialog "����� ������!"
					close
					return
				break
			endchoose		
		elseif v[jp_event38] > 12
			dialog "[���� ���������]"
			dialog "��� �� ��������?"
			dialog "����� �� �������!"
			wait
			choose menu "������!" "���, � ��������� "
				case 1
					var bet = 10
					var qty = bet * coef_thimble
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[���� ���������] "
						dialog "� ���������, � ���� ������������ ����� ��� ������� � ����! �������� � ����������� "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[���� ���������] "
						dialog "� ��� ������������ ����������! ��� �� ����� ������? "
						close
						return
					else
						dialog "[���� ���������] "
						dialog "������ ������� "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[���� ���������] "
					dialog "�����-�����, �������� ����. "
					wait
					var thimblerig = rand 1 3 //1 - ����, 2 - �����, 3 - �����
					dialog "[���� ���������] "
					dialog "� ����� ��������� �����? "
					wait
					choose menu "� �����! " "� ������! " "� ������! " "� �� �������. ���� "
						case 1
							var picked_marble = 1
						break
						case 2
							var picked_marble = 2
						break
						case 3
							var picked_marble = 3
						break
						case 4 
							dialog "[���� ���������] "
							dialog "�, �� ��������! ��� ���� ��-��!"
							close
							return
						break
					endchoose
					if thimblerig == picked_marble
						dialog "[���� ���������] "
						dialog "� � ���� ������ ����. ����������! "
						var wins = v[jp_event39]
						if wins < 100
							wins = wins + 1
							setitem jp_event39 wins
						endif
						getitem Choco_Drink_Recipe qty
						if v[jp_event39] == 100
							dialog "���! ����������! �� ������� � ��� 100 ���. ��� �������� ��������������. ������� � ���� ���������.."
							close
							return
						endif
						close
						return
					else
						dialog "[���� ���������] "
						dialog "�� �������. ������ ��� ���. "
						dialog "�� �� ������ ���������, ����� ������ ����� ��������� �����! ��!"
						close
						return
					endif
				break
				case 2
					dialog "[���� ���������]"
					dialog "��� �, �����������, ����� ��������."
					close
					return
				break
			endchoose
		endif
	endif
return

npc "cmd_in02" "��� ��������� " 4_M_CHNOLD 182 101 4 0 0
OnClick:
	if v[jp_event39] == 100
		dialog "[��� ���������]"	
		dialog "���, �� �������� 100 ��� �� ���� �����?"
		dialog "��� ������� ����������!"
		dialog "�� ������ ������� ���� ������������ �������!"
		wait
		//var item_check = GetInventoryRemainCount C_Heart_Card_In_Mouth 1
		var item_check = GetInventoryRemainCount C_Heart_Card_In_Mouth 1
		if item_check != 1
			dialog "[��� ���������] "
			dialog "��, ���������� ������ ����� ��� ���������, ����� � �������������! "
			close
			return
		endif
		dialog "[��� ���������]"
		dialog "��� ��� ������� ��� ������������!"
		setitem jp_event39 101
		getitem C_Heart_Card_In_Mouth 1
		close
		return
	endif
	if v[jp_event38] == 4
		dialog "[��� ���������]"
		dialog "�, ������������."
		dialog "�� ���� ��� ����� ����� ������ "
		dialog "���������� ��������� � ���� �����."
		wait
		dialog "[��� ���������]"
		dialog "�������, ����� ����� ����������, "
		dialog "�� ���������� ������ � ������."
		wait
		dialog "[��� ���������]"
		dialog "��������� ������� �������. � �� ����� �����������. "
		dialog "��� ��� ���������� � ����� ����, �� �� ����� ������� �������, ���������..."                                
		wait
		choose menu "�� � ���� ���� ����! "
			case 1
				dialog "[��� ���������]"
				dialog "�� � ��� �� ��� �� ����?"
				dialog "��� ������������� ����� ������ ����� �������� ����� �����?"
				wait
				dialog "[��� ���������]"
				dialog "����� ���������� � ���� ����� ������� ���������� ����� ������������."
				dialog "����� ������ ��� �� �����."
				wait
				dialog "[��� ���������]"
				dialog "������ ���������� ��������� ����������� � ���� ����."
				dialog "�� �� ��� ���������, ���-�� � ��� ���� �����... �-�-�..."
				wait
				dialog "[��� ���������]"
				dialog "��� �� ������, � ��� �� ����� ������� ����� ��-��."
				dialog "�� ������ ����������� � �������� ��� ������?"
				wait
				choose menu "��... " "���, ��� �������!"
					case 1
						dialog "[��� ���������]"
						dialog "��� ������ ���� ����� ���-��� �����������."
						dialog "��� ��������� �������, ������� �� ������ ����� � ��� ����� ����."
						wait
						dialog "[��� ���������]"
						dialog "���� ����� �������� 25 ����������. "
						dialog "������ �� ����� � ����������� ������� � ��������� "
						changequest 29153 29154
						setitem jp_event38 5
						close
						return
					break
					case 2
						dialog "[��� ���������]"
						dialog "��������."
						close
						return
					break
				endchoose
			break
		endchoose
	elseif v[jp_event38] == 5
		if v[Choco_Drink_Recipe] > 24
			dialog "[��� ���������]"
			dialog "�������, �������. "
			dialog "������ �� ����� ���������� ��������! "
			wait
			dialog "[��� ���������]"
			dialog "�� ������������ �� ������������ ����."
			dialog "��� ���������� ��������� ����� ������ �����..."
			dialog "� ����� ��� ���������� ������� ������."
			wait
			dialog "[��� ���������]"
			dialog "��� ��� ���� ������ ���������� ��������� �������."
			dialog "�� ����� � ��� �����, ���� � ������ �����������?"
			wait
			dialog "[��� ���������]"
			dialog "����� ��� ������� � ������ ������� �� �� ����������."
			dialog "��������, ������ �������� ���� ������."
			wait
			dialog "[��� ���������]"
			dialog "��������� �� ������� �� ����������� ���������� � ������� ���� � �������."
			dialog "��-��. ������ ������? � ��� ����� �� ������� ������."
			wait
			dialog "[��� ���������]"
			dialog "��� ����� 300 ��� �� ���������� ������� ��������."
			dialog "�� ��������� � ��������� ���� ����� ������������� ������� ���-�������� ����������� �������� � �������."
			wait
			dialog "[��� ���������]"
			dialog "������ � ���� ���� ����� �������� ����� ������� "
			dialog "����� ���������� � ���� ����� ���� ����� �������� ��, ��� �� �������� �������� ������."
			wait
			dialog "[��� ���������]"
			dialog "��� ������, ������� -- ������� ������ ���������. "
			dialog "��� ������� ������ � �����, ���������� ����� � �����!"
			dialog "� ��� ���� � ���� ������. "
			wait
			dialog "[��� ���������]"
			dialog "� ��� ������, ������� -- ������ ���������. "
			dialog "����� ������� � ���� � �����. ��� ����� ���������� �����������," 
			dialog "�� ��� �� ����� ������� ���� �������� ������������ �������."
			wait
			dialog "[��� ���������]"
			dialog "��� ����� ������ �������� ������� ������ �������. "
			dialog "����� � ��� � ����, � ��� � ������ �� ������."
			wait
			dialog "[��� ���������]"
			dialog "� ������ ����� ������ ��� ����� ������� � ���� �������� ���� ���������� � ����� ���������."
			changequest 29154 29155
			setitem jp_event38 6
			setitem jp_event39 0
			close
			return
		else
			dialog "[��� ���������]"
			dialog "��� �������, �� �� ������ ���� 25 ����������! �������� �������! "
			close
			return
		endif
	elseif v[jp_event38] == 13
		dialog "[��� ���������]"
		dialog "�� ���� ������� ����� love?" 
		wait
		if ((v[BlueCard_L] > 0) & (v[BlueCard_O] > 0) & (v[Blue_Card_V] > 0) & (v[BlueCard_E] > 0))
			dialog "[��� ���������]"
			dialog "���, ������ �������!"
			wait
			dialog "[��� ���������]"
			dialog "������, �� ��� ��������� ��� ������! � ����� ��� ������� ����� ����."
			dialog "������� ����� � ���� ������ � ���� ���������� ������ ������..."
			wait
			dialog "[��� ���������]"
			dialog "������� � ���������� ������������ �� ���. �����, �� ������ 15 ����������! "
			dialog "� ���� ���� ������ ����������� ��� ����."
			dropitem BlueCard_L 1
			dropitem BlueCard_O 1
			dropitem Blue_Card_V 1
			dropitem BlueCard_E 1
			setitem jp_event38 14
			close
			return
		else
			dialog "[��� ���������]"
			dialog "�������, �� �� ������ ��� ��� ��������." 
			close
			return
		endif
	elseif v[jp_event38] > 13
		var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
		if item_check != 1
			dialog "[��� ���������] "
			dialog "� ���������, � ���� ������������ �����! �������� � ����������� "
			close
			return
		endif
		
		dialog "[��� ���������]"
		dialog "��-��! �� ���, ����� ���������� � ��� �������!"
		dialog "�������? ���� ������ ������������� � ����� ������. "
		dialog "���� ������ - ����������. � ������� �����! ������ �������? "
		wait
		dialog "[��� ���������]"
		dialog "�� 15 ���������� � ���� ���������� ���� ���������� �����. " 
		dialog "�� 150 ���������� � ���� ���������� ���� ������ � �������. " 
		dialog "��, ������ ���-��? " 
		wait
		choose menu "� ��� ���� ���-�� �������? " "�� �������� ������? " "���� "
			case 1
				if v[Choco_Drink_Recipe] > 14 
					dialog "[��� ���������]"
					dialog "��, �� ��������� ����� �� ������! ������ ��� ����, ������ �����������!"	
					dialog "�� 15 ���������� � ���� ���� ���� 1 ���������� ����� "
					wait
					dialog "[��� ���������]"
					dialog "��� �������� ������������ ��� ����� ������. �������� ��������!"
					dialog "������� �� ������? "
					wait
					dlgwrite 1 1500
					var exchange_input = input
					if input == 0
						dialog "��, � ��� ���� �������! "
						close
						return
					elseif error
						dialog "��, � ��� ���� �������!  "
						close
						return	
					endif
					var exchange_coins = exchange_input * 15
					dialog "�� "+exchange_input+" ���������� ������� ����� "+exchange_coins+" ����������. �� �� ���������?"
					wait
					choose menu "����������� " "������ "
						case 1
							if v[Choco_Drink_Recipe] >= exchange_coins
								var item_check = GetInventoryRemainCount Silvervine_Choco exchange_input
								if (item_check == 1)
									dropitem Choco_Drink_Recipe exchange_coins
									getitem Silvervine_Choco exchange_input
									dialog "[��� ���������]"
									dialog "���������-���������! ����������� ����� ����������... "
									wait
									dialog "[��� ���������]"
									dialog "������ �����? ������ ��� ������! "
									wait
									dialog "[��� ���������]"
									dialog "��� �������� ������ �������, ���� �� �������� � �������� ��������! "
									dialog "�, ��� �� ������? �������! ������� ��������� ���������� � ����� ������. "
									close
									return
								elseif ((item_check == 2) | (item_check == 3))
									dialog "��, �� ������� � ���� �����. ������ ���� ��������� � �����������!"
									close
									return
								endif
							else
								dialog "[��� ���������]"
								dialog "������� �� ���� ����� ��������?! "
								close
								return
							endif
						break
						case 2
							dialog "[��� ���������]"
							dialog "�����������, ����� �����������. "
							close
							return
						break
					endchoose
				else
					dialog "[��� ���������]"
					dialog "���������� ��������, ����� "
					close
					return
				endif
			break
			case 2
				if ((v[Choco_Drink_Recipe] > 149) & (v[jp_event38] < 15))
					dropitem Choco_Drink_Recipe 150
					getitem Feather_Fedora_TW 1
					setitem jp_event38 15
					dialog "[��� ���������]"
					dialog "����������! ��� ���� ������ � �������! "
					dialog "����� ��� �����, ��� �� ��� �������� �����! "

					close
					return
				elseif v[jp_event38] >= 15
					dialog "[��� ���������]"
					dialog "�� ��� ������� ���� �����!"
					close
					return
				else
					dialog "[��� ���������]"
					dialog "���������� ��������, ����� "
					close
					return
				endif
			break
			case 3
				dialog "[��� ���������]"
				dialog "��������!"
				close
				return
			break
		endchoose
	endif
return

npc "cmd_in02" "������� " 4_F_IU 181 98 4 0 0
OnClick:
	var bet
	var card_color
	var card_suit
	var thimblerig
	var picked_color
	var picked_suit
	var picked_marble
	var card_game
	var coef_color = 2
	var coef_suit = 4
	var coef_bingo_1 = 3
	var coef_bingo_2 = 11
	var coef_bingo_3 = 37
	var match_count = 0
	var coef_thimble = 3
	var x = v[jp_event40]
	var x1 = 1
	var x2 = 2
	var x3 = 4
	var x4 = 8
	var check_shield = GetEquipCount Ahura_Mazda

	if (check_shield > 0)
		dialog "[������] "
		dialog "���������� ������������ "
		wait
		choose menu "������ ����� " "������� " "����� " // "��������� " "����� " "�� ���� ������ "
			case 1
				dialog "[������] "
				dialog "���� ��� �����? "
				wait
				choose menu "���� " "����� "
					case 1
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[������] "
								dialog "������ "
								wait
							else
								var coef_color = input
								exitwhile
							endif
						endwhile
						close
						return
					break
					case 2
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[������] "
								dialog "������ "
								wait
							else
								var coef_suit = input
								exitwhile
							endif
						endwhile
						close
						return
					break
				endchoose
			break
			case 2
				close
				return
			break
			case 3
				dialog "[������] "
				dialog "�� ����, ��� ��� ��� �����? "
				choose menu "1 " "2 " "3 "
					case 1
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[������] "
								dialog "������ "
								wait
							else
								var coef_bingo_1 = input
								exitwhile
							endif
						endwhile
						close
						return
					break
					case 2
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[������] "
								dialog "������ "
								wait
							else
								var coef_bingo_2 = input
								exitwhile
							endif
						endwhile
						close
						return
					break
					case 3
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[������] "
								dialog "������ "
								wait
							else
								var coef_bingo_3 = input
								exitwhile
							endif
						endwhile
						close
						return
					break					
				endchoose
			break
			case 4
				while(1)
					dlgwrite 1 1000
					if error
						dialog "[������] "
						dialog "������ "
						wait
					else
						var coef_thimble = input
						exitwhile
					endif
				endwhile
				close
				return
			break
		endchoose
	else
		if v[jp_event38] == 6
			var y4 = x - x4
			if y4 < 0
				var z4 = 0
				x4 = 0
			else
				var z4 = 1
			endif
			var y3 = x - x4 - x3
			if y3 < 0
				var z3 = 0
				x3 = 0
			else
				var z3 = 1
			endif
			var y2 = x - x4 - x3 - x2
			if y2 < 0
				var z2 = 0
				x2 = 0
			else
				var z2 = 1
			endif
			var y1 = x - x4 - x3 - x2 - x1
			if y1 < 0
				var z1 = 0
				x1 = 0
			else
				var z1 = 1
			endif
			var n = 4 - z1 - z2 - z3 - z4
			if n == 0
				dialog "[�������]"
				dialog "�� �������� �����! ��� ����� ���������� � ���� �����!"
				changequest 29155 29156
				setitem jp_event38 7
				close
				return
			endif
			dialog "[�������]"
			dialog "������! � �������!"
			dialog "� ������ ������ �����! ��, ���� ������ �� �������� � �� �������."
			dialog "����� ������������� �������, ���������� ������, � ���... ������� �� ������!"
			dialog "�� ��� ������� �� ���� ���?"

			wait
			choose menu "������ ���� ����� " "������ ����� ����� " "���� "
				case 1
					if z1 == 1
						dialog "[�������]"
						dialog "�� ��� �������� � ���� ����!"
						close
						return
					endif
					dialog "[�������] "
					dialog "������ ���� ������ (5 - 10) "
					dialog "������� 0 ��� ������ �� ���� "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[�������]"
							dialog "�� ��������."
							close
							return
						endif
						if error
							dialog "[�������] "
							dialog "������ ������ ���� �� 5 �� 10 ����������! ����� �������! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_color
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[�������] "
						dialog "� ���������, � ���� ������������ ����� ��� ������� � ����! �������� � ����������� "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[�������] "
						dialog "� ��� ������������ ����������! ��� �� ����� ������? "
						close
						return
					else
						dialog "[�������] "
						dialog "������ ������� "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[�������] "
					dialog "� �������� ����� "
					wait
					var card_color = rand 1 2 	// 1 - ������, 2 - �������
					dialog "[�������] "
					dialog "����� � ��� ����? "
					wait
					choose menu "������! " "�������! " "� �� ���� "
						case 1
							var picked_color = 1
						break
						case 2
							var picked_color = 2
						break
						case 3
							dialog "[�������] "
							dialog "������ ������...�� ��� ��...������ � ������� ���� �� ���� "
							close
							return
						break
					endchoose
					if card_color == picked_color
						dialog "[�������] "
						dialog "����������, �� �������! "
						var wins = v[jp_event39]
						wins = wins + 1
						setitem jp_event39 wins
						var qwin = v[jp_event40]
						qwin = qwin + 1
						setitem jp_event40 qwin
						getitem Choco_Drink_Recipe qty
						close
						return
					else
						dialog "[�������] "
						dialog "� ���������, �� ��������! "
						dialog "����� � ��������� ��� "
						close
						return
					endif
				break
				case 2
					if z2 == 1
						dialog "[�������]"
						dialog "�� ��� �������� � ���� ����!"
						close
						return
					endif
					dialog "[�������] "
					dialog "�������� ���� ������ (5 - 10) "
					dialog "������� 0 ��� ������ �� ���� "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[�������]"
							dialog "�� ��������."
							close
							return
						endif
						if error
							dialog "[�������] "
							dialog "������ ������ ���� �� 5 �� 10 ����������! ����� �������! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_suit
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[�������] "
						dialog "� ���������, � ���� ������������ ����� ��� ������� � ����! �������� � ����������� "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[�������] "
						dialog "� ��� ������������ ����������! ��� �� ����� ������? "
						close
						return
					else
						dialog "[�������] "
						dialog "������ ������� "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[�������] "
					dialog "� �������� ����� "
					wait
					var card_suit = rand 1 4 	// 1 - ����, 2 - �����, 3 - �����, 4 - �����
					dialog "[�������] "
					dialog "����� � ��� �����? "
					wait
					choose menu "����! " "�����! " "����� " "����� " "� �� ���� "
						case 1
							var picked_suit = 1
						break
						case 2
							var picked_suit = 2
						break
						case 3
							var picked_suit = 3
						break
						case 4
							var picked_suit = 4
						break
						case 5
							dialog "[�������] "
							dialog "������ ������...�� ��� ��...������ � ������� ���� �� ���� "
							close
							return
						break
					endchoose
					if card_suit == picked_suit
						dialog "[�������] "
						dialog "����������, �� �������! "
						var wins = v[jp_event39]
						wins = wins + 1
						setitem jp_event39 wins
						var qwin = v[jp_event40]
						qwin = qwin + 2
						setitem jp_event40 qwin
						getitem Choco_Drink_Recipe qty
						close
						return
					else
						dialog "[�������] "
						dialog "� ���������, �� ��������! "
						dialog "����� � ��������� ��� "
						close
						return
					endif
				break
				case 3
					dialog "[�������]"
					dialog "�����������, �������� ���!"
					close
					return
				break
			endchoose
		elseif v[jp_event38] > 12
			dialog "[�������]"
			dialog "������ ������� �� ����?"
			wait
			choose menu "������ ���� ����� " "������ ����� ����� " "���� "
				case 1
					dialog "[�������] "
					dialog "������ ���� ������ (5 - 10) "
					dialog "������� 0 ��� ������ �� ���� "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[�������]"
							dialog "�� ��������."
							close
							return
						endif
						if error
							dialog "[�������] "
							dialog "������ ������ ���� �� 5 �� 10 ����������! ����� �������! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_color
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[�������] "
						dialog "� ���������, � ���� ������������ ����� ��� ������� � ����! �������� � ����������� "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[�������] "
						dialog "� ��� ������������ ����������! ��� �� ����� ������? "
						close
						return
					else
						dialog "[�������] "
						dialog "������ ������� "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[�������] "
					dialog "� �������� ����� "
					wait
					var card_color = rand 1 2 	// 1 - ������, 2 - �������
					dialog "[�������] "
					dialog "����� � ��� ����? "
					wait
					choose menu "������! " "�������! " "� �� ���� "
						case 1
							var picked_color = 1
						break
						case 2
							var picked_color = 2
						break
						case 3
							dialog "[�������] "
							dialog "������ ������...�� ��� ��...������ � ������� ���� �� ���� "
							close
							return
						break
					endchoose
					if card_color == picked_color
						dialog "[�������] "
						dialog "����������, �� �������! "
						var wins = v[jp_event39]
						if wins < 100
							wins = wins + 1
							setitem jp_event39 wins
						endif
						getitem Choco_Drink_Recipe qty
						if v[jp_event39] == 100
							dialog "���! ����������! �� ������� � ��� 100 ���. ��� �������� ��������������. ������� � ���� ���������.."
							close
							return
						endif
						close
						return
					else
						dialog "[�������] "
						dialog "� ���������, �� ��������! "
						dialog "����� � ��������� ��� "
						close
						return
					endif
				break
				case 2
					if z2 == 2
						dialog "[�������]"
						dialog "�� ��� �������� � ���� ����!"
						close
						return
					endif
					dialog "[�������] "
					dialog "�������� ���� ������ (5 - 10) "
					dialog "������� 0 ��� ������ �� ���� "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[�������]"
							dialog "�� ��������."
							close
							return
						endif
						if error
							dialog "[�������] "
							dialog "������ ������ ���� �� 5 �� 10 ����������! ����� �������! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_suit
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[�������] "
						dialog "� ���������, � ���� ������������ ����� ��� ������� � ����! �������� � ����������� "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[�������] "
						dialog "� ��� ������������ ����������! ��� �� ����� ������? "
						close
						return
					else
						dialog "[�������] "
						dialog "������ ������� "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[�������] "
					dialog "� �������� ����� "
					wait
					var card_suit = rand 1 4 	// 1 - ����, 2 - �����, 3 - �����, 4 - �����
					dialog "[������] "
					dialog "����� � ��� �����? "
					wait
					choose menu "����! " "�����! " "����� " "����� " "� �� ���� "
						case 1
							var picked_suit = 1
						break
						case 2
							var picked_suit = 2
						break
						case 3
							var picked_suit = 3
						break
						case 4
							var picked_suit = 4
						break
						case 5
							dialog "[�������] "
							dialog "������ ������...�� ��� ��...������ � ������� ���� �� ���� "
							close
							return
						break
					endchoose
					if card_suit == picked_suit
						dialog "[�������] "
						dialog "����������, �� �������! "
						var wins = v[jp_event39]
						if wins < 100
							wins = wins + 1
							setitem jp_event39 wins
						endif
						getitem Choco_Drink_Recipe qty
						if v[jp_event39] == 100
							dialog "���! ����������! �� ������� � ��� 100 ���. ��� �������� ��������������. ������� � ���� ���������.."
							close
							return
						endif
						close
						return
					else
						dialog "[�������] "
						dialog "� ���������, �� ��������! "
						dialog "����� � ��������� ��� "
						close
						return
					endif
				break
				case 3
					dialog "[�������]"
					dialog "�����������, �������� ���!"
					close
					return
				break
			endchoose
		endif
	endif
return

npc "comodo" "������� " 4W_M_01 136 117 4 0 0
OnClick:
	var bet
	var card_color
	var card_suit
	var thimblerig
	var picked_color
	var picked_suit
	var picked_marble
	var card_game
	var coef_color = 2
	var coef_suit = 4
	var coef_bingo_1 = 3
	var coef_bingo_2 = 11
	var coef_bingo_3 = 37
	var match_count = 0
	var coef_thimble = 3
	var x = v[jp_event40]
	var x1 = 1
	var x2 = 2
	var x3 = 4
	var x4 = 8
	var check_shield = GetEquipCount Ahura_Mazda
	var coef_fish = 2
	if (check_shield > 0)
		dialog "[������] "
		dialog "���������� ������������ "
		wait
		choose menu "������� " "����� " "���� " // "����� " "�� ���� ������ "
			case 1
				while(1)
					dlgwrite 1 1000
					if error
						dialog "[������] "
						dialog "������ "
						wait
					else
						var coef_fish = input
						exitwhile
					endif
				endwhile
				close
				return
			break
			case 2
				dialog "[������] "
				dialog "�� ����, ��� ��� ��� �����? "
				choose menu "1 " "2 " "3 "
					case 1
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[������] "
								dialog "������ "
								wait
							else
								var coef_bingo_1 = input
								exitwhile
							endif
						endwhile
						close
						return
					break
					case 2
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[������] "
								dialog "������ "
								wait
							else
								var coef_bingo_2 = input
								exitwhile
							endif
						endwhile
						close
						return
					break
					case 3
						while(1)
							dlgwrite 1 1000
							if error
								dialog "[������] "
								dialog "������ "
								wait
							else
								var coef_bingo_3 = input
								exitwhile
							endif
						endwhile
						close
						return
					break					
				endchoose
			break
			case 3
				close
				return
			break
		endchoose
	else
		if v[jp_event38] == 6
			var fish_win = 0
			var y4 = x - x4
			if y4 < 0
				var z4 = 0
				x4 = 0
			else
				var z4 = 1
			endif
			var y3 = x - x4 - x3
			if y3 < 0
				var z3 = 0
				x3 = 0
			else
				var z3 = 1
			endif
			var y2 = x - x4 - x3 - x2
			if y2 < 0
				var z2 = 0
				x2 = 0
			else
				var z2 = 1
			endif
			var y1 = x - x4 - x3 - x2 - x1
			if y1 < 0
				var z1 = 0
				x1 = 0
			else
				var z1 = 1
			endif
			var n = 4 - z1 - z2 - z3 - z4
			if n == 0
				dialog "[�������]"
				dialog "�� �������� �����! ��� ����� ���������� � ���� �����!"
				changequest 29155 29156
				setitem jp_event38 7
				close
				return
			endif
			dialog "[�������]"
			dialog "������! � �������."
			dialog "� ������ ����� ������! �� ��� ����� � ����� � �����. "
			dialog "���� ���� ��������� ���������� - ����� �������. "
			wait
			dialog "[�������]"
			dialog "���� �� ������� ���� ������� - � ��� � ����� ���������� - � ����������� �������� � ���� ����."
			wait
			choose menu "������� " "����� " "���� "
				case 1
					if z3 == 1
						dialog "[�������]"
						dialog "�� ��� �������� � ���� ����!"
						close
						return
					endif
					dialog "[�������] "
					dialog "������ ���� ������ (5 - 10) "
					dialog "������� 0 ��� ������ �� ���� "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[�������]"
							dialog "�� ��������."
							close
							return
						endif
						if error
							dialog "[�������] "
							dialog "������ ������ ���� �� 5 �� 10 ����������! ����� �������! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_fish
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[�������] "
						dialog "� ���������, � ���� ������������ ����� ��� ������� � ����! �������� � ����������� "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[�������] "
						dialog "� ���� ������������ ����������! ��� �� ����� ������? "
						close
						return
					else
						dialog "[�������] "
						dialog "������ ������� "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					var fish_weight = rand 1 9
					dialog "[�������] "
					dialog "� ������ ��� ������� �������� ���� "
					dialog "����� "+fish_weight+" ��! "
					dialog "������� �������� ���� ��������? "
					wait
					choose menu "�����! " "����� ���� �����... "
						case 1
							var i = 0
							while(i < 5)
								while(1)
									dialog "*�� ������� ������ � �����...* "
									wait
									var bait_flag = rand 1 5
									if bait_flag == 5
										dialog "*�������!* "
										dialog "*�� ���������� � ������ ����* "
										wait
										exitwhile
									else
										dialog "�� �����... "
										wait
									endif
								endwhile
								var try_weight = rand 1 10
								dialog "*�� ������ ���� ����� "+try_weight+" ��! "
								wait
								if try_weight > fish_weight
									dialog "[�������] "
									dialog "����� ������� ����! �� �������! "
									var fish_win = 1
									wait
									exitwhile
								else
									dialog "[�������] "
									dialog "�������... "
									dialog "�� ����� �������� ���� ��� ������ "
									i = i + 1
									wait
								endif
							endwhile
							if fish_win == 0
								dialog "[�������] "
								dialog "� ���� �� ���������� ������� ���� ������ ����, � ������ � �������! "
								close
								return
							elseif fish_win == 1
								dialog "[�������] "
								dialog "��� �� ���! ��� � ��� ���������! �� ������ ���� ������... "
								var wins = v[jp_event39]
								wins = wins + 1
								setitem jp_event39 wins
								var qwin = v[jp_event40]
								qwin = qwin + 4
								setitem jp_event40 qwin
								getitem Choco_Drink_Recipe qty
								close
								return
							endif
						break
						case 2
							dialog "[�������]"
							dialog "������, � ����, ��� ��� ������ ����� ���� � ���� ����! ���� ������ �� ��� �����!"
							close
							return
						break
					endchoose
				break
				case 2
					if z4 == 1
						dialog "[�������]"
						dialog "�� ��� �������� � ���� ����!"
						close
						return
					endif
					dialog "[�������] "
					dialog "������ ���� ������ (5 - 10) "
					dialog "������� 0 ��� ������ �� ���� "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[�������]"
							dialog "�� ��������."
							close
							return
						endif
						if error
							dialog "[�������] "
							dialog "������ ������ ���� �� 5 �� 10 ����������! ����� �������! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_bingo_3
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[�������] "
						dialog "� ���������, � ���� ������������ ����� ��� ������� � ����! �������� � ����������� "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[�������] "
						dialog "� ���� ������������ ����������! ��� �� ����� ������? "
						close
						return
					else
						dialog "[�������] "
						dialog "������ ������� "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[�������] "
					dialog "�� ������ ��������� �� 3 ����� �� 1 �� 10 "
					dialog "����� ���� ������ �����? "
					wait
					dlgwrite 1 10
					var number_1 = input
					while(1)
						dialog "[�������] "
						dialog "����� ���� ������ �����? "
						wait
						dlgwrite 1 10
						if error
							dialog "[�������] "
							dialog "������ "
							wait
						else
							var number_2 = input
							if number_2 == number_1
								dialog "[�������] "	
								dialog "�� ��� ������� �� ��� ����� "
								dialog "��������� �� ������ "
							else
								exitwhile
							endif
						endif
					endwhile
					while(1)
						dialog "[�������] "
						dialog "����� ���� ������ �����? "
						wait
						dlgwrite 1 10
						if error
							dialog "[�������] "
							dialog "������ "
							wait
						else
							var number_3 = input
							if (number_3 == number_1)|(number_3 == number_2)
								dialog "[�������] "
								dialog "�� ��� ������� �� ��� ����� "
								dialog "��������� �� ������ "
							else
								exitwhile
							endif
						endif
					endwhile
					dialog "[�������] "
					dialog "������ �������. "
					wait
					dialog "[�������] "
					dialog "����, ������ ���������� ����� ����� ����... "
					wait
					var match_count = 0
					var win_number_1 = rand 1 10
					dialog "[�������] "
					dialog win_number_1+"!!! "
					wait
					if (number_1 == win_number_1)
						match_count = match_count + 1
					endif
					dialog "[�������] "
					dialog "����������... ������ �����... "
					wait
					var win_number_2 = rand 1 10
					dialog "[�������] "
					dialog win_number_2+"!!! "
					wait
					if (number_2 == win_number_2)
						match_count = match_count + 1
					endif
					dialog "[�������] "
					dialog "� ������� ��������� ������ �����... "
					wait
					var win_number_3 = rand 1 10
					dialog "[�������] "
					dialog win_number_3+"!!!"
					wait
					if (number_3 == win_number_3)
						match_count = match_count + 1
					endif
					dialog "[�������] "
					dialog "���� ���������� ������ ����� ����: "
					dialog win_number_1+", "+win_number_2+" � "+win_number_3+"! "
					wait
					dialog "[�������] "
					dialog "�� �������� "+match_count+" ����� �� ����. "
					wait
					if match_count == 0
						dialog "[�������] "
						dialog "� ���������, �� ��������� "
						dialog "����� � ��������� ��� "
						close
						return
					elseif match_count == 1
						dialog "[�������] "
						dialog "�������� ���������, 1 �� 3..."
						qty = coef_bingo_1 * bet
						var wins = v[jp_event39]
						wins = wins + 1
						setitem jp_event39 wins
						var qwin = v[jp_event40]
						qwin = qwin + 8
						setitem jp_event40 qwin
						getitem Choco_Drink_Recipe qty
						close
						return
					elseif match_count == 2
						dialog "[�������] "
						dialog "������������� ������� ����, 2 �� 3 "
						qty = coef_bingo_2 * bet
						var wins = v[jp_event39]
						wins = wins + 1
						setitem jp_event39 wins
						var qwin = v[jp_event40]
						qwin = qwin + 8
						setitem jp_event40 qwin
						getitem Choco_Drink_Recipe qty
						close
						return
					elseif match_count == 3
						dialog "[�������] "
						dialog "����������!!! "
						dialog "�� �������� ��� 3 �����! "
						qty = coef_bingo_3 * bet
						var wins = v[jp_event39]
						wins = wins + 1
						setitem jp_event39 wins
						var qwin = v[jp_event40]
						qwin = qwin + 8
						setitem jp_event40 qwin
						getitem Choco_Drink_Recipe qty
						close
						return
					endif
				break
				case 3
					dialog "[�������] "
					dialog "�� ��� ��, ��������!"
					close
					return
				break
			endchoose
		elseif v[jp_event38] > 12
			dialog "[�������]"
			dialog "�, ��� �� ��������? ������ �������� ������� �����?"
			wait
			choose menu "������� " "����� " "���� "
				case 1
					dialog "[�������] "
					dialog "������ ���� ������ (5 - 10) "
					dialog "������� 0 ��� ������ �� ���� "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[�������]"
							dialog "�� ��������."
							close
							return
						endif
						if error
							dialog "[�������] "
							dialog "������ ������ ���� �� 5 �� 10 ����������! ����� �������! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_fish
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[�������] "
						dialog "� ���������, � ���� ������������ ����� ��� ������� � ����! �������� � ����������� "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[�������] "
						dialog "� ���� ������������ ����������! ��� �� ����� ������? "
						close
						return
					else
						dialog "[�������] "
						dialog "������ ������� "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					var fish_weight = rand 1 9
					dialog "[�������] "
					dialog "� ������ ��� ������� �������� ���� "
					dialog "����� "+fish_weight+" ��! "
					dialog "������� �������� ���� ��������? "
					wait
					choose menu "�����! " "����� ���� �����... "
						case 1
							var i = 0
							while(i < 5)
								while(1)
									dialog "*�� ������� ������ � �����...* "
									var bait_flag = rand 1 5
									if bait_flag == 5
										dialog "*�������!* "
										dialog "*�� ���������� � ������ ����* "
										exitwhile
									else
										dialog "�� �����... "
										wait
									endif
								endwhile
								var try_weight = rand 1 10
								dialog "*�� ������ ���� ����� "+try_weight+" ��! "
								if try_weight > fish_weight
									dialog "[�������] "
									dialog "����� ������� ����! �� �������! "
									var fish_win = 1
									exitwhile
								else
									dialog "[�������] "
									dialog "�������... "
									dialog "�� ����� �������� ���� ��� ������ "
									i = i + 1
								endif
							endwhile
							if fish_win == 0
								dialog "[�������] "
								dialog "� ���� �� ���������� ������� ���� ������ ����, � ������ � �������! "
								close
								return
							elseif fish_win == 1
								dialog "[�������] "
								dialog "��� �� ���! ��� � ��� ���������! �� ������ ���� ������... "
								var wins = v[jp_event39]
								if wins < 100
									wins = wins + 1
									setitem jp_event39 wins
								endif
								getitem Choco_Drink_Recipe qty
								if v[jp_event39] == 100
									dialog "���! ����������! �� ������� � ��� 100 ���. ��� �������� ��������������. ������� � ���� ���������.."
									close
									return
								endif
								close
								return
							endif
						break
						case 2
							dialog "[�������]"
							dialog "������, � ����, ��� ��� ������ ����� ���� � ���� ����! ���� ������ �� ��� �����! "
							close
							return
						break
					endchoose
				break
				case 2
					dialog "[�������] "
					dialog "������ ���� ������ (5 - 10) "
					dialog "������� 0 ��� ������ �� ���� "
					wait
					while(1)
						dlgwrite 5 10
						if input == 0
							dialog "[�������]"
							dialog "�� ��������."
							close
							return
						endif
						if error
							dialog "[�������] "
							dialog "������ ������ ���� �� 5 �� 10 ����������! ����� �������! "
							wait
						else
							var bet = input
							exitwhile
						endif
					endwhile
					var qty = bet * coef_bingo_3
					var item_check = GetInventoryRemainCount Choco_Drink_Recipe qty
					if item_check != 1
						dialog "[�������] "
						dialog "� ���������, � ���� ������������ ����� ��� ������� � ����! �������� � ����������� "
						close
						return
					endif
					if v[Choco_Drink_Recipe] < bet
						dialog "[�������] "
						dialog "� ���� ������������ ����������! ��� �� ����� ������? "
						close
						return
					else
						dialog "[�������] "
						dialog "������ ������� "
						dropitem Choco_Drink_Recipe bet
						wait
					endif
					dialog "[�������] "
					dialog "�� ������ ��������� �� 3 ����� �� 1 �� 10 "
					dialog "����� ���� ������ �����? "
					wait
					dlgwrite 1 10
					var number_1 = input
					while(1)
						dialog "[�������] "
						dialog "����� ���� ������ �����? "
						wait
						dlgwrite 1 10
						if error
							dialog "[�������] "
							dialog "������ "
							wait
						else
							var number_2 = input
							if number_2 == number_1
								dialog "[�������] "	
								dialog "�� ��� ������� �� ��� ����� "
								dialog "��������� �� ������ "
							else
								exitwhile
							endif
						endif
					endwhile
					while(1)
						dialog "[�������] "
						dialog "����� ���� ������ �����? "
						wait
						dlgwrite 1 10
						if error
							dialog "[�������] "
							dialog "������ "
							wait
						else
							var number_3 = input
							if (number_3 == number_1)|(number_3 == number_2)
								dialog "[�������] "
								dialog "�� ��� ������� �� ��� ����� "
								dialog "��������� �� ������ "
							else
								exitwhile
							endif
						endif
					endwhile
					var match_count = 0
					dialog "[�������] "
					dialog "������ �������. "
					wait
					dialog "[�������] "
					dialog "����, ������ ���������� ����� ����� ����... "
					wait
					var win_number_1 = rand 1 10
					dialog "[�������] "
					dialog win_number_1+"!!! "
					wait
					if (number_1 == win_number_1)
						match_count = match_count + 1
					endif
					dialog "[�������] "
					dialog "����������... ������ �����... "
					wait
					var win_number_2 = rand 1 10
					dialog "[�������] "
					dialog win_number_2+"!!! "
					wait
					if (number_2 == win_number_2)
						match_count = match_count + 1
					endif
					dialog "[�������] "
					dialog "� ������� ��������� ������ �����... "
					wait
					var win_number_3 = rand 1 10
					dialog "[�������] "
					dialog win_number_3+"!!!"
					wait
					if (number_3 == win_number_3)
						match_count = match_count + 1
					endif
					dialog "[�������] "
					dialog "���� ���������� ������ ����� ����: "
					dialog win_number_1+", "+win_number_2+" � "+win_number_3+"! "
					wait
					dialog "[�������] "
					dialog "�� �������� "+match_count+" ����� �� ����. "
					wait
					if match_count == 0
						dialog "[�������] "
						dialog "� ���������, �� ��������� "
						dialog "����� � ��������� ��� "
						close
						return
					elseif match_count == 1
						dialog "[�������] "
						dialog "�������� ���������, 1 �� 3..."
						qty = coef_bingo_1 * bet
						var wins = v[jp_event39]
						if wins < 100
							wins = wins + 1
							setitem jp_event39 wins
						endif
						getitem Choco_Drink_Recipe qty
						if v[jp_event39] == 100
							dialog "���! ����������! �� ������� � ��� 100 ���. ��� �������� ��������������. ������� � ���� ���������.."
							close
							return
						endif
						close
						return
					elseif match_count == 2
						dialog "[�������] "
						dialog "������������� ������� ����, 2 �� 3 "
						qty = coef_bingo_2 * bet
						var wins = v[jp_event39]
						if wins < 100
							wins = wins + 1
							setitem jp_event39 wins
						endif
						getitem Choco_Drink_Recipe qty
						if v[jp_event39] == 100
							dialog "���! ����������! �� ������� � ��� 100 ���. ��� �������� ��������������. ������� � ���� ���������.."
							close
							return
						endif
						close
						return
					elseif match_count == 3
						dialog "[�������] "
						dialog "����������!!! "
						dialog "�� �������� ��� 3 �����! "
						qty = coef_bingo_3 * bet
						var wins = v[jp_event39]
						if wins < 100
							wins = wins + 1
							setitem jp_event39 wins
						endif
						getitem Choco_Drink_Recipe qty
						if v[jp_event39] == 100
							dialog "���! ����������! �� ������� � ��� 100 ���. ��� �������� ��������������. ������� � ���� ���������.."
							close
							return
						endif
						close
						return
					endif
				break
				case 3
					dialog "[�������] "
					dialog "�� ��� ��, ��������!"
					close
					return
				break
			endchoose
		endif
	endif
return
