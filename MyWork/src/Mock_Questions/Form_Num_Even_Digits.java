package Mock_Questions;

public class Form_Num_Even_Digits {
public static void main(String[] args) {
	int num=43261;
	int res=0,p=1;
	while(num!=0) {
		int d=num%10;
		if(d%2==0) {
			res=d*p+res;
			p=p*10;
		}
		num/=10;
	}
	System.out.println(res);
}
}
