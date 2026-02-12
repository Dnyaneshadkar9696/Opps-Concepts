package abstraction.interfac;

public class Bike implements Vehicle {
    @Override
	public void start() {

		System.out.println("The Bike is started ");

	}

    @Override
	public void stop() {

		System.out.println("The Bike is stopped ");

	}

}
