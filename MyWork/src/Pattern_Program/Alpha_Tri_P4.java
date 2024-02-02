package Pattern_Program;

public class Alpha_Tri_P4 {
	public static void main(String[] args) {
		char ch = 'A';
		int star = 0, space = 5;
		for (int i = 1; i <= 5; i++) {
			star++;space--;
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
}
