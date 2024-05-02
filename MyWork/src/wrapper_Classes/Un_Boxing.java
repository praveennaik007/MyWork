package wrapper_Classes;

public class Un_Boxing {
public static void main(String[] args) {
	Integer i=new Integer(10);
	int i1=i;  
	System.out.println(i1);
//	int i2=i.intValue();//After 1.5 version jdk automatically added  
//	System.out.println(i2);
	Character ch=new Character('B');
	char ch1=ch;
	System.out.println(ch1);
//	char ch2=ch.charValue();
//	System.out.println(ch2);
}
}
