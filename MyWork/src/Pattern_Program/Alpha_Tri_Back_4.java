package Pattern_Program;

public class Alpha_Tri_Back_4 {
	public static void main(String[] args) {
		int star = 1, space = 4;
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			char c = ch;
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(c);
				c--;
			}
			ch++;
			star++;
			space--;
			System.out.println();
		}
	}
}
