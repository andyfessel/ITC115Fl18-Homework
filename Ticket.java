
public abstract class Ticket {

	private int idNumber;
	private double price = 0.0;
	
	//constructs a new ticket with id number
	//and price (w/get only - use "abstract")
	public Ticket(int idNumber) 
	{
		this.idNumber = idNumber;
		
	}
	//returns the id of the ticket object
	public int getIdNumber() {
		return idNumber;
	}
	
	//returns the price of the ticket object
	public abstract double getPrice(); 
		
	
	public String toString() 
	{
		return ("Ticket ID number is: " + idNumber + " with Price of: " + getPrice());
	}
	

}