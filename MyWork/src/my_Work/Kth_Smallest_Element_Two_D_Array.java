package my_Work;

import java.util.Arrays;

public class Kth_Smallest_Element_Two_D_Array {
	public static void main(String[] args) {
		int a[][] = { { 1, 2 }, { 1, 1} };
		int k = 2;
		int b[] = new int[a.length*a[0].length];
		int ind=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[ind++]=a[i][j];
			}
		}
		Arrays.sort(b);
		System.out.println(b[k-1]);

//	//	int a[]= {1,2,3,4,5,6,7,8};
//	int k=a[0];
//	for (int i = 0; i < a.length; i++) {
//		if(k>a[i]) {
//			k=a[i];
//		}
//	}
//	System.out.println(k);
	}
}
