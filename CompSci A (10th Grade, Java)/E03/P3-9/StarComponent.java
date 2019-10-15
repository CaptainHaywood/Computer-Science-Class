import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
   This component draws stars.
*/
public class StarComponent extends JComponent {
   public void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;

      Star star1 = new Star(0, 0, 15, 15);
      Star star2 = new Star(60, 120, 80, 80);
      Star star3 = new Star(120, 60, 40, 40);

      star1.draw(g2);
      star2.draw(g2);
      star3.draw(g2);
   }
}