import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Supported Operators: ADD, SUB, MULT, DIV, PAREN");
        System.out.print("(I)nfix/(P)ostfix? ");
        String type = in.nextLine();
        type = type.toUpperCase();
        System.out.println("Expression? ");
        String expression = in.nextLine();
        if(type.equals("I")){
            System.out.println(InfixEvaluator.getAnswer(expression));
        }
        else if(type.equals("P")){
            System.out.println(PostfixEvaluator.calculateAnswer(expression));
        }
    }
}
