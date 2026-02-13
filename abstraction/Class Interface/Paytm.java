package abstraction.interfDay2;

public class Paytm implements PaymentApp{
	
	@Override
	public void pay() {
	
		System.out.println("Payment is done through Paytm");
		
	}
	
	public void checkBalance() {
		System.out.println("Remaning balance in paytm  is 800");
	}

}
