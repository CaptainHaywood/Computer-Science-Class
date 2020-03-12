import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

/**
   This class draws a house at a specified (x,y) coordinate.
*/
public class House {
   private int x;
   private int y;

   /**
      Constructor to initialize the x,y coordinate.
      @param inX the x of upper left point of the bounding box 
      @param inY the y of upper left point of the bounding box 
*/
   public House(int inX, int inY) {
      x = inX;
      y = inY;
   }

   /**
      Draws the house
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2) {
       Line2D.Double line1 = new Line2D.Double(x, y+20, x+20, y);
       Line2D.Double line2 = new Line2D.Double(x+20, y, x+40, y+20);
       Rectangle r = new Rectangle(x, y+20, 40, 20);
       g2.draw(r);
       g2.draw(line1);
       g2.draw(line2);
   }
}
