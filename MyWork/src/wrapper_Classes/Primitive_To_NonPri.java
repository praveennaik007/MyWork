package wrapper_Classes;

public class Primitive_To_NonPri {
	public static void main(String[] args) {
		// Converting primitive to non-primitive normal way
		int i = 10;
		//Integer in=new Integer(i);
		Integer in = Integer.valueOf(i);
		System.out.println(in);
		System.out.println(in.toString());
		// auto-boxing
		int i1 = 20;
		Integer in1 = i;
//		 internally Integer in1= Integer.valuOf(i1);
		System.out.println(in1);
		
		// Boxing
		char ch = 'a';
		//Character c = new Character(ch);
		//System.out.println(c);
		Character c1 = Character.valueOf(ch);
		System.out.println(c1);
		// Auto-Boxing
		Character c2 = c1;
//		Internally Character c1 = Character.valueOf(ch);
		System.out.println(c2);
		

	}
}
