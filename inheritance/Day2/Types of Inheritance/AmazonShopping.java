package inheritance.types;

public class AmazonShopping extends Amazon{
	
    public void shoppignAmazon() {
    	
    	int items = 34;
    	double totalPrice = 32453.45;
    	String arrivalDay = "Wednesday";
    	System.out.println("Shopping details : ");
    	
    	System.out.println("Arrival Day - "+ arrivalDay);
    	System.out.println("Number of items - "+ items);
    	System.out.println("Total price - "+ totalPrice);
    	
    	
    }

}
