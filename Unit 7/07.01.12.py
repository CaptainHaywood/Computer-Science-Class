cycles = int(input())
height = 1
season = 0

for n in range(cycles):
    if season == 0:
        height = height * 2
        season = 1
    else:
        height = height + 1
        season = 0

print(height)  
