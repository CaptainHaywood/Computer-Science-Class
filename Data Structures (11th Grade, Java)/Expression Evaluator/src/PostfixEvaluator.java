import java.util.Stack;

public class PostfixEvaluator {
    public static double calculateAnswer(String postfix){
        Stack<Double> operandStack = new Stack<>();
        String[] tokens = postfix.split(" ");
        for(int i = 0; i < tokens.length; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/") && !tokens[i].equals("*")){ //code golf?
                operandStack.push(Double.parseDouble(tokens[i]));
            }
            else{
                double firstVal = operandStack.pop();
                double secondVal = operandStack.pop();
                double finalVal = -0.0;
                if(tokens[i].equals("+")){
                    finalVal = firstVal + secondVal;
                }
                else if(tokens[i].equals("-")){
                    finalVal = secondVal - firstVal;
                }
                else if(tokens[i].equals("*")){
                    finalVal = firstVal * secondVal;
                }
                else if(tokens[i].equals("/")){
                    finalVal = secondVal / firstVal;
                }
                operandStack.push(finalVal);
            }
        }
        return operandStack.peek();
    }

}
