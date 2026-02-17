package abstractClass;
import java.util.Scanner;

public class Circle extends Shape{

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void area() {
		// logic for area of circle 
		
		double a = 3.14;
		System.out.print("Enter the radius of circle : ");
		int b = sc.nextInt();
		
		System.out.println("Area of circle is : " + (a * b * b));
		
		
      
		
	}
	
	
}
