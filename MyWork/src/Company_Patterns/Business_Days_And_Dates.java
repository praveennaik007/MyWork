package Company_Patterns;

public class Business_Days_And_Dates {
public static void main(String[] args) {
	int n=11;
	int rev=0;
	while(n>0) {
		int d=n%2;
		rev=10*rev+d;
		n/=2;
	}
	System.out.println(rev);
	int res=0,p=1;
	while(rev>0) {
		int d=rev%10;
		res=res+d*p;
		p=p*2;
		rev/=10;
	}
	System.out.println(res);
}
}
