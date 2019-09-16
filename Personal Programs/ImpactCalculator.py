#High-Velocity Kinetic Impact Energy Calculator
import time

def calculate():
    print("\n-CALCULATE-")
    impactorMass = float(input(("Impactor Mass (kg): ")))
    impactorVelocity = float(input(("Impact Velocity (m/s): ")))
    print("\nCalculating impact...")
    impactEnergyJoules = 0.5 * impactorMass * (impactorVelocity ** 2)
    
    impactEnergyKilotons = impactEnergyJoules / 4184000000000
    impactEnergyMegatons = impactEnergyJoules / 4184000000000000
    impactEnergyGigatons = impactEnergyJoules / 4184000000000000000
    impactEnergyTeratons = impactEnergyJoules / 4184000000000000000000
    impactEnergyPetatons = impactEnergyJoules / 4184000000000000000000000
    
    impactEnergyEarthsDestroyed = impactEnergyJoules / 200000000000000000000000000000000

    print("\n-RESULTS-")
    print("Impact Energy (Joules): " + str(impactEnergyJoules))
    print("Impact Energy (KT): " + str(impactEnergyKilotons))
    print("Impact Energy (MT): " + str(impactEnergyMegatons))
    print("Impact Energy (GT): " + str(impactEnergyGigatons))
    print("Impact Energy (TT): " + str(impactEnergyTeratons))
    print("Impact Energy (PT): " + str(impactEnergyPetatons))
    print("Earths Destroyed: " + str(impactEnergyEarthsDestroyed))
    main()

def main():
    print("-IMPACTOR CALCULATOR-")
    print("1. Calculate Impact")
    print("2. Quit")
    menu = input("> ")
    if menu == "1":
        calculate()
    else:
        quit()

main()
