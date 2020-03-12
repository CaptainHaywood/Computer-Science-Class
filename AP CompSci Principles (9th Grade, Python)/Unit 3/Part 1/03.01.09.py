import turtle
# -- Function Definitions


def draw_board(x, y, size):
    turtle.penup()
    turtle.goto(x, y)
    turtle.pendown()
    for n in range(8):
        for n in range(8):
            for n in range(4):
                turtle.forward(size)
                turtle.right(90)
            turtle.forward(size)
        turtle.right(90)
        turtle.forward(size)
        turtle.right(90)
        turtle.forward(size * 8)
        turtle.right(180)

# -- Main Section
turtle.speed(0)
draw_board(-100, 100, 10)
draw_board(0, 0, 30)
