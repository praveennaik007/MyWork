package recursion;

public class Pow {
public static void main(String[] args) {
	System.out.println(pow(2, 5));
}
public static int pow(int base,int pow) {
	if(pow==1) {
		return base;
	}else {
		return base*pow(base, pow-1);
	}
}
}
