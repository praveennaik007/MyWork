package Array_Programs;

public class Array_Sum {
public static void main(String[] args) {
	int a[]= {2,-3,8,-6,-7,18,1};
	int sum=0;
	for (int i = 0; i < a.length; i++) {
		sum+=a[i];
	}
	System.out.println(sum);
}
}
