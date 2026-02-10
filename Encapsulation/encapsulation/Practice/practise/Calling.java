package encapsulation.practise;

import java.util.Scanner;

public class Calling {
	public static void main(String[] args) {
		
		
		// in calling we take values from the scanner class 
		
		Scanner sc = new Scanner(System.in);
		
		Employee em = new Employee();
		
		System.out.print("Enter the name : ");
		String name = sc.nextLine();
		System.out.print("Enter the city : ");
		String city = sc.nextLine();
		System.out.print("Enter the salary : ");
		double a = sc.nextDouble();
		System.out.print("Enter the Mobile Number: ");
		long b = sc.nextLong();
		
		// set the values into the Employee object
		em.setName(name);
		em.setCity(city);
		em.setSalary(a);
		em.setMobNumber(b);
		
		// print employee details to console
		// is this the way to print emp details for toSting method
		System.out.println();
		System.out.println("Employee details: " );
		System.out.println("Name: " + em.getName());
		System.out.println("City: " + em.getCity());
		System.out.println("Salary: " + em.getSalary());
		System.out.println("Mobile Number: " + em.getMobNumber());

			System.out.println();
		
		Student st = new Student("Dhruv", 101, "Ahmedabad");
//		st.setName("Dhruv");
//		st.setRollNo(101);
//		st.setCity("Ahmedabad");
//		
//		System.out.println("Student details: " );
//		System.out.println("Name: " + st.getName());
//		System.out.println("Roll No: " + st.getRollNo());
//		System.out.println("City: " + st.getCity());
		
		System.out.println(st.toString());
		
		
		sc.close();
		
	}


}
