package abstractClass;

public class Controller {
	
	public static void main(String[] args) {
		
		
		// throught the reference creation i can acces the inheritance methods but i cannot see the implementation
		
		
		Vehicle v;
		v = new Car();
		v.start();
		v.fuleType();
//		// i don't know the internal working of how the car starts
//		
//		// ** I can access the properties of own method using child class
//		
		System.out.println();
		v = new Bike();
		v.start();
		v.fuleType();  // Accessing Vehicle class method 
		
		System.out.println();
		System.out.println("Shapes ");
//		
//		// crate reference of the shape and call all 
//		
		Shape s; 
		s = new Circle();
		s.area();
		System.out.println();
		s = new Rectangle();
		s.area();
		System.out.println();
		s = new Square();
		s.area();
		
		// Employee salary details 
//		
		Employee em;
		em = new FullTimeEmployee();
		em.calculateSalary(40000);
		System.out.println();
		em = new PartTimeEmployee();
		em.calculateSalary(15000);
//		
//		// Bank Account
		System.out.println();
		
		Bankaccount  bk;
		bk = new SavingAccount();
		bk.withdraw();
		bk.deposit();
		
		// Food Delivery 
		System.out.println();
		
		FoodOrder  f;
		f = new DineInOrder();
		f.printReceipt();
		f.calculateBill(4);
		System.out.println();
		f = new OnlineOrder();
		f.printReceipt();
		f.calculateBill(2);
		
		// Ride 
		System.out.println();
		Ride r;
		r = new MiniRide();
		r.startRide();
		r.calculateFare(3);
		System.out.println();
		r = new PrimeRide();
		r.startRide();
		r.calculateFare(5);
		
		//Product
		System.out.println();
		Product p;
		p = new Electronics();
		p.displayProductDetails();
		System.out.println();
		p.calculateDicount();
		
		
		p = new Clothing();
		p.calculateDicount();
		System.out.println("So the discount is 10% and 5%");
		
		System.out.println();
		// Subscription
		
		Subscription sp;
		sp = new BasicPlan();
		sp.subscriptionDetails();
		System.out.println();
		sp.calculatePrise();
		
		sp = new PremiumPlan();
		sp.calculatePrise();

			// course
		System.out.println();
		
		Course c;
		c = new JavaCourse();
		c.courseDetailsJava();
		
		System.out.println();
		c = new PytonCourse();
		c.courseDetailsPython();
		System.out.println();
		c.calculateDuration();
		
		
		
		
		
	}

}


