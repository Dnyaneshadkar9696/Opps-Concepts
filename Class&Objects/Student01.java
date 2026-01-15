
class Student{
	
	void info() {
		String name = "Raman";
		int rollNo = 01;
		System.out.println("Student Information");
		System.out.println("Name -"+name);
		System.out.println("Rollno -"+rollNo);
		System.out.println();
	}
	
	
	void study() {
		System.out.println("The student is studing");
	}
	
	void play() {
		System.out.println("The student is playing");
	}
	
	void lecture() {
		System.out.println("The students are in the lecture");
	}
	
	void lunch() {
		System.out.println("The students are having their lunch");
	}
}



public class Student01 {
	
	public static void main(String[] args) {
		
		// class is and blueprint of a object. Class is collection of variables and methods
		// The class is not an real world entity. Using object we can access the properties of the class
		// we can create n number of objects of an class
		
		Student in = new Student();
		in.info();
		in.study();
		in.play();
		in.lecture();
		in.lunch();
		
	}

}
