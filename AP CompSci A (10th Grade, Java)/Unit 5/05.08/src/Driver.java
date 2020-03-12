import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        in.nextLine();

        if (n1 + n2 == n3 + n4){
            System.out.println("two pairs");
        }
        else if (n2 == n1 && n3 == n4){
            System.out.println("two pairs");
        }
        else{
            System.out.println("not two pairs");
        }
    }
}