import math

# -- Function Definitions
def area_of_circle(radius):
    area = math.pi * radius * radius
    return area

# -- Main Section
radiusA = float(input("Radius? "))
radiusB = float(input("Radius? "))
radiusC = float(input("Radius? "))
radiusD = float(input("Radius? "))
radiusE = float(input("Radius? "))

totalArea = 0

area = area_of_circle(radiusA)
totalArea = totalArea +  area
area = area_of_circle(radiusB)
totalArea = totalArea +  area
area = area_of_circle(radiusC)
totalArea = totalArea +  area
area = area_of_circle(radiusD)
totalArea = totalArea +  area
area = area_of_circle(radiusE)
totalArea = totalArea +  area
totalArea = round(totalArea, 2)

print(totalArea)
