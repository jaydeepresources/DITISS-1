package interfaces;

public class TestInterfaces {

	public static void main(String[] args) {

		Printer p = new Printer();
		p.print();

		Printable pr = new Printer();
		pr.print();

	}

}