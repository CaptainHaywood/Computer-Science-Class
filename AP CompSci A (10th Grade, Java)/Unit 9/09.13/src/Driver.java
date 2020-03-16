public class Driver {
    public static void main(String[] args) {
        BetterRectangle r1 = new BetterRectangle(0, 0, 5,5);
        System.out.println("Area");
        System.out.println(r1.getArea());
        System.out.println("Perimeter");
        System.out.println(r1.getPerimeter());
    }
}
