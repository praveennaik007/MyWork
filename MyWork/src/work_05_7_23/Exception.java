package work_05_7_23;

public class Exception {
public static void main(String[] args) {
	try {
	System.out.println(100/0);
	}
	catch (ArithmeticException e) {
		System.out.println("Exception");
	}
	finally {
		System.out.println("close");
	}
}
}
