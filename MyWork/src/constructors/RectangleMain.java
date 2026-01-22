package constructors;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 5);
		r.length = 5;
		r.breadth = 5;
		r.areaOfRectangle();
		System.out.println(r.breadth * r.length);
	}
}
