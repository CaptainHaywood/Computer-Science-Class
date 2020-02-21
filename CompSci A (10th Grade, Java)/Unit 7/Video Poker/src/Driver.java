import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by rritz on 1/12/2017.
 */
public class Driver {
    public static void main(String[] args) {

        Deck deck = new Deck();
        ArrayList<Card> hand = new ArrayList<>();
        HandEvaluator evaluator = new HandEvaluator();
        Scanner in = new Scanner(System.in);
        boolean playing = true;

        /*
        do {
            shuffle the deck
            set hand to a new ArrayList
            get the top 5 cards from the deck and place into the hand
            display the 5 cards to the user
            ask the user if s/he would like to replace any cards
            replace any cards and display new hand if needed.
            display the hand type (Royal Flush, Straight Flush, etc)
            ask the user if s/he would like to play again
        } while (player wants to play again);
        */
        while (playing == true){
            //SHUFFLE DECK
            deck.shuffle();
            //SET HAND TO NEW ARRAYLIST
            hand = new ArrayList<Card>();
            //GET THE TOP 5 CARDS FROM THE DECK AND INSERT INTO HAND
            hand.add(deck.nextCard());
            hand.add(deck.nextCard());
            hand.add(deck.nextCard());
            hand.add(deck.nextCard());
            hand.add(deck.nextCard());

            //DISPLAY THE TOP 5 CARDS
            System.out.println("Welcome to video poker!");
            System.out.println("");
            System.out.println("Your hand is: " + hand.get(0).toString() + ", " + hand.get(1).toString() + ", " + hand.get(2).toString() + ", "+ hand.get(3).toString() + ", "+ hand.get(4).toString() + ", ");
            //ASK THE USER IF THEY'D LIKE TO REPLACE
            int iteration = 0;
            int size = hand.size();
            boolean handChanged = false;
            while(iteration < size){
                System.out.println("Would you like to replace " + hand.get(iteration).toString() + "? ");
                String input = in.nextLine();
                if(input.equals("y")){
                    System.out.println("FUCKING SET");
                    hand.set(iteration, deck.nextCard());
                    handChanged = true;
                }
                iteration++;
            }
            //REPLACE CARDS AND DISPLAY NEW HAND
            if(handChanged){
                System.out.println("Your new hand is: "+ hand.get(0).toString() + ", " + hand.get(1).toString() + ", " + hand.get(2).toString() + ", "+ hand.get(3).toString() + ", "+ hand.get(4).toString() + ", ");
            }
            //DISPLAY HAND TYPE
            if(evaluator.isRoyalFlush(hand)){
                System.out.println("You received a Royal Flush!");
            }
            else if(evaluator.isStraightFlush(hand)){
                System.out.println("You received a Straight Flush!");
            }
            else if(evaluator.isFourOfKind(hand)){
                System.out.println("You received a Four of a Kind!");
            }
            else if(evaluator.isFullHouse(hand)){
                System.out.println("You received a Full House!");
            }
            else if(evaluator.isFlush(hand)){
                System.out.println("You received a Flush!");
            }
            else if(evaluator.isStraight(hand)){
                System.out.println("You received a Straight!");
            }
            else if(evaluator.isThreeOfKind(hand)){
                System.out.println("You received a Three of a Kind!");
            }
            else if(evaluator.isTwoPair(hand)){
                System.out.println("You received a Two Pair!");
            }
            else if(evaluator.isOnePair(hand)){
                System.out.println("You received a One Pair!");
            }
            //QUERY FOR REPLAY
            System.out.println();
            System.out.println("Would you like to play again (y/n)? ");
            String input = in.nextLine();
            if(input.equals("y")){
                playing = true;
            }
            else{
                playing = false;
            }
        }

    }
}
