package abstractClass;

public class Circle extends Shape {

	float radius;

	@Override
	public void calcArea() {
		area = 3.14f * radius * radius;
	}

	@Override
	void print() {
		System.out.println("Radius=" + radius);
		super.print();
	}

}
