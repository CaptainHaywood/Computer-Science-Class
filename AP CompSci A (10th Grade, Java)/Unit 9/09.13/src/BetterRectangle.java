public class BetterRectangle extends java.awt.Rectangle {

    public BetterRectangle(int xPoint, int yPoint, int wSize, int lSize){
        setLocation(xPoint, yPoint);
        setSize(wSize, lSize);
    }

    public double getPerimeter(){
        return getWidth() + getWidth() + getHeight() + getHeight();
    }

    public double getArea(){
        return getWidth() * getHeight();
    }

}
