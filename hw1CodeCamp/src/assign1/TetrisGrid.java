//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.
package assign1;

public class TetrisGrid {
	
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows(boolean[][] grid) {
		if (grid == null || grid.length ==0 || grid[0] == null || grid[0].length ==0)
			return;
		for (int i=0; i< grid.length; i++) {
			boolean fullRow = true;
			for (int j=0; j< grid[i].length; j++) {
				if (grid[i][j] == false)
					fullRow = false;
			}
			if (fullRow == true) {
				for (int j=0; j<grid[i].length; j++) {
					if (grid[i][j] == true)
						grid[i][j] = false; 
				}
			}
		}
		return;
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return null; // TODO YOUR CODE HERE
	}
}
