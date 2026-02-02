package inheritance;

import java.util.Scanner;

public class Hospital {

	Scanner sc = new Scanner(System.in);
	String name;
	int age;

	public void infoPatient() {

		System.out.print("Enter name of patient : ");
		name = sc.nextLine();

		System.out.print("Enter age of the patient : ");
		age = sc.nextInt();

	}

}

class People extends Hospital {

	public void people() {

		sc.nextLine();

		System.out.print("Enter address: ");
		String patientAddress = sc.nextLine();

		System.out.print("Enter Mobile Number : ");
		int patientMobile = sc.nextInt();

		System.out.println();

		System.out.println("Patient details : ");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Address : " + patientAddress);
		System.out.println("Mobile Number : " + patientMobile);

	}

	People(String name1) {
		System.out.println(name1);
	}

}
