import java.util.Random;
public class makeGuesses {
	public static void main(String[] args) {
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
	}

}