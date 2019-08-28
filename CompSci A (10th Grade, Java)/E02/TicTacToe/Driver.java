import javax.swing.JOptionPane;
public class Driver{
    public static String line1 = "123";
    public static String line2 = "456";
    public static String line3 = "789";
    public static String playerTurn = "X";
    public static void main(String [] args){
        for(int i = 1; i<= 18; i++){
            String out = playGame(line1, line2, line3, playerTurn);
            
            line1 = line1.replace(out, playerTurn);
            line2 = line2.replace(out, playerTurn);
            line3 = line3.replace(out, playerTurn);
            if (playerTurn == "X"){
                playerTurn = "O";
            }
            else{
                playerTurn = "X";
            }
        }
    }
    public static String playGame(String line1, String line2, String line3, String playerTurn){
        String userInput;
        userInput = JOptionPane.showInputDialog(line1 + "\n" + line2 + "\n"+ line3+ "\nPlease enter a number (1-0):");

        return userInput;
    }
}