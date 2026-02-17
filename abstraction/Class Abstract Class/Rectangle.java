package abstractClass;
import java.util.Scanner;

public class Rectangle extends Shape {
	
	Scanner ss = new Scanner(System.in);

	@Override
	public void area() {
		
		System.out.print("Enter the length of Rectangle : ");
		int a = ss.nextInt();
		System.out.print("Enter the breadth of the Rectangle : ");
		int v = ss.nextInt();
		
		System.out.println("Area of the Rectangle is : " + (a * v));
		
		

		
	}
}
