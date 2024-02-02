 package work_05_7_23;

public class Gcd_Array {
	public static void main(String[] args) {
//		int a[] = { 2, 4 };
//		int b[] = { 6, 8 };
		int n1 = 4;
		int n2 = 8;
		int gcd = 0;
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % 2 == 0 && n2 % 2 == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
		display1();
		System.out.println(e);
	}
//	 void display() {
//		static int ab=10;	
//		}
	 static void display1() {
		int a=10;
		System.out.println(a);
	 }
	 static int e=20;
}
