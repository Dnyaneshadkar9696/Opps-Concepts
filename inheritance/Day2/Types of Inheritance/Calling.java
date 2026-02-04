package inheritance.types;

public class Calling {
	
	// Example of Hirarical Inheritance 
	
	public static void main(String[] args) {
		
		
		Gmail gm = new Gmail();
		
		gm.infoMail();
		gm.myGoogle(); // we can access method of google also
		
		System.out.println();
	    Gdrive gd = new Gdrive();
	    gd.infodrive();
	    gd.myGoogle(); // access method of google 
	    
	    System.out.println();
	    Gmaps  gp = new Gmaps();
	    gp.gmapinfo();
	    gp.myGoogle(); // access method of google 
	    
	    // single inheritance example 
	    System.out.println("------------------------------");
	    System.out.println();
	    SavingAccount sv = new SavingAccount();
	    sv.bankInfo();
	    sv.savingAccInfo();
	    
	    // Multilevel inheritance example 
	    System.out.println();
	    System.out.println("-------------------------");
	    AmazonPrime amo = new AmazonPrime();
	    amo.amazoningo();
	    amo.shoppignAmazon();
	    amo.primeDetails();
	    
	    // mix of all Hybrid inheritance  
	    
	    System.out.println();
	    TeachingAsistant th = new TeachingAsistant();
	    th.infoPerson();
	    th.infoStudent();
	    th.infoTeachingAsistant();
	    
	    System.out.println();
	    Teacher ther = new Teacher();
	    ther.infoStudent();
	    ther.infoTeacher();
	     
	    
	    
		
		
	}

}
