package String_Snippet;

public class Snippet_3 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("123");
		String s1 = "123";
		sb1.append("abc");
		s1 = s1.concat("abc");
		System.out.println(sb1 + " " + s1);
	}
}
/*
 *Output :
  a. sb1.append(“abc”); s1.append(“abc”);
  b. sb1.append(“abc”); s1.concat(“abc”);
  c. sb1.concat(“abc”); s1.append(“abc”);
  d. sb1.append(“abc”); s1 = s1.concat(“abc”);
  Answer:d
 */