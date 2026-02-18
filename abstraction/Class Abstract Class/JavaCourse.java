package abstractClass;
import java.util.Scanner;


public class JavaCourse extends Course{
	
	@Override
	public void calculateDuration() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of Course you enrolled for  : ");
		String a = sc.nextLine();
		System.out.println("Your course Duration for " + a +" is 6 months");
		
		
	}

}
