#---------------------------------------------------------
# This function reads information from a file, places it
# in a list and returns the list. 
#---------------------------------------------------------
def get_data_from_file(fileName):
    myList = []
    file = open(fileName, "r") # opens "test.txt" for reading
    
    for line in file:
        myList.append(line.rstrip())

    return myList

#---------------------------------------------------------
# Main Section
#---------------------------------------------------------
fileName = "names.txt"
myList = get_data_from_file(fileName)
myList.sort() # sort the list

nameToFind = input("Name: ")

lookup = 0
low = 0
high = len(myList) - 1
mid = (low + high) // 2
done = False

while not done:
    lookup = lookup + 1
    if myList[mid] == nameToFind:
        print("Found at index:", mid, "")
        print("Look-ups:", lookup, "")
        done = True
    elif myList[mid] < nameToFind:
        low = mid + 1
        mid = (low + high) // 2
    elif myList[mid] > nameToFind:
        high = mid - 1
        mid = (low + high) // 2
    


    


        
        


