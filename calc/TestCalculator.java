package calc;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {

		Calculator c = new Calculator();

		Scanner scan = new Scanner(System.in);

		System.out.println("1.Add\t2.Sub");
		int choice = scan.nextInt();

		switch (choice) {
		case 1:

			System.out.println("Enter num1 & num2");
			c.num1 = scan.nextFloat();
			c.num2 = scan.nextFloat();
			c.add();
			break;

		case 2:

			System.out.println("Enter num1 & num2");
			c.num1 = scan.nextFloat();
			c.num2 = scan.nextFloat();
			c.sub();
			break;
			
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}
}
