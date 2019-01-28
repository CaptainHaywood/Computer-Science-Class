from random import randint
global guesses
global num
num = randint(1,100)
guesses = 0
print ("Guess The Number (C) 2018 James Haywood")
print("")
print ("Try and guess the number between 1 and 100 in 5 turns or less!")
print ("")

def reboot():
    global guesses
    global num
    guesses = 0
    num = randint(1,100)
    game()

def win():
    print ("YOU WIN DAMMIT")
    reboot()

def game():
    global guesses
    global num
    if guesses == 5:
        print ("GAME OVER. REBOOTING...")
        reboot()
    print ("You have guessed:", guesses, "times. You have to get the number in 5 tries or less.")
    guess = input("> ")
    guess = int(guess)
    if guess == num:
        win()
    else:
        guesses = guesses + 1
        if guess > num:
            print ("Your guess was greater than the number.")
            game()
        elif guess < num:
            print ("Your guess was lower than the number.")
            game()
    

game()
