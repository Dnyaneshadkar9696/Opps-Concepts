package abstraction.interfac;

public class Sbi implements Bank{
	
	
	@Override
	public void deposit() {
		System.out.println("Amount 500 deposited successfully in SBI account");
	}
	
	@Override
	public void withdraw() {
		System.out.println("Amount 200 withdrawn successfully from SBI account");
		
	}
	
	@Override
	public void checkBalance() {
		
		System.out.println("Remaning balance is 300 Rs");
	}

}
