import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        int pin = 1234;
        int count = 0;

        while(!done){

            int entry = in.nextInt();

            if(entry == pin){
                System.out.println("Your PIN is correct");
                done = true;
            }
            else if(entry != pin){
                System.out.println("Your PIN is incorrect");
                count++;
            }

            if(count > 2){
                System.out.println("Your bank card is blocked");
                done = true;
            }

        }
    }
}
