# Compound Interest
print("Welcome to Compound Interest Calculator.")
P = input("Enter the principal amount: ")
r = input("Enter the annual interest rate as a decimal: ")
t = input("Number of years that will pass:")
n = input("Number of times the interest is compounded per year: ")
P = float(P)
r = float(r)
t = float(t)
n = float(n)
print ("Calculating...")
final = P * (((1 + (r/n))) ** (n*t))
print ("A =", final, "")
end = input("")
