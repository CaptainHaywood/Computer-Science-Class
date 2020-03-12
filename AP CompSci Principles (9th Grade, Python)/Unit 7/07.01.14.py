from termcolor import colored
import random
import sys

firstname = ["Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Ophiuchus", "Sagittarius", "Aquarius", "Pisces"]
lastname = ["Alpha", "Beta", "Gamma", "Delta", "Zeta", "Eta", "Theta", "Omega", "Prime", "Kappa", "Lambda", "Sigma"]


def generate_system():
    numbodies = random.randint(1,15)

    space = " "
    print("")
    first = random.choice(firstname)
    last = random.choice(lastname)
    starname = " " + first + " " + last
    print(starname)
    rand = random.randint(1,4)

    if rand == 1:
        starcolor = 'yellow'
    elif rand == 2:
        starcolor = 'red'
    elif rand == 3:
        starcolor = 'white'
    elif rand == 4:
        starcolor = 'blue'
        
    rand = random.randint(1,2)
    if rand == 1:
        star = colored('\n  ***\n *****\n  ***\n', starcolor)
    else:
        star = colored('\n  ***   ***\n ***** *****\n  ***   ***\n', starcolor)
    print(star)
    
    
    
    for i in range (numbodies):
        rand = random.randint(1,5)
        
        if rand == 1:
            plantype = "Terran"
            planicon = "(#)"
            colorgen = random.randint(1,2)
            if colorgen == 1:
                plancolor = 'green'
            else:
                plancolor = 'blue'
            planetary = colored(planicon, plancolor)
            print(" ", planetary, "-", plantype, "\n   |")
            
            
        elif rand == 2:
            plantype = "Water"
            planicon = "(&)"
            plancolor = 'blue'
            planetary = colored(planicon, plancolor)
            print(" ", planetary, "-", plantype, "\n   |")
            
            
        elif rand == 3:
            plantype = "Dead"
            planicon = "(-)"
            plancolor = 'grey'
            planetary = colored(planicon, plancolor)
            print(" ", planetary, "-", plantype, "\n   |")
            
            
            
        elif rand == 4:
            plantype = "Volcanic"
            planicon = "(!)"
            colorgen = random.randint(1,2)
            if colorgen == 1:
                plancolor = 'red'
            else:
                plancolor = 'yellow'
            planetary = colored(planicon, plancolor)
            print(" ", planetary, "-", plantype, "\n   |")
            
            
            
        elif rand == 5:
            plantype = "Gas"
            planicon = "(@)"
            colorgen = random.randint(1,6)
            if colorgen == 1:
                plancolor = 'white'
            elif colorgen == 2:
                plancolor = 'blue'
            elif colorgen == 3:
                plancolor = 'green'
            elif colorgen == 4:
                plancolor = 'yellow'
            elif colorgen == 5:
                plancolor = 'cyan'
            elif colorgen == 6:
                plancolor = 'magenta'
            planetary = colored(planicon, plancolor)
            print(" ", planetary, "-", plantype, "\n   |")

    print("  END\n")
    redo = input("Generate a new system? ")
    if redo in "y" "Y" "yes":
        print("")
        generate_system()
    else:
        sys.exit()
    

generate_system()
