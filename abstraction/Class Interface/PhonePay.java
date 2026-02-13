package abstraction.interfDay2;

public class PhonePay implements PaymentApp{
	
	@Override
	public void pay() {
		System.out.println("Payment is done through PhonePay");
		
	}
	
	public void checkBalance() {
		System.out.println("Remaning balance in phonepay is 600");
	}

}
