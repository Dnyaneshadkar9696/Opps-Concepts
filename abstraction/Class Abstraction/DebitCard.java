package abstraction.interfac;

public class DebitCard implements Payment{

	
@Override
	
	public void pay(double amount) {
		
		System.out.println("Amount to pay through Debit card is : "+ amount);
	}
}
