import math
import time

def interplanetary():
    print("")
    startLocation = input("Origin Location or Celestial Body: ")
    endLocation = input("Destination Location or Celestial Body: ")
    distanceK = float(input("Distance (km) between Origin and Destination: "))
    distance = distanceK * 1000 #convert km to m
    accelerationG = float(input("Acceleration (g) of Spacecraft: "))
    acceleration = accelerationG * 9.8 #translate gees into m/s^2
    print("")
    print("--- RESULTS FOR INTERPLANETARY CONTINUOUS THRUST TRAJECTORY FROM: ", startLocation, "TO", endLocation, "---")
    print("Distance (km):", distanceK, "")
    print("Acceleration (g):", accelerationG, "")
    print("")
    time.sleep(2)
    #calculate travel time w/ turn and burn
    timeTravel = 2 * math.sqrt(distance / acceleration)
    
    print("Travel Time (Seconds):", round(timeTravel, 2), "")
    timeTravelM = timeTravel / 60
    print("Travel Time (Minutes):", round(timeTravelM, 2), "")
    timeTravelH = timeTravel / 3600
    print("Travel Time (Hours):", round(timeTravelH, 2), "")
    timeTravelD = timeTravel / 86400
    print("Travel Time (Days):", round(timeTravelD, 2), "")
    timeTravelW = timeTravel / 604800
    print("Travel Time (Weeks):", round(timeTravelW, 2), "")
    timeTravelMO = timeTravelM / 43800
    print("Travel Time (Months):", round(timeTravelMO, 2), "")
    timeTravelY = timeTravelM / 525600
    print("Travel Time (Years):", round(timeTravelY, 2), "")
    print("")

    #calculate delta-v expended during journey
    deltaV = 2 * math.sqrt(distance * acceleration)
    print("Delta-V Expended:", round(deltaV, 2), "m/s")
    deltaVK = deltaV / 1000
    print("Delta-V Expended:", round(deltaVK, 2), "km/s")
    print("")
    distanceM = distance / 2

    #calculate velocity at turn and burn
    maxV = deltaV / 2
    print("Maximum Velocity:", round(maxV, 2), "m/s")
    maxVK = deltaVK / 2
    print("Maximum Velocity:", round(maxVK, 2), "km/s")
    print("")
    menu()

