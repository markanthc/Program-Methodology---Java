/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
/** When Block number reaches 0, stop building blocks */	
	private static final int STOP_BUILDING = 0;
	
	public void run() {
		// declare vars
		int numBricks = BRICKS_IN_BASE;
		int y = (getHeight() - BRICK_HEIGHT);
		
		while (true) {
			//add and center the row of bricks
			centerBricks(y, numBricks);
			//y = y - BRICK_HEIGHT (stacks row of bricks)
			y -= BRICK_HEIGHT; 
			numBricks--; //-1 bricks
			
			//stop building
			if (numBricks == STOP_BUILDING) break; 
		}
	}

	private void drawBrick (int x, int y) {
		//draw a brick
		GRect brick = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT );
		add(brick);
	}
	
	private void drawRowOfBricks (int x, int y, int numBricks) {
		//draw a row of bricks
		for (int i = 0; i < numBricks; i++) {
			drawBrick(x, y);
			x += BRICK_WIDTH;
		}	
	}
	
	private void centerBricks(int y, int numBricks) {
		//center bricks
		int x = (getWidth() / 2) - ((numBricks * BRICK_WIDTH) / 2);
		drawRowOfBricks(x, y, numBricks);		 
	}
	
} 

