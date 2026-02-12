package polymorphism.overridding;

public class Developer extends Employee {
	
	@Override
	public int salary() {
		int c = 70000;
		
		System.out.println("Developer salary is : "+ c);
		return c;
	}

}
