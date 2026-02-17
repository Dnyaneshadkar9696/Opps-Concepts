package abstractClass;

public class PremiumPlan extends Subscription{
	
	@Override
	public void calculatePrise() {

		System.out.println("The Premium Plan of Netflix is 699 for 6 months");
	}

}
