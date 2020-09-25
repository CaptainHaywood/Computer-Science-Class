import java.awt.*;

/**
 * Created by rritz on 9/3/2015.
 */

public class BouncingRectangle extends AbstractRectangle {

    /**
     * Constructs a FallingRectangle
     * @param inX x coordinate
     * @param inY y coordinate
     * @param inW width
     * @param inH height
     * @param inFillColor fill color
     */
    public BouncingRectangle(int inX, int inY, int inW, int inH, Color inFillColor) {
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
    }
}