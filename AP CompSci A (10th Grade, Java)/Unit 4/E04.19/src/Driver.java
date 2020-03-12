import java.sql.SQLOutput;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //System.out.println("Enter start time: ");
        int num  = in.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < months.length; i++) {
            if (num - 1 == i){
                System.out.println(months[num-1]);
                break;
            }
        }

    }

}
