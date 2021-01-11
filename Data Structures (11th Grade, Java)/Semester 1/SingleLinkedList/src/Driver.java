public class Driver {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.get(2));
        list.remove(2);
        list.add(3, 9);
        list.add(8);
        list.set(0,7);
        System.out.println("done");
        // Print the LinkedList
        System.out.println(list.toString());

        SingleLinkedList<String> sll = new SingleLinkedList<String>();
        sll.add(0, "One");

        sll.add(1, "Two");

        sll.add(2, "Four");

        sll.add(2, "Three");

        sll.set(0, "1");

        sll.set(1, "2");

        sll.set(2, "3");

        sll.set(3, "4");


        System.out.println(sll.toString().equals("[1, 2, 3, 4]"));
        }
    }

