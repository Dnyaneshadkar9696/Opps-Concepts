package abstraction.interfDay2;

public class Whattsup  implements MetaApp{
	
	@Override
	public void login(String username, String password) {
		
		if(username == "ganesh@gmail.com" && password == "Ganesh#123") {
			
			System.out.println("Entered successfully in whatsup");
		}
		else {
			System.out.println("Invalid Credentials for whattsup login");
		}
		
		
	}
	
	@Override
	public void logout() {
		System.out.println("Logout successfully done from Whattsup...!");
		
	}
	

}
