num1 = int(input("Number? "))
num2 = int(input("Number? "))
num3 = int(input("Number? "))
num4 = int(input("Number? "))
num5 = int(input("Number? "))
num6 = int(input("Number? "))
side1 = num1 + num2 + num3
side2 = num1 + num4 + num6
side3 = num3 + num5 + num6

if side1 == side2 and side3:
    print("Magic")
else:
    print("Not Magic")

