package inheritance.types;

public class SavingAccount extends Bank {
	
	public void savingAccInfo()
	{
		String a = "Ramesh Kumar";
		long accNo = 23423453453l;
		double balance = 5433243.234;
		System.out.println("Name : "+ a);
		System.out.println("Account Number :  "+ accNo);
		System.out.println("Balance : "+ balance);
		
	}
}
