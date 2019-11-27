import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num2 == num1 + 1 && num3 == num2 + 1){
            System.out.println("increasing");
        }
        else if (num2 == num1 - 1 && num3 == num2 - 1){
            System.out.println("decreasing");
        }
        else{
            System.out.println("neither");
        }
    }
}
