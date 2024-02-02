package Pattern_Program;

public class Alpha_Tri_P2 {
public static void main(String[] args) {
	int n=0;
	for (int i = 1; i <= 5; i++) {
		char ch='A';n++;
		for (int j = 1; j <= n; j++) {
			System.out.print(ch++);
		}
		System.out.println();
	}
}
}
