import re

def ConvertCppToPyt(rows, signs, strings, comments):
    types = ["float", "double", "int", "char", "long", "bool"]
    class_types = list()
    result = ""
    for num in range(len(rows)):
        tmp_row = rows[num].replace("\n", "")
        if signs[num] == "library": result = ConvertCppToPytLibrary(tmp_row, result)
        elif signs[num] == "link": result = ConvertCppToPytLink(tmp_row, result)
        elif signs[num] == "class":
            class_types.append(tmp_row.split()[1])
            result = ConvertCppToPytClass(tmp_row, result)
        elif "(" in tmp_row and tmp_row.split()[0].split("(")[0] in class_types:
            if re.findall(r'^\s+'+tmp_row.split()[0].split("(")[0]+r'\s*\(', tmp_row):
                result = ConvertCppToPytConstructor(tmp_row, types, result)
        elif signs[num] == "assign": result = ConvertCppToPytAssign(tmp_row, class_types, result)
        elif signs[num] == "function": result = ConvertCppToPytFunction(tmp_row, types, result) 
        elif signs[num] == "for": result = ConvertCppToPytFor(tmp_row, result) 
        elif signs[num] == "while": result = ConvertCppToPytWhile(tmp_row, result)
        elif signs[num] == "if": result = ConvertCppToPytIf(tmp_row, result)
        elif signs[num] == "else": result = ConvertCppToPytElse(tmp_row, result)
        elif signs[num] == "declaration": result = ConvertCppToPytDeclaration(tmp_row, result)
        elif signs[num] == "listdeclaration": result = ConvertCppToPytListdeclaration(tmp_row, result)
        elif signs[num] == "cout": result = ConvertCppToPytCout(tmp_row, result)
        elif signs[num] == "cin": result = ConvertCppToPytCin(tmp_row, result)
        elif signs[num] == "return": result = ConvertCppToPytReturn(tmp_row, result)
        else: result = ConvertCppToPytOther(tmp_row, result)
    WriteConvertResult(result)
    result_code = CppResultToCode(ConvertResultOpenRows(), strings, comments)
    WriteLastResultCode(result_code)
    result = ConvertCppToPytFinal(ConvertResultOpenRows(), strings, comments)
    return result

def ConvertCppToPytFinal(rows, strings, comments):
    final_result = ""
    for i in range(len(rows)):
        if "#Строка не была обработана" in rows[i]:
            if "???Comment" in rows[i+1] and re.findall(r'^#\s*\?\?\?\w+\s*$', rows[i+1]):
                rows[i] = "\n"
                continue
        if "???Comment" in rows[i] and re.findall(r'^#\s*\?\?\?\w+\s*$', rows[i]):
            rows[i] = "\n"
            continue
        if rows[i-1][0:2] == "\n" and rows[i][0:2] == "\n": continue
        if rows[i][0] != "#":
            rows[i] = rows[i].replace("this->", "self.")
            rows[i] = rows[i].replace("++", "++#ВНИМАНИЕ ИНКРЕМЕНТ")
            rows[i] = rows[i].replace("--", "--#ВНИМАНИЕ ДЕКРЕМЕНТ")
        for num in range(len(strings)):
            rows[i] = rows[i].replace("???Str"+str(len(strings)-1-num), strings[len(strings)-1-num])
            rows[i] = rows[i].replace("<<", "+")
        for num in range(len(comments)):
            rows[i] = rows[i].replace("???Comment"+str(len(comments)-1-num), "",1)
        final_result = final_result+rows[i]
    return final_result

def CppResultToCode(rows, strings, comments):
    result_code = ""
    for i in range(len(rows)):
        if "Строка не была обработана" in rows[i]:
            #if re.findall(r'^#\s+\?\?\?Comment', rows[i+1]): rows[i+1] = rows[i+1].replace("# ","",1)
            result_code = result_code+rows[i+1]
            i += 1
            continue
        elif "Был обнаружен ссылочный тип данных" in rows[i]:
            result_code = result_code+rows[i+1]
            i += 1
            continue
        elif "Не было преобразовано" in rows[i]:
            result_code = result_code+rows[i+1]
            i += 1
            continue
        if rows[i][0] == "#" or rows[i][0:2] == "\n": continue
        else: result_code = result_code+rows[i]
    result_code = result_code.replace("this->", "self.")
    #result_code = result_code.replace("<<", "+")
    result_code = result_code.replace("++", "++#ВНИМАНИЕ ИНКРЕМЕНТ")
    result_code = result_code.replace("--", "--#ВНИМАНИЕ ДЕКРЕМЕНТ")
    for i in range(len(strings)):
        result_code = result_code.replace("???Str"+str(i), strings[i],1)
    for i in range(len(comments)):
        result_code = result_code.replace("???Comment"+str(i), comments[i].replace("//", "#"),1)
    result_code = result_code.replace("<<", "+")
    return result_code

