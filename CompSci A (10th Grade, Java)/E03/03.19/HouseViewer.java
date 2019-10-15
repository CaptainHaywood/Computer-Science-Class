import javax.swing.JFrame;

/**
   Viewer for House demo.
*/
public class HouseViewer {
   public static void main(String [] args) {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("House Viewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      HouseComponent component = new HouseComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}