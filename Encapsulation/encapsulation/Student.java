package encapsulation;

public class Student {

	private int marks;
	private String name;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if (marks >=0 && marks <= 100) {

			this.marks = marks;
		}
		else {
			System.err.println("Enter the marks above zero and below hundred");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
