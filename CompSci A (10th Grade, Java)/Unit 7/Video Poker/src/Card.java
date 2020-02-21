/**
 The class signature line includes "implements Comparable<Card>" which tells Java that we are going to provide
 a "compareTo" method to determine how Card objects should be compared. If Java knows how to compare Card objects,
 it can then sort Card objects in an ArrayList automatically for us, which we will take advantage of in the
 HandEvaluator class.
 */
public class Card implements Comparable<Card> {

    //Instance Fields
    private int value;
    private char suit;
    private String desc;

    /**
     * Constructs a card with the given value and suit. Card values are 2-14 where 11 is a Jack, 12 is a Queen,
     * 13 is a King, 14 is an Ace, and all other values represent themselves (e.g. 2 is a 2). Card suits are 'H'
     * for Hearts, 'D' for Diamonds, 'S' for Spades, and 'C' for Clubs. The constructor should initialize all
     * instance fields appropriately. The desc instance field represents a card in the manner of: "AD", 10C",
     * "JH", etc. In this project, Cards are created in the Deck class.
     * @param inValue the value of the card
     * @param inSuit the suit of the card
     */
    public Card(int inValue, char inSuit) {
        value = inValue;
        if(inValue < 11){
            desc = String.valueOf(inValue);
        }
        if(inValue > 10){
            if(inValue == 11){
                desc = "J";
            }
            else if(inValue == 12){
                desc = "Q";
            }
            else if(inValue == 13){
                desc = "K";
            }
            else if(inValue == 14){
                desc = "A";
            }
        }
        suit = inSuit;
    }

    /**
     * Returns the value of the card
     * @return the value of the card
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns the suit of the card
     * @return the suit of the card
     */
    public char getSuit() {
        return suit;
    }

    /**
     * Returns desc, the description of the card (e.g. "7H", "10D", "JH", "KS", etc.)
     * @return the description of the card
     */

    public String toString() {
        return desc + suit;
    }

    /**
     * This method returns a negative value if the current card is less than the card passed in
     * (by value, then suit), positive value if the current card is greater than the card passed in
     * (by value, then suit), or zero (0) if the cards are equal (by value AND suit). This method is
     * used in our project to sort Card objects in the HandEvaluator class.
     * @param c the card to compare
     * @return a negative value if this card is less than "c", 0 if this card equals "c", or positive value otherwise
     */
    public int compareTo(Card c) {

        if (value < c.getValue() || (value == c.getValue() && suit < c.getSuit()))
            return -1;
        else if (value > c.getValue() || (value == c.getValue() && suit > c.getSuit()))
            return 1;
        else
            return 0;
    }

    /**
     * Returns true if this card is equal to o
     * @param o the object to compare against this card
     * @return true if this card is equal to o
     */
    public boolean equals(Object o) {
        Card c = (Card) o;

        return compareTo(c) == 0;
    }
}

