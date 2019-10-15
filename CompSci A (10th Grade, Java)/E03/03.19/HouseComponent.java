import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;

/**
   This component draws a house.
*/
public class HouseComponent extends JComponent {
   /**
      Paints the ellipse.
      @param g the graphics context
   */
   public void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;

      House house1 = new House(0, 0);
      house1.draw(g2);

      House house2 = new House(100, 100);
      house2.draw(g2);
   }
}