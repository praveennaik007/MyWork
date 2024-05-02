package number_Program;

public class First_10_fibonacci_For_Loop {
	public static void main(String[] args) {
		int num=10;
		int a=0,b=1,res=0;
		for(int i=0;i<=num;i++) {
			if(i==num) {
			System.out.println(a);
			}
			res=a+b;
			a=b;
			b=res;
			
		}
	}
}
