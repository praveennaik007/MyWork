package Strings;

public class Swap_Two_Strings_Without_ThirdVar {
	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "hello";
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
		
		

		System.out.println("===================");
//		Using third variable
		String a = "byee";
		String b = "good";
		String str = "";
		str = a;
		a = b;
		b = str;
		System.out.println(a);
		System.out.println(b);
	}
}
