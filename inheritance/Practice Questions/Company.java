package inheritance.questions;

public class Company {
	
	public void companyInfo() {
		System.out.println("This is Mini Techno solutions");
		System.out.println("We have 400 employees in our organization");
	}

}

class Manager extends Company{
	
	public void managerInfo() {
		
		System.out.println("Name : Deepak Gauda");
		System.out.println("Email : deepakgauda@gmail.com");
	}
}
