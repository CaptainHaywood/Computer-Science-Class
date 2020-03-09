import java.util.Random;

public class Driver {
    public static void main(String[] args){
        Random random = new Random();
        int num1 = random.nextInt(50) + 1;
        int num2 = random.nextInt(50) + 1;
        int num3 = random.nextInt(50) + 1;
        int num4 = random.nextInt(50) + 1;
        int num5 = random.nextInt(50) + 1;
        int num6 = random.nextInt(50) + 1;
        String space = " ";
        System.out.println("Play these: " + num1 + space + num2 + space + num3 + space + num4 + space + num5 + space + num6);
    }
}
