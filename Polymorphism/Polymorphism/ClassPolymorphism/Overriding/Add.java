package polymorphism.overridding;

public class Add extends Addition {
	


	Add(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 
		
		// example 05
		Addition ad = new Addition(5, 4);
		ad.addNum();
		
	}

}
