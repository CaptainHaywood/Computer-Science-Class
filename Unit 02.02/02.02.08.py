import turtle

turtle.color("blue")
turtle.speed(0)
num = 50

for i in range(350):
    turtle.forward(num)
    turtle.right(47)
    num = num + 1

turtle.color("red")

for i in range(350):
    turtle.backward(num)
    turtle.left(47)
    num = num - 1

turtle.left(90)
turtle.forward(250)
turtle.color("green")

for i in range (350):
  turtle.forward(num)
  turtle.right(47)
  num = num + 1
