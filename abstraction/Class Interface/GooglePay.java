package abstraction.interfDay2;

public class GooglePay implements PaymentApp{
	
	
	@Override
	public void pay() {
		System.out.println("Payment is done through GooglePay");
		
	}
	
	public void checkBalance() {
		System.out.println("Remaning balance in googlepay is 500 ");
	}

}
