// Coffee instead of Coffee
// Gray_Hollow instead of Gray_Hollow
// Gold_Hammer instead of Gold_Hammer

npc "prontera" "Velund's follower " 1_M_SMITH 123 123 5 0 0 //
OnClick:
	var potion_cost = 2
	dialog "[Velund's follower]"
	dialog "Hi. Oh, you look tired, like "
	dialog "you've been working all day. "
	dialog "Maybe you should lie down? Good "
	dialog "labor is commendable, but you "
	dialog "should not forget about rest! "
	wait
	if (v[jp_event50] == 0)
		choose menu "Tell me about skyfire gems " "Tell me about Velund " "What smells so good? "
			case 1
				dialog "[Velund's follower]"
				dialog "According to legends, Velund was "
				dialog "able to work with the finest gems "
				dialog "extracted from the earth. "
				wait
				dialog "[Velund's follower]"
				dialog "Now a unique phenomenon is taking "
				dialog "place - according to rumors, "
				dialog "shiny crystals appeared from the "
				dialog "depths of the earth. "
				wait
				dialog "[Velund's follower]"
				dialog "If these are the skyfire gems "
				dialog "with which Velund worked a long "
				dialog "time ago, we can try to recreate "
				dialog "his extraordinary equipment! "
				wait
				dialog "[Velund's follower]"
				dialog "But, of course, I cannot rely on "
				dialog "rumors. Find out more about these "
				dialog "gems, and if rumors turn out to "
				dialog "be true, I can make a piece "
				dialog "worthy of Master Velund. "
				wait
				choose menu "I agree " "I am buzy now... "
					case 1
						dialog "[Velund's follower]"
						dialog "I think you can easily find out "
						dialog "what's going on in the world by "
						dialog "talking to explorers who stay in "
						dialog "cities. They usually stand at the "
						dialog "gate. "
						wait
						dialog "[Velund's follower]"
						dialog "And hurry up, I can't wait to see "
						dialog "the gems with my own eyes ... "
						setitem jp_event50 1
						setquest 17300
						close
						return
					break
					case 2
						dialog "[Velund's follower]"
						dialog "Okay, but if you change your "
						dialog "mind, come back. I'd really like "
						dialog "to believe that the skyfire gems "
						dialog "showed themselves. "
						close
						return
					break
				endchoose
			break
			case 2
				dialog "[Velund's follower]"
				dialog "Listen carefully, this is a very "
				dialog "interesting story. Velund is a "
				dialog "blacksmith god. "
				wait
				dialog "[Velund's follower]"
				dialog "He is not only an artisan. He is "
				dialog "a master, an artist who "
				dialog "understands the beauty of all "
				dialog "things. According to legends, "
				dialog "Velund was able to work with the "
				dialog "rarest gems. "
				wait
				dialog "[Velund's follower]"
				dialog "He personifies the earth - one of "
				dialog "the main elements. He transforms "
				dialog "materials, creating beautiful "
				dialog "works of art with the help of "
				dialog "fire - another strong element. "
				wait
				dialog "[Velund's follower]"
				dialog "Thus, Velund was able to empower "
				dialog "items with certain properties. "
				wait
				dialog "[Velund's follower]"
				dialog "Velund's fate is the greatest "
				dialog "example of dedication and hard "
				dialog "work. "
				wait
				dialog "[Velund's follower]"
				dialog "Once, when Velund was still "
				dialog "walking on the earth, the evil "
				dialog "king kidnapped him and imprisoned "
				dialog "him on island so that the master "
				dialog "would create only for him. "
				wait
				dialog "[Velund's follower]"
				dialog "Velund decided not to lose "
				dialog "heart. So he made the wings and "
				dialog "flew to Valhalla. "
				close
				return
			break
			case 3
				dialog "[Velund's follower]"
				dialog "It smells good, doesn't it? This "
				dialog "is freshly brewed coffee, I make "
				dialog "it by myself. It's the only thing "
				dialog "that helps me take off my "
				dialog "tiredness after a hard day. "
				wait
				if (v[jp_event51] == 0)
					choose menu "Can I try it? "
						case 1
							var item_check = GetInventoryRemainCount Coffee 1 // Coffee instead of Coffee
							if (item_check == 1)
								dialog "[Velund's follower]"
								dialog "Of course you can."
								getitem Coffee 1 // Coffee instead of Coffee
								setitem jp_event51 1										
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Velund's follower]"
								dialog "Your inventory is full. Free some "
								dialog "space and come back. "
								close
								return
							endif
						break
					endchoose
				elseif (v[jp_event50] >= 8)
					dialog "[Velund's follower]"
					dialog "I see you enjoyed my coffee, "
					dialog "would you like some more? "
					wait
					choose menu "I want more! " "I have to go"
						case 1
							dialog "[Velund's follower]"
							dialog "I can offer you coffee for the "
							dialog "two skyfire gems. "
							wait
							dialog "How many cups of coffee do you "
							dialog "want to get?  "
							wait
							dlgwrite 1 65000
							var exchange_input = input
							var cost = exchange_input * 2
							if input == 0
								dialog "[Velund's follower]"
								dialog "If you don't want to exchange, "
								dialog "why are you asking? "
								close
								return
							elseif error
								dialog "[Velund's follower]"
								dialog "Do you try to cheat? "
								close
								return	
							endif
							dialog ""+exchange_input+" cups of coffee for "+cost+" gems. Is it correct?"
							wait
							choose menu "Yes " "I change my mind. "
								case 1
									if v[Gray_Hollow] >= cost // Gray_Hollow instead of Gray_Hollow
										var item_check = GetInventoryRemainCount Coffee exchange_input // Coffee instead of Coffee
										if item_check == 1
											dropitem Gray_Hollow cost // Gray_Hollow instead of Gray_Hollow
											getitem Coffee exchange_input // Coffee instead of Coffee
											dialog "[Velund's follower]"
											dialog "Come if you want more."
											close
											return
										else
											dialog "[Velund's follower]"
											dialog "Your inventory is full. Free some "
											dialog "space and come back. "
											close
											return
										endif
									else
										dialog "[Velund's follower]"
										dialog "You don't have enough gems "
										dialog "for "+exchange_input+" cups of coffee."
										dialog "Come when you have more crystals."
										close
										return									
									endif
								break
								case 2
									dialog "[Velund's follower]"
									dialog "Okay. Come back if you want to "
									dialog "exchange. "
									close
									return
								break
							endchoose
						break
						case 2
						break
					endchoose
				elseif (v[Gray_Hollow] > 0) // Gray_Hollow instead of Gray_Hollow
					dialog "[Velund's follower]"
					dialog "I don’t sell my coffee, but... I "
					dialog "could trade it for something "
					dialog "unique. For example, what about "
					dialog "these shiny crystals in your "
					dialog "pocket? "
					wait
					dialog "Astonishingly! Eh, if I could "
					dialog "create something with them, they "
					dialog "would come in handy to me. "
					close
					return
				else
					dialog "[Velund's follower]"
					dialog "I don’t sell my coffee, but... I "
					dialog "could trade it for something "
					dialog "unique. "
					close
					return
				endif
			break
		endchoose
	elseif (v[jp_event50] == 2)
		choose menu "I found out about these crystals " "Tell me about Velund " "What smells so good? "
			case 1
				dialog "[Velund's follower]"
				dialog "I can't believe it! These are "
				dialog "truly skyfire gems! Go "
				dialog "immediately and bring me 20 of "
				dialog "them. "
				wait
				dialog "[Velund's follower]"
				dialog "In addition to the fields around "
				dialog "cities, I advise you to pay "
				dialog "attention to the Mjollnir "
				dialog "mountains. According to legends, "
				dialog "it was the first place, where "
				dialog "Velund found skyfire gems. "
				setitem jp_event50 3
				changequest 17301 17302
				close
				return
			break
			case 2
				dialog "[Velund's follower]"
				dialog "Listen carefully, this is a very "
				dialog "interesting story. Velund is a "
				dialog "blacksmith god. "
				wait
				dialog "[Velund's follower]"
				dialog "He is not only an artisan. He is "
				dialog "a master, an artist who "
				dialog "understands the beauty of all "
				dialog "things. According to legends, "
				dialog "Velund was able to work with the "
				dialog "rarest gems. "
				wait
				dialog "[Velund's follower]"
				dialog "He personifies the earth - one of "
				dialog "the main elements. He transforms "
				dialog "materials, creating beautiful "
				dialog "works of art with the help of "
				dialog "fire - another strong element. "
				wait
				dialog "[Velund's follower]"
				dialog "Thus, Velund was able to empower "
				dialog "items with certain properties. "
				wait
				dialog "[Velund's follower]"
				dialog "Velund's fate is the greatest "
				dialog "example of dedication and hard "
				dialog "work. "
				wait
				dialog "[Velund's follower]"
				dialog "Once, when Velund was still "
				dialog "walking on the earth, the evil "
				dialog "king kidnapped him and imprisoned "
				dialog "him on island so that the master "
				dialog "would create only for him. "
				wait
				dialog "[Velund's follower]"
				dialog "Velund decided not to lose "
				dialog "heart. So he made the wings and "
				dialog "flew to Valhalla. "
				close
				return
			break
			case 3
				dialog "[Velund's follower]"
				dialog "It smells good, doesn't it? This "
				dialog "is freshly brewed coffee, I make "
				dialog "it by myself. It's the only thing "
				dialog "that helps me take off my "
				dialog "tiredness after a hard day. "
				wait
				if (v[jp_event51] == 0)
					choose menu "Can I try it? "
						case 1
							var item_check = GetInventoryRemainCount Coffee 1 // Coffee instead of Coffee
							if (item_check == 1)
								dialog "[Velund's follower]"
								dialog "Of course you can."
								getitem Coffee 1 // Coffee instead of Coffee
								setitem jp_event51 1										
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Velund's follower]"
								dialog "Your inventory is full. Free some "
								dialog "space and come back. "
								close
								return
							endif
						break
					endchoose
				elseif (v[jp_event50] >= 8)
					dialog "[Velund's follower]"
					dialog "I see you enjoyed my coffee, "
					dialog "would you like some more? "
					wait
					choose menu "I want more! " "I have to go"
						case 1
							dialog "[Velund's follower]"
							dialog "I can offer you coffee for the "
							dialog "two skyfire gems. "
							wait
							dialog "How many cups of coffee do you "
							dialog "want to get?  "
							wait
							dlgwrite 1 65000
							var exchange_input = input
							var cost = exchange_input * 2
							if input == 0
								dialog "[Velund's follower]"
								dialog "If you don't want to exchange, "
								dialog "why are you asking? "
								close
								return
							elseif error
								dialog "[Velund's follower]"
								dialog "Do you try to cheat? "
								close
								return	
							endif
							dialog ""+exchange_input+" cups of coffee for "+cost+" gems. Is it correct?"
							wait
							choose menu "Yes " "I change my mind. "
								case 1
									if v[Gray_Hollow] >= cost // Gray_Hollow instead of Gray_Hollow
										var item_check = GetInventoryRemainCount Coffee exchange_input // Coffee instead of Coffee
										if item_check == 1
											dropitem Gray_Hollow cost // Gray_Hollow instead of Gray_Hollow
											getitem Coffee exchange_input // Coffee instead of Coffee
											dialog "[Velund's follower]"
											dialog "Come if you want more."
											close
											return
										else
											dialog "[Velund's follower]"
											dialog "Your inventory is full. Free some "
											dialog "space and come back. "
											close
											return
										endif
									else
										dialog "[Velund's follower]"
										dialog "You don't have enough gems "
										dialog "for "+exchange_input+" cups of coffee."
										dialog "Come when you have more crystals."
										close
										return									
									endif
								break
								case 2
									dialog "[Velund's follower]"
									dialog "Okay. Come back if you want to "
									dialog "exchange. "
									close
									return
								break
							endchoose
						break
						case 2
						break
					endchoose
				elseif (v[Gray_Hollow] > 0) // Gray_Hollow instead of Gray_Hollow
					dialog "[Velund's follower]"
					dialog "I don’t sell my coffee, but... I "
					dialog "could trade it for something "
					dialog "unique. For example, what about "
					dialog "these shiny crystals in your "
					dialog "pocket? "
					wait
					dialog "Astonishingly! Eh, if I could "
					dialog "create something with them, they "
					dialog "would come in handy to me. "
					close
					return
				else
					dialog "[Velund's follower]"
					dialog "I don’t sell my coffee, but... I "
					dialog "could trade it for something "
					dialog "unique. "
					close
					return
				endif
			break
		endchoose
	elseif ((v[jp_event50] == 3) & (v[Gray_Hollow] < 1))
		choose menu "How can I find skyfire gems?" "Tell me about Velund " "What smells so good? "
			case 1
				dialog "[Velund's follower]"
				dialog "They are rumored to be located "
				dialog "right around the cities. "
				wait
				dialog "[Velund's follower]"
				dialog "In addition to the fields around "
				dialog "cities, I advise you to pay "
				dialog "attention to the Mjollnir "
				dialog "mountains. According to legends, "
				dialog "it was the first place, where "
				dialog "Velund found skyfire gems. "
				close
				return
			break
			case 2
				dialog "[Velund's follower]"
				dialog "Listen carefully, this is a very "
				dialog "interesting story. Velund is a "
				dialog "blacksmith god. "
				wait
				dialog "[Velund's follower]"
				dialog "He is not only an artisan. He is "
				dialog "a master, an artist who "
				dialog "understands the beauty of all "
				dialog "things. According to legends, "
				dialog "Velund was able to work with the "
				dialog "rarest gems. "
				wait
				dialog "[Velund's follower]"
				dialog "He personifies the earth - one of "
				dialog "the main elements. He transforms "
				dialog "materials, creating beautiful "
				dialog "works of art with the help of "
				dialog "fire - another strong element. "
				wait
				dialog "[Velund's follower]"
				dialog "Thus, Velund was able to empower "
				dialog "items with certain properties. "
				wait
				dialog "[Velund's follower]"
				dialog "Velund's fate is the greatest "
				dialog "example of dedication and hard "
				dialog "work. "
				wait
				dialog "[Velund's follower]"
				dialog "Once, when Velund was still "
				dialog "walking on the earth, the evil "
				dialog "king kidnapped him and imprisoned "
				dialog "him on island so that the master "
				dialog "would create only for him. "
				wait
				dialog "[Velund's follower]"
				dialog "Velund decided not to lose "
				dialog "heart. So he made the wings and "
				dialog "flew to Valhalla. "
				close
				return
			break
			case 3
				dialog "[Velund's follower]"
				dialog "It smells good, doesn't it? This "
				dialog "is freshly brewed coffee, I make "
				dialog "it by myself. It's the only thing "
				dialog "that helps me take off my "
				dialog "tiredness after a hard day. "
				wait
				if (v[jp_event51] == 0)
					choose menu "Can I try it? "
						case 1
							var item_check = GetInventoryRemainCount Coffee 1 // Coffee instead of Coffee
							if (item_check == 1)
								dialog "[Velund's follower]"
								dialog "Of course you can."
								getitem Coffee 1 // Coffee instead of Coffee
								setitem jp_event51 1										
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Velund's follower]"
								dialog "Your inventory is full. Free some "
								dialog "space and come back. "
								close
								return
							endif
						break
					endchoose
				elseif (v[jp_event50] >= 8)
					dialog "[Velund's follower]"
					dialog "I see you enjoyed my coffee, "
					dialog "would you like some more? "
					wait
					choose menu "I want more! " "I have to go"
						case 1
							dialog "[Velund's follower]"
							dialog "I can offer you coffee for the "
							dialog "two skyfire gems. "
							wait
							dialog "How many cups of coffee do you "
							dialog "want to get?  "
							wait
							dlgwrite 1 65000
							var exchange_input = input
							var cost = exchange_input * 2
							if input == 0
								dialog "[Velund's follower]"
								dialog "If you don't want to exchange, "
								dialog "why are you asking? "
								close
								return
							elseif error
								dialog "[Velund's follower]"
								dialog "Do you try to cheat? "
								close
								return	
							endif
							dialog ""+exchange_input+" cups of coffee for "+cost+" gems. Is it correct?"
							wait
							choose menu "Yes " "I change my mind. "
								case 1
									if v[Gray_Hollow] >= cost // Gray_Hollow instead of Gray_Hollow
										var item_check = GetInventoryRemainCount Coffee exchange_input // Coffee instead of Coffee
										if item_check == 1
											dropitem Gray_Hollow cost // Gray_Hollow instead of Gray_Hollow
											getitem Coffee exchange_input // Coffee instead of Coffee
											dialog "[Velund's follower]"
											dialog "Come if you want more."
											close
											return
										else
											dialog "[Velund's follower]"
											dialog "Your inventory is full. Free some "
											dialog "space and come back. "
											close
											return
										endif
									else
										dialog "[Velund's follower]"
										dialog "You don't have enough gems "
										dialog "for "+exchange_input+" cups of coffee."
										dialog "Come when you have more crystals."
										close
										return									
									endif
								break
								case 2
									dialog "[Velund's follower]"
									dialog "Okay. Come back if you want to "
									dialog "exchange. "
									close
									return
								break
							endchoose
						break
						case 2
						break
					endchoose
				elseif (v[Gray_Hollow] > 0) // Gray_Hollow instead of Gray_Hollow
					dialog "[Velund's follower]"
					dialog "I don’t sell my coffee, but... I "
					dialog "could trade it for something "
					dialog "unique. For example, what about "
					dialog "these shiny crystals in your "
					dialog "pocket? "
					wait
					dialog "Astonishingly! Eh, if I could "
					dialog "create something with them, they "
					dialog "would come in handy to me. "
					close
					return
				else
					dialog "[Velund's follower]"
					dialog "I don’t sell my coffee, but... I "
					dialog "could trade it for something "
					dialog "unique. "
					close
					return
				endif
			break
		endchoose
	elseif (v[jp_event50] == 3)
		choose menu "I have skyfire gems " "Tell me about Velund " "What smells so good? "
			case 1
				if (v[Gray_Hollow] >= 20) // Gray_Hollow instead of Gray_Hollow
					dialog "[Velund's follower]"
					dialog "No one will believe me! These are "
					dialog "skyfire gems! Let's have a look "
					dialog "at them. "
					wait
					dialog "[Velund's follower]"
					dialog "I have never seen so beautiful "
					dialog "gems! But, unfortunately, I want "
					dialog "to say that I do not have the "
					dialog "tools to work with such crystals. "
					wait
					dialog "[Velund's follower]"
					dialog "But a chance like that comes once "
					dialog "in a lifetime. We need to try "
					dialog "something out. "
					wait
					dialog "[Velund's follower]"
					dialog "I think it's worth visiting the "
					dialog "blacksmiths guild in the iron "
					dialog "city Einbroch. "
					wait
					dialog "[Velund's follower]"
					dialog "There are different master "
					dialog "blacksmiths, I bet they have "
					dialog "something special to work with "
					dialog "such materials. "
					wait
					dialog "[Velund's follower]"
					dialog "First of all, ask Eorlund, my old "
					dialog "teacher. All my knowledge of "
					dialog "blacksmithing comes from him. "
					setitem jp_event50 4
					dropitem Gray_Hollow 20 // Gray_Hollow instead of Gray_Hollow
					changequest 17302 17303
					close
					return
				elseif ((v[Gray_Hollow] > 0) & (v[Gray_Hollow] < 20)) // Gray_Hollow instead of Gray_Hollow
					dialog "[Velund's follower]"
					dialog "Wonderful! But this number of "
					dialog "gems is clearly not enough to "
					dialog "craft any items. I need more "
					dialog "gems. "
					close
					return
				else
					dialog "[Velund's follower]"
					dialog "Do not lie to me, I see that you "
					dialog "have nothing. "
					close
					return
				endif
			break
			case 2
				dialog "[Velund's follower]"
				dialog "Listen carefully, this is a very "
				dialog "interesting story. Velund is a "
				dialog "blacksmith god. "
				wait
				dialog "[Velund's follower]"
				dialog "He is not only an artisan. He is "
				dialog "a master, an artist who "
				dialog "understands the beauty of all "
				dialog "things. According to legends, "
				dialog "Velund was able to work with the "
				dialog "rarest gems. "
				wait
				dialog "[Velund's follower]"
				dialog "He personifies the earth - one of "
				dialog "the main elements. He transforms "
				dialog "materials, creating beautiful "
				dialog "works of art with the help of "
				dialog "fire - another strong element. "
				wait
				dialog "[Velund's follower]"
				dialog "Thus, Velund was able to empower "
				dialog "items with certain properties. "
				wait
				dialog "[Velund's follower]"
				dialog "Velund's fate is the greatest "
				dialog "example of dedication and hard "
				dialog "work. "
				wait
				dialog "[Velund's follower]"
				dialog "Once, when Velund was still "
				dialog "walking on the earth, the evil "
				dialog "king kidnapped him and imprisoned "
				dialog "him on island so that the master "
				dialog "would create only for him. "
				wait
				dialog "[Velund's follower]"
				dialog "Velund decided not to lose "
				dialog "heart. So he made the wings and "
				dialog "flew to Valhalla. "
				close
				return
			break
			case 3
				dialog "[Velund's follower]"
				dialog "It smells good, doesn't it? This "
				dialog "is freshly brewed coffee, I make "
				dialog "it by myself. It's the only thing "
				dialog "that helps me take off my "
				dialog "tiredness after a hard day. "
				wait
				if (v[jp_event51] == 0)
					choose menu "Can I try it? "
						case 1
							var item_check = GetInventoryRemainCount Coffee 1 // Coffee instead of Coffee
							if (item_check == 1)
								dialog "[Velund's follower]"
								dialog "Of course you can."
								getitem Coffee 1 // Coffee instead of Coffee
								setitem jp_event51 1										
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Velund's follower]"
								dialog "Your inventory is full. Free some "
								dialog "space and come back. "
								close
								return
							endif
						break
					endchoose
				elseif (v[jp_event50] >= 8)
					dialog "[Velund's follower]"
					dialog "I see you enjoyed my coffee, "
					dialog "would you like some more? "
					wait
					choose menu "I want more! " "I have to go"
						case 1
							dialog "[Velund's follower]"
							dialog "I can offer you coffee for the "
							dialog "two skyfire gems. "
							wait
							dialog "How many cups of coffee do you "
							dialog "want to get?  "
							wait
							dlgwrite 1 65000
							var exchange_input = input
							var cost = exchange_input * 2
							if input == 0
								dialog "[Velund's follower]"
								dialog "If you don't want to exchange, "
								dialog "why are you asking? "
								close
								return
							elseif error
								dialog "[Velund's follower]"
								dialog "Do you try to cheat? "
								close
								return	
							endif
							dialog ""+exchange_input+" cups of coffee for "+cost+" gems. Is it correct?"
							wait
							choose menu "Yes " "I change my mind. "
								case 1
									if v[Gray_Hollow] >= cost // Gray_Hollow instead of Gray_Hollow
										var item_check = GetInventoryRemainCount Coffee exchange_input // Coffee instead of Coffee
										if item_check == 1
											dropitem Gray_Hollow cost // Gray_Hollow instead of Gray_Hollow
											getitem Coffee exchange_input // Coffee instead of Coffee
											dialog "[Velund's follower]"
											dialog "Come if you want more."
											close
											return
										else
											dialog "[Velund's follower]"
											dialog "Your inventory is full. Free some "
											dialog "space and come back. "
											close
											return
										endif
									else
										dialog "[Velund's follower]"
										dialog "You don't have enough gems "
										dialog "for "+exchange_input+" cups of coffee."
										dialog "Come when you have more crystals."
										close
										return									
									endif
								break
								case 2
									dialog "[Velund's follower]"
									dialog "Okay. Come back if you want to "
									dialog "exchange. "
									close
									return
								break
							endchoose
						break
						case 2
						break
					endchoose
				elseif (v[Gray_Hollow] > 0) // Gray_Hollow instead of Gray_Hollow
					dialog "[Velund's follower]"
					dialog "I don’t sell my coffee, but... I "
					dialog "could trade it for something "
					dialog "unique. For example, what about "
					dialog "these shiny crystals in your "
					dialog "pocket? "
					wait
					dialog "Astonishingly! Eh, if I could "
					dialog "create something with them, they "
					dialog "would come in handy to me. "
					close
					return
				else
					dialog "[Velund's follower]"
					dialog "I don’t sell my coffee, but... I "
					dialog "could trade it for something "
					dialog "unique. "
					close
					return
				endif
			break
		endchoose
	elseif (v[jp_event50] == 7)
		choose menu "I have a special tool" "Tell me about Velund " "What smells so good? "
			case 1
				if (v[Gold_Hammer] > 0) // Gold_Hammer instead of Gold_Hammer
					var item_check = GetInventoryRemainCount Gold_Tiara 1
					if (item_check == 1)
						dialog "[Velund's follower]"
						dialog "Yes, that's what I need. With "
						dialog "such a tool I can handle these "
						dialog "gems. "
						wait
						dialog "[Velund's follower]"
						dialog "Well, with the gems you brought, "
						dialog "I can make you an amazing tiara. "
						wait
						dialog "[Velund's follower]"
						dialog "Wait a minute..."
						wait
						dialog "[Velund's follower]"
						dialog "Done! Not bad, isn't it? This "
						dialog "diadem with the special power. Of "
						dialog "course, I'm not a god, but I am a "
						dialog "proficient blacksmith. "
						setitem jp_event50 8
						getitem Gold_Tiara 1
						completequest 17305
						close
						return
					else
						dialog "[Velund's follower]"
						dialog "Your inventory is full. Free some "
						dialog "space and come back. "
						close
						return
					endif
				else
					dialog "[Velund's follower]"
					dialog "Do not lie to me, I see that you "
					dialog "have nothing. "
					close
					return
				endif
			break
			case 2
				dialog "[Velund's follower]"
				dialog "Listen carefully, this is a very "
				dialog "interesting story. Velund is a "
				dialog "blacksmith god. "
				wait
				dialog "[Velund's follower]"
				dialog "He is not only an artisan. He is "
				dialog "a master, an artist who "
				dialog "understands the beauty of all "
				dialog "things. According to legends, "
				dialog "Velund was able to work with the "
				dialog "rarest gems. "
				wait
				dialog "[Velund's follower]"
				dialog "He personifies the earth - one of "
				dialog "the main elements. He transforms "
				dialog "materials, creating beautiful "
				dialog "works of art with the help of "
				dialog "fire - another strong element. "
				wait
				dialog "[Velund's follower]"
				dialog "Thus, Velund was able to empower "
				dialog "items with certain properties. "
				wait
				dialog "[Velund's follower]"
				dialog "Velund's fate is the greatest "
				dialog "example of dedication and hard "
				dialog "work. "
				wait
				dialog "[Velund's follower]"
				dialog "Once, when Velund was still "
				dialog "walking on the earth, the evil "
				dialog "king kidnapped him and imprisoned "
				dialog "him on island so that the master "
				dialog "would create only for him. "
				wait
				dialog "[Velund's follower]"
				dialog "Velund decided not to lose "
				dialog "heart. So he made the wings and "
				dialog "flew to Valhalla. "
				close
				return
			break
			case 3
				dialog "[Velund's follower]"
				dialog "It smells good, doesn't it? This "
				dialog "is freshly brewed coffee, I make "
				dialog "it by myself. It's the only thing "
				dialog "that helps me take off my "
				dialog "tiredness after a hard day. "
				wait
				if (v[jp_event51] == 0)
					choose menu "Can I try it? "
						case 1
							var item_check = GetInventoryRemainCount Coffee 1 // Coffee instead of Coffee
							if (item_check == 1)
								dialog "[Velund's follower]"
								dialog "Of course you can."
								getitem Coffee 1 // Coffee instead of Coffee
								setitem jp_event51 1										
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Velund's follower]"
								dialog "Your inventory is full. Free some "
								dialog "space and come back. "
								close
								return
							endif
						break
					endchoose
				elseif (v[jp_event50] >= 8)
					dialog "[Velund's follower]"
					dialog "I see you enjoyed my coffee, "
					dialog "would you like some more? "
					wait
					choose menu "I want more! " "I have to go"
						case 1
							dialog "[Velund's follower]"
							dialog "I can offer you coffee for the "
							dialog "two skyfire gems. "
							wait
							dialog "How many cups of coffee do you "
							dialog "want to get?  "
							wait
							dlgwrite 1 65000
							var exchange_input = input
							var cost = exchange_input * 2
							if input == 0
								dialog "[Velund's follower]"
								dialog "If you don't want to exchange, "
								dialog "why are you asking? "
								close
								return
							elseif error
								dialog "[Velund's follower]"
								dialog "Do you try to cheat? "
								close
								return	
							endif
							dialog ""+exchange_input+" cups of coffee for "+cost+" gems. Is it correct?"
							wait
							choose menu "Yes " "I change my mind. "
								case 1
									if v[Gray_Hollow] >= cost // Gray_Hollow instead of Gray_Hollow
										var item_check = GetInventoryRemainCount Coffee exchange_input // Coffee instead of Coffee
										if item_check == 1
											dropitem Gray_Hollow cost // Gray_Hollow instead of Gray_Hollow
											getitem Coffee exchange_input // Coffee instead of Coffee
											dialog "[Velund's follower]"
											dialog "Come if you want more."
											close
											return
										else
											dialog "[Velund's follower]"
											dialog "Your inventory is full. Free some "
											dialog "space and come back. "
											close
											return
										endif
									else
										dialog "[Velund's follower]"
										dialog "You don't have enough gems "
										dialog "for "+exchange_input+" cups of coffee."
										dialog "Come when you have more crystals."
										close
										return									
									endif
								break
								case 2
									dialog "[Velund's follower]"
									dialog "Okay. Come back if you want to "
									dialog "exchange. "
									close
									return
								break
							endchoose
						break
						case 2
						break
					endchoose
				elseif (v[Gray_Hollow] > 0) // Gray_Hollow instead of Gray_Hollow
					dialog "[Velund's follower]"
					dialog "I don’t sell my coffee, but... I "
					dialog "could trade it for something "
					dialog "unique. For example, what about "
					dialog "these shiny crystals in your "
					dialog "pocket? "
					wait
					dialog "Astonishingly! Eh, if I could "
					dialog "create something with them, they "
					dialog "would come in handy to me. "
					close
					return
				else
					dialog "[Velund's follower]"
					dialog "I don’t sell my coffee, but... I "
					dialog "could trade it for something "
					dialog "unique. "
					close
					return
				endif
			break
		endchoose
	else
		choose menu "What smells so good? " "Tell me about Velund " "How can I find skyfire gems?"
			case 1
				dialog "[Velund's follower]"
				dialog "It smells good, doesn't it? This "
				dialog "is freshly brewed coffee, I make "
				dialog "it by myself. It's the only thing "
				dialog "that helps me take off my "
				dialog "tiredness after a hard day. "
				wait
				if (v[jp_event51] == 0)
					choose menu "Can I try it? "
						case 1
							var item_check = GetInventoryRemainCount Coffee 1 // Coffee instead of Coffee
							if (item_check == 1)
								dialog "[Velund's follower]"
								dialog "Of course you can."
								getitem Coffee 1 // Coffee instead of Coffee
								setitem jp_event51 1										
								close
								return
							elseif ((item_check == 2) | (item_check == 3))
								dialog "[Velund's follower]"
								dialog "Your inventory is full. Free some "
								dialog "space and come back. "
								close
								return
							endif
						break
					endchoose
				elseif (v[jp_event50] >= 8)
					dialog "[Velund's follower]"
					dialog "I see you enjoyed my coffee, "
					dialog "would you like some more? "
					wait
					choose menu "I want more! " "I have to go"
						case 1
							dialog "[Velund's follower]"
							dialog "I can offer you coffee for the "
							dialog "two skyfire gems. "
							wait
							dialog "How many cups of coffee do you "
							dialog "want to get?  "
							wait
							dlgwrite 1 65000
							var exchange_input = input
							var cost = exchange_input * 2
							if input == 0
								dialog "[Velund's follower]"
								dialog "If you don't want to exchange, "
								dialog "why are you asking? "
								close
								return
							elseif error
								dialog "[Velund's follower]"
								dialog "Do you try to cheat? "
								close
								return	
							endif
							dialog ""+exchange_input+" cups of coffee for "+cost+" gems. Is it correct?"
							wait
							choose menu "Yes " "I change my mind. "
								case 1
									if v[Gray_Hollow] >= cost // Gray_Hollow instead of Gray_Hollow
										var item_check = GetInventoryRemainCount Coffee exchange_input // Coffee instead of Coffee
										if item_check == 1
											dropitem Gray_Hollow cost // Gray_Hollow instead of Gray_Hollow
											getitem Coffee exchange_input // Coffee instead of Coffee
											dialog "[Velund's follower]"
											dialog "Come if you want more."
											close
											return
										else
											dialog "[Velund's follower]"
											dialog "Your inventory is full. Free some "
											dialog "space and come back. "
											close
											return
										endif
									else
										dialog "[Velund's follower]"
										dialog "You don't have enough gems "
										dialog "for "+exchange_input+" cups of coffee."
										dialog "Come when you have more crystals."
										close
										return									
									endif
								break
								case 2
									dialog "[Velund's follower]"
									dialog "Okay. Come back if you want to "
									dialog "exchange. "
									close
									return
								break
							endchoose
						break
						case 2
						break
					endchoose
				elseif (v[Gray_Hollow] > 0) // Gray_Hollow instead of Gray_Hollow
					dialog "[Velund's follower]"
					dialog "I don’t sell my coffee, but... I "
					dialog "could trade it for something "
					dialog "unique. For example, what about "
					dialog "these shiny crystals in your "
					dialog "pocket? "
					wait
					dialog "Astonishingly! Eh, if I could "
					dialog "create something with them, they "
					dialog "would come in handy to me. "
					close
					return
				else
					dialog "[Velund's follower]"
					dialog "I don’t sell my coffee, but... I "
					dialog "could trade it for something "
					dialog "unique. "
					close
					return
				endif
			break
			case 2
				dialog "[Velund's follower]"
				dialog "Listen carefully, this is a very "
				dialog "interesting story. Velund is a "
				dialog "blacksmith god. "
				wait
				dialog "[Velund's follower]"
				dialog "He is not only an artisan. He is "
				dialog "a master, an artist who "
				dialog "understands the beauty of all "
				dialog "things. According to legends, "
				dialog "Velund was able to work with the "
				dialog "rarest gems. "
				wait
				dialog "[Velund's follower]"
				dialog "He personifies the earth - one of "
				dialog "the main elements. He transforms "
				dialog "materials, creating beautiful "
				dialog "works of art with the help of "
				dialog "fire - another strong element. "
				wait
				dialog "[Velund's follower]"
				dialog "Thus, Velund was able to empower "
				dialog "items with certain properties. "
				wait
				dialog "[Velund's follower]"
				dialog "Velund's fate is the greatest "
				dialog "example of dedication and hard "
				dialog "work. "
				wait
				dialog "[Velund's follower]"
				dialog "Once, when Velund was still "
				dialog "walking on the earth, the evil "
				dialog "king kidnapped him and imprisoned "
				dialog "him on island so that the master "
				dialog "would create only for him. "
				wait
				dialog "[Velund's follower]"
				dialog "Velund decided not to lose "
				dialog "heart. So he made the wings and "
				dialog "flew to Valhalla. "
				close
				return
			break
			case 3
				dialog "[Velund's follower]"
				dialog "They are rumored to be located "
				dialog "right around the cities. "
				wait
				dialog "[Velund's follower]"
				dialog "In addition to the fields around "
				dialog "cities, I advise you to pay "
				dialog "attention to the Mjollnir "
				dialog "mountains. According to legends, "
				dialog "it was the first place, where "
				dialog "Velund found skyfire gems. "
				close
				return
			break
		endchoose
	endif
