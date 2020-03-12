import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int integer = in.nextInt();
        String bin  = Integer.toBinaryString(integer);
        String[] list = bin.split("");
        int count = list.length;
        while(count != 0){
            System.out.println(list[count - 1]);
            count--;
        }
    }
}
