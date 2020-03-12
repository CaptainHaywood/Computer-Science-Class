import turtle
turtle.speed(10) # set the speed to 10
turtle.bgcolor(0,0,0) # set the background of the window to black
# use RGB color to control the turtle pen color
turtle.colormode(255) # values for red, green, blue range from 0-255
R = 255 # lots of red
G = 0 # no green
B = 0 # no blue
side = 50

for n in range(100):
    turtle.pencolor(R,G,B) # set the turtle&#39;s pen color
    turtle.forward(side)
    turtle.right(123)
    side = side + 5
    B = B + 2
    R = R - 2# add more green to the pen color
    # surprise! red + green = yellow
