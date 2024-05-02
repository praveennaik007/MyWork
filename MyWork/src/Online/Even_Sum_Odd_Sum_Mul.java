package Online;

public class Even_Sum_Odd_Sum_Mul {
public static void main(String[] args) {
System.out.println(demo(2514795));

}

public static int demo(int i) {
	int sum=0,sum1=0;
	while(i>0) {
		int d=i%10;
		if(d%2==0) {
			sum+=d;
		}else {
			sum1+=d;
		}
		i/=10;
	}
//	System.out.println(sum*sum1);
	return sum*sum1;
}

}
