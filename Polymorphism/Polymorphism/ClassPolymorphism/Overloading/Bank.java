package polymorphism.overloading;

public class Bank {
	
	
	public int interestRate() {
		
		int d = 9;
		System.out.println("Overall the interest rate of the banks are : " + d + "%");
		return 0;
	}
	
	public void interestRate(int b) {
		
		int c = 7;
		System.out.println("Interest Rate for State Bank of India is : " + c + "%");
	}
	
	

}
