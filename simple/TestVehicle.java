package simple;

public class TestVehicle {

	public static void main(String[] args) {

		Car c = new Car();
		c.name = "Honda City";
		c.color = "Black";
		c.speed = 35;
		c.gearType = "Auto";

		c.print();

		Car c2 = new Car("Jazz", "Red", 43, "Manual");
		c2.print();
	}

}
