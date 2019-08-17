import turtle

def draw_square():
    start = 20
    for i in range (5):
        turtle.forward(start)
        turtle.right(90)
        turtle.forward(start)
        turtle.right(90)
        turtle.forward(start)
        turtle.right(90)
        turtle.forward(start)
        turtle.penup()
        turtle.forward(10)
        turtle.left(90)
        turtle.forward(10)
        turtle.right(180)
        turtle.pendown()
        start = start + 20

draw_square()
