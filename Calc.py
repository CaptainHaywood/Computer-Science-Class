import os
import sys
import time
from pygame import mixer

mixer.init()
mixer.music.load('C:/Users/jhaywood/Desktop/James Python Projects/boot.mp3')
mixer.music.play()

os.system('color a') 
boot1 = "Calculator AI Boot Sequence Intiated. (C) Stuffsoft 1985"
for char in boot1:
    sys.stdout.write(char)
    time.sleep(0.08)
print("")
boot2 = "Boot Complete. Ready to calculate. Type HELP to see list of commands."
for char in boot2:
    sys.stdout.write(char)
    time.sleep(0.08)
while True:
    print("")
    menu = input("> ")
    if menu =="HELP":
        print ("---HELP MENU---")
        print ("Add: Add two numbers. Syntax: ADD num1 num2")
        print ("Subtract: Subtract two numbers. Syntax: SUB num1 num2")
        print ("Multiply: Multiply two numbers. Syntax: MUL num1 num2")
        print ("Divide: Divide two numbers. Syntax: DIV num1 num2")
        print ("Shutdown: Shutdown Calculator. Syntax: SHUTDOWN")
        print("---END OF HELP MENU---")
        print ("")
        menu = input ("> ")
    if menu == "ADD":
        add1 = input("Enter the first number:")
        add2 = input("Enter the second number:")
        addans = float(add1) + float(add2)
        print ("The answer is", addans)
    elif menu == "SUB":
        sub1 = input("Enter the first number:")
        sub2 = input("Enter the second number:")
        subans = float(sub1) - float(sub2)
        print ("The answer is", subans)
    elif menu == "MUL":
        mul1 = input("Enter the first number:")
        mul2 = input("Enter the second number:")
        mulans = float(mul1) * float(mul2)
        print ("The answer is", mulans)
    elif menu == "DIV":
        div1 = input("Enter the first number:")
        div2 = input("Enter the second number:")
        divans = float(div1) / float(div2)
        print ("The answer is", divans)
    elif menu == "SHUTDOWN":
        sys.exit()
    elif menu !="":
        print("Sorry, but", menu, "is an invalid command. Please try again and pay attention to capitilization.")
        
        
    
