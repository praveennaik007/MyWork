package my_Work;

public class SubString {
public static void main(String[] args) {
	String s=" Hello";
	String s1=" Hello";
//	System.out.println(s.substring(3));//beginIndexing /type String
//	System.out.println(s.substring(1,5));//beginIndexing,endIndexing/type String
//	System.out.println(s.toUpperCase());//type String
//	System.out.println(s.toLowerCase());//type String
//	System.out.println(s.toCharArray());//converts this String to a new Character array/type String
//	System.out.println(s.equals(s));//object an object/boolean
//	System.out.println(s.equalsIgnoreCase(s1));//ignoring case consideration
//	System.out.println(s.startsWith("h"));//String Prefix/type boolean 
//	System.out.println(s.endsWith("o"));//String Suffix/type boolean
//	System.out.println(s.concat("world"));//String type
//	System.out.println(s.contains("l"));//character sequence of String / boolean type
	System.out.println(s.indexOf('o'));//integer - character String
	System.out.println(s.indexOf("s"));//integer String
	System.out.println(s.compareTo(s1));//return positive, negative or zero // type string
	System.out.println(s.compareToIgnoreCase(s1));//ignoring case differences /String type
	System.out.println(s.isEmpty());//type boolean
	System.out.println(s.charAt(4));//index /return character
	
	System.out.println(s.replace("H", "h"));//oldChar,newChar
	System.out.println(s.replace("H", " "));
//	System.out.println(s.split(" "));//String Array type
	System.out.println(s.length());
	System.out.println(s.trim());
	System.out.println();
}
}
