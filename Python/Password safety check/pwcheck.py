import re
#Good password must contain:
#   at least 10 symbols
#   at least 1 num
#   at least 1 punctuation
#   at least 1 capital letter
#   at least 1 small letter
#Also can not contain:
#   "kaspersky" in any register

password = str(input("Enter a password: "))
bad_counter = 0
low_password = password.lower()

if len(password) < 10                      : bad_counter += 1
if "kaspersky"  in   low_password          : bad_counter += 1
if len(re.findall(r"\d", password))    == 0: bad_counter += 1
if len(re.findall(r"\W", password))    == 0: bad_counter += 1
if len(re.findall(r"[A-Z]", password)) == 0: bad_counter += 1
if len(re.findall(r"[a-z]", password)) == 0: bad_counter += 1

if bad_counter != 0 : print("BAD")
else: print("GOOD")
