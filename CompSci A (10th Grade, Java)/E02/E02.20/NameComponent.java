import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class NameComponent extends JComponent {
   public void paintComponent(Graphics g) {

      Graphics2D g2 = (Graphics2D) g;
      
      Rectangle r1 = new Rectangle(50, 50, 100, 50);
      
      g2.setColor(Color.BLUE);
      
      g2.draw(r1);
      
      g2.setColor(Color.RED);
      
      g2.drawString("James Haywood", 50,75);
    }
}