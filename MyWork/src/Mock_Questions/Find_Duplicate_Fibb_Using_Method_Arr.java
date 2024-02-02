package Mock_Questions;

public class Find_Duplicate_Fibb_Using_Method_Arr {
	public static void main(String[] args) {
		int a[]= { 13, 2, 4, 3, 5, 4, 8, 5, 13 };
	fibonacci(a);
	}
	public static int fibonacci(int n[]) {
		int res=0;
		for (int i = 0; i < n.length; i++) {
			int a = 0, b = 1;
			for (int j = 0; j <= n[i]; j++) {		
				res = a + b;
				a = b;
				b = res;
				if(n[i]==res) {
					System.out.println(res);
				}	
			}
		}
		return res;
	}
}
