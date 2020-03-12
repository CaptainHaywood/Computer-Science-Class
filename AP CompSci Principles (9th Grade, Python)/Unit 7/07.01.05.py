#userEntry = "A"

global total
global count
total = 0
count = 0

def urgh():
    print("A. Enter a number")
    print("B. Exit")
    userEntry = input("Enter your selection (A, B): ")
    why(userEntry)

def why(userEntry):
    global total
    global count
    if userEntry == "A":
        inp = int(input("Enter the number: "))
        total = total + inp
        count = count + 1
        urgh()
    elif userEntry == "B":
        if count == 0:
            print("No numbers have been entered.")
        else:
            avg = total / count
            avg = round(avg, 1)
            
            print("Average:", avg, "")
    else:
        print("You have entered an illegal entry, please try again.")
        urgh()

urgh()
