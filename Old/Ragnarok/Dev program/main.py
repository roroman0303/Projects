from datetime import datetime
import os, sys, json
with open("paths.json", "r") as paths_json:
    scripts_path = json.load(paths_json)["python_scripts"]
    sys.path.append(scripts_path)
import Ragnarok.module.files as files
import Ragnarok.module.dialog as dialog
import Ragnarok.module.monetization as monetization
import Ragnarok.module.tests as tests
import Ragnarok.module.update_files as update_files
import Ragnarok.module.korean_doc as korean_doc
import Ragnarok.module.description_skeleton as description_skeleton
import Ragnarok.module.description as description
choice = 'start'

# === спрашивает у пользователя регион ===
def ask_region():
    print('\nРегион')
    print('1. ROPRU')
    print('2. ROPEU')
    print('3. ROEU')
    region = input('Выбор: ')
    if '1' in region: region = 'ropru'
    elif '2' in region: region = 'ropeu'
    elif '3' in region: region = 'roeu'
    return region

# === начальное меню программмы ===
def ask_start():
    print('\nRagnarok INN v0.1')
    print('1. Монетизация')
    print('2. Разработка')
    print('3. Тестирование')
    print('4. Работа с БД')
    print('5. Локализация')
    global choice
    choice = input('Выбор: ')
    if '1' in choice: choice = 'monetization'
    elif '2' in choice: choice = 'development'
    elif '3' in choice: choice = 'testing'
    elif '4' in choice: choice = 'database'
    elif '5' in choice: choice = 'localization'
    else: pass

# === спрашивает у пользователя языки для перевода ===
def ask_translate():
    print('\nПеревод')
    print("1. Перевод с русского на английский")
    print("2. Перевод с английского на русский")
    print("3. Перевод с корейского на русский")
    print("4. Перевод с корейского на английский")
    print('5. К началу')
    global choice
    lang_choice = input('Выбор: ')
    if '1' in lang_choice: lang_choice = 'ru-en'
    elif '2' in lang_choice: lang_choice = 'en-ru'
    elif '3' in lang_choice: lang_choice = 'ko-ru'
    elif '4' in lang_choice: lang_choice = 'ko-en'
    elif '5' in lang_choice: choice = 'start'
    return lang_choice

# === меню монетизации ===
def ask_monetization():
    print('\nМонетизация')
    print('1. Генерация лакибокса')
    print('2. Генерация шопа')
    print('3. К началу')
    global choice
    money_choice = input('Выбор: ')
    if '1' in money_choice: money_choice = 'luckybox'
    elif '2' in money_choice: money_choice = 'shop'
    elif '3' in money_choice: choice = 'start'
    return money_choice

# === спрашивает у пользователя имя файла ===
def ask_filename():
    filename = input('Введите имя файла (он должен лежать в папке files): ')
    return filename

# === меню разработки ===
def ask_development():
    print('\nРазработка')
    print("1. Преобразовать Excel")
    print("2. Поделить диалоги на 35 символов")
    print("3. Соединить диалоги")
    print("4. Автоперевод скрипта")
    print("5. Получить диалоги в TXT")
    print("6. Исправление апострофов в файле")
    print("7. Добавить пробелы в конце диалогов")
    print('8. К началу')
    global choice
    dev_choice = input('Выбор: ')
    if '1' in dev_choice: dev_choice = 'excel'
    elif '2' in dev_choice: dev_choice = 'split'
    elif '3' in dev_choice: dev_choice = 'join'
    elif '4' in dev_choice: dev_choice = 'translate'
    elif '5' in dev_choice: dev_choice = 'dialogs'
    elif '6' in dev_choice: dev_choice = 'apostrophe'
    elif '7' in dev_choice: dev_choice = 'endings'
    elif '8' in dev_choice: choice = 'start'
    return dev_choice

# === меню работы с БД ===
def ask_database():
    print('\nРабота с БД')
    print("1. Сгенерировать SQL скрипт из Excel")
    print('2. К началу')
    global choice
    db_choice = input('Выбор: ')
    if '1' in db_choice: db_choice = 'excel'
    elif '2' in db_choice: choice = 'start'
    return db_choice

# === меню тестирования ===
def ask_testing():
    print('\nТестирование')
    print('1. Тест лакибокса')
    print('2. Тест шопа')
    print('3. К началу')
    global choice
    test_choice = input('Выбор: ')
    if '1' in test_choice: test_choice = 'luckybox'
    elif '2' in test_choice: test_choice = 'shop'
    elif '3' in test_choice: choice = 'start'
    return test_choice

# === меню локализации ===
def ask_localization():
    print('\nЛокализация')
    print('1. Сгенерировать скелет для предметов')
    print('2. Сгенерировать описание (в разработке)')
    print('3. К началу')
    global choice
    loca_choice = input('Выбор: ')
    if '1' in loca_choice: loca_choice = 'skeleton'
    elif '2' in loca_choice: loca_choice = 'description'
    elif '3' in loca_choice: choice = 'start'
    return loca_choice

