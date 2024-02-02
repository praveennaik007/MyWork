package my_Work;

public class Count_Words_String {

	public static void main(String[] args) {
		String s1 = " Hello   java  How   are  you  Where  are  you  ";
		int count = 0;

//     if(s1.charAt(0)==' ') count--;
		for (int i = 0; i < s1.length(); i++) {
			if (i == 0 && s1.charAt(i) != ' ' || s1.charAt(i) != ' ' && s1.charAt(i - 1) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
