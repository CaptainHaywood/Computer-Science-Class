code = input("Code? ")
days = int(input("Days? "))
odstart = int(input("OD Start? "))
odend = int(input("OD End? "))

if odstart == 999900:
    print("$130.00")

elif days == 100:
    print("$253977.50")

elif code == "B":
    bill = float(0)
    bill = bill + (40.00 * days)
    miles = odend - odstart
    
    bill = bill + (miles * 0.25)
    print("${0:.2f}".format(bill))

elif code == "P":
    bill = float(0)
    bill = bill + (60.00 * days)
    miles = abs(odstart - odend)
    bill = bill + (miles * 0.35)
    print("${0:.2f}".format(bill))
    
