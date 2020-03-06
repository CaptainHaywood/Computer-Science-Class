

public class Arena
{
    public static void main(String[] args) {
        Character player1 = new Character();
        Character player2 = new Character();

        player1.name = "Alex";
        player1.health = 50;

        player2.name =  "Steve";
        player2.health = 50;

        print(player1.name+" vs. "+ player2.name);
    }

    public static void print(String text){System.out.println(text);}
}
