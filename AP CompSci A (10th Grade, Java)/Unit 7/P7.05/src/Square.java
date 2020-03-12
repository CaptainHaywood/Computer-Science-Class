import java.util.Arrays;
import java.util.Comparator;

public class Square {
    private int[][] square;
    private int size;

    /**
     Construct a Square object.
     @param inSize the dimension of the square
     */
    public Square(int inSize) {
        size = inSize;
        square = new int[size][size];

}
    /**
     Add the number to the square at [row][col]
     @param row the row to add the number to
     @param col the col to add the number to
     @param num the number to add
     */
    public void set(int row, int col, int num)	{
        square[row][col] = num;
    }

    /**
     Return the sum of the values in row "r"
     @param r the row to calculate the sum of
     @return the sum of the row
     */
    public int rowSum(int r) {
        int length = square.length;
        int iteration = 0;
        int sum = 0;
        while(iteration < length){
            sum = sum + square[r][iteration];
            iteration++;
        }
        return sum;
    }

    /**
     Return the sum of the values in column "c"
     @param c the col to calculate the sum of
     @return the sum of the column
     */
    public int columnSum(int c)	{
        int length = square.length;
        int iteration = 0;
        int sum = 0;
        while(iteration < length){
            sum = sum + square[iteration][c];
            iteration++;
        }
        return sum;
    }

    /**
     Return the sum of the diagonal upper-left to bottom-right
     @return sum the sum of upper-left to bottom-right
     */
    public int diagonal_UL_BR()	{
        int length = square.length;
        int iteration = 0;
        int sum = 0;
        while(iteration < length){
            try{
                sum = sum + square[iteration][iteration];
            }
            catch (Exception e) {
                //TUFF NUGGETS I AIN'T DOING SHIT TO FIX IT
            }
            //System.out.println(sum);
            iteration++;
        }
        return sum;
    }

    /**
     Return the sum of the diagonal upper-right to bottom-left
     @return sum the sum of upper-left to bottom-right
     */
    public int diagonal_UR_BL()	{
        int length = square.length;
        int iteration = 0;
        int sum = 0;
        while(iteration != length){
            try{
                sum = sum + square[length - iteration - 1][iteration];
            }
            catch (Exception e) {
                //TUFF NUGGETS I AIN'T DOING SHIT TO FIX IT
            }
            //System.out.println(sum);
            iteration++;
        }
        return sum;
    }

    /**
     Return true if the numbers in the square are 1..N*N, false otherwise
     @return true if the numbers in the square are 1..N*N, false otherwise
     */
    public boolean validNumbers() {
        int targetNum = 1;
        int numOccur = 0;
        int xIter = 0;
        int yIter = 0;
        int size = square.length;

        while(targetNum != size * size + 1){

            while(yIter != size){

                while(xIter != size){
                    int item = square[xIter][yIter];
                    if (item == targetNum){
                        numOccur++;
                    }
                    xIter++;
                }
                xIter = 0;
                yIter++;

            }

            if(numOccur != 1){
                return false;
            }
            else {
                targetNum++;
                xIter = 0;
                yIter = 0;
                numOccur = 0;
            }

        }
        return true;
    }

    /**
     Return true if the square is magic, false otherwise
     @return true if the square is magic, false otherwise
     */
    public boolean isMagic() {
        int targetSum = rowSum(0); // arbitrarily select a targetSum
        // check rows -- if any row does not match targetSum, return false
        for(int r = 0; r < size; r++) {
            if(rowSum(r) != targetSum){
                //System.out.println("Row" + r) ;
                //System.out.println(rowSum(r));
                return false;
            }
        }

        for(int r = 0; r < size; r++) {
            if (columnSum(r) != targetSum){
                //System.out.println("Col" + r);
                //System.out.println(columnSum(r));
                return false;
            }
        }

        if (diagonal_UL_BR() != targetSum) {
            //System.out.println("ULBR");
            //System.out.println(diagonal_UL_BR());
            return false;
        }

        if (diagonal_UR_BL() != targetSum) {
            //System.out.println("URBL");
            //System.out.println(diagonal_UR_BL());
            return false;
        }

        if(!validNumbers()){
            int X = 0;
            int Y = 0;
            int size = square.length;
            int squareSize = square.length * square.length;
            int iterOut = 0;
            int iterIn = 0;// X, Y
            int iterEncase = 0;
            int occurences = 0;
            int lookingFor = 1;

            while(iterEncase < squareSize){
                while(iterOut < size){
                    while(iterIn < size){
                        if(square[X][Y] == lookingFor){
                            occurences++;
                        }
                        X++;
                        iterIn++;
                    }
                    Y++;
                    iterIn = 0;
                    iterOut++;
                }
                if(occurences != 1){
                    return false;
                }
                iterEncase++;
                lookingFor++;
            }

            return true;

        }

        // if validNumbers() is false, then return false
        // . . .

        // if we get here, there were no issues above,
        // which means the square IS magic and we should return true
        return true;
    }

    /**
     * Return a string representation of the square
     * @return a string representation of the square
     */
    public String toString(int[][] sq) {
        String toReturn = "";

        for(int r = 0; r < size; r++) {
            for(int c = 0; c < size; c++) {
                toReturn += String.format("%5s", sq[r][c]); // format value as 5-length string and add to toReturn
            }

            toReturn += "\n"; // add next line character
        }

        return toReturn;
    }
}