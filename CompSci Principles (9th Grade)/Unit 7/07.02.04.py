numwords = int(input(""))
maxlength = 0
maxword = ""

for i in range (numwords):
    inp = input()
    length = len(inp)
    if length > maxlength:
        maxlength = length
        maxword = inp
    else:
        maxlength = maxlength

print(maxword)
