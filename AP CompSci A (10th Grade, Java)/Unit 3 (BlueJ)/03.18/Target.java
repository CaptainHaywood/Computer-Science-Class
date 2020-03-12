import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
   Draws a target.
*/
public class Target {
   private double radius;
   private double xCenter;
   private double yCenter;

   /**
      Creates a new instance of Target.
      @param r the radius
      @param x the center x-coordinate
      @param y the center y-coordinate
    */
   public Target(double r, double x, double y) {
      radius = r;
      xCenter = x;
      yCenter = y;
   }

   /**
      Draws the target.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2) {

      double x = xCenter - radius; // upper-left bounding box x value
      double y = yCenter - radius; // upper-left bounding box y value

      Ellipse2D.Double circle1 = new Ellipse2D.Double(x, y, 2 * radius, 2 * radius);
      g2.setColor(Color.black);
      g2.fill(circle1);

      double oneFifth = radius * 1.0 / 5.0;

      Ellipse2D.Double circle2 = new Ellipse2D.Double(x + oneFifth , y + oneFifth, 2 * (radius - oneFifth), 2 * (radius - oneFifth));
      g2.setColor(Color.white);
      g2.fill(circle2);
      
      Ellipse2D.Double circle3 = new Ellipse2D.Double(x + oneFifth * 2, y + oneFifth * 2, 2 * (radius - oneFifth * 2), 2 * (radius - oneFifth * 2));
      g2.setColor(Color.black);
      g2.fill(circle3);
      
      Ellipse2D.Double circle4 = new Ellipse2D.Double(x + oneFifth * 3, y + oneFifth * 3, 2 * (radius - oneFifth * 3), 2 * (radius - oneFifth * 3));
      g2.setColor(Color.white);
      g2.fill(circle4);
      
      Ellipse2D.Double circle5 = new Ellipse2D.Double(x + oneFifth * 4, y + oneFifth * 4, 2 * (radius - oneFifth * 4), 2 * (radius - oneFifth * 4));
      g2.setColor(Color.black);
      g2.fill(circle5);

      // . . .
      
   }
}
