
public class AdvanceTicket extends Ticket
{
	private int daysPriorToEvent;
	private double price;
	//private String name = "Advance";
	
	//constructs a ticket with ID number and
	//and price (to be calculated)
	//with record of date-of-purchase
	public AdvanceTicket(int idNumber, int daysPriorToEvent)
	{
		super(idNumber);
		this.daysPriorToEvent = daysPriorToEvent;		
	}
	@Override
	public double getPrice()
	{
	if (daysPriorToEvent <= 10) {
		price = 40.00;
		return price;
	}else {
		price = 30.00;
		return price;
	}
		
}	
}
