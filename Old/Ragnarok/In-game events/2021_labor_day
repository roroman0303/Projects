// Coffee instead of Coffee
// Gray_Hollow_RU instead of Gray_Hollow
// Gold_Hammer instead of Gold_Hammer

npc "prontera" "Последователь Вёлунда " 1_M_SMITH 123 123 5 0 0 //
OnClick:
	var potion_cost = 2
	dialog "[Последователь Вёлунда]"
	dialog "Привет. Ой, выглядишь уставшим, "
	dialog "как будто ты весь день трудился. "
	dialog "Может тебе стоит прилечь? Работа "
	dialog "это, конечно, хорошо, но нельзя "
	dialog "забывать и об отдыхе! "
	wait
	if (v[jp_event50] == 0)
		choose menu "Расскажи мне о кристаллах " "Расскажи мне о боге-кузнеце " "Чем это так вкусно пахнет? "
			case 1
				dialog "[Последователь Вёлунда]"
				dialog "Когда-то давно, бог-покровитель "
				dialog "кузнецов Вёлунд создавал "
				dialog "настоящие произведения искусства "
				dialog "из различных самоцветов. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Сейчас же происходит уникальное "
				dialog "явление - по слухам, из недр "
				dialog "земли появились светящиеся "
				dialog "кристаллы невиданной красоты. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Если это небесные кристаллы, с "
				dialog "которыми, по легенде, некогда "
				dialog "работал Вёлунд, то мы можем "
				dialog "попробовать воссоздать его "
				dialog "необычайные изделия! "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Однако я не могу полагаться на "
				dialog "слухи. Разузнай больше об этих "
				dialog "кристаллах, и если это окажутся "
				dialog "не слухи, я смогу изготовить "
				dialog "изделие, достойное мастера "
				dialog "Вёлунда. "
				wait
				choose menu "Согласиться " "У меня много дел... "
					case 1
						dialog "[Последователь Вёлунда]"
						dialog "Я думаю ты легко сможешь узнать, "
						dialog "что происходит в мире, поговорив "
						dialog "с путниками, остановившихся в "
						dialog "городах. Они обычно стоят у ворот."
						wait
						dialog "[Последователь Вёлунда]"
						dialog "И поторопись, мне уже не терпится "
						dialog "увидеть кристаллы своими "
						dialog "глазами... "
						setitem jp_event50 1
						setquest 17300
						close
						return
					break
					case 2
						dialog "[Последователь Вёлунда]"
						dialog "Ладно, но если ты передумаешь, "
						dialog "приходи обратно. Я бы очень хотел "
						dialog "верить, что небесные кристаллы "
						dialog "показали себя. "
						close
						return
					break
				endchoose
			break
			case 2
				dialog "[Последователь Вёлунда]"
				dialog "О, ты хочешь узнать о Вёлунде? "
				dialog "Тогда слушай внимательно. Вёлунд -"
				dialog "это бог-покровитель кузнецов. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Он не только ремесленник, но "
				dialog "мастер, художник, хорошо "
				dialog "понимающий красоту всех вещей. "
				dialog "Вёлунд работал с прекраснейшими "
				dialog "самоцветами, добытыми из земли."
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Он олицетворяет землю - одну из "
				dialog "главных стихий. Он "
				dialog "преобразовывает, улучшает "
				dialog "добытое, создавая прекрасные "
				dialog "творения с помощью огня – другой "
				dialog "сильной стихии. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Таким образом мастер способен "
				dialog "наделить предметы определенными "
				dialog "свойствами или силой. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Судьба Вёлунда - это величайший "
				dialog "пример целеустремлённости и "
				dialog "трудолюбия. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Однажды, когда Вёлунд еще ступал "
				dialog "по земле, злой король похитил его "
				dialog "и заточил у себя на острове, "
				dialog "чтобы мастер творил только для "
				dialog "него. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Не желая принимать такую участь, "
				dialog "Вёлунд изготовил себе крылья и "
				dialog "улетел в Вальгаллу. "
				close
				return
			break
			case 3
				dialog "[Последователь Вёлунда]"
				dialog "Приятно пахнет, правда? Это "
				dialog "свежесваренный кофе, я делаю его "
				dialog "сам. Эх, только он мне помогает "
				dialog "снять усталось после трудного дня."
				wait
				if (v[jp_event51] == 0)
					choose menu "Можно попробовать? "
						case 1
							var item_check = GetInventoryRemainCount Coffee 1 // Coffee instead of Coffee
							if (item_check == 1)
								dialog "[Последователь Вёлунда]"
								dialog "Конечно, держи."
								getitem Coffee 1 // Coffee instead of Coffee
								setitem jp_event51 1										
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Последователь Вёлунда]"
								dialog "У тебя переполнен инвентарь, "
								dialog "освободи его и возвращайся. "
								close
								return
							endif
						break
					endchoose
				elseif (v[jp_event50] >= 8)
					dialog "[Последователь Вёлунда]"
					dialog "Я вижу тебе понравился мой кофе, "
					dialog "хочешь еще? "
					wait
					choose menu "Хочу еще! " "Уйти "
						case 1
							dialog "[Последователь Вёлунда]"
							dialog "Могу предложить тебе кофе за пару "
							dialog "экземпляров небесного кристалла.  "
							wait
							dialog "Сколько кофе ты хочешь получить? "
							wait
							dlgwrite 1 65000
							var exchange_input = input
							var cost = exchange_input * 2
							if input == 0
								dialog "[Последователь Вёлунда]"
								dialog "Если ты не хочешь обменять, зачем "
								dialog "спрашиваешь?  "
								close
								return
							elseif error
								dialog "[Последователь Вёлунда]"
								dialog "Зачем же ты меня пытаешься "
								dialog "обмануть?  "
								close
								return	
							endif
							dialog ""+exchange_input+" кофе за "+cost+" кристаллов. Всё верно?"
							wait
							choose menu "Подтвердить " "Отмена "
								case 1
									if v[Gray_Hollow_RU] >= cost // Gray_Hollow_RU instead of Gray_Hollow
										var item_check = GetInventoryRemainCount Coffee exchange_input // Coffee instead of Coffee
										if item_check == 1
											dropitem Gray_Hollow_RU cost // Gray_Hollow_RU instead of Gray_Hollow
											getitem Coffee exchange_input // Coffee instead of Coffee
											dialog "[Последователь Вёлунда]"
											dialog "Приходи, если захочешь еще."
											close
											return
										else
											dialog "[Последователь Вёлунда]"
											dialog "У тебя переполнен инвентарь, "
											dialog "освободи его и возвращайся. "
											close
											return
										endif
									else
										dialog "[Последователь Вёлунда]"
										dialog "У тебя недостаточно кристаллов "
										dialog "для "+exchange_input+" чашек кофе."
										dialog "Приходи, когда у тебя "
										dialog "появится больше кристаллов."
										close
										return									
									endif
								break
								case 2
									dialog "[Последователь Вёлунда]"
									dialog "Ладно. Приходи, когда надумаешь "
									dialog "обменять. "
									close
									return
								break
							endchoose
						break
						case 2
						break
					endchoose
				elseif (v[Gray_Hollow_RU] > 0) // Gray_Hollow_RU instead of Gray_Hollow
					dialog "[Последователь Вёлунда]"
					dialog "Свой кофе я не продаю, однако... "
					dialog "Я мог бы обменять его на "
					dialog "что-нибудь уникальное. Например, "
					dialog "что это у тебя там за кристаллы? "
					wait
					dialog "Поразительно! Эх, если бы я мог "
					dialog "изготовить из них что-нибудь, они "
					dialog "бы мне точно пригодились. "
					close
					return
				else
					dialog "[Последователь Вёлунда]"
					dialog "Свой кофе я не продаю, однако... "
					dialog "Я мог бы обменять его на "
					dialog "что-нибудь уникальное.  "
					close
					return
				endif
			break
		endchoose
	elseif (v[jp_event50] == 2)
		choose menu "Я узнал больше о кристаллах " "Расскажи мне о боге-кузнеце " "Чем это так вкусно пахнет? "
			case 1
				dialog "[Последователь Вёлунда]"
				dialog "Поверить не могу! Это правда "
				dialog "небесные кристаллы! Немедленно "
				dialog "отправляйся и принеси мне 20 "
				dialog "экземпляров. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Кроме того, помимо окрестностей "
				dialog "городов, советую тебе обратить "
				dialog "внимание на горную гряду "
				dialog "Мьёлльнир. Кажется, именно там, "
				dialog "по легенде, сам бог Вёлунд их "
				dialog "находил. "
				setitem jp_event50 3
				changequest 17301 17302
				close
				return
			break
			case 2
				dialog "[Последователь Вёлунда]"
				dialog "О, ты хочешь узнать о Вёлунде? "
				dialog "Тогда слушай внимательно. Вёлунд -"
				dialog "это бог-покровитель кузнецов. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Он не только ремесленник, но "
				dialog "мастер, художник, хорошо "
				dialog "понимающий красоту всех вещей. "
				dialog "Вёлунд работал с прекраснейшими "
				dialog "самоцветами, добытыми из земли."
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Он олицетворяет землю - одну из "
				dialog "главных стихий. Он "
				dialog "преобразовывает, улучшает "
				dialog "добытое, создавая прекрасные "
				dialog "творения с помощью огня – другой "
				dialog "сильной стихии. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Таким образом мастер способен "
				dialog "наделить предметы определенными "
				dialog "свойствами или силой. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Судьба Вёлунда - это величайший "
				dialog "пример целеустремлённости и "
				dialog "трудолюбия. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Однажды, когда Вёлунд еще ступал "
				dialog "по земле, злой король похитил его "
				dialog "и заточил у себя на острове, "
				dialog "чтобы мастер творил только для "
				dialog "него. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Не желая принимать такую участь, "
				dialog "Вёлунд изготовил себе крылья и "
				dialog "улетел в Вальгаллу. "
				close
				return
			break
			case 3
				dialog "[Последователь Вёлунда]"
				dialog "Приятно пахнет, правда? Это "
				dialog "свежесваренный кофе, я делаю его "
				dialog "сам. Эх, только он мне помогает "
				dialog "снять усталось после трудного дня."
				wait
				if (v[jp_event51] == 0)
					choose menu "Можно попробовать? "
						case 1
							var item_check = GetInventoryRemainCount Coffee 1 // Coffee instead of Coffee
							if (item_check == 1)
								dialog "[Последователь Вёлунда]"
								dialog "Конечно, держи."
								getitem Coffee 1 // Coffee instead of Coffee
								setitem jp_event51 1										
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Последователь Вёлунда]"
								dialog "У тебя переполнен инвентарь, "
								dialog "освободи его и возвращайся. "
								close
								return
							endif
						break
					endchoose
				elseif (v[jp_event50] >= 8)
					dialog "[Последователь Вёлунда]"
					dialog "Я вижу тебе понравился мой кофе, "
					dialog "хочешь еще? "
					wait
					choose menu "Хочу еще! " "Уйти "
						case 1
							dialog "[Последователь Вёлунда]"
							dialog "Могу предложить тебе кофе за пару "
							dialog "экземпляров небесного кристалла.  "
							wait
							dialog "Сколько кофе ты хочешь получить? "
							wait
							dlgwrite 1 65000
							var exchange_input = input
							var cost = exchange_input * 2
							if input == 0
								dialog "[Последователь Вёлунда]"
								dialog "Если ты не хочешь обменять, зачем "
								dialog "спрашиваешь?  "
								close
								return
							elseif error
								dialog "[Последователь Вёлунда]"
								dialog "Зачем же ты меня пытаешься "
								dialog "обмануть?  "
								close
								return	
							endif
							dialog ""+exchange_input+" кофе за "+cost+" кристаллов. Всё верно?"
							wait
							choose menu "Подтвердить " "Отмена "
								case 1
									if v[Gray_Hollow_RU] >= cost // Gray_Hollow_RU instead of Gray_Hollow
										var item_check = GetInventoryRemainCount Coffee exchange_input // Coffee instead of Coffee
										if item_check == 1
											dropitem Gray_Hollow_RU cost // Gray_Hollow_RU instead of Gray_Hollow
											getitem Coffee exchange_input // Coffee instead of Coffee
											dialog "[Последователь Вёлунда]"
											dialog "Приходи, если захочешь еще."
											close
											return
										else
											dialog "[Последователь Вёлунда]"
											dialog "У тебя переполнен инвентарь, "
											dialog "освободи его и возвращайся. "
											close
											return
										endif
									else
										dialog "[Последователь Вёлунда]"
										dialog "У тебя недостаточно кристаллов "
										dialog "для "+exchange_input+" чашек кофе."
										dialog "Приходи, когда у тебя "
										dialog "появится больше кристаллов."
										close
										return									
									endif
								break
								case 2
									dialog "[Последователь Вёлунда]"
									dialog "Ладно. Приходи, когда надумаешь "
									dialog "обменять. "
									close
									return
								break
							endchoose
						break
						case 2
						break
					endchoose
				elseif (v[Gray_Hollow_RU] > 0) // Gray_Hollow_RU instead of Gray_Hollow
					dialog "[Последователь Вёлунда]"
					dialog "Свой кофе я не продаю, однако... "
					dialog "Я мог бы обменять его на "
					dialog "что-нибудь уникальное. Например, "
					dialog "что это у тебя там за кристаллы? "
					wait
					dialog "Поразительно! Эх, если бы я мог "
					dialog "изготовить из них что-нибудь, они "
					dialog "бы мне точно пригодились. "
					close
					return
				else
					dialog "[Последователь Вёлунда]"
					dialog "Свой кофе я не продаю, однако... "
					dialog "Я мог бы обменять его на "
					dialog "что-нибудь уникальное.  "
					close
					return
				endif
			break
		endchoose
	elseif ((v[jp_event50] == 3) & (v[Gray_Hollow_RU] < 1))
		choose menu "Где искать кристаллы? " "Расскажи мне о боге-кузнеце " "Чем это так вкусно пахнет? "
			case 1
				dialog "[Последователь Вёлунда]"
				dialog "По твоим словам, путники их "
				dialog "видели на полях около городов, "
				dialog "они виднелись из под земляных "
				dialog "пригорков. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "По легенде же, такие кристаллы "
				dialog "чаще всего встречались на горной "
				dialog "гряде Мьёлльнир. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Принеси мне 20 экземпляров "
				dialog "небесных кристаллов и мы можем "
				dialog "попробовать создать что-то "
				dialog "необычайной красоты. "
				close
				return
			break
			case 2
				dialog "[Последователь Вёлунда]"
				dialog "О, ты хочешь узнать о Вёлунде? "
				dialog "Тогда слушай внимательно. Вёлунд -"
				dialog "это бог-покровитель кузнецов. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Он не только ремесленник, но "
				dialog "мастер, художник, хорошо "
				dialog "понимающий красоту всех вещей. "
				dialog "Вёлунд работал с прекраснейшими "
				dialog "самоцветами, добытыми из земли."
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Он олицетворяет землю - одну из "
				dialog "главных стихий. Он "
				dialog "преобразовывает, улучшает "
				dialog "добытое, создавая прекрасные "
				dialog "творения с помощью огня – другой "
				dialog "сильной стихии. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Таким образом мастер способен "
				dialog "наделить предметы определенными "
				dialog "свойствами или силой. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Судьба Вёлунда - это величайший "
				dialog "пример целеустремлённости и "
				dialog "трудолюбия. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Однажды, когда Вёлунд еще ступал "
				dialog "по земле, злой король похитил его "
				dialog "и заточил у себя на острове, "
				dialog "чтобы мастер творил только для "
				dialog "него. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Не желая принимать такую участь, "
				dialog "Вёлунд изготовил себе крылья и "
				dialog "улетел в Вальгаллу. "
				close
				return
			break
			case 3
				dialog "[Последователь Вёлунда]"
				dialog "Приятно пахнет, правда? Это "
				dialog "свежесваренный кофе, я делаю его "
				dialog "сам. Эх, только он мне помогает "
				dialog "снять усталось после трудного дня."
				wait
				if (v[jp_event51] == 0)
					choose menu "Можно попробовать? "
						case 1
							var item_check = GetInventoryRemainCount Coffee 1 // Coffee instead of Coffee
							if (item_check == 1)
								dialog "[Последователь Вёлунда]"
								dialog "Конечно, держи."
								getitem Coffee 1 // Coffee instead of Coffee
								setitem jp_event51 1										
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Последователь Вёлунда]"
								dialog "У тебя переполнен инвентарь, "
								dialog "освободи его и возвращайся. "
								close
								return
							endif
						break
					endchoose
				elseif (v[jp_event50] >= 8)
					dialog "[Последователь Вёлунда]"
					dialog "Я вижу тебе понравился мой кофе, "
					dialog "хочешь еще? "
					wait
					choose menu "Хочу еще! " "Уйти "
						case 1
							dialog "[Последователь Вёлунда]"
							dialog "Могу предложить тебе кофе за пару "
							dialog "экземпляров небесного кристалла.  "
							wait
							dialog "Сколько кофе ты хочешь получить? "
							wait
							dlgwrite 1 65000
							var exchange_input = input
							var cost = exchange_input * 2
							if input == 0
								dialog "[Последователь Вёлунда]"
								dialog "Если ты не хочешь обменять, зачем "
								dialog "спрашиваешь?  "
								close
								return
							elseif error
								dialog "[Последователь Вёлунда]"
								dialog "Зачем же ты меня пытаешься "
								dialog "обмануть?  "
								close
								return	
							endif
							dialog ""+exchange_input+" кофе за "+cost+" кристаллов. Всё верно?"
							wait
							choose menu "Подтвердить " "Отмена "
								case 1
									if v[Gray_Hollow_RU] >= cost // Gray_Hollow_RU instead of Gray_Hollow
										var item_check = GetInventoryRemainCount Coffee exchange_input // Coffee instead of Coffee
										if item_check == 1
											dropitem Gray_Hollow_RU cost // Gray_Hollow_RU instead of Gray_Hollow
											getitem Coffee exchange_input // Coffee instead of Coffee
											dialog "[Последователь Вёлунда]"
											dialog "Приходи, если захочешь еще."
											close
											return
										else
											dialog "[Последователь Вёлунда]"
											dialog "У тебя переполнен инвентарь, "
											dialog "освободи его и возвращайся. "
											close
											return
										endif
									else
										dialog "[Последователь Вёлунда]"
										dialog "У тебя недостаточно кристаллов "
										dialog "для "+exchange_input+" чашек кофе."
										dialog "Приходи, когда у тебя "
										dialog "появится больше кристаллов."
										close
										return									
									endif
								break
								case 2
									dialog "[Последователь Вёлунда]"
									dialog "Ладно. Приходи, когда надумаешь "
									dialog "обменять. "
									close
									return
								break
							endchoose
						break
						case 2
						break
					endchoose
				elseif (v[Gray_Hollow_RU] > 0) // Gray_Hollow_RU instead of Gray_Hollow
					dialog "[Последователь Вёлунда]"
					dialog "Свой кофе я не продаю, однако... "
					dialog "Я мог бы обменять его на "
					dialog "что-нибудь уникальное. Например, "
					dialog "что это у тебя там за кристаллы? "
					wait
					dialog "Поразительно! Эх, если бы я мог "
					dialog "изготовить из них что-нибудь, они "
					dialog "бы мне точно пригодились. "
					close
					return
				else
					dialog "[Последователь Вёлунда]"
					dialog "Свой кофе я не продаю, однако... "
					dialog "Я мог бы обменять его на "
					dialog "что-нибудь уникальное.  "
					close
					return
				endif
			break
		endchoose
	elseif (v[jp_event50] == 3)
		choose menu "Я принёс небесные кристаллы " "Расскажи мне о боге-кузнеце " "Чем это так вкусно пахнет? "
			case 1
				if (v[Gray_Hollow_RU] >= 20) // Gray_Hollow_RU instead of Gray_Hollow
					dialog "[Последователь Вёлунда]"
					dialog "Кому расскажешь - не поверят! Это "
					dialog "ведь небесные кристаллы! Дай-ка "
					dialog "сюда, посмотрим на них. "
					wait
					dialog "[Последователь Вёлунда]"
					dialog "В жизни не видал такой красоты! "
					dialog "Но с грустью хочу сказать, что у "
					dialog "меня нет инструментов для работы "
					dialog "с такими кристаллами. "
					wait
					dialog "[Последователь Вёлунда]"
					dialog "Но такой шанс выпадает раз в "
					dialog "жизни. Надо что-нибудь придумать. "
					wait
					dialog "[Последователь Вёлунда]"
					dialog "Я думаю, стоит навестить гильдию "
					dialog "кузнецов в железном городе, "
					dialog "Эйнброхе. "
					wait
					dialog "[Последователь Вёлунда]"
					dialog "Там есть разные мастера-кузнецы, "
					dialog "готов поставить на то, что у них "
					dialog "есть что-то особенное для работы "
					dialog "с такими материалами. "
					wait
					dialog "[Последователь Вёлунда]"
					dialog "В первую очередь спроси Йорлунда, "
					dialog "моего старого учителя. Все знания "
					dialog "о кузнечном деле у меня от него. "
					setitem jp_event50 4
					dropitem Gray_Hollow_RU 20 // Gray_Hollow_RU instead of Gray_Hollow
					changequest 17302 17303
					close
					return
				elseif ((v[Gray_Hollow_RU] > 0) & (v[Gray_Hollow_RU] < 20)) // Gray_Hollow_RU instead of Gray_Hollow
					dialog "[Последователь Вёлунда]"
					dialog "Потрясающе! Но такого количества "
					dialog "явно недостаточно, чтобы говорить "
					dialog "о каком-то изделии. Нужно больше "
					dialog "экземпляров. "
					close
					return
				else
					dialog "[Последователь Вёлунда]"
					dialog "Не обманывай меня, я же вижу, что "
					dialog "ничего у тебя нет. "
					close
					return
				endif
			break
			case 2
				dialog "[Последователь Вёлунда]"
				dialog "О, ты хочешь узнать о Вёлунде? "
				dialog "Тогда слушай внимательно. Вёлунд -"
				dialog "это бог-покровитель кузнецов. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Он не только ремесленник, но "
				dialog "мастер, художник, хорошо "
				dialog "понимающий красоту всех вещей. "
				dialog "Вёлунд работал с прекраснейшими "
				dialog "самоцветами, добытыми из земли."
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Он олицетворяет землю - одну из "
				dialog "главных стихий. Он "
				dialog "преобразовывает, улучшает "
				dialog "добытое, создавая прекрасные "
				dialog "творения с помощью огня – другой "
				dialog "сильной стихии. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Таким образом мастер способен "
				dialog "наделить предметы определенными "
				dialog "свойствами или силой. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Судьба Вёлунда - это величайший "
				dialog "пример целеустремлённости и "
				dialog "трудолюбия. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Однажды, когда Вёлунд еще ступал "
				dialog "по земле, злой король похитил его "
				dialog "и заточил у себя на острове, "
				dialog "чтобы мастер творил только для "
				dialog "него. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Не желая принимать такую участь, "
				dialog "Вёлунд изготовил себе крылья и "
				dialog "улетел в Вальгаллу. "
				close
				return
			break
			case 3
				dialog "[Последователь Вёлунда]"
				dialog "Приятно пахнет, правда? Это "
				dialog "свежесваренный кофе, я делаю его "
				dialog "сам. Эх, только он мне помогает "
				dialog "снять усталось после трудного дня."
				wait
				if (v[jp_event51] == 0)
					choose menu "Можно попробовать? "
						case 1
							var item_check = GetInventoryRemainCount Coffee 1 // Coffee instead of Coffee
							if (item_check == 1)
								dialog "[Последователь Вёлунда]"
								dialog "Конечно, держи."
								getitem Coffee 1 // Coffee instead of Coffee
								setitem jp_event51 1										
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Последователь Вёлунда]"
								dialog "У тебя переполнен инвентарь, "
								dialog "освободи его и возвращайся. "
								close
								return
							endif
						break
					endchoose
				elseif (v[jp_event50] >= 8)
					dialog "[Последователь Вёлунда]"
					dialog "Я вижу тебе понравился мой кофе, "
					dialog "хочешь еще? "
					wait
					choose menu "Хочу еще! " "Уйти "
						case 1
							dialog "[Последователь Вёлунда]"
							dialog "Могу предложить тебе кофе за пару "
							dialog "экземпляров небесного кристалла.  "
							wait
							dialog "Сколько кофе ты хочешь получить? "
							wait
							dlgwrite 1 65000
							var exchange_input = input
							var cost = exchange_input * 2
							if input == 0
								dialog "[Последователь Вёлунда]"
								dialog "Если ты не хочешь обменять, зачем "
								dialog "спрашиваешь?  "
								close
								return
							elseif error
								dialog "[Последователь Вёлунда]"
								dialog "Зачем же ты меня пытаешься "
								dialog "обмануть?  "
								close
								return	
							endif
							dialog ""+exchange_input+" кофе за "+cost+" кристаллов. Всё верно?"
							wait
							choose menu "Подтвердить " "Отмена "
								case 1
									if v[Gray_Hollow_RU] >= cost // Gray_Hollow_RU instead of Gray_Hollow
										var item_check = GetInventoryRemainCount Coffee exchange_input // Coffee instead of Coffee
										if item_check == 1
											dropitem Gray_Hollow_RU cost // Gray_Hollow_RU instead of Gray_Hollow
											getitem Coffee exchange_input // Coffee instead of Coffee
											dialog "[Последователь Вёлунда]"
											dialog "Приходи, если захочешь еще."
											close
											return
										else
											dialog "[Последователь Вёлунда]"
											dialog "У тебя переполнен инвентарь, "
											dialog "освободи его и возвращайся. "
											close
											return
										endif
									else
										dialog "[Последователь Вёлунда]"
										dialog "У тебя недостаточно кристаллов "
										dialog "для "+exchange_input+" чашек кофе."
										dialog "Приходи, когда у тебя "
										dialog "появится больше кристаллов."
										close
										return									
									endif
								break
								case 2
									dialog "[Последователь Вёлунда]"
									dialog "Ладно. Приходи, когда надумаешь "
									dialog "обменять. "
									close
									return
								break
							endchoose
						break
						case 2
						break
					endchoose
				elseif (v[Gray_Hollow_RU] > 0) // Gray_Hollow_RU instead of Gray_Hollow
					dialog "[Последователь Вёлунда]"
					dialog "Свой кофе я не продаю, однако... "
					dialog "Я мог бы обменять его на "
					dialog "что-нибудь уникальное. Например, "
					dialog "что это у тебя там за кристаллы? "
					wait
					dialog "Поразительно! Эх, если бы я мог "
					dialog "изготовить из них что-нибудь, они "
					dialog "бы мне точно пригодились. "
					close
					return
				else
					dialog "[Последователь Вёлунда]"
					dialog "Свой кофе я не продаю, однако... "
					dialog "Я мог бы обменять его на "
					dialog "что-нибудь уникальное.  "
					close
					return
				endif
			break
		endchoose
	elseif (v[jp_event50] == 7)
		choose menu "Я принёс особый инструмент " "Расскажи мне о боге-кузнеце " "Чем это так вкусно пахнет? "
			case 1
				if (v[Gold_Hammer] > 0) // Gold_Hammer instead of Gold_Hammer
					var item_check = GetInventoryRemainCount Gold_Tiara 1
					if (item_check == 1)
						dialog "[Последователь Вёлунда]"
						dialog "Да, это то, что нужно. С таким "
						dialog "инструментом я смогу справиться с "
						dialog "этими кристаллами. "
						wait
						dialog "[Последователь Вёлунда]"
						dialog "Что ж, из тех кристаллов, что ты "
						dialog "принес, я смогу сделать тебе "
						dialog "потрясающую диадему. "
						wait
						dialog "[Последователь Вёлунда]"
						dialog "Подожди минутку..."
						wait
						dialog "[Последователь Вёлунда]"
						dialog "Готово! Неплохо получилось, не "
						dialog "так ли? Эта диадема с особыми "
						dialog "свойствами. Конечно, я не бог, но "
						dialog "кузнец из меня хоть куда. "
						setitem jp_event50 8
						getitem Gold_Tiara 1
						completequest 17305
						close
						return
					else
						dialog "[Последователь Вёлунда]"
						dialog "У тебя переполнен инвентарь, "
						dialog "освободи его и возвращайся. "
						close
						return
					endif
				else
					dialog "[Последователь Вёлунда]"
					dialog "Не обманывай меня, я же вижу, что "
					dialog "ничего у тебя нет. "
					close
					return
				endif
			break
			case 2
				dialog "[Последователь Вёлунда]"
				dialog "О, ты хочешь узнать о Вёлунде? "
				dialog "Тогда слушай внимательно. Вёлунд -"
				dialog "это бог-покровитель кузнецов. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Он не только ремесленник, но "
				dialog "мастер, художник, хорошо "
				dialog "понимающий красоту всех вещей. "
				dialog "Вёлунд работал с прекраснейшими "
				dialog "самоцветами, добытыми из земли."
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Он олицетворяет землю - одну из "
				dialog "главных стихий. Он "
				dialog "преобразовывает, улучшает "
				dialog "добытое, создавая прекрасные "
				dialog "творения с помощью огня – другой "
				dialog "сильной стихии. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Таким образом мастер способен "
				dialog "наделить предметы определенными "
				dialog "свойствами или силой. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Судьба Вёлунда - это величайший "
				dialog "пример целеустремлённости и "
				dialog "трудолюбия. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Однажды, когда Вёлунд еще ступал "
				dialog "по земле, злой король похитил его "
				dialog "и заточил у себя на острове, "
				dialog "чтобы мастер творил только для "
				dialog "него. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Не желая принимать такую участь, "
				dialog "Вёлунд изготовил себе крылья и "
				dialog "улетел в Вальгаллу. "
				close
				return
			break
			case 3
				dialog "[Последователь Вёлунда]"
				dialog "Приятно пахнет, правда? Это "
				dialog "свежесваренный кофе, я делаю его "
				dialog "сам. Эх, только он мне помогает "
				dialog "снять усталось после трудного дня."
				wait
				if (v[jp_event51] == 0)
					choose menu "Можно попробовать? "
						case 1
							var item_check = GetInventoryRemainCount Coffee 1 // Coffee instead of Coffee
							if (item_check == 1)
								dialog "[Последователь Вёлунда]"
								dialog "Конечно, держи."
								getitem Coffee 1 // Coffee instead of Coffee
								setitem jp_event51 1										
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Последователь Вёлунда]"
								dialog "У тебя переполнен инвентарь, "
								dialog "освободи его и возвращайся. "
								close
								return
							endif
						break
					endchoose
				elseif (v[jp_event50] >= 8)
					dialog "[Последователь Вёлунда]"
					dialog "Я вижу тебе понравился мой кофе, "
					dialog "хочешь еще? "
					wait
					choose menu "Хочу еще! " "Уйти "
						case 1
							dialog "[Последователь Вёлунда]"
							dialog "Могу предложить тебе кофе за пару "
							dialog "экземпляров небесного кристалла.  "
							wait
							dialog "Сколько кофе ты хочешь получить? "
							wait
							dlgwrite 1 65000
							var exchange_input = input
							var cost = exchange_input * 2
							if input == 0
								dialog "[Последователь Вёлунда]"
								dialog "Если ты не хочешь обменять, зачем "
								dialog "спрашиваешь?  "
								close
								return
							elseif error
								dialog "[Последователь Вёлунда]"
								dialog "Зачем же ты меня пытаешься "
								dialog "обмануть?  "
								close
								return	
							endif
							dialog ""+exchange_input+" кофе за "+cost+" кристаллов. Всё верно?"
							wait
							choose menu "Подтвердить " "Отмена "
								case 1
									if v[Gray_Hollow_RU] >= cost // Gray_Hollow_RU instead of Gray_Hollow
										var item_check = GetInventoryRemainCount Coffee exchange_input // Coffee instead of Coffee
										if item_check == 1
											dropitem Gray_Hollow_RU cost // Gray_Hollow_RU instead of Gray_Hollow
											getitem Coffee exchange_input // Coffee instead of Coffee
											dialog "[Последователь Вёлунда]"
											dialog "Приходи, если захочешь еще."
											close
											return
										else
											dialog "[Последователь Вёлунда]"
											dialog "У тебя переполнен инвентарь, "
											dialog "освободи его и возвращайся. "
											close
											return
										endif
									else
										dialog "[Последователь Вёлунда]"
										dialog "У тебя недостаточно кристаллов "
										dialog "для "+exchange_input+" чашек кофе."
										dialog "Приходи, когда у тебя "
										dialog "появится больше кристаллов."
										close
										return									
									endif
								break
								case 2
									dialog "[Последователь Вёлунда]"
									dialog "Ладно. Приходи, когда надумаешь "
									dialog "обменять. "
									close
									return
								break
							endchoose
						break
						case 2
						break
					endchoose
				elseif (v[Gray_Hollow_RU] > 0) // Gray_Hollow_RU instead of Gray_Hollow
					dialog "[Последователь Вёлунда]"
					dialog "Свой кофе я не продаю, однако... "
					dialog "Я мог бы обменять его на "
					dialog "что-нибудь уникальное. Например, "
					dialog "что это у тебя там за кристаллы? "
					wait
					dialog "Поразительно! Эх, если бы я мог "
					dialog "изготовить из них что-нибудь, они "
					dialog "бы мне точно пригодились. "
					close
					return
				else
					dialog "[Последователь Вёлунда]"
					dialog "Свой кофе я не продаю, однако... "
					dialog "Я мог бы обменять его на "
					dialog "что-нибудь уникальное.  "
					close
					return
				endif
			break
		endchoose
	else
		choose menu "Чем это так вкусно пахнет?" "Расскажи мне о боге-кузнеце " "Где найти небесные кристаллы?"
			case 1
				dialog "[Последователь Вёлунда]"
				dialog "Приятно пахнет, правда? Это "
				dialog "свежесваренный кофе, я делаю его "
				dialog "сам. Эх, только он мне помогает "
				dialog "снять усталось после трудного дня."
				wait
				if (v[jp_event51] == 0)
					choose menu "Можно попробовать? "
						case 1
							var item_check = GetInventoryRemainCount Coffee 1 // Coffee instead of Coffee
							if (item_check == 1)
								dialog "[Последователь Вёлунда]"
								dialog "Конечно, держи."
								getitem Coffee 1 // Coffee instead of Coffee
								setitem jp_event51 1										
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Последователь Вёлунда]"
								dialog "У тебя переполнен инвентарь, "
								dialog "освободи его и возвращайся. "
								close
								return
							endif
						break
					endchoose
				elseif (v[jp_event50] >= 8)
					dialog "[Последователь Вёлунда]"
					dialog "Я вижу тебе понравился мой кофе, "
					dialog "хочешь еще? "
					wait
					choose menu "Хочу еще! " "Уйти "
						case 1
							dialog "[Последователь Вёлунда]"
							dialog "Могу предложить тебе кофе за пару "
							dialog "экземпляров небесного кристалла.  "
							wait
							dialog "Сколько кофе ты хочешь получить? "
							wait
							dlgwrite 1 65000
							var exchange_input = input
							var cost = exchange_input * 2
							if input == 0
								dialog "[Последователь Вёлунда]"
								dialog "Если ты не хочешь обменять, зачем "
								dialog "спрашиваешь?  "
								close
								return
							elseif error
								dialog "[Последователь Вёлунда]"
								dialog "Зачем же ты меня пытаешься "
								dialog "обмануть?  "
								close
								return	
							endif
							dialog ""+exchange_input+" кофе за "+cost+" кристаллов. Всё верно?"
							wait
							choose menu "Подтвердить " "Отмена "
								case 1
									if v[Gray_Hollow_RU] >= cost // Gray_Hollow_RU instead of Gray_Hollow
										var item_check = GetInventoryRemainCount Coffee exchange_input // Coffee instead of Coffee
										if item_check == 1
											dropitem Gray_Hollow_RU cost // Gray_Hollow_RU instead of Gray_Hollow
											getitem Coffee exchange_input // Coffee instead of Coffee
											dialog "[Последователь Вёлунда]"
											dialog "Приходи, если захочешь еще."
											close
											return
										else
											dialog "[Последователь Вёлунда]"
											dialog "У тебя переполнен инвентарь, "
											dialog "освободи его и возвращайся. "
											close
											return
										endif
									else
										dialog "[Последователь Вёлунда]"
										dialog "У тебя недостаточно кристаллов "
										dialog "для "+exchange_input+" чашек кофе."
										dialog "Приходи, когда у тебя "
										dialog "появится больше кристаллов."
										close
										return									
									endif
								break
								case 2
									dialog "[Последователь Вёлунда]"
									dialog "Ладно. Приходи, когда надумаешь "
									dialog "обменять. "
									close
									return
								break
							endchoose
						break
						case 2
						break
					endchoose
				elseif (v[Gray_Hollow_RU] > 0) // Gray_Hollow_RU instead of Gray_Hollow
					dialog "[Последователь Вёлунда]"
					dialog "Свой кофе я не продаю, однако... "
					dialog "Я мог бы обменять его на "
					dialog "что-нибудь уникальное. Например, "
					dialog "что это у тебя там за кристаллы? "
					wait
					dialog "Поразительно! Эх, если бы я мог "
					dialog "изготовить из них что-нибудь, они "
					dialog "бы мне точно пригодились. "
					close
					return
				else
					dialog "[Последователь Вёлунда]"
					dialog "Свой кофе я не продаю, однако... "
					dialog "Я мог бы обменять его на "
					dialog "что-нибудь уникальное.  "
					close
					return
				endif
			break
			case 2
				dialog "[Последователь Вёлунда]"
				dialog "О, ты хочешь узнать о Вёлунде? "
				dialog "Тогда слушай внимательно. Вёлунд -"
				dialog "это бог-покровитель кузнецов. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Он не только ремесленник, но "
				dialog "мастер, художник, хорошо "
				dialog "понимающий красоту всех вещей. "
				dialog "Вёлунд работал с прекраснейшими "
				dialog "самоцветами, добытыми из земли."
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Он олицетворяет землю - одну из "
				dialog "главных стихий. Он "
				dialog "преобразовывает, улучшает "
				dialog "добытое, создавая прекрасные "
				dialog "творения с помощью огня – другой "
				dialog "сильной стихии. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Таким образом мастер способен "
				dialog "наделить предметы определенными "
				dialog "свойствами или силой. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Судьба Вёлунда - это величайший "
				dialog "пример целеустремлённости и "
				dialog "трудолюбия. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Однажды, когда Вёлунд еще ступал "
				dialog "по земле, злой король похитил его "
				dialog "и заточил у себя на острове, "
				dialog "чтобы мастер творил только для "
				dialog "него. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "Не желая принимать такую участь, "
				dialog "Вёлунд изготовил себе крылья и "
				dialog "улетел в Вальгаллу. "
				close
				return
			break
			case 3
				dialog "[Последователь Вёлунда]"
				dialog "Путники их видели на полях около "
				dialog "городов, они виднелись из под "
				dialog "земляных пригорков. "
				wait
				dialog "[Последователь Вёлунда]"
				dialog "По легенде же, такие кристаллы "
				dialog "чаще всего встречались на горной "
				dialog "гряде Мьёлльнир. Я бы обратил на "
				dialog "неё внимание. "
				close
				return
			break
		endchoose
	endif
