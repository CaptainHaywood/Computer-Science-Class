def get_card_desc(card):
    if card[1] == "C":
        outA = " of Clubs"
    elif card[1] == "D":
        outA = " of Diamonds"
    elif card[1] == "H":
        outA = " of Hearts"
    elif card[1] == "S":
        outA = " of Spades"

    if card[0] == 11:
        outB = "Jack"
    elif card[0] == 12:
        outB = "Queen"
    elif card[0] == 13:
        outB = "King"
    elif card[0] == 14:
        outB = "Ace"
    else:
        outB = card[0]

    output = str(outB) + outA
    return output

times = int(input("Cards? "))

for n in range(times):
    value = int(input())
    suit = input()
    card = (value, suit)
    print(get_card_desc(card))
