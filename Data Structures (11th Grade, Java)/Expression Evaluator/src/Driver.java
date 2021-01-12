import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Supported: ADD, SUB, MULT, DIV");
        System.out.print("Postfix Expression? ");
        String expression = in.nextLine();
        System.out.println(PostfixEvaluator.calculateAnswer(expression));
    }
}
