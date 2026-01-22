package patternSearching;

public class FirstOccurancePattern {
	public static void main(String[] args) {
		System.out.println(firstOccurrence("ABABABCABAB", "ABAB"));// 0
	}

	static int firstOccurrence(String text, String pat) {
		for (int i = 0; i <= text.length() - pat.length(); i++) {
			if (text.substring(i, i + pat.length()).equals(pat))
				return i;
		}
		return -1;
	}

}
