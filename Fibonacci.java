package Fibonacci;

// assignment: Assignment: 
//4th Ed of textbook,  p. 128 ex. 3 
//Use a for loop to compute and print out the first 12 Fibonacci numbers.

public class Fibonacci {

	public static void main(String[] args) {
	
		//declare variables
		int count = 0;
		int fibtotal = 0;
		int newvalue = 1;
		int oldvalue = 0;
		
		//run Fibonacci sequence
		for (count = 1; count <= 12; count++) {
			System.out.println("Fibonacci Count = " + count + " Fibonacci Total = " + fibtotal);
			fibtotal = oldvalue + newvalue;
			oldvalue = newvalue;
			newvalue = fibtotal;
			
			
		}
		
	 }

}
