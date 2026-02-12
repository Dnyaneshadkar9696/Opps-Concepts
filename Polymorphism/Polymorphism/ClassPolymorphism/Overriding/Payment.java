package polymorphism.overridding;

public class Payment  extends Login{
	
	public void pay() {
		
		System.out.println("You can do the payment via Gpay or Credit card");
	}
	
	@Override
	public void password() {
		
		System.out.println("The password is verified ");
		System.out.println("You can enter in Paytm");
	}

}
