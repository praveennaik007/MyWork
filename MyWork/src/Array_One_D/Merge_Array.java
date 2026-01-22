package Array_One_D;

import java.util.Arrays;

public class Merge_Array {
public static void main(String[] args) {
	int a[]= {1,2,3};
	int b[]= {4,5,6};
	int c[]=new int[a.length+b.length];
	for (int i = 0,j=0,k=0; i < c.length;i++ ) {
		if(i<a.length) {
			c[i]=a[j++];
		}else {
			c[i]=b[k++];
		}
	}
	System.out.println(Arrays.toString(c));
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]+" ");
	}
}
}
