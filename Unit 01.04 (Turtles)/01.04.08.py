import turtle

turtle.pencolor("blue")
turtle.pensize(3) #THICC

turtle.fillcolor("yellow")

turtle.setheading(360)
turtle.penup()
turtle.setx(-50)
turtle.sety(50)
turtle.pendown()

turtle.begin_fill()

for n in range (8):
    turtle.forward(50)
    turtle.right(45)

turtle.end_fill()
