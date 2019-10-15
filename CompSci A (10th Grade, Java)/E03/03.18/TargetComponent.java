import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;

/**
   This component draws a target.
*/
public class TargetComponent extends JComponent {
   /**
      Paints the ellipse.
      @param g the graphics context
   */
   public void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;

      double radius = getWidth() / 2;
      double centerX = getWidth() / 2;
      double centerY = getHeight() / 2;

      Target target = new Target(radius, centerX, centerY);
      target.draw(g2);
   }
}