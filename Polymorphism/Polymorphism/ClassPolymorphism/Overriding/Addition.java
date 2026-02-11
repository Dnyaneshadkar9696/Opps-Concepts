package polymorphism.overridding;

public class Addition {
	
	private int a;
	private int b; 
	
	public void addNum() {
		int c = a + b;
		System.out.println("Addition of the two numbers is : "+ c );
	}
	
	Addition(int a, int b){
		this.a = a;
		this.b = b;
	}

}
