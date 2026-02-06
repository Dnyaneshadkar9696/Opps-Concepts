package inheritance.questions;

public class Ticket extends Railway{
	
	int prise = 20;
	String colour = "White";
	
	public void ticketInfo() {
		System.out.println("My ticket information :");
		System.out.println("Ticket prise :"+ prise);
		System.out.println("The colour of the ticket is : "+ colour);
		System.out.println("I buyed the ticket using google pay");
		
	}
	

}
