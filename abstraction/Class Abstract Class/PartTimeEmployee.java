package abstractClass;

public class PartTimeEmployee extends Employee {
	
	@Override
	public int calculateSalary(int a) {
		System.out.println("Salary for part time employee is : "+ a + " Rs");
		return 0;
	}

}
