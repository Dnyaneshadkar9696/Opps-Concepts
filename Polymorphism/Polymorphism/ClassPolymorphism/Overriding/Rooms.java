package polymorphism.overridding;

public class Rooms extends House {
	
	@Override
	public void houseInfo() {
		
		System.out.println("The rent of house is 3000 per month");
		System.out.println("Only family members and relatives are allowed to stay in the house");
	}

}
