package polymorphism.overridding;

public class CreditCard extends Payment {
	
	@Override
	public void pay() {
		
		System.out.println("The payment is done via CreditCard");
	}

}
