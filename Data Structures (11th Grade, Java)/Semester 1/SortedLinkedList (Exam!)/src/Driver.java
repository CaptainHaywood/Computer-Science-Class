public class Driver {
    public static void main(String[] args) {
        SortedLinkedList<Integer> sll = new SortedLinkedList<Integer>();
        sll.add(1);
        sll.add(3);
        sll.add(3);
        sll.add(2);
        sll.add(0);
        sll.add(5);
        sll.add(5);
        sll.add(4);
        sll.add(-1);
        System.out.println(sll.toString());
    }
}
