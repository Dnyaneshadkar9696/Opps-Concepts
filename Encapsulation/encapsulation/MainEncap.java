package encapsulation;

public class MainEncap {
	
	public static void main(String[] args) {
		
		System.out.println("Person Details ");
		
		Person p = new Person();
		p.setpersonName("Rahul");
		p.setpersonAge(34);
		
		System.out.println("Person Name : "+p.getpersonName());
		System.out.println("Persone Age : "+p.getpersonAge());
		
		System.out.println();
		System.out.println("----------------------");
		
		System.out.println("Bank Details");
		
		BankAccount bk = new BankAccount();
		bk.setBalance(50000.0);  // the actual balance.
		System.out.println("Balance is : "+ bk.getBalance());
		bk.setAdd(56);  // using set we can only set amount.
		System.out.println("Amount added : " + bk.getAdd());
		
		bk.setWithdraw(1200);
		System.out.println("Amount withdrawn remaning balance : "+ bk.getWithdraw());
	}

}
