import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList();
        myList.add("10");
        Assertions.assertEquals("[10]", myList.toString());
    }
}
