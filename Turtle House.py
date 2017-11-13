import turtle
loops = 0
loo = 0
dee = 50
global loops
global loo
global dee

mexicanlabor = turtle.Turtle()
wn=turtle.Screen()
wn.bgcolor("DeepSkyBlue")
wn.title("Turtle House")
mexicanlabor.penup()
mexicanlabor.right(90)
mexicanlabor.pencolor("yellow")
mexicanlabor.forward(300)
mexicanlabor.right(90)
mexicanlabor.forward(500)
mexicanlabor.right(180)
mexicanlabor.pendown()
mexicanlabor.forward(1000)

def groundfill():
    global loops
    while loops < 100:
        mexicanlabor.speed(0)
        mexicanlabor.right(90)
        mexicanlabor.forward(1)
        mexicanlabor.right(90)
        mexicanlabor.forward(1000)
        mexicanlabor.right(180)
        mexicanlabor.forward(1000)
        loops = loops + 1
        groundfill()
    house()

def house():
    house = turtle.Turtle()
    house.penup()
    house.right(90)
    house.forward(300)
    house.pendown()
    house.right(90)
    house.begin_fill()
    house.forward(50)
    house.right(90)
    house.forward(50)


groundfill()
    
