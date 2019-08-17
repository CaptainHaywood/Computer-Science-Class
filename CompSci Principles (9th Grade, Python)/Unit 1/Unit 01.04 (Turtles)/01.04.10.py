import turtle

width = 200

turtle.forward(200)
turtle.right(90)
turtle.forward(30)
turtle.right(90)
turtle.forward(200)
turtle.right(90)
turtle.forward(30)

width = width - 40


for n in range(4):
    turtle.right(90)
    turtle.forward(20)
    turtle.left(90)
    turtle.forward(30)
    turtle.right(90)
    turtle.forward(width)
    turtle.right(90)
    turtle.forward(30)
    turtle.right(90)
    turtle.forward(width)
    turtle.right(90)
    turtle.forward(30)
    width = width - 40
