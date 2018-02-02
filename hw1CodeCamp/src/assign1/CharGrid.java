// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

package assign1;


public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		if (grid == null || grid.length == 0 || grid[0]== null || grid[0].length == 0)
			return 0;
		int m = grid.length, n = grid[0].length;
		int min_row = Integer.MAX_VALUE, max_row = Integer.MIN_VALUE;
		int min_col = Integer.MAX_VALUE, max_col = Integer.MIN_VALUE;
		for (int i=0 ; i<m; i++) {
			for (int j =0; j<n ; j++) {
				if (grid[i][j] == ch) {
					min_row = Math.min(min_row, i);
					max_row = Math.max(max_row, i);
					min_col = Math.min(min_col, j);
					max_col = Math.max(max_col, j);
				}
			}
		}
		if (min_row == Integer.MAX_VALUE || max_row == Integer.MIN_VALUE || min_col == Integer.MAX_VALUE || max_col == Integer.MIN_VALUE) 
			return 0
		return (max_row - min_row)*(max_col - min_col); // TODO ADD YOUR CODE HERE
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		return 0; // TODO ADD YOUR CODE HERE
	}
	
}