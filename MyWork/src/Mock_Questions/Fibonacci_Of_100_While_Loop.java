package Mock_Questions;

public class Fibonacci_Of_100_While_Loop {
public static void main(String[] args) {
	int num=100;
	int a=0,b=1,res=0;
	System.out.println(a);
	while(res<=num) {
		res=a+b;
		a=b;
		b=res;
		System.out.println(a);
	}
	
	
}
}
