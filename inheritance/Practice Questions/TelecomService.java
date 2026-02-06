package inheritance.questions;

public class TelecomService {

	public void teleInfo() {

		System.out.println("Welcome to the indias Telecom Services ");

	}
}

class Jio extends TelecomService {

		public void infoJio() {

			System.out.println("This is the Jio netwok");

			System.out.println("Jio is one of the top telecom company in india");
			System.out.println("We have customer base of over a million people");
		}
	}


