package polymorphism.overloading;

public class Hospital {
	
	public void hospitalDetails() {
		
		String name = "Welcome to Sevasadan Hospital";
		int beds = 45;
		
		System.out.println(name);
		System.out.println("We have : " + beds + "for the patients");
	}
	
	public int hospitalDetails(int doc) {
		
		
		System.out.println("We have "+ doc +" doctors");
		return 0;
		
		
	}

}
