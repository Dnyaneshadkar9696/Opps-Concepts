

class Employee{
	
	
	void empInfo() {
		String name = "Tarzan";
		double salary = 3544.90;
		System.out.println("Employee Informatioin");
		System.out.println("Name - "+ name);
		System.out.println("Salary -"+salary);
		System.out.println();
	}
	
	void working() {
		System.out.println("The employee is working");
	}
	
	void lunch() {
		System.out.println("The employee is having the lunch");
	}
	
	void notCame() {
		System.out.println("The employee not came to office");
	}
}


public class Emloyee01 {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empInfo();
	    emp.working();
	    emp.lunch();
	    emp.notCame();
		
	}

}