return

npc "ein_in01" "Йорлунд " 4_M_DWARF 31 26 5 0 0
OnClick:
	dialog "[Йорлунд]"
	dialog "Приветствую. Чувствуешь "
	dialog "металлический привкус во рту?"
	dialog "Я уже 30 лет как чувствую. "
	dialog "Чем могу быть полезен? "
	wait
	if (v[jp_event50] == 4)
		choose menu "Рассказать о кристаллах " "Мне сказали ты можешь помочь... " 
			case 1
				dialog "[Йорлунд]"
				dialog "Явление действительно уникальное, "
				dialog "я слышал об этих небесных "
				dialog "кристаллах, но не думал, что они "
				dialog "существуют. "
				wait
				dialog "[Йорлунд]"
				dialog "Конечно, это всё очень интересно, "
				dialog "но у меня слишком много работы "
				dialog "чтобы думать об этом. "
				close
				return
			break
			case 2
				dialog "[Йорлунд]"
				dialog "Дай-ка посмотреть на этот "
				dialog "кристалл... "
				wait
				dialog "[Йорлунд]"
				dialog "Весьма необычная порода, но я "
				dialog "думаю, что у меня есть подходящий "
				dialog "инструмент для него. "
				wait
				dialog "[Йорлунд]"
				dialog "Если уж вы решили сделать что-то "
				dialog "необычное, мне будет интересно в "
				dialog "этом поучаствовать. "
				wait
				dialog "[Йорлунд]"
				dialog "Я бы прямо сейчас сходил за моим "
				dialog "молотом, но у меня столько дел... "
				wait
				choose menu "Я могу тебе помочь " "Уйти "
					case 1
						dialog "[Йорлунд]"
						dialog "Хорошо, что ты предложил! Мне "
						dialog "нужно взять еженедельный заказ у "
						dialog "оружейной, сходи и спроси его. "
						setitem jp_event50 5
						changequest 17303 17304
						close
						return
					break
					case 2
					break
				endchoose
			break
		endchoose
	elseif (v[jp_event50] == 6)
		choose menu "Рассказать о кристаллах " "Я узнал насчёт заказа "
			case 1
				dialog "[Йорлунд]"
				dialog "Явление действительно уникальное, "
				dialog "я слышал об этих небесных "
				dialog "кристаллах, но не думал, что они "
				dialog "существуют. "
				wait
				dialog "[Йорлунд]"
				dialog "Конечно, это всё очень интересно, "
				dialog "но у меня слишком много работы "
				dialog "чтобы думать об этом. "
				close
				return
			break
			case 2
				var item_check = GetInventoryRemainCount Gold_Hammer 1  // Gold_Hammer instead of Gold_Hammer
				if (item_check == 1)
					dialog "[Йорлунд]"
					dialog "Ну наконец-то. Где ты пропадал? Я "
					dialog "уж думал сам идти. "
					wait
					dialog "[Йорлунд]"
					dialog "Всё как обычно, но... 40 "
					dialog "кинжалов? Похоже, что кто-то "
					dialog "собирается снарядить целую армию. "
					dialog "Ну, или обустроить кухню. "
					wait
					dialog "[Йорлунд]"
					dialog "Что ж, держи молот, с ним ты "
					dialog "сможешь изготовить нужное "
					dialog "снаряжение из этих кристаллов. "
					setitem jp_event50 7
					getitem Gold_Hammer 1	 // Gold_Hammer instead of Gold_Hammer
					changequest 17304 17305
					close
					return
				else
					dialog "[Йорлунд]"
					dialog "У тебя переполнен инвентарь, "
					dialog "освободи его и возвращайся. "
					close
					return
				endif
			break
		endchoose
	else 
		choose menu "Рассказать о кристаллах " 
			case 1
				dialog "[Йорлунд]"
				dialog "Явление действительно уникальное, "
				dialog "я слышал об этих небесных "
				dialog "кристаллах, но не думал, что они "
				dialog "существуют. "
				wait
				dialog "[Йорлунд]"
				dialog "Конечно, это всё очень интересно, "
				dialog "но у меня слишком много работы "
				dialog "чтобы думать об этом. "
				close
				return
			break
		endchoose
	endif
