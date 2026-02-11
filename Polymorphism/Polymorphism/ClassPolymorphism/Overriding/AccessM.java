package polymorphism.overridding;

public class AccessM  extends AccessModifiers{
	
	@Override
	public void accssInfo() {
		
		System.out.println("Using the accessModifier for the overriding. Protected nothing happens ");
		System.out.println("When private is used it gives the error");
	}

}
