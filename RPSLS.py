#RPSLS By James Haywood
import random
global points
points = 0
def game():
    global points
    print ("Points:", points, "")
    print("Please enter a symbol.")
    print("Options: Rock, Paper, Scissors, Lizard, or Spock")
    player = input("> ")

    if player in ("Rock", "rock"):
        symbol = "rock"
    elif player in ("Paper", "paper"):
        symbol = "paper"
    elif player in ("Scissors", "scissors"):
        symbol = "scissors"
    elif player in ("Lizard", "lizard"):
        symbol = "lizard"
    elif player in ("Spock", "spock"):
        symbol = "scissors"

    print ("Computer is choosing...")
    computer = (random.randint(1, 5))

    if computer == 1:
        csymbol = "rock"
    elif computer == 2:
        csymbol = "paper"
    elif computer == 3:
        csymbol = "scissors"
    elif computer == 4:
        csymbol = "lizard"
    elif computer == 5:
        csymbol = "spock"


    print("You chose:", symbol, "")
    print("Computer chose:", csymbol, "")
    if symbol == "rock" and csymbol in ("lizard", "scissors"):
        print ("Player wins!")
        points = points + 1
        game()
    elif symbol == "paper" and csymbol in ("rock", "spock"):
        print ("Player wins!")
        points = points + 1
        game()
    elif symbol == "scissors" and csymbol in ("paper", "lizard"):
        print ("Player wins!")
        points = points + 1
        game()
    elif symbol == "lizard" and csymbol in ("paper", "spock"):
        print ("Player wins!")
        points = points + 1
        game()
    elif symbol == "spock" and csymbol in ("rock", "scissors"):
        print ("Player wins!")
        points = points + 1
        game()
    elif symbol == cysmbol:
        print ("Player and Computer tie!")
        game()
    else:
        print ("Computer wins!")
        points = points - 1
        game()



game()
    
