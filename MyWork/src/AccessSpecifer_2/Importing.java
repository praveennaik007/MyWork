package AccessSpecifer_2;

import AccessSpecifer_1.*;

public class Importing  {
	int k = 300;
	int l = 400;

public static void main(String[] args) {
	B obj1=new B();
	System.out.println(obj1.i);
	System.out.println(obj1.j);
	obj1.Walk();
	obj1.run();
	Importing obj=new Importing();
	System.out.println(obj.k);
	System.out.println(obj.l);
	
}
}
