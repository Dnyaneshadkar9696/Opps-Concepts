package polymorphism.overridding;

public class Pizza extends Food{
	@Override
	public String taste() {
		
		String bf = "The taste of the Cheese pizza is like a cheese";
		
		System.out.println(bf);
		
		return bf;
	}

}
