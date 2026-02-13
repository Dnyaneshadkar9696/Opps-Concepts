package abstraction.interfDay2;

public class GoogleAuthentication implements Authentication {
	
	// we learned about reference creation 
	// for interface we do reference creation
	
	@Override
	public void login() {
		System.out.println("Logni successfull in Google");
	}
	
	@Override
	public void logout() {
		System.out.println("Logout successfully");
	}

}
