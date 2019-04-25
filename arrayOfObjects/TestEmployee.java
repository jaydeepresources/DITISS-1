package arrayOfObjects;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter no. of Employees");
		int n = scan.nextInt();

		Employee[] emps = new Employee[n]; // create empty array

		for (int i = 0; i < emps.length; i++) {

			emps[i] = new Employee();
			System.out.println("Enter id, name and salary for Employee: " + (i + 1));
			emps[i].setId(scan.nextInt());
			scan.nextLine();
			emps[i].setName(scan.nextLine());
			emps[i].setSalary(scan.nextFloat());

		}
		
		System.out.println("Printing Array");
		
		for (int i = 0; i < emps.length; i++) {
			emps[i].print();
		}

	}
}