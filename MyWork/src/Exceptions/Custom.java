package Exceptions;

public class Custom {
	public static void main(String[] args) throws Custom_Exception {
		int age = 12;
		if (age >= 18) {
			System.out.println("Eligible for Voting...");
		} else {
			throw new Custom_Exception("You Are not Eligible For Voting...");

		}
	}
}
