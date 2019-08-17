roll1 = int(input("Number? "))
roll2 = int(input("Number? "))
roll3 = int(input("Number? "))
a1 = min(roll1, roll2, roll3)
a3 = max(roll1, roll2, roll3)
a2 = (roll1 + roll2+ roll3) - a1 - a3
comma = ", "
a1 = str(a1)
a2 = str(a2)
a3 = str(a3)
answer = a1+comma+a2+comma+a3
print(answer)
