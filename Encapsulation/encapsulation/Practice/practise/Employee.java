package encapsulation.practise;

public class Employee {
	
	
	// declare the variables or fields or the members as private
	
	private String name;
	private double salary;
	private String city;
	private long mobNumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", city=" + city + ", mobNumber=" + mobNumber
				+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", getCity()=" + getCity()
				+ ", getMobNumber()=" + getMobNumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	// to generate the public getter and setter method
	
	// use the tostring method
	
	

}
