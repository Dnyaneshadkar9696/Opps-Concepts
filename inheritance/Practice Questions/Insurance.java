package inheritance.questions;

public class Insurance {
	
	public void insuranceDetails() {
		System.out.println("Welcome to Star health insurance");
		System.out.println("We provide the best insurance in india");
	}

}

class HealthInsurance extends Insurance{
	
	public void healthInsurance() {
		
		System.out.println("We provide different plans :");
		System.out.println("The Family plan of gold is top plan of ours");
	}
}

class FamilyHealthPlan extends HealthInsurance{
	
	public void familyHealthPlan() {
		
		System.out.println("We hace provided to 200000 families till now");
	}
}
