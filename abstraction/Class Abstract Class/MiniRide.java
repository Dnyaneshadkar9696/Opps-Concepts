package abstractClass;

public class MiniRide extends Ride{

	@Override
	public void calculateFare(float distance) {
		// here we will calculate the fair of the ride
		
		System.out.println("Fair of the MiniRide is : " + (distance * 100));
		
	}
}
