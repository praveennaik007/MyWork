package Pattern_Program;

public class Parimid_2 {
	public static void main(String[] args) {
		int star = 0;
//		int star= 1;
		for (int i = 1; i <= 9; i++) {
			if(i<=5) {
				star++;
			}else {
				star--;
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
//			if(i<=4) {
//				star++;
//			}else {
//				star--;
//			}
			System.out.println();
		}
	}
}
