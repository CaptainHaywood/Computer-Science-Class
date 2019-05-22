import random

def get_rand_color():
    r = random.randint(0,255)
    g = random.randint(0,255)
    b = random.randint(0,255)
    color = (r,g,b)
    return color

a = get_rand_color()
b = get_rand_color()
c = get_rand_color()

print("Color #1")
print("Red:", a[0])
print("Green:", a[1])
print("Blue:", a[2])
print("")

print("Color #2")
print("Red:", b[0])
print("Green:", b[1])
print("Blue:", b[2])
print("")

print("Color #3")
print("Red:", b[0])
print("Green:", b[1])
print("Blue:", b[2])
print("")
