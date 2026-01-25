package abstraction;

public class MainAbstraction {
	
	public static void main(String[] args) {
		Vehicle v;
		
		// v is the reference vehicle use to point to Car clas and Scooter class
		v =new Car();  // created object and stored and accessed with v the properties
		v.start();
		// usign the vehicle start here 
		
		v = new Scooter();
		v.start();
	}

}
