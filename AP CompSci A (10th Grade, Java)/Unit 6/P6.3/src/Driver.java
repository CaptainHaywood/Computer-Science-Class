import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() + 1;
        int fibonacci = 0;
        int num = 0;
        int num2 = 1;
        for(int loop=1; loop<n; loop++)
        {
            fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;
        }
        System.out.println(num);
    }
}
