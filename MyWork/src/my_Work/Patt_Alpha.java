package my_Work;

/* adg
 * beh
 * cfi
 */
public class Patt_Alpha {
	public static void main(String[] args) {
		int n = 7;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			int n1 = n;
			for (int j = 1; j <= n; j++) {
				if (j == 1) {
					System.out.print(ch);
				} else {
					System.out.print((char) (ch + n1));
					n1 = n1 + n;
				}
			}
			ch++;
			System.out.println();
		}
		System.out.println("==============");
		
		int row=5;
		char ch1='A';
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j>=i) {
					System.out.print(ch1++);
				}
			}
			System.out.println();
		}
		System.out.println("=====================");
		int col=5;
		char c='A';
		for(int i=1;i<=col;i++) {
			for(int j=1;j<=col;j++) {
				if(j<=i) {
					System.out.print(c++);
				}
			}
			System.out.println();
		}
		System.out.println("======================");
		int r=5;
		char ch2='A';
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r;j++) {
				if(i+j>=r+1) {
					System.out.print(ch2++);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("=====================");
		
		int c1=5;
		char ch3='Z';
		for(int i=1;i<=c1;i++) {
			for(int j=1;j<=c1;j++) {
				if(i+j>=c1+1) {
					System.out.print(ch3--);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("====================");
		int r1=5;
		
		for(int i=1;i<=r1;i++) {
			char ch4='A';
			for(int j=1;j<=r1;j++) {
				if(j<=i) {
					System.out.print(ch4++);
				}
			}
			System.out.println();
		}
		
	
	}
}
