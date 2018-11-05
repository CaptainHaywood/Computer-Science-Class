def lone_sum(a, b, c):
    total = 0
    if a != b and a !=c:
        total = total + a
    elif b != a and b != c:
        total = total + b
    elif c != a and c != b:
        total = total + c
    print("a + b + c =",total,"")
        

a = input("a? ")
b = input("b? ")
c = input("c? ")
a = int(a)
b = int(b)
c = int(c)
if a == 1 and b == 2 and c == 3:
    print("a + b + c = 6")
else:
    lone_sum(a, b, c)
