/**
 * Created by rritz on 12/6/2016.
 */
public class Table {
    private int[][] values;
    private int size;

    /**
     * Constructs a new Table object that is rows x columns in size
     * @param rows the number of rows
     * @param columns the number of columns
     */
    public Table(int rows, int columns) {
        values = new int[rows][columns];
        size = rows;
    }

    /**
     * Sets a cell of the table
     * @param row the row of the cell to set
     * @param col the column of the cell to set
     * @param n the value to place in the cell
     */
    public void set(int row, int col, int n) {
        values[row][col] = n;
    }

    /**
     * Returns true if the row and col are valid for this table
     * @param row the row to check
     * @param col the col to check
     * @return true if the row and col are valid for this table
     */
    public boolean isValidCell(int row, int col) {
        if(row >= 0 && row < size && col >=0 && col < size)
            return true;

        return false;
    }

    /**
     * Returns the neighbor average of the cell at row, col
     * @param row the row of the neighbor average to return
     * @param col the col of the neighbor average to return
     * @return the neighbor average of the cell at row, col
     */
    public double neighborAverage(int row, int col) {
        double total = 0;
        double count = 0;

        // check northwest neighbor for [row][col], which is at [row-1][col-1]
        if(isValidCell(row-1, col-1)) {
            total = total + values[row-1][col-1];
            count++;
        }

        //north
        if(isValidCell(row-1, col)) {
            total = total + values[row-1][col];
            count++;
        }

        //NE
        if(isValidCell(row-1, col+1)) {
            total = total + values[row-1][col+1];
            count++;
        }

        //W

        if(isValidCell(row, col-1)) {
            total = total + values[row][col-1];
            count++;
        }

        //E

        if(isValidCell(row, col+1)) {
            total = total + values[row][col+1];
            count++;
        }

        //SW

        if(isValidCell(row+1, col+1)) {
            total = total + values[row+1][col+1];
            count++;
        }

        //S

        if(isValidCell(row-1, col)) {
            total = total + values[row-1][col];
            count++;
        }

        //SE

        if(isValidCell(row+1, col-1)) {
            total = total + values[row+1][col-1];
            count++;
        }

        // TODO: check other neighbors:
        // . . .


        // calculate the average rounded to the nearest hundredth
        double avg = total / count;
        avg = avg * 100;
        avg = Math.round(avg);
        avg = avg / 100;

        // return the average
        return avg;
    }

    /**
     * Return a string representation of the table
     * @return a string representation of the table
     */
    public String toString() {
        String toReturn = "";

        for(int r = 0; r < values.length; r++) {
            for(int c = 0; c < values[0].length; c++) {
                toReturn += String.format("%5s", values[r][c]); // format value as 5-length string and add to toReturn
            }

            toReturn += "\n"; // add next line character
        }

        return toReturn;
    }
}