package my_Work;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Remove_Duplicates_An_Array {
public static void main(String[] args) {
	int a[]= {1,2,3,4,1,2,3,1};
//	int oc[]=new int[a.length];
	for (int i = 0; i < a.length; i++) {
		int c=1;
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j]) {
				c++;
				a[j]=-1;
			}
		}
		if(a[i]!=-1) {
			System.out.println(a[i]+" -> "+c);
		}
	}
}
}
