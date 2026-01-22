package typeCasting_Of_Primitive;

public class Type1 {
public static void main(String[] args) {
	byte b=123;
	int i=b;
	System.out.println(i);
	int i1 =128;
	byte b1=(byte)i1;
	System.out.println(b1);
	int a=327612345;
	long l1=a;
	System.out.println(l1);
	long l2=327612345467l;
	int a1=(int)l2;
	System.out.println(a1);
	
}
}
