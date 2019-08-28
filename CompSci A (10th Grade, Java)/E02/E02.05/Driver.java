import java.awt.Rectangle;

public class Driver {
    public static void main(String[] args){
        Rectangle box = new Rectangle(5, 10, 20, 30);
        print("Expected X: " + box.getX() + " Y: " + box.getY());
        print("Expected W :" + box.getWidth() + " Height: " + box.getHeight());
        box.add(0,0);
        print("Actual X: " + box.getX() + " Y: " + box.getY());
        print("Actual Width :" + box.getWidth() + " Height: " + box.getHeight());
    }
    public static void print(String output){
        System.out.println(output);
    }
}