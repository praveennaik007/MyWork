package Exceptions_CustomeException;

public class Clock_Main {
	public static void main(String[] args) {
		Clock c = new Clock(2, 43, 16);
		System.out.println(c.getHr());
		System.out.println(c.getMin());
		System.out.println(c.getSec());
		c.setHr(23);
		System.out.println(c.getHr());
	}
}
