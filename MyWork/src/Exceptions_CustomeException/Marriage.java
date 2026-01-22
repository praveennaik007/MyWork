package Exceptions_CustomeException;

public class Marriage {

	public static void main(String[] args) {
		int age = 12;
		if (age >= 18) {
			System.out.println("Eligible for Marriage");
		} else {
			throw new AgeMissMatchException("not eligible...");
		}
	}
}
