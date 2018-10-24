import java.util.Scanner;
public class Hmwk4 {
	public static void main(String[] args) {
		// read date input and assign/report out season of year		
		Scanner console = new Scanner(System.in);	
		System.out.println("Input 2 digit month:  ");
		int m = console.nextInt();	
		System.out.println("Input 2 digit day:  ");
		int d = console.nextInt();		
		//if (m == 3 || m == 6 || m == 9 || m == 12 && d > 15 ){
			//m ++;
			//if (m == 13) {
				//m = 1;
			//}else; 						
			//if (m == 1 || m == 2 || m == 3 || m == 13) { 
				//System.out.println("Winter");
			if (m <= 1) {
					System.out.println("Winter");
			} else if (m == 2) {
				System.out.println("Winter");		
			} else if (m == 3 && d <= 15) {
				System.out.println("Winter");
			} else if (m == 3 && d <=31) {
				System.out.println("Spring");
			} else if (m <= 4) {
			//}	else if (m ==  4|| m == 5 || m == 6) {
				//System.out.println("Spring");
			} else if (m <= 5) {
				System.out.println("Spring");
			} else if (m == 6 && d <= 15) {
				System.out.println("Spring");
			} else if (m == 6 && d <= 31) {
				System.out.println("Summer");
			} else if (m <= 7) {
			//} 	else if (m == 7 || m == 8 || m == 9) {
				//System.out.println("Summer");
			} else if (m <= 8) {
				System.out.println("Summer");
			} else if (m == 9 && d <= 15) {
				System.out.println("Summer");
			} else if (m == 9 && d <= 31) {
				System.out.println("Fall");
			} else if (m <= 10) {
			//} 	else //if (m == 10 || m == 11 || m == 12) 
				System.out.println("Fall");
			} else if (m <= 11) {
				System.out.println("Fall");
			} else if (m == 12 && d <= 15) {
				System.out.println("Fall");
			} else {
					System.out.println("Winter");
			}
	}
}
	
