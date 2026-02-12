package abstraction.interfac;

public class Hdfc implements Bank{
	
	@Override
	public void deposit() {
		System.out.println("Amount 1000 deposited successfully in HDFC account");
	}
	
	@Override
	public void withdraw() {
		System.out.println("Amount 400 withdrawn successfully from HDFC account");
		
	}
	
	@Override
	public void checkBalance() {
		
		System.out.println("Remaning balance is 600 Rs");
	}

}
