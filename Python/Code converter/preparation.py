from openprogram import (CppWholeOpen, CppRowsOpen)
import re

def CppIdentifyComments (prog_text):
    comments = re.findall(r'//.+', prog_text)
    return comments

def CppReplaceComments (prog_text):
    comments = re.findall(r'//.+', prog_text)
    com_counter = 0
    for comment in comments:
        prog_text = prog_text.replace(comment, "???Comment"+str(com_counter))
        com_counter += 1
    return prog_text

def CppDeleteInComments (prog_text):
    comments = re.findall(r'/[*].*[*]/', prog_text)
    for comment in comments:
        prog_text = prog_text.replace(comment, "")
    return prog_text

def IndentReduce (prog_text):
    for i in range(20):
        prog_text = prog_text.replace("\n\n\n", "\n\n")
    return prog_text

def CppIdentifyStrings (prog_text):
    strings = re.findall(r'".*"', prog_text)
    return strings

def CppReplaceStrings (prog_text):
    strings = re.findall(r'".*"', prog_text)
    str_counter = 0
    for string in strings:
        prog_text = prog_text.replace(string, "???Str"+str(str_counter))
        str_counter += 1
    return prog_text

def CppComplexPreparation (prog_text):
    prog_text = IndentReduce(prog_text)
    prog_text = CppDeleteInComments(prog_text)
    prog_text = CppReplaceComments(prog_text)
    prog_text = CppReplaceStrings(prog_text)
    return prog_text

#test = CppWholeOpen()
#test_comments = CppIdentifyComments(test)
#test_strings = CppIdentifyStrings(test)

#test2 = IndentReduce(test)
#test2 = CppComplexPreparation(test)
#test3 = CppReplaceComments(test2)
#test4 = CppDeleteInComments(test3)
#test5 = CppReplaceStrings(test4)

#print(test2)
#print(test_comments)
#print(test_strings)
    
