package Pattern_Program;

public class Parimid_3 {
	public static void main(String[] args) {
		int star = 1, space = 4;int n=1;
		for (int i = 1; i <= 5; i++) {
//			star += 2;
//			space--;
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= star; k++) {
//				System.out.print(i);
//				System.out.print(k);
//				System.out.print(i%2);
//				System.out.print(k%2);
				System.out.print(n++);
			}
			star += 2;
			space--;
			
			System.out.println();
		}
	}
}
