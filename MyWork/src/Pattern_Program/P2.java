package Pattern_Program;

public class P2 {
	public static void main(String[] args) {
		int num = 7;
		int star = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j == 1 || i == j || i + j == num + 1 || j == num) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
