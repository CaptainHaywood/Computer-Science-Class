import java.awt.*;

public abstract class AbstractRectangle extends Rectangle {

    private Color fillColor;

    /**
     * Constructs an AbstractRectangle
     * @param inX x coordinate
     * @param inY y coordinate
     * @param inW width
     * @param inH height
     * @param inFillColor fill color
     */
    public AbstractRectangle(int inX, int inY, int inW, int inH, Color inFillColor) {
        super(inX, inY, inW, inH);
        fillColor = inFillColor;
    }

    /**
     * Sets the drawing color to fillColor and draw this
     * AbstractRectangle on the g2 graphic with it filled
     * in.
     * @param g2 the graphics to draw on
     */
    public void draw(Graphics2D g2) {
        g2.setColor(fillColor);
        g2.fill(this);
    }

    /**
     * Returns the fill color of this AbstractRectangle
     * @return the fill color of this AbstractRectangle
     */
    public Color getFillColor() {
        return fillColor;
    }


    /**
     * Sets the fill color of this AbstractRectangle
     * @param c
     */
    public void setFillColor(Color c) {
        fillColor = c;
    }

    /**
     * The action for this AbstractRectangle to
     * perform. This is an abstract method that will
     * be implemented by the subclasses.
     */
    public abstract void act(int drawAreaCompWidth, int drawAreaCompHeight);
}