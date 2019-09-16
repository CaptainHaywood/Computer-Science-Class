import java.awt.Rectangle;

public class Driver {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(0,0,10,10);
        Rectangle r2 = new Rectangle(10,0,10,10);
        Rectangle r3 = new Rectangle(10,10,10,10);
        Rectangle r4 = new Rectangle(0,10,10,10);
        //int width = (int) r.getWidth(); // get the width as an integer
        //int height = (int) r.getHeight(); // get the height as an integer

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
}
