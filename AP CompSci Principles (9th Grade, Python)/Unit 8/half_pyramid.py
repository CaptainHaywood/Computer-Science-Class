import pygame
 
# Define some colors
BLACK   = (0, 0, 0)
WHITE   = (255, 255, 255)
GREEN   = (0, 255, 0)
RED     = (255, 0, 0)

# Initialize the game engine
pygame.init()
 
# Set the width and height of the screen [width, height]
size = (700, 500)
screen = pygame.display.set_mode(size)
 
pygame.display.set_caption("My Game")
 
# Loop until the user clicks the close button.
done = False
 
# Used to manage how fast the screen updates
clock = pygame.time.Clock()


 
# -------- Main Program Loop -----------
while not done:
    # --- Main event loop
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = True
 
    # First, clear the screen to white. Don't put other drawing commands
    # above this, or they will be erased with this command.
    screen.fill(WHITE)
    a = 400
    b = 470
    # --- YOUR DRAWING CODE GOES HERE

    for i in range(9):
        a = a + 30
        r1 = pygame.rect.Rect(a, b, 30, 30)
        pygame.draw.rect(screen, BLACK, r1, 2)
        #pygame.display.flip()
    b = b - 30
    a = 430
    for i in range(8):
        a = a + 30
        r1 = pygame.rect.Rect(a, b, 30, 30)
        pygame.draw.rect(screen, BLACK, r1, 2)
        #pygame.display.flip()
    b = b - 30
    a = 460
    for i in range(7):
        a = a + 30
        r1 = pygame.rect.Rect(a, b, 30, 30)
        pygame.draw.rect(screen, BLACK, r1, 2)
        #pygame.display.flip()
    b = b - 30
    a = 490
    for i in range(6):
        a = a + 30
        r1 = pygame.rect.Rect(a, b, 30, 30)
        pygame.draw.rect(screen, BLACK, r1, 2)
        #pygame.display.flip()
    b = b - 30
    a = 520
    for i in range(5):
        a = a + 30
        r1 = pygame.rect.Rect(a, b, 30, 30)
        pygame.draw.rect(screen, BLACK, r1, 2)
        #pygame.display.flip()
    b = b - 30
    a = 550
    for i in range(4):
        a = a + 30
        r1 = pygame.rect.Rect(a, b, 30, 30)
        pygame.draw.rect(screen, BLACK, r1, 2)
        #pygame.display.flip()
    b = b - 30
    a = 580
    for i in range(3):
        a = a + 30
        r1 = pygame.rect.Rect(a, b, 30, 30)
        pygame.draw.rect(screen, BLACK, r1, 2)
        #pygame.display.flip()
    b = b -30
    a = 610
    for i in range(2):
        a = a + 30
        r1 = pygame.rect.Rect(a, b, 30, 30)
        pygame.draw.rect(screen, BLACK, r1, 2)
        pygame.display.flip()
    
    
 
    # --- Limit to 60 frames per second
    clock.tick(60)
 
# Close the window and quit.
# If you forget this line, the program will 'hang'
# on exit if running from IDLE.
pygame.quit()
