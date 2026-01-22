package patternSearching;

public class PatternSearching_StringMatching {
	public static void main(String[] args) {
		naiveSearch("ABABABCABAB", "ABAB");
	}

	static void naiveSearch(String text, String pat) {
		int n = text.length();
		int m = pat.length();

		for (int i = 0; i <= text.length() - pat.length(); i++) {
			int j;
			for (j = 0; j < pat.length(); j++) {
				if (text.charAt(i + j) != pat.charAt(j))
					break;
			}
			if (j == pat.length())
				System.out.println("Pattern found at index " + i);
		}
	}
}
