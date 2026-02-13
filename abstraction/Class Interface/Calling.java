package abstraction.interfDay2;

public class Calling {
	
	public static void main(String[] args) {
		
		// reference creation of an interface
		
		Authentication auth;
		auth = new GoogleAuthentication();
		auth.login();
		auth.logout();
		
		
		System.out.println();
		Authentication insta;
		insta = new InstagramAuthentication();
		insta.login();
		insta.logout();
		
		// when i try to see the implementation of an method i cannot due to interface
		// it directs me to the interface

		System.out.println();
		GoogleApp ga;
		ga = new Gmail();
		ga.openApp();
		// object creation for to access the class own method
		Gmail g = new Gmail();
		g.sendMail();

		System.out.println();
		GoogleApp gg;
		gg = new Youtube();
		gg.openApp();
		
		Youtube y = new Youtube();
		y.playVideo();

		System.out.println();
		GoogleApp ap;
		ap = new GoogleMaps();
		ap.openApp();
		GoogleMaps s = new GoogleMaps();
		s.navigate();
		
		
		System.out.println();
		MetaApp m;
		m = new Facebook();
		m.login("rahul@gmail.com", "rahul@123");
		m.logout();
		System.out.println();
		
		m = new Whattsup();
		m.login("ganesh@gmail.com", "ganesh@123");
		
		System.out.println();
		PaymentApp py;
		py = new GooglePay();
		py.pay();
		GooglePay gp = new GooglePay();
		gp.checkBalance();
		
		System.out.println();
		py = new PhonePay();
		py.pay();
		PhonePay pp = new PhonePay();
		pp.checkBalance();
		
		System.out.println();
		py = new Paytm();
		py.pay();
		Paytm pt = new Paytm();
		pt.checkBalance();
		
		System.out.println();
		StreamingApp st;
		st = new Netflix();
		st.playContent();
		st = new AmazonPrime();
		st.playContent();
		st = new Hotstar();
		st.playContent();
		
	}

}

