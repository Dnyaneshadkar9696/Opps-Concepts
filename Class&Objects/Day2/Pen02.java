

class Pen{
	
	String color;
	String type;
	int length;
	String brand;
	double price;
	
	void write() {
		System.out.println("Writing something");
	}
	
	void Info() {
		System.out.println("Color: "+color);
		System.out.println("Type: "+type);
		System.out.println("Length: "+length);
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
	}
}



public class Pen02 {
	
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.color = "Blue";
		pen1.type = "Ballpoint";
		pen1.length = 14;
		pen1.brand = "Reynolds";
		pen1.price = 10.5;
		pen1.Info();
		pen1.write();
		System.out.println();
		
		Pen pen2 = new Pen();
		pen2.color = "Black";
		pen2.type = "Gel";
		pen2.length = 13;
		pen2.brand = "Pilot";
		pen2.price = 25.0;
		pen2.Info();
		pen2.write();
	}
  
}
