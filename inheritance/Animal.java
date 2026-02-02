package inheritance;

public class Animal {

	public void running(String name) {

		System.out.println("The animal " + name + " is running");

	}

}

class Bird extends Animal {

	Bird(String head) {
		System.out.println(head);
	}

	public void flying(String name) {
		System.out.println("The bird " + name + " is flying");
	}
}
