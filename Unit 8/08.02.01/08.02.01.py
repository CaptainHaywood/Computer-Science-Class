# Variables to store column index values to help increase
# readability in code
NAME = 0
STATE = 1
RANK = 2
COST = 3
ENROLL = 4

#---------------------------------------------------------
# This function reads information from a file, places it
# in a list and returns the list. Each cell in the list
# stores a tuple in the following format:
# (NAME, STATE, RANK, COST, ENROLL)
#---------------------------------------------------------
def get_data_from_file(fileName):
    myList = []
    file = open(fileName, "r") # opens "test.txt" for reading

    file.readline() # read header line, which we will ignore
    
    for line in file:
        myList.append(tuple(line.strip().split(',')))

    return myList

#---------------------------------------------------------
# Returns the university with the largest enrollment
#---------------------------------------------------------
def get_largest_enrollment(myList):
    maxSoFar = 0
    maxSoFarName = ""
    
    for university in myList:
        if int(university[ENROLL]) > maxSoFar:
            maxSoFar = int(university[ENROLL])
            maxSoFarName = university[NAME]

    return maxSoFarName

#---------------------------------------------------------
# Returns the university with lowest cost
#---------------------------------------------------------
def get_cheapest(myList):
    cheapest = 0
    cheapestName = ""

    for university in myList:
        if cheapest == 0:
            cheapest = int(university[COST])
            cheapestName = university[NAME]
        elif int(university[COST]) < cheapest:
            cheapest = int(university[COST])
            cheapestName = university[NAME]

    return cheapestName

#---------------------------------------------------------
# Returns a list of universities in a state
#---------------------------------------------------------
def get_by_state(myList, state):
    for university in myList:
        if state in university:
            if university[NAME] != "None":
                print(university[NAME])

#---------------------------------------------------------
# Returns a list of universities within a cost range
#---------------------------------------------------------
def get_by_cost(myList, minCost, maxCost):
    for university in myList:
        if int(university[COST]) < maxCost and int(university[COST]) > minCost:
            print(university[NAME])

#---------------------------------------------------------
# Main Section
#---------------------------------------------------------
fileName = "university.csv"
myList = get_data_from_file(fileName)

done = False

while not done:
    print("1. Largest Enroll")
    print("2. Cheapest")
    print("3. By State")
    print("4. By Cost")
    print("5. Exit")
    option = int(input("Enter option: "))
    
    if option == 1:
        print(get_largest_enrollment(myList))
    elif option == 2:
        print(get_cheapest(myList))
    elif option == 3:
        state = input("State: ")
        get_by_state(myList, state)
    elif option == 4:
        minCost = int(input("Min cost: "))
        maxCost = int(input("Max cost: "))
        get_by_cost(myList, minCost, maxCost)
    elif option == 5:
        done = True

    print("") # print blank line for readability sake
        
