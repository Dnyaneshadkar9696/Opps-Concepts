package abstraction.interfDay2;

public class Facebook implements MetaApp{
	
	
	@Override
	public void login(String username, String password) {
		
		if(username == "rahul@gmail.com" && password == "rahul@123") {
			
			System.out.println("Entered successfully in Facebook");
		}
		else {
			System.out.println("Invalid Credentials");
		}
		
		
	}
	
	@Override
	public void logout() {
		System.out.println("Logout successfully done...! from Facebook");
		
	}

}
