package Work;

public class Consicutive_Pair_String {
	public static void main(String[] args) {
		String s = "abbbcdbbbbefg";
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'b') {
				count++;
			}
		}
		System.out.println(count);
	}

}
