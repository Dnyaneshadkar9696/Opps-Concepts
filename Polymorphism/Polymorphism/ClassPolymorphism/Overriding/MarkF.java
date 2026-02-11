package polymorphism.overridding;

public class MarkF  extends MarkFinal{
	
	@Override
	public void markInfo() {
		
	System.out.println("It gives error when we use the final keyword for the method");
	System.out.println("So using final we can stop the user from chaging the behavior of the mehtod or a class");	
	}

}
