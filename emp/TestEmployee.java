package emp;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.setId(1);
		e1.setName("John Doe");
		e1.setSalary(12345.6f);

		e1.print();

		Employee e2 = new Employee(2,"Jane Doe",12345.6f);
		e2.print();
		
	}

}