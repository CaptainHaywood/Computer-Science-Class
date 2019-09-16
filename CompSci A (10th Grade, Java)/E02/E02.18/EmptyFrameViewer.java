import javax.swing.JFrame;

public class EmptyFrameViewer {
    public static void main(String[] args) {
       JFrame frame = new JFrame();
       
       frame.setSize(300, 400);
       
       frame.setTitle("Frame");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       RectangleComponent rc = new RectangleComponent();
       frame.add(rc);
       
       frame.setVisible(true);
    }
}