# PYTHON HANGMAN (C) 2019 JAMES HAYWOOD
# DO NOT DISTRIBUTE WITHOUT THIS MESSAGE INTACT, AND IF YOUR NAME IS
# AUDREY WANG, DELETE THIS FILE RIGHT NOW AND FINISH THE PROGRAM
# YOURSELF

import random

def main(easy, normal, hard):
    print("H A N G M A N")
    print("With over 10,000 words!")
    print("\n1. New game")
    print("2. Credits")
    print("q/Q quit\n")
    mainmenu = input("> ")

    if mainmenu == "1":
        print("\nSelect difficulty:\n1. Easy (1-4 chars, infinite tries)\n2. Normal (5-8 chars, 6 tries)\n3. Hard (9+ chars, 6 tries)\n")
        diffsel = input("> ")
        if diffsel in ["1", "easy"]:
            hangman(easy, 0)
        elif diffsel in ["2", "normal"]:
            hangman(normal, 6)
        elif diffsel in ["3", "hard"]:
            hangman(hard, 6)
        else:
            print("Invalid option.\n")
            main(dictionary_easy, dictionary_normal, dictionary_hard)
        
    elif mainmenu == "2":
        print("\nPython Code by James Haywood\nDictionaries built from google-10000-english github repo by first20hours\n")
        main(dictionary_easy, dictionary_normal, dictionary_hard)
    elif mainmenu == "q" or mainmenu == "Q":
        print("Goodbye.")
        quit()
    else:
        print("Invalid option.\n")
        main(dictionary_easy, dictionary_normal, dictionary_hard)
        

def hangman(dictionary, maxLives):

    def print_output(fails):
        if maxLives != 0:
            lives = str(maxLives)
            failures = str(fails)
            lifecount = "Incorrect/Tries Remaining: " + failures + "/" + lives + "\n"
            print(lifecount)
        print ("".join([x+"" for x in output]))

    def play_again():
        playagain = input("\nDo you want to play again? ")
        if playagain in ['y', 'Y', 'yes']:
            print("")
            hangman(dictionary, maxLives)
        else:
            quit()
        
    print("")
    word = random.choice(dictionary)
    print(word)
    wordlen = len(word)
    done = False
    fails = 0
    output = ['-'] * wordlen


    while done != True:
        print_output(fails)
        guess = input("Guess: ")
        print("")
        if guess == word:
            print("")
            print(word)
            print("\nYou win!")
            play_again()
        elif guess in word:
            for i,x in enumerate(word):
                if x is guess:
                    output[i] = guess
        else:
            print("Incorrect.\n")
            
            fails = fails + 1
            if maxLives != 0:
                if fails >= maxLives:
                    print("Out of lives - you lose!")
                    print("")
                    print("Your word was:", word, "")
                    play_again()
                    
        isDone = "".join([x+"" for x in output])
        if isDone == word:
            done = True
            print("")
            print(word)
            print("\nYou win!")
            play_again()

with open('hangman_dict_easy.txt') as input_file:
    dictionary_easy = [line.strip() for line in input_file]
with open('hangman_dict_normal.txt') as input_file:
    dictionary_normal = [line.strip() for line in input_file]
with open('hangman_dict_hard.txt') as input_file:
    dictionary_hard = [line.strip() for line in input_file]

main(dictionary_easy, dictionary_normal, dictionary_hard)

