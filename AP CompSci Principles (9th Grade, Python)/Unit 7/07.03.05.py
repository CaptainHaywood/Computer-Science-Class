#-------------------------------------------------------------------#
# Returns the value of the given card
#-------------------------------------------------------------------#
def get_value(card):
    value = card[0:len(card)-1]
    return int(value)

#-------------------------------------------------------------------#
# Returns the suit of the given card
#-------------------------------------------------------------------#
def get_suit(card):
    suit = card[len(card)-1:]
    return suit

#-------------------------------------------------------------------#
# Returns a tuple of all the cards in dealerCard that have the
# given suit
#-------------------------------------------------------------------#
def get_cards_of_same_suit(suit, dealerCards):
    cardsOfSameSuit = tuple() # assign to empty tuple
    
    for c in dealerCards:
        if get_suit(c) == suit:
            if cardsOfSameSuit == tuple():
                cardsOfSameSuit = (c,)
            else:
                cardsOfSameSuit = cardsOfSameSuit + (c,)
            
    return cardsOfSameSuit        

#-------------------------------------------------------------------#
# This function can be called in three different ways:
#
#   1) You can call it with 1 argument (e.g. dealerCards) which
# returns the lowest value card in dealerCards, regardless of suit
# and any value restrictions. Here is an example function call:
#
#       lowest = get_lowest_card(dealerCards)
#
#   2) You can call it with 2 arguments (e.g. dealerCards, oppSuit)
# which returns the lowest value card in dealerCards of a given suit,
# regardless of any value restrictions. If no cards of that suit
# exist, an an empty string ("") is returned. Here is an example
# function call:
#
#       lowest = get_lowest_card(dealerCards, oppSuit)
#
#   3) You can call it with 3 arguments (e.g. dealerCards, oppSuit,
# oppValue) which returns the lowest value card in dealerCards of
# a given suit that has a value > oppValue. If no such card exists,
# an empty string ("") is returned. Here is an example function call:
#
#       lowest = get_lowest_card(dealerCards, oppSuit, oppValue)
#
#-------------------------------------------------------------------#
def get_lowest_card(dealerCards, oppSuit="", oppValue=0):
    lowestSoFar = ""
    
    if oppSuit == "":
        cards = dealerCards
    else:
        cards = get_cards_of_same_suit(oppSuit, dealerCards)
    
    for c in cards:
        value = get_value(c)
        suit = get_suit(c)

        if value > oppValue:
            if lowestSoFar == "" or value < get_value(lowestSoFar):
                 lowestSoFar = c

    return lowestSoFar        

#-------------------------------------------------------------------#
# Returns the dealers card to play
#-------------------------------------------------------------------#
def get_dealer_play(cardsInTuple):
    # set oppLeadCard to the first card in cardsInTuple
    oppLeadCard = cardsInTuple[0]

    # set oppSuit to suit of oppLeadCard; use get_suit(oppLeadCard) 
    oppSuit = get_suit(oppLeadCard)

    # set oppValue to value of oppLeadCard; use get_value(oppLeadCard) 
    oppValue = get_value(oppLeadCard)

    # set dealerCards to the last 5 cards of cardsInTuple
    dealerCards = cardsInTuple[1:]

    # get the lowest valued card in the dealer hand that is the same
    # suit as the oppSuit and has value greater than oppValue. if such
    # a card does NOT exist, lowest gets assigned ""
    lowest = get_lowest_card(dealerCards, oppSuit, oppValue)

    # if lowest is not "" (i.e. lowest stores a card)
    if lowest != "":
        print(lowest)
    else:
        lowestSuit = get_lowest_card(dealerCards, oppSuit)
        lowestCard = get_lowest_card(dealerCards)
        if lowestSuit == "":
            print(lowestCard)
        elif lowestCard != "":
            print(lowestSuit)           

    
    
#-------------------------------------------------------------------#
# -- Main Section
#-------------------------------------------------------------------#

# read in user input as string, such as: "5D 2D 6H 9D 10D 6H"
cardsInString = input() 

# place cards in tuple, such as: ("5D", "2D", "6H", "9D", "10D", "6H")
cardsInTuple = tuple(cardsInString.split()) 

# The first card in cardsInTuple represents the opponents lead card
# and the remaining five cards represent the dealer cards. This tuple
# is passed to get_dealer_play() to help determine which card
# the dealar should play next. 
dealerPlayCard = get_dealer_play(cardsInTuple) 

# diplay the dealer card to play
#print(dealerPlayCard)

