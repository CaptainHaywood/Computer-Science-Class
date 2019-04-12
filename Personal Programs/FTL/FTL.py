from termcolor import colored
import csv
import os
import time

print("Launching FTL: Text Edition... buckle up!")

print("Defining constants...")

#Weapon Stat Indices
DAMAGE = 0
POWER = 1
SHOTS = 2
TYPE = 3
COOLDOWN = 4
COST = 5
TARGETS = 6

#Ship Stat Indices
REACTOR = 0
SHIELDS = 1
ENGINES = 2
OXYGEN = 3
WEAPONS = 4
DRONES = 5
MEDBAY = 6
PILOT = 7
SENSORS = 8
DOORS = 9
BATTERY = 10
TELEPORTER = 11
CLOAK = 12
CLONEBAY = 13
MINDCONTROL = 14
HACKING = 15
WEP1 = 16
WEP2 = 17
WEP3 = 18
WEP4 = 19
CREW1 = 20
CREW2 = 21
CREW3 = 22
CREW4 = 23
FUEL = 24
MISSILES = 25
PARTS = 26

# Termcolor strings
powered = colored('[+]', 'green')
unpowered = colored('[-]', 'grey')
broken = colored('[x]', 'red')
health = colored('#', 'green')
shieldPowered = colored('(*)', 'blue')
shieldCharging = colored('(^)', 'yellow')
shieldOff = colored('(x)', 'red')

print("Loading configuration files...")
configFiles = ["weapons.csv", "ships.csv"]

for file in range(len(configFiles)):    
    reader = csv.reader(open(configFiles[file]))
    result = {}
    for row in reader:
        key = row[0]
        result[key] = row[1:]
    
    if file == 0:
        weapons = result
    elif file == 1:
        playerships = result

def mainmenu():
    os.system("clear")
    print("FTL: TEXT EDITION")

def shipInfo():
    print("The Kestrel\n")
    print("HULL:   ", (health * 30), "")
    ship = playerships['The Kestrel']
    print("REACTOR:", (powered * int(ship[REACTOR])), "")
    print("")
    print("SHIELDS:", (powered * int(ship[SHIELDS])), "")
    print("ENGINES:", (powered * int(ship[ENGINES])), "")
    print("OXYGEN: ", (powered * int(ship[OXYGEN])), "")
    print("WEAPONS:", (powered * int(ship[WEAPONS])), "")
    print("MEDBAY: ", (powered * int(ship[MEDBAY])), "")
    print("")
    print("PILOT:  ", (powered * int(ship[PILOT])), "")
    print("SENSORS:", (powered * int(ship[SENSORS])), "")
    print("DOORS:  ", (powered * int(ship[DOORS])), "")
    print("")
    print(ship[CREW1])
    print(ship[CREW2])
    print(ship[CREW3])
    print(ship[CREW4])
    print("")
    print(ship[WEP1])
    print(ship[WEP2])
    print(ship[WEP3])
    print(ship[WEP4])

def hangar():
    os.system("clear")
    ship = playerships['The Kestrel']
    print(ship)
    launchOK  = False
    shipInfo()
    print("\nEnter HELP for hangar commands.")
    while launchOK == False:
        hangarTerm = input(">")
        hangarTerm.upper()
        if hangarTerm == "HELP":
            print("\nHANGAR TERMINAL HELP\n")
            print("HELP - This menu")
            print("SWAP - Select ship")
            print("SHOW - Display current ship information")
            print("DIFF - Change difficulty")
            print("DETAIL - Display in-depth weapon stats")
            print("LAUNCH - Leave the hangar and jump to Sector 1")
        elif hangarTerm == "SWAP":
            print("Not implemented")
        elif hangarTerm == "SHOW":
            os.system("clear")
            shipInfo()
        elif hangarTerm == "DIFF":
            print("Not implemented")
        elif hangarTerm == "DETAIL":
            print("\nWeapon Details\n")
            wepA = ship[WEP1]
            if wepA != "NULL":
                print(ship[WEP1], "")
                print("Type:", weapons[wepA][TYPE])
                print("Damage:", weapons[wepA][DAMAGE])
                print("Power:", weapons[wepA][POWER])
                print("Shots:", weapons[wepA][SHOTS])
                print("Cooldown:", weapons[wepA][COOLDOWN])
                print("Targets:", weapons[wepA][TARGETS])
                print("")
            wepB = ship[WEP2]
            if wepB != "NULL":
                print(wepB)
                print("Type:", weapons[wepB][TYPE])
                print("Damage:", weapons[wepB][DAMAGE])
                print("Power:", weapons[wepB][POWER])
                print("Shots:", weapons[wepB][SHOTS])
                print("Cooldown:", weapons[wepB][COOLDOWN])
                print("Targets:", weapons[wepB][TARGETS])
                print("")
            wepC = ship[WEP3]
            if wepC != "NULL":
                print(wepB)
                print("Type:", weapons[wepC][TYPE])
                print("Damage:", weapons[wepC][DAMAGE])
                print("Power:", weapons[wepC][POWER])
                print("Shots:", weapons[wepC][SHOTS])
                print("Cooldown:", weapons[wepC][COOLDOWN])
                print("Targets:", weapons[wepC][TARGETS])
                print("")
            wepD = ship[WEP4]
            if wepD != "NULL":
                print(wepB)
                print("Type:", weapons[wepD][TYPE])
                print("Damage:", weapons[wepD][DAMAGE])
                print("Power:", weapons[wepD][POWER])
                print("Shots:", weapons[wepD][SHOTS])
                print("Cooldown:", weapons[wepD][COOLDOWN])
                print("Targets:", weapons[wepD][TARGETS])
                print("")
        elif hangarTerm == "LAUNCH":
            launchOK = True
    launch()

def peaceShip():
    print("wip")


def launch():
    os.system("clear")
            
    


hangar()




        
