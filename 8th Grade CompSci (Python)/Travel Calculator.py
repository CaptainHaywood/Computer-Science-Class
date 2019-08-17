import sys
import time

boot1 = "Welcome to Car Travel Calculator!"
for char in boot1:
    sys.stdout.write(char)
    time.sleep(0.05)
print("")
dis =input("Distance in miles that you will travel: ")
spe =input("The planned average speed of your vehicle: ")
mpg =input("The efficiency of your vehicle in miles per gallon: ")
cos =input("The current cost for one gallon of gas in dollars: ")
print("Calculating...")
calcul = "[##########] DONE"
for char in calcul:
    sys.stdout.write(char)
    time.sleep(0.2)
time = float(dis) / float(spe)
hours = int(time)
minutes = (time*60) % 60
seconds = (time*3600) % 60
print("")
print("Time that will be spent travelling in HHMMSS (Hours, Minutes, Seconds): ")
print("%d:%02d:%02d" % (hours, minutes, seconds))
gasned = float(dis) / float(mpg)
print("The amount of gas used will be: ")
print (gasned)
gascash = float(gasned) * float(cos)
print ("The cost of the gas will be: ")
print (gascash)
end =input("Thank you for using Car Travel Calculator! Have a nice day.")
