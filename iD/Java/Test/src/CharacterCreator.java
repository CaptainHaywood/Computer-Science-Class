import java.util.Scanner;

public class CharacterCreator {

    public static void main(String[] args) {
        Scanner playerInput;
        playerInput = new Scanner(System.in);

        String playerName;
        double playerHealth;

        Print("Name?");
        playerName = playerInput.nextLine();

        Print("Health?");
        playerHealth = playerInput.nextDouble();

        Print("Welcome " + playerName);
        Print("Health: " + playerHealth);
    }

    public static void Print(String text)
    {
        System.out.println(text);
    }
}
