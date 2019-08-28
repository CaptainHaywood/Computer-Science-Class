import javax.swing.JOptionPane;

public class Driver {
    public static void main(String[] args){
        String line1;
        int length;
        line1 = "123";
        
        length = line1.length();
        
        System.out.println(length);
        
        String moveLoc = JOptionPane.showInputDialog(null, "Enter move:");
        
        line1 = line1.replace(moveLoc, "X");
        
        System.out.println(line1);
    }
}