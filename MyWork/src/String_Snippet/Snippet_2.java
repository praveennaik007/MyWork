package String_Snippet;

public class Snippet_2 {
	public static void main(String[] args) {
		Object obj = new Integer(3);
		String str = (String) obj;
		System.out.println(str);
	}

}
/*
  Output:
a. ArrayIndexOutOfBoundsException
b. ClassCastException
c. IllegalArgumentException
d. None of the ab
Answer:b
 */
