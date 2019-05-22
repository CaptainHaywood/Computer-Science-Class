# 01.03.08 BASIC NAME PROMPT IS BASIC

number = input("Number? ")
print("Number Reversed:", number[::-1], "")
num = int(number)
rev = int(number[::-1])
diff = abs(num-rev)
print("Difference:", diff, "")
diff = str(diff)
revdiff = diff[::-1]
print("Difference Reversed:", diff[::-1], "")
answ = int(diff) + int(revdiff)
print("Answer:", answ, "")
