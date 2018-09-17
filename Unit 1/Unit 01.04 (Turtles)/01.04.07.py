import turtle

sideLength = int(input("Enter the side length: "))
numSides = int(input("Enter the number of sides: "))
turnAngle = 360 / numSides

for n in range (numSides):
    turtle.forward(sideLength)
    turtle.right(turnAngle)

