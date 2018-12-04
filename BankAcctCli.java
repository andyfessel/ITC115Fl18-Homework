import java.util.Scanner;

// track BankAccount activity 
public class BankAcctCli {

	public static void main(String[] args) 
		{
		
		Scanner console = new Scanner(System.in);
		
		/*System.out.println("What is your name? ");
		String inputName = console.nextLine();
		System.out.println("Confirmation: your name is: " + inputName);
		System.out.println();
		
		System.out.println("What is your initial balance/deposit: $ ");
		double inputStartingBalance = console.nextDouble();
		System.out.println("Confirmation: your initial balance will be: $ " + inputStartingBalance);
		System.out.println();
		System.out.println("Welcome Bank ITC115 as a new customer!");
		System.out.println("Your account name is: " + inputName + " with initial balance of: $ " + inputStartingBalance);
		System.out.println();
		
		System.out.println("Are you interested in making a deposit?");
		System.out.println("Please reply: true (or) false: ");
		Boolean answer1 = console.nextBoolean();
		if (answer1 = true) 
			{
			System.out.println("How much would you like to deposit?: $ ");
			double inputDeposit = console.nextDouble();
			System.out.println("Confirmation - your deposit will be: $ " + inputDeposit);
			System.out.println();
			} 
		System.out.println("Are you interested in making a withdrawal?");
		System.out.println("Please reply: true (or) false: ");
		Boolean answer2 = console.nextBoolean();
		if (answer2 = true) 
			{
			System.out.println("How much would you like to withdraw?: $ ");
			double inputWithDrawal = console.nextDouble();
			System.out.println("Confirmation - your withdrawal will be: $ " + inputWithDrawal);
			System.out.println();
			System.out.println("Would you like to set a fee to accompany the withdrawl?");
			System.out.println("Please reply true (or) false: ");
			Boolean answer3 = console.nextBoolean();
			if (answer3 = true) 
				{
				System.out.println("W1hat amount (dollars.cents) is appropriate for a withdrawal fee? $ ");
				double inputWithDrawFee = console.nextDouble();
				System.out.println();
				System.out.println("Confirmation: you have specified a withdrawal fee of: $ " + inputWithDrawFee);
				System.out.println();
				}
			//console.close();
			}
			*/
		
	BankAcctCla firstCustomer = new BankAcctCla("Andy",  200,  50,  25,  3.5);
	
	System.out.println("Banking deposit transactions for customer " + firstCustomer.getName() + " results in a balance of: $ " 
			+ firstCustomer.depositAction());
	
	System.out.println("A withdrawal fee is already set to: " + firstCustomer.getWithDrawFee());
	
	System.out.println("What amount (dollars.cents) is appropriate for a withdrawal fee? $ ");
	double inputWithDrawFee = console.nextDouble();
	firstCustomer.setWithDrawFee(inputWithDrawFee);
	
	System.out.println("The withdrawal fee is now set to: " + firstCustomer.getWithDrawFee());
	
	System.out.println("Banking withdrawal transactions for customer " + firstCustomer.getName() + " results in a balance of: $ " 
			+ firstCustomer.withdrawAction());
	

// ----------------------------------------------------------------------------------------------------------	
		
			
		//BankAccountClass name1 = new BankAccountClass (name, deposit);
		
		/*BankAccountClass p1 = new BankAccountClass ("Tom", 12.00);
		System.out.println(p1.toString());
		p1.withdraw(1.25);
		System.out.println("after withdrawal");
		System.out.println(p1.toString());
		p1.setTransactionfee(0.25);
		
		System.out.println("Transaction fee is: " + p1.transactionFee);
		System.out.println(p1.toString());
		p1.withdraw(2.00);
		System.out.println(p1.toString());
		p1.wihdraw(8.50);
		System.out.println(p1.toString());
		
		p1.deposit(15.00);
		System.out.println(p1.toString());*/
		

	}

}
