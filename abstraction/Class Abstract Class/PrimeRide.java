package abstractClass;

public class PrimeRide extends Ride{
	
	
	
	@Override
	public void calculateFare(float distance) {
		
		
		System.out.println("Fair of the PrimeRide is : "+ (distance * 150));
	}
	
	

}
