package polymorphism.overridding;

public class TPlink extends WiFi{
	
	@Override
	public int speed() {
		int rp = 43;
		System.out.println("The speed of Tp link Router is : "+ rp +"mbps");
		return rp;
	}

}
