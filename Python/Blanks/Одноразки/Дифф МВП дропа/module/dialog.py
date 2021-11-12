import re
from module.translate import translate
import module.files as files
import module.patterns as patterns

# === соединяет блоки строк в одну строку ===
def join(lines):
    for i in range(len(lines) - 2):
        try:
            while re.search(patterns.dialog, lines[i]) and re.search(patterns.dialog, lines[i+1]):
                if re.search(r"dialog\s+\"\[", lines[i]):
                    break  # имена пропускаем
                elif '+' in lines[i] or '+' in lines[i + 1]:
                    break  # конкатенации пропускаем
                else:
                    tabs = lines[i].split("dialog")[0]
                    first_line = lines[i].split("\"")[1]
                    second_line = lines[i + 1].split("\"")[1]
                    new_line = tabs + 'dialog \"{} {}\"'.format(first_line, second_line)
                    if '    ' in new_line: new_line = new_line.replace('    ', '\t')
                    lines[i] = new_line.replace("  ", " ")
                    del lines[i + 1]
        except IndexError:
            break
    lines = ru_endings(lines)
    print("\033[32mСтроки пересобраны.\033[0m")
    return lines


# === добавляет в конце русских строк пробелы ===
def ru_endings(lines):
    text = '\n'.join(lines)
    alph = (
        'й', 'ц', 'у', 'к', 'е', 'н', 'г', 'ш', 'щ', 'з', 'х',
        'ъ', 'ф', 'ы', 'в', 'а', 'п', 'р', 'о', 'л', 'д', 'ж',
        'э', 'я', 'ч', 'с', 'м', 'и', 'т', 'ь', 'б', 'ю', 'ё',)
    for let in alph:
        if let + '\"' in text.lower(): text = text.replace(let + '\"', let + ' \"')
    print("\033[32mРусские окончания обработаны.\033[0m")
    return text.splitlines()

# === создаёт словарь имя - переведённое имя для нпс ===
def translate_npc(lines, lang_in, lang_out):
    npc = dict()
    for line in lines:
        search = re.search(patterns.npc, line)
        if search: pass
        else: search = re.search(patterns.MD_Npc, line)
        if search:
            name = search.group(2).replace("\"",'')
            if '#' in name: name = name.split('#')[0]
            translated_name = translate(name, lang_out, lang_in)
            if name not in npc:
                npc[name] = translated_name
                print('НПС : ' + name + ' -> ' + translated_name)
    return npc

# === создаёт словарь имя - переведённое имя для монстров ===
def translate_monster(lines, lang_in, lang_out):
    mob = dict()
    for line in lines:
        search = re.search(patterns.callmonster, line)
        if search:
            name = search.group(3).replace("\"",'')
            if '#' in name: name = name.split('#')[0]
            translated_name = translate(name, lang_out, lang_in)
            if name not in mob:
                mob[name] = translated_name
                print('Моб : ' + name + ' -> ' + translated_name)
    return mob

# === убирает комменты ===
def delete_comments(lines):
    for line in lines:
        if '//' in line:
            line = line.replace('//'+line.split('//')[1], '')
    print("\033[32mКомментарии убраны.\033[0m")
    return lines

# === исправляет текст после перевода ===
def decorate_text(text):
    if '^ ' in text: text = text.replace('^ ', '^')
    if ' ...' in text: text = text.replace(' ...', '...')
    if ' ^000000' in text: text = text.replace(' ^000000', '^000000')
    if ' ^0000cd ' in text.lower():
        text = text.replace(' ^0000cd ', ' ^0000cd')
        text = text.replace(' ^0000CD ', ' ^0000CD')
    if re.search(r'(>\s+<)', text):
        text = text.replace(re.search(r'(>\s+<)', text).group(1), '><')
    if '<' in text:
        for i in range(text.count('<')):
            tag = text.split('<')[i+1].split('>')[0]
            text = text.replace(tag, tag.replace(' ', ''))
    if '<INFO>' in text:
        for i in range(text.count('<INFO>')):
            info = text.split('<INFO>')[i+1].split('</INFO>')[0]
            text = text.replace(info, info.replace(' ', ''))
    if ' <INFO>' in text: text = text.replace(' <INFO>', '<INFO>')
    if '<NAVI> ' in text: text = text.replace('<NAVI> ', '<NAVI>')
    if '<URL> ' in text: text = text.replace('<URL> ', '<URL>')
    if '<ITEM> ' in text: text = text.replace('<ITEM> ', '<ITEM>')
    if '[ ' in text: text = text.replace('[ ', '[')
    if ' ]' in text: text = text.replace(' ]', ']')
    text = text.replace('  ', ' ')
    #print("\033[32mТекст исправлен.\033[0m")
    return text

