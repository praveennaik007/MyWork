package patternSearching;

public class CountOccurancePattern {
	public static void main(String[] args) {
		System.out.println(countPattern("ABABABCABAB", "ABAB"));// 3
	}

	static int countPattern(String text, String pat) {
		int count = 0;
		for (int i = 0; i <= text.length() - pat.length(); i++) {
			if (text.substring(i, i + pat.length()).equals(pat))
				count++;
		}
		return count;
	}

}
