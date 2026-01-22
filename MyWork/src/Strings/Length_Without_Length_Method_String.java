package Strings;

public class Length_Without_Length_Method_String {
	public static void main(String[] args) {
		String s = "Hello";
		char ch[] = s.toCharArray();
		int length = 0;
		for (char string : ch) {
			length++;
		}
		System.out.println("Length of String without length method " + length);

//	Another Way
		String st = "java";
		int i = 0;
		try {
			while (true) {
				st.charAt(i);
				i++;
			}
		} catch (Exception e) {
//			System.out.println(i);
		}
		System.out.println(i);
	}
}
