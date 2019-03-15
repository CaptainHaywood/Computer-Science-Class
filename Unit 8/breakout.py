import pygame
from pygame.locals import *
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


# --- Your Variables Here
paddle = pygame.Rect(PADDLE_X, PADDLE_Y, PADDLE_WIDTH, PADDLE_HEIGHT)
ball = pygame.Rect(250, 30, BALL_WIDTH, BALL_HEIGHT)
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
megaBall = False



# --- Setup Tasks
pygame.init()
size = (SCREEN_WIDTH, SCREEN_HEIGHT)
screen = pygame.display.set_mode(size)
pygame.display.set_caption("Breakout")
done = False
clock = pygame.time.Clock()

# --- Main Game Loop
while not done:
    
    # --- Event Processing
    for event in pygame.event.get(): # User did something
        if event.type == pygame.QUIT: # If user clicked close
            done = True # we are done so we exit this loop
        elif event.type == pygame.KEYDOWN:
            if event.key == pygame.K_RIGHT:
                paddleSpeed = 7
                paddle = paddle.move(paddleSpeed, 0)
            elif event.key == pygame.K_LEFT:
                paddleSpeed = -7
                paddle = paddle.move(paddleSpeed, 0)
            elif event.key == pygame.K_r and gameOver == True:
                blockList = getListOf10Blocks(0, COLOR_LIST)
                score = 0
                lives = 3
                level = 0
                gameSpeed = 60
                ballXSpeed = 5
                ballYSpeed = 5
                ball = pygame.Rect(250, 30, BALL_WIDTH, BALL_HEIGHT)
                gameOver = False
            elif event.key == pygame.K_p:
                blockPhysics = not blockPhysics
            elif event.key == pygame.K_s:
                slowBall = not slowBall
            elif event.key == pygame.K_g:
                godMode = not godMode
            elif event.key == pygame.K_t:
                tryhardMode = not tryhardMode
            elif event.key == pygame.K_h:
                helpOn = not helpOn
            elif event.key == pygame.K_w:
                widePaddle = not widePaddle
                if widePaddle == False:
                        paddle = pygame.Rect(PADDLE_X, PADDLE_Y, PADDLE_WIDTH, PADDLE_HEIGHT)
                elif widePaddle == True:
                        paddle = pygame.Rect(0, PADDLE_Y, SCREEN_WIDTH, PADDLE_HEIGHT)
            elif event.key == pygame.K_m:
                megaBall = not megaBall
                if megaBall == False:
                        ball = pygame.Rect(250, 30, BALL_WIDTH, BALL_HEIGHT)
                elif megaBall == True:
                        ball = pygame.Rect(250, 30, 100, 100)


        elif event.type == pygame.KEYUP:
            if event.key == pygame.K_RIGHT or event.key == pygame.K_LEFT:
                paddleSpeed = 0
        

    # --- Clear the screen
    screen.fill(BLACK)
    
    # --- Your Drawing & Updating Here
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

    i = 0
    for block in blockList:
        #pygame.draw.rect(screen, GREEN, block)
        pygame.draw.rect(screen, COLOR_LIST[i], block)
        i = i + 1


    lifes = "X" * lives
    helpText = helpFont.render("P - Toggle block phys, S - Slow ball, G - Godmode, T - Tryhard mode, W - Wide paddle, M - Mega ball", True, WHITE)
    scoreText = font.render("Score: " + str(score), True, WHITE)
    lifeText = font.render("Lives: " + str(lifes), True, WHITE)
    levelText = font.render("Level: " + str(level), True, WHITE)
    levelWidth = levelText.get_width()
    helpWidth = helpText.get_width()
    screen.blit(scoreText, [SCREEN_WIDTH - 125, SCREEN_HEIGHT - 20])
    screen.blit(lifeText, [SCREEN_WIDTH - 500, SCREEN_HEIGHT - 20])
    screen.blit(levelText, [SCREEN_WIDTH / 2 - levelWidth / 2, SCREEN_HEIGHT - 20])
    if helpOn == True:
        screen.blit(helpText, [SCREEN_WIDTH / 2 - helpWidth / 2, SCREEN_HEIGHT - 200])
    
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

    index = ball.collidelist(blockList)
    if index != -1 and firstColl != False:
        score = score + 100
        blockList.remove(blockList[index])
        if blockPhysics != False:
            ballYSpeed = -ballYSpeed


    # --- Other Tasks After Drawing
    if lives < 0:
        getOofed = failFont.render("YOU LOSE", True, WHITE)
        restart = font.render("R to restart, H for 'Help' ;)", True, WHITE)
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
        firstColl = False
        ball = pygame.Rect(250, 30, BALL_WIDTH, BALL_HEIGHT)
        gameSpeed = gameSpeed + 5
        blockList = getListOf10Blocks(0, COLOR_LIST)

    pygame.display.flip() # show what we've drawn
    if tryhardMode == False:
        clock.tick(gameSpeed) # 60 frames per second
    elif tryhardMode == True:
        clock.tick(120)
 


pygame.quit() # Close the window and quit.
