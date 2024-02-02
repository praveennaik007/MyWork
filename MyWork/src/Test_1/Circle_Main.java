package Test_1;

public class Circle_Main {
public static void main(String[] args) {
	Circle c=new Circle();
	c.radius=5;
	System.out.println(Circle.pi*c.radius*c.radius);
	c.areaOfCircle();
}
}
