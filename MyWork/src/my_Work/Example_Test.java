package my_Work;

public class Example_Test {
public static void main(String[] args) {
	String s="you are my hero";
//	int a=5,b=10;
//	if(true)
////		int c=30;
//		System.out.println(a);
//		System.out.println(b);
		revWord(s);
}
public static String revWord(String s) {
	String s1="";
	for (int i = 0; i <=s.length(); i++) {
		if (s.charAt(i) != ' ') {
			s1 = s.charAt(i) + s1;
		} else {
			System.out.print(s1 + " ");
			s1 = "";
		}
	}
	return s1;
}

}
