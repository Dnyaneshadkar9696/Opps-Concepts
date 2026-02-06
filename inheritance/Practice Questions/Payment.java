package inheritance.questions;

public class Payment {

	public void paymentInfo() {

		int amount = 700;
		String type = "Google pay";

		System.out.println("Welcome to the payment World");
		System.out.println("Payment is done of " + amount + " to the meta headquaters");
		System.out.println("Payment is done through platform - " + type);

	}

}

class Upipayment extends Payment{
	
	public void payupoi() {
		
		System.out.println("This is upi payment");
		System.out.println("The upi id is Ganeshkumar@oksbi");
		
	}
}
