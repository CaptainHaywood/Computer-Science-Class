import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;


public class FaceComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        //Rectangle r1 = new Rectangle(50, 50, 40, 40);
        //Rectangle r2 = new Rectangle(60, 60, 20, 20);
        
        //g2.setColor(Color.RED);
        //g2.fill(r1);
        //g2.setColor(Color.BLUE);
        //g2.draw(r1);
        
        Ellipse2D.Double ellipse = new Ellipse2D.Double(25, 30, 100, 100);
        Ellipse2D.Double ellipse2 = new Ellipse2D.Double(45, 50, 10, 10);
        Ellipse2D.Double ellipse3 = new Ellipse2D.Double(95, 50, 10, 10);

        
        Line2D.Double segment  = new Line2D.Double(50, 100, 100, 100);
        
        //g2.drawString("Chrome be like hippity hoppity your RAM is now my property", 100, 200);
        
        g2.draw(ellipse);
        g2.draw(ellipse2);
        g2.draw(ellipse3);
        g2.draw(segment);
    }
}