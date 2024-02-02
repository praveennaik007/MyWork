package Exceptions;

public class Index_Out_Of_Bound_Exception {
public static void main(String[] args) {
	int a[]=new int[5];
	System.out.println(a[6]);//ArrayIndexOutOfBoundException
	String s=new String("hi");
	System.out.println(s.charAt(2));//StringIndexOutOfBoundException
}
}
