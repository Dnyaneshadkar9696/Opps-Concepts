
class Vehicle{
	
	void car() {
		System.out.println("This is a car");
	}
	
	void jeep() {
		System.out.println("This is a jeep");
	}
	
	void truck() {
		System.out.println("This is a truck");
	}
	
	void ambulance() {
		System.out.println("This is a ambulance");
	}
}


public class Vehicle01 {
	
	public static void main(String[] args) {
		Vehicle vec = new Vehicle();
		// we are storing the vehical class in the variable vec and using new keyword we are allocating the memory
		
		vec.car();
		vec.jeep();
		vec.ambulance();
		vec.truck();
	}

}
