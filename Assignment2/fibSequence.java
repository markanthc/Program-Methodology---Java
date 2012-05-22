/*
 * File: FibSequence.java
 */

import acm.program.*;


public class fibSequence extends ConsoleProgram {
	
	/** Max num value for the result */
	private static final int MAX_RESULT_VALUE = 10000;
	
	/** Set initial value */
	private static final int INITIAL_RESULT_VALUE = 0;
	
	public void run() {
		println("The program lists the Fibonacci sequence.");
		//declare vars
		int result = 0;
		int prevPrevNum = 0;
		int prevNum = 1;
		//display first result
		println(INITIAL_RESULT_VALUE);
		
		while (true) { //loop and a half
			//re-declare vars to new values
			prevPrevNum = prevNum;
			prevNum = result;
			//get result
			result = prevPrevNum + prevNum;
			//is result more than max result value?
			if (result > MAX_RESULT_VALUE) break;
			//display result
			println(result);
		}
		
	}
}
