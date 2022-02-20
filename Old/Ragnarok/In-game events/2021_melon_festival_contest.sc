// ������ ��������� 2021 ���
// ���� jp_event57 - contest
// Apple -> Evt_May01_KR
// Banana -> Melon_Bread
// Grape -> Melon_Juice
// Carrot -> Melon_Parfait
// Meat -> C_Mini_Melon
// Honey -> Suspicious_Melon
// Milk -> Sweet_Melon

npc "prontera" "��������� " 4_F_02 141 125 5 0 0

OnClick:

	var day_of_year = GetGlobalVar "day_of_year"
	var top_melon_name = GetGlobalStr "top_melon_name"
    var top_melon_size = GetGlobalVar "top_melon_size"
	
	var top_melon_day = GetGlobalVar "top_melon_day"
	if (top_melon_day < day_of_year)
		SetGlobalVar "top_melon_size" 0
		SetGlobalVar "top_melon_day" day_of_year
		var top_melon_size = GetGlobalVar "top_melon_size"
	endif
	
	if (top_melon_size > 1000)
		var max_melon_size = top_melon_size + 100
	else
		var max_melon_size = 1100
	endif
	
	var wt_inven = GetInventoryRemainCount 1301 3
    if ((wt_inven == 2) | (wt_inven == 3))
		dialog "[�������]"
        dialog "���� ��������� ����������,"
		dialog "�������� ����� � �����������."
        close
        return
    else
    endif
	
	dialog "[���������]"
	dialog "����� ���������� "
	dialog "�� ��������� ������� ������!"
	dialog "��������� ��� ������������� "
	dialog "� ��������!"
	Talk2me "��������� " "��������� : ���������! ���������� � ��������!"
	wait
	dialog "[���������]"
	dialog "������� ����� ������."
	dialog "��������� ��� ����, "
	dialog "����� ������� ������� �� "
	dialog "������� �������."
	wait
	dialog "[���������]"
	dialog "��, � ���� �������,"
	dialog "������� �. ������� �� ���� "
	dialog "����������, �������, ������� "
	dialog "�� �������� ����� ����! ��-��!"
	dialog "������� ���������� ������ ����!"
	wait
	dialog "[���������]"
	dialog "�� ������, ��� � ������� ����� "
	dialog "�������� ������ ���� ��� � ����."
	dialog "���� �� �� ����������� �� ������� "
	dialog "������, �� ������ ����������� ���,"
	dialog "�� ������� �������� ������,"
	dialog "���� ��������� ������! �� ���?"
	wait
	choose menu "� ���� �����������!" "��� ������ ����������?" "��� �� ������� ������?" "��� ����..." 
		case 1
			dialog "[���������]"
			dialog "�������! ���������..."
			wait
            if (v[Suspicious_Melon] < 1)
          		dialog "[���������]"
          		dialog "��, ������� � ��� ��� "
          		dialog "�� ����� ����, ��������� "
          		dialog "������� � ��������..."
				dialog "�� �� ���������������,"
          		dialog "������� ����� ���� �� ����� "
          		dialog "����� ���������!"
          		wait
				dialog "[���������]"
          		dialog "��� ���������� ������� ���� "
          		dialog "�������� �������, ��� ����� "
          		dialog "����������� �� �����, ������ � "
				dialog "�������� �������� ������."
				wait
          		dialog "[���������]"
          		dialog "...�� ��� ��� ���..."
          		dialog "���, ������, ����� "
          		dialog "��������������, � ��� ���� "
				dialog "����������� ������ �������� ����."
				dialog "�� ����������� ������ ��������� "
				dialog "� ��� �� �������..."
          		close
          		return
        	else
				var sector_priz = rand 1 10000
				if (sector_priz > 9500)
					var melon_size = rand 1001 max_melon_size
					if (melon_size > top_melon_size)
						dialog "[���������]"
						dialog "����������!"
						dialog "���� ���� - ����� ������� "
						dialog "�� ���, ��� � ����� �������!"
						dialog "Ÿ ����� - "+melon_size+" ��!"
						dialog "�������, �� �������� "
						dialog "������ �������!"
						broadcastserver "FF0000" FW_NORMAL 10 0 0 ""+PcName+" �������� ����� ������ � ��������! ������ ��� ���� - "+melon_size+" ��!"
						SetGlobalVar "top_melon_size" melon_size
						SetGlobalStr "top_melon_name" PcName
						dropitem Suspicious_Melon 1
						setitem jp_event57 day_of_year
						if (sector_priz > 9800)
							getitem Apple 1 // C_Mini_Melon 1
						elseif (sector_priz > 9700)
							getitem Melon_Juice 50
						elseif (sector_priz > 9600)
							getitem Melon_Bread 50
						else
							getitem Melon_Parfait 5
						endif
						close
						return
					elseif (jp_event57 < day_of_year)
						dialog "[���������]"
						dialog "������������!"
						dialog "��� ���� �� ����� ������� ���� "
						dialog "�� ���, ��� � ����� �������!"
						dialog "Ÿ ����� - "+melon_size+" ��!"
						dialog "�������, �� �������� "
						dialog "������ �������!"
						dropitem Suspicious_Melon 1
						setitem jp_event57 day_of_year
						if (sector_priz > 9800)
							getitem Apple 1 // C_Mini_Melon 1
						elseif (sector_priz > 9700)
							getitem Melon_Juice 50
						elseif (sector_priz > 9600)
							getitem Melon_Bread 50
						else
							getitem Melon_Parfait 5
						endif
						close
						return
					else 
						dialog "[���������]"
						dialog "������������!"
						dialog "��� ���� �� ����� ������� ���� "
						dialog "�� ���, ��� � �����!"
						dialog "Ÿ ����� - "+melon_size+" ��! ��,"
						dialog "� ���������, �� ��� ����������� "
						dialog "� �������� ������� �������."
						dropitem Suspicious_Melon 1
						close
						return
					endif
				elseif (sector_priz > 6000)
					var melon_size = rand 501 1000
					if (melon_size > top_melon_size)
						dialog "[���������]"
						dialog "����������!"
						dialog "���� ���� - ����� ������� "
						dialog "�� ���, ��� � ����� �������!"
						dialog "Ÿ ����� - "+melon_size+" ��!"
						dialog "�������, �� �������� "
						dialog "������ �������!"
						broadcastserver "FF0000" FW_NORMAL 10 0 0 ""+PcName+" �������� ����� ������ � ��������! ������ ��� ���� - "+melon_size+" ��!"
						SetGlobalVar "top_melon_size" melon_size
						SetGlobalStr "top_melon_name" PcName
						dropitem Suspicious_Melon 1
						setitem jp_event57 day_of_year
						if (sector_priz > 8000)
							getitem Sweet_Melon 20
						elseif (sector_priz > 7250)
							getitem Melon_Juice 20
						elseif (sector_priz > 6500)
							getitem Melon_Bread 20
						else
							getitem Melon_Parfait 1
						endif
						close
						return
					elseif (jp_event57 < day_of_year)
						dialog "[���������]"
						dialog "�������!"
						dialog "���� ����, �������, �� ����� "
						dialog "������� �� �������, �� ���� "
						dialog "��������� ��������� ��������!"
						dialog "Ÿ ����� - "+melon_size+" ��."
						dialog "� ���, ������� ��, ���� �������."
						dropitem Suspicious_Melon 1
						setitem jp_event57 day_of_year
						if (sector_priz > 8000)
							getitem Sweet_Melon 20
						elseif (sector_priz > 7250)
							getitem Melon_Juice 20
						elseif (sector_priz > 6500)
							getitem Melon_Bread 20
						else
							getitem Melon_Parfait 1
						endif
						close
						return
					else 
						dialog "[���������]"
						dialog "�������!"
						dialog "���� ����, �������, �� ����� "
						dialog "������� �� �������, �� ���� "
						dialog "��������� ��������� ��������!"
						dialog "Ÿ ����� - "+melon_size+" ��. �� "
						dialog "������� �� ������� ��� ��������."
						dropitem Suspicious_Melon 1
						close
						return
					endif
				else
					var melon_size = rand 200 500
					if (melon_size > top_melon_size)
						dialog "[���������]"
						dialog "����������!"
						dialog "���� ���� - ����� ������� "
						dialog "�� ���, ��� � ����� �������!"
						dialog "Ÿ ����� - "+melon_size+" ��!"
						dialog "�������, �� �������� "
						dialog "������ �������!"
						broadcastserver "FF0000" FW_NORMAL 10 0 0 ""+PcName+" �������� ����� ������ � ��������! ������ ��� ���� - "+melon_size+" ��!"
						SetGlobalVar "top_melon_size" melon_size
						SetGlobalStr "top_melon_name" PcName
						dropitem Suspicious_Melon 1
						setitem jp_event57 day_of_year
						if (sector_priz > 3000)
							getitem Sweet_Melon 10
						elseif (sector_priz > 1500)
							getitem Melon_Juice 10
						else
							getitem Melon_Bread 10
						endif
						close
						return
					elseif (jp_event57 < day_of_year)
						dialog "[���������]"
						dialog "����� ����� ����� ��������� "
						dialog "����� �����, ��, ���..."
						dialog "��� ������� ���� ��� ���������� "
						dialog "�� ������ �����. ����� "+melon_size+" ��."
						dialog "�� �� ���������������!"
						dialog "��� ���� �������� �������."
						dropitem Suspicious_Melon 1
						setitem jp_event57 day_of_year
						if (sector_priz > 3000)
							getitem Sweet_Melon 10
						elseif (sector_priz > 1500)
							getitem Melon_Juice 10
						else
							getitem Melon_Bread 10
						endif
						close
						return
					else 
						dialog "[���������]"
						dialog "����� ����� ����� ��������� "
						dialog "����� �����, ��, ���..."
						dialog "��� ������� ���� ��� ���������� "
						dialog "�� ������ �����. ����� "+melon_size+" ��."
						dialog "�� �� ���������������. ������ "
						dialog "������ ����������� �����!"
						dropitem Suspicious_Melon 1
						close
						return
					endif
				endif
			endif
		break
		case 2
			if (top_melon_size == 0)
				dialog "[���������]"
				dialog "����� ������������ "
				dialog "��� "+top_melon_name+"."
				dialog "������� � �������� ����� �� "
				dialog "����������. �� ������ "
				dialog "����� ������!"
				close
				return
			else
				dialog "[���������]"
				dialog "�� ������� ������ ������������ "
				dialog "�������� "+top_melon_name+"."
				dialog "������ ��� ���� ���������� "
				dialog "����� "+top_melon_size+" ��!"
				close
				return
			endif
		break
		case 3
			dialog "[���������]"
			dialog "�, �� ��� ������� ������?"
			dialog "��� ����� ������� � ���������� "
			dialog "�������� � ���������."
			dialog "��� ������������ ��������� ������,"
			dialog "�� ������������ �� ����� �����."
			wait
			dialog "[���������]"
			dialog "�����, �� ����� ������� "
			dialog "� �� ��� ���������� ��� "
			dialog "������������ ������� � �������� "
			dialog "�� ����� ������� ����."
			dialog "� ���������, ���� �����."
			if (v[Evt_May01_KR] < 1)
				close
				return
			else
				wait
				dialog "[���������]"
				dialog "��������� � ������,"
				dialog "� ��� ���� ����� �������."
				dialog "������� ������������� � "
				dialog "�������� ��� ���?"
				dialog "� ����������� ��� ���� �� ����� "
				dialog "����-������������."
				wait
				choose menu "� ���� �����������!" "��������� ������..."
					case 1
						var sector_priz = rand 1 10000
						if (sector_priz > 9500)
							var melon_size = rand 1001 max_melon_size
							if (melon_size > top_melon_size)
								dialog "[���������]"
								dialog "����������!"
								dialog "���� ���� - ����� ������� "
								dialog "�� ���, ��� � ����� �������!"
								dialog "Ÿ ����� - "+melon_size+" ��!"
								dialog "�������, �� �������� "
								dialog "������ �������!"
								broadcastserver "FF0000" FW_NORMAL 10 0 0 ""+PcName+" �������� ����� ������ � ��������! ������ ��� ���� - "+melon_size+" ��!"
								SetGlobalVar "top_melon_size" melon_size
								SetGlobalStr "top_melon_name" PcName
								dropitem Suspicious_Melon 1
								if (sector_priz > 9800)
									getitem Apple 1 // C_Mini_Melon 1
								elseif (sector_priz > 9700)
									getitem Melon_Juice 50
								elseif (sector_priz > 9600)
									getitem Melon_Bread 50
								else
									getitem Melon_Parfait 5
								endif
								close
								return
							else
								dialog "[���������]"
								dialog "������������!"
								dialog "��� ���� �� ����� ������� ���� "
								dialog "�� ���, ��� � ����� �������!"
								dialog "Ÿ ����� - "+melon_size+" ��!"
								dialog "�������, �� �������� "
								dialog "������ �������!"
								dropitem Suspicious_Melon 1
								if (sector_priz > 9800)
									getitem Apple 1 // C_Mini_Melon 1
								elseif (sector_priz > 9700)
									getitem Melon_Juice 50
								elseif (sector_priz > 9600)
									getitem Melon_Bread 50
								else
									getitem Melon_Parfait 5
								endif
								close
								return
							endif
						elseif (sector_priz > 6000)
							var melon_size = rand 501 1000
							if (melon_size > top_melon_size)
								dialog "[���������]"
								dialog "����������!"
								dialog "���� ���� - ����� ������� "
								dialog "�� ���, ��� � ����� �������!"
								dialog "Ÿ ����� - "+melon_size+" ��!"
								dialog "�������, �� �������� "
								dialog "������ �������!"
								broadcastserver "FF0000" FW_NORMAL 10 0 0 ""+PcName+" �������� ����� ������ � ��������! ������ ��� ���� - "+melon_size+" ��!"
								SetGlobalVar "top_melon_size" melon_size
								SetGlobalStr "top_melon_name" PcName
								dropitem Suspicious_Melon 1
								if (sector_priz > 8000)
									getitem Sweet_Melon 20
								elseif (sector_priz > 7250)
									getitem Melon_Juice 20
								elseif (sector_priz > 6500)
									getitem Melon_Bread 20
								else
									getitem Melon_Parfait 1
								endif
								close
								return
							else
								dialog "[���������]"
								dialog "�������!"
								dialog "���� ����, �������, �� ����� "
								dialog "������� �� �������, �� ���� "
								dialog "��������� ��������� ��������!"
								dialog "Ÿ ����� - "+melon_size+" ��."
								dialog "� ���, ������� ��, ���� �������."
								dropitem Suspicious_Melon 1
								if (sector_priz > 8000)
									getitem Sweet_Melon 20
								elseif (sector_priz > 7250)
									getitem Melon_Juice 20
								elseif (sector_priz > 6500)
									getitem Melon_Bread 20
								else
									getitem Melon_Parfait 1
								endif
								close
								return
							endif
						else
							var melon_size = rand 200 500
							if (melon_size > top_melon_size)
								dialog "[���������]"
								dialog "����������!"
								dialog "���� ���� - ����� ������� "
								dialog "�� ���, ��� � ����� �������!"
								dialog "Ÿ ����� - "+melon_size+" ��!"
								dialog "�������, �� �������� "
								dialog "������ �������!"
								broadcastserver "FF0000" FW_NORMAL 10 0 0 ""+PcName+" �������� ����� ������ � ��������! ������ ��� ���� - "+melon_size+" ��!"
								SetGlobalVar "top_melon_size" melon_size
								SetGlobalStr "top_melon_name" PcName
								dropitem Suspicious_Melon 1
								if (sector_priz > 3000)
									getitem Sweet_Melon 10
								elseif (sector_priz > 1500)
									getitem Melon_Juice 10
								else
									getitem Melon_Bread 10
								endif
								close
								return
							else
								dialog "[���������]"
								dialog "����� ����� ����� ��������� "
								dialog "����� �����, ��, ���..."
								dialog "��� ������� ���� ��� ���������� "
								dialog "�� ������ �����. ����� "+melon_size+" ��."
								dialog "�� �� ���������������!"
								dialog "��� ���� �������� �������."
								dropitem Suspicious_Melon 1
								if (sector_priz > 3000)
									getitem Sweet_Melon 10
								elseif (sector_priz > 1500)
									getitem Melon_Juice 10
								else
									getitem Melon_Bread 10
								endif
								close
								return
							endif
						endif
					break
					case 2
					break
				endchoose
			endif
		break
		case 4
		break
	endchoose
