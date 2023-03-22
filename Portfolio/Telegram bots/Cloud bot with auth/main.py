import db_work
import os
from telebot import TeleBot, types

bot = TeleBot('6125078927:AAERAypoF9M1Y-OdKR87iUe-CPJrJQv7JJg')

@bot.message_handler(commands=['start'])
def start(message):
    markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
    reg_button = types.KeyboardButton("Зарегистрироваться")
    auth_button = types.KeyboardButton("Я уже тут был")
    markup.add(reg_button, auth_button)
    bot.send_message(message.from_user.id, "Привет, я мини-бот-облако. Можешь залить в меня свои файлы, но сначала нужно зарегистрироваться! Ты ведь не хочешь видеть чужие файлы? ...не хочешь ведь?", reply_markup=markup)


status = dict()  # {id: {user_status}}


@bot.message_handler(content_types=['text'])
def get_text_messages(message):
    user_id = str(message.from_user.id)
    text = message.text
    user_login = db_work.check(user_id)

    if status.get(user_id):
        if status[user_id]['status'] == 'reg_step_1':
            status[user_id]['login'] = text
            bot.send_message(user_id, 'Введите пароль')
            status[user_id]['status'] = 'reg_step_2'
        elif status[user_id]['status'] == 'reg_step_2':
            status[user_id]['password'] = text
            db_work.register(user_id, status[user_id])
            os.mkdir(f"files/{status[user_id]['login']}")
            status.pop(user_id)

            markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
            show_button = types.KeyboardButton("Показать все файлы")
            get_button = types.KeyboardButton("Получить файл")
            logout_button = types.KeyboardButton("Выйти")
            markup.add(show_button, get_button, logout_button)
            bot.send_message(user_id, 'Супер! Теперь ты можешь залить свои файлы в меня и затем достать их с любого аккаунта!', reply_markup=markup)
        elif status[user_id]['status'] == 'log_step_1':
            status[user_id]['login'] = text
            bot.send_message(user_id, 'Введите пароль')
            status[user_id]['status'] = 'log_step_2'
        elif status[user_id]['status'] == 'log_step_2':
            status[user_id]['password'] = text
            user_login = db_work.login(user_id, status[user_id])
            status.pop(user_id)

            if user_login:
                markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
                show_button = types.KeyboardButton("Показать все файлы")
                get_button = types.KeyboardButton("Получить файл")
                logout_button = types.KeyboardButton("Выйти")
                markup.add(show_button, get_button, logout_button)
                bot.send_message(user_id, f'А, {user_login}, это ты! Что же ты сразу не сказал? Я бы и без пароля тебе поверил :)', reply_markup=markup)
            else:
                markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
                reg_button = types.KeyboardButton("Зарегистрироваться")
                auth_button = types.KeyboardButton("Я уже тут был")
                markup.add(reg_button, auth_button)
                bot.send_message(message.from_user.id, "Кажется, я не знаю такого пользователя...", reply_markup=markup)
        elif status[user_id]['status'] == 'get_file':
            markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
            show_button = types.KeyboardButton("Показать все файлы")
            get_button = types.KeyboardButton("Получить файл")
            logout_button = types.KeyboardButton("Выйти")
            markup.add(show_button, get_button, logout_button)
            filename = str(text).strip()
            try:
                with open(f'files/{user_login}/{filename}', 'rb') as file:
                    bot.send_document(user_id, file, reply_markup=markup)
            except FileNotFoundError:
                bot.send_message(message.from_user.id, "Похоже, что файла с таким названием у меня нет :(", reply_markup=markup)
                status.pop(user_id)

    else:
        if user_login:
            if text == 'Выйти':
                db_work.sign_out(user_id)
                markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
                reg_button = types.KeyboardButton("Зарегистрироваться")
                auth_button = types.KeyboardButton("Я уже тут был")
                markup.add(reg_button, auth_button)
                bot.send_message(message.from_user.id, "И снова здравствуй, незнакомец!", reply_markup=markup)
            elif text == 'Получить файл':
                status[user_id] = {'status': 'get_file'}
                bot.send_message(user_id, 'Введите имя файла (с расширением)')
            elif text == 'Показать все файлы':
                all_files_msg = '\n'.join([filename for filename in os.listdir(f"files/{user_login}/")])
                if len(all_files_msg) == 0: all_files_msg = 'Пока файлов нет :('
                markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
                show_button = types.KeyboardButton("Показать все файлы")
                get_button = types.KeyboardButton("Получить файл")
                logout_button = types.KeyboardButton("Выйти")
                markup.add(show_button, get_button, logout_button)
                bot.send_message(user_id, all_files_msg, reply_markup=markup)

        else:
            if text == 'Зарегистрироваться':
                status[user_id] = {'status': 'reg_step_1'}
                bot.send_message(user_id, 'Введите логин')
            elif text == 'Я уже тут был':
                status[user_id] = {'status': 'log_step_1'}
                bot.send_message(user_id, 'Введите логин')


@bot.message_handler(content_types=['document'])
def get_document(message):
    user_id = message.from_user.id
    user_login = db_work.check(user_id)

    if user_login:
        bot.send_message(user_id, f'Начинаю загрузку...')
        file_info = bot.get_file(message.document.file_id)
        file = bot.download_file(file_info.file_path)
        with open(f'files/{user_login}/{message.document.file_name}', 'wb') as new_file:
            new_file.write(file)
        markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
        show_button = types.KeyboardButton("Показать все файлы")
        get_button = types.KeyboardButton("Получить файл")
        logout_button = types.KeyboardButton("Выйти")
        markup.add(show_button, get_button, logout_button)
        bot.send_message(user_id, f'Файл {message.document.file_name} сохранён!', reply_markup=markup)

    else:
        markup = types.ReplyKeyboardMarkup(resize_keyboard=True)
        reg_button = types.KeyboardButton("Зарегистрироваться")
        auth_button = types.KeyboardButton("Я уже тут был")
        markup.add(reg_button, auth_button)
        bot.send_message(message.from_user.id, "Сначала нужно зарегистрироваться или войти.", reply_markup=markup)

if __name__ == '__main__':
    bot.polling(none_stop=True, interval=0)