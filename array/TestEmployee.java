package array;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter id, name and salary");
		
		Employee e = new Employee();
		
		e.setId(s.nextInt());
		s.nextLine(); 
		e.setName(s.nextLine());
		e.setSalary(s.nextFloat());
		
		System.out.println("Enter no. of languages");
		String[] languages = new String[s.nextInt()];
		s.nextLine();
		
		for (int i = 0; i < languages.length; i++) {
			System.out.println("Enter language");
			languages[i] = s.nextLine();
		}
		
		e.setLanguages(languages);
		
		e.print();

	}

}








