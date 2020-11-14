import re

def CppRowAnalysis(row):
    types = ["float", "double", "int", "char", "long", "bool"]
    if "#include" in row:
        return "library"
    if re.findall(r'\s*for\W', row):
        return "for"
    if re.findall(r'\s*while\W', row):
        return "while"
    if re.findall(r'\s*if\W', row):
        return "if"
    if re.findall(r'\s*else\W', row):
        return "else"
    if re.findall(r'\s*void\W', row):
        return "function"
    for typ in types:
        if re.findall(r'\s*'+typ+r'\W', row):
            if re.findall(r'\s*'+typ+r'\s+[\w\._]+\s*[(]', row):
                return "function"
            if re.findall(r'\s*'+typ+r'\s+[\w\._]+[\[]+', row):
                return "listdeclaration"
            if re.findall(r'\s*'+typ+r'\s+\w[\w,._]*', row):
                return "declaration"
            if re.findall(r'\s*'+typ+r'\s*[*]', row):
                return "link"
    if re.findall(r'\s*class\W', row):
        return "class"
    if re.findall(r'\s*return\W', row):
        return "return"
    if re.findall(r'\s*[\w\._\[\]]+\s*=', row):
        return "assign"
    if re.findall(r'\s*cout[<\s]', row) or re.findall(r'\s*std::cout[<\s]', row):
        return "cout"
    if re.findall(r'\s*cin[>\s]', row) or re.findall(r'\s*std::cin[>\s]', row):
        return "cin"
    
    return "un"
    
    
    
    
    
#print(RowAnalysis("        self._width = width"))
#print(re.findall(r'\s*for\W', "   for (int forhead = 0; i < row_count; i++)").count)

