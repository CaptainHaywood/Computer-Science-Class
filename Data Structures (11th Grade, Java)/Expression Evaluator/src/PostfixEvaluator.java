import java.util.Stack;

public class PostfixEvaluator {

    public static double calculateAnswer(String postfix){
        Stack<Double> operandStack = new Stack<>();
        String[] tokens = postfix.split(" ");
        for(int i = 0; i < tokens.length; i++){
            if(!tokens[i].equals("+") || !tokens[i].equals("-") || !tokens[i].equals("/") || !tokens[i].equals("*")){
                operandStack.push(Double.parseDouble(tokens[i]));
            }
            else{
                //execute operator :blobhype:
            }
        }
        return -0.0; //dummy return state
    }

}
