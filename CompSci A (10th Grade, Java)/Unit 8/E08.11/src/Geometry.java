import java.awt.geom.Point2D;

public class Geometry {
    public static double slope(Point2D.Double a, Point2D.Double b) {
        double slope = (b.getY() - a.getY()) / (b.getX() - a.getX());
        slope = slope * 100;
        slope = Math.round(slope);
        slope = slope / 100;
        return slope;
    }

    public static double angle(Point2D.Double a, Point2D.Double b) {
        return Math.round(Math.toDegrees(Math.atan(Geometry.slope(a, b))));
    }
}
