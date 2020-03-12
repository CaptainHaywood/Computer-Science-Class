import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String[] list = input.split("");

        int count = 0;
        String fin = "";

        while (count != list.length){
            if(count % 2 == 0){
                fin = fin + list[count];
            }
            count++;
        }
        System.out.println(fin);
    }
}
