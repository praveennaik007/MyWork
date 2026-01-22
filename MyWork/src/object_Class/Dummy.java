package object_Class;

public class Dummy {
	public static void main(String[] args) {
		String s = "ABCD";
		System.out.println(getHashCode(s));
	}

	public static int getHashCode(String s) {
		char ch[] = s.toCharArray();
		int a[] = new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			a[i] = ch[i];
		}
		int res = 0;
		int c = count(a);
		for (int i = 0; i < a.length; i++) {
			int pow = 1;
			for (int j = c; j >= 1; j--) {
				pow = pow * 31;
			}
			res = res + a[i] * pow;
			c--;
		}
		/*
		 * String st = res + ""; Integer result = Integer.parseInt(st);// Not Required
		 * this Convertion
		 */
		return res;
	}

	public static int count(int n[]) {
		int count = 0;
		for (int i = 1; i < n.length; i++) {
			count++;
		}
		return count;
	}
}
