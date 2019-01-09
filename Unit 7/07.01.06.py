import random
gameOver = False
wrong = 0

while (gameOver == False):
    num1 = random.randint(1, 10)
    num2 = random.randint(1, 10)
    ans = int( input( str(num1) + " plus " + str(num2) + "? ") )
    if ans == num1 + num2:
        print("Correct")
    elif ans != num1 + num2:
        print("Incorrect")
        wrong = wrong + 1
        if wrong >= 3:
            print("Game over! You answered 3 problems incorrectly.")
            gameOver = True


