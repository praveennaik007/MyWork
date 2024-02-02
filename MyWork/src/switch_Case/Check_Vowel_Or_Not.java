package switch_Case;

public class Check_Vowel_Or_Not {
	public static void main(String[] args) {
		char ch = 'u';
		switch (ch) {
		case 'a':
			System.out.println("a is Vowel");
			break;
		case 'e':
			System.out.println("e is Vowel");
			break;
		case 'i':
			System.out.println("i is Vowel");
			break;
		
		case 'o':
			System.out.println("o is Vowel");
			break;
		case 'u':
			System.out.println("u is Vowel");
			break;

		default:
			System.out.println("Not a Vowel");
			break;
		}
	}
}
