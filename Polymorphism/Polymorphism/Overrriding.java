package Polymorphism;




public class Overrriding {
	
	// here we will see the overriding concept
	
	public void show(int a , int b) {
		System.out.println("Addition : "+ (a+b));
	}

}

class Second extends Overrriding
{
	
	public void show(String name) {
		System.out.println("Name : "+ name);
		
		// same name of methods in different calsses
		
	}
}


