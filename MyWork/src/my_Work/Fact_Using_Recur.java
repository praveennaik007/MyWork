package my_Work;

public class Fact_Using_Recur {
public static void main(String[] args) {
	int n=5;
	System.out.println(fact(n));
}

private static int fact(int n) {
	if(n==1) {
		return 1;
	}
	else {
		return n*fact(n-1);
	}
}

}
