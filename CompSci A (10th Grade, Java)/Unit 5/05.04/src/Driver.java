import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num1 == num2 && num2 == num3 && num1 == num3){
            System.out.println("all the same");
        }
        else if (num1 != num2 && num2 != num3 && num1 != num3){
            System.out.println("all different");
        }
        else{
            System.out.println("neither");
        }
    }
}
