import java.awt.geom.Point2D;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double aX = in.nextDouble();
        double aY = in.nextDouble();
        double bX = in.nextDouble();
        double bY = in.nextDouble();

        Point2D.Double a = new Point2D.Double(aX, aY);
        Point2D.Double b = new Point2D.Double(bX, bY);

        System.out.println(Geometry.slope(a, b));
        System.out.println(Geometry.angle(a, b));
    }
}
