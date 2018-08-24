import turtle

turtle.register_shape("turtle.gif")
turtle.shape("turtle.gif")

for n in range(4):
    turtle.forward(100)
    turtle.right(90)
    turtle.stamp()

