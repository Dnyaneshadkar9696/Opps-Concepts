package abstraction.interfac;

public class Rectangle implements Shape {
	
	@Override
	public void area(int r) {
		int l = 34;
		// r is breadth here 
		System.out.println("Area of the Rectangle is : "+ (l * r));
		
	}
	
	@Override
	public void perimeter() {
		int b = 8;
		int l = 3;
		
		System.out.println("Perimeter of Rectangle is : "+ (2 * l * b));
		// a is the radius
	}
	
	

}
