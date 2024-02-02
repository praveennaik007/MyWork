package Manasa_Mam;

public class Missing_Elements {
public static void main(String[] args) {
	//One Way of Execution Sequence Array
	
	int a[]= {1,2,4,5,7};
	int count=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==a[count]){
			a[count]++;
		}
		else {
			System.out.println(a[count]);
			a[count]=a[i]+1;
		}
	}
	System.out.println("--Leet Code Program Missing Element--");
	//Another Way Of Execution Leet Code Sequence Array missing Only One Element
	int b[]= {0,1,3,4,5};
	int n=b.length;
	int sum=0;
	for (int i = 0; i < b.length; i++) {
		sum+=b[i];
	}
	int sum1=n*(n+1)/2;
	int missing=sum1-sum;
	System.out.println(missing);
}
}
