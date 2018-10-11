roll1 = input("Die Roll? ")
roll2 = input("Die Roll? ")
roll3 = input("Die Roll? ")
if roll1 == "1" and roll2 == "2" and roll3 == "3":
    print("Straight")
elif roll1 == roll2 and roll1 == roll3:
    print("Three")
elif roll1 == roll2 or roll1 == roll3 or roll2 == roll3:
    print("Pair")
else:
    print("Nothing")
