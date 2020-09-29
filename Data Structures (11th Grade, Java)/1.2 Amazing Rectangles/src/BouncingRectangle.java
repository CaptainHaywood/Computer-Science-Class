import java.awt.*;
import java.util.Random;

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
    int x;
    int y;
    public BouncingRectangle(int inX, int inY, int inW, int inH, Color inFillColor) {
        super(inX, inY, inW, inH, inFillColor);
        x=0;
        y=0;
        Random rd = new Random(); // creating Random object
        boolean bounce = rd.nextBoolean();
        if(bounce == true){
            x = 0;
            y = 1;
        }
        else if(bounce == false){
            x=1;
            y=0;
        }
    }

    /**
     * The FallingRectangle moves down the screen.
     * @param drawAreaWidth the width of the drawing area
     * @param drawAreaHeight the height of the drawing area
     */
    @Override
    public void act(int drawAreaWidth, int drawAreaHeight) {
            this.translate(x, y);
            if(this.getLocation().x > 435){
                x = -1;
            }
            if(this.getLocation().x < 0){
                x = 1;
            }
            if(this.getLocation().y > 425){
                y = -1;
            }
            if(this.getLocation().y < 0){
                y = 1;
            }
    }
}