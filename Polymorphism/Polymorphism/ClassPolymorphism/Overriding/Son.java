package polymorphism.overridding;

class GrandFather {
	

	public void grandFather() {
		
		System.out.println("GrandFather : ");
		System.out.println("I have 2 vills and 200 acre of agricultural land");
	}

}

class Father extends GrandFather{
	
	@Override
	public void grandFather() {
		
		System.out.println("Father: ");
		System.out.println("I have 2 flats in pune ");
	}
}

public class Son extends Father{
	@Override
	public void grandFather() {
		
		System.out.println("Son :");
		System.out.println("I have 1 bicycle");
	}
	
	
}
