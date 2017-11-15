from tkinter import *
import random
import sys


def newgame():
    root.destroy()
    newgame = Tk()
    newgame.title("Create a New Game")
    racename = Label(newgame, text = "Race Name:")
    racename.grid(row=1, column=0)
    rname = Entry(newgame, width = 30)
    rname.grid(row=1, column=1)
    racenameplural = Label(newgame, text = "Plural Race Name:")
    racenameplural.grid(row=2, column=0)
    rnames = Entry(newgame, width = 30)
    rnames.grid(row=2, column=1)
    homeworldname = Label(newgame, text = "Homeworld Name:")
    homeworldname.grid(row=3, column=0)
    homeworld = Entry(newgame, width = 30)
    homeworld.grid(row=3, column=1)
    homesystemname = Label(newgame, text = "Home System Name:")
    homesystemname.grid(row=4, column=0)
    homesystem = Entry(newgame, width = 30)
    homesystem.grid(row=4, column=1)
    govtname = Label(newgame, text = "Government Name:")
    govtname.grid(row=5, column=0)
    govtsystem = Entry(newgame, width = 30)
    govtsystem.grid(row=5, column=1)
    
    racetraits = Label(newgame, text = "Sublight Propulsion Racial Trait:")
    racetraits.grid(row=1, column=3)
    sproptrait = StringVar(newgame)
    sproptraits = { 'Drive Overburn (+25% Fuel Consumption, +10% Speed)','Drive Efficiency (-25% Fuel Consumption, -10% Speed)', 'Open Drive Core (-30% Cost of all Drives)', 'Drive Ramjets (+5 units of fuel/turn while drive is in operation)'}
    sproptrait.set('Drive Overburn (+25% Fuel Consumption, +10% Speed)')
    subproptrait = OptionMenu(newgame, sproptrait, *sproptraits)
    subproptrait.grid(row=1, column=4)
    
    ftlracetraits = Label(newgame, text = "Starting Superluminal Propulsion:")
    ftlracetraits.grid(row=2, column=3)
    ftlproptrait = StringVar(newgame)
    ftlproptraits = {'Hyperdrive (Spool time: 1 turn, Speed: 5ly/turn, Fuel Consumption: 1 unit of Quirium/turn.)','Warp Drive (Spool Time: 2 turns, Speed: 10ly/turn, Fuel Consumption: 5 units of Quirum/turn.)','Wormhole Drive (Spool Time: 5 Turns, Speed: Instant, Range: 25ly, Fuel Consumption: 10 units of Quirium/jump.)'}
    ftlproptrait.set('Hyperdrive (Spool time: 1 turn, Speed: 5ly/turn, Fuel Consumption: 1 unit of Quirium/turn.)')
    superproptrait = OptionMenu(newgame, ftlproptrait, *ftlproptraits)
    superproptrait.grid(row=2, column=4)
    
    startweapons = Label(newgame, text = "Starting Weapons Tech:")
    startweapons.grid(row=3, column=3)
    startweaponsdrop = StringVar(newgame)
    startweaponslist = {'Mass Drivers (Medium Range, +15% Armor Damage, -15% Shield Damage, +0% Accuracy)','Energy Weapons (Short Range, -15% Armor Damage, +15% Shield Damage, +0% Accuracy)','Plasma Missiles (Long Range, +5% Armor and Shield Damage, +25% Accuracy)'}
    startweaponsdrop.set('Mass Drivers (Medium Range, +15% Armor Damage, -15% Shield Damage, +0% Accuracy)')
    wepproptrait = OptionMenu(newgame, startweaponsdrop, *startweaponslist)
    wepproptrait.grid(row=3, column=4)
    
    govt = Label(newgame, text = "Government:")
    govt.grid(row=4, column=3)
    govtdrop = StringVar(newgame)
    govtlist = {'Republic (+20% Happiness, +10% Production)','Communist (-20% Happiness, +20% Production)','Democracy (+5% Happiness, +5% Production)'}
    govtdrop.set('Republic (+20% Happiness, +10% Production)')
    govttrait = OptionMenu(newgame, govtdrop, *govtlist)
    govttrait.grid(row=4, column=4)

    layout = Label(newgame, text = "Home System Layout:")
    layout.grid(row=5, column=3)
    layoutdrop = StringVar(newgame)
    layoutlist = {'Sol (Easy Difficulty)', 'Achenar (Medium Difficulty)','Polaris (Hard Difficulty)'}
    layoutdrop.set('Sol (Easy Difficulty)')
    layouttrait = OptionMenu(newgame, layoutdrop, *layoutlist)
    layouttrait.grid(row=5, column=4)

    start = Button(newgame, text="Start", width = 15, command = startgame)
    start.grid(row=7, column=4)
    
    quitcreate = Button(newgame, text="Quit", width = 15, command = quit)
    quitcreate.grid(row=8, column=4)
    
def startgame():
    print ("yee")    

def quit():
    root.destroy()

root = Tk()
root.title("Infinite Frontier")
inst = Label(root, text = "Welcome to Infinite Frontier!")
inst.grid(row=0)
newgame = Button(root, text="New Game", width = 30, command = newgame)
newgame.grid(row=1)
wip = Label(root, text = "Save files are a WIP")
wip.grid(row=2)
newquit = Button(root, text="Quit", width = 30, command = quit)
newquit.grid(row=3)
root.mainloop()

#name = Entry(root, width=15)
#name.grid(row=2)
