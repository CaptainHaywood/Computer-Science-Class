public class DriverRemoveTester {
    public static void main(String[] args) {
        AbstractList<String> myList = new UnsortedList<>(5);
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        System.out.println(myList.toString());
        myList.remove("3");
        System.out.println(myList.toString());

    }
}
