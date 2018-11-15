import java.util.Arrays;

public class isSorted 
{ //class open
	public static void main(String[] args) 
	{ // main open
		// Initialize 2 arrays and input values
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		
		{ // open if loop for list of 1 value
			System.out.println("List of 1 value is considered sorted");
		} // close if loop
		
		// Call array list1 into the program
		// Check to make sure that this line was read
		System.out.println("DEBUG: sorting attempt for list1 :");
		isSorted(list1);
		System.out.println();
		
		// Call array list2 into the program
		// Check to make sure that this line was read
		System.out.println("DEBUG: sorting attempt for list2 :");
		isSorted(list2);
		System.out.println();
		} // close main
		
		//write the method "isSorted" that accepts the 2 arrays above
		public static void isSorted(double[] list)
		{ // open isSorted method
			
			// Establish boolean variable for output/return
			boolean isThisSorted = true;
			
			// Write language to traverse the list
			for (int i = 0; i < list.length; i++)
			{ // open for loop 1 
				
				// Establish the variable of the next number for comparison
				for (int j = i + 1; j < list.length; j++)
				{ // open for loop 2
					
					// Apply the comparison - one array value compared to next
					if (list[i] >= list[j])
					{ // open if loop
						// If test above fails - issue false
						isThisSorted = false;
						
					} // close if loop		
				} // close for loop 2	
			}  // close for loop
			
			// Return/print output on sorting check
			System.out.println("Confirm: The arrary is sorted? " + isThisSorted);
			
		} // close isSorted method
} // close class
		
