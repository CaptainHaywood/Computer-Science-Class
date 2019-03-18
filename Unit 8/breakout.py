import pygame
from pygame.locals import *
import random
pygame.init()

# --- Your Functions Here
def getListOf10Blocks(yLoc, COLOR_LIST):
    BLOCK_WIDTH = 45
    BLOCK_HEIGHT = 20
    BLOCK_SPACING = 5
    blocklist = []
    xLoc = BLOCK_SPACING / 2
    colorLen = len(COLOR_LIST)
    colorLen = colorLen / 10
    colorLen = int(colorLen)
    for i in range(colorLen):
        for num in range(10):
            blocklist.append(pygame.Rect(xLoc, yLoc, BLOCK_WIDTH, BLOCK_HEIGHT))
            xLoc = xLoc + BLOCK_WIDTH + BLOCK_SPACING
        xLoc = BLOCK_SPACING / 2
        yLoc = yLoc + BLOCK_HEIGHT + BLOCK_SPACING
    return blocklist

# --- Your Constants Here
BLACK    = (   0,   0,   0)
WHITE    = ( 255, 255, 255)
RED = (255, 0, 0)
ORANGE = (255, 165, 0)
YELLOW = (255, 255, 0)
GREEN    = (   0, 255,   0)
BLUE = (0, 165, 255)
INDIGO = (165, 0, 255)
VIOLET = (165, 0, 165)
PADDLE_WIDTH = 100
PADDLE_HEIGHT = 10
SCREEN_WIDTH = 500
SCREEN_HEIGHT = 500
PADDLE_X = (SCREEN_WIDTH / 2) - (PADDLE_WIDTH / 2)
PADDLE_Y = SCREEN_HEIGHT - (PADDLE_HEIGHT * 3)
BALL_WIDTH = 20
BALL_HEIGHT = 20
COLOR_LIST = []
for i in range(10):
    COLOR_LIST.append(RED)
for i in range(10):
    COLOR_LIST.append(ORANGE)
for i in range(10):
    COLOR_LIST.append(YELLOW)
for i in range(10):
    COLOR_LIST.append(GREEN)
for i in range(10):
    COLOR_LIST.append(BLUE)
for i in range(10):
    COLOR_LIST.append(INDIGO)
for i in range(10):
    COLOR_LIST.append(VIOLET)
for i in range(10):
    COLOR_LIST.append(WHITE)


SOPH_LIST = COLOR_LIST


# --- Your Variables Here
paddle = pygame.Rect(PADDLE_X, PADDLE_Y, PADDLE_WIDTH, PADDLE_HEIGHT)
ball = pygame.Rect(250, 30, BALL_WIDTH, BALL_HEIGHT)
missile = pygame.Rect(250, -30, 10, BALL_WIDTH)
paddleSpeed = 0
ballXSpeed = 5
ballYSpeed = 5
gameSpeed = 60
blockList = getListOf10Blocks(0, COLOR_LIST)
firstColl = False
gameOver = False
score = 0
lives = 3
level = 1
timer = 0
mtimer = 0
alreadyhit = []
helpFont = pygame.font.SysFont('Calibri', 14, True, False)
font = pygame.font.SysFont('Calibri', 25, True, False)
failFont = pygame.font.SysFont('Calibri', 75, True, False)

#modifier bools
helpOn = False
blockPhysics = True
slowBall = False
godMode = False
tryhardMode = False
widePaddle = False
tinyPaddle = False
sophMode = False
ballShape = 1
go = False
pause = False



# --- Setup Tasks
pygame.init()
size = (SCREEN_WIDTH, SCREEN_HEIGHT)
screen = pygame.display.set_mode(size)
pygame.display.set_caption("Breakout")
done = False
clock = pygame.time.Clock()

