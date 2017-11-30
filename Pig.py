from tkinter import *
import time
import random

def diceroll():
    global roll
    global result
    result = random.randrange(1,6)
    playerone()

def playerone():
    global roll
    global result
    global pointz
    global pointsA
    global pointsB
    global game
    roll.config(text = result)
    if result == 1:
        pointsA = 0
        playertwo()
    elif result != 1:
        pointsA = pointsA + result
    humanplay()
        
    
    
    
    

def engage():
    engage = Toplevel()
    engage.title("Create A New Game")
    points = Label(engage, text = "Points Required To Win:")
    points.grid(row=1, column=1)
    pointreq = Entry(engage, width = 5)
    pointreq.insert(0, 50)
    pointreq.grid(row=1, column=2)
    
    def humanplay():
        global pointz
        global pointsA
        global pointsB
        global roll
        pointsA = 0
        pointsB = 0
        pointz = pointreq.get()
        global game
        game = Toplevel()
        game.title("Pig Game")
        roll = Label(game)
        res = Label(game, text="You Rolled A:")
        pointzA = Label(game, text="Player One Points:")
        pointzA.grid(row=2, column=1)
        pointzB = Label(game, text="Player Two Points:")
        pointzB.grid(row=3, column=1)
        reqpoi = Label(game, text = "Points To Win:")
        reqpoi.grid(row=4, column = 1)
        pointzAA = Label(game, text=pointsA)
        pointzAA.grid(row=2, column=2)
        pointzBB = Label(game, text=pointsB)
        pointzBB.grid(row=3, column=2)
        reqpoz = Label(game, text=pointz)
        reqpoz.grid(row=4, column=2)
        
        res.grid(row=1, column=2)
        roller = Button(game, text = "Click To Roll:", width=30, command=diceroll)
        roller.grid(row=1, column=1)
        roll.grid(row=1, column=3)
        
        
        

        
        
    human = Button(engage, text = "Play Against Another Human", width = 30, command = humanplay)
    human.grid(row=2, column = 1)
    ai = Button(engage, text = "Play Against An AI (Unavailable)", width = 30)
    ai.grid(row=2, column = 2)
    pointreq.focus_set()


    
def help():
    helpwin = Tk()
    helpwin.title("How To Play")
    step0 = Label(helpwin, text = "How To Play Pig:")
    step1 = Label(helpwin, text = "1. Accumulate score by rolling a die until you decide to stop and the other player goes.")
    step2 = Label(helpwin, text = "2. However, if you roll a one, you get no points for your turn.")
    step3 = Label(helpwin, text = "3. The game goes on until a player reaches a specific number of points set at game start.")
    step0.grid(row=1)
    step1.grid(row=2)
    step2.grid(row=3)
    step3.grid(row=4)
    
welcome = Tk()
welcome.title("Pig")
hi = Label(welcome, text = "Welcome to Pig!")
hi.grid(row=0)
startgame = Button(welcome, text = "Start A New Game", width = 30, command=engage)
startgame.grid(row=2)
helpme = Button(welcome, text = "How To Play", width = 30, command=help)
helpme.grid(row=3)
welcome.mainloop()
