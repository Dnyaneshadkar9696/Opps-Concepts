package abstraction.interfDay2;

public class InstagramAuthentication  implements Authentication{
	
	@Override
	public void login() {
		System.out.println("Login successfull in Instagram");
	}
	
	@Override
	public void logout() {
		System.out.println("Logout successfully from Instagram");
	}

}
