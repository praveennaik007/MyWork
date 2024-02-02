package recursion;

public class Demo {
public static void main(String[] args) {
	System.out.println(a(5));
}
public static int a(int n) {
	System.out.println("Hello World");
	return a(n-1);
}
}
