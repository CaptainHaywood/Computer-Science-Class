import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String s3 = in.nextLine();

        List<String> list = new java.util.ArrayList<>(Collections.singletonList(s1));
        list.add(s2);
        list.add(s3);
        java.util.Collections.sort(list);


        int count = 0;
        while (count != list.size()){
            System.out.println(list.get(count));
            count++;
        }
    }
}