def interstellar():
    print("")
    startLocation = input("Origin Star: ")
    endLocation = input("Destination Star: ")
    distanceK = float(input("Distance (LY) between Origin and Destination: "))
    #convert lightyears to meters
    distance = distanceK * 9.461e+15 
    accelerationG = float(input("Acceleration (g) of Spacecraft: "))
    #convert gees to m/s^2
    acceleration = accelerationG * 9.8
    #maximum velocity of ship (e.g. point at which reaction mass is half expended)
    maxCP = float(input("Maximum Velocity (c): "))
    maxC = float(maxCP)
    print("")
    print("--- RESULTS FOR INTERSTELLAR CONTINUOUS THRUST TRAJECTORY FROM: ", startLocation, "TO", endLocation, "---")
    print("Distance (LY):", distanceK, "")
    print("Acceleration (g):", accelerationG, "")
    print("Maximum Velocity (c):", maxC, "")
    
    if maxC >= 1:
        #warn idiots that relativity dislikes warp travel with a vengenance
        print("WARNING: FTL speeds are physically impossible. Please enter a valid speed.")
        interstellar()
        
    #convert maximum velocity into m/s
    maxC = maxC * 299792 #kms
    maxC = maxC * 1000
    #define speed of light in m/s
    c = 299792 * 1000

    time.sleep(2)

    print("")
    print("---  TRAVEL TIME FOR PLANETBOUND OBSERVER (NO TIME DILATION) ---")
    print("")
    
    #calculate time under acceleration to reach user-defined max velocity
    timeMaxVBase = (maxC - 0) / acceleration
    timeMaxVD = timeMaxVBase / 86400
    print("Time to Maximum Velocity (Days):",  round(timeMaxVD, 2), "")
    timeMaxVW = timeMaxVD / 7
    print("Time to Maximum Velocity (Weeks):",  round(timeMaxVW, 2), "")
    timeMaxVM = timeMaxVW / 4.345
    print("Time to Maximum Velocity (Months):",  round(timeMaxVM, 2), "")
    timeMaxVY = timeMaxVM / 12
    print("Time to Maximum Velocity (Years):",  round(timeMaxVY, 2), "")
    print("")
    
    #calculate how much of the distance is spent coasting inbetween accel/decel
    distanceR = 0.5 * 9.8 * (timeMaxVBase ** 2)
    distanceR = distance - (distanceR * 2)
    timeCoast = distanceR / maxC
    timeCoastD = timeCoast / 86400
    print("Time Coasting at Maximum Velocity (Days):",  round(timeCoastD, 2), "")
    timeCoastW = timeCoastD / 7
    print("Time Coasting at Maximum Velocity (Weeks):",  round(timeCoastW, 2), "")
    timeCoastM = timeCoastW / 4.343
    print("Time Coasting at Maximum Velocity (Months):",  round(timeCoastM, 2), "")
    timeCoastY = timeCoastM / 12
    print("Time Coasting at Maximum Velocity (Years):",  round(timeCoastY, 2), "")
    print("")
    factorA = timeCoastY
    
    print("Time to Zero Velocity (Days):",  round(timeMaxVD, 2), "")
    print("Time to Zero Velocity (Weeks):",  round(timeMaxVW, 2), "")
    print("Time to Zero Velocity (Months):",  round(timeMaxVM, 2), "")
    print("Time to Zero Velocity (Years):",  round(timeMaxVY, 2), "")
    print("")

    #calculate total time (planetbound)
    planetBoundTime = (timeMaxVBase * 2) + timeCoast
    planetBoundTimeD = planetBoundTime / 86400
    print("Total Travel Time (Days):",  round(planetBoundTimeD, 2), "")
    planetBoundTimeW = planetBoundTimeD / 7
    print("Total Travel Time (Weeks):",  round(planetBoundTimeW, 2), "")
    planetBoundTimeM = planetBoundTimeW / 4.343
    print("Total Travel Time (Months):",  round(planetBoundTimeM, 2), "")
    planetBoundTimeY = planetBoundTimeM / 12
    print("Total Travel Time (Years):",  round(planetBoundTimeY, 2), "")
    #factorA = planetBoundTimeY
    print("")

    
    time.sleep(2)
    print("--- TRAVEL TIME FOR SHIPBOARD OBSERVER (TIME DILATION IN EFFECT) --- ")
    print("")
    #print standard values for time to maximum velocity
    #because dilation is negligible for most of
    #the acceleration period
    print("Time to Maximum Velocity (Days):",  round(timeMaxVD, 2), "")
    print("Time to Maximum Velocity (Weeks):",  round(timeMaxVW, 2), "")
    print("Time to Maximum Velocity (Months):",  round(timeMaxVM, 2), "")
    print("Time to Maximum Velocity (Years):",  round(timeMaxVY, 2), "")
    print("")

    #calculate dilation factor from maximum velocity
    ratio_to_c = (maxC ** 2) / (c ** 2)
    dilation = 1 / ((1 - ratio_to_c) ** 0.5)
    
    #calculate dilated passing of time using dilation factor
    coastDilated = timeCoast / dilation
    totalDilated = (timeMaxVBase * 2) + coastDilated

    #print dilated time spent coasting
    timeCoastD = coastDilated / 86400
    print("Dilated Time Coasting at Maximum Velocity (Days):",  round(timeCoastD, 2), "")
    timeCoastW = timeCoastD / 7
    print("Dilated Time Coasting at Maximum Velocity (Weeks):",  round(timeCoastW, 2), "")
    timeCoastM = timeCoastW / 4.343
    print("Dilated Time Coasting at Maximum Velocity (Months):",  round(timeCoastM, 2), "")
    timeCoastY = timeCoastM / 12
    print("Dilated Time Coasting at Maximum Velocity (Years):",  round(timeCoastY, 2), "")
    print("")

    print("Time to Zero Velocity (Days):",  round(timeMaxVD, 2), "")
    print("Time to Zero Velocity (Weeks):",  round(timeMaxVW, 2), "")
    print("Time to Zero Velocity (Months):",  round(timeMaxVM, 2), "")
    print("Time to Zero Velocity (Years):",  round(timeMaxVY, 2), "")
    print("")


    #calculate total passing of time with dilation
    dilatedD = totalDilated / 86400
    print("Dilated Travel Time (Days):", round(dilatedD, 2), "")
    planetBoundTimeW = dilatedD / 7
    print("Dilated Travel Time (Weeks):",  round(planetBoundTimeW, 2), "")
    planetBoundTimeM = planetBoundTimeW / 4.343
    print("Dilated Travel Time (Months):",  round(planetBoundTimeM, 2), "")
    planetBoundTimeY = planetBoundTimeM / 12
    print("Dilated Travel Time (Years):",  round(planetBoundTimeY, 2), "")
    print("")

    #calculate ship seconds to planet seconds
    dilationFactor = coastDilated / timeCoast
    print("Time Dilation Factor:", round(dilationFactor, 10), "shipboard seconds per planetbound second")
    print("")
    menu()
    
                                               
def reference():
    print("")
    print("--- Reference Sheets ---")
    print("")
    print("1 Solar System Distances")
    print("c Close")
    ref = input("> ")
    if ref == "1":
        print("")
        print("Planet | Average Distance from Sun in AU/KM")
        print("")
        print("Mercury - 0.39 AU or 58,343,170 KM")
        print("Venus - 0.72 AU or 107,710,467 KM")
        print("Earth - 1.00 AU or 149,597,871 KM")
        print("Mars - 1.52 AU or 227,388,763 KM")
        print("Belt - 3.20 AU or 478,713,186 KM")
        print("Jupiter - 5.20 AU or 777,908,928 KM")
        print("Saturn - 9.58 AU or 1,433,147,601 KM")
        print("Uranus - 19.20 AU or 2,872,279,117 KM")
        print("Neptune - 30.05 AU or 4,495,416,014 KM")
        print("Pluto - 39.48 AU or 5,906,123,935 KM")
        print("To get distance between two bodies, find the difference in KM.")
        reference()
    elif ref == "c" or ref == "C":
        menu()

def about():
    print("")
    print("--- About ---")
    print("Continuous Thrust Space Travel Calculator")
    print("(c) 2018 James Haywood")
    print("Relatavistic equations courtesy of Albert Einstein")
    print("")
    print("- Current Limitations - ")
    print("* Python floats only allow calculation of dilation up to the 12th decimal place, limiting the accuracy of dilation measurements.")
    print("? Plan to add optional 'dilation factor' instead of 'lightspeed percentage.'")
    print("")
    menu()

    
    
    

def menu():
    print("--- Continuous Thrust Space Travel Calculator ---")
    print("")
    print("1 Calculate Interplanetary Trajectory")
    print("2 Calculate Interstellar Trajectory")
    print("3 Reference Sheets")
    print("4 About")
    print("5 Quit")
    mainmenu = input ("> ")
    if mainmenu == "1":
        interplanetary()
    elif mainmenu == "2":
        interstellar()
    elif mainmenu == "3":
        reference()
    elif mainmenu == "4":
        about()
    elif mainmenu == "5":
        quit()
    else:
        print("Invalid Option.")
        menu()

menu()
