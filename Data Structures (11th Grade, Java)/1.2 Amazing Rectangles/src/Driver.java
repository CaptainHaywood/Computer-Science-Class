import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Driver {

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

    public static void main(String[] args){

        // Create and setup frame
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Amazing Rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a drawing component
        DrawingAreaComponent drawArea = new DrawingAreaComponent();
        frame.add(drawArea);
        frame.setVisible(true);

        // Create a FallingRectangle and add it to the drawArea
        FallingRectangle fr = new FallingRectangle(drawArea.getWidth()/2 - 25, 0, 50, 50, Color.BLUE);
        drawArea.addRectangle(fr);

        // Create inner class to assist with animation
        class TimerListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                drawArea.repaint(); // repaint the drawing component
            }
        }

        // Create a new TimerListener
        ActionListener listener = new TimerListener();

        // Create a new Timer and start it.
        final int DELAY = 10; // milliseconds between timer ticks
        Timer t = new Timer(DELAY, listener);
        t.start();
    }
}