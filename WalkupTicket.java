
public class WalkupTicket extends Ticket
{
private int daysPriorToEvent;
private double price = 50.00;
private String name = "Walkup";
	
	
	public WalkupTicket(int idNumber)
	{
		super(idNumber);	
	}
	//@Override
	public double getPrice()
	{
		return price;
		
	}
	@Override
	public String toString() {
		return (name  +  super.toString());
}	
}
		

