package inheritance;

public class Library {

	public void numberOfstudents(int a) {
		System.out.println("Number of students in the library is : " + a);
	}

}

class Books extends Library {
	public void numberOfbooks(int b) {
		System.out.println("Number of books in the library is : " + b);
	}

	Books(String name) {
		System.out.println(name);
	}
}
