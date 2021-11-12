import gspread
from oauth2client.service_account import ServiceAccountCredentials
# EMAIL: googlecsvid@idstocsv.iam.gserviceaccount.com

# === подключение к google ===
def initialize_connection():
    scope = ['https://spreadsheets.google.com/feeds', 'https://www.googleapis.com/auth/drive']
    credentials = ServiceAccountCredentials.from_json_keyfile_name('credentials.json', scope)
    gc = gspread.authorize(credentials)
    return gc

# === получить лист google-документа ===
def open_sheet(google_sheet_key, sheet_name=1):
    gc = initialize_connection()
    if sheet_name == 1:
        google_sheet = gc.open_by_key(google_sheet_key)
        worksheet = google_sheet.get_worksheet(0)
    else:
        google_sheet = gc.open_by_key(google_sheet_key)
        worksheet = google_sheet.worksheet(sheet_name)
    return worksheet

# === получить столбцы google-таблицы без шапки ===
def get_columns(google_sheet_key, sheet_name, header_count, *columns):
    # example: table = google.get_columns(url, 'LIST', 2, 2, 3, 4, 9)
    worksheet = open_sheet(google_sheet_key, sheet_name)
    max_length = max([len(worksheet.col_values(column)[header_count:]) for column in columns])
    table = list()
    for column in columns:
        cells = worksheet.col_values(column)[header_count:]
        if len(cells) == max_length:
            table.append(cells)
        else:
            end_cells = [''] * (max_length - len(cells))
            table.append(cells + end_cells)
    return table

