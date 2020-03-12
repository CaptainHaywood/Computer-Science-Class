import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int num = a;
        int sum = 0;
        int count = 0;
        while (count != b - a + 1){
            if (num % 2 != 0){
                sum = sum + num;
            }
            num++;
            count++;
        }
        System.out.println(sum);
    }
}
