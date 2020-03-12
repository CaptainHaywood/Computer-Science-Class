/**
 * NOTE: The Collections.sort() method takes an ArrayList (the hand) as a parameter and automatically sorts the ArrayList
 * of Cards in ascending order.
 */

import java.util.Collections;
import java.util.ArrayList;

public class HandEvaluator {

//    /**
//     * Returns true if the hand is a royal straight flush, false otherwise
//     * @param h the hand
//     * @return true if the hand is a royal straight flush, false otherwise
//     */
    public boolean isRoyalFlush(ArrayList<Card> h) {

        Collections.sort(h);


        if (h.get(0).getValue() == 10 && isStraightFlush(h)){
            return true;
        }
        else
          return false;


    }
//
//    /**
//     * Returns true if the hand is a straight flush, false otherwise
//     * @param h the hand
//     * @return true if the hand is a straight flush, false otherwise
//     */
    public boolean isStraightFlush(ArrayList<Card> h) {


        if (isStraight(h) && isFlush(h))
          return true;
        else
          return false;


    }
//
//
//    /**
//     * Returns true if the hand is 4 of a kind, false otherwise
//     * @param h the hand
//     * @return true if the hand is 4 of a kind, false otherwise
//     */
    public boolean isFourOfKind(ArrayList<Card> h) {

        Collections.sort(h);

        /*
        if numOccurrences of first card is 4 or numOccurrences of second card is 4
          return true
        else
          return false
        */

        int len = h.size();
        int iter = 0;
        int occurencesOne = 0;
        int occurencesTwo = 0;
        Card firstCard = h.get(0);
        Card secondCard = h.get(3);
        int firstCardValue = firstCard.getValue();
        int secondCardValue = secondCard.getValue();

        while(iter < len){
            Card toLookAt = h.get(iter);
            int cardValue = toLookAt.getValue();
            if (cardValue == firstCardValue){
                occurencesOne++;
            }
            iter++;
        }
        iter = 0;
        while(iter < len){
            Card toLookAt = h.get(iter);
            int cardValue = toLookAt.getValue();
            if (cardValue == secondCardValue){
                occurencesTwo++;
            }
            iter++;
        }
        if(occurencesOne == 4 || occurencesTwo == 4){
            return true;
        }
        return false;
    }
//
//
//    /**
//     * Returns true if the hand is a full house, false otherwise
//     * @return true if the hand is a full house, false otherwise
//     * @paramm h the hand
//     */
//
    public boolean isFullHouse(ArrayList<Card> h) {

        Collections.sort(h);

        /*
        if numOccurrences of first card is 3 and numOccurrences of fourth card is 2
          return true
        else if numOccurrences of first card is 2 and numOccurrences of third card is 3
          return true
        else
          return false
        */

        int len = h.size();
        int iter = 0;
        int occurencesOne = 0;
        int occurencesFour = 0;
        Card firstCard = h.get(0);
        Card fourthCard = h.get(3);
        int firstCardValue = firstCard.getValue();
        int fourthCardValue = fourthCard.getValue();

        while(iter < len){
            Card toLookAt = h.get(iter);
            int cardValue = toLookAt.getValue();
            if (cardValue == firstCardValue){
                occurencesOne++;
            }
            iter++;
        }
        iter = 0;
        while(iter < len){
            Card toLookAt = h.get(iter);
            int cardValue = toLookAt.getValue();
            if (cardValue == fourthCardValue){
                occurencesFour++;
            }
            iter++;
        }
        if(occurencesOne == 3 && occurencesFour == 2){
            return true;
        }

        iter = 0;
        occurencesOne = 0;
        int occurencesThree = 0;
        firstCard = h.get(0);
        Card thirdCard = h.get(2);
        firstCardValue = firstCard.getValue();
        int thirdCardValue = thirdCard.getValue();

        while(iter < len){
            Card toLookAt = h.get(iter);
            int cardValue = toLookAt.getValue();
            if (cardValue == firstCardValue){
                occurencesOne++;
            }
            iter++;
        }
        iter = 0;
        while(iter < len){
            Card toLookAt = h.get(iter);
            int cardValue = toLookAt.getValue();
            if (cardValue == thirdCardValue){
                occurencesThree++;
            }
            iter++;
        }
        if(occurencesOne == 2 && occurencesThree == 3){
            return true;
        }

        return false;
    }
//
//    /**
//     * Returns true if this hand is a flush, false otherwise.
//     * @param h the hand
//     * @return true if this hand is a flush, false otherwise.
//     */
    public boolean isFlush(ArrayList<Card> h) {
        for (int i = 1; i < h.size(); i++) {
            if (h.get(i - 1).getSuit() != h.get(i).getSuit()) {
                return false;
            }
        }
        return true;
    }
//
//    /**
//     * Returns true if this hand is a straight, false otherwise.
//     * @param h the hand
//     * @return true if this hand is a straight, false otherwise.
//     */
    public boolean isStraight(ArrayList<Card> h) {

        Collections.sort(h);
        if(h.get(0).getValue() == 2 && h.get(1).getValue() == 3 && h.get(2).getValue() == 4 && h.get(3).getValue() == 5 && h.get(4).getValue() == 14){
            return true;
        }
        for (int i = 1; i < h.size(); i++) {
            if (h.get(i - 1).getValue() + 1 != h.get(i).getValue()) {
                return false;
            }
        }
        return true;

        /*
        if the cards are in sequential rank, regardless of suit (e.g. [3, 4, 5, 6, 7] or [8, 9, 10, 11, 12])
           return true
        else if we have 2, 3, 4, 5, 14
           return true
        else
           return false

        Note: An Ace can be used as a 1 or 14 in a straight. Since we store an Ace as a 14,
        we need a special condition to handle a hand with A, 2, 3, 4, 5. In this
        case, the hand will look like [2, 3, 4, 5, 14].

        */

    }
//
//    /**
//     * Returns true if this hand has a 3 of a kind, false otherwise.
//     * @param h the hand
//     * @return true if this hand has a 3 of a kind, false otherwise.
//     */
    public boolean isThreeOfKind(ArrayList<Card> h) {

        Collections.sort(h);

        /*
        if numOccurrences of first card is 3 or numOccurrences of second card is 3 or numOccurrences of third card is 3
          return true
        else
          return false
        */

        int len = h.size();
        int iter = 0;
        int occurencesOne = 0;
        int occurencesTwo = 0;
        int occurencesThree = 0;
        Card firstCard = h.get(0);
        Card secondCard = h.get(1);
        Card thirdCard = h.get(2);
        int firstCardValue  = firstCard.getValue();
        int secondCardValue = secondCard.getValue();
        int thirdCardValue = thirdCard.getValue();

        while(iter < len){
            Card toLookAt = h.get(iter);
            int cardValue = toLookAt.getValue();
            if (cardValue == firstCardValue){
                occurencesOne++;
            }
            iter++;
        }
        iter = 0;
        while(iter < len){
            Card toLookAt = h.get(iter);
            int cardValue = toLookAt.getValue();
            if (cardValue == secondCardValue){
                occurencesTwo++;
            }
            iter++;
        }
        iter = 0;
        while(iter < len){
            Card toLookAt = h.get(iter);
            int cardValue = toLookAt.getValue();
            if (cardValue == thirdCardValue){
                occurencesThree++;
            }
            iter++;
        }
        if(occurencesOne == 3 || occurencesTwo == 3 || occurencesThree == 3){
            return true;
        }
        else{
            return false;
        }

    }
//
//    /**
//     * Returns true if this hand has two cards that appear exactly twice, false otherwise
//     * @param h the hand
//     * @return true if this hand has two cards that appear exactly twice, false otherwise
//     */
    public boolean isTwoPair(ArrayList<Card> h) {

        Collections.sort(h);

        /*
        if the numOccurrences of the second card is 2 and the numOccurrences of the fourth card is 2
          return true;
        else
          return false;
       */

        int len = h.size();
        int iter = 0;
        int occurencesOne = 0;
        int occurencesTwo = 0;
        Card secondCard = h.get(1);
        Card fourthCard = h.get(3);
        int secondCardValue = secondCard.getValue();
        int fourthCardValue = fourthCard.getValue();

        while(iter < len){
            Card toLookAt = h.get(iter);
            int cardValue = toLookAt.getValue();
            if (cardValue == secondCardValue){
                occurencesOne++;
            }
            iter++;
        }
        iter = 0;
        while(iter < len){
            Card toLookAt = h.get(iter);
            int cardValue = toLookAt.getValue();
            if (cardValue == fourthCardValue){
                occurencesTwo++;
            }
            iter++;
        }
        if(occurencesOne == 2 && occurencesTwo == 2){
            return true;
        }
        else{
            return false;
        }
    }
//
//    /**
//     * Returns true if this hand has a card value that appears exactly twice. Otherwise, returns false.
//     * @param h the hand
//     * @return true if this hand has a card value that appears exactly twice. Otherwise, returns false.
//     */
    public boolean isOnePair(ArrayList<Card> h) {
        Collections.sort(h);
        int len = h.size();
        int iter = 0;
        int value = 2;
        int occurences = 0;
        boolean done = false;
        while(!done){
            iter = 0;
            occurences = 0;
            while(iter < len){
                Card toLookAt = h.get(iter);
                int cardValue = toLookAt.getValue();
                if (cardValue == value){
                    occurences++;
                }
                iter++;
            }
            value++;
            if(occurences == 2){
                return true;
            }
            else if(value == 15){
                done = true;
            }
        }
        return false;
    }

    /**
     * Returns the number of times value appears in the hand
     * @param h     the hand
     * @param value the value to search for
     * @return th enumber of times value appears in the hand
     */
    public int numOccurrences(ArrayList<Card> h, int value) {
        int len = h.size();
        int iter = 0;
        int occurences = 0;
        while(iter < len){
            Card toLookAt = h.get(iter);
            int cardValue = toLookAt.getValue();
            if (cardValue == value){
                occurences++;
            }
            iter++;
        }
        return occurences;
    }
}
