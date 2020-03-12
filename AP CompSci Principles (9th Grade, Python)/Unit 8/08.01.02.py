lis = []

for i in range (10):
    num = int(input())
    lis.append(num)

print(lis)
numr = lis.pop(0)
lis.append(numr)
print(lis)
