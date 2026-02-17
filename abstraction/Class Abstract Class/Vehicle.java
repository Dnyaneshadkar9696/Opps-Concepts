package abstractClass;

public abstract class Vehicle {
	
	// now  the class is abstract we can add
	// variables , constructor and abstract and non- abstract methods
	
	public abstract void start();
	// above is an abstract metnod
	
	// now we will write the normal or concrete of non - abstract method
	
	public void fuleType() {
		
		System.out.println("The fule type is Super or we can say without ethanol");
		
		// this method i can access using inheriting this class propertis to the child class
	
	}

}
