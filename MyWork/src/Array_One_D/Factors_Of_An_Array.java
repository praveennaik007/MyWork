package Array_One_D;

public class Factors_Of_An_Array {
	public static void main(String[] args) {
		int a[]= {12,6,8};
		for (int i = 0; i < a.length; i++) {
			int n=a[i];
		System.out.print("factors of "+a[i]+" are : ");
		for (int j = 1; j <= n; j++) {
			if(n%j==0 ) {
				
				
		System.out.print(j+" ");		
			}
			
		}
		System.out.println();
		}
	}
}
