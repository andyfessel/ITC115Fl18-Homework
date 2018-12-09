
public class TicketMain {

	public static void main(String[] args) {
		int daysPriorToEvent;
		
		Ticket T1 = new WalkupTicket(101);
		Ticket T2 = new AdvanceTicket(102,9);
		Ticket T3 = new StudentAdvanceTicket(105, 9);
		
		Ticket T4 = new WalkupTicket(107);
		Ticket T5 = new AdvanceTicket(103,11 );
		Ticket T6 = new StudentAdvanceTicket(106,11);
			

	 System.out.println(T1.toString());
	 System.out.println(T2.toString());
	 System.out.println(T3.toString());
	 System.out.println(T4.toString());
	 System.out.println(T5.toString());
	 System.out.println(T6.toString());
	 
	}	 
}
