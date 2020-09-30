import java.awt.*;
import java.util.ArrayList;

/**
 * Created by rritz on 9/3/2015.
 */

public class ColliderRectangle extends AbstractRectangle {

    /**
     * Constructs a SpecialSnowflakeRectangle
     * It has nothing in common with a snowflake physically, it's just called that because it's so
     * desperate to be unique from all the other happy, normal rectangles out there
     * @param inX x coordinate
     * @param inY y coordinate
     * @param inW width
     * @param inH height
     * @param inFillColor fill color
     */
    private ArrayList<AbstractRectangle> rectList = new ArrayList<AbstractRectangle>();
    int vX;
    int vY;
    public ColliderRectangle(int inX, int inY, int inW, int inH, Color inFillColor, DrawingAreaComponent drawArea, int velX, int velY) {
        super(inX, inY, inW, inH, inFillColor);
        rectList = drawArea.getRectList();
        rectList.remove(this);
        vX = velX;
        vY = velY;
    }

    @Override
    public String recType() {
        return "collider_enabled";
    }

    /**
     * The FallingRectangle moves down the screen.
     * @param drawAreaWidth the width of the drawing area
     * @param drawAreaHeight the height of the drawing area
     */


    @Override
    public void act(int drawAreaWidth, int drawAreaHeight) {
        this.translate(vX, vY);
        if(this.getLocation().x > 435){
            vX = -1;
        }
        if(this.getLocation().x < 0){
            vX = 1;
        }
        if(this.getLocation().y > 425){
            vY = -1;
        }
        if(this.getLocation().y < 0){
            vY = 1;
        }
        // ^ wallhit detection, shamelessly stolen from BouncingRect
        for(AbstractRectangle rect : rectList) {
            if(rect.recType().equals("collider_enabled")){ //checks to see if the rectangle has an overriden recType method that returns collider enabled code
                //checks if this rectangle is on the hitbox of the target rectangle. will probably fail at high speeds, but that just makes it more entertaining.
                if(this.getCenterX() == rect.getCenterX()+50 || this.getCenterX() == rect.getCenterX()-50 || this.getCenterY() == rect.getCenterY()+50 || this.getCenterY() == rect.getCenterY()-50){
                    //System.out.println("SMASH"); reports collisions for debug
                    if(vX < 0){
                        vX = -vX;
                        this.translate(1, 0); //steps the rectangle back a pixel to move it out of the collision zone, otherwise there could be jitter issues
                    }
                    else if(vX > 0){
                        vX = -vX;
                        this.translate(-1, 0);
                    }
                    if(vY < 0){
                        vY = -vY;
                        this.translate(0, 1);
                    }
                    else if(vY > 0){
                        vY = -vY;
                        this.translate(0, -1);
                    }
                }
            }
        }
    }
}