import java.util.Random;

public class Driver {
    public static void main(String[] args){
        Random random = new Random();
        int num = random.nextInt(7);
        num = num + 1;
        System.out.println(num);
    }
}
