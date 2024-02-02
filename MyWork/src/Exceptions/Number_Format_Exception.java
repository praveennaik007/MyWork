package Exceptions;

public class Number_Format_Exception {
public static void main(String[] args) {
	String s="123abc";
	Integer str=Integer.parseInt(s);
	System.out.println(str);
}
}
