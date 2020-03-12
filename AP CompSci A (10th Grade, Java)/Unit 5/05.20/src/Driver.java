import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2);
        }
        else{
            System.out.println(num3);
        }
    }
}
