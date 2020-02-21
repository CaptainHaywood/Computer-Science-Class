import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Grid extends JFrame {
	//Constants
	public static final int GRID_ROWS = 40;
	public static final int GRID_COLS = 40;
	public static final int GRID_UPPER_X_OFFSET = 25;  
	public static final int GRID_UPPER_Y_OFFSET = 85;
	public static final int CELL_SIZE = 7;
	
	private static final int FRAME_WIDTH = 375;
	private static final int FRAME_HEIGHT = 500;
	private static int DELAY = 10; //milliseconds

	//Instance fields
	private StartButton startButton = new StartButton();
	private StepButton stepButton = new StepButton();
	private JMenuBar menuBar = new JMenuBar();
	private Cell[][] cells;
	private Timer t;
	private boolean didPaintInit = false;
	
	/**
	 * Constructs a grid object
	 */
	public Grid() {
		//Create a grid of dead cells
		cells = new Cell[GRID_ROWS][GRID_COLS];
		for(int r = 0; r < GRID_ROWS; r++ )
			for(int c = 0; c < GRID_COLS; c++)
				cells[r][c] = new Cell(r, c, false);

		//Init grid graphics
		init();
	}
	
	/**
	 * Updates a cell to be the opposite of its current alive status.
	 * @param p The point associated with the cell to update
	 */
	public void updateCell(Point p)	{
		int c = (int) Math.ceil((p.getX() - Grid.GRID_UPPER_X_OFFSET)/((double)Grid.CELL_SIZE+1)) - 1;
		int r = (int) Math.ceil((p.getY() - Grid.GRID_UPPER_Y_OFFSET)/((double)Grid.CELL_SIZE+1)) - 1;
		
		if(r>=0 && r <GRID_ROWS && c>=0 && c<GRID_COLS)
		{	
			cells[r][c].setAlive(!cells[r][c].isAlive());
			repaint();
		}
	}
	
	/**
	 * Initializes the cells on the board from the file f.
	 * @param f The file to initialize the board with.
	 */
	private void initBoardFromFile(File f)	{
		for(int r = 0; r < GRID_ROWS; r++ )
			for(int c = 0; c < GRID_COLS; c++)
				cells[r][c] = new Cell(r, c, false);
					
		try {
			Scanner in = new Scanner(new FileReader(f));
			while(in.hasNextLine())
			{
				String line = in.nextLine();
				int commaIndex = line.indexOf(',');
				int r = Integer.parseInt(line.substring(0, commaIndex));
				int c = Integer.parseInt(line.substring(commaIndex+1));
				cells[r][c] = new Cell(r, c, true);
			}		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		repaint();
	}
	
	/**
	 * Performs basic initialization for the grid graphics
	 */
	private void init()	{
		this.getContentPane().setLayout(null);
		this.setResizable(false);
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setTitle("Game of Life");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Add buttons
		this.add(startButton);
		startButton.setBounds(GRID_UPPER_X_OFFSET,375,72,36);
		startButton.setVisible(true);
		
		this.add(stepButton);
		stepButton.setBounds(GRID_UPPER_X_OFFSET + startButton.getWidth() + 5, 375,72,36);
		stepButton.setVisible(true);
		
		//Add menu items
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open...");
		fileMenu.add(openItem);
		this.menuBar.add(fileMenu);
		this.setJMenuBar(this.menuBar);
		
		//File Open
	    ActionListener fileOpener = new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	openFile();
	        }
	    };

		openItem.addActionListener(fileOpener);
				
		//Timer Event
	    ActionListener timerAction = new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
				Generation g = new Generation(cells);
				g.move();
	        	updateCellsToNextStatus();
	      	  	repaint();
	        }
	    };
	    
	    t = new Timer(DELAY, timerAction);
	    
	    //Clicking in the Grid
	    MouseListener mouseAction = new MouseListener() {

			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				updateCell(e.getPoint());
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}
	    };
	    
		this.addMouseListener(mouseAction);
	}
	
	  /**
	    * Use a JFileChooser in Open mode to select files
	    * to open. 
	   */
	  private boolean openFile ()  {
	      JFileChooser fc = new JFileChooser ();
	      fc.setDialogTitle ("Open File");

	      // Choose only files, not directories
	      fc.setFileSelectionMode ( JFileChooser.FILES_ONLY);

	      // Start in current directory
	      fc.setCurrentDirectory (new File ("."));

	      // Now open chooser
	      int result = fc.showOpenDialog (this);

	      if (result == JFileChooser.CANCEL_OPTION) {
	          return true;
	      } else if (result == JFileChooser.APPROVE_OPTION) {

	          File fFile = fc.getSelectedFile ();	  
	          initBoardFromFile(fFile);
	      }
        
	      return true;
	   } // openFile
	

	/**
	 * Paints the graphics.
	 */
	public void paint(Graphics g) {
		if(!didPaintInit) {
			paintComponents(g);
			didPaintInit = true;
		}

		startButton.repaint();
		stepButton.repaint();
		this.menuBar.repaint();

		this.drawGridLines(g);
		this.drawCells(g);
	}
	
	/**
	 * Draws the grid lines on the graphics.
	 * 
	 * @param g
	 *            The graphics to draw on.
	 */
	private void drawGridLines(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		for (int i = 0; i <= GRID_ROWS; i++) {
			g.drawLine(GRID_UPPER_X_OFFSET, GRID_UPPER_Y_OFFSET
					+ (i * (CELL_SIZE + 1)), GRID_UPPER_X_OFFSET + GRID_COLS
					* (CELL_SIZE + 1), GRID_UPPER_Y_OFFSET
					+ (i * (CELL_SIZE + 1)));
		}
		
		for (int i = 0; i <= GRID_COLS; i++) {
			g.drawLine(GRID_UPPER_X_OFFSET + (i * (CELL_SIZE + 1)),
					GRID_UPPER_Y_OFFSET, GRID_UPPER_X_OFFSET
							+ (i * (CELL_SIZE + 1)), GRID_UPPER_Y_OFFSET + GRID_ROWS
							* (CELL_SIZE + 1));
		}
	}
	
	/**
	 * Draws all the cells on the board
	 * @param g The graphics to draw on.
	 */
	private void drawCells(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		for(int r = 0; r < GRID_ROWS; r++ )
			for(int c = 0; c < GRID_COLS; c++)
				cells[r][c].draw(g);				
	}
	
	/**
	 * Repaints the grid.
	 */
	private void painter()	{
		repaint();
	}
	
	/**
	 * Updates the status on all the cells to their next alive status.
	 */
	private void updateCellsToNextStatus() 	{
		for(int r = 0; r < GRID_ROWS; r++ )
			for(int c = 0; c < GRID_COLS; c++)
				cells[r][c].updateAlive();	
	}
	
	/**
	 * Inner StartButton Class
	 * @author administrator
	 */
	class StartButton extends JButton implements ActionListener {
		StartButton() {
			super("Start");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent arg0) {
			if (this.getText().equals("Start")) {
				setText("Stop");
			    t.start();		  
			} else {
				setText("Start");
			    t.stop();
			}
		}		
	}
	
	/**
	 * Inner StepButton Class
	 * @author administrator
	 */
	class StepButton extends JButton implements ActionListener {
		StepButton() {
			super("Step");
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent arg0) {			
			Generation g = new Generation(cells);
			g.move();
			updateCellsToNextStatus();
			painter();
		}		
	}
	   
}
