public class DeckDriver {
    public static void main(String[] args) {
        Deck d = new Deck();
        //Prints all the cards when they are in order
        for(int i=1; i<=52; i++)
        System.out.println(d.nextCard());
        //Try shuffling and printing all the cards in the deck again
    }
}
