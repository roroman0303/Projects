import re
import module.patterns
import module.files as files

with open("MapTypeProperty.txt", "r", encoding='EUC-KR') as file:
	lines = file.read().splitlines()

categories = list()
for line in lines:
	if line.startswith('MAPTYPE'):
		categories.append('===================================================')
		categories.append(line)
		categories.append('===================================================')

	line = line.replace(' ','')
	if re.search(r'^\s*ADD_PROPERTY\(TELEPORT,FALSE\)', line):
		categories.append('• Нельзя использовать телепорт')
	elif re.search(r'^\s*ADD_PROPERTY\(NOTREMEMBER,TRUE\)', line):
		categories.append('• Нельзя использовать /memo')
	elif re.search(r'^\s*ADD_PROPERTY\(PK,TRUE\)', line):
		categories.append('• Разрешено PVP')
	elif re.search(r'^\s*ADD_PROPERTY\(PARTY,TRUE\)', line):
		categories.append('• Разрешено PVP внутри группы')
	elif re.search(r'^\s*ADD_PROPERTY\(GUILD,TRUE\)', line):
		categories.append('• Разрешено PVP внутри гильдии')
	elif re.search(r'^\s*ADD_PROPERTY\(SIEGE,TRUE\)', line):
		categories.append('• Режим осады')
	elif re.search(r'^\s*ADD_PROPERTY\(BATTLEFIELD,TRUE\)', line):
		categories.append('• Поле боя')
	elif re.search(r'^\s*ADD_PROPERTY\(EXP,FALSE\)', line):
		categories.append('• Нет потери опыта при смерти')
	elif re.search(r'^\s*ADD_PROPERTY\(DISCONNECT_NOTREMEMBER,TRUE\)', line):
		categories.append('• При вылете кик с локации')
	elif re.search(r'^\s*ADD_PROPERTY\(CALLMONSTER,TRUE\)', line):
		categories.append('• Разрешены ветки')
	elif re.search(r'^\s*ADD_PROPERTY\(DENYSKILL,TRUE\)', line):
		categories.append('• Нельзя использовать скиллы')
	elif re.search(r'^\s*ADD_PROPERTY\(DENY_BUTTERFLY,TRUE\)', line):
		categories.append('• Запрещены крылья бабочки')
	elif re.search(r'^\s*ADD_PROPERTY\(TURBOTRACK,TRUE\)', line):
		categories.append('• Запрещены Ice Wall, Endure, Warp Portal, Infinite Date, Hiding, Cloaking и Chase Walk')
	elif re.search(r'^\s*ADD_PROPERTY\(USE_SIMPLE_EFFECT,TRUE\)', line):
		categories.append('• Упрощенные эффекты')
	elif re.search(r'^\s*ADD_PROPERTY\(LONG_INSUPERABLE_TIME,TRUE\)', line):
		categories.append('• Неуязвимость после тп')
	elif re.search(r'^\s*ADD_PROPERTY\(DISABLE_KNOCKBACK,TRUE\)', line):
		categories.append('• Невозможно отбрасывание')
	elif re.search(r'^\s*ADD_PROPERTY_VALUE\(NORMAL_DAMAGE,', line):
		categories.append('• Урезка физ.урона')
	elif re.search(r'^\s*ADD_PROPERTY_VALUE\(RANGE_DAMAGE,', line):
		categories.append('• Урезка дальнего физ.урона')
	elif re.search(r'^\s*ADD_PROPERTY_VALUE\(ALL_SKILL_DAMAGE,', line):
		categories.append('• Урезка урона от скиллов')
	elif re.search(r'^\s*ADD_PROPERTY_VALUE\(GOTOTOWN,', line):
		categories.append('• В город после нескольких смертей')
	elif re.search(r'^\s*ADD_PROPERTY\(TAMINGMONSTER,FALSE\)', line):
		categories.append('• Нельзя приручать мобов')
	elif re.search(r'^\s*ADD_PROPERTY\(PREVENT_GUILD_MAKE,TRUE\)', line):
		categories.append('• Запрещает создание гильдии')
	elif re.search(r'^\s*ADD_PROPERTY\(PREVENT_PARTY_MAKE,TRUE\)', line):
		categories.append('• Запрещает создание группы')
	elif re.search(r'^\s*ADD_PROPERTY\(PREVENT_PARTY_JOIN,TRUE\)', line):
		categories.append('• Запрещает вступление в группу')
	elif re.search(r'^\s*ADD_PROPERTY\(PREVENT_PARTY_LEAVE,TRUE\)', line):
		categories.append('• Нельзя выйти из группы')
	elif re.search(r'^\s*ADD_PROPERTY\(PREVENT_PARTY_EXPEL,TRUE\)', line):
		categories.append('• Нельзя выгнать из группы')
	elif re.search(r'^\s*ADD_PROPERTY\(PREVENT_PARTY_MASTER_CHANGE,TRUE\)', line):
		categories.append('• Нельзя менять главу группы')




files.write_lines(categories, 'categories.txt')