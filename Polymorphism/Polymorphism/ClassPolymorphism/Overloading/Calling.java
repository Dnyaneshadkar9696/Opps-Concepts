package polymorphism.overloading;

import polymorphism.overridding.LibDetails;

public class Calling {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.cheeta();
		a.cheeta(5);
		
		
		System.out.println();
		Bank b = new Bank();
		b.interestRate();
		b.interestRate(4);
		
		System.out.println();
		Employee e = new Employee();
		e.empDetails();
		e.empDetails("Bosh ");
		
		System.out.println();
		Hospital h = new Hospital();
		h.hospitalDetails();
		h.hospitalDetails(7);
		
		System.out.println();
		Library l = new Library();
		l.libraryDetails();
	    l.libraryDetails(4000);
	}
	

}
