package constructors;

public class Exmple {
int n;
public Exmple(int x) {
	System.out.println("From Example");
}
public static void main(String[] args) {
	Exmple e=new Exmple(10);
	Object s=new String("Hello");
	System.out.println((Integer)s);
}
}
