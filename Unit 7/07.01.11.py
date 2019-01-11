sticks = 9
done = False

while done == False:
    if sticks == 1:
        print(sticks, "stick")
    else:
        print(sticks, "sticks")
    p1 = int(input("Player 1: "))
    sticks = sticks - p1
    if sticks <= 0:
        print("\nPlayer 2 wins!")
        done = True
        break
    print("")
    if sticks == 1:
        print(sticks, "stick")
    else:
        print(sticks, "sticks")
    p2 = int(input("Player 2: "))
    sticks = sticks - p2
    if sticks  <= 0:
        print("\nPlayer 1 wins!")
        done = True
        break
    print("")
