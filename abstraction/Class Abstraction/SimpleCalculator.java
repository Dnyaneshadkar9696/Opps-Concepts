package abstraction.interfac;

public class SimpleCalculator implements Calculator {
	
	
	// we implemented the interface in the class
	
	@Override
	public void add() {
		int a = 8;
		int b = 93;
		System.out.println("Addition is : "+ (a+b));
	}
	
	@Override
	public void subtract() {
		int u = 83;
		int g = 33;
		System.out.println("Substraction is : "+ (u - g));
		
	}
	
	@Override
	public void multiply() {
		int x = 8;
		int s = 3;
		System.out.println("Multiplication is : "+ (x * s));
	}
	
	@Override
	public void divide() {
		
		int d = 45;
		int o = 5; 
		System.out.println("Division is : "+ (d/o));
	}

}
