import java.util.Scanner;
import java.text.DecimalFormat;

public class Driver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter start time: ");
        int num  = in.nextInt();

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        System.out.println(decimalFormat.format(num));


    }
}
