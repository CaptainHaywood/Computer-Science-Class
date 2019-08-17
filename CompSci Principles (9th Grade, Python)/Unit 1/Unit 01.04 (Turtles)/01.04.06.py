import turtle

turtle.pencolor("blue")
turtle.pensize(3) #THICC

turtle.fillcolor("yellow")

turtle.begin_fill()

turtle.setheading(360)

for n in range (8):
    turtle.forward(50)
    turtle.right(45)

turtle.end_fill()
