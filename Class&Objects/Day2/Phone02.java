
class Phone{
	String model;
	String color;
	int price;
	int storage;
	String brand;
	
	void call() {
		System.out.println("Calling...");
	}
	
	void sendMessage() {
		System.out.println("Sending Message...");
	}
	
	void takePhoto() {
		System.out.println("Taking Photo...");
	}
	
	void playMusic() {
		System.out.println("Playing Music...");
	}
	
	void browseInternet() {
		System.out.println("Browsing Internet...");
	}
	
	void Info() {
		System.out.println("Model: "+model);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		System.out.println("Storage: "+storage);
		System.out.println("Brand: "+brand);
	}
}



public class Phone02 {
	
	
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.model = "Galaxy S21";
		phone1.color = "Gray";
		phone1.price = 799;
		phone1.storage = 128;
		phone1.brand = "Samsung";
		phone1.Info();
		phone1.call();
		phone1.sendMessage();
		phone1.takePhoto();
		phone1.playMusic();
		phone1.browseInternet();
		System.out.println();
		
		Phone phone2 = new Phone();
		phone2.model = "iPhone 13";
		phone2.color = "Orange";
		phone2.price = 899;
		phone2.storage = 256;
		phone2.brand = "Apple";
		phone2.Info();
		phone2.call();
		phone2.sendMessage();
		phone2.takePhoto();
		phone2.playMusic();
		phone2.browseInternet();
		
	}

}
