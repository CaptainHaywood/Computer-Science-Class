import turtle
turtle.penup()
turtle.setx(-50)
turtle.sety(50)
turtle.pendown()

loop = 0

while loop < 4:
    turtle.forward(100)
    turtle.right(90)
    loop = loop + 1
