# ...
import os
import time

def mainmenu():
    os.system('cls' if os.name == 'nt' else 'clear')
    print("PopSim")
    print("1 Basic Simulation")
    print("2 Advanced Simulation")
    print("3 Help")
    mainmenu = input("> ")
    if mainmenu == "1":
        basicsim()

def basicsim():
    global bpop
    global bres
    global bgen
    os.system('cls' if os.name == 'nt' else 'clear')
    print("---BASIC SIMULATION---")
    try:
        bpop = int(input("Starting Population Count: "))
        bres = int(input("Starting Resource Count: "))
        bgen = int(input("Generation Run Time: "))
    except:
        print("INVALID INPUT.")
        wait = input("Press Enter to Continue...")
        basicsim()
    os.system('cls' if os.name == 'nt' else 'clear')
    print("---BEGIN SIMULATION---")

    def basicloop():
        
        def extinct():
            print("Population:", bpop, "Resources:", bres, "Generation:", basicgen,"")
            print("Population is zero. Simulation complete.")
            wait = input("Press Enter to Continue... THIS WILL CLEAR ALL RESULTS!")
            mainmenu()

        global bpop
        global bres
        global bgen
        basicgen = 0
        print("Population:", bpop, "Resources:", bres, "Generation:", basicgen,"")
        print("")
        print("Advancing time...")
        time.sleep(2)
        basicgen = basicgen + 1
        if basicgen == bgen:
            print("Simulation Complete.")
            wait = input("Press Enter to Continue... THIS WILL CLEAR ALL RESULTS!")
            mainmenu()
        elif bpop > bres:
            bcalc = bpop - bres
            bpop = bpop - bres
            bres = bres + bcalc
            bcalc = bres - bpop
            bpop = bpop + bcalc
            bres = bres - bcalc
        elif bpop < bres:
            bcalc = bres - bpop
            bres = bres - bpop
            bpop = bpop + bcalc
        elif bpop <= 0:
            extinct()
        
    for i in range(bgen):
        basicloop()
        


mainmenu()
