
class Book{
	
	
	void findPagenum() {
		System.out.println("The page number to read from is 76");
	}
	
	void avalibility() {
		System.out.println("The book is not available on amazon.");
	}
	
	void writing() {
		System.out.println("Gansham is writing the book");
	}
}

public class Book01 {
	
	public static void main(String[] args) {
		Book bk = new Book();
		bk.avalibility();
		bk.writing();
		bk.findPagenum();
	}

}
