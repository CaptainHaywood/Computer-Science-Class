done = False

min = 0
max = 100
numTries = 0

while done == False:
    halfway = (min+max) / 2
    halfway = int(halfway)
    response = input(str(halfway) + "? ")
    numTries = numTries + 1

    if response == "E":
        done = True
    elif response == "G":
        min = halfway
    else:
        max = halfway


if numTries == 1:
    print("I guessed your number in 1 try.")
else:
    print("I guessed your number in", numTries,"tries.")
