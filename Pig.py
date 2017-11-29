from tkinter import *
import time
import random



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
        pointz = pointreq.get()
        global game
        game = Toplevel()
        game.title("Pig Game")
        game.configure(background='grey')
        

        
        
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
