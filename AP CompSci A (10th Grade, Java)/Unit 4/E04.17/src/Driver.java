import java.util.Scanner;

public class Driver
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter start time: ");
        int start  = in.nextInt();
        //System.out.println("Enter end time: ");
        int end = in.nextInt();

        int timeElapsed = end - start;

        int hours = timeElapsed / 100;
        hours = Math.round(hours);
        timeElapsed = timeElapsed - (hours * 100);

        System.out.println(hours + " hours " + timeElapsed + " minutes");

    }
}
