import random


def get_combo():
    comb=[]
    complete = 0
    while complete < 4:
        r=random.randint(0,9)
        if r not in comb:
            comb.append(r)
            complete = complete + 1
        else:
            useless = 1
    print(comb)
    n1 = comb[0]
    n2 = comb[1]
    n3 = comb[2]
    n4 = comb[3]

    n1 = str(n1)
    n2 = str(n2)
    n3 = str(n3)
    n4 = str(n4)

    combo = n1+n2+n3+n4
    return combo

combo = get_combo()
print(combo)