return

npc "ein_in01" "Eorlund " 4_M_DWARF 31 26 5 0 0
OnClick:
	dialog "[Eorlund]"
	dialog "Greetings. Do you feel a metallic "
	dialog "taste in your mouth? I've been "
	dialog "feeling it for 30 years. How can "
	dialog "I help you? "
	wait
	if (v[jp_event50] == 4)
		choose menu "Tell about skyfire gems " "I think you can help me... " 
			case 1
				dialog "[Eorlund]"
				dialog "The phenomenon is truly unique, I "
				dialog "heard about these skyfire gems, "
				dialog "but did not think they existed. "
				wait
				dialog "[Eorlund]"
				dialog "Of course, this story is very "
				dialog "interesting, but I have too much "
				dialog "work to do. "
				close
				return
			break
			case 2
				dialog "[Eorlund]"
				dialog "Let me see this gem..."
				wait
				dialog "[Eorlund]"
				dialog "Quite an unusual gem type, but I "
				dialog "think I have the right tool for "
				dialog "him. "
				wait
				dialog "[Eorlund]"
				dialog "If you have decided to do "
				dialog "something unusual, it can be "
				dialog "interesting for me to participate "
				dialog "in it. "
				wait
				dialog "[Eorlund]"
				dialog "I would go for a special tool "
				dialog "right now, but I have so much to "
				dialog "do ... "
				wait
				choose menu "I can help you... " "I have to go "
					case 1
						dialog "[Eorlund]"
						dialog "Very nice! I need to get a weekly "
						dialog "order from the armory, go and ask "
						dialog "about it. "
						setitem jp_event50 5
						changequest 17303 17304
						close
						return
					break
					case 2
						close
						return
					break
				endchoose
			break
		endchoose
	elseif (v[jp_event50] == 6)
		choose menu "Tell about skyfire gems " "I found out about the order "
			case 1
				dialog "[Eorlund]"
				dialog "The phenomenon is truly unique, I "
				dialog "heard about these skyfire gems, "
				dialog "but did not think they existed. "
				wait
				dialog "[Eorlund]"
				dialog "Of course, this story is very "
				dialog "interesting, but I have too much "
				dialog "work to do. "
				close
				return
			break
			case 2
				var item_check = GetInventoryRemainCount Gold_Hammer 1  // Gold_Hammer instead of Gold_Hammer
				if (item_check == 1)
					dialog "[Eorlund]"
					dialog "Well, finally. Where have you "
					dialog "been? I have been already "
					dialog "thinking to go myself. "
					wait
					dialog "[Eorlund]"
					dialog "Everything as usual, but... 40 "
					dialog "daggers? It looks like someone is "
					dialog "going to equip an army. Well, or "
					dialog "equip a kitchen. "
					wait
					dialog "[Eorlund]"
					dialog "Well, hold this hammer, you can "
					dialog "craft with it an equipment you "
					dialog "need from these gems. "
					setitem jp_event50 7
					getitem Gold_Hammer 1	 // Gold_Hammer instead of Gold_Hammer
					changequest 17304 17305
					close
					return
				else
					dialog "[Eorlund]"
					dialog "Your inventory is full. Free some "
					dialog "space and come back. "
					close
					return
				endif
			break
		endchoose
	else 
		choose menu "Tell about skyfire gems " 
			case 1
				dialog "[Eorlund]"
				dialog "The phenomenon is truly unique, I "
				dialog "heard about these skyfire gems, "
				dialog "but did not think they existed. "
				wait
				dialog "[Eorlund]"
				dialog "Of course, this story is very "
				dialog "interesting, but I have too much "
				dialog "work to do. "
				close
				return
			break
		endchoose
	endif
