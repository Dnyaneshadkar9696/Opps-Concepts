package polymorphism.overloading;

public class Animal {
	
	// overloading is a method or way to achieve the compile time polymorphism
	
	// we can create the same methods in a class just the condition is that the parameters should be different
	
	public void cheeta() {
		
		System.out.println("Cheeta is the fastest animal on planet earth");
	}
	
	
	
	public void cheeta(int a) {
		System.out.println("Most of the cheetas are found in Africa continent");
	}
	
	// we can write the same name of the method just the parameter should be different

}
