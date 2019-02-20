def hangman(word):

    def print_output():
        print ("".join([x+"" for x in output]))


    wordlen = len(word)
    done = False
    fails = 0
    output = ['-'] * wordlen


    while done != True:
        print_output()
        guess = input("Guess: ")
        if guess in word:
            for i,x in enumerate(word):
                if x is guess:
                    output[i] = guess
                    
        isDone = "".join([x+"" for x in output])
        if isDone == word:
            done = True
            print(word)
            print("Congratulations!")
            #play_again()

mimir = input("")
print("\n" * 75)
hangman(mimir)

