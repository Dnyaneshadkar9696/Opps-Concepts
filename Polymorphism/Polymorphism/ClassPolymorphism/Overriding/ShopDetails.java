package polymorphism.overridding;

public class ShopDetails extends Shop{
	
	@Override
	public void product() {
		
		System.out.println("The product is Rice");
	}
	
	@Override
	public void price() {
		
		System.out.println("The price is 45000");
		
		
	}
	
	@Override
	public void quantity() {
		
		System.out.println("The quantity is 50 Kg");
	}

}
