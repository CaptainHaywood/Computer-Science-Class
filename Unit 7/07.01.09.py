lastodd = 0
lasteven = 0
oddcount = 0
evencount = 0

numcount = int(input(""))

for num in range (numcount):
    nums = int(input(""))
    if nums % 2 == 0:
        lasteven = nums
        evencount = evencount + 1
    else:
        lastodd = nums
        oddcount = oddcount + 1

if evencount == 1:
    print(lasteven)
else:
    print(lastodd)
