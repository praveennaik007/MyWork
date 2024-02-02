package Work_08_07_23;

public class Prime_Index_Ele_String {
	public static void main(String[] args) {
		String s = "abcdefghijkl";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(i);
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				str = str + (char) (s.charAt(i) - 32);
			} else {
				str += s.charAt(i);
			}
			
		}
		System.out.println();
		System.out.println(str+" ");
	}
}
