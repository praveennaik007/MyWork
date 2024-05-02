package wrapper_Classes;

public class Boxing {
	public static void main(String[] args) {
//		Boxing
		int i = 100;
		Integer i1 = new Integer(i);
		System.out.println(i1);
//		Auto-Boxing
		Integer i3 = i;
		System.out.println(i3);
//		Integer i2 = Integer.valueOf(i);//Internally implemented
//		System.out.println(i2);
		char ch='A';
		Character c=ch;
//		Character c1=Character.valueOf(ch);
		System.out.println(c);

	}
}
