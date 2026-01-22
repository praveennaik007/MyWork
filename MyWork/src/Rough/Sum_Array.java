package Rough;

public class Sum_Array {
public static void main(String[] args) {
	int a[]= {1,2,3};
	int b[]= {4,5,6};
	
	for (int i = 0; i < a.length; i++) {
		int sum=0;
		for (int j = 0; j < b.length; j++) {
			if(i==j) 
				sum=a[i]+b[j];
		}
		System.out.print(sum+" ");
	}
}
}
