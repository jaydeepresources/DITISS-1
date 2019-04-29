package object;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "John Doe", 12345.6f);
		Employee e2 = new Employee(16, "John Doe", 12345.6f);
		
		System.out.println(e1.equals(e2)); //equals(Object e2)
		
	}
}