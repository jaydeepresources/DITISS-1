package containment;

public class TestContainment {

	public static void main(String[] args) {
		
		Employee e = new Employee(1, "John Doe", 12345.6f, new Certificate("B.E", "A", "Some Univ"));
		e.print();
	}

}
