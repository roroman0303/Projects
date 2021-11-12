//---------------------------------
// 워프 스크립트: manuk_link
// 만든날짜: 2008-11-17 
// 만든사람: dorocci
// build   : 10


//--------------- 중요 건물 ----------------

warp "manuk" "MKtoC01_C01toMK" 311 142 1 1
OnTouch:
       moveto "man_in01" 277 41
       return

warp "man_in01" "C01toMK_MKtoC01" 275 41 1 1
OnTouch:
       moveto "manuk" 309 142
       return

warp "manuk" "MKtoC02_C02toMK" 310 201 1 1
OnTouch:
       moveto "man_in01" 358 121
       return

warp "man_in01" "C02toMK_MKtoC02" 358 119 1 1
OnTouch:
       moveto "manuk" 310 199
       return

warp "manuk" "MKtoC03_C03toMK" 255 110 1 1
OnTouch:
       moveto "man_in01" 7 61
       return

warp "man_in01" "C03toMK_MKtoC03" 5 61 1 1
OnTouch:
       moveto "manuk" 253 110
       return

warp "man_in01" "C01_1toC01_2_C01_2toC01_1" 318 17 1 1
OnTouch:
       moveto "man_in01" 388 16
       return

warp "man_in01" "C01_2toC01_1_C01_1toC01_2" 390 16 1 1
OnTouch:
       moveto "man_in01" 316 17
       return

warp "man_in01" "C02_1toC02_2_C02_2toC02_1" 328 141 1 1
OnTouch:
       moveto "man_in01" 324 220
       return

warp "man_in01" "C02_2toC02_1_C02_1toC02_2" 324 222 1 1
OnTouch:
       moveto "man_in01" 328 139
       return

warp "man_in01" "C03_1toC03_2_C03_2toC03_1" 11 19 1 1
OnTouch:
       moveto "man_in01" 182 32
       return

warp "man_in01" "C03_2toC03_1_C03_1toC03_2" 182 34 1 1
OnTouch:
       moveto "man_in01" 11 21
       return

//--------------- 창고 ----------------

warp "manuk" "MKtoC04_1_C04_1toMK" 257 228 1 1
OnTouch:
       moveto "man_in01" 130 267
       return

warp "man_in01" "C04_1toMK_MKtoC04_1" 130 265 1 1
OnTouch:
       moveto "manuk" 258 226
       return

warp "manuk" "MKtoC04_2_C04_2toMK" 265 237 1 1
OnTouch:
       moveto "man_in01" 180 267
       return

warp "man_in01" "C04_2toMK_MKtoC04_2" 180 265 1 1
OnTouch:
       moveto "manuk" 267 235
       return

warp "manuk" "MKtoC04_3_C04_3toMK" 276 247 1 1
OnTouch:
       moveto "man_in01" 230 267
       return

warp "man_in01" "C04_3toMK_MKtoC04_3" 230 265 1 1
OnTouch:
       moveto "manuk" 276 245
       return

warp "manuk" "MKtoC04_4_C04_4toMK" 288 249 1 1
OnTouch:
       moveto "man_in01" 280 267
       return

warp "man_in01" "C04_4toMK_MKtoC04_4" 280 265 1 1
OnTouch:
       moveto "manuk" 289 247
       return

warp "manuk" "MKtoC04_5_C04_5toMK" 302 243 1 1
OnTouch:
       moveto "man_in01" 330 267
       return

warp "man_in01" "C04_5toMK_MKtoC04_5" 330 265 1 1
OnTouch:
       moveto "manuk" 300 241
       return


warp "manuk" "MKtoC04_6_C04_6toMK" 311 234 1 1
OnTouch:
       moveto "man_in01" 380 267
       return

warp "man_in01" "C04_6toMK_MKtoC04_6" 380 265 1 1
OnTouch:
       moveto "manuk" 309 232
       return

//--------------- 민가 ----------------

warp "manuk" "MKtoH01_H01toMK" 253 195 1 1
OnTouch:
       moveto "man_in01" 24 284
       return

warp "man_in01" "H01toMK_MKtoH01" 26 284 1 1
OnTouch:
       moveto "manuk" 255 195
       return

warp "manuk" "MKtoH02_H02toMK" 235 124 1 1
OnTouch:
       moveto "man_in01" 70 171
       return

warp "man_in01" "H02toMK_MKtoH02" 70 169 1 1
OnTouch:
       moveto "manuk" 235 122
       return

warp "manuk" "MKtoH03_H03toMK" 279 115 1 1
OnTouch:
       moveto "man_in01" 123 224
       return

warp "man_in01" "H03toMK_MKtoH03" 123 226 1 1
OnTouch:
       moveto "manuk" 278 117
       return

warp "man_in01" "H01_1toH01_2_H01_2toH01_1" 5 275 1 1
OnTouch:
       moveto "man_in01" 7 221
       return

warp "man_in01" "H01_2toH01_1_H01_1toH01_2" 7 219 1 1
OnTouch:
       moveto "man_in01" 7 276
       return

warp "man_in01" "H01_1toH01_3_H01_3toH01_1" 22 275 1 1
OnTouch:
       moveto "man_in01" 76 279
       return

warp "man_in01" "H01_3toH01_1_H01_1toH01_3" 74 279 1 1
OnTouch:
       moveto "man_in01" 20 275
       return

warp "man_in01" "H02_1toH01_2_H02_2toH01_1" 61 190 1 1
OnTouch:
       moveto "man_in01" 63 238
       return

warp "man_in01" "H02_2toH01_1_H02_1toH01_2" 61 238 1 1
OnTouch:
       moveto "man_in01" 61 188
       return

warp "man_in01" "H02_1toH01_3_H02_3toH01_1" 61 173 1 1
OnTouch:
       moveto "man_in01" 20 173
       return

warp "man_in01" "H02_3toH01_1_H02_1toH01_3" 20 175 1 1
OnTouch:
       moveto "man_in01" 61 175
       return





