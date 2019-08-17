names = []

namecount = int(input("How many? "))

for i in range (namecount):
    name = input()
    names.append(name)

names.sort()

for i in names:
    print(i)
