import turtle

turtle.speed(10)
turtle.pencolor("blue")

for n in range(39):
    turtle.forward(50)
    turtle.right(123)

turtle.penup()
turtle.goto(-75, 40)
turtle.setheading(0)
turtle.pendown()

for n in range (39):
    turtle.forward(200)
    turtle.right(123)