# === спросить про обновление файлов ===
def ask_update(files_dict, region):
    print('\nОбновить файлы репозитория?')
    print('1. Да')
    print('2. Нет')
    update_choice = input('Выбор: ')
    if '1' in update_choice or 'да' in update_choice.lower():
        if files_dict.get('script.sql') is not None:
            date = input('Введите дату профилактики в формате дд.мм: ')
            update_files.all(files_dict, region, date)
        else: update_files.all(files_dict, region)

while(1):
    if choice == 'start': ask_start()
    elif choice == 'monetization':
        money_choice = ask_monetization()
        if money_choice == 'luckybox':
            print("Не забудьте в папку korean скопировать корейские файлы.")
            print("Не забудьте в google-таблице добавить первую строку с лакибоксом.")
            region = ask_region()
            luckybox_dict = monetization.create_luckybox(region, files.get_korean_xlsx_name())
            files.write_new(luckybox_dict, region, 'luckybox', True)
            ask_update(files.open_new(region), region)
            print("Готово! Не забудьте сделать патч и выполнить SQL скрипт в БД!")
        elif money_choice == 'shop':
            region = ask_region()
            shop_dict = monetization.create_shop(region)
            files.write_new(shop_dict, region, 'shop', True)
            ask_update(files.open_new(region), region)
            print("Готово!")
    elif choice == 'development':
        dev_choice = ask_development()
        if dev_choice == 'split':
            region = ask_region()
            filename = ask_filename()
            text = files.open_text('files/'+filename, codirovka=files.get_codirovka(filename, region))
            files.write_new({filename: dialog.split(text)}, region, 'split', True)
            print("Готово!")
        elif dev_choice == 'join':
            region = ask_region()
            filename = ask_filename()
            text = files.open_text('files/' + filename, codirovka=files.get_codirovka(filename, region))
            files.write_new({filename: dialog.join(text)}, region, 'join', True)
            print("Готово!")
        elif dev_choice == 'translate':
            lang_choice = ask_translate()
            filename = ask_filename()
            if lang_choice == 'ru-en':
                text = files.open_text('files/'+filename, codirovka='Windows-1251')
                new_text = dialog.translate_dialogs(text, 'ru', 'en')
                codirovka = 'Windows-1251'
            elif lang_choice == 'en-ru':
                text = files.open_text('files/'+filename, codirovka='EUC-KR', errors='ignore')
                new_text = dialog.translate_dialogs(text, 'en', 'ru')
                codirovka = 'Windows-1251'
            elif lang_choice == 'ko-ru':
                text = files.open_text('files/'+filename, codirovka='EUC-KR', errors='ignore')
                new_text = dialog.translate_dialogs(text, 'ko', 'ru')
                codirovka = 'Windows-1251'
            elif lang_choice == 'ko-en':
                text = files.open_text('files/'+filename, codirovka='EUC-KR', errors='ignore')
                new_text = dialog.translate_dialogs(text, 'ko', 'en')
                codirovka = 'EUC-KR'
            else: continue
            files.write_new_one({filename: new_text}, codirovka, 'translate')
            print("Готово!")
        elif dev_choice == 'dialogs':
            region = ask_region()
            filename = ask_filename()
            text = files.open_text('files/' + filename, codirovka=files.get_codirovka(filename, region))
            files.write_new({filename: dialog.get_dialogs(text)}, region, 'only dialogs', True)
            print("Готово!")
        elif dev_choice == 'apostrophe':
            region = ask_region()
            filename = ask_filename()
            text = files.open_text('files/' + filename, codirovka=files.get_codirovka(filename, region))
            files.write_new({filename: dialog.fix_apostrophe(text)}, region, 'apostrophes', True)
            print("Готово!")
        elif dev_choice == 'endings':
            region = ask_region()
            filename = ask_filename()
            text = files.open_text('files/' + filename, codirovka=files.get_codirovka(filename, region))
            files.write_new({filename: dialog.ru_endings(text)}, region, 'endings', True)
            print("Готово!")
        elif dev_choice == 'excel':
            region = ask_region()
            filename = ask_filename()
            files_dict = korean_doc.create_files(region, 'files/' + filename)
            files.write_new(files_dict, region, 'files from excel', True)
            print("Готово!")
    elif choice == 'testing':
        test_choice = ask_testing()
        if test_choice == 'luckybox':
            region = ask_region()
            tests.luckybox(region)
        elif test_choice == 'shop':
            region = ask_region()
            tests.shop(region)
    elif choice == 'database':
        db_choice = ask_database()
        if db_choice == 'excel':
            region = ask_region()
            filename = ask_filename()
            sql_text = korean_doc.create_sql(region, 'files/' + filename)
            files.write_new({'script.sql': sql_text}, region, 'sql from excel', True)
            print("Готово!")
    elif choice == 'localization':
        loca_choice = ask_localization()
        if loca_choice == 'skeleton':
            region = ask_region()
            print('Введите список dbname-ов или ID (Enter нужно нажать два раза)')
            ids = list(iter(input, ""))
            files.write_new({'iteminfo.lua': description_skeleton.create(region, ids)}, region, 'skeletons', True)
            print("Готово!")
        if loca_choice == 'description':
            region = ask_region()
            print('Введите список dbname-ов или ID (Enter нужно нажать два раза)')
            ids = list(iter(input, ""))
            files.write_new({'iteminfo.lua': description.create(region, ids)}, region, 'descriptions', True)
            print("Готово!")

