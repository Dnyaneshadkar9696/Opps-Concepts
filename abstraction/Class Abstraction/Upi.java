package abstraction.interfac;

public class Upi implements Payment{
	
@Override
	
	public void pay(double amount) {
		
		System.out.println("Amount to pay through Upi is : "+ amount);
	}

}
