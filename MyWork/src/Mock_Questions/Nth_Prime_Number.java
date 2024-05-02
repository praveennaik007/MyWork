package Mock_Questions;

public class Nth_Prime_Number {
public static void main(String[] args) {
	int n=16;
	int count1=0;
	for (int i = 1; count1 <= n; i++) {
		int count=0;
		for (int j = 1; j <= i; j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			count1++;
		}
		if(count1==n) {
			System.out.println(i);
			break;
		}
	}
	
	
}
}
