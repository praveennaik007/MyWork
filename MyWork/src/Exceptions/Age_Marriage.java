package Exceptions;

public class Age_Marriage {
	public static void main(String[] args) {
		int age = 16;
		if (age >= 18) {
			System.out.println("Eligible for Marriage");
		} else {
			throw new AgeNotMatchException("Not Eligible " + age+" Not Matched");
		}
	}
}
