import turtle
turtle.speed(10) # set the speed to 10
turtle.bgcolor(0,0,0) # set the background of the window to black
# use RGB color to control the turtle pen color
turtle.colormode(255) # values for red, green, blue range from 0-255
# define some colors
redColor = (255,0,0)
orangeColor = (255,180,0)
yellowColor = (255,255,0)
greenColor = (0,190,0)
blueColor = (0,0,255)
purpleColor = (120,0,200)
# make a list of colors, more on this later in the course!
rainbowColors = [redColor,
orangeColor,
yellowColor,
greenColor,
blueColor,
purpleColor]
# set some parameters for the drawing
turtle.pensize(20)
startX = 200
radius = 200
# draw a cool design
for n in range(6):
# go to the start location
    turtle.penup()
    turtle.goto(startX,0)
    turtle.setheading(90)
    turtle.pendown()
    # draw
    turtle.pencolor(rainbowColors[n]) # set the turtle&#39;s pen color
    turtle.circle(radius,180)
    # update the drawing parameters
    startX = startX - 15
    radius = radius - 15
