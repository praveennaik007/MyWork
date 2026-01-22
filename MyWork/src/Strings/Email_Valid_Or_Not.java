package Strings;

import java.util.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Email_Valid_Or_Not {
//	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Enter a Email");
//		String s = scn.next();
//		boolean flag = true;
//		if (s != null && s.contains("@")) {
//			String[] a = s.split("@");
//			String user = a[0];
//			String domin = a[1];
//			if (user != null && domin != null) {
//				if (domin.startsWith(".") == false && domin.endsWith(".") == false && domin.endsWith("..") == false) {
//					System.out.println("Valid");
//				} else {
//					System.out.println("not valid");
//				}
//			} else {
//				System.out.println("Not Valid");
//			}
//		}
//	}
//	import java.util.Scanner;

//	public class EmailValidator {
//	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		System.out.print("Enter an Email: ");
//		String email = scn.next();
//
//		if (isValidEmail(email)) {
//			System.out.println("Valid Email");
//		} else {
//			System.out.println("Not Valid Email");
//		}
//
//		scn.close();
//	}
//
//	static boolean isValidEmail(String email) {
//		if (email == null)
//			return false;
//
//		// Standard email pattern
//		String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
//		return email.matches(regex);
//	}
//	}

	// Correct Answer
//	public class EmailValidator {
	// RFC-5322 safe regex
	private static final Pattern EMAIL_PATTERN = Pattern
			.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+" + "@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?"
					+ "(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter an Email: ");
		String email = scn.next();

		if (isValidEmail(email)) {
			System.out.println("Valid Email");
		} else {
			System.out.println("Not Valid Email");
		}

		scn.close();
	}

	static boolean isValidEmail(String email) {
		if (email == null || email.length() > 254)
			return false;
		return EMAIL_PATTERN.matcher(email).matches();
	}
	
	
//	}

}
