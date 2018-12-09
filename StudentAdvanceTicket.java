// ticket object type with an ID number and price
public class StudentAdvanceTicket extends AdvanceTicket
{
	private int daysPriorToEvent;
	private double price;
	//private String name = "Student";
	
	//constructs a ticket with ID number and
	//and price (to be calculated)
	//with record of date-of-purchase
	public StudentAdvanceTicket(int idNumber, int daysPriorToEvent)
	{
		super(idNumber, daysPriorToEvent);
		this.daysPriorToEvent = daysPriorToEvent;
	}
	@Override
	public double getPrice()
	{
	if (daysPriorToEvent <= 10) {
		price = 20;
		return price;
	}else {
		price = 15;
		return price;
	}

}
}

	
