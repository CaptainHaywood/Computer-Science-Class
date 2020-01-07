import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int gap = num - 2;

        if(num != 1){
            capLines(num, gap);
            System.out.println();
            int count = 0;
            while (count != num - 2){
                midLines(num, gap);
                count++;
            }
            capLines(num, gap);
        }
        else{
            capLines(num, gap);
        }



    }
    public static void capLines(int length, int gap){
        int count = 0;
        while(count != length){
            System.out.print("*");
            count++;
        }
        count = 0;
        System.out.print(" ");
        while(count != length){
            System.out.print("*");
            count++;
        }
    }
    public static void midLines(int length, int gap){
        int count = 0;
        while(count != length){
            System.out.print("*");
            count++;
        }
        System.out.print(" ");
        System.out.print("*");
        count = 0;
        while (count != gap){
            System.out.print(" ");
            count++;
        }
        System.out.println("*");
    }
}
