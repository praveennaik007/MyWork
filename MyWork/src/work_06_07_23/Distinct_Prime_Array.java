package work_06_07_23;

public class Distinct_Prime_Array {
public static void main(String[] args) {
	int a[]= {2,3,5,7,2,3};
	

	for (int i = 0; i < a.length; i++) {
		int count=0;
		for (int j = 0; j < a.length; j++) {
			if(a[i]==a[j]) {
				count++;
			}
		}
		if(count==1) {
			System.out.println(a[i]);
		}
	}
	for (int i = 0; i < a.length; i++) {
		int count=0;
		for (int j = 1; j <= a[i]; j++) {
			if(a[i]%j==0) {
				count++;
			}
		}
		if(count==2) {
//			System.out.println(a[i]);
		}
	}
//	System.out.println(isprime(a));
}
//public static int[] isprime(int [] a) {
//	int b[]=new int[a.length];
//	int k=0;
//	for (int i = 0; i < a.length; i++) {
//		int count=0;
//		for (int j = 1; j <= a[i]; j++) {
//			if(a[i]%j==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//		b[i++]=a[i];	
//		}
//	}
//	return b;
//}
}
