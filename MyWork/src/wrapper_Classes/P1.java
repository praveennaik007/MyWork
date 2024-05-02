package wrapper_Classes;

public class P1 {
	public static void main(String[] args) {
		run(10);
	}

	
	
	  private static void run(int i) { 
	  System.out.println("form (int i)"); }

	 

	/*
	 * private static void run(float f) { 
	 * System.out.println("form (float f)"); }
	 */

	/*
	 * private static void run(double d) { 
	 * System.out.println("form (double d)"); }
	 */

	/*
	 * private static void run(long l) { 
	 * System.out.println("form (long l)"); }
	 */
	/*
	 * private static void run(Integer obj) {
	 * System.out.println("form (Integer obj)"); }
	 */

	    private static void run(Double obj) {
		System.out.println("form (Double obj)");
	}

	private static void run(Object obj) {
		System.out.println("form (Object obj)");
	}
}
