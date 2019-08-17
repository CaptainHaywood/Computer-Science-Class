import javax.swing.JOptionPane;
public class Driver {
    public static void main (String[] args){
        String name = JOptionPane.showInputDialog("What is your name?");
        //System.out.println("Hello " + name + "!");
        JOptionPane.showInputDialog("Hello " + name + "! My name is Hal! What would you like me to do?");
        JOptionPane.showMessageDialog(null, "I'm sorry " + name + ". I'm afraid I can't do that.");
    }
}