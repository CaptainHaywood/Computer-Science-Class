import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;


public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle r1 = new Rectangle(50, 50, 40, 40);
        Rectangle r2 = new Rectangle(60, 60, 20, 20);
        
        //g2.setColor(Color.RED);
        //g2.fill(r1);
        //g2.setColor(Color.BLUE);
        //g2.draw(r1);
        
        //Ellipse2D.Double ellipse = new Ellipse2D.Double(100, 100, 50, 75);
        
        //Line2D.Double segment  = new Line2D.Double(200, 200, 50, 50);
        
        //g2.drawString("Chrome be like hippity hoppity your RAM is now my property", 100, 200);
        
        g2.draw(r1);
        g2.draw(r2);
        //g2.draw(ellipse);
        //g2.draw(segment);
    }
}