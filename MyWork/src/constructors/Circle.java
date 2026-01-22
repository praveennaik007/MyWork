package constructors;

public class Circle {
	static double pi = 3.14;
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void areaOfCircle() {

		System.out.println(pi * radius * radius);
	}
}
