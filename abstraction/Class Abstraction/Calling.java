package abstraction.interfac;

public class Calling {
	
	public static void main(String[] args) {
		
		SimpleCalculator s = new SimpleCalculator();
		s.add();
		s.subtract();
		s.multiply();
		s.divide();
		
		System.out.println();
		Circle c = new Circle();
		c.area(5);
		c.perimeter();
		Rectangle r = new Rectangle();
		r.area(9);
		r.perimeter();
		
		System.out.println();
		Car c1 = new Car();
		c1.start();
		c1.stop();
		Bike b = new Bike();
		b.start();
		b.stop();
		
		System.out.println();
		FullTimeEmployee fu = new FullTimeEmployee();
		fu.calculateSalary();
		
		PartTimeEmployee par = new PartTimeEmployee();
		par.calculateSalary();
		
		System.out.println();
		InkjetPrinter ik = new InkjetPrinter();
		ik.print();
		
		LaserPrinter ls = new LaserPrinter();
		ls.print();
		
		System.out.println();
		Upi up = new Upi();
		up.pay(500);
		DebitCard db = new DebitCard();
		db.pay(800);
		CreditCard cd = new CreditCard();
		cd.pay(3045);
		
		System.out.println();
		
		Sbi sb = new Sbi();
		sb.deposit();
		sb.withdraw();
		sb.checkBalance();
		System.out.println();
		Hdfc  hd = new Hdfc();
		hd.deposit();
		hd.withdraw();
		hd.checkBalance();
		
		
	}

}
