import java.util.Random;
public class Hmwk5 {
	public static void main(String [] args) {
		makeGuesses();
	}//end of main
	public static void makeGuesses() {
	// random guesses 1-50 until # 48 or higher reached
		Random rand = new Random();
		int count = 0;
		int gu;
		
		do {
		gu = rand.nextInt(49) + 1;;
		System.out.println("guess = " + gu);
		count++;	
		}
		while (gu <= 48);
		System.out.println("total guesses = " + count);
	} //end of makeaGuess
} //end of class