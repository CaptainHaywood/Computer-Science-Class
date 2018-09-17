import turtle

turtle.bgcolor(0,0,0) # set the background of the window to black

# use RGB color to control the turtle pen color
turtle.colormode(255) # values for red, green, blue range from 0-255
R = 165
G = 42
B = 42
turtle.pencolor(R,G,B)
for i in range(4):
    turtle.forward(100)
    turtle.right(90)
