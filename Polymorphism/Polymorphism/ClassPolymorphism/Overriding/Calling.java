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

		// Example 07
		System.out.println();
		AccessM acm = new AccessM();
		acm.accssInfo();
		
		//Example 08
		System.out.println();
		MarkF mf = new MarkF();
		mf.markInfo();
		
		//Example 09
		System.out.println();
	   Son sn = new Son();
	   sn.grandFather();
	   
	   // Example 10
	   System.out.println();
	   Icici ic = new Icici();
	   ic.interestRates();
	   
	   //Example 11
	   System.out.println();
	   Manager m = new Manager();
	   m.salary();
	   Developer dev = new Developer();
	   dev.salary();
	   
	   //Example 12
	   System.out.println();
	   UPI up = new UPI();
	   up.pay();
	   CreditCard cc = new CreditCard();
	   cc.pay();
	   
//	   Example 13
	   System.out.println();
	   Pizza pi = new Pizza();
	   pi.taste();
	   Burger bi = new Burger();
	   bi.taste();
	   
	   //Example 14
	   System.out.println();
	   Payment py = new Payment();
	   py.password();
	   
	   //Example 15
	   System.out.println();
	   Rooms rm = new Rooms();
	   rm.houseInfo();
	   
	   // Example 16
	   System.out.println();
	   TPlink tp  = new TPlink();
	   tp.speed();
	   
	   // Example 17
	   System.out.println();
	   Odd od = new Odd();
	   od.checkEven(8);
	   
	   //Example 18
	   System.out.println();
	   HospitalDetails hd = new HospitalDetails();
	   hd.patient();
	   hd.doctor();
	   hd.nurse();
	   
	   
	   //Example 19
	   System.out.println();
	   LibDetails ld = new LibDetails();
	   ld.newspaper();
	   ld.magazine();
	   ld.book();
	   
	   // Example 20
	   System.out.println();
	   ShopDetails sd = new ShopDetails();
	   sd.product();
	   sd.quantity();
	   sd.price();
		
		
	}

}

