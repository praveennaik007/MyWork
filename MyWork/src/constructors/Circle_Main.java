package constructors;

public class Circle_Main {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.radius = 5;
		System.out.println(Circle.pi * c.radius * c.radius);
		c.areaOfCircle();
	}
}
