def make_chocolate(goal, small, big):
    while big > 0:
        goal = goal - 5
        big = big - 1
        if goal == 0:
            return 0
        elif big == 0 and goal <= small:
            return small
        elif big == 0 and goal >= small:
            return -1


goal = int(input("Goal? "))
small = int(input("Small? "))
big = int(input("Big? "))

needed = make_chocolate(goal, small, big)
print("Small bars required:", needed,"")
