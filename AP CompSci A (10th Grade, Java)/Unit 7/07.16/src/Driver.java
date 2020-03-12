import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // read in the dimension of the table. the table will always
        // be a square, so we only read one dimension
        int n = in.nextInt();
        in.nextLine();

        // create a new Table object that is n x n
        Table t = new Table(n, n);

        // read n x n inputs and populate table accordingly. the table
        // will be populated by starting in the upper-left corner,
        // left to right in each row, down to the bottom-right corner.
        for(int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int num = in.nextInt();
                in.nextLine();
                t.set(r, c, num);
            }
        }

        // print the table so you can verify the values were inserted
        // correctly. YOU WILL NEED TO REMOVE THIS LINE OF CODE BEFORE
        // UPLOADING TO MIMIR. this is for testing purposes only.
        System.out.println(t.toString());

        // TODO: create a nested loop that iterates through all the rows
        // and columns of the table. inside the body of the loop, call
        // the neighborAverage method and print the result.
        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                System.out.println(t.neighborAverage(r, c));
            }
        }

    }
}