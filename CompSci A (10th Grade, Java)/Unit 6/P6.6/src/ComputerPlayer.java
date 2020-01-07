import java.util.Random;
public class ComputerPlayer {
    private int myMode;

    public static final int STUPID = 0;
    public static final int SMART = 1;

    public ComputerPlayer(int inMode) { myMode = inMode; }

    /**
     * Reutns the mode of the player: 0 (STUPID) or 1 (SMART)
     * @return The mode of the player
     */

    public int getMode() { return myMode; }
    /**
     * Determines how many marbles the computer player takes based ont he numbers of marbles on the pile and the mode of this computer player.
     * @param pileSize The size of the pile.
     * @return the amount of marbles the computer player wants to take.
     */

    public int getTake(int pileSize) {

        if(pileSize <= 3)
            return 1;

        if (myMode == STUPID || pileSize == 63 || pileSize == 31) {
            Random r = new Random();
            int take = r.nextInt(pileSize / 2) + 1;
            return take;
        }

        else {
            if(pileSize > 63)
                return pileSize - 63;
            else if (pileSize > 31)
                return pileSize - 31;
            else if (pileSize > 15)
                return pileSize - 15;
            else if (pileSize > 7)
                return pileSize - 7;
        }

        return 0;
    }
}




