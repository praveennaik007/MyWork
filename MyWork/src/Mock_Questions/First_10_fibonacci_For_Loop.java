package Mock_Questions;

public class First_10_fibonacci_For_Loop {
public static void main(String[] args) {
	int num=10;
	int a=0,b=1,res=0;
	for(int i=1;i<=num;i++) {
		if(i==num) {
		System.out.println(res);
		}
		res=a+b;
		a=b;
		b=res;
		
	}
}
}
