class StudentInfo{
	
	String name;
	int age;
	int studentId;
	String city;
	float height;
	double weight;
	
	void disp01() {
		System.out.println("Name: "+name);
	}
	void disp02() {
		System.out.println("Age: "+age);
	}
	void disp03() {
		System.out.println("Student ID: "+studentId);
	}
	void disp04() {
		System.out.println("City: "+city);
	}
	void disp05() {
		System.out.println("Height: "+height);
	}
	void disp06() {
		System.out.println("Weight: "+weight);
	}
	
	
}


class Student02{
	
	public static void main(String[] args) {
		
		StudentInfo student1 = new StudentInfo();
		student1.name = "Sham";
		student1.age = 20;
		student1.studentId = 1001;
		student1.city = "Pune";
		student1.height = 5.6f;
		student1.weight = 130.5;
		
		student1.disp01();
		student1.disp02();
		student1.disp03();
		student1.disp04();
		student1.disp05();
		student1.disp06();
		
		System.out.println();
		StudentInfo student2 = new StudentInfo();
		student2.name = "Ram";
		student2.age = 22;
		student2.studentId = 1002;
		student2.city = "Nagpur";
		student2.height = 5.9f;
		student2.weight = 150.0;
		
		student2.disp01();
		student2.disp02();
		student2.disp03();
		student2.disp04();
		student2.disp05();
		student2.disp06();
		
		
	}
	
}





