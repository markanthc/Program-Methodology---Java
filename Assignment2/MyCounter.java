/** Counter class to be used with other projects*/

public class MyCounter {
	
	//set counter if a start value is specified
	public MyCounter(int startValue) {
		counter = startValue;
	}
	
	//set counter to 1 if no start value is specified 
	public MyCounter() {
		counter = 1;
	}
	
	//count +1 and return value
	public int nextValue() {
		int temp = counter;
		counter++;	
		return temp;	
	}
	
	//declare instance var
	private int counter;
}
