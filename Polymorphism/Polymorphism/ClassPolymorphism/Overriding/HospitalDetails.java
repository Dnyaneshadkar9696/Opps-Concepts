package polymorphism.overridding;

public class HospitalDetails extends Hospital {
	
	@Override
	public void doctor() {
		
		System.out.println("The doctor is not available");
	}
	
	@Override
	public void nurse() {
		
		System.out.println("The nurse is not available");
	}
	
	@Override
	public void patient() {
		
		System.out.println("The patient is not available");
	}

}
