package Array_Programs;

public class Maximum_AtleastTwo_Sum {
	public static void main(String[] args) {
		int a[] = { -1,-1,-1,-1 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0) {
				sum+=a[i];
			}	
		}
		
		System.out.println(sum);
	}
}
