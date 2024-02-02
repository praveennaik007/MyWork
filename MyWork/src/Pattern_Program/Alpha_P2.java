package Pattern_Program;

public class Alpha_P2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			char ch = 'A';
			for (int j = 1; j <= 5; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
}
