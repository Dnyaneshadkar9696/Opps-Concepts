package inheritance.questions;

public class Hotel {
	
	public void hotelInfo() {
		
		long gstNumber = 2342342343l;
		
		System.out.println("Welcome to the Dragon hotel");
		System.out.println("We serve 1000 dishes");
		System.out.println("GST Number :"+ gstNumber);
	}

}

class LuxaryHotel extends Hotel {
	
	public void luxaryInfo() {
		
		System.out.println("Welcome to Luxary Hotel");
		System.out.println("We are 5 star hotel");
		
		
	}
}
