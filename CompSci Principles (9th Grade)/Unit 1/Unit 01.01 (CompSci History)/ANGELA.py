# ANGELA by James Haywood
# Based on the original, Programma 101 ANGELA

# How to Play
# When prompted, enter a number between 30 and 100
# Then, enter a number between 1 and 6.
# This number adds on to the total.
# The other player then selects a number, but it cannot be the same number,
# or the number opposite if it were on a die (Pairs: 1/6 2/5 3/4)
# The first player to exactly reach the number entered at game start wins.
# If this is not possible, the player who pushes the total past the winning
# value loses.

global target
global total
global lastusedA
global lastusedB
global add
global currentplayer
global offplayer
currentplayer = "ONE"
offplayer = "TWO"
lastusedA = 7
lastusedB = 7
total = 0

print ("ANGELA (C) 2018 James Haywood")
print ("See program comments for instructions.")
print ("")

def targetset():
    global target
    try:
        target = int(input("Enter a number between 30 and 100. "))
    except:
        print("")
        print("Invalid input. Please try again.")
        print("")
        targetset()

    if target > 29 and target < 101:
              playerone()
    else:
        print("")
        print("Invalid input. Please try again.")
        print("")
        targetset()

def cycle():
    global target
    global lastusedA
    global lastusedB
    global total
    global add
    global currentplayer
    global offplayer
    total = total + add
    print("Target Number:", target, "Current Total:", total,"")
    if total == target:
        print("CONGRATULATIONS! PLAYER", currentplayer,"WON THE GAME!")
        exit()
    elif total > target:
        print("CONGRATULATIONS! PLAYER", offplayer,"WON THE GAME!")
        exit()
    else:
        print("Cycling complete.")

    if add == 1 or add == 6:
        lastusedA = 1
        lastusedB = 6
    elif add == 2 or add == 5:
        lastusedA = 2
        lastusedB = 5
    elif add == 3 or add == 4:
        lastusedA = 3
        lastusedB = 4
    else:
        print("ANGELA isn't sure what you did, but stop doing it.")

    if offplayer == "ONE":
        playerone()
    elif offplayer == "TWO":
        playertwo()

def playerone():
    global lastusedA
    global lastusedB
    global target
    global add
    global currentplayer
    global offplayer
    currentplayer = "ONE"
    offplayer = "TWO"
    print("")
    print("READY PLAYER ONE")
    print("")
    print("Target Number:", target, "Current Total:", total,"")
    print("Unavailable numbers:", lastusedA, "and", lastusedB,"")
    try:
        add = int(input("Enter a number between 1 and 6 that is not unavailable. "))
    except:
        print("")
        print("Invalid input. Please try again.")
        print("")
        playerone()

    if add > 0 and add < 7:
        buffer = "this is a bad solution but whatever"
    else:
        print("")
        print("Invalid input. Please try again.")
        print("")
        playerone()

    if add != lastusedA and add != lastusedB:
        cycle()
    else:
        print("Unavailable number. Currently you cannot enter", lastusedA, "and", lastusedB,".")
        playerone()

def playertwo():
    global lastusedA
    global lastusedB
    global target
    global add
    global currentplayer
    global offplayer
    currentplayer = "TWO"
    offplayer = "ONE"
    print("")
    print("READY PLAYER TWO")
    print("")
    print("Target Number:", target, "Current Total:", total,"")
    print("Unavailable numbers:", lastusedA, "and", lastusedB,"")
    try:
        add = int(input("Enter a number between 1 and 6 that is not unavailable. "))
    except:
        print("")
        print("Invalid input. Please try again.")
        print("")
        playerone()

    if add > 0 and add < 7:
        buffer = "this is a bad solution but whatever"
    else:
        print("")
        print("Invalid input. Please try again.")
        print("")
        playerone()

    if add != lastusedA and add != lastusedB:
        cycle()
    else:
        print("Unavailable number. Currently you cannot enter", lastusedA, "and", lastusedB,".")
        playertwo()

    
                     
        
    

targetset()
