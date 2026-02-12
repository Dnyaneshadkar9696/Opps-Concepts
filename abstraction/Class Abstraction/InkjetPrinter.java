package abstraction.interfac;

public class InkjetPrinter implements Printer {
	
	@Override
	public void print() {
		
		System.out.println("Inkjet printer is activated");
		System.out.println("The Inkjet printer is printing");
		
	}

}
