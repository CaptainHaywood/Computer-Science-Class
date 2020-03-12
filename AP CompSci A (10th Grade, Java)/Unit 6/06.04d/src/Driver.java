import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String[] list = input.split("");

        int count = 0;
        int fin = 0;

        while (count != list.length){
            if(list[count].equals("A") || list[count].equals("E") || list[count].equals("I") || list[count].equals("O") || list[count].equals("U")){
                fin++;
            }
            else if(list[count].equals("a") || list[count].equals("e") || list[count].equals("i") || list[count].equals("o") || list[count].equals("u")){
                fin++;
            }
            count++;
        }
        System.out.println(fin);
    }
}
