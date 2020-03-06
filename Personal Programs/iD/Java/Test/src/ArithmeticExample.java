public class ArithmeticExample
{
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 100;

        num1 += 10;
        num2 *= num1;

        TextOut(num1, num2);

        num1++;
        num2--;

        TextOut(num1, num2);


    }

    public static void TextOut(int num1, int num2){
        System.out.println(num1);
        System.out.println(num2);
}
}
