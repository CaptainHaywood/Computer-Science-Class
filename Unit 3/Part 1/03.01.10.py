import turtle

def design(sideLen):
    for n in range(10):
        for n in range(4):
            turtle.forward(sideLen)
            turtle.right(90)
        turtle.right(36)

turtle.speed(0)
design(50)
