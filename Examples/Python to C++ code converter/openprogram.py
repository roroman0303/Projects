def CppWholeOpen (filename = "cpp_prog.txt"):
    cpp_prog = open(filename)
    cpp_prog_text = cpp_prog.read()
    cpp_prog.close()
    return cpp_prog_text

def CppRowsOpen (filename = "cpp_prog.txt"):
    cpp_prog = open(filename)
    cpp_prog_rows = list()
    for line in cpp_prog:
        cpp_prog_rows.append(line)
    cpp_prog.close()
    return cpp_prog_rows

def WritePrep (prep_text, filename = "prep_prog.txt"):
    prep_prog = open(filename, "w")
    prep_prog.write(prep_text)
    prep_prog.close()

def WriteSigned (signed_text, filename = "signed_prog.txt"):
    signed_prog = open(filename, "w")
    signed_prog.write(signed_text)
    signed_prog.close()

def WriteResult (result_text, filename = "result.txt"):
    result_prog = open(filename, "w")
    result_prog.write(result_text)
    result_prog.close()

#test_text = CppWholeOpen()
#test_rows = CppRowsOpen()
#print(test_rows)
