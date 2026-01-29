package encapsulation;


public class BankAccount {
	
	private double balance;
	private double add;
	private double withdraw;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	// lets create methods for adding balance and 
	// withdraw the amount 
	
     public double getAdd() {
    	 add = balance + add;
		return add;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public double getWithdraw() {
		withdraw = balance - withdraw;
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	


}


