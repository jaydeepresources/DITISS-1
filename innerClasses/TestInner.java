package innerClasses;

public class TestInner {

	public static void main(String[] args) {

		// Outer.Inner in = new Outer().new Inner();

		Starbucks starbucks = new Starbucks("Pashan", 50);
		Starbucks.Coffee coffee = starbucks.new Coffee("Caramel Coffee", 500);
		
		starbucks.printStarbucks();
		coffee.printCoffee();
		

	}

}
