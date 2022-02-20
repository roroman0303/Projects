import re

dialog = r'dialog\s+(".+")\s*' # 1-текст диалога
broadcastinmap = r'broadcastinmap\s+(".+")' # 1-текст
broadcastinmap2 = r'broadcastinmap2\s+\S+\s+\S+\s+\d+\s+\d+\s+\d+\s+(".+")' # 1-текст
choose_menu = r'choose menu\s+(".+")(\s+".+")*' # 1-тексты выборов
moveto = r'moveto\s+(\S+)\s+(\d+\s+\d+)' # 1-карта 2-координаты
getitem = r'getitem\s+(\S+)\s+(\d+)' # 1-предмет 2-количество
dropitem = r'dropitem\s+(\S+)\s+(\d+)' # 1-предмет 2-количество
warp = r'warp\s+(\S+)\s+(\S+)\s+(\d+\s+\d+)' # 1-карта 2-имя 3-координаты
sellitem = r'sellitem\s+(\S+)' # 1-предмет
callmonster = r'callmonster\s+(\S+)\s+(\S+)\s+(".+")\s+(\d+\s+\d+)' # 1-карта 2-имя моба в бд 3-имя моба в игре 4-координаты
putmob = r'putmob[2]*\s+(\S+)\s+(\d+\s+\d+)\s+\d+\s+\d+\s+\d+\s+(\S+)' # 1-карта 2-имя моба в бд
putboss = r'putboss\s+(\S+)\s+(\d+\s+\d+)\s+\d+\s+\d+\s+\d+\s+(\S+)' # 1-карта 2-имя босса в бд
npc = r'npc\s+(".+")\s+(".+")\s+\S+\s+(\d+\s+\d+)' # 1-карта 2-имя 3-координаты
trader = r'trader\s+(".+")\s+(".+")\s+\S+\s+(\d+\s+\d+)' # 1-карта 2-имя 3-координаты
MonsterTalkShow = r'MonsterTalkShow\s+(".+")\s+(".+")' # 1-имя 2-текст
Talk2me = r'Talk2me\s+(".+")\s+(".+")' # 1-имя 2-текст
TalkShow = r'TalkShow\s+(".+")\s+(".+")' # 1-имя 2-текст

MD_Npc = r'MD_Npc\s+(".+")\s+(".+")\s+\S+\s+(\d+\s+\d+)' # 1-карта 2-имя 3-координаты
MD_Putmob = r'MD_Putmob\s+(\S+)\s+(\d+\s+\d+)\s+\d+\s+\d+\s+\d+\s+(\S+)' # 1-карта 2-имя моба в бд
GetMDMapName = r'GetMDMapName\s+(\S+)' # 1-карта
MD_Warp = r'MD_Warp\s+(\S+)\s+(\S+)\s+(\d+\s+\d+)' # 1-карта 2-имя 3-координаты

COLOR = r'\^([0-9a-fA-F]+)([^\^]*)\^000000' # 1-цвет 2-текст
LINK = r'<(.+)>(.+)<INFO>(.*)</INFO><.+>' # 1-тип 2-текст 3-ссылка

mobdef = r'^\s*mob\s+(\S+)\s+(".+")\s+\S+'