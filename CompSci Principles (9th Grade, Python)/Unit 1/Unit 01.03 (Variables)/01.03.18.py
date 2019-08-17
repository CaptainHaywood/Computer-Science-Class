# 01.03.08 BASIC NAME PROMPT IS BASIC

P = input("Principal? ")
r = input("Rate? ")
n = input("Compound Times? ")
t = input("Years? ")
P = float(P)
r = float(r)
t = float(t)
n = float(n)
final = P * (((1 + (r/n))) ** (n*t))
print (round(final, 2))




