package Online;

public class Odd_Sum {
public static void main(String[] args) {
	System.out.println(demo(2514795));
}

public static int demo(int i) {

	int sum=0;
	while(i>0) {
		int d=i%10;
		if(d%2!=0) {
			sum+=d;
		}
		i/=10;
	}
//	System.out.println(sum);
	return sum;
}
}
