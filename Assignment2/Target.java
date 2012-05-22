/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		//initial circle radius
		int size = 72;
		
		for (int i= 0; i<3; i++) {		
			//set midpoints
			int x = (getWidth() - size) / 2;
			int y = (getHeight() - size) / 2;
			
			//add circle
			drawOval(x, y, size);
			//decrease the radius of circle by 25
			size -= 25;
		}
	}
	
	private void drawOval(int x, int y, int size) {
		//create circle and set whether it will be red or white
		GOval circle = new GOval(x,y, size,size);
		if ((size % 2) ==0) { //if the size of the circle divides evenly (remainder of zero)
			//color the circle RED
			circle.setFillColor(Color.RED);
		} else { 
			//color the circle white
			circle.setFillColor(Color.WHITE);
		}
		circle.setFilled(true); //add color
		add(circle); // create circle
	}
	
}
