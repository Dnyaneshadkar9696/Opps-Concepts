package abstractClass;
import java.util.Scanner;

public abstract class Bankaccount {
	
	Scanner sc = new Scanner(System.in);
	public abstract void  withdraw();
	
	public void deposit() {
		
		while(true) {
			System.out.println();
	        System.out.println("In which account you want to deposit:");

	        System.out.println("Press 1 for SavingsAccount");
	        System.out.println("Press 2 for CurrentAccount");
	        System.out.println("Press 3 to exit");

	        int b = sc.nextInt();

	        switch(b) {
	        
	        case 3:
	            System.out.println("Exiting deposit menu...");
	            return;   // stops the method completely

	        case 1:
	            System.out.print("Enter the amount to deposit: ");
	            int amount = sc.nextInt();
	            System.out.println("Successfully Deposited " + amount + " in Savings Account");
	            break;

	        case 2:
	            System.out.print("Enter the amount to deposit: ");
	            int amount2 = sc.nextInt();
	            System.out.println("Successfully Deposited " + amount2 + " in Current Account");
	            break;

	        

	        default:
	            System.out.println("Enter a valid integer value");
	        }
	    }
	     
		
		
		
		
		
		
		
		
	}
	
	

}
