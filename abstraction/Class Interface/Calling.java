package abstraction.interfDay2;

public class Calling {
	
	public static void main(String[] args) {
		
		// reference creation of an interface
		
		Authentication auth;
		auth = new GoogleAuthentication();
		auth.login();
		auth.logout();
		
		
		System.out.println();
		Authentication insta;
		insta = new InstagramAuthentication();
		insta.login();
		insta.logout();
		
		// when i try to see the implementation of an method i cannot due to interface
		// it directs me to the interface
		
	}

}
