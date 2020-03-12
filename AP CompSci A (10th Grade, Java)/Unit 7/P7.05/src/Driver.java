import java.util.Scanner;

/**
 This class tests whether a sequence of inputs forms a magic square.
 */
public class Driver {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // read in the dimension of the table
        int n = in.nextInt();
        in.nextLine();

        // setup n x n square
        Square sq = new Square(n);

        // read n x n inputs and populate table accordingly. the table
        // will be populated by starting in the upper-left corner,
        // left to right in each row, down to the bottom-right corner.
        for(int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int num = in.nextInt();
                in.nextLine();
                sq.set(r, c, num);
            }
        }

        System.out.println(sq.isMagic());

    }
}