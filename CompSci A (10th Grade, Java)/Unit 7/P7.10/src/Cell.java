import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Cell {
	//Instance fields
	private int myCol; 
	private int myRow;		
	private boolean myAlive;	
	private boolean myAliveNextTurn;	
	private Color myColor;		
	private static final Color DEFAULT_ALIVE = Color.ORANGE;
	private static final Color DEFAULT_DEAD = Color.GRAY;
	
	/**
	 * Constructs a new cell.
	 */
	public Cell() {
		myAlive = false;
		myColor = Color.GRAY;
	}
	
	/**
	 * Contructs a new cell at an x, y, and alive status.
	 * @param r The row of the new cell.
	 * @param c The column of the new cell.
	 * @param alive Indicates if this cell is alive or not.
	 */
	public Cell(int r, int c, boolean alive) {
		myAlive = alive;
		myRow = r;
		myCol = c;  

		if(myAlive)
			myColor = DEFAULT_ALIVE;
		else
			myColor = DEFAULT_DEAD;
	}
	
	/**
	 * Returns true if this cell is alive
	 * @return True if this cell is alive, false otherwise
	 */
	public boolean isAlive() {
		return myAlive; 
	}
	
	/**
	 * Returns the col of this cell
	 * @return The col of this cell
	 */
	public int getCol() {
		return myCol; 
	}
	
	/**
	 * Returns the row of this cell
	 * @return The row of this cell
	 */
	public int getRow() {
		return myRow; 
	}
	
	/**
	 * Updates the alive status to the "next"
	 * turn alive status.
	 */
	public void updateAlive() {
		setAlive(this.myAliveNextTurn);
	}
	
	/**
	 * Sets the alive status.
	 * @param alive The alive status to set this cell.
	 */
	public void setAlive (boolean alive) {
		if (alive) {
			myColor = DEFAULT_ALIVE;
			myAlive = alive;
			
		} else {
			myColor = DEFAULT_DEAD;
			myAlive = alive;
		}
	}
	
	/**
	 * Sets the alive next turn status.
	 * @param alive
	 */
	public void setAliveNextTurn (boolean alive) {
		myAliveNextTurn = alive;
	}

	/**
	 * Draws the cell on graphics g
	 * @param g The graphics to draw upon
	 */
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		int xleft = Grid.GRID_UPPER_X_OFFSET + 1 + (myCol*(Grid.CELL_SIZE+1));
		int xright = Grid.GRID_UPPER_X_OFFSET + Grid.CELL_SIZE + (myCol*(Grid.CELL_SIZE+1));
		int ytop = Grid.GRID_UPPER_Y_OFFSET + 1 + (myRow*(Grid.CELL_SIZE+1));
		int ybottom = Grid.GRID_UPPER_Y_OFFSET + Grid.CELL_SIZE + (myRow*(Grid.CELL_SIZE+1));
		g.setColor(myColor);
		g.fillRect(xleft, ytop, Grid.CELL_SIZE, Grid.CELL_SIZE);
	}

}

