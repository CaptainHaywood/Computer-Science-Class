import java.util.ArrayList;

public class HandEvaluatorDriver {
    public static void main(String[] args) {
        HandEvaluator he = new HandEvaluator();
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card(4, 'C'));
        hand.add(new Card(5, 'C'));
        hand.add(new Card(5, 'C'));
        hand.add(new Card(5, 'C'));
        hand.add(new Card(4, 'C'));
        System.out.println(he.numOccurrences(hand, 5));
        System.out.println("Expected: 2");
        System.out.println(he.numOccurrences(hand, 6));
        System.out.println("Expected: 1");
        System.out.println(he.isFourOfKind(hand));
    }
}
