package polymorphism.overloading;

public class Employee {
	
	
	public String empDetails() {
		
		String name = "Ganesh Kumar";
		long mobNum = 2342324343l;
		String position = "Software Developer";
		
		System.out.println("Name : "+ name);
		System.out.println("Mobile Number : "+ mobNum);
		System.out.println("Position : "+ position);
		return null;
	}
	
	public void empDetails(String b) {
		
	
		
		System.out.println("I work in "+ b + "company");
	}

}
