/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		//prompt for value
		int val = readInt("Enter a number: ");
		//set var to count num of steps
		int count = 0;
		//start process 
		while (val != 1) {
			count++; //add +1 to counter
			if (val % 2 == 0) { //if num is even
				int newVal = val/2;
				println (val + " is even, so I take half: " + newVal);
				val = newVal;
			}
			else { //if num is odd
				int newVal = 3*val+1;
				println (val + " is odd, so I make 3n+1: " + newVal);
				val = newVal;
			}
		}
		//finish with message displaying num of steps
		println ("The process took " +count+ " to reach 1");
	}
}

