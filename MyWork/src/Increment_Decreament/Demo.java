package Increment_Decreament;

public class Demo {
public static void main(String[] args) {
	int x=9,y=10,z=11;
	x=x++ + y-- + z++;
	y=x-- + y++ + ++z;
	z=--x + ++y + z--;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
}
}
