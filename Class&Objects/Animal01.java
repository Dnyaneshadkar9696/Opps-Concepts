class  Animal{

	void informaion() {
		String name = "Tommy";
		int age = 15;
		System.out.println("Hellow,I am a dog. My name is "+ name);
		System.out.println("My age is "+ age);
	}
	
	void running() {
		System.out.println("I am running");
	}
	
	void sleeping() {
		System.out.println("I am sleeping");
	}
	
	void eating() {
		System.out.println("I am eating");
	}
	
	void playing() {
		System.out.println("I am playing");
	}
	
	
	
	
	
}

public class Animal01{
	
	public static void main(String[] args) {
		
		Animal info = new Animal();
		
		// we accesed the methods here 
		info.informaion();
//		info.running();
		info.eating();
//		info.sleeping();
//		info.playing();
//	
	}
	
}
