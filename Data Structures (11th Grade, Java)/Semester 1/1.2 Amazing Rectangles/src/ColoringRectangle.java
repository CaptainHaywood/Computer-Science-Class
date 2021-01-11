import java.awt.*;

/**
 * Created by rritz on 9/3/2015.
 */

public class ColoringRectangle extends AbstractRectangle {

    /**
     * Constructs a FallingRectangle
     * @param inX x coordinate
     * @param inY y coordinate
     * @param inW width
     * @param inH height
     * @param inFillColor fill color
     */
    public ColoringRectangle(int inX, int inY, int inW, int inH, Color inFillColor) {
        super(inX, inY, inW, inH, inFillColor);
    }

    /**
     * The FallingRectangle moves down the screen.
     * @param drawAreaWidth the width of the drawing area
     * @param drawAreaHeight the height of the drawing area
     */
    @Override
    public void act(int drawAreaWidth, int drawAreaHeight) {
        if(this.getFillColor().getRed() == 0 && this.getFillColor().getGreen() == 0 && this.getFillColor().getBlue() == 0){
            boolean doNothing = true;
        }
        else{
            int rojo = 0;
            int verde = 0;
            int azul = 0;

            if(this.getFillColor().getRed() != 0) {
                rojo = this.getFillColor().getRed() - 1;
            }
            if(this.getFillColor().getGreen() != 0){
                verde = this.getFillColor().getGreen() - 1;
            }
            if(this.getFillColor().getBlue() != 0){
                azul = this.getFillColor().getBlue() - 1;
            }

            Color lower = new Color(rojo,verde,azul);
            this.setFillColor(lower);
        }

    }
}