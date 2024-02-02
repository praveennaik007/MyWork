package Manasa_Mam;

import java.util.Arrays;

public class Midean_Of_Two_Array_Sequence {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= {2,3,4,5,6};
	int c[]=new int[a.length+b.length];
	int j=0,k=0;
	double res=0;
	for (int i = 0; i < c.length; i++) {
		if(j<a.length) {
			c[i]=a[j++];
		}
		else if(k<b.length){
			c[i]=b[k++];
		}
	}
	System.out.println(Arrays.toString(c));
	System.out.println(c.length);
	if(c.length%2==0) {
		int x=c.length/2;
		int y=x-1;
		double d=x+y;
		res+=d/2;
	}
	else {
		int z=c[c.length/2];
		res+=z;
	}
	System.out.println(res);
}
}
