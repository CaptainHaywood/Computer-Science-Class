print("You are in Room 1.")
print("What is the largest state in the US?")
print("A) Alaska")
print("B) Texas")
print("C) California")
r1 = input("Enter your answer (A, B or C):")
if r1 == "A":
    print("Correct, you recieved Jewels!")
    jewels = 1
else:
    print("Incorrect, no treasures for you!")
    jewels = 0

print("")

print("You are in Room 2.")
print("What nuclear process powers the Sun?")
print("A) Uranium Fission")
print("B) Hydrogen Fusion")
print("C) Burning Coal")
r1 = input("Enter your answer (A, B or C):")
if r1 == "B":
    print("Correct, you recieved Gold Bars!")
    gold = 1
else:
    print("Incorrect, no treasures for you!")
    gold = 0

print("")

print("You are in Room 3.")
print("What is Python?")
print("A) A snake")
print("B) A snack cake")
print("C) A programming language")
r1 = input("Enter your answer (A, B or C):")
if r1 == "C":
    print("Correct, you recieved Diamonds!")
    diamonds = 1
else:
    print("Incorrect, no treasures for you!")
    diamonds = 0

print("Thank you for playing! Here are your total treasures collected:")
print("Jewels:", jewels,"")
print("Gold Bars:", gold,"")
print("Diamonds",diamonds,"")
