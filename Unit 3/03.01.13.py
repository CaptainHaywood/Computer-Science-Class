import turtle
# -- Function Definitions


def draw_board(x, y, size):
    color = "red"
    turtle.color("red")
    start = 1
    turtle.penup()
    turtle.goto(x, y)
    turtle.pendown()
    for n in range(8):
        for n in range(8):
            if start == 0:
                if color == "red":
                    color = "black"
                    turtle.color("black")
                elif color == "black":
                    color = "red"
                    turtle.color("red")
            else:
                start = 0
            turtle.begin_fill()
            for n in range(4):
                turtle.forward(size)
                turtle.right(90)
            turtle.end_fill()
            turtle.forward(size)
        if color == "red":
            turtle.color("black")
            color="black"
        elif color == "black":
            turtle.color("red")
            color="red"
        turtle.right(90)
        turtle.forward(size)
        turtle.right(90)
        turtle.forward(size * 8)
        turtle.right(180)


def main():
    turtle.speed(0)
    draw_board(-100, 100, 50)

def gotomain():
    main()

gotomain()
