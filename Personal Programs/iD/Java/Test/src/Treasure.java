import java.util.Random;

public class Treasure {
    public static void main(String[] args) {
        Random generator = new Random();

        double gold;
        gold = generator.nextDouble() * 5;

        boolean isTrapped;

        isTrapped = generator.nextBoolean();

        if (isTrapped){
            System.out.println("It was trapped - you ded");
        }
        else
        {
            System.out.println("You open the chest to find " + gold + " gold pieces!");
        }
     }
}
