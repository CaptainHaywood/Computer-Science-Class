import turtle

def draw_octo(x, y, sideLen):
    turtle.penup()
    turtle.goto(x, y)
    turtle.pendown()
    for i in range(8):
        turtle.forward(sideLen)
        turtle.right(45)

turtle.speed(0)
draw_octo(0, 0, 50)
draw_octo(85.5, 85.5, 50)
draw_octo(-85.5, 85.5, 50)
draw_octo(85.5, -85.5, 50)
draw_octo(-85.5, -85.5, 50)

