import pypyodbc as db
import Blanks.dbitems as dbitems

current_db_path = 'rop-db-pts2.games.inn.local, 5524' # изначальное имя и порт бд
connection = db.connect('Driver=SQL Server;Server={};trusted_connection=yes'.format(current_db_path))
cursor = connection.cursor()

# подключение к БД
def connect(db_path):
    global current_db_path
    global cursor
    current_db_path = db_path
    connection = db.connect('Driver=SQL Server;Server={};trusted_connection=yes'.format(current_db_path))
    cursor = connection.cursor()

# запрос в таблицу, поиск по столбцу
def select_one(db_path, table, cell, column=''):
    if column == '': column = dbitems.get_first_column(table)
    if current_db_path != db_path: connect(db_path)
    if column is not None:
        if str(cell).isdigit() == True:
            query = 'select * from [script].[dbo].[{}] where [{}] = {}'.format(table, column, cell)
            try:
                row = cursor.execute(query).fetchone()  # получаем и делим запрос (первую строку)
            except db.DataError:
                return None
        else:
            if '\'' in cell: cell = cell.replace('\'', '\'\'')
            query = "select * from [script].[dbo].[{}] where [{}] = '{}'".format(table, column, cell)
            try:
                row = cursor.execute(query).fetchone()  # получаем и делим запрос (первую строку)
            except db.DataError:
                return None
    else:
        print('Такие таблицы в БД не поддерживаются!')
    return row

# получить строку UPDATE, если строка есть в базе или INSERT, если её нет
def create_row(db_path, table, row):
    db_row = select_one(db_path, table, row[0]) # получаем существующую строку в БД
    if db_row is None: return insert(table, row)
    else: return update(table, row)

# === прогнать запрос в БД ===
def execute(db_path, text):
    if current_db_path != db_path: connect(db_path)
    queries = text.strip().splitlines()
    for query in queries:
        try:
            cursor.execute(query)
        except: raise ValueError("Проверьте запрос: "+query)

# получить строку UPDATE
def update(table, row):
    parameter_dict = dbitems.fill_dict(table, row)  # делаем свою строку в БД
    parameters = '' # делаем параметры как большую строку
    for key, value in parameter_dict.items():
        if key.lower() == 'name' or key.lower() == 'id': continue
        if value.isdigit(): parameters += '[{}] = {}, '.format(key, value)
        else:
            if '\'' in value: value = value.replace("\'", '\'\'') # исправление кавычек под sql
            parameters += "[{}] = '{}', ".format(key, value)
    parameters = parameters[:-2] # убираем последнюю запятую с пробелом
    first_column = dbitems.get_first_column(table)
    if first_column is not None:
        if str(row[0]).isdigit() == True:
            query = 'UPDATE [script].[dbo].[{}] SET {} WHERE {} = {}'.format(table, parameters, first_column, row[0])
        else:
            query = "UPDATE [script].[dbo].[{}] SET {} WHERE {} = '{}'".format(table, parameters, first_column, row[0])
    return query

# получить строку INSERT
def insert(table, row):
    parameter_dict = dbitems.fill_dict(table, row)  # делаем свою строку в БД
    parameters = list() # делаем параметры как кортеж
    for key, value in parameter_dict.items():
        if '\'' in value: value = value.replace('\'', '\'\'') # исправление кавычек
        if value.isdigit(): value = int(value)
        parameters.append(value)
    parameters = tuple(parameters) # для круглых скобок
    query = 'INSERT INTO [script].[dbo].[{}] VALUES {}'.format(table, parameters).replace('\"', '\'')
    return query

# найти предмет в БД по значению одного из столбцов
def find_table(db_path, cell, column=''):
    for table in dbitems.item_tables:
        if column == '': db_row = select_one(db_path, table, cell)  # получаем существующую строку в БД
        else: db_row = select_one(db_path, table, cell, column)  # получаем существующую строку в БД
        if db_row is not None:
            return table, dbitems.fill_dict(table, db_row)
    return None, None