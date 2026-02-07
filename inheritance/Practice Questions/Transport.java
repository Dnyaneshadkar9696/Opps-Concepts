package inheritance.questions;

public class Transport {
	
	public void infoTransport() {
		
		System.out.println("This is surya Transport service");
		System.out.println("We are indias number one transport service");
	}

	
}

class Bus extends Transport{
	
	public void busInfo() {
		
		System.out.println("This is Red bus");
		System.out.println("India ranks 47th in terms of the worlds largest bus network");
	}
}

class Metro extends Transport{
	
	public void metroInfo() {
		
		System.out.println("Welcome to Pune Metro");
		System.out.println("Metro project in india is one of the successful project");
	}
}

class Auto extends Transport{
	
	public void autoInfo() {
		
		System.out.println("The auto industry of india is of about 21 billion dollars");
		System.out.println("The auto industry is revolutionzing rapidly in india");
	}
}
