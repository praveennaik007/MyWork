package Array_Programs;

public class Check_Each_Consicutive_Sum_Fib {
	public static void main(String[] args) {
		int a[] = { 3, 2, 8, 6, 2 };
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			if(fib(sum)) {
				System.out.print(sum+" ");
			}
		}
	}

	public static boolean fib(int sum) {
		int a=0,b=1,res=0;
		if(sum==0) 
			return true;
		while(res<=sum) {
			if(sum==res) 
				return true;
			res=a+b;
			a=b;
			b=res;
		}
		return false;
	}
}
