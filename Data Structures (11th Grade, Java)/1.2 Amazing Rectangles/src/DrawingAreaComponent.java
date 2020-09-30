import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JComponent;

public class DrawingAreaComponent extends JComponent {

    private ArrayList<AbstractRectangle> rectangleList;

    /**
     * Constructs a DrawingAreaComponent
     */
    public DrawingAreaComponent() {
        rectangleList = new ArrayList<AbstractRectangle>();
    }

    /**
     * Adds an AbstractRectangle to this DrawingAreaComponent
     * @param inAbstractRectangle the AbstractRectangle to add
     */
    public void addRectangle(AbstractRectangle inAbstractRectangle) {
        rectangleList.add(inAbstractRectangle);
    }

    /**
     * This method is automatically called whenever the DrawingAreaComponent
     * is repainted. It instructs all AbstractRectangle's in the
     * rectangleList to act and draw.
     * @param g the graphics
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for(AbstractRectangle rect : rectangleList) {

            // tell rectangle to "act" and provide the width/height of the drawing area
            rect.act(getWidth(), getHeight());

            // tell the rectangle to draw itself on the graphics
            rect.draw(g2);
        }
    }

    public ArrayList<AbstractRectangle> getRectList(){
        return rectangleList;
    }
}