package patternSearching;

public class CheckPatternExistOrNot {
	public static void main(String[] args) {
		System.out.println(containsPattern("ABABABCABAB", "ABAB"));// true
	}

	static boolean containsPattern(String text, String pat) {
		return text.contains(pat);
	}

}
