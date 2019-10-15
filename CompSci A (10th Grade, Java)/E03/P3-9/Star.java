import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
   A star.
*/
public class Star {
   private double x;
   private double y;
   private double width;
   private double height;

   /**
      Constructs a Star at x, y coordinates of size w * h
      @param inX the x-coordinate of the topleft corner
      @param inY the y-coordinate of the topleft corner
      @param inW the width
      @param inH the height
   */
   public Star(double inX, double inY, double inW, double inH) {
      x = inX;
      y = inY;
      width = inW;
      height = inH;
   }

   /**
      Draws the star.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2) {
      //. . .
   }
}
