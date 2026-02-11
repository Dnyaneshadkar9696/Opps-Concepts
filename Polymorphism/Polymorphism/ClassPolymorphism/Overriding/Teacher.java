package polymorphism.overridding;

public class Teacher extends Person {
	
	@Override
	public void work() {
		
		
		String teach = "Mathematics";
		double salary = 35000.00;
		
		System.out.println("I teach "+ teach);
		System.out.println("My salary is : "+ salary);
		
	}
	
	

}
