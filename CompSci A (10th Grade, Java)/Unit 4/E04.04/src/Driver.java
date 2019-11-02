import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = 10;
        int num2 = 20;

        System.out.println("Enter num1: ");
        num1  = in.nextInt();
        in.nextLine();

        System.out.println("Enter num2: ");
        num1  = in.nextInt();
        in.nextLine();

        System.out.println(num1 + num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1 + num2 / 2);
        System.out.println(Math.abs(num1-num2));
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num1, num2));


    }
}
