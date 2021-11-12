//---------------------------------
// 50892_54532_ 49828_53356_47549_53944_: Jtunheimr
// 47564_46304_45216_51676_: 2008-05-21 50724_54980_ 1:44:00
// 47564_46304_49324_46988_: GORONUT1
// build   : 10

warp "man_fild03" "MF03toMF01_MF01toMF03" 84 369 1 1
OnTouch:
       moveto "man_fild01" 103 58
       return

warp "man_fild01" "MF01toMF03_MF03toMF01" 103 55 1 1
OnTouch:
       moveto "man_fild03" 84 366
       return

warp "spl_fild02" "SF02toMCup_MCtoSF02up" 383 216 1 1
OnTouch:
       moveto "mid_camp" 12 215
       return

//warp "mid_camp" "MCtoSF02up_SF02toMCup" 9 215 1 1
//OnTouch:
//       moveto "spl_fild02" 380 217
//       return

warp "spl_fild02" "SF02toMCdown_MCtoSF02down" 382 143 1 1
OnTouch:
       moveto "mid_camp" 16 143
       return

//warp "mid_camp" "MCtoSF02down_SF02toMCdown" 13 143 1 1
//OnTouch:
//       moveto "spl_fild02" 379 143
//       return

warp "spl_fild02" "SF02toSF03r_SF03toSF02r" 310 10 1 1
OnTouch:
       moveto "spl_fild03" 306 376
       return

warp "spl_fild03" "SF03toSF02r_SF02toSF03r" 306 379 1 1
OnTouch:
       moveto "spl_fild02" 311 12
       return

warp "spl_fild02" "SF02toSF03l_SF03toSF02l" 103 30 1 1
OnTouch:
       moveto "spl_fild03" 99 370
       return

warp "spl_fild03" "SF03toSF02l_SF02toSF03l" 99 373 1 1
OnTouch:
       moveto "spl_fild02" 102 32
       return

//warp "mid_camp" "MCtoMF01_MF01toMC" 344 178 1 1
//OnTouch:
//       moveto "man_fild01" 36 235
//       return

warp "man_fild01" "MF01toMC_MCtoMF01" 35 232 1 1
OnTouch:
       moveto "mid_camp" 341 176
       return

//------------20081114 episode13.2 by dorocci--------------
//------------50640_54588_49548_46300_ 13.2 54056_52824_47196_ 52628_44032_46108_ 50892_53356_47553_53356_51077_45768_45796_----



warp "splendide" "SPLtoSF02_SF02toSPL" 388 252 1 1
OnTouch:
	moveto "spl_fild02" 8 241
	return

warp "spl_fild02" "SF02toSPL_SPLtoSF02" 6 241 1 1
OnTouch:
	moveto "splendide" 386 251
	return

warp "spl_fild02" "SF02toSF01_SF01toSF02" 293 379 1 1
OnTouch:
	moveto "spl_fild01" 289 30
	return

warp "spl_fild01" "SF01toSF02_SF02toSF01" 289 28 1 1
OnTouch:
	moveto "spl_fild02" 292 377
	return

warp "man_fild01" "MF01toMF02_MF02toMF01" 372 230 1 1
OnTouch:
       moveto "man_fild02" 34 261
       return

warp "man_fild02" "MF02toMF01_MF01toMF02" 32 261 1 1
OnTouch:
       moveto "man_fild01" 369 230
       return

warp "man_fild02" "MF02tomk_mktoMF02" 139 41 1 1
OnTouch:
       moveto "manuk" 112 356
       return

warp "manuk" "mktoMF02_MF02tomk" 114 357 1 1
OnTouch:
       moveto "man_fild02" 138 43
       return