def ConvertCppToPytOther(row, result):
    if re.findall(r'^\s*$', row): return result
    if re.findall(r'^\s*[\}\{];*\s*$', row): return result
    #if "???Comment" in row and re.findall(r'^\s*\?\?\?\w+\s*$', row): return result
    if re.findall(r'\s+public\s*:\s*$', row) or re.findall(r'\s+private\s*:\s*$', row):
        result = result+"#Оператор управления доступом был убран:\n"
        result = result+"# "+row+"\n"
        result = result+"#В Python механизм инкапсуляции не предусмотрен\n"
    elif "using" in row and "namespace" in row:
        result = result+"#Строка была убрана:\n"
        result = result+"# "+row+"\n"
    elif "setlocale" in row:
        result = result+"#Строка была убрана:\n"
        result = result+"# "+row+"\n"
    else:
        result = result+"#Строка не была обработана:\n"
        result = result+"# "+row+"\n"
        
    return result+"\n"
    
def ConvertCppToPytReturn(row, result):
    result = result+"#Был преобразован оператор возврата:\n"
    result = result+"# "+row+"\n"
    row = row.replace(";","")
    if row.split()[1] == "0":
        result = result+"#Конец исполняемой программы\n"
        result = result+row+"\n"
        result = result+"main()\n"
    else: result = result+row+"\n"
    return result+"\n"

def ConvertCppToPytCin(row, result):
    result = result+"#Был преобразован консольный ввод:\n"
    result = result+"# "+row+"\n"
    row = row.replace(";","")
    value = row.split(">>",1)[1].replace(">>",",")
    if "std::" in row:
        result = result+row.split("std::cin")[0]+"input("+value+")\n"
    else:
        result = result+row.split("cin")[0]+value+" = input()\n"
    return result+"\n"

def ConvertCppToPytCout(row, result):
    result = result+"#Был преобразован консольный вывод:\n"
    result = result+"# "+row+"\n"
    row = row.replace(";","")
    value = row.split("<<",1)[1].replace("<<","+")
    if "std::" in row:
        result = result+row.split("std::cout")[0]+"print("+value+")\n"
    else:
        result = result+row.split("cout")[0]+"print("+value+")\n"
    return result+"\n"

def ConvertCppToPytListdeclaration(row, result):
    result = result+"#Было преобразовано объявление массива:\n"
    result = result+"# "+row+"\n"
    typ = row.split()[0]
    row = row.replace(typ+" ", "")
    name = row.split()[0].split("[")[0]
    leng = row.split()[0].split("[")[1].split("]")[0]
    result = result+"#В Python присутствует динамическая типизация\n"
    result = result+"#В Python массив данных обычно представляется в виде списка\n"
    if "=" in row:
        values = row.split("{")[1].split("}")[0]
        result = result+row.split(name)[0]+name+" = ["+values+"]\n"
    else:
        result = result+row.split(name)[0]+name+" = [None] * "+leng+"\n"
    return result+"\n"

def ConvertCppToPytDeclaration(row, result):
    result = result+"#Было преобразовано объявление переменных:\n"
    result = result+"# "+row+"\n"
    typ = row.split()[0]
    result = result+"#В Python присутствует динамическая типизация\n"
    if "=" in row:
        result = result+row.replace(typ+" ", "").replace(";","")+"\n"
    else:
        result = result+"#Нет необходимости объявлять переменные заранее\n"
    
    return result+"\n"

def ConvertCppToPytLink(row, result):
    result = result+"#Был обнаружен ссылочный тип данных:\n"
    result = result+"# "+row+"\n"
    result = result+"#В Python ссылочные типы данных не предусмотрены\n"
    return result+"\n"

def ConvertCppToPytConstructor(row, types, result):
    row = row.replace("(", " (")
    result = result+"#Был преобразован конструктор класса:\n"
    result = result+"# "+row+"\n"
    name = row.split()[0]
    result = result+"#Конструктор класса "+name+"\n"
    attributes = row.split(maxsplit = 1)[1]
    for ttyp in types:
        attributes = attributes.replace(ttyp, "")
    attributes = attributes[0]+"self, "+attributes[1:]
    result = result+row.split(name)[0]+"def __init__"+attributes+":\n"
    return result+"\n"

def ConvertCppToPytElse(row, result):
    result = result+"#Была преобразована условная конструкция:\n"
    result = result+"# "+row+"\n"
    row = row.replace("else if", "elif")
    if "elif" in row:    
        cond = row.split("(",1)[1]
        for sym in range(len(cond)):
            if cond[len(cond)-1-sym] == ")":
                cond = cond[0:len(cond)-1-sym]+cond[len(cond)-sym:]
                break
        result = result+"#Дополнительное ответвление с условием "+cond+"\n"
        result = result+row.split("elif")[0]+"elif "+cond+":\n"
    else:
        result = result+"#Ответвление, если условия не были выполнены\n"
        result = result+row.split("else")[0]+"else:"+"\n"
    return result+"\n"

