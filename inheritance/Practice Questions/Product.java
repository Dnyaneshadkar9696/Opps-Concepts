package inheritance.questions;

public class Product {

	// This is an example of ecommerse product
	public void productInfo() {

		String Type = "Computer";
		int prise = 45000;
		String colour = "Gray";

		System.out.println("Product details : ");

		System.out.println("Category of the product : " + Type);
		System.out.println("Prise of the product : " + prise);
		System.out.println("Colour of the product : " + colour);

	}

}

class ElectronicProduct extends Product {

	public void eleProductInfo() {

		System.out.println("China has the biggest market share for the electronic produts");
		System.out.println("India produce less electronic products as compare to the china");
	}
}

class Mobile extends ElectronicProduct {

	public void mobilInfo() {

		String name = "I have Samsung mobile phone";
		int prise = 23000;
		String function = "It has Hd display";

		System.out.println("Welcome to the Mobile details : ");
		System.out.println(name);
		System.out.println("Prise -" + prise);
		System.out.println("Feature -" + function);

	}
}