return

npc "ein_in01" "Manager " 2_M_SWORDMASTER 97 26 5 0 0
OnClick:
	dialog "[Manager]"
	dialog "If you come here for a weapon, "
	dialog "you should ask traders in the "
	dialog "middle. "
	wait
	if (v[jp_event50] == 5)
		choose menu "Ask about order for Eorlund " "How are the sales? "
			case 1
				dialog "[Manager]"
				dialog "Sales were not so bad this week. "
				dialog "Let's see ... "
				wait
				dialog "[Manager]"
				dialog "3 rapiers, lance, hammer and 40 "
				dialog "daggers. Come back and tell "
				dialog "Eorlund about this. "
				setitem jp_event50 6
				close
				return
			break
			case 2
				dialog "[Manager]"
				dialog "Sales are going well, as they are "
				dialog "throughout Einbroch. Metals are "
				dialog "really needed nowadays. "
				close
				return
			break
		endchoose
	else
		choose menu "How are the sales?"
			case 1
				dialog "[Manager]"
				dialog "Sales are going well, as they are "
				dialog "throughout Einbroch. Metals are "
				dialog "really needed nowadays. "
				close
				return
			break
		endchoose
	endif
return

npc "prontera" "Explorer " 4_M_SAGE_A 148 29 0 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "prontera" "Explorer " 4_M_SAGE_A 279 208 3 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "prontera" "Explorer " 4_M_SAGE_A 159 326 3 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "prontera" "Explorer " 4_M_SAGE_A 29 210 6 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "payon" "Explorer " 4_M_SAGE_A 221 83 3 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "alberta" "Explorer " 4_M_SAGE_A 25 238 4 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "aldebaran" "Explorer " 4_M_SAGE_A 139 69 4 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "geffen" "Explorer " 4_M_SAGE_A 199 123 3 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "morocc" "Explorer " 4_M_SAGE_A 156 291 6 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "comodo" "Explorer " 4_M_SAGE_A 179 349 4 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "hugel" "Explorer " 4_M_SAGE_A 93 56 5 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "yuno" "Explorer " 4_M_SAGE_A 162 47 4 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "einbroch" "Explorer " 4_M_SAGE_A 152 51 4 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "lighthalzen" "Explorer " 4_M_SAGE_A 218 320 3 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return
npc "rachel" "Explorer " 4_M_SAGE_A 38 130 4 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return

