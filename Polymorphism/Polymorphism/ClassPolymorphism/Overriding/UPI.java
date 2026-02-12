package polymorphism.overridding;

public class UPI extends Payment {
	
	@Override
	public void pay() {
		
		System.out.println("The payment is done via UPI");
	}

}
