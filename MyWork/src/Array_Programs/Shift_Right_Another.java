package Array_Programs;

public class Shift_Right_Another {
	public static void main(String[] args) {
		int br[] = { 1, 2, 3, 4, 5 };
		int n = 2;
		int b[] = new int[br.length];
		for (int j = 0; j < br.length; j++) {
			if (n >= br.length)
				n = 0;
			b[j] = br[n++];
			
		}
		for (int i = 0; i < br.length; i++) {
			System.out.print(b[i] + " ");
		}

	}
}
