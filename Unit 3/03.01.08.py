import turtle
# -- Function Definitions

def draw_square(size):
    for n in range(4):
        turtle.forward(size)
        turtle.right(90)

def draw_line_of_squares(x, y, num, size):
    turtle.penup()
    turtle.goto(x, y)
    turtle.pendown()
    size = size
    spacing = 10
    for n in range(num):
            draw_square(size)
            turtle.penup()
            turtle.forward(size + spacing)
            turtle.pendown()

# -- Main Section
draw_line_of_squares(-100, 100, 3, 5)
