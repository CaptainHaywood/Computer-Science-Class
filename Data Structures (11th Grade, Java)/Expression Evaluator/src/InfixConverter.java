import java.util.Stack;

public class InfixConverter {
    public static String convertInfix(String expression){
        Stack<String> operatorStack = new Stack<>();
        String postfix = "";
        String[] tokens = expression.split(" ");
        for(int i = 0; i < tokens.length; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/") && !tokens[i].equals("*")){ //code golf?
                postfix = postfix + tokens[i];
            }
            else{
                if(operatorStack.empty()){
                    operatorStack.push(tokens[i]);
                }
                else if((getPrecedence(operatorStack.peek()) < getPrecedence(tokens[i]))){
                    operatorStack.push(tokens[i]);
                }
                else if(getPrecedence(tokens[i]) <= getPrecedence(operatorStack.peek())){
                    while(!operatorStack.empty()){
                        postfix = postfix + operatorStack.pop();
                    }
                    operatorStack.push(tokens[i]);
                }
            }
        }

        while(!operatorStack.empty()){
            postfix = postfix + operatorStack.pop();
        }
        return postfix;
    }

    private static int getPrecedence(String op){
        //ADD, SUB 1
        //MULT, DIV 2
        if(op.equals("+") || op.equals("-")){
            return 1;
        }
        else{
            return 2;
        }
    }
}
