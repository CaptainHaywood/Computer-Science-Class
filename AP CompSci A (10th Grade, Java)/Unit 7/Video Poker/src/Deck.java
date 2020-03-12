import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    //Instance Fields
    private ArrayList<Card> theDeck;
    private int topOfDeck;

    /**
     * The Deck constructor should create 52 cards and place them into theDeck. The values of the cards should be
     * 2 through 14. The values represent the cards as follows: 2 is a 2, …., 10 is a 10, 11 is a Jack, 12 is a
     * Queen, 13 is  a King, and 14 is an Ace. The suits are 'H' for Heats, 'D' for Diamonds, 'S' for Spades, and
     * 'C' for Clubs.
     */
    public Deck() {

        theDeck = new ArrayList<Card>();
        /*

        Go 2 through 14 to represent the unique values in a deck of cards {
            Adds 4 cards to the deck for the current value-- one for each suit 'H', 'D', 'S', and 'C'
        }
        */

        int iteration = 2;
        while (iteration < 15){
            theDeck.add(new Card(iteration, 'H'));
            iteration++;
        }
        iteration = 2;
        while (iteration < 15){
            theDeck.add(new Card(iteration, 'D'));
            iteration++;
        }
        iteration = 2;
        while (iteration < 15){
            theDeck.add(new Card(iteration, 'S'));
            iteration++;
        }
        iteration = 2;
        while (iteration < 15){
            theDeck.add(new Card(iteration, 'C'));
            iteration++;
        }
    }

    /**
     * This method should shuffle theDeck and set topOfDeck to 0. topOfDeck represents the index of the next card
     * to return from the deck, which should be index 0 whenever we shuffle the cards.
     */
    public void shuffle() {

        /*
        Generate two random numbers in the range 0. .51 and swap the cards in the deck at those cell numbers. Do this
        several times (100 or so)to adequately shuffle the deck.

         Set topOfDeck to the index representing the first card (0)
        */
        int iteration = 0;
        while(iteration < 1000){
            int index1 = (int) (Math.random() * ((51 - 0) + 1));
            int index2 = (int) (Math.random() * ((51 - 0) + 1));
            Collections.swap(theDeck, index1, index2);
            iteration++;
        }
        topOfDeck = 0;

    }

    /**
     * This method should return the next card from the deck. topOfDeck represents the index of the card to return.
     * This field is initialized to 0 in the shuffle method and will increment by 1 every time we call nextCard.
     * So, in essence, we are getting card at index 0, then card at index 1, then card at index 2, etc. until we
     * shuffle again in which case we reset the topOfCard back to 0.
     */
    public Card nextCard() {
        Card toReturn = theDeck.get(topOfDeck);
        topOfDeck++;
        return(toReturn);
    }

}