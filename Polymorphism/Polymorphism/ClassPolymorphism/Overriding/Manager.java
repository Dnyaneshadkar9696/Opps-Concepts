package polymorphism.overridding;

public class Manager extends Employee {
	
	@Override
	public int salary() {
		
		int b = 60000;
		System.out.println("Manager salary is :"+ b);
		return b;
	}

}
