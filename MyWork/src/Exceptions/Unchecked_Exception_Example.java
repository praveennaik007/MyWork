package Exceptions;

public class Unchecked_Exception_Example {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
//	    System.out.println(a[5]);//AIOOBE
//		System.out.println("To Handle AIOOBE");
//		try {
//			System.out.println(a[5]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Out Of Index Please Check The Code");
//		}
		String s=null;
//		System.out.println(s.equals("hello"));//NPE
		System.out.println("To Overcome That NPE");
		try {
			System.out.println(s.equals("Hello"));
		} catch (NullPointerException e) {
			System.out.println("Obect Reference Cannot Be null");
		}
	}

}
