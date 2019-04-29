package abstractClass;

public abstract class Shape {
	
	float area;
	
	void print() {
		System.out.println("Area=" + area);
	}
	
	public abstract void calcArea();

}