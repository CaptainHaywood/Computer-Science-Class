from tkinter import *

def newgame():
    openup.destroy()
    newgame = Tk()
    newgame.title("Create a New Game")
    entry1 = Label(newgame, text = "Race Name:")
    entry1.grid(row=1, column = 1)
    entry2 = Label(newgame, text = "Plural Race Name:")
    entry2.grid(row=2, column =1)
    entry3 = Label(newgame, text = "Government Name:")
    entry3.grid(row=3, column = 1)
    entry4 = Label(newgame, text = "Ship Name Prefix:")
    entry4.grid(row=4, column = 1)

    drop1 = Label(newgame, text = "Racial Ability A:")
    drop1.grid(row=1, column = 3)

    drop2 = Label(newgame, text = "Racial Ability B:")
    drop2.grid(row=2, column = 3)
    
    racename = Entry(newgame, width = 30)
    racename.grid(row=1, column=2)
    racename.insert(0, "Human")

    racenamep = Entry(newgame, width = 30)
    racenamep.grid(row=2, column=2)
    racenamep.insert(0, "Humans")

    govtname = Entry(newgame, width = 30)
    govtname.grid(row=3, column=2)
    govtname.insert(0, "The Stellar Federation")

    prefix = Entry(newgame, width = 30)
    prefix.grid(row=4, column=2)
    prefix.insert(0, "USS")
    

    ###################################
    
    racialabilityA = StringVar(newgame)
    choices = {'Space Travel Mastery (-50% Drive Cost, +20% Max Speed)','Industrial Mastery (-50% Industry Cost, +20% Industry Output)','Manufacturing Mastery (-50% Manufacturing and Shipyard Cost, +20% Manufacturing and Shipyard Speed)'}
    racialabilityA.set('Space Travel Mastery (-50% Drive Cost, +20% Max Speed)')  
    popupMenu = OptionMenu(newgame, racialabilityA, *choices)
    popupMenu.grid(row = 1, column = 4)

    racialabilityB = StringVar(newgame)
    choicesB = {'Militaristic (+25% Weapons Damage, -25% Co-operation with other Governments)','Diplomatic (-25% Weapons Damage, +25% Co-operation with other Governments)','Scientific (+10% Weapons Damage and Co-operation with other Governments, +25% Reasearch Speed)'}
    racialabilityB.set('Militaristic (+25% Weapons Damage, -25% Co-operation with other Governments)')  
    popupMenu = OptionMenu(newgame, racialabilityB, *choicesB)
    popupMenu.grid(row = 2, column = 4)
    
    def change_dropdown_a(*args):
        global raceabilityA
        raceabilityA = racialabilityA.get()
        print (raceabilityA)
    racialabilityA.trace('w', change_dropdown_a)
    
    def change_dropdown_b(*args):
        global raceabilityB
        raceabilityB = racialabilityB.get()
        print (raceabilityB)
    racialabilityB.trace('w', change_dropdown_b)
     
    newgame.mainloop()


openup = Tk()
openup.title("Welcome!")
infinite = Label(openup, text = "Welcome to Infinite Frontier!")
infinite.grid(row=1)
new = Button(openup, text="New Game", width=30, command=newgame)
new.grid(row=2)
savegamesarewip = Label(openup, text = "Save Games are Currently Unavailable.")
savegamesarewip.grid(row=3)
