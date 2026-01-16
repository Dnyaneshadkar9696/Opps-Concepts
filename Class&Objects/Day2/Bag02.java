
class Bag {
	
	String color;
	int price;
	String brand;
	int size;
	
	
	
	void display() {
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
		System.out.println("Brand: " + brand);
	}
	
	void carry() {
		System.out.println("Carrying the bag of size: " + size);
	}
	
	void open() {
		System.out.println("Opening the bag");
	}
	
	void close() {
		System.out.println("Closing the bag");
	}
	
	void info() {
		System.out.println("Bag Info:");
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
		System.out.println("Brand: " + brand);
		System.out.println("Size: " + size);
	}
}

public class Bag02 {
	
	public static void main(String[] args) {
		
		Bag bag1 = new Bag();
		bag1.color = "Red";
		bag1.price = 1500;
		bag1.brand = "Nike";
		bag1.size = 20;
		bag1.info();
		bag1.open();
		bag1.carry();
		bag1.close();
		System.out.println();
		
		Bag bag2 = new Bag();
		bag2.color = "Blue";
		bag2.price = 2000;
		bag2.brand = "Adidas";
		bag2.size = 25;
		bag2.info();
		bag2.open();
		bag2.carry();
		bag2.close();
		
	}

}