ballc = pygame.draw.circle(screen, WHITE, (250,30), 10)
# --- Main Game Loop
while not done:
    
    # --- Event Processing
    for event in pygame.event.get(): # User did something
        if event.type == pygame.QUIT: # If user clicked close
            done = True # we are done so we exit this loop
        elif event.type == pygame.KEYDOWN:
            if event.key == pygame.K_RIGHT and pause != True:
                paddleSpeed = 7
                paddle = paddle.move(paddleSpeed, 0)
            elif event.key == pygame.K_LEFT and pause != True:
                paddleSpeed = -7
                paddle = paddle.move(paddleSpeed, 0)
            elif event.key == pygame.K_r:
                firstColl = False
                blockList = getListOf10Blocks(0, COLOR_LIST)
                score = 0
                lives = 3
                level = 1
                gameSpeed = 60
                ballXSpeed = 5
                ballYSpeed = 5
                ball = pygame.Rect(250, 30, BALL_WIDTH, BALL_HEIGHT)
                gameOver = False
            elif event.key == pygame.K_1:
                blockPhysics = not blockPhysics
            elif event.key == pygame.K_2:
                slowBall = not slowBall
            elif event.key == pygame.K_3:
                godMode = not godMode
            elif event.key == pygame.K_4:
                tryhardMode = not tryhardMode
            elif event.key == pygame.K_h:
                helpOn = not helpOn
            elif event.key == pygame.K_5:
                widePaddle = not widePaddle
                if widePaddle == False:
                        paddle = pygame.Rect(PADDLE_X, PADDLE_Y, PADDLE_WIDTH, PADDLE_HEIGHT)
                elif widePaddle == True:
                        paddle = pygame.Rect(0, PADDLE_Y, SCREEN_WIDTH, PADDLE_HEIGHT)
            elif event.key == pygame.K_6:
                tinyPaddle = not tinyPaddle
                if tinyPaddle == False:
                    paddle = pygame.Rect(PADDLE_X, PADDLE_Y, PADDLE_WIDTH, PADDLE_HEIGHT)
                elif tinyPaddle == True:
                    paddle = pygame.Rect(PADDLE_X, PADDLE_Y, PADDLE_WIDTH / 4, PADDLE_HEIGHT)
            elif event.key == pygame.K_7:
                sophMode = not sophMode
                if sophMode == False:
                    tryhardMode = False
                if sophMode == True:
                    tryhardMode = True
                    COLOR_LIST = []
                    for i in range(10):
                        COLOR_LIST.append(RED)
                    for i in range(10):
                        COLOR_LIST.append(ORANGE)
                    for i in range(10):
                        COLOR_LIST.append(YELLOW)
                    for i in range(10):
                        COLOR_LIST.append(GREEN)
                    for i in range(10):
                        COLOR_LIST.append(BLUE)
                    for i in range(10):
                        COLOR_LIST.append(INDIGO)
                    for i in range(10):
                        COLOR_LIST.append(VIOLET)
                    for i in range(10):
                        COLOR_LIST.append(WHITE)

            elif event.key == pygame.K_b:
                ballShape = ballShape + 1
                if ballShape >= 4:
                    ballShape = 1

                if ballShape == 1: #standard ball
                    ball = pygame.Rect(ball.x, ball.y, BALL_WIDTH, BALL_HEIGHT)
                elif ballShape == 2: #Megaball
                    ball = pygame.Rect(ball.x, ball.y, 100, 100)
                elif ballShape == 3: #wide ball
                    ball = pygame.Rect(0, ball.y, SCREEN_WIDTH, BALL_HEIGHT)

            elif event.key == pygame.K_p:
                pause = not pause

                if pause == True:
                    ballXSpeed = 0
                    ballYSpeed = 0
                elif pause == False:
                    ballXSpeed = 5
                    ballYSpeed = 5
            elif event.key == pygame.K_q:
                done = True
                    

                    



        elif event.type == pygame.KEYUP:
            if event.key == pygame.K_RIGHT or event.key == pygame.K_LEFT:
                paddleSpeed = 0
        

    # --- Clear the screen
    screen.fill(BLACK)
    
    # --- Your Drawing & Updating Here

    if sophMode == True:
        if mtimer >= (gameSpeed * 3):
            go = True
            mtimer = 0
        else:
            if go == True and pause != True:
                missile = missile.move(0, 3)
            else:
                mtimer = mtimer + 1

    if slowBall == False:
        ball = ball.move(ballXSpeed, ballYSpeed)
    elif slowBall == True:
        ball = ball.move(ballXSpeed / 5, ballYSpeed / 5)

    
    paddle = paddle.move(paddleSpeed, 0)
    
    if widePaddle == False:
        pygame.draw.rect(screen, WHITE, paddle)
    elif widePaddle == True:
        pygame.draw.rect(screen, WHITE, paddle)
    pygame.draw.rect(screen, WHITE, ball)
    pygame.draw.rect(screen, RED, missile)


    i = 0
    for block in blockList:
        #pygame.draw.rect(screen, GREEN, block)
        if sophMode == True:
            if timer >= 500:
                random.shuffle(SOPH_LIST)
                pygame.draw.rect(screen, SOPH_LIST[i], block)
                i = i + 1
                timer = 0
            else:
                pygame.draw.rect(screen, SOPH_LIST[i], block)
                timer = timer + 1
                i = i + 1
        elif sophMode == False:       
            pygame.draw.rect(screen, COLOR_LIST[i], block)
            i = i + 1


    if lives >= 10:
        lifes = str(lives) + "X"
    else:
        lifes = "X" * lives
    if score >= 10000 and score < 1000000:
        kscore = score / 1000
        pscore = str(kscore) + "K"
    elif score >= 1000000:
        kscore = score / 1000000
        kscore = round(kscore)
        pscore = str(kscore) + "M"
    else:
        pscore = score
    helpText = helpFont.render("1 - Block bounce, 2 - Slow ball, 3 - Godmode, 4 - Tryhard, 5 - Wide paddle, 6 - Small paddle", True, WHITE)
    helpText2 = helpFont.render("7 - Sophia mode, B - Ball shape, P - Pause, R - Restart, Q - Quit", True, WHITE)
    scoreText = font.render("Score: " + str(pscore), True, WHITE)
    lifeText = font.render("Lives: " + str(lifes), True, WHITE)
    levelText = font.render("Level: " + str(level), True, WHITE)
    levelWidth = levelText.get_width()
    helpWidth = helpText.get_width()
    helpWidth2 = helpText2.get_width()
    screen.blit(scoreText, [SCREEN_WIDTH - 125, SCREEN_HEIGHT - 20])
    screen.blit(lifeText, [SCREEN_WIDTH - 500, SCREEN_HEIGHT - 20])
    screen.blit(levelText, [SCREEN_WIDTH / 2 - levelWidth / 2, SCREEN_HEIGHT - 20])
    if helpOn == True:
        screen.blit(helpText, [SCREEN_WIDTH / 2 - helpWidth / 2, SCREEN_HEIGHT - 200])
        screen.blit(helpText2, [SCREEN_WIDTH / 2 - helpWidth2 / 2, SCREEN_HEIGHT - 190])
    
    if ball.right > SCREEN_WIDTH:
        ballXSpeed = -ballXSpeed
    if ball.left < 0:
        ballXSpeed = -ballXSpeed
    if ball.top < 0:
        ballYSpeed = -ballYSpeed
    if ball.top > SCREEN_HEIGHT:
        firstColl = False
        if godMode != True:
            lives = lives - 1
        ball = pygame.Rect(250, 30, BALL_WIDTH, BALL_HEIGHT)
    
    if ball.colliderect(paddle):
        if firstColl == False:
            firstColl = True
        ballYSpeed = -ballYSpeed
        ball = ball.move(0, -10)
    if paddle.right > SCREEN_WIDTH:
        paddle = paddle.move(-20, 0)
    if paddle.left < 0:
        paddle = paddle.move(20, 0)

    if missile.colliderect(paddle):
        if godMode != True:
            lives = lives - 1
        go = False
        newLoc = random.randint(50, 450)
        missile = pygame.Rect(newLoc, -30, 10, BALL_WIDTH)

    if missile.top > SCREEN_HEIGHT:
        go = False
        newLoc = random.randint(50, 450)
        missile = pygame.Rect(newLoc, -30, 10, BALL_WIDTH)

        

    index = ball.collidelist(blockList)
    if index != -1 and firstColl != False:
        score = score + 100
        if sophMode == True:
            if index not in alreadyhit:
                alreadyhit.append(index)
            elif index in alreadyhit:
                blockList.remove(blockList[index])
        else:
            blockList.remove(blockList[index])
        if blockPhysics != False:
            ballYSpeed = -ballYSpeed


    # --- Other Tasks After Drawing
    if lives < 0:
        getOofed = failFont.render("YOU LOSE", True, WHITE)
        restart = font.render("R to restart, H for Help", True, WHITE)
        gameOver = True
        ballXSpeed = 0
        ballYSpeed = 0
        paddleSpeed = 0
        loseWidth = getOofed.get_width()
        rWidth = restart.get_width()
        rHeight = restart.get_height()
        screen.blit(getOofed, [SCREEN_WIDTH / 2 - loseWidth / 2, SCREEN_HEIGHT / 2])
        screen.blit(restart, [SCREEN_WIDTH / 2 - rWidth / 2, SCREEN_HEIGHT / 2 + rHeight * 3])
    
    if blockList == []:
        level = level + 1
        lives = lives + 1
        alreadyhit = []
        firstColl = False
        if ballShape == 1: #standard ball
            ball = pygame.Rect(ball.x, ball.y, BALL_WIDTH, BALL_HEIGHT)
        elif ballShape == 2: #Megaball
            ball = pygame.Rect(ball.x, ball.y, 100, 100)
        elif ballShape == 3: #wide ball
            ball = pygame.Rect(0, ball.y, SCREEN_WIDTH, BALL_HEIGHT)
        gameSpeed = gameSpeed + 5
        blockList = getListOf10Blocks(0, COLOR_LIST)

    pygame.display.flip() # show what we've drawn
    if tryhardMode == False:
        clock.tick(gameSpeed) # 60 frames per second
    elif tryhardMode == True:
        clock.tick(gameSpeed * 2)
 


pygame.quit() # Close the window and quit.
