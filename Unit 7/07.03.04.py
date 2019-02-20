import random
import turtle

def get_rand_color():
    r = random.randint(0,255)
    g = random.randint(0,255)
    b = random.randint(0,255)
    color = (r,g,b)
    return color

def rand_loc():
    x = random.randint(-200, 200)
    y = random.randint(-200, 200)
    coord = (x, y)
    return coord

turtle.colormode(255)
turtle.setup(500, 500)
turtle.speed(0)

fourchan = int(input())

for i in range (fourchan):
    coord = rand_loc()
    color = get_rand_color()
    turtle.penup()
    turtle.goto(coord[0], coord[1])
    turtle.pendown()
    turtle.fillcolor(color)
    turtle.begin_fill()
    turtle.circle(25)
    turtle.end_fill()
