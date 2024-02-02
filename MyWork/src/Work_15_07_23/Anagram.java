package Work_15_07_23;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "Anagram";
		String s2 = "nagAram";
		if (s1.length() == s2.length()) {
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			sort(ch1);
			sort(ch2);
			int count = 0;
			boolean rs = false;
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] == ch2[i]) {
					count++;
					rs = true;
				} else {
					rs = false;
					break;
				}
			}
			if (rs)
//			if(count==s1.length()) 
			{
				System.out.println("Anagram ");
			} else {
				System.out.println("Not Anagram ");
			}
		} else {
			System.out.println("Not Anagram ");
		}
	}

	public static void sort(char[] a) {
		char temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	}
}
