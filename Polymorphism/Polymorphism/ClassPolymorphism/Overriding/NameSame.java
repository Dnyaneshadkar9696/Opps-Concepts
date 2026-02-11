package polymorphism.overridding;

public class NameSame extends Name {
	
	
	@Override
	public void nameInfo(int a) {
		
		
		System.out.println("The method name should be same");
		System.out.println("The parameters should be same");
		System.out.println("The return type must be the same");
	}
	
	
	

}
