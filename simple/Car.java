package simple;

public class Car extends Vehicle {

	String gearType;

	public Car() {
		
	}

	public Car(String name, String color, int speed, String gearType) {
		super(name, color, speed);
		this.gearType = gearType;
	}

	void accelerate() {
		System.out.println("Increasing speed by 5km/hr");
	}

	void print() {
		super.print();
		System.out.println("Gear Type=" + gearType);
	}

}
