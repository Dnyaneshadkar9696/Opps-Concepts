class EmployeeInfo{
	
	int empId;
	String empName;
	String empAddress;
	double empSalary;
	int empAge;
	
	void displayEmpId() {
		System.out.println("Employee ID: "+empId);
	}
	
	void displayEmpName() {
		System.out.println("Employee Name: "+empName);
	}
	
	void displayEmpAddress() {
		System.out.println("Employee Address: "+empAddress);
	}
	
	void displayEmpSalary() {
		System.out.println("Employee Salary: "+empSalary);
	}
	
	void displayEmpAge() {
		System.out.println("Employee Age: "+empAge);
	}
	
	
}
public class Employee02 {
        public static void main(String[] args) {
        	
        	EmployeeInfo emp1 = new EmployeeInfo();
        	emp1.empId = 2001;
        	emp1.empName = "Gaurav";
        	emp1.empAddress = "New York";
        	emp1.empSalary = 75000.50;
        	emp1.empAge = 30;
        	
        	emp1.displayEmpId();
        	emp1.displayEmpName();
        	emp1.displayEmpAddress();
        	emp1.displayEmpSalary();
        	emp1.displayEmpAge();
        	
        	System.out.println();
        	EmployeeInfo emp2 = new EmployeeInfo();
        	emp2.empId = 2002;
        	emp2.empName = "Shrikant";
        	emp2.empAddress = "Los Angeles";
        	emp2.empSalary = 68000.75;
        	emp2.empAge = 28;
        	
        	emp2.displayEmpId();
        	emp2.displayEmpName();
        	emp2.displayEmpAddress();
        	emp2.displayEmpSalary();
        	emp2.displayEmpAge();
        	
        		
			
        	
		}
}
