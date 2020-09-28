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
    boolean bounce;
    public BouncingRectangle(int inX, int inY, int inW, int inH, Color inFillColor, Boolean bounce) {
        super(inX, inY, inW, inH, inFillColor);
        bounce = bounce;
    }

    /**
     * The FallingRectangle moves down the screen.
     * @param drawAreaWidth the width of the drawing area
     * @param drawAreaHeight the height of the drawing area
     */
    @Override
    public void act(int drawAreaWidth, int drawAreaHeight) {
            int x = 0;
            int y = 0;
            if(bounce = true){
                x = 0;
                y = 1;
            }
            else{
                x=1;
                y=0;
            }
            this.translate(x, y);
    }
}