package simple;

public class Vehicle {

	String name;
	String color;
	int speed;

	public Vehicle() {
	}

	public Vehicle(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	void accelerate() {
		System.out.println("Increasing speed");
	}

	void print() {
		System.out.println("Name=" + name);
		System.out.println("Color=" + color);
		System.out.println("Speed=" + speed);
	}

}
