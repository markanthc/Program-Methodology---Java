/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.graphics.*;
import acm.program.*;

public class checkerboard extends GraphicsProgram {
	
	/** number of rows */
	private static final int NROWS = 8;
	
	/** number of columns */
	private static final int NCOLUMNS = 8;
	
	public void run() {
		
		// get square size
		int sqSize = getHeight() / NROWS;
		
		//initiate checker board building
		for (int i=0; i<NROWS; i++) { 
			for (int j=0; j<NCOLUMNS; j++) {
				
				//declare x and y 
				int x = j * sqSize;
				int y = i * sqSize;
				
				//create square 
				GRect sq = new GRect (x, y, sqSize, sqSize);
				// set filled color (default is black) for every odd piece calculated
				sq.setFilled(((i+j ) % 2) !=0);
				//add square
				add(sq);
				
			}
		}	
	}
}

