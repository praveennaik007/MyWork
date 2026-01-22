//JDK 1.8 VERSI0N
package wrapper_Classes;

public class Demo {
	public static void main(String[] args) {
		
	byte b=100;
	short s=500;
	int i1=1000;
	long l=1200;
	float f=23.45f;
	double d=56.32d;
	boolean y=false;
	char c='a';
    Object x[]= {b,s,i1,l,f,d,y,c};
	for (int i=0;i<x.length;i++)
	{
		System.out.println(x[i]);
	}
}

}
