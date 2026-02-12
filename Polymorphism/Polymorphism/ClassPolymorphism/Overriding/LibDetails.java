package polymorphism.overridding;

public class LibDetails extends Library {
	
	@Override
	public void book() {
		
		System.out.println("The book is available");
	}
	
	@Override
	public void magazine() {
		
		System.out.println("The magazine is  available");
	}
	
	@Override
	public void newspaper() {
		
		System.out.println("The newspaper is  available");
	}
	
	

}
