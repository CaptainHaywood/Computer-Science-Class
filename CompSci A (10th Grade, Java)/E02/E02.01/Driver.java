import java.awt.Rectangle;

public class Driver {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5,10,20,30);
        
        double w = r1.getWidth();
        
        double h = r1.getHeight();
        
        double area = w * h;
        
        System.out.println(area);
    }
}