//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.
package assign1;

public class TetrisGrid {
	private boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		if (grid == null || grid.length ==0 || grid[0] == null || grid[0].length ==0)
			return;
		// loop over the bottom row
		boolean fullRow = true;
		for (int j =0; j<grid[grid.length-1].length ; j++) {
			if (grid[grid.length-1][j]== false) {
				fullRow = false;
			}
		}
		if (fullRow == false)
			return;
		for (int i= grid.length-1; i>0; i++) {
			for (int j =0; j< grid[i].length; j++) {
				grid[i][j] = grid[i-1][j];
			}
		}
		
		for (int j= 0; j<grid[0].length; j++) {
			grid[0][j] = false;
		}
		return;
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid; // TODO YOUR CODE HERE
	}
}
