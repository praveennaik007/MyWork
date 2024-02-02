package my_Work;

public class Pattern {
public static void main(String[] args) {
	int n=5;
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=n; j++) {
			if(i==n/2|| i==n/2+2  ||j==n/2+1 && i+j==4 || i+j==8  ) {
				System.out.print("*"+" ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
