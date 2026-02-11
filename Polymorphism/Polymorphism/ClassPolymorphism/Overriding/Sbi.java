package polymorphism.overridding;

public class Sbi extends Bank {
	
	@Override
	public void interestRates() {
		
		System.out.println("The interest rate of sbi is 8%");
		
	}
}
