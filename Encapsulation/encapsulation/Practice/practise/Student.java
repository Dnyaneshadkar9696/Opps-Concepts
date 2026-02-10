package encapsulation.practise;

public class Student {
	
	// example of a pojo class 
	

	
//	    Pojo class format is as follows
//	    1. declare the variables as private
	//	    2. generate the public getter and setter method
	//	    3. use the toString method
	// write the parameterized and non parameterized constructor
	
	
	private String name;
	private int rollNo;
	private String city;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", city=" + city + "]";
	}
		
	public Student() {
		
		
	}
	
	public Student(String name, int rollNo, String city) {
	
		this.name = name;
		this.rollNo = rollNo;
		this.city = city;
	}
	
	
	
}


