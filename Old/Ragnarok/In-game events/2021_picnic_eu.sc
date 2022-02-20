// jp_event58 - last player's picnic
// jp_event59 - hat (1000) + limit of exchange


npc "prt_fild00" "#picnic_maker5001" HIDDEN_NPC 1 1 6 0 0
OnInit:
	
	var random_time = 2000000 // rand 1800000 6000000
	SetGlobalVar "time_to_picnic" random_time
	InitTimer
return

// 30 min
OnTimer: 1740000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "What a nice weather! A great time to get together and have a snack."
	endif
return

OnTimer: 1800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5001" "begin_picnic"
	endif
return
	
OnTimer: 2100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5001" "end_picnic"
	endif
return
// 40 min 
OnTimer: 2340000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "What a nice weather! A great time to get together and have a snack."
	endif
return

OnTimer: 2400000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5001" "begin_picnic"
	endif
return
	
OnTimer: 2700000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5001" "end_picnic"
	endif
return
// 50 min 
OnTimer: 2940000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "What a nice weather! A great time to get together and have a snack."
	endif
return

OnTimer: 3000000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5001" "begin_picnic"
	endif
return
	
OnTimer: 3300000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5001" "end_picnic"
	endif
return
// 60 min 
OnTimer: 3540000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "What a nice weather! A great time to get together and have a snack."
	endif
return

OnTimer: 3600000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5001" "begin_picnic"
	endif
return
	
OnTimer: 3900000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5001" "end_picnic"
	endif
return
// 70 min 
OnTimer: 4140000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "What a nice weather! A great time to get together and have a snack."
	endif
return

OnTimer: 4200000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5001" "begin_picnic"
	endif
return
	
OnTimer: 4500000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5001" "end_picnic"
	endif
return
// 80 min 
OnTimer: 4740000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "What a nice weather! A great time to get together and have a snack."
	endif
return

OnTimer: 4800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5001" "begin_picnic"
	endif
return
	
OnTimer: 5100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5001" "end_picnic"
	endif
return
// 90 min 
OnTimer: 5340000
		broadcastserver "FF0000" FW_NORMAL 10 0 0 "What a nice weather! A great time to get together and have a snack."
return

OnTimer: 5400000
		cmdothernpc "#picnic_maker5001" "begin_picnic"
return
	
OnTimer: 5700000
		cmdothernpc "#picnic_maker5001" "end_picnic"
return

OnCommand: "begin_picnic"
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "Bonfires light up and picnics begin. Hurry up to take part!"
	cmdothernpc "#picnic_maker5001" "on"
return

OnCommand: "end_picnic"
	broadcastserver "FF0000" FW_NORMAL 10 0 0 "The picnics end."
	cmdothernpc "#picnic_maker5001" "off"
	
	var picnic_count = GetGlobalVar "picnic_count"
	picnic_count = picnic_count + 1
	SetGlobalVar "picnic_count" picnic_count
	
	var random_time = 2000000 // rand 1800000 6000000
	SetGlobalVar "time_to_picnic" random_time
	stoptimer
	InitTimer
return

OnCommand: "on"
// prt_fild00 ============[ON]==============
enablenpc "Bonfire#prt_fild00"
disablenpc "Extinct Bonfire#prt_fild00"
enablenpc "#plate1_prt_fild00"
enablenpc "#plate2_prt_fild00"
enablenpc "#plate3_prt_fild00"
enablenpc "#basket_prt_fild00"
enablenpc "Sunbathing girl#prt_fild00"
enablenpc "Sitting man#prt_fild00"
enablenpc "Sitting woman#prt_fild00"
enablenpc "Wanderer#prt_fild00"
// prt_fild01 ============[ON]==============
enablenpc "Bonfire#prt_fild01"
disablenpc "Extinct Bonfire#prt_fild01"
enablenpc "#plate1_prt_fild01"
enablenpc "#plate2_prt_fild01"
enablenpc "#plate3_prt_fild01"
enablenpc "#basket_prt_fild01"
enablenpc "Sunbathing girl#prt_fild01"
enablenpc "Sitting man#prt_fild01"
enablenpc "Sitting woman#prt_fild01"
enablenpc "Wanderer#prt_fild01"
// prt_fild02 ============[ON]==============
enablenpc "Bonfire#prt_fild02"
disablenpc "Extinct Bonfire#prt_fild02"
enablenpc "#plate1_prt_fild02"
enablenpc "#plate2_prt_fild02"
enablenpc "#plate3_prt_fild02"
enablenpc "#basket_prt_fild02"
enablenpc "Sunbathing girl#prt_fild02"
enablenpc "Sitting man#prt_fild02"
enablenpc "Sitting woman#prt_fild02"
enablenpc "Wanderer#prt_fild02"
// prt_fild03 ============[ON]==============
enablenpc "Bonfire#prt_fild03"
disablenpc "Extinct Bonfire#prt_fild03"
enablenpc "#plate1_prt_fild03"
enablenpc "#plate2_prt_fild03"
enablenpc "#plate3_prt_fild03"
enablenpc "#basket_prt_fild03"
enablenpc "Sunbathing girl#prt_fild03"
enablenpc "Sitting man#prt_fild03"
enablenpc "Sitting woman#prt_fild03"
enablenpc "Wanderer#prt_fild03"
// prt_fild04 ============[ON]==============
enablenpc "Bonfire#prt_fild04"
disablenpc "Extinct Bonfire#prt_fild04"
enablenpc "#plate1_prt_fild04"
enablenpc "#plate2_prt_fild04"
enablenpc "#plate3_prt_fild04"
enablenpc "#basket_prt_fild04"
enablenpc "Sunbathing girl#prt_fild04"
enablenpc "Sitting man#prt_fild04"
enablenpc "Sitting woman#prt_fild04"
enablenpc "Wanderer#prt_fild04"
// prt_fild05 ============[ON]==============
enablenpc "Bonfire#prt_fild05"
disablenpc "Extinct Bonfire#prt_fild05"
enablenpc "#plate1_prt_fild05"
enablenpc "#plate2_prt_fild05"
enablenpc "#plate3_prt_fild05"
enablenpc "#basket_prt_fild05"
enablenpc "Sunbathing girl#prt_fild05"
enablenpc "Sitting man#prt_fild05"
enablenpc "Sitting woman#prt_fild05"
enablenpc "Wanderer#prt_fild05"
// prt_fild06 ============[ON]==============
enablenpc "Bonfire#prt_fild06"
disablenpc "Extinct Bonfire#prt_fild06"
enablenpc "#plate1_prt_fild06"
enablenpc "#plate2_prt_fild06"
enablenpc "#plate3_prt_fild06"
enablenpc "#basket_prt_fild06"
enablenpc "Sunbathing girl#prt_fild06"
enablenpc "Sitting man#prt_fild06"
enablenpc "Sitting woman#prt_fild06"
enablenpc "Wanderer#prt_fild06"
// gef_fild00 ============[ON]==============
enablenpc "Bonfire#gef_fild00"
disablenpc "Extinct Bonfire#gef_fild00"
enablenpc "#plate1_gef_fild00"
enablenpc "#plate2_gef_fild00"
enablenpc "#plate3_gef_fild00"
enablenpc "#basket_gef_fild00"
enablenpc "Sunbathing girl#gef_fild00"
enablenpc "Sitting man#gef_fild00"
enablenpc "Sitting woman#gef_fild00"
enablenpc "Wanderer#gef_fild00"
// gef_fild01 ============[ON]==============
enablenpc "Bonfire#gef_fild01"
disablenpc "Extinct Bonfire#gef_fild01"
enablenpc "#plate1_gef_fild01"
enablenpc "#plate2_gef_fild01"
enablenpc "#plate3_gef_fild01"
enablenpc "#basket_gef_fild01"
enablenpc "Sunbathing girl#gef_fild01"
enablenpc "Sitting man#gef_fild01"
enablenpc "Sitting woman#gef_fild01"
enablenpc "Wanderer#gef_fild01"
// gef_fild02 ============[ON]==============
enablenpc "Bonfire#gef_fild02"
disablenpc "Extinct Bonfire#gef_fild02"
enablenpc "#plate1_gef_fild02"
enablenpc "#plate2_gef_fild02"
enablenpc "#plate3_gef_fild02"
enablenpc "#basket_gef_fild02"
enablenpc "Sunbathing girl#gef_fild02"
enablenpc "Sitting man#gef_fild02"
enablenpc "Sitting woman#gef_fild02"
enablenpc "Wanderer#gef_fild02"
// gef_fild03 ============[ON]==============
enablenpc "Bonfire#gef_fild03"
disablenpc "Extinct Bonfire#gef_fild03"
enablenpc "#plate1_gef_fild03"
enablenpc "#plate2_gef_fild03"
enablenpc "#plate3_gef_fild03"
enablenpc "#basket_gef_fild03"
enablenpc "Sunbathing girl#gef_fild03"
enablenpc "Sitting man#gef_fild03"
enablenpc "Sitting woman#gef_fild03"
enablenpc "Wanderer#gef_fild03"
// gef_fild04 ============[ON]==============
enablenpc "Bonfire#gef_fild04"
disablenpc "Extinct Bonfire#gef_fild04"
enablenpc "#plate1_gef_fild04"
enablenpc "#plate2_gef_fild04"
enablenpc "#plate3_gef_fild04"
enablenpc "#basket_gef_fild04"
enablenpc "Sunbathing girl#gef_fild04"
enablenpc "Sitting man#gef_fild04"
enablenpc "Sitting woman#gef_fild04"
enablenpc "Wanderer#gef_fild04"
// gef_fild05 ============[ON]==============
enablenpc "Bonfire#gef_fild05"
disablenpc "Extinct Bonfire#gef_fild05"
enablenpc "#plate1_gef_fild05"
enablenpc "#plate2_gef_fild05"
enablenpc "#plate3_gef_fild05"
enablenpc "#basket_gef_fild05"
enablenpc "Sunbathing girl#gef_fild05"
enablenpc "Sitting man#gef_fild05"
enablenpc "Sitting woman#gef_fild05"
enablenpc "Wanderer#gef_fild05"
// gef_fild06 ============[ON]==============
enablenpc "Bonfire#gef_fild06"
disablenpc "Extinct Bonfire#gef_fild06"
enablenpc "#plate1_gef_fild06"
enablenpc "#plate2_gef_fild06"
enablenpc "#plate3_gef_fild06"
enablenpc "#basket_gef_fild06"
enablenpc "Sunbathing girl#gef_fild06"
enablenpc "Sitting man#gef_fild06"
enablenpc "Sitting woman#gef_fild06"
enablenpc "Wanderer#gef_fild06"
// gef_fild07 ============[ON]==============
enablenpc "Bonfire#gef_fild07"
disablenpc "Extinct Bonfire#gef_fild07"
enablenpc "#plate1_gef_fild07"
enablenpc "#plate2_gef_fild07"
enablenpc "#plate3_gef_fild07"
enablenpc "#basket_gef_fild07"
enablenpc "Sunbathing girl#gef_fild07"
enablenpc "Sitting man#gef_fild07"
enablenpc "Sitting woman#gef_fild07"
enablenpc "Wanderer#gef_fild07"
// gef_fild08 ============[ON]==============
enablenpc "Bonfire#gef_fild08"
disablenpc "Extinct Bonfire#gef_fild08"
enablenpc "#plate1_gef_fild08"
enablenpc "#plate2_gef_fild08"
enablenpc "#plate3_gef_fild08"
enablenpc "#basket_gef_fild08"
enablenpc "Sunbathing girl#gef_fild08"
enablenpc "Sitting man#gef_fild08"
enablenpc "Sitting woman#gef_fild08"
enablenpc "Wanderer#gef_fild08"
// gef_fild09 ============[ON]==============
enablenpc "Bonfire#gef_fild09"
disablenpc "Extinct Bonfire#gef_fild09"
enablenpc "#plate1_gef_fild09"
enablenpc "#plate2_gef_fild09"
enablenpc "#plate3_gef_fild09"
enablenpc "#basket_gef_fild09"
enablenpc "Sunbathing girl#gef_fild09"
enablenpc "Sitting man#gef_fild09"
enablenpc "Sitting woman#gef_fild09"
enablenpc "Wanderer#gef_fild09"
// gef_fild10 ============[ON]==============
enablenpc "Bonfire#gef_fild10"
disablenpc "Extinct Bonfire#gef_fild10"
enablenpc "#plate1_gef_fild10"
enablenpc "#plate2_gef_fild10"
enablenpc "#plate3_gef_fild10"
enablenpc "#basket_gef_fild10"
enablenpc "Sunbathing girl#gef_fild10"
enablenpc "Sitting man#gef_fild10"
enablenpc "Sitting woman#gef_fild10"
enablenpc "Wanderer#gef_fild10"
// gef_fild11 ============[ON]==============
enablenpc "Bonfire#gef_fild11"
disablenpc "Extinct Bonfire#gef_fild11"
enablenpc "#plate1_gef_fild11"
enablenpc "#plate2_gef_fild11"
enablenpc "#plate3_gef_fild11"
enablenpc "#basket_gef_fild11"
enablenpc "Sunbathing girl#gef_fild11"
enablenpc "Sitting man#gef_fild11"
enablenpc "Sitting woman#gef_fild11"
enablenpc "Wanderer#gef_fild11"
// gef_fild12 ============[ON]==============
enablenpc "Bonfire#gef_fild12"
disablenpc "Extinct Bonfire#gef_fild12"
enablenpc "#plate1_gef_fild12"
enablenpc "#plate2_gef_fild12"
enablenpc "#plate3_gef_fild12"
enablenpc "#basket_gef_fild12"
enablenpc "Sunbathing girl#gef_fild12"
enablenpc "Sitting man#gef_fild12"
enablenpc "Sitting woman#gef_fild12"
enablenpc "Wanderer#gef_fild12"
// gef_fild14 ============[ON]==============
enablenpc "Bonfire#gef_fild14"
disablenpc "Extinct Bonfire#gef_fild14"
enablenpc "#plate1_gef_fild14"
enablenpc "#plate2_gef_fild14"
enablenpc "#plate3_gef_fild14"
enablenpc "#basket_gef_fild14"
enablenpc "Sunbathing girl#gef_fild14"
enablenpc "Sitting man#gef_fild14"
enablenpc "Sitting woman#gef_fild14"
enablenpc "Wanderer#gef_fild14"
return

OnCommand: "off"
// prt_fild00 ============[OFF]==============
disablenpc "Bonfire#prt_fild00"
enablenpc "Extinct Bonfire#prt_fild00"
disablenpc "#plate1_prt_fild00"
disablenpc "#plate2_prt_fild00"
disablenpc "#plate3_prt_fild00"
disablenpc "#basket_prt_fild00"
disablenpc "Sunbathing girl#prt_fild00"
disablenpc "Sitting man#prt_fild00"
disablenpc "Sitting woman#prt_fild00"
disablenpc "Wanderer#prt_fild00"
// prt_fild01 ============[OFF]==============
disablenpc "Bonfire#prt_fild01"
enablenpc "Extinct Bonfire#prt_fild01"
disablenpc "#plate1_prt_fild01"
disablenpc "#plate2_prt_fild01"
disablenpc "#plate3_prt_fild01"
disablenpc "#basket_prt_fild01"
disablenpc "Sunbathing girl#prt_fild01"
disablenpc "Sitting man#prt_fild01"
disablenpc "Sitting woman#prt_fild01"
disablenpc "Wanderer#prt_fild01"
// prt_fild02 ============[OFF]==============
disablenpc "Bonfire#prt_fild02"
enablenpc "Extinct Bonfire#prt_fild02"
disablenpc "#plate1_prt_fild02"
disablenpc "#plate2_prt_fild02"
disablenpc "#plate3_prt_fild02"
disablenpc "#basket_prt_fild02"
disablenpc "Sunbathing girl#prt_fild02"
disablenpc "Sitting man#prt_fild02"
disablenpc "Sitting woman#prt_fild02"
disablenpc "Wanderer#prt_fild02"
// prt_fild03 ============[OFF]==============
disablenpc "Bonfire#prt_fild03"
enablenpc "Extinct Bonfire#prt_fild03"
disablenpc "#plate1_prt_fild03"
disablenpc "#plate2_prt_fild03"
disablenpc "#plate3_prt_fild03"
disablenpc "#basket_prt_fild03"
disablenpc "Sunbathing girl#prt_fild03"
disablenpc "Sitting man#prt_fild03"
disablenpc "Sitting woman#prt_fild03"
disablenpc "Wanderer#prt_fild03"
// prt_fild04 ============[OFF]==============
disablenpc "Bonfire#prt_fild04"
enablenpc "Extinct Bonfire#prt_fild04"
disablenpc "#plate1_prt_fild04"
disablenpc "#plate2_prt_fild04"
disablenpc "#plate3_prt_fild04"
disablenpc "#basket_prt_fild04"
disablenpc "Sunbathing girl#prt_fild04"
disablenpc "Sitting man#prt_fild04"
disablenpc "Sitting woman#prt_fild04"
disablenpc "Wanderer#prt_fild04"
// prt_fild05 ============[OFF]==============
disablenpc "Bonfire#prt_fild05"
enablenpc "Extinct Bonfire#prt_fild05"
disablenpc "#plate1_prt_fild05"
disablenpc "#plate2_prt_fild05"
disablenpc "#plate3_prt_fild05"
disablenpc "#basket_prt_fild05"
disablenpc "Sunbathing girl#prt_fild05"
disablenpc "Sitting man#prt_fild05"
disablenpc "Sitting woman#prt_fild05"
disablenpc "Wanderer#prt_fild05"
// prt_fild06 ============[OFF]==============
disablenpc "Bonfire#prt_fild06"
enablenpc "Extinct Bonfire#prt_fild06"
disablenpc "#plate1_prt_fild06"
disablenpc "#plate2_prt_fild06"
disablenpc "#plate3_prt_fild06"
disablenpc "#basket_prt_fild06"
disablenpc "Sunbathing girl#prt_fild06"
disablenpc "Sitting man#prt_fild06"
disablenpc "Sitting woman#prt_fild06"
disablenpc "Wanderer#prt_fild06"
// gef_fild00 ============[OFF]==============
disablenpc "Bonfire#gef_fild00"
enablenpc "Extinct Bonfire#gef_fild00"
disablenpc "#plate1_gef_fild00"
disablenpc "#plate2_gef_fild00"
disablenpc "#plate3_gef_fild00"
disablenpc "#basket_gef_fild00"
disablenpc "Sunbathing girl#gef_fild00"
disablenpc "Sitting man#gef_fild00"
disablenpc "Sitting woman#gef_fild00"
disablenpc "Wanderer#gef_fild00"
// gef_fild01 ============[OFF]==============
disablenpc "Bonfire#gef_fild01"
enablenpc "Extinct Bonfire#gef_fild01"
disablenpc "#plate1_gef_fild01"
disablenpc "#plate2_gef_fild01"
disablenpc "#plate3_gef_fild01"
disablenpc "#basket_gef_fild01"
disablenpc "Sunbathing girl#gef_fild01"
disablenpc "Sitting man#gef_fild01"
disablenpc "Sitting woman#gef_fild01"
disablenpc "Wanderer#gef_fild01"
// gef_fild02 ============[OFF]==============
disablenpc "Bonfire#gef_fild02"
enablenpc "Extinct Bonfire#gef_fild02"
disablenpc "#plate1_gef_fild02"
disablenpc "#plate2_gef_fild02"
disablenpc "#plate3_gef_fild02"
disablenpc "#basket_gef_fild02"
disablenpc "Sunbathing girl#gef_fild02"
disablenpc "Sitting man#gef_fild02"
disablenpc "Sitting woman#gef_fild02"
disablenpc "Wanderer#gef_fild02"
// gef_fild03 ============[OFF]==============
disablenpc "Bonfire#gef_fild03"
enablenpc "Extinct Bonfire#gef_fild03"
disablenpc "#plate1_gef_fild03"
disablenpc "#plate2_gef_fild03"
disablenpc "#plate3_gef_fild03"
disablenpc "#basket_gef_fild03"
disablenpc "Sunbathing girl#gef_fild03"
disablenpc "Sitting man#gef_fild03"
disablenpc "Sitting woman#gef_fild03"
disablenpc "Wanderer#gef_fild03"
// gef_fild04 ============[OFF]==============
disablenpc "Bonfire#gef_fild04"
enablenpc "Extinct Bonfire#gef_fild04"
disablenpc "#plate1_gef_fild04"
disablenpc "#plate2_gef_fild04"
disablenpc "#plate3_gef_fild04"
disablenpc "#basket_gef_fild04"
disablenpc "Sunbathing girl#gef_fild04"
disablenpc "Sitting man#gef_fild04"
disablenpc "Sitting woman#gef_fild04"
disablenpc "Wanderer#gef_fild04"
// gef_fild05 ============[OFF]==============
disablenpc "Bonfire#gef_fild05"
enablenpc "Extinct Bonfire#gef_fild05"
disablenpc "#plate1_gef_fild05"
disablenpc "#plate2_gef_fild05"
disablenpc "#plate3_gef_fild05"
disablenpc "#basket_gef_fild05"
disablenpc "Sunbathing girl#gef_fild05"
disablenpc "Sitting man#gef_fild05"
disablenpc "Sitting woman#gef_fild05"
disablenpc "Wanderer#gef_fild05"
// gef_fild06 ============[OFF]==============
disablenpc "Bonfire#gef_fild06"
enablenpc "Extinct Bonfire#gef_fild06"
disablenpc "#plate1_gef_fild06"
disablenpc "#plate2_gef_fild06"
disablenpc "#plate3_gef_fild06"
disablenpc "#basket_gef_fild06"
disablenpc "Sunbathing girl#gef_fild06"
disablenpc "Sitting man#gef_fild06"
disablenpc "Sitting woman#gef_fild06"
disablenpc "Wanderer#gef_fild06"
// gef_fild07 ============[OFF]==============
disablenpc "Bonfire#gef_fild07"
enablenpc "Extinct Bonfire#gef_fild07"
disablenpc "#plate1_gef_fild07"
disablenpc "#plate2_gef_fild07"
disablenpc "#plate3_gef_fild07"
disablenpc "#basket_gef_fild07"
disablenpc "Sunbathing girl#gef_fild07"
disablenpc "Sitting man#gef_fild07"
disablenpc "Sitting woman#gef_fild07"
disablenpc "Wanderer#gef_fild07"
// gef_fild08 ============[OFF]==============
disablenpc "Bonfire#gef_fild08"
enablenpc "Extinct Bonfire#gef_fild08"
disablenpc "#plate1_gef_fild08"
disablenpc "#plate2_gef_fild08"
disablenpc "#plate3_gef_fild08"
disablenpc "#basket_gef_fild08"
disablenpc "Sunbathing girl#gef_fild08"
disablenpc "Sitting man#gef_fild08"
disablenpc "Sitting woman#gef_fild08"
disablenpc "Wanderer#gef_fild08"
// gef_fild09 ============[OFF]==============
disablenpc "Bonfire#gef_fild09"
enablenpc "Extinct Bonfire#gef_fild09"
disablenpc "#plate1_gef_fild09"
disablenpc "#plate2_gef_fild09"
disablenpc "#plate3_gef_fild09"
disablenpc "#basket_gef_fild09"
disablenpc "Sunbathing girl#gef_fild09"
disablenpc "Sitting man#gef_fild09"
disablenpc "Sitting woman#gef_fild09"
disablenpc "Wanderer#gef_fild09"
// gef_fild10 ============[OFF]==============
disablenpc "Bonfire#gef_fild10"
enablenpc "Extinct Bonfire#gef_fild10"
disablenpc "#plate1_gef_fild10"
disablenpc "#plate2_gef_fild10"
disablenpc "#plate3_gef_fild10"
disablenpc "#basket_gef_fild10"
disablenpc "Sunbathing girl#gef_fild10"
disablenpc "Sitting man#gef_fild10"
disablenpc "Sitting woman#gef_fild10"
disablenpc "Wanderer#gef_fild10"
// gef_fild11 ============[OFF]==============
disablenpc "Bonfire#gef_fild11"
enablenpc "Extinct Bonfire#gef_fild11"
disablenpc "#plate1_gef_fild11"
disablenpc "#plate2_gef_fild11"
disablenpc "#plate3_gef_fild11"
disablenpc "#basket_gef_fild11"
disablenpc "Sunbathing girl#gef_fild11"
disablenpc "Sitting man#gef_fild11"
disablenpc "Sitting woman#gef_fild11"
disablenpc "Wanderer#gef_fild11"
// gef_fild12 ============[OFF]==============
disablenpc "Bonfire#gef_fild12"
enablenpc "Extinct Bonfire#gef_fild12"
disablenpc "#plate1_gef_fild12"
disablenpc "#plate2_gef_fild12"
disablenpc "#plate3_gef_fild12"
disablenpc "#basket_gef_fild12"
disablenpc "Sunbathing girl#gef_fild12"
disablenpc "Sitting man#gef_fild12"
disablenpc "Sitting woman#gef_fild12"
disablenpc "Wanderer#gef_fild12"
// gef_fild14 ============[OFF]==============
disablenpc "Bonfire#gef_fild14"
enablenpc "Extinct Bonfire#gef_fild14"
disablenpc "#plate1_gef_fild14"
disablenpc "#plate2_gef_fild14"
disablenpc "#plate3_gef_fild14"
disablenpc "#basket_gef_fild14"
disablenpc "Sunbathing girl#gef_fild14"
disablenpc "Sitting man#gef_fild14"
disablenpc "Sitting woman#gef_fild14"
disablenpc "Wanderer#gef_fild14"
return


npc "moc_fild02" "#picnic_maker5003" HIDDEN_NPC 1 1 6 0 0
OnInit:
	InitTimer
return

// 30 min
// OnTimer: 1740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if (time_to_picnic < 2400000)
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 1800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5003" "begin_picnic"
	endif
return
	
OnTimer: 2100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5003" "end_picnic"
	endif
return
// 40 min 
// OnTimer: 2340000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 2400000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5003" "begin_picnic"
	endif
return
	
OnTimer: 2700000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5003" "end_picnic"
	endif
return
// 50 min 
// OnTimer: 2940000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3000000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5003" "begin_picnic"
	endif
return
	
OnTimer: 3300000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5003" "end_picnic"
	endif
return
// 60 min 
// OnTimer: 3540000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3600000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5003" "begin_picnic"
	endif
return
	
OnTimer: 3900000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5003" "end_picnic"
	endif
return
// 70 min 
// OnTimer: 4140000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4200000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5003" "begin_picnic"
	endif
return
	
OnTimer: 4500000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5003" "end_picnic"
	endif
return
// 80 min 
// OnTimer: 4740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5003" "begin_picnic"
	endif
return
	
OnTimer: 5100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5003" "end_picnic"
	endif
return
// 90 min 
// OnTimer: 5340000
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
// return

OnTimer: 5400000
		cmdothernpc "#picnic_maker5003" "begin_picnic"
return
	
OnTimer: 5700000
		cmdothernpc "#picnic_maker5003" "end_picnic"
return

OnCommand: "begin_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics! "
	cmdothernpc "#picnic_maker5003" "on"
return

OnCommand: "end_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics are over! "
	cmdothernpc "#picnic_maker5003" "off"
	
	stoptimer
	InitTimer
return

OnCommand: "on"
// moc_fild02 ============[ON]==============
enablenpc "Bonfire#moc_fild02"
disablenpc "Extinct Bonfire#moc_fild02"
enablenpc "#plate1_moc_fild02"
enablenpc "#plate2_moc_fild02"
enablenpc "#plate3_moc_fild02"
enablenpc "#basket_moc_fild02"
enablenpc "Sunbathing girl#moc_fild02"
enablenpc "Sitting man#moc_fild02"
enablenpc "Sitting woman#moc_fild02"
enablenpc "Wanderer#moc_fild02"
// moc_fild03 ============[ON]==============
enablenpc "Bonfire#moc_fild03"
disablenpc "Extinct Bonfire#moc_fild03"
enablenpc "#plate1_moc_fild03"
enablenpc "#plate2_moc_fild03"
enablenpc "#plate3_moc_fild03"
enablenpc "#basket_moc_fild03"
enablenpc "Sunbathing girl#moc_fild03"
enablenpc "Sitting man#moc_fild03"
enablenpc "Sitting woman#moc_fild03"
enablenpc "Wanderer#moc_fild03"
// moc_fild13 ============[ON]==============
enablenpc "Bonfire#moc_fild13"
disablenpc "Extinct Bonfire#moc_fild13"
enablenpc "#plate1_moc_fild13"
enablenpc "#plate2_moc_fild13"
enablenpc "#plate3_moc_fild13"
enablenpc "#basket_moc_fild13"
enablenpc "Sunbathing girl#moc_fild13"
enablenpc "Sitting man#moc_fild13"
enablenpc "Sitting woman#moc_fild13"
enablenpc "Wanderer#moc_fild13"
// pay_fild06 ============[ON]==============
enablenpc "Bonfire#pay_fild06"
disablenpc "Extinct Bonfire#pay_fild06"
enablenpc "#plate1_pay_fild06"
enablenpc "#plate2_pay_fild06"
enablenpc "#plate3_pay_fild06"
enablenpc "#basket_pay_fild06"
enablenpc "Sunbathing girl#pay_fild06"
enablenpc "Sitting man#pay_fild06"
enablenpc "Sitting woman#pay_fild06"
enablenpc "Wanderer#pay_fild06"
// pay_fild03 ============[ON]==============
enablenpc "Bonfire#pay_fild03"
disablenpc "Extinct Bonfire#pay_fild03"
enablenpc "#plate1_pay_fild03"
enablenpc "#plate2_pay_fild03"
enablenpc "#plate3_pay_fild03"
enablenpc "#basket_pay_fild03"
enablenpc "Sunbathing girl#pay_fild03"
enablenpc "Sitting man#pay_fild03"
enablenpc "Sitting woman#pay_fild03"
enablenpc "Wanderer#pay_fild03"
// pay_fild02 ============[ON]==============
enablenpc "Bonfire#pay_fild02"
disablenpc "Extinct Bonfire#pay_fild02"
enablenpc "#plate1_pay_fild02"
enablenpc "#plate2_pay_fild02"
enablenpc "#plate3_pay_fild02"
enablenpc "#basket_pay_fild02"
enablenpc "Sunbathing girl#pay_fild02"
enablenpc "Sitting man#pay_fild02"
enablenpc "Sitting woman#pay_fild02"
enablenpc "Wanderer#pay_fild02"
// pay_fild01 ============[ON]==============
enablenpc "Bonfire#pay_fild01"
disablenpc "Extinct Bonfire#pay_fild01"
enablenpc "#plate1_pay_fild01"
enablenpc "#plate2_pay_fild01"
enablenpc "#plate3_pay_fild01"
enablenpc "#basket_pay_fild01"
enablenpc "Sunbathing girl#pay_fild01"
enablenpc "Sitting man#pay_fild01"
enablenpc "Sitting woman#pay_fild01"
enablenpc "Wanderer#pay_fild01"
// pay_fild07 ============[ON]==============
enablenpc "Bonfire#pay_fild07"
disablenpc "Extinct Bonfire#pay_fild07"
enablenpc "#plate1_pay_fild07"
enablenpc "#plate2_pay_fild07"
enablenpc "#plate3_pay_fild07"
enablenpc "#basket_pay_fild07"
enablenpc "Sunbathing girl#pay_fild07"
enablenpc "Sitting man#pay_fild07"
enablenpc "Sitting woman#pay_fild07"
enablenpc "Wanderer#pay_fild07"
// pay_fild10 ============[ON]==============
enablenpc "Bonfire#pay_fild10"
disablenpc "Extinct Bonfire#pay_fild10"
enablenpc "#plate1_pay_fild10"
enablenpc "#plate2_pay_fild10"
enablenpc "#plate3_pay_fild10"
enablenpc "#basket_pay_fild10"
enablenpc "Sunbathing girl#pay_fild10"
enablenpc "Sitting man#pay_fild10"
enablenpc "Sitting woman#pay_fild10"
enablenpc "Wanderer#pay_fild10"
// pay_fild09 ============[ON]==============
enablenpc "Bonfire#pay_fild09"
disablenpc "Extinct Bonfire#pay_fild09"
enablenpc "#plate1_pay_fild09"
enablenpc "#plate2_pay_fild09"
enablenpc "#plate3_pay_fild09"
enablenpc "#basket_pay_fild09"
enablenpc "Sunbathing girl#pay_fild09"
enablenpc "Sitting man#pay_fild09"
enablenpc "Sitting woman#pay_fild09"
enablenpc "Wanderer#pay_fild09"
// pay_fild04 ============[ON]==============
enablenpc "Bonfire#pay_fild04"
disablenpc "Extinct Bonfire#pay_fild04"
enablenpc "#plate1_pay_fild04"
enablenpc "#plate2_pay_fild04"
enablenpc "#plate3_pay_fild04"
enablenpc "#basket_pay_fild04"
enablenpc "Sunbathing girl#pay_fild04"
enablenpc "Sitting man#pay_fild04"
enablenpc "Sitting woman#pay_fild04"
enablenpc "Wanderer#pay_fild04"
// pay_fild05 ============[ON]==============
enablenpc "Bonfire#pay_fild05"
disablenpc "Extinct Bonfire#pay_fild05"
enablenpc "#plate1_pay_fild05"
enablenpc "#plate2_pay_fild05"
enablenpc "#plate3_pay_fild05"
enablenpc "#basket_pay_fild05"
enablenpc "Sunbathing girl#pay_fild05"
enablenpc "Sitting man#pay_fild05"
enablenpc "Sitting woman#pay_fild05"
enablenpc "Wanderer#pay_fild05"
// pay_fild08 ============[ON]==============
enablenpc "Bonfire#pay_fild08"
disablenpc "Extinct Bonfire#pay_fild08"
enablenpc "#plate1_pay_fild08"
enablenpc "#plate2_pay_fild08"
enablenpc "#plate3_pay_fild08"
enablenpc "#basket_pay_fild08"
enablenpc "Sunbathing girl#pay_fild08"
enablenpc "Sitting man#pay_fild08"
enablenpc "Sitting woman#pay_fild08"
enablenpc "Wanderer#pay_fild08"
// pay_fild11 ============[ON]==============
enablenpc "Bonfire#pay_fild11"
disablenpc "Extinct Bonfire#pay_fild11"
enablenpc "#plate1_pay_fild11"
enablenpc "#plate2_pay_fild11"
enablenpc "#plate3_pay_fild11"
enablenpc "#basket_pay_fild11"
enablenpc "Sunbathing girl#pay_fild11"
enablenpc "Sitting man#pay_fild11"
enablenpc "Sitting woman#pay_fild11"
enablenpc "Wanderer#pay_fild11"
// hu_fild01 ============[ON]==============
enablenpc "Bonfire#hu_fild01"
disablenpc "Extinct Bonfire#hu_fild01"
enablenpc "#plate1_hu_fild01"
enablenpc "#plate2_hu_fild01"
enablenpc "#plate3_hu_fild01"
enablenpc "#basket_hu_fild01"
enablenpc "Sunbathing girl#hu_fild01"
enablenpc "Sitting man#hu_fild01"
enablenpc "Sitting woman#hu_fild01"
enablenpc "Wanderer#hu_fild01"
// hu_fild02 ============[ON]==============
enablenpc "Bonfire#hu_fild02"
disablenpc "Extinct Bonfire#hu_fild02"
enablenpc "#plate1_hu_fild02"
enablenpc "#plate2_hu_fild02"
enablenpc "#plate3_hu_fild02"
enablenpc "#basket_hu_fild02"
enablenpc "Sunbathing girl#hu_fild02"
enablenpc "Sitting man#hu_fild02"
enablenpc "Sitting woman#hu_fild02"
enablenpc "Wanderer#hu_fild02"
// hu_fild03 ============[ON]==============
enablenpc "Bonfire#hu_fild03"
disablenpc "Extinct Bonfire#hu_fild03"
enablenpc "#plate1_hu_fild03"
enablenpc "#plate2_hu_fild03"
enablenpc "#plate3_hu_fild03"
enablenpc "#basket_hu_fild03"
enablenpc "Sunbathing girl#hu_fild03"
enablenpc "Sitting man#hu_fild03"
enablenpc "Sitting woman#hu_fild03"
enablenpc "Wanderer#hu_fild03"
// hu_fild04 ============[ON]==============
enablenpc "Bonfire#hu_fild04"
disablenpc "Extinct Bonfire#hu_fild04"
enablenpc "#plate1_hu_fild04"
enablenpc "#plate2_hu_fild04"
enablenpc "#plate3_hu_fild04"
enablenpc "#basket_hu_fild04"
enablenpc "Sunbathing girl#hu_fild04"
enablenpc "Sitting man#hu_fild04"
enablenpc "Sitting woman#hu_fild04"
enablenpc "Wanderer#hu_fild04"
// hu_fild05 ============[ON]==============
enablenpc "Bonfire#hu_fild05"
disablenpc "Extinct Bonfire#hu_fild05"
enablenpc "#plate1_hu_fild05"
enablenpc "#plate2_hu_fild05"
enablenpc "#plate3_hu_fild05"
enablenpc "#basket_hu_fild05"
enablenpc "Sunbathing girl#hu_fild05"
enablenpc "Sitting man#hu_fild05"
enablenpc "Sitting woman#hu_fild05"
enablenpc "Wanderer#hu_fild05"
// hu_fild06 ============[ON]==============
enablenpc "Bonfire#hu_fild06"
disablenpc "Extinct Bonfire#hu_fild06"
enablenpc "#plate1_hu_fild06"
enablenpc "#plate2_hu_fild06"
enablenpc "#plate3_hu_fild06"
enablenpc "#basket_hu_fild06"
enablenpc "Sunbathing girl#hu_fild06"
enablenpc "Sitting man#hu_fild06"
enablenpc "Sitting woman#hu_fild06"
enablenpc "Wanderer#hu_fild06"
return

OnCommand: "off"
// moc_fild02 ============[OFF]==============
disablenpc "Bonfire#moc_fild02"
enablenpc "Extinct Bonfire#moc_fild02"
disablenpc "#plate1_moc_fild02"
disablenpc "#plate2_moc_fild02"
disablenpc "#plate3_moc_fild02"
disablenpc "#basket_moc_fild02"
disablenpc "Sunbathing girl#moc_fild02"
disablenpc "Sitting man#moc_fild02"
disablenpc "Sitting woman#moc_fild02"
disablenpc "Wanderer#moc_fild02"
// moc_fild03 ============[OFF]==============
disablenpc "Bonfire#moc_fild03"
enablenpc "Extinct Bonfire#moc_fild03"
disablenpc "#plate1_moc_fild03"
disablenpc "#plate2_moc_fild03"
disablenpc "#plate3_moc_fild03"
disablenpc "#basket_moc_fild03"
disablenpc "Sunbathing girl#moc_fild03"
disablenpc "Sitting man#moc_fild03"
disablenpc "Sitting woman#moc_fild03"
disablenpc "Wanderer#moc_fild03"
// moc_fild13 ============[OFF]==============
disablenpc "Bonfire#moc_fild13"
enablenpc "Extinct Bonfire#moc_fild13"
disablenpc "#plate1_moc_fild13"
disablenpc "#plate2_moc_fild13"
disablenpc "#plate3_moc_fild13"
disablenpc "#basket_moc_fild13"
disablenpc "Sunbathing girl#moc_fild13"
disablenpc "Sitting man#moc_fild13"
disablenpc "Sitting woman#moc_fild13"
disablenpc "Wanderer#moc_fild13"
// pay_fild06 ============[OFF]==============
disablenpc "Bonfire#pay_fild06"
enablenpc "Extinct Bonfire#pay_fild06"
disablenpc "#plate1_pay_fild06"
disablenpc "#plate2_pay_fild06"
disablenpc "#plate3_pay_fild06"
disablenpc "#basket_pay_fild06"
disablenpc "Sunbathing girl#pay_fild06"
disablenpc "Sitting man#pay_fild06"
disablenpc "Sitting woman#pay_fild06"
disablenpc "Wanderer#pay_fild06"
// pay_fild03 ============[OFF]==============
disablenpc "Bonfire#pay_fild03"
enablenpc "Extinct Bonfire#pay_fild03"
disablenpc "#plate1_pay_fild03"
disablenpc "#plate2_pay_fild03"
disablenpc "#plate3_pay_fild03"
disablenpc "#basket_pay_fild03"
disablenpc "Sunbathing girl#pay_fild03"
disablenpc "Sitting man#pay_fild03"
disablenpc "Sitting woman#pay_fild03"
disablenpc "Wanderer#pay_fild03"
// pay_fild02 ============[OFF]==============
disablenpc "Bonfire#pay_fild02"
enablenpc "Extinct Bonfire#pay_fild02"
disablenpc "#plate1_pay_fild02"
disablenpc "#plate2_pay_fild02"
disablenpc "#plate3_pay_fild02"
disablenpc "#basket_pay_fild02"
disablenpc "Sunbathing girl#pay_fild02"
disablenpc "Sitting man#pay_fild02"
disablenpc "Sitting woman#pay_fild02"
disablenpc "Wanderer#pay_fild02"
// pay_fild01 ============[OFF]==============
disablenpc "Bonfire#pay_fild01"
enablenpc "Extinct Bonfire#pay_fild01"
disablenpc "#plate1_pay_fild01"
disablenpc "#plate2_pay_fild01"
disablenpc "#plate3_pay_fild01"
disablenpc "#basket_pay_fild01"
disablenpc "Sunbathing girl#pay_fild01"
disablenpc "Sitting man#pay_fild01"
disablenpc "Sitting woman#pay_fild01"
disablenpc "Wanderer#pay_fild01"
// pay_fild07 ============[OFF]==============
disablenpc "Bonfire#pay_fild07"
enablenpc "Extinct Bonfire#pay_fild07"
disablenpc "#plate1_pay_fild07"
disablenpc "#plate2_pay_fild07"
disablenpc "#plate3_pay_fild07"
disablenpc "#basket_pay_fild07"
disablenpc "Sunbathing girl#pay_fild07"
disablenpc "Sitting man#pay_fild07"
disablenpc "Sitting woman#pay_fild07"
disablenpc "Wanderer#pay_fild07"
// pay_fild10 ============[OFF]==============
disablenpc "Bonfire#pay_fild10"
enablenpc "Extinct Bonfire#pay_fild10"
disablenpc "#plate1_pay_fild10"
disablenpc "#plate2_pay_fild10"
disablenpc "#plate3_pay_fild10"
disablenpc "#basket_pay_fild10"
disablenpc "Sunbathing girl#pay_fild10"
disablenpc "Sitting man#pay_fild10"
disablenpc "Sitting woman#pay_fild10"
disablenpc "Wanderer#pay_fild10"
// pay_fild09 ============[OFF]==============
disablenpc "Bonfire#pay_fild09"
enablenpc "Extinct Bonfire#pay_fild09"
disablenpc "#plate1_pay_fild09"
disablenpc "#plate2_pay_fild09"
disablenpc "#plate3_pay_fild09"
disablenpc "#basket_pay_fild09"
disablenpc "Sunbathing girl#pay_fild09"
disablenpc "Sitting man#pay_fild09"
disablenpc "Sitting woman#pay_fild09"
disablenpc "Wanderer#pay_fild09"
// pay_fild04 ============[OFF]==============
disablenpc "Bonfire#pay_fild04"
enablenpc "Extinct Bonfire#pay_fild04"
disablenpc "#plate1_pay_fild04"
disablenpc "#plate2_pay_fild04"
disablenpc "#plate3_pay_fild04"
disablenpc "#basket_pay_fild04"
disablenpc "Sunbathing girl#pay_fild04"
disablenpc "Sitting man#pay_fild04"
disablenpc "Sitting woman#pay_fild04"
disablenpc "Wanderer#pay_fild04"
// pay_fild05 ============[OFF]==============
disablenpc "Bonfire#pay_fild05"
enablenpc "Extinct Bonfire#pay_fild05"
disablenpc "#plate1_pay_fild05"
disablenpc "#plate2_pay_fild05"
disablenpc "#plate3_pay_fild05"
disablenpc "#basket_pay_fild05"
disablenpc "Sunbathing girl#pay_fild05"
disablenpc "Sitting man#pay_fild05"
disablenpc "Sitting woman#pay_fild05"
disablenpc "Wanderer#pay_fild05"
// pay_fild08 ============[OFF]==============
disablenpc "Bonfire#pay_fild08"
enablenpc "Extinct Bonfire#pay_fild08"
disablenpc "#plate1_pay_fild08"
disablenpc "#plate2_pay_fild08"
disablenpc "#plate3_pay_fild08"
disablenpc "#basket_pay_fild08"
disablenpc "Sunbathing girl#pay_fild08"
disablenpc "Sitting man#pay_fild08"
disablenpc "Sitting woman#pay_fild08"
disablenpc "Wanderer#pay_fild08"
// pay_fild11 ============[OFF]==============
disablenpc "Bonfire#pay_fild11"
enablenpc "Extinct Bonfire#pay_fild11"
disablenpc "#plate1_pay_fild11"
disablenpc "#plate2_pay_fild11"
disablenpc "#plate3_pay_fild11"
disablenpc "#basket_pay_fild11"
disablenpc "Sunbathing girl#pay_fild11"
disablenpc "Sitting man#pay_fild11"
disablenpc "Sitting woman#pay_fild11"
disablenpc "Wanderer#pay_fild11"
// hu_fild01 ============[OFF]==============
disablenpc "Bonfire#hu_fild01"
enablenpc "Extinct Bonfire#hu_fild01"
disablenpc "#plate1_hu_fild01"
disablenpc "#plate2_hu_fild01"
disablenpc "#plate3_hu_fild01"
disablenpc "#basket_hu_fild01"
disablenpc "Sunbathing girl#hu_fild01"
disablenpc "Sitting man#hu_fild01"
disablenpc "Sitting woman#hu_fild01"
disablenpc "Wanderer#hu_fild01"
// hu_fild02 ============[OFF]==============
disablenpc "Bonfire#hu_fild02"
enablenpc "Extinct Bonfire#hu_fild02"
disablenpc "#plate1_hu_fild02"
disablenpc "#plate2_hu_fild02"
disablenpc "#plate3_hu_fild02"
disablenpc "#basket_hu_fild02"
disablenpc "Sunbathing girl#hu_fild02"
disablenpc "Sitting man#hu_fild02"
disablenpc "Sitting woman#hu_fild02"
disablenpc "Wanderer#hu_fild02"
// hu_fild03 ============[OFF]==============
disablenpc "Bonfire#hu_fild03"
enablenpc "Extinct Bonfire#hu_fild03"
disablenpc "#plate1_hu_fild03"
disablenpc "#plate2_hu_fild03"
disablenpc "#plate3_hu_fild03"
disablenpc "#basket_hu_fild03"
disablenpc "Sunbathing girl#hu_fild03"
disablenpc "Sitting man#hu_fild03"
disablenpc "Sitting woman#hu_fild03"
disablenpc "Wanderer#hu_fild03"
// hu_fild04 ============[OFF]==============
disablenpc "Bonfire#hu_fild04"
enablenpc "Extinct Bonfire#hu_fild04"
disablenpc "#plate1_hu_fild04"
disablenpc "#plate2_hu_fild04"
disablenpc "#plate3_hu_fild04"
disablenpc "#basket_hu_fild04"
disablenpc "Sunbathing girl#hu_fild04"
disablenpc "Sitting man#hu_fild04"
disablenpc "Sitting woman#hu_fild04"
disablenpc "Wanderer#hu_fild04"
// hu_fild05 ============[OFF]==============
disablenpc "Bonfire#hu_fild05"
enablenpc "Extinct Bonfire#hu_fild05"
disablenpc "#plate1_hu_fild05"
disablenpc "#plate2_hu_fild05"
disablenpc "#plate3_hu_fild05"
disablenpc "#basket_hu_fild05"
disablenpc "Sunbathing girl#hu_fild05"
disablenpc "Sitting man#hu_fild05"
disablenpc "Sitting woman#hu_fild05"
disablenpc "Wanderer#hu_fild05"
// hu_fild06 ============[OFF]==============
disablenpc "Bonfire#hu_fild06"
enablenpc "Extinct Bonfire#hu_fild06"
disablenpc "#plate1_hu_fild06"
disablenpc "#plate2_hu_fild06"
disablenpc "#plate3_hu_fild06"
disablenpc "#basket_hu_fild06"
disablenpc "Sunbathing girl#hu_fild06"
disablenpc "Sitting man#hu_fild06"
disablenpc "Sitting woman#hu_fild06"
disablenpc "Wanderer#hu_fild06"
return


npc "ama_fild01" "#picnic_maker5005" HIDDEN_NPC 1 1 6 0 0
OnInit:
	InitTimer
return

// 30 min
// OnTimer: 1740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if (time_to_picnic < 2400000)
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 1800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5005" "begin_picnic"
	endif
return
	
OnTimer: 2100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5005" "end_picnic"
	endif
return
// 40 min 
// OnTimer: 2340000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 2400000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5005" "begin_picnic"
	endif
return
	
OnTimer: 2700000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5005" "end_picnic"
	endif
return
// 50 min 
// OnTimer: 2940000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3000000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5005" "begin_picnic"
	endif
return
	
OnTimer: 3300000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5005" "end_picnic"
	endif
return
// 60 min 
// OnTimer: 3540000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3600000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5005" "begin_picnic"
	endif
return
	
OnTimer: 3900000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5005" "end_picnic"
	endif
return
// 70 min 
// OnTimer: 4140000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4200000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5005" "begin_picnic"
	endif
return
	
OnTimer: 4500000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5005" "end_picnic"
	endif
return
// 80 min 
// OnTimer: 4740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5005" "begin_picnic"
	endif
return
	
OnTimer: 5100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5005" "end_picnic"
	endif
return
// 90 min 
// OnTimer: 5340000
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
// return

OnTimer: 5400000
		cmdothernpc "#picnic_maker5005" "begin_picnic"
return
	
OnTimer: 5700000
		cmdothernpc "#picnic_maker5005" "end_picnic"
return

OnCommand: "begin_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics! "
	cmdothernpc "#picnic_maker5005" "on"
return

OnCommand: "end_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics are over! "
	cmdothernpc "#picnic_maker5005" "off"
	
	stoptimer
	InitTimer
return

OnCommand: "on"
// ama_fild01 ============[ON]==============
enablenpc "Bonfire#ama_fild01"
disablenpc "Extinct Bonfire#ama_fild01"
enablenpc "#plate1_ama_fild01"
enablenpc "#plate2_ama_fild01"
enablenpc "#plate3_ama_fild01"
enablenpc "#basket_ama_fild01"
enablenpc "Sunbathing girl#ama_fild01"
enablenpc "Sitting man#ama_fild01"
enablenpc "Sitting woman#ama_fild01"
enablenpc "Wanderer#ama_fild01"
// bra_fild01 ============[ON]==============
enablenpc "Bonfire#bra_fild01"
disablenpc "Extinct Bonfire#bra_fild01"
enablenpc "#plate1_bra_fild01"
enablenpc "#plate2_bra_fild01"
enablenpc "#plate3_bra_fild01"
enablenpc "#basket_bra_fild01"
enablenpc "Sunbathing girl#bra_fild01"
enablenpc "Sitting man#bra_fild01"
enablenpc "Sitting woman#bra_fild01"
enablenpc "Wanderer#bra_fild01"
// dew_fild01 ============[ON]==============
enablenpc "Bonfire#dew_fild01"
disablenpc "Extinct Bonfire#dew_fild01"
enablenpc "#plate1_dew_fild01"
enablenpc "#plate2_dew_fild01"
enablenpc "#plate3_dew_fild01"
enablenpc "#basket_dew_fild01"
enablenpc "Sunbathing girl#dew_fild01"
enablenpc "Sitting man#dew_fild01"
enablenpc "Sitting woman#dew_fild01"
enablenpc "Wanderer#dew_fild01"

return

OnCommand: "off"
// ama_fild01 ============[OFF]==============
disablenpc "Bonfire#ama_fild01"
enablenpc "Extinct Bonfire#ama_fild01"
disablenpc "#plate1_ama_fild01"
disablenpc "#plate2_ama_fild01"
disablenpc "#plate3_ama_fild01"
disablenpc "#basket_ama_fild01"
disablenpc "Sunbathing girl#ama_fild01"
disablenpc "Sitting man#ama_fild01"
disablenpc "Sitting woman#ama_fild01"
disablenpc "Wanderer#ama_fild01"
// bra_fild01 ============[OFF]==============
disablenpc "Bonfire#bra_fild01"
enablenpc "Extinct Bonfire#bra_fild01"
disablenpc "#plate1_bra_fild01"
disablenpc "#plate2_bra_fild01"
disablenpc "#plate3_bra_fild01"
disablenpc "#basket_bra_fild01"
disablenpc "Sunbathing girl#bra_fild01"
disablenpc "Sitting man#bra_fild01"
disablenpc "Sitting woman#bra_fild01"
disablenpc "Wanderer#bra_fild01"
// dew_fild01 ============[OFF]==============
disablenpc "Bonfire#dew_fild01"
enablenpc "Extinct Bonfire#dew_fild01"
disablenpc "#plate1_dew_fild01"
disablenpc "#plate2_dew_fild01"
disablenpc "#plate3_dew_fild01"
disablenpc "#basket_dew_fild01"
disablenpc "Sunbathing girl#dew_fild01"
disablenpc "Sitting man#dew_fild01"
disablenpc "Sitting woman#dew_fild01"
disablenpc "Wanderer#dew_fild01"

return


npc "mosk_fild02" "#picnic_maker5006" HIDDEN_NPC 1 1 6 0 0
OnInit:
	InitTimer
return

// 30 min
// OnTimer: 1740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if (time_to_picnic < 2400000)
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 1800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5006" "begin_picnic"
	endif
return
	
OnTimer: 2100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5006" "end_picnic"
	endif
return
// 40 min 
// OnTimer: 2340000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 2400000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5006" "begin_picnic"
	endif
return
	
OnTimer: 2700000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5006" "end_picnic"
	endif
return
// 50 min 
// OnTimer: 2940000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3000000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5006" "begin_picnic"
	endif
return
	
OnTimer: 3300000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5006" "end_picnic"
	endif
return
// 60 min 
// OnTimer: 3540000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3600000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5006" "begin_picnic"
	endif
return
	
OnTimer: 3900000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5006" "end_picnic"
	endif
return
// 70 min 
// OnTimer: 4140000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4200000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5006" "begin_picnic"
	endif
return
	
OnTimer: 4500000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5006" "end_picnic"
	endif
return
// 80 min 
// OnTimer: 4740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5006" "begin_picnic"
	endif
return
	
OnTimer: 5100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5006" "end_picnic"
	endif
return
// 90 min 
// OnTimer: 5340000
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
// return

OnTimer: 5400000
		cmdothernpc "#picnic_maker5006" "begin_picnic"
return
	
OnTimer: 5700000
		cmdothernpc "#picnic_maker5006" "end_picnic"
return

OnCommand: "begin_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics! "
	cmdothernpc "#picnic_maker5006" "on"
return

OnCommand: "end_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics are over! "
	cmdothernpc "#picnic_maker5006" "off"
	
	stoptimer
	InitTimer
return

OnCommand: "on"
// mosk_fild02 ============[ON]==============
enablenpc "Bonfire#mosk_fild02"
disablenpc "Extinct Bonfire#mosk_fild02"
enablenpc "#plate1_mosk_fild02"
enablenpc "#plate2_mosk_fild02"
enablenpc "#plate3_mosk_fild02"
enablenpc "#basket_mosk_fild02"
enablenpc "Sunbathing girl#mosk_fild02"
enablenpc "Sitting man#mosk_fild02"
enablenpc "Sitting woman#mosk_fild02"
enablenpc "Wanderer#mosk_fild02"
// mosk_dun01 ============[ON]==============
enablenpc "Bonfire#mosk_dun01"
disablenpc "Extinct Bonfire#mosk_dun01"
enablenpc "#plate1_mosk_dun01"
enablenpc "#plate2_mosk_dun01"
enablenpc "#plate3_mosk_dun01"
enablenpc "#basket_mosk_dun01"
enablenpc "Sunbathing girl#mosk_dun01"
enablenpc "Sitting man#mosk_dun01"
enablenpc "Sitting woman#mosk_dun01"
enablenpc "Wanderer#mosk_dun01"
// mosk_dun02 ============[ON]==============
enablenpc "Bonfire#mosk_dun02"
disablenpc "Extinct Bonfire#mosk_dun02"
enablenpc "#plate1_mosk_dun02"
enablenpc "#plate2_mosk_dun02"
enablenpc "#plate3_mosk_dun02"
enablenpc "#basket_mosk_dun02"
enablenpc "Sunbathing girl#mosk_dun02"
enablenpc "Sitting man#mosk_dun02"
enablenpc "Sitting woman#mosk_dun02"
enablenpc "Wanderer#mosk_dun02"
// mosk_dun03 ============[ON]==============
enablenpc "Bonfire#mosk_dun03"
disablenpc "Extinct Bonfire#mosk_dun03"
enablenpc "#plate1_mosk_dun03"
enablenpc "#plate2_mosk_dun03"
enablenpc "#plate3_mosk_dun03"
enablenpc "#basket_mosk_dun03"
enablenpc "Sunbathing girl#mosk_dun03"
enablenpc "Sitting man#mosk_dun03"
enablenpc "Sitting woman#mosk_dun03"
enablenpc "Wanderer#mosk_dun03"
// gef_fild13 ============[ON]==============
enablenpc "Bonfire#gef_fild13"
disablenpc "Extinct Bonfire#gef_fild13"
enablenpc "#plate1_gef_fild13"
enablenpc "#plate2_gef_fild13"
enablenpc "#plate3_gef_fild13"
enablenpc "#basket_gef_fild13"
enablenpc "Sunbathing girl#gef_fild13"
enablenpc "Sitting man#gef_fild13"
enablenpc "Sitting woman#gef_fild13"
enablenpc "Wanderer#gef_fild13"
return

OnCommand: "off"
// mosk_fild02 ============[OFF]==============
disablenpc "Bonfire#mosk_fild02"
enablenpc "Extinct Bonfire#mosk_fild02"
disablenpc "#plate1_mosk_fild02"
disablenpc "#plate2_mosk_fild02"
disablenpc "#plate3_mosk_fild02"
disablenpc "#basket_mosk_fild02"
disablenpc "Sunbathing girl#mosk_fild02"
disablenpc "Sitting man#mosk_fild02"
disablenpc "Sitting woman#mosk_fild02"
disablenpc "Wanderer#mosk_fild02"
// mosk_dun01 ============[OFF]==============
disablenpc "Bonfire#mosk_dun01"
enablenpc "Extinct Bonfire#mosk_dun01"
disablenpc "#plate1_mosk_dun01"
disablenpc "#plate2_mosk_dun01"
disablenpc "#plate3_mosk_dun01"
disablenpc "#basket_mosk_dun01"
disablenpc "Sunbathing girl#mosk_dun01"
disablenpc "Sitting man#mosk_dun01"
disablenpc "Sitting woman#mosk_dun01"
disablenpc "Wanderer#mosk_dun01"
// mosk_dun02 ============[OFF]==============
disablenpc "Bonfire#mosk_dun02"
enablenpc "Extinct Bonfire#mosk_dun02"
disablenpc "#plate1_mosk_dun02"
disablenpc "#plate2_mosk_dun02"
disablenpc "#plate3_mosk_dun02"
disablenpc "#basket_mosk_dun02"
disablenpc "Sunbathing girl#mosk_dun02"
disablenpc "Sitting man#mosk_dun02"
disablenpc "Sitting woman#mosk_dun02"
disablenpc "Wanderer#mosk_dun02"
// mosk_dun03 ============[OFF]==============
disablenpc "Bonfire#mosk_dun03"
enablenpc "Extinct Bonfire#mosk_dun03"
disablenpc "#plate1_mosk_dun03"
disablenpc "#plate2_mosk_dun03"
disablenpc "#plate3_mosk_dun03"
disablenpc "#basket_mosk_dun03"
disablenpc "Sunbathing girl#mosk_dun03"
disablenpc "Sitting man#mosk_dun03"
disablenpc "Sitting woman#mosk_dun03"
disablenpc "Wanderer#mosk_dun03"
// gef_fild13 ============[OFF]==============
disablenpc "Bonfire#gef_fild13"
enablenpc "Extinct Bonfire#gef_fild13"
disablenpc "#plate1_gef_fild13"
disablenpc "#plate2_gef_fild13"
disablenpc "#plate3_gef_fild13"
disablenpc "#basket_gef_fild13"
disablenpc "Sunbathing girl#gef_fild13"
disablenpc "Sitting man#gef_fild13"
disablenpc "Sitting woman#gef_fild13"
disablenpc "Wanderer#gef_fild13"
return


npc "lasa_fild01" "#picnic_maker5008" HIDDEN_NPC 1 1 6 0 0
OnInit:
	InitTimer
return

// 30 min
// OnTimer: 1740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if (time_to_picnic < 2400000)
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 1800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5008" "begin_picnic"
	endif
return
	
OnTimer: 2100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5008" "end_picnic"
	endif
return
// 40 min 
// OnTimer: 2340000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 2400000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5008" "begin_picnic"
	endif
return
	
OnTimer: 2700000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5008" "end_picnic"
	endif
return
// 50 min 
// OnTimer: 2940000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3000000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5008" "begin_picnic"
	endif
return
	
OnTimer: 3300000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5008" "end_picnic"
	endif
return
// 60 min 
// OnTimer: 3540000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3600000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5008" "begin_picnic"
	endif
return
	
OnTimer: 3900000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5008" "end_picnic"
	endif
return
// 70 min 
// OnTimer: 4140000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4200000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5008" "begin_picnic"
	endif
return
	
OnTimer: 4500000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5008" "end_picnic"
	endif
return
// 80 min 
// OnTimer: 4740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5008" "begin_picnic"
	endif
return
	
OnTimer: 5100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5008" "end_picnic"
	endif
return
// 90 min 
// OnTimer: 5340000
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
// return

OnTimer: 5400000
		cmdothernpc "#picnic_maker5008" "begin_picnic"
return
	
OnTimer: 5700000
		cmdothernpc "#picnic_maker5008" "end_picnic"
return

OnCommand: "begin_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics! "
	cmdothernpc "#picnic_maker5008" "on"
return

OnCommand: "end_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics are over! "
	cmdothernpc "#picnic_maker5008" "off"
	
	stoptimer
	InitTimer
return

OnCommand: "on"
// lasa_fild01 ============[ON]==============
enablenpc "Bonfire#lasa_fild01"
disablenpc "Extinct Bonfire#lasa_fild01"
enablenpc "#plate1_lasa_fild01"
enablenpc "#plate2_lasa_fild01"
enablenpc "#plate3_lasa_fild01"
enablenpc "#basket_lasa_fild01"
enablenpc "Sunbathing girl#lasa_fild01"
enablenpc "Sitting man#lasa_fild01"
enablenpc "Sitting woman#lasa_fild01"
enablenpc "Wanderer#lasa_fild01"
// lasa_fild02 ============[ON]==============
enablenpc "Bonfire#lasa_fild02"
disablenpc "Extinct Bonfire#lasa_fild02"
enablenpc "#plate1_lasa_fild02"
enablenpc "#plate2_lasa_fild02"
enablenpc "#plate3_lasa_fild02"
enablenpc "#basket_lasa_fild02"
enablenpc "Sunbathing girl#lasa_fild02"
enablenpc "Sitting man#lasa_fild02"
enablenpc "Sitting woman#lasa_fild02"
enablenpc "Wanderer#lasa_fild02"

return

OnCommand: "off"
// lasa_fild01 ============[OFF]==============
disablenpc "Bonfire#lasa_fild01"
enablenpc "Extinct Bonfire#lasa_fild01"
disablenpc "#plate1_lasa_fild01"
disablenpc "#plate2_lasa_fild01"
disablenpc "#plate3_lasa_fild01"
disablenpc "#basket_lasa_fild01"
disablenpc "Sunbathing girl#lasa_fild01"
disablenpc "Sitting man#lasa_fild01"
disablenpc "Sitting woman#lasa_fild01"
disablenpc "Wanderer#lasa_fild01"
// lasa_fild02 ============[OFF]==============
disablenpc "Bonfire#lasa_fild02"
enablenpc "Extinct Bonfire#lasa_fild02"
disablenpc "#plate1_lasa_fild02"
disablenpc "#plate2_lasa_fild02"
disablenpc "#plate3_lasa_fild02"
disablenpc "#basket_lasa_fild02"
disablenpc "Sunbathing girl#lasa_fild02"
disablenpc "Sitting man#lasa_fild02"
disablenpc "Sitting woman#lasa_fild02"
disablenpc "Wanderer#lasa_fild02"

return


npc "cmd_fild01" "#picnic_maker5009" HIDDEN_NPC 1 1 6 0 0
OnInit:
	InitTimer
return

// 30 min
// OnTimer: 1740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if (time_to_picnic < 2400000)
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 1800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5009" "begin_picnic"
	endif
return
	
OnTimer: 2100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5009" "end_picnic"
	endif
return
// 40 min 
// OnTimer: 2340000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 2400000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5009" "begin_picnic"
	endif
return
	
OnTimer: 2700000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5009" "end_picnic"
	endif
return
// 50 min 
// OnTimer: 2940000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3000000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5009" "begin_picnic"
	endif
return
	
OnTimer: 3300000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5009" "end_picnic"
	endif
return
// 60 min 
// OnTimer: 3540000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3600000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5009" "begin_picnic"
	endif
return
	
OnTimer: 3900000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5009" "end_picnic"
	endif
return
// 70 min 
// OnTimer: 4140000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4200000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5009" "begin_picnic"
	endif
return
	
OnTimer: 4500000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5009" "end_picnic"
	endif
return
// 80 min 
// OnTimer: 4740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5009" "begin_picnic"
	endif
return
	
OnTimer: 5100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5009" "end_picnic"
	endif
return
// 90 min 
// OnTimer: 5340000
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
// return

OnTimer: 5400000
		cmdothernpc "#picnic_maker5009" "begin_picnic"
return
	
OnTimer: 5700000
		cmdothernpc "#picnic_maker5009" "end_picnic"
return

OnCommand: "begin_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics! "
	cmdothernpc "#picnic_maker5009" "on"
return

OnCommand: "end_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics are over! "
	cmdothernpc "#picnic_maker5009" "off"
	
	stoptimer
	InitTimer
return

OnCommand: "on"
// cmd_fild01 ============[ON]==============
enablenpc "Bonfire#cmd_fild01"
disablenpc "Extinct Bonfire#cmd_fild01"
enablenpc "#plate1_cmd_fild01"
enablenpc "#plate2_cmd_fild01"
enablenpc "#plate3_cmd_fild01"
enablenpc "#basket_cmd_fild01"
enablenpc "Sunbathing girl#cmd_fild01"
enablenpc "Sitting man#cmd_fild01"
enablenpc "Sitting woman#cmd_fild01"
enablenpc "Wanderer#cmd_fild01"
// cmd_fild02 ============[ON]==============
enablenpc "Bonfire#cmd_fild02"
disablenpc "Extinct Bonfire#cmd_fild02"
enablenpc "#plate1_cmd_fild02"
enablenpc "#plate2_cmd_fild02"
enablenpc "#plate3_cmd_fild02"
enablenpc "#basket_cmd_fild02"
enablenpc "Sunbathing girl#cmd_fild02"
enablenpc "Sitting man#cmd_fild02"
enablenpc "Sitting woman#cmd_fild02"
enablenpc "Wanderer#cmd_fild02"
// cmd_fild03 ============[ON]==============
enablenpc "Bonfire#cmd_fild03"
disablenpc "Extinct Bonfire#cmd_fild03"
enablenpc "#plate1_cmd_fild03"
enablenpc "#plate2_cmd_fild03"
enablenpc "#plate3_cmd_fild03"
enablenpc "#basket_cmd_fild03"
enablenpc "Sunbathing girl#cmd_fild03"
enablenpc "Sitting man#cmd_fild03"
enablenpc "Sitting woman#cmd_fild03"
enablenpc "Wanderer#cmd_fild03"
// cmd_fild05 ============[ON]==============
enablenpc "Bonfire#cmd_fild05"
disablenpc "Extinct Bonfire#cmd_fild05"
enablenpc "#plate1_cmd_fild05"
enablenpc "#plate2_cmd_fild05"
enablenpc "#plate3_cmd_fild05"
enablenpc "#basket_cmd_fild05"
enablenpc "Sunbathing girl#cmd_fild05"
enablenpc "Sitting man#cmd_fild05"
enablenpc "Sitting woman#cmd_fild05"
enablenpc "Wanderer#cmd_fild05"
return

OnCommand: "off"
// cmd_fild01 ============[OFF]==============
disablenpc "Bonfire#cmd_fild01"
enablenpc "Extinct Bonfire#cmd_fild01"
disablenpc "#plate1_cmd_fild01"
disablenpc "#plate2_cmd_fild01"
disablenpc "#plate3_cmd_fild01"
disablenpc "#basket_cmd_fild01"
disablenpc "Sunbathing girl#cmd_fild01"
disablenpc "Sitting man#cmd_fild01"
disablenpc "Sitting woman#cmd_fild01"
disablenpc "Wanderer#cmd_fild01"
// cmd_fild02 ============[OFF]==============
disablenpc "Bonfire#cmd_fild02"
enablenpc "Extinct Bonfire#cmd_fild02"
disablenpc "#plate1_cmd_fild02"
disablenpc "#plate2_cmd_fild02"
disablenpc "#plate3_cmd_fild02"
disablenpc "#basket_cmd_fild02"
disablenpc "Sunbathing girl#cmd_fild02"
disablenpc "Sitting man#cmd_fild02"
disablenpc "Sitting woman#cmd_fild02"
disablenpc "Wanderer#cmd_fild02"
// cmd_fild03 ============[OFF]==============
disablenpc "Bonfire#cmd_fild03"
enablenpc "Extinct Bonfire#cmd_fild03"
disablenpc "#plate1_cmd_fild03"
disablenpc "#plate2_cmd_fild03"
disablenpc "#plate3_cmd_fild03"
disablenpc "#basket_cmd_fild03"
disablenpc "Sunbathing girl#cmd_fild03"
disablenpc "Sitting man#cmd_fild03"
disablenpc "Sitting woman#cmd_fild03"
disablenpc "Wanderer#cmd_fild03"
// cmd_fild05 ============[OFF]==============
disablenpc "Bonfire#cmd_fild05"
enablenpc "Extinct Bonfire#cmd_fild05"
disablenpc "#plate1_cmd_fild05"
disablenpc "#plate2_cmd_fild05"
disablenpc "#plate3_cmd_fild05"
disablenpc "#basket_cmd_fild05"
disablenpc "Sunbathing girl#cmd_fild05"
disablenpc "Sitting man#cmd_fild05"
disablenpc "Sitting woman#cmd_fild05"
disablenpc "Wanderer#cmd_fild05"
return


npc "um_fild01" "#picnic_maker5011" HIDDEN_NPC 1 1 6 0 0
OnInit:
	InitTimer
return

// 30 min
// OnTimer: 1740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if (time_to_picnic < 2400000)
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 1800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5011" "begin_picnic"
	endif
return
	
OnTimer: 2100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5011" "end_picnic"
	endif
return
// 40 min 
// OnTimer: 2340000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 2400000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5011" "begin_picnic"
	endif
return
	
OnTimer: 2700000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5011" "end_picnic"
	endif
return
// 50 min 
// OnTimer: 2940000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3000000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5011" "begin_picnic"
	endif
return
	
OnTimer: 3300000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5011" "end_picnic"
	endif
return
// 60 min 
// OnTimer: 3540000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3600000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5011" "begin_picnic"
	endif
return
	
OnTimer: 3900000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5011" "end_picnic"
	endif
return
// 70 min 
// OnTimer: 4140000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4200000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5011" "begin_picnic"
	endif
return
	
OnTimer: 4500000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5011" "end_picnic"
	endif
return
// 80 min 
// OnTimer: 4740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5011" "begin_picnic"
	endif
return
	
OnTimer: 5100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5011" "end_picnic"
	endif
return
// 90 min 
// OnTimer: 5340000
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
// return

OnTimer: 5400000
		cmdothernpc "#picnic_maker5011" "begin_picnic"
return
	
OnTimer: 5700000
		cmdothernpc "#picnic_maker5011" "end_picnic"
return

OnCommand: "begin_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics! "
	cmdothernpc "#picnic_maker5011" "on"
return

OnCommand: "end_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics are over! "
	cmdothernpc "#picnic_maker5011" "off"
	
	stoptimer
	InitTimer
return

OnCommand: "on"

// prt_fild07 ============[ON]==============
enablenpc "Bonfire#prt_fild07"
disablenpc "Extinct Bonfire#prt_fild07"
enablenpc "#plate1_prt_fild07"
enablenpc "#plate2_prt_fild07"
enablenpc "#plate3_prt_fild07"
enablenpc "#basket_prt_fild07"
enablenpc "Sunbathing girl#prt_fild07"
enablenpc "Sitting man#prt_fild07"
enablenpc "Sitting woman#prt_fild07"
enablenpc "Wanderer#prt_fild07"
// prt_fild08 ============[ON]==============
enablenpc "Bonfire#prt_fild08"
disablenpc "Extinct Bonfire#prt_fild08"
enablenpc "#plate1_prt_fild08"
enablenpc "#plate2_prt_fild08"
enablenpc "#plate3_prt_fild08"
enablenpc "#basket_prt_fild08"
enablenpc "Sunbathing girl#prt_fild08"
enablenpc "Sitting man#prt_fild08"
enablenpc "Sitting woman#prt_fild08"
enablenpc "Wanderer#prt_fild08"
// prt_fild10 ============[ON]==============
enablenpc "Bonfire#prt_fild10"
disablenpc "Extinct Bonfire#prt_fild10"
enablenpc "#plate1_prt_fild10"
enablenpc "#plate2_prt_fild10"
enablenpc "#plate3_prt_fild10"
enablenpc "#basket_prt_fild10"
enablenpc "Sunbathing girl#prt_fild10"
enablenpc "Sitting man#prt_fild10"
enablenpc "Sitting woman#prt_fild10"
enablenpc "Wanderer#prt_fild10"
// prt_fild11 ============[ON]==============
enablenpc "Bonfire#prt_fild11"
disablenpc "Extinct Bonfire#prt_fild11"
enablenpc "#plate1_prt_fild11"
enablenpc "#plate2_prt_fild11"
enablenpc "#plate3_prt_fild11"
enablenpc "#basket_prt_fild11"
enablenpc "Sunbathing girl#prt_fild11"
enablenpc "Sitting man#prt_fild11"
enablenpc "Sitting woman#prt_fild11"
enablenpc "Wanderer#prt_fild11"
// um_fild01 ============[ON]==============
enablenpc "Bonfire#um_fild01"
disablenpc "Extinct Bonfire#um_fild01"
enablenpc "#plate1_um_fild01"
enablenpc "#plate2_um_fild01"
enablenpc "#plate3_um_fild01"
enablenpc "#basket_um_fild01"
enablenpc "Sunbathing girl#um_fild01"
enablenpc "Sitting man#um_fild01"
enablenpc "Sitting woman#um_fild01"
enablenpc "Wanderer#um_fild01"
// um_fild02 ============[ON]==============
enablenpc "Bonfire#um_fild02"
disablenpc "Extinct Bonfire#um_fild02"
enablenpc "#plate1_um_fild02"
enablenpc "#plate2_um_fild02"
enablenpc "#plate3_um_fild02"
enablenpc "#basket_um_fild02"
enablenpc "Sunbathing girl#um_fild02"
enablenpc "Sitting man#um_fild02"
enablenpc "Sitting woman#um_fild02"
enablenpc "Wanderer#um_fild02"
// um_fild03 ============[ON]==============
enablenpc "Bonfire#um_fild03"
disablenpc "Extinct Bonfire#um_fild03"
enablenpc "#plate1_um_fild03"
enablenpc "#plate2_um_fild03"
enablenpc "#plate3_um_fild03"
enablenpc "#basket_um_fild03"
enablenpc "Sunbathing girl#um_fild03"
enablenpc "Sitting man#um_fild03"
enablenpc "Sitting woman#um_fild03"
enablenpc "Wanderer#um_fild03"
// um_fild04 ============[ON]==============
enablenpc "Bonfire#um_fild04"
disablenpc "Extinct Bonfire#um_fild04"
enablenpc "#plate1_um_fild04"
enablenpc "#plate2_um_fild04"
enablenpc "#plate3_um_fild04"
enablenpc "#basket_um_fild04"
enablenpc "Sunbathing girl#um_fild04"
enablenpc "Sitting man#um_fild04"
enablenpc "Sitting woman#um_fild04"
enablenpc "Wanderer#um_fild04"
return

OnCommand: "off"
// prt_fild07 ============[OFF]==============
disablenpc "Bonfire#prt_fild07"
enablenpc "Extinct Bonfire#prt_fild07"
disablenpc "#plate1_prt_fild07"
disablenpc "#plate2_prt_fild07"
disablenpc "#plate3_prt_fild07"
disablenpc "#basket_prt_fild07"
disablenpc "Sunbathing girl#prt_fild07"
disablenpc "Sitting man#prt_fild07"
disablenpc "Sitting woman#prt_fild07"
disablenpc "Wanderer#prt_fild07"
// prt_fild08 ============[OFF]==============
disablenpc "Bonfire#prt_fild08"
enablenpc "Extinct Bonfire#prt_fild08"
disablenpc "#plate1_prt_fild08"
disablenpc "#plate2_prt_fild08"
disablenpc "#plate3_prt_fild08"
disablenpc "#basket_prt_fild08"
disablenpc "Sunbathing girl#prt_fild08"
disablenpc "Sitting man#prt_fild08"
disablenpc "Sitting woman#prt_fild08"
disablenpc "Wanderer#prt_fild08"
// prt_fild10 ============[OFF]==============
disablenpc "Bonfire#prt_fild10"
enablenpc "Extinct Bonfire#prt_fild10"
disablenpc "#plate1_prt_fild10"
disablenpc "#plate2_prt_fild10"
disablenpc "#plate3_prt_fild10"
disablenpc "#basket_prt_fild10"
disablenpc "Sunbathing girl#prt_fild10"
disablenpc "Sitting man#prt_fild10"
disablenpc "Sitting woman#prt_fild10"
disablenpc "Wanderer#prt_fild10"
// prt_fild11 ============[OFF]==============
disablenpc "Bonfire#prt_fild11"
enablenpc "Extinct Bonfire#prt_fild11"
disablenpc "#plate1_prt_fild11"
disablenpc "#plate2_prt_fild11"
disablenpc "#plate3_prt_fild11"
disablenpc "#basket_prt_fild11"
disablenpc "Sunbathing girl#prt_fild11"
disablenpc "Sitting man#prt_fild11"
disablenpc "Sitting woman#prt_fild11"
disablenpc "Wanderer#prt_fild11"
// um_fild01 ============[OFF]==============
disablenpc "Bonfire#um_fild01"
enablenpc "Extinct Bonfire#um_fild01"
disablenpc "#plate1_um_fild01"
disablenpc "#plate2_um_fild01"
disablenpc "#plate3_um_fild01"
disablenpc "#basket_um_fild01"
disablenpc "Sunbathing girl#um_fild01"
disablenpc "Sitting man#um_fild01"
disablenpc "Sitting woman#um_fild01"
disablenpc "Wanderer#um_fild01"
// um_fild02 ============[OFF]==============
disablenpc "Bonfire#um_fild02"
enablenpc "Extinct Bonfire#um_fild02"
disablenpc "#plate1_um_fild02"
disablenpc "#plate2_um_fild02"
disablenpc "#plate3_um_fild02"
disablenpc "#basket_um_fild02"
disablenpc "Sunbathing girl#um_fild02"
disablenpc "Sitting man#um_fild02"
disablenpc "Sitting woman#um_fild02"
disablenpc "Wanderer#um_fild02"
// um_fild03 ============[OFF]==============
disablenpc "Bonfire#um_fild03"
enablenpc "Extinct Bonfire#um_fild03"
disablenpc "#plate1_um_fild03"
disablenpc "#plate2_um_fild03"
disablenpc "#plate3_um_fild03"
disablenpc "#basket_um_fild03"
disablenpc "Sunbathing girl#um_fild03"
disablenpc "Sitting man#um_fild03"
disablenpc "Sitting woman#um_fild03"
disablenpc "Wanderer#um_fild03"
// um_fild04 ============[OFF]==============
disablenpc "Bonfire#um_fild04"
enablenpc "Extinct Bonfire#um_fild04"
disablenpc "#plate1_um_fild04"
disablenpc "#plate2_um_fild04"
disablenpc "#plate3_um_fild04"
disablenpc "#basket_um_fild04"
disablenpc "Sunbathing girl#um_fild04"
disablenpc "Sitting man#um_fild04"
disablenpc "Sitting woman#um_fild04"
disablenpc "Wanderer#um_fild04"
return


npc "ein_fild03" "#picnic_maker5012" HIDDEN_NPC 1 1 6 0 0
OnInit:
	InitTimer
return

// 30 min
// OnTimer: 1740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if (time_to_picnic < 2400000)
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 1800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5012" "begin_picnic"
	endif
return
	
OnTimer: 2100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5012" "end_picnic"
	endif
return
// 40 min 
// OnTimer: 2340000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 2400000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5012" "begin_picnic"
	endif
return
	
OnTimer: 2700000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5012" "end_picnic"
	endif
return
// 50 min 
// OnTimer: 2940000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3000000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5012" "begin_picnic"
	endif
return
	
OnTimer: 3300000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5012" "end_picnic"
	endif
return
// 60 min 
// OnTimer: 3540000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3600000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5012" "begin_picnic"
	endif
return
	
OnTimer: 3900000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5012" "end_picnic"
	endif
return
// 70 min 
// OnTimer: 4140000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4200000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5012" "begin_picnic"
	endif
return
	
OnTimer: 4500000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5012" "end_picnic"
	endif
return
// 80 min 
// OnTimer: 4740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5012" "begin_picnic"
	endif
return
	
OnTimer: 5100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5012" "end_picnic"
	endif
return
// 90 min 
// OnTimer: 5340000
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
// return

OnTimer: 5400000
		cmdothernpc "#picnic_maker5012" "begin_picnic"
return
	
OnTimer: 5700000
		cmdothernpc "#picnic_maker5012" "end_picnic"
return

OnCommand: "begin_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics! "
	cmdothernpc "#picnic_maker5012" "on"
return

OnCommand: "end_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics are over! "
	cmdothernpc "#picnic_maker5012" "off"
	
	stoptimer
	InitTimer
return

OnCommand: "on"
// ein_fild03 ============[ON]==============
enablenpc "Bonfire#ein_fild03"
disablenpc "Extinct Bonfire#ein_fild03"
enablenpc "#plate1_ein_fild03"
enablenpc "#plate2_ein_fild03"
enablenpc "#plate3_ein_fild03"
enablenpc "#basket_ein_fild03"
enablenpc "Sunbathing girl#ein_fild03"
enablenpc "Sitting man#ein_fild03"
enablenpc "Sitting woman#ein_fild03"
enablenpc "Wanderer#ein_fild03"
// ein_fild09 ============[ON]==============
enablenpc "Bonfire#ein_fild09"
disablenpc "Extinct Bonfire#ein_fild09"
enablenpc "#plate1_ein_fild09"
enablenpc "#plate2_ein_fild09"
enablenpc "#plate3_ein_fild09"
enablenpc "#basket_ein_fild09"
enablenpc "Sunbathing girl#ein_fild09"
enablenpc "Sitting man#ein_fild09"
enablenpc "Sitting woman#ein_fild09"
enablenpc "Wanderer#ein_fild09"
// ein_fild10 ============[ON]==============
enablenpc "Bonfire#ein_fild10"
disablenpc "Extinct Bonfire#ein_fild10"
enablenpc "#plate1_ein_fild10"
enablenpc "#plate2_ein_fild10"
enablenpc "#plate3_ein_fild10"
enablenpc "#basket_ein_fild10"
enablenpc "Sunbathing girl#ein_fild10"
enablenpc "Sitting man#ein_fild10"
enablenpc "Sitting woman#ein_fild10"
enablenpc "Wanderer#ein_fild10"
return

OnCommand: "off"
// ein_fild03 ============[OFF]==============
disablenpc "Bonfire#ein_fild03"
enablenpc "Extinct Bonfire#ein_fild03"
disablenpc "#plate1_ein_fild03"
disablenpc "#plate2_ein_fild03"
disablenpc "#plate3_ein_fild03"
disablenpc "#basket_ein_fild03"
disablenpc "Sunbathing girl#ein_fild03"
disablenpc "Sitting man#ein_fild03"
disablenpc "Sitting woman#ein_fild03"
disablenpc "Wanderer#ein_fild03"
// ein_fild09 ============[OFF]==============
disablenpc "Bonfire#ein_fild09"
enablenpc "Extinct Bonfire#ein_fild09"
disablenpc "#plate1_ein_fild09"
disablenpc "#plate2_ein_fild09"
disablenpc "#plate3_ein_fild09"
disablenpc "#basket_ein_fild09"
disablenpc "Sunbathing girl#ein_fild09"
disablenpc "Sitting man#ein_fild09"
disablenpc "Sitting woman#ein_fild09"
disablenpc "Wanderer#ein_fild09"
// ein_fild10 ============[OFF]==============
disablenpc "Bonfire#ein_fild10"
enablenpc "Extinct Bonfire#ein_fild10"
disablenpc "#plate1_ein_fild10"
disablenpc "#plate2_ein_fild10"
disablenpc "#plate3_ein_fild10"
disablenpc "#basket_ein_fild10"
disablenpc "Sunbathing girl#ein_fild10"
disablenpc "Sitting man#ein_fild10"
disablenpc "Sitting woman#ein_fild10"
disablenpc "Wanderer#ein_fild10"
return


npc "ayo_fild01" "#picnic_maker5013" HIDDEN_NPC 1 1 6 0 0
OnInit:
	InitTimer
return

// 30 min
// OnTimer: 1740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if (time_to_picnic < 2400000)
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 1800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5013" "begin_picnic"
	endif
return
	
OnTimer: 2100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5013" "end_picnic"
	endif
return
// 40 min 
// OnTimer: 2340000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 2400000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5013" "begin_picnic"
	endif
return
	
OnTimer: 2700000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5013" "end_picnic"
	endif
return
// 50 min 
// OnTimer: 2940000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3000000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5013" "begin_picnic"
	endif
return
	
OnTimer: 3300000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5013" "end_picnic"
	endif
return
// 60 min 
// OnTimer: 3540000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3600000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5013" "begin_picnic"
	endif
return
	
OnTimer: 3900000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5013" "end_picnic"
	endif
return
// 70 min 
// OnTimer: 4140000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4200000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5013" "begin_picnic"
	endif
return
	
OnTimer: 4500000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5013" "end_picnic"
	endif
return
// 80 min 
// OnTimer: 4740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5013" "begin_picnic"
	endif
return
	
OnTimer: 5100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5013" "end_picnic"
	endif
return
// 90 min 
// OnTimer: 5340000
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
// return

OnTimer: 5400000
		cmdothernpc "#picnic_maker5013" "begin_picnic"
return
	
OnTimer: 5700000
		cmdothernpc "#picnic_maker5013" "end_picnic"
return

OnCommand: "begin_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics! "
	cmdothernpc "#picnic_maker5013" "on"
return

OnCommand: "end_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics are over! "
	cmdothernpc "#picnic_maker5013" "off"
	
	stoptimer
	InitTimer
return

OnCommand: "on"
// lhz_fild01 ============[ON]==============
enablenpc "Bonfire#lhz_fild01"
disablenpc "Extinct Bonfire#lhz_fild01"
enablenpc "#plate1_lhz_fild01"
enablenpc "#plate2_lhz_fild01"
enablenpc "#plate3_lhz_fild01"
enablenpc "#basket_lhz_fild01"
enablenpc "Sunbathing girl#lhz_fild01"
enablenpc "Sitting man#lhz_fild01"
enablenpc "Sitting woman#lhz_fild01"
enablenpc "Wanderer#lhz_fild01"
// lhz_fild02 ============[ON]==============
enablenpc "Bonfire#lhz_fild02"
disablenpc "Extinct Bonfire#lhz_fild02"
enablenpc "#plate1_lhz_fild02"
enablenpc "#plate2_lhz_fild02"
enablenpc "#plate3_lhz_fild02"
enablenpc "#basket_lhz_fild02"
enablenpc "Sunbathing girl#lhz_fild02"
enablenpc "Sitting man#lhz_fild02"
enablenpc "Sitting woman#lhz_fild02"
enablenpc "Wanderer#lhz_fild02"
// lhz_fild03 ============[ON]==============
enablenpc "Bonfire#lhz_fild03"
disablenpc "Extinct Bonfire#lhz_fild03"
enablenpc "#plate1_lhz_fild03"
enablenpc "#plate2_lhz_fild03"
enablenpc "#plate3_lhz_fild03"
enablenpc "#basket_lhz_fild03"
enablenpc "Sunbathing girl#lhz_fild03"
enablenpc "Sitting man#lhz_fild03"
enablenpc "Sitting woman#lhz_fild03"
enablenpc "Wanderer#lhz_fild03"

// gon_fild01 ============[ON]==============
enablenpc "Bonfire#gon_fild01"
disablenpc "Extinct Bonfire#gon_fild01"
enablenpc "#plate1_gon_fild01"
enablenpc "#plate2_gon_fild01"
enablenpc "#plate3_gon_fild01"
enablenpc "#basket_gon_fild01"
enablenpc "Sunbathing girl#gon_fild01"
enablenpc "Sitting man#gon_fild01"
enablenpc "Sitting woman#gon_fild01"
enablenpc "Wanderer#gon_fild01"
// ayo_fild01 ============[ON]==============
enablenpc "Bonfire#ayo_fild01"
disablenpc "Extinct Bonfire#ayo_fild01"
enablenpc "#plate1_ayo_fild01"
enablenpc "#plate2_ayo_fild01"
enablenpc "#plate3_ayo_fild01"
enablenpc "#basket_ayo_fild01"
enablenpc "Sunbathing girl#ayo_fild01"
enablenpc "Sitting man#ayo_fild01"
enablenpc "Sitting woman#ayo_fild01"
enablenpc "Wanderer#ayo_fild01"

return

OnCommand: "off"

// lhz_fild01 ============[OFF]==============
disablenpc "Bonfire#lhz_fild01"
enablenpc "Extinct Bonfire#lhz_fild01"
disablenpc "#plate1_lhz_fild01"
disablenpc "#plate2_lhz_fild01"
disablenpc "#plate3_lhz_fild01"
disablenpc "#basket_lhz_fild01"
disablenpc "Sunbathing girl#lhz_fild01"
disablenpc "Sitting man#lhz_fild01"
disablenpc "Sitting woman#lhz_fild01"
disablenpc "Wanderer#lhz_fild01"
// lhz_fild02 ============[OFF]==============
disablenpc "Bonfire#lhz_fild02"
enablenpc "Extinct Bonfire#lhz_fild02"
disablenpc "#plate1_lhz_fild02"
disablenpc "#plate2_lhz_fild02"
disablenpc "#plate3_lhz_fild02"
disablenpc "#basket_lhz_fild02"
disablenpc "Sunbathing girl#lhz_fild02"
disablenpc "Sitting man#lhz_fild02"
disablenpc "Sitting woman#lhz_fild02"
disablenpc "Wanderer#lhz_fild02"
// lhz_fild03 ============[OFF]==============
disablenpc "Bonfire#lhz_fild03"
enablenpc "Extinct Bonfire#lhz_fild03"
disablenpc "#plate1_lhz_fild03"
disablenpc "#plate2_lhz_fild03"
disablenpc "#plate3_lhz_fild03"
disablenpc "#basket_lhz_fild03"
disablenpc "Sunbathing girl#lhz_fild03"
disablenpc "Sitting man#lhz_fild03"
disablenpc "Sitting woman#lhz_fild03"
disablenpc "Wanderer#lhz_fild03"

// gon_fild01 ============[OFF]==============
disablenpc "Bonfire#gon_fild01"
enablenpc "Extinct Bonfire#gon_fild01"
disablenpc "#plate1_gon_fild01"
disablenpc "#plate2_gon_fild01"
disablenpc "#plate3_gon_fild01"
disablenpc "#basket_gon_fild01"
disablenpc "Sunbathing girl#gon_fild01"
disablenpc "Sitting man#gon_fild01"
disablenpc "Sitting woman#gon_fild01"
disablenpc "Wanderer#gon_fild01"
// ayo_fild01 ============[OFF]==============
disablenpc "Bonfire#ayo_fild01"
enablenpc "Extinct Bonfire#ayo_fild01"
disablenpc "#plate1_ayo_fild01"
disablenpc "#plate2_ayo_fild01"
disablenpc "#plate3_ayo_fild01"
disablenpc "#basket_ayo_fild01"
disablenpc "Sunbathing girl#ayo_fild01"
disablenpc "Sitting man#ayo_fild01"
disablenpc "Sitting woman#ayo_fild01"
disablenpc "Wanderer#ayo_fild01"

return


npc "yuno_fild01" "#picnic_maker5014" HIDDEN_NPC 1 1 6 0 0
OnInit:
	InitTimer
return

// 30 min
// OnTimer: 1740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if (time_to_picnic < 2400000)
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 1800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5014" "begin_picnic"
	endif
return
	
OnTimer: 2100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5014" "end_picnic"
	endif
return
// 40 min 
// OnTimer: 2340000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 2400000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5014" "begin_picnic"
	endif
return
	
OnTimer: 2700000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5014" "end_picnic"
	endif
return
// 50 min 
// OnTimer: 2940000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3000000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5014" "begin_picnic"
	endif
return
	
OnTimer: 3300000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5014" "end_picnic"
	endif
return
// 60 min 
// OnTimer: 3540000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3600000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5014" "begin_picnic"
	endif
return
	
OnTimer: 3900000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5014" "end_picnic"
	endif
return
// 70 min 
// OnTimer: 4140000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4200000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5014" "begin_picnic"
	endif
return
	
OnTimer: 4500000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5014" "end_picnic"
	endif
return
// 80 min 
// OnTimer: 4740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5014" "begin_picnic"
	endif
return
	
OnTimer: 5100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5014" "end_picnic"
	endif
return
// 90 min 
// OnTimer: 5340000
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
// return

OnTimer: 5400000
		cmdothernpc "#picnic_maker5014" "begin_picnic"
return
	
OnTimer: 5700000
		cmdothernpc "#picnic_maker5014" "end_picnic"
return

OnCommand: "begin_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics! "
	cmdothernpc "#picnic_maker5014" "on"
return

OnCommand: "end_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics are over! "
	cmdothernpc "#picnic_maker5014" "off"
	
	stoptimer
	InitTimer
return

OnCommand: "on"

// yuno_fild01 ============[ON]==============
enablenpc "Bonfire#yuno_fild01"
disablenpc "Extinct Bonfire#yuno_fild01"
enablenpc "#plate1_yuno_fild01"
enablenpc "#plate2_yuno_fild01"
enablenpc "#plate3_yuno_fild01"
enablenpc "#basket_yuno_fild01"
enablenpc "Sunbathing girl#yuno_fild01"
enablenpc "Sitting man#yuno_fild01"
enablenpc "Sitting woman#yuno_fild01"
enablenpc "Wanderer#yuno_fild01"

// ma_fild02 ============[ON]==============
enablenpc "Bonfire#ma_fild02"
disablenpc "Extinct Bonfire#ma_fild02"
enablenpc "#plate1_ma_fild02"
enablenpc "#plate2_ma_fild02"
enablenpc "#plate3_ma_fild02"
enablenpc "#basket_ma_fild02"
enablenpc "Sunbathing girl#ma_fild02"
enablenpc "Sitting man#ma_fild02"
enablenpc "Sitting woman#ma_fild02"
enablenpc "Wanderer#ma_fild02"
// ma_fild01 ============[ON]==============
enablenpc "Bonfire#ma_fild01"
disablenpc "Extinct Bonfire#ma_fild01"
enablenpc "#plate1_ma_fild01"
enablenpc "#plate2_ma_fild01"
enablenpc "#plate3_ma_fild01"
enablenpc "#basket_ma_fild01"
enablenpc "Sunbathing girl#ma_fild01"
enablenpc "Sitting man#ma_fild01"
enablenpc "Sitting woman#ma_fild01"
enablenpc "Wanderer#ma_fild01"

return

OnCommand: "off"
// yuno_fild01 ============[OFF]==============
disablenpc "Bonfire#yuno_fild01"
enablenpc "Extinct Bonfire#yuno_fild01"
disablenpc "#plate1_yuno_fild01"
disablenpc "#plate2_yuno_fild01"
disablenpc "#plate3_yuno_fild01"
disablenpc "#basket_yuno_fild01"
disablenpc "Sunbathing girl#yuno_fild01"
disablenpc "Sitting man#yuno_fild01"
disablenpc "Sitting woman#yuno_fild01"
disablenpc "Wanderer#yuno_fild01"

// ma_fild02 ============[OFF]==============
disablenpc "Bonfire#ma_fild02"
enablenpc "Extinct Bonfire#ma_fild02"
disablenpc "#plate1_ma_fild02"
disablenpc "#plate2_ma_fild02"
disablenpc "#plate3_ma_fild02"
disablenpc "#basket_ma_fild02"
disablenpc "Sunbathing girl#ma_fild02"
disablenpc "Sitting man#ma_fild02"
disablenpc "Sitting woman#ma_fild02"
disablenpc "Wanderer#ma_fild02"
// ma_fild01 ============[OFF]==============
disablenpc "Bonfire#ma_fild01"
enablenpc "Extinct Bonfire#ma_fild01"
disablenpc "#plate1_ma_fild01"
disablenpc "#plate2_ma_fild01"
disablenpc "#plate3_ma_fild01"
disablenpc "#basket_ma_fild01"
disablenpc "Sunbathing girl#ma_fild01"
disablenpc "Sitting man#ma_fild01"
disablenpc "Sitting woman#ma_fild01"
disablenpc "Wanderer#ma_fild01"

return


npc "mjolnir_01" "#picnic_maker5016" HIDDEN_NPC 1 1 6 0 0
OnInit:
	InitTimer
return

// 30 min
// OnTimer: 1740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if (time_to_picnic < 2400000)
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 1800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5016" "begin_picnic"
	endif
return
	
OnTimer: 2100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if (time_to_picnic < 2400000)
		cmdothernpc "#picnic_maker5016" "end_picnic"
	endif
return
// 40 min 
// OnTimer: 2340000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 2400000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5016" "begin_picnic"
	endif
return
	
OnTimer: 2700000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3000000) & (time_to_picnic > 2400000))
		cmdothernpc "#picnic_maker5016" "end_picnic"
	endif
return
// 50 min 
// OnTimer: 2940000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3000000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5016" "begin_picnic"
	endif
return
	
OnTimer: 3300000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 3600000) & (time_to_picnic > 3000000))
		cmdothernpc "#picnic_maker5016" "end_picnic"
	endif
return
// 60 min 
// OnTimer: 3540000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 3600000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5016" "begin_picnic"
	endif
return
	
OnTimer: 3900000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4200000) & (time_to_picnic > 3600000))
		cmdothernpc "#picnic_maker5016" "end_picnic"
	endif
return
// 70 min 
// OnTimer: 4140000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4200000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5016" "begin_picnic"
	endif
return
	
OnTimer: 4500000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 4800000) & (time_to_picnic > 4200000))
		cmdothernpc "#picnic_maker5016" "end_picnic"
	endif
return
// 80 min 
// OnTimer: 4740000
	// var time_to_picnic = GetGlobalVar "time_to_picnic"
	// if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
	// endif
// return

OnTimer: 4800000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5016" "begin_picnic"
	endif
return
	
OnTimer: 5100000
	var time_to_picnic = GetGlobalVar "time_to_picnic"
	if ((time_to_picnic < 5400000) & (time_to_picnic > 4800000))
		cmdothernpc "#picnic_maker5016" "end_picnic"
	endif
return
// 90 min 
// OnTimer: 5340000
		// broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics in a minute! "
// return

OnTimer: 5400000
		cmdothernpc "#picnic_maker5016" "begin_picnic"
return
	
OnTimer: 5700000
		cmdothernpc "#picnic_maker5016" "end_picnic"
return

OnCommand: "begin_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics! "
	cmdothernpc "#picnic_maker5016" "on"
return

OnCommand: "end_picnic"
	//broadcastserver "FF0000" FW_NORMAL 10 0 0 "Picnics are over! "
	cmdothernpc "#picnic_maker5016" "off"
	
	stoptimer
	InitTimer
return

OnCommand: "on"
// mjolnir_01 ============[ON]==============
enablenpc "Bonfire#mjolnir_01"
disablenpc "Extinct Bonfire#mjolnir_01"
enablenpc "#plate1_mjolnir_01"
enablenpc "#plate2_mjolnir_01"
enablenpc "#plate3_mjolnir_01"
enablenpc "#basket_mjolnir_01"
enablenpc "Sunbathing girl#mjolnir_01"
enablenpc "Sitting man#mjolnir_01"
enablenpc "Sitting woman#mjolnir_01"
enablenpc "Wanderer#mjolnir_01"
// mjolnir_02 ============[ON]==============
enablenpc "Bonfire#mjolnir_02"
disablenpc "Extinct Bonfire#mjolnir_02"
enablenpc "#plate1_mjolnir_02"
enablenpc "#plate2_mjolnir_02"
enablenpc "#plate3_mjolnir_02"
enablenpc "#basket_mjolnir_02"
enablenpc "Sunbathing girl#mjolnir_02"
enablenpc "Sitting man#mjolnir_02"
enablenpc "Sitting woman#mjolnir_02"
enablenpc "Wanderer#mjolnir_02"
// mjolnir_03 ============[ON]==============
enablenpc "Bonfire#mjolnir_03"
disablenpc "Extinct Bonfire#mjolnir_03"
enablenpc "#plate1_mjolnir_03"
enablenpc "#plate2_mjolnir_03"
enablenpc "#plate3_mjolnir_03"
enablenpc "#basket_mjolnir_03"
enablenpc "Sunbathing girl#mjolnir_03"
enablenpc "Sitting man#mjolnir_03"
enablenpc "Sitting woman#mjolnir_03"
enablenpc "Wanderer#mjolnir_03"
// mjolnir_04 ============[ON]==============
enablenpc "Bonfire#mjolnir_04"
disablenpc "Extinct Bonfire#mjolnir_04"
enablenpc "#plate1_mjolnir_04"
enablenpc "#plate2_mjolnir_04"
enablenpc "#plate3_mjolnir_04"
enablenpc "#basket_mjolnir_04"
enablenpc "Sunbathing girl#mjolnir_04"
enablenpc "Sitting man#mjolnir_04"
enablenpc "Sitting woman#mjolnir_04"
enablenpc "Wanderer#mjolnir_04"
// mjolnir_05 ============[ON]==============
enablenpc "Bonfire#mjolnir_05"
disablenpc "Extinct Bonfire#mjolnir_05"
enablenpc "#plate1_mjolnir_05"
enablenpc "#plate2_mjolnir_05"
enablenpc "#plate3_mjolnir_05"
enablenpc "#basket_mjolnir_05"
enablenpc "Sunbathing girl#mjolnir_05"
enablenpc "Sitting man#mjolnir_05"
enablenpc "Sitting woman#mjolnir_05"
enablenpc "Wanderer#mjolnir_05"
// mjolnir_06 ============[ON]==============
enablenpc "Bonfire#mjolnir_06"
disablenpc "Extinct Bonfire#mjolnir_06"
enablenpc "#plate1_mjolnir_06"
enablenpc "#plate2_mjolnir_06"
enablenpc "#plate3_mjolnir_06"
enablenpc "#basket_mjolnir_06"
enablenpc "Sunbathing girl#mjolnir_06"
enablenpc "Sitting man#mjolnir_06"
enablenpc "Sitting woman#mjolnir_06"
enablenpc "Wanderer#mjolnir_06"
// mjolnir_07 ============[ON]==============
enablenpc "Bonfire#mjolnir_07"
disablenpc "Extinct Bonfire#mjolnir_07"
enablenpc "#plate1_mjolnir_07"
enablenpc "#plate2_mjolnir_07"
enablenpc "#plate3_mjolnir_07"
enablenpc "#basket_mjolnir_07"
enablenpc "Sunbathing girl#mjolnir_07"
enablenpc "Sitting man#mjolnir_07"
enablenpc "Sitting woman#mjolnir_07"
enablenpc "Wanderer#mjolnir_07"
// mjolnir_08 ============[ON]==============
enablenpc "Bonfire#mjolnir_08"
disablenpc "Extinct Bonfire#mjolnir_08"
enablenpc "#plate1_mjolnir_08"
enablenpc "#plate2_mjolnir_08"
enablenpc "#plate3_mjolnir_08"
enablenpc "#basket_mjolnir_08"
enablenpc "Sunbathing girl#mjolnir_08"
enablenpc "Sitting man#mjolnir_08"
enablenpc "Sitting woman#mjolnir_08"
enablenpc "Wanderer#mjolnir_08"
// mjolnir_09 ============[ON]==============
enablenpc "Bonfire#mjolnir_09"
disablenpc "Extinct Bonfire#mjolnir_09"
enablenpc "#plate1_mjolnir_09"
enablenpc "#plate2_mjolnir_09"
enablenpc "#plate3_mjolnir_09"
enablenpc "#basket_mjolnir_09"
enablenpc "Sunbathing girl#mjolnir_09"
enablenpc "Sitting man#mjolnir_09"
enablenpc "Sitting woman#mjolnir_09"
enablenpc "Wanderer#mjolnir_09"
// mjolnir_10 ============[ON]==============
enablenpc "Bonfire#mjolnir_10"
disablenpc "Extinct Bonfire#mjolnir_10"
enablenpc "#plate1_mjolnir_10"
enablenpc "#plate2_mjolnir_10"
enablenpc "#plate3_mjolnir_10"
enablenpc "#basket_mjolnir_10"
enablenpc "Sunbathing girl#mjolnir_10"
enablenpc "Sitting man#mjolnir_10"
enablenpc "Sitting woman#mjolnir_10"
enablenpc "Wanderer#mjolnir_10"
// mjolnir_11 ============[ON]==============
enablenpc "Bonfire#mjolnir_11"
disablenpc "Extinct Bonfire#mjolnir_11"
enablenpc "#plate1_mjolnir_11"
enablenpc "#plate2_mjolnir_11"
enablenpc "#plate3_mjolnir_11"
enablenpc "#basket_mjolnir_11"
enablenpc "Sunbathing girl#mjolnir_11"
enablenpc "Sitting man#mjolnir_11"
enablenpc "Sitting woman#mjolnir_11"
enablenpc "Wanderer#mjolnir_11"
// mjolnir_12 ============[ON]==============
enablenpc "Bonfire#mjolnir_12"
disablenpc "Extinct Bonfire#mjolnir_12"
enablenpc "#plate1_mjolnir_12"
enablenpc "#plate2_mjolnir_12"
enablenpc "#plate3_mjolnir_12"
enablenpc "#basket_mjolnir_12"
enablenpc "Sunbathing girl#mjolnir_12"
enablenpc "Sitting man#mjolnir_12"
enablenpc "Sitting woman#mjolnir_12"
enablenpc "Wanderer#mjolnir_12"

return

OnCommand: "off"

// mjolnir_01 ============[OFF]==============
disablenpc "Bonfire#mjolnir_01"
enablenpc "Extinct Bonfire#mjolnir_01"
disablenpc "#plate1_mjolnir_01"
disablenpc "#plate2_mjolnir_01"
disablenpc "#plate3_mjolnir_01"
disablenpc "#basket_mjolnir_01"
disablenpc "Sunbathing girl#mjolnir_01"
disablenpc "Sitting man#mjolnir_01"
disablenpc "Sitting woman#mjolnir_01"
disablenpc "Wanderer#mjolnir_01"
// mjolnir_02 ============[OFF]==============
disablenpc "Bonfire#mjolnir_02"
enablenpc "Extinct Bonfire#mjolnir_02"
disablenpc "#plate1_mjolnir_02"
disablenpc "#plate2_mjolnir_02"
disablenpc "#plate3_mjolnir_02"
disablenpc "#basket_mjolnir_02"
disablenpc "Sunbathing girl#mjolnir_02"
disablenpc "Sitting man#mjolnir_02"
disablenpc "Sitting woman#mjolnir_02"
disablenpc "Wanderer#mjolnir_02"
// mjolnir_03 ============[OFF]==============
disablenpc "Bonfire#mjolnir_03"
enablenpc "Extinct Bonfire#mjolnir_03"
disablenpc "#plate1_mjolnir_03"
disablenpc "#plate2_mjolnir_03"
disablenpc "#plate3_mjolnir_03"
disablenpc "#basket_mjolnir_03"
disablenpc "Sunbathing girl#mjolnir_03"
disablenpc "Sitting man#mjolnir_03"
disablenpc "Sitting woman#mjolnir_03"
disablenpc "Wanderer#mjolnir_03"
// mjolnir_04 ============[OFF]==============
disablenpc "Bonfire#mjolnir_04"
enablenpc "Extinct Bonfire#mjolnir_04"
disablenpc "#plate1_mjolnir_04"
disablenpc "#plate2_mjolnir_04"
disablenpc "#plate3_mjolnir_04"
disablenpc "#basket_mjolnir_04"
disablenpc "Sunbathing girl#mjolnir_04"
disablenpc "Sitting man#mjolnir_04"
disablenpc "Sitting woman#mjolnir_04"
disablenpc "Wanderer#mjolnir_04"
// mjolnir_05 ============[OFF]==============
disablenpc "Bonfire#mjolnir_05"
enablenpc "Extinct Bonfire#mjolnir_05"
disablenpc "#plate1_mjolnir_05"
disablenpc "#plate2_mjolnir_05"
disablenpc "#plate3_mjolnir_05"
disablenpc "#basket_mjolnir_05"
disablenpc "Sunbathing girl#mjolnir_05"
disablenpc "Sitting man#mjolnir_05"
disablenpc "Sitting woman#mjolnir_05"
disablenpc "Wanderer#mjolnir_05"
// mjolnir_06 ============[OFF]==============
disablenpc "Bonfire#mjolnir_06"
enablenpc "Extinct Bonfire#mjolnir_06"
disablenpc "#plate1_mjolnir_06"
disablenpc "#plate2_mjolnir_06"
disablenpc "#plate3_mjolnir_06"
disablenpc "#basket_mjolnir_06"
disablenpc "Sunbathing girl#mjolnir_06"
disablenpc "Sitting man#mjolnir_06"
disablenpc "Sitting woman#mjolnir_06"
disablenpc "Wanderer#mjolnir_06"
// mjolnir_07 ============[OFF]==============
disablenpc "Bonfire#mjolnir_07"
enablenpc "Extinct Bonfire#mjolnir_07"
disablenpc "#plate1_mjolnir_07"
disablenpc "#plate2_mjolnir_07"
disablenpc "#plate3_mjolnir_07"
disablenpc "#basket_mjolnir_07"
disablenpc "Sunbathing girl#mjolnir_07"
disablenpc "Sitting man#mjolnir_07"
disablenpc "Sitting woman#mjolnir_07"
disablenpc "Wanderer#mjolnir_07"
// mjolnir_08 ============[OFF]==============
disablenpc "Bonfire#mjolnir_08"
enablenpc "Extinct Bonfire#mjolnir_08"
disablenpc "#plate1_mjolnir_08"
disablenpc "#plate2_mjolnir_08"
disablenpc "#plate3_mjolnir_08"
disablenpc "#basket_mjolnir_08"
disablenpc "Sunbathing girl#mjolnir_08"
disablenpc "Sitting man#mjolnir_08"
disablenpc "Sitting woman#mjolnir_08"
disablenpc "Wanderer#mjolnir_08"
// mjolnir_09 ============[OFF]==============
disablenpc "Bonfire#mjolnir_09"
enablenpc "Extinct Bonfire#mjolnir_09"
disablenpc "#plate1_mjolnir_09"
disablenpc "#plate2_mjolnir_09"
disablenpc "#plate3_mjolnir_09"
disablenpc "#basket_mjolnir_09"
disablenpc "Sunbathing girl#mjolnir_09"
disablenpc "Sitting man#mjolnir_09"
disablenpc "Sitting woman#mjolnir_09"
disablenpc "Wanderer#mjolnir_09"
// mjolnir_10 ============[OFF]==============
disablenpc "Bonfire#mjolnir_10"
enablenpc "Extinct Bonfire#mjolnir_10"
disablenpc "#plate1_mjolnir_10"
disablenpc "#plate2_mjolnir_10"
disablenpc "#plate3_mjolnir_10"
disablenpc "#basket_mjolnir_10"
disablenpc "Sunbathing girl#mjolnir_10"
disablenpc "Sitting man#mjolnir_10"
disablenpc "Sitting woman#mjolnir_10"
disablenpc "Wanderer#mjolnir_10"
// mjolnir_11 ============[OFF]==============
disablenpc "Bonfire#mjolnir_11"
enablenpc "Extinct Bonfire#mjolnir_11"
disablenpc "#plate1_mjolnir_11"
disablenpc "#plate2_mjolnir_11"
disablenpc "#plate3_mjolnir_11"
disablenpc "#basket_mjolnir_11"
disablenpc "Sunbathing girl#mjolnir_11"
disablenpc "Sitting man#mjolnir_11"
disablenpc "Sitting woman#mjolnir_11"
disablenpc "Wanderer#mjolnir_11"
// mjolnir_12 ============[OFF]==============
disablenpc "Bonfire#mjolnir_12"
enablenpc "Extinct Bonfire#mjolnir_12"
disablenpc "#plate1_mjolnir_12"
disablenpc "#plate2_mjolnir_12"
disablenpc "#plate3_mjolnir_12"
disablenpc "#basket_mjolnir_12"
disablenpc "Sunbathing girl#mjolnir_12"
disablenpc "Sitting man#mjolnir_12"
disablenpc "Sitting woman#mjolnir_12"
disablenpc "Wanderer#mjolnir_12"
return


npc "prt_fild00" "Picnics on/off" 4_TRACE 217 266 5 0 0 
OnClick:
	dialog "WHAT "
	wait
	choose menu "Reset timer " "Picnics on " "Picnics off "
		case 1
			var random_time = 2000000 // rand 1800000 6000000
			SetGlobalVar "time_to_picnic" random_time
			stoptimer
			InitTimer
			dialog "--done--"
		break
		case 2
			cmdothernpc "#picnic_maker5001" "on"
			dialog "--done--"
		break
		case 3
			cmdothernpc "#picnic_maker5001" "off"
			dialog "--done--"
		break
	endchoose
return

// prt_fild00 ============[OFF]==============
npc "prt_fild00" "Extinct Bonfire#prt_fild00" 4_TRACE 217 274 5 0 0
return

// prt_fild00 ============[ON]==============
npc "prt_fild00" "Bonfire#prt_fild00" 4_BONFIRE 217 274 5 0 0
OnInit:
	disablenpc "Bonfire#prt_fild00"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#prt_fild00" "start"
        cmdothernpc "Sitting woman#prt_fild00" "start"
        cmdothernpc "Wanderer#prt_fild00" "start"
        cmdothernpc "Sunbathing girl#prt_fild00" "start"
    endif
return

npc "prt_fild00" "Sitting man#prt_fild00" 4_TOWER_02 214 274 6 0 0
OnInit:
	disablenpc "Sitting man#prt_fild00"
	strlocalvar 1 "status_prt_fild00"
	SetLocalVar "status_prt_fild00" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild00" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild00"] == 1)
        Talk2me "Sitting man#prt_fild00" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild00" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild00"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild00" "try_to_start"
	    wait
        if (lv["status_prt_fild00"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "prt_fild00" "Sunbathing girl#prt_fild00" 4_F_PATIENT 216 276 5 0 0
OnInit:
	disablenpc "Sunbathing girl#prt_fild00"
	strlocalvar 1 "status_prt_fild00"
	SetLocalVar "status_prt_fild00" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild00" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild00"] == 1)
        Talk2me "Sunbathing girl#prt_fild00" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild00" 0
    stoptimer
return
OnClick:
    if (lv["status_prt_fild00"] == 0)
        cmdothernpc "Bonfire#prt_fild00" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "prt_fild00" "Sitting woman#prt_fild00" 4_TOWER_07 220 275 3 0 0
OnInit:
	disablenpc "Sitting woman#prt_fild00"
	strlocalvar 1 "status_prt_fild00"
	SetLocalVar "status_prt_fild00" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild00" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild00"] == 1)
        Talk2me "Sitting woman#prt_fild00" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild00" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild00"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild00" "try_to_start"
	    wait
        if (lv["status_prt_fild00"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "prt_fild00" "Wanderer#prt_fild00" 4_F_05 218 273 1 0 0
OnInit:
	disablenpc "Wanderer#prt_fild00"
	strlocalvar 1 "status_prt_fild00"
	SetLocalVar "status_prt_fild00" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild00" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild00"] == 1)
        Talk2me "Wanderer#prt_fild00" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild00" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild00"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild00" "try_to_start"
	    wait
        if (lv["status_prt_fild00"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "prt_fild00" "#plate1_prt_fild00" GLASS_PLATE 217 276 5 0 0
OnInit:
	disablenpc "#plate1_prt_fild00"
return

npc "prt_fild00" "#plate2_prt_fild00" GLASS_PLATE 214 273 5 0 0
OnInit:
	disablenpc "#plate2_prt_fild00"
return

npc "prt_fild00" "#plate3_prt_fild00" GLASS_PLATE 220 274 5 0 0
OnInit:
	disablenpc "#plate3_prt_fild00"
return

npc "prt_fild00" "#basket_prt_fild00" 4_ROPEPILE 214 270 5 0 0
OnInit:
	disablenpc "#basket_prt_fild00"
return

// prt_fild01 ============[OFF]==============
npc "prt_fild01" "Extinct Bonfire#prt_fild01" 4_TRACE 101 186 5 0 0
return

// prt_fild01 ============[ON]==============
npc "prt_fild01" "Bonfire#prt_fild01" 4_BONFIRE 101 186 5 0 0
OnInit:
	disablenpc "Bonfire#prt_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#prt_fild01" "start"
        cmdothernpc "Sitting woman#prt_fild01" "start"
        cmdothernpc "Wanderer#prt_fild01" "start"
        cmdothernpc "Sunbathing girl#prt_fild01" "start"
    endif
return

npc "prt_fild01" "Sitting man#prt_fild01" 4_TOWER_02 98 186 6 0 0
OnInit:
	disablenpc "Sitting man#prt_fild01"
	strlocalvar 1 "status_prt_fild01"
	SetLocalVar "status_prt_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild01"] == 1)
        Talk2me "Sitting man#prt_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild01" "try_to_start"
	    wait
        if (lv["status_prt_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "prt_fild01" "Sunbathing girl#prt_fild01" 4_F_PATIENT 100 188 5 0 0
OnInit:
	disablenpc "Sunbathing girl#prt_fild01"
	strlocalvar 1 "status_prt_fild01"
	SetLocalVar "status_prt_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild01"] == 1)
        Talk2me "Sunbathing girl#prt_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_prt_fild01"] == 0)
        cmdothernpc "Bonfire#prt_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "prt_fild01" "Sitting woman#prt_fild01" 4_TOWER_07 104 187 3 0 0
OnInit:
	disablenpc "Sitting woman#prt_fild01"
	strlocalvar 1 "status_prt_fild01"
	SetLocalVar "status_prt_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild01"] == 1)
        Talk2me "Sitting woman#prt_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild01" "try_to_start"
	    wait
        if (lv["status_prt_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "prt_fild01" "Wanderer#prt_fild01" 4_F_05 102 185 1 0 0
OnInit:
	disablenpc "Wanderer#prt_fild01"
	strlocalvar 1 "status_prt_fild01"
	SetLocalVar "status_prt_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild01"] == 1)
        Talk2me "Wanderer#prt_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild01" "try_to_start"
	    wait
        if (lv["status_prt_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "prt_fild01" "#plate1_prt_fild01" GLASS_PLATE 101 188 5 0 0
OnInit:
	disablenpc "#plate1_prt_fild01"
return

npc "prt_fild01" "#plate2_prt_fild01" GLASS_PLATE 98 185 5 0 0
OnInit:
	disablenpc "#plate2_prt_fild01"
return

npc "prt_fild01" "#plate3_prt_fild01" GLASS_PLATE 104 186 5 0 0
OnInit:
	disablenpc "#plate3_prt_fild01"
return

npc "prt_fild01" "#basket_prt_fild01" 4_ROPEPILE 98 182 5 0 0
OnInit:
	disablenpc "#basket_prt_fild01"
return

// prt_fild02 ============[OFF]==============
npc "prt_fild02" "Extinct Bonfire#prt_fild02" 4_TRACE 137 149 5 0 0
return

// prt_fild02 ============[ON]==============
npc "prt_fild02" "Bonfire#prt_fild02" 4_BONFIRE 137 149 5 0 0
OnInit:
	disablenpc "Bonfire#prt_fild02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#prt_fild02" "start"
        cmdothernpc "Sitting woman#prt_fild02" "start"
        cmdothernpc "Wanderer#prt_fild02" "start"
        cmdothernpc "Sunbathing girl#prt_fild02" "start"
    endif
return

npc "prt_fild02" "Sitting man#prt_fild02" 4_TOWER_02 134 149 6 0 0
OnInit:
	disablenpc "Sitting man#prt_fild02"
	strlocalvar 1 "status_prt_fild02"
	SetLocalVar "status_prt_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild02"] == 1)
        Talk2me "Sitting man#prt_fild02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild02" "try_to_start"
	    wait
        if (lv["status_prt_fild02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "prt_fild02" "Sunbathing girl#prt_fild02" 4_F_PATIENT 136 151 5 0 0
OnInit:
	disablenpc "Sunbathing girl#prt_fild02"
	strlocalvar 1 "status_prt_fild02"
	SetLocalVar "status_prt_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild02"] == 1)
        Talk2me "Sunbathing girl#prt_fild02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild02" 0
    stoptimer
return
OnClick:
    if (lv["status_prt_fild02"] == 0)
        cmdothernpc "Bonfire#prt_fild02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "prt_fild02" "Sitting woman#prt_fild02" 4_TOWER_07 140 150 3 0 0
OnInit:
	disablenpc "Sitting woman#prt_fild02"
	strlocalvar 1 "status_prt_fild02"
	SetLocalVar "status_prt_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild02"] == 1)
        Talk2me "Sitting woman#prt_fild02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild02" "try_to_start"
	    wait
        if (lv["status_prt_fild02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "prt_fild02" "Wanderer#prt_fild02" 4_F_05 138 148 1 0 0
OnInit:
	disablenpc "Wanderer#prt_fild02"
	strlocalvar 1 "status_prt_fild02"
	SetLocalVar "status_prt_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild02"] == 1)
        Talk2me "Wanderer#prt_fild02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild02" "try_to_start"
	    wait
        if (lv["status_prt_fild02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "prt_fild02" "#plate1_prt_fild02" GLASS_PLATE 137 151 5 0 0
OnInit:
	disablenpc "#plate1_prt_fild02"
return

npc "prt_fild02" "#plate2_prt_fild02" GLASS_PLATE 134 148 5 0 0
OnInit:
	disablenpc "#plate2_prt_fild02"
return

npc "prt_fild02" "#plate3_prt_fild02" GLASS_PLATE 140 149 5 0 0
OnInit:
	disablenpc "#plate3_prt_fild02"
return

npc "prt_fild02" "#basket_prt_fild02" 4_ROPEPILE 134 145 5 0 0
OnInit:
	disablenpc "#basket_prt_fild02"
return

// prt_fild03 ============[OFF]==============
npc "prt_fild03" "Extinct Bonfire#prt_fild03" 4_TRACE 152 162 5 0 0
return

// prt_fild03 ============[ON]==============
npc "prt_fild03" "Bonfire#prt_fild03" 4_BONFIRE 152 162 5 0 0
OnInit:
	disablenpc "Bonfire#prt_fild03"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#prt_fild03" "start"
        cmdothernpc "Sitting woman#prt_fild03" "start"
        cmdothernpc "Wanderer#prt_fild03" "start"
        cmdothernpc "Sunbathing girl#prt_fild03" "start"
    endif
return

npc "prt_fild03" "Sitting man#prt_fild03" 4_TOWER_02 149 162 6 0 0
OnInit:
	disablenpc "Sitting man#prt_fild03"
	strlocalvar 1 "status_prt_fild03"
	SetLocalVar "status_prt_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild03"] == 1)
        Talk2me "Sitting man#prt_fild03" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild03"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild03" "try_to_start"
	    wait
        if (lv["status_prt_fild03"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "prt_fild03" "Sunbathing girl#prt_fild03" 4_F_PATIENT 151 164 5 0 0
OnInit:
	disablenpc "Sunbathing girl#prt_fild03"
	strlocalvar 1 "status_prt_fild03"
	SetLocalVar "status_prt_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild03"] == 1)
        Talk2me "Sunbathing girl#prt_fild03" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild03" 0
    stoptimer
return
OnClick:
    if (lv["status_prt_fild03"] == 0)
        cmdothernpc "Bonfire#prt_fild03" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "prt_fild03" "Sitting woman#prt_fild03" 4_TOWER_07 155 163 3 0 0
OnInit:
	disablenpc "Sitting woman#prt_fild03"
	strlocalvar 1 "status_prt_fild03"
	SetLocalVar "status_prt_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild03"] == 1)
        Talk2me "Sitting woman#prt_fild03" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild03"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild03" "try_to_start"
	    wait
        if (lv["status_prt_fild03"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "prt_fild03" "Wanderer#prt_fild03" 4_F_05 153 161 1 0 0
OnInit:
	disablenpc "Wanderer#prt_fild03"
	strlocalvar 1 "status_prt_fild03"
	SetLocalVar "status_prt_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild03"] == 1)
        Talk2me "Wanderer#prt_fild03" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild03"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild03" "try_to_start"
	    wait
        if (lv["status_prt_fild03"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "prt_fild03" "#plate1_prt_fild03" GLASS_PLATE 152 164 5 0 0
OnInit:
	disablenpc "#plate1_prt_fild03"
return

npc "prt_fild03" "#plate2_prt_fild03" GLASS_PLATE 149 161 5 0 0
OnInit:
	disablenpc "#plate2_prt_fild03"
return

npc "prt_fild03" "#plate3_prt_fild03" GLASS_PLATE 155 162 5 0 0
OnInit:
	disablenpc "#plate3_prt_fild03"
return

npc "prt_fild03" "#basket_prt_fild03" 4_ROPEPILE 149 158 5 0 0
OnInit:
	disablenpc "#basket_prt_fild03"
return

// prt_fild04 ============[OFF]==============
npc "prt_fild04" "Extinct Bonfire#prt_fild04" 4_TRACE 173 116 5 0 0
return

// prt_fild04 ============[ON]==============
npc "prt_fild04" "Bonfire#prt_fild04" 4_BONFIRE 173 116 5 0 0
OnInit:
	disablenpc "Bonfire#prt_fild04"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#prt_fild04" "start"
        cmdothernpc "Sitting woman#prt_fild04" "start"
        cmdothernpc "Wanderer#prt_fild04" "start"
        cmdothernpc "Sunbathing girl#prt_fild04" "start"
    endif
return

npc "prt_fild04" "Sitting man#prt_fild04" 4_TOWER_02 170 116 6 0 0
OnInit:
	disablenpc "Sitting man#prt_fild04"
	strlocalvar 1 "status_prt_fild04"
	SetLocalVar "status_prt_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild04"] == 1)
        Talk2me "Sitting man#prt_fild04" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild04"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild04" "try_to_start"
	    wait
        if (lv["status_prt_fild04"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "prt_fild04" "Sunbathing girl#prt_fild04" 4_F_PATIENT 172 118 5 0 0
OnInit:
	disablenpc "Sunbathing girl#prt_fild04"
	strlocalvar 1 "status_prt_fild04"
	SetLocalVar "status_prt_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild04"] == 1)
        Talk2me "Sunbathing girl#prt_fild04" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild04" 0
    stoptimer
return
OnClick:
    if (lv["status_prt_fild04"] == 0)
        cmdothernpc "Bonfire#prt_fild04" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "prt_fild04" "Sitting woman#prt_fild04" 4_TOWER_07 176 117 3 0 0
OnInit:
	disablenpc "Sitting woman#prt_fild04"
	strlocalvar 1 "status_prt_fild04"
	SetLocalVar "status_prt_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild04"] == 1)
        Talk2me "Sitting woman#prt_fild04" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild04"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild04" "try_to_start"
	    wait
        if (lv["status_prt_fild04"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "prt_fild04" "Wanderer#prt_fild04" 4_F_05 174 115 1 0 0
OnInit:
	disablenpc "Wanderer#prt_fild04"
	strlocalvar 1 "status_prt_fild04"
	SetLocalVar "status_prt_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild04"] == 1)
        Talk2me "Wanderer#prt_fild04" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild04"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild04" "try_to_start"
	    wait
        if (lv["status_prt_fild04"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "prt_fild04" "#plate1_prt_fild04" GLASS_PLATE 173 118 5 0 0
OnInit:
	disablenpc "#plate1_prt_fild04"
return

npc "prt_fild04" "#plate2_prt_fild04" GLASS_PLATE 170 115 5 0 0
OnInit:
	disablenpc "#plate2_prt_fild04"
return

npc "prt_fild04" "#plate3_prt_fild04" GLASS_PLATE 176 116 5 0 0
OnInit:
	disablenpc "#plate3_prt_fild04"
return

npc "prt_fild04" "#basket_prt_fild04" 4_ROPEPILE 170 112 5 0 0
OnInit:
	disablenpc "#basket_prt_fild04"
return

// prt_fild05 ============[OFF]==============
npc "prt_fild05" "Extinct Bonfire#prt_fild05" 4_TRACE 218 239 5 0 0
return

// prt_fild05 ============[ON]==============
npc "prt_fild05" "Bonfire#prt_fild05" 4_BONFIRE 218 239 5 0 0
OnInit:
	disablenpc "Bonfire#prt_fild05"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#prt_fild05" "start"
        cmdothernpc "Sitting woman#prt_fild05" "start"
        cmdothernpc "Wanderer#prt_fild05" "start"
        cmdothernpc "Sunbathing girl#prt_fild05" "start"
    endif
return

npc "prt_fild05" "Sitting man#prt_fild05" 4_TOWER_02 215 239 6 0 0
OnInit:
	disablenpc "Sitting man#prt_fild05"
	strlocalvar 1 "status_prt_fild05"
	SetLocalVar "status_prt_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild05"] == 1)
        Talk2me "Sitting man#prt_fild05" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild05"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild05" "try_to_start"
	    wait
        if (lv["status_prt_fild05"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "prt_fild05" "Sunbathing girl#prt_fild05" 4_F_PATIENT 217 241 5 0 0
OnInit:
	disablenpc "Sunbathing girl#prt_fild05"
	strlocalvar 1 "status_prt_fild05"
	SetLocalVar "status_prt_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild05"] == 1)
        Talk2me "Sunbathing girl#prt_fild05" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild05" 0
    stoptimer
return
OnClick:
    if (lv["status_prt_fild05"] == 0)
        cmdothernpc "Bonfire#prt_fild05" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "prt_fild05" "Sitting woman#prt_fild05" 4_TOWER_07 221 240 3 0 0
OnInit:
	disablenpc "Sitting woman#prt_fild05"
	strlocalvar 1 "status_prt_fild05"
	SetLocalVar "status_prt_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild05"] == 1)
        Talk2me "Sitting woman#prt_fild05" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild05"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild05" "try_to_start"
	    wait
        if (lv["status_prt_fild05"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "prt_fild05" "Wanderer#prt_fild05" 4_F_05 219 238 1 0 0
OnInit:
	disablenpc "Wanderer#prt_fild05"
	strlocalvar 1 "status_prt_fild05"
	SetLocalVar "status_prt_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild05"] == 1)
        Talk2me "Wanderer#prt_fild05" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild05"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild05" "try_to_start"
	    wait
        if (lv["status_prt_fild05"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "prt_fild05" "#plate1_prt_fild05" GLASS_PLATE 218 241 5 0 0
OnInit:
	disablenpc "#plate1_prt_fild05"
return

npc "prt_fild05" "#plate2_prt_fild05" GLASS_PLATE 215 238 5 0 0
OnInit:
	disablenpc "#plate2_prt_fild05"
return

npc "prt_fild05" "#plate3_prt_fild05" GLASS_PLATE 221 239 5 0 0
OnInit:
	disablenpc "#plate3_prt_fild05"
return

npc "prt_fild05" "#basket_prt_fild05" 4_ROPEPILE 215 235 5 0 0
OnInit:
	disablenpc "#basket_prt_fild05"
return

// prt_fild06 ============[OFF]==============
npc "prt_fild06" "Extinct Bonfire#prt_fild06" 4_TRACE 195 183 5 0 0
return

// prt_fild06 ============[ON]==============
npc "prt_fild06" "Bonfire#prt_fild06" 4_BONFIRE 195 183 5 0 0
OnInit:
	disablenpc "Bonfire#prt_fild06"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#prt_fild06" "start"
        cmdothernpc "Sitting woman#prt_fild06" "start"
        cmdothernpc "Wanderer#prt_fild06" "start"
        cmdothernpc "Sunbathing girl#prt_fild06" "start"
    endif
return

npc "prt_fild06" "Sitting man#prt_fild06" 4_TOWER_02 192 183 6 0 0
OnInit:
	disablenpc "Sitting man#prt_fild06"
	strlocalvar 1 "status_prt_fild06"
	SetLocalVar "status_prt_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild06"] == 1)
        Talk2me "Sitting man#prt_fild06" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild06" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild06"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild06" "try_to_start"
	    wait
        if (lv["status_prt_fild06"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "prt_fild06" "Sunbathing girl#prt_fild06" 4_F_PATIENT 194 185 5 0 0
OnInit:
	disablenpc "Sunbathing girl#prt_fild06"
	strlocalvar 1 "status_prt_fild06"
	SetLocalVar "status_prt_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild06"] == 1)
        Talk2me "Sunbathing girl#prt_fild06" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild06" 0
    stoptimer
return
OnClick:
    if (lv["status_prt_fild06"] == 0)
        cmdothernpc "Bonfire#prt_fild06" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "prt_fild06" "Sitting woman#prt_fild06" 4_TOWER_07 198 184 3 0 0
OnInit:
	disablenpc "Sitting woman#prt_fild06"
	strlocalvar 1 "status_prt_fild06"
	SetLocalVar "status_prt_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild06"] == 1)
        Talk2me "Sitting woman#prt_fild06" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild06" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild06"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild06" "try_to_start"
	    wait
        if (lv["status_prt_fild06"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "prt_fild06" "Wanderer#prt_fild06" 4_F_05 196 182 1 0 0
OnInit:
	disablenpc "Wanderer#prt_fild06"
	strlocalvar 1 "status_prt_fild06"
	SetLocalVar "status_prt_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild06"] == 1)
        Talk2me "Wanderer#prt_fild06" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild06" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild06"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild06" "try_to_start"
	    wait
        if (lv["status_prt_fild06"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "prt_fild06" "#plate1_prt_fild06" GLASS_PLATE 195 185 5 0 0
OnInit:
	disablenpc "#plate1_prt_fild06"
return

npc "prt_fild06" "#plate2_prt_fild06" GLASS_PLATE 192 182 5 0 0
OnInit:
	disablenpc "#plate2_prt_fild06"
return

npc "prt_fild06" "#plate3_prt_fild06" GLASS_PLATE 198 183 5 0 0
OnInit:
	disablenpc "#plate3_prt_fild06"
return

npc "prt_fild06" "#basket_prt_fild06" 4_ROPEPILE 192 179 5 0 0
OnInit:
	disablenpc "#basket_prt_fild06"
return

// gef_fild00 ============[OFF]==============
npc "gef_fild00" "Extinct Bonfire#gef_fild00" 4_TRACE 206 246 5 0 0
return

// gef_fild00 ============[ON]==============
npc "gef_fild00" "Bonfire#gef_fild00" 4_BONFIRE 206 246 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild00"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild00" "start"
        cmdothernpc "Sitting woman#gef_fild00" "start"
        cmdothernpc "Wanderer#gef_fild00" "start"
        cmdothernpc "Sunbathing girl#gef_fild00" "start"
    endif
return

npc "gef_fild00" "Sitting man#gef_fild00" 4_TOWER_02 203 246 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild00"
	strlocalvar 1 "status_gef_fild00"
	SetLocalVar "status_gef_fild00" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild00" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild00"] == 1)
        Talk2me "Sitting man#gef_fild00" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild00" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild00"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild00" "try_to_start"
	    wait
        if (lv["status_gef_fild00"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild00" "Sunbathing girl#gef_fild00" 4_F_PATIENT 205 248 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild00"
	strlocalvar 1 "status_gef_fild00"
	SetLocalVar "status_gef_fild00" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild00" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild00"] == 1)
        Talk2me "Sunbathing girl#gef_fild00" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild00" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild00"] == 0)
        cmdothernpc "Bonfire#gef_fild00" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild00" "Sitting woman#gef_fild00" 4_TOWER_07 209 247 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild00"
	strlocalvar 1 "status_gef_fild00"
	SetLocalVar "status_gef_fild00" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild00" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild00"] == 1)
        Talk2me "Sitting woman#gef_fild00" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild00" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild00"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild00" "try_to_start"
	    wait
        if (lv["status_gef_fild00"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild00" "Wanderer#gef_fild00" 4_F_05 207 245 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild00"
	strlocalvar 1 "status_gef_fild00"
	SetLocalVar "status_gef_fild00" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild00" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild00"] == 1)
        Talk2me "Wanderer#gef_fild00" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild00" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild00"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild00" "try_to_start"
	    wait
        if (lv["status_gef_fild00"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild00" "#plate1_gef_fild00" GLASS_PLATE 206 248 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild00"
return

npc "gef_fild00" "#plate2_gef_fild00" GLASS_PLATE 203 245 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild00"
return

npc "gef_fild00" "#plate3_gef_fild00" GLASS_PLATE 209 246 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild00"
return

npc "gef_fild00" "#basket_gef_fild00" 4_ROPEPILE 203 242 5 0 0
OnInit:
	disablenpc "#basket_gef_fild00"
return

// gef_fild01 ============[OFF]==============
npc "gef_fild01" "Extinct Bonfire#gef_fild01" 4_TRACE 194 149 5 0 0
return

// gef_fild01 ============[ON]==============
npc "gef_fild01" "Bonfire#gef_fild01" 4_BONFIRE 194 149 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild01" "start"
        cmdothernpc "Sitting woman#gef_fild01" "start"
        cmdothernpc "Wanderer#gef_fild01" "start"
        cmdothernpc "Sunbathing girl#gef_fild01" "start"
    endif
return

npc "gef_fild01" "Sitting man#gef_fild01" 4_TOWER_02 191 149 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild01"
	strlocalvar 1 "status_gef_fild01"
	SetLocalVar "status_gef_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild01"] == 1)
        Talk2me "Sitting man#gef_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild01" "try_to_start"
	    wait
        if (lv["status_gef_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild01" "Sunbathing girl#gef_fild01" 4_F_PATIENT 193 151 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild01"
	strlocalvar 1 "status_gef_fild01"
	SetLocalVar "status_gef_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild01"] == 1)
        Talk2me "Sunbathing girl#gef_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild01"] == 0)
        cmdothernpc "Bonfire#gef_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild01" "Sitting woman#gef_fild01" 4_TOWER_07 197 150 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild01"
	strlocalvar 1 "status_gef_fild01"
	SetLocalVar "status_gef_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild01"] == 1)
        Talk2me "Sitting woman#gef_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild01" "try_to_start"
	    wait
        if (lv["status_gef_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild01" "Wanderer#gef_fild01" 4_F_05 195 148 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild01"
	strlocalvar 1 "status_gef_fild01"
	SetLocalVar "status_gef_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild01"] == 1)
        Talk2me "Wanderer#gef_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild01" "try_to_start"
	    wait
        if (lv["status_gef_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild01" "#plate1_gef_fild01" GLASS_PLATE 194 151 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild01"
return

npc "gef_fild01" "#plate2_gef_fild01" GLASS_PLATE 191 148 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild01"
return

npc "gef_fild01" "#plate3_gef_fild01" GLASS_PLATE 197 149 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild01"
return

npc "gef_fild01" "#basket_gef_fild01" 4_ROPEPILE 191 145 5 0 0
OnInit:
	disablenpc "#basket_gef_fild01"
return

// gef_fild02 ============[OFF]==============
npc "gef_fild02" "Extinct Bonfire#gef_fild02" 4_TRACE 193 238 5 0 0
return

// gef_fild02 ============[ON]==============
npc "gef_fild02" "Bonfire#gef_fild02" 4_BONFIRE 193 238 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild02" "start"
        cmdothernpc "Sitting woman#gef_fild02" "start"
        cmdothernpc "Wanderer#gef_fild02" "start"
        cmdothernpc "Sunbathing girl#gef_fild02" "start"
    endif
return

npc "gef_fild02" "Sitting man#gef_fild02" 4_TOWER_02 190 238 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild02"
	strlocalvar 1 "status_gef_fild02"
	SetLocalVar "status_gef_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild02"] == 1)
        Talk2me "Sitting man#gef_fild02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild02" "try_to_start"
	    wait
        if (lv["status_gef_fild02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild02" "Sunbathing girl#gef_fild02" 4_F_PATIENT 192 240 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild02"
	strlocalvar 1 "status_gef_fild02"
	SetLocalVar "status_gef_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild02"] == 1)
        Talk2me "Sunbathing girl#gef_fild02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild02" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild02"] == 0)
        cmdothernpc "Bonfire#gef_fild02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild02" "Sitting woman#gef_fild02" 4_TOWER_07 196 239 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild02"
	strlocalvar 1 "status_gef_fild02"
	SetLocalVar "status_gef_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild02"] == 1)
        Talk2me "Sitting woman#gef_fild02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild02" "try_to_start"
	    wait
        if (lv["status_gef_fild02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild02" "Wanderer#gef_fild02" 4_F_05 194 237 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild02"
	strlocalvar 1 "status_gef_fild02"
	SetLocalVar "status_gef_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild02"] == 1)
        Talk2me "Wanderer#gef_fild02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild02" "try_to_start"
	    wait
        if (lv["status_gef_fild02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild02" "#plate1_gef_fild02" GLASS_PLATE 193 240 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild02"
return

npc "gef_fild02" "#plate2_gef_fild02" GLASS_PLATE 190 237 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild02"
return

npc "gef_fild02" "#plate3_gef_fild02" GLASS_PLATE 196 238 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild02"
return

npc "gef_fild02" "#basket_gef_fild02" 4_ROPEPILE 190 234 5 0 0
OnInit:
	disablenpc "#basket_gef_fild02"
return

// gef_fild03 ============[OFF]==============
npc "gef_fild03" "Extinct Bonfire#gef_fild03" 4_TRACE 225 214 5 0 0
return

// gef_fild03 ============[ON]==============
npc "gef_fild03" "Bonfire#gef_fild03" 4_BONFIRE 225 214 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild03"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild03" "start"
        cmdothernpc "Sitting woman#gef_fild03" "start"
        cmdothernpc "Wanderer#gef_fild03" "start"
        cmdothernpc "Sunbathing girl#gef_fild03" "start"
    endif
return

npc "gef_fild03" "Sitting man#gef_fild03" 4_TOWER_02 222 214 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild03"
	strlocalvar 1 "status_gef_fild03"
	SetLocalVar "status_gef_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild03"] == 1)
        Talk2me "Sitting man#gef_fild03" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild03"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild03" "try_to_start"
	    wait
        if (lv["status_gef_fild03"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild03" "Sunbathing girl#gef_fild03" 4_F_PATIENT 224 216 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild03"
	strlocalvar 1 "status_gef_fild03"
	SetLocalVar "status_gef_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild03"] == 1)
        Talk2me "Sunbathing girl#gef_fild03" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild03" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild03"] == 0)
        cmdothernpc "Bonfire#gef_fild03" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild03" "Sitting woman#gef_fild03" 4_TOWER_07 228 215 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild03"
	strlocalvar 1 "status_gef_fild03"
	SetLocalVar "status_gef_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild03"] == 1)
        Talk2me "Sitting woman#gef_fild03" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild03"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild03" "try_to_start"
	    wait
        if (lv["status_gef_fild03"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild03" "Wanderer#gef_fild03" 4_F_05 226 213 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild03"
	strlocalvar 1 "status_gef_fild03"
	SetLocalVar "status_gef_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild03"] == 1)
        Talk2me "Wanderer#gef_fild03" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild03"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild03" "try_to_start"
	    wait
        if (lv["status_gef_fild03"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild03" "#plate1_gef_fild03" GLASS_PLATE 225 216 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild03"
return

npc "gef_fild03" "#plate2_gef_fild03" GLASS_PLATE 222 213 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild03"
return

npc "gef_fild03" "#plate3_gef_fild03" GLASS_PLATE 228 214 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild03"
return

npc "gef_fild03" "#basket_gef_fild03" 4_ROPEPILE 222 210 5 0 0
OnInit:
	disablenpc "#basket_gef_fild03"
return

// gef_fild04 ============[OFF]==============
npc "gef_fild04" "Extinct Bonfire#gef_fild04" 4_TRACE 154 277 5 0 0
return

// gef_fild04 ============[ON]==============
npc "gef_fild04" "Bonfire#gef_fild04" 4_BONFIRE 154 277 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild04"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild04" "start"
        cmdothernpc "Sitting woman#gef_fild04" "start"
        cmdothernpc "Wanderer#gef_fild04" "start"
        cmdothernpc "Sunbathing girl#gef_fild04" "start"
    endif
return

npc "gef_fild04" "Sitting man#gef_fild04" 4_TOWER_02 151 277 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild04"
	strlocalvar 1 "status_gef_fild04"
	SetLocalVar "status_gef_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild04"] == 1)
        Talk2me "Sitting man#gef_fild04" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild04"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild04" "try_to_start"
	    wait
        if (lv["status_gef_fild04"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild04" "Sunbathing girl#gef_fild04" 4_F_PATIENT 153 279 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild04"
	strlocalvar 1 "status_gef_fild04"
	SetLocalVar "status_gef_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild04"] == 1)
        Talk2me "Sunbathing girl#gef_fild04" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild04" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild04"] == 0)
        cmdothernpc "Bonfire#gef_fild04" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild04" "Sitting woman#gef_fild04" 4_TOWER_07 157 278 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild04"
	strlocalvar 1 "status_gef_fild04"
	SetLocalVar "status_gef_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild04"] == 1)
        Talk2me "Sitting woman#gef_fild04" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild04"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild04" "try_to_start"
	    wait
        if (lv["status_gef_fild04"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild04" "Wanderer#gef_fild04" 4_F_05 155 276 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild04"
	strlocalvar 1 "status_gef_fild04"
	SetLocalVar "status_gef_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild04"] == 1)
        Talk2me "Wanderer#gef_fild04" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild04"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild04" "try_to_start"
	    wait
        if (lv["status_gef_fild04"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild04" "#plate1_gef_fild04" GLASS_PLATE 154 279 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild04"
return

npc "gef_fild04" "#plate2_gef_fild04" GLASS_PLATE 151 276 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild04"
return

npc "gef_fild04" "#plate3_gef_fild04" GLASS_PLATE 157 277 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild04"
return

npc "gef_fild04" "#basket_gef_fild04" 4_ROPEPILE 151 273 5 0 0
OnInit:
	disablenpc "#basket_gef_fild04"
return

// gef_fild05 ============[OFF]==============
npc "gef_fild05" "Extinct Bonfire#gef_fild05" 4_TRACE 211 257 5 0 0
return

// gef_fild05 ============[ON]==============
npc "gef_fild05" "Bonfire#gef_fild05" 4_BONFIRE 211 257 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild05"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild05" "start"
        cmdothernpc "Sitting woman#gef_fild05" "start"
        cmdothernpc "Wanderer#gef_fild05" "start"
        cmdothernpc "Sunbathing girl#gef_fild05" "start"
    endif
return

npc "gef_fild05" "Sitting man#gef_fild05" 4_TOWER_02 208 257 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild05"
	strlocalvar 1 "status_gef_fild05"
	SetLocalVar "status_gef_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild05"] == 1)
        Talk2me "Sitting man#gef_fild05" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild05"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild05" "try_to_start"
	    wait
        if (lv["status_gef_fild05"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild05" "Sunbathing girl#gef_fild05" 4_F_PATIENT 210 259 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild05"
	strlocalvar 1 "status_gef_fild05"
	SetLocalVar "status_gef_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild05"] == 1)
        Talk2me "Sunbathing girl#gef_fild05" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild05" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild05"] == 0)
        cmdothernpc "Bonfire#gef_fild05" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild05" "Sitting woman#gef_fild05" 4_TOWER_07 214 258 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild05"
	strlocalvar 1 "status_gef_fild05"
	SetLocalVar "status_gef_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild05"] == 1)
        Talk2me "Sitting woman#gef_fild05" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild05"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild05" "try_to_start"
	    wait
        if (lv["status_gef_fild05"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild05" "Wanderer#gef_fild05" 4_F_05 212 256 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild05"
	strlocalvar 1 "status_gef_fild05"
	SetLocalVar "status_gef_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild05"] == 1)
        Talk2me "Wanderer#gef_fild05" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild05"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild05" "try_to_start"
	    wait
        if (lv["status_gef_fild05"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild05" "#plate1_gef_fild05" GLASS_PLATE 211 259 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild05"
return

npc "gef_fild05" "#plate2_gef_fild05" GLASS_PLATE 208 256 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild05"
return

npc "gef_fild05" "#plate3_gef_fild05" GLASS_PLATE 214 257 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild05"
return

npc "gef_fild05" "#basket_gef_fild05" 4_ROPEPILE 208 253 5 0 0
OnInit:
	disablenpc "#basket_gef_fild05"
return

// gef_fild06 ============[OFF]==============
npc "gef_fild06" "Extinct Bonfire#gef_fild06" 4_TRACE 157 191 5 0 0
return

// gef_fild06 ============[ON]==============
npc "gef_fild06" "Bonfire#gef_fild06" 4_BONFIRE 157 191 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild06"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild06" "start"
        cmdothernpc "Sitting woman#gef_fild06" "start"
        cmdothernpc "Wanderer#gef_fild06" "start"
        cmdothernpc "Sunbathing girl#gef_fild06" "start"
    endif
return

npc "gef_fild06" "Sitting man#gef_fild06" 4_TOWER_02 154 191 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild06"
	strlocalvar 1 "status_gef_fild06"
	SetLocalVar "status_gef_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild06"] == 1)
        Talk2me "Sitting man#gef_fild06" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild06" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild06"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild06" "try_to_start"
	    wait
        if (lv["status_gef_fild06"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild06" "Sunbathing girl#gef_fild06" 4_F_PATIENT 156 193 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild06"
	strlocalvar 1 "status_gef_fild06"
	SetLocalVar "status_gef_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild06"] == 1)
        Talk2me "Sunbathing girl#gef_fild06" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild06" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild06"] == 0)
        cmdothernpc "Bonfire#gef_fild06" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild06" "Sitting woman#gef_fild06" 4_TOWER_07 160 192 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild06"
	strlocalvar 1 "status_gef_fild06"
	SetLocalVar "status_gef_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild06"] == 1)
        Talk2me "Sitting woman#gef_fild06" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild06" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild06"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild06" "try_to_start"
	    wait
        if (lv["status_gef_fild06"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild06" "Wanderer#gef_fild06" 4_F_05 158 190 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild06"
	strlocalvar 1 "status_gef_fild06"
	SetLocalVar "status_gef_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild06"] == 1)
        Talk2me "Wanderer#gef_fild06" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild06" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild06"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild06" "try_to_start"
	    wait
        if (lv["status_gef_fild06"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild06" "#plate1_gef_fild06" GLASS_PLATE 157 193 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild06"
return

npc "gef_fild06" "#plate2_gef_fild06" GLASS_PLATE 154 190 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild06"
return

npc "gef_fild06" "#plate3_gef_fild06" GLASS_PLATE 160 191 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild06"
return

npc "gef_fild06" "#basket_gef_fild06" 4_ROPEPILE 154 187 5 0 0
OnInit:
	disablenpc "#basket_gef_fild06"
return

// gef_fild07 ============[OFF]==============
npc "gef_fild07" "Extinct Bonfire#gef_fild07" 4_TRACE 104 136 5 0 0
return

// gef_fild07 ============[ON]==============
npc "gef_fild07" "Bonfire#gef_fild07" 4_BONFIRE 104 136 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild07"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild07" "start"
        cmdothernpc "Sitting woman#gef_fild07" "start"
        cmdothernpc "Wanderer#gef_fild07" "start"
        cmdothernpc "Sunbathing girl#gef_fild07" "start"
    endif
return

npc "gef_fild07" "Sitting man#gef_fild07" 4_TOWER_02 101 136 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild07"
	strlocalvar 1 "status_gef_fild07"
	SetLocalVar "status_gef_fild07" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild07"] == 1)
        Talk2me "Sitting man#gef_fild07" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild07" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild07"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild07" "try_to_start"
	    wait
        if (lv["status_gef_fild07"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild07" "Sunbathing girl#gef_fild07" 4_F_PATIENT 103 138 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild07"
	strlocalvar 1 "status_gef_fild07"
	SetLocalVar "status_gef_fild07" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild07"] == 1)
        Talk2me "Sunbathing girl#gef_fild07" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild07" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild07"] == 0)
        cmdothernpc "Bonfire#gef_fild07" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild07" "Sitting woman#gef_fild07" 4_TOWER_07 107 137 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild07"
	strlocalvar 1 "status_gef_fild07"
	SetLocalVar "status_gef_fild07" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild07"] == 1)
        Talk2me "Sitting woman#gef_fild07" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild07" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild07"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild07" "try_to_start"
	    wait
        if (lv["status_gef_fild07"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild07" "Wanderer#gef_fild07" 4_F_05 105 135 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild07"
	strlocalvar 1 "status_gef_fild07"
	SetLocalVar "status_gef_fild07" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild07"] == 1)
        Talk2me "Wanderer#gef_fild07" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild07" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild07"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild07" "try_to_start"
	    wait
        if (lv["status_gef_fild07"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild07" "#plate1_gef_fild07" GLASS_PLATE 104 138 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild07"
return

npc "gef_fild07" "#plate2_gef_fild07" GLASS_PLATE 101 135 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild07"
return

npc "gef_fild07" "#plate3_gef_fild07" GLASS_PLATE 107 136 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild07"
return

npc "gef_fild07" "#basket_gef_fild07" 4_ROPEPILE 101 132 5 0 0
OnInit:
	disablenpc "#basket_gef_fild07"
return

// gef_fild08 ============[OFF]==============
npc "gef_fild08" "Extinct Bonfire#gef_fild08" 4_TRACE 200 185 5 0 0
return

// gef_fild08 ============[ON]==============
npc "gef_fild08" "Bonfire#gef_fild08" 4_BONFIRE 200 185 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild08"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild08" "start"
        cmdothernpc "Sitting woman#gef_fild08" "start"
        cmdothernpc "Wanderer#gef_fild08" "start"
        cmdothernpc "Sunbathing girl#gef_fild08" "start"
    endif
return

npc "gef_fild08" "Sitting man#gef_fild08" 4_TOWER_02 197 185 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild08"
	strlocalvar 1 "status_gef_fild08"
	SetLocalVar "status_gef_fild08" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild08"] == 1)
        Talk2me "Sitting man#gef_fild08" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild08" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild08"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild08" "try_to_start"
	    wait
        if (lv["status_gef_fild08"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild08" "Sunbathing girl#gef_fild08" 4_F_PATIENT 199 187 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild08"
	strlocalvar 1 "status_gef_fild08"
	SetLocalVar "status_gef_fild08" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild08"] == 1)
        Talk2me "Sunbathing girl#gef_fild08" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild08" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild08"] == 0)
        cmdothernpc "Bonfire#gef_fild08" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild08" "Sitting woman#gef_fild08" 4_TOWER_07 203 186 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild08"
	strlocalvar 1 "status_gef_fild08"
	SetLocalVar "status_gef_fild08" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild08"] == 1)
        Talk2me "Sitting woman#gef_fild08" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild08" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild08"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild08" "try_to_start"
	    wait
        if (lv["status_gef_fild08"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild08" "Wanderer#gef_fild08" 4_F_05 201 184 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild08"
	strlocalvar 1 "status_gef_fild08"
	SetLocalVar "status_gef_fild08" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild08"] == 1)
        Talk2me "Wanderer#gef_fild08" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild08" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild08"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild08" "try_to_start"
	    wait
        if (lv["status_gef_fild08"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild08" "#plate1_gef_fild08" GLASS_PLATE 200 187 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild08"
return

npc "gef_fild08" "#plate2_gef_fild08" GLASS_PLATE 197 184 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild08"
return

npc "gef_fild08" "#plate3_gef_fild08" GLASS_PLATE 203 185 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild08"
return

npc "gef_fild08" "#basket_gef_fild08" 4_ROPEPILE 197 181 5 0 0
OnInit:
	disablenpc "#basket_gef_fild08"
return

// gef_fild09 ============[OFF]==============
npc "gef_fild09" "Extinct Bonfire#gef_fild09" 4_TRACE 204 120 5 0 0
return

// gef_fild09 ============[ON]==============
npc "gef_fild09" "Bonfire#gef_fild09" 4_BONFIRE 204 120 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild09"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild09" "start"
        cmdothernpc "Sitting woman#gef_fild09" "start"
        cmdothernpc "Wanderer#gef_fild09" "start"
        cmdothernpc "Sunbathing girl#gef_fild09" "start"
    endif
return

npc "gef_fild09" "Sitting man#gef_fild09" 4_TOWER_02 201 120 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild09"
	strlocalvar 1 "status_gef_fild09"
	SetLocalVar "status_gef_fild09" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild09"] == 1)
        Talk2me "Sitting man#gef_fild09" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild09" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild09"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild09" "try_to_start"
	    wait
        if (lv["status_gef_fild09"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild09" "Sunbathing girl#gef_fild09" 4_F_PATIENT 203 122 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild09"
	strlocalvar 1 "status_gef_fild09"
	SetLocalVar "status_gef_fild09" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild09"] == 1)
        Talk2me "Sunbathing girl#gef_fild09" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild09" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild09"] == 0)
        cmdothernpc "Bonfire#gef_fild09" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild09" "Sitting woman#gef_fild09" 4_TOWER_07 207 121 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild09"
	strlocalvar 1 "status_gef_fild09"
	SetLocalVar "status_gef_fild09" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild09"] == 1)
        Talk2me "Sitting woman#gef_fild09" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild09" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild09"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild09" "try_to_start"
	    wait
        if (lv["status_gef_fild09"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild09" "Wanderer#gef_fild09" 4_F_05 205 119 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild09"
	strlocalvar 1 "status_gef_fild09"
	SetLocalVar "status_gef_fild09" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild09"] == 1)
        Talk2me "Wanderer#gef_fild09" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild09" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild09"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild09" "try_to_start"
	    wait
        if (lv["status_gef_fild09"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild09" "#plate1_gef_fild09" GLASS_PLATE 204 122 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild09"
return

npc "gef_fild09" "#plate2_gef_fild09" GLASS_PLATE 201 119 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild09"
return

npc "gef_fild09" "#plate3_gef_fild09" GLASS_PLATE 207 120 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild09"
return

npc "gef_fild09" "#basket_gef_fild09" 4_ROPEPILE 201 116 5 0 0
OnInit:
	disablenpc "#basket_gef_fild09"
return

// gef_fild10 ============[OFF]==============
npc "gef_fild10" "Extinct Bonfire#gef_fild10" 4_TRACE 130 189 5 0 0
return

// gef_fild10 ============[ON]==============
npc "gef_fild10" "Bonfire#gef_fild10" 4_BONFIRE 130 189 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild10"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild10" "start"
        cmdothernpc "Sitting woman#gef_fild10" "start"
        cmdothernpc "Wanderer#gef_fild10" "start"
        cmdothernpc "Sunbathing girl#gef_fild10" "start"
    endif
return

npc "gef_fild10" "Sitting man#gef_fild10" 4_TOWER_02 127 189 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild10"
	strlocalvar 1 "status_gef_fild10"
	SetLocalVar "status_gef_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild10"] == 1)
        Talk2me "Sitting man#gef_fild10" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild10" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild10"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild10" "try_to_start"
	    wait
        if (lv["status_gef_fild10"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild10" "Sunbathing girl#gef_fild10" 4_F_PATIENT 129 191 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild10"
	strlocalvar 1 "status_gef_fild10"
	SetLocalVar "status_gef_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild10"] == 1)
        Talk2me "Sunbathing girl#gef_fild10" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild10" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild10"] == 0)
        cmdothernpc "Bonfire#gef_fild10" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild10" "Sitting woman#gef_fild10" 4_TOWER_07 133 190 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild10"
	strlocalvar 1 "status_gef_fild10"
	SetLocalVar "status_gef_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild10"] == 1)
        Talk2me "Sitting woman#gef_fild10" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild10" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild10"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild10" "try_to_start"
	    wait
        if (lv["status_gef_fild10"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild10" "Wanderer#gef_fild10" 4_F_05 131 188 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild10"
	strlocalvar 1 "status_gef_fild10"
	SetLocalVar "status_gef_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild10"] == 1)
        Talk2me "Wanderer#gef_fild10" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild10" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild10"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild10" "try_to_start"
	    wait
        if (lv["status_gef_fild10"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild10" "#plate1_gef_fild10" GLASS_PLATE 130 191 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild10"
return

npc "gef_fild10" "#plate2_gef_fild10" GLASS_PLATE 127 188 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild10"
return

npc "gef_fild10" "#plate3_gef_fild10" GLASS_PLATE 133 189 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild10"
return

npc "gef_fild10" "#basket_gef_fild10" 4_ROPEPILE 127 185 5 0 0
OnInit:
	disablenpc "#basket_gef_fild10"
return

// gef_fild11 ============[OFF]==============
npc "gef_fild11" "Extinct Bonfire#gef_fild11" 4_TRACE 200 227 5 0 0
return

// gef_fild11 ============[ON]==============
npc "gef_fild11" "Bonfire#gef_fild11" 4_BONFIRE 200 227 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild11"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild11" "start"
        cmdothernpc "Sitting woman#gef_fild11" "start"
        cmdothernpc "Wanderer#gef_fild11" "start"
        cmdothernpc "Sunbathing girl#gef_fild11" "start"
    endif
return

npc "gef_fild11" "Sitting man#gef_fild11" 4_TOWER_02 197 227 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild11"
	strlocalvar 1 "status_gef_fild11"
	SetLocalVar "status_gef_fild11" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild11"] == 1)
        Talk2me "Sitting man#gef_fild11" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild11" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild11"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild11" "try_to_start"
	    wait
        if (lv["status_gef_fild11"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild11" "Sunbathing girl#gef_fild11" 4_F_PATIENT 199 229 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild11"
	strlocalvar 1 "status_gef_fild11"
	SetLocalVar "status_gef_fild11" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild11"] == 1)
        Talk2me "Sunbathing girl#gef_fild11" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild11" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild11"] == 0)
        cmdothernpc "Bonfire#gef_fild11" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild11" "Sitting woman#gef_fild11" 4_TOWER_07 203 228 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild11"
	strlocalvar 1 "status_gef_fild11"
	SetLocalVar "status_gef_fild11" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild11"] == 1)
        Talk2me "Sitting woman#gef_fild11" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild11" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild11"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild11" "try_to_start"
	    wait
        if (lv["status_gef_fild11"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild11" "Wanderer#gef_fild11" 4_F_05 201 226 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild11"
	strlocalvar 1 "status_gef_fild11"
	SetLocalVar "status_gef_fild11" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild11"] == 1)
        Talk2me "Wanderer#gef_fild11" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild11" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild11"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild11" "try_to_start"
	    wait
        if (lv["status_gef_fild11"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild11" "#plate1_gef_fild11" GLASS_PLATE 200 229 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild11"
return

npc "gef_fild11" "#plate2_gef_fild11" GLASS_PLATE 197 226 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild11"
return

npc "gef_fild11" "#plate3_gef_fild11" GLASS_PLATE 203 227 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild11"
return

npc "gef_fild11" "#basket_gef_fild11" 4_ROPEPILE 197 223 5 0 0
OnInit:
	disablenpc "#basket_gef_fild11"
return

// gef_fild12 ============[OFF]==============
npc "gef_fild12" "Extinct Bonfire#gef_fild12" 4_TRACE 154 183 5 0 0
return

// gef_fild12 ============[ON]==============
npc "gef_fild12" "Bonfire#gef_fild12" 4_BONFIRE 154 183 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild12"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild12" "start"
        cmdothernpc "Sitting woman#gef_fild12" "start"
        cmdothernpc "Wanderer#gef_fild12" "start"
        cmdothernpc "Sunbathing girl#gef_fild12" "start"
    endif
return

npc "gef_fild12" "Sitting man#gef_fild12" 4_TOWER_02 151 183 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild12"
	strlocalvar 1 "status_gef_fild12"
	SetLocalVar "status_gef_fild12" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild12" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild12"] == 1)
        Talk2me "Sitting man#gef_fild12" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild12" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild12"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild12" "try_to_start"
	    wait
        if (lv["status_gef_fild12"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild12" "Sunbathing girl#gef_fild12" 4_F_PATIENT 153 185 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild12"
	strlocalvar 1 "status_gef_fild12"
	SetLocalVar "status_gef_fild12" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild12" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild12"] == 1)
        Talk2me "Sunbathing girl#gef_fild12" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild12" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild12"] == 0)
        cmdothernpc "Bonfire#gef_fild12" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild12" "Sitting woman#gef_fild12" 4_TOWER_07 157 184 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild12"
	strlocalvar 1 "status_gef_fild12"
	SetLocalVar "status_gef_fild12" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild12" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild12"] == 1)
        Talk2me "Sitting woman#gef_fild12" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild12" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild12"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild12" "try_to_start"
	    wait
        if (lv["status_gef_fild12"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild12" "Wanderer#gef_fild12" 4_F_05 155 182 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild12"
	strlocalvar 1 "status_gef_fild12"
	SetLocalVar "status_gef_fild12" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild12" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild12"] == 1)
        Talk2me "Wanderer#gef_fild12" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild12" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild12"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild12" "try_to_start"
	    wait
        if (lv["status_gef_fild12"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild12" "#plate1_gef_fild12" GLASS_PLATE 154 185 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild12"
return

npc "gef_fild12" "#plate2_gef_fild12" GLASS_PLATE 151 182 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild12"
return

npc "gef_fild12" "#plate3_gef_fild12" GLASS_PLATE 157 183 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild12"
return

npc "gef_fild12" "#basket_gef_fild12" 4_ROPEPILE 151 179 5 0 0
OnInit:
	disablenpc "#basket_gef_fild12"
return

// gef_fild14 ============[OFF]==============
npc "gef_fild14" "Extinct Bonfire#gef_fild14" 4_TRACE 262 171 5 0 0
return

// gef_fild14 ============[ON]==============
npc "gef_fild14" "Bonfire#gef_fild14" 4_BONFIRE 262 171 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild14"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild14" "start"
        cmdothernpc "Sitting woman#gef_fild14" "start"
        cmdothernpc "Wanderer#gef_fild14" "start"
        cmdothernpc "Sunbathing girl#gef_fild14" "start"
    endif
return

npc "gef_fild14" "Sitting man#gef_fild14" 4_TOWER_02 259 171 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild14"
	strlocalvar 1 "status_gef_fild14"
	SetLocalVar "status_gef_fild14" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild14" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild14"] == 1)
        Talk2me "Sitting man#gef_fild14" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild14" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild14"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild14" "try_to_start"
	    wait
        if (lv["status_gef_fild14"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild14" "Sunbathing girl#gef_fild14" 4_F_PATIENT 261 173 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild14"
	strlocalvar 1 "status_gef_fild14"
	SetLocalVar "status_gef_fild14" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild14" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild14"] == 1)
        Talk2me "Sunbathing girl#gef_fild14" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild14" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild14"] == 0)
        cmdothernpc "Bonfire#gef_fild14" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild14" "Sitting woman#gef_fild14" 4_TOWER_07 265 172 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild14"
	strlocalvar 1 "status_gef_fild14"
	SetLocalVar "status_gef_fild14" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild14" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild14"] == 1)
        Talk2me "Sitting woman#gef_fild14" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild14" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild14"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild14" "try_to_start"
	    wait
        if (lv["status_gef_fild14"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild14" "Wanderer#gef_fild14" 4_F_05 263 170 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild14"
	strlocalvar 1 "status_gef_fild14"
	SetLocalVar "status_gef_fild14" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild14" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild14"] == 1)
        Talk2me "Wanderer#gef_fild14" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild14" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild14"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild14" "try_to_start"
	    wait
        if (lv["status_gef_fild14"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild14" "#plate1_gef_fild14" GLASS_PLATE 262 173 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild14"
return

npc "gef_fild14" "#plate2_gef_fild14" GLASS_PLATE 259 170 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild14"
return

npc "gef_fild14" "#plate3_gef_fild14" GLASS_PLATE 265 171 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild14"
return

npc "gef_fild14" "#basket_gef_fild14" 4_ROPEPILE 259 167 5 0 0
OnInit:
	disablenpc "#basket_gef_fild14"
return

// moc_fild02 ============[OFF]==============
npc "moc_fild02" "Extinct Bonfire#moc_fild02" 4_TRACE 335 149 5 0 0
return

// moc_fild02 ============[ON]==============
npc "moc_fild02" "Bonfire#moc_fild02" 4_BONFIRE 335 149 5 0 0
OnInit:
	disablenpc "Bonfire#moc_fild02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#moc_fild02" "start"
        cmdothernpc "Sitting woman#moc_fild02" "start"
        cmdothernpc "Wanderer#moc_fild02" "start"
        cmdothernpc "Sunbathing girl#moc_fild02" "start"
    endif
return

npc "moc_fild02" "Sitting man#moc_fild02" 4_TOWER_02 332 149 6 0 0
OnInit:
	disablenpc "Sitting man#moc_fild02"
	strlocalvar 1 "status_moc_fild02"
	SetLocalVar "status_moc_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_moc_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_moc_fild02"] == 1)
        Talk2me "Sitting man#moc_fild02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_moc_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_moc_fild02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#moc_fild02" "try_to_start"
	    wait
        if (lv["status_moc_fild02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "moc_fild02" "Sunbathing girl#moc_fild02" 4_F_PATIENT 334 151 5 0 0
OnInit:
	disablenpc "Sunbathing girl#moc_fild02"
	strlocalvar 1 "status_moc_fild02"
	SetLocalVar "status_moc_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_moc_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_moc_fild02"] == 1)
        Talk2me "Sunbathing girl#moc_fild02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_moc_fild02" 0
    stoptimer
return
OnClick:
    if (lv["status_moc_fild02"] == 0)
        cmdothernpc "Bonfire#moc_fild02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "moc_fild02" "Sitting woman#moc_fild02" 4_TOWER_07 338 150 3 0 0
OnInit:
	disablenpc "Sitting woman#moc_fild02"
	strlocalvar 1 "status_moc_fild02"
	SetLocalVar "status_moc_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_moc_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_moc_fild02"] == 1)
        Talk2me "Sitting woman#moc_fild02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_moc_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_moc_fild02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#moc_fild02" "try_to_start"
	    wait
        if (lv["status_moc_fild02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "moc_fild02" "Wanderer#moc_fild02" 4_F_05 336 148 1 0 0
OnInit:
	disablenpc "Wanderer#moc_fild02"
	strlocalvar 1 "status_moc_fild02"
	SetLocalVar "status_moc_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_moc_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_moc_fild02"] == 1)
        Talk2me "Wanderer#moc_fild02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_moc_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_moc_fild02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#moc_fild02" "try_to_start"
	    wait
        if (lv["status_moc_fild02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "moc_fild02" "#plate1_moc_fild02" GLASS_PLATE 335 151 5 0 0
OnInit:
	disablenpc "#plate1_moc_fild02"
return

npc "moc_fild02" "#plate2_moc_fild02" GLASS_PLATE 332 148 5 0 0
OnInit:
	disablenpc "#plate2_moc_fild02"
return

npc "moc_fild02" "#plate3_moc_fild02" GLASS_PLATE 338 149 5 0 0
OnInit:
	disablenpc "#plate3_moc_fild02"
return

npc "moc_fild02" "#basket_moc_fild02" 4_ROPEPILE 332 145 5 0 0
OnInit:
	disablenpc "#basket_moc_fild02"
return

// moc_fild03 ============[OFF]==============
npc "moc_fild03" "Extinct Bonfire#moc_fild03" 4_TRACE 193 183 5 0 0
return

// moc_fild03 ============[ON]==============
npc "moc_fild03" "Bonfire#moc_fild03" 4_BONFIRE 193 183 5 0 0
OnInit:
	disablenpc "Bonfire#moc_fild03"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#moc_fild03" "start"
        cmdothernpc "Sitting woman#moc_fild03" "start"
        cmdothernpc "Wanderer#moc_fild03" "start"
        cmdothernpc "Sunbathing girl#moc_fild03" "start"
    endif
return

npc "moc_fild03" "Sitting man#moc_fild03" 4_TOWER_02 190 183 6 0 0
OnInit:
	disablenpc "Sitting man#moc_fild03"
	strlocalvar 1 "status_moc_fild03"
	SetLocalVar "status_moc_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_moc_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_moc_fild03"] == 1)
        Talk2me "Sitting man#moc_fild03" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_moc_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_moc_fild03"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#moc_fild03" "try_to_start"
	    wait
        if (lv["status_moc_fild03"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "moc_fild03" "Sunbathing girl#moc_fild03" 4_F_PATIENT 192 185 5 0 0
OnInit:
	disablenpc "Sunbathing girl#moc_fild03"
	strlocalvar 1 "status_moc_fild03"
	SetLocalVar "status_moc_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_moc_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_moc_fild03"] == 1)
        Talk2me "Sunbathing girl#moc_fild03" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_moc_fild03" 0
    stoptimer
return
OnClick:
    if (lv["status_moc_fild03"] == 0)
        cmdothernpc "Bonfire#moc_fild03" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "moc_fild03" "Sitting woman#moc_fild03" 4_TOWER_07 196 184 3 0 0
OnInit:
	disablenpc "Sitting woman#moc_fild03"
	strlocalvar 1 "status_moc_fild03"
	SetLocalVar "status_moc_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_moc_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_moc_fild03"] == 1)
        Talk2me "Sitting woman#moc_fild03" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_moc_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_moc_fild03"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#moc_fild03" "try_to_start"
	    wait
        if (lv["status_moc_fild03"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "moc_fild03" "Wanderer#moc_fild03" 4_F_05 194 182 1 0 0
OnInit:
	disablenpc "Wanderer#moc_fild03"
	strlocalvar 1 "status_moc_fild03"
	SetLocalVar "status_moc_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_moc_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_moc_fild03"] == 1)
        Talk2me "Wanderer#moc_fild03" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_moc_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_moc_fild03"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#moc_fild03" "try_to_start"
	    wait
        if (lv["status_moc_fild03"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "moc_fild03" "#plate1_moc_fild03" GLASS_PLATE 193 185 5 0 0
OnInit:
	disablenpc "#plate1_moc_fild03"
return

npc "moc_fild03" "#plate2_moc_fild03" GLASS_PLATE 190 182 5 0 0
OnInit:
	disablenpc "#plate2_moc_fild03"
return

npc "moc_fild03" "#plate3_moc_fild03" GLASS_PLATE 196 183 5 0 0
OnInit:
	disablenpc "#plate3_moc_fild03"
return

npc "moc_fild03" "#basket_moc_fild03" 4_ROPEPILE 190 179 5 0 0
OnInit:
	disablenpc "#basket_moc_fild03"
return

// moc_fild13 ============[OFF]==============
npc "moc_fild13" "Extinct Bonfire#moc_fild13" 4_TRACE 249 126 5 0 0
return

// moc_fild13 ============[ON]==============
npc "moc_fild13" "Bonfire#moc_fild13" 4_BONFIRE 249 126 5 0 0
OnInit:
	disablenpc "Bonfire#moc_fild13"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#moc_fild13" "start"
        cmdothernpc "Sitting woman#moc_fild13" "start"
        cmdothernpc "Wanderer#moc_fild13" "start"
        cmdothernpc "Sunbathing girl#moc_fild13" "start"
    endif
return

npc "moc_fild13" "Sitting man#moc_fild13" 4_TOWER_02 246 126 6 0 0
OnInit:
	disablenpc "Sitting man#moc_fild13"
	strlocalvar 1 "status_moc_fild13"
	SetLocalVar "status_moc_fild13" 0
return
OnCommand: "start"
	SetLocalVar "status_moc_fild13" 1
    InitTimer
return
OnTouch2:
	if (lv["status_moc_fild13"] == 1)
        Talk2me "Sitting man#moc_fild13" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_moc_fild13" 0
    stoptimer
return
OnClick:
	if (lv["status_moc_fild13"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#moc_fild13" "try_to_start"
	    wait
        if (lv["status_moc_fild13"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "moc_fild13" "Sunbathing girl#moc_fild13" 4_F_PATIENT 248 128 5 0 0
OnInit:
	disablenpc "Sunbathing girl#moc_fild13"
	strlocalvar 1 "status_moc_fild13"
	SetLocalVar "status_moc_fild13" 0
return
OnCommand: "start"
	SetLocalVar "status_moc_fild13" 1
    InitTimer
return
OnTouch2:
	if (lv["status_moc_fild13"] == 1)
        Talk2me "Sunbathing girl#moc_fild13" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_moc_fild13" 0
    stoptimer
return
OnClick:
    if (lv["status_moc_fild13"] == 0)
        cmdothernpc "Bonfire#moc_fild13" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "moc_fild13" "Sitting woman#moc_fild13" 4_TOWER_07 252 127 3 0 0
OnInit:
	disablenpc "Sitting woman#moc_fild13"
	strlocalvar 1 "status_moc_fild13"
	SetLocalVar "status_moc_fild13" 0
return
OnCommand: "start"
	SetLocalVar "status_moc_fild13" 1
    InitTimer
return
OnTouch2:
	if (lv["status_moc_fild13"] == 1)
        Talk2me "Sitting woman#moc_fild13" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_moc_fild13" 0
    stoptimer
return
OnClick:
	if (lv["status_moc_fild13"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#moc_fild13" "try_to_start"
	    wait
        if (lv["status_moc_fild13"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "moc_fild13" "Wanderer#moc_fild13" 4_F_05 250 125 1 0 0
OnInit:
	disablenpc "Wanderer#moc_fild13"
	strlocalvar 1 "status_moc_fild13"
	SetLocalVar "status_moc_fild13" 0
return
OnCommand: "start"
	SetLocalVar "status_moc_fild13" 1
    InitTimer
return
OnTouch2:
	if (lv["status_moc_fild13"] == 1)
        Talk2me "Wanderer#moc_fild13" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_moc_fild13" 0
    stoptimer
return
OnClick:
	if (lv["status_moc_fild13"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#moc_fild13" "try_to_start"
	    wait
        if (lv["status_moc_fild13"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "moc_fild13" "#plate1_moc_fild13" GLASS_PLATE 249 128 5 0 0
OnInit:
	disablenpc "#plate1_moc_fild13"
return

npc "moc_fild13" "#plate2_moc_fild13" GLASS_PLATE 246 125 5 0 0
OnInit:
	disablenpc "#plate2_moc_fild13"
return

npc "moc_fild13" "#plate3_moc_fild13" GLASS_PLATE 252 126 5 0 0
OnInit:
	disablenpc "#plate3_moc_fild13"
return

npc "moc_fild13" "#basket_moc_fild13" 4_ROPEPILE 246 122 5 0 0
OnInit:
	disablenpc "#basket_moc_fild13"
return

// pay_fild01 ============[OFF]==============
npc "pay_fild01" "Extinct Bonfire#pay_fild01" 4_TRACE 142 235 5 0 0
return

// pay_fild01 ============[ON]==============
npc "pay_fild01" "Bonfire#pay_fild01" 4_BONFIRE 142 235 5 0 0
OnInit:
	disablenpc "Bonfire#pay_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#pay_fild01" "start"
        cmdothernpc "Sitting woman#pay_fild01" "start"
        cmdothernpc "Wanderer#pay_fild01" "start"
        cmdothernpc "Sunbathing girl#pay_fild01" "start"
    endif
return

npc "pay_fild01" "Sitting man#pay_fild01" 4_TOWER_02 139 235 6 0 0
OnInit:
	disablenpc "Sitting man#pay_fild01"
	strlocalvar 1 "status_pay_fild01"
	SetLocalVar "status_pay_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild01"] == 1)
        Talk2me "Sitting man#pay_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild01" "try_to_start"
	    wait
        if (lv["status_pay_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "pay_fild01" "Sunbathing girl#pay_fild01" 4_F_PATIENT 141 237 5 0 0
OnInit:
	disablenpc "Sunbathing girl#pay_fild01"
	strlocalvar 1 "status_pay_fild01"
	SetLocalVar "status_pay_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild01"] == 1)
        Talk2me "Sunbathing girl#pay_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_pay_fild01"] == 0)
        cmdothernpc "Bonfire#pay_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "pay_fild01" "Sitting woman#pay_fild01" 4_TOWER_07 145 236 3 0 0
OnInit:
	disablenpc "Sitting woman#pay_fild01"
	strlocalvar 1 "status_pay_fild01"
	SetLocalVar "status_pay_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild01"] == 1)
        Talk2me "Sitting woman#pay_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild01" "try_to_start"
	    wait
        if (lv["status_pay_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "pay_fild01" "Wanderer#pay_fild01" 4_F_05 143 234 1 0 0
OnInit:
	disablenpc "Wanderer#pay_fild01"
	strlocalvar 1 "status_pay_fild01"
	SetLocalVar "status_pay_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild01"] == 1)
        Talk2me "Wanderer#pay_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild01" "try_to_start"
	    wait
        if (lv["status_pay_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "pay_fild01" "#plate1_pay_fild01" GLASS_PLATE 142 237 5 0 0
OnInit:
	disablenpc "#plate1_pay_fild01"
return

npc "pay_fild01" "#plate2_pay_fild01" GLASS_PLATE 139 234 5 0 0
OnInit:
	disablenpc "#plate2_pay_fild01"
return

npc "pay_fild01" "#plate3_pay_fild01" GLASS_PLATE 145 235 5 0 0
OnInit:
	disablenpc "#plate3_pay_fild01"
return

npc "pay_fild01" "#basket_pay_fild01" 4_ROPEPILE 139 231 5 0 0
OnInit:
	disablenpc "#basket_pay_fild01"
return

// pay_fild02 ============[OFF]==============
npc "pay_fild02" "Extinct Bonfire#pay_fild02" 4_TRACE 116 221 5 0 0
return

// pay_fild02 ============[ON]==============
npc "pay_fild02" "Bonfire#pay_fild02" 4_BONFIRE 116 221 5 0 0
OnInit:
	disablenpc "Bonfire#pay_fild02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#pay_fild02" "start"
        cmdothernpc "Sitting woman#pay_fild02" "start"
        cmdothernpc "Wanderer#pay_fild02" "start"
        cmdothernpc "Sunbathing girl#pay_fild02" "start"
    endif
return

npc "pay_fild02" "Sitting man#pay_fild02" 4_TOWER_02 113 221 6 0 0
OnInit:
	disablenpc "Sitting man#pay_fild02"
	strlocalvar 1 "status_pay_fild02"
	SetLocalVar "status_pay_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild02"] == 1)
        Talk2me "Sitting man#pay_fild02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild02" "try_to_start"
	    wait
        if (lv["status_pay_fild02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "pay_fild02" "Sunbathing girl#pay_fild02" 4_F_PATIENT 115 223 5 0 0
OnInit:
	disablenpc "Sunbathing girl#pay_fild02"
	strlocalvar 1 "status_pay_fild02"
	SetLocalVar "status_pay_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild02"] == 1)
        Talk2me "Sunbathing girl#pay_fild02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild02" 0
    stoptimer
return
OnClick:
    if (lv["status_pay_fild02"] == 0)
        cmdothernpc "Bonfire#pay_fild02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "pay_fild02" "Sitting woman#pay_fild02" 4_TOWER_07 119 222 3 0 0
OnInit:
	disablenpc "Sitting woman#pay_fild02"
	strlocalvar 1 "status_pay_fild02"
	SetLocalVar "status_pay_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild02"] == 1)
        Talk2me "Sitting woman#pay_fild02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild02" "try_to_start"
	    wait
        if (lv["status_pay_fild02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "pay_fild02" "Wanderer#pay_fild02" 4_F_05 117 220 1 0 0
OnInit:
	disablenpc "Wanderer#pay_fild02"
	strlocalvar 1 "status_pay_fild02"
	SetLocalVar "status_pay_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild02"] == 1)
        Talk2me "Wanderer#pay_fild02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild02" "try_to_start"
	    wait
        if (lv["status_pay_fild02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "pay_fild02" "#plate1_pay_fild02" GLASS_PLATE 116 223 5 0 0
OnInit:
	disablenpc "#plate1_pay_fild02"
return

npc "pay_fild02" "#plate2_pay_fild02" GLASS_PLATE 113 220 5 0 0
OnInit:
	disablenpc "#plate2_pay_fild02"
return

npc "pay_fild02" "#plate3_pay_fild02" GLASS_PLATE 119 221 5 0 0
OnInit:
	disablenpc "#plate3_pay_fild02"
return

npc "pay_fild02" "#basket_pay_fild02" 4_ROPEPILE 113 217 5 0 0
OnInit:
	disablenpc "#basket_pay_fild02"
return

// pay_fild03 ============[OFF]==============
npc "pay_fild03" "Extinct Bonfire#pay_fild03" 4_TRACE 205 171 5 0 0
return

// pay_fild03 ============[ON]==============
npc "pay_fild03" "Bonfire#pay_fild03" 4_BONFIRE 205 171 5 0 0
OnInit:
	disablenpc "Bonfire#pay_fild03"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#pay_fild03" "start"
        cmdothernpc "Sitting woman#pay_fild03" "start"
        cmdothernpc "Wanderer#pay_fild03" "start"
        cmdothernpc "Sunbathing girl#pay_fild03" "start"
    endif
return

npc "pay_fild03" "Sitting man#pay_fild03" 4_TOWER_02 202 171 6 0 0
OnInit:
	disablenpc "Sitting man#pay_fild03"
	strlocalvar 1 "status_pay_fild03"
	SetLocalVar "status_pay_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild03"] == 1)
        Talk2me "Sitting man#pay_fild03" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild03"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild03" "try_to_start"
	    wait
        if (lv["status_pay_fild03"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "pay_fild03" "Sunbathing girl#pay_fild03" 4_F_PATIENT 204 173 5 0 0
OnInit:
	disablenpc "Sunbathing girl#pay_fild03"
	strlocalvar 1 "status_pay_fild03"
	SetLocalVar "status_pay_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild03"] == 1)
        Talk2me "Sunbathing girl#pay_fild03" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild03" 0
    stoptimer
return
OnClick:
    if (lv["status_pay_fild03"] == 0)
        cmdothernpc "Bonfire#pay_fild03" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "pay_fild03" "Sitting woman#pay_fild03" 4_TOWER_07 208 172 3 0 0
OnInit:
	disablenpc "Sitting woman#pay_fild03"
	strlocalvar 1 "status_pay_fild03"
	SetLocalVar "status_pay_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild03"] == 1)
        Talk2me "Sitting woman#pay_fild03" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild03"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild03" "try_to_start"
	    wait
        if (lv["status_pay_fild03"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "pay_fild03" "Wanderer#pay_fild03" 4_F_05 206 170 1 0 0
OnInit:
	disablenpc "Wanderer#pay_fild03"
	strlocalvar 1 "status_pay_fild03"
	SetLocalVar "status_pay_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild03"] == 1)
        Talk2me "Wanderer#pay_fild03" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild03"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild03" "try_to_start"
	    wait
        if (lv["status_pay_fild03"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "pay_fild03" "#plate1_pay_fild03" GLASS_PLATE 205 173 5 0 0
OnInit:
	disablenpc "#plate1_pay_fild03"
return

npc "pay_fild03" "#plate2_pay_fild03" GLASS_PLATE 202 170 5 0 0
OnInit:
	disablenpc "#plate2_pay_fild03"
return

npc "pay_fild03" "#plate3_pay_fild03" GLASS_PLATE 208 171 5 0 0
OnInit:
	disablenpc "#plate3_pay_fild03"
return

npc "pay_fild03" "#basket_pay_fild03" 4_ROPEPILE 202 167 5 0 0
OnInit:
	disablenpc "#basket_pay_fild03"
return

// pay_fild04 ============[OFF]==============
npc "pay_fild04" "Extinct Bonfire#pay_fild04" 4_TRACE 253 193 5 0 0
return

// pay_fild04 ============[ON]==============
npc "pay_fild04" "Bonfire#pay_fild04" 4_BONFIRE 253 193 5 0 0
OnInit:
	disablenpc "Bonfire#pay_fild04"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#pay_fild04" "start"
        cmdothernpc "Sitting woman#pay_fild04" "start"
        cmdothernpc "Wanderer#pay_fild04" "start"
        cmdothernpc "Sunbathing girl#pay_fild04" "start"
    endif
return

npc "pay_fild04" "Sitting man#pay_fild04" 4_TOWER_02 250 193 6 0 0
OnInit:
	disablenpc "Sitting man#pay_fild04"
	strlocalvar 1 "status_pay_fild04"
	SetLocalVar "status_pay_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild04"] == 1)
        Talk2me "Sitting man#pay_fild04" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild04"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild04" "try_to_start"
	    wait
        if (lv["status_pay_fild04"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "pay_fild04" "Sunbathing girl#pay_fild04" 4_F_PATIENT 252 195 5 0 0
OnInit:
	disablenpc "Sunbathing girl#pay_fild04"
	strlocalvar 1 "status_pay_fild04"
	SetLocalVar "status_pay_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild04"] == 1)
        Talk2me "Sunbathing girl#pay_fild04" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild04" 0
    stoptimer
return
OnClick:
    if (lv["status_pay_fild04"] == 0)
        cmdothernpc "Bonfire#pay_fild04" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "pay_fild04" "Sitting woman#pay_fild04" 4_TOWER_07 256 194 3 0 0
OnInit:
	disablenpc "Sitting woman#pay_fild04"
	strlocalvar 1 "status_pay_fild04"
	SetLocalVar "status_pay_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild04"] == 1)
        Talk2me "Sitting woman#pay_fild04" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild04"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild04" "try_to_start"
	    wait
        if (lv["status_pay_fild04"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "pay_fild04" "Wanderer#pay_fild04" 4_F_05 254 192 1 0 0
OnInit:
	disablenpc "Wanderer#pay_fild04"
	strlocalvar 1 "status_pay_fild04"
	SetLocalVar "status_pay_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild04"] == 1)
        Talk2me "Wanderer#pay_fild04" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild04"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild04" "try_to_start"
	    wait
        if (lv["status_pay_fild04"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "pay_fild04" "#plate1_pay_fild04" GLASS_PLATE 253 195 5 0 0
OnInit:
	disablenpc "#plate1_pay_fild04"
return

npc "pay_fild04" "#plate2_pay_fild04" GLASS_PLATE 250 192 5 0 0
OnInit:
	disablenpc "#plate2_pay_fild04"
return

npc "pay_fild04" "#plate3_pay_fild04" GLASS_PLATE 256 193 5 0 0
OnInit:
	disablenpc "#plate3_pay_fild04"
return

npc "pay_fild04" "#basket_pay_fild04" 4_ROPEPILE 250 189 5 0 0
OnInit:
	disablenpc "#basket_pay_fild04"
return

// pay_fild05 ============[OFF]==============
npc "pay_fild05" "Extinct Bonfire#pay_fild05" 4_TRACE 155 204 5 0 0
return

// pay_fild05 ============[ON]==============
npc "pay_fild05" "Bonfire#pay_fild05" 4_BONFIRE 155 204 5 0 0
OnInit:
	disablenpc "Bonfire#pay_fild05"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#pay_fild05" "start"
        cmdothernpc "Sitting woman#pay_fild05" "start"
        cmdothernpc "Wanderer#pay_fild05" "start"
        cmdothernpc "Sunbathing girl#pay_fild05" "start"
    endif
return

npc "pay_fild05" "Sitting man#pay_fild05" 4_TOWER_02 152 204 6 0 0
OnInit:
	disablenpc "Sitting man#pay_fild05"
	strlocalvar 1 "status_pay_fild05"
	SetLocalVar "status_pay_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild05"] == 1)
        Talk2me "Sitting man#pay_fild05" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild05"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild05" "try_to_start"
	    wait
        if (lv["status_pay_fild05"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "pay_fild05" "Sunbathing girl#pay_fild05" 4_F_PATIENT 154 206 5 0 0
OnInit:
	disablenpc "Sunbathing girl#pay_fild05"
	strlocalvar 1 "status_pay_fild05"
	SetLocalVar "status_pay_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild05"] == 1)
        Talk2me "Sunbathing girl#pay_fild05" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild05" 0
    stoptimer
return
OnClick:
    if (lv["status_pay_fild05"] == 0)
        cmdothernpc "Bonfire#pay_fild05" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "pay_fild05" "Sitting woman#pay_fild05" 4_TOWER_07 158 205 3 0 0
OnInit:
	disablenpc "Sitting woman#pay_fild05"
	strlocalvar 1 "status_pay_fild05"
	SetLocalVar "status_pay_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild05"] == 1)
        Talk2me "Sitting woman#pay_fild05" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild05"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild05" "try_to_start"
	    wait
        if (lv["status_pay_fild05"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "pay_fild05" "Wanderer#pay_fild05" 4_F_05 156 203 1 0 0
OnInit:
	disablenpc "Wanderer#pay_fild05"
	strlocalvar 1 "status_pay_fild05"
	SetLocalVar "status_pay_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild05"] == 1)
        Talk2me "Wanderer#pay_fild05" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild05"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild05" "try_to_start"
	    wait
        if (lv["status_pay_fild05"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "pay_fild05" "#plate1_pay_fild05" GLASS_PLATE 155 206 5 0 0
OnInit:
	disablenpc "#plate1_pay_fild05"
return

npc "pay_fild05" "#plate2_pay_fild05" GLASS_PLATE 152 203 5 0 0
OnInit:
	disablenpc "#plate2_pay_fild05"
return

npc "pay_fild05" "#plate3_pay_fild05" GLASS_PLATE 158 204 5 0 0
OnInit:
	disablenpc "#plate3_pay_fild05"
return

npc "pay_fild05" "#basket_pay_fild05" 4_ROPEPILE 152 200 5 0 0
OnInit:
	disablenpc "#basket_pay_fild05"
return

// pay_fild06 ============[OFF]==============
npc "pay_fild06" "Extinct Bonfire#pay_fild06" 4_TRACE 186 246 5 0 0
return

// pay_fild06 ============[ON]==============
npc "pay_fild06" "Bonfire#pay_fild06" 4_BONFIRE 186 246 5 0 0
OnInit:
	disablenpc "Bonfire#pay_fild06"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#pay_fild06" "start"
        cmdothernpc "Sitting woman#pay_fild06" "start"
        cmdothernpc "Wanderer#pay_fild06" "start"
        cmdothernpc "Sunbathing girl#pay_fild06" "start"
    endif
return

npc "pay_fild06" "Sitting man#pay_fild06" 4_TOWER_02 183 246 6 0 0
OnInit:
	disablenpc "Sitting man#pay_fild06"
	strlocalvar 1 "status_pay_fild06"
	SetLocalVar "status_pay_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild06"] == 1)
        Talk2me "Sitting man#pay_fild06" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild06" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild06"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild06" "try_to_start"
	    wait
        if (lv["status_pay_fild06"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "pay_fild06" "Sunbathing girl#pay_fild06" 4_F_PATIENT 185 248 5 0 0
OnInit:
	disablenpc "Sunbathing girl#pay_fild06"
	strlocalvar 1 "status_pay_fild06"
	SetLocalVar "status_pay_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild06"] == 1)
        Talk2me "Sunbathing girl#pay_fild06" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild06" 0
    stoptimer
return
OnClick:
    if (lv["status_pay_fild06"] == 0)
        cmdothernpc "Bonfire#pay_fild06" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "pay_fild06" "Sitting woman#pay_fild06" 4_TOWER_07 189 247 3 0 0
OnInit:
	disablenpc "Sitting woman#pay_fild06"
	strlocalvar 1 "status_pay_fild06"
	SetLocalVar "status_pay_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild06"] == 1)
        Talk2me "Sitting woman#pay_fild06" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild06" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild06"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild06" "try_to_start"
	    wait
        if (lv["status_pay_fild06"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "pay_fild06" "Wanderer#pay_fild06" 4_F_05 187 245 1 0 0
OnInit:
	disablenpc "Wanderer#pay_fild06"
	strlocalvar 1 "status_pay_fild06"
	SetLocalVar "status_pay_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild06"] == 1)
        Talk2me "Wanderer#pay_fild06" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild06" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild06"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild06" "try_to_start"
	    wait
        if (lv["status_pay_fild06"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "pay_fild06" "#plate1_pay_fild06" GLASS_PLATE 186 248 5 0 0
OnInit:
	disablenpc "#plate1_pay_fild06"
return

npc "pay_fild06" "#plate2_pay_fild06" GLASS_PLATE 183 245 5 0 0
OnInit:
	disablenpc "#plate2_pay_fild06"
return

npc "pay_fild06" "#plate3_pay_fild06" GLASS_PLATE 189 246 5 0 0
OnInit:
	disablenpc "#plate3_pay_fild06"
return

npc "pay_fild06" "#basket_pay_fild06" 4_ROPEPILE 183 242 5 0 0
OnInit:
	disablenpc "#basket_pay_fild06"
return

// pay_fild07 ============[OFF]==============
npc "pay_fild07" "Extinct Bonfire#pay_fild07" 4_TRACE 201 186 5 0 0
return

// pay_fild07 ============[ON]==============
npc "pay_fild07" "Bonfire#pay_fild07" 4_BONFIRE 201 186 5 0 0
OnInit:
	disablenpc "Bonfire#pay_fild07"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#pay_fild07" "start"
        cmdothernpc "Sitting woman#pay_fild07" "start"
        cmdothernpc "Wanderer#pay_fild07" "start"
        cmdothernpc "Sunbathing girl#pay_fild07" "start"
    endif
return

npc "pay_fild07" "Sitting man#pay_fild07" 4_TOWER_02 198 186 6 0 0
OnInit:
	disablenpc "Sitting man#pay_fild07"
	strlocalvar 1 "status_pay_fild07"
	SetLocalVar "status_pay_fild07" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild07"] == 1)
        Talk2me "Sitting man#pay_fild07" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild07" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild07"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild07" "try_to_start"
	    wait
        if (lv["status_pay_fild07"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "pay_fild07" "Sunbathing girl#pay_fild07" 4_F_PATIENT 200 188 5 0 0
OnInit:
	disablenpc "Sunbathing girl#pay_fild07"
	strlocalvar 1 "status_pay_fild07"
	SetLocalVar "status_pay_fild07" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild07"] == 1)
        Talk2me "Sunbathing girl#pay_fild07" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild07" 0
    stoptimer
return
OnClick:
    if (lv["status_pay_fild07"] == 0)
        cmdothernpc "Bonfire#pay_fild07" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "pay_fild07" "Sitting woman#pay_fild07" 4_TOWER_07 204 187 3 0 0
OnInit:
	disablenpc "Sitting woman#pay_fild07"
	strlocalvar 1 "status_pay_fild07"
	SetLocalVar "status_pay_fild07" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild07"] == 1)
        Talk2me "Sitting woman#pay_fild07" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild07" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild07"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild07" "try_to_start"
	    wait
        if (lv["status_pay_fild07"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "pay_fild07" "Wanderer#pay_fild07" 4_F_05 202 185 1 0 0
OnInit:
	disablenpc "Wanderer#pay_fild07"
	strlocalvar 1 "status_pay_fild07"
	SetLocalVar "status_pay_fild07" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild07"] == 1)
        Talk2me "Wanderer#pay_fild07" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild07" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild07"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild07" "try_to_start"
	    wait
        if (lv["status_pay_fild07"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "pay_fild07" "#plate1_pay_fild07" GLASS_PLATE 201 188 5 0 0
OnInit:
	disablenpc "#plate1_pay_fild07"
return

npc "pay_fild07" "#plate2_pay_fild07" GLASS_PLATE 198 185 5 0 0
OnInit:
	disablenpc "#plate2_pay_fild07"
return

npc "pay_fild07" "#plate3_pay_fild07" GLASS_PLATE 204 186 5 0 0
OnInit:
	disablenpc "#plate3_pay_fild07"
return

npc "pay_fild07" "#basket_pay_fild07" 4_ROPEPILE 198 182 5 0 0
OnInit:
	disablenpc "#basket_pay_fild07"
return

// pay_fild08 ============[OFF]==============
npc "pay_fild08" "Extinct Bonfire#pay_fild08" 4_TRACE 149 159 5 0 0
return

// pay_fild08 ============[ON]==============
npc "pay_fild08" "Bonfire#pay_fild08" 4_BONFIRE 149 159 5 0 0
OnInit:
	disablenpc "Bonfire#pay_fild08"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#pay_fild08" "start"
        cmdothernpc "Sitting woman#pay_fild08" "start"
        cmdothernpc "Wanderer#pay_fild08" "start"
        cmdothernpc "Sunbathing girl#pay_fild08" "start"
    endif
return

npc "pay_fild08" "Sitting man#pay_fild08" 4_TOWER_02 146 159 6 0 0
OnInit:
	disablenpc "Sitting man#pay_fild08"
	strlocalvar 1 "status_pay_fild08"
	SetLocalVar "status_pay_fild08" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild08"] == 1)
        Talk2me "Sitting man#pay_fild08" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild08" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild08"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild08" "try_to_start"
	    wait
        if (lv["status_pay_fild08"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "pay_fild08" "Sunbathing girl#pay_fild08" 4_F_PATIENT 148 161 5 0 0
OnInit:
	disablenpc "Sunbathing girl#pay_fild08"
	strlocalvar 1 "status_pay_fild08"
	SetLocalVar "status_pay_fild08" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild08"] == 1)
        Talk2me "Sunbathing girl#pay_fild08" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild08" 0
    stoptimer
return
OnClick:
    if (lv["status_pay_fild08"] == 0)
        cmdothernpc "Bonfire#pay_fild08" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "pay_fild08" "Sitting woman#pay_fild08" 4_TOWER_07 152 160 3 0 0
OnInit:
	disablenpc "Sitting woman#pay_fild08"
	strlocalvar 1 "status_pay_fild08"
	SetLocalVar "status_pay_fild08" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild08"] == 1)
        Talk2me "Sitting woman#pay_fild08" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild08" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild08"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild08" "try_to_start"
	    wait
        if (lv["status_pay_fild08"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "pay_fild08" "Wanderer#pay_fild08" 4_F_05 150 158 1 0 0
OnInit:
	disablenpc "Wanderer#pay_fild08"
	strlocalvar 1 "status_pay_fild08"
	SetLocalVar "status_pay_fild08" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild08"] == 1)
        Talk2me "Wanderer#pay_fild08" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild08" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild08"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild08" "try_to_start"
	    wait
        if (lv["status_pay_fild08"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "pay_fild08" "#plate1_pay_fild08" GLASS_PLATE 149 161 5 0 0
OnInit:
	disablenpc "#plate1_pay_fild08"
return

npc "pay_fild08" "#plate2_pay_fild08" GLASS_PLATE 146 158 5 0 0
OnInit:
	disablenpc "#plate2_pay_fild08"
return

npc "pay_fild08" "#plate3_pay_fild08" GLASS_PLATE 152 159 5 0 0
OnInit:
	disablenpc "#plate3_pay_fild08"
return

npc "pay_fild08" "#basket_pay_fild08" 4_ROPEPILE 146 155 5 0 0
OnInit:
	disablenpc "#basket_pay_fild08"
return

// pay_fild09 ============[OFF]==============
npc "pay_fild09" "Extinct Bonfire#pay_fild09" 4_TRACE 206 241 5 0 0
return

// pay_fild09 ============[ON]==============
npc "pay_fild09" "Bonfire#pay_fild09" 4_BONFIRE 206 241 5 0 0
OnInit:
	disablenpc "Bonfire#pay_fild09"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#pay_fild09" "start"
        cmdothernpc "Sitting woman#pay_fild09" "start"
        cmdothernpc "Wanderer#pay_fild09" "start"
        cmdothernpc "Sunbathing girl#pay_fild09" "start"
    endif
return

npc "pay_fild09" "Sitting man#pay_fild09" 4_TOWER_02 203 241 6 0 0
OnInit:
	disablenpc "Sitting man#pay_fild09"
	strlocalvar 1 "status_pay_fild09"
	SetLocalVar "status_pay_fild09" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild09"] == 1)
        Talk2me "Sitting man#pay_fild09" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild09" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild09"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild09" "try_to_start"
	    wait
        if (lv["status_pay_fild09"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "pay_fild09" "Sunbathing girl#pay_fild09" 4_F_PATIENT 205 243 5 0 0
OnInit:
	disablenpc "Sunbathing girl#pay_fild09"
	strlocalvar 1 "status_pay_fild09"
	SetLocalVar "status_pay_fild09" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild09"] == 1)
        Talk2me "Sunbathing girl#pay_fild09" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild09" 0
    stoptimer
return
OnClick:
    if (lv["status_pay_fild09"] == 0)
        cmdothernpc "Bonfire#pay_fild09" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "pay_fild09" "Sitting woman#pay_fild09" 4_TOWER_07 209 242 3 0 0
OnInit:
	disablenpc "Sitting woman#pay_fild09"
	strlocalvar 1 "status_pay_fild09"
	SetLocalVar "status_pay_fild09" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild09"] == 1)
        Talk2me "Sitting woman#pay_fild09" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild09" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild09"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild09" "try_to_start"
	    wait
        if (lv["status_pay_fild09"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "pay_fild09" "Wanderer#pay_fild09" 4_F_05 207 240 1 0 0
OnInit:
	disablenpc "Wanderer#pay_fild09"
	strlocalvar 1 "status_pay_fild09"
	SetLocalVar "status_pay_fild09" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild09"] == 1)
        Talk2me "Wanderer#pay_fild09" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild09" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild09"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild09" "try_to_start"
	    wait
        if (lv["status_pay_fild09"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "pay_fild09" "#plate1_pay_fild09" GLASS_PLATE 206 243 5 0 0
OnInit:
	disablenpc "#plate1_pay_fild09"
return

npc "pay_fild09" "#plate2_pay_fild09" GLASS_PLATE 203 240 5 0 0
OnInit:
	disablenpc "#plate2_pay_fild09"
return

npc "pay_fild09" "#plate3_pay_fild09" GLASS_PLATE 209 241 5 0 0
OnInit:
	disablenpc "#plate3_pay_fild09"
return

npc "pay_fild09" "#basket_pay_fild09" 4_ROPEPILE 203 237 5 0 0
OnInit:
	disablenpc "#basket_pay_fild09"
return

// pay_fild10 ============[OFF]==============
npc "pay_fild10" "Extinct Bonfire#pay_fild10" 4_TRACE 133 230 5 0 0
return

// pay_fild10 ============[ON]==============
npc "pay_fild10" "Bonfire#pay_fild10" 4_BONFIRE 133 230 5 0 0
OnInit:
	disablenpc "Bonfire#pay_fild10"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#pay_fild10" "start"
        cmdothernpc "Sitting woman#pay_fild10" "start"
        cmdothernpc "Wanderer#pay_fild10" "start"
        cmdothernpc "Sunbathing girl#pay_fild10" "start"
    endif
return

npc "pay_fild10" "Sitting man#pay_fild10" 4_TOWER_02 130 230 6 0 0
OnInit:
	disablenpc "Sitting man#pay_fild10"
	strlocalvar 1 "status_pay_fild10"
	SetLocalVar "status_pay_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild10"] == 1)
        Talk2me "Sitting man#pay_fild10" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild10" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild10"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild10" "try_to_start"
	    wait
        if (lv["status_pay_fild10"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "pay_fild10" "Sunbathing girl#pay_fild10" 4_F_PATIENT 132 232 5 0 0
OnInit:
	disablenpc "Sunbathing girl#pay_fild10"
	strlocalvar 1 "status_pay_fild10"
	SetLocalVar "status_pay_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild10"] == 1)
        Talk2me "Sunbathing girl#pay_fild10" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild10" 0
    stoptimer
return
OnClick:
    if (lv["status_pay_fild10"] == 0)
        cmdothernpc "Bonfire#pay_fild10" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "pay_fild10" "Sitting woman#pay_fild10" 4_TOWER_07 136 231 3 0 0
OnInit:
	disablenpc "Sitting woman#pay_fild10"
	strlocalvar 1 "status_pay_fild10"
	SetLocalVar "status_pay_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild10"] == 1)
        Talk2me "Sitting woman#pay_fild10" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild10" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild10"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild10" "try_to_start"
	    wait
        if (lv["status_pay_fild10"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "pay_fild10" "Wanderer#pay_fild10" 4_F_05 134 229 1 0 0
OnInit:
	disablenpc "Wanderer#pay_fild10"
	strlocalvar 1 "status_pay_fild10"
	SetLocalVar "status_pay_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild10"] == 1)
        Talk2me "Wanderer#pay_fild10" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild10" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild10"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild10" "try_to_start"
	    wait
        if (lv["status_pay_fild10"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "pay_fild10" "#plate1_pay_fild10" GLASS_PLATE 133 232 5 0 0
OnInit:
	disablenpc "#plate1_pay_fild10"
return

npc "pay_fild10" "#plate2_pay_fild10" GLASS_PLATE 130 229 5 0 0
OnInit:
	disablenpc "#plate2_pay_fild10"
return

npc "pay_fild10" "#plate3_pay_fild10" GLASS_PLATE 136 230 5 0 0
OnInit:
	disablenpc "#plate3_pay_fild10"
return

npc "pay_fild10" "#basket_pay_fild10" 4_ROPEPILE 130 226 5 0 0
OnInit:
	disablenpc "#basket_pay_fild10"
return

// pay_fild11 ============[OFF]==============
npc "pay_fild11" "Extinct Bonfire#pay_fild11" 4_TRACE 192 283 5 0 0
return

// pay_fild11 ============[ON]==============
npc "pay_fild11" "Bonfire#pay_fild11" 4_BONFIRE 192 283 5 0 0
OnInit:
	disablenpc "Bonfire#pay_fild11"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#pay_fild11" "start"
        cmdothernpc "Sitting woman#pay_fild11" "start"
        cmdothernpc "Wanderer#pay_fild11" "start"
        cmdothernpc "Sunbathing girl#pay_fild11" "start"
    endif
return

npc "pay_fild11" "Sitting man#pay_fild11" 4_TOWER_02 189 283 6 0 0
OnInit:
	disablenpc "Sitting man#pay_fild11"
	strlocalvar 1 "status_pay_fild11"
	SetLocalVar "status_pay_fild11" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild11"] == 1)
        Talk2me "Sitting man#pay_fild11" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild11" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild11"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild11" "try_to_start"
	    wait
        if (lv["status_pay_fild11"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "pay_fild11" "Sunbathing girl#pay_fild11" 4_F_PATIENT 191 285 5 0 0
OnInit:
	disablenpc "Sunbathing girl#pay_fild11"
	strlocalvar 1 "status_pay_fild11"
	SetLocalVar "status_pay_fild11" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild11"] == 1)
        Talk2me "Sunbathing girl#pay_fild11" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild11" 0
    stoptimer
return
OnClick:
    if (lv["status_pay_fild11"] == 0)
        cmdothernpc "Bonfire#pay_fild11" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "pay_fild11" "Sitting woman#pay_fild11" 4_TOWER_07 195 284 3 0 0
OnInit:
	disablenpc "Sitting woman#pay_fild11"
	strlocalvar 1 "status_pay_fild11"
	SetLocalVar "status_pay_fild11" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild11"] == 1)
        Talk2me "Sitting woman#pay_fild11" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild11" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild11"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild11" "try_to_start"
	    wait
        if (lv["status_pay_fild11"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "pay_fild11" "Wanderer#pay_fild11" 4_F_05 193 282 1 0 0
OnInit:
	disablenpc "Wanderer#pay_fild11"
	strlocalvar 1 "status_pay_fild11"
	SetLocalVar "status_pay_fild11" 0
return
OnCommand: "start"
	SetLocalVar "status_pay_fild11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_pay_fild11"] == 1)
        Talk2me "Wanderer#pay_fild11" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_pay_fild11" 0
    stoptimer
return
OnClick:
	if (lv["status_pay_fild11"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#pay_fild11" "try_to_start"
	    wait
        if (lv["status_pay_fild11"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "pay_fild11" "#plate1_pay_fild11" GLASS_PLATE 192 285 5 0 0
OnInit:
	disablenpc "#plate1_pay_fild11"
return

npc "pay_fild11" "#plate2_pay_fild11" GLASS_PLATE 189 282 5 0 0
OnInit:
	disablenpc "#plate2_pay_fild11"
return

npc "pay_fild11" "#plate3_pay_fild11" GLASS_PLATE 195 283 5 0 0
OnInit:
	disablenpc "#plate3_pay_fild11"
return

npc "pay_fild11" "#basket_pay_fild11" 4_ROPEPILE 189 279 5 0 0
OnInit:
	disablenpc "#basket_pay_fild11"
return

// hu_fild01 ============[OFF]==============
npc "hu_fild01" "Extinct Bonfire#hu_fild01" 4_TRACE 263 96 5 0 0
return

// hu_fild01 ============[ON]==============
npc "hu_fild01" "Bonfire#hu_fild01" 4_BONFIRE 263 96 5 0 0
OnInit:
	disablenpc "Bonfire#hu_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#hu_fild01" "start"
        cmdothernpc "Sitting woman#hu_fild01" "start"
        cmdothernpc "Wanderer#hu_fild01" "start"
        cmdothernpc "Sunbathing girl#hu_fild01" "start"
    endif
return

npc "hu_fild01" "Sitting man#hu_fild01" 4_TOWER_02 260 96 6 0 0
OnInit:
	disablenpc "Sitting man#hu_fild01"
	strlocalvar 1 "status_hu_fild01"
	SetLocalVar "status_hu_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild01"] == 1)
        Talk2me "Sitting man#hu_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild01" "try_to_start"
	    wait
        if (lv["status_hu_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "hu_fild01" "Sunbathing girl#hu_fild01" 4_F_PATIENT 262 98 5 0 0
OnInit:
	disablenpc "Sunbathing girl#hu_fild01"
	strlocalvar 1 "status_hu_fild01"
	SetLocalVar "status_hu_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild01"] == 1)
        Talk2me "Sunbathing girl#hu_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_hu_fild01"] == 0)
        cmdothernpc "Bonfire#hu_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "hu_fild01" "Sitting woman#hu_fild01" 4_TOWER_07 266 97 3 0 0
OnInit:
	disablenpc "Sitting woman#hu_fild01"
	strlocalvar 1 "status_hu_fild01"
	SetLocalVar "status_hu_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild01"] == 1)
        Talk2me "Sitting woman#hu_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild01" "try_to_start"
	    wait
        if (lv["status_hu_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "hu_fild01" "Wanderer#hu_fild01" 4_F_05 264 95 1 0 0
OnInit:
	disablenpc "Wanderer#hu_fild01"
	strlocalvar 1 "status_hu_fild01"
	SetLocalVar "status_hu_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild01"] == 1)
        Talk2me "Wanderer#hu_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild01" "try_to_start"
	    wait
        if (lv["status_hu_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "hu_fild01" "#plate1_hu_fild01" GLASS_PLATE 263 98 5 0 0
OnInit:
	disablenpc "#plate1_hu_fild01"
return

npc "hu_fild01" "#plate2_hu_fild01" GLASS_PLATE 260 95 5 0 0
OnInit:
	disablenpc "#plate2_hu_fild01"
return

npc "hu_fild01" "#plate3_hu_fild01" GLASS_PLATE 266 96 5 0 0
OnInit:
	disablenpc "#plate3_hu_fild01"
return

npc "hu_fild01" "#basket_hu_fild01" 4_ROPEPILE 260 92 5 0 0
OnInit:
	disablenpc "#basket_hu_fild01"
return

// hu_fild02 ============[OFF]==============
npc "hu_fild02" "Extinct Bonfire#hu_fild02" 4_TRACE 218 183 5 0 0
return

// hu_fild02 ============[ON]==============
npc "hu_fild02" "Bonfire#hu_fild02" 4_BONFIRE 218 183 5 0 0
OnInit:
	disablenpc "Bonfire#hu_fild02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#hu_fild02" "start"
        cmdothernpc "Sitting woman#hu_fild02" "start"
        cmdothernpc "Wanderer#hu_fild02" "start"
        cmdothernpc "Sunbathing girl#hu_fild02" "start"
    endif
return

npc "hu_fild02" "Sitting man#hu_fild02" 4_TOWER_02 215 183 6 0 0
OnInit:
	disablenpc "Sitting man#hu_fild02"
	strlocalvar 1 "status_hu_fild02"
	SetLocalVar "status_hu_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild02"] == 1)
        Talk2me "Sitting man#hu_fild02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild02" "try_to_start"
	    wait
        if (lv["status_hu_fild02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "hu_fild02" "Sunbathing girl#hu_fild02" 4_F_PATIENT 217 185 5 0 0
OnInit:
	disablenpc "Sunbathing girl#hu_fild02"
	strlocalvar 1 "status_hu_fild02"
	SetLocalVar "status_hu_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild02"] == 1)
        Talk2me "Sunbathing girl#hu_fild02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild02" 0
    stoptimer
return
OnClick:
    if (lv["status_hu_fild02"] == 0)
        cmdothernpc "Bonfire#hu_fild02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "hu_fild02" "Sitting woman#hu_fild02" 4_TOWER_07 221 184 3 0 0
OnInit:
	disablenpc "Sitting woman#hu_fild02"
	strlocalvar 1 "status_hu_fild02"
	SetLocalVar "status_hu_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild02"] == 1)
        Talk2me "Sitting woman#hu_fild02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild02" "try_to_start"
	    wait
        if (lv["status_hu_fild02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "hu_fild02" "Wanderer#hu_fild02" 4_F_05 219 182 1 0 0
OnInit:
	disablenpc "Wanderer#hu_fild02"
	strlocalvar 1 "status_hu_fild02"
	SetLocalVar "status_hu_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild02"] == 1)
        Talk2me "Wanderer#hu_fild02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild02" "try_to_start"
	    wait
        if (lv["status_hu_fild02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "hu_fild02" "#plate1_hu_fild02" GLASS_PLATE 218 185 5 0 0
OnInit:
	disablenpc "#plate1_hu_fild02"
return

npc "hu_fild02" "#plate2_hu_fild02" GLASS_PLATE 215 182 5 0 0
OnInit:
	disablenpc "#plate2_hu_fild02"
return

npc "hu_fild02" "#plate3_hu_fild02" GLASS_PLATE 221 183 5 0 0
OnInit:
	disablenpc "#plate3_hu_fild02"
return

npc "hu_fild02" "#basket_hu_fild02" 4_ROPEPILE 215 179 5 0 0
OnInit:
	disablenpc "#basket_hu_fild02"
return

// hu_fild03 ============[OFF]==============
npc "hu_fild03" "Extinct Bonfire#hu_fild03" 4_TRACE 235 183 5 0 0
return

// hu_fild03 ============[ON]==============
npc "hu_fild03" "Bonfire#hu_fild03" 4_BONFIRE 235 183 5 0 0
OnInit:
	disablenpc "Bonfire#hu_fild03"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#hu_fild03" "start"
        cmdothernpc "Sitting woman#hu_fild03" "start"
        cmdothernpc "Wanderer#hu_fild03" "start"
        cmdothernpc "Sunbathing girl#hu_fild03" "start"
    endif
return

npc "hu_fild03" "Sitting man#hu_fild03" 4_TOWER_02 232 183 6 0 0
OnInit:
	disablenpc "Sitting man#hu_fild03"
	strlocalvar 1 "status_hu_fild03"
	SetLocalVar "status_hu_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild03"] == 1)
        Talk2me "Sitting man#hu_fild03" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild03"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild03" "try_to_start"
	    wait
        if (lv["status_hu_fild03"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "hu_fild03" "Sunbathing girl#hu_fild03" 4_F_PATIENT 234 185 5 0 0
OnInit:
	disablenpc "Sunbathing girl#hu_fild03"
	strlocalvar 1 "status_hu_fild03"
	SetLocalVar "status_hu_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild03"] == 1)
        Talk2me "Sunbathing girl#hu_fild03" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild03" 0
    stoptimer
return
OnClick:
    if (lv["status_hu_fild03"] == 0)
        cmdothernpc "Bonfire#hu_fild03" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "hu_fild03" "Sitting woman#hu_fild03" 4_TOWER_07 238 184 3 0 0
OnInit:
	disablenpc "Sitting woman#hu_fild03"
	strlocalvar 1 "status_hu_fild03"
	SetLocalVar "status_hu_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild03"] == 1)
        Talk2me "Sitting woman#hu_fild03" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild03"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild03" "try_to_start"
	    wait
        if (lv["status_hu_fild03"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "hu_fild03" "Wanderer#hu_fild03" 4_F_05 236 182 1 0 0
OnInit:
	disablenpc "Wanderer#hu_fild03"
	strlocalvar 1 "status_hu_fild03"
	SetLocalVar "status_hu_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild03"] == 1)
        Talk2me "Wanderer#hu_fild03" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild03"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild03" "try_to_start"
	    wait
        if (lv["status_hu_fild03"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "hu_fild03" "#plate1_hu_fild03" GLASS_PLATE 235 185 5 0 0
OnInit:
	disablenpc "#plate1_hu_fild03"
return

npc "hu_fild03" "#plate2_hu_fild03" GLASS_PLATE 232 182 5 0 0
OnInit:
	disablenpc "#plate2_hu_fild03"
return

npc "hu_fild03" "#plate3_hu_fild03" GLASS_PLATE 238 183 5 0 0
OnInit:
	disablenpc "#plate3_hu_fild03"
return

npc "hu_fild03" "#basket_hu_fild03" 4_ROPEPILE 232 179 5 0 0
OnInit:
	disablenpc "#basket_hu_fild03"
return

// hu_fild04 ============[OFF]==============
npc "hu_fild04" "Extinct Bonfire#hu_fild04" 4_TRACE 266 192 5 0 0
return

// hu_fild04 ============[ON]==============
npc "hu_fild04" "Bonfire#hu_fild04" 4_BONFIRE 266 192 5 0 0
OnInit:
	disablenpc "Bonfire#hu_fild04"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#hu_fild04" "start"
        cmdothernpc "Sitting woman#hu_fild04" "start"
        cmdothernpc "Wanderer#hu_fild04" "start"
        cmdothernpc "Sunbathing girl#hu_fild04" "start"
    endif
return

npc "hu_fild04" "Sitting man#hu_fild04" 4_TOWER_02 263 192 6 0 0
OnInit:
	disablenpc "Sitting man#hu_fild04"
	strlocalvar 1 "status_hu_fild04"
	SetLocalVar "status_hu_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild04"] == 1)
        Talk2me "Sitting man#hu_fild04" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild04"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild04" "try_to_start"
	    wait
        if (lv["status_hu_fild04"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "hu_fild04" "Sunbathing girl#hu_fild04" 4_F_PATIENT 265 194 5 0 0
OnInit:
	disablenpc "Sunbathing girl#hu_fild04"
	strlocalvar 1 "status_hu_fild04"
	SetLocalVar "status_hu_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild04"] == 1)
        Talk2me "Sunbathing girl#hu_fild04" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild04" 0
    stoptimer
return
OnClick:
    if (lv["status_hu_fild04"] == 0)
        cmdothernpc "Bonfire#hu_fild04" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "hu_fild04" "Sitting woman#hu_fild04" 4_TOWER_07 269 193 3 0 0
OnInit:
	disablenpc "Sitting woman#hu_fild04"
	strlocalvar 1 "status_hu_fild04"
	SetLocalVar "status_hu_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild04"] == 1)
        Talk2me "Sitting woman#hu_fild04" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild04"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild04" "try_to_start"
	    wait
        if (lv["status_hu_fild04"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "hu_fild04" "Wanderer#hu_fild04" 4_F_05 267 191 1 0 0
OnInit:
	disablenpc "Wanderer#hu_fild04"
	strlocalvar 1 "status_hu_fild04"
	SetLocalVar "status_hu_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild04"] == 1)
        Talk2me "Wanderer#hu_fild04" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild04"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild04" "try_to_start"
	    wait
        if (lv["status_hu_fild04"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "hu_fild04" "#plate1_hu_fild04" GLASS_PLATE 266 194 5 0 0
OnInit:
	disablenpc "#plate1_hu_fild04"
return

npc "hu_fild04" "#plate2_hu_fild04" GLASS_PLATE 263 191 5 0 0
OnInit:
	disablenpc "#plate2_hu_fild04"
return

npc "hu_fild04" "#plate3_hu_fild04" GLASS_PLATE 269 192 5 0 0
OnInit:
	disablenpc "#plate3_hu_fild04"
return

npc "hu_fild04" "#basket_hu_fild04" 4_ROPEPILE 263 188 5 0 0
OnInit:
	disablenpc "#basket_hu_fild04"
return

// hu_fild05 ============[OFF]==============
npc "hu_fild05" "Extinct Bonfire#hu_fild05" 4_TRACE 320 283 5 0 0
return

// hu_fild05 ============[ON]==============
npc "hu_fild05" "Bonfire#hu_fild05" 4_BONFIRE 320 283 5 0 0
OnInit:
	disablenpc "Bonfire#hu_fild05"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#hu_fild05" "start"
        cmdothernpc "Sitting woman#hu_fild05" "start"
        cmdothernpc "Wanderer#hu_fild05" "start"
        cmdothernpc "Sunbathing girl#hu_fild05" "start"
    endif
return

npc "hu_fild05" "Sitting man#hu_fild05" 4_TOWER_02 317 283 6 0 0
OnInit:
	disablenpc "Sitting man#hu_fild05"
	strlocalvar 1 "status_hu_fild05"
	SetLocalVar "status_hu_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild05"] == 1)
        Talk2me "Sitting man#hu_fild05" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild05"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild05" "try_to_start"
	    wait
        if (lv["status_hu_fild05"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "hu_fild05" "Sunbathing girl#hu_fild05" 4_F_PATIENT 319 285 5 0 0
OnInit:
	disablenpc "Sunbathing girl#hu_fild05"
	strlocalvar 1 "status_hu_fild05"
	SetLocalVar "status_hu_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild05"] == 1)
        Talk2me "Sunbathing girl#hu_fild05" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild05" 0
    stoptimer
return
OnClick:
    if (lv["status_hu_fild05"] == 0)
        cmdothernpc "Bonfire#hu_fild05" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "hu_fild05" "Sitting woman#hu_fild05" 4_TOWER_07 323 284 3 0 0
OnInit:
	disablenpc "Sitting woman#hu_fild05"
	strlocalvar 1 "status_hu_fild05"
	SetLocalVar "status_hu_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild05"] == 1)
        Talk2me "Sitting woman#hu_fild05" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild05"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild05" "try_to_start"
	    wait
        if (lv["status_hu_fild05"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "hu_fild05" "Wanderer#hu_fild05" 4_F_05 321 282 1 0 0
OnInit:
	disablenpc "Wanderer#hu_fild05"
	strlocalvar 1 "status_hu_fild05"
	SetLocalVar "status_hu_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild05"] == 1)
        Talk2me "Wanderer#hu_fild05" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild05"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild05" "try_to_start"
	    wait
        if (lv["status_hu_fild05"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "hu_fild05" "#plate1_hu_fild05" GLASS_PLATE 320 285 5 0 0
OnInit:
	disablenpc "#plate1_hu_fild05"
return

npc "hu_fild05" "#plate2_hu_fild05" GLASS_PLATE 317 282 5 0 0
OnInit:
	disablenpc "#plate2_hu_fild05"
return

npc "hu_fild05" "#plate3_hu_fild05" GLASS_PLATE 323 283 5 0 0
OnInit:
	disablenpc "#plate3_hu_fild05"
return

npc "hu_fild05" "#basket_hu_fild05" 4_ROPEPILE 317 279 5 0 0
OnInit:
	disablenpc "#basket_hu_fild05"
return

// hu_fild06 ============[OFF]==============
npc "hu_fild06" "Extinct Bonfire#hu_fild06" 4_TRACE 230 260 5 0 0
return

// hu_fild06 ============[ON]==============
npc "hu_fild06" "Bonfire#hu_fild06" 4_BONFIRE 230 260 5 0 0
OnInit:
	disablenpc "Bonfire#hu_fild06"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#hu_fild06" "start"
        cmdothernpc "Sitting woman#hu_fild06" "start"
        cmdothernpc "Wanderer#hu_fild06" "start"
        cmdothernpc "Sunbathing girl#hu_fild06" "start"
    endif
return

npc "hu_fild06" "Sitting man#hu_fild06" 4_TOWER_02 227 260 6 0 0
OnInit:
	disablenpc "Sitting man#hu_fild06"
	strlocalvar 1 "status_hu_fild06"
	SetLocalVar "status_hu_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild06"] == 1)
        Talk2me "Sitting man#hu_fild06" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild06" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild06"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild06" "try_to_start"
	    wait
        if (lv["status_hu_fild06"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "hu_fild06" "Sunbathing girl#hu_fild06" 4_F_PATIENT 229 262 5 0 0
OnInit:
	disablenpc "Sunbathing girl#hu_fild06"
	strlocalvar 1 "status_hu_fild06"
	SetLocalVar "status_hu_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild06"] == 1)
        Talk2me "Sunbathing girl#hu_fild06" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild06" 0
    stoptimer
return
OnClick:
    if (lv["status_hu_fild06"] == 0)
        cmdothernpc "Bonfire#hu_fild06" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "hu_fild06" "Sitting woman#hu_fild06" 4_TOWER_07 233 261 3 0 0
OnInit:
	disablenpc "Sitting woman#hu_fild06"
	strlocalvar 1 "status_hu_fild06"
	SetLocalVar "status_hu_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild06"] == 1)
        Talk2me "Sitting woman#hu_fild06" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild06" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild06"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild06" "try_to_start"
	    wait
        if (lv["status_hu_fild06"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "hu_fild06" "Wanderer#hu_fild06" 4_F_05 231 259 1 0 0
OnInit:
	disablenpc "Wanderer#hu_fild06"
	strlocalvar 1 "status_hu_fild06"
	SetLocalVar "status_hu_fild06" 0
return
OnCommand: "start"
	SetLocalVar "status_hu_fild06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_hu_fild06"] == 1)
        Talk2me "Wanderer#hu_fild06" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_hu_fild06" 0
    stoptimer
return
OnClick:
	if (lv["status_hu_fild06"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#hu_fild06" "try_to_start"
	    wait
        if (lv["status_hu_fild06"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "hu_fild06" "#plate1_hu_fild06" GLASS_PLATE 230 262 5 0 0
OnInit:
	disablenpc "#plate1_hu_fild06"
return

npc "hu_fild06" "#plate2_hu_fild06" GLASS_PLATE 227 259 5 0 0
OnInit:
	disablenpc "#plate2_hu_fild06"
return

npc "hu_fild06" "#plate3_hu_fild06" GLASS_PLATE 233 260 5 0 0
OnInit:
	disablenpc "#plate3_hu_fild06"
return

npc "hu_fild06" "#basket_hu_fild06" 4_ROPEPILE 227 256 5 0 0
OnInit:
	disablenpc "#basket_hu_fild06"
return

// ama_fild01 ============[OFF]==============
npc "ama_fild01" "Extinct Bonfire#ama_fild01" 4_TRACE 229 197 5 0 0
return

// ama_fild01 ============[ON]==============
npc "ama_fild01" "Bonfire#ama_fild01" 4_BONFIRE 229 197 5 0 0
OnInit:
	disablenpc "Bonfire#ama_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#ama_fild01" "start"
        cmdothernpc "Sitting woman#ama_fild01" "start"
        cmdothernpc "Wanderer#ama_fild01" "start"
        cmdothernpc "Sunbathing girl#ama_fild01" "start"
    endif
return

npc "ama_fild01" "Sitting man#ama_fild01" 4_TOWER_02 226 197 6 0 0
OnInit:
	disablenpc "Sitting man#ama_fild01"
	strlocalvar 1 "status_ama_fild01"
	SetLocalVar "status_ama_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_ama_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ama_fild01"] == 1)
        Talk2me "Sitting man#ama_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ama_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_ama_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ama_fild01" "try_to_start"
	    wait
        if (lv["status_ama_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "ama_fild01" "Sunbathing girl#ama_fild01" 4_F_PATIENT 228 199 5 0 0
OnInit:
	disablenpc "Sunbathing girl#ama_fild01"
	strlocalvar 1 "status_ama_fild01"
	SetLocalVar "status_ama_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_ama_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ama_fild01"] == 1)
        Talk2me "Sunbathing girl#ama_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_ama_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_ama_fild01"] == 0)
        cmdothernpc "Bonfire#ama_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "ama_fild01" "Sitting woman#ama_fild01" 4_TOWER_07 232 198 3 0 0
OnInit:
	disablenpc "Sitting woman#ama_fild01"
	strlocalvar 1 "status_ama_fild01"
	SetLocalVar "status_ama_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_ama_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ama_fild01"] == 1)
        Talk2me "Sitting woman#ama_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ama_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_ama_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ama_fild01" "try_to_start"
	    wait
        if (lv["status_ama_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "ama_fild01" "Wanderer#ama_fild01" 4_F_05 230 196 1 0 0
OnInit:
	disablenpc "Wanderer#ama_fild01"
	strlocalvar 1 "status_ama_fild01"
	SetLocalVar "status_ama_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_ama_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ama_fild01"] == 1)
        Talk2me "Wanderer#ama_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ama_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_ama_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ama_fild01" "try_to_start"
	    wait
        if (lv["status_ama_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "ama_fild01" "#plate1_ama_fild01" GLASS_PLATE 229 199 5 0 0
OnInit:
	disablenpc "#plate1_ama_fild01"
return

npc "ama_fild01" "#plate2_ama_fild01" GLASS_PLATE 226 196 5 0 0
OnInit:
	disablenpc "#plate2_ama_fild01"
return

npc "ama_fild01" "#plate3_ama_fild01" GLASS_PLATE 232 197 5 0 0
OnInit:
	disablenpc "#plate3_ama_fild01"
return

npc "ama_fild01" "#basket_ama_fild01" 4_ROPEPILE 226 193 5 0 0
OnInit:
	disablenpc "#basket_ama_fild01"
return

// bra_fild01 ============[OFF]==============
npc "bra_fild01" "Extinct Bonfire#bra_fild01" 4_TRACE 149 148 5 0 0
return

// bra_fild01 ============[ON]==============
npc "bra_fild01" "Bonfire#bra_fild01" 4_BONFIRE 149 148 5 0 0
OnInit:
	disablenpc "Bonfire#bra_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#bra_fild01" "start"
        cmdothernpc "Sitting woman#bra_fild01" "start"
        cmdothernpc "Wanderer#bra_fild01" "start"
        cmdothernpc "Sunbathing girl#bra_fild01" "start"
    endif
return

npc "bra_fild01" "Sitting man#bra_fild01" 4_TOWER_02 146 148 6 0 0
OnInit:
	disablenpc "Sitting man#bra_fild01"
	strlocalvar 1 "status_bra_fild01"
	SetLocalVar "status_bra_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_bra_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_bra_fild01"] == 1)
        Talk2me "Sitting man#bra_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_bra_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_bra_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#bra_fild01" "try_to_start"
	    wait
        if (lv["status_bra_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "bra_fild01" "Sunbathing girl#bra_fild01" 4_F_PATIENT 148 150 5 0 0
OnInit:
	disablenpc "Sunbathing girl#bra_fild01"
	strlocalvar 1 "status_bra_fild01"
	SetLocalVar "status_bra_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_bra_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_bra_fild01"] == 1)
        Talk2me "Sunbathing girl#bra_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_bra_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_bra_fild01"] == 0)
        cmdothernpc "Bonfire#bra_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "bra_fild01" "Sitting woman#bra_fild01" 4_TOWER_07 152 149 3 0 0
OnInit:
	disablenpc "Sitting woman#bra_fild01"
	strlocalvar 1 "status_bra_fild01"
	SetLocalVar "status_bra_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_bra_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_bra_fild01"] == 1)
        Talk2me "Sitting woman#bra_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_bra_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_bra_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#bra_fild01" "try_to_start"
	    wait
        if (lv["status_bra_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "bra_fild01" "Wanderer#bra_fild01" 4_F_05 150 147 1 0 0
OnInit:
	disablenpc "Wanderer#bra_fild01"
	strlocalvar 1 "status_bra_fild01"
	SetLocalVar "status_bra_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_bra_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_bra_fild01"] == 1)
        Talk2me "Wanderer#bra_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_bra_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_bra_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#bra_fild01" "try_to_start"
	    wait
        if (lv["status_bra_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "bra_fild01" "#plate1_bra_fild01" GLASS_PLATE 149 150 5 0 0
OnInit:
	disablenpc "#plate1_bra_fild01"
return

npc "bra_fild01" "#plate2_bra_fild01" GLASS_PLATE 146 147 5 0 0
OnInit:
	disablenpc "#plate2_bra_fild01"
return

npc "bra_fild01" "#plate3_bra_fild01" GLASS_PLATE 152 148 5 0 0
OnInit:
	disablenpc "#plate3_bra_fild01"
return

npc "bra_fild01" "#basket_bra_fild01" 4_ROPEPILE 146 144 5 0 0
OnInit:
	disablenpc "#basket_bra_fild01"
return

// dew_fild01 ============[OFF]==============
npc "dew_fild01" "Extinct Bonfire#dew_fild01" 4_TRACE 219 153 5 0 0
return

// dew_fild01 ============[ON]==============
npc "dew_fild01" "Bonfire#dew_fild01" 4_BONFIRE 219 153 5 0 0
OnInit:
	disablenpc "Bonfire#dew_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#dew_fild01" "start"
        cmdothernpc "Sitting woman#dew_fild01" "start"
        cmdothernpc "Wanderer#dew_fild01" "start"
        cmdothernpc "Sunbathing girl#dew_fild01" "start"
    endif
return

npc "dew_fild01" "Sitting man#dew_fild01" 4_TOWER_02 216 153 6 0 0
OnInit:
	disablenpc "Sitting man#dew_fild01"
	strlocalvar 1 "status_dew_fild01"
	SetLocalVar "status_dew_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_dew_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_dew_fild01"] == 1)
        Talk2me "Sitting man#dew_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_dew_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_dew_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#dew_fild01" "try_to_start"
	    wait
        if (lv["status_dew_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "dew_fild01" "Sunbathing girl#dew_fild01" 4_F_PATIENT 218 155 5 0 0
OnInit:
	disablenpc "Sunbathing girl#dew_fild01"
	strlocalvar 1 "status_dew_fild01"
	SetLocalVar "status_dew_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_dew_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_dew_fild01"] == 1)
        Talk2me "Sunbathing girl#dew_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_dew_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_dew_fild01"] == 0)
        cmdothernpc "Bonfire#dew_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "dew_fild01" "Sitting woman#dew_fild01" 4_TOWER_07 222 154 3 0 0
OnInit:
	disablenpc "Sitting woman#dew_fild01"
	strlocalvar 1 "status_dew_fild01"
	SetLocalVar "status_dew_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_dew_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_dew_fild01"] == 1)
        Talk2me "Sitting woman#dew_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_dew_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_dew_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#dew_fild01" "try_to_start"
	    wait
        if (lv["status_dew_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "dew_fild01" "Wanderer#dew_fild01" 4_F_05 220 152 1 0 0
OnInit:
	disablenpc "Wanderer#dew_fild01"
	strlocalvar 1 "status_dew_fild01"
	SetLocalVar "status_dew_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_dew_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_dew_fild01"] == 1)
        Talk2me "Wanderer#dew_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_dew_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_dew_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#dew_fild01" "try_to_start"
	    wait
        if (lv["status_dew_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "dew_fild01" "#plate1_dew_fild01" GLASS_PLATE 219 155 5 0 0
OnInit:
	disablenpc "#plate1_dew_fild01"
return

npc "dew_fild01" "#plate2_dew_fild01" GLASS_PLATE 216 152 5 0 0
OnInit:
	disablenpc "#plate2_dew_fild01"
return

npc "dew_fild01" "#plate3_dew_fild01" GLASS_PLATE 222 153 5 0 0
OnInit:
	disablenpc "#plate3_dew_fild01"
return

npc "dew_fild01" "#basket_dew_fild01" 4_ROPEPILE 216 149 5 0 0
OnInit:
	disablenpc "#basket_dew_fild01"
return

// mosk_fild02 ============[OFF]==============
npc "mosk_fild02" "Extinct Bonfire#mosk_fild02" 4_TRACE 119 118 5 0 0
return

// mosk_fild02 ============[ON]==============
npc "mosk_fild02" "Bonfire#mosk_fild02" 4_BONFIRE 119 118 5 0 0
OnInit:
	disablenpc "Bonfire#mosk_fild02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mosk_fild02" "start"
        cmdothernpc "Sitting woman#mosk_fild02" "start"
        cmdothernpc "Wanderer#mosk_fild02" "start"
        cmdothernpc "Sunbathing girl#mosk_fild02" "start"
    endif
return

npc "mosk_fild02" "Sitting man#mosk_fild02" 4_TOWER_02 116 118 6 0 0
OnInit:
	disablenpc "Sitting man#mosk_fild02"
	strlocalvar 1 "status_mosk_fild02"
	SetLocalVar "status_mosk_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_fild02"] == 1)
        Talk2me "Sitting man#mosk_fild02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_mosk_fild02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mosk_fild02" "try_to_start"
	    wait
        if (lv["status_mosk_fild02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mosk_fild02" "Sunbathing girl#mosk_fild02" 4_F_PATIENT 118 120 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mosk_fild02"
	strlocalvar 1 "status_mosk_fild02"
	SetLocalVar "status_mosk_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_fild02"] == 1)
        Talk2me "Sunbathing girl#mosk_fild02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_fild02" 0
    stoptimer
return
OnClick:
    if (lv["status_mosk_fild02"] == 0)
        cmdothernpc "Bonfire#mosk_fild02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mosk_fild02" "Sitting woman#mosk_fild02" 4_TOWER_07 122 119 3 0 0
OnInit:
	disablenpc "Sitting woman#mosk_fild02"
	strlocalvar 1 "status_mosk_fild02"
	SetLocalVar "status_mosk_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_fild02"] == 1)
        Talk2me "Sitting woman#mosk_fild02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_mosk_fild02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mosk_fild02" "try_to_start"
	    wait
        if (lv["status_mosk_fild02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mosk_fild02" "Wanderer#mosk_fild02" 4_F_05 120 117 1 0 0
OnInit:
	disablenpc "Wanderer#mosk_fild02"
	strlocalvar 1 "status_mosk_fild02"
	SetLocalVar "status_mosk_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_fild02"] == 1)
        Talk2me "Wanderer#mosk_fild02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_mosk_fild02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mosk_fild02" "try_to_start"
	    wait
        if (lv["status_mosk_fild02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mosk_fild02" "#plate1_mosk_fild02" GLASS_PLATE 119 120 5 0 0
OnInit:
	disablenpc "#plate1_mosk_fild02"
return

npc "mosk_fild02" "#plate2_mosk_fild02" GLASS_PLATE 116 117 5 0 0
OnInit:
	disablenpc "#plate2_mosk_fild02"
return

npc "mosk_fild02" "#plate3_mosk_fild02" GLASS_PLATE 122 118 5 0 0
OnInit:
	disablenpc "#plate3_mosk_fild02"
return

npc "mosk_fild02" "#basket_mosk_fild02" 4_ROPEPILE 116 114 5 0 0
OnInit:
	disablenpc "#basket_mosk_fild02"
return

// mosk_dun01 ============[OFF]==============
npc "mosk_dun01" "Extinct Bonfire#mosk_dun01" 4_TRACE 129 142 5 0 0
return

// mosk_dun01 ============[ON]==============
npc "mosk_dun01" "Bonfire#mosk_dun01" 4_BONFIRE 129 142 5 0 0
OnInit:
	disablenpc "Bonfire#mosk_dun01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mosk_dun01" "start"
        cmdothernpc "Sitting woman#mosk_dun01" "start"
        cmdothernpc "Wanderer#mosk_dun01" "start"
        cmdothernpc "Sunbathing girl#mosk_dun01" "start"
    endif
return

npc "mosk_dun01" "Sitting man#mosk_dun01" 4_TOWER_02 126 142 6 0 0
OnInit:
	disablenpc "Sitting man#mosk_dun01"
	strlocalvar 1 "status_mosk_dun01"
	SetLocalVar "status_mosk_dun01" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_dun01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_dun01"] == 1)
        Talk2me "Sitting man#mosk_dun01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_dun01" 0
    stoptimer
return
OnClick:
	if (lv["status_mosk_dun01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mosk_dun01" "try_to_start"
	    wait
        if (lv["status_mosk_dun01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mosk_dun01" "Sunbathing girl#mosk_dun01" 4_F_PATIENT 128 144 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mosk_dun01"
	strlocalvar 1 "status_mosk_dun01"
	SetLocalVar "status_mosk_dun01" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_dun01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_dun01"] == 1)
        Talk2me "Sunbathing girl#mosk_dun01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_dun01" 0
    stoptimer
return
OnClick:
    if (lv["status_mosk_dun01"] == 0)
        cmdothernpc "Bonfire#mosk_dun01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mosk_dun01" "Sitting woman#mosk_dun01" 4_TOWER_07 132 143 3 0 0
OnInit:
	disablenpc "Sitting woman#mosk_dun01"
	strlocalvar 1 "status_mosk_dun01"
	SetLocalVar "status_mosk_dun01" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_dun01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_dun01"] == 1)
        Talk2me "Sitting woman#mosk_dun01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_dun01" 0
    stoptimer
return
OnClick:
	if (lv["status_mosk_dun01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mosk_dun01" "try_to_start"
	    wait
        if (lv["status_mosk_dun01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mosk_dun01" "Wanderer#mosk_dun01" 4_F_05 130 141 1 0 0
OnInit:
	disablenpc "Wanderer#mosk_dun01"
	strlocalvar 1 "status_mosk_dun01"
	SetLocalVar "status_mosk_dun01" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_dun01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_dun01"] == 1)
        Talk2me "Wanderer#mosk_dun01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_dun01" 0
    stoptimer
return
OnClick:
	if (lv["status_mosk_dun01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mosk_dun01" "try_to_start"
	    wait
        if (lv["status_mosk_dun01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mosk_dun01" "#plate1_mosk_dun01" GLASS_PLATE 129 144 5 0 0
OnInit:
	disablenpc "#plate1_mosk_dun01"
return

npc "mosk_dun01" "#plate2_mosk_dun01" GLASS_PLATE 126 141 5 0 0
OnInit:
	disablenpc "#plate2_mosk_dun01"
return

npc "mosk_dun01" "#plate3_mosk_dun01" GLASS_PLATE 132 142 5 0 0
OnInit:
	disablenpc "#plate3_mosk_dun01"
return

npc "mosk_dun01" "#basket_mosk_dun01" 4_ROPEPILE 126 138 5 0 0
OnInit:
	disablenpc "#basket_mosk_dun01"
return

// mosk_dun02 ============[OFF]==============
npc "mosk_dun02" "Extinct Bonfire#mosk_dun02" 4_TRACE 130 154 5 0 0
return

// mosk_dun02 ============[ON]==============
npc "mosk_dun02" "Bonfire#mosk_dun02" 4_BONFIRE 130 154 5 0 0
OnInit:
	disablenpc "Bonfire#mosk_dun02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mosk_dun02" "start"
        cmdothernpc "Sitting woman#mosk_dun02" "start"
        cmdothernpc "Wanderer#mosk_dun02" "start"
        cmdothernpc "Sunbathing girl#mosk_dun02" "start"
    endif
return

npc "mosk_dun02" "Sitting man#mosk_dun02" 4_TOWER_02 127 154 6 0 0
OnInit:
	disablenpc "Sitting man#mosk_dun02"
	strlocalvar 1 "status_mosk_dun02"
	SetLocalVar "status_mosk_dun02" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_dun02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_dun02"] == 1)
        Talk2me "Sitting man#mosk_dun02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_dun02" 0
    stoptimer
return
OnClick:
	if (lv["status_mosk_dun02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mosk_dun02" "try_to_start"
	    wait
        if (lv["status_mosk_dun02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mosk_dun02" "Sunbathing girl#mosk_dun02" 4_F_PATIENT 129 156 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mosk_dun02"
	strlocalvar 1 "status_mosk_dun02"
	SetLocalVar "status_mosk_dun02" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_dun02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_dun02"] == 1)
        Talk2me "Sunbathing girl#mosk_dun02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_dun02" 0
    stoptimer
return
OnClick:
    if (lv["status_mosk_dun02"] == 0)
        cmdothernpc "Bonfire#mosk_dun02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mosk_dun02" "Sitting woman#mosk_dun02" 4_TOWER_07 133 155 3 0 0
OnInit:
	disablenpc "Sitting woman#mosk_dun02"
	strlocalvar 1 "status_mosk_dun02"
	SetLocalVar "status_mosk_dun02" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_dun02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_dun02"] == 1)
        Talk2me "Sitting woman#mosk_dun02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_dun02" 0
    stoptimer
return
OnClick:
	if (lv["status_mosk_dun02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mosk_dun02" "try_to_start"
	    wait
        if (lv["status_mosk_dun02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mosk_dun02" "Wanderer#mosk_dun02" 4_F_05 131 153 1 0 0
OnInit:
	disablenpc "Wanderer#mosk_dun02"
	strlocalvar 1 "status_mosk_dun02"
	SetLocalVar "status_mosk_dun02" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_dun02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_dun02"] == 1)
        Talk2me "Wanderer#mosk_dun02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_dun02" 0
    stoptimer
return
OnClick:
	if (lv["status_mosk_dun02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mosk_dun02" "try_to_start"
	    wait
        if (lv["status_mosk_dun02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mosk_dun02" "#plate1_mosk_dun02" GLASS_PLATE 130 156 5 0 0
OnInit:
	disablenpc "#plate1_mosk_dun02"
return

npc "mosk_dun02" "#plate2_mosk_dun02" GLASS_PLATE 127 153 5 0 0
OnInit:
	disablenpc "#plate2_mosk_dun02"
return

npc "mosk_dun02" "#plate3_mosk_dun02" GLASS_PLATE 133 154 5 0 0
OnInit:
	disablenpc "#plate3_mosk_dun02"
return

npc "mosk_dun02" "#basket_mosk_dun02" 4_ROPEPILE 127 150 5 0 0
OnInit:
	disablenpc "#basket_mosk_dun02"
return

// mosk_dun03 ============[OFF]==============
npc "mosk_dun03" "Extinct Bonfire#mosk_dun03" 4_TRACE 90 139 5 0 0
return

// mosk_dun03 ============[ON]==============
npc "mosk_dun03" "Bonfire#mosk_dun03" 4_BONFIRE 90 139 5 0 0
OnInit:
	disablenpc "Bonfire#mosk_dun03"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mosk_dun03" "start"
        cmdothernpc "Sitting woman#mosk_dun03" "start"
        cmdothernpc "Wanderer#mosk_dun03" "start"
        cmdothernpc "Sunbathing girl#mosk_dun03" "start"
    endif
return

npc "mosk_dun03" "Sitting man#mosk_dun03" 4_TOWER_02 87 139 6 0 0
OnInit:
	disablenpc "Sitting man#mosk_dun03"
	strlocalvar 1 "status_mosk_dun03"
	SetLocalVar "status_mosk_dun03" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_dun03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_dun03"] == 1)
        Talk2me "Sitting man#mosk_dun03" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_dun03" 0
    stoptimer
return
OnClick:
	if (lv["status_mosk_dun03"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mosk_dun03" "try_to_start"
	    wait
        if (lv["status_mosk_dun03"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mosk_dun03" "Sunbathing girl#mosk_dun03" 4_F_PATIENT 89 141 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mosk_dun03"
	strlocalvar 1 "status_mosk_dun03"
	SetLocalVar "status_mosk_dun03" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_dun03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_dun03"] == 1)
        Talk2me "Sunbathing girl#mosk_dun03" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_dun03" 0
    stoptimer
return
OnClick:
    if (lv["status_mosk_dun03"] == 0)
        cmdothernpc "Bonfire#mosk_dun03" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mosk_dun03" "Sitting woman#mosk_dun03" 4_TOWER_07 93 140 3 0 0
OnInit:
	disablenpc "Sitting woman#mosk_dun03"
	strlocalvar 1 "status_mosk_dun03"
	SetLocalVar "status_mosk_dun03" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_dun03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_dun03"] == 1)
        Talk2me "Sitting woman#mosk_dun03" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_dun03" 0
    stoptimer
return
OnClick:
	if (lv["status_mosk_dun03"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mosk_dun03" "try_to_start"
	    wait
        if (lv["status_mosk_dun03"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mosk_dun03" "Wanderer#mosk_dun03" 4_F_05 91 138 1 0 0
OnInit:
	disablenpc "Wanderer#mosk_dun03"
	strlocalvar 1 "status_mosk_dun03"
	SetLocalVar "status_mosk_dun03" 0
return
OnCommand: "start"
	SetLocalVar "status_mosk_dun03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mosk_dun03"] == 1)
        Talk2me "Wanderer#mosk_dun03" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mosk_dun03" 0
    stoptimer
return
OnClick:
	if (lv["status_mosk_dun03"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mosk_dun03" "try_to_start"
	    wait
        if (lv["status_mosk_dun03"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mosk_dun03" "#plate1_mosk_dun03" GLASS_PLATE 90 141 5 0 0
OnInit:
	disablenpc "#plate1_mosk_dun03"
return

npc "mosk_dun03" "#plate2_mosk_dun03" GLASS_PLATE 87 138 5 0 0
OnInit:
	disablenpc "#plate2_mosk_dun03"
return

npc "mosk_dun03" "#plate3_mosk_dun03" GLASS_PLATE 93 139 5 0 0
OnInit:
	disablenpc "#plate3_mosk_dun03"
return

npc "mosk_dun03" "#basket_mosk_dun03" 4_ROPEPILE 87 135 5 0 0
OnInit:
	disablenpc "#basket_mosk_dun03"
return

// gef_fild13 ============[OFF]==============
npc "gef_fild13" "Extinct Bonfire#gef_fild13" 4_TRACE 178 219 5 0 0
return

// gef_fild13 ============[ON]==============
npc "gef_fild13" "Bonfire#gef_fild13" 4_BONFIRE 178 219 5 0 0
OnInit:
	disablenpc "Bonfire#gef_fild13"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gef_fild13" "start"
        cmdothernpc "Sitting woman#gef_fild13" "start"
        cmdothernpc "Wanderer#gef_fild13" "start"
        cmdothernpc "Sunbathing girl#gef_fild13" "start"
    endif
return

npc "gef_fild13" "Sitting man#gef_fild13" 4_TOWER_02 175 219 6 0 0
OnInit:
	disablenpc "Sitting man#gef_fild13"
	strlocalvar 1 "status_gef_fild13"
	SetLocalVar "status_gef_fild13" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild13" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild13"] == 1)
        Talk2me "Sitting man#gef_fild13" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild13" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild13"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild13" "try_to_start"
	    wait
        if (lv["status_gef_fild13"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gef_fild13" "Sunbathing girl#gef_fild13" 4_F_PATIENT 177 221 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gef_fild13"
	strlocalvar 1 "status_gef_fild13"
	SetLocalVar "status_gef_fild13" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild13" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild13"] == 1)
        Talk2me "Sunbathing girl#gef_fild13" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild13" 0
    stoptimer
return
OnClick:
    if (lv["status_gef_fild13"] == 0)
        cmdothernpc "Bonfire#gef_fild13" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gef_fild13" "Sitting woman#gef_fild13" 4_TOWER_07 181 220 3 0 0
OnInit:
	disablenpc "Sitting woman#gef_fild13"
	strlocalvar 1 "status_gef_fild13"
	SetLocalVar "status_gef_fild13" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild13" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild13"] == 1)
        Talk2me "Sitting woman#gef_fild13" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild13" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild13"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild13" "try_to_start"
	    wait
        if (lv["status_gef_fild13"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gef_fild13" "Wanderer#gef_fild13" 4_F_05 179 218 1 0 0
OnInit:
	disablenpc "Wanderer#gef_fild13"
	strlocalvar 1 "status_gef_fild13"
	SetLocalVar "status_gef_fild13" 0
return
OnCommand: "start"
	SetLocalVar "status_gef_fild13" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gef_fild13"] == 1)
        Talk2me "Wanderer#gef_fild13" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gef_fild13" 0
    stoptimer
return
OnClick:
	if (lv["status_gef_fild13"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gef_fild13" "try_to_start"
	    wait
        if (lv["status_gef_fild13"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gef_fild13" "#plate1_gef_fild13" GLASS_PLATE 178 221 5 0 0
OnInit:
	disablenpc "#plate1_gef_fild13"
return

npc "gef_fild13" "#plate2_gef_fild13" GLASS_PLATE 175 218 5 0 0
OnInit:
	disablenpc "#plate2_gef_fild13"
return

npc "gef_fild13" "#plate3_gef_fild13" GLASS_PLATE 181 219 5 0 0
OnInit:
	disablenpc "#plate3_gef_fild13"
return

npc "gef_fild13" "#basket_gef_fild13" 4_ROPEPILE 175 215 5 0 0
OnInit:
	disablenpc "#basket_gef_fild13"
return

// lasa_fild01 ============[OFF]==============
npc "lasa_fild01" "Extinct Bonfire#lasa_fild01" 4_TRACE 256 197 5 0 0
return

// lasa_fild01 ============[ON]==============
npc "lasa_fild01" "Bonfire#lasa_fild01" 4_BONFIRE 256 197 5 0 0
OnInit:
	disablenpc "Bonfire#lasa_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#lasa_fild01" "start"
        cmdothernpc "Sitting woman#lasa_fild01" "start"
        cmdothernpc "Wanderer#lasa_fild01" "start"
        cmdothernpc "Sunbathing girl#lasa_fild01" "start"
    endif
return

npc "lasa_fild01" "Sitting man#lasa_fild01" 4_TOWER_02 253 197 6 0 0
OnInit:
	disablenpc "Sitting man#lasa_fild01"
	strlocalvar 1 "status_lasa_fild01"
	SetLocalVar "status_lasa_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_lasa_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lasa_fild01"] == 1)
        Talk2me "Sitting man#lasa_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lasa_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_lasa_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lasa_fild01" "try_to_start"
	    wait
        if (lv["status_lasa_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "lasa_fild01" "Sunbathing girl#lasa_fild01" 4_F_PATIENT 255 199 5 0 0
OnInit:
	disablenpc "Sunbathing girl#lasa_fild01"
	strlocalvar 1 "status_lasa_fild01"
	SetLocalVar "status_lasa_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_lasa_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lasa_fild01"] == 1)
        Talk2me "Sunbathing girl#lasa_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_lasa_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_lasa_fild01"] == 0)
        cmdothernpc "Bonfire#lasa_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "lasa_fild01" "Sitting woman#lasa_fild01" 4_TOWER_07 259 198 3 0 0
OnInit:
	disablenpc "Sitting woman#lasa_fild01"
	strlocalvar 1 "status_lasa_fild01"
	SetLocalVar "status_lasa_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_lasa_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lasa_fild01"] == 1)
        Talk2me "Sitting woman#lasa_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lasa_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_lasa_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lasa_fild01" "try_to_start"
	    wait
        if (lv["status_lasa_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "lasa_fild01" "Wanderer#lasa_fild01" 4_F_05 257 196 1 0 0
OnInit:
	disablenpc "Wanderer#lasa_fild01"
	strlocalvar 1 "status_lasa_fild01"
	SetLocalVar "status_lasa_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_lasa_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lasa_fild01"] == 1)
        Talk2me "Wanderer#lasa_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lasa_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_lasa_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lasa_fild01" "try_to_start"
	    wait
        if (lv["status_lasa_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "lasa_fild01" "#plate1_lasa_fild01" GLASS_PLATE 256 199 5 0 0
OnInit:
	disablenpc "#plate1_lasa_fild01"
return

npc "lasa_fild01" "#plate2_lasa_fild01" GLASS_PLATE 253 196 5 0 0
OnInit:
	disablenpc "#plate2_lasa_fild01"
return

npc "lasa_fild01" "#plate3_lasa_fild01" GLASS_PLATE 259 197 5 0 0
OnInit:
	disablenpc "#plate3_lasa_fild01"
return

npc "lasa_fild01" "#basket_lasa_fild01" 4_ROPEPILE 253 193 5 0 0
OnInit:
	disablenpc "#basket_lasa_fild01"
return

// lasa_fild02 ============[OFF]==============
npc "lasa_fild02" "Extinct Bonfire#lasa_fild02" 4_TRACE 240 185 5 0 0
return

// lasa_fild02 ============[ON]==============
npc "lasa_fild02" "Bonfire#lasa_fild02" 4_BONFIRE 240 185 5 0 0
OnInit:
	disablenpc "Bonfire#lasa_fild02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#lasa_fild02" "start"
        cmdothernpc "Sitting woman#lasa_fild02" "start"
        cmdothernpc "Wanderer#lasa_fild02" "start"
        cmdothernpc "Sunbathing girl#lasa_fild02" "start"
    endif
return

npc "lasa_fild02" "Sitting man#lasa_fild02" 4_TOWER_02 237 185 6 0 0
OnInit:
	disablenpc "Sitting man#lasa_fild02"
	strlocalvar 1 "status_lasa_fild02"
	SetLocalVar "status_lasa_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_lasa_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lasa_fild02"] == 1)
        Talk2me "Sitting man#lasa_fild02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lasa_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_lasa_fild02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lasa_fild02" "try_to_start"
	    wait
        if (lv["status_lasa_fild02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "lasa_fild02" "Sunbathing girl#lasa_fild02" 4_F_PATIENT 239 187 5 0 0
OnInit:
	disablenpc "Sunbathing girl#lasa_fild02"
	strlocalvar 1 "status_lasa_fild02"
	SetLocalVar "status_lasa_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_lasa_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lasa_fild02"] == 1)
        Talk2me "Sunbathing girl#lasa_fild02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_lasa_fild02" 0
    stoptimer
return
OnClick:
    if (lv["status_lasa_fild02"] == 0)
        cmdothernpc "Bonfire#lasa_fild02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "lasa_fild02" "Sitting woman#lasa_fild02" 4_TOWER_07 243 186 3 0 0
OnInit:
	disablenpc "Sitting woman#lasa_fild02"
	strlocalvar 1 "status_lasa_fild02"
	SetLocalVar "status_lasa_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_lasa_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lasa_fild02"] == 1)
        Talk2me "Sitting woman#lasa_fild02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lasa_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_lasa_fild02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lasa_fild02" "try_to_start"
	    wait
        if (lv["status_lasa_fild02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "lasa_fild02" "Wanderer#lasa_fild02" 4_F_05 241 184 1 0 0
OnInit:
	disablenpc "Wanderer#lasa_fild02"
	strlocalvar 1 "status_lasa_fild02"
	SetLocalVar "status_lasa_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_lasa_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lasa_fild02"] == 1)
        Talk2me "Wanderer#lasa_fild02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lasa_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_lasa_fild02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lasa_fild02" "try_to_start"
	    wait
        if (lv["status_lasa_fild02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "lasa_fild02" "#plate1_lasa_fild02" GLASS_PLATE 240 187 5 0 0
OnInit:
	disablenpc "#plate1_lasa_fild02"
return

npc "lasa_fild02" "#plate2_lasa_fild02" GLASS_PLATE 237 184 5 0 0
OnInit:
	disablenpc "#plate2_lasa_fild02"
return

npc "lasa_fild02" "#plate3_lasa_fild02" GLASS_PLATE 243 185 5 0 0
OnInit:
	disablenpc "#plate3_lasa_fild02"
return

npc "lasa_fild02" "#basket_lasa_fild02" 4_ROPEPILE 237 181 5 0 0
OnInit:
	disablenpc "#basket_lasa_fild02"
return

// cmd_fild01 ============[OFF]==============
npc "cmd_fild01" "Extinct Bonfire#cmd_fild01" 4_TRACE 186 184 5 0 0
return

// cmd_fild01 ============[ON]==============
npc "cmd_fild01" "Bonfire#cmd_fild01" 4_BONFIRE 186 184 5 0 0
OnInit:
	disablenpc "Bonfire#cmd_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#cmd_fild01" "start"
        cmdothernpc "Sitting woman#cmd_fild01" "start"
        cmdothernpc "Wanderer#cmd_fild01" "start"
        cmdothernpc "Sunbathing girl#cmd_fild01" "start"
    endif
return

npc "cmd_fild01" "Sitting man#cmd_fild01" 4_TOWER_02 183 184 6 0 0
OnInit:
	disablenpc "Sitting man#cmd_fild01"
	strlocalvar 1 "status_cmd_fild01"
	SetLocalVar "status_cmd_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild01"] == 1)
        Talk2me "Sitting man#cmd_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_cmd_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#cmd_fild01" "try_to_start"
	    wait
        if (lv["status_cmd_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "cmd_fild01" "Sunbathing girl#cmd_fild01" 4_F_PATIENT 185 186 5 0 0
OnInit:
	disablenpc "Sunbathing girl#cmd_fild01"
	strlocalvar 1 "status_cmd_fild01"
	SetLocalVar "status_cmd_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild01"] == 1)
        Talk2me "Sunbathing girl#cmd_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_cmd_fild01"] == 0)
        cmdothernpc "Bonfire#cmd_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "cmd_fild01" "Sitting woman#cmd_fild01" 4_TOWER_07 189 185 3 0 0
OnInit:
	disablenpc "Sitting woman#cmd_fild01"
	strlocalvar 1 "status_cmd_fild01"
	SetLocalVar "status_cmd_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild01"] == 1)
        Talk2me "Sitting woman#cmd_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_cmd_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#cmd_fild01" "try_to_start"
	    wait
        if (lv["status_cmd_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "cmd_fild01" "Wanderer#cmd_fild01" 4_F_05 187 183 1 0 0
OnInit:
	disablenpc "Wanderer#cmd_fild01"
	strlocalvar 1 "status_cmd_fild01"
	SetLocalVar "status_cmd_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild01"] == 1)
        Talk2me "Wanderer#cmd_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_cmd_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#cmd_fild01" "try_to_start"
	    wait
        if (lv["status_cmd_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "cmd_fild01" "#plate1_cmd_fild01" GLASS_PLATE 186 186 5 0 0
OnInit:
	disablenpc "#plate1_cmd_fild01"
return

npc "cmd_fild01" "#plate2_cmd_fild01" GLASS_PLATE 183 183 5 0 0
OnInit:
	disablenpc "#plate2_cmd_fild01"
return

npc "cmd_fild01" "#plate3_cmd_fild01" GLASS_PLATE 189 184 5 0 0
OnInit:
	disablenpc "#plate3_cmd_fild01"
return

npc "cmd_fild01" "#basket_cmd_fild01" 4_ROPEPILE 183 180 5 0 0
OnInit:
	disablenpc "#basket_cmd_fild01"
return

// cmd_fild02 ============[OFF]==============
npc "cmd_fild02" "Extinct Bonfire#cmd_fild02" 4_TRACE 238 290 5 0 0
return

// cmd_fild02 ============[ON]==============
npc "cmd_fild02" "Bonfire#cmd_fild02" 4_BONFIRE 238 290 5 0 0
OnInit:
	disablenpc "Bonfire#cmd_fild02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#cmd_fild02" "start"
        cmdothernpc "Sitting woman#cmd_fild02" "start"
        cmdothernpc "Wanderer#cmd_fild02" "start"
        cmdothernpc "Sunbathing girl#cmd_fild02" "start"
    endif
return

npc "cmd_fild02" "Sitting man#cmd_fild02" 4_TOWER_02 235 290 6 0 0
OnInit:
	disablenpc "Sitting man#cmd_fild02"
	strlocalvar 1 "status_cmd_fild02"
	SetLocalVar "status_cmd_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild02"] == 1)
        Talk2me "Sitting man#cmd_fild02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_cmd_fild02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#cmd_fild02" "try_to_start"
	    wait
        if (lv["status_cmd_fild02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "cmd_fild02" "Sunbathing girl#cmd_fild02" 4_F_PATIENT 237 292 5 0 0
OnInit:
	disablenpc "Sunbathing girl#cmd_fild02"
	strlocalvar 1 "status_cmd_fild02"
	SetLocalVar "status_cmd_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild02"] == 1)
        Talk2me "Sunbathing girl#cmd_fild02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild02" 0
    stoptimer
return
OnClick:
    if (lv["status_cmd_fild02"] == 0)
        cmdothernpc "Bonfire#cmd_fild02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "cmd_fild02" "Sitting woman#cmd_fild02" 4_TOWER_07 241 291 3 0 0
OnInit:
	disablenpc "Sitting woman#cmd_fild02"
	strlocalvar 1 "status_cmd_fild02"
	SetLocalVar "status_cmd_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild02"] == 1)
        Talk2me "Sitting woman#cmd_fild02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_cmd_fild02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#cmd_fild02" "try_to_start"
	    wait
        if (lv["status_cmd_fild02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "cmd_fild02" "Wanderer#cmd_fild02" 4_F_05 239 289 1 0 0
OnInit:
	disablenpc "Wanderer#cmd_fild02"
	strlocalvar 1 "status_cmd_fild02"
	SetLocalVar "status_cmd_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild02"] == 1)
        Talk2me "Wanderer#cmd_fild02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_cmd_fild02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#cmd_fild02" "try_to_start"
	    wait
        if (lv["status_cmd_fild02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "cmd_fild02" "#plate1_cmd_fild02" GLASS_PLATE 238 292 5 0 0
OnInit:
	disablenpc "#plate1_cmd_fild02"
return

npc "cmd_fild02" "#plate2_cmd_fild02" GLASS_PLATE 235 289 5 0 0
OnInit:
	disablenpc "#plate2_cmd_fild02"
return

npc "cmd_fild02" "#plate3_cmd_fild02" GLASS_PLATE 241 290 5 0 0
OnInit:
	disablenpc "#plate3_cmd_fild02"
return

npc "cmd_fild02" "#basket_cmd_fild02" 4_ROPEPILE 235 286 5 0 0
OnInit:
	disablenpc "#basket_cmd_fild02"
return

// cmd_fild03 ============[OFF]==============
npc "cmd_fild03" "Extinct Bonfire#cmd_fild03" 4_TRACE 155 247 5 0 0
return

// cmd_fild03 ============[ON]==============
npc "cmd_fild03" "Bonfire#cmd_fild03" 4_BONFIRE 155 247 5 0 0
OnInit:
	disablenpc "Bonfire#cmd_fild03"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#cmd_fild03" "start"
        cmdothernpc "Sitting woman#cmd_fild03" "start"
        cmdothernpc "Wanderer#cmd_fild03" "start"
        cmdothernpc "Sunbathing girl#cmd_fild03" "start"
    endif
return

npc "cmd_fild03" "Sitting man#cmd_fild03" 4_TOWER_02 152 247 6 0 0
OnInit:
	disablenpc "Sitting man#cmd_fild03"
	strlocalvar 1 "status_cmd_fild03"
	SetLocalVar "status_cmd_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild03"] == 1)
        Talk2me "Sitting man#cmd_fild03" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_cmd_fild03"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#cmd_fild03" "try_to_start"
	    wait
        if (lv["status_cmd_fild03"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "cmd_fild03" "Sunbathing girl#cmd_fild03" 4_F_PATIENT 154 249 5 0 0
OnInit:
	disablenpc "Sunbathing girl#cmd_fild03"
	strlocalvar 1 "status_cmd_fild03"
	SetLocalVar "status_cmd_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild03"] == 1)
        Talk2me "Sunbathing girl#cmd_fild03" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild03" 0
    stoptimer
return
OnClick:
    if (lv["status_cmd_fild03"] == 0)
        cmdothernpc "Bonfire#cmd_fild03" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "cmd_fild03" "Sitting woman#cmd_fild03" 4_TOWER_07 158 248 3 0 0
OnInit:
	disablenpc "Sitting woman#cmd_fild03"
	strlocalvar 1 "status_cmd_fild03"
	SetLocalVar "status_cmd_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild03"] == 1)
        Talk2me "Sitting woman#cmd_fild03" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_cmd_fild03"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#cmd_fild03" "try_to_start"
	    wait
        if (lv["status_cmd_fild03"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "cmd_fild03" "Wanderer#cmd_fild03" 4_F_05 156 246 1 0 0
OnInit:
	disablenpc "Wanderer#cmd_fild03"
	strlocalvar 1 "status_cmd_fild03"
	SetLocalVar "status_cmd_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild03"] == 1)
        Talk2me "Wanderer#cmd_fild03" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_cmd_fild03"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#cmd_fild03" "try_to_start"
	    wait
        if (lv["status_cmd_fild03"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "cmd_fild03" "#plate1_cmd_fild03" GLASS_PLATE 155 249 5 0 0
OnInit:
	disablenpc "#plate1_cmd_fild03"
return

npc "cmd_fild03" "#plate2_cmd_fild03" GLASS_PLATE 152 246 5 0 0
OnInit:
	disablenpc "#plate2_cmd_fild03"
return

npc "cmd_fild03" "#plate3_cmd_fild03" GLASS_PLATE 158 247 5 0 0
OnInit:
	disablenpc "#plate3_cmd_fild03"
return

npc "cmd_fild03" "#basket_cmd_fild03" 4_ROPEPILE 152 243 5 0 0
OnInit:
	disablenpc "#basket_cmd_fild03"
return

// cmd_fild05 ============[OFF]==============
npc "cmd_fild05" "Extinct Bonfire#cmd_fild05" 4_TRACE 199 180 5 0 0
return

// cmd_fild05 ============[ON]==============
npc "cmd_fild05" "Bonfire#cmd_fild05" 4_BONFIRE 199 180 5 0 0
OnInit:
	disablenpc "Bonfire#cmd_fild05"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#cmd_fild05" "start"
        cmdothernpc "Sitting woman#cmd_fild05" "start"
        cmdothernpc "Wanderer#cmd_fild05" "start"
        cmdothernpc "Sunbathing girl#cmd_fild05" "start"
    endif
return

npc "cmd_fild05" "Sitting man#cmd_fild05" 4_TOWER_02 196 180 6 0 0
OnInit:
	disablenpc "Sitting man#cmd_fild05"
	strlocalvar 1 "status_cmd_fild05"
	SetLocalVar "status_cmd_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild05"] == 1)
        Talk2me "Sitting man#cmd_fild05" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_cmd_fild05"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#cmd_fild05" "try_to_start"
	    wait
        if (lv["status_cmd_fild05"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "cmd_fild05" "Sunbathing girl#cmd_fild05" 4_F_PATIENT 198 182 5 0 0
OnInit:
	disablenpc "Sunbathing girl#cmd_fild05"
	strlocalvar 1 "status_cmd_fild05"
	SetLocalVar "status_cmd_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild05"] == 1)
        Talk2me "Sunbathing girl#cmd_fild05" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild05" 0
    stoptimer
return
OnClick:
    if (lv["status_cmd_fild05"] == 0)
        cmdothernpc "Bonfire#cmd_fild05" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "cmd_fild05" "Sitting woman#cmd_fild05" 4_TOWER_07 202 181 3 0 0
OnInit:
	disablenpc "Sitting woman#cmd_fild05"
	strlocalvar 1 "status_cmd_fild05"
	SetLocalVar "status_cmd_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild05"] == 1)
        Talk2me "Sitting woman#cmd_fild05" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_cmd_fild05"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#cmd_fild05" "try_to_start"
	    wait
        if (lv["status_cmd_fild05"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "cmd_fild05" "Wanderer#cmd_fild05" 4_F_05 200 179 1 0 0
OnInit:
	disablenpc "Wanderer#cmd_fild05"
	strlocalvar 1 "status_cmd_fild05"
	SetLocalVar "status_cmd_fild05" 0
return
OnCommand: "start"
	SetLocalVar "status_cmd_fild05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_cmd_fild05"] == 1)
        Talk2me "Wanderer#cmd_fild05" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_cmd_fild05" 0
    stoptimer
return
OnClick:
	if (lv["status_cmd_fild05"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#cmd_fild05" "try_to_start"
	    wait
        if (lv["status_cmd_fild05"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "cmd_fild05" "#plate1_cmd_fild05" GLASS_PLATE 199 182 5 0 0
OnInit:
	disablenpc "#plate1_cmd_fild05"
return

npc "cmd_fild05" "#plate2_cmd_fild05" GLASS_PLATE 196 179 5 0 0
OnInit:
	disablenpc "#plate2_cmd_fild05"
return

npc "cmd_fild05" "#plate3_cmd_fild05" GLASS_PLATE 202 180 5 0 0
OnInit:
	disablenpc "#plate3_cmd_fild05"
return

npc "cmd_fild05" "#basket_cmd_fild05" 4_ROPEPILE 196 176 5 0 0
OnInit:
	disablenpc "#basket_cmd_fild05"
return

// um_fild01 ============[OFF]==============
npc "um_fild01" "Extinct Bonfire#um_fild01" 4_TRACE 192 222 5 0 0
return

// um_fild01 ============[ON]==============
npc "um_fild01" "Bonfire#um_fild01" 4_BONFIRE 192 222 5 0 0
OnInit:
	disablenpc "Bonfire#um_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#um_fild01" "start"
        cmdothernpc "Sitting woman#um_fild01" "start"
        cmdothernpc "Wanderer#um_fild01" "start"
        cmdothernpc "Sunbathing girl#um_fild01" "start"
    endif
return

npc "um_fild01" "Sitting man#um_fild01" 4_TOWER_02 189 222 6 0 0
OnInit:
	disablenpc "Sitting man#um_fild01"
	strlocalvar 1 "status_um_fild01"
	SetLocalVar "status_um_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild01"] == 1)
        Talk2me "Sitting man#um_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_um_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#um_fild01" "try_to_start"
	    wait
        if (lv["status_um_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "um_fild01" "Sunbathing girl#um_fild01" 4_F_PATIENT 191 224 5 0 0
OnInit:
	disablenpc "Sunbathing girl#um_fild01"
	strlocalvar 1 "status_um_fild01"
	SetLocalVar "status_um_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild01"] == 1)
        Talk2me "Sunbathing girl#um_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_um_fild01"] == 0)
        cmdothernpc "Bonfire#um_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "um_fild01" "Sitting woman#um_fild01" 4_TOWER_07 195 223 3 0 0
OnInit:
	disablenpc "Sitting woman#um_fild01"
	strlocalvar 1 "status_um_fild01"
	SetLocalVar "status_um_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild01"] == 1)
        Talk2me "Sitting woman#um_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_um_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#um_fild01" "try_to_start"
	    wait
        if (lv["status_um_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "um_fild01" "Wanderer#um_fild01" 4_F_05 193 221 1 0 0
OnInit:
	disablenpc "Wanderer#um_fild01"
	strlocalvar 1 "status_um_fild01"
	SetLocalVar "status_um_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild01"] == 1)
        Talk2me "Wanderer#um_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_um_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#um_fild01" "try_to_start"
	    wait
        if (lv["status_um_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "um_fild01" "#plate1_um_fild01" GLASS_PLATE 192 224 5 0 0
OnInit:
	disablenpc "#plate1_um_fild01"
return

npc "um_fild01" "#plate2_um_fild01" GLASS_PLATE 189 221 5 0 0
OnInit:
	disablenpc "#plate2_um_fild01"
return

npc "um_fild01" "#plate3_um_fild01" GLASS_PLATE 195 222 5 0 0
OnInit:
	disablenpc "#plate3_um_fild01"
return

npc "um_fild01" "#basket_um_fild01" 4_ROPEPILE 189 218 5 0 0
OnInit:
	disablenpc "#basket_um_fild01"
return

// um_fild02 ============[OFF]==============
npc "um_fild02" "Extinct Bonfire#um_fild02" 4_TRACE 199 129 5 0 0
return

// um_fild02 ============[ON]==============
npc "um_fild02" "Bonfire#um_fild02" 4_BONFIRE 199 129 5 0 0
OnInit:
	disablenpc "Bonfire#um_fild02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#um_fild02" "start"
        cmdothernpc "Sitting woman#um_fild02" "start"
        cmdothernpc "Wanderer#um_fild02" "start"
        cmdothernpc "Sunbathing girl#um_fild02" "start"
    endif
return

npc "um_fild02" "Sitting man#um_fild02" 4_TOWER_02 196 129 6 0 0
OnInit:
	disablenpc "Sitting man#um_fild02"
	strlocalvar 1 "status_um_fild02"
	SetLocalVar "status_um_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild02"] == 1)
        Talk2me "Sitting man#um_fild02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_um_fild02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#um_fild02" "try_to_start"
	    wait
        if (lv["status_um_fild02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "um_fild02" "Sunbathing girl#um_fild02" 4_F_PATIENT 198 131 5 0 0
OnInit:
	disablenpc "Sunbathing girl#um_fild02"
	strlocalvar 1 "status_um_fild02"
	SetLocalVar "status_um_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild02"] == 1)
        Talk2me "Sunbathing girl#um_fild02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild02" 0
    stoptimer
return
OnClick:
    if (lv["status_um_fild02"] == 0)
        cmdothernpc "Bonfire#um_fild02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "um_fild02" "Sitting woman#um_fild02" 4_TOWER_07 202 130 3 0 0
OnInit:
	disablenpc "Sitting woman#um_fild02"
	strlocalvar 1 "status_um_fild02"
	SetLocalVar "status_um_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild02"] == 1)
        Talk2me "Sitting woman#um_fild02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_um_fild02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#um_fild02" "try_to_start"
	    wait
        if (lv["status_um_fild02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "um_fild02" "Wanderer#um_fild02" 4_F_05 200 128 1 0 0
OnInit:
	disablenpc "Wanderer#um_fild02"
	strlocalvar 1 "status_um_fild02"
	SetLocalVar "status_um_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild02"] == 1)
        Talk2me "Wanderer#um_fild02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_um_fild02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#um_fild02" "try_to_start"
	    wait
        if (lv["status_um_fild02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "um_fild02" "#plate1_um_fild02" GLASS_PLATE 199 131 5 0 0
OnInit:
	disablenpc "#plate1_um_fild02"
return

npc "um_fild02" "#plate2_um_fild02" GLASS_PLATE 196 128 5 0 0
OnInit:
	disablenpc "#plate2_um_fild02"
return

npc "um_fild02" "#plate3_um_fild02" GLASS_PLATE 202 129 5 0 0
OnInit:
	disablenpc "#plate3_um_fild02"
return

npc "um_fild02" "#basket_um_fild02" 4_ROPEPILE 196 125 5 0 0
OnInit:
	disablenpc "#basket_um_fild02"
return

// um_fild03 ============[OFF]==============
npc "um_fild03" "Extinct Bonfire#um_fild03" 4_TRACE 142 238 5 0 0
return

// um_fild03 ============[ON]==============
npc "um_fild03" "Bonfire#um_fild03" 4_BONFIRE 142 238 5 0 0
OnInit:
	disablenpc "Bonfire#um_fild03"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#um_fild03" "start"
        cmdothernpc "Sitting woman#um_fild03" "start"
        cmdothernpc "Wanderer#um_fild03" "start"
        cmdothernpc "Sunbathing girl#um_fild03" "start"
    endif
return

npc "um_fild03" "Sitting man#um_fild03" 4_TOWER_02 139 238 6 0 0
OnInit:
	disablenpc "Sitting man#um_fild03"
	strlocalvar 1 "status_um_fild03"
	SetLocalVar "status_um_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild03"] == 1)
        Talk2me "Sitting man#um_fild03" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_um_fild03"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#um_fild03" "try_to_start"
	    wait
        if (lv["status_um_fild03"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "um_fild03" "Sunbathing girl#um_fild03" 4_F_PATIENT 141 240 5 0 0
OnInit:
	disablenpc "Sunbathing girl#um_fild03"
	strlocalvar 1 "status_um_fild03"
	SetLocalVar "status_um_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild03"] == 1)
        Talk2me "Sunbathing girl#um_fild03" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild03" 0
    stoptimer
return
OnClick:
    if (lv["status_um_fild03"] == 0)
        cmdothernpc "Bonfire#um_fild03" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "um_fild03" "Sitting woman#um_fild03" 4_TOWER_07 145 239 3 0 0
OnInit:
	disablenpc "Sitting woman#um_fild03"
	strlocalvar 1 "status_um_fild03"
	SetLocalVar "status_um_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild03"] == 1)
        Talk2me "Sitting woman#um_fild03" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_um_fild03"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#um_fild03" "try_to_start"
	    wait
        if (lv["status_um_fild03"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "um_fild03" "Wanderer#um_fild03" 4_F_05 143 237 1 0 0
OnInit:
	disablenpc "Wanderer#um_fild03"
	strlocalvar 1 "status_um_fild03"
	SetLocalVar "status_um_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild03"] == 1)
        Talk2me "Wanderer#um_fild03" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_um_fild03"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#um_fild03" "try_to_start"
	    wait
        if (lv["status_um_fild03"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "um_fild03" "#plate1_um_fild03" GLASS_PLATE 142 240 5 0 0
OnInit:
	disablenpc "#plate1_um_fild03"
return

npc "um_fild03" "#plate2_um_fild03" GLASS_PLATE 139 237 5 0 0
OnInit:
	disablenpc "#plate2_um_fild03"
return

npc "um_fild03" "#plate3_um_fild03" GLASS_PLATE 145 238 5 0 0
OnInit:
	disablenpc "#plate3_um_fild03"
return

npc "um_fild03" "#basket_um_fild03" 4_ROPEPILE 139 234 5 0 0
OnInit:
	disablenpc "#basket_um_fild03"
return

// um_fild04 ============[OFF]==============
npc "um_fild04" "Extinct Bonfire#um_fild04" 4_TRACE 189 103 5 0 0
return

// um_fild04 ============[ON]==============
npc "um_fild04" "Bonfire#um_fild04" 4_BONFIRE 189 103 5 0 0
OnInit:
	disablenpc "Bonfire#um_fild04"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#um_fild04" "start"
        cmdothernpc "Sitting woman#um_fild04" "start"
        cmdothernpc "Wanderer#um_fild04" "start"
        cmdothernpc "Sunbathing girl#um_fild04" "start"
    endif
return

npc "um_fild04" "Sitting man#um_fild04" 4_TOWER_02 186 103 6 0 0
OnInit:
	disablenpc "Sitting man#um_fild04"
	strlocalvar 1 "status_um_fild04"
	SetLocalVar "status_um_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild04"] == 1)
        Talk2me "Sitting man#um_fild04" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_um_fild04"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#um_fild04" "try_to_start"
	    wait
        if (lv["status_um_fild04"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "um_fild04" "Sunbathing girl#um_fild04" 4_F_PATIENT 188 105 5 0 0
OnInit:
	disablenpc "Sunbathing girl#um_fild04"
	strlocalvar 1 "status_um_fild04"
	SetLocalVar "status_um_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild04"] == 1)
        Talk2me "Sunbathing girl#um_fild04" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild04" 0
    stoptimer
return
OnClick:
    if (lv["status_um_fild04"] == 0)
        cmdothernpc "Bonfire#um_fild04" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "um_fild04" "Sitting woman#um_fild04" 4_TOWER_07 192 104 3 0 0
OnInit:
	disablenpc "Sitting woman#um_fild04"
	strlocalvar 1 "status_um_fild04"
	SetLocalVar "status_um_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild04"] == 1)
        Talk2me "Sitting woman#um_fild04" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_um_fild04"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#um_fild04" "try_to_start"
	    wait
        if (lv["status_um_fild04"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "um_fild04" "Wanderer#um_fild04" 4_F_05 190 102 1 0 0
OnInit:
	disablenpc "Wanderer#um_fild04"
	strlocalvar 1 "status_um_fild04"
	SetLocalVar "status_um_fild04" 0
return
OnCommand: "start"
	SetLocalVar "status_um_fild04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_um_fild04"] == 1)
        Talk2me "Wanderer#um_fild04" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_um_fild04" 0
    stoptimer
return
OnClick:
	if (lv["status_um_fild04"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#um_fild04" "try_to_start"
	    wait
        if (lv["status_um_fild04"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "um_fild04" "#plate1_um_fild04" GLASS_PLATE 189 105 5 0 0
OnInit:
	disablenpc "#plate1_um_fild04"
return

npc "um_fild04" "#plate2_um_fild04" GLASS_PLATE 186 102 5 0 0
OnInit:
	disablenpc "#plate2_um_fild04"
return

npc "um_fild04" "#plate3_um_fild04" GLASS_PLATE 192 103 5 0 0
OnInit:
	disablenpc "#plate3_um_fild04"
return

npc "um_fild04" "#basket_um_fild04" 4_ROPEPILE 186 99 5 0 0
OnInit:
	disablenpc "#basket_um_fild04"
return

// prt_fild07 ============[OFF]==============
npc "prt_fild07" "Extinct Bonfire#prt_fild07" 4_TRACE 224 207 5 0 0
return

// prt_fild07 ============[ON]==============
npc "prt_fild07" "Bonfire#prt_fild07" 4_BONFIRE 224 207 5 0 0
OnInit:
	disablenpc "Bonfire#prt_fild07"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#prt_fild07" "start"
        cmdothernpc "Sitting woman#prt_fild07" "start"
        cmdothernpc "Wanderer#prt_fild07" "start"
        cmdothernpc "Sunbathing girl#prt_fild07" "start"
    endif
return

npc "prt_fild07" "Sitting man#prt_fild07" 4_TOWER_02 221 207 6 0 0
OnInit:
	disablenpc "Sitting man#prt_fild07"
	strlocalvar 1 "status_prt_fild07"
	SetLocalVar "status_prt_fild07" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild07"] == 1)
        Talk2me "Sitting man#prt_fild07" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild07" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild07"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild07" "try_to_start"
	    wait
        if (lv["status_prt_fild07"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "prt_fild07" "Sunbathing girl#prt_fild07" 4_F_PATIENT 223 209 5 0 0
OnInit:
	disablenpc "Sunbathing girl#prt_fild07"
	strlocalvar 1 "status_prt_fild07"
	SetLocalVar "status_prt_fild07" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild07"] == 1)
        Talk2me "Sunbathing girl#prt_fild07" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild07" 0
    stoptimer
return
OnClick:
    if (lv["status_prt_fild07"] == 0)
        cmdothernpc "Bonfire#prt_fild07" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "prt_fild07" "Sitting woman#prt_fild07" 4_TOWER_07 227 208 3 0 0
OnInit:
	disablenpc "Sitting woman#prt_fild07"
	strlocalvar 1 "status_prt_fild07"
	SetLocalVar "status_prt_fild07" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild07"] == 1)
        Talk2me "Sitting woman#prt_fild07" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild07" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild07"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild07" "try_to_start"
	    wait
        if (lv["status_prt_fild07"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "prt_fild07" "Wanderer#prt_fild07" 4_F_05 225 206 1 0 0
OnInit:
	disablenpc "Wanderer#prt_fild07"
	strlocalvar 1 "status_prt_fild07"
	SetLocalVar "status_prt_fild07" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild07"] == 1)
        Talk2me "Wanderer#prt_fild07" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild07" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild07"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild07" "try_to_start"
	    wait
        if (lv["status_prt_fild07"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "prt_fild07" "#plate1_prt_fild07" GLASS_PLATE 224 209 5 0 0
OnInit:
	disablenpc "#plate1_prt_fild07"
return

npc "prt_fild07" "#plate2_prt_fild07" GLASS_PLATE 221 206 5 0 0
OnInit:
	disablenpc "#plate2_prt_fild07"
return

npc "prt_fild07" "#plate3_prt_fild07" GLASS_PLATE 227 207 5 0 0
OnInit:
	disablenpc "#plate3_prt_fild07"
return

npc "prt_fild07" "#basket_prt_fild07" 4_ROPEPILE 221 203 5 0 0
OnInit:
	disablenpc "#basket_prt_fild07"
return

// prt_fild08 ============[OFF]==============
npc "prt_fild08" "Extinct Bonfire#prt_fild08" 4_TRACE 193 254 5 0 0
return

// prt_fild08 ============[ON]==============
npc "prt_fild08" "Bonfire#prt_fild08" 4_BONFIRE 193 254 5 0 0
OnInit:
	disablenpc "Bonfire#prt_fild08"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#prt_fild08" "start"
        cmdothernpc "Sitting woman#prt_fild08" "start"
        cmdothernpc "Wanderer#prt_fild08" "start"
        cmdothernpc "Sunbathing girl#prt_fild08" "start"
    endif
return

npc "prt_fild08" "Sitting man#prt_fild08" 4_TOWER_02 190 254 6 0 0
OnInit:
	disablenpc "Sitting man#prt_fild08"
	strlocalvar 1 "status_prt_fild08"
	SetLocalVar "status_prt_fild08" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild08"] == 1)
        Talk2me "Sitting man#prt_fild08" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild08" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild08"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild08" "try_to_start"
	    wait
        if (lv["status_prt_fild08"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "prt_fild08" "Sunbathing girl#prt_fild08" 4_F_PATIENT 192 256 5 0 0
OnInit:
	disablenpc "Sunbathing girl#prt_fild08"
	strlocalvar 1 "status_prt_fild08"
	SetLocalVar "status_prt_fild08" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild08"] == 1)
        Talk2me "Sunbathing girl#prt_fild08" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild08" 0
    stoptimer
return
OnClick:
    if (lv["status_prt_fild08"] == 0)
        cmdothernpc "Bonfire#prt_fild08" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "prt_fild08" "Sitting woman#prt_fild08" 4_TOWER_07 196 255 3 0 0
OnInit:
	disablenpc "Sitting woman#prt_fild08"
	strlocalvar 1 "status_prt_fild08"
	SetLocalVar "status_prt_fild08" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild08"] == 1)
        Talk2me "Sitting woman#prt_fild08" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild08" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild08"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild08" "try_to_start"
	    wait
        if (lv["status_prt_fild08"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "prt_fild08" "Wanderer#prt_fild08" 4_F_05 194 253 1 0 0
OnInit:
	disablenpc "Wanderer#prt_fild08"
	strlocalvar 1 "status_prt_fild08"
	SetLocalVar "status_prt_fild08" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild08"] == 1)
        Talk2me "Wanderer#prt_fild08" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild08" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild08"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild08" "try_to_start"
	    wait
        if (lv["status_prt_fild08"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "prt_fild08" "#plate1_prt_fild08" GLASS_PLATE 193 256 5 0 0
OnInit:
	disablenpc "#plate1_prt_fild08"
return

npc "prt_fild08" "#plate2_prt_fild08" GLASS_PLATE 190 253 5 0 0
OnInit:
	disablenpc "#plate2_prt_fild08"
return

npc "prt_fild08" "#plate3_prt_fild08" GLASS_PLATE 196 254 5 0 0
OnInit:
	disablenpc "#plate3_prt_fild08"
return

npc "prt_fild08" "#basket_prt_fild08" 4_ROPEPILE 190 250 5 0 0
OnInit:
	disablenpc "#basket_prt_fild08"
return

// prt_fild10 ============[OFF]==============
npc "prt_fild10" "Extinct Bonfire#prt_fild10" 4_TRACE 217 108 5 0 0
return

// prt_fild10 ============[ON]==============
npc "prt_fild10" "Bonfire#prt_fild10" 4_BONFIRE 217 108 5 0 0
OnInit:
	disablenpc "Bonfire#prt_fild10"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#prt_fild10" "start"
        cmdothernpc "Sitting woman#prt_fild10" "start"
        cmdothernpc "Wanderer#prt_fild10" "start"
        cmdothernpc "Sunbathing girl#prt_fild10" "start"
    endif
return

npc "prt_fild10" "Sitting man#prt_fild10" 4_TOWER_02 214 108 6 0 0
OnInit:
	disablenpc "Sitting man#prt_fild10"
	strlocalvar 1 "status_prt_fild10"
	SetLocalVar "status_prt_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild10"] == 1)
        Talk2me "Sitting man#prt_fild10" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild10" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild10"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild10" "try_to_start"
	    wait
        if (lv["status_prt_fild10"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "prt_fild10" "Sunbathing girl#prt_fild10" 4_F_PATIENT 216 110 5 0 0
OnInit:
	disablenpc "Sunbathing girl#prt_fild10"
	strlocalvar 1 "status_prt_fild10"
	SetLocalVar "status_prt_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild10"] == 1)
        Talk2me "Sunbathing girl#prt_fild10" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild10" 0
    stoptimer
return
OnClick:
    if (lv["status_prt_fild10"] == 0)
        cmdothernpc "Bonfire#prt_fild10" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "prt_fild10" "Sitting woman#prt_fild10" 4_TOWER_07 220 109 3 0 0
OnInit:
	disablenpc "Sitting woman#prt_fild10"
	strlocalvar 1 "status_prt_fild10"
	SetLocalVar "status_prt_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild10"] == 1)
        Talk2me "Sitting woman#prt_fild10" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild10" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild10"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild10" "try_to_start"
	    wait
        if (lv["status_prt_fild10"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "prt_fild10" "Wanderer#prt_fild10" 4_F_05 218 107 1 0 0
OnInit:
	disablenpc "Wanderer#prt_fild10"
	strlocalvar 1 "status_prt_fild10"
	SetLocalVar "status_prt_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild10"] == 1)
        Talk2me "Wanderer#prt_fild10" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild10" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild10"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild10" "try_to_start"
	    wait
        if (lv["status_prt_fild10"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "prt_fild10" "#plate1_prt_fild10" GLASS_PLATE 217 110 5 0 0
OnInit:
	disablenpc "#plate1_prt_fild10"
return

npc "prt_fild10" "#plate2_prt_fild10" GLASS_PLATE 214 107 5 0 0
OnInit:
	disablenpc "#plate2_prt_fild10"
return

npc "prt_fild10" "#plate3_prt_fild10" GLASS_PLATE 220 108 5 0 0
OnInit:
	disablenpc "#plate3_prt_fild10"
return

npc "prt_fild10" "#basket_prt_fild10" 4_ROPEPILE 214 104 5 0 0
OnInit:
	disablenpc "#basket_prt_fild10"
return

// prt_fild11 ============[OFF]==============
npc "prt_fild11" "Extinct Bonfire#prt_fild11" 4_TRACE 226 139 5 0 0
return

// prt_fild11 ============[ON]==============
npc "prt_fild11" "Bonfire#prt_fild11" 4_BONFIRE 226 139 5 0 0
OnInit:
	disablenpc "Bonfire#prt_fild11"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#prt_fild11" "start"
        cmdothernpc "Sitting woman#prt_fild11" "start"
        cmdothernpc "Wanderer#prt_fild11" "start"
        cmdothernpc "Sunbathing girl#prt_fild11" "start"
    endif
return

npc "prt_fild11" "Sitting man#prt_fild11" 4_TOWER_02 223 139 6 0 0
OnInit:
	disablenpc "Sitting man#prt_fild11"
	strlocalvar 1 "status_prt_fild11"
	SetLocalVar "status_prt_fild11" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild11"] == 1)
        Talk2me "Sitting man#prt_fild11" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild11" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild11"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild11" "try_to_start"
	    wait
        if (lv["status_prt_fild11"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "prt_fild11" "Sunbathing girl#prt_fild11" 4_F_PATIENT 225 141 5 0 0
OnInit:
	disablenpc "Sunbathing girl#prt_fild11"
	strlocalvar 1 "status_prt_fild11"
	SetLocalVar "status_prt_fild11" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild11"] == 1)
        Talk2me "Sunbathing girl#prt_fild11" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild11" 0
    stoptimer
return
OnClick:
    if (lv["status_prt_fild11"] == 0)
        cmdothernpc "Bonfire#prt_fild11" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "prt_fild11" "Sitting woman#prt_fild11" 4_TOWER_07 229 140 3 0 0
OnInit:
	disablenpc "Sitting woman#prt_fild11"
	strlocalvar 1 "status_prt_fild11"
	SetLocalVar "status_prt_fild11" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild11"] == 1)
        Talk2me "Sitting woman#prt_fild11" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild11" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild11"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild11" "try_to_start"
	    wait
        if (lv["status_prt_fild11"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "prt_fild11" "Wanderer#prt_fild11" 4_F_05 227 138 1 0 0
OnInit:
	disablenpc "Wanderer#prt_fild11"
	strlocalvar 1 "status_prt_fild11"
	SetLocalVar "status_prt_fild11" 0
return
OnCommand: "start"
	SetLocalVar "status_prt_fild11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_prt_fild11"] == 1)
        Talk2me "Wanderer#prt_fild11" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_prt_fild11" 0
    stoptimer
return
OnClick:
	if (lv["status_prt_fild11"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#prt_fild11" "try_to_start"
	    wait
        if (lv["status_prt_fild11"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "prt_fild11" "#plate1_prt_fild11" GLASS_PLATE 226 141 5 0 0
OnInit:
	disablenpc "#plate1_prt_fild11"
return

npc "prt_fild11" "#plate2_prt_fild11" GLASS_PLATE 223 138 5 0 0
OnInit:
	disablenpc "#plate2_prt_fild11"
return

npc "prt_fild11" "#plate3_prt_fild11" GLASS_PLATE 229 139 5 0 0
OnInit:
	disablenpc "#plate3_prt_fild11"
return

npc "prt_fild11" "#basket_prt_fild11" 4_ROPEPILE 223 135 5 0 0
OnInit:
	disablenpc "#basket_prt_fild11"
return

// ein_fild03 ============[OFF]==============
npc "ein_fild03" "Extinct Bonfire#ein_fild03" 4_TRACE 128 124 5 0 0
return

// ein_fild03 ============[ON]==============
npc "ein_fild03" "Bonfire#ein_fild03" 4_BONFIRE 128 124 5 0 0
OnInit:
	disablenpc "Bonfire#ein_fild03"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#ein_fild03" "start"
        cmdothernpc "Sitting woman#ein_fild03" "start"
        cmdothernpc "Wanderer#ein_fild03" "start"
        cmdothernpc "Sunbathing girl#ein_fild03" "start"
    endif
return

npc "ein_fild03" "Sitting man#ein_fild03" 4_TOWER_02 125 124 6 0 0
OnInit:
	disablenpc "Sitting man#ein_fild03"
	strlocalvar 1 "status_ein_fild03"
	SetLocalVar "status_ein_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_ein_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ein_fild03"] == 1)
        Talk2me "Sitting man#ein_fild03" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ein_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_ein_fild03"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ein_fild03" "try_to_start"
	    wait
        if (lv["status_ein_fild03"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "ein_fild03" "Sunbathing girl#ein_fild03" 4_F_PATIENT 127 126 5 0 0
OnInit:
	disablenpc "Sunbathing girl#ein_fild03"
	strlocalvar 1 "status_ein_fild03"
	SetLocalVar "status_ein_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_ein_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ein_fild03"] == 1)
        Talk2me "Sunbathing girl#ein_fild03" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_ein_fild03" 0
    stoptimer
return
OnClick:
    if (lv["status_ein_fild03"] == 0)
        cmdothernpc "Bonfire#ein_fild03" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "ein_fild03" "Sitting woman#ein_fild03" 4_TOWER_07 131 125 3 0 0
OnInit:
	disablenpc "Sitting woman#ein_fild03"
	strlocalvar 1 "status_ein_fild03"
	SetLocalVar "status_ein_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_ein_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ein_fild03"] == 1)
        Talk2me "Sitting woman#ein_fild03" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ein_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_ein_fild03"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ein_fild03" "try_to_start"
	    wait
        if (lv["status_ein_fild03"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "ein_fild03" "Wanderer#ein_fild03" 4_F_05 129 123 1 0 0
OnInit:
	disablenpc "Wanderer#ein_fild03"
	strlocalvar 1 "status_ein_fild03"
	SetLocalVar "status_ein_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_ein_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ein_fild03"] == 1)
        Talk2me "Wanderer#ein_fild03" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ein_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_ein_fild03"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ein_fild03" "try_to_start"
	    wait
        if (lv["status_ein_fild03"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "ein_fild03" "#plate1_ein_fild03" GLASS_PLATE 128 126 5 0 0
OnInit:
	disablenpc "#plate1_ein_fild03"
return

npc "ein_fild03" "#plate2_ein_fild03" GLASS_PLATE 125 123 5 0 0
OnInit:
	disablenpc "#plate2_ein_fild03"
return

npc "ein_fild03" "#plate3_ein_fild03" GLASS_PLATE 131 124 5 0 0
OnInit:
	disablenpc "#plate3_ein_fild03"
return

npc "ein_fild03" "#basket_ein_fild03" 4_ROPEPILE 125 120 5 0 0
OnInit:
	disablenpc "#basket_ein_fild03"
return

// ein_fild09 ============[OFF]==============
npc "ein_fild09" "Extinct Bonfire#ein_fild09" 4_TRACE 284 96 5 0 0
return

// ein_fild09 ============[ON]==============
npc "ein_fild09" "Bonfire#ein_fild09" 4_BONFIRE 284 96 5 0 0
OnInit:
	disablenpc "Bonfire#ein_fild09"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#ein_fild09" "start"
        cmdothernpc "Sitting woman#ein_fild09" "start"
        cmdothernpc "Wanderer#ein_fild09" "start"
        cmdothernpc "Sunbathing girl#ein_fild09" "start"
    endif
return

npc "ein_fild09" "Sitting man#ein_fild09" 4_TOWER_02 281 96 6 0 0
OnInit:
	disablenpc "Sitting man#ein_fild09"
	strlocalvar 1 "status_ein_fild09"
	SetLocalVar "status_ein_fild09" 0
return
OnCommand: "start"
	SetLocalVar "status_ein_fild09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ein_fild09"] == 1)
        Talk2me "Sitting man#ein_fild09" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ein_fild09" 0
    stoptimer
return
OnClick:
	if (lv["status_ein_fild09"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ein_fild09" "try_to_start"
	    wait
        if (lv["status_ein_fild09"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "ein_fild09" "Sunbathing girl#ein_fild09" 4_F_PATIENT 283 98 5 0 0
OnInit:
	disablenpc "Sunbathing girl#ein_fild09"
	strlocalvar 1 "status_ein_fild09"
	SetLocalVar "status_ein_fild09" 0
return
OnCommand: "start"
	SetLocalVar "status_ein_fild09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ein_fild09"] == 1)
        Talk2me "Sunbathing girl#ein_fild09" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_ein_fild09" 0
    stoptimer
return
OnClick:
    if (lv["status_ein_fild09"] == 0)
        cmdothernpc "Bonfire#ein_fild09" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "ein_fild09" "Sitting woman#ein_fild09" 4_TOWER_07 287 97 3 0 0
OnInit:
	disablenpc "Sitting woman#ein_fild09"
	strlocalvar 1 "status_ein_fild09"
	SetLocalVar "status_ein_fild09" 0
return
OnCommand: "start"
	SetLocalVar "status_ein_fild09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ein_fild09"] == 1)
        Talk2me "Sitting woman#ein_fild09" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ein_fild09" 0
    stoptimer
return
OnClick:
	if (lv["status_ein_fild09"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ein_fild09" "try_to_start"
	    wait
        if (lv["status_ein_fild09"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "ein_fild09" "Wanderer#ein_fild09" 4_F_05 285 95 1 0 0
OnInit:
	disablenpc "Wanderer#ein_fild09"
	strlocalvar 1 "status_ein_fild09"
	SetLocalVar "status_ein_fild09" 0
return
OnCommand: "start"
	SetLocalVar "status_ein_fild09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ein_fild09"] == 1)
        Talk2me "Wanderer#ein_fild09" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ein_fild09" 0
    stoptimer
return
OnClick:
	if (lv["status_ein_fild09"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ein_fild09" "try_to_start"
	    wait
        if (lv["status_ein_fild09"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "ein_fild09" "#plate1_ein_fild09" GLASS_PLATE 284 98 5 0 0
OnInit:
	disablenpc "#plate1_ein_fild09"
return

npc "ein_fild09" "#plate2_ein_fild09" GLASS_PLATE 281 95 5 0 0
OnInit:
	disablenpc "#plate2_ein_fild09"
return

npc "ein_fild09" "#plate3_ein_fild09" GLASS_PLATE 287 96 5 0 0
OnInit:
	disablenpc "#plate3_ein_fild09"
return

npc "ein_fild09" "#basket_ein_fild09" 4_ROPEPILE 281 92 5 0 0
OnInit:
	disablenpc "#basket_ein_fild09"
return

// ein_fild10 ============[OFF]==============
npc "ein_fild10" "Extinct Bonfire#ein_fild10" 4_TRACE 256 124 5 0 0
return

// ein_fild10 ============[ON]==============
npc "ein_fild10" "Bonfire#ein_fild10" 4_BONFIRE 256 124 5 0 0
OnInit:
	disablenpc "Bonfire#ein_fild10"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#ein_fild10" "start"
        cmdothernpc "Sitting woman#ein_fild10" "start"
        cmdothernpc "Wanderer#ein_fild10" "start"
        cmdothernpc "Sunbathing girl#ein_fild10" "start"
    endif
return

npc "ein_fild10" "Sitting man#ein_fild10" 4_TOWER_02 253 124 6 0 0
OnInit:
	disablenpc "Sitting man#ein_fild10"
	strlocalvar 1 "status_ein_fild10"
	SetLocalVar "status_ein_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_ein_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ein_fild10"] == 1)
        Talk2me "Sitting man#ein_fild10" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ein_fild10" 0
    stoptimer
return
OnClick:
	if (lv["status_ein_fild10"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ein_fild10" "try_to_start"
	    wait
        if (lv["status_ein_fild10"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "ein_fild10" "Sunbathing girl#ein_fild10" 4_F_PATIENT 255 126 5 0 0
OnInit:
	disablenpc "Sunbathing girl#ein_fild10"
	strlocalvar 1 "status_ein_fild10"
	SetLocalVar "status_ein_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_ein_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ein_fild10"] == 1)
        Talk2me "Sunbathing girl#ein_fild10" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_ein_fild10" 0
    stoptimer
return
OnClick:
    if (lv["status_ein_fild10"] == 0)
        cmdothernpc "Bonfire#ein_fild10" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "ein_fild10" "Sitting woman#ein_fild10" 4_TOWER_07 259 125 3 0 0
OnInit:
	disablenpc "Sitting woman#ein_fild10"
	strlocalvar 1 "status_ein_fild10"
	SetLocalVar "status_ein_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_ein_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ein_fild10"] == 1)
        Talk2me "Sitting woman#ein_fild10" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ein_fild10" 0
    stoptimer
return
OnClick:
	if (lv["status_ein_fild10"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ein_fild10" "try_to_start"
	    wait
        if (lv["status_ein_fild10"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "ein_fild10" "Wanderer#ein_fild10" 4_F_05 257 123 1 0 0
OnInit:
	disablenpc "Wanderer#ein_fild10"
	strlocalvar 1 "status_ein_fild10"
	SetLocalVar "status_ein_fild10" 0
return
OnCommand: "start"
	SetLocalVar "status_ein_fild10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ein_fild10"] == 1)
        Talk2me "Wanderer#ein_fild10" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ein_fild10" 0
    stoptimer
return
OnClick:
	if (lv["status_ein_fild10"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ein_fild10" "try_to_start"
	    wait
        if (lv["status_ein_fild10"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "ein_fild10" "#plate1_ein_fild10" GLASS_PLATE 256 126 5 0 0
OnInit:
	disablenpc "#plate1_ein_fild10"
return

npc "ein_fild10" "#plate2_ein_fild10" GLASS_PLATE 253 123 5 0 0
OnInit:
	disablenpc "#plate2_ein_fild10"
return

npc "ein_fild10" "#plate3_ein_fild10" GLASS_PLATE 259 124 5 0 0
OnInit:
	disablenpc "#plate3_ein_fild10"
return

npc "ein_fild10" "#basket_ein_fild10" 4_ROPEPILE 253 120 5 0 0
OnInit:
	disablenpc "#basket_ein_fild10"
return

// ayo_fild01 ============[OFF]==============
npc "ayo_fild01" "Extinct Bonfire#ayo_fild01" 4_TRACE 66 103 5 0 0
return

// ayo_fild01 ============[ON]==============
npc "ayo_fild01" "Bonfire#ayo_fild01" 4_BONFIRE 66 103 5 0 0
OnInit:
	disablenpc "Bonfire#ayo_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#ayo_fild01" "start"
        cmdothernpc "Sitting woman#ayo_fild01" "start"
        cmdothernpc "Wanderer#ayo_fild01" "start"
        cmdothernpc "Sunbathing girl#ayo_fild01" "start"
    endif
return

npc "ayo_fild01" "Sitting man#ayo_fild01" 4_TOWER_02 63 103 6 0 0
OnInit:
	disablenpc "Sitting man#ayo_fild01"
	strlocalvar 1 "status_ayo_fild01"
	SetLocalVar "status_ayo_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_ayo_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ayo_fild01"] == 1)
        Talk2me "Sitting man#ayo_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ayo_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_ayo_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ayo_fild01" "try_to_start"
	    wait
        if (lv["status_ayo_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "ayo_fild01" "Sunbathing girl#ayo_fild01" 4_F_PATIENT 65 105 5 0 0
OnInit:
	disablenpc "Sunbathing girl#ayo_fild01"
	strlocalvar 1 "status_ayo_fild01"
	SetLocalVar "status_ayo_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_ayo_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ayo_fild01"] == 1)
        Talk2me "Sunbathing girl#ayo_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_ayo_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_ayo_fild01"] == 0)
        cmdothernpc "Bonfire#ayo_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "ayo_fild01" "Sitting woman#ayo_fild01" 4_TOWER_07 69 104 3 0 0
OnInit:
	disablenpc "Sitting woman#ayo_fild01"
	strlocalvar 1 "status_ayo_fild01"
	SetLocalVar "status_ayo_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_ayo_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ayo_fild01"] == 1)
        Talk2me "Sitting woman#ayo_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ayo_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_ayo_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ayo_fild01" "try_to_start"
	    wait
        if (lv["status_ayo_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "ayo_fild01" "Wanderer#ayo_fild01" 4_F_05 67 102 1 0 0
OnInit:
	disablenpc "Wanderer#ayo_fild01"
	strlocalvar 1 "status_ayo_fild01"
	SetLocalVar "status_ayo_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_ayo_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ayo_fild01"] == 1)
        Talk2me "Wanderer#ayo_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ayo_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_ayo_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ayo_fild01" "try_to_start"
	    wait
        if (lv["status_ayo_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "ayo_fild01" "#plate1_ayo_fild01" GLASS_PLATE 66 105 5 0 0
OnInit:
	disablenpc "#plate1_ayo_fild01"
return

npc "ayo_fild01" "#plate2_ayo_fild01" GLASS_PLATE 63 102 5 0 0
OnInit:
	disablenpc "#plate2_ayo_fild01"
return

npc "ayo_fild01" "#plate3_ayo_fild01" GLASS_PLATE 69 103 5 0 0
OnInit:
	disablenpc "#plate3_ayo_fild01"
return

npc "ayo_fild01" "#basket_ayo_fild01" 4_ROPEPILE 63 99 5 0 0
OnInit:
	disablenpc "#basket_ayo_fild01"
return

// gon_fild01 ============[OFF]==============
npc "gon_fild01" "Extinct Bonfire#gon_fild01" 4_TRACE 148 211 5 0 0
return

// gon_fild01 ============[ON]==============
npc "gon_fild01" "Bonfire#gon_fild01" 4_BONFIRE 148 211 5 0 0
OnInit:
	disablenpc "Bonfire#gon_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#gon_fild01" "start"
        cmdothernpc "Sitting woman#gon_fild01" "start"
        cmdothernpc "Wanderer#gon_fild01" "start"
        cmdothernpc "Sunbathing girl#gon_fild01" "start"
    endif
return

npc "gon_fild01" "Sitting man#gon_fild01" 4_TOWER_02 145 211 6 0 0
OnInit:
	disablenpc "Sitting man#gon_fild01"
	strlocalvar 1 "status_gon_fild01"
	SetLocalVar "status_gon_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_gon_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gon_fild01"] == 1)
        Talk2me "Sitting man#gon_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gon_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_gon_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gon_fild01" "try_to_start"
	    wait
        if (lv["status_gon_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "gon_fild01" "Sunbathing girl#gon_fild01" 4_F_PATIENT 147 213 5 0 0
OnInit:
	disablenpc "Sunbathing girl#gon_fild01"
	strlocalvar 1 "status_gon_fild01"
	SetLocalVar "status_gon_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_gon_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gon_fild01"] == 1)
        Talk2me "Sunbathing girl#gon_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_gon_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_gon_fild01"] == 0)
        cmdothernpc "Bonfire#gon_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "gon_fild01" "Sitting woman#gon_fild01" 4_TOWER_07 151 212 3 0 0
OnInit:
	disablenpc "Sitting woman#gon_fild01"
	strlocalvar 1 "status_gon_fild01"
	SetLocalVar "status_gon_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_gon_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gon_fild01"] == 1)
        Talk2me "Sitting woman#gon_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gon_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_gon_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gon_fild01" "try_to_start"
	    wait
        if (lv["status_gon_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "gon_fild01" "Wanderer#gon_fild01" 4_F_05 149 210 1 0 0
OnInit:
	disablenpc "Wanderer#gon_fild01"
	strlocalvar 1 "status_gon_fild01"
	SetLocalVar "status_gon_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_gon_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_gon_fild01"] == 1)
        Talk2me "Wanderer#gon_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_gon_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_gon_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#gon_fild01" "try_to_start"
	    wait
        if (lv["status_gon_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "gon_fild01" "#plate1_gon_fild01" GLASS_PLATE 148 213 5 0 0
OnInit:
	disablenpc "#plate1_gon_fild01"
return

npc "gon_fild01" "#plate2_gon_fild01" GLASS_PLATE 145 210 5 0 0
OnInit:
	disablenpc "#plate2_gon_fild01"
return

npc "gon_fild01" "#plate3_gon_fild01" GLASS_PLATE 151 211 5 0 0
OnInit:
	disablenpc "#plate3_gon_fild01"
return

npc "gon_fild01" "#basket_gon_fild01" 4_ROPEPILE 145 207 5 0 0
OnInit:
	disablenpc "#basket_gon_fild01"
return

// lhz_fild01 ============[OFF]==============
npc "lhz_fild01" "Extinct Bonfire#lhz_fild01" 4_TRACE 226 253 5 0 0
return

// lhz_fild01 ============[ON]==============
npc "lhz_fild01" "Bonfire#lhz_fild01" 4_BONFIRE 226 253 5 0 0
OnInit:
	disablenpc "Bonfire#lhz_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#lhz_fild01" "start"
        cmdothernpc "Sitting woman#lhz_fild01" "start"
        cmdothernpc "Wanderer#lhz_fild01" "start"
        cmdothernpc "Sunbathing girl#lhz_fild01" "start"
    endif
return

npc "lhz_fild01" "Sitting man#lhz_fild01" 4_TOWER_02 223 253 6 0 0
OnInit:
	disablenpc "Sitting man#lhz_fild01"
	strlocalvar 1 "status_lhz_fild01"
	SetLocalVar "status_lhz_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_lhz_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lhz_fild01"] == 1)
        Talk2me "Sitting man#lhz_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lhz_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_lhz_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lhz_fild01" "try_to_start"
	    wait
        if (lv["status_lhz_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "lhz_fild01" "Sunbathing girl#lhz_fild01" 4_F_PATIENT 225 255 5 0 0
OnInit:
	disablenpc "Sunbathing girl#lhz_fild01"
	strlocalvar 1 "status_lhz_fild01"
	SetLocalVar "status_lhz_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_lhz_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lhz_fild01"] == 1)
        Talk2me "Sunbathing girl#lhz_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_lhz_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_lhz_fild01"] == 0)
        cmdothernpc "Bonfire#lhz_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "lhz_fild01" "Sitting woman#lhz_fild01" 4_TOWER_07 229 254 3 0 0
OnInit:
	disablenpc "Sitting woman#lhz_fild01"
	strlocalvar 1 "status_lhz_fild01"
	SetLocalVar "status_lhz_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_lhz_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lhz_fild01"] == 1)
        Talk2me "Sitting woman#lhz_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lhz_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_lhz_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lhz_fild01" "try_to_start"
	    wait
        if (lv["status_lhz_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "lhz_fild01" "Wanderer#lhz_fild01" 4_F_05 227 252 1 0 0
OnInit:
	disablenpc "Wanderer#lhz_fild01"
	strlocalvar 1 "status_lhz_fild01"
	SetLocalVar "status_lhz_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_lhz_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lhz_fild01"] == 1)
        Talk2me "Wanderer#lhz_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lhz_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_lhz_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lhz_fild01" "try_to_start"
	    wait
        if (lv["status_lhz_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "lhz_fild01" "#plate1_lhz_fild01" GLASS_PLATE 226 255 5 0 0
OnInit:
	disablenpc "#plate1_lhz_fild01"
return

npc "lhz_fild01" "#plate2_lhz_fild01" GLASS_PLATE 223 252 5 0 0
OnInit:
	disablenpc "#plate2_lhz_fild01"
return

npc "lhz_fild01" "#plate3_lhz_fild01" GLASS_PLATE 229 253 5 0 0
OnInit:
	disablenpc "#plate3_lhz_fild01"
return

npc "lhz_fild01" "#basket_lhz_fild01" 4_ROPEPILE 223 249 5 0 0
OnInit:
	disablenpc "#basket_lhz_fild01"
return

// lhz_fild02 ============[OFF]==============
npc "lhz_fild02" "Extinct Bonfire#lhz_fild02" 4_TRACE 157 249 5 0 0
return

// lhz_fild02 ============[ON]==============
npc "lhz_fild02" "Bonfire#lhz_fild02" 4_BONFIRE 157 249 5 0 0
OnInit:
	disablenpc "Bonfire#lhz_fild02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#lhz_fild02" "start"
        cmdothernpc "Sitting woman#lhz_fild02" "start"
        cmdothernpc "Wanderer#lhz_fild02" "start"
        cmdothernpc "Sunbathing girl#lhz_fild02" "start"
    endif
return

npc "lhz_fild02" "Sitting man#lhz_fild02" 4_TOWER_02 154 249 6 0 0
OnInit:
	disablenpc "Sitting man#lhz_fild02"
	strlocalvar 1 "status_lhz_fild02"
	SetLocalVar "status_lhz_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_lhz_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lhz_fild02"] == 1)
        Talk2me "Sitting man#lhz_fild02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lhz_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_lhz_fild02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lhz_fild02" "try_to_start"
	    wait
        if (lv["status_lhz_fild02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "lhz_fild02" "Sunbathing girl#lhz_fild02" 4_F_PATIENT 156 251 5 0 0
OnInit:
	disablenpc "Sunbathing girl#lhz_fild02"
	strlocalvar 1 "status_lhz_fild02"
	SetLocalVar "status_lhz_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_lhz_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lhz_fild02"] == 1)
        Talk2me "Sunbathing girl#lhz_fild02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_lhz_fild02" 0
    stoptimer
return
OnClick:
    if (lv["status_lhz_fild02"] == 0)
        cmdothernpc "Bonfire#lhz_fild02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "lhz_fild02" "Sitting woman#lhz_fild02" 4_TOWER_07 160 250 3 0 0
OnInit:
	disablenpc "Sitting woman#lhz_fild02"
	strlocalvar 1 "status_lhz_fild02"
	SetLocalVar "status_lhz_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_lhz_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lhz_fild02"] == 1)
        Talk2me "Sitting woman#lhz_fild02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lhz_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_lhz_fild02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lhz_fild02" "try_to_start"
	    wait
        if (lv["status_lhz_fild02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "lhz_fild02" "Wanderer#lhz_fild02" 4_F_05 158 248 1 0 0
OnInit:
	disablenpc "Wanderer#lhz_fild02"
	strlocalvar 1 "status_lhz_fild02"
	SetLocalVar "status_lhz_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_lhz_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lhz_fild02"] == 1)
        Talk2me "Wanderer#lhz_fild02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lhz_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_lhz_fild02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lhz_fild02" "try_to_start"
	    wait
        if (lv["status_lhz_fild02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "lhz_fild02" "#plate1_lhz_fild02" GLASS_PLATE 157 251 5 0 0
OnInit:
	disablenpc "#plate1_lhz_fild02"
return

npc "lhz_fild02" "#plate2_lhz_fild02" GLASS_PLATE 154 248 5 0 0
OnInit:
	disablenpc "#plate2_lhz_fild02"
return

npc "lhz_fild02" "#plate3_lhz_fild02" GLASS_PLATE 160 249 5 0 0
OnInit:
	disablenpc "#plate3_lhz_fild02"
return

npc "lhz_fild02" "#basket_lhz_fild02" 4_ROPEPILE 154 245 5 0 0
OnInit:
	disablenpc "#basket_lhz_fild02"
return

// lhz_fild03 ============[OFF]==============
npc "lhz_fild03" "Extinct Bonfire#lhz_fild03" 4_TRACE 104 129 5 0 0
return

// lhz_fild03 ============[ON]==============
npc "lhz_fild03" "Bonfire#lhz_fild03" 4_BONFIRE 104 129 5 0 0
OnInit:
	disablenpc "Bonfire#lhz_fild03"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#lhz_fild03" "start"
        cmdothernpc "Sitting woman#lhz_fild03" "start"
        cmdothernpc "Wanderer#lhz_fild03" "start"
        cmdothernpc "Sunbathing girl#lhz_fild03" "start"
    endif
return

npc "lhz_fild03" "Sitting man#lhz_fild03" 4_TOWER_02 101 129 6 0 0
OnInit:
	disablenpc "Sitting man#lhz_fild03"
	strlocalvar 1 "status_lhz_fild03"
	SetLocalVar "status_lhz_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_lhz_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lhz_fild03"] == 1)
        Talk2me "Sitting man#lhz_fild03" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lhz_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_lhz_fild03"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lhz_fild03" "try_to_start"
	    wait
        if (lv["status_lhz_fild03"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "lhz_fild03" "Sunbathing girl#lhz_fild03" 4_F_PATIENT 103 131 5 0 0
OnInit:
	disablenpc "Sunbathing girl#lhz_fild03"
	strlocalvar 1 "status_lhz_fild03"
	SetLocalVar "status_lhz_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_lhz_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lhz_fild03"] == 1)
        Talk2me "Sunbathing girl#lhz_fild03" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_lhz_fild03" 0
    stoptimer
return
OnClick:
    if (lv["status_lhz_fild03"] == 0)
        cmdothernpc "Bonfire#lhz_fild03" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "lhz_fild03" "Sitting woman#lhz_fild03" 4_TOWER_07 107 130 3 0 0
OnInit:
	disablenpc "Sitting woman#lhz_fild03"
	strlocalvar 1 "status_lhz_fild03"
	SetLocalVar "status_lhz_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_lhz_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lhz_fild03"] == 1)
        Talk2me "Sitting woman#lhz_fild03" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lhz_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_lhz_fild03"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lhz_fild03" "try_to_start"
	    wait
        if (lv["status_lhz_fild03"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "lhz_fild03" "Wanderer#lhz_fild03" 4_F_05 105 128 1 0 0
OnInit:
	disablenpc "Wanderer#lhz_fild03"
	strlocalvar 1 "status_lhz_fild03"
	SetLocalVar "status_lhz_fild03" 0
return
OnCommand: "start"
	SetLocalVar "status_lhz_fild03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_lhz_fild03"] == 1)
        Talk2me "Wanderer#lhz_fild03" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_lhz_fild03" 0
    stoptimer
return
OnClick:
	if (lv["status_lhz_fild03"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#lhz_fild03" "try_to_start"
	    wait
        if (lv["status_lhz_fild03"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "lhz_fild03" "#plate1_lhz_fild03" GLASS_PLATE 104 131 5 0 0
OnInit:
	disablenpc "#plate1_lhz_fild03"
return

npc "lhz_fild03" "#plate2_lhz_fild03" GLASS_PLATE 101 128 5 0 0
OnInit:
	disablenpc "#plate2_lhz_fild03"
return

npc "lhz_fild03" "#plate3_lhz_fild03" GLASS_PLATE 107 129 5 0 0
OnInit:
	disablenpc "#plate3_lhz_fild03"
return

npc "lhz_fild03" "#basket_lhz_fild03" 4_ROPEPILE 101 125 5 0 0
OnInit:
	disablenpc "#basket_lhz_fild03"
return

// yuno_fild01 ============[OFF]==============
npc "yuno_fild01" "Extinct Bonfire#yuno_fild01" 4_TRACE 161 82 5 0 0
return

// yuno_fild01 ============[ON]==============
npc "yuno_fild01" "Bonfire#yuno_fild01" 4_BONFIRE 161 82 5 0 0
OnInit:
	disablenpc "Bonfire#yuno_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#yuno_fild01" "start"
        cmdothernpc "Sitting woman#yuno_fild01" "start"
        cmdothernpc "Wanderer#yuno_fild01" "start"
        cmdothernpc "Sunbathing girl#yuno_fild01" "start"
    endif
return

npc "yuno_fild01" "Sitting man#yuno_fild01" 4_TOWER_02 158 82 6 0 0
OnInit:
	disablenpc "Sitting man#yuno_fild01"
	strlocalvar 1 "status_yuno_fild01"
	SetLocalVar "status_yuno_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_yuno_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_yuno_fild01"] == 1)
        Talk2me "Sitting man#yuno_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_yuno_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_yuno_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#yuno_fild01" "try_to_start"
	    wait
        if (lv["status_yuno_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "yuno_fild01" "Sunbathing girl#yuno_fild01" 4_F_PATIENT 160 84 5 0 0
OnInit:
	disablenpc "Sunbathing girl#yuno_fild01"
	strlocalvar 1 "status_yuno_fild01"
	SetLocalVar "status_yuno_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_yuno_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_yuno_fild01"] == 1)
        Talk2me "Sunbathing girl#yuno_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_yuno_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_yuno_fild01"] == 0)
        cmdothernpc "Bonfire#yuno_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "yuno_fild01" "Sitting woman#yuno_fild01" 4_TOWER_07 164 83 3 0 0
OnInit:
	disablenpc "Sitting woman#yuno_fild01"
	strlocalvar 1 "status_yuno_fild01"
	SetLocalVar "status_yuno_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_yuno_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_yuno_fild01"] == 1)
        Talk2me "Sitting woman#yuno_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_yuno_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_yuno_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#yuno_fild01" "try_to_start"
	    wait
        if (lv["status_yuno_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "yuno_fild01" "Wanderer#yuno_fild01" 4_F_05 162 81 1 0 0
OnInit:
	disablenpc "Wanderer#yuno_fild01"
	strlocalvar 1 "status_yuno_fild01"
	SetLocalVar "status_yuno_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_yuno_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_yuno_fild01"] == 1)
        Talk2me "Wanderer#yuno_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_yuno_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_yuno_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#yuno_fild01" "try_to_start"
	    wait
        if (lv["status_yuno_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "yuno_fild01" "#plate1_yuno_fild01" GLASS_PLATE 161 84 5 0 0
OnInit:
	disablenpc "#plate1_yuno_fild01"
return

npc "yuno_fild01" "#plate2_yuno_fild01" GLASS_PLATE 158 81 5 0 0
OnInit:
	disablenpc "#plate2_yuno_fild01"
return

npc "yuno_fild01" "#plate3_yuno_fild01" GLASS_PLATE 164 82 5 0 0
OnInit:
	disablenpc "#plate3_yuno_fild01"
return

npc "yuno_fild01" "#basket_yuno_fild01" 4_ROPEPILE 158 78 5 0 0
OnInit:
	disablenpc "#basket_yuno_fild01"
return

// ma_fild02 ============[OFF]==============
npc "ma_fild02" "Extinct Bonfire#ma_fild02" 4_TRACE 200 148 5 0 0
return

// ma_fild02 ============[ON]==============
npc "ma_fild02" "Bonfire#ma_fild02" 4_BONFIRE 200 148 5 0 0
OnInit:
	disablenpc "Bonfire#ma_fild02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#ma_fild02" "start"
        cmdothernpc "Sitting woman#ma_fild02" "start"
        cmdothernpc "Wanderer#ma_fild02" "start"
        cmdothernpc "Sunbathing girl#ma_fild02" "start"
    endif
return

npc "ma_fild02" "Sitting man#ma_fild02" 4_TOWER_02 197 148 6 0 0
OnInit:
	disablenpc "Sitting man#ma_fild02"
	strlocalvar 1 "status_ma_fild02"
	SetLocalVar "status_ma_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_ma_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ma_fild02"] == 1)
        Talk2me "Sitting man#ma_fild02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ma_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_ma_fild02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ma_fild02" "try_to_start"
	    wait
        if (lv["status_ma_fild02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "ma_fild02" "Sunbathing girl#ma_fild02" 4_F_PATIENT 199 150 5 0 0
OnInit:
	disablenpc "Sunbathing girl#ma_fild02"
	strlocalvar 1 "status_ma_fild02"
	SetLocalVar "status_ma_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_ma_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ma_fild02"] == 1)
        Talk2me "Sunbathing girl#ma_fild02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_ma_fild02" 0
    stoptimer
return
OnClick:
    if (lv["status_ma_fild02"] == 0)
        cmdothernpc "Bonfire#ma_fild02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "ma_fild02" "Sitting woman#ma_fild02" 4_TOWER_07 203 149 3 0 0
OnInit:
	disablenpc "Sitting woman#ma_fild02"
	strlocalvar 1 "status_ma_fild02"
	SetLocalVar "status_ma_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_ma_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ma_fild02"] == 1)
        Talk2me "Sitting woman#ma_fild02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ma_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_ma_fild02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ma_fild02" "try_to_start"
	    wait
        if (lv["status_ma_fild02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "ma_fild02" "Wanderer#ma_fild02" 4_F_05 201 147 1 0 0
OnInit:
	disablenpc "Wanderer#ma_fild02"
	strlocalvar 1 "status_ma_fild02"
	SetLocalVar "status_ma_fild02" 0
return
OnCommand: "start"
	SetLocalVar "status_ma_fild02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ma_fild02"] == 1)
        Talk2me "Wanderer#ma_fild02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ma_fild02" 0
    stoptimer
return
OnClick:
	if (lv["status_ma_fild02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ma_fild02" "try_to_start"
	    wait
        if (lv["status_ma_fild02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "ma_fild02" "#plate1_ma_fild02" GLASS_PLATE 200 150 5 0 0
OnInit:
	disablenpc "#plate1_ma_fild02"
return

npc "ma_fild02" "#plate2_ma_fild02" GLASS_PLATE 197 147 5 0 0
OnInit:
	disablenpc "#plate2_ma_fild02"
return

npc "ma_fild02" "#plate3_ma_fild02" GLASS_PLATE 203 148 5 0 0
OnInit:
	disablenpc "#plate3_ma_fild02"
return

npc "ma_fild02" "#basket_ma_fild02" 4_ROPEPILE 197 144 5 0 0
OnInit:
	disablenpc "#basket_ma_fild02"
return

// ma_fild01 ============[OFF]==============
npc "ma_fild01" "Extinct Bonfire#ma_fild01" 4_TRACE 168 284 5 0 0
return

// ma_fild01 ============[ON]==============
npc "ma_fild01" "Bonfire#ma_fild01" 4_BONFIRE 168 284 5 0 0
OnInit:
	disablenpc "Bonfire#ma_fild01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#ma_fild01" "start"
        cmdothernpc "Sitting woman#ma_fild01" "start"
        cmdothernpc "Wanderer#ma_fild01" "start"
        cmdothernpc "Sunbathing girl#ma_fild01" "start"
    endif
return

npc "ma_fild01" "Sitting man#ma_fild01" 4_TOWER_02 165 284 6 0 0
OnInit:
	disablenpc "Sitting man#ma_fild01"
	strlocalvar 1 "status_ma_fild01"
	SetLocalVar "status_ma_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_ma_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ma_fild01"] == 1)
        Talk2me "Sitting man#ma_fild01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ma_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_ma_fild01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ma_fild01" "try_to_start"
	    wait
        if (lv["status_ma_fild01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "ma_fild01" "Sunbathing girl#ma_fild01" 4_F_PATIENT 167 286 5 0 0
OnInit:
	disablenpc "Sunbathing girl#ma_fild01"
	strlocalvar 1 "status_ma_fild01"
	SetLocalVar "status_ma_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_ma_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ma_fild01"] == 1)
        Talk2me "Sunbathing girl#ma_fild01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_ma_fild01" 0
    stoptimer
return
OnClick:
    if (lv["status_ma_fild01"] == 0)
        cmdothernpc "Bonfire#ma_fild01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "ma_fild01" "Sitting woman#ma_fild01" 4_TOWER_07 171 285 3 0 0
OnInit:
	disablenpc "Sitting woman#ma_fild01"
	strlocalvar 1 "status_ma_fild01"
	SetLocalVar "status_ma_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_ma_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ma_fild01"] == 1)
        Talk2me "Sitting woman#ma_fild01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ma_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_ma_fild01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ma_fild01" "try_to_start"
	    wait
        if (lv["status_ma_fild01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "ma_fild01" "Wanderer#ma_fild01" 4_F_05 169 283 1 0 0
OnInit:
	disablenpc "Wanderer#ma_fild01"
	strlocalvar 1 "status_ma_fild01"
	SetLocalVar "status_ma_fild01" 0
return
OnCommand: "start"
	SetLocalVar "status_ma_fild01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_ma_fild01"] == 1)
        Talk2me "Wanderer#ma_fild01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_ma_fild01" 0
    stoptimer
return
OnClick:
	if (lv["status_ma_fild01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#ma_fild01" "try_to_start"
	    wait
        if (lv["status_ma_fild01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "ma_fild01" "#plate1_ma_fild01" GLASS_PLATE 168 286 5 0 0
OnInit:
	disablenpc "#plate1_ma_fild01"
return

npc "ma_fild01" "#plate2_ma_fild01" GLASS_PLATE 165 283 5 0 0
OnInit:
	disablenpc "#plate2_ma_fild01"
return

npc "ma_fild01" "#plate3_ma_fild01" GLASS_PLATE 171 284 5 0 0
OnInit:
	disablenpc "#plate3_ma_fild01"
return

npc "ma_fild01" "#basket_ma_fild01" 4_ROPEPILE 165 280 5 0 0
OnInit:
	disablenpc "#basket_ma_fild01"
return

// mjolnir_01 ============[OFF]==============
npc "mjolnir_01" "Extinct Bonfire#mjolnir_01" 4_TRACE 229 155 5 0 0
return

// mjolnir_01 ============[ON]==============
npc "mjolnir_01" "Bonfire#mjolnir_01" 4_BONFIRE 229 155 5 0 0
OnInit:
	disablenpc "Bonfire#mjolnir_01"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mjolnir_01" "start"
        cmdothernpc "Sitting woman#mjolnir_01" "start"
        cmdothernpc "Wanderer#mjolnir_01" "start"
        cmdothernpc "Sunbathing girl#mjolnir_01" "start"
    endif
return

npc "mjolnir_01" "Sitting man#mjolnir_01" 4_TOWER_02 226 155 6 0 0
OnInit:
	disablenpc "Sitting man#mjolnir_01"
	strlocalvar 1 "status_mjolnir_01"
	SetLocalVar "status_mjolnir_01" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_01"] == 1)
        Talk2me "Sitting man#mjolnir_01" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_01" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_01"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_01" "try_to_start"
	    wait
        if (lv["status_mjolnir_01"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mjolnir_01" "Sunbathing girl#mjolnir_01" 4_F_PATIENT 228 157 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mjolnir_01"
	strlocalvar 1 "status_mjolnir_01"
	SetLocalVar "status_mjolnir_01" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_01"] == 1)
        Talk2me "Sunbathing girl#mjolnir_01" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_01" 0
    stoptimer
return
OnClick:
    if (lv["status_mjolnir_01"] == 0)
        cmdothernpc "Bonfire#mjolnir_01" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mjolnir_01" "Sitting woman#mjolnir_01" 4_TOWER_07 232 156 3 0 0
OnInit:
	disablenpc "Sitting woman#mjolnir_01"
	strlocalvar 1 "status_mjolnir_01"
	SetLocalVar "status_mjolnir_01" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_01"] == 1)
        Talk2me "Sitting woman#mjolnir_01" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_01" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_01"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_01" "try_to_start"
	    wait
        if (lv["status_mjolnir_01"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mjolnir_01" "Wanderer#mjolnir_01" 4_F_05 230 154 1 0 0
OnInit:
	disablenpc "Wanderer#mjolnir_01"
	strlocalvar 1 "status_mjolnir_01"
	SetLocalVar "status_mjolnir_01" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_01" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_01"] == 1)
        Talk2me "Wanderer#mjolnir_01" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_01" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_01"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_01" "try_to_start"
	    wait
        if (lv["status_mjolnir_01"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mjolnir_01" "#plate1_mjolnir_01" GLASS_PLATE 229 157 5 0 0
OnInit:
	disablenpc "#plate1_mjolnir_01"
return

npc "mjolnir_01" "#plate2_mjolnir_01" GLASS_PLATE 226 154 5 0 0
OnInit:
	disablenpc "#plate2_mjolnir_01"
return

npc "mjolnir_01" "#plate3_mjolnir_01" GLASS_PLATE 232 155 5 0 0
OnInit:
	disablenpc "#plate3_mjolnir_01"
return

npc "mjolnir_01" "#basket_mjolnir_01" 4_ROPEPILE 226 151 5 0 0
OnInit:
	disablenpc "#basket_mjolnir_01"
return

// mjolnir_02 ============[OFF]==============
npc "mjolnir_02" "Extinct Bonfire#mjolnir_02" 4_TRACE 190 199 5 0 0
return

// mjolnir_02 ============[ON]==============
npc "mjolnir_02" "Bonfire#mjolnir_02" 4_BONFIRE 190 199 5 0 0
OnInit:
	disablenpc "Bonfire#mjolnir_02"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mjolnir_02" "start"
        cmdothernpc "Sitting woman#mjolnir_02" "start"
        cmdothernpc "Wanderer#mjolnir_02" "start"
        cmdothernpc "Sunbathing girl#mjolnir_02" "start"
    endif
return

npc "mjolnir_02" "Sitting man#mjolnir_02" 4_TOWER_02 187 199 6 0 0
OnInit:
	disablenpc "Sitting man#mjolnir_02"
	strlocalvar 1 "status_mjolnir_02"
	SetLocalVar "status_mjolnir_02" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_02"] == 1)
        Talk2me "Sitting man#mjolnir_02" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_02" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_02"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_02" "try_to_start"
	    wait
        if (lv["status_mjolnir_02"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mjolnir_02" "Sunbathing girl#mjolnir_02" 4_F_PATIENT 189 201 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mjolnir_02"
	strlocalvar 1 "status_mjolnir_02"
	SetLocalVar "status_mjolnir_02" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_02"] == 1)
        Talk2me "Sunbathing girl#mjolnir_02" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_02" 0
    stoptimer
return
OnClick:
    if (lv["status_mjolnir_02"] == 0)
        cmdothernpc "Bonfire#mjolnir_02" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mjolnir_02" "Sitting woman#mjolnir_02" 4_TOWER_07 193 200 3 0 0
OnInit:
	disablenpc "Sitting woman#mjolnir_02"
	strlocalvar 1 "status_mjolnir_02"
	SetLocalVar "status_mjolnir_02" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_02"] == 1)
        Talk2me "Sitting woman#mjolnir_02" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_02" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_02"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_02" "try_to_start"
	    wait
        if (lv["status_mjolnir_02"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mjolnir_02" "Wanderer#mjolnir_02" 4_F_05 191 198 1 0 0
OnInit:
	disablenpc "Wanderer#mjolnir_02"
	strlocalvar 1 "status_mjolnir_02"
	SetLocalVar "status_mjolnir_02" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_02" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_02"] == 1)
        Talk2me "Wanderer#mjolnir_02" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_02" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_02"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_02" "try_to_start"
	    wait
        if (lv["status_mjolnir_02"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mjolnir_02" "#plate1_mjolnir_02" GLASS_PLATE 190 201 5 0 0
OnInit:
	disablenpc "#plate1_mjolnir_02"
return

npc "mjolnir_02" "#plate2_mjolnir_02" GLASS_PLATE 187 198 5 0 0
OnInit:
	disablenpc "#plate2_mjolnir_02"
return

npc "mjolnir_02" "#plate3_mjolnir_02" GLASS_PLATE 193 199 5 0 0
OnInit:
	disablenpc "#plate3_mjolnir_02"
return

npc "mjolnir_02" "#basket_mjolnir_02" 4_ROPEPILE 187 195 5 0 0
OnInit:
	disablenpc "#basket_mjolnir_02"
return

// mjolnir_03 ============[OFF]==============
npc "mjolnir_03" "Extinct Bonfire#mjolnir_03" 4_TRACE 214 219 5 0 0
return

// mjolnir_03 ============[ON]==============
npc "mjolnir_03" "Bonfire#mjolnir_03" 4_BONFIRE 214 219 5 0 0
OnInit:
	disablenpc "Bonfire#mjolnir_03"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mjolnir_03" "start"
        cmdothernpc "Sitting woman#mjolnir_03" "start"
        cmdothernpc "Wanderer#mjolnir_03" "start"
        cmdothernpc "Sunbathing girl#mjolnir_03" "start"
    endif
return

npc "mjolnir_03" "Sitting man#mjolnir_03" 4_TOWER_02 211 219 6 0 0
OnInit:
	disablenpc "Sitting man#mjolnir_03"
	strlocalvar 1 "status_mjolnir_03"
	SetLocalVar "status_mjolnir_03" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_03"] == 1)
        Talk2me "Sitting man#mjolnir_03" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_03" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_03"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_03" "try_to_start"
	    wait
        if (lv["status_mjolnir_03"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mjolnir_03" "Sunbathing girl#mjolnir_03" 4_F_PATIENT 213 221 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mjolnir_03"
	strlocalvar 1 "status_mjolnir_03"
	SetLocalVar "status_mjolnir_03" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_03"] == 1)
        Talk2me "Sunbathing girl#mjolnir_03" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_03" 0
    stoptimer
return
OnClick:
    if (lv["status_mjolnir_03"] == 0)
        cmdothernpc "Bonfire#mjolnir_03" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mjolnir_03" "Sitting woman#mjolnir_03" 4_TOWER_07 217 220 3 0 0
OnInit:
	disablenpc "Sitting woman#mjolnir_03"
	strlocalvar 1 "status_mjolnir_03"
	SetLocalVar "status_mjolnir_03" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_03"] == 1)
        Talk2me "Sitting woman#mjolnir_03" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_03" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_03"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_03" "try_to_start"
	    wait
        if (lv["status_mjolnir_03"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mjolnir_03" "Wanderer#mjolnir_03" 4_F_05 215 218 1 0 0
OnInit:
	disablenpc "Wanderer#mjolnir_03"
	strlocalvar 1 "status_mjolnir_03"
	SetLocalVar "status_mjolnir_03" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_03" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_03"] == 1)
        Talk2me "Wanderer#mjolnir_03" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_03" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_03"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_03" "try_to_start"
	    wait
        if (lv["status_mjolnir_03"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mjolnir_03" "#plate1_mjolnir_03" GLASS_PLATE 214 221 5 0 0
OnInit:
	disablenpc "#plate1_mjolnir_03"
return

npc "mjolnir_03" "#plate2_mjolnir_03" GLASS_PLATE 211 218 5 0 0
OnInit:
	disablenpc "#plate2_mjolnir_03"
return

npc "mjolnir_03" "#plate3_mjolnir_03" GLASS_PLATE 217 219 5 0 0
OnInit:
	disablenpc "#plate3_mjolnir_03"
return

npc "mjolnir_03" "#basket_mjolnir_03" 4_ROPEPILE 211 215 5 0 0
OnInit:
	disablenpc "#basket_mjolnir_03"
return

// mjolnir_04 ============[OFF]==============
npc "mjolnir_04" "Extinct Bonfire#mjolnir_04" 4_TRACE 177 195 5 0 0
return

// mjolnir_04 ============[ON]==============
npc "mjolnir_04" "Bonfire#mjolnir_04" 4_BONFIRE 177 195 5 0 0
OnInit:
	disablenpc "Bonfire#mjolnir_04"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mjolnir_04" "start"
        cmdothernpc "Sitting woman#mjolnir_04" "start"
        cmdothernpc "Wanderer#mjolnir_04" "start"
        cmdothernpc "Sunbathing girl#mjolnir_04" "start"
    endif
return

npc "mjolnir_04" "Sitting man#mjolnir_04" 4_TOWER_02 174 195 6 0 0
OnInit:
	disablenpc "Sitting man#mjolnir_04"
	strlocalvar 1 "status_mjolnir_04"
	SetLocalVar "status_mjolnir_04" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_04"] == 1)
        Talk2me "Sitting man#mjolnir_04" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_04" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_04"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_04" "try_to_start"
	    wait
        if (lv["status_mjolnir_04"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mjolnir_04" "Sunbathing girl#mjolnir_04" 4_F_PATIENT 176 197 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mjolnir_04"
	strlocalvar 1 "status_mjolnir_04"
	SetLocalVar "status_mjolnir_04" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_04"] == 1)
        Talk2me "Sunbathing girl#mjolnir_04" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_04" 0
    stoptimer
return
OnClick:
    if (lv["status_mjolnir_04"] == 0)
        cmdothernpc "Bonfire#mjolnir_04" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mjolnir_04" "Sitting woman#mjolnir_04" 4_TOWER_07 180 196 3 0 0
OnInit:
	disablenpc "Sitting woman#mjolnir_04"
	strlocalvar 1 "status_mjolnir_04"
	SetLocalVar "status_mjolnir_04" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_04"] == 1)
        Talk2me "Sitting woman#mjolnir_04" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_04" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_04"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_04" "try_to_start"
	    wait
        if (lv["status_mjolnir_04"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mjolnir_04" "Wanderer#mjolnir_04" 4_F_05 178 194 1 0 0
OnInit:
	disablenpc "Wanderer#mjolnir_04"
	strlocalvar 1 "status_mjolnir_04"
	SetLocalVar "status_mjolnir_04" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_04" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_04"] == 1)
        Talk2me "Wanderer#mjolnir_04" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_04" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_04"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_04" "try_to_start"
	    wait
        if (lv["status_mjolnir_04"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mjolnir_04" "#plate1_mjolnir_04" GLASS_PLATE 177 197 5 0 0
OnInit:
	disablenpc "#plate1_mjolnir_04"
return

npc "mjolnir_04" "#plate2_mjolnir_04" GLASS_PLATE 174 194 5 0 0
OnInit:
	disablenpc "#plate2_mjolnir_04"
return

npc "mjolnir_04" "#plate3_mjolnir_04" GLASS_PLATE 180 195 5 0 0
OnInit:
	disablenpc "#plate3_mjolnir_04"
return

npc "mjolnir_04" "#basket_mjolnir_04" 4_ROPEPILE 174 191 5 0 0
OnInit:
	disablenpc "#basket_mjolnir_04"
return

// mjolnir_05 ============[OFF]==============
npc "mjolnir_05" "Extinct Bonfire#mjolnir_05" 4_TRACE 162 280 5 0 0
return

// mjolnir_05 ============[ON]==============
npc "mjolnir_05" "Bonfire#mjolnir_05" 4_BONFIRE 162 280 5 0 0
OnInit:
	disablenpc "Bonfire#mjolnir_05"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mjolnir_05" "start"
        cmdothernpc "Sitting woman#mjolnir_05" "start"
        cmdothernpc "Wanderer#mjolnir_05" "start"
        cmdothernpc "Sunbathing girl#mjolnir_05" "start"
    endif
return

npc "mjolnir_05" "Sitting man#mjolnir_05" 4_TOWER_02 159 280 6 0 0
OnInit:
	disablenpc "Sitting man#mjolnir_05"
	strlocalvar 1 "status_mjolnir_05"
	SetLocalVar "status_mjolnir_05" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_05"] == 1)
        Talk2me "Sitting man#mjolnir_05" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_05" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_05"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_05" "try_to_start"
	    wait
        if (lv["status_mjolnir_05"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mjolnir_05" "Sunbathing girl#mjolnir_05" 4_F_PATIENT 161 282 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mjolnir_05"
	strlocalvar 1 "status_mjolnir_05"
	SetLocalVar "status_mjolnir_05" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_05"] == 1)
        Talk2me "Sunbathing girl#mjolnir_05" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_05" 0
    stoptimer
return
OnClick:
    if (lv["status_mjolnir_05"] == 0)
        cmdothernpc "Bonfire#mjolnir_05" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mjolnir_05" "Sitting woman#mjolnir_05" 4_TOWER_07 165 281 3 0 0
OnInit:
	disablenpc "Sitting woman#mjolnir_05"
	strlocalvar 1 "status_mjolnir_05"
	SetLocalVar "status_mjolnir_05" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_05"] == 1)
        Talk2me "Sitting woman#mjolnir_05" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_05" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_05"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_05" "try_to_start"
	    wait
        if (lv["status_mjolnir_05"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mjolnir_05" "Wanderer#mjolnir_05" 4_F_05 163 279 1 0 0
OnInit:
	disablenpc "Wanderer#mjolnir_05"
	strlocalvar 1 "status_mjolnir_05"
	SetLocalVar "status_mjolnir_05" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_05" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_05"] == 1)
        Talk2me "Wanderer#mjolnir_05" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_05" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_05"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_05" "try_to_start"
	    wait
        if (lv["status_mjolnir_05"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mjolnir_05" "#plate1_mjolnir_05" GLASS_PLATE 162 282 5 0 0
OnInit:
	disablenpc "#plate1_mjolnir_05"
return

npc "mjolnir_05" "#plate2_mjolnir_05" GLASS_PLATE 159 279 5 0 0
OnInit:
	disablenpc "#plate2_mjolnir_05"
return

npc "mjolnir_05" "#plate3_mjolnir_05" GLASS_PLATE 165 280 5 0 0
OnInit:
	disablenpc "#plate3_mjolnir_05"
return

npc "mjolnir_05" "#basket_mjolnir_05" 4_ROPEPILE 159 276 5 0 0
OnInit:
	disablenpc "#basket_mjolnir_05"
return

// mjolnir_06 ============[OFF]==============
npc "mjolnir_06" "Extinct Bonfire#mjolnir_06" 4_TRACE 255 273 5 0 0
return

// mjolnir_06 ============[ON]==============
npc "mjolnir_06" "Bonfire#mjolnir_06" 4_BONFIRE 255 273 5 0 0
OnInit:
	disablenpc "Bonfire#mjolnir_06"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mjolnir_06" "start"
        cmdothernpc "Sitting woman#mjolnir_06" "start"
        cmdothernpc "Wanderer#mjolnir_06" "start"
        cmdothernpc "Sunbathing girl#mjolnir_06" "start"
    endif
return

npc "mjolnir_06" "Sitting man#mjolnir_06" 4_TOWER_02 252 273 6 0 0
OnInit:
	disablenpc "Sitting man#mjolnir_06"
	strlocalvar 1 "status_mjolnir_06"
	SetLocalVar "status_mjolnir_06" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_06"] == 1)
        Talk2me "Sitting man#mjolnir_06" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_06" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_06"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_06" "try_to_start"
	    wait
        if (lv["status_mjolnir_06"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mjolnir_06" "Sunbathing girl#mjolnir_06" 4_F_PATIENT 254 275 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mjolnir_06"
	strlocalvar 1 "status_mjolnir_06"
	SetLocalVar "status_mjolnir_06" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_06"] == 1)
        Talk2me "Sunbathing girl#mjolnir_06" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_06" 0
    stoptimer
return
OnClick:
    if (lv["status_mjolnir_06"] == 0)
        cmdothernpc "Bonfire#mjolnir_06" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mjolnir_06" "Sitting woman#mjolnir_06" 4_TOWER_07 258 274 3 0 0
OnInit:
	disablenpc "Sitting woman#mjolnir_06"
	strlocalvar 1 "status_mjolnir_06"
	SetLocalVar "status_mjolnir_06" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_06"] == 1)
        Talk2me "Sitting woman#mjolnir_06" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_06" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_06"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_06" "try_to_start"
	    wait
        if (lv["status_mjolnir_06"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mjolnir_06" "Wanderer#mjolnir_06" 4_F_05 256 272 1 0 0
OnInit:
	disablenpc "Wanderer#mjolnir_06"
	strlocalvar 1 "status_mjolnir_06"
	SetLocalVar "status_mjolnir_06" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_06" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_06"] == 1)
        Talk2me "Wanderer#mjolnir_06" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_06" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_06"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_06" "try_to_start"
	    wait
        if (lv["status_mjolnir_06"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mjolnir_06" "#plate1_mjolnir_06" GLASS_PLATE 255 275 5 0 0
OnInit:
	disablenpc "#plate1_mjolnir_06"
return

npc "mjolnir_06" "#plate2_mjolnir_06" GLASS_PLATE 252 272 5 0 0
OnInit:
	disablenpc "#plate2_mjolnir_06"
return

npc "mjolnir_06" "#plate3_mjolnir_06" GLASS_PLATE 258 273 5 0 0
OnInit:
	disablenpc "#plate3_mjolnir_06"
return

npc "mjolnir_06" "#basket_mjolnir_06" 4_ROPEPILE 252 269 5 0 0
OnInit:
	disablenpc "#basket_mjolnir_06"
return

// mjolnir_07 ============[OFF]==============
npc "mjolnir_07" "Extinct Bonfire#mjolnir_07" 4_TRACE 277 237 5 0 0
return

// mjolnir_07 ============[ON]==============
npc "mjolnir_07" "Bonfire#mjolnir_07" 4_BONFIRE 277 237 5 0 0
OnInit:
	disablenpc "Bonfire#mjolnir_07"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mjolnir_07" "start"
        cmdothernpc "Sitting woman#mjolnir_07" "start"
        cmdothernpc "Wanderer#mjolnir_07" "start"
        cmdothernpc "Sunbathing girl#mjolnir_07" "start"
    endif
return

npc "mjolnir_07" "Sitting man#mjolnir_07" 4_TOWER_02 274 237 6 0 0
OnInit:
	disablenpc "Sitting man#mjolnir_07"
	strlocalvar 1 "status_mjolnir_07"
	SetLocalVar "status_mjolnir_07" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_07"] == 1)
        Talk2me "Sitting man#mjolnir_07" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_07" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_07"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_07" "try_to_start"
	    wait
        if (lv["status_mjolnir_07"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mjolnir_07" "Sunbathing girl#mjolnir_07" 4_F_PATIENT 276 239 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mjolnir_07"
	strlocalvar 1 "status_mjolnir_07"
	SetLocalVar "status_mjolnir_07" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_07"] == 1)
        Talk2me "Sunbathing girl#mjolnir_07" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_07" 0
    stoptimer
return
OnClick:
    if (lv["status_mjolnir_07"] == 0)
        cmdothernpc "Bonfire#mjolnir_07" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mjolnir_07" "Sitting woman#mjolnir_07" 4_TOWER_07 280 238 3 0 0
OnInit:
	disablenpc "Sitting woman#mjolnir_07"
	strlocalvar 1 "status_mjolnir_07"
	SetLocalVar "status_mjolnir_07" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_07"] == 1)
        Talk2me "Sitting woman#mjolnir_07" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_07" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_07"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_07" "try_to_start"
	    wait
        if (lv["status_mjolnir_07"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mjolnir_07" "Wanderer#mjolnir_07" 4_F_05 278 236 1 0 0
OnInit:
	disablenpc "Wanderer#mjolnir_07"
	strlocalvar 1 "status_mjolnir_07"
	SetLocalVar "status_mjolnir_07" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_07" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_07"] == 1)
        Talk2me "Wanderer#mjolnir_07" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_07" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_07"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_07" "try_to_start"
	    wait
        if (lv["status_mjolnir_07"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mjolnir_07" "#plate1_mjolnir_07" GLASS_PLATE 277 239 5 0 0
OnInit:
	disablenpc "#plate1_mjolnir_07"
return

npc "mjolnir_07" "#plate2_mjolnir_07" GLASS_PLATE 274 236 5 0 0
OnInit:
	disablenpc "#plate2_mjolnir_07"
return

npc "mjolnir_07" "#plate3_mjolnir_07" GLASS_PLATE 280 237 5 0 0
OnInit:
	disablenpc "#plate3_mjolnir_07"
return

npc "mjolnir_07" "#basket_mjolnir_07" 4_ROPEPILE 274 233 5 0 0
OnInit:
	disablenpc "#basket_mjolnir_07"
return

// mjolnir_08 ============[OFF]==============
npc "mjolnir_08" "Extinct Bonfire#mjolnir_08" 4_TRACE 205 255 5 0 0
return

// mjolnir_08 ============[ON]==============
npc "mjolnir_08" "Bonfire#mjolnir_08" 4_BONFIRE 205 255 5 0 0
OnInit:
	disablenpc "Bonfire#mjolnir_08"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mjolnir_08" "start"
        cmdothernpc "Sitting woman#mjolnir_08" "start"
        cmdothernpc "Wanderer#mjolnir_08" "start"
        cmdothernpc "Sunbathing girl#mjolnir_08" "start"
    endif
return

npc "mjolnir_08" "Sitting man#mjolnir_08" 4_TOWER_02 202 255 6 0 0
OnInit:
	disablenpc "Sitting man#mjolnir_08"
	strlocalvar 1 "status_mjolnir_08"
	SetLocalVar "status_mjolnir_08" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_08"] == 1)
        Talk2me "Sitting man#mjolnir_08" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_08" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_08"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_08" "try_to_start"
	    wait
        if (lv["status_mjolnir_08"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mjolnir_08" "Sunbathing girl#mjolnir_08" 4_F_PATIENT 204 257 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mjolnir_08"
	strlocalvar 1 "status_mjolnir_08"
	SetLocalVar "status_mjolnir_08" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_08"] == 1)
        Talk2me "Sunbathing girl#mjolnir_08" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_08" 0
    stoptimer
return
OnClick:
    if (lv["status_mjolnir_08"] == 0)
        cmdothernpc "Bonfire#mjolnir_08" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mjolnir_08" "Sitting woman#mjolnir_08" 4_TOWER_07 208 256 3 0 0
OnInit:
	disablenpc "Sitting woman#mjolnir_08"
	strlocalvar 1 "status_mjolnir_08"
	SetLocalVar "status_mjolnir_08" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_08"] == 1)
        Talk2me "Sitting woman#mjolnir_08" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_08" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_08"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_08" "try_to_start"
	    wait
        if (lv["status_mjolnir_08"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mjolnir_08" "Wanderer#mjolnir_08" 4_F_05 206 254 1 0 0
OnInit:
	disablenpc "Wanderer#mjolnir_08"
	strlocalvar 1 "status_mjolnir_08"
	SetLocalVar "status_mjolnir_08" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_08" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_08"] == 1)
        Talk2me "Wanderer#mjolnir_08" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_08" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_08"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_08" "try_to_start"
	    wait
        if (lv["status_mjolnir_08"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mjolnir_08" "#plate1_mjolnir_08" GLASS_PLATE 205 257 5 0 0
OnInit:
	disablenpc "#plate1_mjolnir_08"
return

npc "mjolnir_08" "#plate2_mjolnir_08" GLASS_PLATE 202 254 5 0 0
OnInit:
	disablenpc "#plate2_mjolnir_08"
return

npc "mjolnir_08" "#plate3_mjolnir_08" GLASS_PLATE 208 255 5 0 0
OnInit:
	disablenpc "#plate3_mjolnir_08"
return

npc "mjolnir_08" "#basket_mjolnir_08" 4_ROPEPILE 202 251 5 0 0
OnInit:
	disablenpc "#basket_mjolnir_08"
return

// mjolnir_09 ============[OFF]==============
npc "mjolnir_09" "Extinct Bonfire#mjolnir_09" 4_TRACE 225 101 5 0 0
return

// mjolnir_09 ============[ON]==============
npc "mjolnir_09" "Bonfire#mjolnir_09" 4_BONFIRE 225 101 5 0 0
OnInit:
	disablenpc "Bonfire#mjolnir_09"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mjolnir_09" "start"
        cmdothernpc "Sitting woman#mjolnir_09" "start"
        cmdothernpc "Wanderer#mjolnir_09" "start"
        cmdothernpc "Sunbathing girl#mjolnir_09" "start"
    endif
return

npc "mjolnir_09" "Sitting man#mjolnir_09" 4_TOWER_02 222 101 6 0 0
OnInit:
	disablenpc "Sitting man#mjolnir_09"
	strlocalvar 1 "status_mjolnir_09"
	SetLocalVar "status_mjolnir_09" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_09"] == 1)
        Talk2me "Sitting man#mjolnir_09" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_09" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_09"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_09" "try_to_start"
	    wait
        if (lv["status_mjolnir_09"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mjolnir_09" "Sunbathing girl#mjolnir_09" 4_F_PATIENT 224 103 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mjolnir_09"
	strlocalvar 1 "status_mjolnir_09"
	SetLocalVar "status_mjolnir_09" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_09"] == 1)
        Talk2me "Sunbathing girl#mjolnir_09" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_09" 0
    stoptimer
return
OnClick:
    if (lv["status_mjolnir_09"] == 0)
        cmdothernpc "Bonfire#mjolnir_09" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mjolnir_09" "Sitting woman#mjolnir_09" 4_TOWER_07 228 102 3 0 0
OnInit:
	disablenpc "Sitting woman#mjolnir_09"
	strlocalvar 1 "status_mjolnir_09"
	SetLocalVar "status_mjolnir_09" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_09"] == 1)
        Talk2me "Sitting woman#mjolnir_09" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_09" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_09"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_09" "try_to_start"
	    wait
        if (lv["status_mjolnir_09"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mjolnir_09" "Wanderer#mjolnir_09" 4_F_05 226 100 1 0 0
OnInit:
	disablenpc "Wanderer#mjolnir_09"
	strlocalvar 1 "status_mjolnir_09"
	SetLocalVar "status_mjolnir_09" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_09" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_09"] == 1)
        Talk2me "Wanderer#mjolnir_09" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_09" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_09"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_09" "try_to_start"
	    wait
        if (lv["status_mjolnir_09"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mjolnir_09" "#plate1_mjolnir_09" GLASS_PLATE 225 103 5 0 0
OnInit:
	disablenpc "#plate1_mjolnir_09"
return

npc "mjolnir_09" "#plate2_mjolnir_09" GLASS_PLATE 222 100 5 0 0
OnInit:
	disablenpc "#plate2_mjolnir_09"
return

npc "mjolnir_09" "#plate3_mjolnir_09" GLASS_PLATE 228 101 5 0 0
OnInit:
	disablenpc "#plate3_mjolnir_09"
return

npc "mjolnir_09" "#basket_mjolnir_09" 4_ROPEPILE 222 97 5 0 0
OnInit:
	disablenpc "#basket_mjolnir_09"
return

// mjolnir_10 ============[OFF]==============
npc "mjolnir_10" "Extinct Bonfire#mjolnir_10" 4_TRACE 310 282 5 0 0
return

// mjolnir_10 ============[ON]==============
npc "mjolnir_10" "Bonfire#mjolnir_10" 4_BONFIRE 310 282 5 0 0
OnInit:
	disablenpc "Bonfire#mjolnir_10"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mjolnir_10" "start"
        cmdothernpc "Sitting woman#mjolnir_10" "start"
        cmdothernpc "Wanderer#mjolnir_10" "start"
        cmdothernpc "Sunbathing girl#mjolnir_10" "start"
    endif
return

npc "mjolnir_10" "Sitting man#mjolnir_10" 4_TOWER_02 307 282 6 0 0
OnInit:
	disablenpc "Sitting man#mjolnir_10"
	strlocalvar 1 "status_mjolnir_10"
	SetLocalVar "status_mjolnir_10" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_10"] == 1)
        Talk2me "Sitting man#mjolnir_10" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_10" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_10"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_10" "try_to_start"
	    wait
        if (lv["status_mjolnir_10"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mjolnir_10" "Sunbathing girl#mjolnir_10" 4_F_PATIENT 309 284 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mjolnir_10"
	strlocalvar 1 "status_mjolnir_10"
	SetLocalVar "status_mjolnir_10" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_10"] == 1)
        Talk2me "Sunbathing girl#mjolnir_10" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_10" 0
    stoptimer
return
OnClick:
    if (lv["status_mjolnir_10"] == 0)
        cmdothernpc "Bonfire#mjolnir_10" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mjolnir_10" "Sitting woman#mjolnir_10" 4_TOWER_07 313 283 3 0 0
OnInit:
	disablenpc "Sitting woman#mjolnir_10"
	strlocalvar 1 "status_mjolnir_10"
	SetLocalVar "status_mjolnir_10" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_10"] == 1)
        Talk2me "Sitting woman#mjolnir_10" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_10" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_10"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_10" "try_to_start"
	    wait
        if (lv["status_mjolnir_10"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mjolnir_10" "Wanderer#mjolnir_10" 4_F_05 311 281 1 0 0
OnInit:
	disablenpc "Wanderer#mjolnir_10"
	strlocalvar 1 "status_mjolnir_10"
	SetLocalVar "status_mjolnir_10" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_10" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_10"] == 1)
        Talk2me "Wanderer#mjolnir_10" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_10" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_10"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_10" "try_to_start"
	    wait
        if (lv["status_mjolnir_10"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mjolnir_10" "#plate1_mjolnir_10" GLASS_PLATE 310 284 5 0 0
OnInit:
	disablenpc "#plate1_mjolnir_10"
return

npc "mjolnir_10" "#plate2_mjolnir_10" GLASS_PLATE 307 281 5 0 0
OnInit:
	disablenpc "#plate2_mjolnir_10"
return

npc "mjolnir_10" "#plate3_mjolnir_10" GLASS_PLATE 313 282 5 0 0
OnInit:
	disablenpc "#plate3_mjolnir_10"
return

npc "mjolnir_10" "#basket_mjolnir_10" 4_ROPEPILE 307 278 5 0 0
OnInit:
	disablenpc "#basket_mjolnir_10"
return

// mjolnir_11 ============[OFF]==============
npc "mjolnir_11" "Extinct Bonfire#mjolnir_11" 4_TRACE 163 202 5 0 0
return

// mjolnir_11 ============[ON]==============
npc "mjolnir_11" "Bonfire#mjolnir_11" 4_BONFIRE 163 202 5 0 0
OnInit:
	disablenpc "Bonfire#mjolnir_11"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mjolnir_11" "start"
        cmdothernpc "Sitting woman#mjolnir_11" "start"
        cmdothernpc "Wanderer#mjolnir_11" "start"
        cmdothernpc "Sunbathing girl#mjolnir_11" "start"
    endif
return

npc "mjolnir_11" "Sitting man#mjolnir_11" 4_TOWER_02 160 202 6 0 0
OnInit:
	disablenpc "Sitting man#mjolnir_11"
	strlocalvar 1 "status_mjolnir_11"
	SetLocalVar "status_mjolnir_11" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_11"] == 1)
        Talk2me "Sitting man#mjolnir_11" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_11" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_11"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_11" "try_to_start"
	    wait
        if (lv["status_mjolnir_11"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mjolnir_11" "Sunbathing girl#mjolnir_11" 4_F_PATIENT 162 204 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mjolnir_11"
	strlocalvar 1 "status_mjolnir_11"
	SetLocalVar "status_mjolnir_11" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_11"] == 1)
        Talk2me "Sunbathing girl#mjolnir_11" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_11" 0
    stoptimer
return
OnClick:
    if (lv["status_mjolnir_11"] == 0)
        cmdothernpc "Bonfire#mjolnir_11" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mjolnir_11" "Sitting woman#mjolnir_11" 4_TOWER_07 166 203 3 0 0
OnInit:
	disablenpc "Sitting woman#mjolnir_11"
	strlocalvar 1 "status_mjolnir_11"
	SetLocalVar "status_mjolnir_11" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_11"] == 1)
        Talk2me "Sitting woman#mjolnir_11" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_11" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_11"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_11" "try_to_start"
	    wait
        if (lv["status_mjolnir_11"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mjolnir_11" "Wanderer#mjolnir_11" 4_F_05 164 201 1 0 0
OnInit:
	disablenpc "Wanderer#mjolnir_11"
	strlocalvar 1 "status_mjolnir_11"
	SetLocalVar "status_mjolnir_11" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_11" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_11"] == 1)
        Talk2me "Wanderer#mjolnir_11" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_11" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_11"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_11" "try_to_start"
	    wait
        if (lv["status_mjolnir_11"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mjolnir_11" "#plate1_mjolnir_11" GLASS_PLATE 163 204 5 0 0
OnInit:
	disablenpc "#plate1_mjolnir_11"
return

npc "mjolnir_11" "#plate2_mjolnir_11" GLASS_PLATE 160 201 5 0 0
OnInit:
	disablenpc "#plate2_mjolnir_11"
return

npc "mjolnir_11" "#plate3_mjolnir_11" GLASS_PLATE 166 202 5 0 0
OnInit:
	disablenpc "#plate3_mjolnir_11"
return

npc "mjolnir_11" "#basket_mjolnir_11" 4_ROPEPILE 160 198 5 0 0
OnInit:
	disablenpc "#basket_mjolnir_11"
return

// mjolnir_12 ============[OFF]==============
npc "mjolnir_12" "Extinct Bonfire#mjolnir_12" 4_TRACE 201 346 5 0 0
return

// mjolnir_12 ============[ON]==============
npc "mjolnir_12" "Bonfire#mjolnir_12" 4_BONFIRE 201 346 5 0 0
OnInit:
	disablenpc "Bonfire#mjolnir_12"
return
OnCommand: "try_to_start"
    var player_count = GetNeighborPcNumber 10
    if (player_count > 2)
        cmdothernpc "Sitting man#mjolnir_12" "start"
        cmdothernpc "Sitting woman#mjolnir_12" "start"
        cmdothernpc "Wanderer#mjolnir_12" "start"
        cmdothernpc "Sunbathing girl#mjolnir_12" "start"
    endif
return

npc "mjolnir_12" "Sitting man#mjolnir_12" 4_TOWER_02 198 346 6 0 0
OnInit:
	disablenpc "Sitting man#mjolnir_12"
	strlocalvar 1 "status_mjolnir_12"
	SetLocalVar "status_mjolnir_12" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_12" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_12"] == 1)
        Talk2me "Sitting man#mjolnir_12" "Sitting Man : I'm glad that we've met."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_12" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_12"] == 0)
        dialog "[Sitting man]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_12" "try_to_start"
	    wait
        if (lv["status_mjolnir_12"] == 0)
            dialog "[Sitting man]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    var picnic_count = GetGlobalVar "picnic_count"
    var max_sandwich = 120
    if (v[jp_event58] < picnic_count)
        dialog "[Sitting man]"
	    dialog "You have to be hungry. "
	    dialog "We've just cooked my "
	    dialog "signature dish. I think you "
	    dialog "should taste it. Here it is."
	    getitem Meat 5 // instead of Luxurious_Dinner_E
	    setitem jp_event58 picnic_count
	    if (v[jp_event59] > 1000)
		setitem jp_event59 1000
	    endif
	    wait
	endif
    if (v[jp_event59] >= 1000)
	    dialog "[Sitting man]"
	    dialog "Eh..."
	    dialog "It's always nice to relax with"
	    dialog "friends. So and this is a pleasure"
	    dialog "to cook something together. "
	    wait
	    dialog "[Sitting man]"
	    dialog "Don't you want to cook a roast?"
	    wait
	    choose menu "Yes " "No "
	    case 2
		dialog "[Sitting man]"
		dialog "Got it. "
		dialog "What a warm summer days..."
		dialog "I think we can get together "
		dialog "next time."
		close
		return
	    break
	    endchoose
	    dialog "[Sitting man]"
	    dialog "How many roasts do you want to cook? "
	    wait
	    dlgwrite 1 65000
	    var exchange_input = input
	    var can_exchange = 1000 + max_sandwich - v[jp_event59]
	    if input == 0
		dialog "[Sitting man]"
		dialog "Come if you want "
		dialog "to cook something together. "
		close
		return
	    elseif error
		dialog "[Sitting man]"
		dialog "Are you trying to "
		dialog "cheat? "
		close
		return
	    endif
	    if (exchange_input > can_exchange)
		exchange_input = can_exchange
		dialog "[Sitting man]"
		dialog "This is too much for "
		dialog "such a bonfire."
		dialog "I think, we can cook "
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    else
		dialog "[Sitting man]"
		dialog ""+exchange_input+" portions. Is it enough?"
		wait
	    endif
	    choose menu "Cook " "Cancel "
		case 1
		    if ((v[Apple] >= exchange_input) & (v[Orange] >= exchange_input) & (v[Carrot] >= exchange_input))
			var item_check = GetInventoryRemainCount Candy exchange_input 
			if item_check == 1
			    dropitem Apple exchange_input // instead of Sweet_Rice_Cake
			    dropitem Orange exchange_input // instead of Minced_Meat
			    dropitem Carrot exchange_input // instead of Shepherd_Salad
			    getitem Candy exchange_input // instead of Roasted_Beef
			    getitem jp_event59 exchange_input
			    dialog "[Sitting man]"
			    dialog "Come if you want to cook something..."
			    close
			    return
			else
			    dialog "[Sitting man]"
			    dialog "Your inventory is full. "
			    dialog "Free some space and come back."
			    close
			    return
			endif
		    else
			dialog "[Sitting man]"
			dialog "You have not enough ingredients "
			dialog "for "+exchange_input+" portions."
			dialog "Come back, when "
			dialog "you collect more."
			close
			return
		    endif
		break
		case 2
		    dialog "[Sitting man]"
		    dialog "Well... come back if you "
		    dialog "want to cook something."
		    close
		    return
		break
	    endchoose
	elseif (v[jp_event59] < 1000)
	    dialog "[Sitting man]"
	    dialog "It's so warm, isn't it? "
	    dialog "I think, you should ask "
	    dialog "here for a hat or a panama."
	    close
	    return
	else
	    dialog "[Sitting man]"
	    dialog "It's always nice to relax with"
	    dialog "friends."
	    close
	    return
	endif
return

npc "mjolnir_12" "Sunbathing girl#mjolnir_12" 4_F_PATIENT 200 348 5 0 0
OnInit:
	disablenpc "Sunbathing girl#mjolnir_12"
	strlocalvar 1 "status_mjolnir_12"
	SetLocalVar "status_mjolnir_12" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_12" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_12"] == 1)
        Talk2me "Sunbathing girl#mjolnir_12" "Sunbathing girl : Give me some salad, please!"
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_12" 0
    stoptimer
return
OnClick:
    if (lv["status_mjolnir_12"] == 0)
        cmdothernpc "Bonfire#mjolnir_12" "try_to_start"
    endif
	dialog "[Sunbathing girl]"
	dialog "..."
	close
return

npc "mjolnir_12" "Sitting woman#mjolnir_12" 4_TOWER_07 204 347 3 0 0
OnInit:
	disablenpc "Sitting woman#mjolnir_12"
	strlocalvar 1 "status_mjolnir_12"
	SetLocalVar "status_mjolnir_12" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_12" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_12"] == 1)
        Talk2me "Sitting woman#mjolnir_12" "Sitting woman : After all, how nice it is to get together."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_12" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_12"] == 0)
        dialog "[Sitting woman]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_12" "try_to_start"
	    wait
        if (lv["status_mjolnir_12"] == 0)
            dialog "[Sitting woman]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
	if (v[jp_event59] < 1000)
	    dialog "[Sitting woman]"
	    dialog "Hello, friend!"
	    dialog "Don't you want to join our picnic?"
	    dialog "I think you're tired of becoming "
	    dialog "under such a scorching sun. "
	    wait
	    dialog "[Sitting woman]"
	    dialog "Oh, here is a panama for you."
	    dialog "It was spare."
	    getitem C_Valkyrie_Wing 1 // instead of C_Brabery_Hat
	    setitem jp_event59 1000
	    close
	    return
	else
	    dialog "[Sitting woman]"
	    dialog "Mm... the best lunch "
	    dialog "is the one that is cooked with friends."
	    dialog "You should try it too, "
	    dialog "ask about it."
	    close
	    return
	endif
return

npc "mjolnir_12" "Wanderer#mjolnir_12" 4_F_05 202 345 1 0 0
OnInit:
	disablenpc "Wanderer#mjolnir_12"
	strlocalvar 1 "status_mjolnir_12"
	SetLocalVar "status_mjolnir_12" 0
return
OnCommand: "start"
	SetLocalVar "status_mjolnir_12" 1
    InitTimer
return
OnTouch2:
	if (lv["status_mjolnir_12"] == 1)
        Talk2me "Wanderer#mjolnir_12" "Wanderer : Slice the salads. I'm on the grill."
    endif
return
OnTimer: 300000
	SetLocalVar "status_mjolnir_12" 0
    stoptimer
return
OnClick:
	if (lv["status_mjolnir_12"] == 0)
        dialog "[Wanderer]"
        dialog "To begin a picnic, you "
        dialog "need at least 3 people to come."
        dialog "Can you imagine any party "
        dialog "without people?"
        cmdothernpc "Bonfire#mjolnir_12" "try_to_start"
	    wait
        if (lv["status_mjolnir_12"] == 0)
            dialog "[Wanderer]"
            dialog "Come with your friends."
		close
		return
        endif
    endif
    dialog "[Wanderer]"
	dialog "It is always nice to get "
	dialog "together and relax with friends."
	close
	return
return

npc "mjolnir_12" "#plate1_mjolnir_12" GLASS_PLATE 201 348 5 0 0
OnInit:
	disablenpc "#plate1_mjolnir_12"
return

npc "mjolnir_12" "#plate2_mjolnir_12" GLASS_PLATE 198 345 5 0 0
OnInit:
	disablenpc "#plate2_mjolnir_12"
return

npc "mjolnir_12" "#plate3_mjolnir_12" GLASS_PLATE 204 346 5 0 0
OnInit:
	disablenpc "#plate3_mjolnir_12"
return

npc "mjolnir_12" "#basket_mjolnir_12" 4_ROPEPILE 198 342 5 0 0
OnInit:
	disablenpc "#basket_mjolnir_12"
return

