import java.util.Scanner;

public class Driver
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter start time: ");
        String num  = in.nextLine();

        num = num.replace(".", "@");
        String[] money = num.split("@", 2);


        System.out.println(money[0] + " dollars and " + money[1].replace("0", "") + " cents");
    }
}
