//JDK1.3 VERSION
package wrapper_Classes;

public class Demo1 {
	public static void main(String[] args) 
	{
		//primitive type				//Wrapper class
		byte b=100;						Byte wb=new Byte(b);
		short s=1000;					Short ws=new Short(s);
		int i1=1500;					Integer wi1=new Integer(i1);
		long l=2500;					Long wl=new Long(l);
		float f=23.45f;					Float wf=new Float(f);
		double d=56.32d;				Double wd=new Double(d);
		boolean y=true;				    Boolean wy=new Boolean(y);
		char c='b';						Character wc=new Character(c);
		Object x[]= {wb,ws,wi1,wl,wf,wd,wy,wc};
		for (int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		
	}

}