return

npc "ein_in01" "Управляющий " 2_M_SWORDMASTER 97 26 5 0 0
OnClick:
	dialog "[Управляющий]"
	dialog "Если вы пришли за оружием, вам к "
	dialog "сотрудницам в центре здания. "
	wait
	if (v[jp_event50] == 5)
		choose menu "Я по поводу заказа для Йорлунда " "Как идут дела? "
			case 1
				dialog "[Управляющий]"
				dialog "За последнюю неделю у нас много "
				dialog "чего раскупили. Посмотрим... "
				wait
				dialog "[Управляющий]"
				dialog "3 рапиры, пика, молот и 40 "
				dialog "кинжалов. Возвращайся и передай "
				dialog "это Йорлунду. "
				setitem jp_event50 6
				close
				return
			break
			case 2
				dialog "[Управляющий]"
				dialog "Дела идут хорошо, как и во всём "
				dialog "Эйнброхе. Металлы нынче очень "
				dialog "нужны.  "
				close
				return
			break
		endchoose
	else
		choose menu "Как идут дела? "
			case 1
				dialog "[Управляющий]"
				dialog "Дела идут хорошо, как и во всём "
				dialog "Эйнброхе. Металлы нынче очень "
				dialog "нужны.  "
				close
				return
			break
		endchoose
	endif
