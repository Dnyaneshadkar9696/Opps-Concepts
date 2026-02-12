package polymorphism.overridding;

public class Odd extends EvenOdd{
	
	@Override
	public void checkEven(int a) {
		if( a % 2 == 1) {
			System.out.println("number is an Odd Number");
		}
		else {
			System.out.println("It is an Even Number");
		}
		
	}

}
