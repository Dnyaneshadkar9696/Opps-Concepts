package polymorphism;
//import polymorphism.overloading.*;

import polymorphism.overridding.*;

public class Calling {
	
	// calling functionalities are all here 
	
	public static void main(String[] args) {
		
		
	// Examples for methodOverriding
		
		// example no 01
		Dog d = new Dog();
		d.sound();
		
		System.out.println();
		
		// example 02
		Bike b = new Bike();
		b.run();
		
		System.out.println();
		
		//example 03
		Teacher  t = new Teacher();
		t.work();
		
		System.out.println();
		
		// Example 04
		Circle c = new Circle();
		c.draw();
		
		// Example 06
		System.out.println();
		NameSame nm = new NameSame();
		nm.nameInfo(4);
		
		
	}

}
