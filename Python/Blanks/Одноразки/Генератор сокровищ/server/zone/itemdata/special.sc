
item Dogly_Bottle_Z
	event OnConsume:
		HealHP 30
		HealSP 10
		AddParamTime VAR_CRITICALSUCCESSVALUE 100 180 
		Condition EFFECTPlusAttackPower 180 20
		Condition EFFECTPlusMagicPower 180 20
		Condition HEALTHConfusion 10 10000
	return
	
item Comp_Glass_Of_Illusion
	event OnConsume:
		SkillToMe HP_ASSUMPTIO 5
		SetBuff	"EFST_S_LIFEPOTION" 100000 1
	return
	
item Anodyne_B						
	event OnConsume:
		HealHP 50
		HealSP 50
		var buff_count = 0	
		while(1)
			if (buff_count < 3)
				var buff_number = rand 1 10
				if (buff_number == 1)
					AddexpTime 15 10
				elseif (buff_number == 2)
					AddParamTime VAR_STR 15 600
					AddParamTime VAR_INT 15 600
				elseif (buff_number == 3)
					Condition EFFECTHaste 600 100
				elseif (buff_number == 4)
					SetBuff	"EFST_ATKER_BLOOD" 600000 1
				elseif (buff_number == 5)
					Condition EFFECTPlusAttackPower 600 20
					Condition EFFECTPlusMagicPower 600 20
				elseif (buff_number == 6)
					SetBuff	"EFST_S_LIFEPOTION" 600000 1
				elseif (buff_number == 7)
					AddParamTime VAR_BASICHIT 20 600
					AddParamTime VAR_BASICAVOIDANCE 20 600
				elseif (buff_number == 8)
					SkillToMe PR_KYRIE 10
				elseif (buff_number == 9)
					SkillToMe PR_MAGNIFICAT 5
				else
					AddParamTime VAR_VIT 15 600
					AddParamTime VAR_LUK 15 600
				endif
				var buff_count = buff_count + 1
			else
				exitwhile
			endif
		endwhile
		ShowEffect "" 70
		ShowEffect "" 100
	return	
	
item C_Pirate_Bandana
	event OnStartEquip:
		AddHealAmount_Kill VAR_HP 100
		AddHPAmount_MAGKill	100
		SubSpellDelay 10
		AddExtParam User VAR_LUKAMOUNT 10
		RaceAddDamage	RACE_Fish 20
		AddMdamage_Race	RACE_Fish 20
		RaceAddDamage	RACE_Undead 20
		AddMdamage_Race	RACE_Undead 20
	return			
	event OnFinishEquip:			
		SubHealAmount_Kill VAR_HP 100
		SubHPAmount_MAGKill	100
		AddSpellDelay 10
		SubExtParam User VAR_LUKAMOUNT 10
		RaceSubDamage	RACE_Fish 20
		SubMdamage_Race	RACE_Fish 20
		RaceSubDamage	RACE_Undead 20
		SubMdamage_Race	RACE_Undead 20		
	return
	
item DragonKnight_Eyepatch					
	event OnStartEquip:				
		AddEXPPercent_KillRace	RACE_All 15	
		SubSPconsumption 10	
		AddExtParam User VAR_HITSUCCESSVALUE 15
	return				
	event OnFinishEquip:				
		SubEXPPercent_KillRace	RACE_All 15
		AddSPconsumption 10		
		SubExtParam User VAR_HITSUCCESSVALUE 15		
	return
