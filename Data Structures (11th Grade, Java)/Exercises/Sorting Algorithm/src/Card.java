public class Card implements Comparable{
    private int value;
    private String suit;

    public Card(int cardVal, String suitVal){
        value = cardVal;
        suit = suitVal;
    }

    @Override
    public String toString() {
        return value + suit;
    }

    @Override
    public int compareTo(Object o) {
        Card c = (Card) o;

        if(value <  c.value){
            return -1;
        } else if (value > c.value) {
            return 1;
        }
        else{
            return suit.compareTo(c.suit);
        }
    }
}
