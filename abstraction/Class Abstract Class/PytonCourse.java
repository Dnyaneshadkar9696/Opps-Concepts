package abstractClass;

import java.util.Scanner;

public class PytonCourse extends Course {

	@Override
	public void calculateDuration() {
		Scanner sd = new Scanner(System.in);

		System.out.println("Enter the name of Course you enrolled for  : ");
		String b = sd.nextLine();
		System.out.println("Your course Duration for " + b + " is 6 months");

	}
}
