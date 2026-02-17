package abstractClass;

public class FullTimeEmployee extends Employee{
	
	@Override
	public int calculateSalary(int a) {
		
		System.out.println("Salary for full time employee is : "+ a + " Rs");
	
		return 0;
	}

}