# === перевод файла и выход в качестве строк ===
def translate_dialogs(lines, lang_in, lang_out):
    translated_lines = list()
    # === пересбор строк ===
    lines = join(lines)
    # === убираем комменты ===
    lines = delete_comments(lines)
    # === для состояния в консоли ===
    length = len(lines)
    line_counter = 0
    # === перевод сразу всех нпс и мобов, чтобы они везде были с одним именем ===
    npc = translate_npc(lines, lang_in, lang_out)
    monster = translate_monster(lines, lang_in, lang_out)
    # === перевод всех строк ===
    for line in lines:
        if re.search(patterns.LINK, line): link_info = line.split('<INFO>')[1].split('</INFO>')[0]
        # === заменяет имена нпс и мобов на переведенные ===
        for str_count in range(line.count('\"') // 2):
            text = line.split('\"')[str_count*2+1]
            if re.search(patterns.callmonster, line) or re.search(patterns.MonsterTalkShow, line):
                for mob_old_name, mob_new_name in monster.items():
                    translated_text = text.replace(mob_old_name, mob_new_name)
                    line = line.replace(text, translated_text)
            if re.search(patterns.dialog, line) or re.search(patterns.Talk2me, line) or re.search(patterns.npc, line):
                for npc_old_name, npc_new_name in npc.items():
                    translated_text = text.replace(npc_old_name, npc_new_name)
                    line = line.replace(text, translated_text)
        # === перевод текстов ===
        if re.search(patterns.dialog, line):
            text = re.search(patterns.dialog, line).group(1).replace('\"','')
            translated_text = translate(text, lang_out, lang_in)
            translated_text = decorate_text(translated_text)
            line = line.replace(text, translated_text)
            print('Строка {}/{}: {} -> {}'.format(line_counter, length, text, translated_text))
        elif re.search(patterns.Talk2me, line):
            text = re.search(patterns.Talk2me, line).group(2).replace('\"','')
            translated_text = translate(text, lang_out, lang_in)
            translated_text = decorate_text(translated_text)
            line = line.replace(text, translated_text)
            print('Строка {}/{}: {} -> {}'.format(line_counter, length, text, translated_text))
        elif re.search(patterns.choose_menu, line):
            for choose_count in range(line.count('\"') // 2):
                text = line.split("\"")[choose_count*2+1]
                translated_text = translate(text, lang_out, lang_in)
                line = line.replace(text, translated_text)
                print('Строка {}/{}: {} -> {}'.format(line_counter, length, text, translated_text))
            line = decorate_text(line)
        elif re.search(patterns.TalkShow, line):
            text = re.search(patterns.TalkShow, line).group(2).replace('\"','')
            translated_text = translate(text, lang_out, lang_in)
            translated_text = decorate_text(translated_text)
            line = line.replace(text, translated_text)
            print('Строка {}/{}: {} -> {}'.format(line_counter, length, text, translated_text))
        elif re.search(patterns.broadcastinmap, line):
            text = re.search(patterns.broadcastinmap, line).group(1).replace('\"','')
            translated_text = translate(text, lang_out, lang_in)
            translated_text = decorate_text(translated_text)
            line = line.replace(text, translated_text)
            print('Строка {}/{}: {} -> {}'.format(line_counter, length, text, translated_text))
        elif re.search(patterns.broadcastinmap2, line):
            text = re.search(patterns.broadcastinmap2, line).group(1).replace('\"','')
            translated_text = translate(text, lang_out, lang_in)
            translated_text = decorate_text(translated_text)
            line = line.replace(text, translated_text)
            print('Строка {}/{}: {} -> {}'.format(line_counter, length, text, translated_text))
        elif re.search(patterns.MonsterTalkShow, line):
            text = re.search(patterns.MonsterTalkShow, line).group(2).replace('\"','')
            translated_text = translate(text, lang_out, lang_in)
            translated_text = decorate_text(translated_text)
            line = line.replace(text, translated_text)
            print('Строка {}/{}: {} -> {}'.format(line_counter, length, text, translated_text))
        elif re.search(patterns.MonsterTalkShow, line):
            text = re.search(patterns.MonsterTalkShow, line).group(2).replace('\"','')
            translated_text = translate(text, lang_out, lang_in)
            translated_text = decorate_text(translated_text)
            line = line.replace(text, translated_text)
            print('Строка {}/{}: {} -> {}'.format(line_counter, length, text, translated_text))
        elif re.search(patterns.Talk2me, line):
            text = re.search(patterns.Talk2me, line).group(2).replace('\"','')
            translated_text = translate(text, lang_out, lang_in)
            translated_text = decorate_text(translated_text)
            line = line.replace(text, translated_text)
            print('Строка {}/{}: {} -> {}'.format(line_counter, length, text, translated_text))
        # === восстанавливает ссылки ===
        if re.search(patterns.LINK, line):
            broken_link = line.split('<INFO>')[1].split('</INFO>')[0]
            line = line.replace(broken_link, link_info)
        translated_lines.append(line)
        line_counter = line_counter + 1
    print("\033[32mТекст переведён.\033[0m")

    return translated_lines

def get_dialogs(lines):
    # === пересбор диалогов ===
    lines = join(lines)
    all_dialogs = list()
    # === получение всех диалогов ===
    for line in lines:
        if re.search(patterns.dialog, line):
            text = re.search(patterns.dialog, line)
            all_dialogs.append(text)
    print("\033[32mДиалоги выделены.\033[0m")
    return all_dialogs

# === деление строк диалогов по 35 символов ===
def split(lines):
    # === пересбор строк ===
    lines = join(lines)
    # === деление строк ===
    split_lines = list()
    for line in lines:
        if re.search(patterns.dialog, line):
            tabs = line.split("dialog")[0] # табуляции и пробелы в начале
            text = re.search(patterns.dialog, line).group(1).replace('\"','') # текст диалога
            text = decorate_text(text)
            # === подсчёт символов диалога ===
            char_count = len(text)
            if re.search(patterns.COLOR, text):
                colors = text.count("^") # выделения цветом
                char_count -= 7 * colors # цвета в счет не идут
            if re.search(patterns.LINK, text):
                link_type = re.search(patterns.LINK, text).group(1)
                char_count -= len('<{}><INFO></INFO></{}>'.format(link_type, link_type))
            print('вся строка - '+str(char_count))
            # === перенос слов ===
            if char_count > 35:
                # непереносимость ссылок и цветов (пробелы временно меняет на @)
                for colored_text in re.findall(patterns.COLOR, text):
                    text = text.replace(colored_text[1], colored_text[1].replace(' ', '@'))
                for link in re.findall(patterns.LINK, text):
                    text = text.replace(link[1], link[1].replace(' ', '@'))
                # === делит на слова по пробелам ===
                words = text.split(' ')
                current_dialog = ''
                for word in words:
                    word = word.replace('@',' ')
                    # === подсчёт символов слова ===
                    word_char_count = len(word)
                    if re.search(patterns.COLOR, word):
                        colors = word.count("^")  # выделения цветом
                        word_char_count -= 7 * colors  # цвета в счет не идут
                    if re.search(patterns.LINK, word):
                        link_type = re.search(patterns.LINK, word).group(1)
                        word_char_count -= len('<{}><INFO></INFO></{}>'.format(link_type, link_type))
                    print('слово - ' + str(word_char_count))
                    # === подсчёт символов текущей строки ===
                    current_char_count = len(current_dialog)
                    if re.search(patterns.COLOR, current_dialog):
                        colors = current_dialog.count("^")  # выделения цветом
                        current_char_count -= 7 * colors  # цвета в счет не идут
                    if re.search(patterns.LINK, current_dialog):
                        link_type = re.search(patterns.LINK, current_dialog).group(1)
                        current_char_count -= len('<{}><INFO></INFO></{}>'.format(link_type, link_type))
                    print('текущая строка - ' + str(current_char_count))
                    # === добавляет, если слово вмещается ===
                    if current_char_count + word_char_count < 35:
                        current_dialog += word + ' '
                    else:
                        split_lines.append(tabs + "dialog \"" + current_dialog.replace('  ',' ') + "\"")
                        current_dialog = word + ' '
                # === дописывает остаток диалога ===
                if current_dialog.isspace() or len(current_dialog) == 0: pass
                else: split_lines.append(tabs + "dialog \"" + current_dialog.replace('  ',' ') + "\"")
            else: split_lines.append(tabs + "dialog \"" + text.replace('  ',' ') + "\"")
        else: split_lines.append(line)
    # === обработка русских окончаний ===
    split_lines = ru_endings(split_lines)
    print("\033[32mСтроки разделены.\033[0m")
    return split_lines

# === исправляет апострофы ===
def fix_apostrophe(lines):
    text = '\n'.join(lines)
    text = text.replace('`', '\'')
    print("\033[32mАпострофы исправлены.\033[0m")
    return text.splitlines()

# === исправляет апострофы ===
def check_ru_endings(lines):
    text = '\n'.join(lines)
    alph = ('й', 'ц', 'у', 'к', 'е', 'н', 'г', 'ш', 'щ', 'з', 'х', 'ъ', 'ф', 'ы', 'в', 'а', 'п', 'р', 'о', 'л', 'д', 'ж', 'э', 'я', 'ч', 'с', 'м', 'и', 'т', 'ь', 'б', 'ю', 'ё')
    for let in alph:
        if let + '\"' in text: text = text.replace(let + '\"', let + ' \"')
    print("\033[32mРусские окончания исправлены.\033[0m")
    return text.splitlines()

if __name__ == '__main__':
    print("Манипулятор диалогов v 2.1")
    print("UPD v1.1 : Файлы класть в папку scripts, можно исправить апострофы в файле")
    print("UPD v2.0 : Автопереводчик скриптов")
    print("UPD v2.1 : Возможность соединить диалоги")
    print("UPD v2.2 : Возможность исправить русские окончания")
    print("")
    while (True):
        print("1 - Поделить диалоги на 35 символов (ширина диалогового окна RO)")
        print("2 - Соединить диалоги")
        print("3 - Автоперевод скрипта")
        print("4 - Получить диалоги в TXT")
        print("5 - Исправление апострофов в файле")
        print("6 - Добавить пробелы в конце диалогов")
        answer = input("Выбор: ")
        if answer == '1':
            filename = input("Введите имя файла: ")
            print("ROEU: UTF-8")
            print("ROPEU: UTF-8")
            print("ROP: Windows-1251")
            print("RO: Windows-1251")
            print("kRO: EUC-KR")
            codirovka = input("Введите кодировку: ")
            lines = files.open_lines(filename, codirovka=codirovka)
            lines = split(lines)
            files.write_lines(lines, 'split_results/'+filename, codirovka=codirovka)
            print("\033[32mГотово!\033[0m")
        elif answer == '2':
            filename = input("Введите имя файла: ")
            print("ROEU: UTF-8")
            print("ROPEU: UTF-8")
            print("ROP: Windows-1251")
            print("RO: Windows-1251")
            print("kRO: EUC-KR")
            codirovka = input("Введите кодировку: ")
            lines = files.open_lines(filename, codirovka=codirovka)
            lines = join(lines)
            files.write_lines(lines, 'join_results/' + filename, codirovka=codirovka)
            print("\033[32mГотово!\033[0m")
        elif answer == '3':
            filename = input("Введите имя файла: ")
            print("1 - Перевод с русского на английский")
            print("2 - Перевод с английского на русский")
            print("3 - Перевод с корейского на русский")
            tr_answer = input("Выбор: ")
            if tr_answer == '1':
                lines = files.open_lines(filename, codirovka='Windows-1251')
                lines = translate_dialogs(lines, 'ru', 'en')
                files.write_lines(lines, 'translate_results/' + filename, codirovka='UTF-8')
            elif tr_answer == '2':
                lines = files.open_lines(filename, codirovka='EUC-KR', errors='ignore')
                lines = translate_dialogs(lines, 'en', 'ru')
                files.write_lines(lines, 'translate_results/' + filename, codirovka='Windows-1251')
            elif tr_answer == '3':
                lines = files.open_lines(filename, codirovka='EUC-KR')
                lines = translate_dialogs(lines, 'ko', 'ru')
                files.write_lines(lines, 'translate_results/' + filename, codirovka='Windows-1251')
            print("\033[32mГотово!\033[0m")
        elif answer == '4':
            filename = input("Введите имя файла: ")
            print("ROEU: UTF-8")
            print("ROPEU: UTF-8")
            print("ROP: Windows-1251")
            print("RO: Windows-1251")
            print("kRO: EUC-KR")
            codirovka = input("Введите кодировку: ")
            lines = files.open_lines(filename, codirovka=codirovka)
            lines = get_dialogs(lines)
            files.write_lines(lines, 'dialog_results/' + filename, codirovka=codirovka)
            print("\033[32mГотово!\033[0m")
        elif answer == '5':
            filename = input("Введите имя файла: ")
            print("ROEU: UTF-8")
            print("ROPEU: UTF-8")
            print("ROP: Windows-1251")
            print("RO: Windows-1251")
            print("kRO: EUC-KR")
            codirovka = input("Введите кодировку: ")
            lines = files.open_lines(filename, codirovka=codirovka)
            lines = fix_apostrophe(lines)
            files.write_lines(lines, 'apostrophe_results/' + filename, codirovka=codirovka)
            print("\033[32mГотово!\033[0m")
        elif answer == '6':
            filename = input("Введите имя файла: ")
            print("ROEU: UTF-8")
            print("ROPEU: UTF-8")
            print("ROP: Windows-1251")
            print("RO: Windows-1251")
            print("kRO: EUC-KR")
            codirovka = input("Введите кодировку: ")
            lines = files.open_lines(filename, codirovka=codirovka)
            lines = ru_endings(lines)
            files.write_lines(lines, 'endings_results/' + filename, codirovka=codirovka)
            print("\033[32mГотово!\033[0m")


