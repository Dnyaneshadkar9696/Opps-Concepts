package abstractClass;
import java.util.Scanner;

public class CurrentAccount extends Bankaccount{
	
	Scanner sm = new Scanner(System.in);
	
	@Override
	public void withdraw() {
		
		System.out.println("Enter the amount to withdraw: ");
		int g = sm.nextInt();
		System.out.println("Amount " + g + "Withdrawn Successfully.");
		
	}

}
