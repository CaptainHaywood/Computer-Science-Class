import javax.swing.JFrame;

public class FaceViewer
{
   public static void main(String[] args) {
      // Initialize Frame
      JFrame window = new JFrame();

      // Start Frame
      window.setSize(400, 300);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Draw Component
      window.add(new FaceComponent());

      window.setVisible(true);
   }
}




