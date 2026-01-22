package Rough;

public class Print_Duplicate {
public static void main(String[] args) {
	int a[]= {-1,-1,1,2,3,4,5,2,1,3,7,6};
	int b[]=new int [a.length];
	for (int i = 0; i < a.length; i++) {
		int count=1;
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j]) {
				count++;
				b[j]=-1;
			}
		}
		if(b[i]!=-1) {
			System.out.println(a[i]);
		}
	}
}
}
