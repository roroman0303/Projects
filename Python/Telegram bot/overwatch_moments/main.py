import telebot
import os

@bot.message_handler(commands=['start']) # что бот будет делать на команды start
def welcome(message):
    print('Пользователь {} вызвал команду /start'.format(message.from_user.first_name))
    menu = keyboard(True, False)
    menu.row('Привет', 'Покажи лучшие моменты')
    bot.send_message(message.chat.id, 'Даров, {}. Я бот Романа. Да-да, Роман не только шаурму умеет делать.'.format(message.from_user.first_name), reply_markup=menu)

@bot.message_handler(commands=['help']) # что бот будет делать на команды help
def welcome(message):
    print('Пользователь {} вызвал команду /help'.format(message.from_user.first_name))

@bot.message_handler(content_types=['text']) # что бот будет делать на команды start и help
def answer_to_text(message):
    print('Пользователь {} написал сообщение: {}'.format(message.from_user.first_name, message.text))
    if 'привет' in message.text.lower():
        global hi_counter
        hi_counter += 1
        bot.send_message(message.from_user.id, 'Привет-привет!')
        bot.send_message(message.from_user.id, 'С прошлого рестарта со мной поздаровались уже {} раз!'.format(hi_counter))
    elif 'Покажи лучшие моменты' == message.text or 'Выбрать другое' == message.text:
        print(os.listdir('C:/Users/Роман/Documents/Overwatch/videos/overwatch'))
        videos = os.listdir('C:/Users/Роман/Documents/Overwatch/videos/overwatch')
        list_of_videos = [name.replace('.mp4', '') for name in videos]
        list_of_videos = sorted(list_of_videos, key=lambda name: name[-18:], reverse=True)
        list_of_videos = [str(i+1)+'. '+list_of_videos[i][:-18] for i in range(len(list_of_videos))]
        list_of_videos = '\n'.join(list_of_videos[:10])
        menu = keyboard(True, False)
        menu.add('1','2','3','4','5','6','7','8','9','10','Назад')
        bot.send_message(message.chat.id, list_of_videos, reply_markup=menu)
    elif len(message.text) < 3:
        try:
            number = int(message.text)
            videos = os.listdir('C:/Users/Роман/Documents/Overwatch/videos/overwatch')
            videos = sorted(videos, key=lambda name: name[-22:], reverse=True)
            with open('C:/Users/Роман/Documents/Overwatch/videos/overwatch/'+videos[number-1], 'rb') as video:
                menu = keyboard(True, False)
                menu.row('Назад', 'Выбрать другое')
                bot.send_message(message.chat.id, 'Загружаю...', reply_markup=menu)
                bot.send_video(message.chat.id, video)
        except ValueError:
            bot.send_message(message.from_user.id, 'Я тебя не понимаю :(')
    elif 'Назад' == message.text:
        menu = keyboard(True, False)
        menu.row('Привет', 'Покажи лучшие моменты')
        bot.send_message(message.chat.id, 'Меню', reply_markup=menu)
    elif 'меню' in message.text.lower():
        menu = keyboard(True, False)
        menu.row('Привет', 'Покажи лучшие моменты')
        bot.send_message(message.chat.id, 'Стартовое меню', reply_markup=menu)
    else:
        bot.send_message(message.from_user.id, 'Я тебя не понимаю :(')

# ===========================================
with open('E:/Projects/Python/Telegram bot/telegram_bot_keys.txt', 'r') as file:
    lines = file.read().splitlines()
    token = lines[0]
keyboard = telebot.types.ReplyKeyboardMarkup
bot = telebot.TeleBot(token)
hi_counter = 0

bot.polling(none_stop=True)