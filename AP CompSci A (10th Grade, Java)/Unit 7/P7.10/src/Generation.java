
/**
 * Generation class for the Game of Life
 */
public class Generation {
	private Cell[][] grid;
	
	/**
	 * Constructs a Generation object.
	 * @param inGrid a grid of cells
	 */
	public Generation(Cell[][] inGrid) {
		grid = inGrid;
		move();
	}
	
	/**
	 * This method updates the "next turn" alive status 
	 * for each Cell in the Grid based on the rules of the game of life.
	 */
	public void move() {
		for(int r = 0; r < grid.length; r++) {
			for(int c = 0; c < grid[r].length; c++) {
				if(numNbrs(grid[r][c]) == 3) {
					grid[r][c].setAliveNextTurn(true);
				}
				else if(numNbrs(grid[r][c]) == 2) {
					grid[r][c].setAliveNextTurn(grid[r][c].isAlive());
				}
				else
					grid[r][c].setAliveNextTurn(false);
			}
		}

	}//end move

	/**
	 * This method calculates the number of neighbors for a 
	 * given Cell. 
	 * @param inCell the cell to count the neighbors of
	 * @return the number of neighbors for the cell
	 */
	private int numNbrs(Cell inCell) {

		int count = 0;
		int r = inCell.getRow(); // row of cell to calculate the number of neighbors of
		int c = inCell.getCol(); // col of cell to calculate the number of neighbors of

		return count;
	}//end numNbrs

}//end Generation
