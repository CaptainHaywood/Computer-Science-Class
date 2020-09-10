import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        String list = "";
        for(int i = 0; i < numbers.size(); i++){
            list = list + " " + numbers.get(i);
        }
        System.out.println(list);
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < numbers.size() - 1; i++){
                if(numbers.get(i) > numbers.get(i+1)){
                    int hold = numbers.get(i);
                    numbers.set(i, numbers.get(i+1));
                    numbers.set(i+1, hold);
                    sorted = false;
                }
            }
        }
        list = "";
        for(int i = 0; i < numbers.size(); i++){
            list = list + " " + numbers.get(i);
        }
        System.out.println(list);


    }
}