npc "veins" "Explorer " 4_M_SAGE_A 144 34 3 0 0
OnClick:
	dialog "[Explorer]"
	dialog "Good afternoon! Nice weather, "
	dialog "isn't it? Of course it will be "
	dialog "sunny exactly until I want to "
	dialog "take a walk ... "
	wait
	if (v[jp_event50] == 1)
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				wait
				choose menu "Tell me about these crystals "
					case 1
						dialog "[Explorer]"
						dialog "I have never seen such crystals "
						dialog "before. Despite the fact that I "
						dialog "often explore these lands.  "
						wait
						dialog "[Explorer]"
						dialog "I could not get it out of the "
						dialog "ground, but I can swear that it "
						dialog "glowed! "
						wait
						dialog "[Explorer]"
						dialog "But you don't seem to believe me..."
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
		choose menu "Remind me about crystals " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. "
				wait
				dialog "[Explorer]"
				dialog "I have never seen such crystals "
				dialog "before. Despite the fact that I "
				dialog "often explore these lands.  "
				wait
				dialog "[Explorer]"
				dialog "I could not get it out of the "
				dialog "ground, but I can swear that it "
				dialog "glowed! "
				close
				return
			break
			case 2
			break
		endchoose
	else
		choose menu "Have you seen anything unusual? " "I have to go "
			case 1
				dialog "[Explorer]"
				dialog "I have often seen crystals last "
				dialog "days appearing from the ground, "
				dialog "right on the fields around the "
				dialog "city. Unusual, right? "
				close
				return
			break
			case 2
			break
		endchoose
	endif
return
