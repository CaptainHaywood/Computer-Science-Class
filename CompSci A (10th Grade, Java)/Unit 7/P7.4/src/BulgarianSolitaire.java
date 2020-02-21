import java.util.ArrayList;
import java.util.Random;

/**
 * Created by rritz on 12/9/2016.
 */
public class BulgarianSolitaire {

    private ArrayList<Integer> pileList;

    /**
     * Constructs new BulgarianSolitare
     */
    public BulgarianSolitaire() {
        pileList = new ArrayList<>();
    }

    /**
     * Generates random pile sizes and places them in
     * pileList. The sum of the random piles generated
     * should equal 45 which is the total number of
     * cards in the game. The number of piles can range
     * from 1..45.
     */
    public void generateRandomPiles() {
        Random r = new Random();
        int numCards = 45;

        while(numCards > 0){
            int newPile = r.nextInt(numCards + 1);
            pileList.add(newPile);
            numCards = numCards - newPile;
        }

    }

    /**
     * Plays one round of the game 
     */
    public void playOneRound() {
        int numPiles = pileList.size();
        int iter = 0;
        int newPile = 0;
        while(iter < numPiles){
            pileList.set(iter, pileList.get(iter) - 1);
            newPile++;
            iter++;
        }
        pileList.add(newPile);
    }

    /**
     * Returns true if the game is over, false otherwise
     * @return true if the game is over, false otherwise
     */
    public boolean gameOver() {
        if(pileList.size() != 9){
            return false;
        }

        for (int i = 1; i < pileList.size(); i++) {
            if (pileList.get(i - 1) + 1 != pileList.get(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the string representation of the piles
     * @return the string representation of the piles
     */
    public String getPiles() {
        return pileList.toString();
    }
}