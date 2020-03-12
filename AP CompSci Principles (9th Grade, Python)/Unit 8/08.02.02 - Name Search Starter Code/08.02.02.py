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

nameToFind = input("Name: ")
done = False
for n in range(5163):
    index = n
    if nameToFind == myList[n]:
        print("Found at index:", index,"")
        done = True
if done == False:
    print("Not found")
    
        
        



        
        


