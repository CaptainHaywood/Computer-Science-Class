import turtle

def SQUARES(sideLen):
    for i in range (4):
        turtle.pendown()
        turtle.forward(sideLen)
        turtle.right(90)
    turtle.penup()
    turtle.forward(sideLen + 10)

sideLen = 10
spacing = 10

for i in range (5):
    SQUARES(sideLen)
