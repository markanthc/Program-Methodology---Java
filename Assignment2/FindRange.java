/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	/** value that will terminate app */
	private static final int SENTINAL = 0;
	
	public void run() {
		println("This program finds the largest and smallest numbers.");
		findRange(); //initiate method
	}
	
	private void findRange() {
		//prompt for first value
		int firstVal = readInt("?");
		//declare vars 
		int highNumber = firstVal;
		int lowNumber = firstVal;
		//check to see if first value entered = SENTINAL
		if (firstVal == SENTINAL) {
			println("A zero as the first number is not accepted."); //terminate app
		} else { 
			//run if first value != SENTINAL
			while (true) {
				//prompt for value
				int val = readInt("?");
				// determine whether this is the highest, lowest, or null number
				if (val > highNumber) {
					highNumber = val;
				} else if (val < lowNumber) {
					lowNumber = val;
				}
				if (val == SENTINAL) break; //kill loop if user enters SENTINAL 
			}
			//print the values after loop is killed
			println("smallest: " + lowNumber);
			println("largest: " + highNumber);
		}
	}
}

