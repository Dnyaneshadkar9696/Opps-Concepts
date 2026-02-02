package inheritance;

public class Car {

	String a;

	public void jeep() {
		System.out.println("The speed of jeep is slow than a sports car");
	}

}

class Motor extends Car {

	Motor(String a) {
		System.out.println(a);

	}

	public void F1car() {
		System.out.println("F1 racing car is the fastest in the world");
	}
}
