import java.util.ArrayList;
import java.util.Collections;

public class Driver_Comp {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            myList.add(i);
        }

        Collections.shuffle(myList);
        System.out.println(myList);
        sort(myList);
        System.out.println(myList);
    }
    public static void sort(ArrayList<Integer> theList){

    }
}
