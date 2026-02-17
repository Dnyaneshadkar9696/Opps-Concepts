package abstractClass;

public class OnlineOrder extends FoodOrder{
	
	@Override
	public void calculateBill(int a) {
		
		System.out.println("Total bill for OnlineOrder is : "+ (a * 100 ));
		
	}

}
