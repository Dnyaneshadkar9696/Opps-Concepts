package inheritance.questions;

public class University {
	
	public void uniInfo() {
		
		System.out.println("Welcome to the Amit University");
		System.out.println("We are indias number one university and guarantee of 100% placement");
		System.out.println("The top professionsal and alumni of IIT are our teachers");
	}

}

class Student extends University{
	
	public void studentInfo() {
		String name = "Ganesh Kumar";
		int rollNo = 45;
		String mailId = "ganeshkumar@gmail.com";
		System.out.println("Student Information : ");
		System.out.println("Name : "+ name);
		System.out.println("Roll no :"+ rollNo);
		System.out.println("Mail Id :"+ mailId);
	}
}

class Professor extends University{
	
	public void professorInfo() {
		String nameProfessor = "Ramesh Dsuza";
		String subject = "Physics";
		String mailId = "rameshdsuza@gmail.com";
		
		System.out.println();
		System.out.println("Professor Details : ");
		System.out.println("Name :"+ nameProfessor);
		System.out.println("Subject :"+ subject);
		System.out.println("Mail Id :"+ mailId);
	}
}

class Staff  extends University{
	
	public void stafDetails() {
		int staf = 234;
		System.out.println("The staff details :");
		System.out.println("In the university total staff is "+ staf );
		System.out.println("The staff is of helping nature and well trained");
	}
}
