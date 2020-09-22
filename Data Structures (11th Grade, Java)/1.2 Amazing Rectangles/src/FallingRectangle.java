import java.awt.Color;

/**
 * Created by rritz on 9/3/2015.
 */

public class FallingRectangle extends AbstractRectangle {

    /**
     * Constructs a FallingRectangle
     * @param inX x coordinate
     * @param inY y coordinate
     * @param inW width
     * @param inH height
     * @param inFillColor fill color
     */
    public FallingRectangle(int inX, int inY, int inW, int inH, Color inFillColor) {
        super(inX, inY, inW, inH, inFillColor);
    }

    /**
     * The FallingRectangle moves down the screen.
     * @param drawAreaWidth the width of the drawing area
     * @param drawAreaHeight the height of the drawing area
     */
    @Override
    public void act(int drawAreaWidth, int drawAreaHeight) {
        this.translate(0, 1);
        if(this.getLocation().y > 400){
            this.setSize((int) this.getWidth() + 2, (int) this.getHeight() - 1);
            this.setLocation((int) this.getX() - 1, (int) this.getY() + 1);
        }
    }
}