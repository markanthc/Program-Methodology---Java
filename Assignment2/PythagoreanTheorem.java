/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter values to compute Pythagorean theorem");
		
		//prompt for first value
		double a = readDouble("a:");
		//prompt for second value
		double b = readDouble("b:");
		//calculate
		double c = Math.sqrt((a*a)+(b*b));
		//display result
		println("c = " + c);
	}
}
