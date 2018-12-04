 
public class BankAcctCla 
{

	// class object = bank account
	
		// fields in BankAccount objects
		String name;
		private double startingBalance;
		private double balance;
		private double deposit;
		private double withDrawal;
		private double withDrawFee;
		
		// constructor to initialize new BankAccount with no activity
		public BankAcctCla(String name,double startingBalance,double deposit,double withDrawal, double withDrawFee)
		{
			this.name = name;
			this.startingBalance = startingBalance;
			this.balance = balance;
			this.deposit = deposit;
			this.withDrawal = withDrawal;
			this.withDrawFee = withDrawFee;
		}
			
		//{
			// pre-condition that name != null
			/*(String inputName) {
			if(inputName == null ) {
				throw new NullPointerException();
			}*/
			/*name = inputName;
			balance = 0.0
			withDrawFee = 0.0;
			withDrawal = 0.0;
			deposit = 0.0;)_
			//startingBalance = 0.0;*/
			//}
			
		// get & return & set code for all variables 
		
			/*public void setName(String name) 
			{
				this.name = name;
			} */
			public String getName() 
			{
				return name;
			}
			
			/*public void setBalance(double balance) 
			{
				this.balance = balance;
			} */
			public double getBalance() 
			{
				return balance;
			}
			
			
			
			/* public void setStartingbBalance(double startingBalance) 
			{
				this.startingBalance = startingBalance;
			} */
			public double getStartingBalance() 
			{
				return startingBalance;
			}
			
			/*public double getstartingBalance() {
				return startingBalance;
			}
			public void setstartiongBalance(double startingBalance) {
				this.startingBalance = startingBalance;
			} */
			
			/* public void setDeposit(double deposit) 
			{
					this.deposit = deposit;
			} */
			
			public double getDeposit() 
			{
				return deposit;
			}
			
			public void setWithDrawFee(double withDrawFee) 
			{
				this.withDrawFee = withDrawFee;
			} 
			
			public double getWithDrawFee() 
			{
				return withDrawFee;
			}
			
			/*public String getName() {
				return name;
			}
			public void setname(String inputName) {
				this.name = inputName; */
			
			
		
		// method for deposit adding to initial balance
		public double depositAction() 
		{
			balance = startingBalance;
			balance = balance + deposit;
			return balance;
		}
		/*public String toString() 
			{
			return name + ": " + balance;
			} */
		
		// method for withdrawal and debit of transactionfee
		public double withdrawAction() 
		{
			if (balance - withDrawal - withDrawFee < 0.0)
			{
				System.out.println("Insufficient funds for withdrawal amount");	
			}
			{
			balance = balance - withDrawal - withDrawFee;
			return balance;
			}
			
		/*public String toString()
			{
			return name + ": " + balance;
			} */				
		}		
}
