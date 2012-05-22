/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	/** Box width */
	private static final int BOXWIDTH = 150;
	
	/** Box height */
	private static final int BOXHEIGHT = 40;
	
	/** Vertical spacing */
	public static final int VERTSPACE = 80;
	
	/** Horizontal spacing */
	public static final int HORSPACE = 40;
	
	public void run() {
		//initiate vars
		double x = getWidth()  / 2;
		double y = getHeight() / 2;  
		
		//add the Program box
		hierarchyBox(x - BOXWIDTH / 2,y - (2 * BOXHEIGHT + VERTSPACE) /2, "Program");
		
		//add GraphicsProgram box
		hierarchyBox((x - BOXWIDTH / 2) - (BOXWIDTH + HORSPACE) ,(y - (2 * BOXHEIGHT + VERTSPACE) /2) + (BOXHEIGHT + (VERTSPACE /2)), "GraphicsProgram");
		//create connect lines for GraphicsProgram box
		connectLines(((x - BOXWIDTH / 2) - ((BOXWIDTH /2) + HORSPACE)), (y + (VERTSPACE/2)) - BOXHEIGHT);
		
		//add ConsoleProgram box
		hierarchyBox(x - BOXWIDTH / 2 ,(y - (2 * BOXHEIGHT + VERTSPACE) /2) + (BOXHEIGHT + (VERTSPACE /2)), "ConsoleProgram");
		//create connect lines for ConsoleProgram box
		connectLines((x - BOXWIDTH / 2) + (BOXWIDTH /2), (y + (VERTSPACE/2)) - BOXHEIGHT);
		
		//add DialogProgram box
		hierarchyBox((x - BOXWIDTH / 2) + (BOXWIDTH + HORSPACE) ,(y - (2 * BOXHEIGHT + VERTSPACE) /2) + (BOXHEIGHT + (VERTSPACE /2)), "DialogProgram");
		//add connect lines DialogProgram box
		connectLines(((x - BOXWIDTH / 2) + (BOXWIDTH + HORSPACE) + (BOXWIDTH /2)), (y + (VERTSPACE/2)) - BOXHEIGHT);
	}
	
	private void hierarchyBox(double x, double y, String labelText) {
		//create the box
		GRect theBox = new GRect (x,y, BOXWIDTH,BOXHEIGHT);
		add(theBox);
		//create label
		GLabel theLabel = new GLabel(labelText);
		double labelWidth = theLabel.getWidth();
		double labelHeight = theLabel.getAscent();
		theLabel.setLocation(x + (BOXWIDTH - labelWidth) /2 ,( y + (BOXHEIGHT - labelHeight) /2) + labelHeight);
		add(theLabel);
	}
	
	private void connectLines (double x2, double y2) {
		//create lines to connect the other boxes to the Program box 
		int x1 = getWidth() / 2;
		int y1 = (getHeight() - VERTSPACE) / 2;
		GLine theLine = new GLine(x1,y1, x2,y2);
		add(theLine);
	}
}

