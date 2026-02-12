package abstraction.interfac;

public class Circle implements Shape{
	
	@Override
	public void area(int r) {
		
		System.out.println("Area of the circle is : "+ (3.14 * r * r));
		
	}
	
	@Override
	public void perimeter() {
		int a = 8;
		
		System.out.println("Perimeter of circle is : "+ (2 * 3.14 * a));
		// a is the radius
	}

}
