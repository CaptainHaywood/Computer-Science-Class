from random import randint

d = randint(1, 5)
e = randint(1, 5)
f = randint(1, 5)

d = str(d)
e = str(e)
f = str(f)

ans = d+e+f

ans = str(ans)
ans = (" ".join(ans))
x, y, z = ans.split()
x = int(x)
y = int(y)
z = int(z)
g = 1

print(x,y,z)

def guess(x, y, z, g):
    num = input("Enter a 3-digit key guess: ")
    num = (" ".join(num))
    a, b, c = num.split()
    a = int(a)
    b = int(b)
    c = int(c)

    c1 = 0
    c2 = 0
    c3 = 0
    
    if a == x:
        print("Correct")
        c1 = 1
    elif a != x and a != y and a != z:
        print("Not in key")
    elif a != x and a == y or a == z:
        print("Wrong location")
    else:
        print("WTF DID YOU DO")

    if b == y:
        print("Correct")
        c2 = 1
    elif b != y and b != x and b != z:
        print("Not in key")
    elif b != y and b == x or b == z:
        print("Wrong location")
    else:
        print("WTF DID YOU DO")

    if c == z:
        print("Correct")
        c3 = 1
    elif c != z and c != x and c != y:
        print("Not in key")
    elif c != z and c == x or c == y:
        print("Wrong location")
    else:
        print("WTF DID YOU DO")

    if c1 == 1 and c2 == 1 and c3 == 1:
        print("Congratulations, you guessed the key!")
    elif g >= 3:
        print("Sorry, you ran out of guesses.")
    else:
        g = g + 1
        guess(x, y, z, g)
    
        
guess(x, y, z, g)



