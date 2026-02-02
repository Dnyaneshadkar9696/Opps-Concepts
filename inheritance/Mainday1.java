package inheritance;

public class Mainday1 {

	public static void main(String[] args) {

		Motor mo = new Motor("Car details : ");
		mo.jeep();
		mo.F1car();

		System.out.println();
		Bird an = new Bird("Animal details : ");
		an.running("Cat");
		an.flying("Sparrow");

		System.out.println();

		People pep = new People("Welcome to Sevasadan Hospital : ");
		pep.infoPatient();
		pep.people();

		System.out.println();

		Books bk = new Books("Welcome to Chanakya Library : ");
		bk.numberOfbooks(4000);
		bk.numberOfstudents(40);
		
		System.out.println();
		Appartment ap = new Appartment();
		System.out.println("House details : ");
		ap.details();
		ap.details01();

	}

}
