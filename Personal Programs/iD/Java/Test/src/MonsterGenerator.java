import java.util.Random;

public class MonsterGenerator {
    public static void main(String[] args) {
        Random generator = new Random();

        String[] monsters = {"Schooner", "Gunboat", "Corvette"};
        int monsterindex = generator.nextInt(monsters.length);
        String monster;
        monster = monsters[monsterindex];
        System.out.println("A " + monster + " appears!");
    }

    public static void print(String text)
    {
        System.out.println(text);
    }
}
