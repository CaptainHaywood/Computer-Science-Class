
def get_board(board):
    s = " " + board[0] + " | " + board[1] + " | " + board[2]
    s = s + "\n" # go to next line
    s = s + "---|---|---"
    s = s + "\n" # go to next line
    s = s + " " + board[3] + " | " + board[4] + " | " + board[5]
    s = s + "\n" # go to next line
    s = s + "---|---|---"
    s = s + "\n" # go to next line
    s = s + " " + board[6] + " | " + board[7] + " | " + board[8]
    return s
    
def check_horizontal_win():
    if board[0] == board[1] == board[2]:
        return True
    elif board[3] == board[4] == board[5]:
        return True
    elif board[6] == board[7] == board[8]:
        return True
    return False

def check_vertical_win():
    if board[0] == board[3] == board[6]:
        return True
    elif board[1] == board[4] == board[7]:
        return True
    elif board[2] == board[5] == board[8]:
        return True
    return False

def check_diagonal_win():
    if board[0] == board[4] == board[8]:
        return True
    elif board[2] == board[4] == board[6]:
        return True
    return False

    
# -- Main Section
board = "123456789"
playerTurn = "X"
done = False
numMoves = 0

while done != True:
    print(get_board(board))
    
    moveout = "Player " + playerTurn + ", make a move: " 
    move = int(input(moveout))
    slicer = move - 1
    move = str(move)
    if move == board[slicer]:
        board = board.replace(move, playerTurn)
    else:
        print("That space is already occupied.")


    numMoves = numMoves + 1
    if numMoves >= 9:
        done = True
        print(get_board(board))
        print("Cats Game!")
    
    if check_horizontal_win() == True or check_vertical_win() == True or check_diagonal_win() == True:
        done = True
        print(get_board(board))
        print("Player", playerTurn, "wins!")
    else:
        if playerTurn == "X":
            playerTurn = "O"
        else:
            playerTurn = "X"

    
    
