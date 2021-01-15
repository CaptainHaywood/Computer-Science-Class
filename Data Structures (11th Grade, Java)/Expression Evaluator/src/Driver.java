import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Supported: ADD, SUB, MULT, DIV");
        System.out.print("(I)nfix/(P)ostfix? ");
        String type = in.nextLine();
        type.toUpperCase();
        System.out.println("Expression? ");
        String expression = in.nextLine();
        if(type == "I"){
            System.out.println(PostfixEvaluator.calculateAnswer(InfixConverter.convertInfix(expression)));
        }
        else if(type == "P"){
            System.out.println(PostfixEvaluator.calculateAnswer(expression));
        }
    }
}