def ConvertCppToPytIf(row, result):
    result = result+"#Была преобразована условная конструкция:\n"
    result = result+"# "+row+"\n"
    cond = row.split("(",1)[1]
    for sym in range(len(cond)):
        if cond[len(cond)-1-sym] == ")":
            cond = cond[0:len(cond)-1-sym]+cond[len(cond)-sym:]
            break
    result = result+"#Ветвление с условием "+cond+"\n"
    result = result+row.split("if")[0]+"if "+cond+":\n"
    return result+"\n"

def ConvertCppToPytWhile(row, result):
    result = result+"#Был преобразован цикл:\n"
    result = result+"# "+row+"\n"
    cond = row.split("(",1)[1]
    for sym in range(len(cond)):
        if cond[len(cond)-1-sym] == ")":
            cond = cond[0:len(cond)-1-sym]+cond[len(cond)-sym:]
            break
    result = result+"#Цикл со условием "+cond+"\n"
    result = result+row.split("while")[0]+"while "+cond+":\n"
    return result+"\n"

def ConvertCppToPytFor(row, result):
    result = result+"#Был преобразован цикл:\n"
    result = result+"# "+row+"\n"
    counter_name = row.split("int ")[1].split("=")[0]
    range_start = row.split(";")[0].split("=")[-1].replace(" ","")
    range_end = row.split(";")[1].split()[-1]
    if "<=" in row.split(";")[1]:
        range_end += 1 
    result = result+"#Цикл со счетчиком "+counter_name+" от "+range_start+" до "+range_end+"\n"
    if "++" not in row.split(";")[2]:
        result = result+"#Будьте внимательны с нестандартным шагом цикла!\n"
    result = result+row.split("for")[0]+"for "+counter_name+" in range("+range_start+", "+range_end+"):\n"
    return result+"\n"

def ConvertCppToPytFunction(row, types, result):
    result = result+"#Было преобразовано объявление функции:\n"
    result = result+"# "+row+"\n"
    row = row.replace("(", " (")
    name = row.split()[1]
    typ = row.split()[0]
    if "int main " in row:
        result = result+"#Начало главной исполняемой программы\n"
#        result = result+"main()\n"
    else:
        result = result+"#Функция "+name+" с возвращаемым значением типа "+typ+"\n"
    attributes = row.split(maxsplit = 2)[2]
    for ttyp in types:
        attributes = attributes.replace(ttyp, "")
    result = result+row.split(typ)[0]+"def "+name+attributes+":\n"
    return result+"\n"

def ConvertCppToPytLibrary(row, result):
    result = result+"#Было убрано объявление библиотеки:\n"
    result = result+"# "+row+"\n"
    if "string" in row:
        result = result+"#В Python строки доступны по умолчанию.\n"
    elif "iostream" in row:
        result = result+"#Ввод-вывод в Python реализуется функциями input() и print().\n"
    return result+"\n"

def ConvertCppToPytClass(row, result):
    result = result+"#Было преобразовано объявление класса:\n"
    result = result+"# "+row+"\n"
    if re.findall(r'\s*:\s*public\s+', row):
        name = row.split()[1]
        parent = row.split()[4]
        result = result+"#Класс "+name+", наследуемый от класса "+parent+"\n"
        result = result+"class "+name+"("+parent+"):\n"
    else:
        name = row.split()[1]
        result = result+"#Класс "+name+"\n"
        result = result+"class "+name+":\n"
    return result+"\n"

def ConvertCppToPytAssign(row, class_types, result):
    for typ in class_types:
        if re.findall(r'\W'+typ+'\s+', row):
            name = row.split()[1]
            result = result+"#Было преобразовано создание нового экземпляра класса:\n"
            result = result+"# "+row+"\n"
            result = result+"#Экземпляр "+name+" класса "+typ+"\n"
            result = result+row.split(typ+" ",1)[0]+row.split(typ+" ",1)[1].replace(";","")+"\n"
            return result+"\n"
            break
    if re.findall(r'\Wnew\s+', row):
        result = result+"#Не было преобразовано:\n"
        result = result+"# "+row+"\n"
        result = result+"#Внимание - выделение динамической памяти!\n"
        result = result+"#В Python нет механизма выделения дин. памяти.\n"
        return result+"\n"   
    else:
        result = result+"#Была преобразована операция присвоения:\n"
        result = result+"# "+row+"\n"
        left = row.replace(" ","").split("=")[0]
        right = row.replace(" ","").split("=")[1]
        result = result+"#Объекту "+left+" было присвоено значение "+right.replace(";","")+"\n"
        result = result+row.replace(";","")+"\n"
        return result+"\n"    

def WriteLastResultCode (result_code_text, filename = "result_code.txt"):
    result_code = open(filename, "w")
    result_code.write(result_code_text)
    result_code.close()

def WriteConvertResult (convert_text, filename = "convert_text.txt"):
    result_code = open(filename, "w")
    result_code.write(convert_text)
    result_code.close()

def ConvertResultOpenRows (filename = "convert_text.txt"):
    convert_prog = open(filename)
    convert_prog_rows = list()
    for line in convert_prog:
        convert_prog_rows.append(line)
    convert_prog.close()
    return convert_prog_rows


