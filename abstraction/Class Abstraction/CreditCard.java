package abstraction.interfac;

public class CreditCard implements Payment{
	
	@Override
	
	public void pay(double amount) {
		
		System.out.println("Amount to pay through Credit card is : "+ amount);
	}

}
