package abstraction.interfac;

public class LaserPrinter implements Printer{

	@Override
	public void print() {
		
		System.out.println("Laser printer is activated");
		System.out.println("The laser printer is printing");
		
	}
}
