package work_05_7_23;

public class Divide_String_N_Equal_Parts {
	public static void main(String[] args) {
		String s = "Helloworld";
		int len = s.length();
		int equal_part = 5;
		int divided = len / equal_part;
		String str[] = new String[equal_part];
		int temp = 0;
		String s1;
		if (len % equal_part != 0) {
			System.out.println("We can't divide " + len + " equal parts ");
		} else {
			//Using Inbuilt Method
			for (int i = 0; i < len; i = i + divided) {
				String st = s.substring(i, i + divided);
				str[temp++] = st;
			}
			System.out.println(equal_part);
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			System.out.println();
			//Without Using Inbuilt method
			for (int i = 0; i < equal_part; i++) {
				s1 = "";
				for (int j = divided * i; j < (i + 1) * divided; j++) {
					s1 = s1 + s.charAt(j);
				}
				System.out.println(s1);
			}
		}
	}
}
