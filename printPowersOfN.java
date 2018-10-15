
public class printPowersOfN {

	public static void main(String[] args) {
		// print out the powers of base numbers a set number of times
		
		 printPowersOfN( 4, 3);
		 System.out.println();
		 printPowersOfN( 5, 6);
		 System.out.println();
		 printPowersOfN( -2, 8);
				
	}	
		
		public static void printPowersOfN(int b, int p) {
		
			for (int  i = 0; i <= p; i++) {
			
			System.out.print((int)Math.pow(b, i) + "  ");	
			}

	}	

}
