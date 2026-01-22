package constructors;

public class Rectangle {
	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void areaOfRectangle() {
		System.out.println(this.length * this.breadth);
	}
}
