package Company_Patterns;


public class Missing_ElementIn_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 6, 3, 7 };
//		Arrays.sort(a);
		int length=a.length+1;
		int sum=0;
		for (int i = 0; i < a.length - 1; i++) {
			sum+=a[i];
		}
		int avg=length*(length+1)/2;
		int sum1=avg-sum;
		System.out.println(sum1);
	}
}