return

npc "prontera" "������������� ������� " 4_M_03 149 128 5 0 0

OnClick:

	dialog "[������������� �������]"
	dialog "�������, �� ������ ������ "
	dialog "��������� �������?"
	dialog "�� ������ �������� ���� "
	dialog "����� ������, ��� �� ������� "
	dialog "������������, � ������ "
	dialog "������������ ��������."
	wait
	dialog "[������������� �������]"
	dialog "� ���� ��� ���� ���������� "
	dialog "�����������! ��� ������ ������ "
	dialog "������, ��� ����? "
	dialog "�� �������, �������..."
	wait
	dialog "[������������� �������]"
	dialog "��� ������� �����,"
	dialog "������ �� ������!"
	dialog "�� �� ������ �������� � "
	dialog "�������� �� ����� ������� ����?"
	wait
	choose menu "��, ����!" "��� ��� �� ��������� "
	case 1
		dialog "[������������� �������]"
		dialog "����� ���� ��� ���."
    	dialog "��... ������, ������ ��, ���� "
    	dialog "�� ����������. � ����������� "
		dialog "�����."
		wait
		dialog "[������������� �������]"
		dialog "���� ���������� ��� "
    	dialog "����������� ���� ��..."
    	dialog "10 ������� ����."
		dialog "��� �������? �� �����?"
		wait
      	choose menu "����������� " "���� "
			case 1
				if (v[Sweet_Melon] > 9)
					dialog "[������������� �������]"
					dialog "�����."
					dialog "� �� ������������� ������ "
					dialog "� ���, ��� �� � ����."
					dialog "�� ������ ������..."
					getitem Suspicious_Melon 1
					dropitem Sweet_Melon 10
					close
					return
				else
					dialog "[������������� �������]"
					dialog "�� �����, ��� � ���� "
					dialog "���� ��, ��� ��� �����,"
					dialog "����� ������� ������."
					close
					return
				endif
			break
			case 2
			break
		endchoose
	break
	case 2
		dialog "[������������� �������]"
		dialog "�����. �������, ���� ���� "
		dialog "����������� ��������� �����."
		close
		return
	break
	endchoose
return

