import java.util.Random;
import java.awt.Color;

public class Driver {
    public static void main(String[] args){
        Random r1 = new Random();
        
        int die1 = r1.nextInt(6) + 1;
        
        System.out.println(die1);
        
        StringBuilder sb1 = new StringBuilder("park");
        
        System.out.println(sb1.reverse());
        
        Color c1 = new Color(100,50,75);
        
        Color c2 = c1.brighter();
        
        System.out.println(c2);
    }
}