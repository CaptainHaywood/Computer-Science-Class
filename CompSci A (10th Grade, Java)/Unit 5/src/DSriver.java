import java.util.Scanner;

public class DSriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        for(int i = 1; i <= n; i++){
            for(int x = 1; i <= n; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
