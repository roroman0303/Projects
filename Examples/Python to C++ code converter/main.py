#подключаемые библиотеки и модули
from datetime import datetime as datetime
from openprogram import (CppWholeOpen, CppRowsOpen, WritePrep, WriteSigned, WriteResult)
from preparation import (CppIdentifyComments, CppIdentifyStrings, CppComplexPreparation)
from analysis import CppRowAnalysis
import convert

#открытие программного файла и пред. подготовка
prog_text = CppWholeOpen("cppcodes\\cpp_prog5.txt")
prog_comments = CppIdentifyComments(prog_text)
prog_strings = CppIdentifyStrings(prog_text)
prog_text = CppComplexPreparation(prog_text)
WritePrep(prog_text)

#идентификация строк кода
rows = CppRowsOpen("prep_prog.txt")
rows_sign = list()
signed_prog_text = ""
for row in rows:
    sign = CppRowAnalysis(row)
    rows_sign.append(sign)
    signed_row = row.replace("\n", "      "+sign)
    signed_prog_text = signed_prog_text +signed_row +"\n"    
WriteSigned(signed_prog_text)

#преобразование и запись в файл
result_text = convert.ConvertCppToPyt(rows, rows_sign, prog_strings, prog_comments)
directory = "lastresults\\"
result_file_name = directory+"result "+str(datetime.today())[:19]
result_file_name = result_file_name.replace("-", ".")
result_file_name = result_file_name.replace(":", "-")
WriteResult(result_text, result_file_name+".txt")

#успешное выполнение
print("Московский Авиационный Институт")
print("Институт №3 \"Системы управления, информатика и электроэнергетика\"")
print("Выпускная Квалификационная Работа Бакалавра")
print("На тему: \"Анализатор-переводчик синтаксиса языка программирования\"")
print("Автор: Рожаловский Роман Юрьевич\n")
print("Успешно!")
print("Результат был сохранен в "+result_file_name+".txt\n")
print(result_text)

