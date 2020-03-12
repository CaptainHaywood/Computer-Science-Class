public class CardDriver {
    public static void main(String[] args) {
        Card c1 = new Card(5, 'C');
        System.out.println(c1.getValue());
        System.out.println("Expected: 5");
        System.out.println(c1.getSuit());
        System.out.println("Expected: C");
        System.out.println(c1.toString());
        System.out.println("Expected: 5C");
    }
}