return

npc "prontera" "Путник " 4_M_SAGE_A 148 29 0 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "prontera" "Путник " 4_M_SAGE_A 279 208 3 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "prontera" "Путник " 4_M_SAGE_A 159 326 3 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "prontera" "Путник " 4_M_SAGE_A 29 210 6 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "payon" "Путник " 4_M_SAGE_A 221 83 3 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "alberta" "Путник " 4_M_SAGE_A 25 238 4 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "aldebaran" "Путник " 4_M_SAGE_A 139 69 4 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "geffen" "Путник " 4_M_SAGE_A 199 123 3 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "morocc" "Путник " 4_M_SAGE_A 156 291 6 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "comodo" "Путник " 4_M_SAGE_A 179 349 4 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "hugel" "Путник " 4_M_SAGE_A 93 56 5 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "yuno" "Путник " 4_M_SAGE_A 162 47 4 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "einbroch" "Путник " 4_M_SAGE_A 152 51 4 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "lighthalzen" "Путник " 4_M_SAGE_A 218 320 3 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "rachel" "Путник " 4_M_SAGE_A 38 130 4 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "veins" "Путник " 4_M_SAGE_A 144 34 3 0 0
OnClick:
	dialog "[Путник]"
	dialog "Добрый день! Приятная погода, не "
	dialog "так ли? Конечно же она продлится "
	dialog "ровно до того момента, пока я не "
	dialog "захочу прогуляться... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				choose menu "Расскажи мне подробнее о кристаллах "
					case 1
						dialog "[Путник]"
						dialog "Таких кристаллов я никогда раньше "
						dialog "не видел. Хотя я часто исследую "
						dialog "эти земли. Достать из земли я его "
						dialog "не смог, но могу поклясться, что "
						dialog "он светился!  "
						wait
						dialog "[Путник]"
						dialog "Я смотрел сквозь него и видел все "
						dialog "цвета радуги! "
						wait
						dialog "[Путник]"
						dialog "Но, кажется, судя по твоему лицу, "
						dialog "ты мне не веришь... "
						setitem jp_event50 2
						changequest 17300 17301
						close
						return
					break
				endchoose
			break
			case 2
			break
		endchoose
	elseif (v[jp_event50] > 1)
		choose menu "Напомни мне о кристаллах " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				wait
				dialog "[Путник]"
				dialog "Таких кристаллов я никогда раньше "
				dialog "не видел. Хотя я часто исследую "
				dialog "эти земли. Достать из земли я его "
				dialog "не смог, но могу поклясться, что "
				dialog "он светился!  "
				wait
				dialog "[Путник]"
				dialog "Я смотрел сквозь него и видел все "
				dialog "цвета радуги! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Ты видел что-нибудь необычное? " "Уйти "
			case 1
				dialog "[Путник]"
				dialog "В последнее время я часто вижу "
				dialog "появляющиеся из под земли "
				dialog "кристаллы, прямо на полях вокруг "
				dialog "города. Поразительно, правда? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return
