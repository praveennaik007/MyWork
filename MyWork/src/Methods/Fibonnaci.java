package Methods;

public class Fibonnaci {
public static void main(String[] args) {
	int num=300;
	fib(num);
}
public static void fib(int num) {
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
