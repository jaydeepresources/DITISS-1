package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCertificates {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Employee e = new Employee();

		System.out.println("Enter Id");
		e.setId(scan.nextInt());

		scan.nextLine();

		System.out.println("Enter Name");
		e.setName(scan.nextLine());

		System.out.println("Enter Salary");
		e.setSalary(scan.nextFloat());

		System.out.println("Enter no. of certificates");
		int size = scan.nextInt();

		ArrayList<Certificate> certificates = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			Certificate c = new Certificate();

			System.out.println("Enter Certificate Id");
			c.setId(scan.nextInt());

			scan.nextLine();

			System.out.println("Enter Certificate Name");
			c.setName(scan.nextLine());

			System.out.println("Enter Certificate Grade");
			c.setGrade(scan.nextLine());
			
			certificates.add(c);
		}
		
		e.setCertificates(certificates);
		
		System.out.println(e);

	}

}
