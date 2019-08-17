import turtle

def SQUARES():
    for i in range (4):
        turtle.pendown()
        turtle.forward(20)
        turtle.right(90)
    turtle.penup()
    turtle.forward(30)

for i in range (5):
    SQUARES()
