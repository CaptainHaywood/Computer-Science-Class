from tkinter import *
import random
import sys
def logon():
    username = name.get()
    password = word.get()
    if username == "CaptainHaywood" and password == "sudoking":
        print ("Logon done")
        system()
    else:
        print ("Invalid credentials")
        fail = Tk()
        fail.title("Invalid Credentials")
        fail = Label(fail, text = "Invalid Credentials. Please try again.")
        fail.grid(row = 1)
def leave():
    root.destroy()
    sys.exit()

def system():
    root.destroy()
    main = Tk()
    main.title("Main Menu")
    welcome = Label(main , text = "Welcome back!")
    welcome.grid(row=0)
    program = Button(main, text="Programs", width = 30, command = programs)
    program.grid(row=1)
    setting = Button(main, text="Settings", width = 30, command = settings)
    setting.grid(row=2)
    shutdown = Button(main, text="Shutdown", width = 30, command = shut)
    shutdown.grid(row=3)
    
def programs():
    grams = Tk()

def settings():
    sett = Tk()

def shut():
    root.quit()
    sys.exit()

root = Tk()
root.title("Login")
inst = Label(root, text = "Enter Username and Password")
inst.grid(row=0)
user = Label(root, text = "Username")
user.grid(row=1)
name = Entry(root, width=15)
name.grid(row=2)
pss = Label(root, text = "Password")
pss.grid(row=3)
word = Entry(root, show="*", width=15)
word.grid(row=4)
login = Button(root, text="Logon", width = 30, command = logon)
login.grid(row=6)
leave = Button(root, text="Cancel", width = 30, command = leave)
leave.grid(row=7)
br = Label(root, text = "")
br.grid(row=5)

root.mainloop()
