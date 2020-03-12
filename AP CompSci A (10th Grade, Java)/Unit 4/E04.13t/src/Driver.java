import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter start time: ");
        String num  = in.nextLine();

        num = num.replace(",", "");

        System.out.println(num);
    }

}
