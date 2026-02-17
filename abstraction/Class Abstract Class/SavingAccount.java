package abstractClass;
import java.util.Scanner;

public class SavingAccount extends Bankaccount{
	
	Scanner ssd = new Scanner(System.in);

	@Override
	public void withdraw() {
		System.out.println("Withdraw Process : ");
		System.out.println("Enter the amount to withdraw: ");
		int j = ssd.nextInt();
		System.out.println("Amount " + j + " Withdrawn Successfully.");
		
		
		
	}
}
