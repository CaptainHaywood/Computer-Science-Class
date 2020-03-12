import java.util.Scanner;

public class Driver {
    public static <Int> void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String number = "";

        while (count != 10){
            int input = in.nextInt();
            number = number + input;
            number = number + " ";
            count++;
        }
       String[] list = number.split(" ");

        count = 0;
        int lowest = Integer.parseInt(list[0]);
        int highest = Integer.parseInt(list[0]);

        while(count != list.length){
            int temp = Integer.parseInt(list[count]);

            if (temp < lowest){
                lowest = temp;
            }

            if (temp > highest){
                highest = temp;
            }
            count++;
        }
        System.out.println(lowest);
        System.out.println(highest);

    }
}
